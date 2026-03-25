package o;

import com.google.common.base.Ascii;

/* JADX INFO: renamed from: o.oVh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36263oVh {
    public oWC EZpvd;
    public AbstractC36262oVg OLrzqt;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean copydefault(java.lang.String str, java.lang.String str2, C36263oVh c36263oVh, java.lang.Boolean bool) {
        byte b;
        java.lang.String strEjfBZ = new C36260oVe(str2).ejfBZ();
        strEjfBZ.hashCode();
        switch (strEjfBZ.hashCode()) {
            case -2040464843:
                b = !strEjfBZ.equals("LSAcco") ? (byte) -1 : (byte) 0;
                break;
            case -1757553894:
                if (strEjfBZ.equals("VOLUME")) {
                    b = 1;
                    break;
                }
                break;
            case -1266155568:
                if (strEjfBZ.equals("ENVELOPE")) {
                    b = 2;
                    break;
                }
                break;
            case -1213730046:
                if (strEjfBZ.equals("SUPERTREND")) {
                    b = 3;
                    break;
                }
                break;
            case 2452:
                if (strEjfBZ.equals("MA")) {
                    b = 4;
                    break;
                }
                break;
            case 2522:
                if (strEjfBZ.equals("OI")) {
                    b = 5;
                    break;
                }
                break;
            case 2748:
                if (strEjfBZ.equals("VR")) {
                    b = 6;
                    break;
                }
                break;
            case 2779:
                if (strEjfBZ.equals("WR")) {
                    b = 7;
                    break;
                }
                break;
            case 66537:
                if (strEjfBZ.equals("CCI")) {
                    b = 8;
                    break;
                }
                break;
            case 67800:
                if (strEjfBZ.equals("DMA")) {
                    b = 9;
                    break;
                }
                break;
            case 67808:
                if (strEjfBZ.equals("DMI")) {
                    b = 10;
                    break;
                }
                break;
            case 68761:
                if (strEjfBZ.equals("EMA")) {
                    b = Ascii.VT;
                    break;
                }
                break;
            case 68782:
                if (strEjfBZ.equals("EMV")) {
                    b = Ascii.FF;
                    break;
                }
                break;
            case 74257:
                if (strEjfBZ.equals("KDJ")) {
                    b = Ascii.CR;
                    break;
                }
                break;
            case 76678:
                if (strEjfBZ.equals("MTM")) {
                    b = Ascii.SO;
                    break;
                }
                break;
            case 78051:
                if (strEjfBZ.equals("OBV")) {
                    b = Ascii.SI;
                    break;
                }
                break;
            case 79542:
                if (strEjfBZ.equals("PSY")) {
                    b = 16;
                    break;
                }
                break;
            case 81318:
                if (strEjfBZ.equals("ROC")) {
                    b = 17;
                    break;
                }
                break;
            case 81448:
                if (strEjfBZ.equals("RSI")) {
                    b = Ascii.DC2;
                    break;
                }
                break;
            case 81860:
                if (strEjfBZ.equals("SAR")) {
                    b = 19;
                    break;
                }
                break;
            case 2044557:
                if (strEjfBZ.equals("BOLL")) {
                    b = Ascii.DC4;
                    break;
                }
                break;
            case 2047105:
                if (strEjfBZ.equals("BRAR")) {
                    b = Ascii.NAK;
                    break;
                }
                break;
            case 2358517:
                if (strEjfBZ.equals("MACD")) {
                    b = Ascii.SYN;
                    break;
                }
                break;
            case 2546910:
                if (strEjfBZ.equals("SKDJ")) {
                    b = Ascii.ETB;
                    break;
                }
                break;
            case 2583597:
                if (strEjfBZ.equals("TRIX")) {
                    b = Ascii.CAN;
                    break;
                }
                break;
            case 2647728:
                if (strEjfBZ.equals("VWAP")) {
                    b = Ascii.EM;
                    break;
                }
                break;
            case 63511234:
                if (strEjfBZ.equals("BSVol")) {
                    b = Ascii.SUB;
                    break;
                }
                break;
            case 72740685:
                if (strEjfBZ.equals("LSPos")) {
                    b = Ascii.ESC;
                    break;
                }
                break;
            case 1185755844:
                if (strEjfBZ.equals("LSRatio")) {
                    b = Ascii.FS;
                    break;
                }
                break;
            case 1768025685:
                if (strEjfBZ.equals("StochRSI")) {
                    b = Ascii.GS;
                    break;
                }
                break;
        }
        switch (b) {
            case 0:
                C36275oVt c36275oVt = new C36275oVt(str2);
                c36263oVh.OLrzqt = c36275oVt;
                c36275oVt.AhwBna = bool.booleanValue();
                c36263oVh.OLrzqt.EZpvd = true;
                c36263oVh.EZpvd = new oWC(str);
                break;
            case 1:
                c36263oVh.OLrzqt = new oVO(str2, false);
                c36263oVh.EZpvd = new oWF(str);
                break;
            case 2:
                c36263oVh.OLrzqt = new C36277oVv(str2);
                c36263oVh.EZpvd = new oWB(str);
                break;
            case 3:
                c36263oVh.OLrzqt = new oVM(str2);
                c36263oVh.EZpvd = new oWB(str);
                break;
            case 4:
                c36263oVh.OLrzqt = new oVA(str2);
                c36263oVh.EZpvd = new oWB(str);
                break;
            case 5:
                c36263oVh.OLrzqt = new oVG(str2);
                c36263oVh.EZpvd = new oWC(str);
                break;
            case 6:
                c36263oVh.OLrzqt = new oVR(str2);
                c36263oVh.EZpvd = new oWC(str);
                break;
            case 7:
                c36263oVh.OLrzqt = new oVV(str2);
                c36263oVh.EZpvd = new oWD(str);
                break;
            case 8:
                c36263oVh.OLrzqt = new C36268oVm(str2);
                c36263oVh.EZpvd = new oWC(str);
                break;
            case 9:
                c36263oVh.OLrzqt = new C36271oVp(str2);
                c36263oVh.EZpvd = new oWC(str);
                break;
            case 10:
                c36263oVh.OLrzqt = new C36274oVs(str2);
                c36263oVh.EZpvd = new oWD(str);
                break;
            case 11:
                c36263oVh.OLrzqt = new C36272oVq(str2);
                c36263oVh.EZpvd = new oWB(str);
                break;
            case 12:
                c36263oVh.OLrzqt = new C36273oVr(str2);
                c36263oVh.EZpvd = new oWC(str);
                break;
            case 13:
                c36263oVh.OLrzqt = new C36279oVx(str2);
                c36263oVh.EZpvd = new oWD(str);
                break;
            case 14:
                c36263oVh.OLrzqt = new C36280oVy(str2);
                c36263oVh.EZpvd = new oWC(str);
                break;
            case 15:
                c36263oVh.OLrzqt = new oVH(str2);
                c36263oVh.EZpvd = new oWC(str);
                break;
            case 16:
                c36263oVh.OLrzqt = new oVF(str2);
                c36263oVh.EZpvd = new oWC(str);
                break;
            case 17:
                c36263oVh.OLrzqt = new oVD(str2);
                c36263oVh.EZpvd = new oWC(str);
                break;
            case 18:
                c36263oVh.OLrzqt = new oVE(str2);
                c36263oVh.EZpvd = new oWD(str);
                break;
            case 19:
                c36263oVh.OLrzqt = new oVI(str2);
                c36263oVh.EZpvd = new oWB(str);
                break;
            case 20:
                c36263oVh.OLrzqt = new C36266oVk(str2);
                c36263oVh.EZpvd = new oWC(str);
                break;
            case 21:
                c36263oVh.OLrzqt = new C36267oVl(str2);
                c36263oVh.EZpvd = new oWC(str);
                break;
            case 22:
                c36263oVh.OLrzqt = new oVC(str2);
                c36263oVh.EZpvd = new oWC(str);
                break;
            case 23:
                c36263oVh.OLrzqt = new oVJ(str2);
                c36263oVh.EZpvd = new oWD(str);
                break;
            case 24:
                c36263oVh.OLrzqt = new oVN(str2);
                c36263oVh.EZpvd = new oWC(str);
                break;
            case 25:
                c36263oVh.OLrzqt = new oVQ(str2);
                c36263oVh.EZpvd = new oWB(str);
                break;
            case 26:
                c36263oVh.OLrzqt = new C36269oVn(str2);
                c36263oVh.EZpvd = new oWC(str);
                break;
            case 27:
                C36281oVz c36281oVz = new C36281oVz(str2);
                c36263oVh.OLrzqt = c36281oVz;
                c36281oVz.AhwBna = bool.booleanValue();
                c36263oVh.OLrzqt.EZpvd = true;
                c36263oVh.EZpvd = new oWC(str);
                break;
            case 28:
                oVB ovb = new oVB(str2);
                c36263oVh.OLrzqt = ovb;
                ovb.AhwBna = bool.booleanValue();
                c36263oVh.OLrzqt.EZpvd = true;
                c36263oVh.EZpvd = new oWC(str);
                break;
            case 29:
                c36263oVh.OLrzqt = new oVL(str2);
                c36263oVh.EZpvd = new oWD(str);
                break;
            default:
                return false;
        }
        c36263oVh.EZpvd.AEQbTJ(strEjfBZ);
        return true;
    }
}
