-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 06, 2017 at 06:45 PM
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
-- Database: `lozidata`
--

-- --------------------------------------------------------

--
-- Table structure for table `foodtable`
--

CREATE TABLE `foodtable` (
  `id_food` int(11) NOT NULL,
  `name_food` varchar(200) NOT NULL,
  `price_food` int(11) NOT NULL,
  `image_food` varchar(200) NOT NULL,
  `describe_food` varchar(10000) NOT NULL,
  `adress` varchar(40) NOT NULL,
  `id_type` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `foodtable`
--

INSERT INTO `foodtable` (`id_food`, `name_food`, `price_food`, `image_food`, `describe_food`, `adress`, `id_type`) VALUES
(1, ' Bánh mì nướng muối ớt', 10000, 'https://tea-4.lozi.vn/v1/images/resized/banh-my-nuong-muoi-ot-1461560749-339797-1468139823?w=480&type=o', 'Bánh mỳ được nướng giòn, có xúc xích và trứng xắt sợi, chà bông, mỡ hành, cái gì nữa quên mất, thêm sốt mayonnaise và tương ớt. Tủ kính trông sạch sẽ \r\nĐịa chỉ:Quang Trung, Quận 9, Hồ Chí Minh', 'Hồ Chí Minh', 1),
(2, 'Bánh Tráng Trộn Chú Viên', 20000, 'https://tea-4.lozi.vn/v1/images/resized/banh-trang-tron-1-159859-1501762311?w=240&type=s', 'Địa chỉ: 38 Nguyễn Thượng Hiền, Phường 5, Quận 3, Hồ Chí Minh\r\nChụp mặt này thì nhiều topping mà mặt kia thì nhiều bánh tráng lắm, có 2 hay 3 quả trứng cút gì nữa mà quên rồi :)))))\r\nThật ra bịch bự chà bá, 2 người ăn bánh tráng uống nước mà no lăn no lốc, lúc ăn nên đổ nước bò nên đổ từ từ rồi trộn dần kẻo bánh tráng nhão hết, topping thì đầy đủ khô mực khô bò, bò đen rồi đậu phộng, xoài... trộn lên khá ngon, mà hơi ngán. Vì gout của mình là bánh tráng muối sa tế cơ, nên ăn chú Viên cho biết thôi chứ cũng ko thích lắm.\r\nLúc đến mua thì cứ nói mua mấy bịch, đóng gói sẵn để lấy liền nên khá tiện lợi mà trông cũng sạch sẽ.', 'Hồ Chí Minh', 1),
(3, 'Sashimi cá hồi', 0, '\r\nhttps://tea-5.lozi.vn/v1/images/resized/sashimi-ca-hoi-71061-1434559316?w=480&type=o', 'Cá hồi tươi ngon !!!\r\nMiếng cá hồi tươi ngon, dẻo quánh luôn ấy\r\nĐịa chỉ: 1A Dịch Vọng Hậu, Quận Cầu Giấy, Hà Nội\r\n', 'Hà Nội', 1),
(5, 'Lẩu hấp', 649000, 'https://tea-8.lozi.vn/v1/images/resized/lau-hap-1470895367-1-3339502-1501574476?w=480&type=s', 'Địa điểm: Lẩu hấp Steamy - 26 Vũ Phạm Hàm\r\nĐịa chỉ: 26 Vũ Phạm Hàm, Yên Hoà, Quận Cầu Giấy, Hà Nội\r\nMột set này được khá nhiều món, set mình ăn này giá 649k\r\n\r\nBao gồm: gà, bò cuốn nấm, bồ câu, lòng mề, rau thập cẩm, cháo steamy\r\n\r\nCảm nhận của mình ấn tượng đầu tiên là quán này khá rộng, sạch sẽ, điều hòa thoáng mát, nghe nói là phục vụ đến 5 tầng. Khi gửi xe có nhân viên dắt xe rất lễ phép và nhiệt tình, mặc dù nhân viên bảo vệ bên ngoài tầm tuổi cha, chú mình. Mình đi ăn đúng hôm trời mưa nên khá ấn tượng, khi đi về bác ý còn cầm ô ra tận nơi che và mang khăn ra lau yên xe cho mình.\r\n\r\nĐồ ăn bài trí khá đẹp, nhiều màu sắc, tạo cho mình cảm giác rất tươi và hấp dẫn. Thực ra mình cũng chưa ăn kiểu lẩu hấp này lần nào, ăn lần đầu tiên ở đây. Kiểu hơi ngáo không biết sẽ ăn kiểu gì, nhân viên tận tình ra hấp đồ và cắt gà cho mình. Đồ chín khá nhanh vị ngọt dai của thịt, vì là đồ hấp nên tạo cho mình cảm giác thanh đạm không bị nhanh ngấy như những đồ nhiều dầu mỡ. Nói chung là đồ ăn ngon và phục vụ ổn nhé cả nhà.', 'Hà Nội', 1),
(9, 'Trà sữa + trà sữa socola', 12000, 'https://tea-3.lozi.vn/v1/images/resized/tra-sua-tra-sua-socola-1459151513-1-4270184-1511631062?w=480&type=o', 'Địa điểm: Trà sữa Dì Xuyến\r\nĐịa chỉ: Hẻm cạnh 129F/95 Bến Vân Đồn phường 8, Quận 4, Hồ Chí Minh\r\nNày Ở q4 cô đó bán lâu lắm luôn rồi ạ\r\nNgon, rẻ nữa.\r\nMọi người Đi uống thử đi nà', 'Hồ Chí Minh', 1),
(10, 'Bánh bột lọc tôm-đậu', 1000, 'https://tea-3.lozi.vn/v1/images/resized/banh-bot-loc-tom-dau-xanh-1466129051-2001760-1488651263?w=480&type=o', 'Địa điểm: hội an\r\nĐịa chỉ: Đà Nẵng\r\nCô này đứng ở vỉa hè trên phố Trần Phú - Hội An.\r\n1k/cái. Rẻ bất ngờ luôn', ' Đà Nẵng', 1),
(11, 'Bánh canh Trảng Bàng', 45000, 'https://tea-4.lozi.vn/v1/images/resized/banh-canh-trang-bang-1438764479-4-4040300-1508162103?w=480&type=s', 'Địa điểm: Bros Coffee - Ba Tháng Hai\r\nĐịa chỉ: 122/6 Ba Tháng Hai, Hưng Lợi, Quận Ninh Kiều, Cần Thơ', 'Cần Thơ', 1),
(12, 'Lẩu mắm', 500000, 'https://tea-1.lozi.vn/v1/images/resized/lau-mam-1-1713-1512242148?w=480&type=o', 'Địa điểm: Lẩu mắm Dạ Lý\r\nĐịa chỉ: 89 đường 3/2 , Quận Ninh Kiều, Cần Thơ\r\nRất ngon và lạ miệng', 'Cần Thơ', 1),
(13, 'Yummy vincom Long Xuyên', 220000, 'https://tea-4.lozi.vn/v1/images/resized/yummy-vincom-long-xuyen-1495770603-1-2543120-1495770603?w=480&type=o', 'Địa điểm: Gogi House - Quán Nướng Hàn Quốc - Vincom Plaza Long Xuyên\r\nĐịa chỉ: L4-09, Trần Hưng Đạo, Mỹ Bình, Thành Phố Long Xuyên, An Giang\r\nĂn cũng ngon lắm , , ,,,,,,,,,,,,, , , , , , , , , ,,,,,,,,,,,, , , , , , , , ,,,,,,,,, , , , , , ,,,,,,,', 'An Giang', 1),
(14, 'Càng ghẹ ram me', 70000, 'https://tea-1.lozi.vn/v1/images/resized/cang-ghe-ram-me-1481531176-1481155-1481531176?w=480&type=o', 'Địa điểm: Hẻm Ốc Quán\r\nĐịa chỉ: 89/5 Vân Đồn, Thành Phố Nha Trang, Khánh Hòa\r\n', 'Khánh Hòa', 1),
(15, 'Mì cay và bún cá lynh', 35000, 'https://tea-3.lozi.vn/v1/images/resized/mi-cay-va-bun-ca-lynh-1488017297-1947667-1488017297?w=480&type=o', 'Địa điểm: Ăn Vặt Somyho - Thủ Khoa Huân\r\nĐịa chỉ: 29 Thủ Khoa Huân, P. 1, Thành Phố Mỹ Tho, Tiền Giang', 'Tiền Giang', 1),
(16, 'Hủ tiếu sa tế Mỹ Tho', 40000, 'https://tea-1.lozi.vn/v1/images/resized/hu-tieu-sa-te-my-tho-1508379650-1-4056764-1508379650?w=480&type=s', 'Địa điểm: Hủ Tiếu Sa Tế 206 NKKN\r\nĐịa chỉ: 206 Nam Kỳ Khởi Nghĩa, Phường 4, Thành Phố Mỹ Tho, Tiền Giang\r\n', 'Tiền Giang', 1);

-- --------------------------------------------------------

--
-- Table structure for table `typetable`
--

CREATE TABLE `typetable` (
  `id_type` int(11) NOT NULL,
  `name_type` varchar(200) NOT NULL,
  `image_type` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `typetable`
--

INSERT INTO `typetable` (`id_type`, `name_type`, `image_type`) VALUES
(1, 'Quanh đây', 'https://www.simb.co/wp-content/uploads/2015/05/Audit_artwork.jpg'),
(2, 'Đồ ăn', 'https://img.huffingtonpost.com/asset/585be1aa1600002400bdf2a6.jpeg?ops=scalefit_970_noupscale'),
(3, 'Đồ ăn ship', 'https://media-cdn.tripadvisor.com/media/photo-s/02/dc/2f/69/sakura.jpg'),
(4, 'Góc con gái', 'https://i.pinimg.com/736x/42/2c/57/422c5717477e040fec423fc85b6b37c8--middle-school-outfits-school-fashion.jpg'),
(5, 'Hàng order trước', 'http://kosticekajsije.rs/wp-content/uploads/2014/04/fulfillment2.jpg'),
(6, 'Đồ con trai', 'https://i.pinimg.com/736x/4f/e6/f8/4fe6f8d5b71fee2420e1dc14f44b844c--toms-style-superdry-mens.jpg'),
(7, 'Mỹ phẩm', 'http://www.myhairmybeautyng.com/wp-content/uploads/2016/05/cosmetic-feature.jpg'),
(8, 'Phụ kiện thời trang', 'https://sellcollectivecom.files.wordpress.com/2015/10/bbbbcks1.jpg?w=604'),
(9, 'Giày sneaker', 'https://i.pinimg.com/originals/ec/0d/66/ec0d66bfbc9e4bdcb086f26f47e0a77e.jpg'),
(10, 'Tóc, Móng và Làm đẹp', 'http://www.lidoleisurepark.co.uk/uploads/images/park_images/foxys.jpg'),
(11, 'Đồ điện tử', 'https://www.allaboutcircuits.com/uploads/articles/electronics.jpg'),
(12, 'Idol Hàn Quốc', 'https://www.allkpop.com/plugin/artisttag_link/img/artist_1486768775_1.jpg'),
(13, 'Fan Nhật Bản', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR85YoHbexxVf8oYO4lwbkl_obLz7v1HxPvPsJygyI-JEthwrsesA'),
(14, 'Sách và Truyện', 'http://www.powellfumc.org/wp-content/uploads/2015/05/study-books-400x400.png'),
(15, 'Thú cưng', 'http://getlifestyle.com.au/wp-content/uploads/2017/06/goofy-pets-400x400.jpg'),
(16, 'Xe cộ', 'http://rastatravels.com/wp-content/uploads/2016/11/Piaggio-Vespa-LXS-White-400x400.jpg'),
(17, 'Đồ chơi và Sở thích', 'https://i0.wp.com/prabhujihumanitarianprojects.com/wp-content/uploads/2015/12/Prabhuji-Toy-Distribution-2015-21-400x400.jpg'),
(18, 'Âm nhạc', 'https://i.pinimg.com/736x/30/68/11/30681180c2d2121aa4b135ad9eab01b3--jazz-art-jazz-music.jpg'),
(19, 'Đồ gia dụng', 'https://ebth-com-production.imgix.net/2013/06/19/00/40/52/506/218_01.jpg?ixlib=rb-1.1.0&w=400&h=400&fit=crop&crop=&auto=format'),
(20, 'Mẹ và Bé', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSx10o75jJZiHtVRopyFafSiCNcBIzgV4CpHNWkby8TE-ZjLlNl'),
(21, 'Vật dụng trang trí nhà cửa', 'https://thehappyhousie.porch.com/wp-content/uploads/2016/09/square-Easy-Ways-to-Decorate-Your-Front-Porch-for-Fall-1-400x400.jpg'),
(22, 'Phòng và Trọ', 'https://bednbeerhostel.com/wp-content/uploads/2016/06/Bed-in-Mix-8-Bed-Dormitory-4-400x400.jpg'),
(23, 'Cần mua', 'http://www.russellandhazel.com/media/catalog/product/cache/5/thumbnail/400x400/9df78eab33525d08d6e5fb8d27136e95/2/7/27614_mini-loop-adhesive_on-journal.jpg'),
(24, 'Homestay', 'http://www.darjeelicious.com/wp-content/uploads/2016/09/IMG_844-400x400.jpg'),
(25, 'Vé sự kiện/Thẻ giảm giá', 'http://haiminhphat.com/wp-content/uploads/2017/11/voucher-01-400x400.jpg'),
(26, 'Khác', 'http://www.thehousethailand.com/wp-content/uploads/2016/07/DSC5025-1-1-400x400.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `foodtable`
--
ALTER TABLE `foodtable`
  ADD PRIMARY KEY (`id_food`);

--
-- Indexes for table `typetable`
--
ALTER TABLE `typetable`
  ADD PRIMARY KEY (`id_type`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `foodtable`
--
ALTER TABLE `foodtable`
  MODIFY `id_food` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `typetable`
--
ALTER TABLE `typetable`
  MODIFY `id_type` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
