package com.okinc.lib.monitor.window;

import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import o.pJQ;

/* JADX INFO: loaded from: classes9.dex */
public class WindowObserver extends ArrayList<View> {
    private Class mDecorClass;
    private List<Application> mListeners = new ArrayList();
    private Field sWindowField;

    public interface Application {
        void KWHzl(Window window);

        void copydefault(Window window);
    }

    public WindowObserver() {
        try {
            this.mDecorClass = Class.forName("com.android.internal.policy.DecorView");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)Z */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(View view) {
        if (this.mDecorClass == null) {
            this.mDecorClass = view.getRootView().getClass();
        }
        if (view.getClass() != this.mDecorClass) {
            return super.add(view);
        }
        Window window = getWindow(view);
        if (window == null) {
            return super.add(view);
        }
        view.setTag(pJQ.ActionBar.KWHzl, window);
        for (int i = 0; i < this.mListeners.size(); i++) {
            Application application = this.mListeners.get(i);
            if (application != null) {
                application.KWHzl(window);
            }
        }
        return super.add(view);
    }

    /* JADX DEBUG: Method merged with bridge method: remove(I)Ljava/lang/Object; */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public View remove(int i) {
        Window window = (Window) get(i).getTag(pJQ.ActionBar.KWHzl);
        if (window != null) {
            for (int i2 = 0; i2 < this.mListeners.size(); i2++) {
                Application application = this.mListeners.get(i2);
                if (application != null) {
                    application.copydefault(window);
                }
            }
        }
        return (View) super.remove(i);
    }

    public void bindWindow(View view) {
        Window window;
        if (this.mDecorClass == null) {
            this.mDecorClass = view.getClass();
        }
        if (view.getClass() == this.mDecorClass && (window = getWindow(view)) != null) {
            view.setTag(pJQ.ActionBar.KWHzl, window);
        }
    }

    public Window getWindow(View view) {
        if (this.sWindowField == null) {
            try {
                Field declaredField = view.getClass().getDeclaredField("mWindow");
                this.sWindowField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = this.sWindowField;
        if (field != null) {
            try {
                return (Window) field.get(view);
            } catch (IllegalAccessException unused2) {
            }
        }
        return null;
    }

    public void addWindowObserverListener(Application application) {
        if (application != null) {
            this.mListeners.add(application);
        }
    }

    public void removeWindowObserverListener(Application application) {
        this.mListeners.remove(application);
    }
}
