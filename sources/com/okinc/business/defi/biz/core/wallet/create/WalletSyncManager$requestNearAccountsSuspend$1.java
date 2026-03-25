package com.okinc.business.defi.biz.core.wallet.create;

import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C13062cyk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletSyncManager$requestNearAccountsSuspend$1 extends ContinuationImpl {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C13062cyk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSyncManager$requestNearAccountsSuspend$1(C13062cyk c13062cyk, Continuation<? super WalletSyncManager$requestNearAccountsSuspend$1> continuation) {
        super(continuation);
        this.this$0 = c13062cyk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((List<WalletEntity>) null, (Continuation<? super C13062cyk.StateListAnimator<List<WalletEntity>>>) this);
    }
}
