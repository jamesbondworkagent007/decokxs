package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19174fwM extends RecyclerView.ViewHolder {
    public final Function1<java.lang.Integer, Unit> AEQbTJ;
    public final C17164exd EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19174fwM(@NotNull C17164exd c17164exd, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
        super(c17164exd.getRoot());
        Intrinsics.checkNotNullParameter(c17164exd, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = c17164exd;
        this.AEQbTJ = function1;
    }

    public final void KWHzl(@NotNull C18953fsD c18953fsD) {
        Intrinsics.checkNotNullParameter(c18953fsD, "");
        this.EZpvd.AEQbTJ.setText(c18953fsD.copydefault());
        C52794wYp c52794wYp = this.EZpvd.AEQbTJ;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this, c18953fsD));
    }

    /* JADX INFO: renamed from: o.fwM$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C19174fwM EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C18953fsD copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C19174fwM c19174fwM, C18953fsD c18953fsD) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c19174fwM;
            this.copydefault = c18953fsD;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ.invoke(java.lang.Integer.valueOf(this.copydefault.AEQbTJ()));
            }
        }
    }
}
