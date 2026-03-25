package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class rYS {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final android.app.NotificationManager AEQbTJ;

    @yCM
    public rYS(@NotNull android.app.NotificationManager notificationManager) {
        Intrinsics.checkNotNullParameter(notificationManager, "");
        this.AEQbTJ = notificationManager;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rYS.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void AEQbTJ(int i) {
        try {
            pUU.KWHzl("ClearSystemNotificationByIdUseCase", "Clearing system notification with ID: " + i);
            this.AEQbTJ.cancel(i);
        } catch (java.lang.Exception e) {
            pUU.copydefault("ClearSystemNotificationByIdUseCase", "Error clearing notification with ID " + i + ": " + e.getMessage());
        }
    }
}
