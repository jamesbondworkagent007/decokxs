package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iUy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24101iUy extends wXX {

    /* JADX INFO: renamed from: o.iUy$StateListAnimator */
    public interface StateListAnimator {
        void EZpvd();
    }

    @Override // o.wXX
    public float getHeightScale() {
        return 0.0f;
    }

    public final StateListAnimator AEQbTJ() {
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof StateListAnimator) {
            return (StateListAnimator) parentFragment;
        }
        return null;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        iJR ijrEZpvd = iJR.EZpvd(android.view.LayoutInflater.from(requireContext()));
        Intrinsics.checkNotNullExpressionValue(ijrEZpvd, "");
        C27577jxn c27577jxn = C27577jxn.copydefault;
        android.widget.TextView textView = ijrEZpvd.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        java.lang.String strCopydefault = C33069mpW.copydefault(this, C25493ixk.FragmentManager.DbNXlk, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("Terms", getString(C25493ixk.FragmentManager.isConnected))));
        java.lang.String string = getString(C25493ixk.FragmentManager.isConnected);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c27577jxn.copydefault(textView, strCopydefault, string, new Function0() { // from class: o.iUv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24101iUy.copydefault(this.OLrzqt);
            }
        });
        C52794wYp c52794wYp = ijrEZpvd.KWHzl;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = ijrEZpvd.AEQbTJ;
        c52794wYp2.setOnClickListener(new Application(c52794wYp2, 1000L, this));
        constraintLayout.addView(ijrEZpvd.getRoot(), new ViewGroup.LayoutParams(-1, -2));
    }

    public static final Unit copydefault(C24101iUy c24101iUy) throws java.io.UnsupportedEncodingException {
        android.content.Context context = c24101iUy.getContext();
        if (context != null) {
            C27508jwX c27508jwX = C27508jwX.AEQbTJ;
            java.lang.String string = c24101iUy.getString(C25493ixk.FragmentManager.fetchVPNInfo);
            Intrinsics.checkNotNullExpressionValue(string, "");
            C27508jwX.openUrl$default(c27508jwX, context, string, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setCloseVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(1);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.hOMIpD));
    }

    /* JADX INFO: renamed from: o.iUy$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C24101iUy KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C24101iUy c24101iUy) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c24101iUy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                SPUtils.put("sp_invest_friendlyreminder_dialog_never_show", java.lang.Boolean.TRUE);
                StateListAnimator stateListAnimatorAEQbTJ = this.KWHzl.AEQbTJ();
                if (stateListAnimatorAEQbTJ != null) {
                    stateListAnimatorAEQbTJ.EZpvd();
                }
                this.KWHzl.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.iUy$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C24101iUy EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C24101iUy c24101iUy) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c24101iUy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.dismiss();
            }
        }
    }
}
