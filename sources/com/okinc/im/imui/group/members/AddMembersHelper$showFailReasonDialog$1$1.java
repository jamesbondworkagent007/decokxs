package com.okinc.im.imui.group.members;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.view.View;
import com.okinc.im.imui.group.members.AddMembersHelper$showFailReasonDialog$1$1;
import com.okinc.okimcore.model.im.GroupActionFailReason;
import com.okinc.okimcore.model.other.GroupAddMembersResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.C33070mpX;
import o.C35399nuc;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC54939xaY;
import o.nWM;

/* JADX INFO: loaded from: classes18.dex */
public final class AddMembersHelper$showFailReasonDialog$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $confirm;
    final /* synthetic */ String $groupId;
    final /* synthetic */ GroupAddMembersResult $result;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ ViewOnClickListenerC54939xaY $this_apply;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMembersHelper$showFailReasonDialog$1$1(GroupAddMembersResult groupAddMembersResult, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, String str, Function0<Unit> function0, CoroutineScope coroutineScope, Continuation<? super AddMembersHelper$showFailReasonDialog$1$1> continuation) {
        super(2, continuation);
        this.$result = groupAddMembersResult;
        this.$this_apply = viewOnClickListenerC54939xaY;
        this.$groupId = str;
        this.$confirm = function0;
        this.$scope = coroutineScope;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddMembersHelper$showFailReasonDialog$1$1(this.$result, this.$this_apply, this.$groupId, this.$confirm, this.$scope, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddMembersHelper$showFailReasonDialog$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$result.getFailedReasons().containsKey(GroupActionFailReason.GroupEntryVerificationsRequired)) {
                i = C35399nuc.LoaderManager.dbUqJD;
            } else {
                i = this.$result.getTotalInvitees() > 1 ? C35399nuc.LoaderManager.GzAsTt : C35399nuc.LoaderManager.fsw;
            }
            this.$this_apply.setTitle(C33070mpX.AYXKKw(i));
            nWM nwm = nWM.EZpvd;
            GroupAddMembersResult groupAddMembersResult = this.$result;
            String str = this.$groupId;
            this.label = 1;
            obj = nwm.EZpvd(groupAddMembersResult, str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.$this_apply.EZpvd((SpannableString) obj);
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.$this_apply;
        String strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.getNewProxyInstance);
        final Function0<Unit> function0 = this.$confirm;
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = this.$this_apply;
        viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) strAYXKKw, new View.OnClickListener() { // from class: o.nWK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AddMembersHelper$showFailReasonDialog$1$1.invokeSuspend$lambda$0(function0, viewOnClickListenerC54939xaY2, view);
            }
        });
        this.$this_apply.setCancelable(false);
        this.$this_apply.setCanceledOnTouchOutside(false);
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY3 = this.$this_apply;
        final CoroutineScope coroutineScope = this.$scope;
        viewOnClickListenerC54939xaY3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.nWR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
            }
        });
        this.$this_apply.show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        function0.invoke();
        viewOnClickListenerC54939xaY.dismiss();
    }
}
