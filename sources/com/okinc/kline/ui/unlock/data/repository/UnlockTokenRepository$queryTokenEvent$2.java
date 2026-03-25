package com.okinc.kline.ui.unlock.data.repository;

import com.okinc.kline.ui.unlock.data.po.UnlockTokenEvent;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C39654pwS;
import o.C39656pwU;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class UnlockTokenRepository$queryTokenEvent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends UnlockTokenEvent>>, Object> {
    final /* synthetic */ String $ccy;
    final /* synthetic */ String $type;
    int label;
    final /* synthetic */ C39656pwU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockTokenRepository$queryTokenEvent$2(C39656pwU c39656pwU, String str, String str2, Continuation<? super UnlockTokenRepository$queryTokenEvent$2> continuation) {
        super(2, continuation);
        this.this$0 = c39656pwU;
        this.$ccy = str;
        this.$type = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnlockTokenRepository$queryTokenEvent$2(this.this$0, this.$ccy, this.$type, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends UnlockTokenEvent>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<UnlockTokenEvent>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<UnlockTokenEvent>> continuation) {
        return ((UnlockTokenRepository$queryTokenEvent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.kline.ui.unlock.data.repository.UnlockTokenRepository$queryTokenEvent$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super ResponseData<List<? extends UnlockTokenEvent>>>, Object> {
        final /* synthetic */ String $ccy;
        final /* synthetic */ String $type;
        int label;
        final /* synthetic */ C39656pwU this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C39656pwU c39656pwU, String str, String str2, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = c39656pwU;
            this.$ccy = str;
            this.$type = str2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$ccy, this.$type, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super ResponseData<List<? extends UnlockTokenEvent>>> continuation) {
            return invoke2((Continuation<? super ResponseData<List<UnlockTokenEvent>>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super ResponseData<List<UnlockTokenEvent>>> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C39654pwS c39654pwSKWHzl = this.this$0.KWHzl();
                String str = this.$ccy;
                String str2 = this.$type;
                this.label = 1;
                obj = c39654pwSKWHzl.KWHzl(str, str2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return obj;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C39656pwU c39656pwU = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c39656pwU, this.$ccy, this.$type, null);
            this.label = 1;
            obj = c39656pwU.EZpvd(anonymousClass1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
