package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKCallCommon {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKCallCommon oKCallCommon, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKCallCommon.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKCallCommon> serializer() {
            return OKCallCommon$$serializer.INSTANCE;
        }
    }

    public OKCallCommon() {
    }

    public /* synthetic */ OKCallCommon(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class CallStatus implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ CallStatus[] $VALUES;
        public static final Parcelable.Creator<CallStatus> CREATOR;
        public static final Application Companion;
        private final int value;
        public static final CallStatus OUTGOING = new CallStatus("OUTGOING", 0, 1);
        public static final CallStatus INCOMING = new CallStatus("INCOMING", 1, 2);
        public static final CallStatus RINGING = new CallStatus("RINGING", 2, 3);
        public static final CallStatus CONNECTED = new CallStatus("CONNECTED", 3, 4);
        public static final CallStatus IDLE = new CallStatus("IDLE", 4, 5);
        public static final CallStatus ACCEPTED = new CallStatus("ACCEPTED", 5, 6);

        /* JADX INFO: loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<CallStatus> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CallStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return CallStatus.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CallStatus[] newArray(int i) {
                return new CallStatus[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ CallStatus[] $values() {
            return new CallStatus[]{OUTGOING, INCOMING, RINGING, CONNECTED, IDLE, ACCEPTED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<CallStatus> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        private CallStatus(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            CallStatus[] callStatusArr$values = $values();
            $VALUES = callStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(callStatusArr$values);
            Companion = new Application(null);
            CREATOR = new Creator();
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKCallCommon.CallStatus.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Application() {
            }
        }

        public static CallStatus valueOf(String str) {
            return (CallStatus) Enum.valueOf(CallStatus.class, str);
        }

        public static CallStatus[] values() {
            return (CallStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class CallEngineType implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ CallEngineType[] $VALUES;
        public static final Parcelable.Creator<CallEngineType> CREATOR;
        public static final Application Companion;
        private final int value;
        public static final CallEngineType ENGINE_TYPE_AGORA = new CallEngineType("ENGINE_TYPE_AGORA", 0, 1);
        public static final CallEngineType ENGINE_TYPE_RONG = new CallEngineType("ENGINE_TYPE_RONG", 1, 2);
        public static final CallEngineType ENGINE_TYPE_BLINK = new CallEngineType("ENGINE_TYPE_BLINK", 2, 3);
        public static final CallEngineType ENGINE_TYPE_RTC = new CallEngineType("ENGINE_TYPE_RTC", 3, 4);

        /* JADX INFO: loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<CallEngineType> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CallEngineType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return CallEngineType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CallEngineType[] newArray(int i) {
                return new CallEngineType[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ CallEngineType[] $values() {
            return new CallEngineType[]{ENGINE_TYPE_AGORA, ENGINE_TYPE_RONG, ENGINE_TYPE_BLINK, ENGINE_TYPE_RTC};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<CallEngineType> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        private CallEngineType(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            CallEngineType[] callEngineTypeArr$values = $values();
            $VALUES = callEngineTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(callEngineTypeArr$values);
            Companion = new Application(null);
            CREATOR = new Creator();
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKCallCommon.CallEngineType.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Application() {
            }
        }

        public static CallEngineType valueOf(String str) {
            return (CallEngineType) Enum.valueOf(CallEngineType.class, str);
        }

        public static CallEngineType[] values() {
            return (CallEngineType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class CallModifyMemType implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ CallModifyMemType[] $VALUES;
        public static final Parcelable.Creator<CallModifyMemType> CREATOR;
        public static final TaskDescription Companion;
        public static final CallModifyMemType MODIFY_MEM_TYPE_ADD = new CallModifyMemType("MODIFY_MEM_TYPE_ADD", 0, 1);
        public static final CallModifyMemType MODIFY_MEM_TYPE_REMOVE = new CallModifyMemType("MODIFY_MEM_TYPE_REMOVE", 1, 2);
        private final int value;

        /* JADX INFO: loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<CallModifyMemType> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CallModifyMemType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return CallModifyMemType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CallModifyMemType[] newArray(int i) {
                return new CallModifyMemType[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ CallModifyMemType[] $values() {
            return new CallModifyMemType[]{MODIFY_MEM_TYPE_ADD, MODIFY_MEM_TYPE_REMOVE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<CallModifyMemType> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        private CallModifyMemType(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            CallModifyMemType[] callModifyMemTypeArr$values = $values();
            $VALUES = callModifyMemTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(callModifyMemTypeArr$values);
            Companion = new TaskDescription(null);
            CREATOR = new Creator();
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKCallCommon.CallModifyMemType.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }
        }

        public static CallModifyMemType valueOf(String str) {
            return (CallModifyMemType) Enum.valueOf(CallModifyMemType.class, str);
        }

        public static CallModifyMemType[] values() {
            return (CallModifyMemType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OKCallDisconnectedReason implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ OKCallDisconnectedReason[] $VALUES;
        public static final Parcelable.Creator<OKCallDisconnectedReason> CREATOR;
        public static final Activity Companion;
        private final int value;
        public static final OKCallDisconnectedReason CANCEL = new OKCallDisconnectedReason("CANCEL", 0, 1);
        public static final OKCallDisconnectedReason REJECT = new OKCallDisconnectedReason("REJECT", 1, 2);
        public static final OKCallDisconnectedReason HANGUP = new OKCallDisconnectedReason("HANGUP", 2, 3);
        public static final OKCallDisconnectedReason BUSY_LINE = new OKCallDisconnectedReason("BUSY_LINE", 3, 4);
        public static final OKCallDisconnectedReason NO_RESPONSE = new OKCallDisconnectedReason("NO_RESPONSE", 4, 5);
        public static final OKCallDisconnectedReason ENGINE_UNSUPPORTED = new OKCallDisconnectedReason("ENGINE_UNSUPPORTED", 5, 6);
        public static final OKCallDisconnectedReason NETWORK_ERROR = new OKCallDisconnectedReason("NETWORK_ERROR", 6, 7);
        public static final OKCallDisconnectedReason INIT_VIDEO_ERROR = new OKCallDisconnectedReason("INIT_VIDEO_ERROR", 7, 8);
        public static final OKCallDisconnectedReason OTHER_DEVICE_HAD_ACCEPTED = new OKCallDisconnectedReason("OTHER_DEVICE_HAD_ACCEPTED", 8, 9);
        public static final OKCallDisconnectedReason REMOTE_CANCEL = new OKCallDisconnectedReason("REMOTE_CANCEL", 9, 11);
        public static final OKCallDisconnectedReason REMOTE_REJECT = new OKCallDisconnectedReason("REMOTE_REJECT", 10, 12);
        public static final OKCallDisconnectedReason REMOTE_HANGUP = new OKCallDisconnectedReason("REMOTE_HANGUP", 11, 13);
        public static final OKCallDisconnectedReason REMOTE_BUSY_LINE = new OKCallDisconnectedReason("REMOTE_BUSY_LINE", 12, 14);
        public static final OKCallDisconnectedReason REMOTE_NO_RESPONSE = new OKCallDisconnectedReason("REMOTE_NO_RESPONSE", 13, 15);
        public static final OKCallDisconnectedReason REMOTE_ENGINE_UNSUPPORTED = new OKCallDisconnectedReason("REMOTE_ENGINE_UNSUPPORTED", 14, 16);
        public static final OKCallDisconnectedReason REMOTE_NETWORK_ERROR = new OKCallDisconnectedReason("REMOTE_NETWORK_ERROR", 15, 17);
        public static final OKCallDisconnectedReason SERVICE_DISCONNECTED = new OKCallDisconnectedReason("SERVICE_DISCONNECTED", 16, 18);
        public static final OKCallDisconnectedReason REJECTED_BY_BLACKLIST = new OKCallDisconnectedReason("REJECTED_BY_BLACKLIST", 17, 19);
        public static final OKCallDisconnectedReason KICKED_BY_SERVER = new OKCallDisconnectedReason("KICKED_BY_SERVER", 18, 21);
        public static final OKCallDisconnectedReason SERVICE_NOT_OPENED = new OKCallDisconnectedReason("SERVICE_NOT_OPENED", 19, 22);
        public static final OKCallDisconnectedReason TERMINATED = new OKCallDisconnectedReason("TERMINATED", 20, 23);

        public static final class Creator implements Parcelable.Creator<OKCallDisconnectedReason> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OKCallDisconnectedReason createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return OKCallDisconnectedReason.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OKCallDisconnectedReason[] newArray(int i) {
                return new OKCallDisconnectedReason[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ OKCallDisconnectedReason[] $values() {
            return new OKCallDisconnectedReason[]{CANCEL, REJECT, HANGUP, BUSY_LINE, NO_RESPONSE, ENGINE_UNSUPPORTED, NETWORK_ERROR, INIT_VIDEO_ERROR, OTHER_DEVICE_HAD_ACCEPTED, REMOTE_CANCEL, REMOTE_REJECT, REMOTE_HANGUP, REMOTE_BUSY_LINE, REMOTE_NO_RESPONSE, REMOTE_ENGINE_UNSUPPORTED, REMOTE_NETWORK_ERROR, SERVICE_DISCONNECTED, REJECTED_BY_BLACKLIST, KICKED_BY_SERVER, SERVICE_NOT_OPENED, TERMINATED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<OKCallDisconnectedReason> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        private OKCallDisconnectedReason(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            OKCallDisconnectedReason[] oKCallDisconnectedReasonArr$values = $values();
            $VALUES = oKCallDisconnectedReasonArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(oKCallDisconnectedReasonArr$values);
            Companion = new Activity(null);
            CREATOR = new Creator();
        }

        public static final class Activity {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKCallCommon.OKCallDisconnectedReason.Activity.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Activity() {
            }
        }

        public static OKCallDisconnectedReason valueOf(String str) {
            return (OKCallDisconnectedReason) Enum.valueOf(OKCallDisconnectedReason.class, str);
        }

        public static OKCallDisconnectedReason[] values() {
            return (OKCallDisconnectedReason[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class CallErrorCode {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ CallErrorCode[] $VALUES;
        public static final TaskDescription Companion;
        public static final CallErrorCode ENGINE_NOT_FOUND = new CallErrorCode("ENGINE_NOT_FOUND", 0, 1);
        private final int value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ CallErrorCode[] $values() {
            return new CallErrorCode[]{ENGINE_NOT_FOUND};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<CallErrorCode> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private CallErrorCode(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            CallErrorCode[] callErrorCodeArr$values = $values();
            $VALUES = callErrorCodeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(callErrorCodeArr$values);
            Companion = new TaskDescription(null);
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKCallCommon.CallErrorCode.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }
        }

        public static CallErrorCode valueOf(String str) {
            return (CallErrorCode) Enum.valueOf(CallErrorCode.class, str);
        }

        public static CallErrorCode[] values() {
            return (CallErrorCode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OKCallMediaType implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ OKCallMediaType[] $VALUES;
        public static final Parcelable.Creator<OKCallMediaType> CREATOR;
        public static final Application Companion;
        private final int value;
        public static final OKCallMediaType AUDIO = new OKCallMediaType("AUDIO", 0, 1);
        public static final OKCallMediaType VIDEO = new OKCallMediaType("VIDEO", 1, 2);

        public static final class Creator implements Parcelable.Creator<OKCallMediaType> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OKCallMediaType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return OKCallMediaType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OKCallMediaType[] newArray(int i) {
                return new OKCallMediaType[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ OKCallMediaType[] $values() {
            return new OKCallMediaType[]{AUDIO, VIDEO};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<OKCallMediaType> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        private OKCallMediaType(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            OKCallMediaType[] oKCallMediaTypeArr$values = $values();
            $VALUES = oKCallMediaTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(oKCallMediaTypeArr$values);
            Companion = new Application(null);
            CREATOR = new Creator();
        }

        public static final class Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKCallCommon.OKCallMediaType.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Application() {
            }
        }

        public static OKCallMediaType valueOf(String str) {
            return (OKCallMediaType) Enum.valueOf(OKCallMediaType.class, str);
        }

        public static OKCallMediaType[] values() {
            return (OKCallMediaType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OKVoiceCallType implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ OKVoiceCallType[] $VALUES;
        public static final Parcelable.Creator<OKVoiceCallType> CREATOR;
        public static final StateListAnimator Companion;
        public static final OKVoiceCallType QUEUE = new OKVoiceCallType("QUEUE", 0);
        public static final OKVoiceCallType GROUP = new OKVoiceCallType("GROUP", 1);
        public static final OKVoiceCallType DEFAULT = new OKVoiceCallType("DEFAULT", 2);

        public static final class Creator implements Parcelable.Creator<OKVoiceCallType> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OKVoiceCallType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return OKVoiceCallType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OKVoiceCallType[] newArray(int i) {
                return new OKVoiceCallType[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ OKVoiceCallType[] $values() {
            return new OKVoiceCallType[]{QUEUE, GROUP, DEFAULT};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<OKVoiceCallType> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        private OKVoiceCallType(String str, int i) {
        }

        static {
            OKVoiceCallType[] oKVoiceCallTypeArr$values = $values();
            $VALUES = oKVoiceCallTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(oKVoiceCallTypeArr$values);
            Companion = new StateListAnimator(null);
            CREATOR = new Creator();
        }

        public static final class StateListAnimator {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKCallCommon.OKVoiceCallType.StateListAnimator.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private StateListAnimator() {
            }
        }

        public static OKVoiceCallType valueOf(String str) {
            return (OKVoiceCallType) Enum.valueOf(OKVoiceCallType.class, str);
        }

        public static OKVoiceCallType[] values() {
            return (OKVoiceCallType[]) $VALUES.clone();
        }
    }
}
