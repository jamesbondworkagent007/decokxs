package com.okinc.okimcore.model.other;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InfoNtfExtraData implements Parcelable {
    public static final int $stable = 0;
    private final String bizData;
    private final int bizType;
    private final String senderId;
    private final String targetId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InfoNtfExtraData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InfoNtfExtraData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InfoNtfExtraData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InfoNtfExtraData(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InfoNtfExtraData[] newArray(int i) {
            return new InfoNtfExtraData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InfoNtfExtraData copy$default(InfoNtfExtraData infoNtfExtraData, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = infoNtfExtraData.senderId;
        }
        if ((i2 & 2) != 0) {
            str2 = infoNtfExtraData.targetId;
        }
        if ((i2 & 4) != 0) {
            i = infoNtfExtraData.bizType;
        }
        if ((i2 & 8) != 0) {
            str3 = infoNtfExtraData.bizData;
        }
        return infoNtfExtraData.copy(str, str2, i, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.senderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.bizData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InfoNtfExtraData copy(@NotNull String str, String str2, int i, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new InfoNtfExtraData(str, str2, i, str3);
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
        if (!(obj instanceof InfoNtfExtraData)) {
            return false;
        }
        InfoNtfExtraData infoNtfExtraData = (InfoNtfExtraData) obj;
        return Intrinsics.EZpvd((Object) this.senderId, (Object) infoNtfExtraData.senderId) && Intrinsics.EZpvd((Object) this.targetId, (Object) infoNtfExtraData.targetId) && this.bizType == infoNtfExtraData.bizType && Intrinsics.EZpvd((Object) this.bizData, (Object) infoNtfExtraData.bizData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizData() {
        return this.bizData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSenderId() {
        return this.senderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetId() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.senderId.hashCode();
        String str = this.targetId;
        return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.bizType)) * 31) + this.bizData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InfoNtfExtraData(senderId=" + this.senderId + ", targetId=" + this.targetId + ", bizType=" + this.bizType + ", bizData=" + this.bizData + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.senderId);
        parcel.writeString(this.targetId);
        parcel.writeInt(this.bizType);
        parcel.writeString(this.bizData);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.other.InfoNtfExtraData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InfoNtfExtraData> serializer() {
            return InfoNtfExtraData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InfoNtfExtraData(int i, String str, String str2, int i2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (13 != (i & 13)) {
            PluginExceptionsKt.throwMissingFieldException(i, 13, InfoNtfExtraData$$serializer.INSTANCE.getDescriptor());
        }
        this.senderId = str;
        if ((i & 2) == 0) {
            this.targetId = null;
        } else {
            this.targetId = str2;
        }
        this.bizType = i2;
        this.bizData = str3;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InfoNtfExtraData infoNtfExtraData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, infoNtfExtraData.senderId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || infoNtfExtraData.targetId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, infoNtfExtraData.targetId);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, infoNtfExtraData.bizType);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, infoNtfExtraData.bizData);
    }

    public InfoNtfExtraData(@NotNull String str, String str2, int i, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.senderId = str;
        this.targetId = str2;
        this.bizType = i;
        this.bizData = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (r3v0 int)
  (r4v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, int, java.lang.String):void (m)] (LINE:12) call: com.okinc.okimcore.model.other.InfoNtfExtraData.<init>(java.lang.String, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ InfoNtfExtraData(String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, i, str3);
    }
}
