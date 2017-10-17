LICENSE = "CLOSED"

DEPENDS = "wpewebkit glib-2.0 luajit-native luajit"
RDEPENDS_${PN} = "glib-2.0-dev wpewebkit-dev"

SRCREV = "fbf8df56fbcc18fb2c1aa266c4a9f5a31d605549"
SRC_URI = " \
          git://github.com/Igalia/dyz.git;protocol=https;branch=master \
          file://PR8.patch \
         "

inherit autotools

S = "${WORKDIR}/git"
B = "${S}"

LDFLAGS_append = " -ldl -lm"

INSANE_SKIP_${PN} = "dev-deps"
