package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C44105sDn;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oAm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C35701oAm extends AbstractC52780wYb {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.oAm$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oAm.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.AbstractC52780wYb
    public java.lang.CharSequence AEQbTJ() {
        java.lang.String string = getString(C44105sDn.PendingIntent.AYXKKw);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.AbstractC52780wYb
    public void copydefault(@NotNull C54953xam c54953xam) {
        android.content.res.Resources resources;
        Intrinsics.checkNotNullParameter(c54953xam, "");
        c54953xam.OLrzqt.setTextAppearance(C52761wXj.LoaderManager.valueOf);
        c54953xam.OLrzqt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
        AppCompatTextView appCompatTextView = c54953xam.OLrzqt;
        FragmentActivity activity = getActivity();
        appCompatTextView.setText((activity == null || (resources = activity.getResources()) == null) ? null : resources.getString(C44105sDn.PendingIntent.values));
        AppCompatTextView appCompatTextView2 = c54953xam.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setPaddingRelative(appCompatTextView2.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), appCompatTextView2.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
        wYK wyk = c54953xam.KWHzl;
        Intrinsics.checkNotNullExpressionValue(wyk, "");
        wyk.setVisibility(8);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC52780wYb, o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.KWHzl().setVisibility(8);
        wxq.AYXKKw().setText(C44105sDn.PendingIntent.AYXKKw);
        android.widget.TextView textViewAYXKKw = wxq.AYXKKw();
        textViewAYXKKw.setPaddingRelative(textViewAYXKKw.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), textViewAYXKKw.getPaddingEnd(), textViewAYXKKw.getPaddingBottom());
        wxq.AYXKKw().setTextAppearance(C52761wXj.LoaderManager.AwvSrB);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        android.content.res.Resources resources;
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        FragmentActivity activity = getActivity();
        wyf.setPrimaryText((activity == null || (resources = activity.getResources()) == null) ? null : resources.getString(C44105sDn.PendingIntent.EZpvd));
        wyf.setVisibility(0);
        wyf.setOnClickListener(new Activity(wyf, 1000L, this));
        wyf.setPadding(wyf.getPaddingLeft(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.RcXXUw), wyf.getPaddingRight(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.RcXXUw));
    }

    /* JADX INFO: renamed from: o.oAm$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C35701oAm copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C35701oAm c35701oAm) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c35701oAm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.dismiss();
            }
        }
    }
}
