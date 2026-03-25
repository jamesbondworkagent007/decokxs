package o;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsListLabelData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wNU extends AbstractC59533zio<wNR, ActionBar> {
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull wNR wnr) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(wnr, "");
        uSU usuKWHzl = actionBar.KWHzl();
        android.widget.TextView textView = usuKWHzl.KWHzl;
        textView.setText(wnr.AEQbTJ());
        Intrinsics.copydefault(textView);
        textView.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) wnr.AEQbTJ()) ? 8 : 0);
        C55372xih c55372xih = usuKWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55372xih, "");
        AEQbTJ(c55372xih, wnr.copydefault());
        C55372xih c55372xih2 = usuKWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55372xih2, "");
        AEQbTJ(c55372xih2, wnr.OLrzqt());
        usuKWHzl.AEQbTJ.setAlignByCenter(0);
        RecyclerView recyclerView = usuKWHzl.EZpvd;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C57584ylF(2, 0, C55298xhM.dp2px$default(14.0f, null, 1, null)));
        }
        C43316rmw c43316rmw = new C43316rmw();
        android.content.Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c43316rmw.register(TacticsInsideItemData.class, new C52518wOj(context, null, true, 0, false, null, null, null, 250, null));
        recyclerView.setAdapter(c43316rmw);
        C33064mpR.OLrzqt(c43316rmw, (java.util.List<? extends java.lang.Object>) wnr.EZpvd());
    }

    public final void AEQbTJ(C55372xih c55372xih, java.util.List<TacticsListLabelData> list) {
        c55372xih.removeAllViews();
        c55372xih.setVisibility(list.isEmpty() ? 8 : 0);
        for (TacticsListLabelData tacticsListLabelData : list) {
            android.content.Context context = c55372xih.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C55251xgS c55251xgS = new C55251xgS(context, null, 0, 6, null);
            c55251xgS.setText(tacticsListLabelData.AEQbTJ());
            c55251xgS.setOKDSSize(-4);
            c55251xgS.setOKDSStyle(tacticsListLabelData.OLrzqt());
            c55372xih.addView(c55251xgS);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        uSU usuEZpvd = uSU.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(usuEZpvd, "");
        return new ActionBar(this, usuEZpvd);
    }

    public final class ActionBar extends RecyclerView.ViewHolder {
        public final /* synthetic */ wNU KWHzl;
        public final uSU OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uSU KWHzl() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull wNU wnu, uSU usu) {
            super(usu.getRoot());
            Intrinsics.checkNotNullParameter(usu, "");
            this.KWHzl = wnu;
            this.OLrzqt = usu;
        }
    }
}
