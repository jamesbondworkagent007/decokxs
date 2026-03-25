package com.okinc.business.defi.wallet.mine.walletbind.utils;

import com.okinc.business.defi.wallet.mine.walletbind.datasource.WalletBindApiService;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C17304fAj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class IndependentWalletBindCeFiUtils$getBoundWalletsFromBE$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C17304fAj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndependentWalletBindCeFiUtils$getBoundWalletsFromBE$1(C17304fAj c17304fAj, Continuation<? super IndependentWalletBindCeFiUtils$getBoundWalletsFromBE$1> continuation) {
        super(continuation);
        this.this$0 = c17304fAj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault((List<String>) null, (WalletBindApiService) null, this);
    }
}
