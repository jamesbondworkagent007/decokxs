package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.core.ok_app.api.configuration.Scenario;
import com.okinc.core.ok_app.configuration.ConfigLoadingActivity;
import com.okinc.core.ok_app.configuration.config.ConfigManagerImpl$callApi$1;
import com.okinc.core.ok_app.configuration.config.ConfigManagerImpl$callApi$2$1;
import com.okinc.core.ok_app.configuration.config.ConfigManagerImpl$handleResult$1;
import com.okinc.core.ok_app.configuration.config.ConfigManagerImpl$onModuleInit$$inlined$filter$1$2$1;
import com.okinc.core.ok_app.configuration.config.ConfigManagerImpl$onModuleInit$1;
import com.okinc.core.ok_app.configuration.config.ConfigManagerImpl$onModuleInit$3;
import com.okinc.core.ok_app.configuration.config.ConfigManagerImpl$run$1;
import com.okinc.core.ok_app.configuration.config.ConfigManagerImpl$startLoadingActivity$1;
import com.okinc.core.ok_app.configuration.config.ConfigManagerImpl$startLoadingActivity$waitActivityResponse$1;
import com.okinc.core.ok_app.configuration.event.ConfigEvent;
import com.okinc.core.util.SPUtils;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionDiffSet;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.localization2.bean.AppLanguagesChangeResult;
import com.okinc.rxutils.RecreateEvent;
import com.okinc.rxutils.RecreateType;
import com.okinc.rxutils.RxBus;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C33160mrH;
import o.InterfaceC33171mrS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class C33285mta extends AbstractC43215rlA implements InterfaceC33253msv {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final MutableLiveData<java.lang.Integer> AEQbTJ;
    public final SharedFlow<kotlin.Pair<Scenario, ConfigEvent>> AYXKKw;
    public final android.content.Context AhwBna;
    public final C33293mti AkhnZx;
    public final SharedFlow<Unit> AuCTel;
    public final MutableSharedFlow<Unit> DbNXlk;
    public final MutableSharedFlow<kotlin.Pair<Scenario, ConfigEvent>> KWHzl;
    public final MutableSharedFlow<Unit> OLrzqt;
    public final C33287mtc copydefault;
    public final LiveData<java.lang.Integer> djBIcL;
    public final InterfaceC33171mrS ejfBZ;
    public final tXO fARcdN;
    public final OKComplianceRestrictionService fIwbmz;
    public final pTU fJNWhG;
    public AtomicBoolean fetchVPNInfo;
    public final C33286mtb gEmmrt;
    public final C33290mtf getFieldNames;
    public final InterfaceC47278tmy hDKMBd;
    public final MutableSharedFlow<Unit> isConnected;
    public final MutableSharedFlow<Scenario> iwGUEr;
    public final C33291mtg valueOf;
    public final MutableSharedFlow<Unit> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33253msv
    public SharedFlow<Unit> AEQbTJ() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<kotlin.Pair<Scenario, ConfigEvent>> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<Unit> AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33253msv
    public SharedFlow<Scenario> KWHzl() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Integer> OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> djBIcL() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<Unit> gEmmrt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<Scenario> valueOf() {
        return this.iwGUEr;
    }

    /* JADX INFO: renamed from: o.mta$Activity */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity implements Flow<FeatureRestrictionDiffSet> {
        public final /* synthetic */ Flow KWHzl;
        public final /* synthetic */ C33285mta copydefault;

        /* JADX INFO: renamed from: o.mta$Activity$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ C33285mta EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, C33285mta c33285mta) {
                this.AEQbTJ = flowCollector;
                this.EZpvd = c33285mta;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ConfigManagerImpl$onModuleInit$$inlined$filter$1$2$1 configManagerImpl$onModuleInit$$inlined$filter$1$2$1;
                if (continuation instanceof ConfigManagerImpl$onModuleInit$$inlined$filter$1$2$1) {
                    configManagerImpl$onModuleInit$$inlined$filter$1$2$1 = (ConfigManagerImpl$onModuleInit$$inlined$filter$1$2$1) continuation;
                    int i = configManagerImpl$onModuleInit$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        configManagerImpl$onModuleInit$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        configManagerImpl$onModuleInit$$inlined$filter$1$2$1 = new ConfigManagerImpl$onModuleInit$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = configManagerImpl$onModuleInit$$inlined$filter$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = configManagerImpl$onModuleInit$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    if (this.EZpvd.gEmmrt.copydefault(Scenario.FeatureRestrictionUpdated.EZpvd).OLrzqt()) {
                        configManagerImpl$onModuleInit$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, configManagerImpl$onModuleInit$$inlined$filter$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Activity(Flow flow, C33285mta c33285mta) {
            this.KWHzl = flow;
            this.copydefault = c33285mta;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super FeatureRestrictionDiffSet> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass4(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public C33285mta(@NotNull android.content.Context context, @NotNull OKComplianceRestrictionService oKComplianceRestrictionService, @NotNull C33291mtg c33291mtg, @NotNull C33290mtf c33290mtf, @NotNull C33293mti c33293mti, @NotNull InterfaceC33171mrS interfaceC33171mrS, @NotNull C33286mtb c33286mtb, @NotNull pTU ptu, @NotNull tXO txo, @NotNull InterfaceC47278tmy interfaceC47278tmy, @NotNull C33287mtc c33287mtc) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        Intrinsics.checkNotNullParameter(c33291mtg, "");
        Intrinsics.checkNotNullParameter(c33290mtf, "");
        Intrinsics.checkNotNullParameter(c33293mti, "");
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        Intrinsics.checkNotNullParameter(c33286mtb, "");
        Intrinsics.checkNotNullParameter(ptu, "");
        Intrinsics.checkNotNullParameter(txo, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(c33287mtc, "");
        this.AhwBna = context;
        this.fIwbmz = oKComplianceRestrictionService;
        this.valueOf = c33291mtg;
        this.getFieldNames = c33290mtf;
        this.AkhnZx = c33293mti;
        this.ejfBZ = interfaceC33171mrS;
        this.gEmmrt = c33286mtb;
        this.fJNWhG = ptu;
        this.fARcdN = txo;
        this.hDKMBd = interfaceC47278tmy;
        this.copydefault = c33287mtc;
        MutableLiveData<java.lang.Integer> mutableLiveData = new MutableLiveData<>();
        this.AEQbTJ = mutableLiveData;
        this.djBIcL = mutableLiveData;
        MutableSharedFlow<kotlin.Pair<Scenario, ConfigEvent>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.AYXKKw = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default2;
        this.AuCTel = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        this.values = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.isConnected = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.fetchVPNInfo = new AtomicBoolean(false);
        this.DbNXlk = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.iwGUEr = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
    }

    /* JADX INFO: renamed from: o.mta$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mta.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public void KWHzl(@NotNull Scenario scenario) {
        Intrinsics.checkNotNullParameter(scenario, "");
        copydefault(GlobalScope.INSTANCE, scenario);
    }

    public final void copydefault(@NotNull CoroutineScope coroutineScope, @NotNull Scenario scenario) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(scenario, "");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null), null, new ConfigManagerImpl$run$1(scenario, this, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ConfigManagerImpl$startLoadingActivity$1 configManagerImpl$startLoadingActivity$1;
        android.app.Activity activity;
        if (continuation instanceof ConfigManagerImpl$startLoadingActivity$1) {
            configManagerImpl$startLoadingActivity$1 = (ConfigManagerImpl$startLoadingActivity$1) continuation;
            int i = configManagerImpl$startLoadingActivity$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                configManagerImpl$startLoadingActivity$1.label = i - Integer.MIN_VALUE;
            } else {
                configManagerImpl$startLoadingActivity$1 = new ConfigManagerImpl$startLoadingActivity$1(this, continuation);
            }
        }
        java.lang.Object objWithTimeoutOrNull = configManagerImpl$startLoadingActivity$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = configManagerImpl$startLoadingActivity$1.label;
        java.lang.Object obj = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithTimeoutOrNull);
            ConfigLoadingActivity.Activity activity2 = ConfigLoadingActivity.Companion;
            if (!activity2.KWHzl().get()) {
                activity2.AEQbTJ(this.AhwBna);
                ConfigManagerImpl$startLoadingActivity$waitActivityResponse$1 configManagerImpl$startLoadingActivity$waitActivityResponse$1 = new ConfigManagerImpl$startLoadingActivity$waitActivityResponse$1(this, null);
                configManagerImpl$startLoadingActivity$1.label = 1;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(7000L, configManagerImpl$startLoadingActivity$waitActivityResponse$1, configManagerImpl$startLoadingActivity$1);
                if (objWithTimeoutOrNull == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                pUU.KWHzl("ConfigManager", "Config Loading Activity already start");
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithTimeoutOrNull);
        }
        if (((Unit) objWithTimeoutOrNull) == null) {
            pUU.KWHzl("ConfigManager", "Config Loading create timeout, skip start activity");
            ConfigLoadingActivity.Companion.KWHzl().set(false);
            java.util.Iterator<T> it = C32979mnm.EZpvd.KWHzl().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((WeakReference) next).get() instanceof ConfigLoadingActivity) {
                    obj = next;
                    break;
                }
            }
            WeakReference weakReference = (WeakReference) obj;
            if (weakReference != null && (activity = (android.app.Activity) weakReference.get()) != null) {
                activity.finish();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(Scenario scenario, ConfigEvent configEvent, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ConfigManagerImpl$handleResult$1 configManagerImpl$handleResult$1;
        Scenario scenario2;
        C33285mta c33285mta;
        C33285mta c33285mta2;
        MutableSharedFlow<Unit> mutableSharedFlow;
        Unit unit;
        MutableSharedFlow<Unit> mutableSharedFlow2;
        C33285mta c33285mta3;
        ConfigEvent configEvent2 = configEvent;
        if (continuation instanceof ConfigManagerImpl$handleResult$1) {
            configManagerImpl$handleResult$1 = (ConfigManagerImpl$handleResult$1) continuation;
            int i = configManagerImpl$handleResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                configManagerImpl$handleResult$1.label = i - Integer.MIN_VALUE;
            } else {
                configManagerImpl$handleResult$1 = new ConfigManagerImpl$handleResult$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = configManagerImpl$handleResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        switch (configManagerImpl$handleResult$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objKWHzl);
                pUU.KWHzl("ConfigManager", "Handle result " + configEvent2);
                if (!configEvent.OLrzqt()) {
                    configManagerImpl$handleResult$1.L$0 = this;
                    scenario2 = scenario;
                    configManagerImpl$handleResult$1.L$1 = scenario2;
                    configManagerImpl$handleResult$1.L$2 = configEvent2;
                    configManagerImpl$handleResult$1.label = 1;
                    if (KWHzl(configManagerImpl$handleResult$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    c33285mta2 = this;
                    c33285mta = c33285mta2;
                    if (configEvent2.copydefault()) {
                        C33290mtf c33290mtf = c33285mta.getFieldNames;
                        configManagerImpl$handleResult$1.L$0 = c33285mta;
                        configManagerImpl$handleResult$1.L$1 = configEvent2;
                        configManagerImpl$handleResult$1.L$2 = null;
                        configManagerImpl$handleResult$1.label = 2;
                        if (c33290mtf.OLrzqt(scenario2, configManagerImpl$handleResult$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    if (configEvent2.KWHzl()) {
                        configManagerImpl$handleResult$1.L$0 = c33285mta;
                        configManagerImpl$handleResult$1.L$1 = configEvent2;
                        configManagerImpl$handleResult$1.L$2 = null;
                        configManagerImpl$handleResult$1.label = 3;
                        if (c33285mta.OLrzqt(configManagerImpl$handleResult$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        C33293mti c33293mti = c33285mta.AkhnZx;
                        configManagerImpl$handleResult$1.L$0 = c33285mta;
                        configManagerImpl$handleResult$1.L$1 = configEvent2;
                        configManagerImpl$handleResult$1.label = 4;
                        objKWHzl = c33293mti.KWHzl(configManagerImpl$handleResult$1);
                        if (objKWHzl == objCopydefault) {
                            return objCopydefault;
                        }
                        if (((AppLanguagesChangeResult) objKWHzl) == AppLanguagesChangeResult.FAIL && ConfigLoadingActivity.Companion.KWHzl().get()) {
                            pUU.KWHzl("ConfigManager", "switchLang failed");
                            mutableSharedFlow = c33285mta.OLrzqt;
                            unit = Unit.INSTANCE;
                            configManagerImpl$handleResult$1.L$0 = c33285mta;
                            configManagerImpl$handleResult$1.L$1 = configEvent2;
                            configManagerImpl$handleResult$1.label = 5;
                            if (mutableSharedFlow.emit(unit, configManagerImpl$handleResult$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            mutableSharedFlow2 = c33285mta.isConnected;
                            configManagerImpl$handleResult$1.L$0 = c33285mta;
                            configManagerImpl$handleResult$1.L$1 = configEvent2;
                            configManagerImpl$handleResult$1.label = 6;
                            if (FlowKt.first(mutableSharedFlow2, configManagerImpl$handleResult$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            c33285mta3 = c33285mta;
                            c33285mta = c33285mta3;
                        }
                    }
                    if (configEvent2.EZpvd()) {
                        if (!ConfigLoadingActivity.Companion.KWHzl().get()) {
                            pUU.KWHzl("ConfigManager", "trigger mode switch: " + configEvent2 + " in config manager");
                            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                            if (activityAEQbTJ != null) {
                                C56443yFo.KWHzl(InterfaceC33171mrS.Activity.autoSwitchMode$default(c33285mta.ejfBZ, activityAEQbTJ, true, true, null, null, 24, null));
                            } else {
                                RxBus.AEQbTJ(new RecreateEvent(RecreateType.BOTH));
                            }
                        }
                    } else if (configEvent2.KWHzl() && configEvent2.copydefault()) {
                        RxBus.AEQbTJ(new RecreateEvent(RecreateType.BOTH));
                    } else if (configEvent2.KWHzl()) {
                        RxBus.AEQbTJ(new RecreateEvent(RecreateType.LANGUAGE));
                    } else if (configEvent2.copydefault()) {
                        RxBus.AEQbTJ(new RecreateEvent(RecreateType.THEME));
                    }
                    if (configEvent2.AEQbTJ()) {
                        pUU.KWHzl("ConfigManager", "Update tab bar");
                        C33216msK.KWHzl.OLrzqt(new Function0() { // from class: o.mtd
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C33285mta.copydefault();
                            }
                        });
                    }
                    return Unit.INSTANCE;
                }
                scenario2 = scenario;
                c33285mta = this;
                if (configEvent2.copydefault()) {
                }
                if (configEvent2.KWHzl()) {
                }
                if (configEvent2.EZpvd()) {
                }
                if (configEvent2.AEQbTJ()) {
                }
                return Unit.INSTANCE;
            case 1:
                configEvent2 = (ConfigEvent) configManagerImpl$handleResult$1.L$2;
                Scenario scenario3 = (Scenario) configManagerImpl$handleResult$1.L$1;
                c33285mta2 = (C33285mta) configManagerImpl$handleResult$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                scenario2 = scenario3;
                c33285mta = c33285mta2;
                if (configEvent2.copydefault()) {
                }
                if (configEvent2.KWHzl()) {
                }
                if (configEvent2.EZpvd()) {
                }
                if (configEvent2.AEQbTJ()) {
                }
                return Unit.INSTANCE;
            case 2:
                configEvent2 = (ConfigEvent) configManagerImpl$handleResult$1.L$1;
                c33285mta = (C33285mta) configManagerImpl$handleResult$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                if (configEvent2.KWHzl()) {
                }
                if (configEvent2.EZpvd()) {
                }
                if (configEvent2.AEQbTJ()) {
                }
                return Unit.INSTANCE;
            case 3:
                configEvent2 = (ConfigEvent) configManagerImpl$handleResult$1.L$1;
                c33285mta = (C33285mta) configManagerImpl$handleResult$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                C33293mti c33293mti2 = c33285mta.AkhnZx;
                configManagerImpl$handleResult$1.L$0 = c33285mta;
                configManagerImpl$handleResult$1.L$1 = configEvent2;
                configManagerImpl$handleResult$1.label = 4;
                objKWHzl = c33293mti2.KWHzl(configManagerImpl$handleResult$1);
                if (objKWHzl == objCopydefault) {
                }
                if (((AppLanguagesChangeResult) objKWHzl) == AppLanguagesChangeResult.FAIL) {
                    pUU.KWHzl("ConfigManager", "switchLang failed");
                    mutableSharedFlow = c33285mta.OLrzqt;
                    unit = Unit.INSTANCE;
                    configManagerImpl$handleResult$1.L$0 = c33285mta;
                    configManagerImpl$handleResult$1.L$1 = configEvent2;
                    configManagerImpl$handleResult$1.label = 5;
                    if (mutableSharedFlow.emit(unit, configManagerImpl$handleResult$1) == objCopydefault) {
                    }
                    mutableSharedFlow2 = c33285mta.isConnected;
                    configManagerImpl$handleResult$1.L$0 = c33285mta;
                    configManagerImpl$handleResult$1.L$1 = configEvent2;
                    configManagerImpl$handleResult$1.label = 6;
                    if (FlowKt.first(mutableSharedFlow2, configManagerImpl$handleResult$1) == objCopydefault) {
                    }
                }
                if (configEvent2.EZpvd()) {
                }
                if (configEvent2.AEQbTJ()) {
                }
                return Unit.INSTANCE;
            case 4:
                configEvent2 = (ConfigEvent) configManagerImpl$handleResult$1.L$1;
                c33285mta = (C33285mta) configManagerImpl$handleResult$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                if (((AppLanguagesChangeResult) objKWHzl) == AppLanguagesChangeResult.FAIL) {
                }
                if (configEvent2.EZpvd()) {
                }
                if (configEvent2.AEQbTJ()) {
                }
                return Unit.INSTANCE;
            case 5:
                configEvent2 = (ConfigEvent) configManagerImpl$handleResult$1.L$1;
                c33285mta = (C33285mta) configManagerImpl$handleResult$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                mutableSharedFlow2 = c33285mta.isConnected;
                configManagerImpl$handleResult$1.L$0 = c33285mta;
                configManagerImpl$handleResult$1.L$1 = configEvent2;
                configManagerImpl$handleResult$1.label = 6;
                if (FlowKt.first(mutableSharedFlow2, configManagerImpl$handleResult$1) == objCopydefault) {
                }
                break;
            case 6:
                configEvent2 = (ConfigEvent) configManagerImpl$handleResult$1.L$1;
                c33285mta3 = (C33285mta) configManagerImpl$handleResult$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                c33285mta = c33285mta3;
                if (configEvent2.EZpvd()) {
                }
                if (configEvent2.AEQbTJ()) {
                }
                return Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final Unit copydefault() {
        pUU.KWHzl("ConfigManager", "emit tab bar update event");
        RxBus.KWHzl("event_tab_bar_update");
        return Unit.INSTANCE;
    }

    public final boolean AEQbTJ(Scenario scenario) {
        return scenario.copydefault() && !DbNXlk();
    }

    public final boolean EZpvd(Scenario scenario, ConfigEvent configEvent) {
        return (scenario.copydefault() || !configEvent.OLrzqt() || DbNXlk()) ? false : true;
    }

    public final boolean DbNXlk() {
        return SPUtils.getBoolean("first_launch", true);
    }

    public final void isConnected() {
        Flow flowOnEach = FlowKt.onEach(FlowKt.take(this.fJNWhG.KWHzl(), 1), new ConfigManagerImpl$onModuleInit$1(this, null));
        GlobalScope globalScope = GlobalScope.INSTANCE;
        FlowKt.launchIn(flowOnEach, globalScope);
        FlowKt.launchIn(FlowKt.onEach(new Activity(this.fIwbmz.gHZMYf(), this), new ConfigManagerImpl$onModuleInit$3(this, null)), globalScope);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(Scenario scenario, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ConfigManagerImpl$callApi$1 configManagerImpl$callApi$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof ConfigManagerImpl$callApi$1) {
            configManagerImpl$callApi$1 = (ConfigManagerImpl$callApi$1) continuation;
            int i = configManagerImpl$callApi$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                configManagerImpl$callApi$1.label = i - Integer.MIN_VALUE;
            } else {
                configManagerImpl$callApi$1 = new ConfigManagerImpl$callApi$1(this, continuation);
            }
        }
        java.lang.Object objCoroutineScope = configManagerImpl$callApi$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = configManagerImpl$callApi$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCoroutineScope);
                Result.Application application = Result.Companion;
                pUU.KWHzl("ConfigManager", "API request in " + scenario);
                if (Intrinsics.EZpvd(scenario, Scenario.ColdLaunch.EZpvd)) {
                    tXO txo = this.fARcdN;
                    boolean zValues = values();
                    configManagerImpl$callApi$1.L$0 = scenario;
                    configManagerImpl$callApi$1.label = 1;
                    if (txo.KWHzl(zValues, configManagerImpl$callApi$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    objCoroutineScope = Unit.INSTANCE;
                    objM7377constructorimpl = Result.m7377constructorimpl(objCoroutineScope);
                } else {
                    if ((scenario instanceof Scenario.SwitchAccount) || (scenario instanceof Scenario.Login) || (scenario instanceof Scenario.Logout) || (scenario instanceof Scenario.Register)) {
                        ConfigManagerImpl$callApi$2$1 configManagerImpl$callApi$2$1 = new ConfigManagerImpl$callApi$2$1(this, scenario, null);
                        configManagerImpl$callApi$1.L$0 = scenario;
                        configManagerImpl$callApi$1.label = 2;
                        objCoroutineScope = CoroutineScopeKt.coroutineScope(configManagerImpl$callApi$2$1, configManagerImpl$callApi$1);
                        if (objCoroutineScope == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (!Intrinsics.EZpvd(scenario, Scenario.FeatureRestrictionUpdated.EZpvd)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objCoroutineScope = Unit.INSTANCE;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(objCoroutineScope);
                }
            } else if (i2 == 1) {
                scenario = (Scenario) configManagerImpl$callApi$1.L$0;
                C56391yDq.AEQbTJ(objCoroutineScope);
                objCoroutineScope = Unit.INSTANCE;
                objM7377constructorimpl = Result.m7377constructorimpl(objCoroutineScope);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                scenario = (Scenario) configManagerImpl$callApi$1.L$0;
                C56391yDq.AEQbTJ(objCoroutineScope);
                objM7377constructorimpl = Result.m7377constructorimpl(objCoroutineScope);
            }
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("ConfigManager", "API error in " + scenario, thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AkhnZx() {
        return this.fetchVPNInfo.get() || ConfigLoadingActivity.Companion.KWHzl().get();
    }

    public final int AEQbTJ(Scenario scenario, boolean z) {
        return scenario instanceof Scenario.Logout ? C33160mrH.TaskDescription.AkhnZx : values() ? C33160mrH.TaskDescription.isConnected : z ? C33160mrH.TaskDescription.DbNXlk : C33160mrH.TaskDescription.fARcdN;
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation) {
        if (this.DbNXlk.getReplayCache().isEmpty()) {
            pUU.KWHzl("ConfigManager", "send first sync finish event");
            MutableSharedFlow<Unit> mutableSharedFlow = this.DbNXlk;
            Unit unit = Unit.INSTANCE;
            java.lang.Object objEmit = mutableSharedFlow.emit(unit, continuation);
            return objEmit == C56442yFn.copydefault() ? objEmit : unit;
        }
        return Unit.INSTANCE;
    }

    private final boolean values() {
        return this.hDKMBd.values();
    }
}
