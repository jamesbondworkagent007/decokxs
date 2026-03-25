package com.okinc.okimcore.model.other;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.OKMentionedInfo;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKUserInfo;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public class OKGroupNotificationMessage extends OKMessageContent {
    public static final String GROUP_OPERATION_ADD = "Add";
    public static final String GROUP_OPERATION_BULLETIN = "Bulletin";
    public static final String GROUP_OPERATION_CREATE = "Create";
    public static final String GROUP_OPERATION_DISMISS = "Dismiss";
    public static final String GROUP_OPERATION_KICKED = "Kicked";
    public static final String GROUP_OPERATION_QUIT = "Quit";
    public static final String GROUP_OPERATION_RENAME = "Rename";
    private String data;
    private String message;
    private String operation;
    private String operatorUserId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null};
    public static final Parcelable.Creator<OKGroupNotificationMessage> CREATOR = new Parcelable.Creator<OKGroupNotificationMessage>() { // from class: com.okinc.okimcore.model.other.OKGroupNotificationMessage$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKGroupNotificationMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKGroupNotificationMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKGroupNotificationMessage[] newArray(int i) {
            return new OKGroupNotificationMessage[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOperation() {
        return this.operation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOperatorUserId() {
        return this.operatorUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setData(String str) {
        this.data = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMessage(String str) {
        this.message = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOperation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.operation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOperatorUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.operatorUserId = str;
    }

    public /* synthetic */ OKGroupNotificationMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, serializationConstructorMarker);
        if ((i & 256) == 0) {
            this.operatorUserId = "";
        } else {
            this.operatorUserId = str3;
        }
        if ((i & 512) == 0) {
            this.operation = "";
        } else {
            this.operation = str4;
        }
        if ((i & 1024) == 0) {
            this.data = null;
        } else {
            this.data = str5;
        }
        if ((i & 2048) == 0) {
            this.message = null;
        } else {
            this.message = str6;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.okimcore.model.im.OKMessageContent.write$Self(com.okinc.okimcore.model.im.OKMessageContent, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    public static final /* synthetic */ void write$Self(OKGroupNotificationMessage oKGroupNotificationMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMessageContent.write$Self(oKGroupNotificationMessage, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) oKGroupNotificationMessage.operatorUserId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, oKGroupNotificationMessage.operatorUserId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) oKGroupNotificationMessage.operation, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, oKGroupNotificationMessage.operation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || oKGroupNotificationMessage.getData() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, oKGroupNotificationMessage.getData());
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && oKGroupNotificationMessage.getMessage() == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, oKGroupNotificationMessage.getMessage());
    }

    public OKGroupNotificationMessage() {
        this.operatorUserId = "";
        this.operation = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKGroupNotificationMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.operatorUserId = "";
        this.operation = "";
        String string = parcel.readString();
        Intrinsics.copydefault((Object) string);
        this.operatorUserId = string;
        String string2 = parcel.readString();
        Intrinsics.copydefault((Object) string2);
        this.operation = string2;
        setData(parcel.readString());
        setMessage(parcel.readString());
    }

    @Override // com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.operatorUserId);
        parcel.writeString(this.operation);
        parcel.writeString(getData());
        parcel.writeString(getMessage());
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.other.OKGroupNotificationMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OKGroupNotificationMessage> serializer() {
            return OKGroupNotificationMessage$$serializer.INSTANCE;
        }
    }
}
