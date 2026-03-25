package o;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import androidx.appcompat.content.res.AppCompatResources;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pFZ {
    public static final pFZ KWHzl = new pFZ();

    private pFZ() {
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "https://static.okx.com/cdn/mobile/resources/images/trading_market/android/okkline/" + str;
    }

    public final void OLrzqt(@NotNull android.widget.ImageView imageView, int i, int i2) {
        Intrinsics.checkNotNullParameter(imageView, "");
        android.graphics.drawable.Drawable drawable = AppCompatResources.getDrawable(imageView.getContext(), i);
        android.graphics.drawable.Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        if (drawableMutate != null) {
            drawableMutate.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
            imageView.setImageDrawable(drawableMutate);
        }
    }
}
