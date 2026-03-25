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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletTotalAssetReq implements Parcelable {
    private List<WalletAccountDetail> accountDetailList;
    private final Double tinyThreshold;
    private String userUniqueId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletTotalAssetReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(WalletAccountDetail$$serializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<WalletTotalAssetReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletTotalAssetReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(WalletAccountDetail.CREATOR.createFromParcel(parcel));
            }
            return new WalletTotalAssetReq(arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletTotalAssetReq[] newArray(int i) {
            return new WalletTotalAssetReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletTotalAssetReq() {
        this((List) null, (String) null, (Double) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.WalletTotalAssetReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletTotalAssetReq copy$default(WalletTotalAssetReq walletTotalAssetReq, List list, String str, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            list = walletTotalAssetReq.accountDetailList;
        }
        if ((i & 2) != 0) {
            str = walletTotalAssetReq.userUniqueId;
        }
        if ((i & 4) != 0) {
            d = walletTotalAssetReq.tinyThreshold;
        }
        return walletTotalAssetReq.copy(list, str, d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WalletAccountDetail> component1() {
        return this.accountDetailList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component3() {
        return this.tinyThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletTotalAssetReq copy(@NotNull List<WalletAccountDetail> list, @NotNull String str, Double d) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new WalletTotalAssetReq(list, str, d);
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
        if (!(obj instanceof WalletTotalAssetReq)) {
            return false;
        }
        WalletTotalAssetReq walletTotalAssetReq = (WalletTotalAssetReq) obj;
        return Intrinsics.EZpvd(this.accountDetailList, walletTotalAssetReq.accountDetailList) && Intrinsics.EZpvd((Object) this.userUniqueId, (Object) walletTotalAssetReq.userUniqueId) && Intrinsics.EZpvd(this.tinyThreshold, walletTotalAssetReq.tinyThreshold);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WalletAccountDetail> getAccountDetailList() {
        return this.accountDetailList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getTinyThreshold() {
        return this.tinyThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserUniqueId() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountDetailList.hashCode();
        int iHashCode2 = this.userUniqueId.hashCode();
        Double d = this.tinyThreshold;
        return (((iHashCode * 31) + iHashCode2) * 31) + (d == null ? 0 : d.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountDetailList(@NotNull List<WalletAccountDetail> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.accountDetailList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserUniqueId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userUniqueId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletTotalAssetReq(accountDetailList=" + this.accountDetailList + ", userUniqueId=" + this.userUniqueId + ", tinyThreshold=" + this.tinyThreshold + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<WalletAccountDetail> list = this.accountDetailList;
        parcel.writeInt(list.size());
        Iterator<WalletAccountDetail> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.userUniqueId);
        Double d = this.tinyThreshold;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.WalletTotalAssetReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletTotalAssetReq> serializer() {
            return WalletTotalAssetReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletTotalAssetReq(int i, List list, String str, Double d, SerializationConstructorMarker serializationConstructorMarker) {
        this.accountDetailList = (i & 1) == 0 ? new ArrayList() : list;
        if ((i & 2) == 0) {
            this.userUniqueId = "";
        } else {
            this.userUniqueId = str;
        }
        if ((i & 4) == 0) {
            this.tinyThreshold = null;
        } else {
            this.tinyThreshold = d;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletTotalAssetReq walletTotalAssetReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(walletTotalAssetReq.accountDetailList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], walletTotalAssetReq.accountDetailList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) walletTotalAssetReq.userUniqueId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, walletTotalAssetReq.userUniqueId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && walletTotalAssetReq.tinyThreshold == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, DoubleSerializer.INSTANCE, walletTotalAssetReq.tinyThreshold);
    }

    public WalletTotalAssetReq(@NotNull List<WalletAccountDetail> list, @NotNull String str, Double d) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.accountDetailList = list;
        this.userUniqueId = str;
        this.tinyThreshold = d;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:17) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x000f: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r3v0 java.lang.Double))
 A[MD:(java.util.List<com.okinc.business.defi.biz.net.bean.WalletAccountDetail>, java.lang.String, java.lang.Double):void (m)] (LINE:16) call: com.okinc.business.defi.biz.net.bean.WalletTotalAssetReq.<init>(java.util.List, java.lang.String, java.lang.Double):void type: THIS */
    public /* synthetic */ WalletTotalAssetReq(List list, String str, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : d);
    }
}
