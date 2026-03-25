package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C8039avH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gHx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19587gHx implements C8039avH.ActionBar<RecyclerView.ViewHolder> {
    public final C19583gHt OLrzqt;

    public C19587gHx(@NotNull C19583gHt c19583gHt) {
        Intrinsics.checkNotNullParameter(c19583gHt, "");
        this.OLrzqt = c19583gHt;
    }

    @Override // o.C8039avH.ActionBar
    public long EZpvd(int i) {
        if (this.OLrzqt.AEQbTJ()) {
            if (i == 0) {
                return 0L;
            }
            if (i == 1) {
                return -1L;
            }
        }
        return 2L;
    }

    /* JADX INFO: renamed from: o.gHx$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public Application(android.view.View view) {
            super(view);
        }
    }

    @Override // o.C8039avH.ActionBar
    public RecyclerView.ViewHolder OLrzqt(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new Application(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C13754dXa.TaskDescription.hGuIrQ, viewGroup, false));
    }

    @Override // o.C8039avH.ActionBar
    public void KWHzl(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (i == 0) {
            android.view.View view = viewHolder.itemView;
            Intrinsics.copydefault(view, "");
            ((android.widget.TextView) view).setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DFbvW));
        } else {
            android.view.View view2 = viewHolder.itemView;
            Intrinsics.copydefault(view2, "");
            ((android.widget.TextView) view2).setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.hdpuIA));
        }
    }
}
