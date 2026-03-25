package o;

import android.view.View;
import com.okinc.im.imui.selectgroupvoicecallmember.model.SearchGroupCallMemberPayload;
import com.okinc.im.imui.selectgroupvoicecallmember.model.SelectionStatus;
import kotlin.jvm.internal.Intrinsics;
import o.C37565owI;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.owI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37565owI implements InterfaceC35897oHt<java.lang.Object> {
    public Application OLrzqt;

    /* JADX INFO: renamed from: o.owI$Application */
    public interface Application {
        void EZpvd(@NotNull C34282nYe c34282nYe, boolean z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Application application) {
        this.OLrzqt = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Application copydefault() {
        return this.OLrzqt;
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
        if ((c35895oHr instanceof StateListAnimator) && (obj instanceof C37563owG)) {
            ((StateListAnimator) c35895oHr).copydefault((C37563owG) obj);
        }
    }

    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj instanceof C37563owG;
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C34007nNz c34007nNzOLrzqt = C34007nNz.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c34007nNzOLrzqt, "");
        return new StateListAnimator(this, c34007nNzOLrzqt);
    }

    /* JADX INFO: renamed from: o.owI$StateListAnimator */
    public final class StateListAnimator extends C35895oHr {
        public final C34007nNz KWHzl;
        public final /* synthetic */ C37565owI OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C37565owI c37565owI, C34007nNz c34007nNz) {
            super(c34007nNz.getRoot().getContext(), c34007nNz.getRoot());
            Intrinsics.checkNotNullParameter(c34007nNz, "");
            this.OLrzqt = c37565owI;
            this.KWHzl = c34007nNz;
        }

        public final void copydefault(@NotNull C37563owG c37563owG) {
            Intrinsics.checkNotNullParameter(c37563owG, "");
            C34282nYe c34282nYeOLrzqt = c37563owG.OLrzqt();
            C37561owE c37561owE = C37561owE.EZpvd;
            C33933nLf c33933nLf = this.KWHzl.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c33933nLf, "");
            c37561owE.copydefault(c33933nLf, c34282nYeOLrzqt);
            OLrzqt(c37563owG);
            AEQbTJ(c37563owG);
        }

        public final void AEQbTJ(@NotNull final C37563owG c37563owG) {
            Intrinsics.checkNotNullParameter(c37563owG, "");
            wYK wyk = this.KWHzl.copydefault;
            SelectionStatus selectionStatusKWHzl = c37563owG.KWHzl();
            SelectionStatus selectionStatus = SelectionStatus.SELECTED;
            wyk.setChecked(selectionStatusKWHzl == selectionStatus || c37563owG.KWHzl() == SelectionStatus.COMPLETED);
            wyk.setEnabled(c37563owG.KWHzl() == selectionStatus || c37563owG.KWHzl() == SelectionStatus.UNSELECTED);
            Intrinsics.copydefault(wyk);
            oGZ.OLrzqt(wyk);
            if (this.KWHzl.copydefault.isEnabled()) {
                android.view.View view = this.itemView;
                final C37565owI c37565owI = this.OLrzqt;
                view.setOnClickListener(new View.OnClickListener() { // from class: o.owJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        C37565owI.StateListAnimator.EZpvd(c37563owG, c37565owI, view2);
                    }
                });
                return;
            }
            this.itemView.setOnClickListener(null);
        }

        public static final void EZpvd(C37563owG c37563owG, C37565owI c37565owI, android.view.View view) {
            boolean z = c37563owG.KWHzl() == SelectionStatus.SELECTED;
            Application applicationCopydefault = c37565owI.copydefault();
            if (applicationCopydefault != null) {
                applicationCopydefault.EZpvd(c37563owG.OLrzqt(), !z);
            }
        }

        public final void OLrzqt(@NotNull C37563owG c37563owG) {
            Intrinsics.checkNotNullParameter(c37563owG, "");
            C37241oqC c37241oqC = C37241oqC.AEQbTJ;
            android.widget.TextView textView = this.KWHzl.EZpvd.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C37241oqC.handleKeywordHighlight$default(c37241oqC, this, textView, c37563owG.OLrzqt().AEQbTJ(), c37563owG.copydefault(), false, 16, null);
        }
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, @NotNull java.util.List<? extends java.lang.Object> list) {
        java.util.Collection collectionEZpvd;
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC35897oHt.Application.AEQbTJ(this, c35895oHr, obj, list);
        if ((!list.isEmpty()) && (c35895oHr instanceof StateListAnimator) && (obj instanceof C37563owG)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (!(obj2 instanceof java.util.List)) {
                    collectionEZpvd = C56402yEa.EZpvd(obj2);
                } else {
                    collectionEZpvd = new java.util.ArrayList();
                    for (java.lang.Object obj3 : (java.lang.Iterable) obj2) {
                        if (obj3 instanceof SearchGroupCallMemberPayload) {
                            collectionEZpvd.add(obj3);
                        }
                    }
                }
                C56406yEe.KWHzl(arrayList, collectionEZpvd);
            }
            for (java.lang.Object obj4 : arrayList) {
                if (obj4 == SearchGroupCallMemberPayload.KEYWORD) {
                    ((StateListAnimator) c35895oHr).OLrzqt((C37563owG) obj);
                } else if (obj4 == SearchGroupCallMemberPayload.SELECTION) {
                    ((StateListAnimator) c35895oHr).AEQbTJ((C37563owG) obj);
                }
            }
        }
    }
}
