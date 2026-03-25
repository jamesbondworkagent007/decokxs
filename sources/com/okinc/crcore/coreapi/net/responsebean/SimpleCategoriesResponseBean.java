package com.okinc.crcore.coreapi.net.responsebean;

import androidx.core.app.FrameMetricsAggregator;
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
public final class SimpleCategoriesResponseBean {
    private final String categoryDarkIcon;
    private final String categoryLightIcon;
    private final String code;
    private final List<CoinResponseBean> coinList;
    private final List<String> iconList;
    private final String introduce;
    private final String introduceShort;
    private final String name;
    private final String priceChange;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), new ArrayListSerializer(CoinResponseBean$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleCategoriesResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
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
    public final String component6() {
        return this.categoryDarkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.categoryLightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component8() {
        return this.iconList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinResponseBean> component9() {
        return this.coinList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleCategoriesResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull List<String> list, @NotNull List<CoinResponseBean> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new SimpleCategoriesResponseBean(str, str2, str3, str4, str5, str6, str7, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleCategoriesResponseBean)) {
            return false;
        }
        SimpleCategoriesResponseBean simpleCategoriesResponseBean = (SimpleCategoriesResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) simpleCategoriesResponseBean.code) && Intrinsics.EZpvd((Object) this.name, (Object) simpleCategoriesResponseBean.name) && Intrinsics.EZpvd((Object) this.introduce, (Object) simpleCategoriesResponseBean.introduce) && Intrinsics.EZpvd((Object) this.introduceShort, (Object) simpleCategoriesResponseBean.introduceShort) && Intrinsics.EZpvd((Object) this.priceChange, (Object) simpleCategoriesResponseBean.priceChange) && Intrinsics.EZpvd((Object) this.categoryDarkIcon, (Object) simpleCategoriesResponseBean.categoryDarkIcon) && Intrinsics.EZpvd((Object) this.categoryLightIcon, (Object) simpleCategoriesResponseBean.categoryLightIcon) && Intrinsics.EZpvd(this.iconList, simpleCategoriesResponseBean.iconList) && Intrinsics.EZpvd(this.coinList, simpleCategoriesResponseBean.coinList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategoryDarkIcon() {
        return this.categoryDarkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategoryLightIcon() {
        return this.categoryLightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinResponseBean> getCoinList() {
        return this.coinList;
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
    public int hashCode() {
        return (((((((((((((((this.code.hashCode() * 31) + this.name.hashCode()) * 31) + this.introduce.hashCode()) * 31) + this.introduceShort.hashCode()) * 31) + this.priceChange.hashCode()) * 31) + this.categoryDarkIcon.hashCode()) * 31) + this.categoryLightIcon.hashCode()) * 31) + this.iconList.hashCode()) * 31) + this.coinList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleCategoriesResponseBean(code=" + this.code + ", name=" + this.name + ", introduce=" + this.introduce + ", introduceShort=" + this.introduceShort + ", priceChange=" + this.priceChange + ", categoryDarkIcon=" + this.categoryDarkIcon + ", categoryLightIcon=" + this.categoryLightIcon + ", iconList=" + this.iconList + ", coinList=" + this.coinList + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.SimpleCategoriesResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimpleCategoriesResponseBean> serializer() {
            return SimpleCategoriesResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimpleCategoriesResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.categoryDarkIcon = "";
        } else {
            this.categoryDarkIcon = str6;
        }
        if ((i & 64) == 0) {
            this.categoryLightIcon = "";
        } else {
            this.categoryLightIcon = str7;
        }
        if ((i & 128) == 0) {
            this.iconList = yDY.AhwBna();
        } else {
            this.iconList = list;
        }
        if ((i & 256) == 0) {
            this.coinList = yDY.AhwBna();
        } else {
            this.coinList = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(SimpleCategoriesResponseBean simpleCategoriesResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) simpleCategoriesResponseBean.code, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, simpleCategoriesResponseBean.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) simpleCategoriesResponseBean.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, simpleCategoriesResponseBean.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) simpleCategoriesResponseBean.introduce, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, simpleCategoriesResponseBean.introduce);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) simpleCategoriesResponseBean.introduceShort, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, simpleCategoriesResponseBean.introduceShort);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) simpleCategoriesResponseBean.priceChange, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, simpleCategoriesResponseBean.priceChange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) simpleCategoriesResponseBean.categoryDarkIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, simpleCategoriesResponseBean.categoryDarkIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) simpleCategoriesResponseBean.categoryLightIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, simpleCategoriesResponseBean.categoryLightIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(simpleCategoriesResponseBean.iconList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], simpleCategoriesResponseBean.iconList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd(simpleCategoriesResponseBean.coinList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], simpleCategoriesResponseBean.coinList);
    }

    public SimpleCategoriesResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull List<String> list, @NotNull List<CoinResponseBean> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.code = str;
        this.name = str2;
        this.introduce = str3;
        this.introduceShort = str4;
        this.priceChange = str5;
        this.categoryDarkIcon = str6;
        this.categoryLightIcon = str7;
        this.iconList = list;
        this.coinList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0059: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r19v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r19v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r16v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0035: ARITH (r19v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:16)) : (r17v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0040: ARITH (r19v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0044: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r18v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<com.okinc.crcore.coreapi.net.responsebean.CoinResponseBean>):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.responsebean.SimpleCategoriesResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ SimpleCategoriesResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", (i & 128) != 0 ? yDY.AhwBna() : list, (i & 256) != 0 ? yDY.AhwBna() : list2);
    }
}
