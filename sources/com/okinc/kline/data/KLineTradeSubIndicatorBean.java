package com.okinc.kline.data;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class KLineTradeSubIndicatorBean {
    public static final int $stable = 8;
    private final List<List<String>> LSAccountRatio;
    private final List<List<String>> eliteLSAccountRatio;
    private final List<List<String>> eliteLSOIRatio;
    private final List<List<String>> oi;
    private final List<List<String>> takerBuySellVol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.kline.data.KLineTradeSubIndicatorBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KLineTradeSubIndicatorBean copy$default(KLineTradeSubIndicatorBean kLineTradeSubIndicatorBean, List list, List list2, List list3, List list4, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kLineTradeSubIndicatorBean.oi;
        }
        if ((i & 2) != 0) {
            list2 = kLineTradeSubIndicatorBean.eliteLSAccountRatio;
        }
        List list6 = list2;
        if ((i & 4) != 0) {
            list3 = kLineTradeSubIndicatorBean.eliteLSOIRatio;
        }
        List list7 = list3;
        if ((i & 8) != 0) {
            list4 = kLineTradeSubIndicatorBean.LSAccountRatio;
        }
        List list8 = list4;
        if ((i & 16) != 0) {
            list5 = kLineTradeSubIndicatorBean.takerBuySellVol;
        }
        return kLineTradeSubIndicatorBean.copy(list, list6, list7, list8, list5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> component1() {
        return this.oi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> component2() {
        return this.eliteLSAccountRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> component3() {
        return this.eliteLSOIRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> component4() {
        return this.LSAccountRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> component5() {
        return this.takerBuySellVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KLineTradeSubIndicatorBean copy(@NotNull List<? extends List<String>> list, @NotNull List<? extends List<String>> list2, @NotNull List<? extends List<String>> list3, @NotNull List<? extends List<String>> list4, @NotNull List<? extends List<String>> list5) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        return new KLineTradeSubIndicatorBean(list, list2, list3, list4, list5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KLineTradeSubIndicatorBean)) {
            return false;
        }
        KLineTradeSubIndicatorBean kLineTradeSubIndicatorBean = (KLineTradeSubIndicatorBean) obj;
        return Intrinsics.EZpvd(this.oi, kLineTradeSubIndicatorBean.oi) && Intrinsics.EZpvd(this.eliteLSAccountRatio, kLineTradeSubIndicatorBean.eliteLSAccountRatio) && Intrinsics.EZpvd(this.eliteLSOIRatio, kLineTradeSubIndicatorBean.eliteLSOIRatio) && Intrinsics.EZpvd(this.LSAccountRatio, kLineTradeSubIndicatorBean.LSAccountRatio) && Intrinsics.EZpvd(this.takerBuySellVol, kLineTradeSubIndicatorBean.takerBuySellVol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> getEliteLSAccountRatio() {
        return this.eliteLSAccountRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> getEliteLSOIRatio() {
        return this.eliteLSOIRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> getLSAccountRatio() {
        return this.LSAccountRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> getOi() {
        return this.oi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> getTakerBuySellVol() {
        return this.takerBuySellVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.oi.hashCode() * 31) + this.eliteLSAccountRatio.hashCode()) * 31) + this.eliteLSOIRatio.hashCode()) * 31) + this.LSAccountRatio.hashCode()) * 31) + this.takerBuySellVol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KLineTradeSubIndicatorBean(oi=" + this.oi + ", eliteLSAccountRatio=" + this.eliteLSAccountRatio + ", eliteLSOIRatio=" + this.eliteLSOIRatio + ", LSAccountRatio=" + this.LSAccountRatio + ", takerBuySellVol=" + this.takerBuySellVol + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public KLineTradeSubIndicatorBean(@NotNull List<? extends List<String>> list, @NotNull List<? extends List<String>> list2, @NotNull List<? extends List<String>> list3, @NotNull List<? extends List<String>> list4, @NotNull List<? extends List<String>> list5) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        this.oi = list;
        this.eliteLSAccountRatio = list2;
        this.eliteLSOIRatio = list3;
        this.LSAccountRatio = list4;
        this.takerBuySellVol = list5;
    }
}
