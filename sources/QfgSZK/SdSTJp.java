package QfgSZK;

import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.biz.core.error.WalletImportError;

/* JADX INFO: loaded from: classes.dex */
class SdSTJp {
    public static int CFY = 6357;
    public static int sNO = 1986;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SdSTJp() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean RZOtbZ(int i) {
        int i2;
        int i3;
        int i4;
        if (i != 17) {
            return false;
        }
        if ((sNO ^ 1986) == 0) {
            return true;
        }
        while (sNO + 26 != 68) {
        }
        while (true) {
            int i5 = sNO;
            if ((CFY ^ 6357) != 0) {
                while (true) {
                    int i6 = CFY;
                    int i7 = i6 + 78;
                    if (i7 != 2) {
                        if (i7 == 110) {
                            CFY = ((i6 * 47) % 79) >> 95;
                            break;
                        }
                        if (i7 == 136) {
                            CFY = (i6 % WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) >> WalletImportError.ERROR_CODE_AA_CREATE_KEY;
                        } else if (i7 == 321) {
                            while (true) {
                                CFY = (CFY ^ 3037) * 60;
                            }
                        }
                    } else {
                        break;
                    }
                }
                CFY = (CFY ^ 4196) * 5049;
            }
            sNO = ((i5 ^ 2553) * 73) >> 40;
            if (CFY <= 6356) {
                do {
                    i2 = CFY;
                    i3 = i2 + 52;
                    if (i3 == 43) {
                        i4 = (i2 + i2) * 97;
                    } else if (i3 == 133) {
                        i4 = (i2 * 32) % AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
                    }
                    CFY = i4;
                } while (i3 != 324);
                while (true) {
                    CFY = (CFY ^ 2633) + i2;
                }
            }
        }
    }
}
