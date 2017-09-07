--
-- Database: `omc`
--

-- --------------------------------------------------------

--
-- Table structure for table `NEGOCIO`
--

CREATE TABLE `negocio` (
  `CD_NGOCO` int(11) NOT NULL,
  `NM_CIA` varchar(100) NOT NULL,
  `CD_RAMO` int(11) NOT NULL,
  `CD_APOLICE` int(11) NOT NULL,
  `CD_APOLICE_SUSEP` int(11) NOT NULL,
  `CD_MDUPR` int(11) NOT NULL,
  `DS_MDUPR` varchar(100) NOT NULL,
  `DT_EMISSAO` date NOT NULL,
  `DT_INICIO_VIGEN` date NOT NULL,
  `DT_FIM_VIGEN` date NOT NULL,
  `CD_SITUC_NGOCO` varchar(100) NOT NULL,
  `CD_ESTPL` int(11) NOT NULL,
  `DT_VIGEN_PROPOR` date NOT NULL,
  `CD_GRP_PRDUT` int(11) NOT NULL,
  `DS_GRP_PRDUT` varchar(100) NOT NULL,
  `CD_PLACA` varchar(100) NOT NULL,
  `CD_CHASSI` varchar(100) NOT NULL,
  `NR_ITSEG` int(11) NOT NULL,
  `CD_CORRETOR` int(11) NOT NULL,
  `NM_CORRETOR` varchar(100) NOT NULL,
  `CD_SUCURSAL` int(11) NOT NULL,
  `NM_SUCURSAL` varchar(100) NOT NULL,
  `ST_NEGOCIO` varchar(100) NOT NULL,
  `CD_ENDOSSO` int(11) NOT NULL,
  `CD_CLIEN` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `NEGOCIO`
--
ALTER TABLE `NEGOCIO`
  ADD PRIMARY KEY (`CD_NGOCO`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `NEGOCIO`
--
ALTER TABLE `NEGOCIO`
  MODIFY `CD_NGOCO` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

INSERT INTO `negocio`
(`CD_NGOCO`, `NM_CIA`, `CD_RAMO`, `CD_APOLICE`, `CD_APOLICE_SUSEP`, `CD_MDUPR`, `DS_MDUPR`, `DT_EMISSAO`, `DT_INICIO_VIGEN`, `DT_FIM_VIGEN`, `CD_SITUC_NGOCO`, `CD_ESTPL`, `DT_VIGEN_PROPOR`, `CD_GRP_PRDUT`, `DS_GRP_PRDUT`, `CD_PLACA`, `CD_CHASSI`, `NR_ITSEG`, `CD_CORRETOR`, `NM_CORRETOR`, `CD_SUCURSAL`, `NM_SUCURSAL`, `ST_NEGOCIO`, `CD_ENDOSSO`, `CD_CLIEN`) 
VALUES 
(1,'CIA',1,1,1,1,'Auto',now(),now(),now(),1,1,now(),1,'desc grupo protudo','xxx5544','x1x1x1x1x1x1x1x1',1,1,'teste',1,'teste','A',1,1)


select * from negocio;