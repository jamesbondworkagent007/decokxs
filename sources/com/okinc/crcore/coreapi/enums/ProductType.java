package com.okinc.crcore.coreapi.enums;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class ProductType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ProductType[] $VALUES;
    private final String productType;
    public static final ProductType SPOT_GRID = new ProductType("SPOT_GRID", 0, "SPOT_GRID");
    public static final ProductType SPOT_DCA = new ProductType("SPOT_DCA", 1, "SPOT_DCA");
    public static final ProductType SMART_PORTFOLIO = new ProductType("SMART_PORTFOLIO", 2, "SMART_PORTFOLIO");
    public static final ProductType INFINITY_GRID = new ProductType("INFINITY_GRID", 3, "INFINITY_GRID");
    public static final ProductType COPY_TRADING = new ProductType("COPY_TRADING", 4, "COPY_TRADING");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ProductType[] $values() {
        return new ProductType[]{SPOT_GRID, SPOT_DCA, SMART_PORTFOLIO, INFINITY_GRID, COPY_TRADING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ProductType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProductType() {
        return this.productType;
    }

    private ProductType(String str, int i, String str2) {
        this.productType = str2;
    }

    static {
        ProductType[] productTypeArr$values = $values();
        $VALUES = productTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(productTypeArr$values);
    }

    public static ProductType valueOf(String str) {
        return (ProductType) Enum.valueOf(ProductType.class, str);
    }

    public static ProductType[] values() {
        return (ProductType[]) $VALUES.clone();
    }
}
