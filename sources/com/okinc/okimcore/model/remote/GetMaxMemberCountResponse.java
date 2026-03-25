package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GetMaxMemberCountResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Long maxMemberCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetMaxMemberCountResponse() {
        this((Long) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetMaxMemberCountResponse copy$default(GetMaxMemberCountResponse getMaxMemberCountResponse, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = getMaxMemberCountResponse.maxMemberCount;
        }
        return getMaxMemberCountResponse.copy(l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.maxMemberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetMaxMemberCountResponse copy(Long l) {
        return new GetMaxMemberCountResponse(l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetMaxMemberCountResponse) && Intrinsics.EZpvd(this.maxMemberCount, ((GetMaxMemberCountResponse) obj).maxMemberCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getMaxMemberCount() {
        return this.maxMemberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.maxMemberCount;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetMaxMemberCountResponse(maxMemberCount=" + this.maxMemberCount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GetMaxMemberCountResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetMaxMemberCountResponse> serializer() {
            return GetMaxMemberCountResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetMaxMemberCountResponse(int i, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.maxMemberCount = null;
        } else {
            this.maxMemberCount = l;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GetMaxMemberCountResponse getMaxMemberCountResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && getMaxMemberCountResponse.maxMemberCount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, getMaxMemberCountResponse.maxMemberCount);
    }

    public GetMaxMemberCountResponse(Long l) {
        this.maxMemberCount = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r1v0 java.lang.Long))
 A[MD:(java.lang.Long):void (m)] (LINE:8) call: com.okinc.okimcore.model.remote.GetMaxMemberCountResponse.<init>(java.lang.Long):void type: THIS */
    public /* synthetic */ GetMaxMemberCountResponse(Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l);
    }
}
