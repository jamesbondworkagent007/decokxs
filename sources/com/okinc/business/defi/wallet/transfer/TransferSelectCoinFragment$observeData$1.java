package com.okinc.business.defi.wallet.transfer;

import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.wallet.transfer.TransferSelectCoinFragment$observeData$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C17304fAj;
import o.C20634gkb;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class TransferSelectCoinFragment$observeData$1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C20634gkb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferSelectCoinFragment$observeData$1(C20634gkb c20634gkb, Continuation<? super TransferSelectCoinFragment$observeData$1> continuation) {
        super(2, continuation);
        this.this$0 = c20634gkb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransferSelectCoinFragment$observeData$1 transferSelectCoinFragment$observeData$1 = new TransferSelectCoinFragment$observeData$1(this.this$0, continuation);
        transferSelectCoinFragment$observeData$1.L$0 = obj;
        return transferSelectCoinFragment$observeData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((TransferSelectCoinFragment$observeData$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            final String str = (String) this.L$0;
            C17304fAj c17304fAj = C17304fAj.EZpvd;
            FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            final C20634gkb c20634gkb = this.this$0;
            c17304fAj.KWHzl(childFragmentManager, new Function1() { // from class: o.gla
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return TransferSelectCoinFragment$observeData$1.invokeSuspend$lambda$0(c20634gkb, str, (java.lang.String) obj2);
                }
            });
            this.this$0.dismissLoading();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C20634gkb c20634gkb, String str, String str2) {
        c20634gkb.values().KWHzl(str2, str);
        return Unit.INSTANCE;
    }
}
