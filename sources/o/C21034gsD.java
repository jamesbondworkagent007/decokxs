package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.os.BundleKt;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.components.track.TrackChannel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gsD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21034gsD extends AbstractC52779wYa {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public Activity copydefault;

    /* JADX INFO: renamed from: o.gsD$Activity */
    public interface Activity {
        void AEQbTJ(android.os.Bundle bundle);
    }

    /* JADX INFO: renamed from: o.gsD$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gsD.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C21034gsD KWHzl(boolean z) {
            C21034gsD c21034gsD = new C21034gsD();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("isShowOnChainTransferEntry", z);
            c21034gsD.setArguments(bundle);
            return c21034gsD;
        }
    }

    public final boolean copydefault() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("isShowOnChainTransferEntry");
        }
        return false;
    }

    @Override // o.AbstractC52779wYa
    public void OLrzqt(@NotNull C54956xap c54956xap) {
        Intrinsics.checkNotNullParameter(c54956xap, "");
        C21027grx.copydefault.copydefault(false);
        AppCompatImageView appCompatImageView = c54956xap.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C14677dpv.OLrzqt(appCompatImageView, CDNSourceManager.ImageSource.ReceiveFromExchangeGuide);
        c54956xap.valueOf.setText(getString(C13754dXa.FragmentManager.ActivityResultContractsPickVisualMediaImageAndVideo));
        c54956xap.valueOf.setTextAppearance(C52761wXj.LoaderManager.getNewProxyInstance);
        c54956xap.valueOf.setTextAlignment(4);
        c54956xap.AEQbTJ.setText(getString(C13754dXa.FragmentManager.isSystemPickerAvailableactivity_release));
        c54956xap.AEQbTJ.setTextAppearance(C52761wXj.LoaderManager.zuBGHE);
        c54956xap.AEQbTJ.setTextAlignment(4);
    }

    @Override // o.AbstractC52779wYa, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        if (wyf.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = wyf.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null));
                layoutParams2.setMarginEnd(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null));
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        wyf.setType(7);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(257);
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setText(getString(C13754dXa.FragmentManager.ActivityResultContractsPickMultipleVisualMediaExternalSyntheticApiModelOutline0));
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setText(getString(C13754dXa.FragmentManager.ActivityResultContractsOpenMultipleDocuments));
        }
        C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
        if (c52794wYpCopydefault3 != null) {
            c52794wYpCopydefault3.setOnClickListener(new ActionBar(c52794wYpCopydefault3, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ3 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ3 != null) {
            c52794wYpAEQbTJ3.setOnClickListener(new Application(c52794wYpAEQbTJ3, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ4 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ4 != null) {
            c52794wYpAEQbTJ4.setVisibility(copydefault() ? 0 : 8);
        }
        if (copydefault()) {
            C32866mlf.onEvent$default("app_homeReceive_exchangeTransferIntro_show", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        } else {
            C32866mlf.onEvent$default("app_exchangeTransferIntro_show", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        }
        android.view.View view = getView();
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.gsB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C21034gsD.AEQbTJ(this.AEQbTJ);
                }
            });
        }
    }

    public static final void AEQbTJ(C21034gsD c21034gsD) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c21034gsD, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(activity, "");
        this.copydefault = activity;
        if (fragmentManager.isStateSaved()) {
            return;
        }
        show(fragmentManager, str);
    }

    /* JADX INFO: renamed from: o.gsD$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C21034gsD EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C21034gsD c21034gsD) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = c21034gsD;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.EZpvd.copydefault()) {
                    C32866mlf.onEvent$default("app_homeReceive_exchangeTransferIntro_next_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                } else {
                    C32866mlf.onEvent$default("app_exchangeTransferIntro_next_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                }
                Activity activity = this.EZpvd.copydefault;
                if (activity != null) {
                    activity.AEQbTJ(BundleKt.bundleOf(C56390yDp.OLrzqt("click_type", 1)));
                }
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.gsD$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C21034gsD EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C21034gsD c21034gsD) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c21034gsD;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C32866mlf.onEvent$default("app_homeReceive_exchangeTransferIntro_skip_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                Activity activity = this.EZpvd.copydefault;
                if (activity != null) {
                    activity.AEQbTJ(BundleKt.bundleOf(C56390yDp.OLrzqt("click_type", 2)));
                }
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }
}
