package o;

import com.okinc.im.usecase.dialogmodel.GetLeaveThisChatDialogModelUseCase$execute$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCT {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final oCQ AEQbTJ;
    public final oGB EZpvd;
    public final oGI OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public oCT(@NotNull oGI ogi, @NotNull oCQ ocq, @NotNull oGB ogb, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(ogi, "");
        Intrinsics.checkNotNullParameter(ocq, "");
        Intrinsics.checkNotNullParameter(ogb, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = ogi;
        this.AEQbTJ = ocq;
        this.EZpvd = ogb;
        this.copydefault = coroutineDispatcher;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oCT.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final java.lang.Object EZpvd(java.lang.String str, boolean z, @NotNull Continuation<? super C35772oDc> continuation) {
        return BuildersKt.withContext(this.copydefault, new GetLeaveThisChatDialogModelUseCase$execute$2(this, str, z, null), continuation);
    }
}
