package o;

import androidx.core.view.LayoutInflaterCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pSy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38280pSy {
    public static final C38280pSy KWHzl = new C38280pSy();

    private C38280pSy() {
    }

    public static final android.content.Context KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C38277pSv c38277pSv = new C38277pSv(context);
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(c38277pSv);
        if (layoutInflaterFrom.getFactory() == null) {
            LayoutInflaterCompat.setFactory2(layoutInflaterFrom, new pSF());
        }
        pSE pse = pSE.EZpvd;
        android.content.Context baseContext = c38277pSv.getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "");
        pse.EZpvd(baseContext);
        return c38277pSv;
    }
}
