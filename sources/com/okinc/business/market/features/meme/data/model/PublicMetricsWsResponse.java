package com.okinc.business.market.features.meme.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class PublicMetricsWsResponse {
    private final List<PublicMetricsWsData> detailVOS;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(PublicMetricsWsData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PublicMetricsWsResponse() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.meme.data.model.PublicMetricsWsResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PublicMetricsWsResponse copy$default(PublicMetricsWsResponse publicMetricsWsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = publicMetricsWsResponse.detailVOS;
        }
        return publicMetricsWsResponse.copy(list);
    }

    @SerialName("detailVOS")
    public static /* synthetic */ void getDetailVOS$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PublicMetricsWsData> component1() {
        return this.detailVOS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PublicMetricsWsResponse copy(@NotNull List<PublicMetricsWsData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new PublicMetricsWsResponse(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PublicMetricsWsResponse) && Intrinsics.EZpvd(this.detailVOS, ((PublicMetricsWsResponse) obj).detailVOS);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PublicMetricsWsData> getDetailVOS() {
        return this.detailVOS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.detailVOS.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PublicMetricsWsResponse(detailVOS=" + this.detailVOS + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.data.model.PublicMetricsWsResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PublicMetricsWsResponse> serializer() {
            return PublicMetricsWsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PublicMetricsWsResponse(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.detailVOS = yDY.AhwBna();
        } else {
            this.detailVOS = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(PublicMetricsWsResponse publicMetricsWsResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(publicMetricsWsResponse.detailVOS, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], publicMetricsWsResponse.detailVOS);
    }

    public PublicMetricsWsResponse(@NotNull List<PublicMetricsWsData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.detailVOS = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.market.features.meme.data.model.PublicMetricsWsData>):void (m)] (LINE:9) call: com.okinc.business.market.features.meme.data.model.PublicMetricsWsResponse.<init>(java.util.List):void type: THIS */
    public /* synthetic */ PublicMetricsWsResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
