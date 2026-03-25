package com.ibm.icu.impl;

import com.ibm.icu.impl.CurrencyData;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.ICUException;
import com.ibm.icu.util.ULocale;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import o.C7043acQ;

/* JADX INFO: loaded from: classes3.dex */
public class ICUCurrencyDisplayInfoProvider implements CurrencyData.StateListAnimator {
    public volatile ICUCurrencyDisplayInfo EZpvd = null;

    @Override // com.ibm.icu.impl.CurrencyData.StateListAnimator
    public CurrencyData.TaskDescription OLrzqt(ULocale uLocale, boolean z) {
        ICUResourceBundle iCUResourceBundleOLrzqt;
        if (uLocale == null) {
            uLocale = ULocale.ROOT;
        }
        ICUCurrencyDisplayInfo iCUCurrencyDisplayInfo = this.EZpvd;
        if (iCUCurrencyDisplayInfo != null && iCUCurrencyDisplayInfo.AEQbTJ.equals(uLocale) && iCUCurrencyDisplayInfo.EZpvd == z) {
            return iCUCurrencyDisplayInfo;
        }
        if (z) {
            iCUResourceBundleOLrzqt = ICUResourceBundle.OLrzqt("com/ibm/icu/impl/data/icudt68b/curr", uLocale, ICUResourceBundle.OpenType.LOCALE_DEFAULT_ROOT);
        } else {
            try {
                iCUResourceBundleOLrzqt = ICUResourceBundle.OLrzqt("com/ibm/icu/impl/data/icudt68b/curr", uLocale, ICUResourceBundle.OpenType.LOCALE_ONLY);
            } catch (MissingResourceException unused) {
                return null;
            }
        }
        ICUCurrencyDisplayInfo iCUCurrencyDisplayInfo2 = new ICUCurrencyDisplayInfo(uLocale, iCUResourceBundleOLrzqt, z);
        this.EZpvd = iCUCurrencyDisplayInfo2;
        return iCUCurrencyDisplayInfo2;
    }

    public static class ICUCurrencyDisplayInfo extends CurrencyData.TaskDescription {
        public final ULocale AEQbTJ;
        public final boolean EZpvd;
        public final ICUResourceBundle djBIcL;
        public volatile StateListAnimator copydefault = null;
        public volatile TaskDescription AYXKKw = null;
        public volatile String[] OLrzqt = null;
        public volatile SoftReference<ActionBar> KWHzl = new SoftReference<>(null);
        public volatile Map<String, String> valueOf = null;
        public volatile CurrencyData.CurrencySpacingInfo AhwBna = null;

        public static class ActionBar {
            public Map<String, String> EZpvd = new HashMap();
            public Map<String, String> copydefault = new HashMap();
        }

        public static class StateListAnimator {
            public final String AEQbTJ;
            public String OLrzqt = null;
            public String EZpvd = null;
            public CurrencyData.Activity copydefault = null;

            public StateListAnimator(String str) {
                this.AEQbTJ = str;
            }
        }

        public static class TaskDescription {
            public String AEQbTJ = null;
            public final String KWHzl;
            public final String OLrzqt;

            public TaskDescription(String str, String str2) {
                this.OLrzqt = str;
                this.KWHzl = str2;
            }
        }

        public ICUCurrencyDisplayInfo(ULocale uLocale, ICUResourceBundle iCUResourceBundle, boolean z) {
            this.AEQbTJ = uLocale;
            this.EZpvd = z;
            this.djBIcL = iCUResourceBundle;
        }

        @Override // o.AbstractC7205afT
        public String copydefault(String str) {
            String str2 = djBIcL(str).OLrzqt;
            return (str2 == null && this.EZpvd) ? str : str2;
        }

        @Override // o.AbstractC7205afT
        public String EZpvd(String str) {
            String str2 = djBIcL(str).EZpvd;
            return (str2 == null && this.EZpvd) ? str : str2;
        }

        @Override // o.AbstractC7205afT
        public String KWHzl(String str) {
            String str2 = copydefault(str, "narrow").AEQbTJ;
            return (str2 == null && this.EZpvd) ? EZpvd(str) : str2;
        }

        @Override // o.AbstractC7205afT
        public String OLrzqt(String str) {
            String str2 = copydefault(str, "formal").AEQbTJ;
            return (str2 == null && this.EZpvd) ? EZpvd(str) : str2;
        }

        @Override // o.AbstractC7205afT
        public String valueOf(String str) {
            String str2 = copydefault(str, "variant").AEQbTJ;
            return (str2 == null && this.EZpvd) ? EZpvd(str) : str2;
        }

