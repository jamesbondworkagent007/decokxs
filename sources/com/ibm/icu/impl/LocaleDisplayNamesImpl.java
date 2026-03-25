package com.ibm.icu.impl;

import com.google.android.exoplayer2.C;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ibm.icu.impl.CurrencyData;
import com.ibm.icu.text.DisplayContext;
import com.ibm.icu.text.LocaleDisplayNames;
import com.ibm.icu.util.ULocale;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.AbstractC7192afG;
import o.AbstractC7200afO;
import o.C7028acB;
import o.C7090adK;
import o.C7223afl;

/* JADX INFO: loaded from: classes22.dex */
public class LocaleDisplayNamesImpl extends LocaleDisplayNames {
    public static final Map<String, CapitalizationContextUsage> AEQbTJ;
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public static final AbstractC7200afO.Application copydefault;
    public final LocaleDisplayNames.DialectHandling AYXKKw;
    public final CurrencyData.TaskDescription AhwBna;
    public final char AkhnZx;
    public final DisplayContext AuCTel;
    public final char DbNXlk;
    public final DisplayContext KWHzl;
    public transient AbstractC7192afG OLrzqt;
    public final char djBIcL;
    public final ActionBar ejfBZ;
    public final DisplayContext fARcdN;
    public final ULocale fIwbmz;
    public final String fJNWhG;
    public final ActionBar fetchVPNInfo;
    public boolean[] gEmmrt;
    public final char isConnected;
    public final String valueOf;
    public final String values;

    public enum CapitalizationContextUsage {
        LANGUAGE,
        SCRIPT,
        TERRITORY,
        VARIANT,
        KEY,
        KEYVALUE
    }

    public enum DataTableType {
        LANG,
        REGION
    }

    static {
        HashMap map = new HashMap();
        AEQbTJ = map;
        map.put("languages", CapitalizationContextUsage.LANGUAGE);
        map.put("script", CapitalizationContextUsage.SCRIPT);
        map.put("territory", CapitalizationContextUsage.TERRITORY);
        map.put("variant", CapitalizationContextUsage.VARIANT);
        map.put(JwtUtilsKt.DID_METHOD_KEY, CapitalizationContextUsage.KEY);
        map.put("keyValue", CapitalizationContextUsage.KEYVALUE);
        copydefault = AbstractC7200afO.AEQbTJ().KWHzl().copydefault();
    }

    public final String AEQbTJ(CapitalizationContextUsage capitalizationContextUsage, String str) {
        String strAEQbTJ;
        boolean[] zArr;
        if (str == null || str.length() <= 0 || !C7223afl.fetchVPNInfo(str.codePointAt(0)) || (this.KWHzl != DisplayContext.CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE && ((zArr = this.gEmmrt) == null || !zArr[capitalizationContextUsage.ordinal()]))) {
            return str;
        }
        synchronized (this) {
            if (this.OLrzqt == null) {
                this.OLrzqt = AbstractC7192afG.copydefault(this.fIwbmz);
            }
            strAEQbTJ = C7223afl.AEQbTJ(this.fIwbmz, str, this.OLrzqt, 768);
        }
        return strAEQbTJ;
    }

