package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pMW implements InterfaceC2678AVa {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final pMM KWHzl;

    public pMW(@NotNull pMM pmm) {
        Intrinsics.checkNotNullParameter(pmm, "");
        this.KWHzl = pmm;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pMW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.InterfaceC2678AVa
    public java.lang.String copydefault() {
        android.net.Uri referrer;
        java.lang.String string;
        android.content.Context contextOLrzqt = this.KWHzl.OLrzqt();
        android.app.Activity activity = contextOLrzqt instanceof android.app.Activity ? (android.app.Activity) contextOLrzqt : null;
        return (activity == null || (referrer = activity.getReferrer()) == null || (string = referrer.toString()) == null) ? "" : string;
    }

    @Override // o.InterfaceC2678AVa
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context contextCopydefault = this.KWHzl.copydefault();
        if (contextCopydefault == null) {
            pUU.copydefault("CoreLinkExecutionHelper", "openLink failed - missing context");
            return;
        }
        try {
            contextCopydefault.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)));
        } catch (java.lang.Exception e) {
            pUU.copydefault("CoreLinkExecutionHelper", "openLink failed - " + e.getMessage());
        }
    }

    @Override // o.InterfaceC2678AVa
    public void KWHzl() {
        this.KWHzl.KWHzl();
    }
}
