package o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mkC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32784mkC extends androidx.fragment.app.Fragment {
    public C32684miI OLrzqt;

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        C33537myN c33537myN;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C32684miI c32684miIOLrzqt = C32684miI.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c32684miIOLrzqt, "");
        this.OLrzqt = c32684miIOLrzqt;
        if (c32684miIOLrzqt != null && (c33537myN = c32684miIOLrzqt.AEQbTJ) != null) {
            c33537myN.getBackImage().setVisibility(0);
            c33537myN.getDoImage().setVisibility(0);
            c33537myN.setBackClickable(true);
            android.widget.ImageView backImage = c33537myN.getBackImage();
            backImage.setOnClickListener(new Application(backImage, 1000L, this));
            android.widget.ImageView doImage = c33537myN.getDoImage();
            doImage.setOnClickListener(new Activity(doImage, 1000L, this));
        }
        return c32684miIOLrzqt.getRoot();
    }

    public final void KWHzl() {
        getParentFragmentManager().popBackStack();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.mkC$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C32784mkC AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C32784mkC c32784mkC) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = c32784mkC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl();
            }
        }
    }

    /* JADX INFO: renamed from: o.mkC$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C32784mkC OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C32784mkC c32784mkC) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = c32784mkC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.KWHzl();
            }
        }
    }
}
