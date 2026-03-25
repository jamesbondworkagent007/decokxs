package com.okinc.business.defi.wallet.home.nfttopcollections;

import com.okinc.business.defi.biz.net.bean.NftCollection;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C18142fcn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class NftTopCollectionsViewModel$queryNftTopProjects$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C18142fcn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NftTopCollectionsViewModel$queryNftTopProjects$1(C18142fcn c18142fcn, Continuation<? super NftTopCollectionsViewModel$queryNftTopProjects$1> continuation) {
        super(continuation);
        this.this$0 = c18142fcn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((Continuation<? super List<NftCollection>>) this);
    }
}
