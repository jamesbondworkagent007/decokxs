package QfgSZK;

import com.engagelab.privates.push.constants.MTPushConstants;

/* JADX INFO: loaded from: classes.dex */
final class RjCdvp {
    static String DvGueO;
    static String OpmPAf;
    static String QFejgZ;
    static String QpPqiA;
    static String UKISMj;
    static String feYVnX;
    static String zbkkxj;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: QfgSZK.RjCdvp$RjCdvp, reason: collision with other inner class name */
    public static final class EnumC0008RjCdvp {
        public static final EnumC0008RjCdvp COULD_NOT_CHECK;
        public static final EnumC0008RjCdvp INCONSISTENT_PATH;
        public static final EnumC0008RjCdvp INVALID_COMM_CONTENT;
        public static final EnumC0008RjCdvp JSON_EXCEPTION;
        public static final EnumC0008RjCdvp MULTIPLE_PID;
        public static final EnumC0008RjCdvp NOT_CLONED;
        public static int RGH;
        private static final /* synthetic */ EnumC0008RjCdvp[] gkhjaB;
        String dBFhBU;
        boolean zrZlgc;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            RGH = 1836;
            GCXiNH.OHr = 2270;
            INCONSISTENT_PATH = new EnumC0008RjCdvp(GCXiNH.fsw("T_xCebHMXmlwuyis~"), 0, GCXiNH.fsw("T\u007fMmGXe>HIVB\nyIS^"), true);
            MULTIPLE_PID = new EnumC0008RjCdvp(GCXiNH.fsw("PDwXbaM[Sxkg"), 1, GCXiNH.fsw("PdWxBAm{,xkg\nZIJS\u0015azv"), true);
            INVALID_COMM_CONTENT = new EnumC0008RjCdvp(GCXiNH.fsw("T_mMgxEAOgonujgibpzg"), 2, GCXiNH.fsw("T\u007fMmGXe>oGON\ngIJS"), true);
            COULD_NOT_CHECK = new EnumC0008RjCdvp(GCXiNH.fsw("^^n@onOQXwakojc"), 3, GCXiNH.fsw("^~N`O\u0011Oqx\baKOJC"), false);
            JSON_EXCEPTION = new EnumC0008RjCdvp(GCXiNH.fsw("WBtBttY]Ixvjeg"), 4, GCXiNH.fsw("WbTb\u000bTy}iXVJEG"), false);
            NOT_CLONED = new EnumC0008RjCdvp(GCXiNH.fsw("S^oSh}NPIl"), 5, GCXiNH.fsw("S~O,h]npiL"), false);
            gkhjaB = gEmmrt();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private EnumC0008RjCdvp(String str, int i, String str2, boolean z) {
            this.dBFhBU = str2;
            this.zrZlgc = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static /* synthetic */ EnumC0008RjCdvp[] gEmmrt() {
            int i;
            EnumC0008RjCdvp[] enumC0008RjCdvpArr = new EnumC0008RjCdvp[6];
            enumC0008RjCdvpArr[0] = INCONSISTENT_PATH;
            enumC0008RjCdvpArr[1] = MULTIPLE_PID;
            EnumC0008RjCdvp enumC0008RjCdvp = INVALID_COMM_CONTENT;
            if (RGH > 1835) {
                enumC0008RjCdvpArr[2] = enumC0008RjCdvp;
                enumC0008RjCdvpArr[3] = COULD_NOT_CHECK;
                enumC0008RjCdvpArr[4] = JSON_EXCEPTION;
                enumC0008RjCdvpArr[5] = NOT_CLONED;
                return enumC0008RjCdvpArr;
            }
            while (true) {
                i = RGH;
                int i2 = i + 13;
                if (i2 == 93) {
                    break;
                }
                if (i2 == 177) {
                    RGH = (i + i) >> 84;
                }
            }
            while (true) {
                RGH = (RGH ^ 2459) + i;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static EnumC0008RjCdvp valueOf(String str) {
            return (EnumC0008RjCdvp) Enum.valueOf(EnumC0008RjCdvp.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static EnumC0008RjCdvp[] values() {
            return (EnumC0008RjCdvp[]) gkhjaB.clone();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        GCXiNH.OHr = 2270;
        QFejgZ = GCXiNH.fsw("ytHoYXqjeGL");
        QpPqiA = GCXiNH.fsw("otHyGE");
        zbkkxj = GCXiNH.fsw("^}TbNU");
        DvGueO = GCXiNH.fsw("BN");
        OpmPAf = GCXiNH.fsw("BNT~BTojm\\KLD");
        UKISMj = GCXiNH.fsw("f3_iXRsw|\\KLD\u000b\u0012\u0005") + EnumC0008RjCdvp.COULD_NOT_CHECK.dBFhBU + GCXiNH.fsw("?l");
        feYVnX = GCXiNH.fsw("f3_iXRsw|\\KLD\u000b\u0012\u0005") + EnumC0008RjCdvp.JSON_EXCEPTION.dBFhBU + GCXiNH.fsw("?l");
    }
}
