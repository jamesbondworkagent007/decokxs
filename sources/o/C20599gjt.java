package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gjt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20599gjt extends wXX {
    public static final ActionBar Companion = new ActionBar(null);

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX INFO: renamed from: o.gjt$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gjt.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C20599gjt AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C20599gjt c20599gjt = new C20599gjt();
            c20599gjt.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("data", str)));
            return c20599gjt;
        }

        public final boolean copydefault() {
            return SPUtils.getBoolean("aggregationAddressTipsShowKey", true, "aggregationAddressTipsShowFile");
        }

        public final void KWHzl(boolean z) {
            SPUtils.put("aggregationAddressTipsShowKey", java.lang.Boolean.valueOf(z), "aggregationAddressTipsShowFile");
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.gjv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C20599gjt.EZpvd(this.copydefault);
            }
        });
    }

    public static final void EZpvd(C20599gjt c20599gjt) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c20599gjt, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.setDividerVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C16500elB c16500elBCopydefault = C16500elB.copydefault(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, false);
        Intrinsics.checkNotNullExpressionValue(c16500elBCopydefault, "");
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("data") : null;
        if (string == null) {
            string = "";
        }
        c16500elBCopydefault.OLrzqt.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.getOptionsList, C56423yEv.EZpvd(C56390yDp.OLrzqt("chainName", string))));
        c16500elBCopydefault.AEQbTJ.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.putCallback, C56423yEv.EZpvd(C56390yDp.OLrzqt("chainName", string))));
        AppCompatImageView appCompatImageView = c16500elBCopydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        android.content.Context context = c16500elBCopydefault.EZpvd.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C33054mpH.EZpvd(appCompatImageView, C43454rpb.copydefault("images/web3_wallet/android/bg_aggregation_address_tips.webp", context, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : C14726dqr.OLrzqt.OLrzqt(), (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        constraintLayout.addView(c16500elBCopydefault.getRoot());
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(C13754dXa.FragmentManager.DarRvM);
            c52794wYpCopydefault.setOKDSSize(52);
            c52794wYpCopydefault.setOKDSType(257);
            c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, this));
            ViewGroup.LayoutParams layoutParams = c52794wYpCopydefault.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
                c52794wYpCopydefault.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* JADX INFO: renamed from: o.gjt$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C20599gjt copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C20599gjt c20599gjt) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c20599gjt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }
}
