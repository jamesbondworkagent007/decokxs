package aeiGEO;

import aeiGEO.GVpNrs;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
class STbtMW extends SSLSocketFactory {
    private static String DlIaRS;
    public static int JLM;
    public static int kbL;
    private SSLSocketFactory RHNPFZ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GVpNrs.OTr = 9103;
        JLM = 2708;
        TMXProfilingConnections.OQs = 6659;
        kbL = 6358;
        TMXProfilingConnections.OHr = 2270;
        GVpNrs.dqk = 9094;
        DlIaRS = GVpNrs.hfdhUn(STbtMW.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public STbtMW() {
        try {
            SSLContext sSLContext = SSLContext.getInstance(TMXProfilingConnections.fsw("I]h"));
            sSLContext.init(null, null, null);
            this.RHNPFZ = sSLContext.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            GVpNrs.fQMcgE.svhCHd(DlIaRS, TMXProfilingConnections.fsw("NhHxN\\!vm[\u0002ME\t|ke"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Socket zqaRxl(Socket socket) {
        if (socket instanceof SSLSocket) {
            try {
                ((SSLSocket) socket).setEnabledProtocols(new String[]{TMXProfilingConnections.fsw("I]hz\u001a\u001f3")});
            } catch (IllegalArgumentException unused) {
                GVpNrs.fQMcgE.DFbvW(DlIaRS, TMXProfilingConnections.fsw("I]hz\u001a\u001f02,|np\\\u0018\u0006\u0015\u0016TFV\u0012__[\u001eNIKJVJCCa"));
            }
        }
        return socket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        int i2;
        SSLSocketFactory sSLSocketFactory = this.RHNPFZ;
        if ((JLM ^ 2708) != 0) {
            while (true) {
                i2 = JLM;
                int i3 = i2 + 13;
                if (i3 != 33) {
                    if (i3 == 116) {
                        JLM = (JLM >> 24) * 105;
                    } else if (i3 == 299) {
                        JLM = (i2 % 103) * 44;
                    } else if (i3 == 368) {
                        break;
                    }
                }
                JLM = (JLM >> 105) ^ 3009;
                JLM = (JLM >> 24) * 105;
            }
            JLM = ((i2 + i2) * 105) ^ MTPushConstants.RemoteWhat.ON_NOTIFICATION_CLICKED;
        }
        return zqaRxl(sSLSocketFactory.createSocket(str, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        int i3;
        SSLSocketFactory sSLSocketFactory = this.RHNPFZ;
        if ((JLM ^ 2708) == 0) {
            return zqaRxl(sSLSocketFactory.createSocket(str, i, inetAddress, i2));
        }
        do {
            i3 = JLM;
        } while (i3 + 13 != 94);
        while (true) {
            JLM = ((JLM + i3) + i3) >> 7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        int i2;
        int i3;
        SSLSocketFactory sSLSocketFactory = this.RHNPFZ;
        if ((JLM ^ 2708) != 0) {
            do {
                i2 = JLM;
                i3 = i2 + 13;
                if (i3 == 84) {
                    while (true) {
                        JLM = (JLM >> 98) % 26;
                    }
                }
            } while (i3 != 268);
            JLM = (i2 ^ 4061) * WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        }
        return zqaRxl(sSLSocketFactory.createSocket(inetAddress, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return zqaRxl(this.RHNPFZ.createSocket(inetAddress, i, inetAddress2, i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
    
        aeiGEO.STbtMW.JLM = (aeiGEO.STbtMW.JLM * 24) % 73;
     */
    @Override // javax.net.ssl.SSLSocketFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        SSLSocketFactory sSLSocketFactory = this.RHNPFZ;
        int i7 = kbL;
        if ((JLM ^ 2708) != 0) {
            while (true) {
                i5 = JLM;
                int i8 = i5 + 117;
                if (i8 == 48) {
                    i6 = ((i5 % 43) ^ 5078) + i5;
                    break;
                }
                if (i8 != 215) {
                    if (i8 == 339) {
                        JLM = (i5 ^ 5102) % 89;
                        break;
                    }
                } else {
                    break;
                }
            }
            i6 = ((JLM + i5) + i5) % 3;
            JLM = i6;
        }
        if (i7 > 6357) {
            return zqaRxl(sSLSocketFactory.createSocket(socket, str, i, z));
        }
        while (true) {
            i2 = kbL;
            int i9 = i2 + 13;
            if (i9 == 80) {
                kbL = ((i2 + i2) + i2) ^ 3876;
                if (JLM > 2707) {
                    break;
                }
            } else {
                if (i9 == 128) {
                    break;
                }
                if (i9 == 273) {
                    while (true) {
                        kbL = kbL + i2 + i2;
                    }
                } else if (i9 == 374) {
                    kbL = ((i2 >> 19) + i2) >> 37;
                    if ((JLM ^ 2708) != 0) {
                        while (true) {
                            i4 = JLM;
                            int i10 = i4 + 26;
                            if (i10 != 46) {
                                if (i10 != 166) {
                                    if (i10 == 332) {
                                        JLM = (i4 % 67) + i4;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        JLM = ((JLM % 119) >> 120) + i4;
                    }
                }
            }
        }
        do {
            int i11 = kbL;
            if ((JLM ^ 2708) != 0) {
                do {
                    i3 = JLM;
                } while (i3 + 104 != 25);
                JLM = (i3 * 21) + i3;
            }
            kbL = ((i11 % 45) + i2) % WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        } while ((JLM ^ 2708) == 0);
        while (true) {
            int i12 = JLM;
            int i13 = i12 + 52;
            if (i13 == 22) {
                JLM = (i12 ^ 2985) >> 76;
            } else {
                if (i13 == 179) {
                    break;
                }
                if (i13 != 253) {
                }
            }
            JLM = (JLM % 30) ^ 1421;
        }
        while (true) {
            JLM = (JLM % 120) * 119;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.RHNPFZ.getDefaultCipherSuites();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.RHNPFZ.getSupportedCipherSuites();
    }
}
