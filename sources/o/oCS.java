package o;

import com.okinc.im.usecase.dialogmodel.GetSendConfirmationDialogModelUseCase$execute$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCS {
    public final CoroutineDispatcher EZpvd;
    public final oGB KWHzl;
    public final oGI OLrzqt;
    public final oCV copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    @yCM
    public oCS(@NotNull oGI ogi, @NotNull oCV ocv, @NotNull oGB ogb, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(ogi, "");
        Intrinsics.checkNotNullParameter(ocv, "");
        Intrinsics.checkNotNullParameter(ogb, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = ogi;
        this.copydefault = ocv;
        this.KWHzl = ogb;
        this.EZpvd = coroutineDispatcher;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oCS.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super C35773oDd> continuation) {
        return BuildersKt.withContext(this.EZpvd, new GetSendConfirmationDialogModelUseCase$execute$2(this, null), continuation);
    }
}
