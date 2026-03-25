package o;

import android.graphics.drawable.ColorDrawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import com.okinc.business.dexui.main.swap.route.SmartRoutingData;
import com.okinc.business.domain.model.PathRouterUi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C24429idf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.icY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24369icY extends C23404hxb {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public Function0<Unit> AEQbTJ;
    public C24429idf EZpvd;
    public final InterfaceC56387yDm KWHzl = C31200lpY.copydefault(this);
    public C21507hBy copydefault;

    @Override // o.wXX
    public boolean isFullScreen() {
        return true;
    }

    /* JADX INFO: renamed from: o.icY$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.icY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C24369icY AEQbTJ(@NotNull java.lang.String str, SmartRoutingData smartRoutingData, PathRouterUi pathRouterUi, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function0, "");
            C24369icY c24369icY = new C24369icY();
            c24369icY.AEQbTJ = function0;
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putParcelable("data", smartRoutingData);
            bundle.putParcelable("selected_router", pathRouterUi);
            c24369icY.setArguments(bundle);
            return c24369icY;
        }
    }

    private final java.lang.String KWHzl() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.copydefault = C21507hBy.copydefault(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        android.view.Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return dialogOnCreateDialog;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        C24429idf c24429idf;
        android.view.Window window;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.app.Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(C23274hvD.Dialog.AEQbTJ);
        }
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            if (this.EZpvd == null) {
                C24429idf.ActionBar actionBar = C24429idf.Companion;
                java.lang.String strKWHzl = KWHzl();
                android.os.Parcelable parcelable = (android.os.Parcelable) BundleCompat.getParcelable(arguments, "data", SmartRoutingData.class);
                Intrinsics.copydefault(parcelable);
                this.EZpvd = actionBar.OLrzqt(strKWHzl, (SmartRoutingData) parcelable, (PathRouterUi) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "selected_router", PathRouterUi.class)), new Function1() { // from class: o.ide
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C24369icY.OLrzqt(this.copydefault, (AbstractC24351icG) obj);
                    }
                }, new Function0() { // from class: o.idc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C24369icY.EZpvd(this.copydefault);
                    }
                }, new Function0() { // from class: o.idg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C24369icY.OLrzqt(this.KWHzl);
                    }
                });
            }
            C21507hBy c21507hBy = this.copydefault;
            if (c21507hBy != null && (c24429idf = this.EZpvd) != null) {
                getChildFragmentManager().beginTransaction().add(c21507hBy.AEQbTJ.getId(), c24429idf).addToBackStack(C21507hBy.class.getSimpleName()).commit();
            }
        }
        view.post(new java.lang.Runnable() { // from class: o.idd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C24369icY.djBIcL(this.AEQbTJ);
            }
        });
    }

    public static final Unit OLrzqt(C24369icY c24369icY, AbstractC24351icG abstractC24351icG) {
        Intrinsics.checkNotNullParameter(abstractC24351icG, "");
        c24369icY.KWHzl(abstractC24351icG);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C24369icY c24369icY) {
        c24369icY.EZpvd();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C24369icY c24369icY) {
        Function0<Unit> function0 = c24369icY.AEQbTJ;
        if (function0 != null) {
            function0.invoke();
        }
        c24369icY.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final void djBIcL(C24369icY c24369icY) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c24369icY, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void KWHzl(AbstractC24351icG abstractC24351icG) {
        C24429idf c24429idf;
        C21507hBy c21507hBy = this.copydefault;
        if (c21507hBy == null || (c24429idf = this.EZpvd) == null) {
            return;
        }
        getChildFragmentManager().beginTransaction().setCustomAnimations(C52761wXj.Application.isConnected, C52761wXj.Application.copydefault, C52761wXj.Application.EZpvd, C52761wXj.Application.AuCTel).add(c21507hBy.AEQbTJ.getId(), abstractC24351icG).hide(c24429idf).addToBackStack(C21507hBy.class.getSimpleName()).commit();
    }

    private final void EZpvd() {
        if (getChildFragmentManager().getBackStackEntryCount() <= 1) {
            dismissAllowingStateLoss();
        } else {
            getChildFragmentManager().popBackStack();
        }
    }
}
