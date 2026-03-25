package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.fDP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fRQ implements fDP {
    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16909esn c16909esnAEQbTJ = C16909esn.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16909esnAEQbTJ, "");
        return new TaskDescription(c16909esnAEQbTJ);
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        TaskDescription taskDescription = viewHolder instanceof TaskDescription ? (TaskDescription) viewHolder : null;
        if (taskDescription != null) {
            taskDescription.copydefault((C17741fQo) obj);
        }
    }

    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final C16909esn OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C16909esn c16909esn) {
            super(c16909esn.getRoot());
            Intrinsics.checkNotNullParameter(c16909esn, "");
            this.OLrzqt = c16909esn;
        }

        public final void copydefault(@NotNull C17741fQo c17741fQo) {
            Intrinsics.checkNotNullParameter(c17741fQo, "");
            this.OLrzqt.OLrzqt.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            this.OLrzqt.OLrzqt.setText(c17741fQo.KWHzl());
        }
    }
}
