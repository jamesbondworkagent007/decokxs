package o;

import android.app.Application;
import com.engagelab.privates.common.constants.MTCommonConstants;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: o.pKm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C38053pKm implements Application.ActivityLifecycleCallbacks {
    public static volatile C38053pKm OLrzqt;
    public final LinkedList<android.app.Activity> copydefault = new LinkedList<>();
    public final java.util.List<ActionBar> AYXKKw = new CopyOnWriteArrayList();
    public int EZpvd = 0;
    public int KWHzl = 0;
    public boolean AEQbTJ = false;

    /* JADX INFO: renamed from: o.pKm$ActionBar */
    public interface ActionBar {
        void AEQbTJ(android.app.Activity activity);

        void OLrzqt(android.app.Activity activity);
    }

    public final void copydefault(android.app.Activity activity, boolean z) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@androidx.annotation.NonNull android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostDestroyed(@androidx.annotation.NonNull android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostPaused(@androidx.annotation.NonNull android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(@androidx.annotation.NonNull android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostSaveInstanceState(@androidx.annotation.NonNull android.app.Activity activity, @androidx.annotation.NonNull android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(@androidx.annotation.NonNull android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStopped(@androidx.annotation.NonNull android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(@androidx.annotation.NonNull android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(@androidx.annotation.NonNull android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreResumed(@androidx.annotation.NonNull android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreSaveInstanceState(@androidx.annotation.NonNull android.app.Activity activity, @androidx.annotation.NonNull android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(@androidx.annotation.NonNull android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@androidx.annotation.NonNull android.app.Activity activity, @androidx.annotation.NonNull android.os.Bundle bundle) {
    }

    private C38053pKm() {
    }

    public static C38053pKm copydefault() {
        if (OLrzqt == null) {
            synchronized (C38053pKm.class) {
                if (OLrzqt == null) {
                    OLrzqt = new C38053pKm();
                }
            }
        }
        return OLrzqt;
    }

    public void KWHzl(android.app.Application application) {
        application.registerActivityLifecycleCallbacks(this);
    }

    public void OLrzqt(android.app.Application application) {
        this.copydefault.clear();
        application.unregisterActivityLifecycleCallbacks(this);
    }

    public android.app.Activity valueOf() {
        for (android.app.Activity activity : AEQbTJ()) {
            if (KWHzl(activity)) {
                return activity;
            }
        }
        return null;
    }

    public java.util.List<android.app.Activity> AEQbTJ() {
        if (!this.copydefault.isEmpty()) {
            return new LinkedList(this.copydefault);
        }
        this.copydefault.addAll(OLrzqt());
        return new LinkedList(this.copydefault);
    }

    public void copydefault(ActionBar actionBar) {
        this.AYXKKw.add(actionBar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@androidx.annotation.NonNull android.app.Activity activity, android.os.Bundle bundle) {
        if (this.copydefault.size() == 0) {
            KWHzl(activity, true);
        }
        AEQbTJ(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@androidx.annotation.NonNull android.app.Activity activity) {
        if (!this.AEQbTJ) {
            AEQbTJ(activity);
        }
        int i = this.KWHzl;
        if (i < 0) {
            this.KWHzl = i + 1;
        } else {
            this.EZpvd++;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@androidx.annotation.NonNull android.app.Activity activity) {
        AEQbTJ(activity);
        if (this.AEQbTJ) {
            this.AEQbTJ = false;
            KWHzl(activity, true);
        }
        copydefault(activity, false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.KWHzl--;
        } else {
            int i = this.EZpvd - 1;
            this.EZpvd = i;
            if (i <= 0) {
                this.AEQbTJ = true;
                KWHzl(activity, false);
            }
        }
        copydefault(activity, true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@androidx.annotation.NonNull android.app.Activity activity) {
        this.copydefault.remove(activity);
    }

    public final void KWHzl(android.app.Activity activity, boolean z) {
        if (this.AYXKKw.isEmpty()) {
            return;
        }
        for (ActionBar actionBar : this.AYXKKw) {
            if (z) {
                actionBar.OLrzqt(activity);
            } else {
                actionBar.AEQbTJ(activity);
            }
        }
    }

    public void AEQbTJ(android.app.Activity activity) {
        if (this.copydefault.contains(activity)) {
            if (this.copydefault.getFirst().equals(activity)) {
                return;
            }
            this.copydefault.remove(activity);
            this.copydefault.addFirst(activity);
            return;
        }
        this.copydefault.addFirst(activity);
    }

    public final java.util.List<android.app.Activity> OLrzqt() {
        LinkedList linkedList = new LinkedList();
        android.app.Activity activity = null;
        try {
            java.lang.Object objKWHzl = KWHzl();
            java.lang.reflect.Field declaredField = objKWHzl.getClass().getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(objKWHzl);
            if (!(obj instanceof java.util.Map)) {
                return linkedList;
            }
            for (java.lang.Object obj2 : ((java.util.Map) obj).values()) {
                java.lang.Class<?> cls = obj2.getClass();
                java.lang.reflect.Field declaredField2 = cls.getDeclaredField(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
                declaredField2.setAccessible(true);
                android.app.Activity activity2 = (android.app.Activity) declaredField2.get(obj2);
                if (activity == null) {
                    java.lang.reflect.Field declaredField3 = cls.getDeclaredField("paused");
                    declaredField3.setAccessible(true);
                    if (declaredField3.getBoolean(obj2)) {
                        linkedList.add(activity2);
                    } else {
                        activity = activity2;
                    }
                } else {
                    linkedList.add(activity2);
                }
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        if (activity != null) {
            linkedList.addFirst(activity);
        }
        return linkedList;
    }

    public final java.lang.Object KWHzl() {
        java.lang.Object objEZpvd = EZpvd();
        return objEZpvd != null ? objEZpvd : AYXKKw();
    }

    public final java.lang.Object EZpvd() {
        try {
            java.lang.reflect.Field declaredField = java.lang.Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (java.lang.Exception e) {
            e.getMessage();
            return null;
        }
    }

    public final java.lang.Object AYXKKw() {
        try {
            return java.lang.Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            e.getMessage();
            return null;
        }
    }

    public boolean KWHzl(android.app.Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }
}
