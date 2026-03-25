package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.icB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24346icB extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public hEG OLrzqt;
    public Function0<Unit> copydefault;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX
    public float getHeightScale() {
        return 0.99f;
    }

    /* JADX INFO: renamed from: o.icB$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.icB.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C24346icB AEQbTJ(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
            Intrinsics.checkNotNullParameter(function0, "");
            C24346icB c24346icB = new C24346icB();
            android.os.Bundle bundle = new android.os.Bundle();
            c24346icB.copydefault = function0;
            bundle.putParcelable("dexMultiTokenInfoBean", dexMultiTokenInfoBean);
            c24346icB.setArguments(bundle);
            return c24346icB;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(5);
        c52781wYc.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.OnBackPressedCallback));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        android.widget.FrameLayout root;
        android.widget.FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        hEG hegCopydefault = hEG.copydefault(getCustomLayoutInflater(), constraintLayout, true);
        this.OLrzqt = hegCopydefault;
        if (hegCopydefault != null && (frameLayout = hegCopydefault.KWHzl) != null) {
            android.os.Bundle arguments = getArguments();
            getChildFragmentManager().beginTransaction().add(frameLayout.getId(), C24393icw.Companion.EZpvd(arguments != null ? (DexMultiTokenInfoBean) arguments.getParcelable("dexMultiTokenInfoBean") : null)).commitAllowingStateLoss();
        }
        hEG heg = this.OLrzqt;
        if (heg != null && (root = heg.getRoot()) != null) {
            root.setContentDescription("web3_dex_third_party_token_risk_dialog");
        }
        constraintLayout.post(new java.lang.Runnable() { // from class: o.icE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C24346icB.AEQbTJ(this.OLrzqt);
            }
        });
    }

    public static final void AEQbTJ(C24346icB c24346icB) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c24346icB, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.setRccState));
        wyf.setOnClickListener(new View.OnClickListener() { // from class: o.icy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C24346icB.KWHzl(this.OLrzqt, view);
            }
        });
        wyf.setContentDescription("web3_dex_third_party_token_risk_ok_button");
    }

    public static final void KWHzl(C24346icB c24346icB, android.view.View view) {
        Function0<Unit> function0 = c24346icB.copydefault;
        if (function0 != null) {
            if (function0 == null) {
                Intrinsics.gEmmrt("");
                function0 = null;
            }
            function0.invoke();
        } else {
            C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.heceqZ), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        }
        c24346icB.dismissAllowingStateLoss();
    }
}
