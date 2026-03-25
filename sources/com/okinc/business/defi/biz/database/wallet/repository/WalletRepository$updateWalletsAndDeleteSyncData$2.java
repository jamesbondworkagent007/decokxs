package com.okinc.business.defi.biz.database.wallet.repository;

import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.net.bean.SyncWalletReqNew;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC11384cMf;
import o.cQM;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletRepository$updateWalletsAndDeleteSyncData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final /* synthetic */ List<SyncWalletReqNew> $deleteWallets;
    final /* synthetic */ List<WalletEntity> $updateWallets;
    int label;
    final /* synthetic */ cQM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletRepository$updateWalletsAndDeleteSyncData$2(cQM cqm, List<WalletEntity> list, List<SyncWalletReqNew> list2, Continuation<? super WalletRepository$updateWalletsAndDeleteSyncData$2> continuation) {
        super(2, continuation);
        this.this$0 = cqm;
        this.$updateWallets = list;
        this.$deleteWallets = list2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletRepository$updateWalletsAndDeleteSyncData$2(this.this$0, this.$updateWallets, this.$deleteWallets, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((WalletRepository$updateWalletsAndDeleteSyncData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC11384cMf interfaceC11384cMf = this.this$0.copydefault;
            List<WalletEntity> list = this.$updateWallets;
            List<SyncWalletReqNew> list2 = this.$deleteWallets;
            this.label = 1;
            obj = interfaceC11384cMf.OLrzqt(list, list2, this);
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
