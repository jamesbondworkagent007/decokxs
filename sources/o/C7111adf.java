package o;

import com.ibm.icu.impl.Trie2;
import com.ibm.icu.text.UnicodeSet;
import o.C7244agF;

/* JADX INFO: renamed from: o.adf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7111adf {
    public Application AYXKKw;
    public UnicodeSet AhwBna;
    public boolean EZpvd;
    public UnicodeSet KWHzl;
    public C7048acV copydefault;
    public java.lang.String djBIcL;
    public UnicodeSet valueOf;
    public int AEQbTJ = 0;
    public UnicodeSet gEmmrt = new UnicodeSet();
    public java.lang.StringBuilder DbNXlk = new java.lang.StringBuilder();
    public long[] OLrzqt = new long[31];

    /* JADX INFO: renamed from: o.adf$Application */
    public interface Application {
        void OLrzqt(long j);

        void copydefault(long[] jArr, int i, int i2);
    }

    public C7111adf(UnicodeSet unicodeSet, UnicodeSet unicodeSet2, Application application, boolean z) {
        this.KWHzl = unicodeSet;
        this.valueOf = unicodeSet2;
        this.AYXKKw = application;
        this.EZpvd = z;
    }

    public void copydefault(C7048acV c7048acV) {
        if (c7048acV.OLrzqt != null) {
            this.AEQbTJ = -1;
        }
        this.copydefault = c7048acV;
        for (Trie2.TaskDescription taskDescription : c7048acV.fIwbmz) {
            if (taskDescription.EZpvd) {
                break;
            } else {
                AEQbTJ(taskDescription.KWHzl, taskDescription.OLrzqt, taskDescription.AEQbTJ, this);
            }
        }
        if (c7048acV.OLrzqt == null) {
            return;
        }
        this.gEmmrt.AYXKKw();
        this.AEQbTJ = 1;
        C7048acV c7048acV2 = c7048acV.OLrzqt;
        this.copydefault = c7048acV2;
        for (Trie2.TaskDescription taskDescription2 : c7048acV2.fIwbmz) {
            if (taskDescription2.EZpvd) {
                return;
            } else {
                AEQbTJ(taskDescription2.KWHzl, taskDescription2.OLrzqt, taskDescription2.AEQbTJ, this);
            }
        }
    }

    public final void AEQbTJ(int i, int i2, int i3, C7111adf c7111adf) {
        int i4 = c7111adf.AEQbTJ;
        if (i4 != 0) {
            if (i4 < 0) {
                if (i3 == 192) {
                    return;
                } else {
                    c7111adf.gEmmrt.EZpvd(i, i2);
                }
            } else if (i == i2) {
                if (c7111adf.gEmmrt.AEQbTJ(i)) {
                    return;
                }
            } else if (c7111adf.gEmmrt.djBIcL(i, i2)) {
                if (c7111adf.AhwBna == null) {
                    c7111adf.AhwBna = new UnicodeSet();
                }
                c7111adf.AhwBna.AYXKKw(i, i2).AEQbTJ(c7111adf.gEmmrt);
                int iDjBIcL = c7111adf.AhwBna.djBIcL();
                for (int i5 = 0; i5 < iDjBIcL; i5++) {
                    c7111adf.OLrzqt(c7111adf.AhwBna.AYXKKw(i5), c7111adf.AhwBna.djBIcL(i5), i3);
                }
            }
        }
        c7111adf.OLrzqt(i, i2, i3);
    }

    public final void OLrzqt(int i, int i2, int i3) {
        while ((i3 & 255) >= 192) {
            switch (C7046acT.fIwbmz(i3)) {
                case 0:
                    return;
                case 1:
                    Application application = this.AYXKKw;
                    if (application != null) {
                        application.OLrzqt(C7046acT.KWHzl(i3));
                        return;
                    }
                    return;
                case 2:
                    Application application2 = this.AYXKKw;
                    if (application2 != null) {
                        application2.OLrzqt(C7046acT.OLrzqt(i3));
                        return;
                    }
                    return;
                case 3:
                case 7:
                case 13:
                    throw new java.lang.AssertionError(java.lang.String.format("Unexpected CE32 tag type %d for ce32=0x%08x", java.lang.Integer.valueOf(C7046acT.fIwbmz(i3)), java.lang.Integer.valueOf(i3)));
                case 4:
                    if (this.AYXKKw != null) {
                        this.OLrzqt[0] = C7046acT.values(i3);
                        this.OLrzqt[1] = C7046acT.AkhnZx(i3);
                        this.AYXKKw.copydefault(this.OLrzqt, 0, 2);
                    }
                    if (this.DbNXlk.length() == 0) {
                        copydefault(i, i2);
                        return;
                    }
                    return;
                case 5:
                    if (this.AYXKKw != null) {
                        int iDjBIcL = C7046acT.djBIcL(i3);
                        int iDbNXlk = C7046acT.DbNXlk(i3);
                        for (int i4 = 0; i4 < iDbNXlk; i4++) {
                            this.OLrzqt[i4] = C7046acT.AEQbTJ(this.copydefault.copydefault[iDjBIcL + i4]);
                        }
                        this.AYXKKw.copydefault(this.OLrzqt, 0, iDbNXlk);
                    }
                    if (this.DbNXlk.length() == 0) {
                        copydefault(i, i2);
                        return;
                    }
                    return;
                case 6:
                    if (this.AYXKKw != null) {
                        this.AYXKKw.copydefault(this.copydefault.AEQbTJ, C7046acT.djBIcL(i3), C7046acT.DbNXlk(i3));
                    }
                    if (this.DbNXlk.length() == 0) {
                        copydefault(i, i2);
                        return;
                    }
                    return;
                case 8:
                    AEQbTJ(i, i2, i3);
                    return;
                case 9:
                    KWHzl(i, i2, i3);
                    return;
                case 10:
                    i3 = this.copydefault.copydefault[C7046acT.djBIcL(i3)];
                    break;
                case 11:
                    i3 = this.copydefault.copydefault[0];
                    break;
                case 12:
                    if (this.AYXKKw != null) {
                        C7112adg c7112adg = new C7112adg(this.copydefault);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(1);
                        for (int i5 = i; i5 <= i2; i5++) {
                            sb.setLength(0);
                            sb.appendCodePoint(i5);
                            c7112adg.KWHzl(false, sb, 0);
                            this.AYXKKw.copydefault(c7112adg.EZpvd(), 0, c7112adg.AEQbTJ() - 1);
                        }
                    }
                    if (this.DbNXlk.length() == 0) {
                        copydefault(i, i2);
                        return;
                    }
                    return;
                case 14:
                case 15:
                    return;
            }
        }
        Application application3 = this.AYXKKw;
        if (application3 != null) {
            application3.OLrzqt(C7046acT.EZpvd(i3));
        }
    }

    public final void AEQbTJ(int i, int i2, int i3) {
        int iDjBIcL = C7046acT.djBIcL(i3);
        OLrzqt(i, i2, this.copydefault.KWHzl(iDjBIcL));
        if (this.EZpvd) {
            C7244agF.Activity it = new C7244agF(this.copydefault.valueOf, iDjBIcL + 2).iterator();
            while (it.hasNext()) {
                C7244agF.StateListAnimator next = it.next();
                AEQbTJ(next.copydefault);
                copydefault(i, i2, this.KWHzl);
                copydefault(i, i2, this.valueOf);
                OLrzqt(i, i2, next.AEQbTJ);
            }
            EZpvd();
        }
    }

    public void KWHzl(int i, int i2, int i3) {
        int iDjBIcL = C7046acT.djBIcL(i3);
        if ((i3 & 256) == 0) {
            OLrzqt(i, i2, this.copydefault.KWHzl(iDjBIcL));
        }
        C7244agF.Activity it = new C7244agF(this.copydefault.valueOf, iDjBIcL + 2).iterator();
        while (it.hasNext()) {
            C7244agF.StateListAnimator next = it.next();
            this.djBIcL = next.copydefault.toString();
            copydefault(i, i2, this.KWHzl);
            if (this.DbNXlk.length() != 0) {
                copydefault(i, i2, this.valueOf);
            }
            OLrzqt(i, i2, next.AEQbTJ);
        }
        this.djBIcL = null;
    }

    public void copydefault(int i, int i2) {
        if (this.DbNXlk.length() != 0 || this.djBIcL != null) {
            copydefault(i, i2, this.valueOf);
            return;
        }
        UnicodeSet unicodeSet = this.valueOf;
        if (unicodeSet != null) {
            unicodeSet.EZpvd(i, i2);
        }
    }

    public void copydefault(int i, int i2, UnicodeSet unicodeSet) {
        if (unicodeSet == null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.DbNXlk);
        do {
            sb.appendCodePoint(i);
            java.lang.String str = this.djBIcL;
            if (str != null) {
                sb.append(str);
            }
            unicodeSet.AEQbTJ(sb);
            sb.setLength(this.DbNXlk.length());
            i++;
        } while (i <= i2);
    }

    public final void AEQbTJ(java.lang.CharSequence charSequence) {
        this.DbNXlk.setLength(0);
        java.lang.StringBuilder sb = this.DbNXlk;
        sb.append(charSequence);
        sb.reverse();
    }

    public final void EZpvd() {
        this.DbNXlk.setLength(0);
    }
}
