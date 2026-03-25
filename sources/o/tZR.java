package o;

import com.okinc.productmatrix.api.bean.Product;
import com.okinc.productmatrix.api.bean.ProductMatrixScene;
import com.okinc.productmatrix.api.bean.StringPair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class tZR extends AbstractC43215rlA implements tZJ {
    @Override // o.tZJ
    public tZL EZpvd(@NotNull ProductMatrixScene productMatrixScene, java.util.List<StringPair> list) {
        Intrinsics.checkNotNullParameter(productMatrixScene, "");
        return C48709uam.Companion.OLrzqt(productMatrixScene, list);
    }

    @Override // o.tZJ
    public void OLrzqt(@NotNull android.app.Activity activity, @NotNull ProductMatrixScene productMatrixScene, @NotNull Product product, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(productMatrixScene, "");
        Intrinsics.checkNotNullParameter(product, "");
        tZP.EZpvd.OLrzqt(activity, productMatrixScene, product, bundle);
    }
}
