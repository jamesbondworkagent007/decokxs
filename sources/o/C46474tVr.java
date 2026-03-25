package o;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.okinc.core.util.SPUtils;
import o.C47501trL;

/* JADX INFO: renamed from: o.tVr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C46474tVr {
    public static final void copydefault(android.view.View view) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
        if (view.isInEditMode()) {
            SPUtils.init(view.getContext());
            ActionBar actionBar = new ActionBar();
            java.lang.reflect.Field declaredField = android.content.ContextWrapper.class.getDeclaredField("mBase");
            declaredField.setAccessible(true);
            declaredField.set(actionBar, view.getContext());
            C43246rlf.init$default(C43246rlf.OLrzqt, actionBar, null, 2, null);
            C32979mnm.EZpvd.EZpvd(actionBar);
            C52762wXk.init$default(actionBar, true, 0, 4, null);
        }
    }

    public static final android.graphics.Paint KWHzl(android.view.View view) {
        java.lang.Object tag = view.getTag(C47501trL.TaskDescription.DcMfJKsfEqpH);
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
        view.setTag(C47501trL.TaskDescription.DcMfJKsfEqpH, textPaint);
        return textPaint;
    }

    public static final void OLrzqt(android.view.View view, android.graphics.Canvas canvas) {
        if (view.isInEditMode()) {
            canvas.drawLine(1.0f, 1.0f, view.getMeasuredWidth() - 1.0f, view.getMeasuredHeight() - 1.0f, KWHzl(view));
            canvas.drawLine(view.getMeasuredWidth() - 1.0f, 1.0f, 1.0f, view.getMeasuredHeight() - 1.0f, KWHzl(view));
            canvas.drawRect(2.0f, 2.0f, view.getMeasuredWidth() - 2.0f, view.getMeasuredHeight() - 2.0f, KWHzl(view));
        }
    }

    /* JADX INFO: renamed from: o.tVr$ActionBar */
    public static final class ActionBar extends android.app.Application {
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
