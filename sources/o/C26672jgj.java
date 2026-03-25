package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jgj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26672jgj {
    public static final C26672jgj AEQbTJ = new C26672jgj();

    private C26672jgj() {
    }

    public static final C26700jhK KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            android.content.Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            iNP inp = (iNP) C58114yvF.OLrzqt(applicationContext, iNP.class);
            return new C26700jhK(inp.DTwDnp(), inp.RJOkX());
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException("Failed to create RedeemHandler. Make sure the application is properly configured with Hilt.", e);
        }
    }

    public static final boolean copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            android.content.Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            C58114yvF.OLrzqt(applicationContext, iNP.class);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public final C26638jgB OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            android.content.Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            return new C26638jgB(((iNP) C58114yvF.OLrzqt(applicationContext, iNP.class)).OcIXYQ());
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException("Failed to create InvestHandler. Make sure the application is properly configured with Hilt.", e);
        }
    }
}
