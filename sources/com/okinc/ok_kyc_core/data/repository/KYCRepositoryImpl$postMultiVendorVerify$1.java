package com.okinc.ok_kyc_core.data.repository;

import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C43746rvB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class KYCRepositoryImpl$postMultiVendorVerify$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C43746rvB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KYCRepositoryImpl$postMultiVendorVerify$1(C43746rvB c43746rvB, Continuation<? super KYCRepositoryImpl$postMultiVendorVerify$1> continuation) {
        super(continuation);
        this.this$0 = c43746rvB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault((List<SingleFileUploadUseCase.UploadedFile>) null, 0, 0, (String) null, this);
    }
}
