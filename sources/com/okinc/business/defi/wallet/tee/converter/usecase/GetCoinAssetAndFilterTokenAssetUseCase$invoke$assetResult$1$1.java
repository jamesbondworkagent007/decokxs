package com.okinc.business.defi.wallet.tee.converter.usecase;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.C10404bnn;
import o.C10407bnq;
import o.C17862fVa;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class GetCoinAssetAndFilterTokenAssetUseCase$invoke$assetResult$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends C10404bnn, ? extends AbstractC12782ctV>>, Object> {
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ C17862fVa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCoinAssetAndFilterTokenAssetUseCase$invoke$assetResult$1$1(C17862fVa c17862fVa, AbstractC12782ctV abstractC12782ctV, Continuation<? super GetCoinAssetAndFilterTokenAssetUseCase$invoke$assetResult$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c17862fVa;
        this.$wallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetCoinAssetAndFilterTokenAssetUseCase$invoke$assetResult$1$1(this.this$0, this.$wallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends C10404bnn, ? extends AbstractC12782ctV>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Pair<C10404bnn, ? extends AbstractC12782ctV>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<C10404bnn, ? extends AbstractC12782ctV>> continuation) {
        return ((GetCoinAssetAndFilterTokenAssetUseCase$invoke$assetResult$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58185ywX abstractC58185ywXRefreshWalletAsset$default = C10407bnq.refreshWalletAsset$default(this.this$0.OLrzqt, this.$wallet.DbNXlk(), 1, yDY.AhwBna(), false, false, 8, null);
            this.label = 1;
            obj = AwaitKt.awaitFirst(abstractC58185ywXRefreshWalletAsset$default, this);
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
