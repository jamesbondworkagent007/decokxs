package o;

import android.os.Build;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class nAL extends wXS {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public android.content.Context AEQbTJ;
    public OKMessage EZpvd;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.nAJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return nAL.EZpvd(this.KWHzl);
        }
    });
    public android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXS
    public java.lang.CharSequence copydefault() {
        return "";
    }

    @Override // o.wXS, o.wXX
    public boolean getHasFooter() {
        return false;
    }

    public final java.util.List<MenuActionBase> KWHzl() {
        return (java.util.List) this.KWHzl.getValue();
    }

    public static final java.util.ArrayList EZpvd(nAL nal) {
        if (Build.VERSION.SDK_INT >= 33) {
            android.os.Bundle arguments = nal.getArguments();
            if (arguments != null) {
                return arguments.getParcelableArrayList("list", MenuActionBase.class);
            }
        } else {
            android.os.Bundle arguments2 = nal.getArguments();
            if (arguments2 != null) {
                return arguments2.getParcelableArrayList("list");
            }
        }
        return null;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nAL.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.wXS, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C35399nuc.TaskDescription.OLrzqt));
    }

    @Override // o.wXS, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(67);
        LinearLayoutCompat linearLayoutCompatEZpvd = c52781wYc.EZpvd();
        if (linearLayoutCompatEZpvd != null) {
            linearLayoutCompatEZpvd.setVisibility(8);
        }
    }

    @Override // o.wXS
    public void copydefault(@NotNull LinearLayoutCompat linearLayoutCompat) {
        Intrinsics.checkNotNullParameter(linearLayoutCompat, "");
        java.util.List<MenuActionBase> listKWHzl = KWHzl();
        if (listKWHzl != null) {
            for (final MenuActionBase menuActionBase : listKWHzl) {
                android.content.Context context = this.AEQbTJ;
                if (context != null) {
                    android.widget.TextView textViewAEQbTJ = AEQbTJ(linearLayoutCompat, menuActionBase.OLrzqt(context));
                    textViewAEQbTJ.setGravity(TextAlign.LEFT);
                    textViewAEQbTJ.setCompoundDrawablePadding(C55298xhM.dp2px$default(12.0f, null, 1, null));
                    textViewAEQbTJ.setBackgroundResource(C35399nuc.ActionBar.EZpvd);
                    textViewAEQbTJ.setCompoundDrawablesRelativeWithIntrinsicBounds(menuActionBase.copydefault(context), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
                    textViewAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.nAK
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            nAL.EZpvd(this.AEQbTJ, menuActionBase, view);
                        }
                    });
                }
            }
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void EZpvd(nAL nal, MenuActionBase menuActionBase, android.view.View view) {
        OKMessage oKMessage;
        nal.dismissAllowingStateLoss();
        android.view.View view2 = nal.copydefault;
        if (view2 != null && (oKMessage = nal.EZpvd) != null) {
            menuActionBase.AEQbTJ(view2, oKMessage);
        }
        nal.getParentFragmentManager().setFragmentResult("REQUEST_KEY", BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_ACTION_ITEM", menuActionBase)));
    }
}
