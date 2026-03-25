package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ynk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57721ynk {
    public static final Activity Companion = new Activity(null);
    public static android.content.pm.ApplicationInfo EZpvd;

    /* JADX INFO: renamed from: o.ynk$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ynk.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.pm.ApplicationInfo KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            if (C57721ynk.EZpvd != null) {
                return C57721ynk.EZpvd;
            }
            try {
                C57721ynk.EZpvd = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                return C57721ynk.EZpvd;
            } catch (java.lang.RuntimeException e) {
                if (e.getCause() instanceof android.os.DeadSystemException) {
                    return null;
                }
                throw e;
            }
        }
    }
}