    @Override // com.ibm.icu.text.LocaleDisplayNames
    public String OLrzqt(ULocale uLocale) {
        return AEQbTJ(uLocale);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String AEQbTJ(ULocale uLocale) {
        String strEZpvd;
        String language = uLocale.getLanguage();
        if (language.isEmpty()) {
            language = C.LANGUAGE_UNDETERMINED;
        }
        String script = uLocale.getScript();
        String country = uLocale.getCountry();
        String variant = uLocale.getVariant();
        boolean z = script.length() > 0;
        boolean z2 = country.length() > 0;
        boolean z3 = variant.length() > 0;
        if (this.AYXKKw != LocaleDisplayNames.DialectHandling.DIALECT_NAMES) {
            strEZpvd = null;
        } else if (z && z2) {
            String str = language + '_' + script + '_' + country;
            strEZpvd = EZpvd(str);
            if (strEZpvd != null && !strEZpvd.equals(str)) {
                z = false;
                z2 = false;
            }
        } else if (z) {
            String str2 = language + '_' + script;
            strEZpvd = EZpvd(str2);
            if (strEZpvd != null && !strEZpvd.equals(str2)) {
                z = false;
            } else if (z2) {
                String str3 = language + '_' + country;
                strEZpvd = EZpvd(str3);
                if (strEZpvd != null && !strEZpvd.equals(str3)) {
                    z2 = false;
                }
            }
        }
        if (strEZpvd == null) {
            String strEZpvd2 = EZpvd(language);
            if (strEZpvd2 == null) {
                return null;
            }
            strEZpvd = strEZpvd2.replace(this.DbNXlk, this.isConnected).replace(this.djBIcL, this.AkhnZx);
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            String strOLrzqt = OLrzqt(script, true);
            if (strOLrzqt == null) {
                return null;
            }
            sb.append(strOLrzqt.replace(this.DbNXlk, this.isConnected).replace(this.djBIcL, this.AkhnZx));
        }
        if (z2) {
            String strCopydefault = copydefault(country, true);
            if (strCopydefault == null) {
                return null;
            }
            EZpvd(strCopydefault.replace(this.DbNXlk, this.isConnected).replace(this.djBIcL, this.AkhnZx), sb);
        }
        if (z3) {
            String strKWHzl = KWHzl(variant, true);
            if (strKWHzl == null) {
                return null;
            }
            EZpvd(strKWHzl.replace(this.DbNXlk, this.isConnected).replace(this.djBIcL, this.AkhnZx), sb);
        }
        Iterator<String> keywords = uLocale.getKeywords();
        if (keywords != null) {
            while (keywords.hasNext()) {
                String next = keywords.next();
                String keywordValue = uLocale.getKeywordValue(next);
                String strEZpvd3 = EZpvd(next, true);
                if (strEZpvd3 == null) {
                    return null;
                }
                String strReplace = strEZpvd3.replace(this.DbNXlk, this.isConnected).replace(this.djBIcL, this.AkhnZx);
                String strKWHzl2 = KWHzl(next, keywordValue, true);
                if (strKWHzl2 == null) {
                    return null;
                }
                String strReplace2 = strKWHzl2.replace(this.DbNXlk, this.isConnected).replace(this.djBIcL, this.AkhnZx);
                if (!strReplace2.equals(keywordValue)) {
                    EZpvd(strReplace2, sb);
                } else if (!next.equals(strReplace)) {
                    EZpvd(C7028acB.EZpvd(this.values, strReplace, strReplace2), sb);
                } else {
                    StringBuilder sbEZpvd = EZpvd(strReplace, sb);
                    sbEZpvd.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sbEZpvd.append(strReplace2);
                }
            }
        }
        String string = sb.length() > 0 ? sb.toString() : null;
        if (string != null) {
            strEZpvd = C7028acB.EZpvd(this.valueOf, strEZpvd, string);
        }
        return AEQbTJ(CapitalizationContextUsage.LANGUAGE, strEZpvd);
    }

    public final String EZpvd(String str) {
        String strOLrzqt;
        return (this.fARcdN != DisplayContext.LENGTH_SHORT || (strOLrzqt = this.fetchVPNInfo.OLrzqt("Languages%short", str)) == null || strOLrzqt.equals(str)) ? this.fetchVPNInfo.OLrzqt("Languages", str) : strOLrzqt;
    }

    @Override // com.ibm.icu.text.LocaleDisplayNames
    public String AEQbTJ(String str) {
        String strOLrzqt;
        if (str.equals("root") || str.indexOf(95) != -1) {
            if (this.AuCTel == DisplayContext.SUBSTITUTE) {
                return str;
            }
            return null;
        }
        if (this.fARcdN == DisplayContext.LENGTH_SHORT && (strOLrzqt = this.fetchVPNInfo.OLrzqt("Languages%short", str)) != null && !strOLrzqt.equals(str)) {
            return AEQbTJ(CapitalizationContextUsage.LANGUAGE, strOLrzqt);
        }
        return AEQbTJ(CapitalizationContextUsage.LANGUAGE, this.fetchVPNInfo.OLrzqt("Languages", str));
    }

    @Override // com.ibm.icu.text.LocaleDisplayNames
    public String OLrzqt(String str) {
        String strOLrzqt;
        String strOLrzqt2 = this.fetchVPNInfo.OLrzqt("Scripts%stand-alone", str);
        if (strOLrzqt2 == null || strOLrzqt2.equals(str)) {
            if (this.fARcdN == DisplayContext.LENGTH_SHORT && (strOLrzqt = this.fetchVPNInfo.OLrzqt("Scripts%short", str)) != null && !strOLrzqt.equals(str)) {
                return AEQbTJ(CapitalizationContextUsage.SCRIPT, strOLrzqt);
            }
            strOLrzqt2 = this.fetchVPNInfo.OLrzqt("Scripts", str);
        }
        return AEQbTJ(CapitalizationContextUsage.SCRIPT, strOLrzqt2);
    }

    public final String OLrzqt(String str, boolean z) {
        String strOLrzqt;
        if (this.fARcdN == DisplayContext.LENGTH_SHORT && (strOLrzqt = this.fetchVPNInfo.OLrzqt("Scripts%short", str)) != null && !strOLrzqt.equals(str)) {
            return z ? strOLrzqt : AEQbTJ(CapitalizationContextUsage.SCRIPT, strOLrzqt);
        }
        String strOLrzqt2 = this.fetchVPNInfo.OLrzqt("Scripts", str);
        return z ? strOLrzqt2 : AEQbTJ(CapitalizationContextUsage.SCRIPT, strOLrzqt2);
    }

    @Override // com.ibm.icu.text.LocaleDisplayNames
    public String djBIcL(String str) {
        return OLrzqt(str, false);
    }

    public final String copydefault(String str, boolean z) {
        String strOLrzqt;
        if (this.fARcdN == DisplayContext.LENGTH_SHORT && (strOLrzqt = this.ejfBZ.OLrzqt("Countries%short", str)) != null && !strOLrzqt.equals(str)) {
            return z ? strOLrzqt : AEQbTJ(CapitalizationContextUsage.TERRITORY, strOLrzqt);
        }
        String strOLrzqt2 = this.ejfBZ.OLrzqt("Countries", str);
        return z ? strOLrzqt2 : AEQbTJ(CapitalizationContextUsage.TERRITORY, strOLrzqt2);
    }

    @Override // com.ibm.icu.text.LocaleDisplayNames
    public String KWHzl(String str) {
        return copydefault(str, false);
    }

    public final String KWHzl(String str, boolean z) {
        String strOLrzqt = this.fetchVPNInfo.OLrzqt("Variants", str);
        return z ? strOLrzqt : AEQbTJ(CapitalizationContextUsage.VARIANT, strOLrzqt);
    }

    @Override // com.ibm.icu.text.LocaleDisplayNames
    public String AYXKKw(String str) {
        return KWHzl(str, false);
    }

    public final String EZpvd(String str, boolean z) {
        String strOLrzqt = this.fetchVPNInfo.OLrzqt("Keys", str);
        return z ? strOLrzqt : AEQbTJ(CapitalizationContextUsage.KEY, strOLrzqt);
    }

    @Override // com.ibm.icu.text.LocaleDisplayNames
    public String copydefault(String str) {
        return EZpvd(str, false);
    }

    public final String KWHzl(String str, String str2, boolean z) {
        String strKWHzl;
        if (str.equals("currency")) {
            String strCopydefault = this.AhwBna.copydefault(C7090adK.valueOf(str2));
            if (strCopydefault != null) {
                str2 = strCopydefault;
            }
        } else {
            if (this.fARcdN != DisplayContext.LENGTH_SHORT || (strKWHzl = this.fetchVPNInfo.KWHzl("Types%short", str, str2)) == null || strKWHzl.equals(str2)) {
                strKWHzl = null;
            }
            str2 = strKWHzl == null ? this.fetchVPNInfo.KWHzl("Types", str, str2) : strKWHzl;
        }
        return z ? str2 : AEQbTJ(CapitalizationContextUsage.KEYVALUE, str2);
    }

    @Override // com.ibm.icu.text.LocaleDisplayNames
    public String OLrzqt(String str, String str2) {
        return KWHzl(str, str2, false);
    }

    public static class ActionBar {
        public final boolean AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String KWHzl(String str, String str2, String str3) {
            if (this.AEQbTJ) {
                return null;
            }
            return str3;
        }

        public String OLrzqt(String str, String str2) {
            return KWHzl(str, null, str2);
        }
    }

    /* JADX INFO: renamed from: com.ibm.icu.impl.LocaleDisplayNamesImpl$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;

        static {
            int[] iArr = new int[DataTableType.values().length];
            AEQbTJ = iArr;
            try {
                iArr[DataTableType.LANG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[DataTableType.REGION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[DisplayContext.Type.values().length];
            EZpvd = iArr2;
            try {
                iArr2[DisplayContext.Type.DIALECT_HANDLING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EZpvd[DisplayContext.Type.CAPITALIZATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EZpvd[DisplayContext.Type.DISPLAY_LENGTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                EZpvd[DisplayContext.Type.SUBSTITUTE_HANDLING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public final StringBuilder EZpvd(String str, StringBuilder sb) {
        if (sb.length() == 0) {
            sb.append(str);
        } else {
            C7028acB.AEQbTJ(this.fJNWhG, sb, null, sb, str);
        }
        return sb;
    }

    public static class TaskDescription {
        private TaskDescription() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:720) call: com.ibm.icu.impl.LocaleDisplayNamesImpl.TaskDescription.<init>():void type: THIS */
        public /* synthetic */ TaskDescription(AnonymousClass2 anonymousClass2) {
            this();
        }
    }
}
