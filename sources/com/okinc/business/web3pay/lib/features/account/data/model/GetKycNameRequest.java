package com.okinc.business.web3pay.lib.features.account.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class GetKycNameRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String areaCode;
    private final String contactType;
    private final String contactValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetKycNameRequest copy$default(GetKycNameRequest getKycNameRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getKycNameRequest.contactType;
        }
        if ((i & 2) != 0) {
            str2 = getKycNameRequest.contactValue;
        }
        if ((i & 4) != 0) {
            str3 = getKycNameRequest.areaCode;
        }
        return getKycNameRequest.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.contactType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.contactValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetKycNameRequest copy(@NotNull String str, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new GetKycNameRequest(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetKycNameRequest)) {
            return false;
        }
        GetKycNameRequest getKycNameRequest = (GetKycNameRequest) obj;
        return Intrinsics.EZpvd((Object) this.contactType, (Object) getKycNameRequest.contactType) && Intrinsics.EZpvd((Object) this.contactValue, (Object) getKycNameRequest.contactValue) && Intrinsics.EZpvd((Object) this.areaCode, (Object) getKycNameRequest.areaCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAreaCode() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContactType() {
        return this.contactType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContactValue() {
        return this.contactValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.contactType.hashCode();
        int iHashCode2 = this.contactValue.hashCode();
        String str = this.areaCode;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetKycNameRequest(contactType=" + this.contactType + ", contactValue=" + this.contactValue + ", areaCode=" + this.areaCode + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.account.data.model.GetKycNameRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetKycNameRequest> serializer() {
            return GetKycNameRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetKycNameRequest(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, GetKycNameRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.contactType = str;
        this.contactValue = str2;
        this.areaCode = str3;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(GetKycNameRequest getKycNameRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, getKycNameRequest.contactType);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, getKycNameRequest.contactValue);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, getKycNameRequest.areaCode);
    }

    public GetKycNameRequest(@NotNull String str, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.contactType = str;
        this.contactValue = str2;
        this.areaCode = str3;
    }
}
