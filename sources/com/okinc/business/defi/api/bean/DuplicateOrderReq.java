package com.okinc.business.defi.api.bean;

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

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class DuplicateOrderReq implements Parcelable {
    private String bizHash;
    private String bizSource;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DuplicateOrderReq> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<DuplicateOrderReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DuplicateOrderReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DuplicateOrderReq(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DuplicateOrderReq[] newArray(int i) {
            return new DuplicateOrderReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DuplicateOrderReq() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DuplicateOrderReq copy$default(DuplicateOrderReq duplicateOrderReq, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = duplicateOrderReq.bizSource;
        }
        if ((i & 2) != 0) {
            str2 = duplicateOrderReq.bizHash;
        }
        return duplicateOrderReq.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.bizSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.bizHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DuplicateOrderReq copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DuplicateOrderReq(str, str2);
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
        if (!(obj instanceof DuplicateOrderReq)) {
            return false;
        }
        DuplicateOrderReq duplicateOrderReq = (DuplicateOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.bizSource, (Object) duplicateOrderReq.bizSource) && Intrinsics.EZpvd((Object) this.bizHash, (Object) duplicateOrderReq.bizHash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizHash() {
        return this.bizHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizSource() {
        return this.bizSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.bizSource.hashCode() * 31) + this.bizHash.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizHash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bizHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bizSource = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DuplicateOrderReq(bizSource=" + this.bizSource + ", bizHash=" + this.bizHash + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.bizSource);
        parcel.writeString(this.bizHash);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.DuplicateOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DuplicateOrderReq> serializer() {
            return DuplicateOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DuplicateOrderReq(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.bizSource = "";
        } else {
            this.bizSource = str;
        }
        if ((i & 2) == 0) {
            this.bizHash = "";
        } else {
            this.bizHash = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(DuplicateOrderReq duplicateOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) duplicateOrderReq.bizSource, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, duplicateOrderReq.bizSource);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) duplicateOrderReq.bizHash, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, duplicateOrderReq.bizHash);
    }

    public DuplicateOrderReq(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.bizSource = str;
        this.bizHash = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:39) call: com.okinc.business.defi.api.bean.DuplicateOrderReq.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DuplicateOrderReq(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
