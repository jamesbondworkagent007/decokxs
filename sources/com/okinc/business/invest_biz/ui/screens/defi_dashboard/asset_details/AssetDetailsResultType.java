package com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details;

import com.okinc.business.invest_biz.data.bean.InvestButtonAction;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class AssetDetailsResultType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AssetDetailsResultType[] $VALUES;
    public static final AssetDetailsResultType CLAIM = new AssetDetailsResultType("CLAIM", 0);
    public static final AssetDetailsResultType ADD_LIQUIDITY = new AssetDetailsResultType("ADD_LIQUIDITY", 1);
    public static final AssetDetailsResultType REFRESH = new AssetDetailsResultType(InvestButtonAction.ACTION_CALLBACK_REFRESH, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AssetDetailsResultType[] $values() {
        return new AssetDetailsResultType[]{CLAIM, ADD_LIQUIDITY, REFRESH};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AssetDetailsResultType> getEntries() {
        return $ENTRIES;
    }

    private AssetDetailsResultType(String str, int i) {
    }

    static {
        AssetDetailsResultType[] assetDetailsResultTypeArr$values = $values();
        $VALUES = assetDetailsResultTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(assetDetailsResultTypeArr$values);
    }

    public static AssetDetailsResultType valueOf(String str) {
        return (AssetDetailsResultType) Enum.valueOf(AssetDetailsResultType.class, str);
    }

    public static AssetDetailsResultType[] values() {
        return (AssetDetailsResultType[]) $VALUES.clone();
    }
}
