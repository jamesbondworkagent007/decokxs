package com.okinc.debugbox.LDNetDiagnoService;

import com.ibm.icu.text.DateFormat;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.List;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public class LDNetSocket {
    public static LDNetSocket AEQbTJ;
    public static boolean OLrzqt;
    public boolean[] AhwBna;
    public List<String> EZpvd;
    public InetAddress[] copydefault;
    public StateListAnimator valueOf;
    public int AYXKKw = 6000;
    public final long[] KWHzl = new long[4];
    public boolean djBIcL = true;

    public interface StateListAnimator {
        void AEQbTJ(String str);

        void copydefault(String str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(StateListAnimator stateListAnimator) {
        this.valueOf = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault() {
        if (AEQbTJ != null) {
            AEQbTJ = null;
        }
    }

    public native void startJNITelnet(String str, String str2);

    private LDNetSocket() {
    }

    public static LDNetSocket OLrzqt() {
        if (AEQbTJ == null) {
            AEQbTJ = new LDNetSocket();
        }
        return AEQbTJ;
    }

    public boolean copydefault(String str) {
        if (this.djBIcL && OLrzqt) {
            try {
                startJNITelnet(str, "80");
                return true;
            } catch (UnsatisfiedLinkError e) {
                pUU.AEQbTJ("tag", e);
                pUU.KWHzl("LDNetSocket", "call jni failed, call execUseJava");
                return EZpvd(str);
            }
        }
        return EZpvd(str);
    }

    public final boolean EZpvd(String str) {
        InetAddress[] inetAddressArr = this.copydefault;
        if (inetAddressArr != null && this.EZpvd != null) {
            int length = inetAddressArr.length;
            this.AhwBna = new boolean[length];
            for (int i = 0; i < length; i++) {
                if (i != 0) {
                    this.valueOf.copydefault("\n");
                }
                this.AhwBna[i] = AEQbTJ(this.copydefault[i], this.EZpvd.get(i));
            }
            for (boolean z : this.AhwBna) {
                if (Boolean.valueOf(z).booleanValue()) {
                    this.valueOf.AEQbTJ("\n");
                    return true;
                }
            }
        } else {
            this.valueOf.AEQbTJ("DNS解析失败,主机地址不可达");
        }
        this.valueOf.AEQbTJ("\n");
        return false;
    }

    public final boolean AEQbTJ(InetAddress inetAddress, String str) throws Throwable {
        byte b;
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        z = false;
        z = false;
        z = false;
        if (inetAddress != null && str != null) {
            InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress, 80);
            this.valueOf.copydefault("Connect to host: " + str + "...\n");
            int i = 0;
            while (true) {
                if (i >= 4) {
                    b = 0;
                    break;
                }
                OLrzqt(inetSocketAddress, this.AYXKKw, i);
                long j = this.KWHzl[i];
                if (j == -1) {
                    this.valueOf.copydefault((i + 1) + "'s time=TimeOut,  ");
                    this.AYXKKw = this.AYXKKw + 4000;
                    if (i > 0 && this.KWHzl[i - 1] == -1) {
                        b = -1;
                        break;
                    }
                    i++;
                } else {
                    if (j == -2) {
                        this.valueOf.copydefault((i + 1) + "'s time=IOException");
                        if (i > 0 && this.KWHzl[i - 1] == -2) {
                            b = -2;
                            break;
                        }
                    } else {
                        this.valueOf.copydefault((i + 1) + "'s time=" + this.KWHzl[i] + "ms,  ");
                    }
                    i++;
                }
            }
            if (b != -1 && b != -2) {
                long j2 = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    long j3 = this.KWHzl[i3];
                    if (j3 > 0) {
                        j2 += j3;
                        i2++;
                    }
                }
                if (i2 > 0) {
                    sb.append("average=" + (j2 / ((long) i2)) + DateFormat.MINUTE_SECOND);
                }
                z = true;
            }
        }
        this.valueOf.copydefault(sb.toString());
        return z;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0028 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x0038 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:37:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x0003 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:9:0x001e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[Catch: IOException -> 0x001c, PHI: r1
  0x0034: PHI (r1v5 ??) = (r1v18 ??), (r1v19 ??) binds: [B:19:0x0032, B:24:0x0042] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #7 {IOException -> 0x001c, blocks: (B:5:0x0018, B:20:0x0034), top: B:41:0x0003 }] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.net.Socket] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.net.Socket] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.net.Socket] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0045 -> B:35:0x0048). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(InetSocketAddress inetSocketAddress, int i, int i2) throws Throwable {
        ?? socket;
        ?? r1;
        ?? r12 = 0;
        ?? r13 = 0;
        ?? r14 = 0;
        r12 = 0;
        try {
        } catch (IOException e) {
            pUU.AEQbTJ("tag", e);
            r12 = r12;
        }
        try {
            try {
                socket = new Socket();
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    socket.connect(inetSocketAddress, i);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    long[] jArr = this.KWHzl;
                    jArr[i2] = jCurrentTimeMillis2 - jCurrentTimeMillis;
                    socket.close();
                    r12 = jArr;
                } catch (SocketTimeoutException e2) {
                    e = e2;
                    r13 = socket;
                    this.KWHzl[i2] = -1;
                    pUU.AEQbTJ("tag", e);
                    r12 = r13;
                    r1 = r13;
                    if (r13 != 0) {
                        r1.close();
                        r12 = r1;
                    }
                } catch (IOException e3) {
                    e = e3;
                    r14 = socket;
                    this.KWHzl[i2] = -2;
                    pUU.AEQbTJ("tag", e);
                    r12 = r14;
                    r1 = r14;
                    if (r14 != 0) {
                    }
                } catch (Throwable th) {
                    th = th;
                    if (socket != 0) {
                        try {
                            socket.close();
                        } catch (IOException e4) {
                            pUU.AEQbTJ("tag", e4);
                        }
                    }
                    throw th;
                }
            } catch (SocketTimeoutException e5) {
                e = e5;
            } catch (IOException e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
            socket = r12;
        }
    }

    static {
        try {
            System.loadLibrary("tracepath");
            OLrzqt = true;
        } catch (Exception e) {
            pUU.AEQbTJ("tag", e);
        } catch (UnsatisfiedLinkError e2) {
            pUU.AEQbTJ("tag", e2);
        }
    }
}
