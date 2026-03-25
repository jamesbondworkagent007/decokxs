package o;

import java.util.Collections;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: o.xWm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C54819xWm {
    public static C54819xWm copydefault = new C54819xWm();
    public android.content.Context djBIcL;
    public android.app.Activity valueOf;
    public java.util.Map<java.lang.String, android.app.Activity> KWHzl = new java.util.HashMap();
    public final java.util.List<InterfaceC54816xWj> AEQbTJ = Collections.synchronizedList(new java.util.ArrayList());
    public AtomicBoolean OLrzqt = new AtomicBoolean(false);
    public final Stack<android.app.Activity> EZpvd = new Stack<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static C54819xWm KWHzl() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<InterfaceC54816xWj> copydefault() {
        return this.AEQbTJ;
    }

    private C54819xWm() {
    }

    public void copydefault(android.content.Context context) {
        android.app.Application application = (android.app.Application) context.getApplicationContext();
        application.registerActivityLifecycleCallbacks(new C54818xWl() { // from class: o.xWm.1
            @Override // o.C54818xWl, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
                super.onActivityCreated(activity, bundle);
                synchronized (C54819xWm.this) {
                    C54819xWm.this.valueOf = activity;
                }
            }

            @Override // o.C54818xWl, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(android.app.Activity activity) {
                super.onActivityStarted(activity);
                synchronized (C54819xWm.this) {
                    C54819xWm.this.EZpvd.push(activity);
                }
            }

            @Override // o.C54818xWl, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(android.app.Activity activity) {
                super.onActivityResumed(activity);
                synchronized (C54819xWm.this) {
                    C54819xWm.this.valueOf = activity;
                }
            }

            @Override // o.C54818xWl, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(android.app.Activity activity) {
                super.onActivityStopped(activity);
                synchronized (C54819xWm.this) {
                    if (activity == C54819xWm.this.valueOf) {
                        C54819xWm.this.valueOf = null;
                    }
                    C54819xWm.this.EZpvd.remove(activity);
                }
            }

            @Override // o.C54818xWl, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(android.app.Activity activity) {
                super.onActivityDestroyed(activity);
                synchronized (C54819xWm.this) {
                    if (activity == C54819xWm.this.valueOf) {
                        C54819xWm.this.valueOf = null;
                    }
                }
            }
        });
        this.djBIcL = application;
    }

    public android.app.Activity AEQbTJ() {
        synchronized (this) {
            if (this.valueOf == null && !this.EZpvd.isEmpty()) {
                this.valueOf = this.EZpvd.peek();
            }
        }
        return this.valueOf;
    }

    public void AEQbTJ(InterfaceC54816xWj interfaceC54816xWj) {
        this.AEQbTJ.add(interfaceC54816xWj);
        if (this.OLrzqt.get()) {
            interfaceC54816xWj.EZpvd();
        }
    }

    public void KWHzl(InterfaceC54816xWj interfaceC54816xWj) {
        this.AEQbTJ.remove(interfaceC54816xWj);
    }

    public void KWHzl(android.app.Activity activity) {
        this.KWHzl.put(activity.toString(), activity);
    }

    public void AEQbTJ(android.app.Activity activity) {
        try {
            this.KWHzl.remove(activity.toString());
        } catch (java.lang.Exception e) {
            e.fillInStackTrace();
        }
    }

    public void OLrzqt() {
        this.OLrzqt.set(true);
        java.lang.Object[] objArrEZpvd = EZpvd();
        if (objArrEZpvd != null) {
            for (java.lang.Object obj : objArrEZpvd) {
                ((InterfaceC54816xWj) obj).EZpvd();
            }
        }
    }

    public final java.lang.Object[] EZpvd() {
        java.lang.Object[] array;
        synchronized (this.AEQbTJ) {
            array = this.AEQbTJ.size() > 0 ? this.AEQbTJ.toArray() : null;
        }
        return array;
    }
}
