package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gIv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19612gIv extends RecyclerView.Adapter<C19609gIs> {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final java.util.List<java.lang.String> copydefault;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

    public C19612gIv(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C19609gIs onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return C19609gIs.Companion.OLrzqt(viewGroup);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C19609gIs c19609gIs, int i) {
        Intrinsics.checkNotNullParameter(c19609gIs, "");
        if (this.copydefault.isEmpty()) {
            pUU.copydefault("LogoAdapter", "items is empty");
            return;
        }
        android.widget.ImageView root = c19609gIs.OLrzqt().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        java.util.List<java.lang.String> list = this.copydefault;
        C57659ymb.loadBorderImage$default(root, list.get(i % list.size()), C13754dXa.Activity.DTwDnp, 1.0f, 0, 8, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.gIv$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gIv.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
