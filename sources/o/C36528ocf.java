package o;

import com.okinc.im.imui.livestream.model.UserRole;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ocf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C36528ocf {

    /* JADX INFO: renamed from: o.ocf$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[UserRole.values().length];
            try {
                iArr[UserRole.MODERATOR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[UserRole.STREAMER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[UserRole.VIEWER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    public static final java.lang.String EZpvd(@NotNull UserRole userRole) {
        Intrinsics.checkNotNullParameter(userRole, "");
        int i = ActionBar.KWHzl[userRole.ordinal()];
        if (i == 1) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.newSessionWithExtras);
        }
        if (i == 2) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.postMessage);
        }
        if (i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
