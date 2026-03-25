package com.okinc.business.market.features.address_tracker_sa.ui.tracker.model;

import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.CompactTagData$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TrendTrader {
    public final String addressAlias;
    public final String balance;
    public final String collectAddress;
    public final String inflow;
    public final int lastTradeType;
    public final long lastTxTime;
    public final String realizedProfit;
    public final String realizedProfitPercentage;
    public final List<CompactTagData> t;
    public final int txsBuy;
    public final int txsSell;
    public final String unrealizedProfit;
    public final String unrealizedProfitPercentage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(CompactTagData$$serializer.INSTANCE), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrendTrader() {
        this((String) null, (String) null, (String) null, (String) null, 0, 0L, (String) null, (String) null, (List) null, 0, 0, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.lastTradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AYXKKw() {
        return this.lastTxTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrendTrader EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, long j, @NotNull String str5, @NotNull String str6, @NotNull List<CompactTagData> list, int i2, int i3, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new TrendTrader(str, str2, str3, str4, i, j, str5, str6, list, i2, i3, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.addressAlias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.collectAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.unrealizedProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendTrader)) {
            return false;
        }
        TrendTrader trendTrader = (TrendTrader) obj;
        return Intrinsics.EZpvd((Object) this.addressAlias, (Object) trendTrader.addressAlias) && Intrinsics.EZpvd((Object) this.balance, (Object) trendTrader.balance) && Intrinsics.EZpvd((Object) this.collectAddress, (Object) trendTrader.collectAddress) && Intrinsics.EZpvd((Object) this.inflow, (Object) trendTrader.inflow) && this.lastTradeType == trendTrader.lastTradeType && this.lastTxTime == trendTrader.lastTxTime && Intrinsics.EZpvd((Object) this.realizedProfit, (Object) trendTrader.realizedProfit) && Intrinsics.EZpvd((Object) this.realizedProfitPercentage, (Object) trendTrader.realizedProfitPercentage) && Intrinsics.EZpvd(this.t, trendTrader.t) && this.txsBuy == trendTrader.txsBuy && this.txsSell == trendTrader.txsSell && Intrinsics.EZpvd((Object) this.unrealizedProfit, (Object) trendTrader.unrealizedProfit) && Intrinsics.EZpvd((Object) this.unrealizedProfitPercentage, (Object) trendTrader.unrealizedProfitPercentage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.realizedProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.addressAlias.hashCode() * 31) + this.balance.hashCode()) * 31) + this.collectAddress.hashCode()) * 31) + this.inflow.hashCode()) * 31) + Integer.hashCode(this.lastTradeType)) * 31) + Long.hashCode(this.lastTxTime)) * 31) + this.realizedProfit.hashCode()) * 31) + this.realizedProfitPercentage.hashCode()) * 31) + this.t.hashCode()) * 31) + Integer.hashCode(this.txsBuy)) * 31) + Integer.hashCode(this.txsSell)) * 31) + this.unrealizedProfit.hashCode()) * 31) + this.unrealizedProfitPercentage.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrendTrader(addressAlias=" + this.addressAlias + ", balance=" + this.balance + ", collectAddress=" + this.collectAddress + ", inflow=" + this.inflow + ", lastTradeType=" + this.lastTradeType + ", lastTxTime=" + this.lastTxTime + ", realizedProfit=" + this.realizedProfit + ", realizedProfitPercentage=" + this.realizedProfitPercentage + ", t=" + this.t + ", txsBuy=" + this.txsBuy + ", txsSell=" + this.txsSell + ", unrealizedProfit=" + this.unrealizedProfit + ", unrealizedProfitPercentage=" + this.unrealizedProfitPercentage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> valueOf() {
        return this.t;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrendTrader.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrendTrader> serializer() {
            return TrendTrader$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TrendTrader(int i, String str, String str2, String str3, String str4, int i2, long j, String str5, String str6, List list, int i3, int i4, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.addressAlias = "";
        } else {
            this.addressAlias = str;
        }
        if ((i & 2) == 0) {
            this.balance = "";
        } else {
            this.balance = str2;
        }
        if ((i & 4) == 0) {
            this.collectAddress = "";
        } else {
            this.collectAddress = str3;
        }
        if ((i & 8) == 0) {
            this.inflow = "";
        } else {
            this.inflow = str4;
        }
        if ((i & 16) == 0) {
            this.lastTradeType = 0;
        } else {
            this.lastTradeType = i2;
        }
        this.lastTxTime = (i & 32) == 0 ? 0L : j;
        if ((i & 64) == 0) {
            this.realizedProfit = "";
        } else {
            this.realizedProfit = str5;
        }
        if ((i & 128) == 0) {
            this.realizedProfitPercentage = "";
        } else {
            this.realizedProfitPercentage = str6;
        }
        this.t = (i & 256) == 0 ? yDY.AhwBna() : list;
        if ((i & 512) == 0) {
            this.txsBuy = 0;
        } else {
            this.txsBuy = i3;
        }
        if ((i & 1024) == 0) {
            this.txsSell = 0;
        } else {
            this.txsSell = i4;
        }
        if ((i & 2048) == 0) {
            this.unrealizedProfit = "";
        } else {
            this.unrealizedProfit = str7;
        }
        if ((i & 4096) == 0) {
            this.unrealizedProfitPercentage = "";
        } else {
            this.unrealizedProfitPercentage = str8;
        }
    }

    public static final /* synthetic */ void AEQbTJ(TrendTrader trendTrader, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) trendTrader.addressAlias, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, trendTrader.addressAlias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) trendTrader.balance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, trendTrader.balance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) trendTrader.collectAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, trendTrader.collectAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) trendTrader.inflow, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, trendTrader.inflow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || trendTrader.lastTradeType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, trendTrader.lastTradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || trendTrader.lastTxTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, trendTrader.lastTxTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) trendTrader.realizedProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, trendTrader.realizedProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) trendTrader.realizedProfitPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, trendTrader.realizedProfitPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(trendTrader.t, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], trendTrader.t);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || trendTrader.txsBuy != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, trendTrader.txsBuy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || trendTrader.txsSell != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, trendTrader.txsSell);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) trendTrader.unrealizedProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, trendTrader.unrealizedProfit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd((Object) trendTrader.unrealizedProfitPercentage, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 12, trendTrader.unrealizedProfitPercentage);
    }

    public TrendTrader(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, long j, @NotNull String str5, @NotNull String str6, @NotNull List<CompactTagData> list, int i2, int i3, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.addressAlias = str;
        this.balance = str2;
        this.collectAddress = str3;
        this.inflow = str4;
        this.lastTradeType = i;
        this.lastTxTime = j;
        this.realizedProfit = str5;
        this.realizedProfitPercentage = str6;
        this.t = list;
        this.txsBuy = i2;
        this.txsSell = i3;
        this.unrealizedProfit = str7;
        this.unrealizedProfitPercentage = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x008b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0024: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r20v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002d: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r21v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0046: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:63)) : (r25v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0051: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r26v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0059: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r27v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0060: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.CompactTagData>, int, int, java.lang.String, java.lang.String):void (m)] (LINE:54) call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrendTrader.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, java.lang.String, java.lang.String, java.util.List, int, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TrendTrader(String str, String str2, String str3, String str4, int i, long j, String str5, String str6, List list, int i2, int i3, String str7, String str8, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4, (i4 & 16) != 0 ? 0 : i, (i4 & 32) != 0 ? 0L : j, (i4 & 64) != 0 ? "" : str5, (i4 & 128) != 0 ? "" : str6, (i4 & 256) != 0 ? yDY.AhwBna() : list, (i4 & 512) != 0 ? 0 : i2, (i4 & 1024) == 0 ? i3 : 0, (i4 & 2048) != 0 ? "" : str7, (i4 & 4096) == 0 ? str8 : "");
    }
}
