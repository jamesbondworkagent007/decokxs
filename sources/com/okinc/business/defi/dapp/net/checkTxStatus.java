package com.okinc.business.defi.dapp.net;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class checkTxStatus implements Parcelable {
    private Integer status;
    private String txHash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<checkTxStatus> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<checkTxStatus> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final checkTxStatus createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new checkTxStatus(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final checkTxStatus[] newArray(int i) {
            return new checkTxStatus[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public checkTxStatus() {
        this((Integer) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ checkTxStatus copy$default(checkTxStatus checktxstatus, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = checktxstatus.status;
        }
        if ((i & 2) != 0) {
            str = checktxstatus.txHash;
        }
        return checktxstatus.copy(num, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final checkTxStatus copy(Integer num, String str) {
        return new checkTxStatus(num, str);
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
        if (!(obj instanceof checkTxStatus)) {
            return false;
        }
        checkTxStatus checktxstatus = (checkTxStatus) obj;
        return Intrinsics.EZpvd(this.status, checktxstatus.status) && Intrinsics.EZpvd((Object) this.txHash, (Object) checktxstatus.txHash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.status;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.txHash;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(Integer num) {
        this.status = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxHash(String str) {
        this.txHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "checkTxStatus(status=" + this.status + ", txHash=" + this.txHash + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.status;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.txHash);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.checkTxStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<checkTxStatus> serializer() {
            return checkTxStatus$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ checkTxStatus(int i, Integer num, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.status = (i & 1) == 0 ? null : num;
        if ((i & 2) == 0) {
            this.txHash = "";
        } else {
            this.txHash = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(checkTxStatus checktxstatus, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || checktxstatus.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, checktxstatus.status);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) checktxstatus.txHash, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, checktxstatus.txHash);
    }

    public checkTxStatus(Integer num, String str) {
        this.status = num;
        this.txHash = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r1v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String):void (m)] (LINE:112) call: com.okinc.business.defi.dapp.net.checkTxStatus.<init>(java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ checkTxStatus(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? "" : str);
    }
}
