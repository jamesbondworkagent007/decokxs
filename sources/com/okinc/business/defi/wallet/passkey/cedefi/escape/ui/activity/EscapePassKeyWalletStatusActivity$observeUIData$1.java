package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity;

import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedDetailStatus;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedStatusUIData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C13754dXa;
import o.C56391yDq;
import o.C56442yFn;
import o.fKG;

/* JADX INFO: loaded from: classes18.dex */
public final class EscapePassKeyWalletStatusActivity$observeUIData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fKG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePassKeyWalletStatusActivity$observeUIData$1(fKG fkg, Continuation<? super EscapePassKeyWalletStatusActivity$observeUIData$1> continuation) {
        super(2, continuation);
        this.this$0 = fkg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapePassKeyWalletStatusActivity$observeUIData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapePassKeyWalletStatusActivity$observeUIData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletStatusActivity$observeUIData$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Result<? extends EscapedStatusUIData>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fKG this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fKG fkg, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fkg;
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
        public /* bridge */ /* synthetic */ Object invoke(Result<? extends EscapedStatusUIData> result, Continuation<? super Unit> continuation) {
            return invoke2((Result<EscapedStatusUIData>) result, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Result<EscapedStatusUIData> result, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(result, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Result result = (Result) this.L$0;
                if (result != null && Result.m7384isSuccessimpl(result.m7386unboximpl())) {
                    Object objM7386unboximpl = result.m7386unboximpl();
                    if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                        objM7386unboximpl = null;
                    }
                    EscapedStatusUIData escapedStatusUIData = (EscapedStatusUIData) objM7386unboximpl;
                    if (escapedStatusUIData != null) {
                        fKG fkg = this.this$0;
                        if (escapedStatusUIData.getEscapeStatus() == EscapedDetailStatus.COMPLETED) {
                            String string = fkg.getString(C13754dXa.FragmentManager.fromToken);
                            Intrinsics.checkNotNullExpressionValue(string, "");
                            fkg.KWHzl(string);
                        }
                        fkg.KWHzl(escapedStatusUIData);
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
            Flow<Result<EscapedStatusUIData>> flowCopydefault = this.this$0.OLrzqt().copydefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowCopydefault, anonymousClass1, this) == objCopydefault) {
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
