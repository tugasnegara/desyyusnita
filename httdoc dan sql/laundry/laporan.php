<?php

include "config/koneksi.php";

?>

<!DOCTYPE html>
<html>
<head>
	<title>LAPORAN Laundry YUSNITA</title>
</head>
<body>
	<form method="post">
		<table align="center">
			<tr>
				<td>
					<div class="mainutama">
						<table align="center">
							<tr>
								<td width="7%" rowspan="3" align="center" valign="top"><img src="img/img1.jpeg" style="width:75px; height:70px;"></td>
       						<td width="93%" valign="bottom">&nbsp;LAPORAN LAUNDRY YUSNITA</td>
							</tr>
							<tr>
								<td colspan="2">Jl. Raya Sukowati No 20 Sragen 57251. Jawa Tengah</td>
							</tr>
						</table>
						<table width="100%">
						<tr><td><hr></td></tr>
					</table>
					<table align="center" border="1">
						<tr>
							<th bgcolor="#ff2323">No Order</th>
							<th bgcolor="#ff2323">Nama</th>
							<th bgcolor="#ff2323">No Telepon</th>
							<th bgcolor="#ff2323">Alamat</th>
							<th bgcolor="#ff2323">Jenis Cucian</th>
							<th bgcolor="#ff2323">Harga</th>
							<th bgcolor="#ff2323">Berat</th>
							<th bgcolor="#ff2323">Tanggal Masuk</th>
							<th bgcolor="#ff2323">Tanggal Keluar</th>
							<th bgcolor="#ff2323">Total</th>
							<th bgcolor="#ff2323">Bayar</th>
							<th bgcolor="#ff2323">Kembalian</th>
							<th bgcolor="#ff2323">Status</th>
							<th bgcolor="#ff2323">Keterangan</th>
							<th bgcolor="#ff2323">Pengerjaan</th>
						</tr>
						<?php
					      @$sql = "SELECT * FROM penerimaan INNER JOIN pelanggan USING(id_pelanggan)";
					      @$query = mysqli_query($con, $sql);
					      while($data = mysqli_fetch_array($query)){
					    ?>
					    <tr>
					        <td align="center"><?= $data['no_order'] ?></td>
					        <td><?= $data['nama_pelanggan'] ?></td>
					        <td><?= $data['telp'] ?></td>
					        <td><?= $data['alamat'] ?></td>
					        <td><?= $data['jenis_cucian'] ?></td>
					        <td>Rp.<?= $data['harga'] ?></td>
					        <td><?= $data['berat'] ?>kg</td>
					        <td><?= $data['tgl_masuk'] ?></td>
					        <td><?= $data['tgl_keluar'] ?></td>
					        <td align="center">Rp.<?= $data['t_bayar'] ?></td>
					        <td align="right">Rp.<?= $data['bayar'] ?></td>
					        <td>Rp.<?= $data['sisa'] ?></td>
					        <td><?= $data['status'] ?></td>
					        <td><?= $data['keterangan'] ?></td>
					        <td><?= $data['pengerjaan'] ?></td>
					      </tr>
					      <?php } ?>
					</table>
					<table width="100%">
			      		<tr><td><hr></td></tr>
			    	</table> 
			    	<table align="center">
			      		<tr>
			        	<td>&copy; <?php echo date('Y'); ?> D'YUS</td>
			      		</tr>
			    	</table>
					</div>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>