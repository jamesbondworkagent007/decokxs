package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.fDP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fRI implements fDP {
    public final Function1<android.view.View, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public fRI(Function1<? super android.view.View, Unit> function1) {
        this.copydefault = function1;
    }

    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16911esp c16911espOLrzqt = C16911esp.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16911espOLrzqt, "");
        return new TaskDescription(c16911espOLrzqt);
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        TaskDescription taskDescription = viewHolder instanceof TaskDescription ? (TaskDescription) viewHolder : null;
        if (taskDescription != null) {
            taskDescription.copydefault((C17736fQj) obj);
            taskDescription.EZpvd(this.copydefault);
        }
    }

    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final C16911esp OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C16911esp c16911esp) {
            super(c16911esp.getRoot());
            Intrinsics.checkNotNullParameter(c16911esp, "");
            this.OLrzqt = c16911esp;
        }

        public final void copydefault(@NotNull C17736fQj c17736fQj) {
            Intrinsics.checkNotNullParameter(c17736fQj, "");
            this.OLrzqt.copydefault.setText(c17736fQj.copydefault());
        }

        public final void EZpvd(Function1<? super android.view.View, Unit> function1) {
            if (function1 == null) {
                this.OLrzqt.OLrzqt.setVisibility(8);
                return;
            }
            this.OLrzqt.OLrzqt.setVisibility(0);
            C52794wYp c52794wYp = this.OLrzqt.OLrzqt;
            c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, function1, this));
        }

        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ TaskDescription AEQbTJ;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ Function1 OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, Function1 function1, TaskDescription taskDescription) {
                this.KWHzl = view;
                this.copydefault = j;
                this.OLrzqt = function1;
                this.AEQbTJ = taskDescription;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    Function1 function1 = this.OLrzqt;
                    C52794wYp c52794wYp = this.AEQbTJ.OLrzqt.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                    function1.invoke(c52794wYp);
                }
            }
        }
    }
}
