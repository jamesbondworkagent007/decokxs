package com.okinc.okimcore.feature.cache.groupMember;

import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.sFS;

/* JADX INFO: loaded from: classes10.dex */
public final class GroupMemberCacheImpl$getMember$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GroupMemberInfo>, Object> {
    final /* synthetic */ String $groupId;
    final /* synthetic */ String $memberId;
    int label;
    final /* synthetic */ sFS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupMemberCacheImpl$getMember$1(sFS sfs, String str, String str2, Continuation<? super GroupMemberCacheImpl$getMember$1> continuation) {
        super(2, continuation);
        this.this$0 = sfs;
        this.$groupId = str;
        this.$memberId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupMemberCacheImpl$getMember$1(this.this$0, this.$groupId, this.$memberId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GroupMemberInfo> continuation) {
        return ((GroupMemberCacheImpl$getMember$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sFS sfs = this.this$0;
            String strAEQbTJ = sfs.AEQbTJ(this.$groupId, this.$memberId);
            this.label = 1;
            obj = sfs.KWHzl(strAEQbTJ, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
