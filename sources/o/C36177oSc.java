package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.UserTierData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oSc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36177oSc extends AbstractC59533zio<UserTierData, ActionBar> {

    /* JADX INFO: renamed from: o.oSc$ActionBar */
    public final class ActionBar extends RecyclerView.ViewHolder {
        public final C36045oNf OLrzqt;
        public final /* synthetic */ C36177oSc copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36045oNf OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C36177oSc c36177oSc, C36045oNf c36045oNf) {
            super(c36045oNf.getRoot());
            Intrinsics.checkNotNullParameter(c36045oNf, "");
            this.copydefault = c36177oSc;
            this.OLrzqt = c36045oNf;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C36045oNf c36045oNfAEQbTJ = C36045oNf.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c36045oNfAEQbTJ, "");
        return new ActionBar(this, c36045oNfAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull UserTierData userTierData) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(userTierData, "");
        C36045oNf c36045oNfOLrzqt = actionBar.OLrzqt();
        c36045oNfOLrzqt.AYXKKw.setText(xMR.copydefault.copydefault(userTierData.getTier()));
        c36045oNfOLrzqt.KWHzl.setText(C36184oSj.EZpvd(userTierData));
        c36045oNfOLrzqt.copydefault.setText(C36184oSj.AEQbTJ(userTierData));
        c36045oNfOLrzqt.OLrzqt.setText(C36184oSj.copydefault(userTierData));
        c36045oNfOLrzqt.EZpvd.setText(C36184oSj.OLrzqt(userTierData));
    }
}
