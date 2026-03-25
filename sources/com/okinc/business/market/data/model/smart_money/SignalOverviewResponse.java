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
public final class SignalOverviewResponse {
    public final boolean hasNext;
    public final List<SignalOverview> items;
    public final String paginationEventTime;
    public final Map<String, TokenInfo> tokenInfoMap;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SignalOverview$$serializer.INSTANCE), null, null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, TokenInfo$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalOverviewResponse() {
        this((List) null, false, (String) null, (Map) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.smart_money.SignalOverviewResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalOverviewResponse copy$default(SignalOverviewResponse signalOverviewResponse, List list, boolean z, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = signalOverviewResponse.items;
        }
        if ((i & 2) != 0) {
            z = signalOverviewResponse.hasNext;
        }
        if ((i & 4) != 0) {
            str = signalOverviewResponse.paginationEventTime;
        }
        if ((i & 8) != 0) {
            map = signalOverviewResponse.tokenInfoMap;
        }
        return signalOverviewResponse.OLrzqt(list, z, str, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignalOverview> AEQbTJ() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.hasNext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, TokenInfo> KWHzl() {
        return this.tokenInfoMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalOverviewResponse OLrzqt(@NotNull List<SignalOverview> list, boolean z, @NotNull String str, @NotNull Map<String, TokenInfo> map) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new SignalOverviewResponse(list, z, str, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalOverviewResponse)) {
            return false;
        }
        SignalOverviewResponse signalOverviewResponse = (SignalOverviewResponse) obj;
        return Intrinsics.EZpvd(this.items, signalOverviewResponse.items) && this.hasNext == signalOverviewResponse.hasNext && Intrinsics.EZpvd((Object) this.paginationEventTime, (Object) signalOverviewResponse.paginationEventTime) && Intrinsics.EZpvd(this.tokenInfoMap, signalOverviewResponse.tokenInfoMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.items.hashCode() * 31) + Boolean.hashCode(this.hasNext)) * 31) + this.paginationEventTime.hashCode()) * 31) + this.tokenInfoMap.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalOverviewResponse(items=" + this.items + ", hasNext=" + this.hasNext + ", paginationEventTime=" + this.paginationEventTime + ", tokenInfoMap=" + this.tokenInfoMap + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.smart_money.SignalOverviewResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalOverviewResponse> serializer() {
            return SignalOverviewResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalOverviewResponse(int i, List list, boolean z, String str, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        this.items = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.hasNext = false;
        } else {
            this.hasNext = z;
        }
        if ((i & 4) == 0) {
            this.paginationEventTime = "";
        } else {
            this.paginationEventTime = str;
        }
        if ((i & 8) == 0) {
            this.tokenInfoMap = C56424yEw.KWHzl();
        } else {
            this.tokenInfoMap = map;
        }
    }

    public static final /* synthetic */ void OLrzqt(SignalOverviewResponse signalOverviewResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(signalOverviewResponse.items, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], signalOverviewResponse.items);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || signalOverviewResponse.hasNext) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, signalOverviewResponse.hasNext);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) signalOverviewResponse.paginationEventTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, signalOverviewResponse.paginationEventTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(signalOverviewResponse.tokenInfoMap, C56424yEw.KWHzl())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], signalOverviewResponse.tokenInfoMap);
    }

    public SignalOverviewResponse(@NotNull List<SignalOverview> list, boolean z, @NotNull String str, @NotNull Map<String, TokenInfo> map) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.items = list;
        this.hasNext = z;
        this.paginationEventTime = str;
        this.tokenInfoMap = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r1v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0013: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0017: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:17)) : (r4v0 java.util.Map))
 A[MD:(java.util.List<com.okinc.business.market.data.model.smart_money.SignalOverview>, boolean, java.lang.String, java.util.Map<java.lang.String, com.okinc.business.market.data.model.common.TokenInfo>):void (m)] (LINE:9) call: com.okinc.business.market.data.model.smart_money.SignalOverviewResponse.<init>(java.util.List, boolean, java.lang.String, java.util.Map):void type: THIS */
    public /* synthetic */ SignalOverviewResponse(List list, boolean z, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? C56424yEw.KWHzl() : map);
    }
}
