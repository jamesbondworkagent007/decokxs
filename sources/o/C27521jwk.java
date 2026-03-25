package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C27167jqA;
import o.C27200jqh;
import o.C32113mPz;
import o.C52761wXj;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jwk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27521jwk extends android.widget.FrameLayout {
    public final InterfaceC56387yDm EZpvd;
    public Function1<? super java.lang.String, Unit> KWHzl;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27521jwk(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27521jwk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final void KWHzl(boolean z) {
        if (this.copydefault != z) {
            this.copydefault = z;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinClickCallback(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:33) call: o.jwk.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27521jwk(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27521jwk(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.jwr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27521jwk.KWHzl(context, this);
            }
        });
    }

    private final C23907iNt KWHzl() {
        return (C23907iNt) this.EZpvd.getValue();
    }

    public static final C23907iNt KWHzl(android.content.Context context, C27521jwk c27521jwk) {
        return C23907iNt.KWHzl(android.view.LayoutInflater.from(context), c27521jwk, true);
    }

    public static /* synthetic */ void setData$default(C27521jwk c27521jwk, InterfaceC24178iXu interfaceC24178iXu, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c27521jwk.setData(interfaceC24178iXu, z, z2);
    }

    public final void setData(@NotNull InterfaceC24178iXu interfaceC24178iXu, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(interfaceC24178iXu, "");
        KWHzl(z2);
        C23907iNt c23907iNtKWHzl = KWHzl();
        ConstraintLayout root = c23907iNtKWHzl.KWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        boolean z3 = interfaceC24178iXu instanceof InterfaceC24178iXu.StateListAnimator;
        root.setVisibility(z3 ? 0 : 8);
        ConstraintLayout root2 = c23907iNtKWHzl.AEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        boolean z4 = interfaceC24178iXu instanceof InterfaceC24178iXu.Application;
        root2.setVisibility(z4 ? 0 : 8);
        ConstraintLayout root3 = c23907iNtKWHzl.EZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "");
        boolean z5 = interfaceC24178iXu instanceof InterfaceC24178iXu.LoaderManager;
        root3.setVisibility(z5 ? 0 : 8);
        ConstraintLayout root4 = c23907iNtKWHzl.copydefault.getRoot();
        Intrinsics.checkNotNullExpressionValue(root4, "");
        boolean z6 = interfaceC24178iXu instanceof InterfaceC24178iXu.Fragment;
        root4.setVisibility(z6 ? 0 : 8);
        ConstraintLayout root5 = c23907iNtKWHzl.AhwBna.getRoot();
        Intrinsics.checkNotNullExpressionValue(root5, "");
        boolean z7 = interfaceC24178iXu instanceof InterfaceC24178iXu.PictureInPictureParams;
        root5.setVisibility(z7 ? 0 : 8);
        ConstraintLayout root6 = c23907iNtKWHzl.OLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root6, "");
        boolean z8 = interfaceC24178iXu instanceof InterfaceC24178iXu.Activity;
        root6.setVisibility(z8 ? 0 : 8);
        if (z3) {
            iLM ilm = c23907iNtKWHzl.KWHzl;
            Intrinsics.checkNotNullExpressionValue(ilm, "");
            EZpvd(ilm, (InterfaceC24178iXu.StateListAnimator) interfaceC24178iXu, z);
            return;
        }
        if (z4) {
            C23854iLu c23854iLu = c23907iNtKWHzl.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c23854iLu, "");
            OLrzqt(c23854iLu, (InterfaceC24178iXu.Application) interfaceC24178iXu);
            return;
        }
        if (z5) {
            C23897iNj c23897iNj = c23907iNtKWHzl.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c23897iNj, "");
            KWHzl(c23897iNj, (InterfaceC24178iXu.LoaderManager) interfaceC24178iXu, z);
            return;
        }
        if (z6) {
            C23785iJf c23785iJf = c23907iNtKWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(c23785iJf, "");
            EZpvd(c23785iJf, (InterfaceC24178iXu.Fragment) interfaceC24178iXu);
        } else if (z7) {
            C23790iJk c23790iJk = c23907iNtKWHzl.AhwBna;
            Intrinsics.checkNotNullExpressionValue(c23790iJk, "");
            OLrzqt(c23790iJk, (InterfaceC24178iXu.PictureInPictureParams) interfaceC24178iXu);
        } else if (z8) {
            C23855iLv c23855iLv = c23907iNtKWHzl.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c23855iLv, "");
            OLrzqt(c23855iLv, (InterfaceC24178iXu.Activity) interfaceC24178iXu, z);
        }
    }

    public final void EZpvd(iLM ilm, InterfaceC24178iXu.StateListAnimator stateListAnimator, boolean z) {
        ilm.OLrzqt.setNewLayout(this.copydefault);
        if (z) {
            ilm.OLrzqt.KWHzl();
        } else {
            ilm.OLrzqt.AEQbTJ();
        }
        ilm.OLrzqt.setData(stateListAnimator.OLrzqt(), stateListAnimator.KWHzl(), false, z, stateListAnimator.AEQbTJ());
        ilm.OLrzqt.setOnTipClickCallback(new Application(ilm));
    }

    /* JADX INFO: renamed from: o.jwk$Application */
    public static final class Application implements C27200jqh.StateListAnimator {
        public final /* synthetic */ iLM copydefault;

        public Application(iLM ilm) {
            this.copydefault = ilm;
        }

        @Override // o.C27200jqh.StateListAnimator
        public void AEQbTJ(InvestTokenWithAmount investTokenWithAmount) {
            Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
            C27496jwL c27496jwL = C27496jwL.EZpvd;
            android.content.Context context = this.copydefault.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C27496jwL.showDialog$default(c27496jwL, context, C33070mpX.AYXKKw(C25493ixk.FragmentManager.GQzpsZ), C33070mpX.AYXKKw(C25493ixk.FragmentManager.GPCHlQ), null, false, false, C33070mpX.AYXKKw(C25493ixk.FragmentManager.aJZHYI), null, null, null, false, 1976, null);
        }
    }

    public final void OLrzqt(C23790iJk c23790iJk, InterfaceC24178iXu.PictureInPictureParams pictureInPictureParams) {
        android.view.View viewFindViewById = c23790iJk.getRoot().findViewById(C25493ixk.ActionBar.asInterface);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        android.widget.TextView textView = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = c23790iJk.getRoot().findViewById(C25493ixk.ActionBar.asBinder);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        android.widget.TextView textView2 = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = c23790iJk.getRoot().findViewById(C25493ixk.ActionBar.setPageName);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById3;
        textView.setText(C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, pictureInPictureParams.KWHzl().getCoinAmount(), 6, 2, false, false, 24, null));
        textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        textView2.setText(" " + pictureInPictureParams.KWHzl().getTokenSymbol());
        textView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        C27569jxf.loadCircleWithBorder$default(c27569jxf, imageView, pictureInPictureParams.KWHzl().getTokenLogo(), c27569jxf.OLrzqt(), C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
    }

    public final void OLrzqt(C23854iLu c23854iLu, InterfaceC24178iXu.Application application) {
        c23854iLu.KWHzl.setCollateralRatio(application);
    }

    public final void EZpvd(C23785iJf c23785iJf, InterfaceC24178iXu.Fragment fragment) {
        C26726jhk.copydefault(c23785iJf, fragment, true);
    }

    public final void KWHzl(C23897iNj c23897iNj, InterfaceC24178iXu.LoaderManager loaderManager, boolean z) {
        if (z) {
            c23897iNj.copydefault.copydefault();
            return;
        }
        c23897iNj.copydefault.OLrzqt();
        C27167jqA c27167jqA = c23897iNj.copydefault;
        Intrinsics.checkNotNullExpressionValue(c27167jqA, "");
        c27167jqA.setVisibility(0);
        c23897iNj.copydefault.setData(loaderManager.copydefault(), loaderManager.AhwBna(), true, this.copydefault);
        c23897iNj.copydefault.setOnTipClickCallback(new StateListAnimator(c23897iNj, loaderManager));
        c23897iNj.copydefault.setOnCoinClickCallback(new ActionBar());
        if (loaderManager.djBIcL()) {
            return;
        }
        c23897iNj.copydefault.OLrzqt(loaderManager.copydefault(), loaderManager.AhwBna(), true, false);
    }

    /* JADX INFO: renamed from: o.jwk$StateListAnimator */
    public static final class StateListAnimator implements C27167jqA.ActionBar {
        public final /* synthetic */ InterfaceC24178iXu.LoaderManager EZpvd;
        public final /* synthetic */ C23897iNj OLrzqt;

        public StateListAnimator(C23897iNj c23897iNj, InterfaceC24178iXu.LoaderManager loaderManager) {
            this.OLrzqt = c23897iNj;
            this.EZpvd = loaderManager;
        }

        @Override // o.C27167jqA.ActionBar
        public void EZpvd() {
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            android.content.Context context = this.OLrzqt.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c27569jxf.OLrzqt(context, this.EZpvd);
        }
    }

    /* JADX INFO: renamed from: o.jwk$ActionBar */
    public static final class ActionBar implements C27167jqA.Application {
        public ActionBar() {
        }

        @Override // o.C27167jqA.Application
        public void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            Function1 function1 = C27521jwk.this.KWHzl;
            if (function1 != null) {
                function1.invoke(str);
            }
        }
    }

    public final void EZpvd() {
        C27167jqA c27167jqA = KWHzl().EZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(c27167jqA, "");
        if (c27167jqA.getVisibility() == 0) {
            KWHzl().EZpvd.copydefault.KWHzl();
        }
    }

    public final void OLrzqt(C23855iLv c23855iLv, InterfaceC24178iXu.Activity activity, boolean z) {
        if (z) {
            c23855iLv.EZpvd.copydefault();
            return;
        }
        c23855iLv.EZpvd.OLrzqt();
        C27167jqA c27167jqA = c23855iLv.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c27167jqA, "");
        c27167jqA.setVisibility(0);
        c23855iLv.EZpvd.setData(activity.KWHzl(), activity.djBIcL(), false, this.copydefault);
        c23855iLv.EZpvd.setOnCoinClickCallback(new Activity());
        if (activity.OLrzqt()) {
            return;
        }
        c23855iLv.EZpvd.OLrzqt(activity.KWHzl(), activity.djBIcL(), false, false);
    }

    /* JADX INFO: renamed from: o.jwk$Activity */
    public static final class Activity implements C27167jqA.Application {
        public Activity() {
        }

        @Override // o.C27167jqA.Application
        public void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            Function1 function1 = C27521jwk.this.KWHzl;
            if (function1 != null) {
                function1.invoke(str);
            }
        }
    }
}
