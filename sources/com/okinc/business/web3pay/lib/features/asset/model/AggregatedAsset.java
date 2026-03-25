package com.okinc.business.web3pay.lib.features.asset.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class AggregatedAsset {
    private final String deficitAmount;
    private final String tokenAmount;
    private final int tokenDecimal;
    private final List<TokenDetail> tokenDetails;
    private final String tokenSymbolTicker;
    private final String usdAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(TokenDetail$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.web3pay.lib.features.asset.model.AggregatedAsset */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AggregatedAsset copy$default(AggregatedAsset aggregatedAsset, String str, String str2, int i, String str3, List list, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aggregatedAsset.tokenAmount;
        }
        if ((i2 & 2) != 0) {
            str2 = aggregatedAsset.usdAmount;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            i = aggregatedAsset.tokenDecimal;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = aggregatedAsset.tokenSymbolTicker;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            list = aggregatedAsset.tokenDetails;
        }
        List list2 = list;
        if ((i2 & 32) != 0) {
            str4 = aggregatedAsset.deficitAmount;
        }
        return aggregatedAsset.copy(str, str5, i3, str6, list2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenSymbolTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenDetail> component5() {
        return this.tokenDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.deficitAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AggregatedAsset copy(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull List<TokenDetail> list, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AggregatedAsset(str, str2, i, str3, list, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AggregatedAsset)) {
            return false;
        }
        AggregatedAsset aggregatedAsset = (AggregatedAsset) obj;
        return Intrinsics.EZpvd((Object) this.tokenAmount, (Object) aggregatedAsset.tokenAmount) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) aggregatedAsset.usdAmount) && this.tokenDecimal == aggregatedAsset.tokenDecimal && Intrinsics.EZpvd((Object) this.tokenSymbolTicker, (Object) aggregatedAsset.tokenSymbolTicker) && Intrinsics.EZpvd(this.tokenDetails, aggregatedAsset.tokenDetails) && Intrinsics.EZpvd((Object) this.deficitAmount, (Object) aggregatedAsset.deficitAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeficitAmount() {
        return this.deficitAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmount() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTokenDecimal() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenDetail> getTokenDetails() {
        return this.tokenDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbolTicker() {
        return this.tokenSymbolTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAmount() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.tokenAmount.hashCode() * 31) + this.usdAmount.hashCode()) * 31) + Integer.hashCode(this.tokenDecimal)) * 31) + this.tokenSymbolTicker.hashCode()) * 31) + this.tokenDetails.hashCode()) * 31) + this.deficitAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AggregatedAsset(tokenAmount=" + this.tokenAmount + ", usdAmount=" + this.usdAmount + ", tokenDecimal=" + this.tokenDecimal + ", tokenSymbolTicker=" + this.tokenSymbolTicker + ", tokenDetails=" + this.tokenDetails + ", deficitAmount=" + this.deficitAmount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.asset.model.AggregatedAsset.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AggregatedAsset> serializer() {
            return AggregatedAsset$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AggregatedAsset(int i, String str, String str2, int i2, String str3, List list, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, AggregatedAsset$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenAmount = str;
        this.usdAmount = str2;
        this.tokenDecimal = i2;
        this.tokenSymbolTicker = str3;
        this.tokenDetails = list;
        if ((i & 32) == 0) {
            this.deficitAmount = "0";
        } else {
            this.deficitAmount = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(AggregatedAsset aggregatedAsset, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, aggregatedAsset.tokenAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, aggregatedAsset.usdAmount);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, aggregatedAsset.tokenDecimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, aggregatedAsset.tokenSymbolTicker);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], aggregatedAsset.tokenDetails);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) aggregatedAsset.deficitAmount, (Object) "0")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, aggregatedAsset.deficitAmount);
    }

    public AggregatedAsset(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull List<TokenDetail> list, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.tokenAmount = str;
        this.usdAmount = str2;
        this.tokenDecimal = i;
        this.tokenSymbolTicker = str3;
        this.tokenDetails = list;
        this.deficitAmount = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 int)
  (r11v0 java.lang.String)
  (r12v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("0") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, int, java.lang.String, java.util.List<com.okinc.business.web3pay.lib.features.asset.model.TokenDetail>, java.lang.String):void (m)] (LINE:120) call: com.okinc.business.web3pay.lib.features.asset.model.AggregatedAsset.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ AggregatedAsset(String str, String str2, int i, String str3, List list, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, list, (i2 & 32) != 0 ? "0" : str4);
    }
}
