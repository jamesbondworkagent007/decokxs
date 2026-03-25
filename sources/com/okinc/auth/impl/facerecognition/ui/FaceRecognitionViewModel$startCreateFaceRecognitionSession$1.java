package com.okinc.auth.impl.facerecognition.ui;

import com.okinc.auth.api.facerecognition.FacialRecognitionRequest;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC5688aBG;
import o.C32989mnw;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5729aBv;
import o.C8206ayP;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class FaceRecognitionViewModel$startCreateFaceRecognitionSession$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ FaceRecognitionViewModel this$0;

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FacialRecognitionRequest.BusinessId.values().length];
            try {
                iArr[FacialRecognitionRequest.BusinessId.NEW_DEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FacialRecognitionRequest.BusinessId.CHANGE_MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FacialRecognitionRequest.BusinessId.FORGET_PASSWORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FacialRecognitionRequest.BusinessId.REBIND_2FA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FacialRecognitionRequest.BusinessId.NON_AUTH_REBIND_2FA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FacialRecognitionRequest.BusinessId.SELF_UNFREEZE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceRecognitionViewModel$startCreateFaceRecognitionSession$1(FaceRecognitionViewModel faceRecognitionViewModel, Continuation<? super FaceRecognitionViewModel$startCreateFaceRecognitionSession$1> continuation) {
        super(2, continuation);
        this.this$0 = faceRecognitionViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FaceRecognitionViewModel$startCreateFaceRecognitionSession$1 faceRecognitionViewModel$startCreateFaceRecognitionSession$1 = new FaceRecognitionViewModel$startCreateFaceRecognitionSession$1(this.this$0, continuation);
        faceRecognitionViewModel$startCreateFaceRecognitionSession$1.L$0 = obj;
        return faceRecognitionViewModel$startCreateFaceRecognitionSession$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FaceRecognitionViewModel$startCreateFaceRecognitionSession$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[Catch: Exception -> 0x0037, TRY_ENTER, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:24:0x0077, B:27:0x008f, B:31:0x00b6, B:32:0x00bb, B:34:0x00bf, B:36:0x00d0, B:38:0x00d6, B:39:0x00dd, B:41:0x00e1, B:43:0x0107, B:47:0x0115, B:61:0x0140, B:62:0x014b, B:63:0x015c, B:64:0x0161), top: B:79:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:24:0x0077, B:27:0x008f, B:31:0x00b6, B:32:0x00bb, B:34:0x00bf, B:36:0x00d0, B:38:0x00d6, B:39:0x00dd, B:41:0x00e1, B:43:0x0107, B:47:0x0115, B:61:0x0140, B:62:0x014b, B:63:0x015c, B:64:0x0161), top: B:79:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0194  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        FacialRecognitionRequest facialRecognitionRequest;
        FaceRecognitionViewModel faceRecognitionViewModel;
        FaceRecognitionViewModel faceRecognitionViewModel2;
        String message;
        AbstractC5688aBG taskDescription;
        C5729aBv.Activity activity;
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            facialRecognitionRequest = this.this$0.djBIcL;
            if (facialRecognitionRequest != null) {
                faceRecognitionViewModel = this.this$0;
                pUU.KWHzl("FaceRecognitionViewModel", "startCreateFaceRecognitionSession");
                faceRecognitionViewModel.copydefault.setValue(new C32989mnw(C56443yFo.KWHzl(true)));
                try {
                    C5729aBv c5729aBv = faceRecognitionViewModel.AEQbTJ;
                    this.L$0 = coroutineScope;
                    this.L$1 = faceRecognitionViewModel;
                    this.L$2 = facialRecognitionRequest;
                    this.label = 1;
                    Object objAEQbTJ = c5729aBv.AEQbTJ(facialRecognitionRequest, this);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    faceRecognitionViewModel2 = faceRecognitionViewModel;
                    obj = objAEQbTJ;
                    activity = (C5729aBv.Activity) obj;
                    faceRecognitionViewModel2.copydefault.setValue(new C32989mnw(C56443yFo.KWHzl(false)));
                    String str2 = "";
                    if (!(activity instanceof C5729aBv.Activity.Application)) {
                    }
                } catch (Exception e) {
                    e = e;
                    faceRecognitionViewModel.copydefault.setValue(new C32989mnw(C56443yFo.KWHzl(false)));
                    pUU.copydefault("FaceRecognitionViewModel", "startCreateFaceRecognitionSession error: " + e.getMessage());
                    message = e.getMessage();
                    if (message == null) {
                    }
                    faceRecognitionViewModel2 = faceRecognitionViewModel;
                    taskDescription = new AbstractC5688aBG.TaskDescription(message);
                }
            } else {
                FaceRecognitionViewModel faceRecognitionViewModel3 = this.this$0;
                pUU.copydefault("FaceRecognitionViewModel", "request is null");
                MutableSharedFlow mutableSharedFlow = faceRecognitionViewModel3.OLrzqt;
                AbstractC5688aBG.TaskDescription taskDescription2 = new AbstractC5688aBG.TaskDescription(faceRecognitionViewModel3.DbNXlk(C8206ayP.Dialog.DPHNDa));
                this.L$0 = null;
                this.label = 3;
                if (mutableSharedFlow.emit(taskDescription2, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        } else if (i == 1) {
            facialRecognitionRequest = (FacialRecognitionRequest) this.L$2;
            faceRecognitionViewModel2 = (FaceRecognitionViewModel) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                activity = (C5729aBv.Activity) obj;
                faceRecognitionViewModel2.copydefault.setValue(new C32989mnw(C56443yFo.KWHzl(false)));
                String str22 = "";
                if (!(activity instanceof C5729aBv.Activity.Application)) {
                    pUU.KWHzl("FaceRecognitionViewModel", "Failure: " + ((C5729aBv.Activity.Application) activity).copydefault());
                    String strCopydefault = ((C5729aBv.Activity.Application) activity).copydefault();
                    if (strCopydefault != null) {
                        str22 = strCopydefault;
                    }
                    taskDescription = new AbstractC5688aBG.TaskDescription(str22);
                } else if (activity instanceof C5729aBv.Activity.StateListAnimator) {
                    pUU.KWHzl("FaceRecognitionViewModel", "ReachMaximumRetry");
                    Integer numAEQbTJ = ((C5729aBv.Activity.StateListAnimator) activity).KWHzl().AEQbTJ();
                    taskDescription = new AbstractC5688aBG.Application(numAEQbTJ != null ? numAEQbTJ.intValue() : 0);
                } else {
                    if (!(activity instanceof C5729aBv.Activity.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pUU.KWHzl("FacialRecognitionViewModel", "Success");
                    faceRecognitionViewModel2.KWHzl.setValue(((C5729aBv.Activity.ActionBar) activity).OLrzqt());
                    if (C33129mqd.OLrzqt((CharSequence) ((C5729aBv.Activity.ActionBar) activity).OLrzqt().OLrzqt())) {
                        String strOLrzqt = ((C5729aBv.Activity.ActionBar) activity).OLrzqt().OLrzqt();
                        if (strOLrzqt != null) {
                            str22 = strOLrzqt;
                        }
                        int i2 = Activity.KWHzl[faceRecognitionViewModel2.djBIcL.copydefault().ordinal()];
                        if (i2 == 2) {
                            str = "change_phone";
                        } else if (i2 == 3) {
                            str = "reset_password";
                        } else if (i2 == 4 || i2 == 5) {
                            str = "reset_2fa";
                        } else if (i2 == 6) {
                            str = "self_unfreeze";
                        } else {
                            str = "new_device_login";
                        }
                        taskDescription = new AbstractC5688aBG.ActionBar(str22, str, facialRecognitionRequest.OLrzqt());
                    } else {
                        pUU.copydefault("FaceRecognitionViewModel", "sessionId is null");
                        taskDescription = new AbstractC5688aBG.TaskDescription(faceRecognitionViewModel2.DbNXlk(C8206ayP.Dialog.DPHNDa));
                    }
                }
            } catch (Exception e2) {
                e = e2;
                faceRecognitionViewModel = faceRecognitionViewModel2;
                faceRecognitionViewModel.copydefault.setValue(new C32989mnw(C56443yFo.KWHzl(false)));
                pUU.copydefault("FaceRecognitionViewModel", "startCreateFaceRecognitionSession error: " + e.getMessage());
                message = e.getMessage();
                if (message == null) {
                    message = faceRecognitionViewModel.DbNXlk(C8206ayP.Dialog.DPHNDa);
                }
                faceRecognitionViewModel2 = faceRecognitionViewModel;
                taskDescription = new AbstractC5688aBG.TaskDescription(message);
            }
        } else {
            if (i == 2) {
            } else if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
        MutableSharedFlow mutableSharedFlow2 = faceRecognitionViewModel2.OLrzqt;
        this.L$0 = coroutineScope;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        if (mutableSharedFlow2.emit(taskDescription, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
