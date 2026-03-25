package o;

import com.okinc.im.config.serviceprovider.GeneralAction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nsW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC35288nsW {

    /* JADX INFO: renamed from: o.nsW$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void AEQbTJ(@NotNull InterfaceC35288nsW interfaceC35288nsW, @NotNull androidx.fragment.app.Fragment fragment, @NotNull java.util.List<? extends GeneralAction> list) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(list, "");
        }

        public static java.lang.Integer copydefault(@NotNull InterfaceC35288nsW interfaceC35288nsW) {
            return null;
        }
    }

    java.lang.Integer AEQbTJ();

    android.graphics.drawable.Drawable EZpvd(@NotNull android.content.Context context);

    java.lang.String KWHzl();

    void OLrzqt(int i, int i2, android.content.Intent intent, @NotNull android.content.Context context);

    void OLrzqt(@NotNull androidx.fragment.app.Fragment fragment, int i, @NotNull java.lang.String[] strArr, @NotNull int[] iArr);

    void copydefault(@NotNull androidx.fragment.app.Fragment fragment);
}
