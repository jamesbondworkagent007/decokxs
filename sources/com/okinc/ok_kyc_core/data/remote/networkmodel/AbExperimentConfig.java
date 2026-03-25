package com.okinc.ok_kyc_core.data.remote.networkmodel;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class AbExperimentConfig {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<ContentListInsertConfig> contentListInsert;
    private final List<ContentListReplaceConfig> contentListReplace;
    private final List<InsertConfig> ctaItemsInsert;
    private final List<CtaReplaceConfig> ctaItemsReplace;
    private final String id;
    private final List<InsertConfig> itemsInsert;
    private final List<ReplaceConfig> itemsReplace;
    private final String pageTitle;
    private final RichSubtitleData richSubtitle;
    private final RichTitle richTitle;
    private final String subtitle;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbExperimentConfig() {
        this((String) null, (String) null, (String) null, (String) null, (RichTitle) null, (RichSubtitleData) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InsertConfig> component10() {
        return this.ctaItemsInsert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CtaReplaceConfig> component11() {
        return this.ctaItemsReplace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ContentListInsertConfig> component12() {
        return this.contentListInsert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.pageTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichTitle component5() {
        return this.richTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichSubtitleData component6() {
        return this.richSubtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReplaceConfig> component7() {
        return this.itemsReplace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InsertConfig> component8() {
        return this.itemsInsert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ContentListReplaceConfig> component9() {
        return this.contentListReplace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbExperimentConfig copy(@NotNull String str, String str2, String str3, String str4, RichTitle richTitle, RichSubtitleData richSubtitleData, List<ReplaceConfig> list, List<InsertConfig> list2, List<ContentListReplaceConfig> list3, List<InsertConfig> list4, List<CtaReplaceConfig> list5, List<ContentListInsertConfig> list6) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AbExperimentConfig(str, str2, str3, str4, richTitle, richSubtitleData, list, list2, list3, list4, list5, list6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbExperimentConfig)) {
            return false;
        }
        AbExperimentConfig abExperimentConfig = (AbExperimentConfig) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) abExperimentConfig.id) && Intrinsics.EZpvd((Object) this.title, (Object) abExperimentConfig.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) abExperimentConfig.subtitle) && Intrinsics.EZpvd((Object) this.pageTitle, (Object) abExperimentConfig.pageTitle) && Intrinsics.EZpvd(this.richTitle, abExperimentConfig.richTitle) && Intrinsics.EZpvd(this.richSubtitle, abExperimentConfig.richSubtitle) && Intrinsics.EZpvd(this.itemsReplace, abExperimentConfig.itemsReplace) && Intrinsics.EZpvd(this.itemsInsert, abExperimentConfig.itemsInsert) && Intrinsics.EZpvd(this.contentListReplace, abExperimentConfig.contentListReplace) && Intrinsics.EZpvd(this.ctaItemsInsert, abExperimentConfig.ctaItemsInsert) && Intrinsics.EZpvd(this.ctaItemsReplace, abExperimentConfig.ctaItemsReplace) && Intrinsics.EZpvd(this.contentListInsert, abExperimentConfig.contentListInsert);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ContentListInsertConfig> getContentListInsert() {
        return this.contentListInsert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ContentListReplaceConfig> getContentListReplace() {
        return this.contentListReplace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InsertConfig> getCtaItemsInsert() {
        return this.ctaItemsInsert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CtaReplaceConfig> getCtaItemsReplace() {
        return this.ctaItemsReplace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InsertConfig> getItemsInsert() {
        return this.itemsInsert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReplaceConfig> getItemsReplace() {
        return this.itemsReplace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPageTitle() {
        return this.pageTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichSubtitleData getRichSubtitle() {
        return this.richSubtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichTitle getRichTitle() {
        return this.richTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        String str = this.title;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.subtitle;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.pageTitle;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        RichTitle richTitle = this.richTitle;
        int iHashCode5 = richTitle == null ? 0 : richTitle.hashCode();
        RichSubtitleData richSubtitleData = this.richSubtitle;
        int iHashCode6 = richSubtitleData == null ? 0 : richSubtitleData.hashCode();
        List<ReplaceConfig> list = this.itemsReplace;
        int iHashCode7 = list == null ? 0 : list.hashCode();
        List<InsertConfig> list2 = this.itemsInsert;
        int iHashCode8 = list2 == null ? 0 : list2.hashCode();
        List<ContentListReplaceConfig> list3 = this.contentListReplace;
        int iHashCode9 = list3 == null ? 0 : list3.hashCode();
        List<InsertConfig> list4 = this.ctaItemsInsert;
        int iHashCode10 = list4 == null ? 0 : list4.hashCode();
        List<CtaReplaceConfig> list5 = this.ctaItemsReplace;
        int iHashCode11 = list5 == null ? 0 : list5.hashCode();
        List<ContentListInsertConfig> list6 = this.contentListInsert;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (list6 != null ? list6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AbExperimentConfig(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", pageTitle=" + this.pageTitle + ", richTitle=" + this.richTitle + ", richSubtitle=" + this.richSubtitle + ", itemsReplace=" + this.itemsReplace + ", itemsInsert=" + this.itemsInsert + ", contentListReplace=" + this.contentListReplace + ", ctaItemsInsert=" + this.ctaItemsInsert + ", ctaItemsReplace=" + this.ctaItemsReplace + ", contentListInsert=" + this.contentListInsert + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AbExperimentConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AbExperimentConfig> serializer() {
            return AbExperimentConfig$$serializer.INSTANCE;
        }
    }

    static {
        InsertConfig$$serializer insertConfig$$serializer = InsertConfig$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, new ArrayListSerializer(ReplaceConfig$$serializer.INSTANCE), new ArrayListSerializer(insertConfig$$serializer), new ArrayListSerializer(ContentListReplaceConfig$$serializer.INSTANCE), new ArrayListSerializer(insertConfig$$serializer), new ArrayListSerializer(CtaReplaceConfig$$serializer.INSTANCE), new ArrayListSerializer(ContentListInsertConfig$$serializer.INSTANCE)};
    }

    public /* synthetic */ AbExperimentConfig(int i, String str, String str2, String str3, String str4, RichTitle richTitle, RichSubtitleData richSubtitleData, List list, List list2, List list3, List list4, List list5, List list6, SerializationConstructorMarker serializationConstructorMarker) {
        this.id = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str3;
        }
        if ((i & 8) == 0) {
            this.pageTitle = null;
        } else {
            this.pageTitle = str4;
        }
        if ((i & 16) == 0) {
            this.richTitle = null;
        } else {
            this.richTitle = richTitle;
        }
        if ((i & 32) == 0) {
            this.richSubtitle = null;
        } else {
            this.richSubtitle = richSubtitleData;
        }
        if ((i & 64) == 0) {
            this.itemsReplace = null;
        } else {
            this.itemsReplace = list;
        }
        if ((i & 128) == 0) {
            this.itemsInsert = null;
        } else {
            this.itemsInsert = list2;
        }
        if ((i & 256) == 0) {
            this.contentListReplace = null;
        } else {
            this.contentListReplace = list3;
        }
        if ((i & 512) == 0) {
            this.ctaItemsInsert = null;
        } else {
            this.ctaItemsInsert = list4;
        }
        if ((i & 1024) == 0) {
            this.ctaItemsReplace = null;
        } else {
            this.ctaItemsReplace = list5;
        }
        if ((i & 2048) == 0) {
            this.contentListInsert = null;
        } else {
            this.contentListInsert = list6;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AbExperimentConfig abExperimentConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) abExperimentConfig.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, abExperimentConfig.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || abExperimentConfig.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, abExperimentConfig.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || abExperimentConfig.subtitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, abExperimentConfig.subtitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || abExperimentConfig.pageTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, abExperimentConfig.pageTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || abExperimentConfig.richTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, RichTitle$$serializer.INSTANCE, abExperimentConfig.richTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || abExperimentConfig.richSubtitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, RichSubtitleData$$serializer.INSTANCE, abExperimentConfig.richSubtitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || abExperimentConfig.itemsReplace != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], abExperimentConfig.itemsReplace);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || abExperimentConfig.itemsInsert != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], abExperimentConfig.itemsInsert);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || abExperimentConfig.contentListReplace != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], abExperimentConfig.contentListReplace);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || abExperimentConfig.ctaItemsInsert != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], abExperimentConfig.ctaItemsInsert);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || abExperimentConfig.ctaItemsReplace != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], abExperimentConfig.ctaItemsReplace);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && abExperimentConfig.contentListInsert == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], abExperimentConfig.contentListInsert);
    }

    public AbExperimentConfig(@NotNull String str, String str2, String str3, String str4, RichTitle richTitle, RichSubtitleData richSubtitleData, List<ReplaceConfig> list, List<InsertConfig> list2, List<ContentListReplaceConfig> list3, List<InsertConfig> list4, List<CtaReplaceConfig> list5, List<ContentListInsertConfig> list6) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.pageTitle = str4;
        this.richTitle = richTitle;
        this.richSubtitle = richSubtitleData;
        this.itemsReplace = list;
        this.itemsInsert = list2;
        this.contentListReplace = list3;
        this.ctaItemsInsert = list4;
        this.ctaItemsReplace = list5;
        this.contentListInsert = list6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle:?: TERNARY null = ((wrap:int:0x0022: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle) : (r18v0 com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitleData:?: TERNARY null = ((wrap:int:0x002a: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitleData) : (r19v0 com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitleData))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0032: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r20v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003a: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r21v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r22v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r23v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r24v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x005a: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.util.List) : (null java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle, com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitleData, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.ReplaceConfig>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.InsertConfig>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.ContentListReplaceConfig>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.InsertConfig>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.CtaReplaceConfig>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.ContentListInsertConfig>):void (m)] (LINE:5267) call: com.okinc.ok_kyc_core.data.remote.networkmodel.AbExperimentConfig.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle, com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitleData, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ AbExperimentConfig(String str, String str2, String str3, String str4, RichTitle richTitle, RichSubtitleData richSubtitleData, List list, List list2, List list3, List list4, List list5, List list6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : richTitle, (i & 32) != 0 ? null : richSubtitleData, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : list3, (i & 512) != 0 ? null : list4, (i & 1024) != 0 ? null : list5, (i & 2048) == 0 ? list6 : null);
    }
}
