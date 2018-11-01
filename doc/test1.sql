/*
MySQL Data Transfer
Source Host: localhost
Source Database: test1
Target Host: localhost
Target Database: test1
Date: 2018/11/1 17:16:37
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for author
-- ----------------------------
CREATE TABLE `author` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for book
-- ----------------------------
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `price` int(255) DEFAULT NULL,
  `authorid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `author` VALUES ('1', '曹雪芹');
INSERT INTO `author` VALUES ('2', '吴承恩');
INSERT INTO `author` VALUES ('3', '罗贯中');
INSERT INTO `author` VALUES ('4', '施耐庵');
INSERT INTO `author` VALUES ('15', '十五');
INSERT INTO `author` VALUES ('16', '十六');
INSERT INTO `author` VALUES ('17', '十七');
INSERT INTO `author` VALUES ('18', '十八');
INSERT INTO `author` VALUES ('19', '十九');
INSERT INTO `book` VALUES ('2', '红楼梦', '47', '1');
INSERT INTO `book` VALUES ('3', '西游记', '37', '2');
INSERT INTO `book` VALUES ('4', '水浒传', '40', '4');
INSERT INTO `book` VALUES ('5', '三国演义', '157', '3');
INSERT INTO `book` VALUES ('6', '三生三世', '263', '15');
INSERT INTO `book` VALUES ('31', '十三剑', '23', '18');
