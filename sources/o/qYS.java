package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.widget.calendar.AttrsHolder;
import java.util.Calendar;
import java.util.Date;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class qYS extends RecyclerView.Adapter<Application> {
    public final android.util.SparseArray<android.util.SparseArray<java.util.List<qYM>>> AEQbTJ;
    public final android.content.Context EZpvd;
    public java.util.List<? extends Date> KWHzl;
    public final AttrsHolder copydefault;

    public qYS(@NotNull android.content.Context context, @NotNull AttrsHolder attrsHolder) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attrsHolder, "");
        this.EZpvd = context;
        this.copydefault = attrsHolder;
        this.AEQbTJ = new android.util.SparseArray<>();
        this.KWHzl = yDY.AhwBna();
    }

    public final class Application extends RecyclerView.ViewHolder {
        public final /* synthetic */ qYS copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull qYS qys, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.copydefault = qys;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        qYP qyp = new qYP(this.EZpvd, this.copydefault);
        qyp.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new Application(this, qyp);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, int i) {
        Intrinsics.checkNotNullParameter(application, "");
        android.view.View view = application.itemView;
        qYP qyp = view instanceof qYP ? (qYP) view : null;
        if (qyp != null) {
            Date date = (Date) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
            if (date == null) {
                throw new java.lang.IllegalStateException("No month found at position " + i);
            }
            qyp.setDate$OKMarket_market_common_impl(date);
            qyp.setExtraData$OKMarket_market_common_impl(copydefault(date));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.KWHzl.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        Date dateEZpvd = EZpvd(i);
        if (dateEZpvd != null) {
            return dateEZpvd.getTime();
        }
        return -1L;
    }

    public final void KWHzl(@NotNull Date date, @NotNull Date date2) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(date2, "");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        if (!(!calendar.after(calendar2))) {
            throw new java.lang.IllegalArgumentException("fromDate must be before endDate".toString());
        }
        this.AEQbTJ.clear();
        calendar.set(5, 1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!calendar.after(calendar2)) {
            java.lang.Object objClone = calendar.getTime().clone();
            Intrinsics.copydefault(objClone, "");
            arrayList.add((Date) objClone);
            calendar.add(2, 1);
        }
        this.KWHzl = arrayList;
        notifyDataSetChanged();
    }

    public final void EZpvd(@NotNull Date date, java.util.List<qYM> list) {
        Intrinsics.checkNotNullParameter(date, "");
        if (list == null || list.isEmpty()) {
            AEQbTJ();
        } else {
            KWHzl(date, list);
        }
        notifyItemChanged(EZpvd(date));
    }

    public final Date EZpvd(int i) {
        return (Date) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
    }

    public final void KWHzl(Date date, java.util.List<qYM> list) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        android.util.SparseArray<java.util.List<qYM>> sparseArray = this.AEQbTJ.get(i);
        if (sparseArray == null) {
            sparseArray = new android.util.SparseArray<>();
            this.AEQbTJ.put(i, sparseArray);
        }
        sparseArray.put(i2, list);
    }

    public final java.util.List<qYM> copydefault(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        android.util.SparseArray<java.util.List<qYM>> sparseArray = this.AEQbTJ.get(i);
        if (sparseArray != null) {
            return sparseArray.get(i2);
        }
        return null;
    }

    public final void AEQbTJ() {
        this.AEQbTJ.clear();
        notifyDataSetChanged();
    }

    public final int EZpvd(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "");
        java.util.Iterator<? extends Date> it = this.KWHzl.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (qYU.copydefault(it.next(), date)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
