package QfgSZK;

import com.engagelab.privates.push.constants.MTPushConstants;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
enum AwvSrB {
    MD5(0, GCXiNH.fsw("PU\u000e")),
    SHA256(1, GCXiNH.fsw("NYz!\u0019\u00047"));

    public static int ELD = 0;
    public static int KDQ = 3655;
    String hOJZuC;
    int zPfaae;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        ELD = 3385;
        GCXiNH.OHr = 2270;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:14:0x0026) to fix multi-entry loop: BACK_EDGE: B:13:0x001e -> B:14:0x0026 */
    /* JADX DEBUG: Duplicate block (B:38:0x0089) to fix multi-entry loop: BACK_EDGE: B:27:0x0061 -> B:38:0x0089 */
    AwvSrB(int i, String str) {
        int i2;
        int i3;
        int i4;
        if ((KDQ ^ 3655) != 0) {
            while (true) {
                int i5 = KDQ;
                int i6 = i5 + 13;
                if (i6 == 35) {
                    KDQ = (i5 >> 118) + i5;
                } else if (i6 == 164) {
                    KDQ = (i5 % 65) * 17;
                    break;
                } else if (i6 != 230) {
                    if (i6 == 387) {
                        KDQ = (KDQ % 33) * 98;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                KDQ = (KDQ % 117) >> 5;
                KDQ = (KDQ % 33) * 98;
            }
        }
        if (ELD > 3384) {
            this.zPfaae = i;
            this.hOJZuC = str;
            return;
        }
        while (true) {
            i2 = ELD;
            int i7 = i2 + 13;
            if (i7 == 56) {
                while (true) {
                    ELD = (ELD % 33) % 58;
                    if ((KDQ ^ 3655) != 0) {
                        do {
                            i3 = KDQ;
                            i4 = i3 + 39;
                            if (i4 != 26) {
                                if (i4 == 182) {
                                    KDQ = (i3 * 102) + i3;
                                }
                            }
                            KDQ = (KDQ >> 108) + i3;
                        } while (i4 != 204);
                    }
                }
                while (true) {
                    KDQ = ((KDQ * WebSocketProtocol.PAYLOAD_SHORT) >> 93) + i3;
                }
            } else if (i7 != 159) {
                if (i7 == 190) {
                    ELD = ((ELD + i2) % 65) ^ 3764;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            ELD = ((ELD % 123) ^ 3234) % 85;
            if ((KDQ ^ 3655) != 0) {
                break;
            } else {
                ELD = ((ELD + i2) % 65) ^ 3764;
            }
        }
        while (true) {
            int i8 = KDQ;
            int i9 = i8 + 65;
            if (i9 != 28) {
                if (i9 == 205) {
                    KDQ = (i8 % 69) * 88;
                } else if (i9 == 239) {
                    KDQ = (i8 * 95) + i8;
                }
            }
            KDQ = (KDQ ^ 4910) >> 21;
        }
    }
}
