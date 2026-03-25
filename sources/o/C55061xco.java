package o;

import android.graphics.drawable.PictureDrawable;
import com.caverock.androidsvg.SVG;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xco, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55061xco implements InterfaceC5429Rj<SVG, PictureDrawable> {
    @Override // o.InterfaceC5429Rj
    public OC<PictureDrawable> KWHzl(@NotNull OC<SVG> oc, @NotNull NM nm) {
        Intrinsics.checkNotNullParameter(oc, "");
        Intrinsics.checkNotNullParameter(nm, "");
        SVG svgAEQbTJ = oc.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(svgAEQbTJ, "");
        return new PV(new PictureDrawable(svgAEQbTJ.valueOf()));
    }
}
