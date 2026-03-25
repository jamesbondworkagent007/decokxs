package o;

import android.view.View;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nHn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33833nHn implements InterfaceC35897oHt<java.lang.Object> {
    public TaskDescription copydefault;

    /* JADX INFO: renamed from: o.nHn$TaskDescription */
    public interface TaskDescription {
        void OLrzqt(@NotNull C37246oqH c37246oqH);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaskDescription EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(TaskDescription taskDescription) {
        this.copydefault = taskDescription;
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
        if ((c35895oHr instanceof StateListAnimator) && (obj instanceof C37246oqH)) {
            ((StateListAnimator) c35895oHr).EZpvd((C37246oqH) obj);
        }
    }

    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj instanceof C37246oqH;
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C34012nOd c34012nOdCopydefault = C34012nOd.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c34012nOdCopydefault, "");
        return new StateListAnimator(this, c34012nOdCopydefault);
    }

    /* JADX INFO: renamed from: o.nHn$StateListAnimator */
    public final class StateListAnimator extends C35895oHr {
        public final C34012nOd AEQbTJ;
        public final /* synthetic */ C33833nHn EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C33833nHn c33833nHn, C34012nOd c34012nOd) {
            super(c34012nOd.getRoot().getContext(), c34012nOd.getRoot());
            Intrinsics.checkNotNullParameter(c34012nOd, "");
            this.EZpvd = c33833nHn;
            this.AEQbTJ = c34012nOd;
        }

        public final void EZpvd(@NotNull C37246oqH c37246oqH) {
            Intrinsics.checkNotNullParameter(c37246oqH, "");
            C33929nLb c33929nLb = this.AEQbTJ.AEQbTJ;
            c33929nLb.copydefault.setText(c37246oqH.EZpvd());
            c33929nLb.djBIcL.setText(((PhoneRelation) CollectionsKt___CollectionsKt.AuCTelauCTel(c37246oqH.OLrzqt())).getRawNumber());
            C35893oHp c35893oHp = c33929nLb.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C35891oHn.EZpvd(c35893oHp, c37246oqH);
            copydefault(this, c37246oqH);
        }

        public final void copydefault(StateListAnimator stateListAnimator, C37246oqH c37246oqH) {
            C55251xgS c55251xgS = stateListAnimator.AEQbTJ.AEQbTJ.AEQbTJ;
            int size = c37246oqH.OLrzqt().size() - 1;
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
            view.setOnClickListener(new Activity(view, 1000L, this.EZpvd, c37246oqH));
        }

        /* JADX INFO: renamed from: o.nHn$StateListAnimator$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ C33833nHn AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ C37246oqH copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, C33833nHn c33833nHn, C37246oqH c37246oqH) {
                this.EZpvd = view;
                this.KWHzl = j;
                this.AEQbTJ = c33833nHn;
                this.copydefault = c37246oqH;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    TaskDescription taskDescriptionEZpvd = this.AEQbTJ.EZpvd();
                    if (taskDescriptionEZpvd != null) {
                        taskDescriptionEZpvd.OLrzqt(this.copydefault);
                    }
                }
            }
        }
    }
}
