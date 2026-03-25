package o;

import android.app.Application;
import android.os.MessageQueue;
import com.okinc.utils.appmanager.BackgroundRecords;

/* JADX INFO: renamed from: o.xWl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C54818xWl implements Application.ActivityLifecycleCallbacks, MessageQueue.IdleHandler {
    public static boolean OLrzqt = true;
    public int AEQbTJ;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        C54819xWm.KWHzl().KWHzl(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        if (this.AEQbTJ == 0) {
            BackgroundRecords.INSTANCE.recordEnterForeground();
            java.util.List<InterfaceC54816xWj> listCopydefault = C54819xWm.KWHzl().copydefault();
            for (int i = 0; i < listCopydefault.size(); i++) {
                InterfaceC54816xWj interfaceC54816xWj = listCopydefault.get(i);
                if (interfaceC54816xWj != null) {
                    interfaceC54816xWj.copydefault();
                }
            }
            if (OLrzqt) {
                OLrzqt = false;
                android.os.Looper.getMainLooper().getQueue().addIdleHandler(this);
            } else {
                queueIdle();
            }
        }
        this.AEQbTJ++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        int i = this.AEQbTJ - 1;
        this.AEQbTJ = i;
        if (i == 0) {
            BackgroundRecords.INSTANCE.recordEnterBackground();
            android.os.Looper.getMainLooper().getQueue().removeIdleHandler(this);
            java.util.List<InterfaceC54816xWj> listCopydefault = C54819xWm.KWHzl().copydefault();
            for (int i2 = 0; i2 < listCopydefault.size(); i2++) {
                InterfaceC54816xWj interfaceC54816xWj = listCopydefault.get(i2);
                if (interfaceC54816xWj != null) {
                    interfaceC54816xWj.KWHzl();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        C54819xWm.KWHzl().AEQbTJ(activity);
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        java.util.List<InterfaceC54816xWj> listCopydefault = C54819xWm.KWHzl().copydefault();
        for (int i = 0; i < listCopydefault.size(); i++) {
            InterfaceC54816xWj interfaceC54816xWj = listCopydefault.get(i);
            if (interfaceC54816xWj != null) {
                interfaceC54816xWj.OLrzqt(C54819xWm.KWHzl().AEQbTJ());
            }
        }
        return false;
    }
}
