package o;

import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: renamed from: o.xhj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55321xhj extends android.content.ContextWrapper {
    public InterfaceC55322xhk EZpvd;
    public android.widget.Toast KWHzl;

    public C55321xhj(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull android.widget.Toast toast) {
        super(context);
        this.KWHzl = toast;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.Context getApplicationContext() {
        return new Activity(getBaseContext().getApplicationContext());
    }

    /* JADX INFO: renamed from: o.xhj$Activity */
    public final class Activity extends android.content.ContextWrapper {
        public Activity(@androidx.annotation.NonNull android.content.Context context) {
            super(context);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public java.lang.Object getSystemService(@androidx.annotation.NonNull java.lang.String str) {
            if ("window".equals(str)) {
                return new ActionBar((android.view.WindowManager) getBaseContext().getSystemService(str));
            }
            return super.getSystemService(str);
        }

        @Override // android.content.ContextWrapper
        public void attachBaseContext(android.content.Context context) {
            super.attachBaseContext(context);
        }
    }

    /* JADX INFO: renamed from: o.xhj$ActionBar */
    public final class ActionBar implements android.view.WindowManager {
        public final android.view.WindowManager EZpvd;

        public ActionBar(@androidx.annotation.NonNull android.view.WindowManager windowManager) {
            this.EZpvd = windowManager;
        }

        @Override // android.view.WindowManager
        public android.view.Display getDefaultDisplay() {
            return this.EZpvd.getDefaultDisplay();
        }

        @Override // android.view.WindowManager
        public void removeViewImmediate(android.view.View view) {
            this.EZpvd.removeViewImmediate(view);
        }

        @Override // android.view.ViewManager
        public void addView(android.view.View view, ViewGroup.LayoutParams layoutParams) {
            try {
                this.EZpvd.addView(view, layoutParams);
            } catch (WindowManager.BadTokenException e) {
                e.getMessage();
                if (C55321xhj.this.EZpvd != null) {
                    C55321xhj.this.EZpvd.copydefault(C55321xhj.this.KWHzl);
                }
            } catch (java.lang.Throwable unused) {
            }
        }

        @Override // android.view.ViewManager
        public void updateViewLayout(android.view.View view, ViewGroup.LayoutParams layoutParams) {
            this.EZpvd.updateViewLayout(view, layoutParams);
        }

        @Override // android.view.ViewManager
        public void removeView(android.view.View view) {
            this.EZpvd.removeView(view);
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
