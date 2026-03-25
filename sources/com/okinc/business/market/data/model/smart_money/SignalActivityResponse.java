package com.okinc.business.market.data.model.smart_money;

import com.okinc.business.market.data.model.common.TokenInfo;
import com.okinc.business.market.data.model.common.TokenInfo$$serializer;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56424yEw;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class SignalActivityResponse {
    public final boolean hasNext;
    public final List<SignalData> items;
    public final Map<String, TokenInfo> tokenInfoMap;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SignalData$$serializer.INSTANCE), null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, TokenInfo$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalActivityResponse() {
        this((List) null, false, (Map) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.smart_money.SignalActivityResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalActivityResponse copy$default(SignalActivityResponse signalActivityResponse, List list, boolean z, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = signalActivityResponse.items;
        }
        if ((i & 2) != 0) {
            z = signalActivityResponse.hasNext;
        }
        if ((i & 4) != 0) {
            map = signalActivityResponse.tokenInfoMap;
        }
        return signalActivityResponse.KWHzl(list, z, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, TokenInfo> AEQbTJ() {
        return this.tokenInfoMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.hasNext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalActivityResponse KWHzl(@NotNull List<SignalData> list, boolean z, @NotNull Map<String, TokenInfo> map) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new SignalActivityResponse(list, z, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignalData> OLrzqt() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalActivityResponse)) {
            return false;
        }
        SignalActivityResponse signalActivityResponse = (SignalActivityResponse) obj;
        return Intrinsics.EZpvd(this.items, signalActivityResponse.items) && this.hasNext == signalActivityResponse.hasNext && Intrinsics.EZpvd(this.tokenInfoMap, signalActivityResponse.tokenInfoMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.items.hashCode() * 31) + Boolean.hashCode(this.hasNext)) * 31) + this.tokenInfoMap.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalActivityResponse(items=" + this.items + ", hasNext=" + this.hasNext + ", tokenInfoMap=" + this.tokenInfoMap + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.smart_money.SignalActivityResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalActivityResponse> serializer() {
            return SignalActivityResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalActivityResponse(int i, List list, boolean z, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        this.items = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.hasNext = false;
        } else {
            this.hasNext = z;
        }
        if ((i & 4) == 0) {
            this.tokenInfoMap = C56424yEw.KWHzl();
        } else {
            this.tokenInfoMap = map;
        }
    }

    public static final /* synthetic */ void EZpvd(SignalActivityResponse signalActivityResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(signalActivityResponse.items, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], signalActivityResponse.items);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || signalActivityResponse.hasNext) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, signalActivityResponse.hasNext);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(signalActivityResponse.tokenInfoMap, C56424yEw.KWHzl())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], signalActivityResponse.tokenInfoMap);
    }

    public SignalActivityResponse(@NotNull List<SignalData> list, boolean z, @NotNull Map<String, TokenInfo> map) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.items = list;
        this.hasNext = z;
        this.tokenInfoMap = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:10)) : (r1v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x000d: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0011: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:14)) : (r3v0 java.util.Map))
 A[MD:(java.util.List<com.okinc.business.market.data.model.smart_money.SignalData>, boolean, java.util.Map<java.lang.String, com.okinc.business.market.data.model.common.TokenInfo>):void (m)] (LINE:8) call: com.okinc.business.market.data.model.smart_money.SignalActivityResponse.<init>(java.util.List, boolean, java.util.Map):void type: THIS */
    public /* synthetic */ SignalActivityResponse(List list, boolean z, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? C56424yEw.KWHzl() : map);
    }
}
