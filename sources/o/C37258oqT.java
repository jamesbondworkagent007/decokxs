package o;

import android.view.View;
import com.okinc.im.imui.relationlist.model.SearchLocalRelationPayload;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37258oqT implements InterfaceC35897oHt<java.lang.Object> {
    public TaskDescription KWHzl;

    /* JADX INFO: renamed from: o.oqT$TaskDescription */
    public interface TaskDescription {
        void OLrzqt(@NotNull C37245oqG c37245oqG);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(TaskDescription taskDescription) {
        this.KWHzl = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaskDescription OLrzqt() {
        return this.KWHzl;
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
        if ((c35895oHr instanceof StateListAnimator) && (obj instanceof C37245oqG)) {
            ((StateListAnimator) c35895oHr).OLrzqt((C37245oqG) obj);
        }
    }

    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj instanceof C37245oqG;
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nNO nnoKWHzl = nNO.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nnoKWHzl, "");
        return new StateListAnimator(this, nnoKWHzl);
    }

    /* JADX INFO: renamed from: o.oqT$StateListAnimator */
    public final class StateListAnimator extends C35895oHr {
        public final /* synthetic */ C37258oqT EZpvd;
        public final nNO KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C37258oqT c37258oqT, nNO nno) {
            super(nno.getRoot().getContext(), nno.getRoot());
            Intrinsics.checkNotNullParameter(nno, "");
            this.EZpvd = c37258oqT;
            this.KWHzl = nno;
        }

        public final void OLrzqt(@NotNull C37245oqG c37245oqG) {
            Intrinsics.checkNotNullParameter(c37245oqG, "");
            nNO nno = this.KWHzl;
            C37258oqT c37258oqT = this.EZpvd;
            C37241oqC c37241oqC = C37241oqC.AEQbTJ;
            C33933nLf c33933nLf = nno.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c33933nLf, "");
            c37241oqC.AEQbTJ(c33933nLf, c37245oqG.AEQbTJ().getRelationInfo());
            AEQbTJ(this, c37245oqG);
            android.widget.TextView textView = nno.EZpvd.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            android.view.View view = this.itemView;
            view.setOnClickListener(new Activity(view, 1000L, c37258oqT, c37245oqG));
        }

        public final void AEQbTJ(@NotNull StateListAnimator stateListAnimator, @NotNull C37245oqG c37245oqG) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(c37245oqG, "");
            C37241oqC c37241oqC = C37241oqC.AEQbTJ;
            android.widget.TextView textView = stateListAnimator.KWHzl.EZpvd.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C37241oqC.handleKeywordHighlight$default(c37241oqC, stateListAnimator, textView, c37245oqG.AEQbTJ().getRelationInfo().getNickName(), c37245oqG.OLrzqt(), false, 16, null);
        }

        /* JADX INFO: renamed from: o.oqT$StateListAnimator$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ C37258oqT AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ C37245oqG OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, C37258oqT c37258oqT, C37245oqG c37245oqG) {
                this.EZpvd = view;
                this.KWHzl = j;
                this.AEQbTJ = c37258oqT;
                this.OLrzqt = c37245oqG;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    TaskDescription taskDescriptionOLrzqt = this.AEQbTJ.OLrzqt();
                    if (taskDescriptionOLrzqt != null) {
                        taskDescriptionOLrzqt.OLrzqt(this.OLrzqt);
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
        if ((!list.isEmpty()) && (c35895oHr instanceof StateListAnimator) && (obj instanceof C37245oqG) && list.contains(SearchLocalRelationPayload.KEYWORD)) {
            StateListAnimator stateListAnimator = (StateListAnimator) c35895oHr;
            stateListAnimator.AEQbTJ(stateListAnimator, (C37245oqG) obj);
        }
    }
}
