package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C35119npM;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.npL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35118npL extends androidx.recyclerview.widget.ListAdapter<C35119npM.Application, C35120npN> {
    public final Function2<java.lang.Boolean, C35119npM.Application, Unit> OLrzqt;

    /* JADX DEBUG: Class process forced to load method for inline: o.npQ.copydefault():o.npQ$ActionBar */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super o.npM$Application, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C35118npL(@NotNull Function2<? super java.lang.Boolean, ? super C35119npM.Application, Unit> function2) {
        super(C35123npQ.AEQbTJ);
        Intrinsics.checkNotNullParameter(function2, "");
        this.OLrzqt = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C35120npN onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(qZH.ActionBar.djBIcL, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new C35120npN(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final C35120npN c35120npN, int i) {
        Intrinsics.checkNotNullParameter(c35120npN, "");
        final C35119npM.Application item = getItem(i);
        c35120npN.AEQbTJ().setVisibility(item.EZpvd() ? 8 : 0);
        c35120npN.KWHzl().setEnabled(item.OLrzqt() != 2);
        c35120npN.OLrzqt().setText(C35197nql.AEQbTJ(item.KWHzl()));
        c35120npN.AEQbTJ().setText("/" + C35197nql.OLrzqt(item.KWHzl()));
        c35120npN.KWHzl().setChecked(item.OLrzqt() == 1);
        c35120npN.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.npP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35118npL.KWHzl(c35120npN, this, item, view);
            }
        });
    }

    public static final void KWHzl(C35120npN c35120npN, C35118npL c35118npL, C35119npM.Application application, android.view.View view) {
        if (c35120npN.KWHzl().isEnabled()) {
            Function2<java.lang.Boolean, C35119npM.Application, Unit> function2 = c35118npL.OLrzqt;
            boolean zIsChecked = c35120npN.KWHzl().isChecked();
            Intrinsics.copydefault(application);
            function2.invoke(java.lang.Boolean.valueOf(!zIsChecked), application);
        }
    }
}
