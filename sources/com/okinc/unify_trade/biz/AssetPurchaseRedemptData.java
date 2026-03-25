package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class AssetPurchaseRedemptData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String amt;
    private final String ccy;
    private final String side;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetPurchaseRedemptData() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AssetPurchaseRedemptData copy$default(AssetPurchaseRedemptData assetPurchaseRedemptData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetPurchaseRedemptData.ccy;
        }
        if ((i & 2) != 0) {
            str2 = assetPurchaseRedemptData.amt;
        }
        if ((i & 4) != 0) {
            str3 = assetPurchaseRedemptData.side;
        }
        return assetPurchaseRedemptData.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetPurchaseRedemptData copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AssetPurchaseRedemptData(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetPurchaseRedemptData)) {
            return false;
        }
        AssetPurchaseRedemptData assetPurchaseRedemptData = (AssetPurchaseRedemptData) obj;
        return Intrinsics.EZpvd((Object) this.ccy, (Object) assetPurchaseRedemptData.ccy) && Intrinsics.EZpvd((Object) this.amt, (Object) assetPurchaseRedemptData.amt) && Intrinsics.EZpvd((Object) this.side, (Object) assetPurchaseRedemptData.side);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmt() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.ccy.hashCode() * 31) + this.amt.hashCode()) * 31) + this.side.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetPurchaseRedemptData(ccy=" + this.ccy + ", amt=" + this.amt + ", side=" + this.side + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AssetPurchaseRedemptData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetPurchaseRedemptData> serializer() {
            return AssetPurchaseRedemptData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AssetPurchaseRedemptData(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str;
        }
        if ((i & 2) == 0) {
            this.amt = "";
        } else {
            this.amt = str2;
        }
        if ((i & 4) == 0) {
            this.side = "";
        } else {
            this.side = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AssetPurchaseRedemptData assetPurchaseRedemptData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) assetPurchaseRedemptData.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, assetPurchaseRedemptData.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) assetPurchaseRedemptData.amt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, assetPurchaseRedemptData.amt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) assetPurchaseRedemptData.side, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, assetPurchaseRedemptData.side);
    }

    public AssetPurchaseRedemptData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.ccy = str;
        this.amt = str2;
        this.side = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:80) call: com.okinc.unify_trade.biz.AssetPurchaseRedemptData.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AssetPurchaseRedemptData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
