package o;

import com.okinc.core.util.SPUtils;
import com.okinc.localization2.bean.AppLocaleInfo;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pUb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class C38311pUb {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public AppLocaleInfo KWHzl;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.pUc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C38311pUb.EZpvd(this.OLrzqt);
        }
    });

    @yCM
    public C38311pUb() {
    }

    public final AppLocaleInfo OLrzqt() {
        return (AppLocaleInfo) this.OLrzqt.getValue();
    }

    public static final AppLocaleInfo EZpvd(C38311pUb c38311pUb) {
        return c38311pUb.AEQbTJ();
    }

    public final AppLocaleInfo copydefault() {
        AppLocaleInfo appLocaleInfo = this.KWHzl;
        if (appLocaleInfo != null) {
            return appLocaleInfo;
        }
        AppLocaleInfo appLocaleInfoOLrzqt = OLrzqt();
        this.KWHzl = appLocaleInfoOLrzqt;
        return appLocaleInfoOLrzqt;
    }

    public final AppLocaleInfo djBIcL() {
        AppLocaleInfo appLocaleInfoCopydefault = copydefault();
        return appLocaleInfoCopydefault != null ? appLocaleInfoCopydefault : KWHzl(pTG.OLrzqt.AEQbTJ((java.lang.String) null));
    }

    public final void OLrzqt(@NotNull AppLocaleInfo appLocaleInfo) {
        Intrinsics.checkNotNullParameter(appLocaleInfo, "");
        if (C43308rmo.KWHzl(C32979mnm.EZpvd.OLrzqt())) {
            SPUtils.put("app_locale", appLocaleInfo.toSerialized$OKLocalization_localization(), "localize_config");
            java.lang.String languageTag = appLocaleInfo.getLocale().toLanguageTag();
            pSC psc = pSC.AEQbTJ;
            SPUtils.put("sp_lang_setting", languageTag, psc.gEmmrt());
            SPUtils.put("sp_lang_display", appLocaleInfo.getDisplayName(), psc.gEmmrt());
            this.KWHzl = appLocaleInfo;
            pUU.KWHzl("LanguageUsageRepo", "updateAppLocale, finish:" + appLocaleInfo);
        }
    }

    public final boolean KWHzl() {
        java.lang.String string = SPUtils.getString("app_locale", "", "localize_config");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string.length() > 0;
    }

    public final AppLocaleInfo AEQbTJ() {
        java.lang.String string = SPUtils.getString("app_locale", "", "localize_config");
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (string.length() == 0) {
            return EZpvd();
        }
        return AppLocaleInfo.Companion.AEQbTJ(string);
    }

    public final AppLocaleInfo KWHzl(java.util.Locale locale) {
        java.lang.String languageTag = locale.toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag, "");
        return new AppLocaleInfo(locale, languageTag, "", null, pTG.OLrzqt.copydefault());
    }

    public final AppLocaleInfo EZpvd() {
        java.lang.Object objM7377constructorimpl;
        AppLocaleInfo appLocaleInfoKWHzl;
        try {
            Result.Application application = Result.Companion;
            java.lang.String string = SPUtils.getString("sp_lang_setting", null, pSC.AEQbTJ.gEmmrt());
            if (string == null) {
                appLocaleInfoKWHzl = null;
            } else {
                java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(string);
                Intrinsics.copydefault(localeForLanguageTag);
                appLocaleInfoKWHzl = KWHzl(localeForLanguageTag);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(appLocaleInfoKWHzl);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.OLrzqt("LanguageUsageRepo", "getAppLocaleInfoFromOldVersion", thM7380exceptionOrNullimpl);
        }
        AppLocaleInfo appLocaleInfo = (AppLocaleInfo) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        pUU.KWHzl("LanguageUsageRepo", "getAppLocaleInfoFromOldVersion, result:" + appLocaleInfo);
        return appLocaleInfo;
    }

    /* JADX INFO: renamed from: o.pUb$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pUb.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
