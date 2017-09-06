--
-- Database: `omc`
--

-- --------------------------------------------------------
CREATE TABLE `ITEM` (
  `CD_ITEM` int(11) NOT NULL,	
  `CD_APOLI` int(11) NOT NULL,
  `CD_APOLI_SUSEP_RENOV` varchar(100) NOT NULL,
  `CD_CLIEN` int(11) NOT NULL,  
  `CD_ENDOS` int(11) NOT NULL,
  `CD_NGOCO` int(11) NOT NULL,
  `CD_MDUPR` int(11) NOT NULL,
  `DT_EMISS_ITEM` date NOT NULL,  
  `DT_ULTMA_ALTER` date NOT NULL,  
  `TP_HISTO_ITEM` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


ALTER TABLE `ITEM`
  ADD PRIMARY KEY (`CD_ITEM`);

ALTER TABLE `ITEM`
  MODIFY `CD_ITEM` int(11) NOT NULL AUTO_INCREMENT;
  
INSERT INTO `item`(`CD_ITEM`, `CD_APOLI`, `CD_APOLI_SUSEP_RENOV`, `CD_CLIEN`, `CD_ENDOS`, `CD_NGOCO`, `CD_MDUPR`, `DT_EMISS_ITEM`, `DT_ULTMA_ALTER`, `TP_HISTO_ITEM`)
 VALUES (1,1,1,1,1,1,1,now(),now(),'0');  


select * from ITEM;