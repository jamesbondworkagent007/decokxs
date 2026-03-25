package com.okinc.business.defi.biz.net.loader;

import com.okinc.business.defi.biz.net.bean.TeeAnd7702WalletStatusResp;
import com.okinc.business.defi.biz.net.bean.TeeAndEip7702Item;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC43419rot;
import o.C13934dbu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletLoader$getTeeAnd7702WalletsStatus$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C13934dbu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoader$getTeeAnd7702WalletsStatus$1(C13934dbu c13934dbu, Continuation<? super WalletLoader$getTeeAnd7702WalletsStatus$1> continuation) {
        super(continuation);
        this.this$0 = c13934dbu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault((List<TeeAndEip7702Item>) null, false, (Continuation<? super AbstractC43419rot<TeeAnd7702WalletStatusResp, OKServerException>>) this);
    }
}
