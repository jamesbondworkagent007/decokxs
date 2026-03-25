package o;

import android.view.View;
import com.okinc.im.bean.tag.TagSize;
import com.okinc.okimcore.model.share.ShareTarget;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oxn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37649oxn implements InterfaceC35897oHt<java.lang.Object> {
    public StateListAnimator EZpvd;

    /* JADX INFO: renamed from: o.oxn$StateListAnimator */
    public interface StateListAnimator {
        void OLrzqt(@NotNull ShareTarget shareTarget);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateListAnimator copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35897oHt
    public void copydefault(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator;
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, @NotNull java.util.List<? extends java.lang.Object> list) {
        InterfaceC35897oHt.Application.AEQbTJ(this, c35895oHr, obj, list);
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        if ((c35895oHr instanceof ActionBar) && (obj instanceof ShareTarget)) {
            ((ActionBar) c35895oHr).copydefault((ShareTarget) obj);
        }
    }

    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj instanceof ShareTarget;
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C34013nOe c34013nOeOLrzqt = C34013nOe.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c34013nOeOLrzqt, "");
        return new ActionBar(this, c34013nOeOLrzqt);
    }

    /* JADX INFO: renamed from: o.oxn$ActionBar */
    public final class ActionBar extends C35895oHr {
        public final C34013nOe KWHzl;
        public final /* synthetic */ C37649oxn copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C37649oxn c37649oxn, C34013nOe c34013nOe) {
            super(c34013nOe.getRoot().getContext(), c34013nOe.getRoot());
            Intrinsics.checkNotNullParameter(c34013nOe, "");
            this.copydefault = c37649oxn;
            this.KWHzl = c34013nOe;
        }

        public final void copydefault(@NotNull ShareTarget shareTarget) {
            Intrinsics.checkNotNullParameter(shareTarget, "");
            C34013nOe c34013nOe = this.KWHzl;
            C37649oxn c37649oxn = this.copydefault;
            c34013nOe.copydefault.setText(shareTarget.EZpvd());
            C35893oHp c35893oHp = c34013nOe.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C37716ozA.KWHzl(c35893oHp, shareTarget.AYXKKw(), TagSize.DP_18);
            C35893oHp c35893oHp2 = c34013nOe.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c35893oHp2, "");
            C35891oHn.OLrzqt(c35893oHp2, shareTarget.AEQbTJ(), shareTarget.KWHzl(), C33129mqd.gEmmrt(shareTarget.EZpvd()));
            c34013nOe.EZpvd.bringToFront();
            android.view.View view = this.itemView;
            view.setOnClickListener(new Activity(view, 1000L, c37649oxn, shareTarget));
        }

        /* JADX INFO: renamed from: o.oxn$ActionBar$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ C37649oxn EZpvd;
            public final /* synthetic */ ShareTarget KWHzl;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, C37649oxn c37649oxn, ShareTarget shareTarget) {
                this.copydefault = view;
                this.OLrzqt = j;
                this.EZpvd = c37649oxn;
                this.KWHzl = shareTarget;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    StateListAnimator stateListAnimatorCopydefault = this.EZpvd.copydefault();
                    if (stateListAnimatorCopydefault != null) {
                        stateListAnimatorCopydefault.OLrzqt(this.KWHzl);
                    }
                }
            }
        }
    }
}
