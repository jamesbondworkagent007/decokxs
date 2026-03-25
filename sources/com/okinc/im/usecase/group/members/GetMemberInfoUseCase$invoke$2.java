package com.okinc.im.usecase.group.members;

import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.oDT;

/* JADX INFO: loaded from: classes8.dex */
public final class GetMemberInfoUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GroupMemberInfo>, Object> {
    final /* synthetic */ String $groupId;
    final /* synthetic */ String $memberId;
    final /* synthetic */ boolean $skipCache;
    int label;
    final /* synthetic */ oDT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMemberInfoUseCase$invoke$2(String str, boolean z, oDT odt, String str2, Continuation<? super GetMemberInfoUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$memberId = str;
        this.$skipCache = z;
        this.this$0 = odt;
        this.$groupId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetMemberInfoUseCase$invoke$2(this.$memberId, this.$skipCache, this.this$0, this.$groupId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GroupMemberInfo> continuation) {
        return ((GetMemberInfoUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                return (GroupMemberInfo) obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return (GroupMemberInfo) obj;
        }
        C56391yDq.AEQbTJ(obj);
        String str = this.$memberId;
        if (str == null) {
            return null;
        }
        if (this.$skipCache) {
            oDT odt = this.this$0;
            String str2 = this.$groupId;
            this.label = 1;
            obj = odt.EZpvd(str2, str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            return (GroupMemberInfo) obj;
        }
        GroupMemberInfo groupMemberInfoOLrzqt = this.this$0.KWHzl.OLrzqt(this.$groupId, this.$memberId);
        if (groupMemberInfoOLrzqt != null) {
            return groupMemberInfoOLrzqt;
        }
        oDT odt2 = this.this$0;
        String str3 = this.$groupId;
        String str4 = this.$memberId;
        this.label = 2;
        obj = odt2.EZpvd(str3, str4, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        return (GroupMemberInfo) obj;
    }
}
