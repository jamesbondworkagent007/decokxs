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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletAccountDetail implements Parcelable {
    private String accountId;
    private final List<Long> filterCoinList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletAccountDetail> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(LongSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<WalletAccountDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletAccountDetail createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
                arrayList = arrayList2;
            }
            return new WalletAccountDetail(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletAccountDetail[] newArray(int i) {
            return new WalletAccountDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletAccountDetail() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.WalletAccountDetail */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletAccountDetail copy$default(WalletAccountDetail walletAccountDetail, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletAccountDetail.accountId;
        }
        if ((i & 2) != 0) {
            list = walletAccountDetail.filterCoinList;
        }
        return walletAccountDetail.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component2() {
        return this.filterCoinList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAccountDetail copy(@NotNull String str, List<Long> list) {
        Intrinsics.checkNotNullParameter(str, "");
        return new WalletAccountDetail(str, list);
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
        if (!(obj instanceof WalletAccountDetail)) {
            return false;
        }
        WalletAccountDetail walletAccountDetail = (WalletAccountDetail) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) walletAccountDetail.accountId) && Intrinsics.EZpvd(this.filterCoinList, walletAccountDetail.filterCoinList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getFilterCoinList() {
        return this.filterCoinList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountId.hashCode();
        List<Long> list = this.filterCoinList;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletAccountDetail(accountId=" + this.accountId + ", filterCoinList=" + this.filterCoinList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        List<Long> list = this.filterCoinList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeLong(it.next().longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.WalletAccountDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletAccountDetail> serializer() {
            return WalletAccountDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletAccountDetail(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.accountId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.filterCoinList = null;
        } else {
            this.filterCoinList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletAccountDetail walletAccountDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) walletAccountDetail.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, walletAccountDetail.accountId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && walletAccountDetail.filterCoinList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], walletAccountDetail.filterCoinList);
    }

    public WalletAccountDetail(@NotNull String str, List<Long> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
        this.filterCoinList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<java.lang.Long>):void (m)] (LINE:25) call: com.okinc.business.defi.biz.net.bean.WalletAccountDetail.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ WalletAccountDetail(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list);
    }
}
