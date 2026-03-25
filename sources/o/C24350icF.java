package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.business.dex.utils.CDNSourceManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.icF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24350icF extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public C23493hzK KWHzl;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.icL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C24350icF.EZpvd(this.OLrzqt));
        }
    });

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return true;
    }

    private final boolean copydefault() {
        return ((java.lang.Boolean) this.OLrzqt.getValue()).booleanValue();
    }

    public static final boolean EZpvd(C24350icF c24350icF) {
        android.os.Bundle arguments = c24350icF.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("swap_type");
        }
        return false;
    }

    /* JADX INFO: renamed from: o.icF$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.icF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C24350icF KWHzl() {
            return new C24350icF();
        }
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.setDraggable(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        android.widget.TextView textView;
        java.lang.String strAYXKKw;
        android.widget.ImageView imageView;
        ShapeableImageView shapeableImageView;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C23493hzK c23493hzKAEQbTJ = C23493hzK.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        this.KWHzl = c23493hzKAEQbTJ;
        if (c23493hzKAEQbTJ != null && (shapeableImageView = c23493hzKAEQbTJ.AEQbTJ) != null) {
            C22361hds.OLrzqt(shapeableImageView, CDNSourceManager.ImageSource.GuideRoute);
        }
        C23493hzK c23493hzK = this.KWHzl;
        if (c23493hzK != null && (imageView = c23493hzK.OLrzqt) != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.icH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C24350icF.AEQbTJ(this.KWHzl, view);
                }
            });
        }
        constraintLayout.post(new java.lang.Runnable() { // from class: o.icD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C24350icF.OLrzqt(this.KWHzl);
            }
        });
        C23493hzK c23493hzK2 = this.KWHzl;
        if (c23493hzK2 == null || (textView = c23493hzK2.DbNXlk) == null) {
            return;
        }
        if (copydefault()) {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.getCallerContract);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.registerForActivityResultlambda1);
        }
        textView.setText(strAYXKKw);
    }

    public static final void AEQbTJ(C24350icF c24350icF, android.view.View view) {
        c24350icF.dismissAllowingStateLoss();
    }

    public static final void OLrzqt(C24350icF c24350icF) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c24350icF, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.buildRccMetadata));
        wyf.setOnClickListener(new View.OnClickListener() { // from class: o.icK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C24350icF.OLrzqt(this.EZpvd, view);
            }
        });
    }

    public static final void OLrzqt(C24350icF c24350icF, android.view.View view) {
        c24350icF.dismissAllowingStateLoss();
    }
}
