package o;

import com.okinc.lifecycle.api.business.shortlink.ShortLinkFailureReason;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public abstract class pKG {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pKG.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ pKG(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class ActionBar extends pKG {
        public final java.util.Map<java.lang.String, java.lang.String> EZpvd;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.OLrzqt = str;
            this.EZpvd = map;
        }
    }

    private pKG() {
    }

    public static final class StateListAnimator extends pKG {
        public final ShortLinkFailureReason KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ShortLinkFailureReason AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull ShortLinkFailureReason shortLinkFailureReason) {
            super(null);
            Intrinsics.checkNotNullParameter(shortLinkFailureReason, "");
            this.KWHzl = shortLinkFailureReason;
        }
    }
}
