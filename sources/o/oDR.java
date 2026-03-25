package o;

import com.okinc.im.usecase.group.members.AddMembersUseCase$execute$2;
import com.okinc.okimcore.model.other.GroupAddMembersResult;
import com.okinc.okimcore.model.remote.GroupScenarioType;
import com.okinc.okimcore.model.remote.GroupServiceType;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDR {
    public final CoroutineDispatcher EZpvd;
    public final sIR OLrzqt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    @yCM
    public oDR(@NotNull sIR sir, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = sir;
        this.EZpvd = coroutineDispatcher;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oDR.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final java.lang.Object OLrzqt(java.lang.String str, @NotNull GroupServiceType groupServiceType, @NotNull GroupScenarioType groupScenarioType, java.util.List<java.lang.String> list, java.lang.Boolean bool, @NotNull Continuation<? super GroupAddMembersResult> continuation) {
        return BuildersKt.withContext(this.EZpvd, new AddMembersUseCase$execute$2(str, list, bool, groupServiceType, groupScenarioType, this, null), continuation);
    }
}
