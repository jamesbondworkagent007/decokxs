package com.okinc.business.market.data.model.common;

import com.okinc.business.market.common.constants.StringBooleanType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class ChainInfoData {
    public static final int $stable = 0;
    public final String chainBWLogoUrl;
    public final String chainCustomLogo;
    public final String chainId;
    public final String chainLogo;
    public final String chainName;
    public final StringBooleanType isDefault;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, StringBooleanType.Companion.serializer(), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChainInfoData() {
        this((String) null, (String) null, (String) null, (String) null, (StringBooleanType) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChainInfoData copy$default(ChainInfoData chainInfoData, String str, String str2, String str3, String str4, StringBooleanType stringBooleanType, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chainInfoData.chainId;
        }
        if ((i & 2) != 0) {
            str2 = chainInfoData.chainName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = chainInfoData.chainLogo;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = chainInfoData.chainBWLogoUrl;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            stringBooleanType = chainInfoData.isDefault;
        }
        StringBooleanType stringBooleanType2 = stringBooleanType;
        if ((i & 32) != 0) {
            str5 = chainInfoData.chainCustomLogo;
        }
        return chainInfoData.copydefault(str, str6, str7, str8, stringBooleanType2, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StringBooleanType AYXKKw() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChainInfoData copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull StringBooleanType stringBooleanType, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(stringBooleanType, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new ChainInfoData(str, str2, str3, str4, stringBooleanType, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.chainCustomLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChainInfoData)) {
            return false;
        }
        ChainInfoData chainInfoData = (ChainInfoData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) chainInfoData.chainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) chainInfoData.chainName) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) chainInfoData.chainLogo) && Intrinsics.EZpvd((Object) this.chainBWLogoUrl, (Object) chainInfoData.chainBWLogoUrl) && this.isDefault == chainInfoData.isDefault && Intrinsics.EZpvd((Object) this.chainCustomLogo, (Object) chainInfoData.chainCustomLogo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.chainId.hashCode() * 31) + this.chainName.hashCode()) * 31) + this.chainLogo.hashCode()) * 31) + this.chainBWLogoUrl.hashCode()) * 31) + this.isDefault.hashCode()) * 31) + this.chainCustomLogo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChainInfoData(chainId=" + this.chainId + ", chainName=" + this.chainName + ", chainLogo=" + this.chainLogo + ", chainBWLogoUrl=" + this.chainBWLogoUrl + ", isDefault=" + this.isDefault + ", chainCustomLogo=" + this.chainCustomLogo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.common.ChainInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChainInfoData> serializer() {
            return ChainInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChainInfoData(int i, String str, String str2, String str3, String str4, StringBooleanType stringBooleanType, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str2;
        }
        if ((i & 4) == 0) {
            this.chainLogo = "";
        } else {
            this.chainLogo = str3;
        }
        if ((i & 8) == 0) {
            this.chainBWLogoUrl = "";
        } else {
            this.chainBWLogoUrl = str4;
        }
        if ((i & 16) == 0) {
            this.isDefault = StringBooleanType.FALSE;
        } else {
            this.isDefault = stringBooleanType;
        }
        if ((i & 32) == 0) {
            this.chainCustomLogo = "";
        } else {
            this.chainCustomLogo = str5;
        }
    }

    public static final /* synthetic */ void copydefault(ChainInfoData chainInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) chainInfoData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, chainInfoData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) chainInfoData.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, chainInfoData.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) chainInfoData.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, chainInfoData.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) chainInfoData.chainBWLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, chainInfoData.chainBWLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || chainInfoData.isDefault != StringBooleanType.FALSE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], chainInfoData.isDefault);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) chainInfoData.chainCustomLogo, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, chainInfoData.chainCustomLogo);
    }

    public ChainInfoData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull StringBooleanType stringBooleanType, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(stringBooleanType, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.chainId = str;
        this.chainName = str2;
        this.chainLogo = str3;
        this.chainBWLogoUrl = str4;
        this.isDefault = stringBooleanType;
        this.chainCustomLogo = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.StringBooleanType:0x0024: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.common.constants.StringBooleanType:0x0022: SGET  A[WRAPPED] (LINE:18) com.okinc.business.market.common.constants.StringBooleanType.FALSE com.okinc.business.market.common.constants.StringBooleanType) : (r10v0 com.okinc.business.market.common.constants.StringBooleanType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.market.data.model.common.ChainInfoData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, java.lang.String):void type: THIS */
    public /* synthetic */ ChainInfoData(String str, String str2, String str3, String str4, StringBooleanType stringBooleanType, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? StringBooleanType.FALSE : stringBooleanType, (i & 32) != 0 ? "" : str5);
    }
}
