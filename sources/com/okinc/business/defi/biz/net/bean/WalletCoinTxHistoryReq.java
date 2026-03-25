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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletCoinTxHistoryReq implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private List<String> accountIds;
    private List<String> addressList;
    private long coinId;
    private final boolean hideValuelessNft;
    private String lastRowId;
    private int limit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletCoinTxHistoryReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WalletCoinTxHistoryReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletCoinTxHistoryReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletCoinTxHistoryReq(parcel.createStringArrayList(), parcel.readLong(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletCoinTxHistoryReq[] newArray(int i) {
            return new WalletCoinTxHistoryReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.defi.biz.net.bean.WalletCoinTxHistoryReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletCoinTxHistoryReq copy$default(WalletCoinTxHistoryReq walletCoinTxHistoryReq, List list, long j, List list2, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = walletCoinTxHistoryReq.accountIds;
        }
        if ((i2 & 2) != 0) {
            j = walletCoinTxHistoryReq.coinId;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            list2 = walletCoinTxHistoryReq.addressList;
        }
        List list3 = list2;
        if ((i2 & 8) != 0) {
            str = walletCoinTxHistoryReq.lastRowId;
        }
        String str2 = str;
        if ((i2 & 16) != 0) {
            i = walletCoinTxHistoryReq.limit;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            z = walletCoinTxHistoryReq.hideValuelessNft;
        }
        return walletCoinTxHistoryReq.copy(list, j2, list3, str2, i3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.accountIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.addressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.lastRowId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.hideValuelessNft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletCoinTxHistoryReq copy(@NotNull List<String> list, long j, @NotNull List<String> list2, @NotNull String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new WalletCoinTxHistoryReq(list, j, list2, str, i, z);
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
        if (!(obj instanceof WalletCoinTxHistoryReq)) {
            return false;
        }
        WalletCoinTxHistoryReq walletCoinTxHistoryReq = (WalletCoinTxHistoryReq) obj;
        return Intrinsics.EZpvd(this.accountIds, walletCoinTxHistoryReq.accountIds) && this.coinId == walletCoinTxHistoryReq.coinId && Intrinsics.EZpvd(this.addressList, walletCoinTxHistoryReq.addressList) && Intrinsics.EZpvd((Object) this.lastRowId, (Object) walletCoinTxHistoryReq.lastRowId) && this.limit == walletCoinTxHistoryReq.limit && this.hideValuelessNft == walletCoinTxHistoryReq.hideValuelessNft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAccountIds() {
        return this.accountIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAddressList() {
        return this.addressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHideValuelessNft() {
        return this.hideValuelessNft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastRowId() {
        return this.lastRowId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.accountIds.hashCode() * 31) + Long.hashCode(this.coinId)) * 31) + this.addressList.hashCode()) * 31) + this.lastRowId.hashCode()) * 31) + Integer.hashCode(this.limit)) * 31) + Boolean.hashCode(this.hideValuelessNft);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountIds(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.accountIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.addressList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastRowId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lastRowId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLimit(int i) {
        this.limit = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletCoinTxHistoryReq(accountIds=" + this.accountIds + ", coinId=" + this.coinId + ", addressList=" + this.addressList + ", lastRowId=" + this.lastRowId + ", limit=" + this.limit + ", hideValuelessNft=" + this.hideValuelessNft + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.accountIds);
        parcel.writeLong(this.coinId);
        parcel.writeStringList(this.addressList);
        parcel.writeString(this.lastRowId);
        parcel.writeInt(this.limit);
        parcel.writeInt(this.hideValuelessNft ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.WalletCoinTxHistoryReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletCoinTxHistoryReq> serializer() {
            return WalletCoinTxHistoryReq$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(stringSerializer), null, null, null};
    }

    public /* synthetic */ WalletCoinTxHistoryReq(int i, List list, long j, List list2, String str, int i2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (58 != (i & 58)) {
            PluginExceptionsKt.throwMissingFieldException(i, 58, WalletCoinTxHistoryReq$$serializer.INSTANCE.getDescriptor());
        }
        this.accountIds = (i & 1) == 0 ? new ArrayList() : list;
        this.coinId = j;
        if ((i & 4) == 0) {
            this.addressList = new ArrayList();
        } else {
            this.addressList = list2;
        }
        this.lastRowId = str;
        this.limit = i2;
        this.hideValuelessNft = z;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletCoinTxHistoryReq walletCoinTxHistoryReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(walletCoinTxHistoryReq.accountIds, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], walletCoinTxHistoryReq.accountIds);
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 1, walletCoinTxHistoryReq.coinId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(walletCoinTxHistoryReq.addressList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], walletCoinTxHistoryReq.addressList);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, walletCoinTxHistoryReq.lastRowId);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, walletCoinTxHistoryReq.limit);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 5, walletCoinTxHistoryReq.hideValuelessNft);
    }

    public WalletCoinTxHistoryReq(@NotNull List<String> list, long j, @NotNull List<String> list2, @NotNull String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.accountIds = list;
        this.coinId = j;
        this.addressList = list2;
        this.lastRowId = str;
        this.limit = i;
        this.hideValuelessNft = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0009: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:358) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r10v0 java.util.List))
  (r11v0 long)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0015: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:360) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r13v0 java.util.List))
  (r14v0 java.lang.String)
  (r15v0 int)
  (r16v0 boolean)
 A[MD:(java.util.List<java.lang.String>, long, java.util.List<java.lang.String>, java.lang.String, int, boolean):void (m)] (LINE:357) call: com.okinc.business.defi.biz.net.bean.WalletCoinTxHistoryReq.<init>(java.util.List, long, java.util.List, java.lang.String, int, boolean):void type: THIS */
    public /* synthetic */ WalletCoinTxHistoryReq(List list, long j, List list2, String str, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ArrayList() : list, j, (i2 & 4) != 0 ? new ArrayList() : list2, str, i, z);
    }
}
