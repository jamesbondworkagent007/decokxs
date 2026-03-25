package o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import o.C33836nHq;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nHs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33838nHs implements InterfaceC35897oHt<java.lang.Object> {
    public C33836nHq.Activity KWHzl;
    public C33836nHq.StateListAnimator copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(C33836nHq.StateListAnimator stateListAnimator) {
        this.copydefault = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(C33836nHq.Activity activity) {
        this.KWHzl = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33836nHq.StateListAnimator OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33836nHq.Activity copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35897oHt
    public void copydefault(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, @NotNull java.util.List<? extends java.lang.Object> list) {
        InterfaceC35897oHt.Application.AEQbTJ(this, c35895oHr, obj, list);
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        if ((obj instanceof nGL) && (c35895oHr instanceof StateListAnimator)) {
            ((StateListAnimator) c35895oHr).copydefault();
        }
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C34011nOc c34011nOcKWHzl = C34011nOc.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c34011nOcKWHzl, "");
        return new StateListAnimator(this, c34011nOcKWHzl);
    }

    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj instanceof nGL;
    }

    /* JADX INFO: renamed from: o.nHs$StateListAnimator */
    public final class StateListAnimator extends C35895oHr {
        public final /* synthetic */ C33838nHs KWHzl;
        public final C34011nOc copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C33838nHs c33838nHs, C34011nOc c34011nOc) {
            super(c34011nOc.getRoot().getContext(), c34011nOc.getRoot());
            Intrinsics.checkNotNullParameter(c34011nOc, "");
            this.KWHzl = c33838nHs;
            this.copydefault = c34011nOc;
        }

        public final void copydefault() {
            C52794wYp c52794wYp = this.copydefault.KWHzl;
            c52794wYp.setOnClickListener(new ViewOnClickListenerC0890StateListAnimator(c52794wYp, 1000L, this.KWHzl));
            android.widget.ImageView imageView = this.copydefault.copydefault;
            imageView.setOnClickListener(new Application(imageView, 1000L, this.KWHzl));
        }

        /* JADX INFO: renamed from: o.nHs$StateListAnimator$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ C33838nHs AEQbTJ;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ long OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, C33838nHs c33838nHs) {
                this.KWHzl = view;
                this.OLrzqt = j;
                this.AEQbTJ = c33838nHs;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    C33836nHq.StateListAnimator stateListAnimatorOLrzqt = this.AEQbTJ.OLrzqt();
                    if (stateListAnimatorOLrzqt != null) {
                        stateListAnimatorOLrzqt.copydefault();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: o.nHs$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0890StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ C33838nHs AEQbTJ;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0890StateListAnimator(android.view.View view, long j, C33838nHs c33838nHs) {
                this.KWHzl = view;
                this.copydefault = j;
                this.AEQbTJ = c33838nHs;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    C33836nHq.Activity activityCopydefault = this.AEQbTJ.copydefault();
                    if (activityCopydefault != null) {
                        activityCopydefault.AEQbTJ();
                    }
                }
            }
        }
    }
}
