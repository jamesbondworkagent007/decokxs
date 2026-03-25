package o;

import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55243xgK {
    public static final android.widget.ImageView EZpvd(@NotNull TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "");
        android.view.View customView = tab.getCustomView();
        C54989xbV c54989xbV = customView instanceof C54989xbV ? (C54989xbV) customView : null;
        if (c54989xbV != null) {
            return c54989xbV.OLrzqt();
        }
        return null;
    }

    public static final void AEQbTJ(@NotNull TabLayout.Tab tab, @NotNull android.graphics.drawable.Drawable drawable) {
        Intrinsics.checkNotNullParameter(tab, "");
        Intrinsics.checkNotNullParameter(drawable, "");
        android.view.View customView = tab.getCustomView();
        C54989xbV c54989xbV = customView instanceof C54989xbV ? (C54989xbV) customView : null;
        if (c54989xbV != null) {
            c54989xbV.setMenuIcon(drawable);
        }
    }
}
