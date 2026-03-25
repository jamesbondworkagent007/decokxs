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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class DappIsFavoutitetReq implements Parcelable {
    private String category;
    private long dappId;
    private String domain;
    private Integer type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappIsFavoutitetReq> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<DappIsFavoutitetReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappIsFavoutitetReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DappIsFavoutitetReq(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readLong(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappIsFavoutitetReq[] newArray(int i) {
            return new DappIsFavoutitetReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DappIsFavoutitetReq copy$default(DappIsFavoutitetReq dappIsFavoutitetReq, Integer num, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = dappIsFavoutitetReq.type;
        }
        if ((i & 2) != 0) {
            j = dappIsFavoutitetReq.dappId;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str = dappIsFavoutitetReq.domain;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = dappIsFavoutitetReq.category;
        }
        return dappIsFavoutitetReq.copy(num, j2, str3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.dappId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappIsFavoutitetReq copy(Integer num, long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DappIsFavoutitetReq(num, j, str, str2);
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
        if (!(obj instanceof DappIsFavoutitetReq)) {
            return false;
        }
        DappIsFavoutitetReq dappIsFavoutitetReq = (DappIsFavoutitetReq) obj;
        return Intrinsics.EZpvd(this.type, dappIsFavoutitetReq.type) && this.dappId == dappIsFavoutitetReq.dappId && Intrinsics.EZpvd((Object) this.domain, (Object) dappIsFavoutitetReq.domain) && Intrinsics.EZpvd((Object) this.category, (Object) dappIsFavoutitetReq.category);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getDappId() {
        return this.dappId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDomain() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.type;
        return ((((((num == null ? 0 : num.hashCode()) * 31) + Long.hashCode(this.dappId)) * 31) + this.domain.hashCode()) * 31) + this.category.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.category = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDappId(long j) {
        this.dappId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDomain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.domain = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(Integer num) {
        this.type = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappIsFavoutitetReq(type=" + this.type + ", dappId=" + this.dappId + ", domain=" + this.domain + ", category=" + this.category + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.type;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeLong(this.dappId);
        parcel.writeString(this.domain);
        parcel.writeString(this.category);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.DappIsFavoutitetReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappIsFavoutitetReq> serializer() {
            return DappIsFavoutitetReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DappIsFavoutitetReq(int i, Integer num, long j, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, DappIsFavoutitetReq$$serializer.INSTANCE.getDescriptor());
        }
        this.type = num;
        this.dappId = j;
        this.domain = str;
        this.category = str2;
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(DappIsFavoutitetReq dappIsFavoutitetReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, dappIsFavoutitetReq.type);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, dappIsFavoutitetReq.dappId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, dappIsFavoutitetReq.domain);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, dappIsFavoutitetReq.category);
    }

    public DappIsFavoutitetReq(Integer num, long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.type = num;
        this.dappId = j;
        this.domain = str;
        this.category = str2;
    }
}
