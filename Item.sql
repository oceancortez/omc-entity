--
-- Database: `omc`
--

-- --------------------------------------------------------
CREATE TABLE `ITEM` (
  `CD_ITEM` bigint(11) NOT NULL,
  `TP_HISTO_ITEM` varchar(2) NOT NULL,
  `CD_APOLI` bigint(11) NOT NULL,
  `CD_APOLI_SUSEP_RENOV` varchar(100) NOT NULL,
  `CD_CLIEN` bigint(11) NOT NULL,  
  `CD_ENDOS` bigint(11) NOT NULL,
  `CD_NGOCO` bigint(11) NOT NULL,
  `TP_HISTO_NGOCO` varchar(2) NOT NULL,
  `CD_MDUPR` bigint(11) NOT NULL,
  `DT_EMISS_ITEM` date NOT NULL,  
  `DT_ULTMA_ALTER` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


ALTER TABLE `ITEM`
  ADD PRIMARY KEY (`CD_ITEM`, TP_HISTO_ITEM);
  
ALTER TABLE ITEM add constraint FK_ITEM foreign key (CD_NGOCO, TP_HISTO_NGOCO) references NEGOCIO (CD_NGOCO, TP_HISTO_NGOCO);  

 -- ALTER TABLE `ITEM`  MODIFY `CD_ITEM` bigint(11) NOT NULL AUTO_INCREMENT;
  
INSERT INTO `item`(`CD_ITEM`, `TP_HISTO_ITEM`, `CD_APOLI`, `CD_APOLI_SUSEP_RENOV`, `CD_CLIEN`, `CD_ENDOS`, `CD_NGOCO`, TP_HISTO_NGOCO, `CD_MDUPR`, `DT_EMISS_ITEM`, `DT_ULTMA_ALTER`)
 VALUES (1,'0',1,1,1,1,1,'0',1,now(),now());  


select * from ITEM;