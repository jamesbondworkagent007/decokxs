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
public final class AssetCurrenciesItemData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String canDep;
    private final String canWd;
    private final String ccy;
    private final String chain;
    private final String minWd;
    private final String name;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetCurrenciesItemData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AssetCurrenciesItemData copy$default(AssetCurrenciesItemData assetCurrenciesItemData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetCurrenciesItemData.ccy;
        }
        if ((i & 2) != 0) {
            str2 = assetCurrenciesItemData.name;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = assetCurrenciesItemData.chain;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = assetCurrenciesItemData.canDep;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = assetCurrenciesItemData.canWd;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = assetCurrenciesItemData.minWd;
        }
        return assetCurrenciesItemData.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.canDep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.canWd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.minWd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetCurrenciesItemData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new AssetCurrenciesItemData(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetCurrenciesItemData)) {
            return false;
        }
        AssetCurrenciesItemData assetCurrenciesItemData = (AssetCurrenciesItemData) obj;
        return Intrinsics.EZpvd((Object) this.ccy, (Object) assetCurrenciesItemData.ccy) && Intrinsics.EZpvd((Object) this.name, (Object) assetCurrenciesItemData.name) && Intrinsics.EZpvd((Object) this.chain, (Object) assetCurrenciesItemData.chain) && Intrinsics.EZpvd((Object) this.canDep, (Object) assetCurrenciesItemData.canDep) && Intrinsics.EZpvd((Object) this.canWd, (Object) assetCurrenciesItemData.canWd) && Intrinsics.EZpvd((Object) this.minWd, (Object) assetCurrenciesItemData.minWd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCanDep() {
        return this.canDep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCanWd() {
        return this.canWd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChain() {
        return this.chain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinWd() {
        return this.minWd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.ccy.hashCode() * 31) + this.name.hashCode()) * 31) + this.chain.hashCode()) * 31) + this.canDep.hashCode()) * 31) + this.canWd.hashCode()) * 31) + this.minWd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetCurrenciesItemData(ccy=" + this.ccy + ", name=" + this.name + ", chain=" + this.chain + ", canDep=" + this.canDep + ", canWd=" + this.canWd + ", minWd=" + this.minWd + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AssetCurrenciesItemData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetCurrenciesItemData> serializer() {
            return AssetCurrenciesItemData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AssetCurrenciesItemData(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str;
        }
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.chain = "";
        } else {
            this.chain = str3;
        }
        if ((i & 8) == 0) {
            this.canDep = "";
        } else {
            this.canDep = str4;
        }
        if ((i & 16) == 0) {
            this.canWd = "";
        } else {
            this.canWd = str5;
        }
        if ((i & 32) == 0) {
            this.minWd = "";
        } else {
            this.minWd = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AssetCurrenciesItemData assetCurrenciesItemData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) assetCurrenciesItemData.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, assetCurrenciesItemData.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) assetCurrenciesItemData.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, assetCurrenciesItemData.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) assetCurrenciesItemData.chain, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, assetCurrenciesItemData.chain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) assetCurrenciesItemData.canDep, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, assetCurrenciesItemData.canDep);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) assetCurrenciesItemData.canWd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, assetCurrenciesItemData.canWd);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) assetCurrenciesItemData.minWd, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, assetCurrenciesItemData.minWd);
    }

    public AssetCurrenciesItemData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.ccy = str;
        this.name = str2;
        this.chain = str3;
        this.canDep = str4;
        this.canWd = str5;
        this.minWd = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:69) call: com.okinc.unify_trade.biz.AssetCurrenciesItemData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AssetCurrenciesItemData(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
