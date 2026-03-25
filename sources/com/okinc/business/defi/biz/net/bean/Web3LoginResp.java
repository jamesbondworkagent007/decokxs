package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class Web3LoginResp implements Parcelable {
    public static final int $stable = 0;
    private final Long expireTime;
    private final String token;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Web3LoginResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Web3LoginResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Web3LoginResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Web3LoginResp(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Web3LoginResp[] newArray(int i) {
            return new Web3LoginResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Web3LoginResp() {
        this((String) null, (Long) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Web3LoginResp copy$default(Web3LoginResp web3LoginResp, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = web3LoginResp.token;
        }
        if ((i & 2) != 0) {
            l = web3LoginResp.expireTime;
        }
        return web3LoginResp.copy(str, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Web3LoginResp copy(String str, Long l) {
        return new Web3LoginResp(str, l);
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
        if (!(obj instanceof Web3LoginResp)) {
            return false;
        }
        Web3LoginResp web3LoginResp = (Web3LoginResp) obj;
        return Intrinsics.EZpvd((Object) this.token, (Object) web3LoginResp.token) && Intrinsics.EZpvd(this.expireTime, web3LoginResp.expireTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.token;
        int iHashCode = str == null ? 0 : str.hashCode();
        Long l = this.expireTime;
        return (iHashCode * 31) + (l != null ? l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Web3LoginResp(token=" + this.token + ", expireTime=" + this.expireTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.token);
        Long l = this.expireTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.Web3LoginResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Web3LoginResp> serializer() {
            return Web3LoginResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Web3LoginResp(int i, String str, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.token = null;
        } else {
            this.token = str;
        }
        if ((i & 2) == 0) {
            this.expireTime = null;
        } else {
            this.expireTime = l;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Web3LoginResp web3LoginResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || web3LoginResp.token != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, web3LoginResp.token);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && web3LoginResp.expireTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, web3LoginResp.expireTime);
    }

    public Web3LoginResp(String str, Long l) {
        this.token = str;
        this.expireTime = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.Long):void (m)] (LINE:2135) call: com.okinc.business.defi.biz.net.bean.Web3LoginResp.<init>(java.lang.String, java.lang.Long):void type: THIS */
    public /* synthetic */ Web3LoginResp(String str, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l);
    }
}
