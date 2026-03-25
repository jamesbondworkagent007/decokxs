package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nPV extends AbstractC52780wYb {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nPV.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final nPV OLrzqt() {
            return new nPV();
        }
    }

    @Override // o.AbstractC52780wYb
    public java.lang.CharSequence AEQbTJ() {
        java.lang.String string = getString(C35399nuc.LoaderManager.ilfrrN);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.AbstractC52780wYb
    public void copydefault(@NotNull C54953xam c54953xam) {
        Intrinsics.checkNotNullParameter(c54953xam, "");
        c54953xam.OLrzqt.setTextAppearance(C52761wXj.LoaderManager.valueOf);
        c54953xam.OLrzqt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
        c54953xam.OLrzqt.setText(getString(C35399nuc.LoaderManager.xxhdY));
        AppCompatTextView appCompatTextView = c54953xam.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setPaddingRelative(appCompatTextView.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), appCompatTextView.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
        wYK wyk = c54953xam.KWHzl;
        Intrinsics.checkNotNullExpressionValue(wyk, "");
        wyk.setVisibility(8);
    }

    @Override // o.AbstractC52780wYb, o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.KWHzl().setVisibility(8);
        wxq.AYXKKw().setText(C35399nuc.LoaderManager.ilfrrN);
        android.widget.TextView textViewAYXKKw = wxq.AYXKKw();
        textViewAYXKKw.setPaddingRelative(textViewAYXKKw.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), textViewAYXKKw.getPaddingEnd(), textViewAYXKKw.getPaddingBottom());
        wxq.AYXKKw().setTextAppearance(C52761wXj.LoaderManager.AwvSrB);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(getString(C35399nuc.LoaderManager.getFieldNames));
        wyf.setVisibility(0);
        wyf.setOnClickListener(new Activity(wyf, 1000L, this));
        wyf.setPadding(wyf.getPaddingLeft(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.fFgQHt), wyf.getPaddingRight(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.fFgQHt));
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ nPV copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, nPV npv) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = npv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.dismiss();
            }
        }
    }
}
