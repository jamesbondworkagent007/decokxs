package o;

import com.okinc.im.usecase.group.members.GetGroupMemberInfoListUseCase$execute$2;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDO {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final sIR KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public oDO(@NotNull sIR sir, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = sir;
        this.copydefault = coroutineDispatcher;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oDO.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<GroupMemberInfo>> continuation) {
        return BuildersKt.withContext(this.copydefault, new GetGroupMemberInfoListUseCase$execute$2(this, str, null), continuation);
    }
}
