package com.okinc.ok_kyc_core_okx_impl.foebidden.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionDiffSet;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AJR;
import o.AKL;
import o.AbstractC2440ALv;
import o.C33077mpe;
import o.C33129mqd;
import o.C43453rpa;
import o.C4449Bem;
import o.C54819xWm;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56444yFp;
import o.InterfaceC2438ALt;
import o.InterfaceC54816xWj;
import o.InterfaceC56445yFq;
import o.pHH;
import o.pUU;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class FeatureRestrictionCoreRepository implements pHH, InterfaceC2438ALt {
    public final CoroutineContext AEQbTJ;
    public final CopyOnWriteArrayList<Activity> AYXKKw;
    public final MutableSharedFlow<FeatureRestrictionDiffSet> AhwBna;
    public long AkhnZx;
    public final MutableSharedFlow<Unit> DbNXlk;
    public final AJR EZpvd;
    public final android.app.Application KWHzl;
    public final int OLrzqt;
    public final String copydefault;
    public int djBIcL;
    public long fetchVPNInfo;
    public DataValidity gEmmrt;
    public boolean isConnected;
    public boolean valueOf;
    public final CoroutineScope values;

    public interface Activity {
        void EZpvd(boolean z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public SharedFlow<Unit> AxsJAY() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public SharedFlow<FeatureRestrictionDiffSet> gHZMYf() {
        return this.AhwBna;
    }

    public FeatureRestrictionCoreRepository(@NotNull android.app.Application application, @NotNull CoroutineContext coroutineContext, @NotNull AJR ajr) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(ajr, "");
        this.KWHzl = application;
        this.AEQbTJ = coroutineContext;
        this.EZpvd = ajr;
        this.AhwBna = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.DbNXlk = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.OLrzqt = 3000;
        this.AYXKKw = new CopyOnWriteArrayList<>();
        this.values = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getDefault()));
        this.copydefault = "FeatureRestrictionCoreRepository";
        this.gEmmrt = DataValidity.INVALID;
        this.isConnected = true;
        ajr.KWHzl(this);
    }

    @Override // o.pHH
    public String hDKMBd() {
        String strValueOf = this.EZpvd.valueOf();
        return strValueOf == null ? "" : strValueOf;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DataValidity {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ DataValidity[] $VALUES;
        public static final DataValidity INVALID = new DataValidity("INVALID", 0);
        public static final DataValidity LOADING = new DataValidity("LOADING", 1);
        public static final DataValidity VALID = new DataValidity("VALID", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ DataValidity[] $values() {
            return new DataValidity[]{INVALID, LOADING, VALID};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<DataValidity> getEntries() {
            return $ENTRIES;
        }

        static {
            DataValidity[] dataValidityArr$values = $values();
            $VALUES = dataValidityArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(dataValidityArr$values);
        }

        private DataValidity(String str, int i) {
        }

        public static DataValidity valueOf(String str) {
            return (DataValidity) Enum.valueOf(DataValidity.class, str);
        }

        public static DataValidity[] values() {
            return (DataValidity[]) $VALUES.clone();
        }
    }

    public static final class ActionBar implements InterfaceC54816xWj {
        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
        }

        public ActionBar() {
        }

        @Override // o.InterfaceC54816xWj
        public void copydefault() {
            if (!FeatureRestrictionCoreRepository.this.isConnected) {
                FeatureRestrictionCoreRepository featureRestrictionCoreRepository = FeatureRestrictionCoreRepository.this;
                featureRestrictionCoreRepository.copydefault(featureRestrictionCoreRepository.AEQbTJ, "onAppEnterForeground");
            }
            FeatureRestrictionCoreRepository.this.isConnected = false;
        }
    }

    @Override // o.pHH
    public void RcXXUw() {
        C54819xWm.KWHzl().AEQbTJ(new ActionBar());
    }

    @Override // o.pHH
    public JSONObject KWHzl(@NotNull ArrayList<String> arrayList) {
        Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(arrayList, "");
        copydefault(this.AEQbTJ, "getForbidCountriesInformationWithFeatures");
        String strHDKMBd = hDKMBd();
        JSONObject jSONObject = new JSONObject();
        if (StringsKt__StringsKt.fARcdN((CharSequence) strHDKMBd)) {
            return jSONObject;
        }
        try {
            Result.Application application = Result.Companion;
            JSONObject jSONObject2 = new JSONObject(strHDKMBd);
            for (String str : arrayList) {
                jSONObject.put(str, jSONObject2.optJSONObject(str));
            }
            String str2 = this.copydefault;
            for (String str3 : arrayList) {
            }
            pUU.KWHzl(str2, "getForbidCountriesInformationWithFeatures->" + Unit.INSTANCE + "->" + jSONObject);
            objM7377constructorimpl = Result.m7377constructorimpl(jSONObject);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = new JSONObject();
        }
        return (JSONObject) objM7377constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    @Override // o.pHH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FeatureRestrictionInfo EZpvd(@NotNull OKComplianceRestrictionService.Feature feature) {
        OKComplianceRestrictionService.FeatureAction featureAction;
        Intrinsics.checkNotNullParameter(feature, "");
        AKL aklAEQbTJ = AEQbTJ(feature, "currentRestrictionSubModel");
        if (aklAEQbTJ == null) {
            return null;
        }
        Long lValueOf = aklAEQbTJ.KWHzl() != null ? Long.valueOf(r3.intValue()) : null;
        String strOLrzqt = aklAEQbTJ.OLrzqt();
        String strEZpvd = aklAEQbTJ.EZpvd();
        boolean zAEQbTJ = aklAEQbTJ.AEQbTJ();
        Integer numGEmmrt = aklAEQbTJ.gEmmrt();
        String strAkhnZx = aklAEQbTJ.AkhnZx();
        String strCopydefault = aklAEQbTJ.copydefault();
        if (strCopydefault == null) {
            featureAction = OKComplianceRestrictionService.FeatureAction.NO_FEATURE;
        } else {
            int iHashCode = strCopydefault.hashCode();
            if (iHashCode != -1165870106) {
                if (iHashCode != -88947160) {
                    if (iHashCode == 641737913 && strCopydefault.equals("redirectOKXWallet")) {
                        featureAction = OKComplianceRestrictionService.FeatureAction.REDIRECT_OKX_WALLET;
                    }
                } else if (strCopydefault.equals("advancedQuestion")) {
                    featureAction = OKComplianceRestrictionService.FeatureAction.UK_QUESTION;
                }
            } else if (strCopydefault.equals("question")) {
                featureAction = OKComplianceRestrictionService.FeatureAction.QUESTION;
            }
        }
        return new FeatureRestrictionInfo(lValueOf, strOLrzqt, strEZpvd, feature, Boolean.valueOf(zAEQbTJ), numGEmmrt, strAkhnZx, featureAction, aklAEQbTJ.djBIcL(), aklAEQbTJ.valueOf(), Boolean.valueOf(aklAEQbTJ.values()), Boolean.valueOf(aklAEQbTJ.AhwBna()), this.EZpvd.AYXKKw(), aklAEQbTJ.AYXKKw(), Boolean.valueOf(this.EZpvd.isConnected()), (Boolean) null, 32768, (DefaultConstructorMarker) null);
    }

    @Override // o.pHH
    public boolean AEQbTJ(@NotNull OKComplianceRestrictionService.Feature feature) {
        Intrinsics.checkNotNullParameter(feature, "");
        copydefault(this.AEQbTJ, "isFeatureHidden");
        return this.EZpvd.OLrzqt(feature.getType());
    }

    @Override // o.pHH
    public boolean OLrzqt(@NotNull OKComplianceRestrictionService.Feature feature) {
        Intrinsics.checkNotNullParameter(feature, "");
        copydefault(this.AEQbTJ, "isFeatureLimit");
        return this.EZpvd.KWHzl(feature.getType());
    }

    @Override // o.pHH
    public String AuCTelauCTel() {
        copydefault(this.AEQbTJ, "getEntityId");
        return this.EZpvd.AYXKKw();
    }

    @Override // o.pHH
    public String zsXlph() {
        copydefault(this.AEQbTJ, "getCountry");
        return this.EZpvd.djBIcL();
    }

    @Override // o.pHH
    public boolean djSkpj() {
        copydefault(this.AEQbTJ, "isCrMarket");
        return this.EZpvd.isConnected();
    }

    @Override // o.pHH
    public void getFieldNames() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.AEQbTJ), null, null, new FeatureRestrictionCoreRepository$forceRefreshFeatureRestriction$1(this, null), 3, null);
    }

    @Override // o.pHH
    public JsonObject AwvSrB() {
        copydefault(this.AEQbTJ, "getI18nDtoLocalLanguages");
        try {
            Result.Application application = Result.Companion;
            String strGEmmrt = this.EZpvd.gEmmrt();
            if (C33129mqd.OLrzqt((CharSequence) strGEmmrt)) {
                return JsonParser.parseString(strGEmmrt).getAsJsonObject();
            }
            return null;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Object objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.KWHzl(this.copydefault, "updateLocalLanguages | " + thM7380exceptionOrNullimpl.getMessage());
            }
            return (JsonObject) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        }
    }

    @Override // o.pHH
    public void EZpvd(@NotNull CoroutineScope coroutineScope, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        pUU.KWHzl(this.copydefault, "forceRefreshFeatureRestrictionWhithKyc");
        this.gEmmrt = DataValidity.INVALID;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FeatureRestrictionCoreRepository$forceRefreshFeatureRestrictionWhithKyc$1(this, function1, null), 3, null);
    }

    @Override // o.pHH
    public void AEQbTJ(@NotNull CoroutineScope coroutineScope, @NotNull OKComplianceRestrictionService.UserEvent userEvent, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(userEvent, "");
        pUU.KWHzl(this.copydefault, "forceRefreshFeatureRestrictionWhithAccount->" + userEvent);
        this.gEmmrt = DataValidity.INVALID;
        this.valueOf = false;
        this.EZpvd.EZpvd();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FeatureRestrictionCoreRepository$forceRefreshFeatureRestrictionWhithAccount$1(this, function1, null), 3, null);
    }

    @Override // o.pHH
    public void KWHzl(@NotNull CoroutineScope coroutineScope, Boolean bool, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        pUU.KWHzl(this.copydefault, "fetchLatestFeatureRestrictionStatus  dataValidity=" + this.gEmmrt + "  isAcceptCache=" + bool);
        DataValidity dataValidity = this.gEmmrt;
        if (dataValidity == DataValidity.LOADING && function1 != null) {
            pUU.EZpvd(this.copydefault, "addCallBack ");
            this.AYXKKw.add(new Application(function1, this));
            return;
        }
        DataValidity dataValidity2 = DataValidity.VALID;
        if (dataValidity == dataValidity2 && System.currentTimeMillis() - this.AkhnZx < this.OLrzqt) {
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
                return;
            }
            return;
        }
        if (this.gEmmrt == dataValidity2) {
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.EZpvd(bool, bool2)) {
                if (function1 != null) {
                    function1.invoke(bool2);
                    return;
                }
                return;
            }
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FeatureRestrictionCoreRepository$fetchLatestFeatureRestrictionStatus$2(this, function1, null), 3, null);
    }

    public static final class Application implements Activity {
        public final /* synthetic */ FeatureRestrictionCoreRepository EZpvd;
        public final /* synthetic */ Function1<Boolean, Unit> KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Function1<? super Boolean, Unit> function1, FeatureRestrictionCoreRepository featureRestrictionCoreRepository) {
            this.KWHzl = function1;
            this.EZpvd = featureRestrictionCoreRepository;
        }

        @Override // com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionCoreRepository.Activity
        public void EZpvd(boolean z) {
            try {
                this.KWHzl.invoke(Boolean.valueOf(z));
            } catch (Exception e) {
                pUU.AEQbTJ(this.EZpvd.copydefault, "Callback execution failed", e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.pHH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object copydefault(@NotNull Continuation<? super Boolean> continuation) throws Throwable {
        FeatureRestrictionCoreRepository$refreshFeatureRestrictions$1 featureRestrictionCoreRepository$refreshFeatureRestrictions$1;
        Object objAEQbTJ;
        FeatureRestrictionCoreRepository featureRestrictionCoreRepository;
        if (continuation instanceof FeatureRestrictionCoreRepository$refreshFeatureRestrictions$1) {
            featureRestrictionCoreRepository$refreshFeatureRestrictions$1 = (FeatureRestrictionCoreRepository$refreshFeatureRestrictions$1) continuation;
            int i = featureRestrictionCoreRepository$refreshFeatureRestrictions$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                featureRestrictionCoreRepository$refreshFeatureRestrictions$1.label = i - Integer.MIN_VALUE;
            } else {
                featureRestrictionCoreRepository$refreshFeatureRestrictions$1 = new FeatureRestrictionCoreRepository$refreshFeatureRestrictions$1(this, continuation);
            }
        }
        Object obj = featureRestrictionCoreRepository$refreshFeatureRestrictions$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = featureRestrictionCoreRepository$refreshFeatureRestrictions$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            this.gEmmrt = DataValidity.LOADING;
            C4449Bem c4449BemAhwBna = this.EZpvd.AhwBna();
            C33077mpe c33077mpe = new C33077mpe(new FeatureRestrictionCoreRepository$refreshFeatureRestrictions$wrapper$1(c4449BemAhwBna), new FeatureRestrictionCoreRepository$refreshFeatureRestrictions$wrapper$2(c4449BemAhwBna), new FeatureRestrictionCoreRepository$refreshFeatureRestrictions$wrapper$3(c4449BemAhwBna), new FeatureRestrictionCoreRepository$refreshFeatureRestrictions$wrapper$4(c4449BemAhwBna), null, 16, null);
            featureRestrictionCoreRepository$refreshFeatureRestrictions$1.L$0 = this;
            featureRestrictionCoreRepository$refreshFeatureRestrictions$1.label = 1;
            objAEQbTJ = c33077mpe.AEQbTJ(featureRestrictionCoreRepository$refreshFeatureRestrictions$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            featureRestrictionCoreRepository = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            featureRestrictionCoreRepository = (FeatureRestrictionCoreRepository) featureRestrictionCoreRepository$refreshFeatureRestrictions$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            featureRestrictionCoreRepository.gEmmrt = DataValidity.VALID;
            featureRestrictionCoreRepository.AkhnZx = System.currentTimeMillis();
        } else {
            featureRestrictionCoreRepository.gEmmrt = DataValidity.LOADING;
        }
        featureRestrictionCoreRepository.copydefault(Result.m7384isSuccessimpl(objAEQbTJ));
        return C56443yFo.KWHzl(Result.m7384isSuccessimpl(objAEQbTJ));
    }

    @Override // o.pHH
    public boolean AEQbTJ(@NotNull OKComplianceRestrictionService.CefiMode cefiMode) {
        Intrinsics.checkNotNullParameter(cefiMode, "");
        copydefault(this.AEQbTJ, "isSupportCefiMode");
        return this.EZpvd.EZpvd(cefiMode.getModeName());
    }

    @Override // o.pHH
    public boolean OLrzqt(@NotNull OKComplianceRestrictionService.AppMode appMode) {
        Intrinsics.checkNotNullParameter(appMode, "");
        copydefault(this.AEQbTJ, "isSupportAppMode");
        return this.EZpvd.AEQbTJ(appMode.getModeName());
    }

    @Override // o.pHH
    public List<String> AuCTel() {
        copydefault(this.AEQbTJ, "appModes");
        return this.EZpvd.KWHzl();
    }

    @Override // o.pHH
    public List<String> fIwbmz() {
        copydefault(this.AEQbTJ, "cefiModes");
        return this.EZpvd.copydefault();
    }

    @Override // o.pHH
    public List<String> ejfBZ() {
        copydefault(this.AEQbTJ, "crTradingPageModes");
        return this.EZpvd.AEQbTJ();
    }

    @Override // o.pHH
    public List<String> getNewProxyInstance() {
        copydefault(this.AEQbTJ, "crTradingPageModes");
        return this.EZpvd.OLrzqt();
    }

    @Override // o.pHH
    public boolean dNCPSb() {
        copydefault(this.AEQbTJ, "isSupportCrTradingModes");
        return C33129mqd.KWHzl((Collection) this.EZpvd.AEQbTJ());
    }

    @Override // o.InterfaceC2438ALt
    public void EZpvd(@NotNull AbstractC2440ALv abstractC2440ALv) {
        Intrinsics.checkNotNullParameter(abstractC2440ALv, "");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.AEQbTJ), null, null, new FeatureRestrictionCoreRepository$onFeatureRestrictionEvent$1(abstractC2440ALv, this, null), 3, null);
    }

    public final void copydefault(CoroutineContext coroutineContext, String str) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(coroutineContext), null, null, new FeatureRestrictionCoreRepository$initializeIfNeededSync$1(this, str, null), 3, null);
    }

    public final Object AEQbTJ(String str, Continuation<? super Unit> continuation) throws Throwable {
        int i;
        if (this.gEmmrt != DataValidity.INVALID || !C43453rpa.AEQbTJ.KWHzl(this.KWHzl)) {
            return Unit.INSTANCE;
        }
        if (System.currentTimeMillis() - this.fetchVPNInfo < 3000 && (i = this.djBIcL) < 3) {
            this.djBIcL = i + 1;
            return Unit.INSTANCE;
        }
        this.djBIcL = 0;
        pUU.KWHzl(this.copydefault, str + "-->initializeIfNeeded");
        this.fetchVPNInfo = System.currentTimeMillis();
        Object objCopydefault = copydefault((Continuation<? super Boolean>) continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    public final void copydefault(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(this.values, null, null, new FeatureRestrictionCoreRepository$setCallBack$1(this, z, null), 3, null);
    }

    public final AKL AEQbTJ(OKComplianceRestrictionService.Feature feature, String str) {
        copydefault(this.AEQbTJ, str + "-->" + feature.getType() + "-->currentRestrictionModel");
        return this.EZpvd.copydefault(feature.getType());
    }

    public final <T> LinkedHashSet<T> KWHzl(List<String> list, Function1<? super String, ? extends T> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            T tInvoke = function1.invoke((String) it.next());
            if (tInvoke != null) {
                arrayList.add(tInvoke);
            }
        }
        return (LinkedHashSet) CollectionsKt___CollectionsKt.OLrzqt(arrayList, new LinkedHashSet());
    }
}
