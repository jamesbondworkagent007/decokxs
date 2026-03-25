package o;

import androidx.core.os.BundleCompat;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.icw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24393icw extends androidx.fragment.app.Fragment {
    public C21492hBj OLrzqt;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.icw$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.icw.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C24393icw EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
            C24393icw c24393icw = new C24393icw();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("dexMultiTokenInfoBean", dexMultiTokenInfoBean);
            c24393icw.setArguments(bundle);
            return c24393icw;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21492hBj c21492hBjAEQbTJ = C21492hBj.AEQbTJ(layoutInflater, viewGroup, false);
        this.OLrzqt = c21492hBjAEQbTJ;
        if (c21492hBjAEQbTJ != null) {
            return c21492hBjAEQbTJ.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        OLrzqt();
        view.post(new java.lang.Runnable() { // from class: o.icz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C24393icw.EZpvd(this.copydefault);
            }
        });
    }

    public static final void EZpvd(C24393icw c24393icw) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c24393icw, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void OLrzqt() {
        C21492hBj c21492hBj;
        android.os.Bundle arguments = getArguments();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = arguments != null ? (DexMultiTokenInfoBean) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "dexMultiTokenInfoBean", DexMultiTokenInfoBean.class)) : null;
        if (dexMultiTokenInfoBean == null || (c21492hBj = this.OLrzqt) == null) {
            return;
        }
        c21492hBj.copydefault.setText(dexMultiTokenInfoBean.getTokenSymbol());
        c21492hBj.EZpvd.setText(dexMultiTokenInfoBean.getTokenName());
        c21492hBj.OLrzqt.setText(dexMultiTokenInfoBean.getOriginContractAddress());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) dexMultiTokenInfoBean.getSource())) {
            c21492hBj.AhwBna.setText(dexMultiTokenInfoBean.getSource());
        } else {
            c21492hBj.isConnected.setVisibility(8);
        }
        android.widget.ImageView imageView = c21492hBj.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C25386ivj.loadImageWithBorder$default(imageView, dexMultiTokenInfoBean.getTokenLogoUrl(), null, 2, null);
        android.widget.ImageView imageView2 = c21492hBj.valueOf;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        C25386ivj.loadImageWithBorder$default(imageView2, dexMultiTokenInfoBean.getChainBWLogoUrl(), null, 2, null);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) dexMultiTokenInfoBean.getSourceLogo())) {
            c21492hBj.values.setVisibility(0);
            android.widget.ImageView imageView3 = c21492hBj.values;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            java.lang.String sourceLogo = dexMultiTokenInfoBean.getSourceLogo();
            C25386ivj.loadImageWithBorder$default(imageView3, sourceLogo != null ? sourceLogo : "", null, 2, null);
        } else {
            c21492hBj.values.setVisibility(8);
        }
        KWHzl(dexMultiTokenInfoBean);
    }

    public final void KWHzl(final DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        C21492hBj c21492hBj = this.OLrzqt;
        if (c21492hBj != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(c21492hBj.AEQbTJ, 0L, new Function1() { // from class: o.icA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24393icw.OLrzqt(this.copydefault, dexMultiTokenInfoBean, (android.view.View) obj);
                }
            }, 1, null);
            C25352ivB.setOnDoubleCheckClickListener$default(c21492hBj.OLrzqt, 0L, new Function1() { // from class: o.icC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24393icw.KWHzl(this.KWHzl, dexMultiTokenInfoBean, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit OLrzqt(C24393icw c24393icw, DexMultiTokenInfoBean dexMultiTokenInfoBean, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C33570myu.EZpvd(c24393icw.getContext(), dexMultiTokenInfoBean.getOriginContractAddress());
        C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.DGOPHZDGOPHZ), C33070mpX.KWHzl(C52761wXj.TaskDescription.FYtjSf), 0, (java.lang.Integer) null, 0, 0, 60, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C24393icw c24393icw, DexMultiTokenInfoBean dexMultiTokenInfoBean, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c24393icw.EZpvd(dexMultiTokenInfoBean);
        return Unit.INSTANCE;
    }

    public final void EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        C25352ivB.KWHzl(requireContext(), dexMultiTokenInfoBean.getExplorerUrl());
    }
}
