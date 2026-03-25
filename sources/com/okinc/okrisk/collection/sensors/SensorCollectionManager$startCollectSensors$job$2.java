package com.okinc.okrisk.collection.sensors;

import android.hardware.SensorManager;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C47017tiB;
import o.C47064tiw;
import o.C47067tiz;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class SensorCollectionManager$startCollectSensors$job$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<C47017tiB, Unit> $callback;
    final /* synthetic */ C47064tiw $config;
    final /* synthetic */ SensorManager $sensorManager;
    final /* synthetic */ C47017tiB $sensorService;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.tiB, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SensorCollectionManager$startCollectSensors$job$2(C47064tiw c47064tiw, C47017tiB c47017tiB, SensorManager sensorManager, Function1<? super C47017tiB, Unit> function1, Continuation<? super SensorCollectionManager$startCollectSensors$job$2> continuation) {
        super(2, continuation);
        this.$config = c47064tiw;
        this.$sensorService = c47017tiB;
        this.$sensorManager = sensorManager;
        this.$callback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SensorCollectionManager$startCollectSensors$job$2 sensorCollectionManager$startCollectSensors$job$2 = new SensorCollectionManager$startCollectSensors$job$2(this.$config, this.$sensorService, this.$sensorManager, this.$callback, continuation);
        sensorCollectionManager$startCollectSensors$job$2.L$0 = obj;
        return sensorCollectionManager$startCollectSensors$job$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SensorCollectionManager$startCollectSensors$job$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    SensorType sensorTypeAEQbTJ = this.$config.AEQbTJ();
                    this.$config.EZpvd();
                    Objects.toString(sensorTypeAEQbTJ);
                    C47067tiz.EZpvd.set(this.$sensorService);
                    this.$sensorService.OLrzqt(this.$sensorManager, this.$config);
                    long jEZpvd = this.$config.EZpvd();
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (DelayKt.delay(jEZpvd, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        C47067tiz.KWHzl.KWHzl(this.$sensorService);
                        return Unit.INSTANCE;
                    }
                    coroutineScope = (CoroutineScope) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                }
                this.$sensorService.copydefault();
                CoroutineScopeKt.ensureActive(coroutineScope);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$callback, this.$sensorService, null);
                this.L$0 = null;
                this.label = 2;
                if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
                C47067tiz.KWHzl.KWHzl(this.$sensorService);
                return Unit.INSTANCE;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Throwable th) {
            C47067tiz.KWHzl.KWHzl(this.$sensorService);
            throw th;
        }
    }

    /* JADX INFO: renamed from: com.okinc.okrisk.collection.sensors.SensorCollectionManager$startCollectSensors$job$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<C47017tiB, Unit> $callback;
        final /* synthetic */ C47017tiB $sensorService;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super o.tiB, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super C47017tiB, Unit> function1, C47017tiB c47017tiB, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$callback = function1;
            this.$sensorService = c47017tiB;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$callback, this.$sensorService, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.$callback.invoke(this.$sensorService);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
