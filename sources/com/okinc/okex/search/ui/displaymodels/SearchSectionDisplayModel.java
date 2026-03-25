package com.okinc.okex.search.ui.displaymodels;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SearchSectionDisplayModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chipColor;
    private final String id;
    private final String sectionIcon;
    private final String slug;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchSectionDisplayModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SearchSectionDisplayModel copy$default(SearchSectionDisplayModel searchSectionDisplayModel, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchSectionDisplayModel.id;
        }
        if ((i & 2) != 0) {
            str2 = searchSectionDisplayModel.slug;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = searchSectionDisplayModel.title;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = searchSectionDisplayModel.chipColor;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = searchSectionDisplayModel.sectionIcon;
        }
        return searchSectionDisplayModel.copy(str, str6, str7, str8, str5);
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
        return this.sectionIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchSectionDisplayModel copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new SearchSectionDisplayModel(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSectionDisplayModel)) {
            return false;
        }
        SearchSectionDisplayModel searchSectionDisplayModel = (SearchSectionDisplayModel) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) searchSectionDisplayModel.id) && Intrinsics.EZpvd((Object) this.slug, (Object) searchSectionDisplayModel.slug) && Intrinsics.EZpvd((Object) this.title, (Object) searchSectionDisplayModel.title) && Intrinsics.EZpvd((Object) this.chipColor, (Object) searchSectionDisplayModel.chipColor) && Intrinsics.EZpvd((Object) this.sectionIcon, (Object) searchSectionDisplayModel.sectionIcon);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChipColor() {
        return this.chipColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSectionIcon() {
        return this.sectionIcon;
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
        return (((((((this.id.hashCode() * 31) + this.slug.hashCode()) * 31) + this.title.hashCode()) * 31) + this.chipColor.hashCode()) * 31) + this.sectionIcon.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchSectionDisplayModel(id=" + this.id + ", slug=" + this.slug + ", title=" + this.title + ", chipColor=" + this.chipColor + ", sectionIcon=" + this.sectionIcon + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.search.ui.displaymodels.SearchSectionDisplayModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchSectionDisplayModel> serializer() {
            return SearchSectionDisplayModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SearchSectionDisplayModel(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.slug = "";
        } else {
            this.slug = str2;
        }
        if ((i & 4) == 0) {
            this.title = "";
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.chipColor = "";
        } else {
            this.chipColor = str4;
        }
        if ((i & 16) == 0) {
            this.sectionIcon = "";
        } else {
            this.sectionIcon = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(SearchSectionDisplayModel searchSectionDisplayModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) searchSectionDisplayModel.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, searchSectionDisplayModel.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) searchSectionDisplayModel.slug, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, searchSectionDisplayModel.slug);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) searchSectionDisplayModel.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, searchSectionDisplayModel.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) searchSectionDisplayModel.chipColor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, searchSectionDisplayModel.chipColor);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) searchSectionDisplayModel.sectionIcon, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, searchSectionDisplayModel.sectionIcon);
    }

    public SearchSectionDisplayModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.id = str;
        this.slug = str2;
        this.title = str3;
        this.chipColor = str4;
        this.sectionIcon = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.okex.search.ui.displaymodels.SearchSectionDisplayModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SearchSectionDisplayModel(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
