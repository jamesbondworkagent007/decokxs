package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.OKCustomMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import o.C33129mqd;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.pUU;
import o.sHW;
import o.sHY;
import o.sJU;
import o.sSR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKGroupVoiceCallMessage extends OKCustomMessage implements sJU<OKGroupVoiceCallMessage> {
    public static final String BIZ_NAME_AGORA_CALL_END = "AgoraCallEnded";
    public static final String BIZ_NAME_AGORA_CALL_ONGOING = "AgoraCallOngoing";
    private GroupVoiceCallData groupVoiceCallData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null};
    public static final Parcelable.Creator<OKGroupVoiceCallMessage> CREATOR = new Parcelable.Creator<OKGroupVoiceCallMessage>() { // from class: com.okinc.okimcore.model.im.OKGroupVoiceCallMessage$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKGroupVoiceCallMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKGroupVoiceCallMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKGroupVoiceCallMessage[] newArray(int i) {
            return new OKGroupVoiceCallMessage[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sJU
    public String encodeToInHouseCustomContent() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String encodeToRCJson() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupVoiceCallData getGroupVoiceCallData() {
        return this.groupVoiceCallData;
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage
    public OKCustomMessage.Application getPushData() {
        return null;
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage
    public boolean isAllowInAppPush() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupVoiceCallData(GroupVoiceCallData groupVoiceCallData) {
        this.groupVoiceCallData = groupVoiceCallData;
    }

    public /* synthetic */ OKGroupVoiceCallMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, String str8, String str9, GroupVoiceCallData groupVoiceCallData, SerializationConstructorMarker serializationConstructorMarker) {
        OKGroupVoiceCallMessage oKGroupVoiceCallMessage;
        GroupVoiceCallData groupVoiceCallData2;
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, str3, str4, str5, str6, str7, jsonObject, str8, str9, serializationConstructorMarker);
        if ((i & 65536) == 0) {
            groupVoiceCallData2 = null;
            oKGroupVoiceCallMessage = this;
        } else {
            oKGroupVoiceCallMessage = this;
            groupVoiceCallData2 = groupVoiceCallData;
        }
        oKGroupVoiceCallMessage.groupVoiceCallData = groupVoiceCallData2;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKGroupVoiceCallMessage oKGroupVoiceCallMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKCustomMessage.write$Self((OKCustomMessage) oKGroupVoiceCallMessage, compositeEncoder, serialDescriptor);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && oKGroupVoiceCallMessage.groupVoiceCallData == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, GroupVoiceCallData$$serializer.INSTANCE, oKGroupVoiceCallMessage.groupVoiceCallData);
    }

    public OKGroupVoiceCallMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OKGroupVoiceCallMessage(@NotNull Parcel parcel) {
        Object objM7377constructorimpl;
        Object objDecodeFromString;
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        String string = parcel.readString();
        GroupVoiceCallData groupVoiceCallData = null;
        if (string != null) {
            try {
                Result.Application application = Result.Companion;
                sHY shyCopydefault = sHW.copydefault();
                try {
                    try {
                        Json jsonKWHzl = shyCopydefault.KWHzl();
                        shyCopydefault.KWHzl().getSerializersModule();
                        objDecodeFromString = jsonKWHzl.decodeFromString(BuiltinSerializersKt.getNullable(GroupVoiceCallData.Companion.serializer()), string);
                    } catch (SerializationException e) {
                        pUU.copydefault("SafeJson", "decodeFromString SerializationException: " + e.getMessage());
                        sSR.copydefault("decodeFromString SerializationException", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e.getMessage()))));
                        objDecodeFromString = null;
                        objM7377constructorimpl = Result.m7377constructorimpl((GroupVoiceCallData) objDecodeFromString);
                        groupVoiceCallData = (GroupVoiceCallData) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                        this.groupVoiceCallData = groupVoiceCallData;
                    }
                } catch (Exception e2) {
                    pUU.copydefault("SafeJson", "decodeFromString error: " + e2.getMessage());
                    sSR.copydefault("decodeFromString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e2.getMessage()))));
                    objDecodeFromString = null;
                    objM7377constructorimpl = Result.m7377constructorimpl((GroupVoiceCallData) objDecodeFromString);
                    groupVoiceCallData = (GroupVoiceCallData) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                    this.groupVoiceCallData = groupVoiceCallData;
                }
                objM7377constructorimpl = Result.m7377constructorimpl((GroupVoiceCallData) objDecodeFromString);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            groupVoiceCallData = (GroupVoiceCallData) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        }
        this.groupVoiceCallData = groupVoiceCallData;
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage, com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Object objM7377constructorimpl;
        String strEncodeToString = "";
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        GroupVoiceCallData groupVoiceCallData = this.groupVoiceCallData;
        String str = null;
        if (groupVoiceCallData != null) {
            try {
                Result.Application application = Result.Companion;
                try {
                    strEncodeToString = sHW.copydefault().KWHzl().encodeToString(GroupVoiceCallData.Companion.serializer(), groupVoiceCallData);
                } catch (Exception e) {
                    pUU.copydefault("SafeJson", "encodeToString with multiple parameters error: " + e.getMessage());
                    sSR.copydefault("encodeToString with multiple parameters Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e.getMessage()))));
                }
                objM7377constructorimpl = Result.m7377constructorimpl(strEncodeToString);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            str = (String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        }
        parcel.writeString(str);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKGroupVoiceCallMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OKGroupVoiceCallMessage> serializer() {
            return OKGroupVoiceCallMessage$$serializer.INSTANCE;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: decodeFromRcJson(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: decodeFromRcJson, reason: merged with bridge method [inline-methods] */
    public OKGroupVoiceCallMessage m6878decodeFromRcJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OKGroupVoiceCallMessage();
    }

    /* JADX DEBUG: Method merged with bridge method: decodeFromInHouseCustomContent(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.sJU
    public OKGroupVoiceCallMessage decodeFromInHouseCustomContent(String str) {
        try {
            Result.Application application = Result.Companion;
            GroupVoiceCallData groupVoiceCallData = null;
            objDecodeFromString = null;
            Object objDecodeFromString = null;
            if (str != null) {
                sHY shyCopydefault = sHW.copydefault();
                try {
                    Json jsonKWHzl = shyCopydefault.KWHzl();
                    shyCopydefault.KWHzl().getSerializersModule();
                    objDecodeFromString = jsonKWHzl.decodeFromString(BuiltinSerializersKt.getNullable(GroupVoiceCallData.Companion.serializer()), str);
                } catch (SerializationException e) {
                    pUU.copydefault("SafeJson", "decodeFromString SerializationException: " + e.getMessage());
                    sSR.copydefault("decodeFromString SerializationException", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e.getMessage()))));
                } catch (Exception e2) {
                    pUU.copydefault("SafeJson", "decodeFromString error: " + e2.getMessage());
                    sSR.copydefault("decodeFromString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e2.getMessage()))));
                }
                groupVoiceCallData = (GroupVoiceCallData) objDecodeFromString;
            }
            this.groupVoiceCallData = groupVoiceCallData;
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return this;
    }
}
