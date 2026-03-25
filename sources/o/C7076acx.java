package o;

import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.BytesTrie;
import com.ibm.icu.util.StringTrieBuilder;
import com.ibm.icu.util.ULocale;
import java.text.CharacterIterator;

/* JADX INFO: renamed from: o.acx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7076acx extends AbstractC7192afG {
    public AbstractC7192afG AEQbTJ;
    public AbstractC7239agA KWHzl;
    public C7244agF OLrzqt;
    public C7244agF copydefault;

    public C7076acx(AbstractC7192afG abstractC7192afG, C7244agF c7244agF, C7244agF c7244agF2) {
        this.AEQbTJ = abstractC7192afG;
        this.copydefault = c7244agF;
        this.OLrzqt = c7244agF2;
    }

    public final void OLrzqt() {
        this.KWHzl = AbstractC7239agA.copydefault((CharacterIterator) this.AEQbTJ.copydefault().clone());
    }

    public final boolean AEQbTJ(int i) {
        C7244agF c7244agF;
        this.KWHzl.copydefault(i);
        this.OLrzqt.OLrzqt();
        if (this.KWHzl.AYXKKw() != 32) {
            this.KWHzl.valueOf();
        }
        BytesTrie.Result resultAEQbTJ = BytesTrie.Result.INTERMEDIATE_VALUE;
        int iEZpvd = -1;
        int iEZpvd2 = -1;
        while (true) {
            int iAYXKKw = this.KWHzl.AYXKKw();
            if (iAYXKKw == -1) {
                break;
            }
            resultAEQbTJ = this.OLrzqt.AEQbTJ(iAYXKKw);
            if (!resultAEQbTJ.hasNext()) {
                break;
            }
            if (resultAEQbTJ.hasValue()) {
                iEZpvd = this.KWHzl.EZpvd();
                iEZpvd2 = this.OLrzqt.EZpvd();
            }
        }
        if (resultAEQbTJ.matches()) {
            iEZpvd2 = this.OLrzqt.EZpvd();
            iEZpvd = this.KWHzl.EZpvd();
        }
        if (iEZpvd < 0) {
            return false;
        }
        if (iEZpvd2 == 2) {
            return true;
        }
        if (iEZpvd2 != 1 || (c7244agF = this.copydefault) == null) {
            return false;
        }
        c7244agF.OLrzqt();
        BytesTrie.Result resultAEQbTJ2 = BytesTrie.Result.INTERMEDIATE_VALUE;
        this.KWHzl.copydefault(iEZpvd);
        do {
            int iValueOf = this.KWHzl.valueOf();
            if (iValueOf == -1) {
                break;
            }
            resultAEQbTJ2 = this.copydefault.AEQbTJ(iValueOf);
        } while (resultAEQbTJ2.hasNext());
        return resultAEQbTJ2.matches();
    }

    public final int copydefault(int i) {
        if (i != -1 && this.OLrzqt != null) {
            OLrzqt();
            int iAEQbTJ = this.KWHzl.AEQbTJ();
            while (i != -1 && i != iAEQbTJ && AEQbTJ(i)) {
                i = this.AEQbTJ.KWHzl();
            }
        }
        return i;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C7076acx c7076acx = (C7076acx) obj;
        return this.AEQbTJ.equals(c7076acx.AEQbTJ) && this.KWHzl.equals(c7076acx.KWHzl) && this.OLrzqt.equals(c7076acx.OLrzqt) && this.copydefault.equals(c7076acx.copydefault);
    }

    public int hashCode() {
        return (this.copydefault.hashCode() * 39) + (this.OLrzqt.hashCode() * 11) + this.AEQbTJ.hashCode();
    }

    @Override // o.AbstractC7192afG
    public java.lang.Object clone() {
        return (C7076acx) super.clone();
    }

    @Override // o.AbstractC7192afG
    public int EZpvd() {
        return this.AEQbTJ.EZpvd();
    }

    @Override // o.AbstractC7192afG
    public int KWHzl() {
        return copydefault(this.AEQbTJ.KWHzl());
    }

    @Override // o.AbstractC7192afG
    public CharacterIterator copydefault() {
        return this.AEQbTJ.copydefault();
    }

    @Override // o.AbstractC7192afG
    public void OLrzqt(CharacterIterator characterIterator) {
        this.AEQbTJ.OLrzqt(characterIterator);
    }

    /* JADX INFO: renamed from: o.acx$TaskDescription */
    public static class TaskDescription extends AbstractC7267agc {
        public java.util.HashSet<java.lang.CharSequence> AEQbTJ = new java.util.HashSet<>();

        public TaskDescription(ULocale uLocale) {
            ICUResourceBundle iCUResourceBundleGEmmrt = ICUResourceBundle.OLrzqt("com/ibm/icu/impl/data/icudt68b/brkitr", uLocale, ICUResourceBundle.OpenType.LOCALE_ROOT).gEmmrt("exceptions/SentenceBreak");
            if (iCUResourceBundleGEmmrt != null) {
                int iFARcdN = iCUResourceBundleGEmmrt.fARcdN();
                for (int i = 0; i < iFARcdN; i++) {
                    this.AEQbTJ.add(((ICUResourceBundle) iCUResourceBundleGEmmrt.KWHzl(i)).getFieldNames());
                }
            }
        }

        public TaskDescription() {
        }

        @Override // o.AbstractC7267agc
        public AbstractC7192afG KWHzl(AbstractC7192afG abstractC7192afG) {
            boolean z;
            boolean z2;
            int i;
            if (this.AEQbTJ.isEmpty()) {
                return abstractC7192afG;
            }
            C7251agM c7251agM = new C7251agM();
            C7251agM c7251agM2 = new C7251agM();
            int size = this.AEQbTJ.size();
            java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[size];
            int[] iArr = new int[size];
            java.util.Iterator<java.lang.CharSequence> it = this.AEQbTJ.iterator();
            int i2 = 0;
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                charSequenceArr[i2] = it.next();
                iArr[i2] = 0;
                i2++;
            }
            int i3 = 0;
            int i4 = 0;
            while (i3 < size) {
                java.lang.String string = charSequenceArr[i3].toString();
                int iIndexOf = string.indexOf(46);
                if (iIndexOf <= -1 || (i = iIndexOf + 1) == string.length()) {
                    z2 = z;
                } else {
                    int i5 = -1;
                    for (int i6 = 0; i6 < size; i6++) {
                        if (i6 != i3 && string.regionMatches(0, charSequenceArr[i6].toString(), 0, i)) {
                            int i7 = iArr[i6];
                            if (i7 == 0) {
                                iArr[i6] = 3;
                            } else if ((i7 & 1) != 0) {
                                i5 = i6;
                            }
                        }
                    }
                    if (i5 == -1 && iArr[i3] == 0) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(string.substring(0, i));
                        sb.reverse();
                        z2 = true;
                        c7251agM.EZpvd(sb, 1);
                        i4++;
                        iArr[i3] = 3;
                    } else {
                        z2 = true;
                    }
                }
                i3++;
                z = z2;
            }
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                java.lang.String string2 = charSequenceArr[i9].toString();
                if (iArr[i9] == 0) {
                    c7251agM.EZpvd(new java.lang.StringBuilder(string2).reverse(), 2);
                    i4++;
                } else {
                    c7251agM2.EZpvd(string2, 2);
                    i8++;
                }
            }
            return new C7076acx(abstractC7192afG, i8 > 0 ? c7251agM2.copydefault(StringTrieBuilder.Option.FAST) : null, i4 > 0 ? c7251agM.copydefault(StringTrieBuilder.Option.FAST) : null);
        }
    }
}
