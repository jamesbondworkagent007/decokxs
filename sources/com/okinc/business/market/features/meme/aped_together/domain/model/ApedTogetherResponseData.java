package com.okinc.business.market.features.meme.aped_together.domain.model;

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
public final class ApedTogetherResponseData {
    private final List<ApedTogetherData> holderRankingList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(ApedTogetherData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ApedTogetherResponseData() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.meme.aped_together.domain.model.ApedTogetherResponseData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApedTogetherResponseData copy$default(ApedTogetherResponseData apedTogetherResponseData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = apedTogetherResponseData.holderRankingList;
        }
        return apedTogetherResponseData.copy(list);
    }

    @SerialName("holderRankingList")
    public static /* synthetic */ void getHolderRankingList$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ApedTogetherData> component1() {
        return this.holderRankingList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApedTogetherResponseData copy(@NotNull List<ApedTogetherData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ApedTogetherResponseData(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApedTogetherResponseData) && Intrinsics.EZpvd(this.holderRankingList, ((ApedTogetherResponseData) obj).holderRankingList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ApedTogetherData> getHolderRankingList() {
        return this.holderRankingList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.holderRankingList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ApedTogetherResponseData(holderRankingList=" + this.holderRankingList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.aped_together.domain.model.ApedTogetherResponseData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ApedTogetherResponseData> serializer() {
            return ApedTogetherResponseData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ApedTogetherResponseData(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.holderRankingList = yDY.AhwBna();
        } else {
            this.holderRankingList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(ApedTogetherResponseData apedTogetherResponseData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(apedTogetherResponseData.holderRankingList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], apedTogetherResponseData.holderRankingList);
    }

    public ApedTogetherResponseData(@NotNull List<ApedTogetherData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.holderRankingList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:31)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.market.features.meme.aped_together.domain.model.ApedTogetherData>):void (m)] (LINE:29) call: com.okinc.business.market.features.meme.aped_together.domain.model.ApedTogetherResponseData.<init>(java.util.List):void type: THIS */
    public /* synthetic */ ApedTogetherResponseData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
