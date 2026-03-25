package com.okinc.ok_kyc_core.data.repository;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FilesUploadResultResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SingleFileUploadResultReq;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43746rvB;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC43709ruR;

/* JADX INFO: loaded from: classes10.dex */
public final class KYCRepositoryImpl$getFilesUploadResult$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<FilesUploadResultResp>>, Object> {
    final /* synthetic */ List<SingleFileUploadResultReq> $listOfFiles;
    final /* synthetic */ C43746rvB $this_runOrErrorResponse;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KYCRepositoryImpl$getFilesUploadResult$2$1(C43746rvB c43746rvB, List<SingleFileUploadResultReq> list, Continuation<? super KYCRepositoryImpl$getFilesUploadResult$2$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c43746rvB;
        this.$listOfFiles = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KYCRepositoryImpl$getFilesUploadResult$2$1(this.$this_runOrErrorResponse, this.$listOfFiles, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<FilesUploadResultResp>> continuation) {
        return ((KYCRepositoryImpl$getFilesUploadResult$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC43709ruR interfaceC43709ruR = this.$this_runOrErrorResponse.copydefault;
            List<SingleFileUploadResultReq> list = this.$listOfFiles;
            this.label = 1;
            obj = interfaceC43709ruR.KWHzl(list, this);
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
