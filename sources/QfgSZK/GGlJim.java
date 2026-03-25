package QfgSZK;

import QfgSZK.QhsCdE;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class GGlJim extends QhsCdE {

    /* JADX INFO: Incorrect field signature: Lint; */
    static String DZEPeQ;
    public static int RcF;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String UeKSYT;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String gDJLgm;
    public static int sbY;
    private int DVasaO;
    private int QpcQij;
    private float dkLwlq;
    private int fWfFDQ;
    private float fkvQFR;
    private float frQicY;
    private float imjJKl;
    private int zgVur;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        RcF = 3064;
        sbY = 7013;
        GCXiNH.OHr = 2270;
        Dfv(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GGlJim(long j) {
        super(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:33:0x006a) to fix multi-entry loop: BACK_EDGE: B:33:0x006a -> B:32:0x0068 */
    /* JADX DEBUG: Duplicate block (B:37:0x007f) to fix multi-entry loop: BACK_EDGE: B:37:0x007f -> B:36:0x007d */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        r0 = (QfgSZK.GGlJim.sbY >> 54) * 30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
    
        r0 = ((QfgSZK.GGlJim.sbY + r2) + r2) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0068, code lost:
    
        r0 = ((QfgSZK.GGlJim.RcF % 106) + r2) >> 29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void Dfv(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (z) {
            Dfv(false);
        }
        gDJLgm = GCXiNH.fsw("qpUhXR`ni");
        if (sbY <= 7012) {
            if ((RcF ^ 3064) != 0) {
                do {
                    i5 = RcF;
                } while (i5 + 39 != 89);
                RcF = ((i5 + i5) * 16) % 93;
            }
            while (true) {
                i = sbY;
                int i6 = i + 26;
                if (i6 == 51) {
                    sbY = i + i + i;
                    break;
                }
                if (i6 != 149) {
                    if (i6 == 199) {
                        sbY = (i ^ 5426) * 99;
                        if (RcF <= 3063) {
                            while (true) {
                                i3 = RcF;
                                int i7 = i3 + 117;
                                if (i7 == 27) {
                                    RcF = ((i3 + i3) % 124) + i3;
                                    break;
                                }
                                if (i7 != 125) {
                                    if (i7 == 288) {
                                        break;
                                    }
                                }
                                i4 = ((RcF % 106) + i3) >> 29;
                            }
                            i4 = (RcF + i3) ^ 1777;
                            while (true) {
                                RcF = i4;
                                i4 = ((RcF % 106) + i3) >> 29;
                            }
                        }
                    } else if (i6 == 219) {
                        break;
                    }
                }
                i2 = sbY + i + i + i;
            }
            while (true) {
                sbY = i2;
                i2 = sbY + i + i + i;
            }
        }
        DZEPeQ = GCXiNH.fsw("m~IxYPhj");
        UeKSYT = GCXiNH.fsw("BNT~BTojm\\KLD");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        if (map == null) {
            return;
        }
        map.put(AhwBna.DEVICE_DISPLAY_WIDTH_IN_PIXEL.DbNXlk(), String.valueOf(this.QpcQij));
        map.put(AhwBna.DEVICE_DISPLAY_HEIGHT_IN_PIXEL.DbNXlk(), String.valueOf(this.fWfFDQ));
        map.put(AhwBna.DEVICE_DISPLAY_NATIVE_BOUND_X.DbNXlk(), String.valueOf(this.frQicY));
        map.put(AhwBna.DEVICE_DISPLAY_NATIVE_BOUND_Y.DbNXlk(), String.valueOf(this.fkvQFR));
        map.put(AhwBna.DEVICE_DISPLAY_XDPI.DbNXlk(), String.valueOf(this.imjJKl));
        map.put(AhwBna.DEVICE_DISPLAY_YDPI.DbNXlk(), String.valueOf(this.dkLwlq));
        map.put(AhwBna.DEVICE_DISPLAY_RESOLUTION.DbNXlk(), Math.max(this.zgVur, this.DVasaO) + "x" + Math.min(this.zgVur, this.DVasaO));
        String str = DZEPeQ;
        if (this.zgVur >= this.DVasaO) {
            str = gDJLgm;
        }
        map.put(UeKSYT, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_DISPLAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        if (qSusPL.aPFruk() == null) {
            return;
        }
        ZxnNGp zxnNGp = new ZxnNGp(qSusPL.aPFruk());
        this.zgVur = zxnNGp.sGvRiA();
        this.DVasaO = zxnNGp.DjzMc();
        this.fWfFDQ = zxnNGp.DbvGUJ();
        this.QpcQij = zxnNGp.DhEJvI();
        this.imjJKl = zxnNGp.sjbWxX();
        this.dkLwlq = zxnNGp.dxTXDv();
        this.frQicY = zxnNGp.dcEsSD();
        this.fkvQFR = zxnNGp.dESsmu();
    }
}
