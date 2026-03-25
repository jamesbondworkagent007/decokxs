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
public final class AddressAllAssetResponse implements Parcelable {
    private final List<ChainAssetBean> chainAssets;
    private final List<ProfilePortfolio> defis;
    private final List<ProfileNftAll> nfts;
    private final AddressAllAssetToken tokens;
    private final WalletAssetSummaryBean walletAssetSummary;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressAllAssetResponse> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(ChainAssetBean$$serializer.INSTANCE), null, new ArrayListSerializer(ProfilePortfolio$$serializer.INSTANCE), new ArrayListSerializer(ProfileNftAll$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<AddressAllAssetResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressAllAssetResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList3 = null;
            AddressAllAssetToken addressAllAssetTokenCreateFromParcel = parcel.readInt() == 0 ? null : AddressAllAssetToken.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ChainAssetBean.CREATOR.createFromParcel(parcel));
                }
            }
            WalletAssetSummaryBean walletAssetSummaryBeanCreateFromParcel = parcel.readInt() == 0 ? null : WalletAssetSummaryBean.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(ProfilePortfolio.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(ProfileNftAll.CREATOR.createFromParcel(parcel));
                }
            }
            return new AddressAllAssetResponse(addressAllAssetTokenCreateFromParcel, arrayList, walletAssetSummaryBeanCreateFromParcel, arrayList2, arrayList3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressAllAssetResponse[] newArray(int i) {
            return new AddressAllAssetResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddressAllAssetResponse() {
        this((AddressAllAssetToken) null, (List) null, (WalletAssetSummaryBean) null, (List) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.biz.net.bean.AddressAllAssetResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressAllAssetResponse copy$default(AddressAllAssetResponse addressAllAssetResponse, AddressAllAssetToken addressAllAssetToken, List list, WalletAssetSummaryBean walletAssetSummaryBean, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            addressAllAssetToken = addressAllAssetResponse.tokens;
        }
        if ((i & 2) != 0) {
            list = addressAllAssetResponse.chainAssets;
        }
        List list4 = list;
        if ((i & 4) != 0) {
            walletAssetSummaryBean = addressAllAssetResponse.walletAssetSummary;
        }
        WalletAssetSummaryBean walletAssetSummaryBean2 = walletAssetSummaryBean;
        if ((i & 8) != 0) {
            list2 = addressAllAssetResponse.defis;
        }
        List list5 = list2;
        if ((i & 16) != 0) {
            list3 = addressAllAssetResponse.nfts;
        }
        return addressAllAssetResponse.copy(addressAllAssetToken, list4, walletAssetSummaryBean2, list5, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressAllAssetToken component1() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainAssetBean> component2() {
        return this.chainAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAssetSummaryBean component3() {
        return this.walletAssetSummary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ProfilePortfolio> component4() {
        return this.defis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ProfileNftAll> component5() {
        return this.nfts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressAllAssetResponse copy(AddressAllAssetToken addressAllAssetToken, List<ChainAssetBean> list, WalletAssetSummaryBean walletAssetSummaryBean, List<ProfilePortfolio> list2, List<ProfileNftAll> list3) {
        return new AddressAllAssetResponse(addressAllAssetToken, list, walletAssetSummaryBean, list2, list3);
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
        if (!(obj instanceof AddressAllAssetResponse)) {
            return false;
        }
        AddressAllAssetResponse addressAllAssetResponse = (AddressAllAssetResponse) obj;
        return Intrinsics.EZpvd(this.tokens, addressAllAssetResponse.tokens) && Intrinsics.EZpvd(this.chainAssets, addressAllAssetResponse.chainAssets) && Intrinsics.EZpvd(this.walletAssetSummary, addressAllAssetResponse.walletAssetSummary) && Intrinsics.EZpvd(this.defis, addressAllAssetResponse.defis) && Intrinsics.EZpvd(this.nfts, addressAllAssetResponse.nfts);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainAssetBean> getChainAssets() {
        return this.chainAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ProfilePortfolio> getDefis() {
        return this.defis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ProfileNftAll> getNfts() {
        return this.nfts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressAllAssetToken getTokens() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAssetSummaryBean getWalletAssetSummary() {
        return this.walletAssetSummary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        AddressAllAssetToken addressAllAssetToken = this.tokens;
        int iHashCode = addressAllAssetToken == null ? 0 : addressAllAssetToken.hashCode();
        List<ChainAssetBean> list = this.chainAssets;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        WalletAssetSummaryBean walletAssetSummaryBean = this.walletAssetSummary;
        int iHashCode3 = walletAssetSummaryBean == null ? 0 : walletAssetSummaryBean.hashCode();
        List<ProfilePortfolio> list2 = this.defis;
        int iHashCode4 = list2 == null ? 0 : list2.hashCode();
        List<ProfileNftAll> list3 = this.nfts;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressAllAssetResponse(tokens=" + this.tokens + ", chainAssets=" + this.chainAssets + ", walletAssetSummary=" + this.walletAssetSummary + ", defis=" + this.defis + ", nfts=" + this.nfts + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        AddressAllAssetToken addressAllAssetToken = this.tokens;
        if (addressAllAssetToken == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressAllAssetToken.writeToParcel(parcel, i);
        }
        List<ChainAssetBean> list = this.chainAssets;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ChainAssetBean> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        WalletAssetSummaryBean walletAssetSummaryBean = this.walletAssetSummary;
        if (walletAssetSummaryBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            walletAssetSummaryBean.writeToParcel(parcel, i);
        }
        List<ProfilePortfolio> list2 = this.defis;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<ProfilePortfolio> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        List<ProfileNftAll> list3 = this.nfts;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list3.size());
        Iterator<ProfileNftAll> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AddressAllAssetResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressAllAssetResponse> serializer() {
            return AddressAllAssetResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressAllAssetResponse(int i, AddressAllAssetToken addressAllAssetToken, List list, WalletAssetSummaryBean walletAssetSummaryBean, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tokens = null;
        } else {
            this.tokens = addressAllAssetToken;
        }
        if ((i & 2) == 0) {
            this.chainAssets = null;
        } else {
            this.chainAssets = list;
        }
        if ((i & 4) == 0) {
            this.walletAssetSummary = null;
        } else {
            this.walletAssetSummary = walletAssetSummaryBean;
        }
        if ((i & 8) == 0) {
            this.defis = null;
        } else {
            this.defis = list2;
        }
        if ((i & 16) == 0) {
            this.nfts = null;
        } else {
            this.nfts = list3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AddressAllAssetResponse addressAllAssetResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || addressAllAssetResponse.tokens != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, AddressAllAssetToken$$serializer.INSTANCE, addressAllAssetResponse.tokens);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || addressAllAssetResponse.chainAssets != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], addressAllAssetResponse.chainAssets);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || addressAllAssetResponse.walletAssetSummary != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, WalletAssetSummaryBean$$serializer.INSTANCE, addressAllAssetResponse.walletAssetSummary);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || addressAllAssetResponse.defis != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], addressAllAssetResponse.defis);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && addressAllAssetResponse.nfts == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], addressAllAssetResponse.nfts);
    }

    public AddressAllAssetResponse(AddressAllAssetToken addressAllAssetToken, List<ChainAssetBean> list, WalletAssetSummaryBean walletAssetSummaryBean, List<ProfilePortfolio> list2, List<ProfileNftAll> list3) {
        this.tokens = addressAllAssetToken;
        this.chainAssets = list;
        this.walletAssetSummary = walletAssetSummaryBean;
        this.defis = list2;
        this.nfts = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.biz.net.bean.AddressAllAssetToken:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.AddressAllAssetToken) : (r5v0 com.okinc.business.defi.biz.net.bean.AddressAllAssetToken))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r6v0 java.util.List))
  (wrap:com.okinc.business.defi.biz.net.bean.WalletAssetSummaryBean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.WalletAssetSummaryBean) : (r7v0 com.okinc.business.defi.biz.net.bean.WalletAssetSummaryBean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r8v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
 A[MD:(com.okinc.business.defi.biz.net.bean.AddressAllAssetToken, java.util.List<com.okinc.business.defi.biz.net.bean.ChainAssetBean>, com.okinc.business.defi.biz.net.bean.WalletAssetSummaryBean, java.util.List<com.okinc.business.defi.biz.net.bean.ProfilePortfolio>, java.util.List<com.okinc.business.defi.biz.net.bean.ProfileNftAll>):void (m)] (LINE:20) call: com.okinc.business.defi.biz.net.bean.AddressAllAssetResponse.<init>(com.okinc.business.defi.biz.net.bean.AddressAllAssetToken, java.util.List, com.okinc.business.defi.biz.net.bean.WalletAssetSummaryBean, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ AddressAllAssetResponse(AddressAllAssetToken addressAllAssetToken, List list, WalletAssetSummaryBean walletAssetSummaryBean, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : addressAllAssetToken, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : walletAssetSummaryBean, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3);
    }
}
