package com.okinc.business.defi.biz.core.wallet.create;

import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C13062cyk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletSyncManager$syncWalletList$2$requestSegwitDef$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C13062cyk.StateListAnimator<C13062cyk.TaskDescription>>, Object> {
    final /* synthetic */ boolean $isDelay;
    final /* synthetic */ List<WalletEntity> $successCallCreateWallet;
    int label;
    final /* synthetic */ C13062cyk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSyncManager$syncWalletList$2$requestSegwitDef$1(C13062cyk c13062cyk, List<WalletEntity> list, boolean z, Continuation<? super WalletSyncManager$syncWalletList$2$requestSegwitDef$1> continuation) {
        super(2, continuation);
        this.this$0 = c13062cyk;
        this.$successCallCreateWallet = list;
        this.$isDelay = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSyncManager$syncWalletList$2$requestSegwitDef$1(this.this$0, this.$successCallCreateWallet, this.$isDelay, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C13062cyk.StateListAnimator<C13062cyk.TaskDescription>> continuation) {
        return ((WalletSyncManager$syncWalletList$2$requestSegwitDef$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C13062cyk c13062cyk = this.this$0;
            List<WalletEntity> list = this.$successCallCreateWallet;
            boolean z = this.$isDelay;
            this.label = 1;
            obj = c13062cyk.KWHzl((List<WalletEntity>) list, z, (Continuation<? super C13062cyk.StateListAnimator<C13062cyk.TaskDescription>>) this);
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
