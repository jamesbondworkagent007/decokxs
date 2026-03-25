package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public class OKCustomMessage extends OKMessageContent {

    @SerializedName("bizName")
    private String bizName;

    @SerializedName("content")
    private String content;

    @SerializedName("frontendOption")
    private String frontendOption;

    @SerializedName("option")
    private String option;

    @SerializedName("preview")
    private String preview;

    @SerializedName("pushData")
    private JsonObject pushData;

    @SerializedName("pushTemplate")
    private String pushTemplate;

    @SerializedName("serviceName")
    private String serviceName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null};
    public static final Parcelable.Creator<OKCustomMessage> CREATOR = new Parcelable.Creator<OKCustomMessage>() { // from class: com.okinc.okimcore.model.im.OKCustomMessage$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKCustomMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKCustomMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKCustomMessage[] newArray(int i) {
            return new OKCustomMessage[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizName() {
        return this.bizName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrontendOption() {
        return this.frontendOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOption() {
        return this.option;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreview() {
        return this.preview;
    }

    public Application getPushData() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getPushData, reason: collision with other method in class */
    public final JsonObject m6872getPushData() {
        return this.pushData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPushTemplate() {
        return this.pushTemplate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceName() {
        return this.serviceName;
    }

    public boolean isAllowInAppPush() {
        return true;
    }

    public boolean isSystemMessage() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizName(String str) {
        this.bizName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(String str) {
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrontendOption(String str) {
        this.frontendOption = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOption(String str) {
        this.option = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreview(String str) {
        this.preview = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPushData(JsonObject jsonObject) {
        this.pushData = jsonObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPushTemplate(String str) {
        this.pushTemplate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setServiceName(String str) {
        this.serviceName = str;
    }

    public /* synthetic */ OKCustomMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, serializationConstructorMarker);
        if ((i & 256) == 0) {
            this.serviceName = null;
        } else {
            this.serviceName = str3;
        }
        if ((i & 512) == 0) {
            this.bizName = null;
        } else {
            this.bizName = str4;
        }
        if ((i & 1024) == 0) {
            this.preview = null;
        } else {
            this.preview = str5;
        }
        if ((i & 2048) == 0) {
            this.content = null;
        } else {
            this.content = str6;
        }
        if ((i & 4096) == 0) {
            this.pushTemplate = null;
        } else {
            this.pushTemplate = str7;
        }
        if ((i & 8192) == 0) {
            this.pushData = null;
        } else {
            this.pushData = jsonObject;
        }
        if ((i & 16384) == 0) {
            this.option = null;
        } else {
            this.option = str8;
        }
        if ((32768 & i) == 0) {
            this.frontendOption = null;
        } else {
            this.frontendOption = str9;
        }
    }

    public static final /* synthetic */ void write$Self(OKCustomMessage oKCustomMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMessageContent.write$Self(oKCustomMessage, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || oKCustomMessage.serviceName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, oKCustomMessage.serviceName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || oKCustomMessage.bizName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, oKCustomMessage.bizName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || oKCustomMessage.preview != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, oKCustomMessage.preview);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || oKCustomMessage.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, oKCustomMessage.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || oKCustomMessage.pushTemplate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, oKCustomMessage.pushTemplate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || oKCustomMessage.pushData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, JsonObjectSerializer.INSTANCE, oKCustomMessage.pushData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || oKCustomMessage.option != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, oKCustomMessage.option);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && oKCustomMessage.frontendOption == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, oKCustomMessage.frontendOption);
    }

    public OKCustomMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OKCustomMessage(@NotNull Parcel parcel) {
        JsonObject jsonObject;
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.serviceName = parcel.readString();
        this.bizName = parcel.readString();
        this.preview = parcel.readString();
        this.content = parcel.readString();
        this.pushTemplate = parcel.readString();
        String string = parcel.readString();
        if (string != null) {
            Json.Default r1 = Json.Default;
            r1.getSerializersModule();
            Object objDecodeFromString = r1.decodeFromString(BuiltinSerializersKt.getNullable(JsonObject.Companion.serializer()), string);
            jsonObject = objDecodeFromString instanceof JsonObject ? (JsonObject) objDecodeFromString : null;
        }
        this.pushData = jsonObject;
        this.option = parcel.readString();
        this.frontendOption = parcel.readString();
    }

    @Override // com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.serviceName);
        parcel.writeString(this.bizName);
        parcel.writeString(this.preview);
        parcel.writeString(this.content);
        parcel.writeString(this.pushTemplate);
        Json.Default r4 = Json.Default;
        JsonObject jsonObject = this.pushData;
        r4.getSerializersModule();
        parcel.writeString(r4.encodeToString(BuiltinSerializersKt.getNullable(JsonObject.Companion.serializer()), jsonObject));
        parcel.writeString(this.option);
        parcel.writeString(this.frontendOption);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKCustomMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OKCustomMessage> serializer() {
            return OKCustomMessage$$serializer.INSTANCE;
        }
    }

    public static final class Application {
        public final String EZpvd;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = application.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = application.EZpvd;
            }
            return application.copydefault(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(String str, String str2) {
            return new Application(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) application.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) application.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.copydefault;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.EZpvd;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "IMPushData(title=" + this.copydefault + ", content=" + this.EZpvd + ")";
        }

        public Application(String str, String str2) {
            this.copydefault = str;
            this.EZpvd = str2;
        }
    }
}
