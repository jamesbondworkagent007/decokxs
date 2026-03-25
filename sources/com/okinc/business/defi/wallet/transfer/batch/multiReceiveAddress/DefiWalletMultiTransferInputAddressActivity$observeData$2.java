package com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress;

import android.graphics.drawable.Drawable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC20923gpz;
import o.C13754dXa;
import o.C33069mpW;
import o.C33129mqd;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletMultiTransferInputAddressActivity$observeData$2 extends SuspendLambda implements Function2<Pair<? extends Integer, ? extends Boolean>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC20923gpz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMultiTransferInputAddressActivity$observeData$2(ActivityC20923gpz activityC20923gpz, Continuation<? super DefiWalletMultiTransferInputAddressActivity$observeData$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC20923gpz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefiWalletMultiTransferInputAddressActivity$observeData$2 defiWalletMultiTransferInputAddressActivity$observeData$2 = new DefiWalletMultiTransferInputAddressActivity$observeData$2(this.this$0, continuation);
        defiWalletMultiTransferInputAddressActivity$observeData$2.L$0 = obj;
        return defiWalletMultiTransferInputAddressActivity$observeData$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Pair<? extends Integer, ? extends Boolean> pair, Continuation<? super Unit> continuation) {
        return invoke2((Pair<Integer, Boolean>) pair, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Pair<Integer, Boolean> pair, Continuation<? super Unit> continuation) {
        return ((DefiWalletMultiTransferInputAddressActivity$observeData$2) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair pair = (Pair) this.L$0;
            if (pair != null && ((Boolean) pair.getSecond()).booleanValue()) {
                if (((Number) pair.getFirst()).intValue() == 0) {
                    C55326xho.toast$default(C33069mpW.copydefault(C13754dXa.FragmentManager.getCallerContract, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(C56443yFo.AEQbTJ(100))))), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                } else if (((Number) pair.getFirst()).intValue() == 1) {
                    C55326xho.toast$default(C33069mpW.copydefault(C13754dXa.FragmentManager.ActivityResultCallerLauncherresultContract2, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(C56443yFo.AEQbTJ(this.this$0.AEQbTJ().valueOf().size()))))), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                }
                this.this$0.AEQbTJ().OLrzqt(C56390yDp.OLrzqt(C56443yFo.AEQbTJ(-1), C56443yFo.KWHzl(false)));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
