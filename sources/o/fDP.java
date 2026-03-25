package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface fDP {

    public static final class Activity {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void copydefault(@NotNull fDP fdp, @NotNull RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
        }
    }

    RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i);

    void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder);

    void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.Object obj, int i);
}
