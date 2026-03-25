package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eUl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15765eUl extends wXX {
    public static final Application Companion = new Application(null);

    /* JADX INFO: renamed from: o.eUl$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eUl.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C15765eUl copydefault(long j, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C15765eUl c15765eUl = new C15765eUl();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("generalChainId", j);
            bundle.putString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str);
            c15765eUl.setArguments(bundle);
            return c15765eUl;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setCloseVisibility(false);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onPrepareSupportNavigateUpTaskStack));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C16613enI c16613enIAEQbTJ = C16613enI.AEQbTJ(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, false);
        Intrinsics.checkNotNullExpressionValue(c16613enIAEQbTJ, "");
        constraintLayout.addView(c16613enIAEQbTJ.getRoot());
        android.os.Bundle arguments = getArguments();
        long j = arguments != null ? arguments.getLong("generalChainId") : -1L;
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string = arguments2 != null ? arguments2.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) : null;
        java.lang.String str = string != null ? string : "";
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(j);
        if (c10854bwMCopydefault == null) {
            return;
        }
        c16613enIAEQbTJ.KWHzl.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.getMaxItemsactivity_release, C56423yEv.EZpvd(C56390yDp.OLrzqt("chainName", c10854bwMCopydefault.djBIcL()))));
        c16613enIAEQbTJ.copydefault.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onPostCreate));
        c16613enIAEQbTJ.EZpvd.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onMenuOpened));
        c16613enIAEQbTJ.copydefault.KWHzl.setText(c10854bwMCopydefault.AEQbTJ(str));
        c16613enIAEQbTJ.EZpvd.KWHzl.setText(str);
        ConstraintLayout root = c16613enIAEQbTJ.copydefault.getRoot();
        C17948fYf c17948fYf = C17948fYf.copydefault;
        root.setSelected(c17948fYf.EZpvd());
        c16613enIAEQbTJ.EZpvd.getRoot().setSelected(!c17948fYf.EZpvd());
        KWHzl(c16613enIAEQbTJ, c17948fYf.EZpvd());
        ConstraintLayout root2 = c16613enIAEQbTJ.copydefault.getRoot();
        root2.setOnClickListener(new ActionBar(root2, 1000L, c16613enIAEQbTJ, this));
        ConstraintLayout root3 = c16613enIAEQbTJ.EZpvd.getRoot();
        root3.setOnClickListener(new TaskDescription(root3, 1000L, c16613enIAEQbTJ, this));
        Glide.EZpvd(this).EZpvd(c10854bwMCopydefault.copydefault()).KWHzl(C52761wXj.TaskDescription.fERRXa).copydefault(C52761wXj.TaskDescription.fERRXa).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(requireContext())).EZpvd((android.widget.ImageView) c16613enIAEQbTJ.copydefault.AYXKKw);
        Glide.EZpvd(this).EZpvd(c10854bwMCopydefault.copydefault()).KWHzl(C52761wXj.TaskDescription.fERRXa).copydefault(C52761wXj.TaskDescription.fERRXa).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(requireContext())).EZpvd((android.widget.ImageView) c16613enIAEQbTJ.EZpvd.AYXKKw);
        android.view.View view = getView();
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.eUh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C15765eUl.KWHzl(this.KWHzl);
                }
            });
        }
    }

    public static final void KWHzl(C15765eUl c15765eUl) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c15765eUl, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void KWHzl(C16613enI c16613enI, boolean z) {
        if (z) {
            C55251xgS c55251xgS = c16613enI.copydefault.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(0);
            C55251xgS c55251xgS2 = c16613enI.EZpvd.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
            c55251xgS2.setVisibility(8);
            return;
        }
        C55251xgS c55251xgS3 = c16613enI.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55251xgS3, "");
        c55251xgS3.setVisibility(8);
        C55251xgS c55251xgS4 = c16613enI.EZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55251xgS4, "");
        c55251xgS4.setVisibility(0);
    }

    public final void EZpvd(boolean z) {
        FragmentKt.setFragmentResult(this, "switchXLayerAddressBottomFragmentRequestKey", BundleKt.bundleOf(C56390yDp.OLrzqt("switchXLayerAddressBottomFragmentResultKey", java.lang.Boolean.valueOf(z))));
    }

    /* JADX INFO: renamed from: o.eUl$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C16613enI AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C15765eUl copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C16613enI c16613enI, C15765eUl c15765eUl) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c16613enI;
            this.copydefault = c15765eUl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.copydefault.getRoot().setSelected(true);
                this.AEQbTJ.EZpvd.getRoot().setSelected(false);
                C17948fYf.copydefault.OLrzqt(true);
                this.copydefault.KWHzl(this.AEQbTJ, true);
                this.copydefault.EZpvd(true);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.eUl$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C16613enI OLrzqt;
        public final /* synthetic */ C15765eUl copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C16613enI c16613enI, C15765eUl c15765eUl) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = c16613enI;
            this.copydefault = c15765eUl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C17948fYf.copydefault.OLrzqt(false);
                this.OLrzqt.EZpvd.getRoot().setSelected(true);
                this.OLrzqt.copydefault.getRoot().setSelected(false);
                this.copydefault.KWHzl(this.OLrzqt, false);
                this.copydefault.EZpvd(false);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }
}
