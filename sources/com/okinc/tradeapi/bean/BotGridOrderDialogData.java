package com.okinc.tradeapi.bean;

import com.okinc.unify_trade.biz.PendingOrderLine;
import com.okinc.unify_trade.biz.PendingOrderLine$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class BotGridOrderDialogData {
    private int digit;
    private final String gridCount;
    private boolean isDraggingForCalculateGridNum;
    private final boolean isFinally;
    private final String maxPx;
    private final String minPx;
    private final PendingOrderLine orderLine;
    private final String tickerPrice;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tickerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.gridCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PendingOrderLine component5() {
        return this.orderLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isFinally;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.digit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isDraggingForCalculateGridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotGridOrderDialogData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull PendingOrderLine pendingOrderLine, boolean z, int i, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(pendingOrderLine, "");
        return new BotGridOrderDialogData(str, str2, str3, str4, pendingOrderLine, z, i, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotGridOrderDialogData)) {
            return false;
        }
        BotGridOrderDialogData botGridOrderDialogData = (BotGridOrderDialogData) obj;
        return Intrinsics.EZpvd((Object) this.tickerPrice, (Object) botGridOrderDialogData.tickerPrice) && Intrinsics.EZpvd((Object) this.maxPx, (Object) botGridOrderDialogData.maxPx) && Intrinsics.EZpvd((Object) this.minPx, (Object) botGridOrderDialogData.minPx) && Intrinsics.EZpvd((Object) this.gridCount, (Object) botGridOrderDialogData.gridCount) && Intrinsics.EZpvd(this.orderLine, botGridOrderDialogData.orderLine) && this.isFinally == botGridOrderDialogData.isFinally && this.digit == botGridOrderDialogData.digit && this.isDraggingForCalculateGridNum == botGridOrderDialogData.isDraggingForCalculateGridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDigit() {
        return this.digit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGridCount() {
        return this.gridCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPx() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinPx() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PendingOrderLine getOrderLine() {
        return this.orderLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTickerPrice() {
        return this.tickerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.tickerPrice.hashCode() * 31) + this.maxPx.hashCode()) * 31) + this.minPx.hashCode()) * 31) + this.gridCount.hashCode()) * 31) + this.orderLine.hashCode()) * 31) + Boolean.hashCode(this.isFinally)) * 31) + Integer.hashCode(this.digit)) * 31) + Boolean.hashCode(this.isDraggingForCalculateGridNum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDraggingForCalculateGridNum() {
        return this.isDraggingForCalculateGridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFinally() {
        return this.isFinally;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDigit(int i) {
        this.digit = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDraggingForCalculateGridNum(boolean z) {
        this.isDraggingForCalculateGridNum = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotGridOrderDialogData(tickerPrice=" + this.tickerPrice + ", maxPx=" + this.maxPx + ", minPx=" + this.minPx + ", gridCount=" + this.gridCount + ", orderLine=" + this.orderLine + ", isFinally=" + this.isFinally + ", digit=" + this.digit + ", isDraggingForCalculateGridNum=" + this.isDraggingForCalculateGridNum + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeapi.bean.BotGridOrderDialogData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotGridOrderDialogData> serializer() {
            return BotGridOrderDialogData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotGridOrderDialogData(int i, String str, String str2, String str3, String str4, PendingOrderLine pendingOrderLine, boolean z, int i2, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (62 != (i & 62)) {
            PluginExceptionsKt.throwMissingFieldException(i, 62, BotGridOrderDialogData$$serializer.INSTANCE.getDescriptor());
        }
        this.tickerPrice = (i & 1) == 0 ? "" : str;
        this.maxPx = str2;
        this.minPx = str3;
        this.gridCount = str4;
        this.orderLine = pendingOrderLine;
        this.isFinally = z;
        if ((i & 64) == 0) {
            this.digit = 8;
        } else {
            this.digit = i2;
        }
        if ((i & 128) == 0) {
            this.isDraggingForCalculateGridNum = false;
        } else {
            this.isDraggingForCalculateGridNum = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotGridOrderDialogData botGridOrderDialogData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) botGridOrderDialogData.tickerPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, botGridOrderDialogData.tickerPrice);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, botGridOrderDialogData.maxPx);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, botGridOrderDialogData.minPx);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, botGridOrderDialogData.gridCount);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, PendingOrderLine$$serializer.INSTANCE, botGridOrderDialogData.orderLine);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 5, botGridOrderDialogData.isFinally);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || botGridOrderDialogData.digit != 8) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, botGridOrderDialogData.digit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || botGridOrderDialogData.isDraggingForCalculateGridNum) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, botGridOrderDialogData.isDraggingForCalculateGridNum);
        }
    }

    public BotGridOrderDialogData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull PendingOrderLine pendingOrderLine, boolean z, int i, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(pendingOrderLine, "");
        this.tickerPrice = str;
        this.maxPx = str2;
        this.minPx = str3;
        this.gridCount = str4;
        this.orderLine = pendingOrderLine;
        this.isFinally = z;
        this.digit = i;
        this.isDraggingForCalculateGridNum = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 com.okinc.unify_trade.biz.PendingOrderLine)
  (r17v0 boolean)
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (8 int) : (r18v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.PendingOrderLine, boolean, int, boolean):void (m)] (LINE:10) call: com.okinc.tradeapi.bean.BotGridOrderDialogData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.PendingOrderLine, boolean, int, boolean):void type: THIS */
    public /* synthetic */ BotGridOrderDialogData(String str, String str2, String str3, String str4, PendingOrderLine pendingOrderLine, boolean z, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, str2, str3, str4, pendingOrderLine, z, (i2 & 64) != 0 ? 8 : i, (i2 & 128) != 0 ? false : z2);
    }
}
