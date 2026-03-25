package o;

import com.okinc.core.util.SPUtils;
import com.okinc.okuser.data.User;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lUb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30322lUb {
    public final InterfaceC47278tmy OLrzqt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    public C30322lUb(@NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.OLrzqt = interfaceC47278tmy;
    }

    public final boolean OLrzqt() {
        return SPUtils.getBoolean(EZpvd(), false);
    }

    public final void KWHzl() {
        SPUtils.put(EZpvd(), java.lang.Boolean.TRUE);
    }

    public final java.lang.String EZpvd() {
        User userOLrzqt = this.OLrzqt.OLrzqt();
        java.lang.String uid = userOLrzqt != null ? userOLrzqt.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        return "bsc_has_agreed_large_quote_bottom_sheet" + mHQ.KWHzl.AEQbTJ(uid);
    }

    /* JADX INFO: renamed from: o.lUb$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lUb.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
