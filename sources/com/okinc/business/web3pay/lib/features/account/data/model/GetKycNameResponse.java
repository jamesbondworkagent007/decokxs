package com.okinc.business.web3pay.lib.features.account.data.model;

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
public final class GetKycNameResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final KycNameAndUid receiver;
    private final boolean receiverHasSA;
    private final KycNameAndUid sender;
    private final boolean userSelf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetKycNameResponse copy$default(GetKycNameResponse getKycNameResponse, boolean z, KycNameAndUid kycNameAndUid, KycNameAndUid kycNameAndUid2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getKycNameResponse.userSelf;
        }
        if ((i & 2) != 0) {
            kycNameAndUid = getKycNameResponse.sender;
        }
        if ((i & 4) != 0) {
            kycNameAndUid2 = getKycNameResponse.receiver;
        }
        if ((i & 8) != 0) {
            z2 = getKycNameResponse.receiverHasSA;
        }
        return getKycNameResponse.copy(z, kycNameAndUid, kycNameAndUid2, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.userSelf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KycNameAndUid component2() {
        return this.sender;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KycNameAndUid component3() {
        return this.receiver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.receiverHasSA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetKycNameResponse copy(boolean z, @NotNull KycNameAndUid kycNameAndUid, KycNameAndUid kycNameAndUid2, boolean z2) {
        Intrinsics.checkNotNullParameter(kycNameAndUid, "");
        return new GetKycNameResponse(z, kycNameAndUid, kycNameAndUid2, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetKycNameResponse)) {
            return false;
        }
        GetKycNameResponse getKycNameResponse = (GetKycNameResponse) obj;
        return this.userSelf == getKycNameResponse.userSelf && Intrinsics.EZpvd(this.sender, getKycNameResponse.sender) && Intrinsics.EZpvd(this.receiver, getKycNameResponse.receiver) && this.receiverHasSA == getKycNameResponse.receiverHasSA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KycNameAndUid getReceiver() {
        return this.receiver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getReceiverHasSA() {
        return this.receiverHasSA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KycNameAndUid getSender() {
        return this.sender;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUserSelf() {
        return this.userSelf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.userSelf);
        int iHashCode2 = this.sender.hashCode();
        KycNameAndUid kycNameAndUid = this.receiver;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (kycNameAndUid == null ? 0 : kycNameAndUid.hashCode())) * 31) + Boolean.hashCode(this.receiverHasSA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetKycNameResponse(userSelf=" + this.userSelf + ", sender=" + this.sender + ", receiver=" + this.receiver + ", receiverHasSA=" + this.receiverHasSA + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.account.data.model.GetKycNameResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetKycNameResponse> serializer() {
            return GetKycNameResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetKycNameResponse(int i, boolean z, KycNameAndUid kycNameAndUid, KycNameAndUid kycNameAndUid2, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, GetKycNameResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.userSelf = z;
        this.sender = kycNameAndUid;
        this.receiver = kycNameAndUid2;
        this.receiverHasSA = z2;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(GetKycNameResponse getKycNameResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, getKycNameResponse.userSelf);
        KycNameAndUid$$serializer kycNameAndUid$$serializer = KycNameAndUid$$serializer.INSTANCE;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kycNameAndUid$$serializer, getKycNameResponse.sender);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kycNameAndUid$$serializer, getKycNameResponse.receiver);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, getKycNameResponse.receiverHasSA);
    }

    public GetKycNameResponse(boolean z, @NotNull KycNameAndUid kycNameAndUid, KycNameAndUid kycNameAndUid2, boolean z2) {
        Intrinsics.checkNotNullParameter(kycNameAndUid, "");
        this.userSelf = z;
        this.sender = kycNameAndUid;
        this.receiver = kycNameAndUid2;
        this.receiverHasSA = z2;
    }
}
