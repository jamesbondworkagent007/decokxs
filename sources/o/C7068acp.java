package o;

import com.ibm.icu.text.UnicodeSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.acp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7068acp {
    public static int OLrzqt = -1;
    public static int copydefault = -2;
    public java.lang.String AYXKKw;
    public int djBIcL;
    public int gEmmrt;
    public UnicodeSet EZpvd = new UnicodeSet();
    public UnicodeSet AhwBna = new UnicodeSet();
    public UnicodeSet KWHzl = new UnicodeSet();
    public UnicodeSet AEQbTJ = new UnicodeSet();
    public boolean isConnected = false;
    public boolean DbNXlk = false;
    public transient UnicodeSet valueOf = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7068acp AEQbTJ(boolean z) {
        this.DbNXlk = z;
        this.valueOf = null;
        return this;
    }

    public C7068acp OLrzqt(UnicodeSet unicodeSet) {
        this.AhwBna = (UnicodeSet) unicodeSet.clone();
        this.valueOf = null;
        return this;
    }

    public C7068acp copydefault(UnicodeSet unicodeSet) {
        this.KWHzl = (UnicodeSet) unicodeSet.clone();
        this.valueOf = null;
        return this;
    }

    public C7068acp KWHzl(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Inconsistent arguments");
        }
        this.gEmmrt = 0;
        this.djBIcL = str.length();
        this.AYXKKw = str;
        return this;
    }

    public java.lang.String AEQbTJ(java.lang.String str) {
        if (this.valueOf == null) {
            UnicodeSet unicodeSetOLrzqt = new UnicodeSet().OLrzqt(this.AhwBna).OLrzqt(this.EZpvd).OLrzqt(this.KWHzl);
            this.valueOf = unicodeSetOLrzqt;
            if (this.isConnected) {
                unicodeSetOLrzqt.KWHzl(92);
            }
            if (this.DbNXlk) {
                this.valueOf.KWHzl(39);
            }
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int i = OLrzqt;
        int iCopydefault = 0;
        while (iCopydefault < str.length()) {
            int iAEQbTJ = C7242agD.AEQbTJ(str, iCopydefault);
            if (this.AEQbTJ.AEQbTJ(iAEQbTJ)) {
                if (i == copydefault) {
                    stringBuffer.append('\'');
                    i = OLrzqt;
                }
                OLrzqt(stringBuffer, iAEQbTJ);
            } else if (!this.valueOf.AEQbTJ(iAEQbTJ)) {
                if (i == copydefault) {
                    stringBuffer.append('\'');
                    i = OLrzqt;
                }
                C7242agD.copydefault(stringBuffer, iAEQbTJ);
            } else if (i == copydefault) {
                C7242agD.copydefault(stringBuffer, iAEQbTJ);
                if (this.DbNXlk && iAEQbTJ == 39) {
                    stringBuffer.append('\'');
                }
            } else if (this.isConnected) {
                stringBuffer.append(AbstractJsonLexerKt.STRING_ESC);
                C7242agD.copydefault(stringBuffer, iAEQbTJ);
            } else if (!this.DbNXlk) {
                OLrzqt(stringBuffer, iAEQbTJ);
            } else if (iAEQbTJ == 39) {
                stringBuffer.append('\'');
                stringBuffer.append('\'');
            } else {
                stringBuffer.append('\'');
                C7242agD.copydefault(stringBuffer, iAEQbTJ);
                i = copydefault;
            }
            iCopydefault += C7242agD.copydefault(iAEQbTJ);
        }
        if (i == copydefault) {
            stringBuffer.append('\'');
        }
        return stringBuffer.toString();
    }

    public final void OLrzqt(java.lang.StringBuffer stringBuffer, int i) {
        if (i <= 65535) {
            stringBuffer.append("\\u");
            stringBuffer.append(C7045acS.AEQbTJ(i, 4));
        } else {
            stringBuffer.append("\\U");
            stringBuffer.append(C7045acS.AEQbTJ(i, 8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00bb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int OLrzqt(java.lang.StringBuffer stringBuffer) {
        int i;
        int iCopydefault = this.gEmmrt;
        if (iCopydefault >= this.djBIcL) {
            return 0;
        }
        int i2 = 5;
        int i3 = 5;
        byte b = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.djBIcL;
            if (iCopydefault >= i6) {
                this.gEmmrt = i6;
                if (b == 1 || b == 2) {
                    return 3;
                }
                if (b != 3) {
                    if (b != 4) {
                        return i3;
                    }
                } else if (!this.isConnected) {
                    stringBuffer.append(AbstractJsonLexerKt.STRING_ESC);
                    return i3;
                }
                return 4;
            }
            int iAEQbTJ = C7242agD.AEQbTJ(this.AYXKKw, iCopydefault);
            if (b != -1) {
                if (b != 1) {
                    if (b != 2) {
                        if (b == 3) {
                            if (iAEQbTJ == 85) {
                                i5 = 8;
                            } else if (iAEQbTJ == 117) {
                                i5 = 4;
                            } else if (this.isConnected) {
                                C7242agD.copydefault(stringBuffer, iAEQbTJ);
                            } else {
                                stringBuffer.append(AbstractJsonLexerKt.STRING_ESC);
                                b = 0;
                                if (this.EZpvd.AEQbTJ(iAEQbTJ)) {
                                }
                            }
                            b = 4;
                            i4 = 0;
                        } else if (b == 4) {
                            int i7 = (i4 << 4) + iAEQbTJ;
                            switch (iAEQbTJ) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                    i = i7 - 48;
                                    break;
                                default:
                                    switch (iAEQbTJ) {
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                            i = i7 - 55;
                                            break;
                                        default:
                                            switch (iAEQbTJ) {
                                                case 97:
                                                case 98:
                                                case 99:
                                                case 100:
                                                case 101:
                                                case 102:
                                                    i = i7 - 87;
                                                    break;
                                                default:
                                                    this.gEmmrt = iCopydefault;
                                                    return 4;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            i4 = i;
                            i5--;
                            if (i5 == 0) {
                                C7242agD.copydefault(stringBuffer, i4);
                            }
                        } else if (this.EZpvd.AEQbTJ(iAEQbTJ)) {
                            continue;
                        } else {
                            if (this.AhwBna.AEQbTJ(iAEQbTJ)) {
                                if (i3 != 5) {
                                    this.gEmmrt = iCopydefault;
                                    return i3;
                                }
                                C7242agD.copydefault(stringBuffer, iAEQbTJ);
                                this.gEmmrt = iCopydefault + C7242agD.copydefault(iAEQbTJ);
                                return 1;
                            }
                            if (iAEQbTJ == 92) {
                                b = 3;
                            } else if (this.DbNXlk && iAEQbTJ == 39) {
                                i2 = iAEQbTJ;
                                b = 1;
                            } else {
                                C7242agD.copydefault(stringBuffer, iAEQbTJ);
                            }
                            i3 = 2;
                        }
                    } else if (iAEQbTJ == i2) {
                        b = -1;
                    } else {
                        C7242agD.copydefault(stringBuffer, iAEQbTJ);
                    }
                } else if (iAEQbTJ == i2) {
                    C7242agD.copydefault(stringBuffer, iAEQbTJ);
                } else {
                    C7242agD.copydefault(stringBuffer, iAEQbTJ);
                    b = 2;
                }
                b = 0;
            } else {
                if (iAEQbTJ == i2) {
                    C7242agD.copydefault(stringBuffer, iAEQbTJ);
                    b = 2;
                }
                b = 0;
                if (this.EZpvd.AEQbTJ(iAEQbTJ)) {
                }
            }
            iCopydefault += C7242agD.copydefault(iAEQbTJ);
        }
    }
}
