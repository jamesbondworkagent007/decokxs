package com.okinc.business.defi.wallet.transfer;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C13754dXa;
import o.C17304fAj;
import o.C20634gkb;
import o.C33070mpX;
import o.C33129mqd;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class TransferSelectCoinFragment$observeData$2 extends SuspendLambda implements Function2<Pair<? extends String, ? extends String>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C20634gkb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferSelectCoinFragment$observeData$2(C20634gkb c20634gkb, Continuation<? super TransferSelectCoinFragment$observeData$2> continuation) {
        super(2, continuation);
        this.this$0 = c20634gkb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransferSelectCoinFragment$observeData$2 transferSelectCoinFragment$observeData$2 = new TransferSelectCoinFragment$observeData$2(this.this$0, continuation);
        transferSelectCoinFragment$observeData$2.L$0 = obj;
        return transferSelectCoinFragment$observeData$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Pair<? extends String, ? extends String> pair, Continuation<? super Unit> continuation) {
        return invoke2((Pair<String, String>) pair, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Pair<String, String> pair, Continuation<? super Unit> continuation) {
        return ((TransferSelectCoinFragment$observeData$2) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair pair = (Pair) this.L$0;
            if (C33129mqd.OLrzqt((CharSequence) pair.getFirst())) {
                C17304fAj.EZpvd.KWHzl((String) pair.getFirst(), (String) pair.getSecond(), this.this$0.getActivity());
            } else {
                C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.UeEOUB), 0, 1, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
