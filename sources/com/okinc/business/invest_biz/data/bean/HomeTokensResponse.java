package com.okinc.business.invest_biz.data.bean;

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
public final class HomeTokensResponse {
    public static final int DEPOSIT_TO_EARN = 2;
    public static final int EARN_MY_TOKEN = 1;
    public final List<HomeTokensItemData> tokenList;
    public final int type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(HomeTokensItemData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeTokensResponse() {
        this(0, (List) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.HomeTokensResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeTokensResponse copy$default(HomeTokensResponse homeTokensResponse, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = homeTokensResponse.type;
        }
        if ((i2 & 2) != 0) {
            list = homeTokensResponse.tokenList;
        }
        return homeTokensResponse.copydefault(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HomeTokensItemData> KWHzl() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeTokensResponse copydefault(int i, @NotNull List<HomeTokensItemData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new HomeTokensResponse(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeTokensResponse)) {
            return false;
        }
        HomeTokensResponse homeTokensResponse = (HomeTokensResponse) obj;
        return this.type == homeTokensResponse.type && Intrinsics.EZpvd(this.tokenList, homeTokensResponse.tokenList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.type) * 31) + this.tokenList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeTokensResponse(type=" + this.type + ", tokenList=" + this.tokenList + ")";
    }

    public /* synthetic */ HomeTokensResponse(int i, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.type = (i & 1) == 0 ? 1 : i2;
        if ((i & 2) == 0) {
            this.tokenList = yDY.AhwBna();
        } else {
            this.tokenList = list;
        }
    }

    public static final /* synthetic */ void OLrzqt(HomeTokensResponse homeTokensResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || homeTokensResponse.type != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, homeTokensResponse.type);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(homeTokensResponse.tokenList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], homeTokensResponse.tokenList);
    }

    public HomeTokensResponse(int i, @NotNull List<HomeTokensItemData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.type = i;
        this.tokenList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r1v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0009: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:531)) : (r2v0 java.util.List))
 A[MD:(int, java.util.List<com.okinc.business.invest_biz.data.bean.HomeTokensItemData>):void (m)] (LINE:527) call: com.okinc.business.invest_biz.data.bean.HomeTokensResponse.<init>(int, java.util.List):void type: THIS */
    public /* synthetic */ HomeTokensResponse(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? yDY.AhwBna() : list);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.HomeTokensResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<HomeTokensResponse> serializer() {
            return HomeTokensResponse$$serializer.INSTANCE;
        }
    }
}
