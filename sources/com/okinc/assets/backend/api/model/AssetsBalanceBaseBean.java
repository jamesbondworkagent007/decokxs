package com.okinc.assets.backend.api.model;

/* JADX INFO: loaded from: classes22.dex */
public interface AssetsBalanceBaseBean {
    String getAutoLendDeepLink();

    String getChainLogoUrl();

    Boolean getFiatCategory();

    Boolean getHideOverviewPnl();

    String getSearchFilter();

    String getSmallBalanceFilter();

    void setAutoLendDeepLink(String str);

    void setChainLogoUrl(String str);

    void setFiatCategory(Boolean bool);

    void setHideOverviewPnl(Boolean bool);
}
