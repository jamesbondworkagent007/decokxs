package com.okinc.auth.impl.passkey.ui.resetremove.selection;

import androidx.lifecycle.MutableLiveData;
import com.okinc.auth.impl.passkey.model.AuthenticatorSelectModel;
import com.okinc.auth.impl.passkey.model.GetAuthenticatorListResponse;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC32955mnO;
import o.C33492mxV;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes3.dex */
public final class BatchResetRemovePasskeyViewModel$refreshAuthenticatorList$2 extends SuspendLambda implements Function2<AbstractC32955mnO<GetAuthenticatorListResponse>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BatchResetRemovePasskeyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchResetRemovePasskeyViewModel$refreshAuthenticatorList$2(BatchResetRemovePasskeyViewModel batchResetRemovePasskeyViewModel, Continuation<? super BatchResetRemovePasskeyViewModel$refreshAuthenticatorList$2> continuation) {
        super(2, continuation);
        this.this$0 = batchResetRemovePasskeyViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BatchResetRemovePasskeyViewModel$refreshAuthenticatorList$2 batchResetRemovePasskeyViewModel$refreshAuthenticatorList$2 = new BatchResetRemovePasskeyViewModel$refreshAuthenticatorList$2(this.this$0, continuation);
        batchResetRemovePasskeyViewModel$refreshAuthenticatorList$2.L$0 = obj;
        return batchResetRemovePasskeyViewModel$refreshAuthenticatorList$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC32955mnO<GetAuthenticatorListResponse> abstractC32955mnO, Continuation<? super Unit> continuation) {
        return ((BatchResetRemovePasskeyViewModel$refreshAuthenticatorList$2) create(abstractC32955mnO, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v10, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC32955mnO abstractC32955mnO = (AbstractC32955mnO) this.L$0;
            if (!(abstractC32955mnO instanceof AbstractC32955mnO.TaskDescription)) {
                if (abstractC32955mnO instanceof AbstractC32955mnO.ActionBar) {
                    MutableLiveData mutableLiveData = this.this$0.OLrzqt;
                    GetAuthenticatorListResponse getAuthenticatorListResponse = (GetAuthenticatorListResponse) ((AbstractC32955mnO.ActionBar) abstractC32955mnO).AEQbTJ();
                    List<AuthenticatorSelectModel> selectionList = getAuthenticatorListResponse != null ? getAuthenticatorListResponse.toSelectionList(C33492mxV.OLrzqt()) : null;
                    if (selectionList == null) {
                        selectionList = yDY.AhwBna();
                    }
                    mutableLiveData.setValue(selectionList);
                } else if (abstractC32955mnO instanceof AbstractC32955mnO.Activity) {
                    MutableSharedFlow mutableSharedFlow = this.this$0.EZpvd;
                    String strOLrzqt = ((AbstractC32955mnO.Activity) abstractC32955mnO).OLrzqt();
                    if (strOLrzqt == null) {
                        strOLrzqt = "";
                    }
                    this.label = 1;
                    if (mutableSharedFlow.emit(strOLrzqt, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
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
