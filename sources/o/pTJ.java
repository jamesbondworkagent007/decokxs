package o;

import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.localization.bean.LanguageItem;
import com.okinc.localization.internal.repository.LanguagesListRepository;
import com.okinc.localization2.LPUpdateTime;
import com.okinc.localization2.LocalizeCoreManager$getAvailableLocale$1;
import com.okinc.localization2.LocalizeCoreManager$initLocalize$2;
import com.okinc.localization2.LocalizeCoreManager$loadAndUpdateAsync$2;
import com.okinc.localization2.LocalizeCoreManager$loadAndUpdateAsync$3;
import com.okinc.localization2.LocalizeCoreManager$sendBroadcast$1;
import com.okinc.localization2.LocalizeCoreManager$setAppLanguage$1;
import com.okinc.localization2.LocalizeCoreManager$setAppLanguageWithLoadingAndRetry$2;
import com.okinc.localization2.LocalizeCoreManager$setAppLanguageWithLoadingAndRetry$job$1;
import com.okinc.localization2.LocalizeCoreManager$setAppResourceConfig$2;
import com.okinc.localization2.LocalizeCoreManager$setAppResourceConfigAndBroadcast$1;
import com.okinc.localization2.LocalizeCoreManager$startSwitchMarket$1;
import com.okinc.localization2.LocalizeCoreManager$updateAndBroadcast$1;
import com.okinc.localization2.LocalizeEventReport;
import com.okinc.localization2.bean.AppLanguagesChangeResult;
import com.okinc.localization2.bean.AppLocaleInfo;
import com.okinc.localization2.bean.GroupLanguages;
import com.okinc.localization2.bean.LangChangeConfig;
import com.okinc.localization2.bean.LanguageInfo;
import com.okinc.localization2.bean.LanguageListConfig;
import com.okinc.localization2.bean.LanguagePackConfig;
import com.okinc.localization2.bean.LanguagePackType;
import com.okinc.localization2.bean.LanguageUnit;
import com.okinc.localization2.bean.LanguageUpdateResult;
import com.okinc.localization2.bean.LanguagesSettingFrom;
import com.okinc.localization2.bean.LocalizeEvent;
import com.okinc.localization2.bean.server.AppLanguage;
import com.okinc.localization2.bean.server.AppLanguageFallback;
import com.okinc.localization2.bean.server.AppLanguageLanguageItem;
import com.okinc.rxutils.RxBus;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class pTJ {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final C38314pUe AEQbTJ;
    public boolean AYXKKw;
    public final C38311pUb AhwBna;
    public final pUE AkhnZx;
    public final pTE DbNXlk;
    public final android.content.Context KWHzl;
    public final MutableSharedFlow<LocalizeEvent> OLrzqt;
    public final MutableSharedFlow<LanguageUpdateResult> copydefault;
    public final LanguagesListRepository djBIcL;
    public final pTY ejfBZ;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final CoroutineDispatcher gEmmrt;
    public final pTX isConnected;
    public final C38313pUd valueOf;
    public final InterfaceC56387yDm values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pTY OLrzqt() {
        return this.ejfBZ;
    }

    @yCM
    public pTJ(@NotNull android.content.Context context, @NotNull LanguagesListRepository languagesListRepository, @NotNull C38311pUb c38311pUb, @NotNull C38314pUe c38314pUe, @NotNull C38313pUd c38313pUd, @NotNull pTX ptx, @NotNull pTE pte, @NotNull pUE pue, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(languagesListRepository, "");
        Intrinsics.checkNotNullParameter(c38311pUb, "");
        Intrinsics.checkNotNullParameter(c38314pUe, "");
        Intrinsics.checkNotNullParameter(c38313pUd, "");
        Intrinsics.checkNotNullParameter(ptx, "");
        Intrinsics.checkNotNullParameter(pte, "");
        Intrinsics.checkNotNullParameter(pue, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = context;
        this.djBIcL = languagesListRepository;
        this.AhwBna = c38311pUb;
        this.AEQbTJ = c38314pUe;
        this.valueOf = c38313pUd;
        this.isConnected = ptx;
        this.DbNXlk = pte;
        this.AkhnZx = pue;
        this.gEmmrt = coroutineDispatcher;
        this.OLrzqt = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.pTK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pTJ.fetchVPNInfo(this.KWHzl);
            }
        });
        this.copydefault = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.pTH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pTJ.isConnected(this.KWHzl);
            }
        });
        this.ejfBZ = new pTY();
    }

    public final SharedFlow<LocalizeEvent> AEQbTJ() {
        return (SharedFlow) this.values.getValue();
    }

    public static final SharedFlow fetchVPNInfo(pTJ ptj) {
        return FlowKt.asSharedFlow(ptj.OLrzqt);
    }

    public final SharedFlow<LanguageUpdateResult> copydefault() {
        return (SharedFlow) this.fetchVPNInfo.getValue();
    }

    public static final SharedFlow isConnected(pTJ ptj) {
        return FlowKt.asSharedFlow(ptj.copydefault);
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.gEmmrt, new LocalizeCoreManager$initLocalize$2(this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final void EZpvd() {
        oJV.AEQbTJ.fJNWhG();
    }

    public final java.lang.Object KWHzl(LanguageUnit languageUnit, Continuation<? super Unit> continuation) {
        if (!pTG.OLrzqt.gEmmrt()) {
            pUU.KWHzl("LocalizeCoreManager", "loadLocalStartUpLanguagePack, don't load startup keys");
            return Unit.INSTANCE;
        }
        java.lang.Object appLanguage$default = setAppLanguage$default(this, languageUnit, new LangChangeConfig(LanguageListConfig.NO_CHECK, LanguagePackConfig.CACHE_OR_EMBEDDED, LanguagePackType.START_UP, false, 8, null), false, continuation, 4, null);
        return appLanguage$default == C56442yFn.copydefault() ? appLanguage$default : Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object setAppLanguage$default(pTJ ptj, LanguageUnit languageUnit, LangChangeConfig langChangeConfig, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return ptj.OLrzqt(languageUnit, langChangeConfig, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull LanguageUnit languageUnit, @NotNull LangChangeConfig langChangeConfig, boolean z, @NotNull Continuation<? super LanguageUpdateResult> continuation) throws java.lang.Throwable {
        LocalizeCoreManager$setAppLanguage$1 localizeCoreManager$setAppLanguage$1;
        pTJ ptj;
        LanguageUpdateResult languageUpdateResult;
        LanguageUnit languageUnit2;
        LanguageUpdateResult languageUpdateResult2;
        if (continuation instanceof LocalizeCoreManager$setAppLanguage$1) {
            localizeCoreManager$setAppLanguage$1 = (LocalizeCoreManager$setAppLanguage$1) continuation;
            int i = localizeCoreManager$setAppLanguage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                localizeCoreManager$setAppLanguage$1.label = i - Integer.MIN_VALUE;
            } else {
                localizeCoreManager$setAppLanguage$1 = new LocalizeCoreManager$setAppLanguage$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = localizeCoreManager$setAppLanguage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = localizeCoreManager$setAppLanguage$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            if (!C43308rmo.KWHzl(this.KWHzl)) {
                return new LanguageUpdateResult.ActionBar("not in ui process");
            }
            pUU.KWHzl("LocalizeCoreManager", "setAppLanguage, from:" + this.AhwBna.copydefault() + ", to:" + languageUnit + ", config:" + langChangeConfig + ", skipRecreate:" + z);
            C38313pUd c38313pUd = this.valueOf;
            localizeCoreManager$setAppLanguage$1.L$0 = this;
            localizeCoreManager$setAppLanguage$1.L$1 = languageUnit;
            localizeCoreManager$setAppLanguage$1.Z$0 = z;
            localizeCoreManager$setAppLanguage$1.label = 1;
            objKWHzl = c38313pUd.KWHzl(languageUnit, langChangeConfig, localizeCoreManager$setAppLanguage$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            ptj = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                languageUpdateResult2 = (LanguageUpdateResult) localizeCoreManager$setAppLanguage$1.L$1;
                languageUnit2 = (LanguageUnit) localizeCoreManager$setAppLanguage$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                languageUpdateResult = languageUpdateResult2;
                languageUnit = languageUnit2;
                pUU.KWHzl("LocalizeCoreManager", "setAppLanguage, finished.languageUnit:" + languageUnit + ", result:" + languageUpdateResult);
                return languageUpdateResult;
            }
            z = localizeCoreManager$setAppLanguage$1.Z$0;
            languageUnit = (LanguageUnit) localizeCoreManager$setAppLanguage$1.L$1;
            ptj = (pTJ) localizeCoreManager$setAppLanguage$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        languageUpdateResult = (LanguageUpdateResult) objKWHzl;
        if (languageUpdateResult instanceof LanguageUpdateResult.Application) {
            localizeCoreManager$setAppLanguage$1.L$0 = languageUnit;
            localizeCoreManager$setAppLanguage$1.L$1 = languageUpdateResult;
            localizeCoreManager$setAppLanguage$1.label = 2;
            if (ptj.OLrzqt(languageUnit, z, localizeCoreManager$setAppLanguage$1) == objCopydefault) {
                return objCopydefault;
            }
            languageUnit2 = languageUnit;
            languageUpdateResult2 = languageUpdateResult;
            languageUpdateResult = languageUpdateResult2;
            languageUnit = languageUnit2;
        }
        pUU.KWHzl("LocalizeCoreManager", "setAppLanguage, finished.languageUnit:" + languageUnit + ", result:" + languageUpdateResult);
        return languageUpdateResult;
    }

    public static /* synthetic */ java.lang.Object setAppResourceConfigAndBroadcast$default(pTJ ptj, LanguageUnit languageUnit, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return ptj.OLrzqt(languageUnit, z, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(LanguageUnit languageUnit, boolean z, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        LocalizeCoreManager$setAppResourceConfigAndBroadcast$1 localizeCoreManager$setAppResourceConfigAndBroadcast$1;
        pTJ ptj;
        boolean z2;
        AppLocaleInfo appLocaleInfo;
        pTJ ptj2;
        boolean z3;
        if (continuation instanceof LocalizeCoreManager$setAppResourceConfigAndBroadcast$1) {
            localizeCoreManager$setAppResourceConfigAndBroadcast$1 = (LocalizeCoreManager$setAppResourceConfigAndBroadcast$1) continuation;
            int i = localizeCoreManager$setAppResourceConfigAndBroadcast$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                localizeCoreManager$setAppResourceConfigAndBroadcast$1.label = i - Integer.MIN_VALUE;
            } else {
                localizeCoreManager$setAppResourceConfigAndBroadcast$1 = new LocalizeCoreManager$setAppResourceConfigAndBroadcast$1(this, continuation);
            }
        }
        java.lang.Object obj = localizeCoreManager$setAppResourceConfigAndBroadcast$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = localizeCoreManager$setAppResourceConfigAndBroadcast$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            AppLocaleInfo appLocaleInfoCopydefault = this.AhwBna.copydefault();
            localizeCoreManager$setAppResourceConfigAndBroadcast$1.L$0 = this;
            localizeCoreManager$setAppResourceConfigAndBroadcast$1.L$1 = languageUnit;
            localizeCoreManager$setAppResourceConfigAndBroadcast$1.L$2 = appLocaleInfoCopydefault;
            localizeCoreManager$setAppResourceConfigAndBroadcast$1.Z$0 = z;
            localizeCoreManager$setAppResourceConfigAndBroadcast$1.label = 1;
            if (copydefault(languageUnit, localizeCoreManager$setAppResourceConfigAndBroadcast$1) == objCopydefault) {
                return objCopydefault;
            }
            ptj = this;
            z2 = z;
            appLocaleInfo = appLocaleInfoCopydefault;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = localizeCoreManager$setAppResourceConfigAndBroadcast$1.Z$0;
                appLocaleInfo = (AppLocaleInfo) localizeCoreManager$setAppResourceConfigAndBroadcast$1.L$1;
                ptj2 = (pTJ) localizeCoreManager$setAppResourceConfigAndBroadcast$1.L$0;
                C56391yDq.AEQbTJ(obj);
                ptj2.EZpvd(appLocaleInfo, (AppLocaleInfo) obj, z3);
                return Unit.INSTANCE;
            }
            boolean z4 = localizeCoreManager$setAppResourceConfigAndBroadcast$1.Z$0;
            AppLocaleInfo appLocaleInfo2 = (AppLocaleInfo) localizeCoreManager$setAppResourceConfigAndBroadcast$1.L$2;
            LanguageUnit languageUnit2 = (LanguageUnit) localizeCoreManager$setAppResourceConfigAndBroadcast$1.L$1;
            ptj = (pTJ) localizeCoreManager$setAppResourceConfigAndBroadcast$1.L$0;
            C56391yDq.AEQbTJ(obj);
            z2 = z4;
            appLocaleInfo = appLocaleInfo2;
            languageUnit = languageUnit2;
        }
        if (appLocaleInfo == null || !Intrinsics.EZpvd(languageUnit, new LanguageUnit(appLocaleInfo.getMarket(), appLocaleInfo.getLanguageCode()))) {
            ptj.isConnected.KWHzl();
        }
        LanguagesListRepository languagesListRepository = ptj.djBIcL;
        localizeCoreManager$setAppResourceConfigAndBroadcast$1.L$0 = ptj;
        localizeCoreManager$setAppResourceConfigAndBroadcast$1.L$1 = appLocaleInfo;
        localizeCoreManager$setAppResourceConfigAndBroadcast$1.L$2 = null;
        localizeCoreManager$setAppResourceConfigAndBroadcast$1.Z$0 = z2;
        localizeCoreManager$setAppResourceConfigAndBroadcast$1.label = 2;
        java.lang.Object objKWHzl = languagesListRepository.KWHzl(languageUnit, localizeCoreManager$setAppResourceConfigAndBroadcast$1);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        ptj2 = ptj;
        boolean z5 = z2;
        obj = objKWHzl;
        z3 = z5;
        ptj2.EZpvd(appLocaleInfo, (AppLocaleInfo) obj, z3);
        return Unit.INSTANCE;
    }

    public final java.lang.Object AEQbTJ(FragmentActivity fragmentActivity, @NotNull JsonObject jsonObject, @NotNull LanguagesSettingFrom languagesSettingFrom, @NotNull Continuation<? super AppLanguagesChangeResult> continuation) {
        JsonElement jsonElement = jsonObject.get("languageInfo");
        JsonObject asJsonObject = jsonElement != null ? jsonElement.getAsJsonObject() : null;
        java.lang.String str = "setAppLanguageWithLoadingAndRetry, invalid input data:" + jsonObject + ". activity:" + fragmentActivity + ", from:" + languagesSettingFrom;
        if (asJsonObject == null) {
            pUU.KWHzl("LocalizeCoreManager", str);
            return AppLanguagesChangeResult.IGNORE;
        }
        JsonElement jsonElement2 = jsonObject.get("market");
        java.lang.String asString = jsonElement2 != null ? jsonElement2.getAsString() : null;
        JsonElement jsonElement3 = asJsonObject.get(AppLanguageLanguageItem.KEY_ISO_CODE);
        java.lang.String asString2 = jsonElement3 != null ? jsonElement3.getAsString() : null;
        JsonElement jsonElement4 = asJsonObject.get(AppLanguageLanguageItem.KEY_LOCALIZATION_NAME);
        java.lang.String asString3 = jsonElement4 != null ? jsonElement4.getAsString() : null;
        JsonElement jsonElement5 = asJsonObject.get(AppLanguageLanguageItem.KEY_CEFI_LOCALIZATION_NAME);
        java.lang.String asString4 = jsonElement5 != null ? jsonElement5.getAsString() : null;
        JsonElement jsonElement6 = asJsonObject.get(AppLanguageLanguageItem.KEY_HIDE_IN_CEFI_MODE);
        boolean asBoolean = jsonElement6 != null ? jsonElement6.getAsBoolean() : false;
        if (asString == null || asString2 == null || asString3 == null) {
            pUU.KWHzl("LocalizeCoreManager", str);
            return AppLanguagesChangeResult.IGNORE;
        }
        return EZpvd(fragmentActivity, new LanguageInfo(asString, new AppLanguageLanguageItem(asString2, asString3, asString4, asBoolean)), languagesSettingFrom, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02bd A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #2 {all -> 0x0049, blocks: (B:13:0x0044, B:75:0x0289, B:79:0x02b0, B:81:0x02bd), top: B:93:0x0044 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(FragmentActivity fragmentActivity, LanguageInfo languageInfo, LanguagesSettingFrom languagesSettingFrom, Continuation<? super AppLanguagesChangeResult> continuation) throws java.lang.Throwable {
        LocalizeCoreManager$setAppLanguageWithLoadingAndRetry$2 localizeCoreManager$setAppLanguageWithLoadingAndRetry$2;
        java.lang.String string;
        pTJ ptj;
        pTJ ptj2;
        java.lang.Object obj;
        LanguageInfo languageInfo2;
        LanguageUnit languageUnit;
        java.lang.Boolean boolKWHzl;
        LanguagesSettingFrom languagesSettingFrom2;
        java.lang.String str;
        boolean z;
        AppLanguagesChangeResult appLanguagesChangeResult;
        LanguagesSettingFrom languagesSettingFrom3 = languagesSettingFrom;
        if (continuation instanceof LocalizeCoreManager$setAppLanguageWithLoadingAndRetry$2) {
            localizeCoreManager$setAppLanguageWithLoadingAndRetry$2 = (LocalizeCoreManager$setAppLanguageWithLoadingAndRetry$2) continuation;
            int i = localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.label = i - Integer.MIN_VALUE;
            } else {
                localizeCoreManager$setAppLanguageWithLoadingAndRetry$2 = new LocalizeCoreManager$setAppLanguageWithLoadingAndRetry$2(this, continuation);
            }
        }
        java.lang.Object obj2 = localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            boolean zBooleanValue = oJV.AEQbTJ.isConnected().invoke().booleanValue();
            pUU.KWHzl("LocalizeCoreManager", "setAppLanguageWithLoadingAndRetry, start. activity:" + fragmentActivity + ", languageInfo:" + languageInfo + ", isE2EIgnoreMarketSwitch:" + zBooleanValue + ", from:" + languagesSettingFrom3);
            if (languagesSettingFrom3 == LanguagesSettingFrom.COMPLIANCE && C43292rmY.OLrzqt.AwvSrB().values()) {
                pUU.KWHzl("LocalizeCoreManager", "setAppLanguageWithLoadingAndRetry, ignore login user for compliance");
                return AppLanguagesChangeResult.IGNORE;
            }
            AppLocaleInfo appLocaleInfoDjBIcL = this.AhwBna.djBIcL();
            if (Intrinsics.EZpvd((java.lang.Object) appLocaleInfoDjBIcL.getMarket(), (java.lang.Object) languageInfo.getMarket()) && Intrinsics.EZpvd((java.lang.Object) appLocaleInfoDjBIcL.getLanguageCode(), (java.lang.Object) languageInfo.getLanguageInfo().getIsoCode())) {
                pUU.KWHzl("LocalizeCoreManager", "setAppLanguageWithLoadingAndRetry, no changed. ignore. current:" + appLocaleInfoDjBIcL);
                return AppLanguagesChangeResult.IGNORE;
            }
            if (zBooleanValue) {
                java.lang.String isoCode = languageInfo.getLanguageInfo().getIsoCode();
                java.lang.String language = appLocaleInfoDjBIcL.getLocale().getLanguage();
                Intrinsics.checkNotNullExpressionValue(language, "");
                if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) isoCode, (java.lang.CharSequence) language, false, 2, (java.lang.Object) null)) {
                    pUU.KWHzl("LocalizeCoreManager", "setAppLanguageWithLoadingAndRetry, same language in e2e, will ignore");
                    return AppLanguagesChangeResult.IGNORE;
                }
            }
            if (!this.ejfBZ.AEQbTJ()) {
                pUU.KWHzl("LocalizeCoreManager", "setAppLanguageWithLoadingAndRetry, last call is running. ignore");
                return AppLanguagesChangeResult.IGNORE;
            }
            string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            pUU.KWHzl("LocalizeCoreManager", "setAppLanguageWithLoadingAndRetry, start to switch market. current:" + appLocaleInfoDjBIcL + ", languageInfo:" + languageInfo + ", from:" + languagesSettingFrom3 + ", callId:" + string + JwtUtilsKt.JWT_DELIMITER);
            try {
                this.valueOf.AEQbTJ(true);
                LanguageUnit languageUnit2 = new LanguageUnit(languageInfo.getMarket(), languageInfo.getLanguageInfo().getIsoCode());
                LanguagesListRepository languagesListRepository = this.djBIcL;
                LanguagesListRepository.LoadType loadType = LanguagesListRepository.LoadType.CACHE_AND_EMBEDDED;
                java.lang.String market = languageInfo.getMarket();
                localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.L$0 = this;
                localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.L$1 = languageInfo;
                localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.L$2 = languagesSettingFrom3;
                localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.L$3 = string;
                localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.L$4 = languageUnit2;
                localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.label = 1;
                java.lang.Object objAEQbTJ = languagesListRepository.AEQbTJ(loadType, market, localizeCoreManager$setAppLanguageWithLoadingAndRetry$2);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                ptj2 = this;
                obj = objAEQbTJ;
                languageInfo2 = languageInfo;
                languageUnit = languageUnit2;
            } catch (java.lang.Throwable th) {
                th = th;
                ptj = this;
                ptj.valueOf.AEQbTJ(false);
                throw th;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                languageUnit = (LanguageUnit) localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.L$3;
                str = (java.lang.String) localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.L$2;
                languagesSettingFrom2 = (LanguagesSettingFrom) localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.L$1;
                ptj = (pTJ) localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.L$0;
                try {
                    C56391yDq.AEQbTJ(obj2);
                    appLanguagesChangeResult = (AppLanguagesChangeResult) obj2;
                    pUU.KWHzl("LocalizeCoreManager", "setAppLanguageWithLoadingAndRetry,finished. result:" + appLanguagesChangeResult + ", callID:" + str);
                    LocalizeEventReport.INSTANCE.reportSwitchMarketEnd(appLanguagesChangeResult != AppLanguagesChangeResult.SUCCEED, languageUnit.getMarket(), languageUnit.getLanguageCode(), languagesSettingFrom2);
                    if (appLanguagesChangeResult == null) {
                        appLanguagesChangeResult = AppLanguagesChangeResult.FAIL;
                    }
                    ptj.valueOf.AEQbTJ(false);
                    return appLanguagesChangeResult;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    ptj.valueOf.AEQbTJ(false);
                    throw th;
                }
            }
            languageUnit = (LanguageUnit) localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.L$4;
            java.lang.String str2 = (java.lang.String) localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.L$3;
            LanguagesSettingFrom languagesSettingFrom4 = (LanguagesSettingFrom) localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.L$2;
            languageInfo2 = (LanguageInfo) localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.L$1;
            ptj2 = (pTJ) localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.L$0;
            try {
                C56391yDq.AEQbTJ(obj2);
                obj = obj2;
                string = str2;
                languagesSettingFrom3 = languagesSettingFrom4;
            } catch (java.lang.Throwable th3) {
                th = th3;
                ptj = ptj2;
                ptj.valueOf.AEQbTJ(false);
                throw th;
            }
        }
        java.util.List<LanguageItem> list = (java.util.List) obj;
        LocalizeEventReport.INSTANCE.reportSwitchMarketStart(languageUnit.getMarket(), languageUnit.getLanguageCode(), languagesSettingFrom3);
        if (list != null) {
            if (!list.isEmpty()) {
                for (LanguageItem languageItem : list) {
                    if (Intrinsics.EZpvd((java.lang.Object) languageItem.getLanguageCode(), (java.lang.Object) languageInfo2.getLanguageInfo().getIsoCode()) && Intrinsics.EZpvd((java.lang.Object) languageItem.getDisplayName(), (java.lang.Object) languageInfo2.getLanguageInfo().getLocalizationName())) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            boolKWHzl = C56443yFo.KWHzl(z);
        } else {
            boolKWHzl = null;
        }
        if (!Intrinsics.EZpvd(boolKWHzl, C56443yFo.KWHzl(true))) {
            ptj2.djBIcL.EZpvd(new AppLanguage(new AppLanguageFallback(languageInfo2.getLanguageInfo().getIsoCode()), C56402yEa.EZpvd(new AppLanguageLanguageItem(languageInfo2.getLanguageInfo().getIsoCode(), languageInfo2.getLanguageInfo().getLocalizationName(), languageInfo2.getLanguageInfo().getCefiLocalizationName(), languageInfo2.getLanguageInfo().getHideInCefiMode())), languageInfo2.getMarket()));
        }
        Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new LocalizeCoreManager$setAppLanguageWithLoadingAndRetry$job$1(ptj2, languageUnit, null), 3, null);
        localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.L$0 = ptj2;
        localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.L$1 = languagesSettingFrom3;
        localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.L$2 = string;
        localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.L$3 = languageUnit;
        localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.L$4 = null;
        localizeCoreManager$setAppLanguageWithLoadingAndRetry$2.label = 2;
        java.lang.Object objAwait = deferredAsync$default.await(localizeCoreManager$setAppLanguageWithLoadingAndRetry$2);
        if (objAwait == objCopydefault) {
            return objCopydefault;
        }
        languagesSettingFrom2 = languagesSettingFrom3;
        str = string;
        obj2 = objAwait;
        ptj = ptj2;
        appLanguagesChangeResult = (AppLanguagesChangeResult) obj2;
        pUU.KWHzl("LocalizeCoreManager", "setAppLanguageWithLoadingAndRetry,finished. result:" + appLanguagesChangeResult + ", callID:" + str);
        LocalizeEventReport.INSTANCE.reportSwitchMarketEnd(appLanguagesChangeResult != AppLanguagesChangeResult.SUCCEED, languageUnit.getMarket(), languageUnit.getLanguageCode(), languagesSettingFrom2);
        if (appLanguagesChangeResult == null) {
        }
        ptj.valueOf.AEQbTJ(false);
        return appLanguagesChangeResult;
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super LanguageUpdateResult> continuation) {
        pUU.KWHzl("LocalizeCoreManager", "updateCurrentLanguage, start");
        AppLocaleInfo appLocaleInfoCopydefault = this.AhwBna.copydefault();
        if (appLocaleInfoCopydefault == null) {
            return new LanguageUpdateResult.ActionBar("localize isn't initialized");
        }
        if (LPUpdateTime.INSTANCE.isUpdateSuccessRecently()) {
            return LanguageUpdateResult.TaskDescription.OLrzqt;
        }
        return setAppLanguage$default(this, new LanguageUnit(appLocaleInfoCopydefault.getMarket(), appLocaleInfoCopydefault.getLanguageCode()), new LangChangeConfig(LanguageListConfig.NO_CHECK, LanguagePackConfig.NEED_LATEST, null, true, 4, null), false, continuation, 4, null);
    }

    public final java.lang.Object OLrzqt(LanguageUnit languageUnit, Continuation<? super Unit> continuation) {
        pUU.KWHzl("LocalizeCoreManager", "loadAndUpdateAsync, async step start.");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.gEmmrt), null, null, new LocalizeCoreManager$loadAndUpdateAsync$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(this.gEmmrt).plus(oJV.AEQbTJ.AYXKKw())), null, null, new LocalizeCoreManager$loadAndUpdateAsync$3(this, languageUnit, null), 3, null);
        pUU.KWHzl("LocalizeCoreManager", "updateAsync, async step finish.");
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        AppLocaleInfo appLocaleInfoDjBIcL = this.AhwBna.djBIcL();
        GroupLanguages groupLanguagesAEQbTJ = this.isConnected.AEQbTJ(new LanguageUnit(appLocaleInfoDjBIcL.getMarket(), appLocaleInfoDjBIcL.getLanguageCode()));
        if (groupLanguagesAEQbTJ != null) {
            pTG ptg = pTG.OLrzqt;
            ptg.OLrzqt(ptg.AEQbTJ(groupLanguagesAEQbTJ, this.DbNXlk));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        LocalizeCoreManager$updateAndBroadcast$1 localizeCoreManager$updateAndBroadcast$1;
        pTJ ptj;
        LanguageUpdateResult languageUpdateResult;
        if (continuation instanceof LocalizeCoreManager$updateAndBroadcast$1) {
            localizeCoreManager$updateAndBroadcast$1 = (LocalizeCoreManager$updateAndBroadcast$1) continuation;
            int i = localizeCoreManager$updateAndBroadcast$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                localizeCoreManager$updateAndBroadcast$1.label = i - Integer.MIN_VALUE;
            } else {
                localizeCoreManager$updateAndBroadcast$1 = new LocalizeCoreManager$updateAndBroadcast$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = localizeCoreManager$updateAndBroadcast$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = localizeCoreManager$updateAndBroadcast$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            localizeCoreManager$updateAndBroadcast$1.L$0 = this;
            localizeCoreManager$updateAndBroadcast$1.label = 1;
            objAEQbTJ = AEQbTJ(localizeCoreManager$updateAndBroadcast$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            ptj = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                languageUpdateResult = (LanguageUpdateResult) localizeCoreManager$updateAndBroadcast$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                RxBus.KWHzl("event_cold_init_language_done");
                pUU.KWHzl("LocalizeCoreManager", "initLocalize, async step finished.result:" + languageUpdateResult);
                return Unit.INSTANCE;
            }
            ptj = (pTJ) localizeCoreManager$updateAndBroadcast$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        LanguageUpdateResult languageUpdateResult2 = (LanguageUpdateResult) objAEQbTJ;
        MutableSharedFlow<LanguageUpdateResult> mutableSharedFlow = ptj.copydefault;
        localizeCoreManager$updateAndBroadcast$1.L$0 = languageUpdateResult2;
        localizeCoreManager$updateAndBroadcast$1.label = 2;
        if (mutableSharedFlow.emit(languageUpdateResult2, localizeCoreManager$updateAndBroadcast$1) == objCopydefault) {
            return objCopydefault;
        }
        languageUpdateResult = languageUpdateResult2;
        RxBus.KWHzl("event_cold_init_language_done");
        pUU.KWHzl("LocalizeCoreManager", "initLocalize, async step finished.result:" + languageUpdateResult);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae A[PHI: r10
  0x00ae: PHI (r10v13 java.lang.Object) = (r10v12 java.lang.Object), (r10v1 java.lang.Object) binds: [B:34:0x00ab, B:13:0x002d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(AppLocaleInfo appLocaleInfo, Continuation<? super LanguageUnit> continuation) throws java.lang.Throwable {
        LocalizeCoreManager$getAvailableLocale$1 localizeCoreManager$getAvailableLocale$1;
        pTJ ptj;
        LanguageUnit languageUnit;
        java.lang.Object objAEQbTJ;
        pTJ ptj2;
        LanguageUnit languageUnit2;
        java.util.List<LanguageItem> list;
        if (continuation instanceof LocalizeCoreManager$getAvailableLocale$1) {
            localizeCoreManager$getAvailableLocale$1 = (LocalizeCoreManager$getAvailableLocale$1) continuation;
            int i = localizeCoreManager$getAvailableLocale$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                localizeCoreManager$getAvailableLocale$1.label = i - Integer.MIN_VALUE;
            } else {
                localizeCoreManager$getAvailableLocale$1 = new LocalizeCoreManager$getAvailableLocale$1(this, continuation);
            }
        }
        LocalizeCoreManager$getAvailableLocale$1 localizeCoreManager$getAvailableLocale$12 = localizeCoreManager$getAvailableLocale$1;
        java.lang.Object objEZpvd = localizeCoreManager$getAvailableLocale$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = localizeCoreManager$getAvailableLocale$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            java.util.Locale localeCopydefault = C38301pTs.OLrzqt.copydefault();
            if (appLocaleInfo != null) {
                languageUnit = new LanguageUnit(appLocaleInfo.getMarket(), appLocaleInfo.getLanguageCode());
                ptj = this;
                LanguagesListRepository languagesListRepository = ptj.djBIcL;
                LanguagesListRepository.LoadType loadType = LanguagesListRepository.LoadType.CACHE_AND_EMBEDDED;
                localizeCoreManager$getAvailableLocale$12.L$0 = ptj;
                localizeCoreManager$getAvailableLocale$12.L$1 = languageUnit;
                localizeCoreManager$getAvailableLocale$12.label = 2;
                objAEQbTJ = languagesListRepository.AEQbTJ(loadType, (java.lang.String) null, localizeCoreManager$getAvailableLocale$12);
                if (objAEQbTJ != objCopydefault) {
                    return objCopydefault;
                }
                ptj2 = ptj;
                languageUnit2 = languageUnit;
                objEZpvd = objAEQbTJ;
                list = (java.util.List) objEZpvd;
                if (list != null) {
                }
                java.lang.String languageCode = languageUnit2.getLanguageCode();
                C38314pUe c38314pUe = ptj2.AEQbTJ;
                java.lang.String market = languageUnit2.getMarket();
                localizeCoreManager$getAvailableLocale$12.L$0 = null;
                localizeCoreManager$getAvailableLocale$12.L$1 = null;
                localizeCoreManager$getAvailableLocale$12.label = 3;
                objEZpvd = ptj2.KWHzl(languageCode, list, c38314pUe, market, localizeCoreManager$getAvailableLocale$12);
                if (objEZpvd != objCopydefault) {
                }
            } else {
                C38314pUe c38314pUe2 = this.AEQbTJ;
                localizeCoreManager$getAvailableLocale$12.L$0 = this;
                localizeCoreManager$getAvailableLocale$12.label = 1;
                objEZpvd = c38314pUe2.EZpvd(localeCopydefault, (java.lang.String) null, localizeCoreManager$getAvailableLocale$12);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                ptj = this;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        C56391yDq.AEQbTJ(objEZpvd);
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                languageUnit2 = (LanguageUnit) localizeCoreManager$getAvailableLocale$12.L$1;
                ptj2 = (pTJ) localizeCoreManager$getAvailableLocale$12.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                list = (java.util.List) objEZpvd;
                if (list != null) {
                    list.isEmpty();
                }
                java.lang.String languageCode2 = languageUnit2.getLanguageCode();
                C38314pUe c38314pUe3 = ptj2.AEQbTJ;
                java.lang.String market2 = languageUnit2.getMarket();
                localizeCoreManager$getAvailableLocale$12.L$0 = null;
                localizeCoreManager$getAvailableLocale$12.L$1 = null;
                localizeCoreManager$getAvailableLocale$12.label = 3;
                objEZpvd = ptj2.KWHzl(languageCode2, list, c38314pUe3, market2, localizeCoreManager$getAvailableLocale$12);
                return objEZpvd != objCopydefault ? objCopydefault : objEZpvd;
            }
            ptj = (pTJ) localizeCoreManager$getAvailableLocale$12.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        languageUnit = (LanguageUnit) objEZpvd;
        LanguagesListRepository languagesListRepository2 = ptj.djBIcL;
        LanguagesListRepository.LoadType loadType2 = LanguagesListRepository.LoadType.CACHE_AND_EMBEDDED;
        localizeCoreManager$getAvailableLocale$12.L$0 = ptj;
        localizeCoreManager$getAvailableLocale$12.L$1 = languageUnit;
        localizeCoreManager$getAvailableLocale$12.label = 2;
        objAEQbTJ = languagesListRepository2.AEQbTJ(loadType2, (java.lang.String) null, localizeCoreManager$getAvailableLocale$12);
        if (objAEQbTJ != objCopydefault) {
        }
    }

    public final void EZpvd(AppLocaleInfo appLocaleInfo, AppLocaleInfo appLocaleInfo2, boolean z) {
        Function0<Unit> function0AkhnZx;
        boolean zEZpvd = Intrinsics.EZpvd(appLocaleInfo, appLocaleInfo2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("sendBroadcast, start.  changes:");
        sb.append(!zEZpvd);
        sb.append(", fromLocale:");
        sb.append(appLocaleInfo);
        sb.append(", newAppLocale:");
        sb.append(appLocaleInfo2);
        sb.append(", skipRecreate:");
        sb.append(z);
        sb.append(JwtUtilsKt.JWT_DELIMITER);
        pUU.KWHzl("LocalizeCoreManager", sb.toString());
        if (!Intrinsics.EZpvd(appLocaleInfo, appLocaleInfo2) && (function0AkhnZx = oJV.AEQbTJ.AkhnZx()) != null) {
            function0AkhnZx.invoke();
        }
        BuildersKt__Builders_commonKt.launch$default(oJV.AEQbTJ.gEmmrt(), null, null, new LocalizeCoreManager$sendBroadcast$1(appLocaleInfo, appLocaleInfo2, this, z, null), 3, null);
    }

    public final java.lang.Object copydefault(LanguageUnit languageUnit, Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.gEmmrt, new LocalizeCoreManager$setAppResourceConfig$2(languageUnit, this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, java.util.List<LanguageItem> list, @NotNull C38314pUe c38314pUe, @NotNull java.lang.String str2, @NotNull Continuation<? super LanguageUnit> continuation) {
        if (list == null || list.isEmpty()) {
            pUU.KWHzl("LocalizeCoreManager", "findInSupportListOrDefault, languageList is null. use default language");
            return c38314pUe.EZpvd(str2, continuation);
        }
        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str);
        java.util.Iterator<LanguageItem> it = list.iterator();
        while (it.hasNext()) {
            java.util.Locale locale = it.next().getLocale();
            if (Intrinsics.EZpvd(locale, localeForLanguageTag)) {
                pUU.KWHzl("LocalizeCoreManager", "findInSupportListOrDefault,  find support locale for " + str + ", it's " + locale + " ");
                java.lang.String languageTag = locale.toLanguageTag();
                Intrinsics.checkNotNullExpressionValue(languageTag, "");
                return new LanguageUnit(str2, languageTag);
            }
        }
        pUU.KWHzl("LocalizeCoreManager", "findInSupportListOrDefault, not find support locale for " + str + ", return default");
        return c38314pUe.EZpvd(str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0091 -> B:20:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(LanguageUnit languageUnit, int i, Continuation<? super AppLanguagesChangeResult> continuation) throws java.lang.Throwable {
        LocalizeCoreManager$startSwitchMarket$1 localizeCoreManager$startSwitchMarket$1;
        pTJ ptj;
        int i2;
        LocalizeCoreManager$startSwitchMarket$1 localizeCoreManager$startSwitchMarket$12;
        pTJ ptj2;
        LanguageUnit languageUnit2;
        int i3;
        if (continuation instanceof LocalizeCoreManager$startSwitchMarket$1) {
            localizeCoreManager$startSwitchMarket$1 = (LocalizeCoreManager$startSwitchMarket$1) continuation;
            int i4 = localizeCoreManager$startSwitchMarket$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                localizeCoreManager$startSwitchMarket$1.label = i4 - Integer.MIN_VALUE;
                ptj = this;
            } else {
                ptj = this;
                localizeCoreManager$startSwitchMarket$1 = new LocalizeCoreManager$startSwitchMarket$1(ptj, continuation);
            }
        }
        java.lang.Object obj = localizeCoreManager$startSwitchMarket$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = localizeCoreManager$startSwitchMarket$1.label;
        if (i5 == 0) {
            C56391yDq.AEQbTJ(obj);
            i2 = 0;
            localizeCoreManager$startSwitchMarket$12 = localizeCoreManager$startSwitchMarket$1;
            ptj2 = ptj;
            languageUnit2 = languageUnit;
            i3 = i;
            if (i2 >= i3) {
            }
        } else {
            if (i5 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = localizeCoreManager$startSwitchMarket$1.I$1;
            int i7 = localizeCoreManager$startSwitchMarket$1.I$0;
            LanguageUnit languageUnit3 = (LanguageUnit) localizeCoreManager$startSwitchMarket$1.L$1;
            ptj2 = (pTJ) localizeCoreManager$startSwitchMarket$1.L$0;
            C56391yDq.AEQbTJ(obj);
            LocalizeCoreManager$startSwitchMarket$1 localizeCoreManager$startSwitchMarket$13 = localizeCoreManager$startSwitchMarket$1;
            i3 = i7;
            if (((LanguageUpdateResult) obj) instanceof LanguageUpdateResult.ActionBar) {
                return AppLanguagesChangeResult.SUCCEED;
            }
            int i8 = i6 + 1;
            localizeCoreManager$startSwitchMarket$12 = localizeCoreManager$startSwitchMarket$13;
            i2 = i8;
            languageUnit2 = languageUnit3;
            if (i2 >= i3) {
                pUU.KWHzl("LocalizeCoreManager", "startSwitchMarket, switch for the " + i2 + " times");
                LangChangeConfig langChangeConfig = new LangChangeConfig(LanguageListConfig.NO_CHECK, LanguagePackConfig.CACHE_OR_LATEST_OR_EMBEDDED, null, false, 12, null);
                localizeCoreManager$startSwitchMarket$12.L$0 = ptj2;
                localizeCoreManager$startSwitchMarket$12.L$1 = languageUnit2;
                localizeCoreManager$startSwitchMarket$12.I$0 = i3;
                localizeCoreManager$startSwitchMarket$12.I$1 = i2;
                localizeCoreManager$startSwitchMarket$12.label = 1;
                java.lang.Object objOLrzqt = ptj2.OLrzqt(languageUnit2, langChangeConfig, true, localizeCoreManager$startSwitchMarket$12);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                languageUnit3 = languageUnit2;
                obj = objOLrzqt;
                int i9 = i2;
                localizeCoreManager$startSwitchMarket$13 = localizeCoreManager$startSwitchMarket$12;
                i6 = i9;
                if (((LanguageUpdateResult) obj) instanceof LanguageUpdateResult.ActionBar) {
                }
            } else {
                return AppLanguagesChangeResult.FAIL;
            }
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pTJ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
