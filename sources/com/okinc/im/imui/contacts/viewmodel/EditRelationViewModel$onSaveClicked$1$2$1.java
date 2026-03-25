package com.okinc.im.imui.contacts.viewmodel;

import com.okinc.im.imui.contacts.viewmodel.EditRelationViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C35861oGk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class EditRelationViewModel$onSaveClicked$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $contactId;
    final /* synthetic */ EditRelationViewModel.StateListAnimator $currentState;
    int label;
    final /* synthetic */ EditRelationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditRelationViewModel$onSaveClicked$1$2$1(EditRelationViewModel editRelationViewModel, String str, EditRelationViewModel.StateListAnimator stateListAnimator, Continuation<? super EditRelationViewModel$onSaveClicked$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = editRelationViewModel;
        this.$contactId = str;
        this.$currentState = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EditRelationViewModel$onSaveClicked$1$2$1(this.this$0, this.$contactId, this.$currentState, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EditRelationViewModel$onSaveClicked$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35861oGk c35861oGk = this.this$0.valueOf;
            String str = this.$contactId;
            String str2 = this.this$0.AhwBna;
            String string = StringsKt__StringsKt.hDKMBd((CharSequence) this.$currentState.copydefault()).toString();
            this.label = 1;
            if (c35861oGk.copydefault(str, str2, string, this) == objCopydefault) {
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
