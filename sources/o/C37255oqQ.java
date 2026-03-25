package o;

import android.view.View;
import com.okinc.im.imui.relationlist.model.SearchLocalRelationPayload;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37255oqQ implements InterfaceC35897oHt<java.lang.Object> {
    public TaskDescription copydefault;

    /* JADX INFO: renamed from: o.oqQ$TaskDescription */
    public interface TaskDescription {
        void KWHzl(@NotNull C37247oqI c37247oqI);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(TaskDescription taskDescription) {
        this.copydefault = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaskDescription EZpvd() {
        return this.copydefault;
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
        if ((c35895oHr instanceof StateListAnimator) && (obj instanceof C37247oqI)) {
            ((StateListAnimator) c35895oHr).AEQbTJ((C37247oqI) obj);
        }
    }

    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj instanceof C37247oqI;
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC34000nNs abstractC34000nNsCopydefault = AbstractC34000nNs.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC34000nNsCopydefault, "");
        return new StateListAnimator(this, abstractC34000nNsCopydefault);
    }

    /* JADX INFO: renamed from: o.oqQ$StateListAnimator */
    public final class StateListAnimator extends C35895oHr {
        public final AbstractC34000nNs OLrzqt;
        public final /* synthetic */ C37255oqQ copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C37255oqQ c37255oqQ, AbstractC34000nNs abstractC34000nNs) {
            super(abstractC34000nNs.getRoot().getContext(), abstractC34000nNs.getRoot());
            Intrinsics.checkNotNullParameter(abstractC34000nNs, "");
            this.copydefault = c37255oqQ;
            this.OLrzqt = abstractC34000nNs;
        }

        public final void AEQbTJ(@NotNull C37247oqI c37247oqI) {
            Intrinsics.checkNotNullParameter(c37247oqI, "");
            nKZ nkz = this.OLrzqt.copydefault;
            nkz.KWHzl.setText(c37247oqI.copydefault().EZpvd());
            nkz.valueOf.setText(((PhoneRelation) CollectionsKt___CollectionsKt.AuCTelauCTel(c37247oqI.copydefault().OLrzqt())).getRawNumber());
            C35893oHp c35893oHp = nkz.copydefault;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C35891oHn.EZpvd(c35893oHp, c37247oqI.copydefault());
            KWHzl(this, c37247oqI);
            AEQbTJ(this, c37247oqI);
        }

        public final void AEQbTJ(@NotNull StateListAnimator stateListAnimator, @NotNull C37247oqI c37247oqI) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(c37247oqI, "");
            C37241oqC c37241oqC = C37241oqC.AEQbTJ;
            android.widget.TextView textView = stateListAnimator.OLrzqt.copydefault.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C37241oqC.handleKeywordHighlight$default(c37241oqC, stateListAnimator, textView, c37247oqI.copydefault().EZpvd(), c37247oqI.AEQbTJ(), false, 16, null);
            android.widget.TextView textView2 = stateListAnimator.OLrzqt.copydefault.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            c37241oqC.OLrzqt(stateListAnimator, textView2, ((PhoneRelation) CollectionsKt___CollectionsKt.AuCTelauCTel(c37247oqI.copydefault().OLrzqt())).getRawNumber(), c37247oqI.AEQbTJ(), true);
        }

        public final void KWHzl(@NotNull StateListAnimator stateListAnimator, @NotNull C37247oqI c37247oqI) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(c37247oqI, "");
            C55251xgS c55251xgS = stateListAnimator.OLrzqt.copydefault.AEQbTJ;
            int size = c37247oqI.copydefault().OLrzqt().size() - 1;
            if (size > 0) {
                c55251xgS.setVisibility(0);
                C56529yIt c56529yIt = C56529yIt.KWHzl;
                java.lang.String str = java.lang.String.format("+%s", java.util.Arrays.copyOf(new java.lang.Object[]{C33129mqd.gEmmrt(java.lang.Integer.valueOf(size))}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "");
                c55251xgS.setText(str);
            } else {
                c55251xgS.setVisibility(8);
            }
            android.view.View view = this.itemView;
            view.setOnClickListener(new Application(view, 1000L, this.copydefault, c37247oqI));
        }

        /* JADX INFO: renamed from: o.oqQ$StateListAnimator$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ C37247oqI EZpvd;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ C37255oqQ copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, C37255oqQ c37255oqQ, C37247oqI c37247oqI) {
                this.AEQbTJ = view;
                this.OLrzqt = j;
                this.copydefault = c37255oqQ;
                this.EZpvd = c37247oqI;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    TaskDescription taskDescriptionEZpvd = this.copydefault.EZpvd();
                    if (taskDescriptionEZpvd != null) {
                        taskDescriptionEZpvd.KWHzl(this.EZpvd);
                    }
                }
            }
        }
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, @NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC35897oHt.Application.AEQbTJ(this, c35895oHr, obj, list);
        if ((!list.isEmpty()) && (c35895oHr instanceof StateListAnimator) && (obj instanceof C37247oqI)) {
            for (java.lang.Object obj2 : list) {
                if (obj2 instanceof java.util.List) {
                    java.util.List list2 = (java.util.List) obj2;
                    if (list2.contains(SearchLocalRelationPayload.KEYWORD)) {
                        StateListAnimator stateListAnimator = (StateListAnimator) c35895oHr;
                        stateListAnimator.AEQbTJ(stateListAnimator, (C37247oqI) obj);
                    }
                    if (list2.contains(SearchLocalRelationPayload.OTHER_LOCAL_RELATION_COUNT)) {
                        StateListAnimator stateListAnimator2 = (StateListAnimator) c35895oHr;
                        stateListAnimator2.KWHzl(stateListAnimator2, (C37247oqI) obj);
                    }
                }
            }
        }
    }
}
