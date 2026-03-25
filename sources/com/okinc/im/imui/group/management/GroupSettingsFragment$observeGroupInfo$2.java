package com.okinc.im.imui.group.management;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C34214nVr;
import o.C37683oyU;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes16.dex */
public final class GroupSettingsFragment$observeGroupInfo$2 extends SuspendLambda implements Function2<GroupInfo, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34214nVr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupSettingsFragment$observeGroupInfo$2(C34214nVr c34214nVr, Continuation<? super GroupSettingsFragment$observeGroupInfo$2> continuation) {
        super(2, continuation);
        this.this$0 = c34214nVr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupSettingsFragment$observeGroupInfo$2 groupSettingsFragment$observeGroupInfo$2 = new GroupSettingsFragment$observeGroupInfo$2(this.this$0, continuation);
        groupSettingsFragment$observeGroupInfo$2.L$0 = obj;
        return groupSettingsFragment$observeGroupInfo$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GroupInfo groupInfo, Continuation<? super Unit> continuation) {
        return ((GroupSettingsFragment$observeGroupInfo$2) create(groupInfo, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupInfo groupInfo = (GroupInfo) this.L$0;
            this.this$0.dismissLoading();
            if (C37683oyU.AEQbTJ(groupInfo)) {
                this.this$0.gEmmrt().KWHzl(this.this$0.EZpvd(groupInfo));
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            } else {
                FragmentActivity activity = this.this$0.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
