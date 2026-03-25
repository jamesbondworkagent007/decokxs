package QfgSZK;

import com.engagelab.privates.push.constants.MTPushConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class ZaDspl {
    public static final ZaDspl ENFORCING;
    public static final ZaDspl NONE;
    public static final ZaDspl NOT_CHECKED;
    public static final ZaDspl PERMISSIVE;
    public static final ZaDspl UNKNOWN;
    public static int fAV = 2372;
    private static final /* synthetic */ ZaDspl[] gkhjaB;
    private final String dvFPkK;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        GCXiNH.OHr = 2270;
        NOT_CHECKED = new ZaDspl(GCXiNH.fsw("S^oShyD]Gmf"), 0, "");
        NONE = new ZaDspl(GCXiNH.fsw("S^uI"), 1, GCXiNH.fsw("s~Ui"));
        UNKNOWN = new ZaDspl(GCXiNH.fsw("H_pBdfO"), 2, GCXiNH.fsw("h\u007fPbDFo"));
        PERMISSIVE = new ZaDspl(GCXiNH.fsw("MTiAbbRWZm"), 3, GCXiNH.fsw("mtIaBBrwzM"));
        ENFORCING = new ZaDspl(GCXiNH.fsw("X_}CyrHPK"), 4, GCXiNH.fsw("x\u007f]cYRhpk"));
        gkhjaB = gEmmrt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ZaDspl(String str, int i, String str2) {
        this.dvFPkK = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ ZaDspl[] gEmmrt() {
        int i;
        ZaDspl[] zaDsplArr = new ZaDspl[5];
        zaDsplArr[0] = NOT_CHECKED;
        zaDsplArr[1] = NONE;
        if (fAV <= 2371) {
            do {
                int i2 = fAV;
                i = i2 + 13;
                if (i == 8) {
                    fAV = (i2 >> 24) % 125;
                }
            } while (i != 20);
            while (true) {
                fAV ^= 936;
            }
        }
        zaDsplArr[2] = UNKNOWN;
        zaDsplArr[3] = PERMISSIVE;
        zaDsplArr[4] = ENFORCING;
        return zaDsplArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static ZaDspl valueOf(String str) {
        return (ZaDspl) Enum.valueOf(ZaDspl.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static ZaDspl[] values() {
        return (ZaDspl[]) gkhjaB.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String identifier() {
        return this.dvFPkK;
    }
}