        @Override // o.AbstractC7205afT
        public String OLrzqt(String str, String str2) {
            StandardPlural standardPluralOrNullFromString = StandardPlural.orNullFromString(str2);
            String[] strArrAhwBna = AhwBna(str);
            String str3 = standardPluralOrNullFromString != null ? strArrAhwBna[standardPluralOrNullFromString.ordinal() + 1] : null;
            if (str3 == null && this.EZpvd) {
                str3 = strArrAhwBna[StandardPlural.OTHER.ordinal() + 1];
            }
            if (str3 == null && this.EZpvd) {
                str3 = djBIcL(str).OLrzqt;
            }
            return (str3 == null && this.EZpvd) ? str : str3;
        }

        @Override // o.AbstractC7205afT
        public Map<String, String> OLrzqt() {
            return EZpvd().EZpvd;
        }

        @Override // o.AbstractC7205afT
        public Map<String, String> AEQbTJ() {
            return EZpvd().copydefault;
        }

        @Override // com.ibm.icu.impl.CurrencyData.TaskDescription
        public Map<String, String> copydefault() {
            return AYXKKw();
        }

        @Override // com.ibm.icu.impl.CurrencyData.TaskDescription
        public CurrencyData.Activity AEQbTJ(String str) {
            return djBIcL(str).copydefault;
        }

        @Override // com.ibm.icu.impl.CurrencyData.TaskDescription
        public CurrencyData.CurrencySpacingInfo KWHzl() {
            CurrencyData.CurrencySpacingInfo currencySpacingInfoAhwBna = AhwBna();
            return (!(currencySpacingInfoAhwBna.copydefault && currencySpacingInfoAhwBna.AEQbTJ) && this.EZpvd) ? CurrencyData.CurrencySpacingInfo.EZpvd : currencySpacingInfoAhwBna;
        }

        public StateListAnimator djBIcL(String str) {
            StateListAnimator stateListAnimator = this.copydefault;
            if (stateListAnimator != null && stateListAnimator.AEQbTJ.equals(str)) {
                return stateListAnimator;
            }
            StateListAnimator stateListAnimator2 = new StateListAnimator(str);
            CurrencySink currencySink = new CurrencySink(!this.EZpvd, CurrencySink.EntrypointTable.CURRENCIES);
            currencySink.KWHzl = stateListAnimator2;
            this.djBIcL.EZpvd("Currencies/" + str, currencySink);
            this.copydefault = stateListAnimator2;
            return stateListAnimator2;
        }

        public TaskDescription copydefault(String str, String str2) {
            TaskDescription taskDescription = this.AYXKKw;
            if (taskDescription != null && taskDescription.OLrzqt.equals(str) && taskDescription.KWHzl.equals(str2)) {
                return taskDescription;
            }
            TaskDescription taskDescription2 = new TaskDescription(str, str2);
            CurrencySink currencySink = new CurrencySink(!this.EZpvd, CurrencySink.EntrypointTable.CURRENCY_VARIANT);
            currencySink.valueOf = taskDescription2;
            this.djBIcL.EZpvd("Currencies%" + str2 + "/" + str, currencySink);
            this.AYXKKw = taskDescription2;
            return taskDescription2;
        }

        public String[] AhwBna(String str) {
            String[] strArr = this.OLrzqt;
            if (strArr != null && strArr[0].equals(str)) {
                return strArr;
            }
            String[] strArr2 = new String[StandardPlural.COUNT + 1];
            strArr2[0] = str;
            CurrencySink currencySink = new CurrencySink(!this.EZpvd, CurrencySink.EntrypointTable.CURRENCY_PLURALS);
            currencySink.EZpvd = strArr2;
            this.djBIcL.EZpvd("CurrencyPlurals/" + str, currencySink);
            this.OLrzqt = strArr2;
            return strArr2;
        }

        public ActionBar EZpvd() {
            ActionBar actionBar = this.KWHzl.get();
            if (actionBar != null) {
                return actionBar;
            }
            ActionBar actionBar2 = new ActionBar();
            CurrencySink currencySink = new CurrencySink(!this.EZpvd, CurrencySink.EntrypointTable.TOP);
            currencySink.OLrzqt = actionBar2;
            this.djBIcL.copydefault("", currencySink);
            this.KWHzl = new SoftReference<>(actionBar2);
            return actionBar2;
        }

        public Map<String, String> AYXKKw() {
            Map<String, String> map = this.valueOf;
            if (map != null) {
                return map;
            }
            HashMap map2 = new HashMap();
            CurrencySink currencySink = new CurrencySink(!this.EZpvd, CurrencySink.EntrypointTable.CURRENCY_UNIT_PATTERNS);
            currencySink.gEmmrt = map2;
            this.djBIcL.copydefault("CurrencyUnitPatterns", currencySink);
            this.valueOf = map2;
            return map2;
        }

