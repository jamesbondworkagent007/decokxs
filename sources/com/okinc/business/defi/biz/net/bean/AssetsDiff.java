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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class AssetsDiff implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final Asset asset;
    private final String diff;
    private final String diffUsdValue;
    private final List<AmountDetail> in;
    private final List<AmountDetail> out;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AssetsDiff> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AssetsDiff> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetsDiff createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList2 = null;
            Asset assetCreateFromParcel = parcel.readInt() == 0 ? null : Asset.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AmountDetail.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(AmountDetail.CREATOR.createFromParcel(parcel));
                }
            }
            return new AssetsDiff(assetCreateFromParcel, string, string2, arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetsDiff[] newArray(int i) {
            return new AssetsDiff[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetsDiff() {
        this((Asset) null, (String) null, (String) null, (List) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.biz.net.bean.AssetsDiff */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetsDiff copy$default(AssetsDiff assetsDiff, Asset asset, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            asset = assetsDiff.asset;
        }
        if ((i & 2) != 0) {
            str = assetsDiff.diff;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = assetsDiff.diffUsdValue;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            list = assetsDiff.in;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = assetsDiff.out;
        }
        return assetsDiff.copy(asset, str3, str4, list3, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Asset component1() {
        return this.asset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.diff;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.diffUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AmountDetail> component4() {
        return this.in;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AmountDetail> component5() {
        return this.out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetsDiff copy(Asset asset, String str, String str2, List<AmountDetail> list, List<AmountDetail> list2) {
        return new AssetsDiff(asset, str, str2, list, list2);
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
        if (!(obj instanceof AssetsDiff)) {
            return false;
        }
        AssetsDiff assetsDiff = (AssetsDiff) obj;
        return Intrinsics.EZpvd(this.asset, assetsDiff.asset) && Intrinsics.EZpvd((Object) this.diff, (Object) assetsDiff.diff) && Intrinsics.EZpvd((Object) this.diffUsdValue, (Object) assetsDiff.diffUsdValue) && Intrinsics.EZpvd(this.in, assetsDiff.in) && Intrinsics.EZpvd(this.out, assetsDiff.out);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Asset getAsset() {
        return this.asset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiff() {
        return this.diff;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiffUsdValue() {
        return this.diffUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AmountDetail> getIn() {
        return this.in;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AmountDetail> getOut() {
        return this.out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Asset asset = this.asset;
        int iHashCode = asset == null ? 0 : asset.hashCode();
        String str = this.diff;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.diffUsdValue;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        List<AmountDetail> list = this.in;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        List<AmountDetail> list2 = this.out;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetsDiff(asset=" + this.asset + ", diff=" + this.diff + ", diffUsdValue=" + this.diffUsdValue + ", in=" + this.in + ", out=" + this.out + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Asset asset = this.asset;
        if (asset == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            asset.writeToParcel(parcel, i);
        }
        parcel.writeString(this.diff);
        parcel.writeString(this.diffUsdValue);
        List<AmountDetail> list = this.in;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AmountDetail> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<AmountDetail> list2 = this.out;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<AmountDetail> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AssetsDiff.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetsDiff> serializer() {
            return AssetsDiff$$serializer.INSTANCE;
        }
    }

    static {
        AmountDetail$$serializer amountDetail$$serializer = AmountDetail$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, new ArrayListSerializer(amountDetail$$serializer), new ArrayListSerializer(amountDetail$$serializer)};
    }

    public /* synthetic */ AssetsDiff(int i, Asset asset, String str, String str2, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.asset = null;
        } else {
            this.asset = asset;
        }
        if ((i & 2) == 0) {
            this.diff = null;
        } else {
            this.diff = str;
        }
        if ((i & 4) == 0) {
            this.diffUsdValue = null;
        } else {
            this.diffUsdValue = str2;
        }
        if ((i & 8) == 0) {
            this.in = null;
        } else {
            this.in = list;
        }
        if ((i & 16) == 0) {
            this.out = null;
        } else {
            this.out = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(AssetsDiff assetsDiff, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || assetsDiff.asset != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, Asset$$serializer.INSTANCE, assetsDiff.asset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || assetsDiff.diff != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, assetsDiff.diff);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || assetsDiff.diffUsdValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, assetsDiff.diffUsdValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || assetsDiff.in != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], assetsDiff.in);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && assetsDiff.out == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], assetsDiff.out);
    }

    public AssetsDiff(Asset asset, String str, String str2, List<AmountDetail> list, List<AmountDetail> list2) {
        this.asset = asset;
        this.diff = str;
        this.diffUsdValue = str2;
        this.in = list;
        this.out = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.biz.net.bean.Asset:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.Asset) : (r5v0 com.okinc.business.defi.biz.net.bean.Asset))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r8v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
 A[MD:(com.okinc.business.defi.biz.net.bean.Asset, java.lang.String, java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.AmountDetail>, java.util.List<com.okinc.business.defi.biz.net.bean.AmountDetail>):void (m)] (LINE:154) call: com.okinc.business.defi.biz.net.bean.AssetsDiff.<init>(com.okinc.business.defi.biz.net.bean.Asset, java.lang.String, java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ AssetsDiff(Asset asset, String str, String str2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : asset, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2);
    }
}
