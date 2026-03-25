package com.okinc.tradingbot.impl.market_place.home.filter;

import androidx.lifecycle.ViewModel;
import com.okinc.unify_trade.bot.list.CardStyle;
import com.okinc.unify_trade.bot.list.FilterState;
import com.okinc.unify_trade.bot.list.SortOption;
import com.okinc.unify_trade.bot.list.SortOrder;
import com.okinc.unify_trade.bot.list.SortType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC55876xsH;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotStyleManagerViewModel extends ViewModel {
    public FilterState AEQbTJ;
    public SortOption EZpvd;
    public final InterfaceC55876xsH copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortOption AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull SortOption sortOption) {
        Intrinsics.checkNotNullParameter(sortOption, "");
        this.EZpvd = sortOption;
    }

    @yCM
    public BotStyleManagerViewModel(@NotNull InterfaceC55876xsH interfaceC55876xsH) {
        Intrinsics.checkNotNullParameter(interfaceC55876xsH, "");
        this.copydefault = interfaceC55876xsH;
        this.AEQbTJ = new FilterState((List) null, (String) null, (CardStyle) null, 7, (DefaultConstructorMarker) null);
        this.EZpvd = new SortOption((SortType) null, (SortOrder) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public final FilterState copydefault() {
        return FilterState.copy$default(this.AEQbTJ, null, null, this.copydefault.KWHzl(), 3, null);
    }

    public final void EZpvd(int i) {
        this.copydefault.KWHzl(i);
    }

    public final void copydefault(@NotNull FilterState filterState) {
        Intrinsics.checkNotNullParameter(filterState, "");
        this.AEQbTJ = filterState;
        this.copydefault.OLrzqt(filterState.getCardStyle());
    }
}
