-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 30, 2017 at 06:50 AM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student`
--

-- --------------------------------------------------------

--
-- Table structure for table `studenttable`
--

CREATE TABLE `studenttable` (
  `id` int(11) NOT NULL,
  `name` varchar(150) NOT NULL,
  `yearbirth` int(11) NOT NULL,
  `adress` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `studenttable`
--

INSERT INTO `studenttable` (`id`, `name`, `yearbirth`, `adress`) VALUES
(1, 'Nguyễn Thị Lài', 1996, 'Tiền Giang'),
(2, 'Ngô Thị Nga', 1996, 'Bình Thuan'),
(3, 'Triệu Thị Trường Giang', 1997, 'Tiền Giang'),
(4, 'Triệu Văn Phước', 1999, 'Tiền Giang'),
(5, 'Huỳnh Thị Ngọc Nga', 1996, 'Tiền Giang'),
(6, 'Nguyễn Trần Minh Tân', 1996, 'Tiền Giang'),
(7, 'Lê Yên Thanh', 1994, 'An Giang'),
(8, 'Trương Hoàng Yến', 1995, 'Đồng Nai'),
(9, 'Châu Khánh Mai', 1997, 'Vĩnh Long'),
(10, 'Nguyễn Thị Kim Hà', 1996, 'Đồng Nai'),
(11, 'Lê Thị Bích Ngân', 1996, 'Bình Định'),
(12, 'Nguyễn Thị Thanh Thảo', 1996, 'Đồng Nai'),
(13, 'Nguyễn Anh Tuấn', 1996, 'Đồng Nai'),
(14, 'Lê Văn Toàn', 1996, 'Khánh Hoà'),
(15, 'Nguyễn Hoàng Thái Huy', 1996, 'TP HCM'),
(16, 'Mai Hồ Duy', 1996, 'TP HCM');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `studenttable`
--
ALTER TABLE `studenttable`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `studenttable`
--
ALTER TABLE `studenttable`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
