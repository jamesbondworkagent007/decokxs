package com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C44358sMw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class PhoneRelationEntityRepository$getPhoneRelationsByHashes$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C44358sMw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneRelationEntityRepository$getPhoneRelationsByHashes$1(C44358sMw c44358sMw, Continuation<? super PhoneRelationEntityRepository$getPhoneRelationsByHashes$1> continuation) {
        super(continuation);
        this.this$0 = c44358sMw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getPhoneRelationsByHashes(null, this);
    }
}
