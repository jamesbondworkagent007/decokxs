package com.okinc.network.okg.dns;

import com.okinc.network.okg.dns.model.CnDecryptionNode;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C43365rns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class DnsCommonManager$startNodeParseTaskV2$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C43365rns this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DnsCommonManager$startNodeParseTaskV2$1(C43365rns c43365rns, Continuation<? super DnsCommonManager$startNodeParseTaskV2$1> continuation) {
        super(continuation);
        this.this$0 = c43365rns;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ((CnDecryptionNode) null, 0, this);
    }
}
