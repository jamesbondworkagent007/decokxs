package com.okinc.auth.api.passkey;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class TargetDeviceVerificationInfoEvent implements Parcelable {
    public static final int $stable = 0;
    public final Data data;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TargetDeviceVerificationInfoEvent> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TargetDeviceVerificationInfoEvent> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TargetDeviceVerificationInfoEvent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TargetDeviceVerificationInfoEvent(Data.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TargetDeviceVerificationInfoEvent[] newArray(int i) {
            return new TargetDeviceVerificationInfoEvent[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TargetDeviceVerificationInfoEvent copy$default(TargetDeviceVerificationInfoEvent targetDeviceVerificationInfoEvent, Data data, int i, Object obj) {
        if ((i & 1) != 0) {
            data = targetDeviceVerificationInfoEvent.data;
        }
        return targetDeviceVerificationInfoEvent.KWHzl(data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TargetDeviceVerificationInfoEvent KWHzl(@NotNull Data data) {
        Intrinsics.checkNotNullParameter(data, "");
        return new TargetDeviceVerificationInfoEvent(data);
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
        return (obj instanceof TargetDeviceVerificationInfoEvent) && Intrinsics.EZpvd(this.data, ((TargetDeviceVerificationInfoEvent) obj).data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.data.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TargetDeviceVerificationInfoEvent(data=" + this.data + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.data.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.passkey.TargetDeviceVerificationInfoEvent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TargetDeviceVerificationInfoEvent> serializer() {
            return TargetDeviceVerificationInfoEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TargetDeviceVerificationInfoEvent(int i, Data data, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, TargetDeviceVerificationInfoEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.data = data;
    }

    public TargetDeviceVerificationInfoEvent(@NotNull Data data) {
        Intrinsics.checkNotNullParameter(data, "");
        this.data = data;
    }

    @Serializable
    public static final class Data implements Parcelable {
        public static final int $stable = 0;
        public final String crossDevicePasskeySessionId;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Data> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Data> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Data createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Data(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Data[] newArray(int i) {
                return new Data[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Data() {
            this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Data copy$default(Data data, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = data.crossDevicePasskeySessionId;
            }
            return data.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Data AEQbTJ(String str) {
            return new Data(str);
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
            return (obj instanceof Data) && Intrinsics.EZpvd((Object) this.crossDevicePasskeySessionId, (Object) ((Data) obj).crossDevicePasskeySessionId);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.crossDevicePasskeySessionId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Data(crossDevicePasskeySessionId=" + this.crossDevicePasskeySessionId + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.crossDevicePasskeySessionId);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.passkey.TargetDeviceVerificationInfoEvent.Data.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Data> serializer() {
                return TargetDeviceVerificationInfoEvent$Data$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Data(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.crossDevicePasskeySessionId = null;
            } else {
                this.crossDevicePasskeySessionId = str;
            }
        }

        public static final /* synthetic */ void EZpvd(Data data, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && data.crossDevicePasskeySessionId == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, data.crossDevicePasskeySessionId);
        }

        public Data(String str) {
            this.crossDevicePasskeySessionId = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:33) call: com.okinc.auth.api.passkey.TargetDeviceVerificationInfoEvent.Data.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ Data(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }
}
