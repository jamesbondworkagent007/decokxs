package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.okinc.multitype.selection.Selectable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ViewOnClickListenerC55272xgn<VH extends RecyclerView.ViewHolder> extends AbstractC59533zio<C55276xgr, VH> implements View.OnClickListener {
    public C55277xgs AEQbTJ;
    public final InterfaceC55196xfQ<C55276xgr, VH> EZpvd;
    public Function2<? super java.lang.Integer, ? super C55276xgr, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super o.xgr, kotlin.Unit>, kotlin.jvm.functions.Function2<java.lang.Integer, o.xgr, kotlin.Unit> */
    public Function2<java.lang.Integer, C55276xgr, Unit> AEQbTJ() {
        return this.copydefault;
    }

    public ViewOnClickListenerC55272xgn(C55277xgs c55277xgs, @NotNull InterfaceC55196xfQ<C55276xgr, VH> interfaceC55196xfQ, @NotNull Function2<? super java.lang.Integer, ? super C55276xgr, Unit> function2) {
        Intrinsics.checkNotNullParameter(interfaceC55196xfQ, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.AEQbTJ = c55277xgs;
        this.EZpvd = interfaceC55196xfQ;
        this.copydefault = function2;
    }

    @Override // o.AbstractC59533zio
    public VH onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        VH vh = (VH) this.EZpvd.AEQbTJ(layoutInflater, viewGroup);
        android.view.View view = vh.itemView;
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
        view.setOnClickListener(this);
        view.setTag(C52761wXj.FragmentManager.gtCCJH, vh);
        return vh;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull VH vh, @NotNull C55276xgr c55276xgr) {
        boolean zOLrzqt;
        boolean zKWHzl;
        Intrinsics.checkNotNullParameter(vh, "");
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        vh.itemView.setTag(C52761wXj.FragmentManager.DGUQLIekVPG, c55276xgr);
        C55277xgs c55277xgs = this.AEQbTJ;
        if (c55277xgs != null) {
            zOLrzqt = c55277xgs.OLrzqt(vh.getBindingAdapterPosition());
            zKWHzl = c55277xgs.KWHzl(vh.getBindingAdapterPosition());
        } else {
            zOLrzqt = false;
            zKWHzl = true;
        }
        this.EZpvd.EZpvd(vh, c55276xgr, zOLrzqt, zKWHzl);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        if (view != null) {
            java.lang.Object tag = view.getTag(C52761wXj.FragmentManager.gtCCJH);
            Intrinsics.copydefault(tag, "");
            int bindingAdapterPosition = ((RecyclerView.ViewHolder) tag).getBindingAdapterPosition();
            java.lang.Object tag2 = view.getTag(C52761wXj.FragmentManager.DGUQLIekVPG);
            Intrinsics.copydefault(tag2, "");
            C55276xgr c55276xgr = (C55276xgr) tag2;
            C55277xgs c55277xgs = this.AEQbTJ;
            if ((c55277xgs != null ? c55277xgs.OLrzqt() : null) == Selectable.Mode.Single) {
                C55277xgs c55277xgs2 = this.AEQbTJ;
                if (c55277xgs2 != null) {
                    c55277xgs2.AEQbTJ(bindingAdapterPosition, true);
                }
            } else {
                C55277xgs c55277xgs3 = this.AEQbTJ;
                if (c55277xgs3 != null) {
                    c55277xgs3.AEQbTJ(bindingAdapterPosition);
                }
            }
            AEQbTJ().invoke(java.lang.Integer.valueOf(bindingAdapterPosition), c55276xgr);
        }
    }
}
