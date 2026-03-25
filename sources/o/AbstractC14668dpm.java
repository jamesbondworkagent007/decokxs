package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dpm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14668dpm extends AbstractC57212yeE {
    public boolean AYXKKw;
    public final int djBIcL = C13754dXa.TaskDescription.RVsVBY;
    public AbstractC16453ekH gEmmrt;

    public abstract android.view.View AEQbTJ(@NotNull android.view.ViewGroup viewGroup);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57212yeE
    public boolean copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        AbstractC16453ekH abstractC16453ekH = (AbstractC16453ekH) viewDataBindingBind;
        this.gEmmrt = abstractC16453ekH;
        AbstractC16453ekH abstractC16453ekH2 = null;
        if (abstractC16453ekH == null) {
            Intrinsics.gEmmrt("");
            abstractC16453ekH = null;
        }
        android.widget.FrameLayout frameLayout = abstractC16453ekH.valueOf;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        android.view.View viewAEQbTJ = AEQbTJ((android.view.ViewGroup) frameLayout);
        if (viewAEQbTJ != null) {
            if (viewAEQbTJ.getLayoutParams() == null) {
                viewAEQbTJ.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            }
            AbstractC16453ekH abstractC16453ekH3 = this.gEmmrt;
            if (abstractC16453ekH3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16453ekH3 = null;
            }
            abstractC16453ekH3.valueOf.addView(viewAEQbTJ);
        }
        AbstractC16453ekH abstractC16453ekH4 = this.gEmmrt;
        if (abstractC16453ekH4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16453ekH4 = null;
        }
        abstractC16453ekH4.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.dpj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                AbstractC14668dpm.AEQbTJ(this.KWHzl, view2);
            }
        });
        AbstractC16453ekH abstractC16453ekH5 = this.gEmmrt;
        if (abstractC16453ekH5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16453ekH2 = abstractC16453ekH5;
        }
        abstractC16453ekH2.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.dpl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                AbstractC14668dpm.EZpvd(this.copydefault, view2);
            }
        });
        view.post(new java.lang.Runnable() { // from class: o.dpk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC14668dpm.OLrzqt(this.EZpvd);
            }
        });
    }

    public static final void AEQbTJ(AbstractC14668dpm abstractC14668dpm, android.view.View view) {
        Intrinsics.copydefault(view);
        abstractC14668dpm.OLrzqt(view);
    }

    public static final void EZpvd(AbstractC14668dpm abstractC14668dpm, android.view.View view) {
        Intrinsics.copydefault(view);
        abstractC14668dpm.AhwBna(view);
    }

    public static final void OLrzqt(AbstractC14668dpm abstractC14668dpm) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC14668dpm, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void EZpvd(int i) {
        java.lang.String string = getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        EZpvd(string);
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC16453ekH abstractC16453ekH = this.gEmmrt;
        if (abstractC16453ekH == null) {
            Intrinsics.gEmmrt("");
            abstractC16453ekH = null;
        }
        abstractC16453ekH.gEmmrt.setText(str);
    }

    public final void EZpvd(boolean z) {
        AbstractC16453ekH abstractC16453ekH = null;
        if (z) {
            AbstractC16453ekH abstractC16453ekH2 = this.gEmmrt;
            if (abstractC16453ekH2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16453ekH = abstractC16453ekH2;
            }
            abstractC16453ekH.EZpvd.setVisibility(0);
            return;
        }
        AbstractC16453ekH abstractC16453ekH3 = this.gEmmrt;
        if (abstractC16453ekH3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16453ekH = abstractC16453ekH3;
        }
        abstractC16453ekH.EZpvd.setVisibility(8);
    }

    public final void OLrzqt(boolean z) {
        AbstractC16453ekH abstractC16453ekH = null;
        if (z) {
            AbstractC16453ekH abstractC16453ekH2 = this.gEmmrt;
            if (abstractC16453ekH2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16453ekH = abstractC16453ekH2;
            }
            abstractC16453ekH.OLrzqt.setVisibility(0);
            return;
        }
        AbstractC16453ekH abstractC16453ekH3 = this.gEmmrt;
        if (abstractC16453ekH3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16453ekH = abstractC16453ekH3;
        }
        abstractC16453ekH.OLrzqt.setVisibility(8);
    }

    public final void KWHzl(boolean z) {
        AbstractC16453ekH abstractC16453ekH = null;
        if (z) {
            AbstractC16453ekH abstractC16453ekH2 = this.gEmmrt;
            if (abstractC16453ekH2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16453ekH = abstractC16453ekH2;
            }
            abstractC16453ekH.AEQbTJ.setVisibility(0);
            return;
        }
        AbstractC16453ekH abstractC16453ekH3 = this.gEmmrt;
        if (abstractC16453ekH3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16453ekH3 = null;
        }
        abstractC16453ekH3.AEQbTJ.setVisibility(8);
        AbstractC16453ekH abstractC16453ekH4 = this.gEmmrt;
        if (abstractC16453ekH4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16453ekH4 = null;
        }
        ViewGroup.LayoutParams layoutParams = abstractC16453ekH4.valueOf.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = C55298xhM.KWHzl(16.0f, contextRequireContext);
        AbstractC16453ekH abstractC16453ekH5 = this.gEmmrt;
        if (abstractC16453ekH5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16453ekH = abstractC16453ekH5;
        }
        abstractC16453ekH.valueOf.setLayoutParams(layoutParams2);
    }

    public final void AEQbTJ(boolean z) {
        AbstractC16453ekH abstractC16453ekH = null;
        if (z) {
            AbstractC16453ekH abstractC16453ekH2 = this.gEmmrt;
            if (abstractC16453ekH2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16453ekH = abstractC16453ekH2;
            }
            abstractC16453ekH.OLrzqt.setVisibility(0);
            return;
        }
        AbstractC16453ekH abstractC16453ekH3 = this.gEmmrt;
        if (abstractC16453ekH3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16453ekH = abstractC16453ekH3;
        }
        abstractC16453ekH.OLrzqt.setVisibility(8);
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC16453ekH abstractC16453ekH = this.gEmmrt;
        AbstractC16453ekH abstractC16453ekH2 = null;
        if (abstractC16453ekH == null) {
            Intrinsics.gEmmrt("");
            abstractC16453ekH = null;
        }
        abstractC16453ekH.AkhnZx.setText(str);
        if (str.length() == 0) {
            AbstractC16453ekH abstractC16453ekH3 = this.gEmmrt;
            if (abstractC16453ekH3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16453ekH2 = abstractC16453ekH3;
            }
            abstractC16453ekH2.AkhnZx.setVisibility(8);
            return;
        }
        AbstractC16453ekH abstractC16453ekH4 = this.gEmmrt;
        if (abstractC16453ekH4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16453ekH2 = abstractC16453ekH4;
        }
        abstractC16453ekH2.AkhnZx.setVisibility(0);
    }

    public final void copydefault(boolean z) {
        AbstractC16453ekH abstractC16453ekH = null;
        if (z) {
            AbstractC16453ekH abstractC16453ekH2 = this.gEmmrt;
            if (abstractC16453ekH2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16453ekH = abstractC16453ekH2;
            }
            abstractC16453ekH.AhwBna.setVisibility(0);
            return;
        }
        AbstractC16453ekH abstractC16453ekH3 = this.gEmmrt;
        if (abstractC16453ekH3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16453ekH = abstractC16453ekH3;
        }
        abstractC16453ekH.AhwBna.setVisibility(8);
    }

    public final void AEQbTJ(int i) {
        AbstractC16453ekH abstractC16453ekH = this.gEmmrt;
        if (abstractC16453ekH == null) {
            Intrinsics.gEmmrt("");
            abstractC16453ekH = null;
        }
        abstractC16453ekH.AhwBna.setBackgroundColor(i);
    }

    public final AbstractC16453ekH OLrzqt() {
        AbstractC16453ekH abstractC16453ekH = this.gEmmrt;
        if (abstractC16453ekH != null) {
            return abstractC16453ekH;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void OLrzqt(int i) {
        AbstractC16453ekH abstractC16453ekH = this.gEmmrt;
        if (abstractC16453ekH == null) {
            Intrinsics.gEmmrt("");
            abstractC16453ekH = null;
        }
        abstractC16453ekH.djBIcL.setVisibility(i);
    }

    public final void AEQbTJ() {
        AbstractC16453ekH abstractC16453ekH = this.gEmmrt;
        AbstractC16453ekH abstractC16453ekH2 = null;
        if (abstractC16453ekH == null) {
            Intrinsics.gEmmrt("");
            abstractC16453ekH = null;
        }
        abstractC16453ekH.KWHzl.setVisibility(8);
        AbstractC16453ekH abstractC16453ekH3 = this.gEmmrt;
        if (abstractC16453ekH3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16453ekH2 = abstractC16453ekH3;
        }
        abstractC16453ekH2.AhwBna.setVisibility(8);
    }
}
