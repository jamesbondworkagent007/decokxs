package o;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.okinc.core.util.SPUtils;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionDiffSet;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.ok_kyc_core_okx_impl.foebidden.net.FeatureRestriction;
import com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionLegacyRepository$1;
import com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionLegacyRepository$convertFeatureRestrictions$1$1;
import com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionLegacyRepository$convertFeatureRestrictions$2$1;
import com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionLegacyRepository$fetchLatestFeatureRestrictionStatus$2;
import com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionLegacyRepository$forceRefreshFeatureRestrictionWhithAccount$1;
import com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionLegacyRepository$forceRefreshFeatureRestrictionWhithKyc$1;
import com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionLegacyRepository$initializeIfNeededSync$1;
import com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionLegacyRepository$listenForUserTokenChanges$1;
import com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionLegacyRepository$loadFeatureRestrictionInfos$2;
import com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionLegacyRepository$refreshData$1;
import com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionLegacyRepository$refreshFeatureRestrictions$1;
import com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionLegacyRepository$setCallBack$1;
import com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1;
import com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$2;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import o.C43457rpe;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class rUS implements pHH {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final android.app.Application AEQbTJ;
    public final CopyOnWriteArrayList<Activity> AYXKKw;
    public java.util.List<java.lang.String> AhwBna;
    public java.util.List<java.lang.String> AkhnZx;
    public long AuCTel;
    public final MutableSharedFlow<Unit> AubY;
    public JSONObject DbNXlk;
    public final java.lang.String KWHzl;
    public final CoroutineContext OLrzqt;
    public java.util.List<java.lang.String> copydefault;
    public final int djBIcL;
    public boolean ejfBZ;
    public boolean fARcdN;
    public boolean fIwbmz;
    public boolean fJNWhG;
    public final rUP fetchVPNInfo;
    public int gEmmrt;
    public boolean getFieldNames;
    public boolean getNewProxyInstance;
    public final CoroutineScope hDKMBd;
    public java.util.List<java.lang.String> isConnected;
    public final pTQ iwGUEr;
    public long uzCIH;
    public rUI valueOf;
    public final MutableSharedFlow<FeatureRestrictionDiffSet> values;
    public final SharedFlow<FeatureRestrictionDiffSet> wlaJM;
    public final InterfaceC56387yDm<InterfaceC47278tmy> zsXlph;

    public interface Activity {
        void copydefault(boolean z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(JSONObject jSONObject) {
        this.DbNXlk = jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.fARcdN = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AxsJAY()Lkotlinx/coroutines/flow/SharedFlow; */
    @Override // o.pHH
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public MutableSharedFlow<Unit> AxsJAY() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> EZpvd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.getFieldNames = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public SharedFlow<FeatureRestrictionDiffSet> gHZMYf() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: o.yDm<? extends o.tmy> */
    /* JADX WARN: Multi-variable type inference failed */
    public rUS(@NotNull android.app.Application application, @NotNull CoroutineContext coroutineContext, @NotNull rUP rup, @NotNull InterfaceC56387yDm<? extends InterfaceC47278tmy> interfaceC56387yDm, @NotNull pTQ ptq) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(rup, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        Intrinsics.checkNotNullParameter(ptq, "");
        this.AEQbTJ = application;
        this.OLrzqt = coroutineContext;
        this.fetchVPNInfo = rup;
        this.zsXlph = interfaceC56387yDm;
        this.iwGUEr = ptq;
        this.fARcdN = true;
        this.getNewProxyInstance = true;
        this.KWHzl = "FeatureRestrictionRepository";
        this.djBIcL = 3000;
        this.AYXKKw = new CopyOnWriteArrayList<>();
        this.fJNWhG = true;
        this.hDKMBd = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getDefault()));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(coroutineContext), null, null, new FeatureRestrictionLegacyRepository$1(this, null), 3, null);
        this.AubY = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        MutableSharedFlow<FeatureRestrictionDiffSet> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.values = mutableSharedFlowMutableSharedFlow$default;
        this.wlaJM = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rUS.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.pHH
    public void RcXXUw() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.OLrzqt), null, null, new FeatureRestrictionLegacyRepository$listenForUserTokenChanges$1(this, null), 3, null);
        RxBus.AEQbTJ("EVENT_CHANGE_LANGUAGE").subscribe(new RxBus.EventCallback<java.lang.String>() { // from class: com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionLegacyRepository$listenForUserTokenChanges$2
            {
                super(this.this$0);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                this.this$0.KWHzl("language");
            }
        });
        C54819xWm.KWHzl().AEQbTJ(new TaskDescription());
        C43457rpe.OLrzqt(this.AEQbTJ).EZpvd(new C43457rpe.ActionBar() { // from class: o.rUT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C43457rpe.ActionBar
            public final void copydefault(boolean z, android.net.NetworkInfo networkInfo) {
                rUS.EZpvd(this.OLrzqt, z, networkInfo);
            }
        });
        java.lang.Integer numAEQbTJ = rUV.EZpvd.AEQbTJ();
        if (numAEQbTJ != null && numAEQbTJ.intValue() == 1) {
            rUI rui = new rUI(this);
            this.valueOf = rui;
            ALB.registerNativeFeatureRestrictionClient(rui);
        }
    }

    public static final class TaskDescription implements InterfaceC54816xWj {
        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
        }

        public TaskDescription() {
        }

        @Override // o.InterfaceC54816xWj
        public void copydefault() {
            if (!rUS.this.djBIcL()) {
                rUS rus = rUS.this;
                rus.EZpvd(rus.OLrzqt, "onAppEnterForeground");
            }
            rUS.this.AEQbTJ(false);
        }
    }

    public static final void EZpvd(rUS rus, boolean z, android.net.NetworkInfo networkInfo) {
        if (z && !rus.getNewProxyInstance) {
            rus.KWHzl("network-refresh");
        }
        rus.getNewProxyInstance = false;
    }

    @Override // o.pHH
    public java.lang.String hDKMBd() {
        EZpvd(this.OLrzqt, "getForbiddenResCacheStr");
        java.lang.String string = SPUtils.getString("FeatureRestrictionDatas", "");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.pHH
    public JSONObject KWHzl(@NotNull java.util.ArrayList<java.lang.String> arrayList) throws JSONException {
        Intrinsics.checkNotNullParameter(arrayList, "");
        EZpvd(this.OLrzqt, "getForbidCountriesInformationWithFeatures");
        JSONObject jSONObject = new JSONObject();
        for (java.lang.String str : arrayList) {
            JSONObject jSONObject2 = this.DbNXlk;
            jSONObject.put(str, jSONObject2 != null ? jSONObject2.optJSONObject(str) : null);
        }
        java.lang.String str2 = this.KWHzl;
        for (java.lang.String str3 : arrayList) {
        }
        pUU.KWHzl(str2, "getForbidCountriesInformationWithFeatures->" + Unit.INSTANCE + "->" + jSONObject);
        return jSONObject;
    }

    @Override // o.pHH
    public FeatureRestrictionInfo EZpvd(@NotNull OKComplianceRestrictionService.Feature feature) {
        Intrinsics.checkNotNullParameter(feature, "");
        FeatureRestriction featureRestrictionAEQbTJ = AEQbTJ(feature, true, "currentRestrictionSubModel");
        if (featureRestrictionAEQbTJ != null) {
            return copydefault(featureRestrictionAEQbTJ, feature);
        }
        return null;
    }

    @Override // o.pHH
    public boolean AEQbTJ(@NotNull OKComplianceRestrictionService.Feature feature) {
        java.lang.Boolean hidden;
        Intrinsics.checkNotNullParameter(feature, "");
        FeatureRestriction featureRestrictionAEQbTJ = AEQbTJ(feature, true, "isFeatureHidden");
        if (featureRestrictionAEQbTJ == null || (hidden = featureRestrictionAEQbTJ.getHidden()) == null) {
            return false;
        }
        return hidden.booleanValue();
    }

    @Override // o.pHH
    public boolean OLrzqt(@NotNull OKComplianceRestrictionService.Feature feature) {
        java.lang.Boolean limit;
        Intrinsics.checkNotNullParameter(feature, "");
        FeatureRestriction featureRestrictionAEQbTJ = AEQbTJ(feature, true, "isFeatureLimit");
        if (featureRestrictionAEQbTJ == null || (limit = featureRestrictionAEQbTJ.getLimit()) == null) {
            return false;
        }
        return limit.booleanValue();
    }

    @Override // o.pHH
    public java.lang.String AuCTelauCTel() {
        java.lang.String entityId;
        FeatureRestriction featureRestrictionAEQbTJ = AEQbTJ(OKComplianceRestrictionService.Feature.BASICINFO, true, "getEntityId");
        return (featureRestrictionAEQbTJ == null || (entityId = featureRestrictionAEQbTJ.getEntityId()) == null) ? "" : entityId;
    }

    @Override // o.pHH
    public java.lang.String zsXlph() {
        java.lang.String country;
        FeatureRestriction featureRestrictionAEQbTJ = AEQbTJ(OKComplianceRestrictionService.Feature.BASICINFO, true, "getCountry");
        return (featureRestrictionAEQbTJ == null || (country = featureRestrictionAEQbTJ.getCountry()) == null) ? "" : country;
    }

    @Override // o.pHH
    public boolean djSkpj() {
        java.lang.Boolean crMarket;
        FeatureRestriction featureRestrictionAEQbTJ = AEQbTJ(OKComplianceRestrictionService.Feature.BASICINFO, true, "isCrMarket");
        if (featureRestrictionAEQbTJ == null || (crMarket = featureRestrictionAEQbTJ.getCrMarket()) == null) {
            return false;
        }
        return crMarket.booleanValue();
    }

    @Override // o.pHH
    public boolean AEQbTJ(@NotNull OKComplianceRestrictionService.CefiMode cefiMode) {
        Intrinsics.checkNotNullParameter(cefiMode, "");
        return fIwbmz().contains(cefiMode.getModeName());
    }

    @Override // o.pHH
    public boolean OLrzqt(@NotNull OKComplianceRestrictionService.AppMode appMode) {
        Intrinsics.checkNotNullParameter(appMode, "");
        return AuCTel().contains(appMode.getModeName());
    }

    @Override // o.pHH
    public java.util.List<java.lang.String> AuCTel() {
        EZpvd(this.OLrzqt, "appModes");
        java.util.List<java.lang.String> list = this.copydefault;
        if (list == null || list.isEmpty()) {
            return yDY.gEmmrt(OKComplianceRestrictionService.AppMode.CEFI.getModeName(), OKComplianceRestrictionService.AppMode.WEB3.getModeName());
        }
        java.util.List<java.lang.String> list2 = this.copydefault;
        return list2 == null ? yDY.gEmmrt(OKComplianceRestrictionService.AppMode.CEFI.getModeName(), OKComplianceRestrictionService.AppMode.WEB3.getModeName()) : list2;
    }

    @Override // o.pHH
    public java.util.List<java.lang.String> fIwbmz() {
        EZpvd(this.OLrzqt, "cefiModes");
        java.util.List<java.lang.String> list = this.AhwBna;
        return list == null ? C56402yEa.EZpvd(AEQbTJ()) : list;
    }

    @Override // o.pHH
    public java.util.List<java.lang.String> ejfBZ() {
        EZpvd(this.OLrzqt, "crTradingModes");
        java.lang.String str = this.KWHzl;
        java.lang.Object arrayList = this.AkhnZx;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        pUU.KWHzl(str, "crTradingModes | " + arrayList);
        java.util.List<java.lang.String> list = this.AkhnZx;
        return list == null ? new java.util.ArrayList() : list;
    }

    @Override // o.pHH
    public java.util.List<java.lang.String> getNewProxyInstance() {
        EZpvd(this.OLrzqt, "crTradingPageModes");
        java.util.List<java.lang.String> list = this.isConnected;
        return list == null ? new java.util.ArrayList() : list;
    }

    @Override // o.pHH
    public boolean dNCPSb() {
        return C33129mqd.KWHzl((java.util.Collection) ejfBZ());
    }

    public final java.lang.String AEQbTJ() {
        if (C34703nhO.AEQbTJ()) {
            return OKComplianceRestrictionService.CefiMode.LITE.getModeName();
        }
        return OKComplianceRestrictionService.CefiMode.PRO.getModeName();
    }

    @Override // o.pHH
    public void getFieldNames() {
        KWHzl("forceRefreshFeatureRestriction");
    }

    @Override // o.pHH
    public JsonObject AwvSrB() {
        EZpvd(this.OLrzqt, "getI18nDtoLocalLanguages");
        try {
            JSONObject jSONObject = this.DbNXlk;
            JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(OKComplianceRestrictionService.Feature.BASICINFO.getType()) : null;
            pUU.KWHzl(this.KWHzl, "getI18nDtoLocalLanguages | " + (jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("appI18nDto") : null));
            java.lang.String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("appI18nDto") : null;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strOptString)) {
                return JsonParser.parseString(strOptString).getAsJsonObject();
            }
            return null;
        } catch (java.lang.Exception e) {
            pUU.KWHzl(this.KWHzl, "updateLocalLanguages | " + e.getMessage());
            return null;
        }
    }

    @Override // o.pHH
    public void EZpvd(@NotNull CoroutineScope coroutineScope, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        pUU.KWHzl(this.KWHzl, "forceRefreshFeatureRestrictionWhithKyc");
        this.ejfBZ = false;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FeatureRestrictionLegacyRepository$forceRefreshFeatureRestrictionWhithKyc$1(this, function1, null), 3, null);
    }

    @Override // o.pHH
    public void AEQbTJ(@NotNull CoroutineScope coroutineScope, @NotNull OKComplianceRestrictionService.UserEvent userEvent, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(userEvent, "");
        pUU.KWHzl(this.KWHzl, "forceRefreshFeatureRestrictionWhithAccount->" + userEvent);
        this.ejfBZ = false;
        this.fIwbmz = false;
        OLrzqt(this.fJNWhG);
        this.fJNWhG = true;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FeatureRestrictionLegacyRepository$forceRefreshFeatureRestrictionWhithAccount$1(this, function1, null), 3, null);
    }

    @Override // o.pHH
    public void KWHzl(@NotNull CoroutineScope coroutineScope, java.lang.Boolean bool, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        pUU.KWHzl(this.KWHzl, "fetchLatestFeatureRestrictionStatus  initialized=" + this.ejfBZ + "   isLoading=" + this.getFieldNames + "  isAcceptCache=" + bool);
        if (this.getFieldNames && function1 != null) {
            pUU.EZpvd(this.KWHzl, "addCallBack ");
            this.AYXKKw.add(new ActionBar(function1, this));
            return;
        }
        if (this.ejfBZ && java.lang.System.currentTimeMillis() - this.uzCIH < this.djBIcL) {
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.TRUE);
                return;
            }
            return;
        }
        if (this.ejfBZ) {
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            if (Intrinsics.EZpvd(bool, bool2)) {
                if (function1 != null) {
                    function1.invoke(bool2);
                    return;
                }
                return;
            }
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FeatureRestrictionLegacyRepository$fetchLatestFeatureRestrictionStatus$2(this, function1, null), 3, null);
    }

    public static final class ActionBar implements Activity {
        public final /* synthetic */ Function1<java.lang.Boolean, Unit> OLrzqt;
        public final /* synthetic */ rUS copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(Function1<? super java.lang.Boolean, Unit> function1, rUS rus) {
            this.OLrzqt = function1;
            this.copydefault = rus;
        }

        @Override // o.rUS.Activity
        public void copydefault(boolean z) {
            try {
                this.OLrzqt.invoke(java.lang.Boolean.valueOf(z));
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ(this.copydefault.valueOf(), "Callback execution failed", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(CoroutineContext coroutineContext, java.lang.String str) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(coroutineContext), null, null, new FeatureRestrictionLegacyRepository$initializeIfNeededSync$1(this, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object EZpvd(java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        int i;
        if (this.ejfBZ || this.getFieldNames || !C43453rpa.AEQbTJ.KWHzl(this.AEQbTJ)) {
            return Unit.INSTANCE;
        }
        if (java.lang.System.currentTimeMillis() - this.AuCTel < 3000 && (i = this.gEmmrt) < 3) {
            this.gEmmrt = i + 1;
            return Unit.INSTANCE;
        }
        this.gEmmrt = 0;
        pUU.KWHzl(this.KWHzl, str + "-->initializeIfNeeded");
        this.AuCTel = java.lang.System.currentTimeMillis();
        java.lang.Object objAEQbTJ = AEQbTJ(continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.OLrzqt), null, null, new FeatureRestrictionLegacyRepository$refreshData$1(this, str, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.pHH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        FeatureRestrictionLegacyRepository$refreshFeatureRestrictions$1 featureRestrictionLegacyRepository$refreshFeatureRestrictions$1;
        rUS rus;
        if (continuation instanceof FeatureRestrictionLegacyRepository$refreshFeatureRestrictions$1) {
            featureRestrictionLegacyRepository$refreshFeatureRestrictions$1 = (FeatureRestrictionLegacyRepository$refreshFeatureRestrictions$1) continuation;
            int i = featureRestrictionLegacyRepository$refreshFeatureRestrictions$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                featureRestrictionLegacyRepository$refreshFeatureRestrictions$1.label = i - Integer.MIN_VALUE;
            } else {
                featureRestrictionLegacyRepository$refreshFeatureRestrictions$1 = new FeatureRestrictionLegacyRepository$refreshFeatureRestrictions$1(this, continuation);
            }
        }
        java.lang.Object obj = featureRestrictionLegacyRepository$refreshFeatureRestrictions$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = featureRestrictionLegacyRepository$refreshFeatureRestrictions$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            this.ejfBZ = false;
            try {
                featureRestrictionLegacyRepository$refreshFeatureRestrictions$1.L$0 = this;
                featureRestrictionLegacyRepository$refreshFeatureRestrictions$1.label = 1;
                if (AEQbTJ(featureRestrictionLegacyRepository$refreshFeatureRestrictions$1) == objCopydefault) {
                    return objCopydefault;
                }
                rus = this;
            } catch (java.lang.Exception e) {
                e = e;
                rus = this;
                pUU.KWHzl(rus.KWHzl, java.lang.String.valueOf(e.getMessage()));
                return C56443yFo.KWHzl(false);
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rus = (rUS) featureRestrictionLegacyRepository$refreshFeatureRestrictions$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (java.lang.Exception e2) {
                e = e2;
                pUU.KWHzl(rus.KWHzl, java.lang.String.valueOf(e.getMessage()));
                return C56443yFo.KWHzl(false);
            }
        }
        return C56443yFo.KWHzl(true);
    }

    public final FeatureRestriction AEQbTJ(OKComplianceRestrictionService.Feature feature, boolean z, java.lang.String str) {
        if (z) {
            EZpvd(this.OLrzqt, str + "-->" + feature.getType() + "-->currentRestrictionModel");
        }
        JSONObject jSONObject = this.DbNXlk;
        FeatureRestriction featureRestriction = null;
        JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(feature.getType()) : null;
        if (jSONObjectOptJSONObject != null) {
            try {
                C33489mxS c33489mxS = C33489mxS.KWHzl;
                KSerializer<FeatureRestriction> kSerializerSerializer = FeatureRestriction.Companion.serializer();
                java.lang.String string = jSONObjectOptJSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                featureRestriction = (FeatureRestriction) c33489mxS.OLrzqt((DeserializationStrategy) kSerializerSerializer, string);
            } catch (java.lang.Exception e) {
                pUU.KWHzl(this.KWHzl, str + "-->" + feature.getType() + "-->currentRestrictionModel-->error=" + e.getMessage());
            }
        }
        pUU.EZpvd(this.KWHzl, str + "-->" + feature.getType() + "-->currentRestrictionModel=" + featureRestriction);
        return featureRestriction;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FeatureRestrictionInfo copydefault(FeatureRestriction featureRestriction, OKComplianceRestrictionService.Feature feature) {
        OKComplianceRestrictionService.FeatureAction featureAction;
        java.lang.Long content = featureRestriction.getContent();
        java.lang.String country = featureRestriction.getCountry();
        java.lang.String displayCountryName = featureRestriction.getDisplayCountryName();
        java.lang.Boolean hidden = featureRestriction.getHidden();
        java.lang.Integer kycLevel = featureRestriction.getKycLevel();
        java.lang.String provinceCode = featureRestriction.getProvinceCode();
        java.lang.String action = featureRestriction.getAction();
        if (action == null) {
            featureAction = OKComplianceRestrictionService.FeatureAction.NO_FEATURE;
        } else {
            int iHashCode = action.hashCode();
            if (iHashCode != -1165870106) {
                if (iHashCode != -88947160) {
                    if (iHashCode == 641737913 && action.equals("redirectOKXWallet")) {
                        featureAction = OKComplianceRestrictionService.FeatureAction.REDIRECT_OKX_WALLET;
                    }
                } else if (action.equals("advancedQuestion")) {
                    featureAction = OKComplianceRestrictionService.FeatureAction.UK_QUESTION;
                }
            } else if (action.equals("question")) {
                featureAction = OKComplianceRestrictionService.FeatureAction.QUESTION;
            }
        }
        return new FeatureRestrictionInfo(content, country, displayCountryName, feature, hidden, kycLevel, provinceCode, featureAction, featureRestriction.getProvince(), featureRestriction.getPolitStatus(), featureRestriction.getRemoveUserFlag(), featureRestriction.getLimit(), featureRestriction.getEntityId(), featureRestriction.getMode(), featureRestriction.getCrMarket(), (java.lang.Boolean) null, 32768, (DefaultConstructorMarker) null);
    }

    public final java.lang.Object KWHzl(Continuation<? super JSONObject> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new FeatureRestrictionLegacyRepository$loadFeatureRestrictionInfos$2(this, null), continuation);
    }

    public final void OLrzqt(boolean z) {
        SPUtils.remove("FeatureRestrictionDatas");
        this.DbNXlk = null;
        if (z) {
            this.copydefault = null;
            this.AhwBna = null;
        }
        pUU.KWHzl(this.KWHzl, "removeFeatureRestrictionInfos-----isClear=" + z);
        this.AkhnZx = null;
        this.isConnected = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        FeatureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1 featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1;
        Ref.ObjectRef objectRef;
        rUS rus;
        rUS rus2;
        rUS rus3;
        MutableSharedFlow<Unit> mutableSharedFlowAxsJAY;
        Unit unit;
        rUS rus4;
        if (continuation instanceof FeatureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1) {
            featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1 = (FeatureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1) continuation;
            int i = featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.label = i - Integer.MIN_VALUE;
            } else {
                featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1 = new FeatureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            this.getFieldNames = true;
            objectRef = new Ref.ObjectRef();
            boolean zValues = C42503rVg.KWHzl.copydefault().values();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            FeatureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$2 featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$2 = new FeatureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$2(this, zValues, objectRef, null);
            featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.L$0 = this;
            featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.L$1 = objectRef;
            featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.L$2 = this;
            featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.label = 1;
            objWithContext = BuildersKt.withContext(io2, featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$2, featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            rus = this;
            rus2 = rus;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rus4 = (rUS) featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.L$0;
                    C56391yDq.AEQbTJ(objWithContext);
                    rus4.uzCIH = java.lang.System.currentTimeMillis();
                    rus4.EZpvd(true);
                    return Unit.INSTANCE;
                }
                rus3 = (rUS) featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                mutableSharedFlowAxsJAY = rus3.AxsJAY();
                unit = Unit.INSTANCE;
                featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.L$0 = rus3;
                featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.L$1 = null;
                featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.L$2 = null;
                featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.label = 3;
                if (mutableSharedFlowAxsJAY.emit(unit, featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1) != objCopydefault) {
                    return objCopydefault;
                }
                rus4 = rus3;
                rus4.uzCIH = java.lang.System.currentTimeMillis();
                rus4.EZpvd(true);
                return Unit.INSTANCE;
            }
            rus = (rUS) featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.L$2;
            objectRef = (Ref.ObjectRef) featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.L$1;
            rus2 = (rUS) featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        rus.DbNXlk = (JSONObject) objWithContext;
        rus2.getFieldNames = false;
        rus2.ejfBZ = true;
        FeatureRestrictionDiffSet featureRestrictionDiffSet = (FeatureRestrictionDiffSet) objectRef.element;
        if (featureRestrictionDiffSet != null) {
            MutableSharedFlow<FeatureRestrictionDiffSet> mutableSharedFlow = rus2.values;
            featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.L$0 = rus2;
            featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.L$1 = null;
            featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.L$2 = null;
            featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.label = 2;
            if (mutableSharedFlow.emit(featureRestrictionDiffSet, featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1) == objCopydefault) {
                return objCopydefault;
            }
        }
        rus3 = rus2;
        mutableSharedFlowAxsJAY = rus3.AxsJAY();
        unit = Unit.INSTANCE;
        featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.L$0 = rus3;
        featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.L$1 = null;
        featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.L$2 = null;
        featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1.label = 3;
        if (mutableSharedFlowAxsJAY.emit(unit, featureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$1) != objCopydefault) {
        }
    }

    public final FeatureRestrictionDiffSet KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull JSONObject jSONObject) {
        java.lang.String strOptString;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject2;
        java.lang.String string;
        java.lang.String string2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(jSONObject, "");
        FeatureRestrictionDiffSet featureRestrictionDiffSet = new FeatureRestrictionDiffSet((LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, false, false, 131071, (DefaultConstructorMarker) null);
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) java.lang.String.valueOf(this.copydefault))) {
            featureRestrictionDiffSet.getMode().add(OKComplianceRestrictionService.Mode.AppMode);
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) java.lang.String.valueOf(this.AhwBna))) {
            featureRestrictionDiffSet.getMode().add(OKComplianceRestrictionService.Mode.CefiMode);
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) java.lang.String.valueOf(this.AkhnZx))) {
            featureRestrictionDiffSet.getCrTradingModes().add(OKComplianceRestrictionService.Mode.CrTradingModes);
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) java.lang.String.valueOf(this.isConnected))) {
            featureRestrictionDiffSet.getCrTradingPageModes().add(OKComplianceRestrictionService.Mode.CrTradingPage);
        }
        java.util.Iterator<OKComplianceRestrictionService.Feature> it = OKComplianceRestrictionService.Feature.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                OKComplianceRestrictionService.Feature next = it.next();
                if (next != OKComplianceRestrictionService.Feature.LANGUAGE && next != OKComplianceRestrictionService.Feature.SITE && next != OKComplianceRestrictionService.Feature.MODE && next != OKComplianceRestrictionService.Feature.CR_TRADING_MODE && next != OKComplianceRestrictionService.Feature.CR_TRADING_PAGE) {
                    try {
                        string2 = jSONObject.getString(next.getType());
                    } catch (java.lang.Exception unused) {
                    }
                    FeatureRestriction featureRestriction = string2 != null ? (FeatureRestriction) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) FeatureRestriction.Companion.serializer(), string2) : null;
                    try {
                        jSONObject2 = this.DbNXlk;
                    } catch (java.lang.Exception unused2) {
                    }
                    FeatureRestriction featureRestriction2 = (jSONObject2 == null || (string = jSONObject2.getString(next.getType())) == null) ? null : (FeatureRestriction) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) FeatureRestriction.Companion.serializer(), string);
                    if (!Intrinsics.EZpvd(featureRestriction != null ? featureRestriction.getHidden() : null, featureRestriction2 != null ? featureRestriction2.getHidden() : null)) {
                        featureRestrictionDiffSet.getHidden().add(next);
                    }
                    if (!Intrinsics.EZpvd(featureRestriction != null ? featureRestriction.getLimit() : null, featureRestriction2 != null ? featureRestriction2.getLimit() : null)) {
                        featureRestrictionDiffSet.getLimit().add(next);
                    }
                    if (!Intrinsics.EZpvd((java.lang.Object) (featureRestriction != null ? featureRestriction.getCountry() : null), (java.lang.Object) (featureRestriction2 != null ? featureRestriction2.getCountry() : null))) {
                        featureRestrictionDiffSet.getCountry().add(next);
                    }
                    if (!Intrinsics.EZpvd((java.lang.Object) (featureRestriction != null ? featureRestriction.getDisplayCountryName() : null), (java.lang.Object) (featureRestriction2 != null ? featureRestriction2.getDisplayCountryName() : null))) {
                        featureRestrictionDiffSet.getCountryName().add(next);
                    }
                    if (!Intrinsics.EZpvd(featureRestriction != null ? featureRestriction.getKycLevel() : null, featureRestriction2 != null ? featureRestriction2.getKycLevel() : null)) {
                        featureRestrictionDiffSet.getKycLevel().add(next);
                    }
                    if (!Intrinsics.EZpvd((java.lang.Object) (featureRestriction != null ? featureRestriction.getProvinceCode() : null), (java.lang.Object) (featureRestriction2 != null ? featureRestriction2.getProvinceCode() : null))) {
                        featureRestrictionDiffSet.getProvinceCode().add(next);
                    }
                    if (!Intrinsics.EZpvd((java.lang.Object) (featureRestriction != null ? featureRestriction.getProvince() : null), (java.lang.Object) (featureRestriction2 != null ? featureRestriction2.getProvince() : null))) {
                        featureRestrictionDiffSet.getProvince().add(next);
                    }
                    if (!Intrinsics.EZpvd(featureRestriction != null ? featureRestriction.getPolitStatus() : null, featureRestriction2 != null ? featureRestriction2.getPolitStatus() : null)) {
                        featureRestrictionDiffSet.getPolitStatus().add(next);
                    }
                    if (!Intrinsics.EZpvd(featureRestriction != null ? featureRestriction.getRemoveUserFlag() : null, featureRestriction2 != null ? featureRestriction2.getRemoveUserFlag() : null)) {
                        featureRestrictionDiffSet.getRemoveUserFlag().add(next);
                    }
                    if (!Intrinsics.EZpvd((java.lang.Object) (featureRestriction != null ? featureRestriction.getAction() : null), (java.lang.Object) (featureRestriction2 != null ? featureRestriction2.getAction() : null))) {
                        featureRestrictionDiffSet.getAction().add(next);
                    }
                    if (!Intrinsics.EZpvd(featureRestriction != null ? featureRestriction.getContent() : null, featureRestriction2 != null ? featureRestriction2.getContent() : null)) {
                        featureRestrictionDiffSet.getContent().add(next);
                    }
                    if (!Intrinsics.EZpvd(featureRestriction != null ? featureRestriction.getMode() : null, featureRestriction2 != null ? featureRestriction2.getMode() : null)) {
                        featureRestrictionDiffSet.getFeatureModes().add(next);
                    }
                    if (next == OKComplianceRestrictionService.Feature.BASICINFO) {
                        if (!Intrinsics.EZpvd((java.lang.Object) (featureRestriction != null ? featureRestriction.getEntityId() : null), (java.lang.Object) (featureRestriction2 != null ? featureRestriction2.getEntityId() : null))) {
                            featureRestrictionDiffSet.setEntityIdChange(true);
                        }
                        if (!Intrinsics.EZpvd((java.lang.Object) (featureRestriction != null ? featureRestriction.getCountry() : null), (java.lang.Object) (featureRestriction2 != null ? featureRestriction2.getCountry() : null))) {
                            java.lang.String strGEmmrt = C33129mqd.gEmmrt(featureRestriction != null ? featureRestriction.getCountry() : null);
                            pUU.KWHzl(this.KWHzl, "IEntityInfoChangeEvent | " + strGEmmrt);
                            RxBus.AEQbTJ(new mNO(strGEmmrt));
                        }
                    }
                }
            } else {
                try {
                    break;
                } catch (java.lang.Exception unused3) {
                }
            }
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(OKComplianceRestrictionService.Feature.BASICINFO.getType());
        java.lang.String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("appI18nDto") : null;
        try {
            JSONObject jSONObject3 = this.DbNXlk;
            if (jSONObject3 != null && (jSONObjectOptJSONObject = jSONObject3.optJSONObject(OKComplianceRestrictionService.Feature.BASICINFO.getType())) != null) {
                strOptString = jSONObjectOptJSONObject.optString("appI18nDto");
            }
        } catch (java.lang.Exception unused4) {
        }
        if (!Intrinsics.EZpvd((java.lang.Object) strOptString2, (java.lang.Object) strOptString)) {
            pUU.KWHzl(this.KWHzl, "updateLocalLanguages | newData: " + strOptString2 + " | oldData: " + strOptString);
            featureRestrictionDiffSet.setLanguageChange(true);
        }
        pUU.KWHzl(this.KWHzl, "diffSet | mode: " + featureRestrictionDiffSet.getMode() + " | crTradingModes: " + featureRestrictionDiffSet.getCrTradingModes() + " | crTradingPageModes: " + featureRestrictionDiffSet.getCrTradingPageModes() + " | entityIdChange: " + featureRestrictionDiffSet.getEntityIdChange() + " | languageChange: " + featureRestrictionDiffSet.getLanguageChange());
        return featureRestrictionDiffSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(this.hDKMBd, null, null, new FeatureRestrictionLegacyRepository$setCallBack$1(this, z, null), 3, null);
    }

    public final java.util.List<java.lang.String> copydefault(@NotNull JSONArray jSONArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONArray, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            java.lang.String string = jSONArray.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            arrayList.add(string);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f A[Catch: Exception -> 0x0107, TryCatch #0 {Exception -> 0x0107, blocks: (B:3:0x0003, B:6:0x0016, B:8:0x001c, B:10:0x0022, B:12:0x0026, B:14:0x002e, B:16:0x0034, B:18:0x0042, B:21:0x006d, B:23:0x007b, B:25:0x0083, B:27:0x008d, B:29:0x009c, B:31:0x00a2, B:33:0x00a8, B:35:0x00b6, B:37:0x00bc, B:39:0x00c2, B:43:0x00cd, B:20:0x005f), top: B:48:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject OLrzqt(java.lang.String str, boolean z) {
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        java.lang.String strOptString;
        JSONArray jSONArrayOptJSONArray3;
        JSONArray jSONArrayOptJSONArray4;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(OKComplianceRestrictionService.Feature.MODE.getType());
            this.copydefault = (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray4 = jSONObjectOptJSONObject.optJSONArray(OtcExtraKeys.MODE)) == null) ? null : copydefault(jSONArrayOptJSONArray4);
            this.AhwBna = (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("cefiDetail")) == null) ? null : copydefault(jSONArrayOptJSONArray3);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(OKComplianceRestrictionService.Feature.WEBVIEW.getType());
            if (jSONObjectOptJSONObject2 != null) {
                if (BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new FeatureRestrictionLegacyRepository$convertFeatureRestrictions$1$1(jSONObjectOptJSONObject2.optString("siteCode"), jSONObjectOptJSONObject2.optString("subdomain"), null), 3, null) == null) {
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new FeatureRestrictionLegacyRepository$convertFeatureRestrictions$2$1(null), 3, null);
                }
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(OKComplianceRestrictionService.Feature.BASICINFO.getType());
            C43655rtQ.OLrzqt.KWHzl((jSONObjectOptJSONObject3 == null || (strOptString = jSONObjectOptJSONObject3.optString("entityId")) == null) ? null : java.lang.Integer.valueOf(C33129mqd.AhwBna(strOptString)));
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject(OKComplianceRestrictionService.Feature.CR_TRADING_MODE.getType());
            this.AkhnZx = (jSONObjectOptJSONObject4 == null || (jSONArrayOptJSONArray2 = jSONObjectOptJSONObject4.optJSONArray(OtcExtraKeys.MODE)) == null) ? null : copydefault(jSONArrayOptJSONArray2);
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject(OKComplianceRestrictionService.Feature.CR_TRADING_PAGE.getType());
            java.util.List<java.lang.String> listCopydefault = (jSONObjectOptJSONObject5 == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject5.optJSONArray(OtcExtraKeys.MODE)) == null) ? null : copydefault(jSONArrayOptJSONArray);
            this.isConnected = listCopydefault;
            java.lang.String str2 = this.KWHzl;
            java.lang.String str3 = z ? "cache" : "net";
            pUU.KWHzl(str2, "convertFeatureRestrictions | " + str3 + " appModes: " + this.copydefault + " | cefiModes: " + this.AhwBna + " | crTradingPageModes: " + listCopydefault + " | crTradingModes=" + this.AkhnZx);
            return jSONObject;
        } catch (java.lang.Exception e) {
            pUU.KWHzl(this.KWHzl, "convertFeatureRestrictions | " + e.getMessage());
            return null;
        }
    }
}
