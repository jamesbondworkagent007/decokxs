package o;

import com.okinc.im.config.ImEnabledStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ntp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35360ntp {
    public static final C35360ntp EZpvd = new C35360ntp();

    private C35360ntp() {
    }

    public final Activity EZpvd() {
        if (valueOf()) {
            pUU.copydefault("IMDeeplinkRestrictionChecker", "Deeplink blocked: Demo/Simulator trading mode");
            return Activity.Application.KWHzl;
        }
        return Activity.ActionBar.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [48=7] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r3.equals("im/addRelation") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r3.equals("im/addContacts") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r3.equals("im/notifyChat") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (r3.equals("im/conversationList") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return AEQbTJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return o.C35360ntp.Activity.ActionBar.AEQbTJ;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Activity AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1983550666:
                if (str.equals("im/paidGroupPaymentDashboard")) {
                    return AhwBna();
                }
                pUU.copydefault("IMDeeplinkRestrictionChecker", "Unknown deeplink path: " + str);
                return Activity.ActionBar.AEQbTJ;
            case -1272118163:
                if (str.equals("im/reviewGroupApplicants")) {
                    return copydefault();
                }
                pUU.copydefault("IMDeeplinkRestrictionChecker", "Unknown deeplink path: " + str);
                return Activity.ActionBar.AEQbTJ;
            case -715577012:
                break;
            case 719763468:
                break;
            case 797600600:
                if (str.equals("im/newConversation")) {
                    return djBIcL();
                }
                pUU.copydefault("IMDeeplinkRestrictionChecker", "Unknown deeplink path: " + str);
                return Activity.ActionBar.AEQbTJ;
            case 900610834:
                if (str.equals("im/leaderboard")) {
                    return OLrzqt();
                }
                pUU.copydefault("IMDeeplinkRestrictionChecker", "Unknown deeplink path: " + str);
                return Activity.ActionBar.AEQbTJ;
            case 1064951721:
                break;
            case 1077967186:
                break;
            case 1207076938:
                if (str.equals("im/joinGroup")) {
                    return KWHzl();
                }
                pUU.copydefault("IMDeeplinkRestrictionChecker", "Unknown deeplink path: " + str);
                return Activity.ActionBar.AEQbTJ;
            default:
                pUU.copydefault("IMDeeplinkRestrictionChecker", "Unknown deeplink path: " + str);
                return Activity.ActionBar.AEQbTJ;
        }
    }

    public final Activity KWHzl() {
        if (AYXKKw()) {
            gEmmrt();
            return Activity.Application.KWHzl;
        }
        if (oGU.KWHzl.AEQbTJ() != ImEnabledStatus.Full) {
            pUU.copydefault("IMDeeplinkRestrictionChecker", "joinGroup blocked: Full IM not enabled");
            return Activity.Application.KWHzl;
        }
        return Activity.ActionBar.AEQbTJ;
    }

    public final Activity AEQbTJ() {
        if (AYXKKw()) {
            gEmmrt();
            return Activity.Application.KWHzl;
        }
        if (oGU.KWHzl.AEQbTJ() != ImEnabledStatus.Full) {
            pUU.copydefault("IMDeeplinkRestrictionChecker", "addRelation/addContacts blocked: Full IM not enabled");
            return Activity.Application.KWHzl;
        }
        return Activity.ActionBar.AEQbTJ;
    }

    public final Activity djBIcL() {
        if (AYXKKw()) {
            gEmmrt();
            return Activity.Application.KWHzl;
        }
        if (oGU.KWHzl.AEQbTJ() != ImEnabledStatus.Full) {
            pUU.copydefault("IMDeeplinkRestrictionChecker", "newConversation blocked: Full IM not enabled");
            return Activity.Application.KWHzl;
        }
        return Activity.ActionBar.AEQbTJ;
    }

    public final Activity copydefault() {
        if (AYXKKw()) {
            gEmmrt();
            return Activity.Application.KWHzl;
        }
        if (oGU.KWHzl.AEQbTJ() != ImEnabledStatus.Full) {
            pUU.copydefault("IMDeeplinkRestrictionChecker", "reviewGroupApplicants blocked: Full IM not enabled");
            return Activity.Application.KWHzl;
        }
        return Activity.ActionBar.AEQbTJ;
    }

    public final Activity AhwBna() {
        if (AYXKKw()) {
            gEmmrt();
            return Activity.Application.KWHzl;
        }
        if (oGU.KWHzl.AEQbTJ() != ImEnabledStatus.Full) {
            pUU.copydefault("IMDeeplinkRestrictionChecker", "paidGroupPaymentDashboard blocked: Full IM not enabled");
            return Activity.Application.KWHzl;
        }
        return Activity.ActionBar.AEQbTJ;
    }

    public final Activity OLrzqt() {
        if (AYXKKw()) {
            gEmmrt();
            return Activity.Application.KWHzl;
        }
        if (oGU.KWHzl.AEQbTJ() != ImEnabledStatus.Full) {
            pUU.copydefault("IMDeeplinkRestrictionChecker", "leaderboard blocked: Full IM not enabled");
            return Activity.Application.KWHzl;
        }
        return Activity.ActionBar.AEQbTJ;
    }

    public final boolean AYXKKw() {
        return C44157sFk.gEmmrt().DbNXlk();
    }

    public final boolean valueOf() {
        return C55697xoo.OLrzqt.AkhnZx();
    }

    public final void gEmmrt() {
        pUU.copydefault("IMDeeplinkRestrictionChecker", "Sub-account not allowed");
        C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C35399nuc.LoaderManager.RVsVBY), 0, 1, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.ntp$Activity */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ntp.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX INFO: renamed from: o.ntp$Activity$ActionBar */
        public static final class ActionBar extends Activity {
            public static final ActionBar AEQbTJ = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.ntp$Activity$Application */
        public static final class Application extends Activity {
            public static final Application KWHzl = new Application();

            private Application() {
                super(null);
            }
        }
    }
}
