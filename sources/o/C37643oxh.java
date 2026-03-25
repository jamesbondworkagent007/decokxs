package o;

import android.view.View;
import com.okinc.im.imui.share.model.SearchPayload;
import com.okinc.im.imui.share.model.SelectionStatus;
import com.okinc.okimcore.model.share.ShareTarget;
import kotlin.jvm.internal.Intrinsics;
import o.C37643oxh;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oxh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37643oxh implements InterfaceC35897oHt<java.lang.Object> {
    public Activity copydefault;

    /* JADX INFO: renamed from: o.oxh$Activity */
    public interface Activity {
        void OLrzqt(@NotNull ShareTarget shareTarget, boolean z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Activity AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Activity activity) {
        this.copydefault = activity;
    }

    @Override // o.InterfaceC35897oHt
    public void copydefault(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        C37730ozO.OLrzqt.OLrzqt(c35895oHr);
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        if ((c35895oHr instanceof StateListAnimator) && (obj instanceof C37580owX)) {
            ((StateListAnimator) c35895oHr).KWHzl((C37580owX) obj);
        }
    }

    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj instanceof C37580owX;
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nNL nnlAEQbTJ = nNL.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nnlAEQbTJ, "");
        return new StateListAnimator(this, nnlAEQbTJ);
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, @NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC35897oHt.Application.AEQbTJ(this, c35895oHr, obj, list);
        if ((!list.isEmpty()) && (c35895oHr instanceof StateListAnimator) && (obj instanceof C37580owX)) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (it.next() == SearchPayload.KEYWORD_OR_SELECTION) {
                    StateListAnimator stateListAnimator = (StateListAnimator) c35895oHr;
                    C37580owX c37580owX = (C37580owX) obj;
                    stateListAnimator.EZpvd(c37580owX);
                    stateListAnimator.OLrzqt(c37580owX);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.oxh$StateListAnimator */
    public final class StateListAnimator extends C35895oHr {
        public final /* synthetic */ C37643oxh AEQbTJ;
        public final nNL KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C37643oxh c37643oxh, nNL nnl) {
            super(nnl.getRoot().getContext(), nnl.getRoot());
            Intrinsics.checkNotNullParameter(nnl, "");
            this.AEQbTJ = c37643oxh;
            this.KWHzl = nnl;
        }

        public final void KWHzl(@NotNull C37580owX c37580owX) {
            Intrinsics.checkNotNullParameter(c37580owX, "");
            nNL nnl = this.KWHzl;
            C33933nLf c33933nLf = nnl.OLrzqt;
            c33933nLf.OLrzqt.setText(c37580owX.OLrzqt().EZpvd());
            C35893oHp c35893oHp = c33933nLf.EZpvd.copydefault;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C35891oHn.OLrzqt(c35893oHp, c37580owX.OLrzqt().AEQbTJ(), c37580owX.OLrzqt().KWHzl(), C33129mqd.gEmmrt(c37580owX.OLrzqt().EZpvd()));
            android.widget.TextView textView = c33933nLf.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C37716ozA.updateTagViewWithTagInfo$default(textView, c37580owX.OLrzqt().AYXKKw(), 0, null, false, false, false, 62, null);
            EZpvd(c37580owX);
            OLrzqt(c37580owX);
            wYK wyk = nnl.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(wyk, "");
            oGZ.OLrzqt(wyk);
        }

        public final void OLrzqt(@NotNull final C37580owX c37580owX) {
            Intrinsics.checkNotNullParameter(c37580owX, "");
            wYK wyk = this.KWHzl.AEQbTJ;
            SelectionStatus selectionStatusAEQbTJ = c37580owX.AEQbTJ();
            SelectionStatus selectionStatus = SelectionStatus.SELECTED;
            boolean z = true;
            wyk.setChecked(selectionStatusAEQbTJ == selectionStatus);
            if (c37580owX.AEQbTJ() != selectionStatus && c37580owX.AEQbTJ() == SelectionStatus.DISABLED) {
                z = false;
            }
            this.KWHzl.AEQbTJ.setEnabled(z);
            this.itemView.setClickable(z);
            android.view.View view = this.itemView;
            final C37643oxh c37643oxh = this.AEQbTJ;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.oxo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C37643oxh.StateListAnimator.copydefault(c37580owX, c37643oxh, view2);
                }
            });
        }

        public static final void copydefault(C37580owX c37580owX, C37643oxh c37643oxh, android.view.View view) {
            boolean z = c37580owX.AEQbTJ() == SelectionStatus.SELECTED;
            Activity activityAEQbTJ = c37643oxh.AEQbTJ();
            if (activityAEQbTJ != null) {
                activityAEQbTJ.OLrzqt(c37580owX.OLrzqt(), !z);
            }
        }

        public final void EZpvd(@NotNull C37580owX c37580owX) {
            Intrinsics.checkNotNullParameter(c37580owX, "");
            C37241oqC c37241oqC = C37241oqC.AEQbTJ;
            android.widget.TextView textView = this.KWHzl.OLrzqt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C37241oqC.handleKeywordHighlight$default(c37241oqC, this, textView, C33129mqd.gEmmrt(c37580owX.OLrzqt().EZpvd()), c37580owX.EZpvd(), false, 16, null);
        }
    }
}
