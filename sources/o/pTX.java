package o;

import com.okinc.localization2.bean.AppLocaleInfo;
import com.okinc.localization2.bean.GroupLanguages;
import com.okinc.localization2.bean.LanguageUnit;
import com.tencent.mmkv.MMKV;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class pTX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public java.lang.Boolean AEQbTJ;
    public final android.content.Context EZpvd;
    public final C38311pUb KWHzl;
    public final pTZ OLrzqt;

    @yCM
    public pTX(@NotNull android.content.Context context, @NotNull C38311pUb c38311pUb, @NotNull pTZ ptz) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c38311pUb, "");
        Intrinsics.checkNotNullParameter(ptz, "");
        this.EZpvd = context;
        this.KWHzl = c38311pUb;
        this.OLrzqt = ptz;
    }

    public final boolean EZpvd() {
        if (this.AEQbTJ == null) {
            KWHzl();
        }
        java.lang.Boolean bool = this.AEQbTJ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void KWHzl() {
        AppLocaleInfo appLocaleInfoDjBIcL = this.KWHzl.djBIcL();
        LanguageUnit languageUnit = new LanguageUnit(appLocaleInfoDjBIcL.getMarket(), appLocaleInfoDjBIcL.getLanguageCode());
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(EZpvd(languageUnit));
        this.AEQbTJ = boolValueOf;
        if (Intrinsics.EZpvd(boolValueOf, java.lang.Boolean.FALSE)) {
            pUU.KWHzl("LPAvailabilityRepo", "updateMarketLanguageGroupAvailable, isMarketLanguageGroupAvailable is false for " + languageUnit);
        }
    }

    public final boolean EZpvd(@NotNull LanguageUnit languageUnit) {
        Intrinsics.checkNotNullParameter(languageUnit, "");
        return KWHzl(languageUnit) || OLrzqt(languageUnit);
    }

    public final boolean OLrzqt(@NotNull LanguageUnit languageUnit) {
        Intrinsics.checkNotNullParameter(languageUnit, "");
        GroupLanguages groupLanguagesAEQbTJ = AEQbTJ(languageUnit);
        if (groupLanguagesAEQbTJ == null) {
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        LanguageUnit marketCurrent = groupLanguagesAEQbTJ.getMarketCurrent();
        if (marketCurrent != null) {
            arrayList.add(marketCurrent);
        }
        LanguageUnit marketDefault = groupLanguagesAEQbTJ.getMarketDefault();
        if (marketDefault != null) {
            arrayList.add(marketDefault);
        }
        LanguageUnit globalCurrent = groupLanguagesAEQbTJ.getGlobalCurrent();
        if (globalCurrent != null) {
            arrayList.add(globalCurrent);
        }
        LanguageUnit globalDefault = groupLanguagesAEQbTJ.getGlobalDefault();
        if (globalDefault != null) {
            arrayList.add(globalDefault);
        }
        if (!arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!copydefault((LanguageUnit) it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean KWHzl(@NotNull LanguageUnit languageUnit) {
        Intrinsics.checkNotNullParameter(languageUnit, "");
        return gEmmrt(languageUnit);
    }

    public final boolean copydefault(@NotNull LanguageUnit languageUnit) {
        Intrinsics.checkNotNullParameter(languageUnit, "");
        return pTG.OLrzqt.copydefault(this.EZpvd, languageUnit).length() > 0;
    }

    public final boolean gEmmrt(@NotNull LanguageUnit languageUnit) {
        Intrinsics.checkNotNullParameter(languageUnit, "");
        return this.OLrzqt.copydefault(languageUnit) != null;
    }

    public final void AEQbTJ(@NotNull LanguageUnit languageUnit, LanguageUnit languageUnit2, LanguageUnit languageUnit3, LanguageUnit languageUnit4, LanguageUnit languageUnit5) {
        Intrinsics.checkNotNullParameter(languageUnit, "");
        if (languageUnit2 == null && languageUnit3 == null && languageUnit4 == null && languageUnit5 == null) {
            pUU.valueOf("LPAvailabilityRepo", "setGroupLanguages, group is null. return");
            return;
        }
        MMKV mmkvKWHzl = MMKV.KWHzl("language_extra_info", new java.io.File(pTG.OLrzqt.AEQbTJ(this.EZpvd, languageUnit)).getCanonicalPath());
        Intrinsics.checkNotNullExpressionValue(mmkvKWHzl, "");
        if (languageUnit2 != null) {
            mmkvKWHzl.EZpvd("market_current", languageUnit2.getLanguageCode());
        }
        if (languageUnit3 != null) {
            mmkvKWHzl.EZpvd("market_default", languageUnit3.getLanguageCode());
        }
        if (languageUnit4 != null) {
            mmkvKWHzl.EZpvd("global_current", languageUnit4.getLanguageCode());
        }
        if (languageUnit5 != null) {
            mmkvKWHzl.EZpvd("global_default", languageUnit5.getLanguageCode());
        }
        pUU.KWHzl("LPAvailabilityRepo", "setGroupLanguages, finished. mainLanguage:" + languageUnit + ", marketCurrent:" + languageUnit2 + ", marketDefault:" + languageUnit3 + ", globalCurrent:" + languageUnit4 + ", globalDefault:" + languageUnit5);
    }

    public final GroupLanguages AEQbTJ(@NotNull LanguageUnit languageUnit) {
        Intrinsics.checkNotNullParameter(languageUnit, "");
        java.io.File file = new java.io.File(pTG.OLrzqt.AEQbTJ(this.EZpvd, languageUnit));
        if (!file.exists() || !file.isDirectory()) {
            pUU.KWHzl("LPAvailabilityRepo", "getGroupLanguagesWithMain, " + file + " is not exist or not a directory");
            return null;
        }
        MMKV mmkvKWHzl = MMKV.KWHzl("language_extra_info", file.getCanonicalPath());
        Intrinsics.checkNotNullExpressionValue(mmkvKWHzl, "");
        java.lang.String strKWHzl = mmkvKWHzl.KWHzl("market_current");
        java.lang.String strKWHzl2 = mmkvKWHzl.KWHzl("market_default");
        java.lang.String strKWHzl3 = mmkvKWHzl.KWHzl("global_current");
        java.lang.String strKWHzl4 = mmkvKWHzl.KWHzl("global_default");
        GroupLanguages groupLanguages = new GroupLanguages();
        if (strKWHzl != null) {
            groupLanguages.setMarketCurrent(new LanguageUnit(languageUnit.getMarket(), strKWHzl));
        }
        if (strKWHzl2 != null) {
            groupLanguages.setMarketDefault(new LanguageUnit(languageUnit.getMarket(), strKWHzl2));
        }
        if (strKWHzl3 != null) {
            groupLanguages.setGlobalCurrent(new LanguageUnit("global", strKWHzl3));
        }
        if (strKWHzl4 != null) {
            groupLanguages.setGlobalDefault(new LanguageUnit("global", strKWHzl4));
        }
        if (groupLanguages.getMarketCurrent() == null && groupLanguages.getMarketDefault() == null && groupLanguages.getGlobalCurrent() == null && groupLanguages.getGlobalDefault() == null) {
            return null;
        }
        return groupLanguages;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pTX.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
