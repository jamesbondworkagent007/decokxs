package o;

import android.os.Build;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC57840ypx;
import o.C57713ync;
import o.C57792ypB;

/* JADX INFO: renamed from: o.ynU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57705ynU implements ActivityC57840ypx.TaskDescription {
    public static final InterfaceC56387yDm AEQbTJ;
    public static boolean EZpvd;
    public static final java.util.Set<OneSignal.BroadcastReceiver> KWHzl;
    public static final C57705ynU OLrzqt;

    private C57705ynU() {
    }

    static {
        C57705ynU c57705ynU = new C57705ynU();
        OLrzqt = c57705ynU;
        KWHzl = new java.util.HashSet();
        ActivityC57840ypx.KWHzl("NOTIFICATION", c57705ynU);
        AEQbTJ = C56392yDr.copydefault(new Function0<java.lang.Boolean>() { // from class: com.onesignal.NotificationPermissionController$supportsNativePrompt$2
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(Build.VERSION.SDK_INT > 32 && OSUtils.copydefault(OneSignal.AEQbTJ) > 32);
            }
        });
    }

    public final boolean copydefault() {
        return ((java.lang.Boolean) AEQbTJ.getValue()).booleanValue();
    }

    public final void KWHzl(boolean z, OneSignal.BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            KWHzl.add(broadcastReceiver);
        }
        if (AEQbTJ()) {
            EZpvd(true);
            return;
        }
        if (copydefault()) {
            ActivityC57840ypx.EZpvd(z, "NOTIFICATION", "android.permission.POST_NOTIFICATIONS", C57705ynU.class);
        } else if (z) {
            OLrzqt();
        } else {
            EZpvd(false);
        }
    }

    @Override // o.ActivityC57840ypx.TaskDescription
    public void KWHzl() {
        OneSignal.DXXBbs();
        EZpvd(true);
    }

    @Override // o.ActivityC57840ypx.TaskDescription
    public void AEQbTJ(boolean z) {
        if (z && OLrzqt()) {
            return;
        }
        EZpvd(false);
    }

    public final boolean OLrzqt() {
        android.app.Activity newProxyInstance = OneSignal.getNewProxyInstance();
        if (newProxyInstance == null) {
            return false;
        }
        C57713ync c57713ync = C57713ync.OLrzqt;
        java.lang.String string = newProxyInstance.getString(C57792ypB.ActionBar.copydefault);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = newProxyInstance.getString(C57792ypB.ActionBar.djBIcL);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c57713ync.copydefault(newProxyInstance, string, string2, new Activity(newProxyInstance));
        return true;
    }

    /* JADX INFO: renamed from: o.ynU$Activity */
    public static final class Activity implements C57713ync.Activity {
        public final /* synthetic */ android.app.Activity EZpvd;

        public Activity(android.app.Activity activity) {
            this.EZpvd = activity;
        }

        @Override // o.C57713ync.Activity
        public void EZpvd() {
            C57694ynJ.OLrzqt.OLrzqt(this.EZpvd);
            C57705ynU c57705ynU = C57705ynU.OLrzqt;
            C57705ynU.EZpvd = true;
        }

        @Override // o.C57713ync.Activity
        public void copydefault() {
            C57705ynU.OLrzqt.EZpvd(false);
        }
    }

    public final void EZpvd(boolean z) {
        java.util.Iterator<T> it = KWHzl.iterator();
        while (it.hasNext()) {
            ((OneSignal.BroadcastReceiver) it.next()).copydefault(z);
        }
        KWHzl.clear();
    }

    public final void EZpvd() {
        if (EZpvd) {
            EZpvd = false;
            EZpvd(AEQbTJ());
        }
    }

    public final boolean AEQbTJ() {
        return OSUtils.AEQbTJ(OneSignal.AEQbTJ);
    }
}
