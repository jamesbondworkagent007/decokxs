package com.okinc.ok_kyc_core.data.remote.networkmodel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class CardSyncResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String FAILED = "FAILED";
    public static final String PENDING = "PENDING";
    public static final String SUCCEEDED = "SUCCEEDED";
    private final String backImageUrl;
    private final String frontImageUrl;
    private final String status;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CardSyncResponse copy$default(CardSyncResponse cardSyncResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardSyncResponse.status;
        }
        if ((i & 2) != 0) {
            str2 = cardSyncResponse.frontImageUrl;
        }
        if ((i & 4) != 0) {
            str3 = cardSyncResponse.backImageUrl;
        }
        return cardSyncResponse.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.frontImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.backImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardSyncResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CardSyncResponse(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardSyncResponse)) {
            return false;
        }
        CardSyncResponse cardSyncResponse = (CardSyncResponse) obj;
        return Intrinsics.EZpvd((Object) this.status, (Object) cardSyncResponse.status) && Intrinsics.EZpvd((Object) this.frontImageUrl, (Object) cardSyncResponse.frontImageUrl) && Intrinsics.EZpvd((Object) this.backImageUrl, (Object) cardSyncResponse.backImageUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBackImageUrl() {
        return this.backImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrontImageUrl() {
        return this.frontImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.status.hashCode() * 31) + this.frontImageUrl.hashCode()) * 31) + this.backImageUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardSyncResponse(status=" + this.status + ", frontImageUrl=" + this.frontImageUrl + ", backImageUrl=" + this.backImageUrl + ")";
    }

    public /* synthetic */ CardSyncResponse(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, CardSyncResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.status = str;
        this.frontImageUrl = str2;
        this.backImageUrl = str3;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CardSyncResponse cardSyncResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, cardSyncResponse.status);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, cardSyncResponse.frontImageUrl);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, cardSyncResponse.backImageUrl);
    }

    public CardSyncResponse(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.status = str;
        this.frontImageUrl = str2;
        this.backImageUrl = str3;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CardSyncResponse> serializer() {
            return CardSyncResponse$$serializer.INSTANCE;
        }
    }
}
