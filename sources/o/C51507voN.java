package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.oksearch.analytics.FuzzySearchEventSourceEnum;
import com.okinc.oksearch.analytics.FuzzySearchEventTracker;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.HomeStrategyFilterCoin;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.voN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51507voN extends AbstractC59533zio<HomeStrategyFilterCoin, ActionBar> {
    public final java.lang.String EZpvd;
    public HomeStrategyFilterCoin KWHzl;
    public final Function0<Unit> copydefault;

    public C51507voN(java.lang.String str, Function0<Unit> function0) {
        this.EZpvd = str;
        this.copydefault = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.getSerial, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new ActionBar(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final ActionBar actionBar, @NotNull final HomeStrategyFilterCoin homeStrategyFilterCoin) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(homeStrategyFilterCoin, "");
        actionBar.EZpvd().setText(homeStrategyFilterCoin.getShowCoinName());
        actionBar.OLrzqt().setVisibility(homeStrategyFilterCoin.isSelected() ? 0 : 8);
        if (homeStrategyFilterCoin.isSelected()) {
            this.KWHzl = homeStrategyFilterCoin;
        }
        java.lang.Object tag = actionBar.AEQbTJ().getTag();
        if (tag == null || !Intrinsics.EZpvd(tag, (java.lang.Object) homeStrategyFilterCoin.getCoinIcon())) {
            actionBar.AEQbTJ().setTag(homeStrategyFilterCoin.getCoinIcon());
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(actionBar.itemView.getContext());
            Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
            java.lang.String coinIcon = homeStrategyFilterCoin.getCoinIcon();
            C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, coinIcon != null ? coinIcon : "", "lfit", 75, 75).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(actionBar.itemView.getContext())).EZpvd(actionBar.AEQbTJ());
        }
        java.lang.Integer localCoinIcon = homeStrategyFilterCoin.getLocalCoinIcon();
        if (localCoinIcon != null) {
            Glide.AEQbTJ(actionBar.itemView.getContext()).OLrzqt(java.lang.Integer.valueOf(localCoinIcon.intValue())).EZpvd(actionBar.AEQbTJ());
        }
        actionBar.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.voM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51507voN.KWHzl(this.copydefault, homeStrategyFilterCoin, actionBar, view);
            }
        });
    }

    public static final void KWHzl(C51507voN c51507voN, HomeStrategyFilterCoin homeStrategyFilterCoin, ActionBar actionBar, android.view.View view) {
        FuzzySearchEventTracker fuzzySearchEventTracker = FuzzySearchEventTracker.EZpvd;
        java.lang.String source = FuzzySearchEventSourceEnum.OKTRADE_STRATEGY.getSource();
        java.lang.String str = c51507voN.EZpvd;
        if (str == null) {
            str = "";
        }
        fuzzySearchEventTracker.KWHzl(source, str, C33129mqd.gEmmrt(homeStrategyFilterCoin.getPrimary()), C33129mqd.gEmmrt(homeStrategyFilterCoin.getSecondary()), C33129mqd.gEmmrt(java.lang.Double.valueOf(homeStrategyFilterCoin.getPrimarySimilarity())), C33129mqd.gEmmrt(java.lang.Double.valueOf(homeStrategyFilterCoin.getSecondarySimilarity())), C33129mqd.gEmmrt(java.lang.Integer.valueOf(actionBar.getAbsoluteAdapterPosition() + 1)));
        HomeStrategyFilterCoin homeStrategyFilterCoin2 = c51507voN.KWHzl;
        if (homeStrategyFilterCoin2 != null) {
            homeStrategyFilterCoin2.setSelected(false);
        }
        homeStrategyFilterCoin.setSelected(true);
        c51507voN.getAdapter().notifyDataSetChanged();
        Function0<Unit> function0 = c51507voN.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
        C32866mlf.onEvent$default("TradingBot_BotMarketplace_SelectTokenPair_Click", (TrackChannel[]) null, new Function1() { // from class: o.voK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51507voN.copydefault((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, C54589xNz.EZpvd.EZpvd() ? "demo" : "live", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: getItemId(Ljava/lang/Object;)J */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public long getItemId(@NotNull HomeStrategyFilterCoin homeStrategyFilterCoin) {
        Intrinsics.checkNotNullParameter(homeStrategyFilterCoin, "");
        return homeStrategyFilterCoin.getCoinName() != null ? r3.hashCode() : 0;
    }

    /* JADX INFO: renamed from: o.voN$ActionBar */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final C57682ymy AEQbTJ;
        public final android.widget.TextView EZpvd;
        public final android.widget.ImageView OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C57682ymy OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.writeTypedObject);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.OLrzqt = (android.widget.ImageView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.initializePanelDecor);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.EZpvd = (android.widget.TextView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.IconCompatParcelizer);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.AEQbTJ = (C57682ymy) viewFindViewById3;
        }
    }
}
