package o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.core.ok_app.api.configuration.Scenario;
import com.okinc.core.ok_app.configuration.config.LanguageSyncConfigUnit$switchAppLanguage$1;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.localization2.bean.AppLanguagesChangeResult;
import com.okinc.localization2.bean.AppLocale;
import com.okinc.localization2.bean.LanguagesSettingFrom;
import com.okinc.localization2.bean.server.AppLanguageLanguageItem;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33293mti {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final OKComplianceRestrictionService AEQbTJ;
    public final InterfaceC47278tmy EZpvd;
    public final pTU copydefault;

    @yCM
    public C33293mti(@NotNull InterfaceC47278tmy interfaceC47278tmy, @NotNull OKComplianceRestrictionService oKComplianceRestrictionService, @NotNull pTU ptu) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        Intrinsics.checkNotNullParameter(ptu, "");
        this.EZpvd = interfaceC47278tmy;
        this.AEQbTJ = oKComplianceRestrictionService;
        this.copydefault = ptu;
    }

    /* JADX INFO: renamed from: o.mti$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mti.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean copydefault(@NotNull Scenario scenario) {
        JsonObject jsonObjectAwvSrB;
        boolean z;
        JsonObject asJsonObject;
        JsonElement jsonElement;
        Intrinsics.checkNotNullParameter(scenario, "");
        boolean z2 = false;
        if (this.EZpvd.values() && Intrinsics.EZpvd(scenario, Scenario.FeatureRestrictionUpdated.EZpvd)) {
            return false;
        }
        if (this.EZpvd.values()) {
            jsonObjectAwvSrB = this.EZpvd.valueOf();
        } else {
            jsonObjectAwvSrB = this.AEQbTJ.AwvSrB();
        }
        if (jsonObjectAwvSrB == null) {
            return false;
        }
        JsonElement jsonElement2 = jsonObjectAwvSrB.get("market");
        java.lang.String asString = jsonElement2 != null ? jsonElement2.getAsString() : null;
        JsonElement jsonElement3 = jsonObjectAwvSrB.get("languageInfo");
        java.lang.String asString2 = (jsonElement3 == null || (asJsonObject = jsonElement3.getAsJsonObject()) == null || (jsonElement = asJsonObject.get(AppLanguageLanguageItem.KEY_ISO_CODE)) == null) ? null : jsonElement.getAsString();
        AppLocale appLocaleOLrzqt = this.copydefault.OLrzqt();
        pUU.KWHzl("ConfigManager", "appLocale: " + appLocaleOLrzqt);
        pUU.KWHzl("ConfigManager", "dataMarket: " + asString + ", dataLanguageCode: " + asString2 + ", i18n from account: " + this.EZpvd.values());
        boolean z3 = Intrinsics.EZpvd((java.lang.Object) appLocaleOLrzqt.getMarket(), (java.lang.Object) asString) && Intrinsics.EZpvd((java.lang.Object) appLocaleOLrzqt.getLanguageCode(), (java.lang.Object) asString2);
        if (!oJV.AEQbTJ.isConnected().invoke().booleanValue() || asString2 == null) {
            z = false;
        } else {
            java.lang.String language = appLocaleOLrzqt.getLocale().getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "");
            if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) asString2, (java.lang.CharSequence) language, false, 2, (java.lang.Object) null)) {
                z = true;
            }
        }
        if (!z3 && !z) {
            z2 = true;
        }
        pUU.KWHzl("ConfigManager", "isNeedLangSync: " + z2 + ", isSameMarket: " + z3 + ", isE2EIgnore: " + z);
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super AppLanguagesChangeResult> continuation) {
        LanguageSyncConfigUnit$switchAppLanguage$1 languageSyncConfigUnit$switchAppLanguage$1;
        AppLanguagesChangeResult appLanguagesChangeResult;
        if (continuation instanceof LanguageSyncConfigUnit$switchAppLanguage$1) {
            languageSyncConfigUnit$switchAppLanguage$1 = (LanguageSyncConfigUnit$switchAppLanguage$1) continuation;
            int i = languageSyncConfigUnit$switchAppLanguage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageSyncConfigUnit$switchAppLanguage$1.label = i - Integer.MIN_VALUE;
            } else {
                languageSyncConfigUnit$switchAppLanguage$1 = new LanguageSyncConfigUnit$switchAppLanguage$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = languageSyncConfigUnit$switchAppLanguage$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = languageSyncConfigUnit$switchAppLanguage$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            if (this.EZpvd.values()) {
                JsonObject jsonObjectValueOf = this.EZpvd.valueOf();
                if (jsonObjectValueOf != null) {
                    pTU ptu = this.copydefault;
                    LanguagesSettingFrom languagesSettingFrom = LanguagesSettingFrom.ACCOUNT;
                    languageSyncConfigUnit$switchAppLanguage$1.label = 1;
                    objCopydefault = ptu.copydefault(null, jsonObjectValueOf, languagesSettingFrom, languageSyncConfigUnit$switchAppLanguage$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    appLanguagesChangeResult = (AppLanguagesChangeResult) objCopydefault;
                    if (appLanguagesChangeResult == null) {
                    }
                    pUU.KWHzl("ConfigManager", "isLogin switchAppLanguage result: " + appLanguagesChangeResult);
                }
                appLanguagesChangeResult = AppLanguagesChangeResult.IGNORE;
                pUU.KWHzl("ConfigManager", "isLogin switchAppLanguage result: " + appLanguagesChangeResult);
            } else {
                JsonObject jsonObjectAwvSrB = this.AEQbTJ.AwvSrB();
                pUU.KWHzl("ConfigManager", "fr i18n: " + (jsonObjectAwvSrB != null ? jsonObjectAwvSrB.toString() : null));
                if (jsonObjectAwvSrB != null) {
                    pTU ptu2 = this.copydefault;
                    LanguagesSettingFrom languagesSettingFrom2 = LanguagesSettingFrom.COMPLIANCE;
                    languageSyncConfigUnit$switchAppLanguage$1.label = 2;
                    objCopydefault = ptu2.copydefault(null, jsonObjectAwvSrB, languagesSettingFrom2, languageSyncConfigUnit$switchAppLanguage$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    appLanguagesChangeResult = (AppLanguagesChangeResult) objCopydefault;
                    if (appLanguagesChangeResult == null) {
                    }
                    pUU.KWHzl("ConfigManager", "not login switchAppLanguage result: " + appLanguagesChangeResult);
                }
                appLanguagesChangeResult = AppLanguagesChangeResult.IGNORE;
                pUU.KWHzl("ConfigManager", "not login switchAppLanguage result: " + appLanguagesChangeResult);
            }
        } else if (i2 == 1) {
            C56391yDq.AEQbTJ(objCopydefault);
            appLanguagesChangeResult = (AppLanguagesChangeResult) objCopydefault;
            if (appLanguagesChangeResult == null) {
                appLanguagesChangeResult = AppLanguagesChangeResult.IGNORE;
            }
            pUU.KWHzl("ConfigManager", "isLogin switchAppLanguage result: " + appLanguagesChangeResult);
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
            appLanguagesChangeResult = (AppLanguagesChangeResult) objCopydefault;
            if (appLanguagesChangeResult == null) {
                appLanguagesChangeResult = AppLanguagesChangeResult.IGNORE;
            }
            pUU.KWHzl("ConfigManager", "not login switchAppLanguage result: " + appLanguagesChangeResult);
        }
        return appLanguagesChangeResult;
    }
}
