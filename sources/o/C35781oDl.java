package o;

import com.okinc.im.usecase.group.ObserveGroupSystemMsgEventsUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oDl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35781oDl {
    public final sKH AEQbTJ;
    public final CoroutineDispatcher EZpvd;

    @yCM
    public C35781oDl(@NotNull sKH skh, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(skh, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = skh;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.oDl$TaskDescription */
    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oDl.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.oDl$TaskDescription$Application */
        public static final class Application extends TaskDescription {
            public static final Application OLrzqt = new Application();

            private Application() {
                super(null);
            }
        }

        private TaskDescription() {
        }

        /* JADX INFO: renamed from: o.oDl$TaskDescription$ActionBar */
        public static final class ActionBar extends TaskDescription {
            public static final ActionBar KWHzl = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }
    }

    public final java.lang.Object OLrzqt(long j, @NotNull Continuation<? super Flow<? extends TaskDescription>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new ObserveGroupSystemMsgEventsUseCase$invoke$2(this, j, null), continuation);
    }
}
