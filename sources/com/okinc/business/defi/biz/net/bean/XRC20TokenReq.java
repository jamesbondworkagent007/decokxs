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
public final class XRC20TokenReq implements Parcelable {
    public static final int $stable = 0;
    private final int protocolId;
    private final String tokenUniqueId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<XRC20TokenReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<XRC20TokenReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final XRC20TokenReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new XRC20TokenReq(parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final XRC20TokenReq[] newArray(int i) {
            return new XRC20TokenReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ XRC20TokenReq copy$default(XRC20TokenReq xRC20TokenReq, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = xRC20TokenReq.protocolId;
        }
        if ((i2 & 2) != 0) {
            str = xRC20TokenReq.tokenUniqueId;
        }
        return xRC20TokenReq.copy(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final XRC20TokenReq copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new XRC20TokenReq(i, str);
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
        if (!(obj instanceof XRC20TokenReq)) {
            return false;
        }
        XRC20TokenReq xRC20TokenReq = (XRC20TokenReq) obj;
        return this.protocolId == xRC20TokenReq.protocolId && Intrinsics.EZpvd((Object) this.tokenUniqueId, (Object) xRC20TokenReq.tokenUniqueId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProtocolId() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenUniqueId() {
        return this.tokenUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.protocolId) * 31) + this.tokenUniqueId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "XRC20TokenReq(protocolId=" + this.protocolId + ", tokenUniqueId=" + this.tokenUniqueId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.protocolId);
        parcel.writeString(this.tokenUniqueId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.XRC20TokenReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<XRC20TokenReq> serializer() {
            return XRC20TokenReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ XRC20TokenReq(int i, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, XRC20TokenReq$$serializer.INSTANCE.getDescriptor());
        }
        this.protocolId = i2;
        this.tokenUniqueId = str;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(XRC20TokenReq xRC20TokenReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, xRC20TokenReq.protocolId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, xRC20TokenReq.tokenUniqueId);
    }

    public XRC20TokenReq(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.protocolId = i;
        this.tokenUniqueId = str;
    }
}
