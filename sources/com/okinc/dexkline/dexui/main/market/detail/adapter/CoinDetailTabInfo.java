package com.okinc.dexkline.dexui.main.market.detail.adapter;

import androidx.fragment.app.Fragment;
import com.okinc.dexkline.market.features.coindetail.domain.type.CoinDetailTabType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class CoinDetailTabInfo {
    public static final int $stable = 0;
    private final Function0<Fragment> fragmentCreator;
    private final String tabContentDesc;
    private final int tabIndex;
    private final String tabTitle;
    private final CoinDetailTabType tabType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.dexkline.dexui.main.market.detail.adapter.CoinDetailTabInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoinDetailTabInfo copy$default(CoinDetailTabInfo coinDetailTabInfo, String str, int i, CoinDetailTabType coinDetailTabType, String str2, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = coinDetailTabInfo.tabTitle;
        }
        if ((i2 & 2) != 0) {
            i = coinDetailTabInfo.tabIndex;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            coinDetailTabType = coinDetailTabInfo.tabType;
        }
        CoinDetailTabType coinDetailTabType2 = coinDetailTabType;
        if ((i2 & 8) != 0) {
            str2 = coinDetailTabInfo.tabContentDesc;
        }
        String str3 = str2;
        if ((i2 & 16) != 0) {
            function0 = coinDetailTabInfo.fragmentCreator;
        }
        return coinDetailTabInfo.copy(str, i3, coinDetailTabType2, str3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tabTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.tabIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinDetailTabType component3() {
        return this.tabType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tabContentDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Fragment> component5() {
        return this.fragmentCreator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinDetailTabInfo copy(@NotNull String str, int i, @NotNull CoinDetailTabType coinDetailTabType, @NotNull String str2, @NotNull Function0<? extends Fragment> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(coinDetailTabType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        return new CoinDetailTabInfo(str, i, coinDetailTabType, str2, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinDetailTabInfo)) {
            return false;
        }
        CoinDetailTabInfo coinDetailTabInfo = (CoinDetailTabInfo) obj;
        return Intrinsics.EZpvd((Object) this.tabTitle, (Object) coinDetailTabInfo.tabTitle) && this.tabIndex == coinDetailTabInfo.tabIndex && this.tabType == coinDetailTabInfo.tabType && Intrinsics.EZpvd((Object) this.tabContentDesc, (Object) coinDetailTabInfo.tabContentDesc) && Intrinsics.EZpvd(this.fragmentCreator, coinDetailTabInfo.fragmentCreator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Fragment> getFragmentCreator() {
        return this.fragmentCreator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTabContentDesc() {
        return this.tabContentDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTabIndex() {
        return this.tabIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTabTitle() {
        return this.tabTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinDetailTabType getTabType() {
        return this.tabType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.tabTitle.hashCode() * 31) + Integer.hashCode(this.tabIndex)) * 31) + this.tabType.hashCode()) * 31) + this.tabContentDesc.hashCode()) * 31) + this.fragmentCreator.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinDetailTabInfo(tabTitle=" + this.tabTitle + ", tabIndex=" + this.tabIndex + ", tabType=" + this.tabType + ", tabContentDesc=" + this.tabContentDesc + ", fragmentCreator=" + this.fragmentCreator + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.fragment.app.Fragment> */
    /* JADX WARN: Multi-variable type inference failed */
    public CoinDetailTabInfo(@NotNull String str, int i, @NotNull CoinDetailTabType coinDetailTabType, @NotNull String str2, @NotNull Function0<? extends Fragment> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(coinDetailTabType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.tabTitle = str;
        this.tabIndex = i;
        this.tabType = coinDetailTabType;
        this.tabContentDesc = str2;
        this.fragmentCreator = function0;
    }
}
