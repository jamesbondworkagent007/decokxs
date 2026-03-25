package o;

import com.okinc.lifecycle.api.business.shortlink.ShortLinkFailureReason;
import com.okinc.lifecycle.impl.deeplink.core.LinkState;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.NoWhenBranchMatchedException;
import o.InterfaceC43232rlR;

/* JADX INFO: loaded from: classes9.dex */
public final class pLZ {
    public static final InterfaceC43232rlR AEQbTJ = new StateListAnimator();

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ShortLinkFailureReason.values().length];
            try {
                iArr[ShortLinkFailureReason.INVALID_SHORT_LINK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ShortLinkFailureReason.API_FAIL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ShortLinkFailureReason.NO_DEEPLINK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final InterfaceC43232rlR OLrzqt() {
        return AEQbTJ;
    }

    public static final class StateListAnimator implements InterfaceC43232rlR {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43232rlR
        public java.lang.String AEQbTJ() {
            return "ul";
        }

        @Override // o.InterfaceC43232rlR
        public boolean KWHzl() {
            return true;
        }

        @Override // o.InterfaceC43232rlR
        public boolean OLrzqt() {
            return true;
        }

        @Override // o.InterfaceC43232rlR
        public boolean EZpvd() {
            return InterfaceC43232rlR.TaskDescription.OLrzqt(this);
        }

        @Override // o.InterfaceC43232rlR
        public java.util.List<java.lang.String> djBIcL() {
            return InterfaceC43232rlR.TaskDescription.EZpvd(this);
        }

        @Override // o.InterfaceC43232rlR
        public DeeplinkMode copydefault() {
            return DeeplinkMode.APP;
        }
    }

    public static final LinkState AEQbTJ(ShortLinkFailureReason shortLinkFailureReason) {
        int i = Activity.KWHzl[shortLinkFailureReason.ordinal()];
        if (i == 1 || i == 2) {
            return LinkState.SHORTCODE_API_FAILED;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return LinkState.NO_DEEPLINK_PRESENT;
    }
}
