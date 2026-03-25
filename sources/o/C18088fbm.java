package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.wallet.home.bean.QuickCopyAddressItemBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fbm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18088fbm extends wXX implements InterfaceC18090fbo {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public C16538eln AEQbTJ;
    public java.lang.String copydefault = "";

    @Override // o.InterfaceC18090fbo
    public void OLrzqt(int i) {
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return true;
    }

    /* JADX INFO: renamed from: o.fbm$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fbm.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C18088fbm AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C18088fbm c18088fbm = new C18088fbm();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("wallet_id", str);
            c18088fbm.setArguments(bundle);
            return c18088fbm;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsStartIntentSenderForResultCompanion));
        wxq.setDividerVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        wxq.EZpvd().setVisibility(8);
        wxq.KWHzl().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new ActionBar(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("wallet_id")) != null) {
            str = string;
        }
        this.copydefault = str;
        this.AEQbTJ = C16538eln.copydefault(getCustomLayoutInflater(), constraintLayout, true);
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(C13754dXa.ActionBar.dSJNDS, eBD.Companion.OLrzqt(this.copydefault, 1));
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.fbp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C18088fbm.AEQbTJ(this.OLrzqt);
            }
        });
    }

    public static final void AEQbTJ(C18088fbm c18088fbm) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c18088fbm, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.InterfaceC18090fbo
    public void copydefault(@NotNull QuickCopyAddressItemBean quickCopyAddressItemBean) {
        Intrinsics.checkNotNullParameter(quickCopyAddressItemBean, "");
        dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: o.fbm$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C18088fbm EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C18088fbm c18088fbm) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c18088fbm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }
}
