package o;

import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import com.okinc.di.LocalizeDIModule;
import com.okinc.localization.bean.LanguageItem;
import com.okinc.localization.internal.repository.LanguagesListRepository;
import com.okinc.localization2.LocalizeServiceImpl$getDebugInfo$1;
import com.okinc.localization2.LocalizeServiceImpl$setAppLanguage$1;
import com.okinc.localization2.LocalizeServiceImpl$setAppLanguage$2;
import com.okinc.localization2.LocalizeServiceImpl$updateCurrentLanguage$1;
import com.okinc.localization2.bean.AppLanguagesChangeResult;
import com.okinc.localization2.bean.AppLocale;
import com.okinc.localization2.bean.LangChangeConfig;
import com.okinc.localization2.bean.LanguageUnit;
import com.okinc.localization2.bean.LanguageUpdateResult;
import com.okinc.localization2.bean.LanguagesSettingFrom;
import com.okinc.localization2.bean.LocalizeEvent;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.serialization.json.JsonElementKt;
import o.pTU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class pTR implements pTU {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final pTJ AEQbTJ;
    public final C38319pUj AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public final C38311pUb OLrzqt;
    public final android.content.Context copydefault;
    public final pTX djBIcL;
    public final pTZ gEmmrt;
    public final LanguagesListRepository valueOf;

    @yCM
    public pTR(@NotNull android.content.Context context, @NotNull LanguagesListRepository languagesListRepository, @NotNull C38311pUb c38311pUb, @NotNull pTX ptx, @NotNull pTZ ptz) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(languagesListRepository, "");
        Intrinsics.checkNotNullParameter(c38311pUb, "");
        Intrinsics.checkNotNullParameter(ptx, "");
        Intrinsics.checkNotNullParameter(ptz, "");
        this.copydefault = context;
        this.valueOf = languagesListRepository;
        this.OLrzqt = c38311pUb;
        this.djBIcL = ptx;
        this.gEmmrt = ptz;
        C43246rlf c43246rlf = C43246rlf.OLrzqt;
        this.AEQbTJ = ((LocalizeDIModule.Application) C58113yvE.copydefault(c43246rlf.valueOf(), LocalizeDIModule.Application.class)).AxsJAYsNCnLh();
        this.AYXKKw = ((LocalizeDIModule.Application) C58113yvE.copydefault(c43246rlf.valueOf(), LocalizeDIModule.Application.class)).DAIeex();
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.pTS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pTR.djBIcL();
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.pTT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pTR.valueOf();
            }
        });
    }

    @Override // o.pTU
    public AppLocale OLrzqt() {
        return AppLocale.Companion.OLrzqt(this.OLrzqt.djBIcL());
    }

    @Override // o.pTU
    public java.lang.Object EZpvd(java.lang.String str, @NotNull Continuation<? super java.util.List<LanguageItem>> continuation) {
        return this.valueOf.AEQbTJ(LanguagesListRepository.LoadType.CACHE_AND_EMBEDDED, str, continuation);
    }

    @Override // o.pTU
    public java.lang.Object OLrzqt(java.lang.String str, @NotNull Continuation<? super java.util.List<LanguageItem>> continuation) {
        return this.valueOf.OLrzqt(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.util.Locale locale, @NotNull LangChangeConfig langChangeConfig, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        LocalizeServiceImpl$setAppLanguage$1 localizeServiceImpl$setAppLanguage$1;
        if (continuation instanceof LocalizeServiceImpl$setAppLanguage$1) {
            localizeServiceImpl$setAppLanguage$1 = (LocalizeServiceImpl$setAppLanguage$1) continuation;
            int i = localizeServiceImpl$setAppLanguage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                localizeServiceImpl$setAppLanguage$1.label = i - Integer.MIN_VALUE;
            } else {
                localizeServiceImpl$setAppLanguage$1 = new LocalizeServiceImpl$setAppLanguage$1(this, continuation);
            }
        }
        LocalizeServiceImpl$setAppLanguage$1 localizeServiceImpl$setAppLanguage$12 = localizeServiceImpl$setAppLanguage$1;
        java.lang.Object appLanguage$default = localizeServiceImpl$setAppLanguage$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = localizeServiceImpl$setAppLanguage$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(appLanguage$default);
            java.lang.String market = this.OLrzqt.djBIcL().getMarket();
            java.lang.String languageTag = locale.toLanguageTag();
            Intrinsics.checkNotNullExpressionValue(languageTag, "");
            LanguageUnit languageUnit = new LanguageUnit(market, languageTag);
            pTJ ptj = this.AEQbTJ;
            localizeServiceImpl$setAppLanguage$12.label = 1;
            appLanguage$default = pTJ.setAppLanguage$default(ptj, languageUnit, langChangeConfig, false, localizeServiceImpl$setAppLanguage$12, 4, null);
            if (appLanguage$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(appLanguage$default);
        }
        return C56443yFo.KWHzl(!(appLanguage$default instanceof LanguageUpdateResult.ActionBar));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.pTU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull LanguageUnit languageUnit, @NotNull LangChangeConfig langChangeConfig, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        LocalizeServiceImpl$setAppLanguage$2 localizeServiceImpl$setAppLanguage$2;
        if (continuation instanceof LocalizeServiceImpl$setAppLanguage$2) {
            localizeServiceImpl$setAppLanguage$2 = (LocalizeServiceImpl$setAppLanguage$2) continuation;
            int i = localizeServiceImpl$setAppLanguage$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                localizeServiceImpl$setAppLanguage$2.label = i - Integer.MIN_VALUE;
            } else {
                localizeServiceImpl$setAppLanguage$2 = new LocalizeServiceImpl$setAppLanguage$2(this, continuation);
            }
        }
        LocalizeServiceImpl$setAppLanguage$2 localizeServiceImpl$setAppLanguage$22 = localizeServiceImpl$setAppLanguage$2;
        java.lang.Object appLanguage$default = localizeServiceImpl$setAppLanguage$22.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = localizeServiceImpl$setAppLanguage$22.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(appLanguage$default);
            pTJ ptj = this.AEQbTJ;
            localizeServiceImpl$setAppLanguage$22.label = 1;
            appLanguage$default = pTJ.setAppLanguage$default(ptj, languageUnit, langChangeConfig, false, localizeServiceImpl$setAppLanguage$22, 4, null);
            if (appLanguage$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(appLanguage$default);
        }
        return C56443yFo.KWHzl(!(appLanguage$default instanceof LanguageUpdateResult.ActionBar));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        LocalizeServiceImpl$updateCurrentLanguage$1 localizeServiceImpl$updateCurrentLanguage$1;
        if (continuation instanceof LocalizeServiceImpl$updateCurrentLanguage$1) {
            localizeServiceImpl$updateCurrentLanguage$1 = (LocalizeServiceImpl$updateCurrentLanguage$1) continuation;
            int i = localizeServiceImpl$updateCurrentLanguage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                localizeServiceImpl$updateCurrentLanguage$1.label = i - Integer.MIN_VALUE;
            } else {
                localizeServiceImpl$updateCurrentLanguage$1 = new LocalizeServiceImpl$updateCurrentLanguage$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = localizeServiceImpl$updateCurrentLanguage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = localizeServiceImpl$updateCurrentLanguage$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            pTJ ptj = this.AEQbTJ;
            localizeServiceImpl$updateCurrentLanguage$1.label = 1;
            objAEQbTJ = ptj.AEQbTJ(localizeServiceImpl$updateCurrentLanguage$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        return C56443yFo.KWHzl(!(objAEQbTJ instanceof LanguageUpdateResult.ActionBar));
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Lkotlinx/coroutines/flow/Flow; */
    @Override // o.pTU
    /* JADX INFO: renamed from: isConnected, reason: merged with bridge method [inline-methods] */
    public SharedFlow<LocalizeEvent> AEQbTJ() {
        return this.AEQbTJ.AEQbTJ();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl()Lkotlinx/coroutines/flow/Flow; */
    @Override // o.pTU
    /* JADX INFO: renamed from: AkhnZx, reason: merged with bridge method [inline-methods] */
    public SharedFlow<LanguageUpdateResult> KWHzl() {
        return this.AEQbTJ.copydefault();
    }

    @Override // o.pTU
    public java.lang.Object copydefault(FragmentActivity fragmentActivity, @NotNull JsonObject jsonObject, @NotNull LanguagesSettingFrom languagesSettingFrom, @NotNull Continuation<? super AppLanguagesChangeResult> continuation) {
        return this.AEQbTJ.AEQbTJ(fragmentActivity, jsonObject, languagesSettingFrom, continuation);
    }

    @Override // o.pTU
    public void copydefault() {
        this.gEmmrt.OLrzqt();
    }

    public final C38313pUd AhwBna() {
        return (C38313pUd) this.EZpvd.getValue();
    }

    public static final C38313pUd djBIcL() {
        return ((LocalizeDIModule.Application) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), LocalizeDIModule.Application.class)).iZzfmt();
    }

    public final pUE gEmmrt() {
        return (pUE) this.AhwBna.getValue();
    }

    public static final pUE valueOf() {
        return ((LocalizeDIModule.Application) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), LocalizeDIModule.Application.class)).accept();
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        LocalizeServiceImpl$getDebugInfo$1 localizeServiceImpl$getDebugInfo$1;
        int size;
        java.lang.StringBuilder sb;
        pTR ptr;
        AppLocale appLocale;
        java.lang.StringBuilder sb2;
        java.lang.StringBuilder sb3;
        java.lang.StringBuilder sb4;
        if (continuation instanceof LocalizeServiceImpl$getDebugInfo$1) {
            localizeServiceImpl$getDebugInfo$1 = (LocalizeServiceImpl$getDebugInfo$1) continuation;
            int i = localizeServiceImpl$getDebugInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                localizeServiceImpl$getDebugInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                localizeServiceImpl$getDebugInfo$1 = new LocalizeServiceImpl$getDebugInfo$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = localizeServiceImpl$getDebugInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = localizeServiceImpl$getDebugInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            if (pTG.OLrzqt.EZpvd(this.copydefault, "", "startup_keys.json")) {
                java.io.InputStream inputStreamOpen = this.copydefault.getAssets().open("startup_keys.json");
                Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
                java.io.Reader inputStreamReader = new java.io.InputStreamReader(inputStreamOpen, Charsets.UTF_8);
                java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
                try {
                    java.lang.String strAEQbTJ = yFK.AEQbTJ(bufferedReader);
                    yFA.copydefault(bufferedReader, null);
                    size = JsonElementKt.getJsonArray(oJV.AEQbTJ.DbNXlk().parseToJsonElement(strAEQbTJ)).size();
                } finally {
                }
            } else {
                size = -1;
            }
            sb = new java.lang.StringBuilder();
            AppLocale appLocaleOLrzqt = OLrzqt();
            sb.append("currentLocale: " + appLocaleOLrzqt);
            sb.append('\n');
            sb.append('\n');
            sb.append("currentMarketAvailable:" + this.djBIcL.EZpvd());
            sb.append('\n');
            sb.append('\n');
            sb.append("startup cost time:" + oJV.AEQbTJ.values());
            sb.append('\n');
            sb.append("embedded startup keys:" + size);
            sb.append('\n');
            pUE pueGEmmrt = gEmmrt();
            localizeServiceImpl$getDebugInfo$1.L$0 = this;
            localizeServiceImpl$getDebugInfo$1.L$1 = sb;
            localizeServiceImpl$getDebugInfo$1.L$2 = appLocaleOLrzqt;
            localizeServiceImpl$getDebugInfo$1.L$3 = sb;
            localizeServiceImpl$getDebugInfo$1.label = 1;
            objKWHzl = pueGEmmrt.KWHzl(localizeServiceImpl$getDebugInfo$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            ptr = this;
            appLocale = appLocaleOLrzqt;
            sb2 = sb;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sb4 = (java.lang.StringBuilder) localizeServiceImpl$getDebugInfo$1.L$1;
                sb3 = (java.lang.StringBuilder) localizeServiceImpl$getDebugInfo$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                java.util.List list = (java.util.List) objKWHzl;
                sb4.append("cacheLanguageList: " + (list != null ? C56443yFo.AEQbTJ(list.size()) : null));
                sb4.append('\n');
                java.lang.String string = sb3.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
            java.lang.StringBuilder sb5 = (java.lang.StringBuilder) localizeServiceImpl$getDebugInfo$1.L$3;
            AppLocale appLocale2 = (AppLocale) localizeServiceImpl$getDebugInfo$1.L$2;
            java.lang.StringBuilder sb6 = (java.lang.StringBuilder) localizeServiceImpl$getDebugInfo$1.L$1;
            ptr = (pTR) localizeServiceImpl$getDebugInfo$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            sb2 = sb5;
            sb = sb6;
            appLocale = appLocale2;
        }
        sb2.append("current startup keys:" + ((java.util.List) objKWHzl).size());
        sb2.append('\n');
        sb.append("startup strings for " + appLocale.getLanguageCode() + ":" + ptr.gEmmrt().OLrzqt(appLocale.getLanguageCode()).getSecond().OLrzqt());
        sb.append('\n');
        if (!Intrinsics.EZpvd((java.lang.Object) appLocale.getLanguageCode(), (java.lang.Object) "en-US")) {
            sb.append("startup strings for en-US:" + ptr.gEmmrt().OLrzqt("en-US").getSecond().OLrzqt());
            sb.append('\n');
        }
        sb.append('\n');
        sb.append("useEmbeddedMode: " + ptr.AYXKKw.KWHzl());
        sb.append('\n');
        sb.append('\n');
        pSI psiKWHzl = ptr.AhwBna().KWHzl();
        Intrinsics.copydefault(psiKWHzl, "");
        sb.append(ptr.copydefault("marketCurrentRepo", (pSN) psiKWHzl));
        sb.append('\n');
        sb.append('\n');
        pSI psiEZpvd = ptr.AhwBna().EZpvd();
        Intrinsics.copydefault(psiEZpvd, "");
        sb.append(ptr.copydefault("marketDefaultRepo", (pSN) psiEZpvd));
        sb.append('\n');
        sb.append('\n');
        pSI psiOLrzqt = ptr.AhwBna().OLrzqt();
        Intrinsics.copydefault(psiOLrzqt, "");
        sb.append(ptr.copydefault("globalCurrentRepo", (pSN) psiOLrzqt));
        sb.append('\n');
        sb.append('\n');
        pSI psiCopydefault = ptr.AhwBna().copydefault();
        Intrinsics.copydefault(psiCopydefault, "");
        sb.append(ptr.copydefault("globalDefaultRepo", (pSN) psiCopydefault));
        sb.append('\n');
        sb.append('\n');
        localizeServiceImpl$getDebugInfo$1.L$0 = sb;
        localizeServiceImpl$getDebugInfo$1.L$1 = sb;
        localizeServiceImpl$getDebugInfo$1.L$2 = null;
        localizeServiceImpl$getDebugInfo$1.L$3 = null;
        localizeServiceImpl$getDebugInfo$1.label = 2;
        objKWHzl = pTU.StateListAnimator.getLanguageListFromLocal$default(ptr, null, localizeServiceImpl$getDebugInfo$1, 1, null);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        sb3 = sb;
        sb4 = sb3;
        java.util.List list2 = (java.util.List) objKWHzl;
        if (list2 != null) {
        }
        sb4.append("cacheLanguageList: " + (list2 != null ? C56443yFo.AEQbTJ(list2.size()) : null));
        sb4.append('\n');
        java.lang.String string2 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    public final java.lang.String copydefault(java.lang.String str, pSN psn) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str + ": ");
        sb.append("contentVersion: " + psn.OLrzqt() + ",");
        sb.append("contentLocale: " + psn.valueOf() + ",");
        sb.append(psn.AhwBna());
        return sb.toString();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pTR.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
