package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.siL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45040siL extends AbstractC52787wYi {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public AbstractC47490tqy KWHzl;

    /* JADX INFO: renamed from: o.siL$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.siL.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            new C45040siL().show(fragmentManager);
        }
    }

    public final java.lang.CharSequence copydefault() {
        java.lang.String string = getString(C47315tni.PendingIntent.QHmsKR);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.AEQbTJ().setVisibility(8);
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(0);
        wxq.valueOf().setForegroundGravity(8388611);
        wxq.AYXKKw().setGravity(8388611);
        android.widget.TextView textViewAYXKKw = wxq.AYXKKw();
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        C55296xhK.OLrzqt(textViewAYXKKw, fValueOf, fValueOf, java.lang.Float.valueOf(50.0f), fValueOf);
        wxq.AYXKKw().setPadding(0, 2, 0, 0);
        wxq.setTitle(copydefault());
        wxq.setDividerVisibility(false);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new StateListAnimator(imageViewKWHzl, 1000L, this));
    }

    @Override // o.AbstractC52787wYi, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.KWHzl = (AbstractC47490tqy) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C47315tni.ActionBar.QCjLjM, constraintLayout, true);
        ((android.widget.TextView) constraintLayout.findViewById(C47315tni.TaskDescription.ORxRYg)).setText(new android.text.SpannableString(getString(C47315tni.PendingIntent.zuWLRA)));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.siK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C45040siL.copydefault(this.AEQbTJ);
            }
        });
    }

    public static final void copydefault(C45040siL c45040siL) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c45040siL, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.siL$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C45040siL OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C45040siL c45040siL) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = c45040siL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.dismiss();
            }
        }
    }
}