        public CurrencyData.CurrencySpacingInfo AhwBna() {
            CurrencyData.CurrencySpacingInfo currencySpacingInfo = this.AhwBna;
            if (currencySpacingInfo != null) {
                return currencySpacingInfo;
            }
            CurrencyData.CurrencySpacingInfo currencySpacingInfo2 = new CurrencyData.CurrencySpacingInfo();
            CurrencySink currencySink = new CurrencySink(!this.EZpvd, CurrencySink.EntrypointTable.CURRENCY_SPACING);
            currencySink.AYXKKw = currencySpacingInfo2;
            this.djBIcL.copydefault("currencySpacing", currencySink);
            this.AhwBna = currencySpacingInfo2;
            return currencySpacingInfo2;
        }

        public static final class CurrencySink extends C7043acQ.ActionBar {
            public final boolean AEQbTJ;
            public final EntrypointTable copydefault;
            public StateListAnimator KWHzl = null;
            public String[] EZpvd = null;
            public ActionBar OLrzqt = null;
            public Map<String, String> gEmmrt = null;
            public CurrencyData.CurrencySpacingInfo AYXKKw = null;
            public TaskDescription valueOf = null;

            public enum EntrypointTable {
                TOP,
                CURRENCIES,
                CURRENCY_PLURALS,
                CURRENCY_VARIANT,
                CURRENCY_SPACING,
                CURRENCY_UNIT_PATTERNS
            }

            public CurrencySink(boolean z, EntrypointTable entrypointTable) {
                this.AEQbTJ = z;
                this.copydefault = entrypointTable;
            }

            @Override // o.C7043acQ.ActionBar
            public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
                if (this.AEQbTJ && z) {
                }
                switch (AnonymousClass3.KWHzl[this.copydefault.ordinal()]) {
                    case 1:
                        djBIcL(application, taskDescription);
                        break;
                    case 2:
                        AEQbTJ(application, taskDescription);
                        break;
                    case 3:
                        OLrzqt(application, taskDescription);
                        break;
                    case 4:
                        copydefault(application, taskDescription);
                        break;
                    case 5:
                        valueOf(application, taskDescription);
                        break;
                    case 6:
                        AYXKKw(application, taskDescription);
                        break;
                }
            }

            public final void djBIcL(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription) {
                C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
                for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                    if (application.copydefault("Currencies")) {
                        EZpvd(application, taskDescription);
                    } else if (application.copydefault("Currencies%variant")) {
                        KWHzl(application, taskDescription);
                    } else if (application.copydefault("CurrencyPlurals")) {
                        AhwBna(application, taskDescription);
                    }
                }
            }

