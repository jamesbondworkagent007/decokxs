package com.okinc.im.imui.contacts.viewmodel;

import com.okinc.im.imui.contacts.viewmodel.EditRelationViewModel;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C44157sFk;
import o.C44170sFx;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class EditRelationViewModel$loadInitialData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EditRelationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditRelationViewModel$loadInitialData$2(EditRelationViewModel editRelationViewModel, Continuation<? super EditRelationViewModel$loadInitialData$2> continuation) {
        super(2, continuation);
        this.this$0 = editRelationViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EditRelationViewModel$loadInitialData$2 editRelationViewModel$loadInitialData$2 = new EditRelationViewModel$loadInitialData$2(this.this$0, continuation);
        editRelationViewModel$loadInitialData$2.L$0 = obj;
        return editRelationViewModel$loadInitialData$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EditRelationViewModel$loadInitialData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object value;
        Object value2;
        EditRelationViewModel editRelationViewModel;
        Object objWithContext;
        Object value3;
        MutableStateFlow mutableStateFlow;
        Object value4;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow2 = this.this$0.AEQbTJ;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, EditRelationViewModel.StateListAnimator.copy$default((EditRelationViewModel.StateListAnimator) value2, null, null, null, true, false, null, null, 119, null)));
            editRelationViewModel = this.this$0;
            Result.Application application2 = Result.Companion;
            CoroutineDispatcher io2 = Dispatchers.getIO();
            EditRelationViewModel$loadInitialData$2$2$relationInfo$1 editRelationViewModel$loadInitialData$2$2$relationInfo$1 = new EditRelationViewModel$loadInitialData$2$2$relationInfo$1(editRelationViewModel, null);
            this.L$0 = editRelationViewModel;
            this.label = 1;
            objWithContext = BuildersKt.withContext(io2, editRelationViewModel$loadInitialData$2$2$relationInfo$1, this);
            if (objWithContext == objCopydefault) {
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
                editRelationViewModel = (EditRelationViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableStateFlow = editRelationViewModel.AEQbTJ;
                do {
                    value4 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value4, EditRelationViewModel.StateListAnimator.copy$default((EditRelationViewModel.StateListAnimator) value4, null, null, null, false, false, null, null, 119, null)));
                return Unit.INSTANCE;
            }
            editRelationViewModel = (EditRelationViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objWithContext = obj;
        }
        RelationInfo relationInfo = (RelationInfo) objWithContext;
        if (relationInfo == null) {
            MutableSharedFlow mutableSharedFlow = editRelationViewModel.EZpvd;
            EditRelationViewModel.TaskDescription.C0403TaskDescription c0403TaskDescription = new EditRelationViewModel.TaskDescription.C0403TaskDescription("Contact not found");
            this.L$0 = editRelationViewModel;
            this.label = 2;
            if (mutableSharedFlow.emit(c0403TaskDescription, this) == objCopydefault) {
                return objCopydefault;
            }
            mutableStateFlow = editRelationViewModel.AEQbTJ;
            do {
                value4 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value4, EditRelationViewModel.StateListAnimator.copy$default((EditRelationViewModel.StateListAnimator) value4, null, null, null, false, false, null, null, 119, null)));
            return Unit.INSTANCE;
        }
        String strCopydefault = C44170sFx.copydefault(relationInfo);
        String displayName$default = C44157sFk.getDisplayName$default(relationInfo, null, 1, null);
        String str = !Intrinsics.EZpvd((Object) strCopydefault, (Object) displayName$default) ? displayName$default : "";
        MutableStateFlow mutableStateFlow3 = editRelationViewModel.AEQbTJ;
        do {
            value3 = mutableStateFlow3.getValue();
        } while (!mutableStateFlow3.compareAndSet(value3, EditRelationViewModel.StateListAnimator.copy$default((EditRelationViewModel.StateListAnimator) value3, str, displayName$default, strCopydefault, false, false, null, null, 96, null)));
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        EditRelationViewModel editRelationViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            MutableStateFlow mutableStateFlow4 = editRelationViewModel2.AEQbTJ;
            do {
                value = mutableStateFlow4.getValue();
            } while (!mutableStateFlow4.compareAndSet(value, EditRelationViewModel.StateListAnimator.copy$default((EditRelationViewModel.StateListAnimator) value, null, null, null, false, false, null, null, 119, null)));
            MutableSharedFlow mutableSharedFlow2 = editRelationViewModel2.EZpvd;
            String message = thM7380exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "Failed to load contact";
            }
            EditRelationViewModel.TaskDescription.C0403TaskDescription c0403TaskDescription2 = new EditRelationViewModel.TaskDescription.C0403TaskDescription(message);
            this.L$0 = objM7377constructorimpl;
            this.label = 3;
            if (mutableSharedFlow2.emit(c0403TaskDescription2, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
