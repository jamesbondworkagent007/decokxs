package o;

import com.okinc.core.glide.ImageSize;
import com.okinc.productmatrix.api.bean.Product;
import com.okinc.productmatrix.api.bean.ProductGroup;
import com.okinc.uilab.stateful.StatefulData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class tZL extends AbstractC32998moE {

    public interface StateListAnimator {
        void AEQbTJ(@NotNull Product product, @NotNull android.view.View view, boolean z);
    }

    public interface TaskDescription {
        void AEQbTJ(@NotNull StatefulData.Status status, java.util.List<ProductGroup> list);
    }

    public abstract void EZpvd(@NotNull Product product, @NotNull android.widget.ImageView imageView, @NotNull ImageSize imageSize, android.graphics.drawable.Drawable drawable, RY<android.graphics.Bitmap> ry);

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.tZL */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadIconByProduct$default(tZL tzl, Product product, android.widget.ImageView imageView, ImageSize imageSize, android.graphics.drawable.Drawable drawable, RY ry, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadIconByProduct");
        }
        if ((i & 16) != 0) {
            ry = null;
        }
        tzl.EZpvd(product, imageView, imageSize, drawable, ry);
    }
}
