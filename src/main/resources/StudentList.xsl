<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<!-- TODO: Auto-generated template -->
		<html lang="en">
			<head>
			<style>
			table , th td {
			border: 1px solid black;
			border collapse: collapse;
			}
			</style>
				<title>Test</title>
			</head>
			
			<body>
				<table>
					<tr>
						<th>firstName</th>
					    <th>lastName</th>
						<th>course</th>
						<th colspan='3'>scores</th>
						<th >subject</th>

					</tr>

					<xsl:for-each select="StudentsList/student">
						<tr>
							<td>
								<xsl:value-of select="firstName" />
							</td>
							<td>
								<xsl:value-of select="lastName" />
							</td>
							<td>
								<xsl:value-of select="course" />
							</td>
							<xsl:for-each select="scores">
								<td>
									<xsl:value-of select="subject1" />
								</td>
								<td>
									<xsl:value-of select="subject2" />
								</td>
								<td>
									<xsl:value-of select="subject3" />
								</td>
								<td>
									<xsl:value-of select="subject4" />
								</td>
							</xsl:for-each>
						</tr>

					</xsl:for-each>

				</table>

			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>