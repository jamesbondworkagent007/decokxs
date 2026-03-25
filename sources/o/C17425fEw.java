package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C17425fEw;
import o.fDP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fEw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17425fEw implements fDP {
    public final Function1<AbstractC12782ctV, Unit> AEQbTJ;
    public final Function1<AbstractC12782ctV, Unit> EZpvd;
    public final Function1<AbstractC12782ctV, Unit> KWHzl;
    public final fDW OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<AbstractC12782ctV, Unit> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<AbstractC12782ctV, Unit> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<AbstractC12782ctV, Unit> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctV, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctV, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctV, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C17425fEw(@NotNull Function1<? super AbstractC12782ctV, Unit> function1, @NotNull Function1<? super AbstractC12782ctV, Unit> function12, @NotNull Function1<? super AbstractC12782ctV, Unit> function13, @NotNull fDW fdw) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(fdw, "");
        this.KWHzl = function1;
        this.EZpvd = function12;
        this.AEQbTJ = function13;
        this.OLrzqt = fdw;
    }

    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C13754dXa.TaskDescription.Hx, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        ActionBar actionBar = new ActionBar(viewInflate);
        this.copydefault = C55296xhK.AEQbTJ(viewGroup);
        return actionBar;
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        ActionBar actionBar = (ActionBar) viewHolder;
        eCF ecf = (eCF) obj;
        actionBar.OLrzqt(ecf.copydefault(), ecf.OLrzqt());
        actionBar.copydefault().copydefault(this.copydefault);
        actionBar.copydefault().OLrzqt(this.OLrzqt);
        android.view.View view = actionBar.itemView;
        view.setOnClickListener(new TaskDescription(view, 1000L, this, ecf));
        android.view.View viewKWHzl = actionBar.KWHzl();
        viewKWHzl.setOnClickListener(new Activity(viewKWHzl, 1000L, this, ecf));
        android.view.View viewAEQbTJ = actionBar.AEQbTJ();
        viewAEQbTJ.setOnClickListener(new StateListAnimator(viewAEQbTJ, 1000L, this, ecf));
    }

    /* JADX INFO: renamed from: o.fEw$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final android.view.View AEQbTJ;
        public final C55251xgS AYXKKw;
        public final fDY AhwBna;
        public final android.view.View EZpvd;
        public final android.widget.TextView KWHzl;
        public final android.widget.ImageView OLrzqt;
        public final android.widget.TextView copydefault;
        public final android.widget.ImageView djBIcL;
        public final InterfaceC56387yDm fetchVPNInfo;
        public final android.widget.ImageView gEmmrt;
        public final C55251xgS valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final fDY copydefault() {
            return this.AhwBna;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.fEy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C17425fEw.ActionBar.djBIcL();
                }
            });
            this.OLrzqt = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.ejfBZ);
            this.KWHzl = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.uzCIH);
            this.copydefault = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.AuCTel);
            this.djBIcL = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.setRatingType);
            this.gEmmrt = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.QUeTTI);
            this.valueOf = (C55251xgS) view.findViewById(C13754dXa.ActionBar.OgHfcT);
            this.AYXKKw = (C55251xgS) view.findViewById(C13754dXa.ActionBar.MediaSessionCompatToken1);
            this.AhwBna = (fDY) view.findViewById(C13754dXa.ActionBar.MediaSessionCompatMediaSessionImplBaseMediaSessionStub);
            this.EZpvd = view.findViewById(C13754dXa.ActionBar.sILrnl);
            this.AEQbTJ = view.findViewById(C13754dXa.ActionBar.Dfm);
        }

        private final C17412fEj EZpvd() {
            return (C17412fEj) this.fetchVPNInfo.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C17412fEj djBIcL() {
            return new C17412fEj();
        }

        public final void OLrzqt(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull EIP7702WalletStatus eIP7702WalletStatus) {
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            Intrinsics.checkNotNullParameter(eIP7702WalletStatus, "");
            android.widget.ImageView imageView = this.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C14725dqq.copydefault(imageView, abstractC12782ctV.AEQbTJ(), C13754dXa.Activity.fJNWhG, new Function1() { // from class: o.fEx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C17425fEw.ActionBar.KWHzl((C5335Nt) obj);
                }
            }, 32.0f);
            this.AhwBna.OLrzqt(EZpvd().OLrzqt());
            this.KWHzl.setText(EZpvd().copydefault(abstractC12782ctV));
            this.copydefault.setText(C13912dbY.copydefault.fetchVPNInfo() ? "*****" : EZpvd().OLrzqt(abstractC12782ctV));
            this.djBIcL.setVisibility(EZpvd().EZpvd(abstractC12782ctV.zuWLRA()));
            this.EZpvd.setVisibility(0);
            C17927fXl.KWHzl.OLrzqt(C17922fXg.OLrzqt(abstractC12782ctV), this.gEmmrt, false, this.KWHzl);
            this.AYXKKw.setVisibility(EZpvd().EZpvd(abstractC12782ctV));
            this.AEQbTJ.setVisibility(EZpvd().AEQbTJ(abstractC12782ctV) ? 0 : 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit KWHzl(C5335Nt c5335Nt) {
            Intrinsics.checkNotNullParameter(c5335Nt, "");
            c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dp2px$default(4.0f, null, 1, null)));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.fEw$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C17425fEw KWHzl;
        public final /* synthetic */ eCF OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C17425fEw c17425fEw, eCF ecf) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = c17425fEw;
            this.OLrzqt = ecf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.OLrzqt().invoke(this.OLrzqt.copydefault());
            }
        }
    }

    /* JADX INFO: renamed from: o.fEw$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C17425fEw EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ eCF OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C17425fEw c17425fEw, eCF ecf) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c17425fEw;
            this.OLrzqt = ecf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ().invoke(this.OLrzqt.copydefault());
            }
        }
    }

    /* JADX INFO: renamed from: o.fEw$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ eCF AEQbTJ;
        public final /* synthetic */ C17425fEw EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C17425fEw c17425fEw, eCF ecf) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = c17425fEw;
            this.AEQbTJ = ecf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.KWHzl().invoke(this.AEQbTJ.copydefault());
            }
        }
    }
}
