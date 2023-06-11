-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 11 Jun 2023 pada 13.28
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `wanz_servicehandphone`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `akun`
--

CREATE TABLE `akun` (
  `IdAkun` int(11) NOT NULL,
  `Username` varchar(100) NOT NULL,
  `KataSandi` varchar(100) NOT NULL,
  `NamaLengkap` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Status` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `akun`
--

INSERT INTO `akun` (`IdAkun`, `Username`, `KataSandi`, `NamaLengkap`, `Email`, `Status`) VALUES
(1, 'Wanz', '123', 'Alif Maulana Setyawan', 'awan@gmail.com', 'ADMIN');

-- --------------------------------------------------------

--
-- Struktur dari tabel `dataservice`
--

CREATE TABLE `dataservice` (
  `IdService` int(11) NOT NULL,
  `TanggalService` varchar(10) NOT NULL,
  `NamaCust` varchar(100) NOT NULL,
  `NoHpCust` varchar(15) NOT NULL,
  `MerekHp` varchar(100) NOT NULL,
  `Diagnosis` varchar(100) NOT NULL,
  `IdTeknisi` int(11) NOT NULL,
  `NamaTeknisi` varchar(100) NOT NULL,
  `KeahlianTeknisi` varchar(100) NOT NULL,
  `NoHpTeknisi` varchar(100) NOT NULL,
  `Username` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `datateknisi`
--

CREATE TABLE `datateknisi` (
  `IdTeknisi` int(11) NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `Gender` varchar(100) NOT NULL,
  `Keahlian` varchar(10) NOT NULL,
  `NoHp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`IdAkun`);

--
-- Indeks untuk tabel `dataservice`
--
ALTER TABLE `dataservice`
  ADD PRIMARY KEY (`IdService`);

--
-- Indeks untuk tabel `datateknisi`
--
ALTER TABLE `datateknisi`
  ADD PRIMARY KEY (`IdTeknisi`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `akun`
--
ALTER TABLE `akun`
  MODIFY `IdAkun` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `dataservice`
--
ALTER TABLE `dataservice`
  MODIFY `IdService` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `datateknisi`
--
ALTER TABLE `datateknisi`
  MODIFY `IdTeknisi` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
