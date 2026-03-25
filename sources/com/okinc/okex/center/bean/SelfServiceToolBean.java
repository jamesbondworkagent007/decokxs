package com.okinc.okex.center.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okex.center.bean.enums.SelfServiceScenario;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import o.C45305snL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class SelfServiceToolBean implements Parcelable {
    private final String adaGreeting;
    private final String contextualBot;
    private final String dataTrackingKey;
    private final String deeplink;
    private final String description;
    private final JsonObject extra;
    private final String iconBright;
    private final String iconDark;
    private final String id;
    private final String okAssistantGreeting;
    private final Boolean primary;
    private final SelfServiceScenario scenario;
    private final String slug;
    private final String title;
    private final String url;
    private final String xbotGreeting;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SelfServiceToolBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, SelfServiceScenario.Companion.serializer(), null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<SelfServiceToolBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelfServiceToolBean createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            SelfServiceScenario selfServiceScenarioValueOf = SelfServiceScenario.valueOf(parcel.readString());
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            JsonObject jsonObjectOLrzqt = C45305snL.EZpvd.OLrzqt(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SelfServiceToolBean(string, string2, string3, string4, string5, string6, selfServiceScenarioValueOf, string7, string8, string9, string10, string11, string12, string13, jsonObjectOLrzqt, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelfServiceToolBean[] newArray(int i) {
            return new SelfServiceToolBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.adaGreeting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.contextualBot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.okAssistantGreeting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.xbotGreeting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component15() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component16() {
        return this.primary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.dataTrackingKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.description;
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
    public final SelfServiceScenario component7() {
        return this.scenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceToolBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull SelfServiceScenario selfServiceScenario, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, JsonObject jsonObject, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(selfServiceScenario, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        return new SelfServiceToolBean(str, str2, str3, str4, str5, str6, selfServiceScenario, str7, str8, str9, str10, str11, str12, str13, jsonObject, bool);
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
        if (!(obj instanceof SelfServiceToolBean)) {
            return false;
        }
        SelfServiceToolBean selfServiceToolBean = (SelfServiceToolBean) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) selfServiceToolBean.id) && Intrinsics.EZpvd((Object) this.dataTrackingKey, (Object) selfServiceToolBean.dataTrackingKey) && Intrinsics.EZpvd((Object) this.deeplink, (Object) selfServiceToolBean.deeplink) && Intrinsics.EZpvd((Object) this.description, (Object) selfServiceToolBean.description) && Intrinsics.EZpvd((Object) this.iconBright, (Object) selfServiceToolBean.iconBright) && Intrinsics.EZpvd((Object) this.iconDark, (Object) selfServiceToolBean.iconDark) && this.scenario == selfServiceToolBean.scenario && Intrinsics.EZpvd((Object) this.slug, (Object) selfServiceToolBean.slug) && Intrinsics.EZpvd((Object) this.title, (Object) selfServiceToolBean.title) && Intrinsics.EZpvd((Object) this.url, (Object) selfServiceToolBean.url) && Intrinsics.EZpvd((Object) this.adaGreeting, (Object) selfServiceToolBean.adaGreeting) && Intrinsics.EZpvd((Object) this.contextualBot, (Object) selfServiceToolBean.contextualBot) && Intrinsics.EZpvd((Object) this.okAssistantGreeting, (Object) selfServiceToolBean.okAssistantGreeting) && Intrinsics.EZpvd((Object) this.xbotGreeting, (Object) selfServiceToolBean.xbotGreeting) && Intrinsics.EZpvd(this.extra, selfServiceToolBean.extra) && Intrinsics.EZpvd(this.primary, selfServiceToolBean.primary);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdaGreeting() {
        return this.adaGreeting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContextualBot() {
        return this.contextualBot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDataTrackingKey() {
        return this.dataTrackingKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getExtra() {
        return this.extra;
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
    public final String getOkAssistantGreeting() {
        return this.okAssistantGreeting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPrimary() {
        return this.primary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceScenario getScenario() {
        return this.scenario;
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
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getXbotGreeting() {
        return this.xbotGreeting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.dataTrackingKey.hashCode();
        int iHashCode3 = this.deeplink.hashCode();
        int iHashCode4 = this.description.hashCode();
        int iHashCode5 = this.iconBright.hashCode();
        int iHashCode6 = this.iconDark.hashCode();
        int iHashCode7 = this.scenario.hashCode();
        int iHashCode8 = this.slug.hashCode();
        int iHashCode9 = this.title.hashCode();
        int iHashCode10 = this.url.hashCode();
        int iHashCode11 = this.adaGreeting.hashCode();
        int iHashCode12 = this.contextualBot.hashCode();
        int iHashCode13 = this.okAssistantGreeting.hashCode();
        int iHashCode14 = this.xbotGreeting.hashCode();
        JsonObject jsonObject = this.extra;
        int iHashCode15 = jsonObject == null ? 0 : jsonObject.hashCode();
        Boolean bool = this.primary;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SelfServiceToolBean(id=" + this.id + ", dataTrackingKey=" + this.dataTrackingKey + ", deeplink=" + this.deeplink + ", description=" + this.description + ", iconBright=" + this.iconBright + ", iconDark=" + this.iconDark + ", scenario=" + this.scenario + ", slug=" + this.slug + ", title=" + this.title + ", url=" + this.url + ", adaGreeting=" + this.adaGreeting + ", contextualBot=" + this.contextualBot + ", okAssistantGreeting=" + this.okAssistantGreeting + ", xbotGreeting=" + this.xbotGreeting + ", extra=" + this.extra + ", primary=" + this.primary + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.dataTrackingKey);
        parcel.writeString(this.deeplink);
        parcel.writeString(this.description);
        parcel.writeString(this.iconBright);
        parcel.writeString(this.iconDark);
        parcel.writeString(this.scenario.name());
        parcel.writeString(this.slug);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.adaGreeting);
        parcel.writeString(this.contextualBot);
        parcel.writeString(this.okAssistantGreeting);
        parcel.writeString(this.xbotGreeting);
        C45305snL.EZpvd.KWHzl(this.extra, parcel, i);
        Boolean bool = this.primary;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.SelfServiceToolBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SelfServiceToolBean> serializer() {
            return SelfServiceToolBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SelfServiceToolBean(int i, String str, String str2, String str3, String str4, String str5, String str6, SelfServiceScenario selfServiceScenario, String str7, String str8, String str9, String str10, String str11, String str12, String str13, JsonObject jsonObject, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, SelfServiceToolBean$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.dataTrackingKey = "";
        } else {
            this.dataTrackingKey = str2;
        }
        if ((i & 4) == 0) {
            this.deeplink = "";
        } else {
            this.deeplink = str3;
        }
        if ((i & 8) == 0) {
            this.description = "";
        } else {
            this.description = str4;
        }
        if ((i & 16) == 0) {
            this.iconBright = "";
        } else {
            this.iconBright = str5;
        }
        if ((i & 32) == 0) {
            this.iconDark = "";
        } else {
            this.iconDark = str6;
        }
        this.scenario = (i & 64) == 0 ? SelfServiceScenario.UNKNOWN : selfServiceScenario;
        if ((i & 128) == 0) {
            this.slug = "";
        } else {
            this.slug = str7;
        }
        if ((i & 256) == 0) {
            this.title = "";
        } else {
            this.title = str8;
        }
        if ((i & 512) == 0) {
            this.url = "";
        } else {
            this.url = str9;
        }
        if ((i & 1024) == 0) {
            this.adaGreeting = "";
        } else {
            this.adaGreeting = str10;
        }
        if ((i & 2048) == 0) {
            this.contextualBot = "";
        } else {
            this.contextualBot = str11;
        }
        if ((i & 4096) == 0) {
            this.okAssistantGreeting = "";
        } else {
            this.okAssistantGreeting = str12;
        }
        if ((i & 8192) == 0) {
            this.xbotGreeting = "";
        } else {
            this.xbotGreeting = str13;
        }
        this.extra = (i & 16384) == 0 ? null : jsonObject;
        this.primary = (i & 32768) == 0 ? Boolean.FALSE : bool;
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(SelfServiceToolBean selfServiceToolBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, selfServiceToolBean.id);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) selfServiceToolBean.dataTrackingKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, selfServiceToolBean.dataTrackingKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) selfServiceToolBean.deeplink, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, selfServiceToolBean.deeplink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) selfServiceToolBean.description, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, selfServiceToolBean.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) selfServiceToolBean.iconBright, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, selfServiceToolBean.iconBright);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) selfServiceToolBean.iconDark, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, selfServiceToolBean.iconDark);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || selfServiceToolBean.scenario != SelfServiceScenario.UNKNOWN) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], selfServiceToolBean.scenario);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) selfServiceToolBean.slug, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, selfServiceToolBean.slug);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) selfServiceToolBean.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, selfServiceToolBean.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) selfServiceToolBean.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, selfServiceToolBean.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) selfServiceToolBean.adaGreeting, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, selfServiceToolBean.adaGreeting);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) selfServiceToolBean.contextualBot, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, selfServiceToolBean.contextualBot);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) selfServiceToolBean.okAssistantGreeting, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, selfServiceToolBean.okAssistantGreeting);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) selfServiceToolBean.xbotGreeting, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, selfServiceToolBean.xbotGreeting);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || selfServiceToolBean.extra != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, JsonObjectSerializer.INSTANCE, selfServiceToolBean.extra);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && Intrinsics.EZpvd(selfServiceToolBean.primary, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, selfServiceToolBean.primary);
    }

    public SelfServiceToolBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull SelfServiceScenario selfServiceScenario, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, JsonObject jsonObject, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(selfServiceScenario, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        this.id = str;
        this.dataTrackingKey = str2;
        this.deeplink = str3;
        this.description = str4;
        this.iconBright = str5;
        this.iconDark = str6;
        this.scenario = selfServiceScenario;
        this.slug = str7;
        this.title = str8;
        this.url = str9;
        this.adaGreeting = str10;
        this.contextualBot = str11;
        this.okAssistantGreeting = str12;
        this.xbotGreeting = str13;
        this.extra = jsonObject;
        this.primary = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a1: CONSTRUCTOR 
  (r17v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r33v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r33v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r33v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r33v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:com.okinc.okex.center.bean.enums.SelfServiceScenario:?: TERNARY null = ((wrap:int:0x002c: ARITH (r33v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0030: SGET  A[WRAPPED] (LINE:42) com.okinc.okex.center.bean.enums.SelfServiceScenario.UNKNOWN com.okinc.okex.center.bean.enums.SelfServiceScenario) : (r23v0 com.okinc.okex.center.bean.enums.SelfServiceScenario))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r33v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r33v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r33v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r33v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r33v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r33v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r33v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : (""))
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x006c: ARITH (r33v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r31v0 kotlinx.serialization.json.JsonObject))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0077: ARITH (r33v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x007a: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r32v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.center.bean.enums.SelfServiceScenario, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject, java.lang.Boolean):void (m)] (LINE:35) call: com.okinc.okex.center.bean.SelfServiceToolBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.center.bean.enums.SelfServiceScenario, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject, java.lang.Boolean):void type: THIS */
    public /* synthetic */ SelfServiceToolBean(String str, String str2, String str3, String str4, String str5, String str6, SelfServiceScenario selfServiceScenario, String str7, String str8, String str9, String str10, String str11, String str12, String str13, JsonObject jsonObject, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? SelfServiceScenario.UNKNOWN : selfServiceScenario, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) == 0 ? str13 : "", (i & 16384) != 0 ? null : jsonObject, (i & 32768) != 0 ? Boolean.FALSE : bool);
    }
}
