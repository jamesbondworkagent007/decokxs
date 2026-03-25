package com.okinc.core.ok_app.configuration.config;

import com.okinc.core.ok_app.api.configuration.Scenario;
import com.okinc.core.ok_app.configuration.ConfigLoadingActivity;
import com.okinc.core.ok_app.configuration.event.ConfigEvent;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C33285mta;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class ConfigManagerImpl$run$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Scenario $scenario;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C33285mta this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigManagerImpl$run$1(Scenario scenario, C33285mta c33285mta, Continuation<? super ConfigManagerImpl$run$1> continuation) {
        super(2, continuation);
        this.$scenario = scenario;
        this.this$0 = c33285mta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConfigManagerImpl$run$1 configManagerImpl$run$1 = new ConfigManagerImpl$run$1(this.$scenario, this.this$0, continuation);
        configManagerImpl$run$1.L$0 = obj;
        return configManagerImpl$run$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConfigManagerImpl$run$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0125 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:7:0x001a, B:53:0x01a4, B:10:0x0023, B:46:0x0179, B:48:0x0188, B:50:0x0190, B:13:0x002c, B:43:0x015c, B:16:0x0035, B:40:0x014c, B:17:0x003a, B:35:0x00f6, B:37:0x0125, B:22:0x0046, B:32:0x00ea, B:25:0x0053, B:27:0x00b4, B:29:0x00c8), top: B:61:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0178 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0188 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:7:0x001a, B:53:0x01a4, B:10:0x0023, B:46:0x0179, B:48:0x0188, B:50:0x0190, B:13:0x002c, B:43:0x015c, B:16:0x0035, B:40:0x014c, B:17:0x003a, B:35:0x00f6, B:37:0x0125, B:22:0x0046, B:32:0x00ea, B:25:0x0053, B:27:0x00b4, B:29:0x00c8), top: B:61:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a3 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferredAsync$default;
        ConfigEvent configEventCopydefault;
        C33285mta c33285mta;
        Scenario scenario;
        MutableSharedFlow mutableSharedFlow;
        Pair pairOLrzqt;
        MutableSharedFlow<Scenario> mutableSharedFlowValueOf;
        Scenario scenario2;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (Exception e) {
            pUU.AEQbTJ("ConfigManager", "Error in config manager", e);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.KWHzl;
            Pair pairOLrzqt2 = C56390yDp.OLrzqt(this.$scenario, new ConfigEvent(false, false, false, false, 15, null));
            this.L$0 = null;
            this.label = 7;
            if (mutableSharedFlow2.emit(pairOLrzqt2, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new ConfigManagerImpl$run$1$apiCall$1(this.this$0, this.$scenario, null), 3, null);
                pUU.KWHzl("ConfigManager", "Starting Flow: " + this.$scenario + ", isIgnore: " + this.this$0.AkhnZx() + ", isSyncing:" + this.this$0.fetchVPNInfo.get() + ", loading:" + ConfigLoadingActivity.Companion.KWHzl().get());
                if (!this.this$0.AkhnZx()) {
                    this.this$0.fetchVPNInfo.set(true);
                    if (this.this$0.AEQbTJ(this.$scenario)) {
                        this.this$0.AEQbTJ.postValue(C56443yFo.AEQbTJ(this.this$0.AEQbTJ(this.$scenario, false)));
                        C33285mta c33285mta2 = this.this$0;
                        this.L$0 = deferredAsync$default;
                        this.label = 1;
                        if (c33285mta2.OLrzqt((Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    this.L$0 = null;
                    this.label = 2;
                    if (deferredAsync$default.await(this) == objCopydefault) {
                        return objCopydefault;
                    }
                    configEventCopydefault = this.this$0.gEmmrt.copydefault(this.$scenario);
                    this.this$0.AEQbTJ.postValue(C56443yFo.AEQbTJ(this.this$0.AEQbTJ(this.$scenario, configEventCopydefault.KWHzl())));
                    if (this.this$0.EZpvd(this.$scenario, configEventCopydefault)) {
                        pUU.KWHzl("ConfigManager", this.$scenario + " trigger async loading view: " + configEventCopydefault);
                        C33285mta c33285mta3 = this.this$0;
                        this.L$0 = configEventCopydefault;
                        this.label = 3;
                        if (c33285mta3.OLrzqt((Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    c33285mta = this.this$0;
                    scenario = this.$scenario;
                    this.L$0 = configEventCopydefault;
                    this.label = 4;
                    if (c33285mta.EZpvd(scenario, configEventCopydefault, (Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                    pUU.KWHzl("ConfigManager", "request loading finished");
                    mutableSharedFlow = this.this$0.KWHzl;
                    pairOLrzqt = C56390yDp.OLrzqt(this.$scenario, configEventCopydefault);
                    this.L$0 = configEventCopydefault;
                    this.label = 5;
                    if (mutableSharedFlow.emit(pairOLrzqt, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    this.this$0.fetchVPNInfo.set(false);
                    if (!configEventCopydefault.OLrzqt() && !this.$scenario.copydefault()) {
                        mutableSharedFlowValueOf = this.this$0.valueOf();
                        scenario2 = this.$scenario;
                        this.L$0 = null;
                        this.label = 6;
                        if (mutableSharedFlowValueOf.emit(scenario2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    pUU.KWHzl("ConfigManager", "config finished");
                    break;
                }
                return Unit.INSTANCE;
            case 1:
                deferredAsync$default = (Deferred) this.L$0;
                C56391yDq.AEQbTJ(obj);
                this.L$0 = null;
                this.label = 2;
                if (deferredAsync$default.await(this) == objCopydefault) {
                }
                configEventCopydefault = this.this$0.gEmmrt.copydefault(this.$scenario);
                this.this$0.AEQbTJ.postValue(C56443yFo.AEQbTJ(this.this$0.AEQbTJ(this.$scenario, configEventCopydefault.KWHzl())));
                if (this.this$0.EZpvd(this.$scenario, configEventCopydefault)) {
                }
                c33285mta = this.this$0;
                scenario = this.$scenario;
                this.L$0 = configEventCopydefault;
                this.label = 4;
                if (c33285mta.EZpvd(scenario, configEventCopydefault, (Continuation<? super Unit>) this) == objCopydefault) {
                }
                pUU.KWHzl("ConfigManager", "request loading finished");
                mutableSharedFlow = this.this$0.KWHzl;
                pairOLrzqt = C56390yDp.OLrzqt(this.$scenario, configEventCopydefault);
                this.L$0 = configEventCopydefault;
                this.label = 5;
                if (mutableSharedFlow.emit(pairOLrzqt, this) == objCopydefault) {
                }
                this.this$0.fetchVPNInfo.set(false);
                if (!configEventCopydefault.OLrzqt()) {
                    mutableSharedFlowValueOf = this.this$0.valueOf();
                    scenario2 = this.$scenario;
                    this.L$0 = null;
                    this.label = 6;
                    if (mutableSharedFlowValueOf.emit(scenario2, this) == objCopydefault) {
                    }
                }
                pUU.KWHzl("ConfigManager", "config finished");
                return Unit.INSTANCE;
            case 2:
                C56391yDq.AEQbTJ(obj);
                configEventCopydefault = this.this$0.gEmmrt.copydefault(this.$scenario);
                this.this$0.AEQbTJ.postValue(C56443yFo.AEQbTJ(this.this$0.AEQbTJ(this.$scenario, configEventCopydefault.KWHzl())));
                if (this.this$0.EZpvd(this.$scenario, configEventCopydefault)) {
                }
                c33285mta = this.this$0;
                scenario = this.$scenario;
                this.L$0 = configEventCopydefault;
                this.label = 4;
                if (c33285mta.EZpvd(scenario, configEventCopydefault, (Continuation<? super Unit>) this) == objCopydefault) {
                }
                pUU.KWHzl("ConfigManager", "request loading finished");
                mutableSharedFlow = this.this$0.KWHzl;
                pairOLrzqt = C56390yDp.OLrzqt(this.$scenario, configEventCopydefault);
                this.L$0 = configEventCopydefault;
                this.label = 5;
                if (mutableSharedFlow.emit(pairOLrzqt, this) == objCopydefault) {
                }
                this.this$0.fetchVPNInfo.set(false);
                if (!configEventCopydefault.OLrzqt()) {
                }
                pUU.KWHzl("ConfigManager", "config finished");
                return Unit.INSTANCE;
            case 3:
                configEventCopydefault = (ConfigEvent) this.L$0;
                C56391yDq.AEQbTJ(obj);
                c33285mta = this.this$0;
                scenario = this.$scenario;
                this.L$0 = configEventCopydefault;
                this.label = 4;
                if (c33285mta.EZpvd(scenario, configEventCopydefault, (Continuation<? super Unit>) this) == objCopydefault) {
                }
                pUU.KWHzl("ConfigManager", "request loading finished");
                mutableSharedFlow = this.this$0.KWHzl;
                pairOLrzqt = C56390yDp.OLrzqt(this.$scenario, configEventCopydefault);
                this.L$0 = configEventCopydefault;
                this.label = 5;
                if (mutableSharedFlow.emit(pairOLrzqt, this) == objCopydefault) {
                }
                this.this$0.fetchVPNInfo.set(false);
                if (!configEventCopydefault.OLrzqt()) {
                }
                pUU.KWHzl("ConfigManager", "config finished");
                return Unit.INSTANCE;
            case 4:
                configEventCopydefault = (ConfigEvent) this.L$0;
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("ConfigManager", "request loading finished");
                mutableSharedFlow = this.this$0.KWHzl;
                pairOLrzqt = C56390yDp.OLrzqt(this.$scenario, configEventCopydefault);
                this.L$0 = configEventCopydefault;
                this.label = 5;
                if (mutableSharedFlow.emit(pairOLrzqt, this) == objCopydefault) {
                }
                this.this$0.fetchVPNInfo.set(false);
                if (!configEventCopydefault.OLrzqt()) {
                }
                pUU.KWHzl("ConfigManager", "config finished");
                return Unit.INSTANCE;
            case 5:
                configEventCopydefault = (ConfigEvent) this.L$0;
                C56391yDq.AEQbTJ(obj);
                this.this$0.fetchVPNInfo.set(false);
                if (!configEventCopydefault.OLrzqt()) {
                }
                pUU.KWHzl("ConfigManager", "config finished");
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("ConfigManager", "config finished");
                return Unit.INSTANCE;
            case 7:
                C56391yDq.AEQbTJ(obj);
                this.this$0.fetchVPNInfo.set(false);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
