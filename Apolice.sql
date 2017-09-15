--
-- Database: `omc`
--

-- --------------------------------------------------------
CREATE TABLE `APOLICE` (
  `CD_APOLI` bigint(11) NOT NULL,
  `TP_HISTO_APOLI` varchar(2) NOT NULL,
  `CD_APOLI_SUSEP` bigint(11) NOT NULL,
  `CD_APOLI_SUSEP_RENOV` bigint(11) NOT NULL,    
  `CD_CIA_SGDRA` bigint(11) NOT NULL,
  `CD_CIA_SGDRA_RENOV` bigint(11) NOT NULL,
  `CD_ENDOS` bigint(11) NOT NULL,  
  `CD_MDUPR` bigint(11) NOT NULL,
  `CD_NGOCO` bigint(11) NOT NULL,
  `TP_HISTO_NGOCO` varchar(2) NOT NULL,  
  `CD_RAMO_RENOV` bigint(11) NOT NULL,
  `CD_RAMO_SEG` bigint(11) NOT NULL,
  `CD_SUCSL_FISCL` bigint(11) NOT NULL,
  `DT_EMISS_APOLI` date NOT NULL,
  `DT_FIM_SELEC` date NOT NULL,
  `DT_INICO_SELEC` date NOT NULL,
  `DT_PARTM` date NOT NULL,
  `DT_ULTMA_ALTER` date NOT NULL,
  `SQ_MDUPR` bigint(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


ALTER TABLE `APOLICE`  ADD PRIMARY KEY (`CD_APOLI`, `TP_HISTO_APOLI`);

ALTER TABLE APOLICE ADD constraint FK_NEGOCIO foreign key (CD_NGOCO, TP_HISTO_NGOCO) references NEGOCIO (CD_NGOCO, TP_HISTO_NGOCO);

-- ALTER TABLE `APOLICE`  MODIFY `CD_APOLI` bigint(11) NOT NULL AUTO_INCREMENT;


INSERT INTO `apolice`(`CD_APOLI`, `TP_HISTO_APOLI`, `CD_APOLI_SUSEP`, `CD_APOLI_SUSEP_RENOV`, `CD_CIA_SGDRA`, `CD_CIA_SGDRA_RENOV`, `CD_ENDOS`, `CD_MDUPR`, `CD_NGOCO`,`TP_HISTO_NGOCO`, `CD_RAMO_RENOV`, `CD_RAMO_SEG`, `CD_SUCSL_FISCL`, `DT_EMISS_APOLI`, `DT_FIM_SELEC`, `DT_INICO_SELEC`, `DT_PARTM`, `DT_ULTMA_ALTER`, `SQ_MDUPR`)
VALUES (1,'0',1,1,1,1,1,1,1,'0',1,1,1,now(),now(),now(),now(),now(),1);

select * from APOLICE;