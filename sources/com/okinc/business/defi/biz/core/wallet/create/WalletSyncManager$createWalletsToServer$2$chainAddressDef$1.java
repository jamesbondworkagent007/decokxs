package com.okinc.business.defi.biz.core.wallet.create;

import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C13062cyk;
import o.C56391yDq;
import o.C56442yFn;
import o.cQM;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletSyncManager$createWalletsToServer$2$chainAddressDef$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends List<? extends ChainAddressEntity>>>, Object> {
    final /* synthetic */ List<String> $walletIds;
    int label;
    final /* synthetic */ C13062cyk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSyncManager$createWalletsToServer$2$chainAddressDef$1(C13062cyk c13062cyk, List<String> list, Continuation<? super WalletSyncManager$createWalletsToServer$2$chainAddressDef$1> continuation) {
        super(2, continuation);
        this.this$0 = c13062cyk;
        this.$walletIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSyncManager$createWalletsToServer$2$chainAddressDef$1(this.this$0, this.$walletIds, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends List<? extends ChainAddressEntity>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Map<String, ? extends List<ChainAddressEntity>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends List<ChainAddressEntity>>> continuation) {
        return ((WalletSyncManager$createWalletsToServer$2$chainAddressDef$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            cQM cqm = this.this$0.isConnected;
            List<String> list = this.$walletIds;
            this.label = 1;
            obj = cqm.EZpvd(list, this);
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
