package com.okinc.business.dexlogic.main.swap.trade.input.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DexTradeGroupInputData {
    public static final int $stable = 8;
    private DexTradeInputData fromData;
    private DexTradeInputData toData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexTradeGroupInputData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexTradeGroupInputData copy$default(DexTradeGroupInputData dexTradeGroupInputData, DexTradeInputData dexTradeInputData, DexTradeInputData dexTradeInputData2, int i, Object obj) {
        if ((i & 1) != 0) {
            dexTradeInputData = dexTradeGroupInputData.fromData;
        }
        if ((i & 2) != 0) {
            dexTradeInputData2 = dexTradeGroupInputData.toData;
        }
        return dexTradeGroupInputData.copy(dexTradeInputData, dexTradeInputData2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexTradeInputData component1() {
        return this.fromData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexTradeInputData component2() {
        return this.toData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexTradeGroupInputData copy(@NotNull DexTradeInputData dexTradeInputData, @NotNull DexTradeInputData dexTradeInputData2) {
        Intrinsics.checkNotNullParameter(dexTradeInputData, "");
        Intrinsics.checkNotNullParameter(dexTradeInputData2, "");
        return new DexTradeGroupInputData(dexTradeInputData, dexTradeInputData2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexTradeGroupInputData)) {
            return false;
        }
        DexTradeGroupInputData dexTradeGroupInputData = (DexTradeGroupInputData) obj;
        return Intrinsics.EZpvd(this.fromData, dexTradeGroupInputData.fromData) && Intrinsics.EZpvd(this.toData, dexTradeGroupInputData.toData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexTradeInputData getFromData() {
        return this.fromData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexTradeInputData getToData() {
        return this.toData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.fromData.hashCode() * 31) + this.toData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromData(@NotNull DexTradeInputData dexTradeInputData) {
        Intrinsics.checkNotNullParameter(dexTradeInputData, "");
        this.fromData = dexTradeInputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToData(@NotNull DexTradeInputData dexTradeInputData) {
        Intrinsics.checkNotNullParameter(dexTradeInputData, "");
        this.toData = dexTradeInputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexTradeGroupInputData(fromData=" + this.fromData + ", toData=" + this.toData + ")";
    }

    public DexTradeGroupInputData(@NotNull DexTradeInputData dexTradeInputData, @NotNull DexTradeInputData dexTradeInputData2) {
        Intrinsics.checkNotNullParameter(dexTradeInputData, "");
        Intrinsics.checkNotNullParameter(dexTradeInputData2, "");
        this.fromData = dexTradeInputData;
        this.toData = dexTradeInputData2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.main.swap.trade.input.bean.DexTradeInputData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dexlogic.main.swap.trade.input.bean.DexTradeInputData:0x000e: CONSTRUCTOR 
  (null com.okinc.business.dexlogic.main.swap.trade.input.bean.SimpleBalanceData)
  (null com.okinc.business.dexlogic.main.swap.trade.input.bean.HorizontalLabelData)
  (null com.okinc.business.dexlogic.main.swap.trade.input.bean.VerticalEditTextGroupData)
  (null com.okinc.business.dexlogic.main.swap.trade.input.bean.ImageTextSelectData)
  (15 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(com.okinc.business.dexlogic.main.swap.trade.input.bean.SimpleBalanceData, com.okinc.business.dexlogic.main.swap.trade.input.bean.HorizontalLabelData, com.okinc.business.dexlogic.main.swap.trade.input.bean.VerticalEditTextGroupData, com.okinc.business.dexlogic.main.swap.trade.input.bean.ImageTextSelectData, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:12) call: com.okinc.business.dexlogic.main.swap.trade.input.bean.DexTradeInputData.<init>(com.okinc.business.dexlogic.main.swap.trade.input.bean.SimpleBalanceData, com.okinc.business.dexlogic.main.swap.trade.input.bean.HorizontalLabelData, com.okinc.business.dexlogic.main.swap.trade.input.bean.VerticalEditTextGroupData, com.okinc.business.dexlogic.main.swap.trade.input.bean.ImageTextSelectData, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r8v0 com.okinc.business.dexlogic.main.swap.trade.input.bean.DexTradeInputData))
  (wrap:com.okinc.business.dexlogic.main.swap.trade.input.bean.DexTradeInputData:?: TERNARY null = ((wrap:int:0x0011: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dexlogic.main.swap.trade.input.bean.DexTradeInputData:0x001f: CONSTRUCTOR 
  (null com.okinc.business.dexlogic.main.swap.trade.input.bean.SimpleBalanceData)
  (null com.okinc.business.dexlogic.main.swap.trade.input.bean.HorizontalLabelData)
  (null com.okinc.business.dexlogic.main.swap.trade.input.bean.VerticalEditTextGroupData)
  (null com.okinc.business.dexlogic.main.swap.trade.input.bean.ImageTextSelectData)
  (15 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(com.okinc.business.dexlogic.main.swap.trade.input.bean.SimpleBalanceData, com.okinc.business.dexlogic.main.swap.trade.input.bean.HorizontalLabelData, com.okinc.business.dexlogic.main.swap.trade.input.bean.VerticalEditTextGroupData, com.okinc.business.dexlogic.main.swap.trade.input.bean.ImageTextSelectData, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:13) call: com.okinc.business.dexlogic.main.swap.trade.input.bean.DexTradeInputData.<init>(com.okinc.business.dexlogic.main.swap.trade.input.bean.SimpleBalanceData, com.okinc.business.dexlogic.main.swap.trade.input.bean.HorizontalLabelData, com.okinc.business.dexlogic.main.swap.trade.input.bean.VerticalEditTextGroupData, com.okinc.business.dexlogic.main.swap.trade.input.bean.ImageTextSelectData, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r9v0 com.okinc.business.dexlogic.main.swap.trade.input.bean.DexTradeInputData))
 A[MD:(com.okinc.business.dexlogic.main.swap.trade.input.bean.DexTradeInputData, com.okinc.business.dexlogic.main.swap.trade.input.bean.DexTradeInputData):void (m)] (LINE:11) call: com.okinc.business.dexlogic.main.swap.trade.input.bean.DexTradeGroupInputData.<init>(com.okinc.business.dexlogic.main.swap.trade.input.bean.DexTradeInputData, com.okinc.business.dexlogic.main.swap.trade.input.bean.DexTradeInputData):void type: THIS */
    public /* synthetic */ DexTradeGroupInputData(DexTradeInputData dexTradeInputData, DexTradeInputData dexTradeInputData2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new DexTradeInputData(null, null, null, null, 15, null) : dexTradeInputData, (i & 2) != 0 ? new DexTradeInputData(null, null, null, null, 15, null) : dexTradeInputData2);
    }
}
