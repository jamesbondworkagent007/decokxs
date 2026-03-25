package com.okinc.im.usecase.file;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.sIS;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class DownloadMediaToExternalStorageUseCase$invoke$3 extends SuspendLambda implements yHO<FlowCollector<? super sIS>, Throwable, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DownloadMediaToExternalStorageUseCase$invoke$3(Continuation<? super DownloadMediaToExternalStorageUseCase$invoke$3> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super sIS> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        DownloadMediaToExternalStorageUseCase$invoke$3 downloadMediaToExternalStorageUseCase$invoke$3 = new DownloadMediaToExternalStorageUseCase$invoke$3(continuation);
        downloadMediaToExternalStorageUseCase$invoke$3.L$0 = flowCollector;
        downloadMediaToExternalStorageUseCase$invoke$3.L$1 = th;
        return downloadMediaToExternalStorageUseCase$invoke$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            sIS.Application application = new sIS.Application(new Exception((Throwable) this.L$1));
            this.L$0 = null;
            this.label = 1;
            if (flowCollector.emit(application, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
