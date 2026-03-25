package com.okinc.im.imui.group.edit;

import com.okinc.im.imui.group.edit.EditGroupAvatarAndNameViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class EditGroupAvatarAndNameViewModel$onSaveClicked$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EditGroupAvatarAndNameViewModel.Application $currentState;
    final /* synthetic */ String $groupId;
    int label;
    final /* synthetic */ EditGroupAvatarAndNameViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditGroupAvatarAndNameViewModel$onSaveClicked$2(EditGroupAvatarAndNameViewModel editGroupAvatarAndNameViewModel, String str, EditGroupAvatarAndNameViewModel.Application application, Continuation<? super EditGroupAvatarAndNameViewModel$onSaveClicked$2> continuation) {
        super(2, continuation);
        this.this$0 = editGroupAvatarAndNameViewModel;
        this.$groupId = str;
        this.$currentState = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EditGroupAvatarAndNameViewModel$onSaveClicked$2(this.this$0, this.$groupId, this.$currentState, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EditGroupAvatarAndNameViewModel$onSaveClicked$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        EditGroupAvatarAndNameViewModel.Application application;
        String message;
        Object value2;
        Object objCopydefault;
        Object value3;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
            do {
                value = mutableStateFlow.getValue();
                application = (EditGroupAvatarAndNameViewModel.Application) value;
                message = e.getMessage();
                if (message == null) {
                    message = "Unknown error occurred";
                }
            } while (!mutableStateFlow.compareAndSet(value, EditGroupAvatarAndNameViewModel.Application.copy$default(application, false, null, null, null, null, false, null, null, null, null, false, null, message, 4094, null)));
            MutableSharedFlow mutableSharedFlow = this.this$0.OLrzqt;
            String message2 = e.getMessage();
            if (message2 == null) {
                message2 = "Unknown error";
            }
            EditGroupAvatarAndNameViewModel.Activity.C0418Activity c0418Activity = new EditGroupAvatarAndNameViewModel.Activity.C0418Activity(message2);
            this.label = 3;
            if (mutableSharedFlow.emit(c0418Activity, this) == objCopydefault2) {
                return objCopydefault2;
            }
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow2 = this.this$0.EZpvd;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, EditGroupAvatarAndNameViewModel.Application.copy$default((EditGroupAvatarAndNameViewModel.Application) value2, true, null, null, null, null, false, null, null, null, null, false, null, null, 8190, null)));
            EditGroupAvatarAndNameViewModel editGroupAvatarAndNameViewModel = this.this$0;
            String str = this.$groupId;
            EditGroupAvatarAndNameViewModel.Application application2 = this.$currentState;
            this.label = 1;
            objCopydefault = editGroupAvatarAndNameViewModel.copydefault(str, application2, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
        }
        EditGroupAvatarAndNameViewModel.SavedChangeType savedChangeType = (EditGroupAvatarAndNameViewModel.SavedChangeType) objCopydefault;
        MutableStateFlow mutableStateFlow3 = this.this$0.EZpvd;
        do {
            value3 = mutableStateFlow3.getValue();
        } while (!mutableStateFlow3.compareAndSet(value3, EditGroupAvatarAndNameViewModel.Application.copy$default((EditGroupAvatarAndNameViewModel.Application) value3, false, null, null, null, null, false, null, null, null, null, false, null, null, 8190, null)));
        MutableSharedFlow mutableSharedFlow2 = this.this$0.OLrzqt;
        EditGroupAvatarAndNameViewModel.Activity.ActionBar actionBar = new EditGroupAvatarAndNameViewModel.Activity.ActionBar(savedChangeType);
        this.label = 2;
        if (mutableSharedFlow2.emit(actionBar, this) == objCopydefault2) {
            return objCopydefault2;
        }
        return Unit.INSTANCE;
    }
}
