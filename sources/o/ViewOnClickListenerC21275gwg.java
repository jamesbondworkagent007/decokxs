package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gwg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC21275gwg extends C33005moL implements View.OnClickListener {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public AbstractC16554emC OLrzqt;

    /* JADX INFO: renamed from: o.gwg$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gwg.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ ViewOnClickListenerC21275gwg newInstance$default(StateListAnimator stateListAnimator, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return stateListAnimator.AEQbTJ(z);
        }

        public final ViewOnClickListenerC21275gwg AEQbTJ(boolean z) {
            ViewOnClickListenerC21275gwg viewOnClickListenerC21275gwg = new ViewOnClickListenerC21275gwg();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("result", z);
            viewOnClickListenerC21275gwg.setArguments(bundle);
            return viewOnClickListenerC21275gwg;
        }
    }

    @Override // o.C33005moL, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C13754dXa.LoaderManager.gEmmrt);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC16554emC abstractC16554emC = (AbstractC16554emC) DataBindingUtil.inflate(layoutInflater, C13754dXa.TaskDescription.DrNnAm, viewGroup, false);
        this.OLrzqt = abstractC16554emC;
        if (abstractC16554emC == null) {
            Intrinsics.gEmmrt("");
            abstractC16554emC = null;
        }
        android.view.View root = abstractC16554emC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        AbstractC16554emC abstractC16554emC = null;
        java.lang.Boolean boolValueOf = arguments != null ? java.lang.Boolean.valueOf(arguments.getBoolean("result")) : null;
        EZpvd();
        AbstractC16554emC abstractC16554emC2 = this.OLrzqt;
        if (abstractC16554emC2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16554emC2 = null;
        }
        abstractC16554emC2.AEQbTJ.setVisibility(Intrinsics.EZpvd(boolValueOf, java.lang.Boolean.TRUE) ? 0 : 8);
        AbstractC16554emC abstractC16554emC3 = this.OLrzqt;
        if (abstractC16554emC3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16554emC = abstractC16554emC3;
        }
        android.widget.ImageView imageView = abstractC16554emC.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C14677dpv.OLrzqt(imageView, CDNSourceManager.ImageSource.FreeGasWarning);
        view.post(new java.lang.Runnable() { // from class: o.gwd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC21275gwg.EZpvd(this.EZpvd);
            }
        });
    }

    public static final void EZpvd(ViewOnClickListenerC21275gwg viewOnClickListenerC21275gwg) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) viewOnClickListenerC21275gwg, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void EZpvd() {
        AbstractC16554emC abstractC16554emC = this.OLrzqt;
        AbstractC16554emC abstractC16554emC2 = null;
        if (abstractC16554emC == null) {
            Intrinsics.gEmmrt("");
            abstractC16554emC = null;
        }
        abstractC16554emC.EZpvd.setOnClickListener(this);
        AbstractC16554emC abstractC16554emC3 = this.OLrzqt;
        if (abstractC16554emC3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16554emC2 = abstractC16554emC3;
        }
        abstractC16554emC2.copydefault.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C13754dXa.ActionBar.sbu;
        if (numValueOf == null || numValueOf.intValue() != i) {
            int i2 = C13754dXa.ActionBar.gSBher;
            if (numValueOf == null || numValueOf.intValue() != i2) {
                return;
            }
        }
        dismissAllowingStateLoss();
    }
}
