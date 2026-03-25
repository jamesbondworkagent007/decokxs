package com.okinc.oklive.app.ui.list.viewmodel;

import androidx.lifecycle.ViewModelKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C44571sUw;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sTG;
import o.sTV;
import o.sUN;
import o.yHO;

/* JADX INFO: loaded from: classes19.dex */
public final class LivestreamListViewModel$resumeTokenMonitoring$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.BooleanRef $hasReceivedValidData;
    final /* synthetic */ String $instId;
    int label;
    final /* synthetic */ sUN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamListViewModel$resumeTokenMonitoring$1(sUN sun, String str, Ref.BooleanRef booleanRef, Continuation<? super LivestreamListViewModel$resumeTokenMonitoring$1> continuation) {
        super(2, continuation);
        this.this$0 = sun;
        this.$instId = str;
        this.$hasReceivedValidData = booleanRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamListViewModel$resumeTokenMonitoring$1(this.this$0, this.$instId, this.$hasReceivedValidData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivestreamListViewModel$resumeTokenMonitoring$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sTG stg = this.this$0.zLjUOn;
            String str = this.$instId;
            this.label = 1;
            if (stg.KWHzl(str, "SPOT", this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        sUN sun = this.this$0;
        sun.wlaJM = FlowKt.launchIn(FlowKt.m7441catch(FlowKt.onEach(sun.zLjUOn.OLrzqt(), new AnonymousClass1(this.$hasReceivedValidData, this.this$0, null)), new AnonymousClass2(null)), ViewModelKt.getViewModelScope(this.this$0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.oklive.app.ui.list.viewmodel.LivestreamListViewModel$resumeTokenMonitoring$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<sTV, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.BooleanRef $hasReceivedValidData;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ sUN this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.BooleanRef booleanRef, sUN sun, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$hasReceivedValidData = booleanRef;
            this.this$0 = sun;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$hasReceivedValidData, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sTV stv, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(stv, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0086 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            C44571sUw c44571sUw;
            String strOLrzqt;
            sTG stg;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                sTV stv = (sTV) this.L$0;
                if ((stv != null ? stv.KWHzl() : null) != null) {
                    this.$hasReceivedValidData.element = true;
                    this.this$0.KWHzl.setValue(new sUN.Application(this.this$0.copydefault(stv.KWHzl(), stv.EZpvd()), stv.EZpvd()));
                } else if (this.$hasReceivedValidData.element && stv == null) {
                    this.label = 1;
                    if (DelayKt.delay(500L, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    c44571sUw = this.this$0.djBIcL;
                    if (c44571sUw != null) {
                        stg = this.this$0.zLjUOn;
                        this.label = 2;
                        if (stg.KWHzl(strOLrzqt, "SPOT", this) == objCopydefault) {
                        }
                    }
                }
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                c44571sUw = this.this$0.djBIcL;
                if (c44571sUw != null && (strOLrzqt = c44571sUw.OLrzqt()) != null) {
                    stg = this.this$0.zLjUOn;
                    this.label = 2;
                    if (stg.KWHzl(strOLrzqt, "SPOT", this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.oklive.app.ui.list.viewmodel.LivestreamListViewModel$resumeTokenMonitoring$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements yHO<FlowCollector<? super sTV>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final Object invoke(FlowCollector<? super sTV> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = th;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            pUU.AEQbTJ("LivestreamListViewModel", "Error observing ticker data", (Throwable) this.L$0);
            return Unit.INSTANCE;
        }
    }
}
