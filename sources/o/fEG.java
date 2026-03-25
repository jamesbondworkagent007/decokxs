package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC17337fBp;
import o.C13754dXa;
import o.fDP;
import o.fEG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class fEG implements fDP {
    public final Function2<java.lang.Object, java.lang.Integer, Unit> AEQbTJ;
    public final yHO<java.lang.Object, java.lang.Integer, java.lang.Boolean, Unit> EZpvd;
    public final yHO<RecyclerView.ViewHolder, java.lang.Object, java.lang.Integer, Unit> KWHzl;
    public final Function2<java.lang.Object, java.lang.Integer, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<java.lang.Object, java.lang.Integer, Unit> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<java.lang.Object, java.lang.Integer, Unit> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<java.lang.Object, java.lang.Integer, java.lang.Boolean, Unit> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<java.lang.Object, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.yHO<java.lang.Object, ? super java.lang.Integer, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<java.lang.Object, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public fEG(@NotNull yHO<? super RecyclerView.ViewHolder, java.lang.Object, ? super java.lang.Integer, Unit> yho, @NotNull Function2<java.lang.Object, ? super java.lang.Integer, Unit> function2, @NotNull yHO<java.lang.Object, ? super java.lang.Integer, ? super java.lang.Boolean, Unit> yho2, @NotNull Function2<java.lang.Object, ? super java.lang.Integer, Unit> function22) {
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(yho2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        this.KWHzl = yho;
        this.OLrzqt = function2;
        this.EZpvd = yho2;
        this.AEQbTJ = function22;
    }

    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C13754dXa.TaskDescription.DztXDE, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new StateListAnimator(viewInflate);
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull final RecyclerView.ViewHolder viewHolder, @NotNull final java.lang.Object obj, final int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        StateListAnimator stateListAnimator = (StateListAnimator) viewHolder;
        stateListAnimator.EZpvd((ActivityC17337fBp.Application) obj);
        stateListAnimator.OLrzqt().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.fEH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return fEG.EZpvd(this.EZpvd, viewHolder, obj, i, view);
            }
        });
        android.widget.ImageView imageViewAEQbTJ = stateListAnimator.AEQbTJ();
        imageViewAEQbTJ.setOnClickListener(new TaskDescription(imageViewAEQbTJ, 1000L, this, obj, i));
        android.widget.TextView textViewGEmmrt = stateListAnimator.gEmmrt();
        textViewGEmmrt.setOnClickListener(new Application(textViewGEmmrt, 1000L, this, obj, i, stateListAnimator));
        android.widget.ImageView imageViewEZpvd = stateListAnimator.EZpvd();
        imageViewEZpvd.setOnClickListener(new ActionBar(imageViewEZpvd, 1000L, this, obj, i));
    }

    public static final boolean EZpvd(fEG feg, RecyclerView.ViewHolder viewHolder, java.lang.Object obj, int i, android.view.View view) {
        feg.KWHzl.invoke(viewHolder, obj, java.lang.Integer.valueOf(i));
        return true;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final android.widget.ImageView AEQbTJ;
        public final android.widget.ImageView EZpvd;
        public final android.widget.TextView KWHzl;
        public final android.widget.ImageView OLrzqt;
        public final InterfaceC56387yDm copydefault;
        public final android.widget.TextView djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView gEmmrt() {
            return this.djBIcL;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.fEF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return fEG.StateListAnimator.valueOf();
                }
            });
            this.AEQbTJ = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.GCXiNH);
            this.djBIcL = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.getSelectedNavigationIndex);
            this.KWHzl = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.closeOptionsMenu);
            this.OLrzqt = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.MediaSessionCompatCallbackStubApi21);
            this.EZpvd = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.sEcTXd);
        }

        public final C17412fEj KWHzl() {
            return (C17412fEj) this.copydefault.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C17412fEj valueOf() {
            return new C17412fEj();
        }

        public final void EZpvd(@NotNull ActivityC17337fBp.Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            AbstractC12784ctX abstractC12784ctXEZpvd = application.EZpvd();
            this.djBIcL.setText(abstractC12784ctXEZpvd.AuCTel());
            this.KWHzl.setText(KWHzl().djBIcL(abstractC12784ctXEZpvd));
            this.AEQbTJ.setVisibility(KWHzl().copydefault(application.EZpvd()));
            this.EZpvd.setVisibility(KWHzl().EZpvd(application.EZpvd()) ? 0 : 8);
            this.OLrzqt.setVisibility(application.KWHzl() ? 0 : 8);
            ViewGroup.LayoutParams layoutParams = this.djBIcL.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            if (this.AEQbTJ.getVisibility() == 0) {
                layoutParams2.setMarginStart(C55298xhM.dp2px$default(12.0f, null, 1, null));
            } else {
                layoutParams2.setMarginStart(C55298xhM.dp2px$default(24.0f, null, 1, null));
            }
            this.djBIcL.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = this.EZpvd.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams4 = layoutParams3 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 == null) {
                return;
            }
            if (this.OLrzqt.getVisibility() == 0) {
                layoutParams4.setMarginEnd(C55298xhM.dp2px$default(16.0f, null, 1, null));
            } else {
                layoutParams4.setMarginEnd(C55298xhM.dp2px$default(24.0f, null, 1, null));
            }
            this.EZpvd.setLayoutParams(layoutParams4);
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ fEG AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ java.lang.Object copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, fEG feg, java.lang.Object obj, int i) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = feg;
            this.copydefault = obj;
            this.EZpvd = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd().invoke(this.copydefault, java.lang.Integer.valueOf(this.EZpvd));
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ fEG AhwBna;
        public final /* synthetic */ StateListAnimator EZpvd;
        public final /* synthetic */ java.lang.Object KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, fEG feg, java.lang.Object obj, int i, StateListAnimator stateListAnimator) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.AhwBna = feg;
            this.KWHzl = obj;
            this.copydefault = i;
            this.EZpvd = stateListAnimator;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AhwBna.copydefault().invoke(this.KWHzl, java.lang.Integer.valueOf(this.copydefault), java.lang.Boolean.valueOf(this.EZpvd.KWHzl().EZpvd(((ActivityC17337fBp.Application) this.KWHzl).EZpvd())));
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ fEG OLrzqt;
        public final /* synthetic */ java.lang.Object copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, fEG feg, java.lang.Object obj, int i) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = feg;
            this.copydefault = obj;
            this.AEQbTJ = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.OLrzqt().invoke(this.copydefault, java.lang.Integer.valueOf(this.AEQbTJ));
            }
        }
    }
}
