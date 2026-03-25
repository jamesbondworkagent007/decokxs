package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.okinc.ok_kyc_core.data.eop.VendorConfig;
import com.okinc.ok_kyc_core.data.eop.VendorConfig$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class CreateSessionIdResponse {
    private final String cardCheckType;
    private final String cardSessionId;
    private final VendorConfig config;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CreateSessionIdResponse() {
        this((String) null, (String) null, (VendorConfig) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CreateSessionIdResponse copy$default(CreateSessionIdResponse createSessionIdResponse, String str, String str2, VendorConfig vendorConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createSessionIdResponse.cardSessionId;
        }
        if ((i & 2) != 0) {
            str2 = createSessionIdResponse.cardCheckType;
        }
        if ((i & 4) != 0) {
            vendorConfig = createSessionIdResponse.config;
        }
        return createSessionIdResponse.copy(str, str2, vendorConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.cardSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.cardCheckType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VendorConfig component3() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateSessionIdResponse copy(@NotNull String str, @NotNull String str2, VendorConfig vendorConfig) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CreateSessionIdResponse(str, str2, vendorConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateSessionIdResponse)) {
            return false;
        }
        CreateSessionIdResponse createSessionIdResponse = (CreateSessionIdResponse) obj;
        return Intrinsics.EZpvd((Object) this.cardSessionId, (Object) createSessionIdResponse.cardSessionId) && Intrinsics.EZpvd((Object) this.cardCheckType, (Object) createSessionIdResponse.cardCheckType) && Intrinsics.EZpvd(this.config, createSessionIdResponse.config);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCardCheckType() {
        return this.cardCheckType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCardSessionId() {
        return this.cardSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VendorConfig getConfig() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.cardSessionId.hashCode();
        int iHashCode2 = this.cardCheckType.hashCode();
        VendorConfig vendorConfig = this.config;
        return (((iHashCode * 31) + iHashCode2) * 31) + (vendorConfig == null ? 0 : vendorConfig.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateSessionIdResponse(cardSessionId=" + this.cardSessionId + ", cardCheckType=" + this.cardCheckType + ", config=" + this.config + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CreateSessionIdResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateSessionIdResponse> serializer() {
            return CreateSessionIdResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateSessionIdResponse(int i, String str, String str2, VendorConfig vendorConfig, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.cardSessionId = "";
        } else {
            this.cardSessionId = str;
        }
        if ((i & 2) == 0) {
            this.cardCheckType = "";
        } else {
            this.cardCheckType = str2;
        }
        if ((i & 4) == 0) {
            this.config = null;
        } else {
            this.config = vendorConfig;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CreateSessionIdResponse createSessionIdResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) createSessionIdResponse.cardSessionId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, createSessionIdResponse.cardSessionId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) createSessionIdResponse.cardCheckType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, createSessionIdResponse.cardCheckType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && createSessionIdResponse.config == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, VendorConfig$$serializer.INSTANCE, createSessionIdResponse.config);
    }

    public CreateSessionIdResponse(@NotNull String str, @NotNull String str2, VendorConfig vendorConfig) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.cardSessionId = str;
        this.cardCheckType = str2;
        this.config = vendorConfig;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.eop.VendorConfig:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.eop.VendorConfig) : (r4v0 com.okinc.ok_kyc_core.data.eop.VendorConfig))
 A[MD:(java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.eop.VendorConfig):void (m)] (LINE:9) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CreateSessionIdResponse.<init>(java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.eop.VendorConfig):void type: THIS */
    public /* synthetic */ CreateSessionIdResponse(String str, String str2, VendorConfig vendorConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : vendorConfig);
    }
}
