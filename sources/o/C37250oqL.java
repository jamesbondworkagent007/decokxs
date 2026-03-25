package o;

import android.view.View;
import com.okinc.im.imui.relationlist.model.SearchFriendPayload;
import com.okinc.im.imui.relationlist.model.SelectionStatus;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C37250oqL;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37250oqL implements InterfaceC35897oHt<java.lang.Object> {
    public Application copydefault;

    /* JADX INFO: renamed from: o.oqL$Application */
    public interface Application {
        void AEQbTJ(@NotNull RelationInfo relationInfo, boolean z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Application application) {
        this.copydefault = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Application OLrzqt() {
        return this.copydefault;
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
        if ((c35895oHr instanceof TaskDescription) && (obj instanceof C37244oqF)) {
            ((TaskDescription) c35895oHr).AEQbTJ((C37244oqF) obj);
        }
    }

    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj instanceof C37244oqF;
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nNL nnlAEQbTJ = nNL.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nnlAEQbTJ, "");
        return new TaskDescription(this, nnlAEQbTJ);
    }

    /* JADX INFO: renamed from: o.oqL$TaskDescription */
    public final class TaskDescription extends C35895oHr {
        public final nNL AEQbTJ;
        public final /* synthetic */ C37250oqL KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C37250oqL c37250oqL, nNL nnl) {
            super(nnl.getRoot().getContext(), nnl.getRoot());
            Intrinsics.checkNotNullParameter(nnl, "");
            this.KWHzl = c37250oqL;
            this.AEQbTJ = nnl;
        }

        public final void AEQbTJ(@NotNull C37244oqF c37244oqF) {
            Intrinsics.checkNotNullParameter(c37244oqF, "");
            RelationInfo relationInfoOLrzqt = c37244oqF.OLrzqt();
            C37241oqC c37241oqC = C37241oqC.AEQbTJ;
            C33933nLf c33933nLf = this.AEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c33933nLf, "");
            c37241oqC.AEQbTJ(c33933nLf, relationInfoOLrzqt);
            C33933nLf c33933nLf2 = this.AEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c33933nLf2, "");
            java.lang.String phoneRawNumber = relationInfoOLrzqt.getPhoneRawNumber();
            c37241oqC.OLrzqt(c33933nLf2, phoneRawNumber != null ? phoneRawNumber : "");
            copydefault(c37244oqF);
            OLrzqt(c37244oqF);
        }

        public final void OLrzqt(@NotNull final C37244oqF c37244oqF) {
            Intrinsics.checkNotNullParameter(c37244oqF, "");
            wYK wyk = this.AEQbTJ.AEQbTJ;
            SelectionStatus selectionStatusKWHzl = c37244oqF.KWHzl();
            SelectionStatus selectionStatus = SelectionStatus.SELECTED;
            wyk.setChecked(selectionStatusKWHzl == selectionStatus || c37244oqF.KWHzl() == SelectionStatus.COMPLETED);
            wyk.setEnabled(c37244oqF.KWHzl() == selectionStatus || c37244oqF.KWHzl() == SelectionStatus.UNSELECTED);
            Intrinsics.copydefault(wyk);
            oGZ.OLrzqt(wyk);
            if (this.AEQbTJ.AEQbTJ.isEnabled()) {
                android.view.View view = this.itemView;
                final C37250oqL c37250oqL = this.KWHzl;
                view.setOnClickListener(new View.OnClickListener() { // from class: o.oqN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        C37250oqL.TaskDescription.KWHzl(c37244oqF, c37250oqL, view2);
                    }
                });
                return;
            }
            this.itemView.setOnClickListener(null);
        }

        public static final void KWHzl(C37244oqF c37244oqF, C37250oqL c37250oqL, android.view.View view) {
            boolean z = c37244oqF.KWHzl() == SelectionStatus.SELECTED;
            Application applicationOLrzqt = c37250oqL.OLrzqt();
            if (applicationOLrzqt != null) {
                applicationOLrzqt.AEQbTJ(c37244oqF.OLrzqt(), !z);
            }
        }

        public final void copydefault(@NotNull C37244oqF c37244oqF) {
            Intrinsics.checkNotNullParameter(c37244oqF, "");
            C37241oqC c37241oqC = C37241oqC.AEQbTJ;
            android.widget.TextView textView = this.AEQbTJ.OLrzqt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C37241oqC.handleKeywordHighlight$default(c37241oqC, this, textView, C44157sFk.getDisplayName$default(c37244oqF.OLrzqt(), null, 1, null), c37244oqF.copydefault(), false, 16, null);
        }
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, @NotNull java.util.List<? extends java.lang.Object> list) {
        java.util.Collection collectionEZpvd;
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC35897oHt.Application.AEQbTJ(this, c35895oHr, obj, list);
        if ((!list.isEmpty()) && (c35895oHr instanceof TaskDescription) && (obj instanceof C37244oqF)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (!(obj2 instanceof java.util.List)) {
                    collectionEZpvd = C56402yEa.EZpvd(obj2);
                } else {
                    collectionEZpvd = new java.util.ArrayList();
                    for (java.lang.Object obj3 : (java.lang.Iterable) obj2) {
                        if (obj3 instanceof SearchFriendPayload) {
                            collectionEZpvd.add(obj3);
                        }
                    }
                }
                C56406yEe.KWHzl(arrayList, collectionEZpvd);
            }
            for (java.lang.Object obj4 : arrayList) {
                if (obj4 == SearchFriendPayload.KEYWORD) {
                    ((TaskDescription) c35895oHr).copydefault((C37244oqF) obj);
                } else if (obj4 == SearchFriendPayload.SELECTION) {
                    ((TaskDescription) c35895oHr).OLrzqt((C37244oqF) obj);
                }
            }
        }
    }
}
