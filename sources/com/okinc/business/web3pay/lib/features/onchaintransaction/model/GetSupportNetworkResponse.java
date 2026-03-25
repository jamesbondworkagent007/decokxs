package com.okinc.business.web3pay.lib.features.onchaintransaction.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class GetSupportNetworkResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainIndex;
    private final String chainLogo;
    private final String chainName;
    private final int chainType;
    private final MaintenanceInfo underMaintenance;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetSupportNetworkResponse copy$default(GetSupportNetworkResponse getSupportNetworkResponse, String str, String str2, String str3, int i, MaintenanceInfo maintenanceInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getSupportNetworkResponse.chainIndex;
        }
        if ((i2 & 2) != 0) {
            str2 = getSupportNetworkResponse.chainName;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = getSupportNetworkResponse.chainLogo;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            i = getSupportNetworkResponse.chainType;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            maintenanceInfo = getSupportNetworkResponse.underMaintenance;
        }
        return getSupportNetworkResponse.copy(str, str4, str5, i3, maintenanceInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.chainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MaintenanceInfo component5() {
        return this.underMaintenance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetSupportNetworkResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, MaintenanceInfo maintenanceInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new GetSupportNetworkResponse(str, str2, str3, i, maintenanceInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSupportNetworkResponse)) {
            return false;
        }
        GetSupportNetworkResponse getSupportNetworkResponse = (GetSupportNetworkResponse) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) getSupportNetworkResponse.chainIndex) && Intrinsics.EZpvd((Object) this.chainName, (Object) getSupportNetworkResponse.chainName) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) getSupportNetworkResponse.chainLogo) && this.chainType == getSupportNetworkResponse.chainType && Intrinsics.EZpvd(this.underMaintenance, getSupportNetworkResponse.underMaintenance);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChainType() {
        return this.chainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MaintenanceInfo getUnderMaintenance() {
        return this.underMaintenance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainIndex.hashCode();
        int iHashCode2 = this.chainName.hashCode();
        int iHashCode3 = this.chainLogo.hashCode();
        int iHashCode4 = Integer.hashCode(this.chainType);
        MaintenanceInfo maintenanceInfo = this.underMaintenance;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (maintenanceInfo == null ? 0 : maintenanceInfo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetSupportNetworkResponse(chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", chainLogo=" + this.chainLogo + ", chainType=" + this.chainType + ", underMaintenance=" + this.underMaintenance + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.onchaintransaction.model.GetSupportNetworkResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetSupportNetworkResponse> serializer() {
            return GetSupportNetworkResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetSupportNetworkResponse(int i, String str, String str2, String str3, int i2, MaintenanceInfo maintenanceInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, GetSupportNetworkResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = str;
        this.chainName = str2;
        this.chainLogo = str3;
        this.chainType = i2;
        if ((i & 16) == 0) {
            this.underMaintenance = null;
        } else {
            this.underMaintenance = maintenanceInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(GetSupportNetworkResponse getSupportNetworkResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, getSupportNetworkResponse.chainIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, getSupportNetworkResponse.chainName);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, getSupportNetworkResponse.chainLogo);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, getSupportNetworkResponse.chainType);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && getSupportNetworkResponse.underMaintenance == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, MaintenanceInfo$$serializer.INSTANCE, getSupportNetworkResponse.underMaintenance);
    }

    public GetSupportNetworkResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, MaintenanceInfo maintenanceInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.chainIndex = str;
        this.chainName = str2;
        this.chainLogo = str3;
        this.chainType = i;
        this.underMaintenance = maintenanceInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 int)
  (wrap:com.okinc.business.web3pay.lib.features.onchaintransaction.model.MaintenanceInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.features.onchaintransaction.model.MaintenanceInfo) : (r11v0 com.okinc.business.web3pay.lib.features.onchaintransaction.model.MaintenanceInfo))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, com.okinc.business.web3pay.lib.features.onchaintransaction.model.MaintenanceInfo):void (m)] (LINE:8) call: com.okinc.business.web3pay.lib.features.onchaintransaction.model.GetSupportNetworkResponse.<init>(java.lang.String, java.lang.String, java.lang.String, int, com.okinc.business.web3pay.lib.features.onchaintransaction.model.MaintenanceInfo):void type: THIS */
    public /* synthetic */ GetSupportNetworkResponse(String str, String str2, String str3, int i, MaintenanceInfo maintenanceInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i, (i2 & 16) != 0 ? null : maintenanceInfo);
    }
}
