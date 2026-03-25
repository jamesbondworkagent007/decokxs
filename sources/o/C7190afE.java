package o;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.crypto.tls.AlertDescription;

/* JADX INFO: renamed from: o.afE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7190afE {
    public static final int AhwBna;
    public static final short[][] AuCTelauCTel;
    public static final byte[][] AubY;
    public static final byte[][] AwvSrB;
    public static final byte[][] AxsJAY;
    public static final StateListAnimator DTwDnp;
    public static final StateListAnimator ORxRYg;
    public static final StateListAnimator OcIXYQ;
    public static final StateListAnimator QKVWgx;
    public static final StateListAnimator QOLQEE;
    public static final StateListAnimator QVAiDq;
    public static final StateListAnimator RJOkX;
    public static final int djBIcL;
    public static final short[] ejfBZ;
    public static final int fARcdN;
    public static final short[] fIwbmz;
    public static final short[] fJNWhG;
    public static final int gEmmrt;
    public static final byte[][] gHZMYf;
    public static final short[] getFieldNames;
    public static final byte[][] getNewProxyInstance;
    public static final short[] hDKMBd;
    public static final int isConnected;
    public static final byte[][] iwGUEr;
    public static final byte[][] sSMYrx;
    public static final byte[][] uzCIH;
    public static final int valueOf;
    public static final int values;
    public static final byte[][] wlaJM;
    public static final byte[][] zLjUOn;
    public static final byte[][] zsXlph;
    public static final StateListAnimator zuBGHE;
    public boolean AxsJAYaxsJAY;
    public int AxsJAYsNCnLh;
    public byte[] DAIeex;
    public int DCJXGO;
    public C7196afK[] DCUTEI;
    public java.lang.String DXXBbs;
    public int DarRvM;
    public int ODWQjV;
    public int OqFWZa;
    public C7196afK[] OuxcSI;
    public int[] QKudOq;
    public C7195afJ QUSxYX;
    public int QbewEr;
    public final C7030acD QfsBiF;
    public byte RcXXUw;
    public byte RlQdEF;
    public byte[] UeEOUB;
    public byte[] aKErDB;
    public C7190afE accept;
    public java.lang.String dNCPSb;
    public byte djSkpj;
    public int dvKsVJ;
    public boolean dxcTrN;
    public Activity fFgQHt;
    public boolean fZBcTu;
    public C7196afK[] ffGIBT;
    public StateListAnimator finit;
    public Application[] flVtFt;
    public int fvQaOB;
    public int gGvvIC;
    public int gasjUx;
    public char[] getPostValueLengthLimit;
    public byte[] giSNqX;
    public byte[] gkJEwt;
    public int hUfVAv;
    public boolean iRxXKY;
    public boolean iZzfmt;
    public int zuWLRA;
    public static final byte OLrzqt = (byte) copydefault((byte) 0);
    public static final byte AYXKKw = (byte) copydefault((byte) 1);
    public static final int KWHzl = copydefault(Ascii.US);
    public static final int[] copydefault = {copydefault((byte) 0), copydefault((byte) 1)};
    public static final int[] EZpvd = {copydefault(Ascii.VT), copydefault(Ascii.SO)};
    public static final int[] AEQbTJ = {copydefault(Ascii.FF), copydefault(Ascii.SI)};
    public static final int fetchVPNInfo = ((((((copydefault((byte) 0) | copydefault((byte) 2)) | copydefault(Ascii.ETB)) | copydefault(Ascii.CAN)) | copydefault((byte) 5)) | copydefault(Ascii.VT)) | copydefault(Ascii.FF)) | copydefault(Ascii.DC4);
    public static final int DbNXlk = (((copydefault((byte) 1) | copydefault(Ascii.CR)) | copydefault(Ascii.SO)) | copydefault(Ascii.SI)) | copydefault(Ascii.NAK);
    public static final int AkhnZx = copydefault((byte) 1) | copydefault(Ascii.CR);
    public static final int AuCTel = (((copydefault((byte) 0) | copydefault((byte) 1)) | copydefault(Ascii.CR)) | copydefault((byte) 2)) | copydefault((byte) 5);

    /* JADX INFO: renamed from: o.afE$ActionBar */
    public static class ActionBar {
        public int EZpvd;
        public boolean KWHzl;
        public PendingIntent[] AEQbTJ = new PendingIntent[20];
        public TaskDescription[] OLrzqt = new TaskDescription[127];
    }

    /* JADX INFO: renamed from: o.afE$Activity */
    public static class Activity {
        public int EZpvd;
        public Fragment[] KWHzl = new Fragment[0];
        public int OLrzqt;
    }

    /* JADX INFO: renamed from: o.afE$Application */
    public static class Application {
        public int EZpvd;
        public short KWHzl;
        public int OLrzqt;
        public short copydefault;
    }

    /* JADX INFO: renamed from: o.afE$Fragment */
    public static class Fragment {
        public int OLrzqt;
        public int copydefault;
    }

    /* JADX INFO: renamed from: o.afE$PendingIntent */
    public static class PendingIntent {
        public byte AEQbTJ;
        public int EZpvd;
        public int KWHzl;
        public int OLrzqt;
        public short copydefault;
    }

    /* JADX INFO: renamed from: o.afE$TaskDescription */
    public static class TaskDescription {
        public int AEQbTJ;
        public short AYXKKw;
        public short AhwBna;
        public byte EZpvd;
        public byte KWHzl;
        public byte OLrzqt;
        public byte copydefault;
    }

    public static short AEQbTJ(short s) {
        return (short) (s & 31);
    }

    public static boolean AYXKKw(byte b) {
        return (b & 126) == 126;
    }

    public static short AhwBna(byte b) {
        return (short) (b >> 4);
    }

    public static final byte KWHzl(byte b) {
        return b == 0 ? (byte) 0 : (byte) 1;
    }

    public static boolean OLrzqt(int i) {
        return (i & (-4)) == 8204 || (i >= 8234 && i <= 8238) || (i >= 8294 && i <= 8297);
    }

    public static int copydefault(byte b) {
        return 1 << b;
    }

    public static short copydefault(short s) {
        return (short) (s >> 5);
    }

    public static final byte djBIcL(byte b) {
        return (byte) (b & 127);
    }

    public static byte gEmmrt(byte b) {
        return (byte) (b & 1);
    }

    public static short valueOf(byte b) {
        return (short) (b & Ascii.SI);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(boolean z) {
        this.dxcTrN = z;
        this.OqFWZa = z ? 4 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AkhnZx() {
        return this.dxcTrN;
    }

    public int EZpvd(int i) {
        return i >= 0 ? i : -i;
    }

    public int OLrzqt(int i, int i2) {
        return i < i2 ? i : i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void fetchVPNInfo() {
        this.DXXBbs = null;
        this.dNCPSb = null;
        this.accept = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void fetchVPNInfo(int i) {
        if (i < 0 || i >= 7) {
            return;
        }
        this.OqFWZa = i;
        this.dxcTrN = i == 4;
    }

    static {
        int iCopydefault = copydefault(Ascii.VT) | copydefault(Ascii.FF) | copydefault(Ascii.SO) | copydefault(Ascii.SI) | copydefault((byte) 16);
        valueOf = iCopydefault;
        int iCopydefault2 = iCopydefault | copydefault(Ascii.DC2);
        djBIcL = iCopydefault2;
        int iCopydefault3 = copydefault(Ascii.DC4) | copydefault(Ascii.NAK) | copydefault((byte) 19) | copydefault(Ascii.SYN);
        isConnected = iCopydefault3;
        int iCopydefault4 = copydefault((byte) 7) | copydefault((byte) 8);
        gEmmrt = iCopydefault4;
        int iCopydefault5 = iCopydefault2 | iCopydefault4 | copydefault((byte) 9) | iCopydefault3;
        fARcdN = iCopydefault5;
        int iCopydefault6 = iCopydefault5 | copydefault((byte) 10) | copydefault((byte) 6) | copydefault((byte) 3) | copydefault((byte) 4);
        values = iCopydefault6;
        AhwBna = iCopydefault6 | copydefault((byte) 17);
        fJNWhG = new short[]{0, 1, 2, 7, 8, 3, 9, 6, 5, 4, 4, 10, 10, 12, 10, 10, 10, 11, 10, 4, 4, 4, 4, 13, 14};
        AuCTelauCTel = new short[][]{new short[]{1, 2, 4, 5, 7, 15, 17, 7, 9, 7, 0, 7, 3, 18, 21, 4}, new short[]{1, 34, 36, 37, 39, 47, 49, 39, 41, 39, 1, 1, 35, 50, 53, 0}, new short[]{33, 2, 36, 37, 39, 47, 49, 39, 41, 39, 2, 2, 35, 50, 53, 1}, new short[]{33, 34, 38, 38, 40, 48, 49, 40, 40, 40, 3, 3, 3, 50, 53, 1}, new short[]{33, 34, 4, 37, 39, 47, 49, 74, 11, 74, 4, 4, 35, 18, 21, 2}, new short[]{33, 34, 36, 5, 39, 47, 49, 39, 41, 76, 5, 5, 35, 50, 53, 3}, new short[]{33, 34, 6, 6, 40, 48, 49, 40, 40, 77, 6, 6, 35, 18, 21, 3}, new short[]{33, 34, 36, 37, 7, 47, 49, 7, 78, 7, 7, 7, 35, 50, 53, 4}, new short[]{33, 34, 38, 38, 8, 48, 49, 8, 8, 8, 8, 8, 35, 50, 53, 4}, new short[]{33, 34, 4, 37, 7, 47, 49, 7, 9, 7, 9, 9, 35, 18, 21, 4}, new short[]{97, 98, 4, 101, 135, AlertDescription.certificate_unobtainable, AlertDescription.bad_certificate_status_response, 135, 142, 135, 10, 135, 99, 18, 21, 2}, new short[]{33, 34, 4, 37, 39, 47, 49, 39, 11, 39, 11, 11, 35, 18, 21, 2}, new short[]{97, 98, 100, 5, 135, AlertDescription.certificate_unobtainable, AlertDescription.bad_certificate_status_response, 135, 142, 135, 12, 135, 99, AlertDescription.bad_certificate_hash_value, 117, 3}, new short[]{97, 98, 6, 6, 136, AlertDescription.unrecognized_name, AlertDescription.bad_certificate_status_response, 136, 136, 136, 13, 136, 99, 18, 21, 3}, new short[]{33, 34, 132, 37, 7, 47, 49, 7, 14, 7, 14, 14, 35, 146, 149, 4}, new short[]{33, 34, 36, 37, 39, 15, 49, 39, 41, 39, 15, 39, 35, 50, 53, 5}, new short[]{33, 34, 38, 38, 40, 16, 49, 40, 40, 40, 16, 40, 35, 50, 53, 5}, new short[]{33, 34, 36, 37, 39, 47, 17, 39, 41, 39, 17, 39, 35, 50, 53, 6}, new short[]{33, 34, 18, 37, 39, 47, 49, 83, 20, 83, 18, 18, 35, 18, 21, 0}, new short[]{97, 98, 18, 101, 135, AlertDescription.certificate_unobtainable, AlertDescription.bad_certificate_status_response, 135, 142, 135, 19, 135, 99, 18, 21, 0}, new short[]{33, 34, 18, 37, 39, 47, 49, 39, 20, 39, 20, 20, 35, 18, 21, 0}, new short[]{33, 34, 21, 37, 39, 47, 49, 86, 23, 86, 21, 21, 35, 18, 21, 3}, new short[]{97, 98, 21, 101, 135, AlertDescription.certificate_unobtainable, AlertDescription.bad_certificate_status_response, 135, 142, 135, 22, 135, 99, 18, 21, 3}, new short[]{33, 34, 21, 37, 39, 47, 49, 39, 23, 39, 23, 23, 35, 18, 21, 3}};
        byte[][] bArr = {new byte[]{0, 1, 0, 2, 0, 0, 0, 0}, new byte[]{0, 1, 3, 3, Ascii.DC4, Ascii.DC4, 0, 1}, new byte[]{0, 1, 0, 2, Ascii.NAK, Ascii.NAK, 0, 2}, new byte[]{0, 1, 3, 3, Ascii.DC4, Ascii.DC4, 0, 2}, new byte[]{0, 33, 51, 51, 4, 4, 0, 0}, new byte[]{0, 33, 0, 50, 5, 5, 0, 0}};
        getNewProxyInstance = bArr;
        byte[][] bArr2 = {new byte[]{1, 0, 2, 2, 0, 0, 0, 0}, new byte[]{1, 0, 1, 3, Ascii.DC4, Ascii.DC4, 0, 1}, new byte[]{1, 0, 2, 2, 0, 0, 0, 1}, new byte[]{1, 0, 1, 3, 5, 5, 0, 1}, new byte[]{33, 0, 33, 3, 4, 4, 0, 0}, new byte[]{1, 0, 1, 3, 5, 5, 0, 0}};
        zLjUOn = bArr2;
        short[] sArr = {0, 1, 2, 3, 4};
        fIwbmz = sArr;
        zuBGHE = new StateListAnimator(bArr, bArr2, sArr, sArr);
        byte[][] bArr3 = {new byte[]{0, 2, 17, 17, 0, 0, 0, 0}, new byte[]{0, 66, 1, 1, 0, 0, 0, 0}, new byte[]{0, 2, 4, 4, 19, 19, 0, 1}, new byte[]{0, 34, 52, 52, 3, 3, 0, 0}, new byte[]{0, 2, 4, 4, 19, 19, 0, 2}};
        wlaJM = bArr3;
        QVAiDq = new StateListAnimator(bArr3, bArr2, sArr, sArr);
        byte[][] bArr4 = {new byte[]{0, 3, 17, 17, 0, 0, 0, 0}, new byte[]{32, 3, 1, 1, 2, 32, 32, 2}, new byte[]{32, 3, 1, 1, 2, 32, 32, 1}, new byte[]{0, 3, 5, 5, Ascii.DC4, 0, 0, 1}, new byte[]{32, 3, 5, 5, 4, 32, 32, 1}, new byte[]{0, 3, 5, 5, Ascii.DC4, 0, 0, 2}};
        uzCIH = bArr4;
        byte[][] bArr5 = {new byte[]{2, 0, 1, 1, 0, 0, 0, 0}, new byte[]{2, 0, 1, 1, 0, 0, 0, 1}, new byte[]{2, 0, Ascii.DC4, Ascii.DC4, 19, 0, 0, 1}, new byte[]{34, 0, 4, 4, 3, 0, 0, 0}, new byte[]{34, 0, 4, 4, 3, 0, 0, 1}};
        AxsJAY = bArr5;
        QKVWgx = new StateListAnimator(bArr4, bArr5, sArr, sArr);
        byte[][] bArr6 = {new byte[]{0, 1, 0, 0, 0, 0, 0, 0}, new byte[]{0, 1, 0, 0, Ascii.DC4, Ascii.DC4, 0, 1}, new byte[]{0, 1, 0, 0, Ascii.NAK, Ascii.NAK, 0, 2}, new byte[]{0, 1, 0, 0, Ascii.DC4, Ascii.DC4, 0, 2}, new byte[]{32, 1, 32, 32, 4, 4, 32, 1}, new byte[]{32, 1, 32, 32, 5, 5, 32, 1}};
        zsXlph = bArr6;
        byte[][] bArr7 = {new byte[]{1, 0, 1, 1, 0, 0, 0, 0}, new byte[]{1, 0, 1, 1, Ascii.DC4, Ascii.DC4, 0, 1}, new byte[]{1, 0, 1, 1, 0, 0, 0, 1}, new byte[]{1, 0, 1, 1, 5, 5, 0, 1}, new byte[]{33, 0, 33, 33, 4, 4, 0, 0}, new byte[]{1, 0, 1, 1, 5, 5, 0, 0}};
        gHZMYf = bArr7;
        RJOkX = new StateListAnimator(bArr6, bArr7, sArr, sArr);
        byte[][] bArr8 = {new byte[]{1, 0, 2, 2, 0, 0, 0, 0}, new byte[]{1, 0, 1, 2, 19, 19, 0, 1}, new byte[]{1, 0, 2, 2, 0, 0, 0, 1}, new byte[]{33, 48, 6, 4, 3, 3, 48, 0}, new byte[]{33, 48, 6, 4, 5, 5, 48, 3}, new byte[]{33, 48, 6, 4, 5, 5, 48, 2}, new byte[]{33, 48, 6, 4, 3, 3, 48, 1}};
        sSMYrx = bArr8;
        short[] sArr2 = {0, 1, 13, 14};
        ejfBZ = sArr2;
        OcIXYQ = new StateListAnimator(bArr, bArr8, sArr, sArr2);
        byte[][] bArr9 = {new byte[]{0, 99, 0, 1, 0, 0, 0, 0}, new byte[]{0, 99, 0, 1, Ascii.DC2, 48, 0, 4}, new byte[]{32, 99, 32, 1, 2, 48, 32, 3}, new byte[]{0, 99, 85, 86, Ascii.DC4, 48, 0, 3}, new byte[]{48, 67, 85, 86, 4, 48, 48, 3}, new byte[]{48, 67, 5, 86, Ascii.DC4, 48, 48, 4}, new byte[]{48, 67, 85, 6, Ascii.DC4, 48, 48, 4}};
        AubY = bArr9;
        byte[][] bArr10 = {new byte[]{19, 0, 1, 1, 0, 0, 0, 0}, new byte[]{35, 0, 1, 1, 2, SignedBytes.MAX_POWER_OF_TWO, 0, 1}, new byte[]{35, 0, 1, 1, 2, SignedBytes.MAX_POWER_OF_TWO, 0, 0}, new byte[]{3, 0, 3, 54, Ascii.DC4, SignedBytes.MAX_POWER_OF_TWO, 0, 1}, new byte[]{83, SignedBytes.MAX_POWER_OF_TWO, 5, 54, 4, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, 0}, new byte[]{83, SignedBytes.MAX_POWER_OF_TWO, 5, 54, 4, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, 1}, new byte[]{83, SignedBytes.MAX_POWER_OF_TWO, 6, 6, 4, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, 3}};
        AwvSrB = bArr10;
        short[] sArr3 = {0, 1, 2, 5, 6, 7, 8};
        getFieldNames = sArr3;
        short[] sArr4 = {0, 1, 9, 10, 11, 12};
        hDKMBd = sArr4;
        QOLQEE = new StateListAnimator(bArr9, bArr10, sArr3, sArr4);
        DTwDnp = new StateListAnimator(bArr3, bArr8, sArr, sArr2);
        byte[][] bArr11 = {new byte[]{0, 98, 1, 1, 0, 0, 0, 0}, new byte[]{0, 98, 1, 1, 0, 48, 0, 4}, new byte[]{0, 98, 84, 84, 19, 48, 0, 3}, new byte[]{48, 66, 84, 84, 3, 48, 48, 3}, new byte[]{48, 66, 4, 4, 19, 48, 48, 4}};
        iwGUEr = bArr11;
        ORxRYg = new StateListAnimator(bArr11, bArr10, sArr3, sArr4);
    }

    public boolean KWHzl(int i, int i2) {
        return (i & copydefault(this.UeEOUB[i2])) != 0;
    }

    public static final int AEQbTJ(byte b) {
        return copydefault[b & 1];
    }

    public static final int EZpvd(byte b) {
        return EZpvd[b & 1];
    }

    public static final int OLrzqt(byte b) {
        return AEQbTJ[b & 1];
    }

    public void isConnected() {
        C7190afE c7190afE = this.accept;
        if (this == c7190afE) {
            return;
        }
        if (c7190afE == null || c7190afE != c7190afE.accept) {
            throw new java.lang.IllegalStateException();
        }
    }

    public void copydefault(int i, int i2, int i3) {
        if (i < i2 || i >= i3) {
            throw new java.lang.IllegalArgumentException("Value " + i + " is out of range " + i2 + " to " + i3);
        }
    }

    public C7190afE() {
        this(0, 0);
    }

    public C7190afE(int i, int i2) {
        this.aKErDB = new byte[1];
        this.gkJEwt = new byte[1];
        this.QKudOq = new int[10];
        this.DAIeex = new byte[10];
        this.DCUTEI = new C7196afK[0];
        this.OuxcSI = new C7196afK[]{new C7196afK()};
        this.QUSxYX = null;
        this.fFgQHt = new Activity();
        if (i < 0 || i2 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        this.QfsBiF = C7030acD.KWHzl;
        if (i > 0) {
            gEmmrt(i);
            AYXKKw(i);
        } else {
            this.AxsJAYaxsJAY = true;
        }
        if (i2 <= 0) {
            this.iZzfmt = true;
        } else if (i2 > 1) {
            AhwBna(i2);
        }
    }

    public final java.lang.Object KWHzl(java.lang.String str, java.lang.Object obj, java.lang.Class<?> cls, boolean z, int i) {
        int length = java.lang.reflect.Array.getLength(obj);
        if (i == length) {
            return obj;
        }
        if (z) {
            try {
                return java.lang.reflect.Array.newInstance(cls, i);
            } catch (java.lang.Exception unused) {
                throw new java.lang.OutOfMemoryError("Failed to allocate memory for " + str);
            }
        }
        if (i <= length) {
            return obj;
        }
        throw new java.lang.OutOfMemoryError("Failed to allocate memory for " + str);
    }

    public final void copydefault(boolean z, int i) {
        this.aKErDB = (byte[]) KWHzl("DirProps", this.aKErDB, java.lang.Byte.TYPE, z, i);
    }

    public void KWHzl(int i) {
        copydefault(this.AxsJAYaxsJAY, i);
    }

    public final void OLrzqt(boolean z, int i) {
        this.gkJEwt = (byte[]) KWHzl("Levels", this.gkJEwt, java.lang.Byte.TYPE, z, i);
    }

    public void djBIcL(int i) {
        OLrzqt(this.AxsJAYaxsJAY, i);
    }

    public final void KWHzl(boolean z, int i) {
        this.DCUTEI = (C7196afK[]) KWHzl("Runs", this.DCUTEI, C7196afK.class, z, i);
    }

    public void valueOf(int i) {
        KWHzl(this.iZzfmt, i);
    }

    public final void gEmmrt(int i) {
        copydefault(true, i);
    }

    public final void AYXKKw(int i) {
        OLrzqt(true, i);
    }

    public final void AhwBna(int i) {
        KWHzl(true, i);
    }

    public final byte djBIcL() {
        int iCharCount = 0;
        while (true) {
            byte b = 10;
            while (iCharCount < this.DXXBbs.length()) {
                int iCodePointAt = this.DXXBbs.codePointAt(iCharCount);
                iCharCount += java.lang.Character.charCount(iCodePointAt);
                byte bCopydefault = (byte) copydefault(iCodePointAt);
                if (b == 10) {
                    if (bCopydefault == 0 || bCopydefault == 1 || bCopydefault == 13) {
                        b = bCopydefault;
                    }
                } else if (bCopydefault == 7) {
                    break;
                }
            }
            return b;
        }
    }

    public final void AEQbTJ() {
        int i = this.AxsJAYsNCnLh;
        byte[] bArr = this.DAIeex;
        if (i <= bArr.length) {
            return;
        }
        int length = bArr.length;
        int[] iArr = this.QKudOq;
        int i2 = i * 2;
        try {
            int[] iArr2 = new int[i2];
            this.QKudOq = iArr2;
            this.DAIeex = new byte[i2];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, length);
            java.lang.System.arraycopy(bArr, 0, this.DAIeex, 0, length);
        } catch (java.lang.Exception unused) {
            throw new java.lang.OutOfMemoryError("Failed to allocate memory for paras");
        }
    }

    public final void AYXKKw() {
        byte b;
        byte b2;
        byte b3;
        byte b4;
        char c;
        boolean z;
        byte b5;
        int i;
        byte bDjBIcL;
        int i2;
        int i3 = 0;
        this.dvKsVJ = 0;
        boolean zAYXKKw = AYXKKw(this.RlQdEF);
        boolean z2 = zAYXKKw && ((i2 = this.OqFWZa) == 5 || i2 == 6);
        this.gasjUx = -1;
        int i4 = this.DarRvM;
        boolean z3 = (i4 & 2) != 0;
        int[] iArr = new int[WebSocketProtocol.PAYLOAD_SHORT];
        byte[] bArr = new byte[WebSocketProtocol.PAYLOAD_SHORT];
        if ((i4 & 4) != 0) {
            this.fvQaOB = 0;
        }
        byte b6 = this.RlQdEF;
        byte b7 = (byte) (b6 & 1);
        if (zAYXKKw) {
            this.DAIeex[0] = b7;
            if (this.DXXBbs == null || (bDjBIcL = djBIcL()) == 10) {
                b = 1;
            } else {
                if (bDjBIcL == 0) {
                    this.DAIeex[0] = 0;
                } else {
                    this.DAIeex[0] = 1;
                }
                b = 0;
            }
            b2 = b7;
        } else {
            this.DAIeex[0] = b6;
            b = 0;
            b2 = 10;
        }
        int i5 = 0;
        int i6 = 0;
        int i7 = -1;
        while (true) {
            int i8 = this.hUfVAv;
            if (i5 >= i8) {
                break;
            }
            int iKWHzl = C7242agD.KWHzl(this.getPostValueLengthLimit, i3, i8, i5);
            int iCopydefault = C7242agD.copydefault(iKWHzl) + i5;
            int i9 = iCopydefault - 1;
            byte bCopydefault = (byte) copydefault(iKWHzl);
            byte b8 = b7;
            int iCopydefault2 = this.dvKsVJ | copydefault(bCopydefault);
            this.dvKsVJ = iCopydefault2;
            boolean z4 = zAYXKKw;
            this.UeEOUB[i9] = bCopydefault;
            if (i9 > i5) {
                this.dvKsVJ = iCopydefault2 | copydefault(Ascii.DC2);
                int i10 = i9;
                b4 = b2;
                do {
                    i10--;
                    this.UeEOUB[i10] = Ascii.DC2;
                } while (i10 > i5);
            } else {
                b4 = b2;
            }
            if (z3 && OLrzqt(iKWHzl)) {
                i6++;
            }
            if (bCopydefault == 0) {
                if (b == 1) {
                    this.DAIeex[this.AxsJAYsNCnLh - 1] = 0;
                    b = 0;
                } else if (b == 2) {
                    if (i7 <= 125) {
                        this.dvKsVJ |= copydefault(Ascii.DC4);
                    }
                    b = 3;
                }
                i5 = iCopydefault;
                b7 = b8;
                zAYXKKw = z4;
                i3 = 0;
                b2 = 0;
            } else {
                byte b9 = 1;
                if (bCopydefault == 1) {
                    c = '\n';
                } else if (bCopydefault == 13) {
                    c = '\n';
                    b9 = 1;
                } else {
                    if (bCopydefault < 19 || bCopydefault > 21) {
                        if (bCopydefault == 22) {
                            if (b == 2) {
                                i = 125;
                                if (i7 <= 125) {
                                    this.dvKsVJ |= copydefault(Ascii.DC4);
                                }
                            } else {
                                i = 125;
                            }
                            if (i7 >= 0) {
                                if (i7 <= i) {
                                    b = bArr[i7];
                                }
                                i7--;
                            }
                        } else {
                            if (bCopydefault == 7) {
                                int i11 = this.hUfVAv;
                                if (iCopydefault >= i11 || iKWHzl != 13) {
                                    c = '\n';
                                } else {
                                    c = '\n';
                                    if (this.getPostValueLengthLimit[iCopydefault] == '\n') {
                                        b2 = b4;
                                    }
                                }
                                int[] iArr2 = this.QKudOq;
                                int i12 = this.AxsJAYsNCnLh;
                                int i13 = i12 - 1;
                                iArr2[i13] = iCopydefault;
                                b2 = b4;
                                if (z2 && b2 == 1) {
                                    this.DAIeex[i13] = 1;
                                }
                                if ((this.DarRvM & 4) != 0) {
                                    this.fvQaOB = iCopydefault;
                                    this.QbewEr = i6;
                                }
                                if (iCopydefault < i11) {
                                    this.AxsJAYsNCnLh = i12 + 1;
                                    AEQbTJ();
                                    if (z4) {
                                        z = true;
                                        this.DAIeex[this.AxsJAYsNCnLh - 1] = b8;
                                        b5 = 1;
                                        b2 = b8;
                                    } else {
                                        z = true;
                                        this.DAIeex[this.AxsJAYsNCnLh - 1] = this.RlQdEF;
                                        b5 = 0;
                                    }
                                    b = b5;
                                    i7 = -1;
                                }
                                b7 = b8;
                                zAYXKKw = z4;
                                i3 = 0;
                                i5 = iCopydefault;
                            }
                            z = true;
                            b7 = b8;
                            zAYXKKw = z4;
                            i3 = 0;
                            i5 = iCopydefault;
                        }
                        b2 = b4;
                        c = '\n';
                        z = true;
                        b7 = b8;
                        zAYXKKw = z4;
                        i3 = 0;
                        i5 = iCopydefault;
                    } else {
                        i7++;
                        if (i7 <= 125) {
                            iArr[i7] = i9;
                            bArr[i7] = b;
                        }
                        if (bCopydefault == 19) {
                            this.UeEOUB[i9] = Ascii.DC4;
                            i5 = iCopydefault;
                            b7 = b8;
                            zAYXKKw = z4;
                            b2 = b4;
                            i3 = 0;
                            b = 2;
                        } else {
                            b = 3;
                        }
                    }
                    i5 = iCopydefault;
                    b7 = b8;
                    zAYXKKw = z4;
                    b2 = b4;
                    i3 = 0;
                }
                if (b == b9) {
                    this.DAIeex[this.AxsJAYsNCnLh - b9] = b9;
                    b = 0;
                } else if (b == 2) {
                    if (i7 <= 125) {
                        this.UeEOUB[iArr[i7]] = Ascii.NAK;
                        this.dvKsVJ |= copydefault(Ascii.NAK);
                    }
                    b = 3;
                }
                if (bCopydefault == 13) {
                    this.gasjUx = i9;
                }
                i5 = iCopydefault;
                b7 = b8;
                zAYXKKw = z4;
                i3 = 0;
                b2 = 1;
            }
        }
        boolean z5 = zAYXKKw;
        if (i7 > 125) {
            i7 = 125;
            b = 2;
        }
        while (true) {
            if (i7 < 0) {
                break;
            }
            if (b == 2) {
                this.dvKsVJ |= copydefault(Ascii.DC4);
                break;
            } else {
                b = bArr[i7];
                i7--;
            }
        }
        if ((this.DarRvM & 4) == 0) {
            b3 = 1;
            this.QKudOq[this.AxsJAYsNCnLh - 1] = this.hUfVAv;
            this.QbewEr = i6;
        } else if (this.fvQaOB < this.hUfVAv) {
            b3 = 1;
            this.AxsJAYsNCnLh--;
        } else {
            b3 = 1;
        }
        if (z2 && b2 == b3) {
            this.DAIeex[this.AxsJAYsNCnLh - b3] = b3;
        }
        if (z5) {
            this.RlQdEF = this.DAIeex[0];
        }
        for (int i14 = 0; i14 < this.AxsJAYsNCnLh; i14++) {
            this.dvKsVJ |= AEQbTJ(this.DAIeex[i14]);
        }
        if (!this.iRxXKY || (this.dvKsVJ & copydefault((byte) 7)) == 0) {
            return;
        }
        this.dvKsVJ |= copydefault((byte) 0);
    }

    public byte AEQbTJ(int i) {
        int i2;
        if (this.djSkpj == 0 || i < this.QKudOq[0]) {
            return this.RlQdEF;
        }
        int i3 = 1;
        while (true) {
            i2 = this.AxsJAYsNCnLh;
            if (i3 >= i2 || i < this.QKudOq[i3]) {
                break;
            }
            i3++;
        }
        if (i3 >= i2) {
            i3 = i2 - 1;
        }
        return this.DAIeex[i3];
    }

    public final void KWHzl(ActionBar actionBar) {
        actionBar.EZpvd = 0;
        actionBar.OLrzqt[0] = new TaskDescription();
        TaskDescription taskDescription = actionBar.OLrzqt[0];
        taskDescription.AYXKKw = (short) 0;
        taskDescription.AhwBna = (short) 0;
        taskDescription.OLrzqt = AEQbTJ(0);
        TaskDescription taskDescription2 = actionBar.OLrzqt[0];
        byte bAEQbTJ = (byte) (AEQbTJ(0) & 1);
        taskDescription2.EZpvd = bAEQbTJ;
        taskDescription2.copydefault = bAEQbTJ;
        taskDescription2.KWHzl = bAEQbTJ;
        actionBar.OLrzqt[0].AEQbTJ = 0;
        actionBar.AEQbTJ = new PendingIntent[20];
        int i = this.OqFWZa;
        actionBar.KWHzl = i == 1 || i == 6;
    }

    public final void EZpvd(ActionBar actionBar, byte b) {
        actionBar.EZpvd = 0;
        TaskDescription taskDescription = actionBar.OLrzqt[0];
        taskDescription.AhwBna = (short) 0;
        taskDescription.OLrzqt = b;
        byte b2 = (byte) (b & 1);
        taskDescription.EZpvd = b2;
        taskDescription.copydefault = b2;
        taskDescription.KWHzl = b2;
        taskDescription.AEQbTJ = 0;
    }

    public final void KWHzl(ActionBar actionBar, int i, byte b, byte b2) {
        TaskDescription taskDescription = actionBar.OLrzqt[actionBar.EZpvd];
        if ((copydefault(this.UeEOUB[i]) & isConnected) != 0) {
            return;
        }
        if (djBIcL(b2) > djBIcL(b)) {
            b = b2;
        }
        taskDescription.AhwBna = taskDescription.AYXKKw;
        taskDescription.OLrzqt = b2;
        byte b3 = (byte) (b & 1);
        taskDescription.EZpvd = b3;
        taskDescription.copydefault = b3;
        taskDescription.KWHzl = b3;
        taskDescription.AEQbTJ = i;
    }

    public final void OLrzqt(ActionBar actionBar, byte b) {
        TaskDescription[] taskDescriptionArr = actionBar.OLrzqt;
        int i = actionBar.EZpvd;
        TaskDescription taskDescription = taskDescriptionArr[i];
        taskDescription.copydefault = (byte) 10;
        short s = taskDescription.AhwBna;
        int i2 = i + 1;
        actionBar.EZpvd = i2;
        TaskDescription taskDescription2 = taskDescriptionArr[i2];
        if (taskDescription2 == null) {
            taskDescription2 = new TaskDescription();
            taskDescriptionArr[i2] = taskDescription2;
        }
        taskDescription2.AhwBna = s;
        taskDescription2.AYXKKw = s;
        taskDescription2.OLrzqt = b;
        byte b2 = (byte) (b & 1);
        taskDescription2.EZpvd = b2;
        taskDescription2.copydefault = b2;
        taskDescription2.KWHzl = b2;
        taskDescription2.AEQbTJ = 0;
    }

    public final void copydefault(ActionBar actionBar) {
        int i = actionBar.EZpvd - 1;
        actionBar.EZpvd = i;
        actionBar.OLrzqt[i].copydefault = (byte) 10;
    }

    public final void KWHzl(ActionBar actionBar, char c, int i) {
        TaskDescription taskDescription = actionBar.OLrzqt[actionBar.EZpvd];
        short s = taskDescription.AhwBna;
        PendingIntent[] pendingIntentArr = actionBar.AEQbTJ;
        if (s >= pendingIntentArr.length) {
            try {
                int length = pendingIntentArr.length;
                PendingIntent[] pendingIntentArr2 = new PendingIntent[length * 2];
                actionBar.AEQbTJ = pendingIntentArr2;
                java.lang.System.arraycopy(pendingIntentArr, 0, pendingIntentArr2, 0, length);
            } catch (java.lang.Exception unused) {
                throw new java.lang.OutOfMemoryError("Failed to allocate memory for openings");
            }
        }
        PendingIntent[] pendingIntentArr3 = actionBar.AEQbTJ;
        short s2 = taskDescription.AhwBna;
        PendingIntent pendingIntent = pendingIntentArr3[s2];
        if (pendingIntent == null) {
            pendingIntent = new PendingIntent();
            pendingIntentArr3[s2] = pendingIntent;
        }
        pendingIntent.OLrzqt = i;
        pendingIntent.EZpvd = c;
        pendingIntent.AEQbTJ = taskDescription.EZpvd;
        pendingIntent.KWHzl = taskDescription.AEQbTJ;
        pendingIntent.copydefault = (short) 0;
        taskDescription.AhwBna = (short) (taskDescription.AhwBna + 1);
    }

    public final void copydefault(ActionBar actionBar, int i, int i2, byte b) {
        TaskDescription taskDescription = actionBar.OLrzqt[actionBar.EZpvd];
        while (true) {
            i++;
            if (i >= taskDescription.AhwBna) {
                return;
            }
            PendingIntent pendingIntent = actionBar.AEQbTJ[i];
            int i3 = pendingIntent.EZpvd;
            if (i3 < 0) {
                if (i2 < pendingIntent.KWHzl) {
                    return;
                }
                int i4 = pendingIntent.OLrzqt;
                if (i2 >= i4) {
                    continue;
                } else {
                    if (b == pendingIntent.AEQbTJ) {
                        return;
                    }
                    byte[] bArr = this.UeEOUB;
                    bArr[i4] = b;
                    int i5 = -i3;
                    bArr[i5] = b;
                    pendingIntent.EZpvd = 0;
                    copydefault(actionBar, i, i4, b);
                    copydefault(actionBar, i, i5, b);
                }
            }
        }
    }

    public final byte KWHzl(ActionBar actionBar, int i, int i2) {
        boolean z;
        TaskDescription taskDescription = actionBar.OLrzqt[actionBar.EZpvd];
        PendingIntent pendingIntent = actionBar.AEQbTJ[i];
        byte b = (byte) (taskDescription.OLrzqt & 1);
        if ((b == 0 && (pendingIntent.copydefault & OLrzqt) > 0) || (b == 1 && (pendingIntent.copydefault & AYXKKw) > 0)) {
            z = true;
        } else if ((pendingIntent.copydefault & (OLrzqt | AYXKKw)) != 0) {
            z = i == taskDescription.AYXKKw;
            byte b2 = pendingIntent.AEQbTJ;
            if (b != b2) {
                b = b2;
            }
        } else {
            taskDescription.AhwBna = (short) i;
            return (byte) 10;
        }
        byte[] bArr = this.UeEOUB;
        int i3 = pendingIntent.OLrzqt;
        bArr[i3] = b;
        bArr[i2] = b;
        copydefault(actionBar, i, i3, b);
        if (z) {
            taskDescription.AhwBna = (short) i;
            while (true) {
                short s = taskDescription.AhwBna;
                if (s <= taskDescription.AYXKKw) {
                    break;
                }
                int i4 = s - 1;
                if (actionBar.AEQbTJ[i4].OLrzqt != pendingIntent.OLrzqt) {
                    break;
                }
                taskDescription.AhwBna = (short) i4;
            }
        } else {
            pendingIntent.EZpvd = -i2;
            int i5 = i - 1;
            while (i5 >= taskDescription.AYXKKw) {
                PendingIntent pendingIntent2 = actionBar.AEQbTJ[i5];
                if (pendingIntent2.OLrzqt != pendingIntent.OLrzqt) {
                    break;
                }
                i5--;
                pendingIntent2.EZpvd = 0;
            }
            for (int i6 = i + 1; i6 < taskDescription.AhwBna; i6++) {
                PendingIntent pendingIntent3 = actionBar.AEQbTJ[i6];
                if (pendingIntent3.OLrzqt >= i2) {
                    break;
                }
                if (pendingIntent3.EZpvd > 0) {
                    pendingIntent3.EZpvd = 0;
                }
            }
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r5 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        r6 = (char) o.C7223afl.AEQbTJ(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r6 == r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (o.C7223afl.copydefault(r5, 4117) != 1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        if (r6 != 9002) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        KWHzl(r9, (char) 12297, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r6 != 12297) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        KWHzl(r9, (char) 9002, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        KWHzl(r9, r6, r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0111 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(ActionBar actionBar, int i) {
        int i2;
        TaskDescription taskDescription = actionBar.OLrzqt[actionBar.EZpvd];
        byte b = this.UeEOUB[i];
        byte bKWHzl = 0;
        if (b == 10) {
            char c = this.getPostValueLengthLimit[i];
            int i3 = taskDescription.AhwBna - 1;
            while (true) {
                if (i3 < taskDescription.AYXKKw) {
                    break;
                }
                if (actionBar.AEQbTJ[i3].EZpvd != c) {
                    i3--;
                } else {
                    byte bKWHzl2 = KWHzl(actionBar, i3, i);
                    if (bKWHzl2 != 10) {
                        taskDescription.copydefault = (byte) 10;
                        taskDescription.EZpvd = bKWHzl2;
                        taskDescription.AEQbTJ = i;
                        byte b2 = this.giSNqX[i];
                        if ((b2 & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                            byte b3 = (byte) (b2 & 1);
                            taskDescription.KWHzl = b3;
                            short sCopydefault = (short) copydefault(b3);
                            for (int i4 = taskDescription.AYXKKw; i4 < i3; i4++) {
                                PendingIntent pendingIntent = actionBar.AEQbTJ[i4];
                                pendingIntent.copydefault = (short) (pendingIntent.copydefault | sCopydefault);
                            }
                            byte[] bArr = this.giSNqX;
                            bArr[i] = (byte) (bArr[i] & 127);
                        }
                        byte[] bArr2 = this.giSNqX;
                        int i5 = actionBar.AEQbTJ[i3].OLrzqt;
                        bArr2[i5] = (byte) (bArr2[i5] & 127);
                        return;
                    }
                    c = 0;
                }
            }
        }
        byte b4 = this.giSNqX[i];
        if ((b4 & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
            bKWHzl = (byte) (b4 & 1);
            if (b != 8 && b != 9 && b != 10) {
                this.UeEOUB[i] = bKWHzl;
            }
            taskDescription.copydefault = bKWHzl;
            taskDescription.KWHzl = bKWHzl;
            taskDescription.EZpvd = bKWHzl;
            taskDescription.AEQbTJ = i;
        } else if (b <= 1 || b == 13) {
            bKWHzl = KWHzl(b);
            taskDescription.copydefault = b;
            taskDescription.KWHzl = b;
            taskDescription.EZpvd = bKWHzl;
            taskDescription.AEQbTJ = i;
        } else {
            if (b == 2) {
                taskDescription.copydefault = (byte) 2;
                byte b5 = taskDescription.KWHzl;
                if (b5 == 0) {
                    if (!actionBar.KWHzl) {
                        this.UeEOUB[i] = Ascii.ETB;
                    }
                    taskDescription.EZpvd = (byte) 0;
                    taskDescription.AEQbTJ = i;
                } else {
                    if (b5 == 13) {
                        this.UeEOUB[i] = 5;
                    } else {
                        this.UeEOUB[i] = Ascii.CAN;
                    }
                    taskDescription.EZpvd = (byte) 1;
                    taskDescription.AEQbTJ = i;
                }
            } else {
                if (b != 5) {
                    if (b == 17) {
                        b = taskDescription.copydefault;
                        if (b == 10) {
                            this.UeEOUB[i] = b;
                        }
                    } else {
                        taskDescription.copydefault = b;
                    }
                    if (b > 1 || b == 13) {
                        short sCopydefault2 = (short) copydefault(KWHzl(b));
                        for (i2 = taskDescription.AYXKKw; i2 < taskDescription.AhwBna; i2++) {
                            PendingIntent pendingIntent2 = actionBar.AEQbTJ[i2];
                            if (i > pendingIntent2.OLrzqt) {
                                pendingIntent2.copydefault = (short) (pendingIntent2.copydefault | sCopydefault2);
                            }
                        }
                    }
                    return;
                }
                taskDescription.copydefault = (byte) 5;
                taskDescription.EZpvd = (byte) 1;
                taskDescription.AEQbTJ = i;
            }
            b = 1;
            if (b > 1) {
            }
            short sCopydefault22 = (short) copydefault(KWHzl(b));
            while (i2 < taskDescription.AhwBna) {
            }
        }
        b = bKWHzl;
        if (b > 1) {
        }
        short sCopydefault222 = (short) copydefault(KWHzl(b));
        while (i2 < taskDescription.AhwBna) {
        }
    }

    public final byte copydefault() {
        int i = this.dvKsVJ;
        if ((DbNXlk & i) == 0 && ((i & copydefault((byte) 5)) == 0 || (this.dvKsVJ & values) == 0)) {
            return (byte) 0;
        }
        return (this.dvKsVJ & fetchVPNInfo) == 0 ? (byte) 1 : (byte) 2;
    }

    public final byte values() {
        char c;
        byte b;
        byte bDjBIcL;
        byte b2;
        short s;
        byte bAEQbTJ = AEQbTJ(0);
        this.gGvvIC = 0;
        byte bCopydefault = copydefault();
        if (bCopydefault != 2) {
            return bCopydefault;
        }
        if (this.OqFWZa > 1) {
            int i = 0;
            while (i < this.AxsJAYsNCnLh) {
                int i2 = this.QKudOq[i];
                byte b3 = this.DAIeex[i];
                for (int i3 = i == 0 ? 0 : this.QKudOq[i - 1]; i3 < i2; i3++) {
                    this.giSNqX[i3] = b3;
                }
                i++;
            }
            return bCopydefault;
        }
        byte b4 = 10;
        if ((this.dvKsVJ & (valueOf | isConnected)) == 0) {
            ActionBar actionBar = new ActionBar();
            KWHzl(actionBar);
            int i4 = 0;
            while (i4 < this.AxsJAYsNCnLh) {
                int i5 = this.QKudOq[i4];
                byte b5 = this.DAIeex[i4];
                for (int i6 = i4 == 0 ? 0 : this.QKudOq[i4 - 1]; i6 < i5; i6++) {
                    this.giSNqX[i6] = b5;
                    byte b6 = this.UeEOUB[i6];
                    if (b6 != 18) {
                        if (b6 == 7) {
                            int i7 = i6 + 1;
                            if (i7 < this.fvQaOB) {
                                char[] cArr = this.getPostValueLengthLimit;
                                if (cArr[i6] != '\r' || cArr[i7] != '\n') {
                                    EZpvd(actionBar, b5);
                                }
                            }
                        } else {
                            EZpvd(actionBar, i6);
                        }
                    }
                }
                i4++;
            }
            return bCopydefault;
        }
        short[] sArr = new short[127];
        ActionBar actionBar2 = new ActionBar();
        KWHzl(actionBar2);
        sArr[0] = bAEQbTJ;
        this.dvKsVJ = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        byte b7 = bAEQbTJ;
        while (i8 < this.fvQaOB) {
            byte b8 = this.UeEOUB[i8];
            switch (b8) {
                case 7:
                    this.dvKsVJ |= copydefault((byte) 7);
                    this.giSNqX[i8] = AEQbTJ(i8);
                    int i14 = i8 + 1;
                    if (i14 < this.fvQaOB) {
                        char[] cArr2 = this.getPostValueLengthLimit;
                        c = '\r';
                        if (cArr2[i8] == '\r') {
                            b = 10;
                            if (cArr2[i14] == '\n') {
                            }
                        } else {
                            b = 10;
                        }
                        byte bAEQbTJ2 = AEQbTJ(i14);
                        sArr[0] = bAEQbTJ2;
                        EZpvd(actionBar2, bAEQbTJ2);
                        bAEQbTJ = bAEQbTJ2;
                        b7 = bAEQbTJ;
                        i9 = 0;
                        i11 = 0;
                        i12 = 0;
                        i13 = 0;
                    } else {
                        b = 10;
                        c = '\r';
                    }
                    break;
                case 8:
                case 9:
                case 10:
                case 13:
                case 17:
                case 19:
                default:
                    b = b4;
                    c = '\r';
                    if (djBIcL(bAEQbTJ) != djBIcL(b7)) {
                        KWHzl(actionBar2, i10, b7, bAEQbTJ);
                        int i15 = this.dvKsVJ | KWHzl;
                        this.dvKsVJ = i15;
                        if ((bAEQbTJ & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                            this.dvKsVJ = i15 | OLrzqt(bAEQbTJ);
                        } else {
                            this.dvKsVJ = i15 | EZpvd(bAEQbTJ);
                        }
                    }
                    this.giSNqX[i8] = bAEQbTJ;
                    EZpvd(actionBar2, i8);
                    this.dvKsVJ |= copydefault(this.UeEOUB[i8]);
                    b7 = bAEQbTJ;
                    break;
                case 11:
                case 12:
                case 14:
                case 15:
                    this.dvKsVJ |= copydefault(Ascii.DC2);
                    this.giSNqX[i8] = b7;
                    bDjBIcL = (byte) ((b8 == 11 || b8 == 12) ? (bAEQbTJ + 2) & WebSocketProtocol.PAYLOAD_SHORT : (djBIcL(bAEQbTJ) + 1) | 1);
                    if (bDjBIcL <= 125 && i9 == 0 && i11 == 0) {
                        if (b8 == 12 || b8 == 15) {
                            bDjBIcL = (byte) (bDjBIcL | UnsignedBytes.MAX_POWER_OF_TWO);
                        }
                        i12++;
                        sArr[i12] = bDjBIcL;
                        bAEQbTJ = b7;
                        b2 = bDjBIcL;
                        b7 = bAEQbTJ;
                        i10 = i8;
                        b = 10;
                        c = '\r';
                        bAEQbTJ = b2;
                    } else {
                        if (i9 == 0) {
                            i11++;
                        }
                        b = 10;
                        c = '\r';
                    }
                    break;
                case 16:
                    this.dvKsVJ |= copydefault(Ascii.DC2);
                    this.giSNqX[i8] = b7;
                    if (i9 <= 0) {
                        if (i11 > 0) {
                            i11--;
                        } else if (i12 > 0 && sArr[i12] < 256) {
                            i12--;
                            b2 = (byte) sArr[i12];
                            bAEQbTJ = b7;
                            b7 = bAEQbTJ;
                            i10 = i8;
                            b = 10;
                            c = '\r';
                            bAEQbTJ = b2;
                        }
                    }
                    b = 10;
                    c = '\r';
                    break;
                case 18:
                    this.giSNqX[i8] = b7;
                    this.dvKsVJ |= copydefault(Ascii.DC2);
                    b = 10;
                    c = '\r';
                    break;
                case 20:
                case 21:
                    this.dvKsVJ |= copydefault(b4) | AEQbTJ(bAEQbTJ);
                    this.giSNqX[i8] = djBIcL(bAEQbTJ);
                    if (djBIcL(bAEQbTJ) != djBIcL(b7)) {
                        KWHzl(actionBar2, i10, b7, bAEQbTJ);
                        this.dvKsVJ |= KWHzl;
                    }
                    bDjBIcL = (byte) (b8 == 20 ? (bAEQbTJ + 2) & WebSocketProtocol.PAYLOAD_SHORT : (djBIcL(bAEQbTJ) + 1) | 1);
                    if (bDjBIcL <= 125 && i9 == 0 && i11 == 0) {
                        this.dvKsVJ = copydefault(b8) | this.dvKsVJ;
                        int i16 = i13 + 1;
                        if (i16 > this.gGvvIC) {
                            this.gGvvIC = i16;
                        }
                        i12++;
                        sArr[i12] = (short) (bDjBIcL + 256);
                        OLrzqt(actionBar2, bDjBIcL);
                        i13 = i16;
                        b2 = bDjBIcL;
                        b7 = bAEQbTJ;
                        i10 = i8;
                        b = 10;
                        c = '\r';
                        bAEQbTJ = b2;
                    } else {
                        this.UeEOUB[i8] = 9;
                        i9++;
                        b7 = bAEQbTJ;
                        b = 10;
                        c = '\r';
                    }
                    break;
                case 22:
                    if (djBIcL(bAEQbTJ) != djBIcL(b7)) {
                        KWHzl(actionBar2, i10, b7, bAEQbTJ);
                        this.dvKsVJ |= KWHzl;
                    }
                    if (i9 > 0) {
                        i9--;
                        this.UeEOUB[i8] = 9;
                    } else if (i13 > 0) {
                        this.dvKsVJ |= copydefault(Ascii.SYN);
                        do {
                            s = sArr[i12];
                            i12--;
                        } while (s < 256);
                        i13--;
                        copydefault(actionBar2);
                        i10 = i8;
                        i11 = 0;
                    } else {
                        this.UeEOUB[i8] = 9;
                    }
                    bAEQbTJ = (byte) (sArr[i12] & (-257));
                    this.dvKsVJ |= copydefault(b4) | AEQbTJ(bAEQbTJ);
                    this.giSNqX[i8] = djBIcL(bAEQbTJ);
                    b = b4;
                    c = '\r';
                    b7 = bAEQbTJ;
                    break;
            }
            i8++;
            b4 = b;
        }
        int i17 = this.dvKsVJ;
        if ((AhwBna & i17) != 0) {
            this.dvKsVJ = i17 | AEQbTJ(this.RlQdEF);
        }
        if (this.iRxXKY && (this.dvKsVJ & copydefault((byte) 7)) != 0) {
            this.dvKsVJ |= copydefault((byte) 0);
        }
        return copydefault();
    }

    public final byte EZpvd() {
        int i;
        this.dvKsVJ = 0;
        this.gGvvIC = 0;
        int i2 = this.QKudOq[0];
        byte b = this.RlQdEF;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < this.fvQaOB; i5++) {
            byte[] bArr = this.giSNqX;
            byte b2 = bArr[i5];
            byte b3 = this.UeEOUB[i5];
            if (b3 == 20 || b3 == 21) {
                i3++;
                if (i3 > this.gGvvIC) {
                    this.gGvvIC = i3;
                }
            } else if (b3 == 22) {
                i3--;
            } else if (b3 == 7) {
                i3 = 0;
            }
            if (this.djSkpj != 0 && i5 == i2 && (i = i4 + 1) < this.AxsJAYsNCnLh) {
                i4 = i;
                b = this.DAIeex[i];
                i2 = this.QKudOq[i];
            }
            int i6 = b2 & UnsignedBytes.MAX_POWER_OF_TWO;
            byte b4 = (byte) (b2 & 127);
            if (b4 < b || 125 < b4) {
                if (b4 != 0) {
                    throw new java.lang.IllegalArgumentException("level " + ((int) b4) + " out of bounds at " + i5);
                }
                if (b3 != 7) {
                    bArr[i5] = (byte) (b | i6);
                    b4 = b;
                }
            }
            if (i6 != 0) {
                this.dvKsVJ |= OLrzqt(b4);
            } else {
                this.dvKsVJ |= EZpvd(b4) | copydefault(b3);
            }
        }
        int i7 = this.dvKsVJ;
        if ((AhwBna & i7) != 0) {
            this.dvKsVJ = i7 | AEQbTJ(this.RlQdEF);
        }
        return copydefault();
    }

    /* JADX INFO: renamed from: o.afE$StateListAnimator */
    public static class StateListAnimator {
        public byte[][][] EZpvd;
        public short[][] OLrzqt;

        public StateListAnimator(byte[][] bArr, byte[][] bArr2, short[] sArr, short[] sArr2) {
            this.EZpvd = new byte[][][]{bArr, bArr2};
            this.OLrzqt = new short[][]{sArr, sArr2};
        }
    }

    /* JADX INFO: renamed from: o.afE$LoaderManager */
    public static class LoaderManager {
        public byte[][] AEQbTJ;
        public short AYXKKw;
        public int AhwBna;
        public short[] EZpvd;
        public int KWHzl;
        public byte OLrzqt;
        public int copydefault;
        public int gEmmrt;

        private LoaderManager() {
        }
    }

    public final void AEQbTJ(int i, int i2) {
        Fragment fragment = new Fragment();
        Activity activity = this.fFgQHt;
        int length = activity.KWHzl.length;
        if (length == 0) {
            length = 10;
            activity.KWHzl = new Fragment[10];
        }
        if (activity.EZpvd >= length) {
            Fragment[] fragmentArr = activity.KWHzl;
            Fragment[] fragmentArr2 = new Fragment[length * 2];
            activity.KWHzl = fragmentArr2;
            java.lang.System.arraycopy(fragmentArr, 0, fragmentArr2, 0, length);
        }
        fragment.OLrzqt = i;
        fragment.copydefault = i2;
        Activity activity2 = this.fFgQHt;
        Fragment[] fragmentArr3 = activity2.KWHzl;
        int i3 = activity2.EZpvd;
        fragmentArr3[i3] = fragment;
        activity2.EZpvd = i3 + 1;
    }

    public final void EZpvd(int i, int i2, byte b) {
        int i3 = 0;
        while (i < i2) {
            byte b2 = this.UeEOUB[i];
            if (b2 == 22) {
                i3--;
            }
            if (i3 == 0) {
                this.giSNqX[i] = b;
            }
            if (b2 == 20 || b2 == 21) {
                i3++;
            }
            i++;
        }
    }

    public final void EZpvd(LoaderManager loaderManager, short s, int i, int i2) {
        int i3;
        byte[][] bArr = loaderManager.AEQbTJ;
        short[] sArr = loaderManager.EZpvd;
        short s2 = loaderManager.AYXKKw;
        byte b = bArr[s2][s];
        loaderManager.AYXKKw = valueOf(b);
        short s3 = sArr[AhwBna(b)];
        byte b2 = bArr[loaderManager.AYXKKw][7];
        if (s3 != 0) {
            switch (s3) {
                case 1:
                    loaderManager.AhwBna = i;
                    i3 = i;
                    break;
                case 2:
                    i3 = loaderManager.AhwBna;
                    break;
                case 3:
                    EZpvd(loaderManager.AhwBna, i, (byte) (loaderManager.OLrzqt + 1));
                    i3 = i;
                    break;
                case 4:
                    EZpvd(loaderManager.AhwBna, i, (byte) (loaderManager.OLrzqt + 2));
                    i3 = i;
                    break;
                case 5:
                    int i4 = loaderManager.gEmmrt;
                    if (i4 >= 0) {
                        AEQbTJ(i4, 1);
                    }
                    loaderManager.gEmmrt = -1;
                    Activity activity = this.fFgQHt;
                    if (activity.KWHzl.length == 0 || activity.EZpvd <= activity.OLrzqt) {
                        loaderManager.KWHzl = -1;
                        if ((bArr[s2][7] & 1) == 0 || (i3 = loaderManager.AhwBna) <= 0) {
                            i3 = i;
                        }
                        if (s == 5) {
                            AEQbTJ(i, 1);
                            Activity activity2 = this.fFgQHt;
                            activity2.OLrzqt = activity2.EZpvd;
                        }
                    } else {
                        for (int i5 = loaderManager.KWHzl + 1; i5 < i; i5++) {
                            byte[] bArr2 = this.giSNqX;
                            bArr2[i5] = (byte) ((bArr2[i5] - 2) & (-2));
                        }
                        Activity activity3 = this.fFgQHt;
                        activity3.OLrzqt = activity3.EZpvd;
                        loaderManager.KWHzl = -1;
                        if (s == 5) {
                            AEQbTJ(i, 1);
                            Activity activity4 = this.fFgQHt;
                            activity4.OLrzqt = activity4.EZpvd;
                        }
                        i3 = i;
                    }
                    break;
                case 6:
                    Activity activity5 = this.fFgQHt;
                    if (activity5.KWHzl.length > 0) {
                        activity5.EZpvd = activity5.OLrzqt;
                    }
                    loaderManager.AhwBna = -1;
                    loaderManager.gEmmrt = -1;
                    loaderManager.KWHzl = i2 - 1;
                    i3 = i;
                    break;
                case 7:
                    if (s == 3 && this.UeEOUB[i] == 5 && this.OqFWZa != 6) {
                        int i6 = loaderManager.gEmmrt;
                        if (i6 == -1) {
                            loaderManager.KWHzl = i2 - 1;
                        } else {
                            if (i6 >= 0) {
                                AEQbTJ(i6, 1);
                                loaderManager.gEmmrt = -2;
                            }
                            AEQbTJ(i, 1);
                        }
                    } else if (loaderManager.gEmmrt == -1) {
                        loaderManager.gEmmrt = i;
                    }
                    i3 = i;
                    break;
                case 8:
                    loaderManager.KWHzl = i2 - 1;
                    loaderManager.AhwBna = -1;
                    i3 = i;
                    break;
                case 9:
                    int i7 = i - 1;
                    while (i7 >= 0 && (this.giSNqX[i7] & 1) == 0) {
                        i7--;
                    }
                    if (i7 >= 0) {
                        AEQbTJ(i7, 4);
                        Activity activity6 = this.fFgQHt;
                        activity6.OLrzqt = activity6.EZpvd;
                    }
                    loaderManager.AhwBna = i;
                    i3 = i;
                    break;
                case 10:
                    AEQbTJ(i, 1);
                    AEQbTJ(i, 2);
                    i3 = i;
                    break;
                case 11:
                    Activity activity7 = this.fFgQHt;
                    activity7.EZpvd = activity7.OLrzqt;
                    if (s == 5) {
                        AEQbTJ(i, 4);
                        Activity activity8 = this.fFgQHt;
                        activity8.OLrzqt = activity8.EZpvd;
                    }
                    i3 = i;
                    break;
                case 12:
                    byte b3 = (byte) (loaderManager.OLrzqt + b2);
                    for (int i8 = loaderManager.AhwBna; i8 < i; i8++) {
                        byte[] bArr3 = this.giSNqX;
                        if (bArr3[i8] < b3) {
                            bArr3[i8] = b3;
                        }
                    }
                    Activity activity9 = this.fFgQHt;
                    activity9.OLrzqt = activity9.EZpvd;
                    loaderManager.AhwBna = i;
                    i3 = i;
                    break;
                case 13:
                    byte b4 = loaderManager.OLrzqt;
                    int i9 = i - 1;
                    while (i9 >= loaderManager.AhwBna) {
                        int i10 = b4 + 3;
                        if (this.giSNqX[i9] == i10) {
                            while (true) {
                                byte[] bArr4 = this.giSNqX;
                                byte b5 = bArr4[i9];
                                if (b5 == i10) {
                                    bArr4[i9] = (byte) (b5 - 2);
                                    i9--;
                                } else {
                                    while (this.giSNqX[i9] == b4) {
                                        i9--;
                                    }
                                }
                            }
                        }
                        byte[] bArr5 = this.giSNqX;
                        if (bArr5[i9] == b4 + 2) {
                            bArr5[i9] = b4;
                        } else {
                            bArr5[i9] = (byte) (b4 + 1);
                        }
                        i9--;
                    }
                    i3 = i;
                    break;
                case 14:
                    byte b6 = (byte) (loaderManager.OLrzqt + 1);
                    for (int i11 = i - 1; i11 >= loaderManager.AhwBna; i11--) {
                        byte[] bArr6 = this.giSNqX;
                        byte b7 = bArr6[i11];
                        if (b7 > b6) {
                            bArr6[i11] = (byte) (b7 - 2);
                        }
                    }
                    i3 = i;
                    break;
                default:
                    throw new java.lang.IllegalStateException("Internal ICU error in processPropertySeq");
            }
        } else {
            i3 = i;
        }
        if (b2 != 0 || i3 < i) {
            byte b8 = (byte) (loaderManager.OLrzqt + b2);
            if (i3 < loaderManager.copydefault) {
                EZpvd(i3, i2, b8);
                return;
            }
            while (i3 < i2) {
                this.giSNqX[i3] = b8;
                i3++;
            }
        }
    }

    public final byte DbNXlk() {
        int length = this.DXXBbs.length();
        while (length > 0) {
            int iCodePointBefore = this.DXXBbs.codePointBefore(length);
            length -= java.lang.Character.charCount(iCodePointBefore);
            byte bCopydefault = (byte) copydefault(iCodePointBefore);
            if (bCopydefault == 0) {
                return (byte) 0;
            }
            if (bCopydefault == 1 || bCopydefault == 13) {
                return (byte) 1;
            }
            if (bCopydefault == 7) {
                return (byte) 4;
            }
        }
        return (byte) 4;
    }

    public final byte valueOf() {
        int iCharCount = 0;
        while (iCharCount < this.dNCPSb.length()) {
            int iCodePointAt = this.dNCPSb.codePointAt(iCharCount);
            iCharCount += java.lang.Character.charCount(iCodePointAt);
            byte bCopydefault = (byte) copydefault(iCodePointAt);
            if (bCopydefault == 0) {
                return (byte) 0;
            }
            if (bCopydefault == 1 || bCopydefault == 13) {
                return (byte) 1;
            }
            if (bCopydefault == 2) {
                return (byte) 2;
            }
            if (bCopydefault == 5) {
                return (byte) 3;
            }
        }
        return (byte) 4;
    }

    public final void EZpvd(int i, int i2, short s, short s2) {
        short s3;
        int i3;
        byte bValueOf;
        short s4;
        byte bDbNXlk;
        int i4;
        LoaderManager loaderManager = new LoaderManager();
        boolean z = i < this.gasjUx && (AEQbTJ(i) & 1) > 0 && ((i4 = this.OqFWZa) == 5 || i4 == 6);
        loaderManager.gEmmrt = -1;
        loaderManager.KWHzl = -1;
        loaderManager.copydefault = i;
        byte b = this.giSNqX[i];
        loaderManager.OLrzqt = b;
        StateListAnimator stateListAnimator = this.finit;
        int i5 = b & 1;
        loaderManager.AEQbTJ = stateListAnimator.EZpvd[i5];
        loaderManager.EZpvd = stateListAnimator.OLrzqt[i5];
        short s5 = (i != 0 || this.DXXBbs == null || (bDbNXlk = DbNXlk()) == 4) ? s : bDbNXlk;
        byte b2 = this.UeEOUB[i];
        if (b2 == 22) {
            Application[] applicationArr = this.flVtFt;
            int i6 = this.gGvvIC;
            Application application = applicationArr[i6];
            loaderManager.AhwBna = application.OLrzqt;
            i3 = application.EZpvd;
            s3 = application.KWHzl;
            loaderManager.AYXKKw = application.copydefault;
            this.gGvvIC = i6 - 1;
        } else {
            loaderManager.AhwBna = -1;
            s3 = b2 == 17 ? (short) (s5 + 1) : (short) 0;
            loaderManager.AYXKKw = (short) 0;
            EZpvd(loaderManager, s5, i, i);
            i3 = i;
        }
        int i7 = i;
        int i8 = i7;
        short s6 = 1;
        int i9 = -1;
        while (i7 <= i2) {
            if (i7 >= i2) {
                int i10 = i2 - 1;
                while (i10 > i && (copydefault(this.UeEOUB[i10]) & djBIcL) != 0) {
                    i10--;
                }
                byte b3 = this.UeEOUB[i10];
                if (b3 == 20 || b3 == 21) {
                    break;
                } else {
                    s4 = s2;
                }
            } else {
                byte b4 = this.UeEOUB[i7];
                if (b4 == 7) {
                    this.gGvvIC = -1;
                }
                if (z) {
                    if (b4 == 13) {
                        b4 = 1;
                    } else if (b4 == 2) {
                        if (i9 <= i7) {
                            for (int i11 = i7 + 1; i11 < i2; i11++) {
                                byte b5 = this.UeEOUB[i11];
                                if (b5 == 0 || b5 == 1 || b5 == 13) {
                                    s6 = b5;
                                    i9 = i11;
                                    break;
                                }
                            }
                            i9 = i2;
                            s6 = 1;
                        }
                        if (s6 == 13) {
                            b4 = 5;
                        }
                    }
                }
                s4 = fJNWhG[b4];
            }
            short[][] sArr = AuCTelauCTel;
            short s7 = sArr[s3][s4];
            short sAEQbTJ = AEQbTJ(s7);
            short sCopydefault = copydefault(s7);
            if (i7 == i2 && sCopydefault == 0) {
                sCopydefault = 1;
            }
            if (sCopydefault != 0) {
                short s8 = sArr[s3][15];
                if (sCopydefault != 1) {
                    if (sCopydefault != 2) {
                        if (sCopydefault == 3) {
                            EZpvd(loaderManager, s8, i3, i8);
                            EZpvd(loaderManager, (short) 4, i8, i7);
                        } else if (sCopydefault == 4) {
                            EZpvd(loaderManager, s8, i3, i8);
                            i3 = i8;
                        } else {
                            throw new java.lang.IllegalStateException("Internal ICU error in resolveImplicitLevels");
                        }
                    }
                    i8 = i7;
                } else {
                    EZpvd(loaderManager, s8, i3, i7);
                }
                i3 = i7;
            }
            i7++;
            s3 = sAEQbTJ;
        }
        short s9 = (i2 != this.fvQaOB || this.dNCPSb == null || (bValueOf = valueOf()) == 4) ? s2 : bValueOf;
        int i12 = i2 - 1;
        while (i12 > i && (copydefault(this.UeEOUB[i12]) & djBIcL) != 0) {
            i12--;
        }
        byte b6 = this.UeEOUB[i12];
        if ((b6 == 20 || b6 == 21) && i2 < this.fvQaOB) {
            int i13 = this.gGvvIC + 1;
            this.gGvvIC = i13;
            Application[] applicationArr2 = this.flVtFt;
            if (applicationArr2[i13] == null) {
                applicationArr2[i13] = new Application();
            }
            Application application2 = this.flVtFt[this.gGvvIC];
            application2.KWHzl = s3;
            application2.copydefault = loaderManager.AYXKKw;
            application2.EZpvd = i3;
            application2.OLrzqt = loaderManager.AhwBna;
            return;
        }
        EZpvd(loaderManager, s9, i2, i2);
    }

    public final void OLrzqt() {
        if ((this.dvKsVJ & fARcdN) != 0) {
            int i = this.zuWLRA;
            while (i > 0) {
                while (i > 0) {
                    i--;
                    int iCopydefault = copydefault(this.UeEOUB[i]);
                    if ((fARcdN & iCopydefault) == 0) {
                        break;
                    }
                    if (this.iRxXKY && (copydefault((byte) 7) & iCopydefault) != 0) {
                        this.giSNqX[i] = 0;
                    } else {
                        this.giSNqX[i] = AEQbTJ(i);
                    }
                }
                while (i > 0) {
                    int i2 = i - 1;
                    int iCopydefault2 = copydefault(this.UeEOUB[i2]);
                    if ((djBIcL & iCopydefault2) != 0) {
                        byte[] bArr = this.giSNqX;
                        bArr[i2] = bArr[i];
                    } else {
                        if (this.iRxXKY && (copydefault((byte) 7) & iCopydefault2) != 0) {
                            this.giSNqX[i2] = 0;
                        } else if ((gEmmrt & iCopydefault2) != 0) {
                            this.giSNqX[i2] = AEQbTJ(i2);
                        }
                        i = i2;
                        break;
                    }
                    i = i2;
                }
            }
        }
    }

    public void copydefault(char[] cArr, byte b) {
        int i;
        int i2;
        int i3;
        byte b2;
        this.OqFWZa = 0;
        int length = cArr.length;
        if (length == 0) {
            OLrzqt(cArr, b, null);
            this.OqFWZa = 3;
            return;
        }
        int i4 = this.DarRvM;
        int i5 = 2;
        if ((i4 & 1) > 0) {
            this.DarRvM = (i4 & (-2)) | 2;
        }
        byte b3 = (byte) (b & 1);
        OLrzqt(cArr, b3, null);
        byte[] bArr = new byte[this.fvQaOB];
        java.lang.System.arraycopy(AhwBna(), 0, bArr, 0, this.fvQaOB);
        int i6 = this.zuWLRA;
        java.lang.String strAkhnZx = AkhnZx(2);
        int[] iArrGEmmrt = gEmmrt();
        this.DarRvM = i4;
        int i7 = this.fvQaOB;
        byte b4 = this.RcXXUw;
        this.OqFWZa = 5;
        AEQbTJ(strAkhnZx, (byte) (b3 ^ 1), null);
        C7193afH.copydefault(this);
        int i8 = this.ODWQjV;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < i8) {
            C7196afK c7196afK = this.ffGIBT[i9];
            int i12 = c7196afK.EZpvd - i11;
            if (i12 >= i5) {
                int i13 = c7196afK.OLrzqt;
                int i14 = i13 + 1;
                while (i14 < i13 + i12) {
                    int i15 = iArrGEmmrt[i14];
                    int i16 = iArrGEmmrt[i14 - 1];
                    int i17 = i13;
                    int i18 = i6;
                    if (EZpvd(i15 - i16) != 1 || bArr[i15] != bArr[i16]) {
                        i10++;
                    }
                    i14++;
                    i13 = i17;
                    i6 = i18;
                }
            }
            i9++;
            i11 += i12;
            i6 = i6;
            i5 = 2;
        }
        int i19 = i6;
        if (i10 > 0) {
            valueOf(i8 + i10);
            int i20 = this.ODWQjV;
            if (i20 == 1) {
                this.DCUTEI[0] = this.ffGIBT[0];
            } else {
                java.lang.System.arraycopy(this.ffGIBT, 0, this.DCUTEI, 0, i20);
            }
            this.ffGIBT = this.DCUTEI;
            this.ODWQjV += i10;
            for (int i21 = i8; i21 < this.ODWQjV; i21++) {
                C7196afK[] c7196afKArr = this.ffGIBT;
                if (c7196afKArr[i21] == null) {
                    c7196afKArr[i21] = new C7196afK(0, 0, (byte) 0);
                }
            }
        }
        int i22 = i8 - 1;
        while (i22 >= 0) {
            int i23 = i22 + i10;
            if (i22 == 0) {
                i = this.ffGIBT[0].EZpvd;
            } else {
                C7196afK[] c7196afKArr2 = this.ffGIBT;
                i = c7196afKArr2[i22].EZpvd - c7196afKArr2[i22 - 1].EZpvd;
            }
            C7196afK[] c7196afKArr3 = this.ffGIBT;
            C7196afK c7196afK2 = c7196afKArr3[i22];
            int i24 = c7196afK2.OLrzqt;
            int i25 = c7196afK2.AEQbTJ & 1;
            if (i < 2) {
                if (i10 > 0) {
                    c7196afKArr3[i23].OLrzqt(c7196afK2);
                }
                int i26 = iArrGEmmrt[i24];
                C7196afK c7196afK3 = this.ffGIBT[i23];
                c7196afK3.OLrzqt = i26;
                c7196afK3.AEQbTJ = (byte) (bArr[i26] ^ i25);
                b2 = b4;
            } else {
                if (i25 > 0) {
                    i2 = (i + i24) - 1;
                    i3 = 1;
                } else {
                    i2 = i24;
                    i24 = (i + i24) - 1;
                    i3 = -1;
                }
                int i27 = i24;
                while (i24 != i2) {
                    int i28 = iArrGEmmrt[i24];
                    int i29 = i24 + i3;
                    int i30 = iArrGEmmrt[i29];
                    int i31 = i3;
                    byte b5 = b4;
                    if (EZpvd(i28 - i30) != 1 || bArr[i28] != bArr[i30]) {
                        int iOLrzqt = OLrzqt(iArrGEmmrt[i27], i28);
                        C7196afK[] c7196afKArr4 = this.ffGIBT;
                        C7196afK c7196afK4 = c7196afKArr4[i23];
                        c7196afK4.OLrzqt = iOLrzqt;
                        c7196afK4.AEQbTJ = (byte) (bArr[iOLrzqt] ^ i25);
                        C7196afK c7196afK5 = c7196afKArr4[i22];
                        c7196afK4.EZpvd = c7196afK5.EZpvd;
                        c7196afK5.EZpvd -= EZpvd(i24 - i27) + 1;
                        C7196afK[] c7196afKArr5 = this.ffGIBT;
                        C7196afK c7196afK6 = c7196afKArr5[i22];
                        int i32 = c7196afK6.copydefault & 10;
                        c7196afKArr5[i23].copydefault = i32;
                        c7196afK6.copydefault &= ~i32;
                        i10--;
                        i23--;
                        i27 = i29;
                    }
                    i24 = i29;
                    i3 = i31;
                    b4 = b5;
                }
                b2 = b4;
                if (i10 > 0) {
                    C7196afK[] c7196afKArr6 = this.ffGIBT;
                    c7196afKArr6[i23].OLrzqt(c7196afKArr6[i22]);
                }
                int iOLrzqt2 = OLrzqt(iArrGEmmrt[i27], iArrGEmmrt[i2]);
                C7196afK c7196afK7 = this.ffGIBT[i23];
                c7196afK7.OLrzqt = iOLrzqt2;
                c7196afK7.AEQbTJ = (byte) (bArr[iOLrzqt2] ^ i25);
            }
            i22--;
            b4 = b2;
        }
        this.RlQdEF = (byte) (this.RlQdEF ^ 1);
        this.getPostValueLengthLimit = cArr;
        this.fvQaOB = i7;
        this.hUfVAv = length;
        this.RcXXUw = b4;
        this.giSNqX = bArr;
        this.zuWLRA = i19;
        if (this.ODWQjV > 1) {
            this.RcXXUw = (byte) 2;
        }
        this.OqFWZa = 3;
    }

    public void AEQbTJ(java.lang.String str, byte b, byte[] bArr) {
        if (str == null) {
            OLrzqt(new char[0], b, bArr);
        } else {
            OLrzqt(str.toCharArray(), b, bArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0175 A[LOOP:5: B:89:0x0175->B:95:0x018e, LOOP_START, PHI: r2
  0x0175: PHI (r2v8 int) = (r2v7 int), (r2v9 int) binds: [B:87:0x016f, B:95:0x018e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018a A[LOOP:3: B:66:0x011d->B:94:0x018a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(char[] cArr, byte b, byte[] bArr) {
        int i;
        byte bAEQbTJ;
        byte b2;
        byte bGEmmrt;
        short sGEmmrt;
        int i2;
        int i3;
        int i4;
        byte bAEQbTJ2;
        byte bGEmmrt2;
        short s;
        StateListAnimator stateListAnimator;
        StateListAnimator stateListAnimator2;
        Application[] applicationArr;
        if (b < 126) {
            copydefault(b, 0, WebSocketProtocol.PAYLOAD_SHORT);
        }
        if (cArr == null) {
            cArr = new char[0];
        }
        if (this.OqFWZa == 3) {
            copydefault(cArr, b);
            return;
        }
        this.accept = null;
        this.getPostValueLengthLimit = cArr;
        int length = cArr.length;
        this.DCJXGO = length;
        this.hUfVAv = length;
        this.fvQaOB = length;
        this.RlQdEF = b;
        this.RcXXUw = (byte) (b & 1);
        this.AxsJAYsNCnLh = 1;
        this.UeEOUB = new byte[0];
        this.giSNqX = new byte[0];
        this.ffGIBT = new C7196afK[0];
        this.fZBcTu = false;
        Activity activity = this.fFgQHt;
        activity.EZpvd = 0;
        activity.OLrzqt = 0;
        this.djSkpj = AYXKKw(b) ? b : (byte) 0;
        int i5 = this.fvQaOB;
        if (i5 == 0) {
            if (AYXKKw(b)) {
                this.RlQdEF = (byte) (1 & this.RlQdEF);
                this.djSkpj = (byte) 0;
            }
            this.dvKsVJ = AEQbTJ(b);
            this.ODWQjV = 0;
            this.AxsJAYsNCnLh = 0;
            fetchVPNInfo();
            return;
        }
        this.ODWQjV = -1;
        KWHzl(i5);
        this.UeEOUB = this.aKErDB;
        AYXKKw();
        int i6 = this.fvQaOB;
        this.zuWLRA = i6;
        if (bArr == null) {
            djBIcL(i6);
            this.giSNqX = this.gkJEwt;
            this.RcXXUw = values();
        } else {
            this.giSNqX = bArr;
            this.RcXXUw = EZpvd();
        }
        int i7 = this.gGvvIC;
        if (i7 > 0 && ((applicationArr = this.flVtFt) == null || applicationArr.length < i7)) {
            this.flVtFt = new Application[i7 + 3];
        }
        this.gGvvIC = -1;
        byte b3 = this.RcXXUw;
        if (b3 != 0 && b3 != 1) {
            switch (this.OqFWZa) {
                case 0:
                    stateListAnimator = zuBGHE;
                    this.finit = stateListAnimator;
                    if (bArr == null && this.AxsJAYsNCnLh <= 1 && (this.dvKsVJ & KWHzl) == 0) {
                        EZpvd(0, this.fvQaOB, gEmmrt(AEQbTJ(0)), gEmmrt(AEQbTJ(this.fvQaOB - 1)));
                    } else {
                        bAEQbTJ = AEQbTJ(0);
                        b2 = this.giSNqX[0];
                        if (bAEQbTJ >= b2) {
                            bGEmmrt = gEmmrt(b2);
                        } else {
                            bGEmmrt = gEmmrt(bAEQbTJ);
                        }
                        sGEmmrt = bGEmmrt;
                        i2 = 0;
                        while (true) {
                            if (i2 > 0 && this.UeEOUB[i2 - 1] == 7) {
                                sGEmmrt = gEmmrt(AEQbTJ(i2));
                            }
                            i3 = i2;
                            while (true) {
                                i3++;
                                if (i3 < this.fvQaOB || (this.giSNqX[i3] != b2 && (copydefault(this.UeEOUB[i3]) & djBIcL) == 0)) {
                                }
                            }
                            i4 = this.fvQaOB;
                            if (i3 >= i4) {
                                bAEQbTJ2 = this.giSNqX[i3];
                            } else {
                                bAEQbTJ2 = AEQbTJ(i4 - 1);
                            }
                            if (djBIcL(b2) >= djBIcL(bAEQbTJ2)) {
                                bGEmmrt2 = gEmmrt(bAEQbTJ2);
                            } else {
                                bGEmmrt2 = gEmmrt(b2);
                            }
                            s = bGEmmrt2;
                            if ((b2 & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                                EZpvd(i2, i3, sGEmmrt, s);
                            } else {
                                while (true) {
                                    byte[] bArr2 = this.giSNqX;
                                    int i8 = i2 + 1;
                                    bArr2[i2] = (byte) (bArr2[i2] & 127);
                                    if (i8 < i3) {
                                        i2 = i8;
                                    }
                                }
                            }
                            if (i3 >= this.fvQaOB) {
                                i2 = i3;
                                b2 = bAEQbTJ2;
                                sGEmmrt = s;
                            }
                        }
                    }
                    OLrzqt();
                    break;
                case 1:
                    stateListAnimator = QVAiDq;
                    this.finit = stateListAnimator;
                    if (bArr == null) {
                        bAEQbTJ = AEQbTJ(0);
                        b2 = this.giSNqX[0];
                        if (bAEQbTJ >= b2) {
                        }
                        sGEmmrt = bGEmmrt;
                        i2 = 0;
                        while (true) {
                            if (i2 > 0) {
                                sGEmmrt = gEmmrt(AEQbTJ(i2));
                            }
                            i3 = i2;
                            while (true) {
                                i3++;
                                if (i3 < this.fvQaOB) {
                                }
                                i4 = this.fvQaOB;
                                if (i3 >= i4) {
                                }
                                if (djBIcL(b2) >= djBIcL(bAEQbTJ2)) {
                                }
                                s = bGEmmrt2;
                                if ((b2 & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                                }
                                if (i3 >= this.fvQaOB) {
                                }
                            }
                            i2 = i3;
                            b2 = bAEQbTJ2;
                            sGEmmrt = s;
                        }
                    }
                    break;
                case 2:
                    stateListAnimator = QKVWgx;
                    this.finit = stateListAnimator;
                    if (bArr == null) {
                    }
                    break;
                case 3:
                    throw new java.lang.InternalError("Internal ICU error in setPara");
                case 4:
                    stateListAnimator2 = RJOkX;
                    this.finit = stateListAnimator2;
                    if (bArr == null) {
                    }
                    break;
                case 5:
                    stateListAnimator2 = (this.DarRvM & 1) != 0 ? QOLQEE : OcIXYQ;
                    this.finit = stateListAnimator2;
                    if (bArr == null) {
                    }
                    break;
                case 6:
                    stateListAnimator2 = (this.DarRvM & 1) != 0 ? ORxRYg : DTwDnp;
                    this.finit = stateListAnimator2;
                    if (bArr == null) {
                    }
                    break;
                default:
                    if (bArr == null) {
                    }
                    break;
            }
        } else {
            this.zuWLRA = 0;
        }
        if (this.djSkpj > 0 && (this.DarRvM & 1) != 0 && ((i = this.OqFWZa) == 5 || i == 6)) {
            int i9 = 0;
            while (i9 < this.AxsJAYsNCnLh) {
                int[] iArr = this.QKudOq;
                int i10 = iArr[i9] - 1;
                if (this.DAIeex[i9] != 0) {
                    int i11 = i9 == 0 ? 0 : iArr[i9 - 1];
                    int i12 = i10;
                    while (true) {
                        if (i12 < i11) {
                            break;
                        }
                        byte b4 = this.UeEOUB[i12];
                        if (b4 == 0) {
                            if (i12 < i10) {
                                while (this.UeEOUB[i10] == 7) {
                                    i10--;
                                }
                            }
                            AEQbTJ(i10, 4);
                        } else if ((copydefault(b4) & AkhnZx) != 0) {
                            break;
                        } else {
                            i12--;
                        }
                    }
                }
                i9++;
            }
        }
        if ((this.DarRvM & 2) != 0) {
            this.DCJXGO -= this.QbewEr;
        } else {
            this.DCJXGO += this.fFgQHt.EZpvd;
        }
        fetchVPNInfo();
    }

    public int copydefault(int i) {
        int iAEQbTJ;
        C7195afJ c7195afJ = this.QUSxYX;
        if (c7195afJ == null || (iAEQbTJ = c7195afJ.KWHzl(i)) == 23) {
            iAEQbTJ = this.QfsBiF.AEQbTJ(i);
        }
        if (iAEQbTJ >= 23) {
            return 10;
        }
        return iAEQbTJ;
    }

    public byte[] AhwBna() {
        isConnected();
        return this.fvQaOB <= 0 ? new byte[0] : C7193afH.OLrzqt(this);
    }

    public int KWHzl() {
        isConnected();
        C7193afH.copydefault(this);
        return this.ODWQjV;
    }

    public C7196afK values(int i) {
        isConnected();
        C7193afH.copydefault(this);
        copydefault(i, 0, this.ODWQjV);
        return C7193afH.OLrzqt(this, i);
    }

    public int[] gEmmrt() {
        KWHzl();
        return this.DCJXGO <= 0 ? new int[0] : C7193afH.KWHzl(this);
    }

    public java.lang.String AkhnZx(int i) {
        isConnected();
        return this.fvQaOB == 0 ? "" : C7194afI.OLrzqt(this, i);
    }

    public static java.lang.String OLrzqt(java.lang.String str, int i) {
        if (str != null) {
            return str.length() > 0 ? C7194afI.OLrzqt(str, i) : "";
        }
        throw new java.lang.IllegalArgumentException();
    }
}
