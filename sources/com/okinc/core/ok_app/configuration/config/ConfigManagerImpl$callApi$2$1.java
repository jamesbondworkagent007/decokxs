package com.okinc.core.ok_app.configuration.config;

import com.okinc.core.ok_app.api.configuration.Scenario;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C33285mta;
import o.C33287mtc;
import o.C33291mtg;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes23.dex */
public final class ConfigManagerImpl$callApi$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Deferred<? extends Unit>>>, Object> {
    final /* synthetic */ Scenario $scenario;
    final /* synthetic */ C33285mta $this_runCatching;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigManagerImpl$callApi$2$1(C33285mta c33285mta, Scenario scenario, Continuation<? super ConfigManagerImpl$callApi$2$1> continuation) {
        super(2, continuation);
        this.$this_runCatching = c33285mta;
        this.$scenario = scenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConfigManagerImpl$callApi$2$1 configManagerImpl$callApi$2$1 = new ConfigManagerImpl$callApi$2$1(this.$this_runCatching, this.$scenario, continuation);
        configManagerImpl$callApi$2$1.L$0 = obj;
        return configManagerImpl$callApi$2$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Deferred<? extends Unit>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<? extends Deferred<Unit>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<? extends Deferred<Unit>>> continuation) {
        return ((ConfigManagerImpl$callApi$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterable iterableGEmmrt;
        Iterator it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            iterableGEmmrt = yDY.gEmmrt(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass1(this.$this_runCatching, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass2(this.$this_runCatching, this.$scenario, null), 3, null));
            it = iterableGEmmrt.iterator();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            iterableGEmmrt = (Iterable) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        while (it.hasNext()) {
            Deferred deferred = (Deferred) it.next();
            this.L$0 = iterableGEmmrt;
            this.L$1 = it;
            this.label = 1;
            if (deferred.await(this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return iterableGEmmrt;
    }

    /* JADX INFO: renamed from: com.okinc.core.ok_app.configuration.config.ConfigManagerImpl$callApi$2$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C33285mta $this_runCatching;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C33285mta c33285mta, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_runCatching = c33285mta;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_runCatching, continuation);
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
                C33287mtc c33287mtc = this.$this_runCatching.copydefault;
                this.label = 1;
                if (c33287mtc.OLrzqt(this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.core.ok_app.configuration.config.ConfigManagerImpl$callApi$2$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Scenario $scenario;
        final /* synthetic */ C33285mta $this_runCatching;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C33285mta c33285mta, Scenario scenario, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$this_runCatching = c33285mta;
            this.$scenario = scenario;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$this_runCatching, this.$scenario, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C33291mtg c33291mtg = this.$this_runCatching.valueOf;
                Scenario scenario = this.$scenario;
                this.label = 1;
                if (c33291mtg.copydefault(scenario, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
