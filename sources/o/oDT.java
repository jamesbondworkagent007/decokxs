package o;

import com.okinc.im.usecase.group.members.GetMemberInfoUseCase$getRemoteMemberInfo$1;
import com.okinc.im.usecase.group.members.GetMemberInfoUseCase$invoke$2;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDT {
    public final CoroutineDispatcher EZpvd;
    public final sIR KWHzl;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    @yCM
    public oDT(@NotNull sIR sir, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = sir;
        this.EZpvd = coroutineDispatcher;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oDT.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static /* synthetic */ java.lang.Object invoke$default(oDT odt, java.lang.String str, java.lang.String str2, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return odt.AEQbTJ(str, str2, z, continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, boolean z, @NotNull Continuation<? super GroupMemberInfo> continuation) {
        return BuildersKt.withContext(this.EZpvd, new GetMemberInfoUseCase$invoke$2(str2, z, this, str, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.lang.String str, java.lang.String str2, Continuation<? super GroupMemberInfo> continuation) throws java.lang.Throwable {
        GetMemberInfoUseCase$getRemoteMemberInfo$1 getMemberInfoUseCase$getRemoteMemberInfo$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof GetMemberInfoUseCase$getRemoteMemberInfo$1) {
            getMemberInfoUseCase$getRemoteMemberInfo$1 = (GetMemberInfoUseCase$getRemoteMemberInfo$1) continuation;
            int i = getMemberInfoUseCase$getRemoteMemberInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMemberInfoUseCase$getRemoteMemberInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                getMemberInfoUseCase$getRemoteMemberInfo$1 = new GetMemberInfoUseCase$getRemoteMemberInfo$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = getMemberInfoUseCase$getRemoteMemberInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMemberInfoUseCase$getRemoteMemberInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                Result.Application application = Result.Companion;
                sIR sir = this.KWHzl;
                getMemberInfoUseCase$getRemoteMemberInfo$1.L$0 = str;
                getMemberInfoUseCase$getRemoteMemberInfo$1.L$1 = str2;
                getMemberInfoUseCase$getRemoteMemberInfo$1.label = 1;
                objOLrzqt = sir.OLrzqt(str, str2, getMemberInfoUseCase$getRemoteMemberInfo$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (java.lang.String) getMemberInfoUseCase$getRemoteMemberInfo$1.L$1;
                str = (java.lang.String) getMemberInfoUseCase$getRemoteMemberInfo$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((GroupMemberInfo) objOLrzqt);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("GetMemberInfoUseCase", "Error fetching remote member info for group: " + str + ", member: " + str2, thM7380exceptionOrNullimpl);
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }
}
