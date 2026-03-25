package com.okinc.business.dex.api.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderListParams {
    public final Page OLrzqt;
    public final String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderListParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OrderListParams copy$default(OrderListParams orderListParams, Page page, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            page = orderListParams.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = orderListParams.copydefault;
        }
        return orderListParams.AEQbTJ(page, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderListParams AEQbTJ(@NotNull Page page, @NotNull String str) {
        Intrinsics.checkNotNullParameter(page, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new OrderListParams(page, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Page EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderListParams)) {
            return false;
        }
        OrderListParams orderListParams = (OrderListParams) obj;
        return this.OLrzqt == orderListParams.OLrzqt && Intrinsics.EZpvd((Object) this.copydefault, (Object) orderListParams.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderListParams(page=" + this.OLrzqt + ", chainId=" + this.copydefault + ")";
    }

    public OrderListParams(@NotNull Page page, @NotNull String str) {
        Intrinsics.checkNotNullParameter(page, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = page;
        this.copydefault = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:com.okinc.business.dex.api.bean.OrderListParams$Page:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dex.api.bean.OrderListParams$Page:0x0004: SGET  A[WRAPPED] (LINE:395) com.okinc.business.dex.api.bean.OrderListParams.Page.OpenOrder com.okinc.business.dex.api.bean.OrderListParams$Page) : (r1v0 com.okinc.business.dex.api.bean.OrderListParams$Page))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(com.okinc.business.dex.api.bean.OrderListParams$Page, java.lang.String):void (m)] (LINE:394) call: com.okinc.business.dex.api.bean.OrderListParams.<init>(com.okinc.business.dex.api.bean.OrderListParams$Page, java.lang.String):void type: THIS */
    public /* synthetic */ OrderListParams(Page page, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Page.OpenOrder : page, (i & 2) != 0 ? "" : str);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Page {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Page[] $VALUES;
        public static final Page OpenOrder = new Page("OpenOrder", 0);
        public static final Page History = new Page("History", 1);
        public static final Page Trades = new Page("Trades", 2);
        public static final Page Bridge = new Page("Bridge", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Page[] $values() {
            return new Page[]{OpenOrder, History, Trades, Bridge};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Page> getEntries() {
            return $ENTRIES;
        }

        private Page(String str, int i) {
        }

        static {
            Page[] pageArr$values = $values();
            $VALUES = pageArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(pageArr$values);
        }

        public static Page valueOf(String str) {
            return (Page) Enum.valueOf(Page.class, str);
        }

        public static Page[] values() {
            return (Page[]) $VALUES.clone();
        }
    }
}
