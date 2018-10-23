/*
MySQL Data Transfer
Source Host: localhost
Source Database: ssmdemo
Target Host: localhost
Target Database: ssmdemo
Date: 2018/10/18 15:27:46
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for author
-- ----------------------------
CREATE TABLE `author` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for book
-- ----------------------------
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `price` int(255) DEFAULT NULL,
  `authorid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `author` VALUES ('1', '曹雪芹');
INSERT INTO `author` VALUES ('2', '吴承恩');
INSERT INTO `author` VALUES ('3', '罗贯中');
INSERT INTO `author` VALUES ('4', '施耐庵');
INSERT INTO `author` VALUES ('5', 'ww');
INSERT INTO `author` VALUES ('6', 'ss');
INSERT INTO `author` VALUES ('10', 'wwwww');
INSERT INTO `book` VALUES ('2', '红楼梦', '47', '1');
INSERT INTO `book` VALUES ('3', '西游记', '37', '2');
INSERT INTO `book` VALUES ('4', '水浒传', '40', '4');
INSERT INTO `book` VALUES ('5', '三国演义', '157', '3');
INSERT INTO `book` VALUES ('15', 'asdsadas', '23', '5');
INSERT INTO `book` VALUES ('16', 'reredfd', '45', '6');
INSERT INTO `book` VALUES ('17', 'dfdfd', '23', '10');
INSERT INTO `book` VALUES ('23', '头文字地', '35', '10');
INSERT INTO `book` VALUES ('24', '额鹅鹅鹅', '55555', '5');
