package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.okinc.dapp.bean.VibeFeedsParamsBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dtS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14860dtS extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public AbstractC13469dMm OLrzqt;

    /* JADX INFO: renamed from: o.dtS$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dtS.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C14860dtS AEQbTJ(@NotNull VibeFeedsParamsBean vibeFeedsParamsBean) {
            Intrinsics.checkNotNullParameter(vibeFeedsParamsBean, "");
            C14860dtS c14860dtS = new C14860dtS();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("PARAMS_KEY_BEAN", vibeFeedsParamsBean);
            c14860dtS.setArguments(bundle);
            return c14860dtS;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.OLrzqt = (AbstractC13469dMm) DataBindingUtil.inflate(getCustomLayoutInflater(), dLX.Fragment.djBIcL, constraintLayout, true);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            VibeFeedsParamsBean vibeFeedsParamsBean = (VibeFeedsParamsBean) arguments.getParcelable("PARAMS_KEY_BEAN");
            C14858dtQ c14858dtQAEQbTJ = vibeFeedsParamsBean != null ? C14858dtQ.Companion.AEQbTJ(vibeFeedsParamsBean) : null;
            if (c14858dtQAEQbTJ != null) {
                getChildFragmentManager().beginTransaction().replace(dLX.Application.aKErDB, c14858dtQAEQbTJ).commitAllowingStateLoss();
            }
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.widget.FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        android.widget.FrameLayout frameLayout2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC13469dMm abstractC13469dMm = this.OLrzqt;
        if (abstractC13469dMm == null || (frameLayout = abstractC13469dMm.copydefault) == null || (layoutParams = frameLayout.getLayoutParams()) == null) {
            return;
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        java.lang.Object systemService = requireContext().getSystemService("window");
        Intrinsics.copydefault(systemService, "");
        ((android.view.WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        layoutParams.height = (int) (((double) displayMetrics.heightPixels) * 0.75d);
        AbstractC13469dMm abstractC13469dMm2 = this.OLrzqt;
        if (abstractC13469dMm2 == null || (frameLayout2 = abstractC13469dMm2.copydefault) == null) {
            return;
        }
        frameLayout2.setLayoutParams(layoutParams);
    }
}
