package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.market.adapter.OptionExpireItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class kFL extends RecyclerView.Adapter<kFN> {
    public Function1<? super java.lang.Integer, Unit> EZpvd;
    public java.util.List<OptionExpireItem> OLrzqt;
    public final android.content.Context copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    public kFL(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = context;
        this.OLrzqt = new java.util.ArrayList();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public kFN onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(this.copydefault).inflate(qZH.ActionBar.dlRikr, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new kFN(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull kFN kfn, final int i) {
        Intrinsics.checkNotNullParameter(kfn, "");
        kfn.EZpvd().setText(this.OLrzqt.get(i).getText());
        if (this.OLrzqt.get(i).isSelect()) {
            kfn.EZpvd().setSelectedStyle(true, 3);
        } else {
            kfn.EZpvd().setSelectedStyle(false, 3);
        }
        kfn.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.kFH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                kFL.OLrzqt(this.KWHzl, i, view);
            }
        });
    }

    public static final void OLrzqt(kFL kfl, int i, android.view.View view) {
        int size = kfl.OLrzqt.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 == i) {
                kfl.OLrzqt.get(i2).setSelect(true);
            } else {
                kfl.OLrzqt.get(i2).setSelect(false);
            }
        }
        Function1<? super java.lang.Integer, Unit> function1 = kfl.EZpvd;
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(i));
        }
        kfl.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.OLrzqt.size();
    }

    public static /* synthetic */ void setData$default(kFL kfl, java.util.ArrayList arrayList, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = 0;
        }
        kfl.KWHzl((java.util.ArrayList<OptionExpireItem>) arrayList, num);
    }

    public final void KWHzl(@NotNull java.util.ArrayList<OptionExpireItem> arrayList, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.OLrzqt.clear();
        if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            this.OLrzqt.addAll(arrayList);
            if (this.OLrzqt.size() > 0) {
                this.OLrzqt.get(0).setSelect(true);
            }
            notifyDataSetChanged();
        }
    }
}
