package o;

import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yoC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57740yoC {
    public final C57745yoH EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57745yoH OLrzqt() {
        return this.EZpvd;
    }

    public C57740yoC(C57745yoH c57745yoH, boolean z, boolean z2) {
        this.OLrzqt = z;
        this.KWHzl = z2;
        this.EZpvd = c57745yoH;
    }

    public C57740yoC(android.content.Context context, C57789yoz c57789yoz, JSONObject jSONObject, boolean z, boolean z2, java.lang.Long l) {
        this.OLrzqt = z;
        this.KWHzl = z2;
        this.EZpvd = OLrzqt(context, c57789yoz, jSONObject, l);
    }

    public final C57745yoH OLrzqt(android.content.Context context, C57789yoz c57789yoz, JSONObject jSONObject, java.lang.Long l) {
        C57745yoH c57745yoH = new C57745yoH(context);
        c57745yoH.AEQbTJ(jSONObject);
        c57745yoH.copydefault(l);
        c57745yoH.OLrzqt(this.OLrzqt);
        c57745yoH.KWHzl(c57789yoz);
        return c57745yoH;
    }

    public void AEQbTJ(C57789yoz c57789yoz, @androidx.annotation.Nullable C57789yoz c57789yoz2) {
        if (c57789yoz2 != null) {
            boolean zEZpvd = OSUtils.EZpvd(c57789yoz2.EZpvd());
            boolean zKWHzl = KWHzl();
            if (zEZpvd && zKWHzl) {
                this.EZpvd.KWHzl(c57789yoz2);
                C57692ynH.OLrzqt(this, this.KWHzl);
            } else {
                copydefault(c57789yoz);
            }
            if (this.OLrzqt) {
                OSUtils.OLrzqt(100);
                return;
            }
            return;
        }
        copydefault(c57789yoz);
    }

    public final void copydefault(C57789yoz c57789yoz) {
        this.EZpvd.KWHzl(c57789yoz);
        if (this.OLrzqt) {
            C57692ynH.AEQbTJ(this.EZpvd);
            return;
        }
        this.EZpvd.KWHzl(false);
        C57692ynH.copydefault(this.EZpvd, true, false);
        OneSignal.KWHzl(this.EZpvd);
    }

    public boolean KWHzl() {
        if (OneSignal.QOLQEE().values()) {
            return this.EZpvd.valueOf().djBIcL() + ((long) this.EZpvd.valueOf().AkhnZx()) > OneSignal.aKErDB().KWHzl() / 1000;
        }
        return true;
    }

    public C57746yoI copydefault() {
        return new C57746yoI(this, this.EZpvd.valueOf());
    }

    public static void KWHzl(android.content.Context context) {
        java.lang.String strOLrzqt = OSUtils.OLrzqt(context, "com.onesignal.NotificationServiceExtension");
        if (strOLrzqt == null) {
            OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.VERBOSE, "No class found, not setting up OSRemoteNotificationReceivedHandler");
            return;
        }
        OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.VERBOSE, "Found class: " + strOLrzqt + ", attempting to call constructor");
        try {
            java.lang.Object objNewInstance = java.lang.Class.forName(strOLrzqt).newInstance();
            if ((objNewInstance instanceof OneSignal.SharedElementCallback) && OneSignal.finit == null) {
                OneSignal.OLrzqt((OneSignal.SharedElementCallback) objNewInstance);
            }
        } catch (java.lang.ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.lang.IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (java.lang.InstantiationException e3) {
            e3.printStackTrace();
        }
    }

    public java.lang.String toString() {
        return "OSNotificationController{notificationJob=" + this.EZpvd + ", isRestoring=" + this.OLrzqt + ", isBackgroundLogic=" + this.KWHzl + AbstractJsonLexerKt.END_OBJ;
    }
}
