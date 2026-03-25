package com.okinc.im.usecase.group.members;

import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.oDA;
import o.oDB;
import o.oDU;

/* JADX INFO: loaded from: classes8.dex */
public final class GetMaxGroupMembersLimitUseCase$invoke$count$1$groupInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GroupInfo>, Object> {
    final /* synthetic */ String $groupId;
    final /* synthetic */ oDU $this_runCatching;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMaxGroupMembersLimitUseCase$invoke$count$1$groupInfo$1(oDU odu, String str, Continuation<? super GetMaxGroupMembersLimitUseCase$invoke$count$1$groupInfo$1> continuation) {
        super(2, continuation);
        this.$this_runCatching = odu;
        this.$groupId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetMaxGroupMembersLimitUseCase$invoke$count$1$groupInfo$1 getMaxGroupMembersLimitUseCase$invoke$count$1$groupInfo$1 = new GetMaxGroupMembersLimitUseCase$invoke$count$1$groupInfo$1(this.$this_runCatching, this.$groupId, continuation);
        getMaxGroupMembersLimitUseCase$invoke$count$1$groupInfo$1.L$0 = obj;
        return getMaxGroupMembersLimitUseCase$invoke$count$1$groupInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GroupInfo> continuation) {
        return ((GetMaxGroupMembersLimitUseCase$invoke$count$1$groupInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            oDB odb = this.$this_runCatching.KWHzl;
            String str = this.$groupId;
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = odb.AEQbTJ(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return (GroupInfo) obj;
            }
            C56391yDq.AEQbTJ(obj);
        }
        GroupInfo groupInfo = (GroupInfo) obj;
        if (groupInfo != null) {
            return groupInfo;
        }
        oDU odu = this.$this_runCatching;
        String str2 = this.$groupId;
        oDA oda = odu.EZpvd;
        this.L$0 = null;
        this.label = 2;
        obj = oda.copydefault(str2, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        return (GroupInfo) obj;
    }
}
