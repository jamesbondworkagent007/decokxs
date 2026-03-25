package com.okinc.im.imui.contacts.viewmodel;

import com.okinc.im.imui.contacts.viewmodel.EditRelationViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class EditRelationViewModel$onSaveClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $contactId;
    final /* synthetic */ EditRelationViewModel.StateListAnimator $currentState;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EditRelationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditRelationViewModel$onSaveClicked$1(EditRelationViewModel editRelationViewModel, String str, EditRelationViewModel.StateListAnimator stateListAnimator, Continuation<? super EditRelationViewModel$onSaveClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = editRelationViewModel;
        this.$contactId = str;
        this.$currentState = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EditRelationViewModel$onSaveClicked$1 editRelationViewModel$onSaveClicked$1 = new EditRelationViewModel$onSaveClicked$1(this.this$0, this.$contactId, this.$currentState, continuation);
        editRelationViewModel$onSaveClicked$1.L$0 = obj;
        return editRelationViewModel$onSaveClicked$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EditRelationViewModel$onSaveClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        Object value;
        Object value2;
        EditRelationViewModel editRelationViewModel;
        Object value3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.AEQbTJ;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, EditRelationViewModel.StateListAnimator.copy$default((EditRelationViewModel.StateListAnimator) value2, null, null, null, true, false, null, null, 119, null)));
            editRelationViewModel = this.this$0;
            String str = this.$contactId;
            EditRelationViewModel.StateListAnimator stateListAnimator = this.$currentState;
            Result.Application application2 = Result.Companion;
            CoroutineDispatcher io2 = Dispatchers.getIO();
            EditRelationViewModel$onSaveClicked$1$2$1 editRelationViewModel$onSaveClicked$1$2$1 = new EditRelationViewModel$onSaveClicked$1$2$1(editRelationViewModel, str, stateListAnimator, null);
            this.L$0 = editRelationViewModel;
            this.label = 1;
            if (BuildersKt.withContext(io2, editRelationViewModel$onSaveClicked$1$2$1, this) == objCopydefault) {
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
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                EditRelationViewModel editRelationViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    String strCopydefault = C44157sFk.copydefault(thM7380exceptionOrNullimpl);
                    if (strCopydefault == null && (strCopydefault = thM7380exceptionOrNullimpl.getMessage()) == null) {
                        strCopydefault = "Unknown error occurred";
                    }
                    MutableStateFlow mutableStateFlow2 = editRelationViewModel2.AEQbTJ;
                    do {
                        value = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value, EditRelationViewModel.StateListAnimator.copy$default((EditRelationViewModel.StateListAnimator) value, null, null, null, false, false, null, null, 119, null)));
                    MutableSharedFlow mutableSharedFlow = editRelationViewModel2.EZpvd;
                    EditRelationViewModel.TaskDescription.ActionBar actionBar = new EditRelationViewModel.TaskDescription.ActionBar(strCopydefault);
                    this.L$0 = objM7377constructorimpl;
                    this.label = 3;
                    if (mutableSharedFlow.emit(actionBar, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            editRelationViewModel = (EditRelationViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        MutableStateFlow mutableStateFlow3 = editRelationViewModel.AEQbTJ;
        do {
            value3 = mutableStateFlow3.getValue();
        } while (!mutableStateFlow3.compareAndSet(value3, EditRelationViewModel.StateListAnimator.copy$default((EditRelationViewModel.StateListAnimator) value3, null, null, null, false, false, null, null, 119, null)));
        MutableSharedFlow mutableSharedFlow2 = editRelationViewModel.EZpvd;
        EditRelationViewModel.TaskDescription.Application application3 = EditRelationViewModel.TaskDescription.Application.EZpvd;
        this.L$0 = null;
        this.label = 2;
        if (mutableSharedFlow2.emit(application3, this) == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        EditRelationViewModel editRelationViewModel22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
