package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.net.bean.EoaWalletInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fPX extends AbstractC52796wYr {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> copydefault;

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fPX.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final fPX EZpvd(@NotNull java.util.ArrayList<EoaWalletInfo> arrayList, @NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(yho, "");
            fPX fpx = new fPX();
            fpx.copydefault = yho;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("eoaAddressList", arrayList);
            fpx.setArguments(bundle);
            return fpx;
        }
    }

    public final java.util.List<EoaWalletInfo> AEQbTJ() {
        java.util.ArrayList parcelableArrayList;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (parcelableArrayList = arguments.getParcelableArrayList("eoaAddressList")) == null) ? yDY.AhwBna() : parcelableArrayList;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.fPW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                fPX.OLrzqt(this.KWHzl);
            }
        });
    }

    public static final void OLrzqt(fPX fpx) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) fpx, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC52796wYr, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.widget.TextView textViewFARcdN = fARcdN();
        if (textViewFARcdN != null) {
            textViewFARcdN.setVisibility(0);
        }
        android.widget.TextView textViewFJNWhG = fJNWhG();
        if (textViewFJNWhG != null) {
            textViewFJNWhG.setVisibility(0);
        }
        android.widget.TextView textViewFARcdN2 = fARcdN();
        if (textViewFARcdN2 != null) {
            textViewFARcdN2.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.aSdHwS));
        }
        android.widget.TextView textViewFJNWhG2 = fJNWhG();
        if (textViewFJNWhG2 != null) {
            textViewFJNWhG2.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OTJFaA));
        }
        EZpvd();
    }

    private final void EZpvd() {
        ConstraintLayout constraintLayout;
        java.lang.String okxAccount;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (final EoaWalletInfo eoaWalletInfo : AEQbTJ()) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            final C55377xim c55377xim = new C55377xim(fragmentActivityRequireActivity, null, 2, null);
            if (eoaWalletInfo.getEoaType() == WalletType.MPCWallet || eoaWalletInfo.getEoaType() == WalletType.HardwareWallet) {
                okxAccount = eoaWalletInfo.getOkxAccount();
            } else {
                okxAccount = C14079deg.getAddressStr$default(C14079deg.EZpvd, eoaWalletInfo.getOkxAccount(), false, 2, null);
            }
            c55377xim.setTitleText(okxAccount);
            if (!eoaWalletInfo.isBacked()) {
                c55377xim.AhwBna().setAttachmentViewId(C13754dXa.TaskDescription.DVmcag);
            }
            c55377xim.setEndDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.DzkRMH));
            android.graphics.drawable.Drawable drawableAEQbTJ = c55377xim.AEQbTJ();
            if (drawableAEQbTJ != null) {
                drawableAEQbTJ.setTint(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            }
            c55377xim.setClickCallback(new Function0() { // from class: o.fPY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return fPX.AEQbTJ(eoaWalletInfo, this, c55377xim);
                }
            });
            arrayList.add(c55377xim);
        }
        C54946xaf binding = getBinding();
        ViewGroup.LayoutParams layoutParams = (binding == null || (constraintLayout = binding.AEQbTJ) == null) ? null : constraintLayout.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.bottomMargin = C55298xhM.dp2px$default(20.0f, null, 1, null);
        }
        EZpvd(arrayList);
    }

    public static final Unit AEQbTJ(final EoaWalletInfo eoaWalletInfo, final fPX fpx, C55377xim c55377xim) {
        boolean zIsBacked = eoaWalletInfo.isBacked();
        if (zIsBacked) {
            if (eoaWalletInfo.getEoaType() == WalletType.HardwareWallet) {
                yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho = fpx.copydefault;
                if (yho != null) {
                    yho.invoke(eoaWalletInfo.getEoaAddress(), eoaWalletInfo.getWalletId(), "");
                }
                fpx.dismissAllowingStateLoss();
            } else {
                androidx.fragment.app.FragmentManager childFragmentManager = fpx.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                new C14469dlz(childFragmentManager, c55377xim.getContext(), null, null, new Function1() { // from class: o.fPZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return fPX.EZpvd(this.copydefault, eoaWalletInfo, (java.lang.String) obj);
                    }
                }, null, null, null, 232, null).EZpvd();
            }
        } else {
            if (zIsBacked) {
                throw new NoWhenBranchMatchedException();
            }
            C55326xho.toast$default(C13754dXa.FragmentManager.HJWChPdIKEqB, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            fpx.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(fPX fpx, EoaWalletInfo eoaWalletInfo, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho = fpx.copydefault;
        if (yho != null) {
            yho.invoke(eoaWalletInfo.getEoaAddress(), eoaWalletInfo.getWalletId(), str);
        }
        fpx.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
