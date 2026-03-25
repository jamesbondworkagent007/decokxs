package com.ibm.icu.impl.number;

import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.impl.StandardPlural;
import com.ibm.icu.text.CompactDecimalFormat;
import com.ibm.icu.util.ICUException;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.C7043acQ;
import o.InterfaceC7177aes;

/* JADX INFO: loaded from: classes3.dex */
public class CompactData implements InterfaceC7177aes {
    public final String[] EZpvd = new String[StandardPlural.COUNT * 16];
    public final byte[] AEQbTJ = new byte[16];
    public byte copydefault = 0;
    public boolean OLrzqt = true;

    public enum CompactType {
        DECIMAL,
        CURRENCY
    }

    public void KWHzl(ULocale uLocale, String str, CompactDecimalFormat.CompactStyle compactStyle, CompactType compactType) {
        StateListAnimator stateListAnimator = new StateListAnimator(this);
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", uLocale);
        boolean zEquals = str.equals("latn");
        CompactDecimalFormat.CompactStyle compactStyle2 = CompactDecimalFormat.CompactStyle.SHORT;
        boolean z = compactStyle == compactStyle2;
        StringBuilder sb = new StringBuilder();
        KWHzl(str, compactStyle, compactType, sb);
        iCUResourceBundle.EZpvd(sb.toString(), stateListAnimator);
        if (this.OLrzqt && !zEquals) {
            KWHzl("latn", compactStyle, compactType, sb);
            iCUResourceBundle.EZpvd(sb.toString(), stateListAnimator);
        }
        if (this.OLrzqt && !z) {
            KWHzl(str, compactStyle2, compactType, sb);
            iCUResourceBundle.EZpvd(sb.toString(), stateListAnimator);
        }
        if (this.OLrzqt && !zEquals && !z) {
            KWHzl("latn", compactStyle2, compactType, sb);
            iCUResourceBundle.EZpvd(sb.toString(), stateListAnimator);
        }
        if (this.OLrzqt) {
            throw new ICUException("Could not load compact decimal data for locale " + uLocale);
        }
    }

    public static void KWHzl(String str, CompactDecimalFormat.CompactStyle compactStyle, CompactType compactType, StringBuilder sb) {
        sb.setLength(0);
        sb.append("NumberElements/");
        sb.append(str);
        sb.append(compactStyle == CompactDecimalFormat.CompactStyle.SHORT ? "/patternsShort" : "/patternsLong");
        sb.append(compactType == CompactType.DECIMAL ? "/decimalFormat" : "/currencyFormat");
    }

    public void AEQbTJ(Map<String, Map<String, String>> map) {
        Iterator<Map.Entry<String, Map<String, String>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            byte length = (byte) (r0.getKey().length() - 1);
            for (Map.Entry<String, String> entry : it.next().getValue().entrySet()) {
                String string = entry.getKey().toString();
                if (!"0".equals(string) && !"1".equals(string)) {
                    StandardPlural standardPluralFromString = StandardPlural.fromString(string);
                    String string2 = entry.getValue().toString();
                    this.EZpvd[KWHzl(length, standardPluralFromString)] = string2;
                    if (KWHzl(string2) > 0) {
                        this.AEQbTJ[length] = (byte) ((r2 - length) - 1);
                        if (length > this.copydefault) {
                            this.copydefault = length;
                        }
                        this.OLrzqt = false;
                    }
                }
            }
        }
    }

    @Override // o.InterfaceC7177aes
    public int OLrzqt(int i) {
        if (i < 0) {
            return 0;
        }
        byte b = this.copydefault;
        if (i > b) {
            i = b;
        }
        return this.AEQbTJ[i];
    }

    public String copydefault(int i, StandardPlural standardPlural) {
        StandardPlural standardPlural2;
        if (i < 0) {
            return null;
        }
        byte b = this.copydefault;
        if (i > b) {
            i = b;
        }
        String str = this.EZpvd[KWHzl(i, standardPlural)];
        if (str == null && standardPlural != (standardPlural2 = StandardPlural.OTHER)) {
            str = this.EZpvd[KWHzl(i, standardPlural2)];
        }
        if (str == "<USE FALLBACK>") {
            return null;
        }
        return str;
    }

    public void AEQbTJ(Set<String> set) {
        set.addAll(Arrays.asList(this.EZpvd));
        set.remove("<USE FALLBACK>");
        set.remove(null);
    }

    public static final class StateListAnimator extends C7043acQ.ActionBar {
        public CompactData KWHzl;

        public StateListAnimator(CompactData compactData) {
            this.KWHzl = compactData;
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            int iKWHzl;
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                byte length = (byte) (application.length() - 1);
                byte b = this.KWHzl.AEQbTJ[length];
                C7043acQ.StateListAnimator stateListAnimatorValueOf2 = taskDescription.valueOf();
                for (int i2 = 0; stateListAnimatorValueOf2.AEQbTJ(i2, application, taskDescription); i2++) {
                    if (!"0".equals(application.toString()) && !"1".equals(application.toString())) {
                        StandardPlural standardPluralFromString = StandardPlural.fromString(application.toString());
                        if (this.KWHzl.EZpvd[CompactData.KWHzl(length, standardPluralFromString)] == null) {
                            String string = taskDescription.toString();
                            if (string.equals("0")) {
                                string = "<USE FALLBACK>";
                            }
                            this.KWHzl.EZpvd[CompactData.KWHzl(length, standardPluralFromString)] = string;
                            if (b == 0 && (iKWHzl = CompactData.KWHzl(string)) > 0) {
                                b = (byte) ((iKWHzl - length) - 1);
                            }
                        }
                    }
                }
                if (this.KWHzl.AEQbTJ[length] == 0) {
                    this.KWHzl.AEQbTJ[length] = b;
                    if (length > this.KWHzl.copydefault) {
                        this.KWHzl.copydefault = length;
                    }
                    this.KWHzl.OLrzqt = false;
                }
            }
        }
    }

    public static final int KWHzl(int i, StandardPlural standardPlural) {
        return (i * StandardPlural.COUNT) + standardPlural.ordinal();
    }

    public static final int KWHzl(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) != '0') {
                if (i > 0) {
                    break;
                }
            } else {
                i++;
            }
        }
        return i;
    }
}
