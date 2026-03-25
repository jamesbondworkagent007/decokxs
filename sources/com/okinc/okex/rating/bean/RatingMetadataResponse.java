package com.okinc.okex.rating.bean;

import com.okinc.biz.model.RatingDisplayStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class RatingMetadataResponse {
    public static final int $stable = 0;
    private final RatingDisplayStatus status;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {RatingDisplayStatus.Companion.serializer()};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RatingMetadataResponse() {
        this((RatingDisplayStatus) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RatingMetadataResponse copy$default(RatingMetadataResponse ratingMetadataResponse, RatingDisplayStatus ratingDisplayStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            ratingDisplayStatus = ratingMetadataResponse.status;
        }
        return ratingMetadataResponse.copy(ratingDisplayStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RatingDisplayStatus component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RatingMetadataResponse copy(RatingDisplayStatus ratingDisplayStatus) {
        return new RatingMetadataResponse(ratingDisplayStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RatingMetadataResponse) && this.status == ((RatingMetadataResponse) obj).status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RatingDisplayStatus getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        RatingDisplayStatus ratingDisplayStatus = this.status;
        if (ratingDisplayStatus == null) {
            return 0;
        }
        return ratingDisplayStatus.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RatingMetadataResponse(status=" + this.status + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.rating.bean.RatingMetadataResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RatingMetadataResponse> serializer() {
            return RatingMetadataResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RatingMetadataResponse(int i, RatingDisplayStatus ratingDisplayStatus, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.status = null;
        } else {
            this.status = ratingDisplayStatus;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(RatingMetadataResponse ratingMetadataResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && ratingMetadataResponse.status == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], ratingMetadataResponse.status);
    }

    public RatingMetadataResponse(RatingDisplayStatus ratingDisplayStatus) {
        this.status = ratingDisplayStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.biz.model.RatingDisplayStatus:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.biz.model.RatingDisplayStatus) : (r1v0 com.okinc.biz.model.RatingDisplayStatus))
 A[MD:(com.okinc.biz.model.RatingDisplayStatus):void (m)] (LINE:13) call: com.okinc.okex.rating.bean.RatingMetadataResponse.<init>(com.okinc.biz.model.RatingDisplayStatus):void type: THIS */
    public /* synthetic */ RatingMetadataResponse(RatingDisplayStatus ratingDisplayStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ratingDisplayStatus);
    }
}
