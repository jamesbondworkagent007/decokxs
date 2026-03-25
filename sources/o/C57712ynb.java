package o;

import android.view.ViewTreeObserver;
import com.onesignal.OSFocusHandler;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C57761yoX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ynb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57712ynb implements C57761yoX.TaskDescription {
    public final OSFocusHandler AEQbTJ;
    public android.app.Activity KWHzl = null;
    public boolean gEmmrt = false;
    public static final java.util.Map<java.lang.String, TaskDescription> OLrzqt = new ConcurrentHashMap();
    public static final java.util.Map<java.lang.String, C57761yoX.StateListAnimator> copydefault = new ConcurrentHashMap();
    public static final java.util.Map<java.lang.String, ActionBar> EZpvd = new ConcurrentHashMap();

    /* JADX INFO: renamed from: o.ynb$TaskDescription */
    public static abstract class TaskDescription {
        public void KWHzl(@androidx.annotation.NonNull android.app.Activity activity) {
        }

        public void OLrzqt(@androidx.annotation.NonNull android.app.Activity activity) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.gEmmrt = z;
    }

    public void OLrzqt(android.app.Activity activity) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.app.Activity copydefault() {
        return this.KWHzl;
    }

    public C57712ynb(OSFocusHandler oSFocusHandler) {
        this.AEQbTJ = oSFocusHandler;
    }

    public void copydefault(android.content.res.Configuration configuration, android.app.Activity activity) {
        android.app.Activity activity2 = this.KWHzl;
        if (activity2 == null || !OSUtils.KWHzl(activity2, 128)) {
            return;
        }
        AEQbTJ(configuration.orientation, activity);
        gEmmrt(activity);
    }

    public void copydefault(android.app.Activity activity) {
        this.AEQbTJ.AYXKKw();
    }

    public void KWHzl(android.app.Activity activity) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "onActivityResumed: " + activity);
        AhwBna(activity);
        OLrzqt();
        EZpvd();
    }

    public void AEQbTJ(android.app.Activity activity) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "onActivityPaused: " + activity);
        if (activity == this.KWHzl) {
            this.KWHzl = null;
            AEQbTJ();
        }
        OLrzqt();
    }

    public void djBIcL(android.app.Activity activity) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "onActivityStopped: " + activity);
        if (activity == this.KWHzl) {
            this.KWHzl = null;
            AEQbTJ();
        }
        java.util.Iterator<Map.Entry<java.lang.String, TaskDescription>> it = OLrzqt.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().KWHzl(activity);
        }
        OLrzqt();
        if (this.KWHzl == null) {
            this.AEQbTJ.gEmmrt();
        }
    }

    public void EZpvd(android.app.Activity activity) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "onActivityDestroyed: " + activity);
        EZpvd.clear();
        if (activity == this.KWHzl) {
            this.KWHzl = null;
            AEQbTJ();
        }
        OLrzqt();
    }

    public final void OLrzqt() {
        java.lang.String str;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("curActivity is NOW: ");
        if (this.KWHzl != null) {
            str = "" + this.KWHzl.getClass().getName() + ":" + this.KWHzl;
        } else {
            str = AbstractJsonLexerKt.NULL;
        }
        sb.append(str);
        OneSignal.KWHzl(log_level, sb.toString());
    }

    public final void AEQbTJ(int i, android.app.Activity activity) {
        if (i == 2) {
            OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "Configuration Orientation Change: LANDSCAPE (" + i + ") on activity: " + activity);
            return;
        }
        if (i == 1) {
            OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "Configuration Orientation Change: PORTRAIT (" + i + ") on activity: " + activity);
        }
    }

    public final void gEmmrt(android.app.Activity activity) {
        AEQbTJ();
        java.util.Iterator<Map.Entry<java.lang.String, TaskDescription>> it = OLrzqt.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().KWHzl(activity);
        }
        java.util.Iterator<Map.Entry<java.lang.String, TaskDescription>> it2 = OLrzqt.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().OLrzqt(this.KWHzl);
        }
        android.view.ViewTreeObserver viewTreeObserver = this.KWHzl.getWindow().getDecorView().getViewTreeObserver();
        for (Map.Entry<java.lang.String, C57761yoX.StateListAnimator> entry : copydefault.entrySet()) {
            ActionBar actionBar = new ActionBar(this, entry.getValue(), entry.getKey());
            viewTreeObserver.addOnGlobalLayoutListener(actionBar);
            EZpvd.put(entry.getKey(), actionBar);
        }
        EZpvd();
    }

    public final void AEQbTJ() {
        OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "ActivityLifecycleHandler Handling lost focus");
        OSFocusHandler oSFocusHandler = this.AEQbTJ;
        if (oSFocusHandler != null) {
            if (!oSFocusHandler.AEQbTJ() || this.AEQbTJ.KWHzl()) {
                new java.lang.Thread() { // from class: o.ynb.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        OneSignal.wlaJM().EZpvd();
                        C57712ynb.this.AEQbTJ.OLrzqt("FOCUS_LOST_WORKER_TAG", 2000L, OneSignal.AEQbTJ);
                    }
                }.start();
            }
        }
    }

    public final void EZpvd() {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.AEQbTJ(log_level, "ActivityLifecycleHandler handleFocus, nextResumeIsFirstActivity: " + this.gEmmrt);
        if (this.AEQbTJ.AEQbTJ() || this.gEmmrt) {
            OneSignal.AEQbTJ(log_level, "ActivityLifecycleHandler reset background state, call app focus");
            this.gEmmrt = false;
            this.AEQbTJ.AhwBna();
        } else {
            OneSignal.AEQbTJ(log_level, "ActivityLifecycleHandler cancel background lost focus worker");
            this.AEQbTJ.copydefault("FOCUS_LOST_WORKER_TAG", OneSignal.AEQbTJ);
        }
    }

    public void OLrzqt(java.lang.String str, C57761yoX.StateListAnimator stateListAnimator) {
        android.app.Activity activity = this.KWHzl;
        if (activity != null) {
            android.view.ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
            ActionBar actionBar = new ActionBar(this, stateListAnimator, str);
            viewTreeObserver.addOnGlobalLayoutListener(actionBar);
            EZpvd.put(str, actionBar);
        }
        copydefault.put(str, stateListAnimator);
    }

    @Override // o.C57761yoX.TaskDescription
    public void KWHzl(@NotNull java.lang.String str, @NotNull ActionBar actionBar) {
        android.app.Activity activity = this.KWHzl;
        if (activity != null) {
            activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(actionBar);
        }
        EZpvd.remove(str);
        copydefault.remove(str);
    }

    public void KWHzl(java.lang.String str, TaskDescription taskDescription) {
        OLrzqt.put(str, taskDescription);
        android.app.Activity activity = this.KWHzl;
        if (activity != null) {
            taskDescription.OLrzqt(activity);
        }
    }

    public void OLrzqt(java.lang.String str) {
        OLrzqt.remove(str);
    }

    public void AhwBna(android.app.Activity activity) {
        this.KWHzl = activity;
        java.util.Iterator<Map.Entry<java.lang.String, TaskDescription>> it = OLrzqt.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().OLrzqt(this.KWHzl);
        }
        try {
            android.view.ViewTreeObserver viewTreeObserver = this.KWHzl.getWindow().getDecorView().getViewTreeObserver();
            for (Map.Entry<java.lang.String, C57761yoX.StateListAnimator> entry : copydefault.entrySet()) {
                ActionBar actionBar = new ActionBar(this, entry.getValue(), entry.getKey());
                viewTreeObserver.addOnGlobalLayoutListener(actionBar);
                EZpvd.put(entry.getKey(), actionBar);
            }
        } catch (java.lang.RuntimeException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: o.ynb$ActionBar */
    public static class ActionBar implements ViewTreeObserver.OnGlobalLayoutListener {
        public final C57761yoX.StateListAnimator AEQbTJ;
        public final C57761yoX.TaskDescription EZpvd;
        public final java.lang.String KWHzl;

        public ActionBar(C57761yoX.TaskDescription taskDescription, C57761yoX.StateListAnimator stateListAnimator, java.lang.String str) {
            this.EZpvd = taskDescription;
            this.AEQbTJ = stateListAnimator;
            this.KWHzl = str;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (C57823ypg.KWHzl((WeakReference<android.app.Activity>) new WeakReference(OneSignal.getNewProxyInstance()))) {
                return;
            }
            this.EZpvd.KWHzl(this.KWHzl, this);
            this.AEQbTJ.isConnected();
        }
    }
}
