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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class EosAccountResp implements Parcelable {
    private String account;
    private String activeKey;
    private String ownerKey;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EosAccountResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EosAccountResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EosAccountResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EosAccountResp(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EosAccountResp[] newArray(int i) {
            return new EosAccountResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EosAccountResp() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EosAccountResp copy$default(EosAccountResp eosAccountResp, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eosAccountResp.account;
        }
        if ((i & 2) != 0) {
            str2 = eosAccountResp.ownerKey;
        }
        if ((i & 4) != 0) {
            str3 = eosAccountResp.activeKey;
        }
        return eosAccountResp.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ownerKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.activeKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EosAccountResp copy(String str, String str2, String str3) {
        return new EosAccountResp(str, str2, str3);
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
        if (!(obj instanceof EosAccountResp)) {
            return false;
        }
        EosAccountResp eosAccountResp = (EosAccountResp) obj;
        return Intrinsics.EZpvd((Object) this.account, (Object) eosAccountResp.account) && Intrinsics.EZpvd((Object) this.ownerKey, (Object) eosAccountResp.ownerKey) && Intrinsics.EZpvd((Object) this.activeKey, (Object) eosAccountResp.activeKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccount() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActiveKey() {
        return this.activeKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOwnerKey() {
        return this.ownerKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.account;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ownerKey;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.activeKey;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccount(String str) {
        this.account = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActiveKey(String str) {
        this.activeKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOwnerKey(String str) {
        this.ownerKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EosAccountResp(account=" + this.account + ", ownerKey=" + this.ownerKey + ", activeKey=" + this.activeKey + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.account);
        parcel.writeString(this.ownerKey);
        parcel.writeString(this.activeKey);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.EosAccountResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EosAccountResp> serializer() {
            return EosAccountResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EosAccountResp(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.account = null;
        } else {
            this.account = str;
        }
        if ((i & 2) == 0) {
            this.ownerKey = null;
        } else {
            this.ownerKey = str2;
        }
        if ((i & 4) == 0) {
            this.activeKey = null;
        } else {
            this.activeKey = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EosAccountResp eosAccountResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || eosAccountResp.account != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, eosAccountResp.account);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || eosAccountResp.ownerKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, eosAccountResp.ownerKey);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && eosAccountResp.activeKey == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, eosAccountResp.activeKey);
    }

    public EosAccountResp(String str, String str2, String str3) {
        this.account = str;
        this.ownerKey = str2;
        this.activeKey = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.defi.biz.net.bean.EosAccountResp.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EosAccountResp(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
