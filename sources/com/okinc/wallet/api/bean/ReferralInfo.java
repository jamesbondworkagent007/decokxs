package com.okinc.wallet.api.bean;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class ReferralInfo {
    private static final KSerializer<Object>[] $childSerializers;
    private final int codeType;
    private final Map<String, String> inviterAddressMap;
    private final boolean ipAllowed;
    private final String referralAddress;
    private final String referralCode;
    private final String version;
    private final String walletType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.wallet.api.bean.ReferralInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReferralInfo copy$default(ReferralInfo referralInfo, String str, String str2, String str3, String str4, boolean z, int i, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = referralInfo.referralCode;
        }
        if ((i2 & 2) != 0) {
            str2 = referralInfo.referralAddress;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = referralInfo.walletType;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = referralInfo.version;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            z = referralInfo.ipAllowed;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            i = referralInfo.codeType;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            map = referralInfo.inviterAddressMap;
        }
        return referralInfo.copy(str, str5, str6, str7, z2, i3, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.referralCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.referralAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.ipAllowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.codeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component7() {
        return this.inviterAddressMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReferralInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, int i, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new ReferralInfo(str, str2, str3, str4, z, i, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferralInfo)) {
            return false;
        }
        ReferralInfo referralInfo = (ReferralInfo) obj;
        return Intrinsics.EZpvd((Object) this.referralCode, (Object) referralInfo.referralCode) && Intrinsics.EZpvd((Object) this.referralAddress, (Object) referralInfo.referralAddress) && Intrinsics.EZpvd((Object) this.walletType, (Object) referralInfo.walletType) && Intrinsics.EZpvd((Object) this.version, (Object) referralInfo.version) && this.ipAllowed == referralInfo.ipAllowed && this.codeType == referralInfo.codeType && Intrinsics.EZpvd(this.inviterAddressMap, referralInfo.inviterAddressMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCodeType() {
        return this.codeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getInviterAddressMap() {
        return this.inviterAddressMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getIpAllowed() {
        return this.ipAllowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferralAddress() {
        return this.referralAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferralCode() {
        return this.referralCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletType() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.referralCode.hashCode() * 31) + this.referralAddress.hashCode()) * 31) + this.walletType.hashCode()) * 31) + this.version.hashCode()) * 31) + Boolean.hashCode(this.ipAllowed)) * 31) + Integer.hashCode(this.codeType)) * 31) + this.inviterAddressMap.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReferralInfo(referralCode=" + this.referralCode + ", referralAddress=" + this.referralAddress + ", walletType=" + this.walletType + ", version=" + this.version + ", ipAllowed=" + this.ipAllowed + ", codeType=" + this.codeType + ", inviterAddressMap=" + this.inviterAddressMap + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.api.bean.ReferralInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReferralInfo> serializer() {
            return ReferralInfo$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, new LinkedHashMapSerializer(stringSerializer, stringSerializer)};
    }

    public /* synthetic */ ReferralInfo(int i, String str, String str2, String str3, String str4, boolean z, int i2, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (111 != (i & WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY)) {
            PluginExceptionsKt.throwMissingFieldException(i, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, ReferralInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.referralCode = str;
        this.referralAddress = str2;
        this.walletType = str3;
        this.version = str4;
        if ((i & 16) == 0) {
            this.ipAllowed = true;
        } else {
            this.ipAllowed = z;
        }
        this.codeType = i2;
        this.inviterAddressMap = map;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(ReferralInfo referralInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, referralInfo.referralCode);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, referralInfo.referralAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, referralInfo.walletType);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, referralInfo.version);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !referralInfo.ipAllowed) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, referralInfo.ipAllowed);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 5, referralInfo.codeType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], referralInfo.inviterAddressMap);
    }

    public ReferralInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, int i, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.referralCode = str;
        this.referralAddress = str2;
        this.walletType = str3;
        this.version = str4;
        this.ipAllowed = z;
        this.codeType = i;
        this.inviterAddressMap = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r14v0 boolean))
  (r15v0 int)
  (r16v0 java.util.Map)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:8) call: com.okinc.wallet.api.bean.ReferralInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.util.Map):void type: THIS */
    public /* synthetic */ ReferralInfo(String str, String str2, String str3, String str4, boolean z, int i, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i2 & 16) != 0 ? true : z, i, map);
    }
}
