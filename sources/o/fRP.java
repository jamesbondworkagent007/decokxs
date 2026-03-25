package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C17738fQl;
import o.fDP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fRP<T extends C17738fQl> implements fDP {
    public final Function1<T, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<T, Unit> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super T extends o.fQl, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public fRP(@NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16915est c16915estCopydefault = C16915est.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16915estCopydefault, "");
        return new ActionBar(c16915estCopydefault);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: o.fRP$ActionBar */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: o.fRP$ActionBar */
    /* JADX DEBUG: Multi-variable search result rejected for r8v4, resolved type: o.fRP$ActionBar */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        android.view.View view = viewHolder.itemView;
        view.setOnClickListener(new Application(view, 1000L, this, obj));
        ActionBar actionBar = viewHolder instanceof ActionBar ? (ActionBar) viewHolder : 0;
        if (actionBar != 0) {
            actionBar.EZpvd((C17738fQl) obj);
        }
    }

    public static final class ActionBar<T extends C17738fQl> extends RecyclerView.ViewHolder {
        public final C16915est AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C16915est c16915est) {
            super(c16915est.getRoot());
            Intrinsics.checkNotNullParameter(c16915est, "");
            this.AEQbTJ = c16915est;
        }

        public final void EZpvd(@NotNull T t) {
            Intrinsics.checkNotNullParameter(t, "");
            this.AEQbTJ.AEQbTJ.setText(t.KWHzl());
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ fRP AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ java.lang.Object copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, fRP frp, java.lang.Object obj) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = frp;
            this.copydefault = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function1 function1KWHzl = this.AEQbTJ.KWHzl();
                Intrinsics.copydefault(this.copydefault, "");
                function1KWHzl.invoke((C17738fQl) this.copydefault);
            }
        }
    }
}
