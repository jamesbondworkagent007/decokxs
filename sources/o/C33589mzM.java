package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33586mzJ;
import o.AbstractC33592mzP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mzM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33589mzM extends RecyclerView.Adapter<AbstractViewOnClickListenerC33585mzI<C33583mzG>> {
    public final boolean AEQbTJ;
    public final AbstractC33586mzJ AYXKKw;
    public final AbstractC33592mzP.Application AhwBna;
    public final AbstractC33587mzK DbNXlk;
    public final boolean EZpvd;
    public final int KWHzl;
    public java.util.ArrayList<C33583mzG> OLrzqt;
    public final android.content.Context copydefault;
    public final AbstractC33586mzJ.StateListAnimator.InterfaceC0886StateListAnimator djBIcL;
    public final RecyclerView gEmmrt;
    public final AbstractC33586mzJ.Activity.InterfaceC0885Activity valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecyclerView OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<C33583mzG> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.util.ArrayList<C33583mzG> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.OLrzqt = arrayList;
    }

    public C33589mzM(@NotNull android.content.Context context, boolean z, boolean z2, int i, AbstractC33586mzJ abstractC33586mzJ, @NotNull RecyclerView recyclerView, @NotNull java.util.ArrayList<C33583mzG> arrayList, @NotNull AbstractC33587mzK abstractC33587mzK, AbstractC33586mzJ.StateListAnimator.InterfaceC0886StateListAnimator interfaceC0886StateListAnimator, AbstractC33586mzJ.Activity.InterfaceC0885Activity interfaceC0885Activity, AbstractC33592mzP.Application application) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(abstractC33587mzK, "");
        this.copydefault = context;
        this.AEQbTJ = z;
        this.EZpvd = z2;
        this.KWHzl = i;
        this.AYXKKw = abstractC33586mzJ;
        this.gEmmrt = recyclerView;
        this.OLrzqt = arrayList;
        this.DbNXlk = abstractC33587mzK;
        this.djBIcL = interfaceC0886StateListAnimator;
        this.valueOf = interfaceC0885Activity;
        this.AhwBna = application;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public AbstractViewOnClickListenerC33585mzI<C33583mzG> onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        AbstractViewOnClickListenerC33585mzI<C33583mzG> abstractViewOnClickListenerC33585mzIEZpvd;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (i == 0) {
            abstractViewOnClickListenerC33585mzIEZpvd = this.DbNXlk.copydefault(this.copydefault, viewGroup, this.EZpvd);
        } else {
            abstractViewOnClickListenerC33585mzIEZpvd = this.DbNXlk.EZpvd(this.copydefault, viewGroup, this.EZpvd);
        }
        abstractViewOnClickListenerC33585mzIEZpvd.AEQbTJ(this.AEQbTJ);
        abstractViewOnClickListenerC33585mzIEZpvd.KWHzl(this.KWHzl);
        abstractViewOnClickListenerC33585mzIEZpvd.copydefault(this.AYXKKw);
        abstractViewOnClickListenerC33585mzIEZpvd.KWHzl(this.gEmmrt);
        abstractViewOnClickListenerC33585mzIEZpvd.EZpvd(this.djBIcL);
        abstractViewOnClickListenerC33585mzIEZpvd.AEQbTJ(this.valueOf);
        abstractViewOnClickListenerC33585mzIEZpvd.EZpvd(this.AhwBna);
        return abstractViewOnClickListenerC33585mzIEZpvd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.OLrzqt.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return !(this.OLrzqt.get(i) instanceof C33590mzN) ? 1 : 0;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractViewOnClickListenerC33585mzI<C33583mzG> abstractViewOnClickListenerC33585mzI, int i) {
        Intrinsics.checkNotNullParameter(abstractViewOnClickListenerC33585mzI, "");
        C33583mzG c33583mzG = this.OLrzqt.get(i);
        Intrinsics.checkNotNullExpressionValue(c33583mzG, "");
        abstractViewOnClickListenerC33585mzI.KWHzl(i, c33583mzG);
    }
}
