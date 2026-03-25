package com.okinc.business.defi.wallet.passkey.cedefi.update.ui.fragment;

import com.okinc.business.defi.wallet.passkey.common.bean.InternalUpdateInfoResult;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C13754dXa;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.fMR;

/* JADX INFO: loaded from: classes18.dex */
public final class UpdateInfoFragment$onCreate$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fMR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateInfoFragment$onCreate$3(fMR fmr, Continuation<? super UpdateInfoFragment$onCreate$3> continuation) {
        super(2, continuation);
        this.this$0 = fmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpdateInfoFragment$onCreate$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UpdateInfoFragment$onCreate$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.update.ui.fragment.UpdateInfoFragment$onCreate$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Result<? extends String>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fMR this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fMR fmr, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fmr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Result<? extends String> result, Continuation<? super Unit> continuation) {
            return invoke(result.m7386unboximpl(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(Result.m7376boximpl(obj), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strAYXKKw;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Object objM7386unboximpl = ((Result) this.L$0).m7386unboximpl();
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    fMR fmr = this.this$0;
                    C56391yDq.AEQbTJ(objM7386unboximpl);
                    fmr.AEQbTJ(new InternalUpdateInfoResult.Success((String) objM7386unboximpl));
                } else {
                    Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        fMR fmr2 = this.this$0;
                        if (!(thM7380exceptionOrNullimpl instanceof OKServerException) || (strAYXKKw = thM7380exceptionOrNullimpl.getMessage()) == null) {
                            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.isTimeProfileEmpty);
                        }
                        fmr2.AEQbTJ(new InternalUpdateInfoResult.Failed(strAYXKKw));
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<Result<String>> sharedFlowAEQbTJ = this.this$0.OLrzqt().AEQbTJ();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowAEQbTJ, anonymousClass1, this) == objCopydefault) {
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
