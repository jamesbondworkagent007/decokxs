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
public final class HomeTabContentResponse {
    public final TokenAggregateData aggregate;
    public final List<HomeTokenData> items;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(HomeTokenData$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeTabContentResponse() {
        this((List) null, (TokenAggregateData) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.HomeTabContentResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeTabContentResponse copy$default(HomeTabContentResponse homeTabContentResponse, List list, TokenAggregateData tokenAggregateData, int i, Object obj) {
        if ((i & 1) != 0) {
            list = homeTabContentResponse.items;
        }
        if ((i & 2) != 0) {
            tokenAggregateData = homeTabContentResponse.aggregate;
        }
        return homeTabContentResponse.copydefault(list, tokenAggregateData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenAggregateData KWHzl() {
        return this.aggregate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeTabContentResponse copydefault(@NotNull List<HomeTokenData> list, TokenAggregateData tokenAggregateData) {
        Intrinsics.checkNotNullParameter(list, "");
        return new HomeTabContentResponse(list, tokenAggregateData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HomeTokenData> copydefault() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeTabContentResponse)) {
            return false;
        }
        HomeTabContentResponse homeTabContentResponse = (HomeTabContentResponse) obj;
        return Intrinsics.EZpvd(this.items, homeTabContentResponse.items) && Intrinsics.EZpvd(this.aggregate, homeTabContentResponse.aggregate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.items.hashCode();
        TokenAggregateData tokenAggregateData = this.aggregate;
        return (iHashCode * 31) + (tokenAggregateData == null ? 0 : tokenAggregateData.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeTabContentResponse(items=" + this.items + ", aggregate=" + this.aggregate + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.HomeTabContentResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HomeTabContentResponse> serializer() {
            return HomeTabContentResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HomeTabContentResponse(int i, List list, TokenAggregateData tokenAggregateData, SerializationConstructorMarker serializationConstructorMarker) {
        this.items = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.aggregate = null;
        } else {
            this.aggregate = tokenAggregateData;
        }
    }

    public static final /* synthetic */ void KWHzl(HomeTabContentResponse homeTabContentResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(homeTabContentResponse.items, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], homeTabContentResponse.items);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && homeTabContentResponse.aggregate == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, TokenAggregateData$$serializer.INSTANCE, homeTabContentResponse.aggregate);
    }

    public HomeTabContentResponse(@NotNull List<HomeTokenData> list, TokenAggregateData tokenAggregateData) {
        Intrinsics.checkNotNullParameter(list, "");
        this.items = list;
        this.aggregate = tokenAggregateData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:9)) : (r1v0 java.util.List))
  (wrap:com.okinc.business.market.data.model.TokenAggregateData:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.data.model.TokenAggregateData) : (r2v0 com.okinc.business.market.data.model.TokenAggregateData))
 A[MD:(java.util.List<com.okinc.business.market.data.model.HomeTokenData>, com.okinc.business.market.data.model.TokenAggregateData):void (m)] (LINE:7) call: com.okinc.business.market.data.model.HomeTabContentResponse.<init>(java.util.List, com.okinc.business.market.data.model.TokenAggregateData):void type: THIS */
    public /* synthetic */ HomeTabContentResponse(List list, TokenAggregateData tokenAggregateData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? null : tokenAggregateData);
    }
}
