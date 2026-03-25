package com.okinc.business.defi.biz.net.bean;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SyncShareRequestBody implements Parcelable {
    public static final int $stable = 0;
    private final int backupCloudType;
    private final String escapeReason;
    private final String mpcId;
    private final int mpcStatus;
    private final String oldMpcId;
    private final int oldMpcStatus;
    private final int type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SyncShareRequestBody> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SyncShareRequestBody> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SyncShareRequestBody createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SyncShareRequestBody(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SyncShareRequestBody[] newArray(int i) {
            return new SyncShareRequestBody[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SyncShareRequestBody copy$default(SyncShareRequestBody syncShareRequestBody, String str, String str2, int i, int i2, int i3, String str3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = syncShareRequestBody.mpcId;
        }
        if ((i5 & 2) != 0) {
            str2 = syncShareRequestBody.oldMpcId;
        }
        String str4 = str2;
        if ((i5 & 4) != 0) {
            i = syncShareRequestBody.mpcStatus;
        }
        int i6 = i;
        if ((i5 & 8) != 0) {
            i2 = syncShareRequestBody.oldMpcStatus;
        }
        int i7 = i2;
        if ((i5 & 16) != 0) {
            i3 = syncShareRequestBody.type;
        }
        int i8 = i3;
        if ((i5 & 32) != 0) {
            str3 = syncShareRequestBody.escapeReason;
        }
        String str5 = str3;
        if ((i5 & 64) != 0) {
            i4 = syncShareRequestBody.backupCloudType;
        }
        return syncShareRequestBody.copy(str, str4, i6, i7, i8, str5, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.oldMpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.mpcStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.oldMpcStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.escapeReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.backupCloudType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SyncShareRequestBody copy(@NotNull String str, @NotNull String str2, int i, int i2, int i3, @NotNull String str3, int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SyncShareRequestBody(str, str2, i, i2, i3, str3, i4);
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
        if (!(obj instanceof SyncShareRequestBody)) {
            return false;
        }
        SyncShareRequestBody syncShareRequestBody = (SyncShareRequestBody) obj;
        return Intrinsics.EZpvd((Object) this.mpcId, (Object) syncShareRequestBody.mpcId) && Intrinsics.EZpvd((Object) this.oldMpcId, (Object) syncShareRequestBody.oldMpcId) && this.mpcStatus == syncShareRequestBody.mpcStatus && this.oldMpcStatus == syncShareRequestBody.oldMpcStatus && this.type == syncShareRequestBody.type && Intrinsics.EZpvd((Object) this.escapeReason, (Object) syncShareRequestBody.escapeReason) && this.backupCloudType == syncShareRequestBody.backupCloudType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBackupCloudType() {
        return this.backupCloudType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEscapeReason() {
        return this.escapeReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMpcId() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMpcStatus() {
        return this.mpcStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOldMpcId() {
        return this.oldMpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOldMpcStatus() {
        return this.oldMpcStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.mpcId.hashCode() * 31) + this.oldMpcId.hashCode()) * 31) + Integer.hashCode(this.mpcStatus)) * 31) + Integer.hashCode(this.oldMpcStatus)) * 31) + Integer.hashCode(this.type)) * 31) + this.escapeReason.hashCode()) * 31) + Integer.hashCode(this.backupCloudType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SyncShareRequestBody(mpcId=" + this.mpcId + ", oldMpcId=" + this.oldMpcId + ", mpcStatus=" + this.mpcStatus + ", oldMpcStatus=" + this.oldMpcStatus + ", type=" + this.type + ", escapeReason=" + this.escapeReason + ", backupCloudType=" + this.backupCloudType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.mpcId);
        parcel.writeString(this.oldMpcId);
        parcel.writeInt(this.mpcStatus);
        parcel.writeInt(this.oldMpcStatus);
        parcel.writeInt(this.type);
        parcel.writeString(this.escapeReason);
        parcel.writeInt(this.backupCloudType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.SyncShareRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SyncShareRequestBody> serializer() {
            return SyncShareRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SyncShareRequestBody(int i, String str, String str2, int i2, int i3, int i4, String str3, int i5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, SyncShareRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.mpcId = str;
        this.oldMpcId = str2;
        this.mpcStatus = i2;
        this.oldMpcStatus = i3;
        this.type = i4;
        if ((i & 32) == 0) {
            this.escapeReason = "";
        } else {
            this.escapeReason = str3;
        }
        if ((i & 64) == 0) {
            this.backupCloudType = 0;
        } else {
            this.backupCloudType = i5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SyncShareRequestBody syncShareRequestBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, syncShareRequestBody.mpcId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, syncShareRequestBody.oldMpcId);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, syncShareRequestBody.mpcStatus);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, syncShareRequestBody.oldMpcStatus);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, syncShareRequestBody.type);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) syncShareRequestBody.escapeReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, syncShareRequestBody.escapeReason);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && syncShareRequestBody.backupCloudType == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 6, syncShareRequestBody.backupCloudType);
    }

    public SyncShareRequestBody(@NotNull String str, @NotNull String str2, int i, int i2, int i3, @NotNull String str3, int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.mpcId = str;
        this.oldMpcId = str2;
        this.mpcStatus = i;
        this.oldMpcStatus = i2;
        this.type = i3;
        this.escapeReason = str3;
        this.backupCloudType = i4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 int)
  (r13v0 int)
  (r14v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0009: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
 A[MD:(java.lang.String, java.lang.String, int, int, int, java.lang.String, int):void (m)] (LINE:1022) call: com.okinc.business.defi.biz.net.bean.SyncShareRequestBody.<init>(java.lang.String, java.lang.String, int, int, int, java.lang.String, int):void type: THIS */
    public /* synthetic */ SyncShareRequestBody(String str, String str2, int i, int i2, int i3, String str3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, i2, i3, (i5 & 32) != 0 ? "" : str3, (i5 & 64) != 0 ? 0 : i4);
    }
}
