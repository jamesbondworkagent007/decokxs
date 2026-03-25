package o;

import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import kotlin.jvm.internal.Intrinsics;
import o.wXR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wXU extends RJ {
    @Override // o.RJ
    public void registerComponents(@NotNull android.content.Context context, @NotNull Glide glide, @NotNull Registry registry) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(glide, "");
        Intrinsics.checkNotNullParameter(registry, "");
        registry.copydefault(wXL.class, wXL.class, new wXR.TaskDescription());
        OG ogOLrzqt = glide.OLrzqt();
        Intrinsics.checkNotNullExpressionValue(ogOLrzqt, "");
        registry.AEQbTJ(wXL.class, BitmapDrawable.class, new wXT(context, ogOLrzqt));
    }
}
