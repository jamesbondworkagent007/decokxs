package o;

import com.huawei.hms.framework.common.ContainerUtils;
import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.util.ICUException;
import com.ibm.icu.util.ULocale;
import java.util.MissingResourceException;

/* JADX INFO: renamed from: o.afU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7206afU implements java.util.Comparator<java.lang.Object>, InterfaceC7248agJ<AbstractC7206afU>, java.lang.Cloneable {
    public static final java.lang.String[] EZpvd = {"collation"};
    public static final boolean KWHzl = C7060ach.AEQbTJ("collator");
    public static TaskDescription copydefault;

    /* JADX INFO: renamed from: o.afU$TaskDescription */
    public static abstract class TaskDescription {
        public abstract AbstractC7206afU copydefault(ULocale uLocale);
    }

    public int EZpvd() {
        return 2;
    }

    public abstract int copydefault(java.lang.String str, java.lang.String str2);

    public boolean copydefault() {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(java.lang.Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass());
    }

    private void KWHzl() {
        if (copydefault()) {
            throw new java.lang.UnsupportedOperationException("Attempt to modify frozen Collator");
        }
    }

    public void EZpvd(int i) {
        KWHzl();
    }

    public void KWHzl(int i) {
        KWHzl();
    }

    public void OLrzqt(int... iArr) {
        throw new java.lang.UnsupportedOperationException("Needs to be implemented by the subclass.");
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }

    public static TaskDescription OLrzqt() {
        if (copydefault == null) {
            try {
                copydefault = (TaskDescription) java.lang.Class.forName("o.afQ").newInstance();
            } catch (MissingResourceException e) {
                throw e;
            } catch (java.lang.Exception e2) {
                if (KWHzl) {
                    e2.printStackTrace();
                }
                throw new ICUException(e2);
            }
        }
        return copydefault;
    }

    /* JADX INFO: renamed from: o.afU$ActionBar */
    public static final class ActionBar {
        private ActionBar() {
        }

        public static boolean copydefault(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
            int length = charSequence.length();
            if (length != charSequence2.length()) {
                return false;
            }
            for (int i = 0; i < length; i++) {
                char cCharAt = charSequence.charAt(i);
                char cCharAt2 = charSequence2.charAt(i);
                if (cCharAt != cCharAt2) {
                    if ('A' > cCharAt || cCharAt > 'Z') {
                        if ('A' > cCharAt2 || cCharAt2 > 'Z' || cCharAt2 + ' ' != cCharAt) {
                            return false;
                        }
                    } else if (cCharAt + ' ' != cCharAt2) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static final boolean OLrzqt(java.lang.String str, java.lang.String str2) {
        if (ActionBar.copydefault(str2, "yes")) {
            return true;
        }
        if (ActionBar.copydefault(str2, "no")) {
            return false;
        }
        throw new java.lang.IllegalArgumentException("illegal locale keyword=value: " + str + ContainerUtils.KEY_VALUE_DELIMITER + str2);
    }

    public static final int copydefault(java.lang.String str, java.lang.String str2, java.lang.String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (ActionBar.copydefault(str2, strArr[i])) {
                return i;
            }
        }
        throw new java.lang.IllegalArgumentException("illegal locale keyword=value: " + str + ContainerUtils.KEY_VALUE_DELIMITER + str2);
    }

    public static final int EZpvd(java.lang.String str, java.lang.String str2) {
        return copydefault(str, str2, "space", "punct", "symbol", "currency", "digit") + 4096;
    }

    public static void copydefault(ULocale uLocale, AbstractC7206afU abstractC7206afU, C7286agv c7286agv) {
        int iEZpvd;
        if (uLocale.getKeywordValue("colHiraganaQuaternary") != null) {
            throw new java.lang.UnsupportedOperationException("locale keyword kh/colHiraganaQuaternary");
        }
        if (uLocale.getKeywordValue("variableTop") != null) {
            throw new java.lang.UnsupportedOperationException("locale keyword vt/variableTop");
        }
        java.lang.String keywordValue = uLocale.getKeywordValue("colStrength");
        if (keywordValue != null) {
            int iCopydefault = copydefault("colStrength", keywordValue, "primary", "secondary", "tertiary", "quaternary", "identical");
            if (iCopydefault > 3) {
                iCopydefault = 15;
            }
            abstractC7206afU.EZpvd(iCopydefault);
        }
        java.lang.String keywordValue2 = uLocale.getKeywordValue("colBackwards");
        if (keywordValue2 != null) {
            if (c7286agv != null) {
                c7286agv.EZpvd(OLrzqt("colBackwards", keywordValue2));
            } else {
                throw new java.lang.UnsupportedOperationException("locale keyword kb/colBackwards only settable for RuleBasedCollator");
            }
        }
        java.lang.String keywordValue3 = uLocale.getKeywordValue("colCaseLevel");
        if (keywordValue3 != null) {
            if (c7286agv != null) {
                c7286agv.KWHzl(OLrzqt("colCaseLevel", keywordValue3));
            } else {
                throw new java.lang.UnsupportedOperationException("locale keyword kb/colBackwards only settable for RuleBasedCollator");
            }
        }
        java.lang.String keywordValue4 = uLocale.getKeywordValue("colCaseFirst");
        if (keywordValue4 != null) {
            if (c7286agv != null) {
                int iCopydefault2 = copydefault("colCaseFirst", keywordValue4, "no", "lower", "upper");
                if (iCopydefault2 == 0) {
                    c7286agv.OLrzqt(false);
                    c7286agv.valueOf(false);
                } else if (iCopydefault2 == 1) {
                    c7286agv.OLrzqt(true);
                } else {
                    c7286agv.valueOf(true);
                }
            } else {
                throw new java.lang.UnsupportedOperationException("locale keyword kf/colCaseFirst only settable for RuleBasedCollator");
            }
        }
        java.lang.String keywordValue5 = uLocale.getKeywordValue("colAlternate");
        if (keywordValue5 != null) {
            if (c7286agv != null) {
                c7286agv.AEQbTJ(copydefault("colAlternate", keywordValue5, "non-ignorable", "shifted") != 0);
            } else {
                throw new java.lang.UnsupportedOperationException("locale keyword ka/colAlternate only settable for RuleBasedCollator");
            }
        }
        java.lang.String keywordValue6 = uLocale.getKeywordValue("colNormalization");
        if (keywordValue6 != null) {
            abstractC7206afU.KWHzl(OLrzqt("colNormalization", keywordValue6) ? 17 : 16);
        }
        java.lang.String keywordValue7 = uLocale.getKeywordValue("colNumeric");
        if (keywordValue7 != null) {
            if (c7286agv != null) {
                c7286agv.copydefault(OLrzqt("colNumeric", keywordValue7));
            } else {
                throw new java.lang.UnsupportedOperationException("locale keyword kn/colNumeric only settable for RuleBasedCollator");
            }
        }
        java.lang.String keywordValue8 = uLocale.getKeywordValue("colReorder");
        if (keywordValue8 != null) {
            int[] iArr = new int[198];
            int i = 0;
            int i2 = 0;
            while (i != 198) {
                int i3 = i2;
                while (i3 < keywordValue8.length() && keywordValue8.charAt(i3) != '-') {
                    i3++;
                }
                java.lang.String strSubstring = keywordValue8.substring(i2, i3);
                if (strSubstring.length() == 4) {
                    iEZpvd = C7223afl.KWHzl(4106, strSubstring);
                } else {
                    iEZpvd = EZpvd("colReorder", strSubstring);
                }
                int i4 = i + 1;
                iArr[i] = iEZpvd;
                if (i3 != keywordValue8.length()) {
                    i2 = i3 + 1;
                    i = i4;
                } else {
                    if (i4 == 0) {
                        throw new java.lang.IllegalArgumentException("no script codes for colReorder locale keyword");
                    }
                    int[] iArr2 = new int[i4];
                    java.lang.System.arraycopy(iArr, 0, iArr2, 0, i4);
                    abstractC7206afU.OLrzqt(iArr2);
                }
            }
            throw new java.lang.IllegalArgumentException("too many script codes for colReorder locale keyword: " + keywordValue8);
        }
        java.lang.String keywordValue9 = uLocale.getKeywordValue("kv");
        if (keywordValue9 != null) {
            abstractC7206afU.copydefault(EZpvd("kv", keywordValue9));
        }
    }

    public static final AbstractC7206afU KWHzl(ULocale uLocale) {
        if (uLocale == null) {
            uLocale = ULocale.getDefault();
        }
        AbstractC7206afU abstractC7206afUCopydefault = OLrzqt().copydefault(uLocale);
        if (!uLocale.getName().equals(uLocale.getBaseName())) {
            copydefault(uLocale, abstractC7206afUCopydefault, abstractC7206afUCopydefault instanceof C7286agv ? (C7286agv) abstractC7206afUCopydefault : null);
        }
        return abstractC7206afUCopydefault;
    }

    public static final AbstractC7206afU copydefault(java.util.Locale locale) {
        return KWHzl(ULocale.forLocale(locale));
    }

    public UnicodeSet AEQbTJ() {
        return new UnicodeSet(0, 1114111);
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return AEQbTJ((java.lang.CharSequence) obj, (java.lang.CharSequence) obj2);
    }

    @java.lang.Deprecated
    public int AEQbTJ(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        return copydefault(charSequence.toString(), charSequence2.toString());
    }

    public AbstractC7206afU copydefault(int i) {
        throw new java.lang.UnsupportedOperationException("Needs to be implemented by the subclass.");
    }
}
