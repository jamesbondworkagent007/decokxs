package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iSY extends C57662yme {
    public java.lang.String AYXKKw = "default_trade";
    public AbstractC23748iHw gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
    }

    public abstract void copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC23748iHw djBIcL() {
        return this.gEmmrt;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.AYXKKw = arguments.getString("source_type", "default_trade");
        }
        AbstractC23748iHw abstractC23748iHw = (AbstractC23748iHw) DataBindingUtil.inflate(layoutInflater, C25493ixk.Activity.AwvSrB, viewGroup, false);
        this.gEmmrt = abstractC23748iHw;
        if (abstractC23748iHw != null) {
            android.widget.FrameLayout frameLayout = abstractC23748iHw.DbNXlk;
            if (frameLayout != null) {
                copydefault(layoutInflater, frameLayout);
            }
            android.widget.FrameLayout frameLayout2 = abstractC23748iHw.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            OLrzqt(layoutInflater, frameLayout2);
        }
        AbstractC23748iHw abstractC23748iHw2 = this.gEmmrt;
        if (abstractC23748iHw2 != null) {
            return abstractC23748iHw2.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC23748iHw abstractC23748iHw = this.gEmmrt;
        if (abstractC23748iHw != null) {
            abstractC23748iHw.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.iTa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    iSY.AEQbTJ(this.EZpvd, view2);
                }
            });
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void AEQbTJ(iSY isy, android.view.View view) {
        isy.AEQbTJ();
    }

    public final void EZpvd(boolean z) {
        android.widget.FrameLayout frameLayout;
        android.widget.ImageView imageView;
        android.widget.FrameLayout frameLayout2;
        android.widget.ImageView imageView2;
        if (z) {
            AbstractC23748iHw abstractC23748iHw = this.gEmmrt;
            if (abstractC23748iHw != null && (imageView2 = abstractC23748iHw.OLrzqt) != null) {
                imageView2.setVisibility(0);
            }
            AbstractC23748iHw abstractC23748iHw2 = this.gEmmrt;
            if (abstractC23748iHw2 == null || (frameLayout2 = abstractC23748iHw2.KWHzl) == null) {
                return;
            }
            frameLayout2.setVisibility(8);
            return;
        }
        AbstractC23748iHw abstractC23748iHw3 = this.gEmmrt;
        if (abstractC23748iHw3 != null && (imageView = abstractC23748iHw3.OLrzqt) != null) {
            imageView.setVisibility(8);
        }
        AbstractC23748iHw abstractC23748iHw4 = this.gEmmrt;
        if (abstractC23748iHw4 == null || (frameLayout = abstractC23748iHw4.KWHzl) == null) {
            return;
        }
        frameLayout.setVisibility(0);
    }

    public void AEQbTJ() {
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }
}
