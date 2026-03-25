package o;

import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import o.InterfaceC57841ypy;

/* JADX INFO: renamed from: o.ypE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57795ypE implements InterfaceC57841ypy {
    public static int AEQbTJ = 10000;
    public static int KWHzl = 5;
    public boolean EZpvd;
    public InterfaceC57841ypy.Activity OLrzqt;
    public java.lang.Thread copydefault;

    public abstract java.lang.String EZpvd();

    public abstract java.lang.String OLrzqt(java.lang.String str) throws java.lang.Throwable;

    @Override // o.InterfaceC57841ypy
    public void EZpvd(android.content.Context context, java.lang.String str, InterfaceC57841ypy.Activity activity) {
        this.OLrzqt = activity;
        if (EZpvd(str, activity)) {
            copydefault(str);
        }
    }

    public final void copydefault(java.lang.String str) {
        try {
            if (OSUtils.AkhnZx()) {
                KWHzl(str);
            } else {
                C57732ynv.AEQbTJ();
                OneSignal.KWHzl(OneSignal.LOG_LEVEL.ERROR, "'Google Play services' app not installed or disabled on the device.");
                this.OLrzqt.copydefault(null, -7);
            }
        } catch (java.lang.Throwable th) {
            OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Could not register with " + EZpvd() + " due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
            this.OLrzqt.copydefault(null, -8);
        }
    }

    public final void KWHzl(final java.lang.String str) {
        synchronized (this) {
            java.lang.Thread thread = this.copydefault;
            if (thread == null || !thread.isAlive()) {
                java.lang.Thread thread2 = new java.lang.Thread(new java.lang.Runnable() { // from class: o.ypE.4
                    @Override // java.lang.Runnable
                    public void run() {
                        int i = 0;
                        while (i < AbstractC57795ypE.KWHzl && !AbstractC57795ypE.this.KWHzl(str, i)) {
                            i++;
                            OSUtils.OLrzqt(AbstractC57795ypE.AEQbTJ * i);
                        }
                    }
                });
                this.copydefault = thread2;
                thread2.start();
            }
        }
    }

    public final boolean KWHzl(java.lang.String str, int i) {
        try {
            java.lang.String strOLrzqt = OLrzqt(str);
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.INFO, "Device registered, push token = " + strOLrzqt);
            this.OLrzqt.copydefault(strOLrzqt, 1);
            return true;
        } catch (java.io.IOException e) {
            int iKWHzl = KWHzl(e);
            java.lang.String strOLrzqt2 = OSUtils.OLrzqt(e);
            if ("SERVICE_NOT_AVAILABLE".equals(strOLrzqt2) || "AUTHENTICATION_FAILED".equals(strOLrzqt2)) {
                java.lang.Exception exc = new java.lang.Exception(e);
                if (i >= KWHzl - 1) {
                    OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Retry count of " + KWHzl + " exceed! Could not get a " + EZpvd() + " Token.", exc);
                    return false;
                }
                OneSignal.OLrzqt(OneSignal.LOG_LEVEL.INFO, "'Google Play services' returned " + strOLrzqt2 + " error. Current retry count: " + i, exc);
                if (i != 2) {
                    return false;
                }
                this.OLrzqt.copydefault(null, iKWHzl);
                this.EZpvd = true;
                return true;
            }
            java.lang.Exception exc2 = new java.lang.Exception(e);
            OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Error Getting " + EZpvd() + " Token", exc2);
            if (!this.EZpvd) {
                this.OLrzqt.copydefault(null, iKWHzl);
            }
            return true;
        } catch (java.lang.Throwable th) {
            java.lang.Exception exc3 = new java.lang.Exception(th);
            int iKWHzl2 = KWHzl(th);
            OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Unknown error getting " + EZpvd() + " Token", exc3);
            this.OLrzqt.copydefault(null, iKWHzl2);
            return true;
        }
    }

    public static int KWHzl(java.lang.Throwable th) {
        java.lang.String strOLrzqt = OSUtils.OLrzqt(th);
        if (!(th instanceof java.io.IOException)) {
            return -12;
        }
        if ("SERVICE_NOT_AVAILABLE".equals(strOLrzqt)) {
            return -9;
        }
        return "AUTHENTICATION_FAILED".equals(strOLrzqt) ? -29 : -11;
    }

    public final boolean EZpvd(java.lang.String str, InterfaceC57841ypy.Activity activity) {
        try {
            java.lang.Float.parseFloat(str);
            return true;
        } catch (java.lang.Throwable unused) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.ERROR, "Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.");
            activity.copydefault(null, -6);
            return false;
        }
    }
}
