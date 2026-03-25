package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.ok_kyc_core.util.CdnResourceType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pSo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C38270pSo extends wXX {
    public AbstractC45514srU EZpvd;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.pSo$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pSo.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C38270pSo newInstance$default(StateListAnimator stateListAnimator, android.os.Bundle bundle, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bundle = null;
            }
            return stateListAnimator.KWHzl(bundle);
        }

        public final C38270pSo KWHzl(android.os.Bundle bundle) {
            C38270pSo c38270pSo = new C38270pSo();
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            c38270pSo.setArguments(bundle);
            return c38270pSo;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setDynamicFullScreen(true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(4);
        wxq.setCloseVisibility(true);
        wxq.AEQbTJ().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new TaskDescription(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        C52794wYp c52794wYp;
        android.widget.ImageView imageView;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC45514srU abstractC45514srUCopydefault = AbstractC45514srU.copydefault(getLayoutInflater(), constraintLayout, true);
        this.EZpvd = abstractC45514srUCopydefault;
        if (abstractC45514srUCopydefault != null && (imageView = abstractC45514srUCopydefault.AEQbTJ) != null) {
            C33054mpH.EZpvd(imageView, C42458rTp.OLrzqt("images/compliance/selfie_guide_learn_more.png", C32979mnm.EZpvd.OLrzqt(), CdnResourceType.Images, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        }
        AbstractC45514srU abstractC45514srU = this.EZpvd;
        if (abstractC45514srU == null || (c52794wYp = abstractC45514srU.EZpvd) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.EZpvd = null;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: o.pSo$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C38270pSo EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C38270pSo c38270pSo) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = c38270pSo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.pSo$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C38270pSo EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C38270pSo c38270pSo) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c38270pSo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }
}
