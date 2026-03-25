package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletIdsUniqueIdReq implements Parcelable {
    private List<String> accountIds;
    private Long chainId;
    private Boolean needPnl;
    private int type;
    private String userUniqueId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletIdsUniqueIdReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null};

    public static final class Creator implements Parcelable.Creator<WalletIdsUniqueIdReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletIdsUniqueIdReq createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            int i = parcel.readInt();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WalletIdsUniqueIdReq(arrayListCreateStringArrayList, string, lValueOf, i, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletIdsUniqueIdReq[] newArray(int i) {
            return new WalletIdsUniqueIdReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletIdsUniqueIdReq() {
        this((List) null, (String) null, (Long) null, 0, (Boolean) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.biz.net.bean.WalletIdsUniqueIdReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletIdsUniqueIdReq copy$default(WalletIdsUniqueIdReq walletIdsUniqueIdReq, List list, String str, Long l, int i, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = walletIdsUniqueIdReq.accountIds;
        }
        if ((i2 & 2) != 0) {
            str = walletIdsUniqueIdReq.userUniqueId;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            l = walletIdsUniqueIdReq.chainId;
        }
        Long l2 = l;
        if ((i2 & 8) != 0) {
            i = walletIdsUniqueIdReq.type;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            bool = walletIdsUniqueIdReq.needPnl;
        }
        return walletIdsUniqueIdReq.copy(list, str2, l2, i3, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.accountIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.needPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletIdsUniqueIdReq copy(@NotNull List<String> list, @NotNull String str, Long l, int i, Boolean bool) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new WalletIdsUniqueIdReq(list, str, l, i, bool);
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
        if (!(obj instanceof WalletIdsUniqueIdReq)) {
            return false;
        }
        WalletIdsUniqueIdReq walletIdsUniqueIdReq = (WalletIdsUniqueIdReq) obj;
        return Intrinsics.EZpvd(this.accountIds, walletIdsUniqueIdReq.accountIds) && Intrinsics.EZpvd((Object) this.userUniqueId, (Object) walletIdsUniqueIdReq.userUniqueId) && Intrinsics.EZpvd(this.chainId, walletIdsUniqueIdReq.chainId) && this.type == walletIdsUniqueIdReq.type && Intrinsics.EZpvd(this.needPnl, walletIdsUniqueIdReq.needPnl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAccountIds() {
        return this.accountIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getNeedPnl() {
        return this.needPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserUniqueId() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountIds.hashCode();
        int iHashCode2 = this.userUniqueId.hashCode();
        Long l = this.chainId;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        int iHashCode4 = Integer.hashCode(this.type);
        Boolean bool = this.needPnl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountIds(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.accountIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(Long l) {
        this.chainId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedPnl(Boolean bool) {
        this.needPnl = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserUniqueId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userUniqueId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletIdsUniqueIdReq(accountIds=" + this.accountIds + ", userUniqueId=" + this.userUniqueId + ", chainId=" + this.chainId + ", type=" + this.type + ", needPnl=" + this.needPnl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.accountIds);
        parcel.writeString(this.userUniqueId);
        Long l = this.chainId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.type);
        Boolean bool = this.needPnl;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.WalletIdsUniqueIdReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletIdsUniqueIdReq> serializer() {
            return WalletIdsUniqueIdReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletIdsUniqueIdReq(int i, List list, String str, Long l, int i2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        this.accountIds = (i & 1) == 0 ? new ArrayList() : list;
        if ((i & 2) == 0) {
            this.userUniqueId = "";
        } else {
            this.userUniqueId = str;
        }
        if ((i & 4) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l;
        }
        if ((i & 8) == 0) {
            this.type = 0;
        } else {
            this.type = i2;
        }
        if ((i & 16) == 0) {
            this.needPnl = null;
        } else {
            this.needPnl = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletIdsUniqueIdReq walletIdsUniqueIdReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(walletIdsUniqueIdReq.accountIds, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], walletIdsUniqueIdReq.accountIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) walletIdsUniqueIdReq.userUniqueId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, walletIdsUniqueIdReq.userUniqueId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || walletIdsUniqueIdReq.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, walletIdsUniqueIdReq.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || walletIdsUniqueIdReq.type != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, walletIdsUniqueIdReq.type);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && walletIdsUniqueIdReq.needPnl == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, walletIdsUniqueIdReq.needPnl);
    }

    public WalletIdsUniqueIdReq(@NotNull List<String> list, @NotNull String str, Long l, int i, Boolean bool) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.accountIds = list;
        this.userUniqueId = str;
        this.chainId = l;
        this.type = i;
        this.needPnl = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:271) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r4v0 java.util.List))
  (wrap:java.lang.String:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r6v0 java.lang.Long))
  (wrap:int:0x001d: TERNARY null = ((wrap:int:0x0018: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r7v0 int))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001e: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.Boolean) : (null java.lang.Boolean))
 A[MD:(java.util.List<java.lang.String>, java.lang.String, java.lang.Long, int, java.lang.Boolean):void (m)] (LINE:270) call: com.okinc.business.defi.biz.net.bean.WalletIdsUniqueIdReq.<init>(java.util.List, java.lang.String, java.lang.Long, int, java.lang.Boolean):void type: THIS */
    public /* synthetic */ WalletIdsUniqueIdReq(List list, String str, Long l, int i, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? 0 : i, (i2 & 16) == 0 ? bool : null);
    }
}
