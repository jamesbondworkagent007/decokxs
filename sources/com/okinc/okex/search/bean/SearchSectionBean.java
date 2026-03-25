package com.okinc.okex.search.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SearchSectionBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chipColor;
    private final String iconBright;
    private final String iconDark;
    private final String id;
    private final String slug;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchSectionBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SearchSectionBean copy$default(SearchSectionBean searchSectionBean, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchSectionBean.id;
        }
        if ((i & 2) != 0) {
            str2 = searchSectionBean.slug;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = searchSectionBean.title;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = searchSectionBean.chipColor;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = searchSectionBean.iconBright;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = searchSectionBean.iconDark;
        }
        return searchSectionBean.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chipColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.iconBright;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.iconDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchSectionBean copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new SearchSectionBean(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSectionBean)) {
            return false;
        }
        SearchSectionBean searchSectionBean = (SearchSectionBean) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) searchSectionBean.id) && Intrinsics.EZpvd((Object) this.slug, (Object) searchSectionBean.slug) && Intrinsics.EZpvd((Object) this.title, (Object) searchSectionBean.title) && Intrinsics.EZpvd((Object) this.chipColor, (Object) searchSectionBean.chipColor) && Intrinsics.EZpvd((Object) this.iconBright, (Object) searchSectionBean.iconBright) && Intrinsics.EZpvd((Object) this.iconDark, (Object) searchSectionBean.iconDark);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChipColor() {
        return this.chipColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconBright() {
        return this.iconBright;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconDark() {
        return this.iconDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlug() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.slug;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.title;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.chipColor;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.iconBright;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.iconDark;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchSectionBean(id=" + this.id + ", slug=" + this.slug + ", title=" + this.title + ", chipColor=" + this.chipColor + ", iconBright=" + this.iconBright + ", iconDark=" + this.iconDark + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.search.bean.SearchSectionBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchSectionBean> serializer() {
            return SearchSectionBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SearchSectionBean(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.slug = null;
        } else {
            this.slug = str2;
        }
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.chipColor = null;
        } else {
            this.chipColor = str4;
        }
        if ((i & 16) == 0) {
            this.iconBright = null;
        } else {
            this.iconBright = str5;
        }
        if ((i & 32) == 0) {
            this.iconDark = null;
        } else {
            this.iconDark = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(SearchSectionBean searchSectionBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || searchSectionBean.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, searchSectionBean.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || searchSectionBean.slug != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, searchSectionBean.slug);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || searchSectionBean.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, searchSectionBean.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || searchSectionBean.chipColor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, searchSectionBean.chipColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || searchSectionBean.iconBright != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, searchSectionBean.iconBright);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && searchSectionBean.iconDark == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, searchSectionBean.iconDark);
    }

    public SearchSectionBean(String str, String str2, String str3, String str4, String str5, String str6) {
        this.id = str;
        this.slug = str2;
        this.title = str3;
        this.chipColor = str4;
        this.iconBright = str5;
        this.iconDark = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:14) call: com.okinc.okex.search.bean.SearchSectionBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SearchSectionBean(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
