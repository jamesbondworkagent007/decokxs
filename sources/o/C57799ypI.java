package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.onesignal.OneSignal;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: o.ypI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57799ypI {
    public static AtomicLong EZpvd;
    public static C57789yoz KWHzl;
    public static AtomicLong OLrzqt;
    public static java.lang.Class<?> copydefault;
    public android.content.Context AEQbTJ;
    public java.lang.Object valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean copydefault() {
        try {
            copydefault = FirebaseAnalytics.class;
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    public C57799ypI(android.content.Context context) {
        this.AEQbTJ = context;
    }

    public void AEQbTJ() {
        if (OLrzqt == null || KWHzl == null) {
            return;
        }
        long jKWHzl = OneSignal.aKErDB().KWHzl();
        if (jKWHzl - OLrzqt.get() > 120000) {
            return;
        }
        AtomicLong atomicLong = EZpvd;
        if (atomicLong == null || jKWHzl - atomicLong.get() >= 30000) {
            try {
                java.lang.Object objKWHzl = KWHzl(this.AEQbTJ);
                java.lang.reflect.Method methodAEQbTJ = AEQbTJ(copydefault);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("source", "OneSignal");
                bundle.putString("medium", RemoteMessageConst.NOTIFICATION);
                bundle.putString(MTPushConstants.Message.KEY_NOTIFICATION_ID, KWHzl.gEmmrt());
                bundle.putString("campaign", KWHzl(KWHzl));
                methodAEQbTJ.invoke(objKWHzl, "os_notification_influence_open", bundle);
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void EZpvd(C57747yoJ c57747yoJ) {
        if (EZpvd == null) {
            EZpvd = new AtomicLong();
        }
        EZpvd.set(OneSignal.aKErDB().KWHzl());
        try {
            java.lang.Object objKWHzl = KWHzl(this.AEQbTJ);
            java.lang.reflect.Method methodAEQbTJ = AEQbTJ(copydefault);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("source", "OneSignal");
            bundle.putString("medium", RemoteMessageConst.NOTIFICATION);
            bundle.putString(MTPushConstants.Message.KEY_NOTIFICATION_ID, c57747yoJ.EZpvd().gEmmrt());
            bundle.putString("campaign", KWHzl(c57747yoJ.EZpvd()));
            methodAEQbTJ.invoke(objKWHzl, "os_notification_opened", bundle);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public void AEQbTJ(C57747yoJ c57747yoJ) {
        try {
            java.lang.Object objKWHzl = KWHzl(this.AEQbTJ);
            java.lang.reflect.Method methodAEQbTJ = AEQbTJ(copydefault);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("source", "OneSignal");
            bundle.putString("medium", RemoteMessageConst.NOTIFICATION);
            bundle.putString(MTPushConstants.Message.KEY_NOTIFICATION_ID, c57747yoJ.EZpvd().gEmmrt());
            bundle.putString("campaign", KWHzl(c57747yoJ.EZpvd()));
            methodAEQbTJ.invoke(objKWHzl, "os_notification_received", bundle);
            if (OLrzqt == null) {
                OLrzqt = new AtomicLong();
            }
            OLrzqt.set(OneSignal.aKErDB().KWHzl());
            KWHzl = c57747yoJ.EZpvd();
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public final java.lang.String KWHzl(C57789yoz c57789yoz) {
        if (c57789yoz.fetchVPNInfo().isEmpty() || c57789yoz.AYXKKw().isEmpty()) {
            return c57789yoz.DbNXlk() != null ? c57789yoz.DbNXlk().substring(0, java.lang.Math.min(10, c57789yoz.DbNXlk().length())) : "";
        }
        return c57789yoz.fetchVPNInfo() + " - " + c57789yoz.AYXKKw();
    }

    public final java.lang.Object KWHzl(android.content.Context context) {
        if (this.valueOf == null) {
            try {
                this.valueOf = EZpvd(copydefault).invoke(null, context);
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return this.valueOf;
    }

    public static java.lang.reflect.Method AEQbTJ(java.lang.Class cls) {
        try {
            return cls.getMethod("logEvent", java.lang.String.class, android.os.Bundle.class);
        } catch (java.lang.NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static java.lang.reflect.Method EZpvd(java.lang.Class cls) {
        try {
            return cls.getMethod("getInstance", android.content.Context.class);
        } catch (java.lang.NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }
}
