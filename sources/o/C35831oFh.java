package o;

import com.okinc.im.usecase.notification.FetchNotificationConversationUseCase$execute$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oFh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35831oFh {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final rXQ KWHzl;
    public final sGI OLrzqt;

    @yCM
    public C35831oFh(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull rXQ rxq, @NotNull sGI sgi) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(rxq, "");
        Intrinsics.checkNotNullParameter(sgi, "");
        this.AEQbTJ = coroutineDispatcher;
        this.KWHzl = rxq;
        this.OLrzqt = sgi;
    }

    /* JADX INFO: renamed from: o.oFh$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFh.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.List<rXL> list, @NotNull Continuation<? super Unit> continuation) {
        pUU.KWHzl("FetchNotificationConversationUseCase", "execute...");
        java.lang.Object objWithContext = BuildersKt.withContext(this.AEQbTJ, new FetchNotificationConversationUseCase$execute$2(list, this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
