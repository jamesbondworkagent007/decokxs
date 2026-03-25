package com.okinc.business.market.data.model;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class DexJwtData {
    public final Map<String, AddressLoginResponse> items;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new LinkedHashMapSerializer(StringSerializer.INSTANCE, AddressLoginResponse$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexJwtData() {
        this((Map) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.DexJwtData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DexJwtData copy$default(DexJwtData dexJwtData, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = dexJwtData.items;
        }
        return dexJwtData.copydefault(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, AddressLoginResponse> EZpvd() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexJwtData copydefault(@NotNull Map<String, AddressLoginResponse> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return new DexJwtData(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DexJwtData) && Intrinsics.EZpvd(this.items, ((DexJwtData) obj).items);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.items.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexJwtData(items=" + this.items + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.DexJwtData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexJwtData> serializer() {
            return DexJwtData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexJwtData(int i, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.items = C56424yEw.KWHzl();
        } else {
            this.items = map;
        }
    }

    public static final /* synthetic */ void EZpvd(DexJwtData dexJwtData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(dexJwtData.items, C56424yEw.KWHzl())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], dexJwtData.items);
    }

    public DexJwtData(@NotNull Map<String, AddressLoginResponse> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.items = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0004: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:9)) : (r1v0 java.util.Map))
 A[MD:(java.util.Map<java.lang.String, com.okinc.business.market.data.model.AddressLoginResponse>):void (m)] (LINE:7) call: com.okinc.business.market.data.model.DexJwtData.<init>(java.util.Map):void type: THIS */
    public /* synthetic */ DexJwtData(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C56424yEw.KWHzl() : map);
    }
}
