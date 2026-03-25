package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC18691fnF;
import o.ActivityC18750foL;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.foT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18758foT extends AbstractC52779wYa {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public boolean AEQbTJ = true;
    public java.lang.String EZpvd = "";

    @Override // o.AbstractC52779wYa, o.wXX
    public float getHeightScale() {
        return 0.0f;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    /* JADX INFO: renamed from: o.foT$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.foT.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C18758foT KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C18758foT c18758foT = new C18758foT();
            c18758foT.EZpvd = str;
            return c18758foT;
        }
    }

    @Override // o.AbstractC52779wYa, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.AbstractC52779wYa
    public void OLrzqt(@NotNull C54956xap c54956xap) {
        Intrinsics.checkNotNullParameter(c54956xap, "");
        c54956xap.getRoot().getRootView().setBackgroundColor(ContextCompat.getColor(c54956xap.getRoot().getContext(), C52761wXj.Activity.djBIcL));
        ViewGroup.LayoutParams layoutParams = c54956xap.OLrzqt.getLayoutParams();
        layoutParams.width = C55298xhM.dp2px$default(168.0f, null, 1, null);
        layoutParams.height = C55298xhM.dp2px$default(168.0f, null, 1, null);
        c54956xap.OLrzqt.setLayoutParams(layoutParams);
        AppCompatImageView appCompatImageView = c54956xap.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C14677dpv.OLrzqt(appCompatImageView, CDNSourceManager.ImageSource.ICloudBackUp);
        AppCompatImageView appCompatImageView2 = c54956xap.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        ViewGroup.LayoutParams layoutParams2 = appCompatImageView2.getLayoutParams();
        if (layoutParams2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            android.content.Context context = getContext();
            if (context != null) {
                marginLayoutParams.topMargin = C55298xhM.copydefault(8.0f, context);
            }
            appCompatImageView2.setLayoutParams(marginLayoutParams);
            c54956xap.valueOf.setText(getString(C13754dXa.FragmentManager.newTab));
            c54956xap.valueOf.setGravity(1);
            c54956xap.valueOf.setTextSize(28.0f);
            AppCompatTextView appCompatTextView = c54956xap.valueOf;
            android.content.Context context2 = getContext();
            if (context2 == null) {
                return;
            }
            appCompatTextView.setTextColor(ContextCompat.getColor(context2, C52761wXj.Activity.fdOvFl));
            c54956xap.AEQbTJ.setText(getString(C13754dXa.FragmentManager.isHideOnContentScrollEnabled));
            c54956xap.AEQbTJ.setTextSize(14.0f);
            AppCompatTextView appCompatTextView2 = c54956xap.AEQbTJ;
            android.content.Context context3 = getContext();
            if (context3 == null) {
                return;
            }
            appCompatTextView2.setTextColor(ContextCompat.getColor(context3, C52761wXj.Activity.QwvEab));
            c54956xap.KWHzl.setVisibility(8);
            ViewGroup.LayoutParams layoutParams3 = c54956xap.AEQbTJ.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int iDp2px$default = C55298xhM.dp2px$default(24.0f, null, 1, null);
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = iDp2px$default;
            }
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.bottomMargin = iDp2px$default;
            }
            c54956xap.AEQbTJ.setLayoutParams(marginLayoutParams2);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.EZpvd)) {
            return;
        }
        dismissAllowingStateLoss();
    }

    @Override // o.AbstractC52779wYa, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(7);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.collapseActionView));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
        wyf.setSecondaryText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.closeOptionsMenu));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new ActionBar(c52794wYpAEQbTJ2, 1000L, this));
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.foR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C18758foT.EZpvd(this.AEQbTJ);
            }
        });
    }

    public static final void EZpvd(C18758foT c18758foT) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c18758foT, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        if (this.AEQbTJ) {
            C13912dbY.copydefault.EZpvd(this.EZpvd);
        }
    }

    /* JADX INFO: renamed from: o.foT$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C18758foT EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C18758foT c18758foT) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c18758foT;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ = false;
                C13912dbY.copydefault.KWHzl(this.EZpvd.EZpvd);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.foT$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C18758foT OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C18758foT c18758foT) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c18758foT;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (C13912dbY.copydefault.gEmmrt()) {
                    ActivityC18750foL.StateListAnimator stateListAnimator = ActivityC18750foL.Companion;
                    android.content.Context contextRequireContext = this.OLrzqt.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    ActivityC18750foL.StateListAnimator.startActivity$default(stateListAnimator, contextRequireContext, this.OLrzqt.EZpvd, "route_defi_manual_backup", 0, 8, null);
                } else {
                    ActivityC18691fnF.Activity activity = ActivityC18691fnF.Companion;
                    android.content.Context contextRequireContext2 = this.OLrzqt.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                    ActivityC18691fnF.Activity.startActivity$default(activity, contextRequireContext2, this.OLrzqt.EZpvd, "route_defi_manual_backup", 0, 8, null);
                }
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }
}
