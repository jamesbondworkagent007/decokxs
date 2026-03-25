package o;

import android.os.Handler;
import com.okinc.lib.utils.commmon.ReflectUtils;

/* JADX INFO: loaded from: classes9.dex */
public class pJY implements Handler.Callback {
    public final android.os.Handler KWHzl;
    public final Handler.Callback copydefault;

    public pJY(Handler.Callback callback, android.os.Handler handler) {
        this.copydefault = callback;
        this.KWHzl = handler;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@androidx.annotation.NonNull android.os.Message message) throws java.lang.Exception {
        int iEZpvd;
        Handler.Callback callback;
        try {
            iEZpvd = EZpvd(message);
            callback = this.copydefault;
        } catch (android.util.AndroidRuntimeException e) {
            java.lang.String message2 = e.getMessage();
            if (message2 != null && (message2.contains("ClassNotFoundException when unmarshalling: com.airbnb.lottie.LottieAnimationView$SavedState") || message2.contains("Activity {com.okinc.okex.gp/com.okinc.core.ok_app.homepage.ui.welcome.WelcomeActivity} did not call through to super.onCreate()"))) {
                pUX.OLrzqt.AEQbTJ(e);
            } else {
                throw e;
            }
        } catch (java.lang.IllegalArgumentException e2) {
            java.lang.String message3 = e2.getMessage();
            if (message3 == null || !(message3.contains("ActivityRecord not found") || message3.contains("Activity client record must not be null"))) {
                throw e2;
            }
            return true;
        } catch (java.lang.NullPointerException e3) {
            java.lang.String message4 = e3.getMessage();
            if (message4 == null || !(message4.contains("peekDecorView()") || message4.contains("ActivityClientRecord") || message4.contains("wm.Task") || message4.contains("SplashScreenView"))) {
                throw e3;
            }
            return true;
        } catch (java.lang.Exception e4) {
            pUU.EZpvd("ProxyHandlerCallback", "Exception: " + e4.getMessage());
            if ("CannotDeliverBroadcastException".equals(e4.getClass().getSimpleName())) {
                pUX.OLrzqt.AEQbTJ(e4);
            } else {
                throw e4;
            }
        }
        if (callback != null && callback.handleMessage(message)) {
            copydefault(iEZpvd);
            return true;
        }
        this.KWHzl.handleMessage(message);
        copydefault(iEZpvd);
        return true;
    }

    public final int EZpvd(android.os.Message message) {
        int i = message.what;
        if (i == 100) {
            pJI.KWHzl().djBIcL();
            pJW.copydefault();
        } else if (i == 101) {
            pJI.KWHzl().AhwBna();
        } else if (i == 159) {
            return AEQbTJ(message);
        }
        return message.what;
    }

    public final void copydefault(int i) {
        if (i == 100) {
            pJI.KWHzl().AYXKKw();
        } else {
            if (i != 101) {
                return;
            }
            pJI.KWHzl().gEmmrt();
        }
    }

    public final int AEQbTJ(android.os.Message message) {
        java.lang.Object objAEQbTJ = ReflectUtils.copydefault(message.obj).valueOf("getLifecycleStateRequest").AEQbTJ();
        if (objAEQbTJ != null) {
            java.lang.String canonicalName = objAEQbTJ.getClass().getCanonicalName();
            if (android.text.TextUtils.equals(canonicalName, "android.app.servertransaction.ResumeActivityItem")) {
                pJI.KWHzl().djBIcL();
                pJW.copydefault();
                return 100;
            }
            if (android.text.TextUtils.equals(canonicalName, "android.app.servertransaction.PauseActivityItem")) {
                pJI.KWHzl().djBIcL();
                return 101;
            }
        }
        return message.what;
    }
}
