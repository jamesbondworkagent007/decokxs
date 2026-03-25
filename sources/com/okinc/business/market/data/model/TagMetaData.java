package com.okinc.business.market.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TagMetaData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String classicDarkIcon;
    public final String classicLightIcon;
    public final String description;
    public final String modernDarkIcon;
    public final String modernDarkTextColor;
    public final String modernLightIcon;
    public final String modernLightTextColor;
    public final String shortTitle;
    public final int showIconText;
    public final int tagGroup;
    public final String tagKey;
    public final String title;
    public final int upDown;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TagMetaData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.classicDarkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.showIconText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.tagGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.tagKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagMetaData EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new TagMetaData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.modernDarkTextColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.classicLightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.modernDarkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.shortTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagMetaData)) {
            return false;
        }
        TagMetaData tagMetaData = (TagMetaData) obj;
        return Intrinsics.EZpvd((Object) this.tagKey, (Object) tagMetaData.tagKey) && Intrinsics.EZpvd((Object) this.title, (Object) tagMetaData.title) && Intrinsics.EZpvd((Object) this.shortTitle, (Object) tagMetaData.shortTitle) && Intrinsics.EZpvd((Object) this.description, (Object) tagMetaData.description) && Intrinsics.EZpvd((Object) this.classicDarkIcon, (Object) tagMetaData.classicDarkIcon) && Intrinsics.EZpvd((Object) this.classicLightIcon, (Object) tagMetaData.classicLightIcon) && Intrinsics.EZpvd((Object) this.modernDarkIcon, (Object) tagMetaData.modernDarkIcon) && Intrinsics.EZpvd((Object) this.modernLightIcon, (Object) tagMetaData.modernLightIcon) && Intrinsics.EZpvd((Object) this.modernDarkTextColor, (Object) tagMetaData.modernDarkTextColor) && Intrinsics.EZpvd((Object) this.modernLightTextColor, (Object) tagMetaData.modernLightTextColor) && this.upDown == tagMetaData.upDown && this.tagGroup == tagMetaData.tagGroup && this.showIconText == tagMetaData.showIconText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.modernLightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.tagKey.hashCode() * 31) + this.title.hashCode()) * 31) + this.shortTitle.hashCode()) * 31) + this.description.hashCode()) * 31) + this.classicDarkIcon.hashCode()) * 31) + this.classicLightIcon.hashCode()) * 31) + this.modernDarkIcon.hashCode()) * 31) + this.modernLightIcon.hashCode()) * 31) + this.modernDarkTextColor.hashCode()) * 31) + this.modernLightTextColor.hashCode()) * 31) + Integer.hashCode(this.upDown)) * 31) + Integer.hashCode(this.tagGroup)) * 31) + Integer.hashCode(this.showIconText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isConnected() {
        return this.upDown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TagMetaData(tagKey=" + this.tagKey + ", title=" + this.title + ", shortTitle=" + this.shortTitle + ", description=" + this.description + ", classicDarkIcon=" + this.classicDarkIcon + ", classicLightIcon=" + this.classicLightIcon + ", modernDarkIcon=" + this.modernDarkIcon + ", modernLightIcon=" + this.modernLightIcon + ", modernDarkTextColor=" + this.modernDarkTextColor + ", modernLightTextColor=" + this.modernLightTextColor + ", upDown=" + this.upDown + ", tagGroup=" + this.tagGroup + ", showIconText=" + this.showIconText + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.modernLightTextColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.title;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.TagMetaData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TagMetaData> serializer() {
            return TagMetaData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TagMetaData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, int i3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tagKey = "";
        } else {
            this.tagKey = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.shortTitle = "";
        } else {
            this.shortTitle = str3;
        }
        if ((i & 8) == 0) {
            this.description = "";
        } else {
            this.description = str4;
        }
        if ((i & 16) == 0) {
            this.classicDarkIcon = "";
        } else {
            this.classicDarkIcon = str5;
        }
        if ((i & 32) == 0) {
            this.classicLightIcon = "";
        } else {
            this.classicLightIcon = str6;
        }
        if ((i & 64) == 0) {
            this.modernDarkIcon = "";
        } else {
            this.modernDarkIcon = str7;
        }
        if ((i & 128) == 0) {
            this.modernLightIcon = "";
        } else {
            this.modernLightIcon = str8;
        }
        if ((i & 256) == 0) {
            this.modernDarkTextColor = "";
        } else {
            this.modernDarkTextColor = str9;
        }
        if ((i & 512) == 0) {
            this.modernLightTextColor = "";
        } else {
            this.modernLightTextColor = str10;
        }
        if ((i & 1024) == 0) {
            this.upDown = 0;
        } else {
            this.upDown = i2;
        }
        this.tagGroup = (i & 2048) == 0 ? -1 : i3;
        if ((i & 4096) == 0) {
            this.showIconText = 0;
        } else {
            this.showIconText = i4;
        }
    }

    public static final /* synthetic */ void EZpvd(TagMetaData tagMetaData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tagMetaData.tagKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tagMetaData.tagKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tagMetaData.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tagMetaData.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tagMetaData.shortTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tagMetaData.shortTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tagMetaData.description, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tagMetaData.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tagMetaData.classicDarkIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tagMetaData.classicDarkIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tagMetaData.classicLightIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tagMetaData.classicLightIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tagMetaData.modernDarkIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tagMetaData.modernDarkIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tagMetaData.modernLightIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tagMetaData.modernLightIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tagMetaData.modernDarkTextColor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, tagMetaData.modernDarkTextColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tagMetaData.modernLightTextColor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tagMetaData.modernLightTextColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || tagMetaData.upDown != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, tagMetaData.upDown);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || tagMetaData.tagGroup != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 11, tagMetaData.tagGroup);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && tagMetaData.showIconText == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 12, tagMetaData.showIconText);
    }

    public TagMetaData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.tagKey = str;
        this.title = str2;
        this.shortTitle = str3;
        this.description = str4;
        this.classicDarkIcon = str5;
        this.classicLightIcon = str6;
        this.modernDarkIcon = str7;
        this.modernLightIcon = str8;
        this.modernDarkTextColor = str9;
        this.modernLightTextColor = str10;
        this.upDown = i;
        this.tagGroup = i2;
        this.showIconText = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0085: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r28v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0052: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r25v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005b: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r26v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0063: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 int) : (0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int):void (m)] (LINE:7) call: com.okinc.business.market.data.model.TagMetaData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int):void type: THIS */
    public /* synthetic */ TagMetaData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4, (i4 & 16) != 0 ? "" : str5, (i4 & 32) != 0 ? "" : str6, (i4 & 64) != 0 ? "" : str7, (i4 & 128) != 0 ? "" : str8, (i4 & 256) != 0 ? "" : str9, (i4 & 512) == 0 ? str10 : "", (i4 & 1024) != 0 ? 0 : i, (i4 & 2048) != 0 ? -1 : i2, (i4 & 4096) == 0 ? i3 : 0);
    }
}
