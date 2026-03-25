package com.okinc.core.ok_app.configuration;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.core.ok_app.api.configuration.Scenario;
import com.okinc.core.ok_app.configuration.ConfigLoadingActivity;
import com.okinc.core.ok_app.configuration.event.ConfigEvent;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.InterfaceC33171mrS;
import o.InterfaceC33254msw;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class ConfigLoadingActivity$listenFinishEvent$1 extends SuspendLambda implements Function2<Pair<? extends Scenario, ? extends ConfigEvent>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $createTime;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ConfigLoadingActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigLoadingActivity$listenFinishEvent$1(long j, ConfigLoadingActivity configLoadingActivity, Continuation<? super ConfigLoadingActivity$listenFinishEvent$1> continuation) {
        super(2, continuation);
        this.$createTime = j;
        this.this$0 = configLoadingActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConfigLoadingActivity$listenFinishEvent$1 configLoadingActivity$listenFinishEvent$1 = new ConfigLoadingActivity$listenFinishEvent$1(this.$createTime, this.this$0, continuation);
        configLoadingActivity$listenFinishEvent$1.L$0 = obj;
        return configLoadingActivity$listenFinishEvent$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Pair<? extends Scenario, ? extends ConfigEvent> pair, Continuation<? super Unit> continuation) {
        return invoke2((Pair<? extends Scenario, ConfigEvent>) pair, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Pair<? extends Scenario, ConfigEvent> pair, Continuation<? super Unit> continuation) {
        return ((ConfigLoadingActivity$listenFinishEvent$1) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair pair;
        Scenario scenario;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            pUU.copydefault("ConfigManager Loading", "onFinish Exception: " + e);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.this$0), null, null, new AnonymousClass1(this.this$0, null), 3, null);
            FlowCollector flowCollectorValueOf = this.this$0.djBIcL().valueOf();
            Object first = pair.getFirst();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (flowCollectorValueOf.emit(first, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pair = (Pair) this.L$0;
            pUU.KWHzl("ConfigManager Loading", "receive finish event: " + pair);
            scenario = (Scenario) pair.getFirst();
            long jCurrentTimeMillis = System.currentTimeMillis() - this.$createTime;
            pUU.KWHzl("ConfigManager Loading", "ConfigLoadingActivity time spend: " + jCurrentTimeMillis);
            if (jCurrentTimeMillis < 2000) {
                long j = 2000 - jCurrentTimeMillis;
                pUU.KWHzl("ConfigManager Loading", "wait activity min show time: " + scenario + ", time: " + j);
                this.L$0 = pair;
                this.L$1 = scenario;
                this.label = 1;
                if (DelayKt.delay(j, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                this.this$0.finish();
                return Unit.INSTANCE;
            }
            scenario = (Scenario) this.L$1;
            pair = (Pair) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Scenario scenario2 = scenario;
        ConfigEvent configEventCopydefault = this.this$0.AYXKKw().copydefault(scenario2);
        Integer numAEQbTJ = scenario2.AEQbTJ();
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33254msw.class));
        InterfaceC33254msw interfaceC33254msw = listKWHzl != null ? (InterfaceC33254msw) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl) : null;
        if (numAEQbTJ != null && this.this$0.EZpvd(numAEQbTJ.intValue())) {
            Scenario scenarioCopy$default = Scenario.copy$default(scenario2, false, this.this$0.AEQbTJ(scenario2.EZpvd(), scenario2.AEQbTJ()), null, 5, null);
            pUU.KWHzl("ConfigManager Loading", "set preferred mode: " + numAEQbTJ + ", in " + scenarioCopy$default);
            C56443yFo.KWHzl(InterfaceC33171mrS.Activity.switchToAppMode$default(this.this$0.gEmmrt(), this.this$0, numAEQbTJ.intValue(), true, 0, null, new ConfigLoadingActivity.TaskDescription(scenarioCopy$default), 24, null));
        } else if (configEventCopydefault.EZpvd() || !this.this$0.KWHzl() || (interfaceC33254msw != null && interfaceC33254msw.EZpvd())) {
            pUU.KWHzl("ConfigManager Loading", "trigger mode switch: " + scenario2 + " in ConfigLoadingActivity");
            C56443yFo.KWHzl(InterfaceC33171mrS.Activity.autoSwitchMode$default(this.this$0.gEmmrt(), this.this$0, true, true, null, new ConfigLoadingActivity.TaskDescription(scenario2), 8, null));
        } else {
            new ConfigLoadingActivity.TaskDescription(scenario2).AEQbTJ(true);
            Unit unit = Unit.INSTANCE;
        }
        this.this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.core.ok_app.configuration.ConfigLoadingActivity$listenFinishEvent$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ConfigLoadingActivity this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConfigLoadingActivity configLoadingActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = configLoadingActivity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow<Unit> mutableSharedFlowGEmmrt = this.this$0.djBIcL().gEmmrt();
                Unit unit = Unit.INSTANCE;
                this.label = 1;
                if (mutableSharedFlowGEmmrt.emit(unit, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
            MutableSharedFlow<Unit> mutableSharedFlowAhwBna = this.this$0.djBIcL().AhwBna();
            Unit unit2 = Unit.INSTANCE;
            this.label = 2;
            if (mutableSharedFlowAhwBna.emit(unit2, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
    }
}
