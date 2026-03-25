package com.okinc.business.dexlogic.main.swap.trade.input.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DexTradeInputData {
    public static final int $stable = 8;
    private HorizontalLabelData horizontalLabelData;
    private ImageTextSelectData imageTextSelectData;
    private SimpleBalanceData simpleBalanceData;
    private VerticalEditTextGroupData verticalEditTextGroupData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexTradeInputData() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexTradeInputData copy$default(DexTradeInputData dexTradeInputData, SimpleBalanceData simpleBalanceData, HorizontalLabelData horizontalLabelData, VerticalEditTextGroupData verticalEditTextGroupData, ImageTextSelectData imageTextSelectData, int i, Object obj) {
        if ((i & 1) != 0) {
            simpleBalanceData = dexTradeInputData.simpleBalanceData;
        }
        if ((i & 2) != 0) {
            horizontalLabelData = dexTradeInputData.horizontalLabelData;
        }
        if ((i & 4) != 0) {
            verticalEditTextGroupData = dexTradeInputData.verticalEditTextGroupData;
        }
        if ((i & 8) != 0) {
            imageTextSelectData = dexTradeInputData.imageTextSelectData;
        }
        return dexTradeInputData.copy(simpleBalanceData, horizontalLabelData, verticalEditTextGroupData, imageTextSelectData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleBalanceData component1() {
        return this.simpleBalanceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HorizontalLabelData component2() {
        return this.horizontalLabelData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerticalEditTextGroupData component3() {
        return this.verticalEditTextGroupData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageTextSelectData component4() {
        return this.imageTextSelectData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexTradeInputData copy(@NotNull SimpleBalanceData simpleBalanceData, @NotNull HorizontalLabelData horizontalLabelData, @NotNull VerticalEditTextGroupData verticalEditTextGroupData, @NotNull ImageTextSelectData imageTextSelectData) {
        Intrinsics.checkNotNullParameter(simpleBalanceData, "");
        Intrinsics.checkNotNullParameter(horizontalLabelData, "");
        Intrinsics.checkNotNullParameter(verticalEditTextGroupData, "");
        Intrinsics.checkNotNullParameter(imageTextSelectData, "");
        return new DexTradeInputData(simpleBalanceData, horizontalLabelData, verticalEditTextGroupData, imageTextSelectData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexTradeInputData)) {
            return false;
        }
        DexTradeInputData dexTradeInputData = (DexTradeInputData) obj;
        return Intrinsics.EZpvd(this.simpleBalanceData, dexTradeInputData.simpleBalanceData) && Intrinsics.EZpvd(this.horizontalLabelData, dexTradeInputData.horizontalLabelData) && Intrinsics.EZpvd(this.verticalEditTextGroupData, dexTradeInputData.verticalEditTextGroupData) && Intrinsics.EZpvd(this.imageTextSelectData, dexTradeInputData.imageTextSelectData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HorizontalLabelData getHorizontalLabelData() {
        return this.horizontalLabelData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageTextSelectData getImageTextSelectData() {
        return this.imageTextSelectData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleBalanceData getSimpleBalanceData() {
        return this.simpleBalanceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerticalEditTextGroupData getVerticalEditTextGroupData() {
        return this.verticalEditTextGroupData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.simpleBalanceData.hashCode() * 31) + this.horizontalLabelData.hashCode()) * 31) + this.verticalEditTextGroupData.hashCode()) * 31) + this.imageTextSelectData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHorizontalLabelData(@NotNull HorizontalLabelData horizontalLabelData) {
        Intrinsics.checkNotNullParameter(horizontalLabelData, "");
        this.horizontalLabelData = horizontalLabelData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageTextSelectData(@NotNull ImageTextSelectData imageTextSelectData) {
        Intrinsics.checkNotNullParameter(imageTextSelectData, "");
        this.imageTextSelectData = imageTextSelectData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSimpleBalanceData(@NotNull SimpleBalanceData simpleBalanceData) {
        Intrinsics.checkNotNullParameter(simpleBalanceData, "");
        this.simpleBalanceData = simpleBalanceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVerticalEditTextGroupData(@NotNull VerticalEditTextGroupData verticalEditTextGroupData) {
        Intrinsics.checkNotNullParameter(verticalEditTextGroupData, "");
        this.verticalEditTextGroupData = verticalEditTextGroupData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexTradeInputData(simpleBalanceData=" + this.simpleBalanceData + ", horizontalLabelData=" + this.horizontalLabelData + ", verticalEditTextGroupData=" + this.verticalEditTextGroupData + ", imageTextSelectData=" + this.imageTextSelectData + ")";
    }

    public DexTradeInputData(@NotNull SimpleBalanceData simpleBalanceData, @NotNull HorizontalLabelData horizontalLabelData, @NotNull VerticalEditTextGroupData verticalEditTextGroupData, @NotNull ImageTextSelectData imageTextSelectData) {
        Intrinsics.checkNotNullParameter(simpleBalanceData, "");
        Intrinsics.checkNotNullParameter(horizontalLabelData, "");
        Intrinsics.checkNotNullParameter(verticalEditTextGroupData, "");
        Intrinsics.checkNotNullParameter(imageTextSelectData, "");
        this.simpleBalanceData = simpleBalanceData;
        this.horizontalLabelData = horizontalLabelData;
        this.verticalEditTextGroupData = verticalEditTextGroupData;
        this.imageTextSelectData = imageTextSelectData;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ DexTradeInputData(com.okinc.business.dexlogic.main.swap.trade.input.bean.SimpleBalanceData r22, com.okinc.business.dexlogic.main.swap.trade.input.bean.HorizontalLabelData r23, com.okinc.business.dexlogic.main.swap.trade.input.bean.VerticalEditTextGroupData r24, com.okinc.business.dexlogic.main.swap.trade.input.bean.ImageTextSelectData r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r21 = this;
            r0 = r26 & 1
            if (r0 == 0) goto L17
            com.okinc.business.dexlogic.main.swap.trade.input.bean.SimpleBalanceData r0 = new com.okinc.business.dexlogic.main.swap.trade.input.bean.SimpleBalanceData
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 511(0x1ff, float:7.16E-43)
            r12 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L19
        L17:
            r0 = r22
        L19:
            r1 = r26 & 2
            if (r1 == 0) goto L37
            com.okinc.business.dexlogic.main.swap.trade.input.bean.HorizontalLabelData r1 = new com.okinc.business.dexlogic.main.swap.trade.input.bean.HorizontalLabelData
            r2 = r1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 16383(0x3fff, float:2.2957E-41)
            r18 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L39
        L37:
            r1 = r23
        L39:
            r2 = r26 & 4
            if (r2 == 0) goto L5a
            com.okinc.business.dexlogic.main.swap.trade.input.bean.VerticalEditTextGroupData r2 = new com.okinc.business.dexlogic.main.swap.trade.input.bean.VerticalEditTextGroupData
            r3 = r2
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 32767(0x7fff, float:4.5916E-41)
            r20 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L5c
        L5a:
            r2 = r24
        L5c:
            r3 = r26 & 8
            if (r3 == 0) goto L73
            com.okinc.business.dexlogic.main.swap.trade.input.bean.ImageTextSelectData r3 = new com.okinc.business.dexlogic.main.swap.trade.input.bean.ImageTextSelectData
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 127(0x7f, float:1.78E-43)
            r13 = 0
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r4 = r21
            goto L77
        L73:
            r4 = r21
            r3 = r25
        L77:
            r4.<init>(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.dexlogic.main.swap.trade.input.bean.DexTradeInputData.<init>(com.okinc.business.dexlogic.main.swap.trade.input.bean.SimpleBalanceData, com.okinc.business.dexlogic.main.swap.trade.input.bean.HorizontalLabelData, com.okinc.business.dexlogic.main.swap.trade.input.bean.VerticalEditTextGroupData, com.okinc.business.dexlogic.main.swap.trade.input.bean.ImageTextSelectData, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
