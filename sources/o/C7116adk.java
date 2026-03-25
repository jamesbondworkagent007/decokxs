package o;

import com.ibm.icu.impl.Trie2;
import com.ibm.icu.text.UnicodeSet;
import o.C7069acq;
import o.C7244agF;

/* JADX INFO: renamed from: o.adk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7116adk {
    public C7048acV AEQbTJ;
    public UnicodeSet EZpvd;
    public java.lang.StringBuilder KWHzl = new java.lang.StringBuilder();
    public C7048acV OLrzqt;
    public java.lang.String copydefault;

    public C7116adk(UnicodeSet unicodeSet) {
        this.EZpvd = unicodeSet;
    }

    public void EZpvd(C7048acV c7048acV) {
        this.AEQbTJ = c7048acV;
        this.OLrzqt = c7048acV.OLrzqt;
        for (Trie2.TaskDescription taskDescription : c7048acV.fIwbmz) {
            if (taskDescription.EZpvd) {
                return;
            } else {
                AEQbTJ(taskDescription.KWHzl, taskDescription.OLrzqt, taskDescription.AEQbTJ, this);
            }
        }
    }

    public final void AEQbTJ(int i, int i2, int i3, C7116adk c7116adk) {
        if (i3 == 192) {
            return;
        }
        c7116adk.AEQbTJ(i, i2, i3);
    }

    public final void AEQbTJ(int i, int i2, int i3) {
        if (C7046acT.isConnected(i3) && (i3 = this.AEQbTJ.djBIcL(i3)) == 192) {
            return;
        }
        do {
            C7048acV c7048acV = this.OLrzqt;
            int iAhwBna = c7048acV.AhwBna(c7048acV.copydefault(i));
            if (!C7046acT.gEmmrt(i3) || !C7046acT.gEmmrt(iAhwBna)) {
                EZpvd(i, i3, iAhwBna);
            } else if (i3 != iAhwBna) {
                this.EZpvd.KWHzl(i);
            }
            i++;
        } while (i <= i2);
    }

    public final void EZpvd(int i, int i2, int i3) {
        if (C7046acT.AYXKKw(i2)) {
            int iDjBIcL = C7046acT.djBIcL(i2);
            C7048acV c7048acV = this.AEQbTJ;
            int iAhwBna = c7048acV.AhwBna(c7048acV.KWHzl(iDjBIcL));
            if (C7046acT.AYXKKw(i3)) {
                int iDjBIcL2 = C7046acT.djBIcL(i3);
                C7048acV c7048acV2 = this.OLrzqt;
                int iAhwBna2 = c7048acV2.AhwBna(c7048acV2.KWHzl(iDjBIcL2));
                KWHzl(i, this.AEQbTJ.valueOf, iDjBIcL + 2, this.OLrzqt.valueOf, iDjBIcL2 + 2);
                i3 = iAhwBna2;
            } else {
                C7048acV c7048acV3 = this.AEQbTJ;
                KWHzl(c7048acV3, i, c7048acV3.valueOf, iDjBIcL + 2);
            }
            i2 = iAhwBna;
        } else if (C7046acT.AYXKKw(i3)) {
            int iDjBIcL3 = C7046acT.djBIcL(i3);
            C7048acV c7048acV4 = this.OLrzqt;
            int iAhwBna3 = c7048acV4.AhwBna(c7048acV4.KWHzl(iDjBIcL3));
            C7048acV c7048acV5 = this.OLrzqt;
            KWHzl(c7048acV5, i, c7048acV5.valueOf, iDjBIcL3 + 2);
            i3 = iAhwBna3;
        }
        if (C7046acT.valueOf(i2)) {
            int iDjBIcL4 = C7046acT.djBIcL(i2);
            if ((i2 & 256) != 0) {
                i2 = 1;
            } else {
                C7048acV c7048acV6 = this.AEQbTJ;
                i2 = c7048acV6.AhwBna(c7048acV6.KWHzl(iDjBIcL4));
            }
            if (C7046acT.valueOf(i3)) {
                int iDjBIcL5 = C7046acT.djBIcL(i3);
                if ((i3 & 256) != 0) {
                    i3 = 1;
                } else {
                    C7048acV c7048acV7 = this.OLrzqt;
                    i3 = c7048acV7.AhwBna(c7048acV7.KWHzl(iDjBIcL5));
                }
                OLrzqt(i, this.AEQbTJ.valueOf, iDjBIcL4 + 2, this.OLrzqt.valueOf, iDjBIcL5 + 2);
            } else {
                copydefault(i, this.AEQbTJ.valueOf, iDjBIcL4 + 2);
            }
        } else if (C7046acT.valueOf(i3)) {
            int iDjBIcL6 = C7046acT.djBIcL(i3);
            C7048acV c7048acV8 = this.OLrzqt;
            int iAhwBna4 = c7048acV8.AhwBna(c7048acV8.KWHzl(iDjBIcL6));
            copydefault(i, this.OLrzqt.valueOf, iDjBIcL6 + 2);
            i3 = iAhwBna4;
        }
        int iFIwbmz = C7046acT.isConnected(i2) ? C7046acT.fIwbmz(i2) : -1;
        int iFIwbmz2 = C7046acT.isConnected(i3) ? C7046acT.fIwbmz(i3) : -1;
        if (iFIwbmz2 == 14) {
            if (!C7046acT.AhwBna(i2)) {
                AEQbTJ(i);
                return;
            } else {
                if (C7046acT.fetchVPNInfo(i2) != C7046acT.KWHzl(i, this.OLrzqt.AEQbTJ[C7046acT.djBIcL(i3)])) {
                    AEQbTJ(i);
                    return;
                }
            }
        }
        if (iFIwbmz != iFIwbmz2) {
            AEQbTJ(i);
            return;
        }
        int i4 = 0;
        if (iFIwbmz == 5) {
            int iDbNXlk = C7046acT.DbNXlk(i2);
            if (iDbNXlk != C7046acT.DbNXlk(i3)) {
                AEQbTJ(i);
                return;
            }
            int iDjBIcL7 = C7046acT.djBIcL(i2);
            int iDjBIcL8 = C7046acT.djBIcL(i3);
            while (i4 < iDbNXlk) {
                if (this.AEQbTJ.copydefault[iDjBIcL7 + i4] != this.OLrzqt.copydefault[iDjBIcL8 + i4]) {
                    AEQbTJ(i);
                    return;
                }
                i4++;
            }
            return;
        }
        if (iFIwbmz == 6) {
            int iDbNXlk2 = C7046acT.DbNXlk(i2);
            if (iDbNXlk2 != C7046acT.DbNXlk(i3)) {
                AEQbTJ(i);
                return;
            }
            int iDjBIcL9 = C7046acT.djBIcL(i2);
            int iDjBIcL10 = C7046acT.djBIcL(i3);
            while (i4 < iDbNXlk2) {
                if (this.AEQbTJ.AEQbTJ[iDjBIcL9 + i4] != this.OLrzqt.AEQbTJ[iDjBIcL10 + i4]) {
                    AEQbTJ(i);
                    return;
                }
                i4++;
            }
            return;
        }
        if (iFIwbmz != 12) {
            if (i2 != i3) {
                AEQbTJ(i);
                return;
            }
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iEZpvd = C7069acq.Activity.EZpvd(i, sb);
        if (this.EZpvd.AEQbTJ(sb.charAt(0)) || this.EZpvd.AEQbTJ(sb.charAt(1)) || (iEZpvd == 3 && this.EZpvd.AEQbTJ(sb.charAt(2)))) {
            AEQbTJ(i);
        }
    }

    public final void KWHzl(int i, java.lang.CharSequence charSequence, int i2, java.lang.CharSequence charSequence2, int i3) {
        C7244agF.Activity it = new C7244agF(charSequence, i2).iterator();
        C7244agF.Activity it2 = new C7244agF(charSequence2, i3).iterator();
        while (true) {
            java.lang.String string = null;
            java.lang.String string2 = null;
            C7244agF.StateListAnimator next = null;
            C7244agF.StateListAnimator next2 = null;
            while (true) {
                if (string == null) {
                    if (it.hasNext()) {
                        next = it.next();
                        string = next.copydefault.toString();
                    } else {
                        next = null;
                        string = "\uffff";
                    }
                }
                if (string2 == null) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        string2 = next2.copydefault.toString();
                    } else {
                        next2 = null;
                        string2 = "\uffff";
                    }
                }
                if (C7045acS.AEQbTJ(string, "\uffff") && C7045acS.AEQbTJ(string2, "\uffff")) {
                    return;
                }
                int iCompareTo = string.compareTo(string2);
                if (iCompareTo < 0) {
                    KWHzl(this.AEQbTJ, string, i, next.AEQbTJ);
                    string = null;
                    next = null;
                } else if (iCompareTo > 0) {
                    KWHzl(this.OLrzqt, string2, i, next2.AEQbTJ);
                    string2 = null;
                    next2 = null;
                }
            }
            copydefault(string);
            EZpvd(i, next.AEQbTJ, next2.AEQbTJ);
            copydefault();
        }
    }

    public final void OLrzqt(int i, java.lang.CharSequence charSequence, int i2, java.lang.CharSequence charSequence2, int i3) {
        C7244agF.Activity it = new C7244agF(charSequence, i2).iterator();
        C7244agF.Activity it2 = new C7244agF(charSequence2, i3).iterator();
        while (true) {
            java.lang.String string = null;
            java.lang.String string2 = null;
            C7244agF.StateListAnimator next = null;
            C7244agF.StateListAnimator next2 = null;
            while (true) {
                if (string == null) {
                    if (it.hasNext()) {
                        next = it.next();
                        string = next.copydefault.toString();
                    } else {
                        next = null;
                        string = "\uffff\uffff";
                    }
                }
                if (string2 == null) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        string2 = next2.copydefault.toString();
                    } else {
                        next2 = null;
                        string2 = "\uffff\uffff";
                    }
                }
                if (C7045acS.AEQbTJ(string, "\uffff\uffff") && C7045acS.AEQbTJ(string2, "\uffff\uffff")) {
                    return;
                }
                int iCompareTo = string.compareTo(string2);
                if (iCompareTo < 0) {
                    OLrzqt(i, string);
                    string = null;
                    next = null;
                } else if (iCompareTo > 0) {
                    OLrzqt(i, string2);
                    string2 = null;
                    next2 = null;
                }
            }
            this.copydefault = string;
            EZpvd(i, next.AEQbTJ, next2.AEQbTJ);
            this.copydefault = null;
        }
    }

    public final void KWHzl(C7048acV c7048acV, int i, java.lang.CharSequence charSequence, int i2) {
        C7244agF.Activity it = new C7244agF(charSequence, i2).iterator();
        while (it.hasNext()) {
            C7244agF.StateListAnimator next = it.next();
            KWHzl(c7048acV, next.copydefault, i, next.AEQbTJ);
        }
    }

    public final void KWHzl(C7048acV c7048acV, java.lang.CharSequence charSequence, int i, int i2) {
        copydefault(charSequence);
        int iAhwBna = c7048acV.AhwBna(i2);
        if (C7046acT.valueOf(iAhwBna)) {
            copydefault(i, c7048acV.valueOf, C7046acT.djBIcL(iAhwBna) + 2);
        }
        this.EZpvd.AEQbTJ(new java.lang.StringBuilder(this.KWHzl.appendCodePoint(i)));
        copydefault();
    }

    public final void copydefault(int i, java.lang.CharSequence charSequence, int i2) {
        C7244agF.Activity it = new C7244agF(charSequence, i2).iterator();
        while (it.hasNext()) {
            OLrzqt(i, it.next().copydefault);
        }
    }

    public final void OLrzqt(int i, java.lang.CharSequence charSequence) {
        UnicodeSet unicodeSet = this.EZpvd;
        java.lang.StringBuilder sbAppendCodePoint = new java.lang.StringBuilder(this.KWHzl).appendCodePoint(i);
        sbAppendCodePoint.append(charSequence);
        unicodeSet.AEQbTJ(sbAppendCodePoint);
    }

    public final void AEQbTJ(int i) {
        if (this.KWHzl.length() == 0 && this.copydefault == null) {
            this.EZpvd.KWHzl(i);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.KWHzl);
        sb.appendCodePoint(i);
        java.lang.String str = this.copydefault;
        if (str != null) {
            sb.append(str);
        }
        this.EZpvd.AEQbTJ(sb);
    }

    public final void copydefault(java.lang.CharSequence charSequence) {
        this.KWHzl.setLength(0);
        java.lang.StringBuilder sb = this.KWHzl;
        sb.append(charSequence);
        sb.reverse();
    }

    public final void copydefault() {
        this.KWHzl.setLength(0);
    }
}
