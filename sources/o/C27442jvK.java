package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.ui.widget.risk.InvestRiskRatingModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27442jvK extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public AbstractC23819iKm copydefault;

    /* JADX INFO: renamed from: o.jvK$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jvK.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C27442jvK copydefault(java.util.ArrayList<InvestRiskRatingModel> arrayList) {
            C27442jvK c27442jvK = new C27442jvK();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("riskRating", arrayList);
            c27442jvK.setArguments(bundle);
            return c27442jvK;
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.copydefault = AbstractC23819iKm.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setCloseVisibility(false);
        wxq.AYXKKw().setPaddingRelative(0, 0, 0, 0);
        wxq.setTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DGUQLI));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (arrayList = arguments.getParcelableArrayList("riskRating")) == null) {
            arrayList = new java.util.ArrayList();
        }
        AbstractC23819iKm abstractC23819iKm = this.copydefault;
        AbstractC23819iKm abstractC23819iKm2 = null;
        if (abstractC23819iKm == null) {
            Intrinsics.gEmmrt("");
            abstractC23819iKm = null;
        }
        abstractC23819iKm.KWHzl.setData(arrayList);
        AbstractC23819iKm abstractC23819iKm3 = this.copydefault;
        if (abstractC23819iKm3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23819iKm2 = abstractC23819iKm3;
        }
        abstractC23819iKm2.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.jvI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C27442jvK.copydefault(this.KWHzl, view2);
            }
        });
    }

    public static final void copydefault(C27442jvK c27442jvK, android.view.View view) {
        c27442jvK.dismissAllowingStateLoss();
    }
}
