package o;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: o.rpe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43457rpe {
    public static volatile C43457rpe copydefault;
    public android.content.Context EZpvd;
    public CopyOnWriteArrayList<ActionBar> OLrzqt;
    public android.content.BroadcastReceiver KWHzl = new android.content.BroadcastReceiver() { // from class: o.rpe.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if (android.text.TextUtils.equals(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
                C43457rpe c43457rpe = C43457rpe.this;
                c43457rpe.AEQbTJ = c43457rpe.EZpvd();
                C43457rpe c43457rpe2 = C43457rpe.this;
                c43457rpe2.EZpvd(c43457rpe2.AEQbTJ);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("NetworkStatusWatcher-->CONNECTIVITY_CHANGE-->mActiveNetworkInfo: isNetworkConnected:");
                sb.append(C43457rpe.this.OLrzqt());
                sb.append(" ");
                sb.append(C43457rpe.this.AEQbTJ != null ? C43457rpe.this.AEQbTJ.toString() : null);
                pUU.valueOf("fzy", sb.toString());
            }
        }
    };
    public android.net.NetworkInfo AEQbTJ = EZpvd();

    /* JADX INFO: renamed from: o.rpe$ActionBar */
    public interface ActionBar {
        void copydefault(boolean z, android.net.NetworkInfo networkInfo);
    }

    public static C43457rpe OLrzqt(android.content.Context context) {
        if (copydefault == null) {
            synchronized (C43457rpe.class) {
                if (copydefault == null) {
                    copydefault = new C43457rpe(context.getApplicationContext());
                }
            }
        }
        return copydefault;
    }

    public C43457rpe(android.content.Context context) {
        this.EZpvd = context;
        this.EZpvd.registerReceiver(this.KWHzl, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final android.net.NetworkInfo EZpvd() {
        return ((android.net.ConnectivityManager) this.EZpvd.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
    }

    public final boolean AEQbTJ(android.net.NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnected();
    }

    public void EZpvd(android.net.NetworkInfo networkInfo) {
        boolean z = networkInfo != null && networkInfo.isConnected();
        CopyOnWriteArrayList<ActionBar> copyOnWriteArrayList = this.OLrzqt;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        java.util.Iterator<ActionBar> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            it.next().copydefault(z, networkInfo);
        }
    }

    public android.net.NetworkInfo KWHzl() {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = EZpvd();
        }
        return this.AEQbTJ;
    }

    public boolean OLrzqt() {
        return AEQbTJ(KWHzl());
    }

    public void EZpvd(ActionBar actionBar) {
        if (this.OLrzqt == null) {
            this.OLrzqt = new CopyOnWriteArrayList<>();
        }
        this.OLrzqt.add(actionBar);
    }

    public void AEQbTJ(ActionBar actionBar) {
        CopyOnWriteArrayList<ActionBar> copyOnWriteArrayList = this.OLrzqt;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(actionBar);
            if (this.OLrzqt.size() == 0) {
                this.OLrzqt = null;
            }
        }
    }
}
