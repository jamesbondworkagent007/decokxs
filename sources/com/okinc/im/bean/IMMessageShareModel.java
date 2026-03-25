package com.okinc.im.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class IMMessageShareModel implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final String bizName;
    private final String content;
    private final CTAType ctaType;
    private final String deeplink;
    private final Map<String, String> extra;
    private final String image;
    private final String imageBase64;
    private final String messagePreview;
    private final String shortLink;
    private final String tagline;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<IMMessageShareModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<IMMessageShareModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IMMessageShareModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            CTAType cTATypeValueOf = parcel.readInt() == 0 ? null : CTAType.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new IMMessageShareModel(string, string2, string3, string4, string5, string6, string7, string8, cTATypeValueOf, linkedHashMap, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IMMessageShareModel[] newArray(int i) {
            return new IMMessageShareModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component10() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.bizName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.messagePreview;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.imageBase64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.shortLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tagline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAType component9() {
        return this.ctaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IMMessageShareModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CTAType cTAType, Map<String, String> map, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str9, "");
        return new IMMessageShareModel(str, str2, str3, str4, str5, str6, str7, str8, cTAType, map, str9);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMMessageShareModel)) {
            return false;
        }
        IMMessageShareModel iMMessageShareModel = (IMMessageShareModel) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) iMMessageShareModel.title) && Intrinsics.EZpvd((Object) this.content, (Object) iMMessageShareModel.content) && Intrinsics.EZpvd((Object) this.messagePreview, (Object) iMMessageShareModel.messagePreview) && Intrinsics.EZpvd((Object) this.image, (Object) iMMessageShareModel.image) && Intrinsics.EZpvd((Object) this.imageBase64, (Object) iMMessageShareModel.imageBase64) && Intrinsics.EZpvd((Object) this.deeplink, (Object) iMMessageShareModel.deeplink) && Intrinsics.EZpvd((Object) this.shortLink, (Object) iMMessageShareModel.shortLink) && Intrinsics.EZpvd((Object) this.tagline, (Object) iMMessageShareModel.tagline) && this.ctaType == iMMessageShareModel.ctaType && Intrinsics.EZpvd(this.extra, iMMessageShareModel.extra) && Intrinsics.EZpvd((Object) this.bizName, (Object) iMMessageShareModel.bizName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizName() {
        return this.bizName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAType getCtaType() {
        return this.ctaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getExtra() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImage() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageBase64() {
        return this.imageBase64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessagePreview() {
        return this.messagePreview;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortLink() {
        return this.shortLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTagline() {
        return this.tagline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.title;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.content;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.messagePreview;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.image;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.imageBase64;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.deeplink;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.shortLink;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.tagline;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        CTAType cTAType = this.ctaType;
        int iHashCode9 = cTAType == null ? 0 : cTAType.hashCode();
        Map<String, String> map = this.extra;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (map != null ? map.hashCode() : 0)) * 31) + this.bizName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IMMessageShareModel(title=" + this.title + ", content=" + this.content + ", messagePreview=" + this.messagePreview + ", image=" + this.image + ", imageBase64=" + this.imageBase64 + ", deeplink=" + this.deeplink + ", shortLink=" + this.shortLink + ", tagline=" + this.tagline + ", ctaType=" + this.ctaType + ", extra=" + this.extra + ", bizName=" + this.bizName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.messagePreview);
        parcel.writeString(this.image);
        parcel.writeString(this.imageBase64);
        parcel.writeString(this.deeplink);
        parcel.writeString(this.shortLink);
        parcel.writeString(this.tagline);
        CTAType cTAType = this.ctaType;
        if (cTAType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cTAType.name());
        }
        Map<String, String> map = this.extra;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeString(this.bizName);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.bean.IMMessageShareModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IMMessageShareModel> serializer() {
            return IMMessageShareModel$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.im.bean.IMMessageShareModel.CTAType", CTAType.values()), new LinkedHashMapSerializer(stringSerializer, stringSerializer), null};
    }

    public /* synthetic */ IMMessageShareModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CTAType cTAType, Map map, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (1024 != (i & 1024)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1024, IMMessageShareModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.content = null;
        } else {
            this.content = str2;
        }
        if ((i & 4) == 0) {
            this.messagePreview = null;
        } else {
            this.messagePreview = str3;
        }
        if ((i & 8) == 0) {
            this.image = null;
        } else {
            this.image = str4;
        }
        if ((i & 16) == 0) {
            this.imageBase64 = null;
        } else {
            this.imageBase64 = str5;
        }
        if ((i & 32) == 0) {
            this.deeplink = null;
        } else {
            this.deeplink = str6;
        }
        if ((i & 64) == 0) {
            this.shortLink = null;
        } else {
            this.shortLink = str7;
        }
        if ((i & 128) == 0) {
            this.tagline = null;
        } else {
            this.tagline = str8;
        }
        if ((i & 256) == 0) {
            this.ctaType = null;
        } else {
            this.ctaType = cTAType;
        }
        if ((i & 512) == 0) {
            this.extra = null;
        } else {
            this.extra = map;
        }
        this.bizName = str9;
    }

    public static final /* synthetic */ void write$Self$OKIM_okim_api(IMMessageShareModel iMMessageShareModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || iMMessageShareModel.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, iMMessageShareModel.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || iMMessageShareModel.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, iMMessageShareModel.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || iMMessageShareModel.messagePreview != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, iMMessageShareModel.messagePreview);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || iMMessageShareModel.image != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, iMMessageShareModel.image);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || iMMessageShareModel.imageBase64 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, iMMessageShareModel.imageBase64);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || iMMessageShareModel.deeplink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, iMMessageShareModel.deeplink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || iMMessageShareModel.shortLink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, iMMessageShareModel.shortLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || iMMessageShareModel.tagline != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, iMMessageShareModel.tagline);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || iMMessageShareModel.ctaType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], iMMessageShareModel.ctaType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || iMMessageShareModel.extra != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], iMMessageShareModel.extra);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 10, iMMessageShareModel.bizName);
    }

    public IMMessageShareModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CTAType cTAType, Map<String, String> map, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str9, "");
        this.title = str;
        this.content = str2;
        this.messagePreview = str3;
        this.image = str4;
        this.imageBase64 = str5;
        this.deeplink = str6;
        this.shortLink = str7;
        this.tagline = str8;
        this.ctaType = cTAType;
        this.extra = map;
        this.bizName = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0056: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:com.okinc.im.bean.IMMessageShareModel$CTAType:?: TERNARY null = ((wrap:int:0x0043: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.im.bean.IMMessageShareModel$CTAType) : (r24v0 com.okinc.im.bean.IMMessageShareModel$CTAType))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x004b: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r25v0 java.util.Map))
  (r26v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.im.bean.IMMessageShareModel$CTAType, java.util.Map<java.lang.String, java.lang.String>, java.lang.String):void (m)] (LINE:13) call: com.okinc.im.bean.IMMessageShareModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.im.bean.IMMessageShareModel$CTAType, java.util.Map, java.lang.String):void type: THIS */
    public /* synthetic */ IMMessageShareModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CTAType cTAType, Map map, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : cTAType, (i & 512) != 0 ? null : map, str9);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CTAType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ CTAType[] $VALUES;
        private final int value;

        @SerializedName("0")
        public static final CTAType NoCTA = new CTAType("NoCTA", 0, 0);

        @SerializedName("1")
        public static final CTAType TradeNow = new CTAType("TradeNow", 1, 1);

        @SerializedName("2")
        public static final CTAType ViewMore = new CTAType("ViewMore", 2, 2);

        @SerializedName("3")
        public static final CTAType CopyNow = new CTAType("CopyNow", 3, 3);

        @SerializedName("4")
        public static final CTAType FollowNow = new CTAType("FollowNow", 4, 4);

        @SerializedName("5")
        public static final CTAType WatchNow = new CTAType("WatchNow", 5, 5);

        @SerializedName(OrderDetailListItem.SLIP_OUT)
        public static final CTAType JoinNow = new CTAType("JoinNow", 6, 6);

        @SerializedName("7")
        public static final CTAType ClaimNow = new CTAType("ClaimNow", 7, 7);

        @SerializedName("8")
        public static final CTAType ShareNow = new CTAType("ShareNow", 8, 8);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ CTAType[] $values() {
            return new CTAType[]{NoCTA, TradeNow, ViewMore, CopyNow, FollowNow, WatchNow, JoinNow, ClaimNow, ShareNow};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<CTAType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private CTAType(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            CTAType[] cTATypeArr$values = $values();
            $VALUES = cTATypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(cTATypeArr$values);
        }

        public static CTAType valueOf(String str) {
            return (CTAType) Enum.valueOf(CTAType.class, str);
        }

        public static CTAType[] values() {
            return (CTAType[]) $VALUES.clone();
        }
    }
}
