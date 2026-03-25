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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class TrendingCategoriesResponseBean {
    private final String code;
    private final List<String> iconList;
    private final String introduce;
    private final String introduceShort;
    private final String name;
    private final String priceChange;
    private final List<TopInstIdsResponseBean> topInstIds;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), new ArrayListSerializer(TopInstIdsResponseBean$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrendingCategoriesResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.TrendingCategoriesResponseBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrendingCategoriesResponseBean copy$default(TrendingCategoriesResponseBean trendingCategoriesResponseBean, String str, String str2, String str3, String str4, String str5, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trendingCategoriesResponseBean.code;
        }
        if ((i & 2) != 0) {
            str2 = trendingCategoriesResponseBean.name;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = trendingCategoriesResponseBean.introduce;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = trendingCategoriesResponseBean.introduceShort;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = trendingCategoriesResponseBean.priceChange;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            list = trendingCategoriesResponseBean.iconList;
        }
        List list3 = list;
        if ((i & 64) != 0) {
            list2 = trendingCategoriesResponseBean.topInstIds;
        }
        return trendingCategoriesResponseBean.copy(str, str6, str7, str8, str9, list3, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.introduce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.introduceShort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.priceChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.iconList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TopInstIdsResponseBean> component7() {
        return this.topInstIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrendingCategoriesResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<String> list, @NotNull List<TopInstIdsResponseBean> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new TrendingCategoriesResponseBean(str, str2, str3, str4, str5, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendingCategoriesResponseBean)) {
            return false;
        }
        TrendingCategoriesResponseBean trendingCategoriesResponseBean = (TrendingCategoriesResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) trendingCategoriesResponseBean.code) && Intrinsics.EZpvd((Object) this.name, (Object) trendingCategoriesResponseBean.name) && Intrinsics.EZpvd((Object) this.introduce, (Object) trendingCategoriesResponseBean.introduce) && Intrinsics.EZpvd((Object) this.introduceShort, (Object) trendingCategoriesResponseBean.introduceShort) && Intrinsics.EZpvd((Object) this.priceChange, (Object) trendingCategoriesResponseBean.priceChange) && Intrinsics.EZpvd(this.iconList, trendingCategoriesResponseBean.iconList) && Intrinsics.EZpvd(this.topInstIds, trendingCategoriesResponseBean.topInstIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getIconList() {
        return this.iconList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntroduce() {
        return this.introduce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntroduceShort() {
        return this.introduceShort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceChange() {
        return this.priceChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TopInstIdsResponseBean> getTopInstIds() {
        return this.topInstIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.code.hashCode() * 31) + this.name.hashCode()) * 31) + this.introduce.hashCode()) * 31) + this.introduceShort.hashCode()) * 31) + this.priceChange.hashCode()) * 31) + this.iconList.hashCode()) * 31) + this.topInstIds.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrendingCategoriesResponseBean(code=" + this.code + ", name=" + this.name + ", introduce=" + this.introduce + ", introduceShort=" + this.introduceShort + ", priceChange=" + this.priceChange + ", iconList=" + this.iconList + ", topInstIds=" + this.topInstIds + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.TrendingCategoriesResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrendingCategoriesResponseBean> serializer() {
            return TrendingCategoriesResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TrendingCategoriesResponseBean(int i, String str, String str2, String str3, String str4, String str5, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.code = "";
        } else {
            this.code = str;
        }
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.introduce = "";
        } else {
            this.introduce = str3;
        }
        if ((i & 8) == 0) {
            this.introduceShort = "";
        } else {
            this.introduceShort = str4;
        }
        if ((i & 16) == 0) {
            this.priceChange = "";
        } else {
            this.priceChange = str5;
        }
        if ((i & 32) == 0) {
            this.iconList = yDY.AhwBna();
        } else {
            this.iconList = list;
        }
        if ((i & 64) == 0) {
            this.topInstIds = yDY.AhwBna();
        } else {
            this.topInstIds = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(TrendingCategoriesResponseBean trendingCategoriesResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) trendingCategoriesResponseBean.code, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, trendingCategoriesResponseBean.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) trendingCategoriesResponseBean.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, trendingCategoriesResponseBean.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) trendingCategoriesResponseBean.introduce, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, trendingCategoriesResponseBean.introduce);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) trendingCategoriesResponseBean.introduceShort, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, trendingCategoriesResponseBean.introduceShort);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) trendingCategoriesResponseBean.priceChange, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, trendingCategoriesResponseBean.priceChange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(trendingCategoriesResponseBean.iconList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], trendingCategoriesResponseBean.iconList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd(trendingCategoriesResponseBean.topInstIds, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], trendingCategoriesResponseBean.topInstIds);
    }

    public TrendingCategoriesResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<String> list, @NotNull List<TopInstIdsResponseBean> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.code = str;
        this.name = str2;
        this.introduce = str3;
        this.introduceShort = str4;
        this.priceChange = str5;
        this.iconList = list;
        this.topInstIds = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r10v0 java.lang.String) : (""))
  (wrap:java.util.List:0x002c: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0028: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:14)) : (r11v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002d: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0031: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r12v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<com.okinc.crcore.coreapi.net.responsebean.TopInstIdsResponseBean>):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.responsebean.TrendingCategoriesResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ TrendingCategoriesResponseBean(String str, String str2, String str3, String str4, String str5, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? yDY.AhwBna() : list, (i & 64) != 0 ? yDY.AhwBna() : list2);
    }
}
