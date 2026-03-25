package o;

import com.okinc.base.utils.commmon.ThreadUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.ahg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7324ahg {
    public static ActionBar AYXKKw;
    public static Activity EZpvd;
    public static Pattern OLrzqt;
    public static final java.util.List<Application> KWHzl = new java.util.ArrayList();
    public static int AhwBna = 9332;
    public static java.lang.String djBIcL = null;
    public static int gEmmrt = 0;
    public static int copydefault = 0;
    public static int AEQbTJ = 0;

    /* JADX INFO: renamed from: o.ahg$Activity */
    public interface Activity {
        void OLrzqt(boolean z);
    }

    /* JADX INFO: renamed from: o.ahg$Application */
    public interface Application {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int AEQbTJ() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean copydefault(boolean z) {
        int i = z ? 1 : 2;
        return (copydefault & i) == i;
    }

    public static void EZpvd(java.lang.String str) {
        C7262agX.AEQbTJ().OLrzqt(str);
    }

    public static java.lang.String KWHzl() {
        return C7262agX.AEQbTJ().copydefault();
    }

    public static java.io.File copydefault() {
        java.io.File file = new java.io.File(C7864arq.OLrzqt(), "LuaHotReload");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static java.lang.String OLrzqt(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        if (OLrzqt == null) {
            OLrzqt = Pattern.compile("(\".*\")]");
        }
        Matcher matcher = OLrzqt.matcher(str);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iEnd = 0;
        while (matcher.find(iEnd)) {
            sb.append(str.substring(iEnd, matcher.start()));
            sb.append(C60048zuX.OLrzqt(matcher.group().substring(0, r3.length() - 2), '.', java.io.File.separatorChar));
            sb.append(".lua\"]");
            iEnd = matcher.end();
        }
        sb.append(str.substring(iEnd));
        return sb.toString();
    }

    public static void AEQbTJ(java.lang.String str) {
        C7262agX.AEQbTJ().AEQbTJ(OLrzqt(str));
    }

    public static void copydefault(java.lang.String str) {
        C7262agX.AEQbTJ().copydefault(str);
    }

    /* JADX INFO: renamed from: o.ahg$ActionBar */
    public static final class ActionBar implements InterfaceC7319ahb {
        public final AtomicInteger EZpvd;
        public final AtomicInteger KWHzl;
        public final ExecutorService OLrzqt;
        public final ExecutorService copydefault;

        private ActionBar() {
            this.OLrzqt = ThreadUtils.djBIcL();
            this.copydefault = ThreadUtils.gEmmrt();
            this.KWHzl = new AtomicInteger(0);
            this.EZpvd = new AtomicInteger(0);
        }
    }

    public static void AEQbTJ(Application application) {
        if (C7326ahi.EZpvd) {
            java.util.List<Application> list = KWHzl;
            if (!list.contains(application)) {
                list.add(application);
            }
            EZpvd(true);
        }
    }

    public static void KWHzl(Application application) {
        if (C7326ahi.EZpvd) {
            KWHzl.remove(application);
        }
    }

    public static void EZpvd(int i) {
        if (C7326ahi.EZpvd) {
            if (AhwBna != i || !copydefault(true)) {
                AhwBna = i;
                C7262agX.AEQbTJ().OLrzqt(i);
            } else {
                Activity activity = EZpvd;
                if (activity != null) {
                    activity.OLrzqt(true ^ KWHzl.isEmpty());
                }
            }
        }
    }

    public static void EZpvd(boolean z) {
        int i = AEQbTJ;
        if ((i == 1 || i == 2) && copydefault(z)) {
            return;
        }
        if (AYXKKw == null) {
            AYXKKw = new ActionBar();
            C7262agX.AEQbTJ().KWHzl(AYXKKw);
        }
        AEQbTJ = 1;
        if (z) {
            C7262agX.AEQbTJ().KWHzl();
        } else {
            C7262agX.AEQbTJ().OLrzqt(djBIcL, gEmmrt);
        }
    }
}
