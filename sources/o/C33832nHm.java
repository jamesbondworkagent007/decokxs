package o;

import android.view.View;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nHm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33832nHm implements InterfaceC35897oHt<java.lang.Object> {
    public Application KWHzl;

    /* JADX INFO: renamed from: o.nHm$Application */
    public interface Application {
        void EZpvd(@NotNull RelationInfo relationInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Application EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Application application) {
        this.KWHzl = application;
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
        if ((obj instanceof C37248oqJ) && (c35895oHr instanceof Activity)) {
            ((Activity) c35895oHr).AEQbTJ((C37248oqJ) obj);
        }
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C34010nOb c34010nObKWHzl = C34010nOb.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c34010nObKWHzl, "");
        return new Activity(this, c34010nObKWHzl);
    }

    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj instanceof C37248oqJ;
    }

    /* JADX INFO: renamed from: o.nHm$Activity */
    public final class Activity extends C35895oHr {
        public final C34010nOb KWHzl;
        public final /* synthetic */ C33832nHm copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C33832nHm c33832nHm, C34010nOb c34010nOb) {
            super(c34010nOb.getRoot().getContext(), c34010nOb.getRoot());
            Intrinsics.checkNotNullParameter(c34010nOb, "");
            this.copydefault = c33832nHm;
            this.KWHzl = c34010nOb;
        }

        public final void AEQbTJ(@NotNull C37248oqJ c37248oqJ) {
            Intrinsics.checkNotNullParameter(c37248oqJ, "");
            C34010nOb c34010nOb = this.KWHzl;
            C33832nHm c33832nHm = this.copydefault;
            C37241oqC c37241oqC = C37241oqC.AEQbTJ;
            C33931nLd c33931nLd = c34010nOb.copydefault;
            Intrinsics.checkNotNullExpressionValue(c33931nLd, "");
            c37241oqC.copydefault(c33931nLd, c37248oqJ.OLrzqt());
            C33931nLd c33931nLd2 = c34010nOb.copydefault;
            Intrinsics.checkNotNullExpressionValue(c33931nLd2, "");
            java.lang.String phoneRawNumber = c37248oqJ.OLrzqt().getPhoneRawNumber();
            c37241oqC.copydefault(c33931nLd2, phoneRawNumber != null ? phoneRawNumber : "");
            android.view.View view = this.itemView;
            view.setOnClickListener(new TaskDescription(view, 1000L, c33832nHm, c37248oqJ));
        }

        /* JADX INFO: renamed from: o.nHm$Activity$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ C33832nHm KWHzl;
            public final /* synthetic */ C37248oqJ OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, C33832nHm c33832nHm, C37248oqJ c37248oqJ) {
                this.EZpvd = view;
                this.copydefault = j;
                this.KWHzl = c33832nHm;
                this.OLrzqt = c37248oqJ;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    Application applicationEZpvd = this.KWHzl.EZpvd();
                    if (applicationEZpvd != null) {
                        applicationEZpvd.EZpvd(this.OLrzqt.OLrzqt());
                    }
                }
            }
        }
    }
}
