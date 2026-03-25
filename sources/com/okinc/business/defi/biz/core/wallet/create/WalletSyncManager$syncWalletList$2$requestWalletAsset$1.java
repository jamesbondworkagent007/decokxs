package com.okinc.business.defi.biz.core.wallet.create;

import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletSyncManager$syncWalletList$2$requestWalletAsset$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends WalletEntity>>, Object> {
    final /* synthetic */ List<WalletEntity> $requestEosInfoList;
    final /* synthetic */ List<WalletEntity> $requestNearList;
    final /* synthetic */ List<WalletEntity> $requestSegwitList;
    final /* synthetic */ List<WalletEntity> $syncWalletNameList;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSyncManager$syncWalletList$2$requestWalletAsset$1(List<WalletEntity> list, List<WalletEntity> list2, List<WalletEntity> list3, List<WalletEntity> list4, Continuation<? super WalletSyncManager$syncWalletList$2$requestWalletAsset$1> continuation) {
        super(2, continuation);
        this.$syncWalletNameList = list;
        this.$requestSegwitList = list2;
        this.$requestEosInfoList = list3;
        this.$requestNearList = list4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSyncManager$syncWalletList$2$requestWalletAsset$1(this.$syncWalletNameList, this.$requestSegwitList, this.$requestEosInfoList, this.$requestNearList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends WalletEntity>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<WalletEntity>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<WalletEntity>> continuation) {
        return ((WalletSyncManager$syncWalletList$2$requestWalletAsset$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(CollectionsKt___CollectionsKt.AhwBna((Iterable) CollectionsKt___CollectionsKt.AhwBna((Iterable) CollectionsKt___CollectionsKt.AhwBna((Iterable) this.$syncWalletNameList, (Iterable) CollectionsKt___CollectionsKt.OqFWZa(this.$requestSegwitList)), (Iterable) CollectionsKt___CollectionsKt.OqFWZa(this.$requestEosInfoList)), (Iterable) CollectionsKt___CollectionsKt.OqFWZa(this.$requestNearList)));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
