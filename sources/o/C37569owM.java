package o;

import android.view.View;
import com.okinc.im.bean.tag.TagSize;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.owM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37569owM implements InterfaceC35897oHt<java.lang.Object> {
    public StateListAnimator KWHzl;

    /* JADX INFO: renamed from: o.owM$StateListAnimator */
    public interface StateListAnimator {
        void AEQbTJ(@NotNull C34282nYe c34282nYe);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateListAnimator OLrzqt() {
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
        if ((c35895oHr instanceof Activity) && (obj instanceof C34282nYe)) {
            ((Activity) c35895oHr).AEQbTJ((C34282nYe) obj);
        }
    }

    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj instanceof C34282nYe;
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nNX nnxCopydefault = nNX.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nnxCopydefault, "");
        return new Activity(this, nnxCopydefault);
    }

    /* JADX INFO: renamed from: o.owM$Activity */
    public final class Activity extends C35895oHr {
        public final nNX AEQbTJ;
        public final /* synthetic */ C37569owM OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C37569owM c37569owM, nNX nnx) {
            super(nnx.getRoot().getContext(), nnx.getRoot());
            Intrinsics.checkNotNullParameter(nnx, "");
            this.OLrzqt = c37569owM;
            this.AEQbTJ = nnx;
        }

        public final void AEQbTJ(@NotNull C34282nYe c34282nYe) {
            Intrinsics.checkNotNullParameter(c34282nYe, "");
            nNX nnx = this.AEQbTJ;
            C37569owM c37569owM = this.OLrzqt;
            nnx.EZpvd.setText(c34282nYe.AEQbTJ());
            C35893oHp c35893oHp = nnx.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C37716ozA.KWHzl(c35893oHp, c34282nYe.djBIcL(), TagSize.DP_18);
            C35893oHp c35893oHp2 = nnx.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c35893oHp2, "");
            C35891oHn.AEQbTJ(c35893oHp2, c34282nYe);
            nnx.OLrzqt.bringToFront();
            android.view.View view = this.itemView;
            view.setOnClickListener(new TaskDescription(view, 1000L, c37569owM, c34282nYe));
        }

        /* JADX INFO: renamed from: o.owM$Activity$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ C37569owM AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ C34282nYe KWHzl;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, C37569owM c37569owM, C34282nYe c34282nYe) {
                this.copydefault = view;
                this.EZpvd = j;
                this.AEQbTJ = c37569owM;
                this.KWHzl = c34282nYe;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    StateListAnimator stateListAnimatorOLrzqt = this.AEQbTJ.OLrzqt();
                    if (stateListAnimatorOLrzqt != null) {
                        stateListAnimatorOLrzqt.AEQbTJ(this.KWHzl);
                    }
                }
            }
        }
    }
}
