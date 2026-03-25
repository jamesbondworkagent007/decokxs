package o;

import com.ibm.icu.text.Normalizer;
import com.ibm.icu.text.Normalizer2;
import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.util.ICUUncheckedIOException;

/* JADX INFO: renamed from: o.aga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7265aga extends Normalizer2 {
    public Normalizer2 EZpvd;
    public UnicodeSet KWHzl;

    public C7265aga(Normalizer2 normalizer2, UnicodeSet unicodeSet) {
        this.EZpvd = normalizer2;
        this.KWHzl = unicodeSet;
    }

    @Override // com.ibm.icu.text.Normalizer2
    public java.lang.StringBuilder copydefault(java.lang.CharSequence charSequence, java.lang.StringBuilder sb) {
        if (sb == charSequence) {
            throw new java.lang.IllegalArgumentException();
        }
        sb.setLength(0);
        copydefault(charSequence, sb, UnicodeSet.SpanCondition.SIMPLE);
        return sb;
    }

    @Override // com.ibm.icu.text.Normalizer2
    public java.lang.StringBuilder EZpvd(java.lang.StringBuilder sb, java.lang.CharSequence charSequence) {
        return OLrzqt(sb, charSequence, true);
    }

    @Override // com.ibm.icu.text.Normalizer2
    public java.lang.StringBuilder OLrzqt(java.lang.StringBuilder sb, java.lang.CharSequence charSequence) {
        return OLrzqt(sb, charSequence, false);
    }

    @Override // com.ibm.icu.text.Normalizer2
    public int AEQbTJ(int i) {
        if (this.KWHzl.AEQbTJ(i)) {
            return this.EZpvd.AEQbTJ(i);
        }
        return 0;
    }

    @Override // com.ibm.icu.text.Normalizer2
    public boolean KWHzl(java.lang.CharSequence charSequence) {
        UnicodeSet.SpanCondition spanCondition = UnicodeSet.SpanCondition.SIMPLE;
        int i = 0;
        while (i < charSequence.length()) {
            int iAEQbTJ = this.KWHzl.AEQbTJ(charSequence, i, spanCondition);
            UnicodeSet.SpanCondition spanCondition2 = UnicodeSet.SpanCondition.NOT_CONTAINED;
            if (spanCondition == spanCondition2) {
                spanCondition = UnicodeSet.SpanCondition.SIMPLE;
            } else {
                if (!this.EZpvd.KWHzl(charSequence.subSequence(i, iAEQbTJ))) {
                    return false;
                }
                spanCondition = spanCondition2;
            }
            i = iAEQbTJ;
        }
        return true;
    }

    @Override // com.ibm.icu.text.Normalizer2
    public Normalizer.QuickCheckResult OLrzqt(java.lang.CharSequence charSequence) {
        Normalizer.QuickCheckResult quickCheckResult = Normalizer.DbNXlk;
        UnicodeSet.SpanCondition spanCondition = UnicodeSet.SpanCondition.SIMPLE;
        int i = 0;
        while (i < charSequence.length()) {
            int iAEQbTJ = this.KWHzl.AEQbTJ(charSequence, i, spanCondition);
            UnicodeSet.SpanCondition spanCondition2 = UnicodeSet.SpanCondition.NOT_CONTAINED;
            if (spanCondition == spanCondition2) {
                spanCondition = UnicodeSet.SpanCondition.SIMPLE;
            } else {
                Normalizer.QuickCheckResult quickCheckResultOLrzqt = this.EZpvd.OLrzqt(charSequence.subSequence(i, iAEQbTJ));
                if (quickCheckResultOLrzqt == Normalizer.fetchVPNInfo) {
                    return quickCheckResultOLrzqt;
                }
                if (quickCheckResultOLrzqt == Normalizer.valueOf) {
                    quickCheckResult = quickCheckResultOLrzqt;
                }
                spanCondition = spanCondition2;
            }
            i = iAEQbTJ;
        }
        return quickCheckResult;
    }

    @Override // com.ibm.icu.text.Normalizer2
    public int copydefault(java.lang.CharSequence charSequence) {
        UnicodeSet.SpanCondition spanCondition = UnicodeSet.SpanCondition.SIMPLE;
        int i = 0;
        while (i < charSequence.length()) {
            int iAEQbTJ = this.KWHzl.AEQbTJ(charSequence, i, spanCondition);
            UnicodeSet.SpanCondition spanCondition2 = UnicodeSet.SpanCondition.NOT_CONTAINED;
            if (spanCondition == spanCondition2) {
                spanCondition = UnicodeSet.SpanCondition.SIMPLE;
            } else {
                int iCopydefault = i + this.EZpvd.copydefault(charSequence.subSequence(i, iAEQbTJ));
                if (iCopydefault < iAEQbTJ) {
                    return iCopydefault;
                }
                spanCondition = spanCondition2;
            }
            i = iAEQbTJ;
        }
        return charSequence.length();
    }

    @Override // com.ibm.icu.text.Normalizer2
    public boolean copydefault(int i) {
        return !this.KWHzl.AEQbTJ(i) || this.EZpvd.copydefault(i);
    }

    @Override // com.ibm.icu.text.Normalizer2
    public boolean OLrzqt(int i) {
        return !this.KWHzl.AEQbTJ(i) || this.EZpvd.OLrzqt(i);
    }

    public final java.lang.Appendable copydefault(java.lang.CharSequence charSequence, java.lang.Appendable appendable, UnicodeSet.SpanCondition spanCondition) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        while (i < charSequence.length()) {
            try {
                int iAEQbTJ = this.KWHzl.AEQbTJ(charSequence, i, spanCondition);
                int i2 = iAEQbTJ - i;
                UnicodeSet.SpanCondition spanCondition2 = UnicodeSet.SpanCondition.NOT_CONTAINED;
                if (spanCondition == spanCondition2) {
                    if (i2 != 0) {
                        appendable.append(charSequence, i, iAEQbTJ);
                    }
                    spanCondition = UnicodeSet.SpanCondition.SIMPLE;
                } else {
                    if (i2 != 0) {
                        appendable.append(this.EZpvd.copydefault(charSequence.subSequence(i, iAEQbTJ), sb));
                    }
                    spanCondition = spanCondition2;
                }
                i = iAEQbTJ;
            } catch (java.io.IOException e) {
                throw new ICUUncheckedIOException(e);
            }
        }
        return appendable;
    }

    private java.lang.StringBuilder OLrzqt(java.lang.StringBuilder sb, java.lang.CharSequence charSequence, boolean z) {
        if (sb == charSequence) {
            throw new java.lang.IllegalArgumentException();
        }
        if (sb.length() == 0) {
            if (z) {
                return copydefault(charSequence, sb);
            }
            sb.append(charSequence);
            return sb;
        }
        UnicodeSet unicodeSet = this.KWHzl;
        UnicodeSet.SpanCondition spanCondition = UnicodeSet.SpanCondition.SIMPLE;
        int iAEQbTJ = unicodeSet.AEQbTJ(charSequence, 0, spanCondition);
        if (iAEQbTJ != 0) {
            java.lang.CharSequence charSequenceSubSequence = charSequence.subSequence(0, iAEQbTJ);
            int iCopydefault = this.KWHzl.copydefault(sb, Integer.MAX_VALUE, spanCondition);
            if (iCopydefault != 0) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(sb.subSequence(iCopydefault, sb.length()));
                if (z) {
                    this.EZpvd.EZpvd(sb2, charSequenceSubSequence);
                } else {
                    this.EZpvd.OLrzqt(sb2, charSequenceSubSequence);
                }
                sb.delete(iCopydefault, Integer.MAX_VALUE).append((java.lang.CharSequence) sb2);
            } else if (z) {
                this.EZpvd.EZpvd(sb, charSequenceSubSequence);
            } else {
                this.EZpvd.OLrzqt(sb, charSequenceSubSequence);
            }
        }
        if (iAEQbTJ < charSequence.length()) {
            java.lang.CharSequence charSequenceSubSequence2 = charSequence.subSequence(iAEQbTJ, charSequence.length());
            if (z) {
                copydefault(charSequenceSubSequence2, sb, UnicodeSet.SpanCondition.NOT_CONTAINED);
            } else {
                sb.append(charSequenceSubSequence2);
            }
        }
        return sb;
    }
}
