package com.okinc.business.dex.api.bean;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class DexMarketCheckCoinDetailResultVo implements Parcelable {
    private final List<DexMarketCheckTokenDetailInfo> tokenDetailInfoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DexMarketCheckCoinDetailResultVo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(DexMarketCheckTokenDetailInfo$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<DexMarketCheckCoinDetailResultVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexMarketCheckCoinDetailResultVo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(DexMarketCheckTokenDetailInfo.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new DexMarketCheckCoinDetailResultVo(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexMarketCheckCoinDetailResultVo[] newArray(int i) {
            return new DexMarketCheckCoinDetailResultVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexMarketCheckCoinDetailResultVo() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dex.api.bean.DexMarketCheckCoinDetailResultVo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DexMarketCheckCoinDetailResultVo copy$default(DexMarketCheckCoinDetailResultVo dexMarketCheckCoinDetailResultVo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dexMarketCheckCoinDetailResultVo.tokenDetailInfoList;
        }
        return dexMarketCheckCoinDetailResultVo.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexMarketCheckTokenDetailInfo> component1() {
        return this.tokenDetailInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMarketCheckCoinDetailResultVo copy(List<DexMarketCheckTokenDetailInfo> list) {
        return new DexMarketCheckCoinDetailResultVo(list);
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
        return (obj instanceof DexMarketCheckCoinDetailResultVo) && Intrinsics.EZpvd(this.tokenDetailInfoList, ((DexMarketCheckCoinDetailResultVo) obj).tokenDetailInfoList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexMarketCheckTokenDetailInfo> getTokenDetailInfoList() {
        return this.tokenDetailInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<DexMarketCheckTokenDetailInfo> list = this.tokenDetailInfoList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexMarketCheckCoinDetailResultVo(tokenDetailInfoList=" + this.tokenDetailInfoList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<DexMarketCheckTokenDetailInfo> list = this.tokenDetailInfoList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<DexMarketCheckTokenDetailInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.api.bean.DexMarketCheckCoinDetailResultVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexMarketCheckCoinDetailResultVo> serializer() {
            return DexMarketCheckCoinDetailResultVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexMarketCheckCoinDetailResultVo(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tokenDetailInfoList = null;
        } else {
            this.tokenDetailInfoList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_api(DexMarketCheckCoinDetailResultVo dexMarketCheckCoinDetailResultVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && dexMarketCheckCoinDetailResultVo.tokenDetailInfoList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], dexMarketCheckCoinDetailResultVo.tokenDetailInfoList);
    }

    public DexMarketCheckCoinDetailResultVo(List<DexMarketCheckTokenDetailInfo> list) {
        this.tokenDetailInfoList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.dex.api.bean.DexMarketCheckTokenDetailInfo>):void (m)] (LINE:67) call: com.okinc.business.dex.api.bean.DexMarketCheckCoinDetailResultVo.<init>(java.util.List):void type: THIS */
    public /* synthetic */ DexMarketCheckCoinDetailResultVo(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
