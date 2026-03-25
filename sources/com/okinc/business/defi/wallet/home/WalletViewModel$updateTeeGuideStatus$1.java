package com.okinc.business.defi.wallet.home;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C56391yDq;
import o.C56442yFn;
import o.eUI;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletViewModel$updateTeeGuideStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $walletId;
    int label;
    final /* synthetic */ eUI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletViewModel$updateTeeGuideStatus$1(String str, eUI eui, Continuation<? super WalletViewModel$updateTeeGuideStatus$1> continuation) {
        super(2, continuation);
        this.$walletId = str;
        this.this$0 = eui;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletViewModel$updateTeeGuideStatus$1(this.$walletId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletViewModel$updateTeeGuideStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        AbstractC12782ctV abstractC12782ctV;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                String str = this.$walletId;
                Result.Application application = Result.Companion;
                if (str != null && str.length() != 0) {
                    AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, false);
                    this.label = 2;
                    obj = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC12782ctV = (AbstractC12782ctV) obj;
                }
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
                this.label = 1;
                obj = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                abstractC12782ctV = (AbstractC12782ctV) obj;
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                abstractC12782ctV = (AbstractC12782ctV) obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                abstractC12782ctV = (AbstractC12782ctV) obj;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(abstractC12782ctV);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        eUI eui = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) objM7377constructorimpl;
            MutableSharedFlow mutableSharedFlow = eui.copydefault;
            Intrinsics.copydefault(abstractC12782ctV2);
            mutableSharedFlow.tryEmit(abstractC12782ctV2);
        }
        return Unit.INSTANCE;
    }
}
