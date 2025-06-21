/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Mahasiswa;

/**
 *
 * @author LENOVO
 */
public class MahasiswaDAO {
    private final Connection conn;
    
    public MahasiswaDAO() {
        conn = Koneksi.getKoneksi();
    }
    
    // Create (Insert)
    public void insert(Mahasiswa mhs) {
        String sql = "INSERT INTO mahasiswa(nim, nama, alamat, phone, prodi, jenis_kelamin) VALUES(?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, mhs.getNim());
            ps.setString(2, mhs.getNama());
            ps.setString(3, mhs.getAlamat());
            ps.setString(4, mhs.getPhone());
            ps.setString(5, mhs.getProdi());
            ps.setString(6, mhs.getJenis_kelamin());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error insert: " + e.getMessage());
        }
    }
    
    // Read (Select All)
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMhs = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNim(rs.getString("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setAlamat(rs.getString("alamat"));
                mhs.setPhone(rs.getString("phone"));
                mhs.setProdi(rs.getString("prodi"));
                mhs.setJenis_kelamin(rs.getString("jenis_kelamin"));
                
                listMhs.add(mhs);
            }
        } catch (SQLException e) {
            System.err.println("Error select all: " + e.getMessage());
        }
        
        return listMhs;
    }
    
    // Update
    public void update(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama=?, alamat=?, phone=?, prodi=?, jenis_kelamin=? WHERE nim=?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, mhs.getNama());
            ps.setString(2, mhs.getAlamat());
            ps.setString(3, mhs.getPhone());
            ps.setString(4, mhs.getProdi());
            ps.setString(5, mhs.getJenis_kelamin());
            ps.setString(6, mhs.getNim());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error update: " + e.getMessage());
        }
    }
    
    // Delete
    public void delete(String nim) {
        String sql = "DELETE FROM mahasiswa WHERE nim=?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nim);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error delete: " + e.getMessage());
        }
    }
    
    // Search by NIM
    public Mahasiswa getByNim(String nim) {
        Mahasiswa mhs = null;
        String sql = "SELECT * FROM mahasiswa WHERE nim=?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nim);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                mhs = new Mahasiswa();
                mhs.setNim(rs.getString("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setAlamat(rs.getString("alamat"));
                mhs.setPhone(rs.getString("phone"));
                mhs.setProdi(rs.getString("prodi"));
                mhs.setJenis_kelamin(rs.getString("jenis_kelamin"));
            }
        } catch (SQLException e) {
            System.err.println("Error search by NIM: " + e.getMessage());
        }
        
        return mhs;
    }
}