package o;

import android.view.View;
import com.okinc.im.imui.relationlist.model.SearchFriendPayload;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37254oqP implements InterfaceC35897oHt<java.lang.Object> {
    public StateListAnimator OLrzqt;

    /* JADX INFO: renamed from: o.oqP$StateListAnimator */
    public interface StateListAnimator {
        void AEQbTJ(@NotNull RelationInfo relationInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(StateListAnimator stateListAnimator) {
        this.OLrzqt = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateListAnimator copydefault() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC35897oHt
    public void copydefault(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        C37241oqC.AEQbTJ.copydefault(c35895oHr);
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        if ((c35895oHr instanceof TaskDescription) && (obj instanceof C37244oqF)) {
            ((TaskDescription) c35895oHr).copydefault((C37244oqF) obj);
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
        nNO nnoKWHzl = nNO.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nnoKWHzl, "");
        return new TaskDescription(this, nnoKWHzl);
    }

    /* JADX INFO: renamed from: o.oqP$TaskDescription */
    public final class TaskDescription extends C35895oHr {
        public final /* synthetic */ C37254oqP EZpvd;
        public final nNO copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C37254oqP c37254oqP, nNO nno) {
            super(nno.getRoot().getContext(), nno.getRoot());
            Intrinsics.checkNotNullParameter(nno, "");
            this.EZpvd = c37254oqP;
            this.copydefault = nno;
        }

        public final void copydefault(@NotNull C37244oqF c37244oqF) {
            Intrinsics.checkNotNullParameter(c37244oqF, "");
            C37254oqP c37254oqP = this.EZpvd;
            RelationInfo relationInfoOLrzqt = c37244oqF.OLrzqt();
            C37241oqC c37241oqC = C37241oqC.AEQbTJ;
            C33933nLf c33933nLf = this.copydefault.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c33933nLf, "");
            c37241oqC.AEQbTJ(c33933nLf, relationInfoOLrzqt);
            C33933nLf c33933nLf2 = this.copydefault.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c33933nLf2, "");
            java.lang.String phoneRawNumber = relationInfoOLrzqt.getPhoneRawNumber();
            c37241oqC.OLrzqt(c33933nLf2, phoneRawNumber != null ? phoneRawNumber : "");
            KWHzl(this, c37244oqF);
            android.view.View view = this.itemView;
            view.setOnClickListener(new StateListAnimator(view, 1000L, c37254oqP, c37244oqF));
        }

        public final void KWHzl(@NotNull TaskDescription taskDescription, @NotNull C37244oqF c37244oqF) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            Intrinsics.checkNotNullParameter(c37244oqF, "");
            C37241oqC c37241oqC = C37241oqC.AEQbTJ;
            android.widget.TextView textView = taskDescription.copydefault.EZpvd.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C37241oqC.handleKeywordHighlight$default(c37241oqC, taskDescription, textView, C44157sFk.getDisplayName$default(c37244oqF.OLrzqt(), null, 1, null), c37244oqF.copydefault(), false, 16, null);
            java.lang.String phoneRawNumber = c37244oqF.OLrzqt().getPhoneRawNumber();
            if (phoneRawNumber != null) {
                android.widget.TextView textView2 = taskDescription.copydefault.EZpvd.djBIcL;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                c37241oqC.OLrzqt(taskDescription, textView2, phoneRawNumber, c37244oqF.copydefault(), true);
            }
        }

        /* JADX INFO: renamed from: o.oqP$TaskDescription$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ C37244oqF AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ C37254oqP copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j, C37254oqP c37254oqP, C37244oqF c37244oqF) {
                this.EZpvd = view;
                this.OLrzqt = j;
                this.copydefault = c37254oqP;
                this.AEQbTJ = c37244oqF;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    StateListAnimator stateListAnimatorCopydefault = this.copydefault.copydefault();
                    if (stateListAnimatorCopydefault != null) {
                        stateListAnimatorCopydefault.AEQbTJ(this.AEQbTJ.OLrzqt());
                    }
                }
            }
        }
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, @NotNull java.util.List<? extends java.lang.Object> list) {
        java.util.Collection collectionAhwBna;
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC35897oHt.Application.AEQbTJ(this, c35895oHr, obj, list);
        if ((!list.isEmpty()) && (c35895oHr instanceof TaskDescription) && (obj instanceof C37244oqF)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (!(obj2 instanceof java.util.List)) {
                    collectionAhwBna = yDY.AhwBna();
                } else {
                    collectionAhwBna = new java.util.ArrayList();
                    for (java.lang.Object obj3 : (java.lang.Iterable) obj2) {
                        if (obj3 instanceof SearchFriendPayload) {
                            collectionAhwBna.add(obj3);
                        }
                    }
                }
                C56406yEe.KWHzl(arrayList, collectionAhwBna);
            }
            if (arrayList.contains(SearchFriendPayload.KEYWORD)) {
                TaskDescription taskDescription = (TaskDescription) c35895oHr;
                taskDescription.KWHzl(taskDescription, (C37244oqF) obj);
            }
        }
    }
}
