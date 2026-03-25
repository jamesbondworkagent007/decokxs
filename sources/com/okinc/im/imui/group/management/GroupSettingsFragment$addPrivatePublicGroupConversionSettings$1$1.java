package com.okinc.im.imui.group.management;

import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C34214nVr;
import o.C37683oyU;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class GroupSettingsFragment$addPrivatePublicGroupConversionSettings$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GroupInfo $groupInfo;
    int label;
    final /* synthetic */ C34214nVr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupSettingsFragment$addPrivatePublicGroupConversionSettings$1$1(C34214nVr c34214nVr, GroupInfo groupInfo, Continuation<? super GroupSettingsFragment$addPrivatePublicGroupConversionSettings$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c34214nVr;
        this.$groupInfo = groupInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupSettingsFragment$addPrivatePublicGroupConversionSettings$1$1(this.this$0, this.$groupInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupSettingsFragment$addPrivatePublicGroupConversionSettings$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C34214nVr c34214nVr = this.this$0;
            String groupId = this.$groupInfo.getGroupId();
            this.label = 1;
            obj = c34214nVr.copydefault(groupId, (Continuation<? super String>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (C37683oyU.copydefault((String) obj)) {
            this.this$0.OLrzqt(this.$groupInfo.getGroupId());
        } else {
            this.this$0.copydefault(this.$groupInfo.getGroupId());
        }
        return Unit.INSTANCE;
    }
}
