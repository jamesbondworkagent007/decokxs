package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class CreateWalletReqNew implements Parcelable {
    private String accountId;
    private List<InternalChainAddressNew> addresses;
    private boolean asyncSignVerify;
    private String mpcId;
    private String name;
    private String pubKey;
    private long timestamp;
    private int walletType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CreateWalletReqNew> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(InternalChainAddressNew$$serializer.INSTANCE), null, null, null, null};

    public static final class Creator implements Parcelable.Creator<CreateWalletReqNew> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateWalletReqNew createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InternalChainAddressNew.CREATOR.createFromParcel(parcel));
            }
            return new CreateWalletReqNew(string, string2, string3, arrayList, parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateWalletReqNew[] newArray(int i) {
            return new CreateWalletReqNew[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CreateWalletReqNew() {
        this((String) null, (String) null, (String) null, (List) null, 0, 0L, (String) null, false, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InternalChainAddressNew> component4() {
        return this.addresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.asyncSignVerify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateWalletReqNew copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<InternalChainAddressNew> list, int i, long j, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new CreateWalletReqNew(str, str2, str3, list, i, j, str4, z);
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
        if (!(obj instanceof CreateWalletReqNew)) {
            return false;
        }
        CreateWalletReqNew createWalletReqNew = (CreateWalletReqNew) obj;
        return Intrinsics.EZpvd((Object) this.mpcId, (Object) createWalletReqNew.mpcId) && Intrinsics.EZpvd((Object) this.pubKey, (Object) createWalletReqNew.pubKey) && Intrinsics.EZpvd((Object) this.name, (Object) createWalletReqNew.name) && Intrinsics.EZpvd(this.addresses, createWalletReqNew.addresses) && this.walletType == createWalletReqNew.walletType && this.timestamp == createWalletReqNew.timestamp && Intrinsics.EZpvd((Object) this.accountId, (Object) createWalletReqNew.accountId) && this.asyncSignVerify == createWalletReqNew.asyncSignVerify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InternalChainAddressNew> getAddresses() {
        return this.addresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAsyncSignVerify() {
        return this.asyncSignVerify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMpcId() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPubKey() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getWalletType() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.mpcId.hashCode() * 31) + this.pubKey.hashCode()) * 31) + this.name.hashCode()) * 31) + this.addresses.hashCode()) * 31) + Integer.hashCode(this.walletType)) * 31) + Long.hashCode(this.timestamp)) * 31) + this.accountId.hashCode()) * 31) + Boolean.hashCode(this.asyncSignVerify);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddresses(@NotNull List<InternalChainAddressNew> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.addresses = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAsyncSignVerify(boolean z) {
        this.asyncSignVerify = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMpcId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mpcId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPubKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pubKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletType(int i) {
        this.walletType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateWalletReqNew(mpcId=" + this.mpcId + ", pubKey=" + this.pubKey + ", name=" + this.name + ", addresses=" + this.addresses + ", walletType=" + this.walletType + ", timestamp=" + this.timestamp + ", accountId=" + this.accountId + ", asyncSignVerify=" + this.asyncSignVerify + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.mpcId);
        parcel.writeString(this.pubKey);
        parcel.writeString(this.name);
        List<InternalChainAddressNew> list = this.addresses;
        parcel.writeInt(list.size());
        Iterator<InternalChainAddressNew> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.walletType);
        parcel.writeLong(this.timestamp);
        parcel.writeString(this.accountId);
        parcel.writeInt(this.asyncSignVerify ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CreateWalletReqNew.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateWalletReqNew> serializer() {
            return CreateWalletReqNew$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateWalletReqNew(int i, String str, String str2, String str3, List list, int i2, long j, String str4, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.mpcId = "";
        } else {
            this.mpcId = str;
        }
        if ((i & 2) == 0) {
            this.pubKey = "";
        } else {
            this.pubKey = str2;
        }
        if ((i & 4) == 0) {
            this.name = "";
        } else {
            this.name = str3;
        }
        if ((i & 8) == 0) {
            this.addresses = new ArrayList();
        } else {
            this.addresses = list;
        }
        if ((i & 16) == 0) {
            this.walletType = 0;
        } else {
            this.walletType = i2;
        }
        if ((i & 32) == 0) {
            this.timestamp = 0L;
        } else {
            this.timestamp = j;
        }
        if ((i & 64) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str4;
        }
        if ((i & 128) == 0) {
            this.asyncSignVerify = false;
        } else {
            this.asyncSignVerify = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CreateWalletReqNew createWalletReqNew, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) createWalletReqNew.mpcId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, createWalletReqNew.mpcId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) createWalletReqNew.pubKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, createWalletReqNew.pubKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) createWalletReqNew.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, createWalletReqNew.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(createWalletReqNew.addresses, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], createWalletReqNew.addresses);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || createWalletReqNew.walletType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, createWalletReqNew.walletType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || createWalletReqNew.timestamp != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, createWalletReqNew.timestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) createWalletReqNew.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, createWalletReqNew.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || createWalletReqNew.asyncSignVerify) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, createWalletReqNew.asyncSignVerify);
        }
    }

    public CreateWalletReqNew(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<InternalChainAddressNew> list, int i, long j, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.mpcId = str;
        this.pubKey = str2;
        this.name = str3;
        this.addresses = list;
        this.walletType = i;
        this.timestamp = j;
        this.accountId = str4;
        this.asyncSignVerify = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0052: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0019: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:141) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r15v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0024: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002d: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r17v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r21v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003d: ARITH (r21v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r20v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.InternalChainAddressNew>, int, long, java.lang.String, boolean):void (m)] (LINE:137) call: com.okinc.business.defi.biz.net.bean.CreateWalletReqNew.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, int, long, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ CreateWalletReqNew(String str, String str2, String str3, List list, int i, long j, String str4, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? new ArrayList() : list, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? 0L : j, (i2 & 64) == 0 ? str4 : "", (i2 & 128) == 0 ? z : false);
    }
}
