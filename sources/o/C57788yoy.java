package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.onesignal.OSNotificationWorkManager;
import com.onesignal.OneSignal;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yoy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57788yoy extends C57709ynY {
    public final InterfaceC57738yoA AEQbTJ;
    public final C57830ypn copydefault;

    /* JADX INFO: renamed from: o.yoy$Application */
    /* JADX INFO: loaded from: classes17.dex */
    public interface Application {
        void EZpvd(boolean z);
    }

    public C57788yoy(C57830ypn c57830ypn, InterfaceC57738yoA interfaceC57738yoA) {
        this.copydefault = c57830ypn;
        this.AEQbTJ = interfaceC57738yoA;
    }

    public void EZpvd() {
        KWHzl();
    }

    public final void KWHzl() {
        AEQbTJ(new RunnableC57717yng() { // from class: o.yoy.5
            @Override // o.RunnableC57717yng, java.lang.Runnable
            public void run() {
                super.run();
                C57788yoy.this.copydefault.AEQbTJ(RemoteMessageConst.NOTIFICATION, "created_time < ?", new java.lang.String[]{java.lang.String.valueOf((OneSignal.aKErDB().KWHzl() / 1000) - 604800)});
            }
        }, "OS_NOTIFICATIONS_THREAD");
    }

    public void EZpvd(final int i, final WeakReference<android.content.Context> weakReference) {
        AEQbTJ(new RunnableC57717yng() { // from class: o.yoy.1
            @Override // o.RunnableC57717yng, java.lang.Runnable
            public void run() {
                super.run();
                android.content.Context context = (android.content.Context) weakReference.get();
                if (context == null) {
                    return;
                }
                java.lang.String str = "android_notification_id = " + i + " AND opened = 0 AND dismissed = 0";
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("dismissed", (java.lang.Integer) 1);
                if (C57788yoy.this.copydefault.AEQbTJ(RemoteMessageConst.NOTIFICATION, contentValues, str, null) > 0) {
                    C57707ynW.AEQbTJ(context, C57788yoy.this.copydefault, i);
                }
                C57719yni.EZpvd(C57788yoy.this.copydefault, context);
                C57836ypt.KWHzl(context).cancel(i);
            }
        }, "OS_NOTIFICATIONS_THREAD");
    }

    public void EZpvd(@androidx.annotation.Nullable JSONObject jSONObject, @androidx.annotation.NonNull Application application) {
        java.lang.String strAEQbTJ = C57743yoF.AEQbTJ(jSONObject);
        if (strAEQbTJ == null) {
            this.AEQbTJ.OLrzqt("Notification notValidOrDuplicated with id null");
            application.EZpvd(true);
        } else {
            KWHzl(strAEQbTJ, application);
        }
    }

    public final void KWHzl(final java.lang.String str, @androidx.annotation.NonNull final Application application) {
        if (str == null || "".equals(str)) {
            application.EZpvd(false);
        } else if (!OSNotificationWorkManager.KWHzl(str)) {
            this.AEQbTJ.OLrzqt("Notification notValidOrDuplicated with id duplicated");
            application.EZpvd(true);
        } else {
            AEQbTJ(new RunnableC57717yng() { // from class: o.yoy.3
                @Override // o.RunnableC57717yng, java.lang.Runnable
                public void run() {
                    boolean z;
                    super.run();
                    android.database.Cursor cursorKWHzl = C57788yoy.this.copydefault.KWHzl(RemoteMessageConst.NOTIFICATION, new java.lang.String[]{MTPushConstants.Message.KEY_NOTIFICATION_ID}, "notification_id = ?", new java.lang.String[]{str}, null, null, null);
                    boolean zMoveToFirst = cursorKWHzl.moveToFirst();
                    cursorKWHzl.close();
                    if (zMoveToFirst) {
                        C57788yoy.this.AEQbTJ.OLrzqt("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + str);
                        z = true;
                    } else {
                        z = false;
                    }
                    application.EZpvd(z);
                }
            }, "OS_NOTIFICATIONS_THREAD");
        }
    }
}
