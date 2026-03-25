package com.okinc.assets.backend.api.model;

import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class SupportCurrencyNew {
    public static final int $stable = 8;
    private TreeMap<String, List<SupportCurrency>> currencies;
    private List<String> titles;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SupportCurrencyNew() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.SupportCurrencyNew */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportCurrencyNew copy$default(SupportCurrencyNew supportCurrencyNew, TreeMap treeMap, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            treeMap = supportCurrencyNew.currencies;
        }
        if ((i & 2) != 0) {
            list = supportCurrencyNew.titles;
        }
        return supportCurrencyNew.copy(treeMap, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TreeMap<String, List<SupportCurrency>> component1() {
        return this.currencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.titles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportCurrencyNew copy(@NotNull TreeMap<String, List<SupportCurrency>> treeMap, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(treeMap, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SupportCurrencyNew(treeMap, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportCurrencyNew)) {
            return false;
        }
        SupportCurrencyNew supportCurrencyNew = (SupportCurrencyNew) obj;
        return Intrinsics.EZpvd(this.currencies, supportCurrencyNew.currencies) && Intrinsics.EZpvd(this.titles, supportCurrencyNew.titles);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TreeMap<String, List<SupportCurrency>> getCurrencies() {
        return this.currencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTitles() {
        return this.titles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.currencies.hashCode() * 31) + this.titles.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencies(@NotNull TreeMap<String, List<SupportCurrency>> treeMap) {
        Intrinsics.checkNotNullParameter(treeMap, "");
        this.currencies = treeMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitles(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.titles = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportCurrencyNew(currencies=" + this.currencies + ", titles=" + this.titles + ")";
    }

    public SupportCurrencyNew(@NotNull TreeMap<String, List<SupportCurrency>> treeMap, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(treeMap, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.currencies = treeMap;
        this.titles = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.util.TreeMap:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.TreeMap:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:36) call: java.util.TreeMap.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.TreeMap))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:37)) : (r2v0 java.util.List))
 A[MD:(java.util.TreeMap<java.lang.String, java.util.List<com.okinc.assets.backend.api.model.SupportCurrency>>, java.util.List<java.lang.String>):void (m)] (LINE:35) call: com.okinc.assets.backend.api.model.SupportCurrencyNew.<init>(java.util.TreeMap, java.util.List):void type: THIS */
    public /* synthetic */ SupportCurrencyNew(TreeMap treeMap, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TreeMap() : treeMap, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
