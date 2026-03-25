package com.okinc.business.defi.wallet.switchComponent.repository;

import com.okinc.wallet.api.MpcWalletService;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletRepositoryImpl$refreshMpcWalletsState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends MpcWalletService.MpcWalletAbleStatus>>, Object> {
    final /* synthetic */ List<AbstractC12782ctV> $mpcWallets;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends o.ctV> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletRepositoryImpl$refreshMpcWalletsState$2(List<? extends AbstractC12782ctV> list, Continuation<? super WalletRepositoryImpl$refreshMpcWalletsState$2> continuation) {
        super(2, continuation);
        this.$mpcWallets = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletRepositoryImpl$refreshMpcWalletsState$2(this.$mpcWallets, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends MpcWalletService.MpcWalletAbleStatus>> continuation) {
        return ((WalletRepositoryImpl$refreshMpcWalletsState$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58185ywX<Map<String, MpcWalletService.MpcWalletAbleStatus>> abstractC58185ywXAEQbTJ = ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).AEQbTJ(this.$mpcWallets);
            this.label = 1;
            obj = AwaitKt.awaitFirst(abstractC58185ywXAEQbTJ, this);
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
