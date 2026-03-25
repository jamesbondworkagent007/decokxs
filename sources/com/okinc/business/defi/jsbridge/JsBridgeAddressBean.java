package com.okinc.business.defi.jsbridge;

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
public final class JsBridgeAddressBean implements Parcelable {
    public static final int $stable = 0;
    private final String address;
    private final long chainId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<JsBridgeAddressBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<JsBridgeAddressBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JsBridgeAddressBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new JsBridgeAddressBean(parcel.readLong(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JsBridgeAddressBean[] newArray(int i) {
            return new JsBridgeAddressBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JsBridgeAddressBean() {
        this(0L, (String) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ JsBridgeAddressBean copy$default(JsBridgeAddressBean jsBridgeAddressBean, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = jsBridgeAddressBean.chainId;
        }
        if ((i & 2) != 0) {
            str = jsBridgeAddressBean.address;
        }
        return jsBridgeAddressBean.copy(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsBridgeAddressBean copy(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new JsBridgeAddressBean(j, str);
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
        if (!(obj instanceof JsBridgeAddressBean)) {
            return false;
        }
        JsBridgeAddressBean jsBridgeAddressBean = (JsBridgeAddressBean) obj;
        return this.chainId == jsBridgeAddressBean.chainId && Intrinsics.EZpvd((Object) this.address, (Object) jsBridgeAddressBean.address);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.chainId) * 31) + this.address.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "JsBridgeAddressBean(chainId=" + this.chainId + ", address=" + this.address + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.chainId);
        parcel.writeString(this.address);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.jsbridge.JsBridgeAddressBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<JsBridgeAddressBean> serializer() {
            return JsBridgeAddressBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ JsBridgeAddressBean(int i, long j, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? -1L : j;
        if ((i & 2) == 0) {
            this.address = "";
        } else {
            this.address = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(JsBridgeAddressBean jsBridgeAddressBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || jsBridgeAddressBean.chainId != -1) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, jsBridgeAddressBean.chainId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) jsBridgeAddressBean.address, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, jsBridgeAddressBean.address);
    }

    public JsBridgeAddressBean(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = j;
        this.address = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r1v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(long, java.lang.String):void (m)] (LINE:64) call: com.okinc.business.defi.jsbridge.JsBridgeAddressBean.<init>(long, java.lang.String):void type: THIS */
    public /* synthetic */ JsBridgeAddressBean(long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : j, (i & 2) != 0 ? "" : str);
    }
}
