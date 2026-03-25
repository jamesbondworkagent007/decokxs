package o;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.ibm.icu.util.CodePointTrie;
import java.nio.charset.StandardCharsets;
import o.C7024abY;

/* JADX INFO: renamed from: o.acv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7074acv {
    public static final StateListAnimator copydefault = new StateListAnimator();
    public ActionBar AEQbTJ;
    public CodePointTrie AhwBna;
    public java.lang.String EZpvd;
    public Application KWHzl;
    public Application OLrzqt;
    public int[] gEmmrt;

    /* JADX INFO: renamed from: o.acv$ActionBar */
    public static final class ActionBar {
        public int AEQbTJ;
        public int AYXKKw;
        public int AhwBna;
        public int AkhnZx;
        public int DbNXlk;
        public int EZpvd;
        public int OLrzqt;
        public int copydefault;
        public int djBIcL;
        public int fetchVPNInfo;
        public int gEmmrt;
        public int isConnected;
        public int valueOf = 0;
        public byte[] KWHzl = new byte[4];
    }

    /* JADX INFO: renamed from: o.acv$Application */
    public static class Application {
        public static int AEQbTJ = 20;
        public char[] AhwBna;
        public int EZpvd;
        public int KWHzl;
        public int OLrzqt;
        public int copydefault;
        public int djBIcL;

        public static Application AEQbTJ(java.nio.ByteBuffer byteBuffer, int i) throws java.io.IOException {
            if (i == 0) {
                return null;
            }
            if (i < AEQbTJ) {
                throw new java.io.IOException("Invalid RBBI state table length.");
            }
            Application application = new Application();
            application.EZpvd = byteBuffer.getInt();
            application.djBIcL = byteBuffer.getInt();
            application.OLrzqt = byteBuffer.getInt();
            application.KWHzl = byteBuffer.getInt();
            int i2 = byteBuffer.getInt();
            application.copydefault = i2;
            int i3 = i - AEQbTJ;
            if ((i2 & 4) == 4) {
                application.AhwBna = new char[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    application.AhwBna[i4] = (char) (byteBuffer.get() & UnsignedBytes.MAX_VALUE);
                }
                C7024abY.EZpvd(byteBuffer, i3 & 1);
            } else {
                application.AhwBna = C7024abY.OLrzqt(byteBuffer, i3 / 2, i3 & 1);
            }
            return application;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            if (this.EZpvd == application.EZpvd && this.djBIcL == application.djBIcL && this.OLrzqt == application.OLrzqt && this.KWHzl == application.KWHzl && this.copydefault == application.copydefault) {
                return java.util.Arrays.equals(this.AhwBna, application.AhwBna);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: o.acv$StateListAnimator */
    public static final class StateListAnimator implements C7024abY.ActionBar {
        private StateListAnimator() {
        }

        @Override // o.C7024abY.ActionBar
        public boolean AEQbTJ(byte[] bArr) {
            return (((bArr[0] << Ascii.CAN) + (bArr[1] << 16)) + (bArr[2] << 8)) + bArr[3] == 100663296;
        }
    }

    public int AEQbTJ(int i) {
        return i * (this.AEQbTJ.AEQbTJ + 3);
    }

    public static C7074acv OLrzqt(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        C7074acv c7074acv = new C7074acv();
        StateListAnimator stateListAnimator = copydefault;
        C7024abY.OLrzqt(byteBuffer, 1114794784, stateListAnimator);
        ActionBar actionBar = new ActionBar();
        c7074acv.AEQbTJ = actionBar;
        actionBar.valueOf = byteBuffer.getInt();
        c7074acv.AEQbTJ.KWHzl[0] = byteBuffer.get();
        c7074acv.AEQbTJ.KWHzl[1] = byteBuffer.get();
        c7074acv.AEQbTJ.KWHzl[2] = byteBuffer.get();
        c7074acv.AEQbTJ.KWHzl[3] = byteBuffer.get();
        c7074acv.AEQbTJ.copydefault = byteBuffer.getInt();
        c7074acv.AEQbTJ.AEQbTJ = byteBuffer.getInt();
        c7074acv.AEQbTJ.OLrzqt = byteBuffer.getInt();
        c7074acv.AEQbTJ.EZpvd = byteBuffer.getInt();
        c7074acv.AEQbTJ.AhwBna = byteBuffer.getInt();
        c7074acv.AEQbTJ.gEmmrt = byteBuffer.getInt();
        c7074acv.AEQbTJ.AkhnZx = byteBuffer.getInt();
        c7074acv.AEQbTJ.DbNXlk = byteBuffer.getInt();
        c7074acv.AEQbTJ.djBIcL = byteBuffer.getInt();
        c7074acv.AEQbTJ.AYXKKw = byteBuffer.getInt();
        c7074acv.AEQbTJ.fetchVPNInfo = byteBuffer.getInt();
        c7074acv.AEQbTJ.isConnected = byteBuffer.getInt();
        C7024abY.EZpvd(byteBuffer, 24);
        ActionBar actionBar2 = c7074acv.AEQbTJ;
        if (actionBar2.valueOf != 45472 || !stateListAnimator.AEQbTJ(actionBar2.KWHzl)) {
            throw new java.io.IOException("Break Iterator Rule Data Magic Number Incorrect, or unsupported data version.");
        }
        ActionBar actionBar3 = c7074acv.AEQbTJ;
        int i = actionBar3.OLrzqt;
        if (i < 80 || i > actionBar3.copydefault) {
            throw new java.io.IOException("Break iterator Rule data corrupt");
        }
        C7024abY.EZpvd(byteBuffer, i - 80);
        ActionBar actionBar4 = c7074acv.AEQbTJ;
        int i2 = actionBar4.OLrzqt;
        c7074acv.KWHzl = Application.AEQbTJ(byteBuffer, actionBar4.EZpvd);
        ActionBar actionBar5 = c7074acv.AEQbTJ;
        C7024abY.EZpvd(byteBuffer, actionBar5.AhwBna - (i2 + actionBar5.EZpvd));
        ActionBar actionBar6 = c7074acv.AEQbTJ;
        int i3 = actionBar6.AhwBna;
        c7074acv.OLrzqt = Application.AEQbTJ(byteBuffer, actionBar6.gEmmrt);
        ActionBar actionBar7 = c7074acv.AEQbTJ;
        C7024abY.EZpvd(byteBuffer, actionBar7.AkhnZx - (i3 + actionBar7.gEmmrt));
        int i4 = c7074acv.AEQbTJ.AkhnZx;
        byteBuffer.mark();
        c7074acv.AhwBna = CodePointTrie.EZpvd(CodePointTrie.Type.FAST, null, byteBuffer);
        byteBuffer.reset();
        int i5 = c7074acv.AEQbTJ.fetchVPNInfo;
        if (i4 > i5) {
            throw new java.io.IOException("Break iterator Rule data corrupt");
        }
        C7024abY.EZpvd(byteBuffer, i5 - i4);
        ActionBar actionBar8 = c7074acv.AEQbTJ;
        int i6 = actionBar8.fetchVPNInfo;
        int i7 = actionBar8.isConnected;
        c7074acv.gEmmrt = C7024abY.EZpvd(byteBuffer, i7 / 4, i7 & 3);
        ActionBar actionBar9 = c7074acv.AEQbTJ;
        int i8 = i6 + actionBar9.isConnected;
        int i9 = actionBar9.djBIcL;
        if (i8 > i9) {
            throw new java.io.IOException("Break iterator Rule data corrupt");
        }
        C7024abY.EZpvd(byteBuffer, i9 - i8);
        ActionBar actionBar10 = c7074acv.AEQbTJ;
        int i10 = actionBar10.djBIcL;
        c7074acv.EZpvd = new java.lang.String(C7024abY.copydefault(byteBuffer, actionBar10.AYXKKw, 0), StandardCharsets.UTF_8);
        java.lang.String str = C7287agw.copydefault;
        if (str != null && str.indexOf("data") >= 0) {
            c7074acv.AEQbTJ(java.lang.System.out);
        }
        return c7074acv;
    }

    public void AEQbTJ(java.io.PrintStream printStream) {
        this.KWHzl.getClass();
        printStream.println("RBBI Data Wrapper dump ...");
        printStream.println();
        printStream.println("Forward State Table");
        OLrzqt(printStream, this.KWHzl);
        printStream.println("Reverse State Table");
        OLrzqt(printStream, this.OLrzqt);
        OLrzqt(printStream);
        printStream.println("Source Rules: " + this.EZpvd);
    }

    public static java.lang.String AEQbTJ(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i2);
        sb.append(i);
        while (sb.length() < i2) {
            sb.insert(0, ' ');
        }
        return sb.toString();
    }

    public static java.lang.String KWHzl(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i2);
        sb.append(java.lang.Integer.toHexString(i));
        while (sb.length() < i2) {
            sb.insert(0, ' ');
        }
        return sb.toString();
    }

    public final void OLrzqt(java.io.PrintStream printStream, Application application) {
        if (application == null || application.AhwBna.length == 0) {
            printStream.println("  -- null -- ");
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" Row  Acc Look  Tag");
        for (char c = 0; c < this.AEQbTJ.AEQbTJ; c = (char) (c + 1)) {
            sb.append(AEQbTJ(c, 5));
        }
        printStream.println(sb.toString());
        for (char c2 = 0; c2 < sb.length(); c2 = (char) (c2 + 1)) {
            printStream.print("-");
        }
        printStream.println();
        for (char c3 = 0; c3 < application.EZpvd; c3 = (char) (c3 + 1)) {
            EZpvd(printStream, application, c3);
        }
        printStream.println();
    }

    public final void EZpvd(java.io.PrintStream printStream, Application application, char c) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((this.AEQbTJ.AEQbTJ * 5) + 20);
        sb.append(AEQbTJ(c, 4));
        int iAEQbTJ = AEQbTJ(c);
        char c2 = application.AhwBna[iAEQbTJ];
        if (c2 != 0) {
            sb.append(AEQbTJ(c2, 5));
        } else {
            sb.append("     ");
        }
        char c3 = application.AhwBna[iAEQbTJ + 1];
        if (c3 != 0) {
            sb.append(AEQbTJ(c3, 5));
        } else {
            sb.append("     ");
        }
        sb.append(AEQbTJ(application.AhwBna[iAEQbTJ + 2], 5));
        for (int i = 0; i < this.AEQbTJ.AEQbTJ; i++) {
            sb.append(AEQbTJ(application.AhwBna[iAEQbTJ + 3 + i], 5));
        }
        printStream.println(sb);
    }

    public final void OLrzqt(java.io.PrintStream printStream) {
        int i = this.AEQbTJ.AEQbTJ + 1;
        java.lang.String[] strArr = new java.lang.String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 <= this.AEQbTJ.AEQbTJ; i2++) {
            strArr[i2] = "";
        }
        printStream.println("\nCharacter Categories");
        printStream.println("--------------------");
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 <= 1114111; i6++) {
            int iCopydefault = this.AhwBna.copydefault(i6);
            if (iCopydefault < 0 || iCopydefault > this.AEQbTJ.AEQbTJ) {
                printStream.println("Error, bad category " + java.lang.Integer.toHexString(iCopydefault) + " for char " + java.lang.Integer.toHexString(i6));
                break;
            }
            if (iCopydefault != i3) {
                if (i3 >= 0) {
                    if (strArr[i3].length() > iArr[i3] + 70) {
                        iArr[i3] = strArr[i3].length() + 10;
                        strArr[i3] = strArr[i3] + "\n       ";
                    }
                    strArr[i3] = strArr[i3] + " " + java.lang.Integer.toHexString(i4);
                    if (i5 != i4) {
                        strArr[i3] = strArr[i3] + "-" + java.lang.Integer.toHexString(i5);
                    }
                }
                i4 = i6;
                i3 = iCopydefault;
            }
            i5 = i6;
        }
        strArr[i3] = strArr[i3] + " " + java.lang.Integer.toHexString(i4);
        if (i5 != i4) {
            strArr[i3] = strArr[i3] + "-" + java.lang.Integer.toHexString(i5);
        }
        for (int i7 = 0; i7 <= this.AEQbTJ.AEQbTJ; i7++) {
            printStream.println(AEQbTJ(i7, 5) + "  " + strArr[i7]);
        }
        printStream.println();
    }
}
