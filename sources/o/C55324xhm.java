package o;

import android.os.Build;

/* JADX INFO: renamed from: o.xhm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55324xhm extends android.widget.Toast {
    public boolean AEQbTJ;
    public android.widget.Toast KWHzl;
    public android.os.Handler OLrzqt;
    public long copydefault;

    public C55324xhm(android.content.Context context, @androidx.annotation.NonNull android.widget.Toast toast) {
        super(context);
        this.AEQbTJ = true;
        this.copydefault = -1L;
        this.OLrzqt = new android.os.Handler(android.os.Looper.getMainLooper());
        this.KWHzl = toast;
    }

    public static C55324xhm EZpvd(android.content.Context context, java.lang.CharSequence charSequence, int i) {
        android.widget.Toast toastMakeText = android.widget.Toast.makeText(context, charSequence, i);
        copydefault(toastMakeText.getView(), new C55321xhj(context, toastMakeText));
        return new C55324xhm(context, toastMakeText);
    }

    @Override // android.widget.Toast
    public void show() {
        this.KWHzl.show();
    }

    @Override // android.widget.Toast
    public void cancel() {
        this.KWHzl.cancel();
    }

    @Override // android.widget.Toast
    public void setDuration(int i) {
        this.KWHzl.setDuration(i);
    }

    @Override // android.widget.Toast
    public void setGravity(int i, int i2, int i3) {
        this.KWHzl.setGravity(i, i2, i3);
    }

    @Override // android.widget.Toast
    public void setMargin(float f, float f2) {
        this.KWHzl.setMargin(f, f2);
    }

    @Override // android.widget.Toast
    public void setText(int i) {
        this.KWHzl.setText(i);
    }

    @Override // android.widget.Toast
    public void setText(java.lang.CharSequence charSequence) {
        this.KWHzl.setText(charSequence);
    }

    @Override // android.widget.Toast
    public void setView(android.view.View view) {
        this.KWHzl.setView(view);
        copydefault(view, new C55321xhj(view.getContext(), this));
    }

    @Override // android.widget.Toast
    public float getHorizontalMargin() {
        return this.KWHzl.getHorizontalMargin();
    }

    @Override // android.widget.Toast
    public float getVerticalMargin() {
        return this.KWHzl.getVerticalMargin();
    }

    @Override // android.widget.Toast
    public int getDuration() {
        return this.KWHzl.getDuration();
    }

    @Override // android.widget.Toast
    public int getGravity() {
        return this.KWHzl.getGravity();
    }

    @Override // android.widget.Toast
    public int getXOffset() {
        return this.KWHzl.getXOffset();
    }

    @Override // android.widget.Toast
    public int getYOffset() {
        return this.KWHzl.getYOffset();
    }

    @Override // android.widget.Toast
    public android.view.View getView() {
        return this.KWHzl.getView();
    }

    public static void copydefault(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.content.Context context) {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mContext");
                declaredField.setAccessible(true);
                declaredField.set(view, context);
            } catch (java.lang.Throwable th) {
                android.util.Log.getStackTraceString(th);
            }
        }
    }
}
