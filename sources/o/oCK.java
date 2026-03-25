package o;

import com.okinc.im.usecase.conversation.ObserveOrbitNotificationUseCase$invoke$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCK {
    public final tWL EZpvd;
    public final CoroutineDispatcher OLrzqt;
    public final sGI copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    @yCM
    public oCK(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull sGI sgi, tWL twl) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(sgi, "");
        this.OLrzqt = coroutineDispatcher;
        this.copydefault = sgi;
        this.EZpvd = twl;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oCK.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) {
        pUU.KWHzl("ObserveOrbitNotificationUseCase", "execute...");
        return BuildersKt.withContext(this.OLrzqt, new ObserveOrbitNotificationUseCase$invoke$2(this, null), continuation);
    }
}
