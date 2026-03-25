package com.okinc.okex.uploadlog.viewmodel;

import com.okinc.okex.uploadlog.bean.ElementValue;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class UploadLogViewModel$createApiElementIdFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableStateFlow<ElementValue> $elementFlow;
    final /* synthetic */ String $elementId;
    int label;
    final /* synthetic */ UploadLogViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadLogViewModel$createApiElementIdFlow$1(MutableStateFlow<ElementValue> mutableStateFlow, UploadLogViewModel uploadLogViewModel, String str, Continuation<? super UploadLogViewModel$createApiElementIdFlow$1> continuation) {
        super(2, continuation);
        this.$elementFlow = mutableStateFlow;
        this.this$0 = uploadLogViewModel;
        this.$elementId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UploadLogViewModel$createApiElementIdFlow$1(this.$elementFlow, this.this$0, this.$elementId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UploadLogViewModel$createApiElementIdFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowDebounce = FlowKt.debounce(this.$elementFlow, 100L);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$elementId, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDebounce, anonymousClass1, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.okex.uploadlog.viewmodel.UploadLogViewModel$createApiElementIdFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ElementValue, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $elementId;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UploadLogViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UploadLogViewModel uploadLogViewModel, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uploadLogViewModel;
            this.$elementId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$elementId, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ElementValue elementValue, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(elementValue, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            Map mapIsConnected;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                ElementValue elementValue = (ElementValue) this.L$0;
                MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
                String str = this.$elementId;
                do {
                    value = mutableStateFlow.getValue();
                    mapIsConnected = C56424yEw.isConnected((Map) value);
                    mapIsConnected.put(str, elementValue);
                } while (!mutableStateFlow.compareAndSet(value, mapIsConnected));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
