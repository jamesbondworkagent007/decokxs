package com.okinc.business.dex.trade.copytrading.edit.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class BuySettings {
    public static final int BUY_TYPE_FIXED_AMOUNT = 1;
    public static final int BUY_TYPE_PERCENTAGE = 2;
    private final String buyAmount;
    private final String buyPercent;
    private final CopyTradingPreset buyPreset;
    private final int buyType;
    private final String maxBuyAmount;
    private final boolean repeatCopyBuy;
    private final String tokenAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BuySettings() {
        this(0, (String) null, (String) null, (String) null, (String) null, false, (CopyTradingPreset) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BuySettings copy$default(BuySettings buySettings, int i, String str, String str2, String str3, String str4, boolean z, CopyTradingPreset copyTradingPreset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = buySettings.buyType;
        }
        if ((i2 & 2) != 0) {
            str = buySettings.tokenAddress;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = buySettings.buyAmount;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = buySettings.maxBuyAmount;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = buySettings.buyPercent;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            z = buySettings.repeatCopyBuy;
        }
        boolean z2 = z;
        if ((i2 & 64) != 0) {
            copyTradingPreset = buySettings.buyPreset;
        }
        return buySettings.copy(i, str5, str6, str7, str8, z2, copyTradingPreset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.buyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.buyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.maxBuyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.buyPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.repeatCopyBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyTradingPreset component7() {
        return this.buyPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySettings copy(int i, @NotNull String str, @NotNull String str2, String str3, @NotNull String str4, boolean z, @NotNull CopyTradingPreset copyTradingPreset) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(copyTradingPreset, "");
        return new BuySettings(i, str, str2, str3, str4, z, copyTradingPreset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuySettings)) {
            return false;
        }
        BuySettings buySettings = (BuySettings) obj;
        return this.buyType == buySettings.buyType && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) buySettings.tokenAddress) && Intrinsics.EZpvd((Object) this.buyAmount, (Object) buySettings.buyAmount) && Intrinsics.EZpvd((Object) this.maxBuyAmount, (Object) buySettings.maxBuyAmount) && Intrinsics.EZpvd((Object) this.buyPercent, (Object) buySettings.buyPercent) && this.repeatCopyBuy == buySettings.repeatCopyBuy && Intrinsics.EZpvd(this.buyPreset, buySettings.buyPreset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyAmount() {
        return this.buyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyPercent() {
        return this.buyPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyTradingPreset getBuyPreset() {
        return this.buyPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBuyType() {
        return this.buyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxBuyAmount() {
        return this.maxBuyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginInputAmount() {
        return this.buyType == 2 ? this.buyPercent : this.buyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRepeatCopyBuy() {
        return this.repeatCopyBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.buyType);
        int iHashCode2 = this.tokenAddress.hashCode();
        int iHashCode3 = this.buyAmount.hashCode();
        String str = this.maxBuyAmount;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.buyPercent.hashCode()) * 31) + Boolean.hashCode(this.repeatCopyBuy)) * 31) + this.buyPreset.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BuySettings(buyType=" + this.buyType + ", tokenAddress=" + this.tokenAddress + ", buyAmount=" + this.buyAmount + ", maxBuyAmount=" + this.maxBuyAmount + ", buyPercent=" + this.buyPercent + ", repeatCopyBuy=" + this.repeatCopyBuy + ", buyPreset=" + this.buyPreset + ")";
    }

    public /* synthetic */ BuySettings(int i, int i2, String str, String str2, String str3, String str4, boolean z, CopyTradingPreset copyTradingPreset, SerializationConstructorMarker serializationConstructorMarker) {
        this.buyType = (i & 1) == 0 ? 1 : i2;
        if ((i & 2) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str;
        }
        if ((i & 4) == 0) {
            this.buyAmount = "";
        } else {
            this.buyAmount = str2;
        }
        this.maxBuyAmount = (i & 8) == 0 ? null : str3;
        if ((i & 16) == 0) {
            this.buyPercent = "";
        } else {
            this.buyPercent = str4;
        }
        this.repeatCopyBuy = (i & 32) == 0 ? false : z;
        this.buyPreset = (i & 64) == 0 ? new CopyTradingPreset((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (JsonElement) null, 1023, (DefaultConstructorMarker) null) : copyTradingPreset;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(BuySettings buySettings, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || buySettings.buyType != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, buySettings.buyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) buySettings.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, buySettings.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) buySettings.buyAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, buySettings.buyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || buySettings.maxBuyAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, buySettings.maxBuyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) buySettings.buyPercent, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, buySettings.buyPercent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || buySettings.repeatCopyBuy) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, buySettings.repeatCopyBuy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd(buySettings.buyPreset, new CopyTradingPreset((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (JsonElement) null, 1023, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, CopyTradingPreset$$serializer.INSTANCE, buySettings.buyPreset);
    }

    public BuySettings(int i, @NotNull String str, @NotNull String str2, String str3, @NotNull String str4, boolean z, @NotNull CopyTradingPreset copyTradingPreset) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(copyTradingPreset, "");
        this.buyType = i;
        this.tokenAddress = str;
        this.buyAmount = str2;
        this.maxBuyAmount = str3;
        this.buyPercent = str4;
        this.repeatCopyBuy = z;
        this.buyPreset = copyTradingPreset;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005e: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r21v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r28v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r26v0 boolean))
  (wrap:com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset:?: TERNARY null = ((wrap:int:0x0031: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0048: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:kotlinx.serialization.json.JsonElement:?: CAST (kotlinx.serialization.json.JsonElement) (null kotlinx.serialization.json.JsonElement))
  (1023 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonElement, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:56) call: com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonElement, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r27v0 com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset):void (m)] (LINE:49) call: com.okinc.business.dex.trade.copytrading.edit.data.model.BuySettings.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset):void type: THIS */
    public /* synthetic */ BuySettings(int i, String str, String str2, String str3, String str4, boolean z, CopyTradingPreset copyTradingPreset, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) == 0 ? str4 : "", (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? new CopyTradingPreset((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (JsonElement) null, 1023, (DefaultConstructorMarker) null) : copyTradingPreset);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.edit.data.model.BuySettings.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BuySettings> serializer() {
            return BuySettings$$serializer.INSTANCE;
        }
    }
}
