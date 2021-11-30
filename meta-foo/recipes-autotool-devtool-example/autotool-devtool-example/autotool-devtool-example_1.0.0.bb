# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "https://github.com/twoerner/autotool-devtool-example/archive/v${PV}.tar.gz \
           file://0001-test.patch \
           "
SRC_URI[md5sum] = "bafcd219fa78aa7b85395f16b23d1ecf"
SRC_URI[sha1sum] = "8e8b63ff49d722241cf64a87638b155286346a97"
SRC_URI[sha256sum] = "21a1b0216c2b8dfb408cd20c8a2360e5c3772a1b6b93d966341d727bfe7dd057"
SRC_URI[sha384sum] = "debc2ee5922de4967bb38097c7c5ef2d442e9a8571b48f4c9b80eed25966be76ac486fbcc5297e571110d3a64108fe32"
SRC_URI[sha512sum] = "259fccca83191af187c219277ed2c03871deb50d2e1bd1b8304afcf28e06448634fc79d2bec0c5baa792489b1f71fe622b7c4d7d548d26d76eea62055e2400e1"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

