package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gvQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC21206gvQ extends C33005moL implements View.OnClickListener {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public boolean KWHzl;
    public AbstractC16556emE OLrzqt;
    public Application copydefault;

    /* JADX INFO: renamed from: o.gvQ$Application */
    public interface Application {
        void copydefault(android.os.Bundle bundle);
    }

    public android.os.Bundle copydefault(android.os.Bundle bundle) {
        return bundle;
    }

    /* JADX INFO: renamed from: o.gvQ$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gvQ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final ViewOnClickListenerC21206gvQ OLrzqt() {
            return new ViewOnClickListenerC21206gvQ();
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
        this.OLrzqt = (AbstractC16556emE) DataBindingUtil.inflate(layoutInflater, C13754dXa.TaskDescription.DPHNDa, viewGroup, false);
        EZpvd();
        AbstractC16556emE abstractC16556emE = this.OLrzqt;
        if (abstractC16556emE == null) {
            Intrinsics.gEmmrt("");
            abstractC16556emE = null;
        }
        return abstractC16556emE.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.gvO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC21206gvQ.KWHzl(this.AEQbTJ);
            }
        });
    }

    public static final void KWHzl(ViewOnClickListenerC21206gvQ viewOnClickListenerC21206gvQ) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) viewOnClickListenerC21206gvQ, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void EZpvd() {
        setCancelable(false);
        AbstractC16556emE abstractC16556emE = this.OLrzqt;
        AbstractC16556emE abstractC16556emE2 = null;
        if (abstractC16556emE == null) {
            Intrinsics.gEmmrt("");
            abstractC16556emE = null;
        }
        abstractC16556emE.KWHzl.setOnClickListener(this);
        AbstractC16556emE abstractC16556emE3 = this.OLrzqt;
        if (abstractC16556emE3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16556emE3 = null;
        }
        abstractC16556emE3.valueOf.setOnClickListener(this);
        AbstractC16556emE abstractC16556emE4 = this.OLrzqt;
        if (abstractC16556emE4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16556emE2 = abstractC16556emE4;
        }
        abstractC16556emE2.copydefault.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C13754dXa.ActionBar.getIconUri;
        if (numValueOf != null && numValueOf.intValue() == i) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("tradeType", true);
            AEQbTJ(bundle);
            return;
        }
        int i2 = C13754dXa.ActionBar.ComponentActivityReportFullyDrawnExecutorApi16ImplExternalSyntheticLambda0;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("tradeType", false);
            AEQbTJ(bundle2);
        } else {
            int i3 = C13754dXa.ActionBar.onPostMessage;
            if (numValueOf != null && numValueOf.intValue() == i3) {
                close$default(this, null, 1, null);
            }
        }
    }

    public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(application, "");
        this.copydefault = application;
        show(fragmentManager, str);
    }

    @Override // o.C33005moL, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Application application;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        if (this.KWHzl || (application = this.copydefault) == null) {
            return;
        }
        application.copydefault(copydefault((android.os.Bundle) null));
    }

    public static /* synthetic */ void close$default(ViewOnClickListenerC21206gvQ viewOnClickListenerC21206gvQ, android.os.Bundle bundle, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bundle = null;
        }
        viewOnClickListenerC21206gvQ.AEQbTJ(bundle);
    }

    public final void AEQbTJ(android.os.Bundle bundle) {
        this.KWHzl = true;
        Application application = this.copydefault;
        if (application != null) {
            application.copydefault(copydefault(bundle));
        }
        dismissAllowingStateLoss();
    }
}
