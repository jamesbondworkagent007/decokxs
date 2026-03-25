package com.okinc.im.imui.group.info;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import com.okinc.im.imui.group.info.GroupProfileActivityV2$onActivityResult$1;
import com.okinc.okimcore.model.other.GroupAddMembersResult;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44157sFk;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.nSR;
import o.nWM;

/* JADX INFO: loaded from: classes16.dex */
public final class GroupProfileActivityV2$onActivityResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Intent $data;
    final /* synthetic */ GroupInfo $groupInfo;
    int label;
    final /* synthetic */ nSR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupProfileActivityV2$onActivityResult$1(GroupInfo groupInfo, Intent intent, nSR nsr, Continuation<? super GroupProfileActivityV2$onActivityResult$1> continuation) {
        super(2, continuation);
        this.$groupInfo = groupInfo;
        this.$data = intent;
        this.this$0 = nsr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupProfileActivityV2$onActivityResult$1(this.$groupInfo, this.$data, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupProfileActivityV2$onActivityResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            nWM nwm = nWM.EZpvd;
            final GroupInfo groupInfo = this.$groupInfo;
            Intent intent = this.$data;
            final nSR nsr = this.this$0;
            Function0<Unit> function0 = new Function0() { // from class: o.nSW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return GroupProfileActivityV2$onActivityResult$1.invokeSuspend$lambda$0(nsr, groupInfo);
                }
            };
            final nSR nsr2 = this.this$0;
            final GroupInfo groupInfo2 = this.$groupInfo;
            Function1<? super GroupAddMembersResult, Unit> function1 = new Function1() { // from class: o.nSZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return GroupProfileActivityV2$onActivityResult$1.invokeSuspend$lambda$2(nsr2, groupInfo2, (GroupAddMembersResult) obj2);
                }
            };
            Function1<? super Throwable, Unit> function12 = new Function1() { // from class: o.nTa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return GroupProfileActivityV2$onActivityResult$1.invokeSuspend$lambda$3((java.lang.Throwable) obj2);
                }
            };
            this.label = 1;
            if (nwm.OLrzqt(groupInfo, intent, function0, function1, function12, this) == objCopydefault) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(nSR nsr, GroupInfo groupInfo) {
        nWM.EZpvd.OLrzqt(nsr, groupInfo, groupInfo.getName());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(final nSR nsr, final GroupInfo groupInfo, GroupAddMembersResult groupAddMembersResult) {
        nWM.EZpvd.copydefault(nsr, groupAddMembersResult, groupInfo.getGroupId(), new Function0() { // from class: o.nTe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return GroupProfileActivityV2$onActivityResult$1.invokeSuspend$lambda$2$lambda$1(nsr, groupInfo);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$1(nSR nsr, GroupInfo groupInfo) {
        nWM.EZpvd.OLrzqt(nsr, groupInfo, groupInfo.getName());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(Throwable th) {
        String strCopydefault = C44157sFk.copydefault(th);
        if (strCopydefault != null) {
            C55326xho.toast$default(strCopydefault, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
