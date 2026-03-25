package com.okinc.im.usecase.group.members;

import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.GroupRole;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oDP;

/* JADX INFO: loaded from: classes8.dex */
public final class CheckManageGroupMemberUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $groupId;
    final /* synthetic */ String $targetMemberId;
    int label;
    final /* synthetic */ oDP this$0;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[GroupRole.values().length];
            try {
                iArr[GroupRole.Owner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupRole.Administrator.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckManageGroupMemberUseCase$invoke$2(oDP odp, String str, String str2, Continuation<? super CheckManageGroupMemberUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = odp;
        this.$groupId = str;
        this.$targetMemberId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheckManageGroupMemberUseCase$invoke$2(this.this$0, this.$groupId, this.$targetMemberId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((CheckManageGroupMemberUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String strKWHzl = C44157sFk.KWHzl();
            boolean z = false;
            if (strKWHzl == null) {
                return C56443yFo.KWHzl(false);
            }
            GroupMemberInfo groupMemberInfoOLrzqt = this.this$0.EZpvd.OLrzqt(this.$groupId, strKWHzl);
            if (groupMemberInfoOLrzqt != null) {
                GroupMemberInfo groupMemberInfoOLrzqt2 = this.this$0.EZpvd.OLrzqt(this.$groupId, this.$targetMemberId);
                if (groupMemberInfoOLrzqt2 == null) {
                    return C56443yFo.KWHzl(false);
                }
                int i = Activity.EZpvd[groupMemberInfoOLrzqt.getRole().ordinal()];
                if (i == 1 || (i == 2 && groupMemberInfoOLrzqt.getRole().getCode() < groupMemberInfoOLrzqt2.getRole().getCode())) {
                    z = true;
                }
                return C56443yFo.KWHzl(z);
            }
            return C56443yFo.KWHzl(false);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
