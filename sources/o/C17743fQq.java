package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fQq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C17743fQq extends wXX {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final boolean AEQbTJ = true;
    public ActionBar EZpvd;
    public AbstractC16964etp copydefault;

    /* JADX INFO: renamed from: o.fQq$ActionBar */
    /* JADX INFO: loaded from: classes5.dex */
    public interface ActionBar {
        void KWHzl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[PHI: r3
  0x0029: PHI (r3v3 o.fQq$ActionBar) = (r3v2 o.fQq$ActionBar), (r3v6 o.fQq$ActionBar) binds: [B:6:0x0011, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        ActionBar actionBar = null;
        ActionBar actionBar2 = context instanceof ActionBar ? (ActionBar) context : null;
        if (actionBar2 == null) {
            ActivityResultCaller parentFragment = getParentFragment();
            actionBar2 = parentFragment instanceof ActionBar ? (ActionBar) parentFragment : null;
            if (actionBar2 == null) {
                pUU.EZpvd("DAppNetworkInfoBottomSheet", "OnUnderstandClickListener is null, did you implement in your activity or parentFragment?");
            } else {
                actionBar = actionBar2;
            }
        }
        this.EZpvd = actionBar;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.copydefault = AbstractC16964etp.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        KWHzl();
    }

    public final void KWHzl() {
        android.content.Context context;
        AbstractC16964etp abstractC16964etp = this.copydefault;
        if (abstractC16964etp == null || (context = getContext()) == null) {
            return;
        }
        java.lang.String str = C33492mxV.OLrzqt() ? "/cdn/wallet/logo/048f5401-a9e3-4548-b095-d47f33898d97-hint-dark.png" : "/cdn/wallet/logo/76035e16-4661-4180-bfd6-93c594bb2bb7-hint-light.png";
        Glide.AEQbTJ(context).EZpvd(C43386roM.EZpvd.EZpvd() + str).EZpvd(abstractC16964etp.OLrzqt);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(getString(C13754dXa.FragmentManager.iRxXKY));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.fQr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C17743fQq.copydefault(this.OLrzqt, view);
                }
            });
        }
    }

    public static final void copydefault(C17743fQq c17743fQq, android.view.View view) {
        ActionBar actionBar = c17743fQq.EZpvd;
        if (actionBar != null) {
            actionBar.KWHzl();
        }
        c17743fQq.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.EZpvd = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.copydefault = null;
    }

    /* JADX INFO: renamed from: o.fQq$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fQq.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C17743fQq KWHzl() {
            return new C17743fQq();
        }
    }
}
