/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
create database market
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cart_Detail](
	[cartDetaiID] [int] IDENTITY(1,1) NOT NULL,
	[cartID] [int] NULL,
	[productID] [int] NULL,
	[size] [varchar](5) NULL,
	[color] [varchar](1000) NULL,
	[amount] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[cartDetaiID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Carts]    Script Date: 10/6/2023 7:49:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Carts](
	[cartID] [int] IDENTITY(1,1) NOT NULL,
	[userID] [int] NULL,
	[status] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[cartID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 10/6/2023 7:49:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[categoryID] [varchar](5) NOT NULL,
	[categoryName] [nvarchar](45) NULL,
PRIMARY KEY CLUSTERED 
(
	[categoryID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Orders]    Script Date: 10/6/2023 7:49:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Orders](
	[orderID] [int] IDENTITY(1,1) NOT NULL,
	[userID] [int] NULL,
	[foundedDate] [datetime] NULL,
	[deliveryDate] [datetime] NULL,
	[address] [nvarchar](100) NULL,
	[paymentWay] [nvarchar](50) NULL,
	[paymentStatus] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[orderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Orders_Detail]    Script Date: 10/6/2023 7:49:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Orders_Detail](
	[orderDetailID] [int] IDENTITY(1,1) NOT NULL,
	[orderID] [int] NULL,
	[productID] [int] NULL,
	[orderStatus] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[orderDetailID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Product_Detail]    Script Date: 10/6/2023 7:49:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product_Detail](
	[productDetailID] [int] IDENTITY(1,1) NOT NULL,
	[productID] [int] NULL,
	[size] [varchar](5) NULL,
	[color] [varchar](1000) NULL,
	[countProduct] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[productDetailID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Product_Image]    Script Date: 10/6/2023 7:49:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product_Image](
	[productID] [int] NULL,
	[color] [varchar](1000) NULL,
	[linkImageColor] [nvarchar](1000) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Products]    Script Date: 10/6/2023 7:49:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Products](
	[productID] [int] IDENTITY(1,1) NOT NULL,
	[productName] [nvarchar](100) NULL,
	[descriptions] [nvarchar](2000) NULL,
	[sex] [varchar](10) NULL,
	[imageLink] [nvarchar](1000) NULL,
	[price] [int] NULL,
	[categoryID] [varchar](5) NULL,
PRIMARY KEY CLUSTERED 
(
	[productID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Review]    Script Date: 10/6/2023 7:49:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Review](
	[reviewID] [int] IDENTITY(1,1) NOT NULL,
	[userID] [int] NULL,
	[productID] [int] NULL,
	[content] [nvarchar](200) NULL,
PRIMARY KEY CLUSTERED 
(
	[reviewID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Roles]    Script Date: 10/6/2023 7:49:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Roles](
	[roleID] [int] NOT NULL,
	[roleName] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[roleID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Store_Detail]    Script Date: 10/6/2023 7:49:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Store_Detail](
	[storeDetaiID] [int] IDENTITY(1,1) NOT NULL,
	[storeID] [int] NULL,
	[productID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[storeDetaiID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Stores]    Script Date: 10/6/2023 7:49:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Stores](
	[storeID] [int] IDENTITY(1,1) NOT NULL,
	[storeName] [nvarchar](255) NULL,
	[storeAddress] [nvarchar](255) NULL,
	[userID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[storeID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Users]    Script Date: 10/6/2023 7:49:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Users](
	[userID] [int] IDENTITY(1,1) NOT NULL,
	[userName] [varchar](50) NULL,
	[pass] [varchar](50) NULL,
	[fullName] [nvarchar](50) NULL,
	[email] [varchar](50) NULL,
	[phone] [varchar](50) NULL,
	[userAddress] [nvarchar](50) NULL,
	[roleID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[userID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Cart_Detail]  WITH CHECK ADD FOREIGN KEY([cartID])
REFERENCES [dbo].[Carts] ([cartID])
GO
ALTER TABLE [dbo].[Cart_Detail]  WITH CHECK ADD FOREIGN KEY([productID])
REFERENCES [dbo].[Products] ([productID])
GO
ALTER TABLE [dbo].[Carts]  WITH CHECK ADD FOREIGN KEY([userID])
REFERENCES [dbo].[Users] ([userID])
GO
ALTER TABLE [dbo].[Orders]  WITH CHECK ADD FOREIGN KEY([userID])
REFERENCES [dbo].[Users] ([userID])
GO
ALTER TABLE [dbo].[Orders_Detail]  WITH CHECK ADD FOREIGN KEY([orderID])
REFERENCES [dbo].[Orders] ([orderID])
GO
ALTER TABLE [dbo].[Orders_Detail]  WITH CHECK ADD FOREIGN KEY([productID])
REFERENCES [dbo].[Products] ([productID])
GO
ALTER TABLE [dbo].[Product_Detail]  WITH CHECK ADD FOREIGN KEY([productID])
REFERENCES [dbo].[Products] ([productID])
GO
ALTER TABLE [dbo].[Product_Image]  WITH CHECK ADD FOREIGN KEY([productID])
REFERENCES [dbo].[Products] ([productID])
GO
ALTER TABLE [dbo].[Products]  WITH CHECK ADD FOREIGN KEY([categoryID])
REFERENCES [dbo].[Category] ([categoryID])
GO
ALTER TABLE [dbo].[Review]  WITH CHECK ADD FOREIGN KEY([productID])
REFERENCES [dbo].[Products] ([productID])
GO
ALTER TABLE [dbo].[Review]  WITH CHECK ADD FOREIGN KEY([userID])
REFERENCES [dbo].[Users] ([userID])
GO
ALTER TABLE [dbo].[Store_Detail]  WITH CHECK ADD FOREIGN KEY([productID])
REFERENCES [dbo].[Products] ([productID])
GO
ALTER TABLE [dbo].[Store_Detail]  WITH CHECK ADD FOREIGN KEY([storeID])
REFERENCES [dbo].[Stores] ([storeID])
GO
ALTER TABLE [dbo].[Stores]  WITH CHECK ADD FOREIGN KEY([userID])
REFERENCES [dbo].[Users] ([userID])
GO
ALTER TABLE [dbo].[Users]  WITH CHECK ADD FOREIGN KEY([roleID])
REFERENCES [dbo].[Roles] ([roleID])
GO
USE [master]
GO
ALTER DATABASE [data_market] SET  READ_WRITE 
GO

INSERT INTO Product_Image VALUES
('1', 'BLACK', 'https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5/udg8fwbyoagyda3hhcmr/sportswear-jdi-t-shirt-fWxmBB.png'),
('1', 'RED', 'https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5/ba13d645-350b-4510-8233-6ce02b47a523/sportswear-jdi-t-shirt-fWxmBB.png'),
('1', 'BLUE', 'https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5/128e70d6-5c35-480c-aef2-471d098c3f83/sportswear-jdi-t-shirt-fWxmBB.png'),
('2', 'PINK', 'https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5,q_80/b615facc-0123-4831-b52d-a404aea5029d/sportswear-club-fleece-mid-rise-shorts-MWZjWc.png'),
('2', 'BLACK', 'https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5,q_80/18545390-1134-4365-a9d8-e1d5f62a759e/sportswear-club-fleece-mid-rise-shorts-MWZjWc.png'),
('3', 'BLACK', 'https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5/0896a951-bfb7-4558-ae41-561be9369922/jordan-delta-3-mid-shoes-WwnTQl.png'),
('3', 'DARK DRIFTWOOD', 'https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5/cfa92017-8c8a-4bd1-8035-4ebb89ac1323/jordan-delta-3-mid-shoes-WwnTQl.png'),
('4', 'WHITE', 'https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5,q_80/5ab74e95-1d46-484b-9695-1c9921734dc1/react-ace-tour-golf-shoe-T1FLbW.png'),
('4', 'PINK', 'https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5,q_80/ccc3760d-3d95-4d8a-8bc1-f283e475c277/react-ace-tour-golf-shoe-T1FLbW.png'),
('5', 'Light Blue', 'https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/e159816f543a4c92bb80aed600db6cd8_9366/Ao_DJau_San_Nha_Argentina_22_trang_HF2158_25_model.jpg')
;
INSERT INTO Product_Image VALUES
('6', 'BROWN', 'https://image.uniqlo.com/UQ/ST3/vn/imagesgoods/450491/sub/vngoods_450491_sub1.jpg?width=1600&impolicy=quality_75'),
('6', 'BLACK', 'https://image.uniqlo.com/UQ/ST3/vn/imagesgoods/450491/sub/vngoods_450491_sub2.jpg?width=1600&impolicy=quality_75'),
('6', 'NAVY', 'https://image.uniqlo.com/UQ/ST3/vn/imagesgoods/450491/item/vngoods_69_450491.jpg?width=1600&impolicy=quality_75'),
('7', 'BLACK', 'https://img.hollisterco.com/is/image/anf/KIC_344-2300-0955-900_model1?policy=product-large'),
('7', 'Cream', 'https://img.hollisterco.com/is/image/anf/KIC_344-2305-0957-110_model1?policy=product-large'),
('7', 'Blue', 'https://img.hollisterco.com/is/image/anf/KIC_344-2320-0956-201_prod2?policy=product-large'),
('8', 'Beige', 'https://lp2.hm.com/hmgoepprod?set=quality%5B79%5D%2Csource%5B%2Ff2%2F9e%2Ff29ecd349008bcce7a109d157197c3759e95f5b2.jpg%5D%2Corigin%5Bdam%5D%2Ccategory%5B%5D%2Ctype%5BLOOKBOOK%5D%2Cres%5Bm%5D%2Chmver%5B1%5D&call=url[file:/product/main]'),
('8', 'Black', 'https://lp2.hm.com/hmgoepprod?set=format%5Bwebp%5D%2Cquality%5B79%5D%2Csource%5B%2Fe5%2Fee%2Fe5ee162d5f9f94d848814c565ec64a51c3475b32.jpg%5D%2Corigin%5Bdam%5D%2Ccategory%5B%5D%2Ctype%5BLOOKBOOK%5D%2Cres%5Bm%5D%2Chmver%5B1%5D&call=url%5Bfile%3A%2Fproduct%2Fmain%5D'),
('9', 'Black', 'https://www.versace.com/dw/image/v2/ABAO_PRD/on/demandware.static/-/Sites-ver-master-catalog/default/dw33c1e90f/original/90_1006962-1A04931_1B000_16_Single-BreastedWoolCoat-Coats-versace-online-store_0_0.jpg?sw=748&sh=1050&sm=fit')
;
INSERT INTO Products VALUES
(N'Áo Nike Sportswear JDI', 'The Nike Sportswear JDI T-Shirt sets you up with soft jersey fabric and a "Just Do It." logo across the chest.', 'MAN', 'https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5/oc6hyw6pc0oswm8aahq1/sportswear-jdi-t-shirt-fWxmBB.png', '1000000', '1'),
(N'Quần Nike Sportswear Club Fleece', 'Club Fleece, universally loved for its cosiness and consistency, is for everyone. Designed to meet your favourite crop tops at their hem, these relaxed, mid-rise Club Fleece shorts have a super-soft feel that makes it easy to stay comfortable.', 'WOMEN', 'https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5/7d90e451-9ae3-4f91-bb44-cc9ed06ce301/sportswear-club-fleece-mid-rise-shorts-MWZjWc.png', '1119000', '1'),
(N'Giày Jordan Delta 3 Mid', 'Inspired by 90s on-court gear and the Space-Age aesthetic, the Delta 3 is ready to launch. With super-lightweight technical materials, they have a retro-futuristic look and feel. This is the next-gen footwear thats gonna take you into tomorrow.', 'MAN', 'https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5/47dfb42d-c70d-4bbe-b989-452fcfc75207/jordan-delta-3-mid-shoes-WwnTQl.png', '4409000', '2'),
(N'Giày Nike React Ace Tour', 'We d like to introduce the Nike React Ace Tour. Its the first performance golf shoe we ve designed and refined with the female athlete in mind. Every detail, from the new traction pattern to the innovative lacing system, is built to perform, whether you re a professional or just starting your golf journey.', 'WOMEN', 'https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5/539cf4f7-8433-4ece-8c4f-9ad9269b8ef6/react-ace-tour-golf-shoe-T1FLbW.png', '4109000', '2'),
(N'ÁO ĐẤU SÂN NHÀ ARGENTINA', N'CHIẾC ÁO ĐẤU DÀNH CHO CỔ ĐỘNG VIÊN TRONG NHỮNG TRẬN ĐẤU LỚN, LÀM TỪ CHẤT LIỆU TÁI CHẾ.V', 'MAN/WOMEN', 'https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/8fecaae3166e428b9cf0ae830109e23e_9366/Ao_DJau_San_Nha_Argentina_22_trang_HF2158_21_model.jpg', '2100000','1'),
(N'Áo Khoác Dáng Dài Hybrid Down', N'Sự kết hợp giữa các lớp lông vũ và lớp lót giúp giữ ấm và dễ dàng vận động. Thiết kế thời trang phù hợp cho trang phục hàng ngày.', 'WOMEN', 'https://image.uniqlo.com/UQ/ST3/vn/imagesgoods/450491/item/vngoods_34_450491.jpg?width=1600&impolicy=quality_75', '2944000', '3'),
(N'Áo FAUX FUR-LINED COZY PARKA', 'Designed with a longer length, this parka features cozy faux fur lining, a full button closure, hood with faux fur trim and front pockets. Tie detail at back hem. Imported.', 'WOMEN', 'https://img.hollisterco.com/is/image/anf/KIC_344-2300-0955-900_prod1?policy=product-large', '5200000', '3'),
(N'Áo thắt đai', N'Áo khoác dài đến đầu gối bằng vải dệt với bề mặt được chải nhẹ. Ve áo có rãnh, khóa cài giấu kín và túi trước may viền. Thắt lưng có thể tháo rời ở eo và lỗ thông hơi ở phía sau.', 'WOMEN', 'https://lp2.hm.com/hmgoepprod?set=format%5Bwebp%5D%2Cquality%5B79%5D%2Csource%5B%2F10%2F70%2F10707c8f91efec512f21eb6a1bcfb190a726cef9.jpg%5D%2Corigin%5Bdam%5D%2Ccategory%5B%5D%2Ctype%5BLOOKBOOK%5D%2Cres%5Bm%5D%2Chmver%5B1%5D&call=url%5Bfile%3A%2Fproduct%2Fmain%5D', '30100000', '3'),
(N'Áo SINGLE-BREASTED WOOL COAT', 'Expertly cut in a single-breasted silhouette, the long-length coat features a notched lapel. Fully lined, its complete with welt pockets and a back vent for ease of movement.', 'MAN', 'https://www.versace.com/dw/image/v2/ABAO_PRD/on/demandware.static/-/Sites-ver-master-catalog/default/dwbbea9577/original/90_1006962-1A04931_1B000_15_Single-BreastedWoolCoat-Coats-versace-online-store_0_0.jpg?sw=748&sh=1050&sm=fit', '50000012', '3');

INSERT INTO Product_Detail VALUES
('1', 'S', 'BLACK', '200'),
('1', 'M', 'BLACK', '500'),
('1', 'L', 'BLACK', '800'),
('1', 'S', 'RED', '200'),
('1', 'M', 'RED', '500'),
('1', 'L', 'RED', '500'),
('1', 'S', 'BLUE', '200'),
('1', 'M', 'BLUE', '500'),
('1', 'L', 'BLUE', '500'),
('2', 'S', 'PINK', '100'),
('2', 'M', 'PINK', '100'),
('2', 'L', 'PINK', '100'),
('2', 'S', 'BLACK', '150'),
('2', 'M', 'BLACK', '150'),
('2', 'L', 'BLACK', '100'),
('3', '39', 'BLACK', '80'),
('3', '40', 'BLACK', '80'),
('3', '41', 'BLACK', '80'),
('3', '39', 'DARK DRIFTWOOD', '50'),
('3', '40', 'DARK DRIFTWOOD', '80'),
('3', '41', 'DARK DRIFTWOOD', '80'),
('4', '39', 'WHITE', '40'),
('4', '40', 'WHITE', '40'),
('4', '41', 'WHITE', '40'),
('4', '39', 'PINK', '40'),
('4', '40', 'PINK', '40'),
('4', '41', 'PINK', '40'),
('5', 'S', 'Light Blue', '300'),
('5', 'M', 'Light Blue', '523'),
('5', 'L', 'Light Blue', '313');
INSERT INTO Product_Detail VALUES
('6', 'S', 'BROWN', '34'),
('6', 'M', 'BROWN', '2'),
('6', 'L', 'BROWN', '15'),
('6', 'S', 'BLACK', '10'),
('6', 'M', 'BLACK', '1'),
('6', 'L', 'BLACK', '12'),
('6', 'S', 'NAVY', '30'),
('6', 'M', 'NAVY', '200'),
('6', 'L', 'NAVY', '312'),
('7', 'S', 'BLACK', '4'),
('7', 'M', 'BLACK', '7'),
('7', 'L', 'BLACK', '10'),
('7', 'S', 'Cream', '30'),
('7', 'M', 'Cream', '320'),
('7', 'L', 'Cream', '300'),
('7', 'S', 'Blue', '12'),
('7', 'M', 'Blue', '132'),
('7', 'L', 'Blue', '612'),
('8', 'S', 'Beige', '543'),
('8', 'M', 'Beige', '3'),
('8', 'L', 'Beige', '4'),
('8', 'S', 'Black', '3'),
('8', 'M', 'Black', '39'),
('8', 'L', 'Black', '376'),
('9', 'S', 'Black', '5'),
('9', 'M', 'Black', '6'),
('9', 'L', 'Black', '7')
;
INSERT INTO Category VALUES
('1', N'Clothes'),
('2', N'Footwear'),
('3', N'Coat'),
('4', 'MEN'),
('5', 'WOMEN');

INSERT INTO Stores Values 
('LuckyShop', 'Quang Nam', '2'),
('Piva', 'Quang Ngai', '1'),
('ShevaLit', 'Binh Dinh', '5'),
('HoaLanShop', 'Quang Binh', '4'),
('BinhVienCT', 'Nghe An', '6'),
('RoboMH', 'Da Nang', '3'),
('ClothesShop', 'Da Nang', '9'),
('LTShop', 'Quang Nam', '7'),
('Hanboritic', 'Ho Chi Minh', '8');

INSERT INTO Store_Detail VALUES
('3',N'Quần Nike Sportswear Club Fleece'),
('7',N'Giày Jordan Delta 3 Mid'),
('2',N'Áo Nike Sportswear JDI'),
('6',N'Áo Khoác Dáng Dài Hybrid Down'),
('8',N'Giày Nike React Ace Tour'),
('1',N'Áo thắt đai'),
('4',N'ÁO ĐẤU SÂN NHÀ ARGENTINA'),
('9',N'Áo SINGLE-BREASTED WOOL COAT'),
('5',N'Áo FAUX FUR-LINED COZY PARKA');

INSERT INTO Category VALUES
('6', 'Fast food'),
('7', 'Electronic device'),
('8', 'Watch'),
('9', 'Health'),
('10', 'Phones and accessories'),
('11', 'Sports and travel'),
('12', 'Household appliances'),
('13', 'Bookstore'),
('14', 'Toy'),
('15', 'Home and life');