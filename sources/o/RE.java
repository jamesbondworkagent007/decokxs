package o;

import android.net.ConnectivityManager;
import o.InterfaceC5432Rm;
import o.Sz;

/* JADX INFO: loaded from: classes2.dex */
public final class RE {
    public static volatile RE OLrzqt;
    public final Application AEQbTJ;
    public final java.util.Set<InterfaceC5432Rm.ActionBar> KWHzl = new java.util.HashSet();
    public boolean copydefault;

    public interface Application {
        boolean AEQbTJ();

        void copydefault();
    }

    public static RE EZpvd(@androidx.annotation.NonNull android.content.Context context) {
        if (OLrzqt == null) {
            synchronized (RE.class) {
                if (OLrzqt == null) {
                    OLrzqt = new RE(context.getApplicationContext());
                }
            }
        }
        return OLrzqt;
    }

    public RE(@androidx.annotation.NonNull final android.content.Context context) {
        this.AEQbTJ = new ActionBar(Sz.copydefault(new Sz.Activity<android.net.ConnectivityManager>() { // from class: o.RE.4
            /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/lang/Object; */
            @Override // o.Sz.Activity
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public android.net.ConnectivityManager OLrzqt() {
                return (android.net.ConnectivityManager) context.getSystemService("connectivity");
            }
        }), new InterfaceC5432Rm.ActionBar() { // from class: o.RE.5
            @Override // o.InterfaceC5432Rm.ActionBar
            public void KWHzl(boolean z) {
                java.util.ArrayList arrayList;
                SI.copydefault();
                synchronized (RE.this) {
                    arrayList = new java.util.ArrayList(RE.this.KWHzl);
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC5432Rm.ActionBar) it.next()).KWHzl(z);
                }
            }
        });
    }

    public void OLrzqt(InterfaceC5432Rm.ActionBar actionBar) {
        synchronized (this) {
            this.KWHzl.add(actionBar);
            AEQbTJ();
        }
    }

    public void KWHzl(InterfaceC5432Rm.ActionBar actionBar) {
        synchronized (this) {
            this.KWHzl.remove(actionBar);
            EZpvd();
        }
    }

    public final void AEQbTJ() {
        if (this.copydefault || this.KWHzl.isEmpty()) {
            return;
        }
        this.copydefault = this.AEQbTJ.AEQbTJ();
    }

    public final void EZpvd() {
        if (this.copydefault && this.KWHzl.isEmpty()) {
            this.AEQbTJ.copydefault();
            this.copydefault = false;
        }
    }

    public static final class ActionBar implements Application {
        public final ConnectivityManager.NetworkCallback AEQbTJ = new AnonymousClass1();
        public boolean KWHzl;
        public final Sz.Activity<android.net.ConnectivityManager> OLrzqt;
        public final InterfaceC5432Rm.ActionBar copydefault;

        /* JADX INFO: renamed from: o.RE$ActionBar$1, reason: invalid class name */
        /* JADX INFO: loaded from: classes14.dex */
        public class AnonymousClass1 extends ConnectivityManager.NetworkCallback {
            public AnonymousClass1() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@androidx.annotation.NonNull android.net.Network network) {
                EZpvd(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@androidx.annotation.NonNull android.net.Network network) {
                EZpvd(false);
            }

            public final void EZpvd(final boolean z) {
                SI.copydefault(new java.lang.Runnable() { // from class: o.RE.ActionBar.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass1.this.copydefault(z);
                    }
                });
            }

            public void copydefault(boolean z) {
                SI.copydefault();
                ActionBar actionBar = ActionBar.this;
                boolean z2 = actionBar.KWHzl;
                actionBar.KWHzl = z;
                if (z2 != z) {
                    actionBar.copydefault.KWHzl(z);
                }
            }
        }

        public ActionBar(Sz.Activity<android.net.ConnectivityManager> activity, InterfaceC5432Rm.ActionBar actionBar) {
            this.OLrzqt = activity;
            this.copydefault = actionBar;
        }

        @Override // o.RE.Application
        public boolean AEQbTJ() {
            this.KWHzl = this.OLrzqt.OLrzqt().getActiveNetwork() != null;
            try {
                this.OLrzqt.OLrzqt().registerDefaultNetworkCallback(this.AEQbTJ);
                return true;
            } catch (java.lang.RuntimeException unused) {
                return false;
            }
        }

        @Override // o.RE.Application
        public void copydefault() {
            this.OLrzqt.OLrzqt().unregisterNetworkCallback(this.AEQbTJ);
        }
    }
}