            public void EZpvd(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription) {
                C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
                for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                    String string = application.toString();
                    if (taskDescription.AhwBna() != 8) {
                        throw new ICUException("Unexpected data type in Currencies table for " + string);
                    }
                    C7043acQ.Activity activityOLrzqt = taskDescription.OLrzqt();
                    this.OLrzqt.EZpvd.put(string, string);
                    activityOLrzqt.copydefault(0, taskDescription);
                    this.OLrzqt.EZpvd.put(taskDescription.djBIcL(), string);
                    activityOLrzqt.copydefault(1, taskDescription);
                    this.OLrzqt.copydefault.put(taskDescription.djBIcL(), string);
                }
            }

            public void AEQbTJ(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription) {
                String string = application.toString();
                if (taskDescription.AhwBna() != 8) {
                    throw new ICUException("Unexpected data type in Currencies table for " + string);
                }
                C7043acQ.Activity activityOLrzqt = taskDescription.OLrzqt();
                if (this.KWHzl.EZpvd == null) {
                    activityOLrzqt.copydefault(0, taskDescription);
                    this.KWHzl.EZpvd = taskDescription.djBIcL();
                }
                if (this.KWHzl.OLrzqt == null) {
                    activityOLrzqt.copydefault(1, taskDescription);
                    this.KWHzl.OLrzqt = taskDescription.djBIcL();
                }
                if (activityOLrzqt.KWHzl() <= 2 || this.KWHzl.copydefault != null) {
                    return;
                }
                activityOLrzqt.copydefault(2, taskDescription);
                C7043acQ.Activity activityOLrzqt2 = taskDescription.OLrzqt();
                activityOLrzqt2.copydefault(0, taskDescription);
                String strDjBIcL = taskDescription.djBIcL();
                activityOLrzqt2.copydefault(1, taskDescription);
                String strDjBIcL2 = taskDescription.djBIcL();
                activityOLrzqt2.copydefault(2, taskDescription);
                this.KWHzl.copydefault = new CurrencyData.Activity(string, strDjBIcL, strDjBIcL2, taskDescription.djBIcL());
            }

            public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription) {
                TaskDescription taskDescription2 = this.valueOf;
                if (taskDescription2.AEQbTJ == null) {
                    taskDescription2.AEQbTJ = taskDescription.djBIcL();
                }
            }

            public void KWHzl(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription) {
                C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
                for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                    this.OLrzqt.EZpvd.put(taskDescription.djBIcL(), application.toString());
                }
            }

            public void AhwBna(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription) {
                C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
                for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                    String string = application.toString();
                    C7043acQ.StateListAnimator stateListAnimatorValueOf2 = taskDescription.valueOf();
                    for (int i2 = 0; stateListAnimatorValueOf2.AEQbTJ(i2, application, taskDescription); i2++) {
                        if (StandardPlural.orNullFromString(application.toString()) == null) {
                            throw new ICUException("Could not make StandardPlural from keyword " + ((Object) application));
                        }
                        this.OLrzqt.copydefault.put(taskDescription.djBIcL(), string);
                    }
                }
            }

            public void OLrzqt(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription) {
                C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
                for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                    StandardPlural standardPluralOrNullFromString = StandardPlural.orNullFromString(application.toString());
                    if (standardPluralOrNullFromString == null) {
                        throw new ICUException("Could not make StandardPlural from keyword " + ((Object) application));
                    }
                    if (this.EZpvd[standardPluralOrNullFromString.ordinal() + 1] == null) {
                        this.EZpvd[standardPluralOrNullFromString.ordinal() + 1] = taskDescription.djBIcL();
                    }
                }
            }

            public void valueOf(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription) {
                CurrencyData.CurrencySpacingInfo.SpacingType spacingType;
                CurrencyData.CurrencySpacingInfo.SpacingPattern spacingPattern;
                C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
                for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                    if (application.copydefault("beforeCurrency")) {
                        spacingType = CurrencyData.CurrencySpacingInfo.SpacingType.BEFORE;
                        this.AYXKKw.copydefault = true;
                    } else if (application.copydefault("afterCurrency")) {
                        spacingType = CurrencyData.CurrencySpacingInfo.SpacingType.AFTER;
                        this.AYXKKw.AEQbTJ = true;
                    }
                    C7043acQ.StateListAnimator stateListAnimatorValueOf2 = taskDescription.valueOf();
                    for (int i2 = 0; stateListAnimatorValueOf2.AEQbTJ(i2, application, taskDescription); i2++) {
                        if (application.copydefault("currencyMatch")) {
                            spacingPattern = CurrencyData.CurrencySpacingInfo.SpacingPattern.CURRENCY_MATCH;
                        } else if (application.copydefault("surroundingMatch")) {
                            spacingPattern = CurrencyData.CurrencySpacingInfo.SpacingPattern.SURROUNDING_MATCH;
                        } else if (application.copydefault("insertBetween")) {
                            spacingPattern = CurrencyData.CurrencySpacingInfo.SpacingPattern.INSERT_BETWEEN;
                        }
                        this.AYXKKw.AEQbTJ(spacingType, spacingPattern, taskDescription.djBIcL());
                    }
                }
            }

            public void AYXKKw(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription) {
                C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
                for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                    String string = application.toString();
                    if (this.gEmmrt.get(string) == null) {
                        this.gEmmrt.put(string, taskDescription.djBIcL());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ibm.icu.impl.ICUCurrencyDisplayInfoProvider$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[ICUCurrencyDisplayInfo.CurrencySink.EntrypointTable.values().length];
            KWHzl = iArr;
            try {
                iArr[ICUCurrencyDisplayInfo.CurrencySink.EntrypointTable.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KWHzl[ICUCurrencyDisplayInfo.CurrencySink.EntrypointTable.CURRENCIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KWHzl[ICUCurrencyDisplayInfo.CurrencySink.EntrypointTable.CURRENCY_PLURALS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                KWHzl[ICUCurrencyDisplayInfo.CurrencySink.EntrypointTable.CURRENCY_VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                KWHzl[ICUCurrencyDisplayInfo.CurrencySink.EntrypointTable.CURRENCY_SPACING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                KWHzl[ICUCurrencyDisplayInfo.CurrencySink.EntrypointTable.CURRENCY_UNIT_PATTERNS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }
}
