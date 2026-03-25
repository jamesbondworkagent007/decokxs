package o;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.ViewGroupKt;
import com.okinc.core.util.SPUtils;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.pVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qYh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C40504qYh {
    public static final void KWHzl(android.view.View view) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
        if (view.isInEditMode()) {
            SPUtils.init(view.getContext());
            Application application = new Application();
            java.lang.reflect.Field declaredField = android.content.ContextWrapper.class.getDeclaredField("mBase");
            declaredField.setAccessible(true);
            declaredField.set(application, view.getContext());
            C43246rlf.init$default(C43246rlf.OLrzqt, application, null, 2, null);
            C32979mnm.EZpvd.EZpvd(application);
            C52762wXk.init$default(application, true, 0, 4, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.qXQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static final android.graphics.Paint KWHzl(@NotNull qXQ qxq) {
        Intrinsics.checkNotNullParameter(qxq, "");
        android.view.View view = (android.view.View) qxq;
        java.lang.Object tag = view.getTag(pVX.ActionBar.AYXKKw);
        android.graphics.Paint paint = tag instanceof android.graphics.Paint ? (android.graphics.Paint) tag : null;
        if (paint != null) {
            return paint;
        }
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setColor(Color.argb(255, secureRandom.nextInt(256), secureRandom.nextInt(256), secureRandom.nextInt(256)));
        textPaint.setTextSize(20.0f);
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setStrokeWidth(1.0f);
        textPaint.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
        view.setTag(pVX.ActionBar.AYXKKw, textPaint);
        return textPaint;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(android.view.View view, android.graphics.Canvas canvas) {
        if (view.isInEditMode()) {
            Intrinsics.copydefault(view, "");
            qXQ qxq = (qXQ) view;
            canvas.drawLine(1.0f, 1.0f, view.getMeasuredWidth() - 1.0f, view.getMeasuredHeight() - 1.0f, KWHzl(qxq));
            canvas.drawLine(view.getMeasuredWidth() - 1.0f, 1.0f, 1.0f, view.getMeasuredHeight() - 1.0f, KWHzl(qxq));
            canvas.drawRect(2.0f, 2.0f, view.getMeasuredWidth() - 2.0f, view.getMeasuredHeight() - 2.0f, KWHzl(qxq));
        }
    }

    public static final void KWHzl(C40499qYc c40499qYc, android.graphics.Canvas canvas) {
        if (c40499qYc.isInEditMode()) {
            java.util.List listZuBGHE = C59467zhb.zuBGHE(ViewGroupKt.getChildren(c40499qYc));
            java.util.ArrayList<Group> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listZuBGHE) {
                if (obj instanceof Group) {
                    arrayList.add(obj);
                }
            }
            for (Group group : arrayList) {
                int color = KWHzl((qXQ) c40499qYc).getColor();
                java.security.SecureRandom secureRandom = new java.security.SecureRandom();
                KWHzl((qXQ) c40499qYc).setColor(Color.argb(255, secureRandom.nextInt(256), secureRandom.nextInt(256), secureRandom.nextInt(256)));
                KWHzl((qXQ) c40499qYc).setStyle(Paint.Style.FILL);
                KWHzl((qXQ) c40499qYc).setAlpha(15);
                int[] referencedIds = group.getReferencedIds();
                Intrinsics.checkNotNullExpressionValue(referencedIds, "");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(referencedIds.length);
                for (int i : referencedIds) {
                    arrayList2.add(c40499qYc.getViewById(i));
                }
                for (android.view.View view : CollectionsKt___CollectionsKt.QfsBiF(arrayList2)) {
                    canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), KWHzl((qXQ) c40499qYc));
                }
                KWHzl((qXQ) c40499qYc).setColor(color);
                KWHzl((qXQ) c40499qYc).setAlpha(255);
                KWHzl((qXQ) c40499qYc).setStyle(Paint.Style.STROKE);
            }
        }
    }

    /* JADX INFO: renamed from: o.qYh$Application */
    public static final class Application extends android.app.Application {
        @Override // android.app.Application
        public void onCreate() {
            super.onCreate();
        }

        @Override // android.content.ContextWrapper
        public void attachBaseContext(android.content.Context context) {
            super.attachBaseContext(context);
        }
    }
}
