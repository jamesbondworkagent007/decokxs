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
public final class FeatureCardsResponseBean {
    private final String cardName;
    private final String cardTitle;
    private final String ctaContent;
    private final String ctaDeeplink;
    private final String darkBackground;
    private final String description;
    private final List<String> iconList;
    private final boolean isFrHide;
    private final String lightBackground;
    private final String preHeader;
    private final String restrictionTag;
    private final String submode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FeatureCardsResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.cardName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component10() {
        return this.iconList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.submode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.isFrHide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.restrictionTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.preHeader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.cardTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.darkBackground;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.lightBackground;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.ctaContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.ctaDeeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeatureCardsResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull List<String> list, @NotNull String str10, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new FeatureCardsResponseBean(str, str2, str3, str4, str5, str6, str7, str8, str9, list, str10, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureCardsResponseBean)) {
            return false;
        }
        FeatureCardsResponseBean featureCardsResponseBean = (FeatureCardsResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.cardName, (Object) featureCardsResponseBean.cardName) && Intrinsics.EZpvd((Object) this.restrictionTag, (Object) featureCardsResponseBean.restrictionTag) && Intrinsics.EZpvd((Object) this.preHeader, (Object) featureCardsResponseBean.preHeader) && Intrinsics.EZpvd((Object) this.cardTitle, (Object) featureCardsResponseBean.cardTitle) && Intrinsics.EZpvd((Object) this.description, (Object) featureCardsResponseBean.description) && Intrinsics.EZpvd((Object) this.darkBackground, (Object) featureCardsResponseBean.darkBackground) && Intrinsics.EZpvd((Object) this.lightBackground, (Object) featureCardsResponseBean.lightBackground) && Intrinsics.EZpvd((Object) this.ctaContent, (Object) featureCardsResponseBean.ctaContent) && Intrinsics.EZpvd((Object) this.ctaDeeplink, (Object) featureCardsResponseBean.ctaDeeplink) && Intrinsics.EZpvd(this.iconList, featureCardsResponseBean.iconList) && Intrinsics.EZpvd((Object) this.submode, (Object) featureCardsResponseBean.submode) && this.isFrHide == featureCardsResponseBean.isFrHide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCardName() {
        return this.cardName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCardTitle() {
        return this.cardTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtaContent() {
        return this.ctaContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtaDeeplink() {
        return this.ctaDeeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDarkBackground() {
        return this.darkBackground;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getIconList() {
        return this.iconList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLightBackground() {
        return this.lightBackground;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreHeader() {
        return this.preHeader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRestrictionTag() {
        return this.restrictionTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubmode() {
        return this.submode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((this.cardName.hashCode() * 31) + this.restrictionTag.hashCode()) * 31) + this.preHeader.hashCode()) * 31) + this.cardTitle.hashCode()) * 31) + this.description.hashCode()) * 31) + this.darkBackground.hashCode()) * 31) + this.lightBackground.hashCode()) * 31) + this.ctaContent.hashCode()) * 31) + this.ctaDeeplink.hashCode()) * 31) + this.iconList.hashCode()) * 31) + this.submode.hashCode()) * 31) + Boolean.hashCode(this.isFrHide);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFrHide() {
        return this.isFrHide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FeatureCardsResponseBean(cardName=" + this.cardName + ", restrictionTag=" + this.restrictionTag + ", preHeader=" + this.preHeader + ", cardTitle=" + this.cardTitle + ", description=" + this.description + ", darkBackground=" + this.darkBackground + ", lightBackground=" + this.lightBackground + ", ctaContent=" + this.ctaContent + ", ctaDeeplink=" + this.ctaDeeplink + ", iconList=" + this.iconList + ", submode=" + this.submode + ", isFrHide=" + this.isFrHide + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.FeatureCardsResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FeatureCardsResponseBean> serializer() {
            return FeatureCardsResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FeatureCardsResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.cardName = "";
        } else {
            this.cardName = str;
        }
        if ((i & 2) == 0) {
            this.restrictionTag = "";
        } else {
            this.restrictionTag = str2;
        }
        if ((i & 4) == 0) {
            this.preHeader = "";
        } else {
            this.preHeader = str3;
        }
        if ((i & 8) == 0) {
            this.cardTitle = "";
        } else {
            this.cardTitle = str4;
        }
        if ((i & 16) == 0) {
            this.description = "";
        } else {
            this.description = str5;
        }
        if ((i & 32) == 0) {
            this.darkBackground = "";
        } else {
            this.darkBackground = str6;
        }
        if ((i & 64) == 0) {
            this.lightBackground = "";
        } else {
            this.lightBackground = str7;
        }
        if ((i & 128) == 0) {
            this.ctaContent = "";
        } else {
            this.ctaContent = str8;
        }
        if ((i & 256) == 0) {
            this.ctaDeeplink = "";
        } else {
            this.ctaDeeplink = str9;
        }
        if ((i & 512) == 0) {
            this.iconList = yDY.AhwBna();
        } else {
            this.iconList = list;
        }
        if ((i & 1024) == 0) {
            this.submode = "";
        } else {
            this.submode = str10;
        }
        if ((i & 2048) == 0) {
            this.isFrHide = true;
        } else {
            this.isFrHide = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(FeatureCardsResponseBean featureCardsResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) featureCardsResponseBean.cardName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, featureCardsResponseBean.cardName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) featureCardsResponseBean.restrictionTag, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, featureCardsResponseBean.restrictionTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) featureCardsResponseBean.preHeader, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, featureCardsResponseBean.preHeader);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) featureCardsResponseBean.cardTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, featureCardsResponseBean.cardTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) featureCardsResponseBean.description, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, featureCardsResponseBean.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) featureCardsResponseBean.darkBackground, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, featureCardsResponseBean.darkBackground);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) featureCardsResponseBean.lightBackground, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, featureCardsResponseBean.lightBackground);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) featureCardsResponseBean.ctaContent, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, featureCardsResponseBean.ctaContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) featureCardsResponseBean.ctaDeeplink, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, featureCardsResponseBean.ctaDeeplink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(featureCardsResponseBean.iconList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], featureCardsResponseBean.iconList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) featureCardsResponseBean.submode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, featureCardsResponseBean.submode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && featureCardsResponseBean.isFrHide) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 11, featureCardsResponseBean.isFrHide);
    }

    public FeatureCardsResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull List<String> list, @NotNull String str10, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.cardName = str;
        this.restrictionTag = str2;
        this.preHeader = str3;
        this.cardTitle = str4;
        this.description = str5;
        this.darkBackground = str6;
        this.lightBackground = str7;
        this.ctaContent = str8;
        this.ctaDeeplink = str9;
        this.iconList = list;
        this.submode = str10;
        this.isFrHide = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:18)) : (r23v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005c: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? true : (r25v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, boolean):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.responsebean.FeatureCardsResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ FeatureCardsResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? yDY.AhwBna() : list, (i & 1024) == 0 ? str10 : "", (i & 2048) != 0 ? true : z);
    }
}
