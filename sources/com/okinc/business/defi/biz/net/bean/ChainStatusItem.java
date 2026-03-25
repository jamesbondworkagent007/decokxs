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
public final class ChainStatusItem implements Parcelable {
    public static final int $stable = 0;
    private final String address;
    private final long chainIndex;
    private final int status;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ChainStatusItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ChainStatusItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChainStatusItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ChainStatusItem(parcel.readLong(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChainStatusItem[] newArray(int i) {
            return new ChainStatusItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChainStatusItem copy$default(ChainStatusItem chainStatusItem, long j, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = chainStatusItem.chainIndex;
        }
        if ((i2 & 2) != 0) {
            i = chainStatusItem.status;
        }
        if ((i2 & 4) != 0) {
            str = chainStatusItem.address;
        }
        return chainStatusItem.copy(j, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChainStatusItem copy(long j, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ChainStatusItem(j, i, str);
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
        if (!(obj instanceof ChainStatusItem)) {
            return false;
        }
        ChainStatusItem chainStatusItem = (ChainStatusItem) obj;
        return this.chainIndex == chainStatusItem.chainIndex && this.status == chainStatusItem.status && Intrinsics.EZpvd((Object) this.address, (Object) chainStatusItem.address);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.chainIndex) * 31) + Integer.hashCode(this.status)) * 31) + this.address.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChainStatusItem(chainIndex=" + this.chainIndex + ", status=" + this.status + ", address=" + this.address + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.chainIndex);
        parcel.writeInt(this.status);
        parcel.writeString(this.address);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.ChainStatusItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChainStatusItem> serializer() {
            return ChainStatusItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChainStatusItem(int i, long j, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, ChainStatusItem$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = j;
        this.status = i2;
        this.address = str;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ChainStatusItem chainStatusItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, chainStatusItem.chainIndex);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, chainStatusItem.status);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, chainStatusItem.address);
    }

    public ChainStatusItem(long j, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainIndex = j;
        this.status = i;
        this.address = str;
    }
}
