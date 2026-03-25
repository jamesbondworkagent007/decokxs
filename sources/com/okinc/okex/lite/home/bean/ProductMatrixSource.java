package com.okinc.okex.lite.home.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class ProductMatrixSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ProductMatrixSource[] $VALUES;
    public static final ProductMatrixSource PayHOME = new ProductMatrixSource("PayHOME", 0);
    public static final ProductMatrixSource HOME = new ProductMatrixSource("HOME", 1);
    public static final ProductMatrixSource SimpleTrade = new ProductMatrixSource("SimpleTrade", 2);
    public static final ProductMatrixSource SimpleDiscover = new ProductMatrixSource("SimpleDiscover", 3);
    public static final ProductMatrixSource Portfolio = new ProductMatrixSource("Portfolio", 4);
    public static final ProductMatrixSource Earn = new ProductMatrixSource("Earn", 5);
    public static final ProductMatrixSource AdvancedDiscover = new ProductMatrixSource("AdvancedDiscover", 6);
    public static final ProductMatrixSource AdvancedTrade = new ProductMatrixSource("AdvancedTrade", 7);
    public static final ProductMatrixSource SimpleActivity = new ProductMatrixSource("SimpleActivity", 8);
    public static final ProductMatrixSource Activity = new ProductMatrixSource("Activity", 9);
    public static final ProductMatrixSource Hero = new ProductMatrixSource("Hero", 10);
    public static final ProductMatrixSource Unknown = new ProductMatrixSource("Unknown", 11);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ProductMatrixSource[] $values() {
        return new ProductMatrixSource[]{PayHOME, HOME, SimpleTrade, SimpleDiscover, Portfolio, Earn, AdvancedDiscover, AdvancedTrade, SimpleActivity, Activity, Hero, Unknown};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ProductMatrixSource> getEntries() {
        return $ENTRIES;
    }

    private ProductMatrixSource(String str, int i) {
    }

    static {
        ProductMatrixSource[] productMatrixSourceArr$values = $values();
        $VALUES = productMatrixSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(productMatrixSourceArr$values);
    }

    public static ProductMatrixSource valueOf(String str) {
        return (ProductMatrixSource) Enum.valueOf(ProductMatrixSource.class, str);
    }

    public static ProductMatrixSource[] values() {
        return (ProductMatrixSource[]) $VALUES.clone();
    }
}
