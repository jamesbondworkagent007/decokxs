package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aIS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6071aIS extends AbstractC6088aIj {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int gEmmrt = 8;
    public Function0<Unit> AYXKKw;

    /* JADX INFO: renamed from: o.aIS$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aIS.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.aIS$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C6071aIS newInstance$default(ActionBar actionBar, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            return actionBar.copydefault(function0);
        }

        public final C6071aIS copydefault(Function0<Unit> function0) {
            C6071aIS c6071aIS = new C6071aIS();
            c6071aIS.AYXKKw = function0;
            return c6071aIS;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(0);
        setCancelable(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C5665aAk c5665aAkAEQbTJ = C5665aAk.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        android.widget.ImageView imageView = c5665aAkAEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C33054mpH.EZpvd(imageView, C43454rpb.copydefault("images/auth/common/passkey/okx_passkey_upgrade.webp", contextRequireContext, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        C52794wYp c52794wYp = c5665aAkAEQbTJ.EZpvd;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    /* JADX INFO: renamed from: o.aIS$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C6071aIS KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C6071aIS c6071aIS) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c6071aIS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
                Function0 function0 = this.KWHzl.AYXKKw;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
