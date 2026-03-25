package o;

import com.okinc.im.usecase.group.members.GetMaxGroupMembersLimitUseCase$invoke$1;
import com.okinc.im.usecase.group.members.GetMaxGroupMembersLimitUseCase$invoke$count$1$groupInfo$1;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDU {
    public final oDA EZpvd;
    public final oDB KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public oDU(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull oDB odb, @NotNull oDA oda) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(odb, "");
        Intrinsics.checkNotNullParameter(oda, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = odb;
        this.EZpvd = oda;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Throwable {
        GetMaxGroupMembersLimitUseCase$invoke$1 getMaxGroupMembersLimitUseCase$invoke$1;
        java.lang.Object objM7377constructorimpl;
        GroupInfo groupInfo;
        if (continuation instanceof GetMaxGroupMembersLimitUseCase$invoke$1) {
            getMaxGroupMembersLimitUseCase$invoke$1 = (GetMaxGroupMembersLimitUseCase$invoke$1) continuation;
            int i = getMaxGroupMembersLimitUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMaxGroupMembersLimitUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getMaxGroupMembersLimitUseCase$invoke$1 = new GetMaxGroupMembersLimitUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getMaxGroupMembersLimitUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMaxGroupMembersLimitUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                Result.Application application = Result.Companion;
                CoroutineDispatcher coroutineDispatcher = this.copydefault;
                GetMaxGroupMembersLimitUseCase$invoke$count$1$groupInfo$1 getMaxGroupMembersLimitUseCase$invoke$count$1$groupInfo$1 = new GetMaxGroupMembersLimitUseCase$invoke$count$1$groupInfo$1(this, str, null);
                getMaxGroupMembersLimitUseCase$invoke$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, getMaxGroupMembersLimitUseCase$invoke$count$1$groupInfo$1, getMaxGroupMembersLimitUseCase$invoke$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            groupInfo = (GroupInfo) objWithContext;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (groupInfo != null) {
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.AEQbTJ((int) C56548yJl.copydefault(groupInfo.getMaxMemberCount(), -2147483648L, 2147483647L)));
            java.lang.Integer num = (java.lang.Integer) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            return C56443yFo.AEQbTJ(num != null ? num.intValue() : 3000);
        }
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
    }
}
