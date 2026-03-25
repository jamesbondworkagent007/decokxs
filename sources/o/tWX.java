package o;

import com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType;
import com.okinc.planet_api.publisher.PlanetPublisherPluginType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface tWX {

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity {
        public static boolean AEQbTJ(@NotNull tWX twx) {
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void copydefault(@NotNull tWX twx, @NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull tWU twu) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(twu, "");
        }
    }

    void AEQbTJ(@NotNull java.lang.String str);

    boolean AEQbTJ();

    PlanetPublisherPluginType EZpvd();

    java.lang.String EZpvd(@NotNull android.content.Context context);

    void EZpvd(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull tWU twu);

    android.graphics.drawable.Drawable KWHzl(@NotNull android.content.Context context);

    void KWHzl(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull tWW tww);

    boolean KWHzl();

    void OLrzqt(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull tWW tww);

    boolean OLrzqt();

    java.lang.Object copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType);
}
