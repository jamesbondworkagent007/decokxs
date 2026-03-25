package com.okinc.business.defi.biz.core.asset.totalasset;

import com.okinc.business.defi.biz.database.wallet.entity.WalletTotalAssetEntity;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C10538bqO;
import o.C56391yDq;
import o.C56442yFn;
import o.cSN;

/* JADX INFO: loaded from: classes3.dex */
public final class WalletTotalAssetLocalDataSource$updateWalletTotalAssets$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Long>>, Object> {
    final /* synthetic */ List<WalletTotalAssetEntity> $totalAssets;
    int label;
    final /* synthetic */ C10538bqO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletTotalAssetLocalDataSource$updateWalletTotalAssets$2(C10538bqO c10538bqO, List<WalletTotalAssetEntity> list, Continuation<? super WalletTotalAssetLocalDataSource$updateWalletTotalAssets$2> continuation) {
        super(2, continuation);
        this.this$0 = c10538bqO;
        this.$totalAssets = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletTotalAssetLocalDataSource$updateWalletTotalAssets$2(this.this$0, this.$totalAssets, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Long>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<Long>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<Long>> continuation) {
        return ((WalletTotalAssetLocalDataSource$updateWalletTotalAssets$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            cSN csn = this.this$0.KWHzl;
            List<WalletTotalAssetEntity> list = this.$totalAssets;
            this.label = 1;
            obj = csn.KWHzl(list, this);
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
