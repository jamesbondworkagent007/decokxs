package com.okinc.okex.uploadlog.viewmodel;

import com.okinc.okex.uploadlog.bean.enums.FormValueType;
import com.okinc.okex.uploadlog.view.displaymodels.FormElementDisplayModel;
import com.okinc.okex.uploadlog.view.displaymodels.FormElementViewType;
import com.okinc.okex.uploadlog.viewmodel.UploadLogViewModel;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C33070mpX;
import o.C44085sCu;
import o.C44760scx;
import o.C47315tni;
import o.C56391yDq;
import o.C56442yFn;
import o.sCT;

/* JADX INFO: loaded from: classes10.dex */
public final class UploadLogViewModel$getFormConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $formId;
    final /* synthetic */ String $logFileFieldId;
    final /* synthetic */ String $logStatusFieldId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UploadLogViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadLogViewModel$getFormConfig$1(UploadLogViewModel uploadLogViewModel, String str, String str2, String str3, Continuation<? super UploadLogViewModel$getFormConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = uploadLogViewModel;
        this.$formId = str;
        this.$logFileFieldId = str2;
        this.$logStatusFieldId = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UploadLogViewModel$getFormConfig$1 uploadLogViewModel$getFormConfig$1 = new UploadLogViewModel$getFormConfig$1(this.this$0, this.$formId, this.$logFileFieldId, this.$logStatusFieldId, continuation);
        uploadLogViewModel$getFormConfig$1.L$0 = obj;
        return uploadLogViewModel$getFormConfig$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UploadLogViewModel$getFormConfig$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0151 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        UploadLogViewModel.TaskDescription stateListAnimator;
        MutableStateFlow mutableStateFlow;
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            MutableStateFlow mutableStateFlow2 = this.this$0.gEmmrt;
            UploadLogViewModel.TaskDescription.ActionBar actionBar = UploadLogViewModel.TaskDescription.ActionBar.OLrzqt;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (mutableStateFlow2.emit(actionBar, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl((sCT) obj);
                UploadLogViewModel uploadLogViewModel = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    sCT sct = (sCT) objM7377constructorimpl;
                    uploadLogViewModel.isConnected.set("CURRENT_FORM_ELEMENTS", sct.AEQbTJ());
                    Iterator<T> it = sct.AEQbTJ().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((FormElementDisplayModel) next).djBIcL().getApiValueType() == FormValueType.Attachment) {
                            break;
                        }
                    }
                    FormElementDisplayModel formElementDisplayModel = (FormElementDisplayModel) next;
                    if (formElementDisplayModel != null) {
                        uploadLogViewModel.isConnected.set("FIELD_ID_ATTACHMENTS", formElementDisplayModel.KWHzl());
                    }
                    Iterable iterable = (Iterable) uploadLogViewModel.AhwBna.getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it2 = iterable.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (((FormElementDisplayModel) it2.next()).djBIcL() == FormElementViewType.Hidden) {
                                C44760scx.log$default(UploadLogViewModel.Companion.copydefault() + " getFormConfig: There are required fields that are hidden. App update required.", null, 2, null);
                                uploadLogViewModel.EZpvd(new IllegalArgumentException(C33070mpX.AYXKKw(C47315tni.PendingIntent.alsFma)));
                                break;
                            }
                        }
                    }
                    stateListAnimator = new UploadLogViewModel.TaskDescription.Application(sct);
                } else {
                    stateListAnimator = new UploadLogViewModel.TaskDescription.StateListAnimator(thM7380exceptionOrNullimpl);
                }
                mutableStateFlow = this.this$0.gEmmrt;
                this.L$0 = null;
                this.label = 3;
                if (mutableStateFlow.emit(stateListAnimator, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.isConnected.set("FORM_ID", this.$formId);
        this.this$0.isConnected.set("FIELD_ID_LOGFILE", this.$logFileFieldId);
        this.this$0.isConnected.set("FIELD_ID_LOGFILE_STATUS", this.$logStatusFieldId);
        UploadLogViewModel uploadLogViewModel2 = this.this$0;
        String str = this.$formId;
        Result.Application application2 = Result.Companion;
        C44085sCu c44085sCu = uploadLogViewModel2.fetchVPNInfo;
        this.L$0 = null;
        this.label = 2;
        obj = c44085sCu.copydefault(str, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((sCT) obj);
        UploadLogViewModel uploadLogViewModel3 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        mutableStateFlow = this.this$0.gEmmrt;
        this.L$0 = null;
        this.label = 3;
        if (mutableStateFlow.emit(stateListAnimator, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
