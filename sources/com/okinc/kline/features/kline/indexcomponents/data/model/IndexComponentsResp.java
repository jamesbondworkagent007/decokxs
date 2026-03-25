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
public final class IndexComponentsResp {
    private final List<IndexComponent> components;
    private final String index;
    private final String last;
    private final String ts;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(IndexComponent$$serializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IndexComponentsResp() {
        this((List) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponentsResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IndexComponentsResp copy$default(IndexComponentsResp indexComponentsResp, List list, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = indexComponentsResp.components;
        }
        if ((i & 2) != 0) {
            str = indexComponentsResp.last;
        }
        if ((i & 4) != 0) {
            str2 = indexComponentsResp.index;
        }
        if ((i & 8) != 0) {
            str3 = indexComponentsResp.ts;
        }
        return indexComponentsResp.copy(list, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<IndexComponent> component1() {
        return this.components;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IndexComponentsResp copy(@NotNull List<IndexComponent> list, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new IndexComponentsResp(list, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexComponentsResp)) {
            return false;
        }
        IndexComponentsResp indexComponentsResp = (IndexComponentsResp) obj;
        return Intrinsics.EZpvd(this.components, indexComponentsResp.components) && Intrinsics.EZpvd((Object) this.last, (Object) indexComponentsResp.last) && Intrinsics.EZpvd((Object) this.index, (Object) indexComponentsResp.index) && Intrinsics.EZpvd((Object) this.ts, (Object) indexComponentsResp.ts);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<IndexComponent> getComponents() {
        return this.components;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLast() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.components.hashCode() * 31) + this.last.hashCode()) * 31) + this.index.hashCode()) * 31) + this.ts.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IndexComponentsResp(components=" + this.components + ", last=" + this.last + ", index=" + this.index + ", ts=" + this.ts + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponentsResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IndexComponentsResp> serializer() {
            return IndexComponentsResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IndexComponentsResp(int i, List list, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.components = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.last = "";
        } else {
            this.last = str;
        }
        if ((i & 4) == 0) {
            this.index = "";
        } else {
            this.index = str2;
        }
        if ((i & 8) == 0) {
            this.ts = "";
        } else {
            this.ts = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(IndexComponentsResp indexComponentsResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(indexComponentsResp.components, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], indexComponentsResp.components);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) indexComponentsResp.last, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, indexComponentsResp.last);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) indexComponentsResp.index, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, indexComponentsResp.index);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) indexComponentsResp.ts, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, indexComponentsResp.ts);
    }

    public IndexComponentsResp(@NotNull List<IndexComponent> list, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.components = list;
        this.last = str;
        this.index = str2;
        this.ts = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:9)) : (r2v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponent>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponentsResp.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ IndexComponentsResp(List list, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
