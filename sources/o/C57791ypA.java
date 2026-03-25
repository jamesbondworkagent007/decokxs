package o;

import android.content.pm.PackageManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ypA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57791ypA {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.ypA$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ypA.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C57733ynw EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            try {
                return new C57733ynw(true, context.getPackageManager().getPackageInfo(str, i));
            } catch (PackageManager.NameNotFoundException unused) {
                return new C57733ynw(true, null);
            } catch (java.lang.RuntimeException e) {
                if (e.getCause() instanceof android.os.DeadSystemException) {
                    return new C57733ynw(false, null);
                }
                throw e;
            }
        }
    }
}
