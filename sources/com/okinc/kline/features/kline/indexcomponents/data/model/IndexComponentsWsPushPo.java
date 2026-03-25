package com.okinc.kline.features.kline.indexcomponents.data.model;

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

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class IndexComponentsWsPushPo {
    private final List<IndexComponentsResp> data;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(IndexComponentsResp$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IndexComponentsWsPushPo() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponentsWsPushPo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IndexComponentsWsPushPo copy$default(IndexComponentsWsPushPo indexComponentsWsPushPo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = indexComponentsWsPushPo.data;
        }
        return indexComponentsWsPushPo.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<IndexComponentsResp> component1() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IndexComponentsWsPushPo copy(@NotNull List<IndexComponentsResp> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new IndexComponentsWsPushPo(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IndexComponentsWsPushPo) && Intrinsics.EZpvd(this.data, ((IndexComponentsWsPushPo) obj).data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<IndexComponentsResp> getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.data.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IndexComponentsWsPushPo(data=" + this.data + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponentsWsPushPo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IndexComponentsWsPushPo> serializer() {
            return IndexComponentsWsPushPo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IndexComponentsWsPushPo(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.data = yDY.AhwBna();
        } else {
            this.data = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(IndexComponentsWsPushPo indexComponentsWsPushPo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(indexComponentsWsPushPo.data, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], indexComponentsWsPushPo.data);
    }

    public IndexComponentsWsPushPo(@NotNull List<IndexComponentsResp> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.data = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:28)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponentsResp>):void (m)] (LINE:27) call: com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponentsWsPushPo.<init>(java.util.List):void type: THIS */
    public /* synthetic */ IndexComponentsWsPushPo(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
