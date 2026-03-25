package o;

import com.okinc.common.okcore.net.OKCoreNetStateManager$networkBroadcastReceiver$1$onReceive$1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.AbstractC4260BaJ;
import uniffi.network.MobileType;

/* JADX INFO: renamed from: o.mfR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32534mfR {
    public static final C32534mfR AEQbTJ = new C32534mfR();
    public static final AtomicReference<C4259BaI> EZpvd = new AtomicReference<>(null);
    public static final TaskDescription KWHzl = new TaskDescription();
    public static final int OLrzqt = 8;

    private C32534mfR() {
    }

    /* JADX INFO: renamed from: o.mfR$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription extends android.content.BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            java.lang.String action;
            if (intent == null || (action = intent.getAction()) == null || !Intrinsics.EZpvd((java.lang.Object) "android.net.conn.CONNECTIVITY_CHANGE", (java.lang.Object) action)) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new OKCoreNetStateManager$networkBroadcastReceiver$1$onReceive$1(null), 3, null);
        }
    }

    public final void OLrzqt() {
        EZpvd.set(KWHzl());
        try {
            C32979mnm.EZpvd.OLrzqt().getApplicationContext().registerReceiver(KWHzl, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("OKCoreNetStateManager", th);
        }
    }

    public final C4259BaI EZpvd() {
        C4259BaI c4259BaI = EZpvd.get();
        Intrinsics.checkNotNullExpressionValue(c4259BaI, "");
        return c4259BaI;
    }

    public final C4259BaI KWHzl() {
        return new C4259BaI(copydefault(C32979mnm.EZpvd.OLrzqt()));
    }

    public final AbstractC4260BaJ copydefault(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("connectivity");
        Intrinsics.copydefault(systemService, "");
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                return EZpvd(activeNetworkInfo.getSubtype());
            }
            if (type == 1) {
                return AbstractC4260BaJ.Application.INSTANCE;
            }
            if (type == 9) {
                return AbstractC4260BaJ.StateListAnimator.INSTANCE;
            }
            return AbstractC4260BaJ.TaskDescription.INSTANCE;
        }
        return AbstractC4260BaJ.Activity.INSTANCE;
    }

    public final AbstractC4260BaJ EZpvd(int i) {
        if (i != 18) {
            if (i == 20) {
                return new AbstractC4260BaJ.ActionBar(MobileType.G5);
            }
            switch (i) {
                case 0:
                    return AbstractC4260BaJ.TaskDescription.INSTANCE;
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return new AbstractC4260BaJ.ActionBar(MobileType.G2);
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return new AbstractC4260BaJ.ActionBar(MobileType.G3);
                case 13:
                    break;
                default:
                    return AbstractC4260BaJ.TaskDescription.INSTANCE;
            }
        }
        return new AbstractC4260BaJ.ActionBar(MobileType.G4);
    }
}
