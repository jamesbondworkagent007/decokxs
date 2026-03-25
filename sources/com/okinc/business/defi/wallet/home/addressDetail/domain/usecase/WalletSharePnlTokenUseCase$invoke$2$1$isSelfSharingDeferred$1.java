package com.okinc.business.defi.wallet.home.addressDetail.domain.usecase;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C15839eXe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.eWZ;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSharePnlTokenUseCase$invoke$2$1$isSelfSharingDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $walletAddress;
    int label;
    final /* synthetic */ C15839eXe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSharePnlTokenUseCase$invoke$2$1$isSelfSharingDeferred$1(C15839eXe c15839eXe, String str, Continuation<? super WalletSharePnlTokenUseCase$invoke$2$1$isSelfSharingDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = c15839eXe;
        this.$walletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSharePnlTokenUseCase$invoke$2$1$isSelfSharingDeferred$1(this.this$0, this.$walletAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((WalletSharePnlTokenUseCase$invoke$2$1$isSelfSharingDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C15839eXe c15839eXe = this.this$0;
                String str = this.$walletAddress;
                Result.Application application = Result.Companion;
                eWZ ewz = c15839eXe.KWHzl;
                this.label = 1;
                obj = ewz.OLrzqt(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(((Boolean) obj).booleanValue()));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }
}
