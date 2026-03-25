package com.okinc.business.market.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class StarkNetSignTypeListData {
    public static final KSerializer<Object>[] $childSerializers;
    public final List<StarkNetSignTypeData> domain;
    public final List<StarkNetSignTypeData> message;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StarkNetSignTypeListData() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.StarkNetSignTypeListData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StarkNetSignTypeListData copy$default(StarkNetSignTypeListData starkNetSignTypeListData, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = starkNetSignTypeListData.message;
        }
        if ((i & 2) != 0) {
            list2 = starkNetSignTypeListData.domain;
        }
        return starkNetSignTypeListData.EZpvd(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StarkNetSignTypeListData EZpvd(@NotNull List<StarkNetSignTypeData> list, @NotNull List<StarkNetSignTypeData> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new StarkNetSignTypeListData(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StarkNetSignTypeListData)) {
            return false;
        }
        StarkNetSignTypeListData starkNetSignTypeListData = (StarkNetSignTypeListData) obj;
        return Intrinsics.EZpvd(this.message, starkNetSignTypeListData.message) && Intrinsics.EZpvd(this.domain, starkNetSignTypeListData.domain);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.message.hashCode() * 31) + this.domain.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StarkNetSignTypeListData(message=" + this.message + ", domain=" + this.domain + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.StarkNetSignTypeListData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StarkNetSignTypeListData> serializer() {
            return StarkNetSignTypeListData$$serializer.INSTANCE;
        }
    }

    static {
        StarkNetSignTypeData$$serializer starkNetSignTypeData$$serializer = StarkNetSignTypeData$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(starkNetSignTypeData$$serializer), new ArrayListSerializer(starkNetSignTypeData$$serializer)};
    }

    public /* synthetic */ StarkNetSignTypeListData(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.message = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.domain = yDY.AhwBna();
        } else {
            this.domain = list2;
        }
    }

    public static final /* synthetic */ void OLrzqt(StarkNetSignTypeListData starkNetSignTypeListData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(starkNetSignTypeListData.message, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], starkNetSignTypeListData.message);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(starkNetSignTypeListData.domain, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], starkNetSignTypeListData.domain);
    }

    public StarkNetSignTypeListData(@NotNull List<StarkNetSignTypeData> list, @NotNull List<StarkNetSignTypeData> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.message = list;
        this.domain = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:39)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:41)) : (r2v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.market.data.model.StarkNetSignTypeData>, java.util.List<com.okinc.business.market.data.model.StarkNetSignTypeData>):void (m)] (LINE:37) call: com.okinc.business.market.data.model.StarkNetSignTypeListData.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ StarkNetSignTypeListData(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2);
    }
}
