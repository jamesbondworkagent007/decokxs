package com.okinc.okex.uploadlog.viewmodel;

import com.okinc.okex.uploadlog.bean.ElementValue;
import com.okinc.okex.uploadlog.bean.TicketSubmitRequest;
import com.okinc.okex.uploadlog.bean.TicketSubmitResponse;
import com.okinc.okex.uploadlog.viewmodel.UploadLogViewModel;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C44083sCs;
import o.C44089sCy;
import o.C44760scx;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class UploadLogViewModel$submitLogs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UploadLogViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadLogViewModel$submitLogs$1(UploadLogViewModel uploadLogViewModel, Continuation<? super UploadLogViewModel$submitLogs$1> continuation) {
        super(2, continuation);
        this.this$0 = uploadLogViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UploadLogViewModel$submitLogs$1 uploadLogViewModel$submitLogs$1 = new UploadLogViewModel$submitLogs$1(this.this$0, continuation);
        uploadLogViewModel$submitLogs$1.L$0 = obj;
        return uploadLogViewModel$submitLogs$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UploadLogViewModel$submitLogs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        TicketSubmitResponse ticketSubmitResponse;
        MutableStateFlow mutableStateFlow;
        UploadLogViewModel.TaskDescription.Activity activity;
        MutableStateFlow mutableStateFlow2;
        UploadLogViewModel.TaskDescription.FragmentManager fragmentManager;
        CoroutineScope coroutineScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            MutableStateFlow mutableStateFlow3 = this.this$0.gEmmrt;
            UploadLogViewModel.TaskDescription.Activity activity2 = new UploadLogViewModel.TaskDescription.Activity(true);
            this.L$0 = coroutineScope;
            this.label = 1;
            if (mutableStateFlow3.emit(activity2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    TicketSubmitRequest ticketSubmitRequest = (TicketSubmitRequest) obj;
                    UploadLogViewModel uploadLogViewModel = this.this$0;
                    Result.Application application2 = Result.Companion;
                    C44089sCy c44089sCy = uploadLogViewModel.values;
                    this.L$0 = null;
                    this.label = 3;
                    obj = c44089sCy.EZpvd(ticketSubmitRequest, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl((TicketSubmitResponse) obj);
                    UploadLogViewModel uploadLogViewModel2 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    }
                    ticketSubmitResponse = (TicketSubmitResponse) objM7377constructorimpl;
                    mutableStateFlow = this.this$0.gEmmrt;
                    activity = new UploadLogViewModel.TaskDescription.Activity(false);
                    this.L$0 = ticketSubmitResponse;
                    this.label = 4;
                    if (mutableStateFlow.emit(activity, this) == objCopydefault) {
                    }
                    C44760scx.log$default("submitTicketResult: " + ticketSubmitResponse, null, 2, null);
                    mutableStateFlow2 = this.this$0.gEmmrt;
                    fragmentManager = new UploadLogViewModel.TaskDescription.FragmentManager(ticketSubmitResponse != null);
                    this.L$0 = null;
                    this.label = 5;
                    if (mutableStateFlow2.emit(fragmentManager, this) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    ticketSubmitResponse = (TicketSubmitResponse) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    C44760scx.log$default("submitTicketResult: " + ticketSubmitResponse, null, 2, null);
                    mutableStateFlow2 = this.this$0.gEmmrt;
                    fragmentManager = new UploadLogViewModel.TaskDescription.FragmentManager(ticketSubmitResponse != null);
                    this.L$0 = null;
                    this.label = 5;
                    if (mutableStateFlow2.emit(fragmentManager, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl((TicketSubmitResponse) obj);
                UploadLogViewModel uploadLogViewModel22 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    uploadLogViewModel22.EZpvd(thM7380exceptionOrNullimpl);
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                ticketSubmitResponse = (TicketSubmitResponse) objM7377constructorimpl;
                mutableStateFlow = this.this$0.gEmmrt;
                activity = new UploadLogViewModel.TaskDescription.Activity(false);
                this.L$0 = ticketSubmitResponse;
                this.label = 4;
                if (mutableStateFlow.emit(activity, this) == objCopydefault) {
                    return objCopydefault;
                }
                C44760scx.log$default("submitTicketResult: " + ticketSubmitResponse, null, 2, null);
                mutableStateFlow2 = this.this$0.gEmmrt;
                fragmentManager = new UploadLogViewModel.TaskDescription.FragmentManager(ticketSubmitResponse != null);
                this.L$0 = null;
                this.label = 5;
                if (mutableStateFlow2.emit(fragmentManager, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C44083sCs c44083sCs = this.this$0.AkhnZx;
        Map<String, ? extends ElementValue> map = (Map) this.this$0.OLrzqt.getValue();
        String strFetchVPNInfo = this.this$0.fetchVPNInfo();
        String strValues = this.this$0.values();
        this.L$0 = coroutineScope;
        this.label = 2;
        obj = c44083sCs.EZpvd(map, strFetchVPNInfo, strValues, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        TicketSubmitRequest ticketSubmitRequest2 = (TicketSubmitRequest) obj;
        UploadLogViewModel uploadLogViewModel3 = this.this$0;
        Result.Application application22 = Result.Companion;
        C44089sCy c44089sCy2 = uploadLogViewModel3.values;
        this.L$0 = null;
        this.label = 3;
        obj = c44089sCy2.EZpvd(ticketSubmitRequest2, this);
        if (obj == objCopydefault) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl((TicketSubmitResponse) obj);
        UploadLogViewModel uploadLogViewModel222 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
        ticketSubmitResponse = (TicketSubmitResponse) objM7377constructorimpl;
        mutableStateFlow = this.this$0.gEmmrt;
        activity = new UploadLogViewModel.TaskDescription.Activity(false);
        this.L$0 = ticketSubmitResponse;
        this.label = 4;
        if (mutableStateFlow.emit(activity, this) == objCopydefault) {
        }
        C44760scx.log$default("submitTicketResult: " + ticketSubmitResponse, null, 2, null);
        mutableStateFlow2 = this.this$0.gEmmrt;
        fragmentManager = new UploadLogViewModel.TaskDescription.FragmentManager(ticketSubmitResponse != null);
        this.L$0 = null;
        this.label = 5;
        if (mutableStateFlow2.emit(fragmentManager, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
