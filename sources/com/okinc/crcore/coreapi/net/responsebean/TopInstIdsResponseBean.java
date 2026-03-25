package com.okinc.crcore.coreapi.net.responsebean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TopInstIdsResponseBean {
    private final String displayId;
    private final String instId;
    private final String latestPrice;
    private final String open24h;
    private final List<List<String>> priceList;
    private final String sodUtc0;
    private final String sodUtc8;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(new ArrayListSerializer(StringSerializer.INSTANCE))};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TopInstIdsResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.TopInstIdsResponseBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TopInstIdsResponseBean copy$default(TopInstIdsResponseBean topInstIdsResponseBean, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = topInstIdsResponseBean.instId;
        }
        if ((i & 2) != 0) {
            str2 = topInstIdsResponseBean.displayId;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = topInstIdsResponseBean.latestPrice;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = topInstIdsResponseBean.open24h;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = topInstIdsResponseBean.sodUtc0;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = topInstIdsResponseBean.sodUtc8;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            list = topInstIdsResponseBean.priceList;
        }
        return topInstIdsResponseBean.copy(str, str7, str8, str9, str10, str11, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.latestPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.open24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sodUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.sodUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> component7() {
        return this.priceList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TopInstIdsResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<? extends List<String>> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new TopInstIdsResponseBean(str, str2, str3, str4, str5, str6, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopInstIdsResponseBean)) {
            return false;
        }
        TopInstIdsResponseBean topInstIdsResponseBean = (TopInstIdsResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) topInstIdsResponseBean.instId) && Intrinsics.EZpvd((Object) this.displayId, (Object) topInstIdsResponseBean.displayId) && Intrinsics.EZpvd((Object) this.latestPrice, (Object) topInstIdsResponseBean.latestPrice) && Intrinsics.EZpvd((Object) this.open24h, (Object) topInstIdsResponseBean.open24h) && Intrinsics.EZpvd((Object) this.sodUtc0, (Object) topInstIdsResponseBean.sodUtc0) && Intrinsics.EZpvd((Object) this.sodUtc8, (Object) topInstIdsResponseBean.sodUtc8) && Intrinsics.EZpvd(this.priceList, topInstIdsResponseBean.priceList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLatestPrice() {
        return this.latestPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpen24h() {
        return this.open24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> getPriceList() {
        return this.priceList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSodUtc0() {
        return this.sodUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSodUtc8() {
        return this.sodUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.instId.hashCode() * 31) + this.displayId.hashCode()) * 31) + this.latestPrice.hashCode()) * 31) + this.open24h.hashCode()) * 31) + this.sodUtc0.hashCode()) * 31) + this.sodUtc8.hashCode()) * 31) + this.priceList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TopInstIdsResponseBean(instId=" + this.instId + ", displayId=" + this.displayId + ", latestPrice=" + this.latestPrice + ", open24h=" + this.open24h + ", sodUtc0=" + this.sodUtc0 + ", sodUtc8=" + this.sodUtc8 + ", priceList=" + this.priceList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.TopInstIdsResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TopInstIdsResponseBean> serializer() {
            return TopInstIdsResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TopInstIdsResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = "";
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str2;
        }
        if ((i & 4) == 0) {
            this.latestPrice = "";
        } else {
            this.latestPrice = str3;
        }
        if ((i & 8) == 0) {
            this.open24h = "";
        } else {
            this.open24h = str4;
        }
        if ((i & 16) == 0) {
            this.sodUtc0 = "";
        } else {
            this.sodUtc0 = str5;
        }
        if ((i & 32) == 0) {
            this.sodUtc8 = "";
        } else {
            this.sodUtc8 = str6;
        }
        if ((i & 64) == 0) {
            this.priceList = yDY.AhwBna();
        } else {
            this.priceList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(TopInstIdsResponseBean topInstIdsResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) topInstIdsResponseBean.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, topInstIdsResponseBean.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) topInstIdsResponseBean.displayId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, topInstIdsResponseBean.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) topInstIdsResponseBean.latestPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, topInstIdsResponseBean.latestPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) topInstIdsResponseBean.open24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, topInstIdsResponseBean.open24h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) topInstIdsResponseBean.sodUtc0, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, topInstIdsResponseBean.sodUtc0);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) topInstIdsResponseBean.sodUtc8, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, topInstIdsResponseBean.sodUtc8);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd(topInstIdsResponseBean.priceList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], topInstIdsResponseBean.priceList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public TopInstIdsResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<? extends List<String>> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.instId = str;
        this.displayId = str2;
        this.latestPrice = str3;
        this.open24h = str4;
        this.sodUtc0 = str5;
        this.sodUtc8 = str6;
        this.priceList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002b: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x002f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r12v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<? extends java.util.List<java.lang.String>>):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.responsebean.TopInstIdsResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ TopInstIdsResponseBean(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "", (i & 64) != 0 ? yDY.AhwBna() : list);
    }
}
