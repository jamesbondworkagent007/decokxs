package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.constant.WalletType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C17421fEs;
import o.fDP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fEs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17421fEs implements fDP {
    public final Function1<AbstractC12782ctV, Unit> AEQbTJ;
    public final Function1<AbstractC12782ctV, Unit> EZpvd;
    public boolean KWHzl;
    public final fDW OLrzqt;
    public final Function1<AbstractC12782ctV, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<AbstractC12782ctV, Unit> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<AbstractC12782ctV, Unit> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<AbstractC12782ctV, Unit> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctV, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctV, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctV, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C17421fEs(@NotNull Function1<? super AbstractC12782ctV, Unit> function1, @NotNull Function1<? super AbstractC12782ctV, Unit> function12, @NotNull Function1<? super AbstractC12782ctV, Unit> function13, @NotNull fDW fdw) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(fdw, "");
        this.EZpvd = function1;
        this.AEQbTJ = function12;
        this.copydefault = function13;
        this.OLrzqt = fdw;
    }

    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C13754dXa.TaskDescription.OStAOF, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        TaskDescription taskDescription = new TaskDescription(viewInflate);
        this.KWHzl = C55296xhK.AEQbTJ(viewGroup);
        return taskDescription;
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        TaskDescription taskDescription = (TaskDescription) viewHolder;
        eCF ecf = (eCF) obj;
        taskDescription.copydefault(ecf.copydefault());
        taskDescription.OLrzqt().copydefault(this.KWHzl);
        taskDescription.OLrzqt().OLrzqt(this.OLrzqt);
        fDY fdyOLrzqt = taskDescription.OLrzqt();
        fdyOLrzqt.setOnClickListener(new Activity(fdyOLrzqt, 1000L, this, ecf));
        android.view.View viewKWHzl = taskDescription.KWHzl();
        viewKWHzl.setOnClickListener(new ActionBar(viewKWHzl, 1000L, this, ecf));
        android.view.View viewAEQbTJ = taskDescription.AEQbTJ();
        viewAEQbTJ.setOnClickListener(new StateListAnimator(viewAEQbTJ, 1000L, this, ecf));
    }

    /* JADX INFO: renamed from: o.fEs$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final android.widget.TextView AEQbTJ;
        public final InterfaceC56387yDm AYXKKw;
        public final android.view.View AhwBna;
        public final C55251xgS EZpvd;
        public final android.view.View KWHzl;
        public final android.widget.TextView OLrzqt;
        public final android.widget.ImageView copydefault;
        public final C55251xgS djBIcL;
        public final fDY gEmmrt;
        public final android.widget.ImageView valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View KWHzl() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final fDY OLrzqt() {
            return this.gEmmrt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.fEp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C17421fEs.TaskDescription.djBIcL();
                }
            });
            this.copydefault = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.ejfBZ);
            this.OLrzqt = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.uzCIH);
            this.AEQbTJ = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.AuCTel);
            this.valueOf = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.setRatingType);
            this.EZpvd = (C55251xgS) view.findViewById(C13754dXa.ActionBar.EZpvd);
            this.djBIcL = (C55251xgS) view.findViewById(C13754dXa.ActionBar.RcvFxC);
            this.AhwBna = view.findViewById(C13754dXa.ActionBar.sILrnl);
            this.KWHzl = view.findViewById(C13754dXa.ActionBar.Dfm);
            this.gEmmrt = (fDY) view.findViewById(C13754dXa.ActionBar.MediaSessionCompatMediaSessionImplBaseMediaSessionStub);
        }

        private final C17412fEj copydefault() {
            return (C17412fEj) this.AYXKKw.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C17412fEj djBIcL() {
            return new C17412fEj();
        }

        public final void copydefault(@NotNull AbstractC12782ctV abstractC12782ctV) {
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            android.widget.ImageView imageView = this.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C14725dqq.copydefault(imageView, abstractC12782ctV.AEQbTJ(), C13754dXa.Activity.fJNWhG, new Function1() { // from class: o.fEq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C17421fEs.TaskDescription.OLrzqt((C5335Nt) obj);
                }
            }, 32.0f);
            this.OLrzqt.setText(copydefault().copydefault(abstractC12782ctV));
            this.gEmmrt.OLrzqt(copydefault().OLrzqt());
            this.AEQbTJ.setText(C13912dbY.copydefault.fetchVPNInfo() ? "*****" : copydefault().OLrzqt(abstractC12782ctV));
            this.valueOf.setVisibility(copydefault().copydefault(abstractC12782ctV.zuWLRA()));
            this.EZpvd.setVisibility(8);
            this.AhwBna.setVisibility(0);
            this.KWHzl.setVisibility(copydefault().AEQbTJ(abstractC12782ctV) ? 0 : 8);
            if (abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) {
                this.djBIcL.setVisibility(copydefault().EZpvd(abstractC12782ctV));
            } else {
                this.djBIcL.setVisibility(8);
            }
        }

        public static final Unit OLrzqt(C5335Nt c5335Nt) {
            Intrinsics.checkNotNullParameter(c5335Nt, "");
            c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dp2px$default(4.0f, null, 1, null)));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.fEs$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C17421fEs KWHzl;
        public final /* synthetic */ eCF OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C17421fEs c17421fEs, eCF ecf) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c17421fEs;
            this.OLrzqt = ecf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.OLrzqt().invoke(this.OLrzqt.copydefault());
            }
        }
    }

    /* JADX INFO: renamed from: o.fEs$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C17421fEs EZpvd;
        public final /* synthetic */ eCF OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C17421fEs c17421fEs, eCF ecf) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c17421fEs;
            this.OLrzqt = ecf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.EZpvd().invoke(this.OLrzqt.copydefault());
            }
        }
    }

    /* JADX INFO: renamed from: o.fEs$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C17421fEs AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ eCF OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C17421fEs c17421fEs, eCF ecf) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = c17421fEs;
            this.OLrzqt = ecf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl().invoke(this.OLrzqt.copydefault());
            }
        }
    }
}
