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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class FusionData implements Parcelable {
    private final List<Article> articleInfoList;
    private final List<NftCollection> nftList;
    private final List<RecommendedInvestment> recommendDataList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FusionData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(Article$$serializer.INSTANCE), new ArrayListSerializer(RecommendedInvestment$$serializer.INSTANCE), new ArrayListSerializer(NftCollection$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<FusionData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FusionData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Article.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(RecommendedInvestment.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(NftCollection.CREATOR.createFromParcel(parcel));
                }
            }
            return new FusionData(arrayList, arrayList2, arrayList3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FusionData[] newArray(int i) {
            return new FusionData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FusionData() {
        this((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.FusionData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FusionData copy$default(FusionData fusionData, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fusionData.articleInfoList;
        }
        if ((i & 2) != 0) {
            list2 = fusionData.recommendDataList;
        }
        if ((i & 4) != 0) {
            list3 = fusionData.nftList;
        }
        return fusionData.copy(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Article> component1() {
        return this.articleInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecommendedInvestment> component2() {
        return this.recommendDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NftCollection> component3() {
        return this.nftList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FusionData copy(List<Article> list, List<RecommendedInvestment> list2, List<NftCollection> list3) {
        return new FusionData(list, list2, list3);
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
        if (!(obj instanceof FusionData)) {
            return false;
        }
        FusionData fusionData = (FusionData) obj;
        return Intrinsics.EZpvd(this.articleInfoList, fusionData.articleInfoList) && Intrinsics.EZpvd(this.recommendDataList, fusionData.recommendDataList) && Intrinsics.EZpvd(this.nftList, fusionData.nftList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Article> getArticleInfoList() {
        return this.articleInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NftCollection> getNftList() {
        return this.nftList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecommendedInvestment> getRecommendDataList() {
        return this.recommendDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<Article> list = this.articleInfoList;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<RecommendedInvestment> list2 = this.recommendDataList;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        List<NftCollection> list3 = this.nftList;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FusionData(articleInfoList=" + this.articleInfoList + ", recommendDataList=" + this.recommendDataList + ", nftList=" + this.nftList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<Article> list = this.articleInfoList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Article> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<RecommendedInvestment> list2 = this.recommendDataList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<RecommendedInvestment> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        List<NftCollection> list3 = this.nftList;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list3.size());
        Iterator<NftCollection> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.FusionData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FusionData> serializer() {
            return FusionData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FusionData(int i, List list, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        this.articleInfoList = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.recommendDataList = yDY.AhwBna();
        } else {
            this.recommendDataList = list2;
        }
        if ((i & 4) == 0) {
            this.nftList = yDY.AhwBna();
        } else {
            this.nftList = list3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [907=4] */
    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(FusionData fusionData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(fusionData.articleInfoList, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], fusionData.articleInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(fusionData.recommendDataList, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], fusionData.recommendDataList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(fusionData.nftList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], fusionData.nftList);
    }

    public FusionData(List<Article> list, List<RecommendedInvestment> list2, List<NftCollection> list3) {
        this.articleInfoList = list;
        this.recommendDataList = list2;
        this.nftList = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:911)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:912)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:913)) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.defi.biz.net.bean.Article>, java.util.List<com.okinc.business.defi.biz.net.bean.RecommendedInvestment>, java.util.List<com.okinc.business.defi.biz.net.bean.NftCollection>):void (m)] (LINE:910) call: com.okinc.business.defi.biz.net.bean.FusionData.<init>(java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ FusionData(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3);
    }
}
