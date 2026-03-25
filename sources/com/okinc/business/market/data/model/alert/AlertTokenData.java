package com.okinc.business.market.data.model.alert;

import com.okinc.business.market.common.constants.StringBooleanType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class AlertTokenData {
    public static final int $stable = 0;
    public final String chainId;
    public final String change;
    public final StringBooleanType isFavoriteToken;
    public final String price;
    public final String tokenContractAddress;
    public final String tokenLogoUrl;
    public final String tokenName;
    public final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {null, null, StringBooleanType.Companion.serializer(), null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AlertTokenData() {
        this((String) null, (String) null, (StringBooleanType) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertTokenData OLrzqt(@NotNull String str, @NotNull String str2, @NotNull StringBooleanType stringBooleanType, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(stringBooleanType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new AlertTokenData(str, str2, stringBooleanType, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertTokenData)) {
            return false;
        }
        AlertTokenData alertTokenData = (AlertTokenData) obj;
        return Intrinsics.EZpvd((Object) this.price, (Object) alertTokenData.price) && Intrinsics.EZpvd((Object) this.change, (Object) alertTokenData.change) && this.isFavoriteToken == alertTokenData.isFavoriteToken && Intrinsics.EZpvd((Object) this.chainId, (Object) alertTokenData.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) alertTokenData.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenName, (Object) alertTokenData.tokenName) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) alertTokenData.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) alertTokenData.tokenLogoUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.price.hashCode() * 31) + this.change.hashCode()) * 31) + this.isFavoriteToken.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.tokenLogoUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AlertTokenData(price=" + this.price + ", change=" + this.change + ", isFavoriteToken=" + this.isFavoriteToken + ", chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenName=" + this.tokenName + ", tokenSymbol=" + this.tokenSymbol + ", tokenLogoUrl=" + this.tokenLogoUrl + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.alert.AlertTokenData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AlertTokenData> serializer() {
            return AlertTokenData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AlertTokenData(int i, String str, String str2, StringBooleanType stringBooleanType, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.price = "";
        } else {
            this.price = str;
        }
        if ((i & 2) == 0) {
            this.change = "";
        } else {
            this.change = str2;
        }
        if ((i & 4) == 0) {
            this.isFavoriteToken = StringBooleanType.FALSE;
        } else {
            this.isFavoriteToken = stringBooleanType;
        }
        if ((i & 8) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str3;
        }
        if ((i & 16) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str4;
        }
        if ((i & 32) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str5;
        }
        if ((i & 64) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str6;
        }
        if ((i & 128) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str7;
        }
    }

    public static final /* synthetic */ void OLrzqt(AlertTokenData alertTokenData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) alertTokenData.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, alertTokenData.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) alertTokenData.change, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, alertTokenData.change);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || alertTokenData.isFavoriteToken != StringBooleanType.FALSE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], alertTokenData.isFavoriteToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) alertTokenData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, alertTokenData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) alertTokenData.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, alertTokenData.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) alertTokenData.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, alertTokenData.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) alertTokenData.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, alertTokenData.tokenSymbol);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) alertTokenData.tokenLogoUrl, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, alertTokenData.tokenLogoUrl);
    }

    public AlertTokenData(@NotNull String str, @NotNull String str2, @NotNull StringBooleanType stringBooleanType, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(stringBooleanType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.price = str;
        this.change = str2;
        this.isFavoriteToken = stringBooleanType;
        this.chainId = str3;
        this.tokenContractAddress = str4;
        this.tokenName = str5;
        this.tokenSymbol = str6;
        this.tokenLogoUrl = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.StringBooleanType:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0016: SGET  A[WRAPPED] (LINE:14) com.okinc.business.market.common.constants.StringBooleanType.FALSE com.okinc.business.market.common.constants.StringBooleanType) : (r12v0 com.okinc.business.market.common.constants.StringBooleanType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.market.data.model.alert.AlertTokenData.<init>(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AlertTokenData(String str, String str2, StringBooleanType stringBooleanType, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? StringBooleanType.FALSE : stringBooleanType, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : "");
    }
}
