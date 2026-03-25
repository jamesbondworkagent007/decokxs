package o;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41088qkH {

    /* JADX INFO: renamed from: o.qkH$ActionBar */
    public static final class ActionBar extends android.view.ViewOutlineProvider {
        public final /* synthetic */ float KWHzl;

        public ActionBar(float f) {
            this.KWHzl = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View view, Outline outline) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(outline, "");
            if (view.getWidth() == 0 || view.getHeight() == 0) {
                return;
            }
            android.graphics.Path path = new android.graphics.Path();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(view.getWidth(), 0.0f);
            path.lineTo(view.getWidth(), view.getHeight() - this.KWHzl);
            float f = 2;
            path.arcTo(new RectF(view.getWidth() - (this.KWHzl * f), view.getHeight() - (this.KWHzl * f), view.getWidth(), view.getHeight()), 0.0f, 90.0f);
            path.lineTo(this.KWHzl, view.getHeight());
            float height = view.getHeight();
            float f2 = f * this.KWHzl;
            path.arcTo(new RectF(0.0f, height - f2, f2, view.getHeight()), 90.0f, 90.0f);
            path.close();
            try {
                Result.Application application = Result.Companion;
                if (Build.VERSION.SDK_INT >= 30) {
                    outline.setPath(path);
                } else if (path.isConvex()) {
                    outline.setConvexPath(path);
                } else {
                    C41298qoF.e$default(C41298qoF.AEQbTJ, "TrendingCategoriesChartView", "setOutlineProvider: Path is not convex, ignore set outline for " + view, null, 4, null);
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                C41298qoF.AEQbTJ.AEQbTJ("TrendingCategoriesChartView", "setOutlineProvider: Failed to set outline for " + view, thM7380exceptionOrNullimpl);
            }
        }
    }

    public static final void OLrzqt(@NotNull android.view.View view, float f) {
        Intrinsics.checkNotNullParameter(view, "");
        view.setOutlineProvider(new ActionBar(f));
        view.setClipToOutline(true);
    }
}
