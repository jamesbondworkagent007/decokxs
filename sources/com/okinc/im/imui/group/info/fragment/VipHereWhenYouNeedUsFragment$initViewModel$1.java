package com.okinc.im.imui.group.info.fragment;

import android.widget.LinearLayout;
import com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C34159nTp;
import o.C56391yDq;
import o.C56442yFn;
import o.nKI;
import o.yHO;

/* JADX INFO: loaded from: classes23.dex */
public final class VipHereWhenYouNeedUsFragment$initViewModel$1 extends SuspendLambda implements yHO<CoroutineScope, GroupProfileViewModel.TaskDescription, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34159nTp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipHereWhenYouNeedUsFragment$initViewModel$1(C34159nTp c34159nTp, Continuation<? super VipHereWhenYouNeedUsFragment$initViewModel$1> continuation) {
        super(3, continuation);
        this.this$0 = c34159nTp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, GroupProfileViewModel.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
        VipHereWhenYouNeedUsFragment$initViewModel$1 vipHereWhenYouNeedUsFragment$initViewModel$1 = new VipHereWhenYouNeedUsFragment$initViewModel$1(this.this$0, continuation);
        vipHereWhenYouNeedUsFragment$initViewModel$1.L$0 = taskDescription;
        return vipHereWhenYouNeedUsFragment$initViewModel$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupProfileViewModel.TaskDescription taskDescription = (GroupProfileViewModel.TaskDescription) this.L$0;
            if (!(taskDescription instanceof GroupProfileViewModel.TaskDescription.ActionBar)) {
                nKI nki = this.this$0.copydefault;
                if (nki != null && (linearLayout = nki.AEQbTJ) != null) {
                    linearLayout.setVisibility(8);
                }
            } else {
                boolean zIsConnected = ((GroupProfileViewModel.TaskDescription.ActionBar) taskDescription).OLrzqt().isConnected();
                nKI nki2 = this.this$0.copydefault;
                if (nki2 != null && (linearLayout2 = nki2.AEQbTJ) != null) {
                    linearLayout2.setVisibility(zIsConnected ? 0 : 8);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
