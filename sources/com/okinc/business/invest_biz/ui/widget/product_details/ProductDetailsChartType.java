package com.okinc.business.invest_biz.ui.widget.product_details;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ProductDetailsChartType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ProductDetailsChartType[] $VALUES;
    public static final ProductDetailsChartType Rate = new ProductDetailsChartType("Rate", 0);
    public static final ProductDetailsChartType Tvl = new ProductDetailsChartType("Tvl", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ProductDetailsChartType[] $values() {
        return new ProductDetailsChartType[]{Rate, Tvl};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ProductDetailsChartType> getEntries() {
        return $ENTRIES;
    }

    private ProductDetailsChartType(String str, int i) {
    }

    static {
        ProductDetailsChartType[] productDetailsChartTypeArr$values = $values();
        $VALUES = productDetailsChartTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(productDetailsChartTypeArr$values);
    }

    public static ProductDetailsChartType valueOf(String str) {
        return (ProductDetailsChartType) Enum.valueOf(ProductDetailsChartType.class, str);
    }

    public static ProductDetailsChartType[] values() {
        return (ProductDetailsChartType[]) $VALUES.clone();
    }
}
