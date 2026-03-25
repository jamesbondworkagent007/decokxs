package o;

import androidx.activity.ComponentActivity;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager;

/* JADX INFO: renamed from: o.ywh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58195ywh implements InterfaceC58206yws<java.lang.Object> {
    public final android.app.Activity EZpvd;
    public volatile java.lang.Object KWHzl;
    public final InterfaceC58206yws<InterfaceC58119yvK> OLrzqt;
    public final java.lang.Object copydefault = new java.lang.Object();

    /* JADX INFO: renamed from: o.ywh$TaskDescription */
    public interface TaskDescription {
        InterfaceC58127yvS AEQbTJ();
    }

    public C58195ywh(android.app.Activity activity) {
        this.EZpvd = activity;
        this.OLrzqt = new ActivityRetainedComponentManager((ComponentActivity) activity);
    }

    @Override // o.InterfaceC58206yws
    public java.lang.Object aA_() {
        if (this.KWHzl == null) {
            synchronized (this.copydefault) {
                if (this.KWHzl == null) {
                    this.KWHzl = AEQbTJ();
                }
            }
        }
        return this.KWHzl;
    }

    public final C58200ywm EZpvd() {
        return ((ActivityRetainedComponentManager) this.OLrzqt).OLrzqt();
    }

    public java.lang.Object AEQbTJ() {
        java.lang.String str;
        if (!(this.EZpvd.getApplication() instanceof InterfaceC58206yws)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
            if (android.app.Application.class.equals(this.EZpvd.getApplication().getClass())) {
                str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
            } else {
                str = "Found: " + this.EZpvd.getApplication().getClass();
            }
            sb.append(str);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        return ((TaskDescription) C58113yvE.copydefault(this.OLrzqt, TaskDescription.class)).AEQbTJ().EZpvd(this.EZpvd).EZpvd();
    }
}
