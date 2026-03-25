package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nGv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33814nGv extends AbstractC52785wYg {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public Function0<Unit> KWHzl;
    public final boolean OLrzqt = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC52785wYg
    public boolean AhwBna() {
        return this.OLrzqt;
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX INFO: renamed from: o.nGv$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nGv.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C33814nGv copydefault(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            C33814nGv c33814nGv = new C33814nGv();
            c33814nGv.KWHzl = function0;
            return c33814nGv;
        }
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.KWHzl().setVisibility(8);
    }

    @Override // o.AbstractC52785wYg
    public void AEQbTJ(@NotNull C54954xan c54954xan) {
        android.content.res.Resources resources;
        android.content.res.Resources resources2;
        Intrinsics.checkNotNullParameter(c54954xan, "");
        c54954xan.KWHzl.setImageResource(C52761wXj.TaskDescription.NRYds);
        c54954xan.KWHzl.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        c54954xan.AEQbTJ.setTextSize(0, C33070mpX.EZpvd(C52761wXj.StateListAnimator.iRxXKY));
        AppCompatTextView appCompatTextView = c54954xan.AEQbTJ;
        FragmentActivity activity = getActivity();
        appCompatTextView.setText((activity == null || (resources2 = activity.getResources()) == null) ? null : resources2.getString(C35399nuc.LoaderManager.Hx));
        c54954xan.OLrzqt.setTextSize(0, C33070mpX.EZpvd(C52761wXj.StateListAnimator.iZzfmt));
        AppCompatTextView appCompatTextView2 = c54954xan.OLrzqt;
        FragmentActivity activity2 = getActivity();
        appCompatTextView2.setText((activity2 == null || (resources = activity2.getResources()) == null) ? null : resources.getString(C35399nuc.LoaderManager.DRGLNw));
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        android.content.res.Resources resources;
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        FragmentActivity activity = getActivity();
        wyf.setPrimaryText((activity == null || (resources = activity.getResources()) == null) ? null : resources.getString(C35399nuc.LoaderManager.DSiOMJ));
        wyf.setVisibility(0);
        wyf.setOnClickListener(new Activity(wyf, 1000L, this));
        wyf.setPadding(wyf.getPaddingLeft(), 0, wyf.getPaddingRight(), wyf.getPaddingBottom());
    }

    /* JADX INFO: renamed from: o.nGv$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C33814nGv copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C33814nGv c33814nGv) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c33814nGv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0 function0 = this.copydefault.KWHzl;
                if (function0 != null) {
                    function0.invoke();
                }
                this.copydefault.dismiss();
            }
        }
    }
}
