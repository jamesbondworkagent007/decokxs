package o;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nHq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33836nHq implements InterfaceC35897oHt<java.lang.Object> {
    public final boolean AEQbTJ;
    public Activity EZpvd;
    public StateListAnimator OLrzqt;

    /* JADX INFO: renamed from: o.nHq$Activity */
    public interface Activity {
        void AEQbTJ();
    }

    /* JADX INFO: renamed from: o.nHq$StateListAnimator */
    public interface StateListAnimator {
        void copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Activity activity) {
        this.EZpvd = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(StateListAnimator stateListAnimator) {
        this.OLrzqt = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Activity KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateListAnimator OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35897oHt
    public void copydefault(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
    }

    public C33836nHq(boolean z) {
        this.AEQbTJ = z;
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, @NotNull java.util.List<? extends java.lang.Object> list) {
        InterfaceC35897oHt.Application.AEQbTJ(this, c35895oHr, obj, list);
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        if ((obj instanceof nGK) && (c35895oHr instanceof ActionBar)) {
            ((ActionBar) c35895oHr).AEQbTJ();
        }
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C34009nOa c34009nOaEZpvd = C34009nOa.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c34009nOaEZpvd, "");
        return new ActionBar(this, c34009nOaEZpvd);
    }

    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj instanceof nGK;
    }

    /* JADX INFO: renamed from: o.nHq$ActionBar */
    public final class ActionBar extends C35895oHr {
        public final /* synthetic */ C33836nHq EZpvd;
        public final C34009nOa KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C33836nHq c33836nHq, C34009nOa c34009nOa) {
            super(c34009nOa.getRoot().getContext(), c34009nOa.getRoot());
            Intrinsics.checkNotNullParameter(c34009nOa, "");
            this.EZpvd = c33836nHq;
            this.KWHzl = c34009nOa;
        }

        public final void AEQbTJ() {
            int iCopydefault;
            if (this.EZpvd.EZpvd()) {
                iCopydefault = 0;
            } else {
                android.content.Context context = this.KWHzl.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iCopydefault = C55298xhM.copydefault(12.0f, context);
            }
            ViewGroup.LayoutParams layoutParams = this.KWHzl.KWHzl.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = iCopydefault;
                this.KWHzl.KWHzl.setLayoutParams(marginLayoutParams);
            }
            wYE wye = this.KWHzl.AEQbTJ;
            wye.setOnClickListener(new Activity(wye, 1000L, this.EZpvd));
            android.widget.ImageView imageView = this.KWHzl.EZpvd;
            imageView.setOnClickListener(new StateListAnimator(imageView, 1000L, this.EZpvd));
        }

        /* JADX INFO: renamed from: o.nHq$ActionBar$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ C33836nHq KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, C33836nHq c33836nHq) {
                this.OLrzqt = view;
                this.AEQbTJ = j;
                this.KWHzl = c33836nHq;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    Activity activityKWHzl = this.KWHzl.KWHzl();
                    if (activityKWHzl != null) {
                        activityKWHzl.AEQbTJ();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: o.nHq$ActionBar$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ C33836nHq copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j, C33836nHq c33836nHq) {
                this.EZpvd = view;
                this.KWHzl = j;
                this.copydefault = c33836nHq;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    StateListAnimator stateListAnimatorOLrzqt = this.copydefault.OLrzqt();
                    if (stateListAnimatorOLrzqt != null) {
                        stateListAnimatorOLrzqt.copydefault();
                    }
                }
            }
        }
    }
}
