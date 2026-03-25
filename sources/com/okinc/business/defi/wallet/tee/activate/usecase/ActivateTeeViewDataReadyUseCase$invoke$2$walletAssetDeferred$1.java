package com.okinc.business.defi.wallet.tee.activate.usecase;

import java.math.BigDecimal;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.C10407bnq;
import o.C17833fTz;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class ActivateTeeViewDataReadyUseCase$invoke$2$walletAssetDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends AbstractC12782ctV>>, Object> {
    final /* synthetic */ boolean $needToRequestAsset;
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ C17833fTz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateTeeViewDataReadyUseCase$invoke$2$walletAssetDeferred$1(boolean z, AbstractC12782ctV abstractC12782ctV, C17833fTz c17833fTz, Continuation<? super ActivateTeeViewDataReadyUseCase$invoke$2$walletAssetDeferred$1> continuation) {
        super(2, continuation);
        this.$needToRequestAsset = z;
        this.$wallet = abstractC12782ctV;
        this.this$0 = c17833fTz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivateTeeViewDataReadyUseCase$invoke$2$walletAssetDeferred$1(this.$needToRequestAsset, this.$wallet, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends AbstractC12782ctV>> continuation) {
        return ((ActivateTeeViewDataReadyUseCase$invoke$2$walletAssetDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            pUU.copydefault(this.this$0.KWHzl, "walletAssetDeferred failed  = " + th.getMessage());
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$needToRequestAsset || C33129mqd.valueOf(this.$wallet.OLrzqt("opened"), BigDecimal.ZERO)) {
                AbstractC58185ywX abstractC58185ywXRefreshWalletAsset$default = C10407bnq.refreshWalletAsset$default(this.this$0.AEQbTJ, this.$wallet.DbNXlk(), 0, null, false, false, 6, null);
                this.label = 1;
                obj = AwaitKt.awaitLast(abstractC58185ywXRefreshWalletAsset$default, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(this.$wallet);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Result.Application application3 = Result.Companion;
        objM7377constructorimpl = Result.m7377constructorimpl(((Pair) obj).getSecond());
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
