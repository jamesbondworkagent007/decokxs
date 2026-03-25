package com.okinc.business.dexui.main.limitorder.orderdetail;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.defi.api.bean.WalletJwtException;
import com.okinc.business.dexui.main.limitorder.orderdetail.LimitOrderDetailActivity$addDataListener$8;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C22274hcK;
import o.C23274hvD;
import o.C23377hxA;
import o.C52794wYp;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class LimitOrderDetailActivity$addDataListener$8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LimitOrderDetailActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitOrderDetailActivity$addDataListener$8(LimitOrderDetailActivity limitOrderDetailActivity, Continuation<? super LimitOrderDetailActivity$addDataListener$8> continuation) {
        super(2, continuation);
        this.this$0 = limitOrderDetailActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LimitOrderDetailActivity$addDataListener$8(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LimitOrderDetailActivity$addDataListener$8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.dexui.main.limitorder.orderdetail.LimitOrderDetailActivity$addDataListener$8$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ LimitOrderDetailActivity this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LimitOrderDetailActivity limitOrderDetailActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = limitOrderDetailActivity;
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
                Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.AhwBna().AEQbTJ());
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass2, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.business.dexui.main.limitorder.orderdetail.LimitOrderDetailActivity$addDataListener$8$1$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ LimitOrderDetailActivity OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(LimitOrderDetailActivity limitOrderDetailActivity) {
                this.OLrzqt = limitOrderDetailActivity;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation<? super Unit> continuation) {
                C52794wYp c52794wYp;
                Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
                LimitOrderDetailActivity limitOrderDetailActivity = this.OLrzqt;
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    int iIntValue = ((Number) objM7386unboximpl).intValue();
                    pUU.KWHzl(limitOrderDetailActivity.getTAG(), "Cancel limit order(" + limitOrderDetailActivity.AuCTel() + ") success: " + iIntValue);
                }
                final LimitOrderDetailActivity limitOrderDetailActivity2 = this.OLrzqt;
                Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ(limitOrderDetailActivity2.getTAG(), "Cancel limit order(" + limitOrderDetailActivity2.AuCTel() + ") error", thM7380exceptionOrNullimpl);
                    if ((thM7380exceptionOrNullimpl instanceof WalletJwtException) || ((thM7380exceptionOrNullimpl instanceof OKServerException) && (((OKServerException) thM7380exceptionOrNullimpl).getOrigin() instanceof WalletJwtException))) {
                        C22274hcK.OLrzqt.KWHzl(limitOrderDetailActivity2, new Function0() { // from class: o.hMl
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return LimitOrderDetailActivity$addDataListener$8.AnonymousClass1.AnonymousClass2.EZpvd(limitOrderDetailActivity2);
                            }
                        });
                    } else {
                        C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.addPreRequisiteCollector, 0, 1, (Object) null);
                    }
                    C23377hxA c23377hxA = limitOrderDetailActivity2.valueOf;
                    if (c23377hxA != null && (c52794wYp = c23377hxA.isConnected) != null) {
                        c52794wYp.fIwbmz();
                    }
                }
                this.OLrzqt.AhwBna().copydefault();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit EZpvd(LimitOrderDetailActivity limitOrderDetailActivity) {
                limitOrderDetailActivity.AhwBna().AEQbTJ(limitOrderDetailActivity.AuCTel());
                return Unit.INSTANCE;
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LimitOrderDetailActivity limitOrderDetailActivity = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(limitOrderDetailActivity, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(limitOrderDetailActivity, state, anonymousClass1, this) == objCopydefault) {
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
