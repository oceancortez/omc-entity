--
-- Database: `omc`
--

-- --------------------------------------------------------
CREATE TABLE `APOLICE` (
  `CD_APOLI` int(11) NOT NULL,
  `TP_HISTO_APOLI` varchar(100) NOT NULL,
  `CD_APOLI_SUSEP` int(11) NOT NULL,
  `CD_APOLI_SUSEP_RENOV` int(11) NOT NULL,    
  `CD_CIA_SGDRA` int(11) NOT NULL,
  `CD_CIA_SGDRA_RENOV` int(11) NOT NULL,
  `CD_ENDOS` int(11) NOT NULL,  
  `CD_MDUPR` int(11) NOT NULL,
  `CD_NGOCO` int(11) NOT NULL,
  `CD_RAMO_RENOV` int(11) NOT NULL,
  `CD_RAMO_SEG` int(11) NOT NULL,
  `CD_SUCSL_FISCL` int(11) NOT NULL,
  `DT_EMISS_APOLI` date NOT NULL,
  `DT_FIM_SELEC` date NOT NULL,
  `DT_INICO_SELEC` date NOT NULL,
  `DT_PARTM` date NOT NULL,
  `DT_ULTMA_ALTER` date NOT NULL,
  `SQ_MDUPR` int(11) NOT NULL,
  `TP_HISTO_NGOCO` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


ALTER TABLE `APOLICE`
  ADD PRIMARY KEY (`CD_APOLI`);

ALTER TABLE `APOLICE`
  MODIFY `CD_APOLI` int(11) NOT NULL AUTO_INCREMENT;


INSERT INTO `apolice`(`CD_APOLI`, `TP_HISTO_APOLI`, `CD_APOLI_SUSEP`, `CD_APOLI_SUSEP_RENOV`, `CD_CIA_SGDRA`, `CD_CIA_SGDRA_RENOV`, `CD_ENDOS`, `CD_MDUPR`, `CD_NGOCO`, `CD_RAMO_RENOV`, `CD_RAMO_SEG`, `CD_SUCSL_FISCL`, `DT_EMISS_APOLI`, `DT_FIM_SELEC`, `DT_INICO_SELEC`, `DT_PARTM`, `DT_ULTMA_ALTER`, `SQ_MDUPR`, `TP_HISTO_NGOCO`)
VALUES (1,'0',1,1,1,1,1,1,1,1,1,1,now(),now(),now(),now(),now(),1,'0')

select * from APOLICE;