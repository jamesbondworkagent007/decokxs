package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.fDP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fEV implements fDP {
    public final Function1<AbstractC12784ctX, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<AbstractC12784ctX, Unit> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctX, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public fEV(@NotNull Function1<? super AbstractC12784ctX, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C13754dXa.TaskDescription.registerUser, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new StateListAnimator(viewInflate);
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull final java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        StateListAnimator stateListAnimator = viewHolder instanceof StateListAnimator ? (StateListAnimator) viewHolder : null;
        if (stateListAnimator != null) {
            stateListAnimator.EZpvd(new Function1() { // from class: o.fEU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return fEV.KWHzl(this.OLrzqt, obj, (Unit) obj2);
                }
            });
        }
        android.view.View view = viewHolder.itemView;
        view.setOnClickListener(new TaskDescription(view, 1000L, this, obj));
    }

    public static final Unit KWHzl(fEV fev, java.lang.Object obj, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        Function1<AbstractC12784ctX, Unit> function1 = fev.KWHzl;
        Intrinsics.copydefault(obj, "");
        function1.invoke(((fEW) obj).copydefault());
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public static final int copydefault = C52794wYp.DbNXlk;
        public final C52794wYp EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd = (C52794wYp) view.findViewById(C13754dXa.ActionBar.MediaDescriptionCompat1);
        }

        public final void EZpvd(@NotNull Function1<? super Unit, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getVolumeAttributes));
            C52794wYp c52794wYp = this.EZpvd;
            c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, function1));
        }

        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ Function1 AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, Function1 function1) {
                this.copydefault = view;
                this.EZpvd = j;
                this.AEQbTJ = function1;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    this.AEQbTJ.invoke(Unit.INSTANCE);
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ java.lang.Object OLrzqt;
        public final /* synthetic */ fEV copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, fEV fev, java.lang.Object obj) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = fev;
            this.OLrzqt = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function1<AbstractC12784ctX, Unit> function1KWHzl = this.copydefault.KWHzl();
                Intrinsics.copydefault(this.OLrzqt, "");
                function1KWHzl.invoke(((fEW) this.OLrzqt).copydefault());
            }
        }
    }
}
