package com.okinc.crcore.coreapi.net.responsebean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class CategoryOverviewResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String code;
    private final String marketCap;
    private final String marketCap24hChange;
    private final String name;
    private final String volume24h;
    private final String volume24hChange;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CategoryOverviewResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CategoryOverviewResponseBean copy$default(CategoryOverviewResponseBean categoryOverviewResponseBean, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = categoryOverviewResponseBean.code;
        }
        if ((i & 2) != 0) {
            str2 = categoryOverviewResponseBean.name;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = categoryOverviewResponseBean.marketCap;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = categoryOverviewResponseBean.marketCap24hChange;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = categoryOverviewResponseBean.volume24h;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = categoryOverviewResponseBean.volume24hChange;
        }
        return categoryOverviewResponseBean.copy(str, str7, str8, str9, str10, str6);
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
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.marketCap24hChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.volume24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.volume24hChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CategoryOverviewResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new CategoryOverviewResponseBean(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryOverviewResponseBean)) {
            return false;
        }
        CategoryOverviewResponseBean categoryOverviewResponseBean = (CategoryOverviewResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) categoryOverviewResponseBean.code) && Intrinsics.EZpvd((Object) this.name, (Object) categoryOverviewResponseBean.name) && Intrinsics.EZpvd((Object) this.marketCap, (Object) categoryOverviewResponseBean.marketCap) && Intrinsics.EZpvd((Object) this.marketCap24hChange, (Object) categoryOverviewResponseBean.marketCap24hChange) && Intrinsics.EZpvd((Object) this.volume24h, (Object) categoryOverviewResponseBean.volume24h) && Intrinsics.EZpvd((Object) this.volume24hChange, (Object) categoryOverviewResponseBean.volume24hChange);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap24hChange() {
        return this.marketCap24hChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolume24h() {
        return this.volume24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolume24hChange() {
        return this.volume24hChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.code.hashCode() * 31) + this.name.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + this.marketCap24hChange.hashCode()) * 31) + this.volume24h.hashCode()) * 31) + this.volume24hChange.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CategoryOverviewResponseBean(code=" + this.code + ", name=" + this.name + ", marketCap=" + this.marketCap + ", marketCap24hChange=" + this.marketCap24hChange + ", volume24h=" + this.volume24h + ", volume24hChange=" + this.volume24hChange + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.CategoryOverviewResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CategoryOverviewResponseBean> serializer() {
            return CategoryOverviewResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CategoryOverviewResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.marketCap = "";
        } else {
            this.marketCap = str3;
        }
        if ((i & 8) == 0) {
            this.marketCap24hChange = "";
        } else {
            this.marketCap24hChange = str4;
        }
        if ((i & 16) == 0) {
            this.volume24h = "";
        } else {
            this.volume24h = str5;
        }
        if ((i & 32) == 0) {
            this.volume24hChange = "";
        } else {
            this.volume24hChange = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CategoryOverviewResponseBean categoryOverviewResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) categoryOverviewResponseBean.code, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, categoryOverviewResponseBean.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) categoryOverviewResponseBean.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, categoryOverviewResponseBean.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) categoryOverviewResponseBean.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, categoryOverviewResponseBean.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) categoryOverviewResponseBean.marketCap24hChange, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, categoryOverviewResponseBean.marketCap24hChange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) categoryOverviewResponseBean.volume24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, categoryOverviewResponseBean.volume24h);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) categoryOverviewResponseBean.volume24hChange, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, categoryOverviewResponseBean.volume24hChange);
    }

    public CategoryOverviewResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.code = str;
        this.name = str2;
        this.marketCap = str3;
        this.marketCap24hChange = str4;
        this.volume24h = str5;
        this.volume24hChange = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.responsebean.CategoryOverviewResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CategoryOverviewResponseBean(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
