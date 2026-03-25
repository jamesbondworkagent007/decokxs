package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ymk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57668ymk extends AbstractC57674ymq {
    public boolean EZpvd;
    public mPN djBIcL;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57674ymq
    public boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.ymk$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ymk.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.AbstractC57674ymq
    public android.view.View AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        mPN mpn = (mPN) DataBindingUtil.inflate(layoutInflater, C32113mPz.Fragment.gEmmrt, null, false);
        this.djBIcL = mpn;
        if (mpn != null) {
            return mpn.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.widget.ImageView imageView;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        mPN mpn = this.djBIcL;
        if (mpn == null || (imageView = mpn.EZpvd) == null) {
            return;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.ymi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                AbstractC57668ymk.OLrzqt(this.EZpvd, view2);
            }
        });
    }

    public static final void OLrzqt(AbstractC57668ymk abstractC57668ymk, android.view.View view) {
        abstractC57668ymk.EZpvd();
    }

    public void EZpvd() {
        dismissAllowingStateLoss();
    }

    public final void KWHzl(java.lang.String str) {
        android.widget.TextView textView;
        mPN mpn = this.djBIcL;
        if (mpn == null || (textView = mpn.AhwBna) == null) {
            return;
        }
        textView.setText(str);
    }

    public final void OLrzqt(int i) {
        android.widget.ImageView imageView;
        mPN mpn = this.djBIcL;
        if (mpn == null || (imageView = mpn.AEQbTJ) == null) {
            return;
        }
        imageView.setVisibility(i);
    }
}
