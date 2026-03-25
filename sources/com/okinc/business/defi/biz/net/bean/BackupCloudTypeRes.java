package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class BackupCloudTypeRes implements Parcelable {
    public static final int $stable = 0;
    private final int backupCloudType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BackupCloudTypeRes> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BackupCloudTypeRes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BackupCloudTypeRes createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BackupCloudTypeRes(parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BackupCloudTypeRes[] newArray(int i) {
            return new BackupCloudTypeRes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BackupCloudTypeRes() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BackupCloudTypeRes copy$default(BackupCloudTypeRes backupCloudTypeRes, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = backupCloudTypeRes.backupCloudType;
        }
        return backupCloudTypeRes.copy(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.backupCloudType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BackupCloudTypeRes copy(int i) {
        return new BackupCloudTypeRes(i);
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
        return (obj instanceof BackupCloudTypeRes) && this.backupCloudType == ((BackupCloudTypeRes) obj).backupCloudType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBackupCloudType() {
        return this.backupCloudType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Integer.hashCode(this.backupCloudType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BackupCloudTypeRes(backupCloudType=" + this.backupCloudType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.backupCloudType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.BackupCloudTypeRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BackupCloudTypeRes> serializer() {
            return BackupCloudTypeRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BackupCloudTypeRes(int i, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.backupCloudType = 0;
        } else {
            this.backupCloudType = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(BackupCloudTypeRes backupCloudTypeRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && backupCloudTypeRes.backupCloudType == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 0, backupCloudTypeRes.backupCloudType);
    }

    public BackupCloudTypeRes(int i) {
        this.backupCloudType = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:1277) call: com.okinc.business.defi.biz.net.bean.BackupCloudTypeRes.<init>(int):void type: THIS */
    public /* synthetic */ BackupCloudTypeRes(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
