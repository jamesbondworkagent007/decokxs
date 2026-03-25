package com.okinc.ok_kyc_core.data.repository;

import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OssImageUrlResp;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC43728ruk;
import o.C43746rvB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class KYCRepositoryImpl$getOssImageUrl$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C43746rvB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KYCRepositoryImpl$getOssImageUrl$1(C43746rvB c43746rvB, Continuation<? super KYCRepositoryImpl$getOssImageUrl$1> continuation) {
        super(continuation);
        this.this$0 = c43746rvB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt(0L, (Continuation<? super AbstractC43728ruk<OssImageUrlResp, ResponseFailedException>>) this);
    }
}
