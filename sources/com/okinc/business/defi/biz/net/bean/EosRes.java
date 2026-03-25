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
public final class EosRes implements Parcelable {
    private List<EosPayInfo> coins;
    private EosMarketBean eosMarket;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EosRes> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(EosPayInfo$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<EosRes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EosRes createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            EosMarketBean eosMarketBeanCreateFromParcel = parcel.readInt() == 0 ? null : EosMarketBean.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(EosPayInfo.CREATOR.createFromParcel(parcel));
            }
            return new EosRes(eosMarketBeanCreateFromParcel, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EosRes[] newArray(int i) {
            return new EosRes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EosRes() {
        this((EosMarketBean) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.EosRes */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EosRes copy$default(EosRes eosRes, EosMarketBean eosMarketBean, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            eosMarketBean = eosRes.eosMarket;
        }
        if ((i & 2) != 0) {
            list = eosRes.coins;
        }
        return eosRes.copy(eosMarketBean, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EosMarketBean component1() {
        return this.eosMarket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EosPayInfo> component2() {
        return this.coins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EosRes copy(EosMarketBean eosMarketBean, @NotNull List<EosPayInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new EosRes(eosMarketBean, list);
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
        if (!(obj instanceof EosRes)) {
            return false;
        }
        EosRes eosRes = (EosRes) obj;
        return Intrinsics.EZpvd(this.eosMarket, eosRes.eosMarket) && Intrinsics.EZpvd(this.coins, eosRes.coins);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EosPayInfo> getCoins() {
        return this.coins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EosMarketBean getEosMarket() {
        return this.eosMarket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        EosMarketBean eosMarketBean = this.eosMarket;
        return ((eosMarketBean == null ? 0 : eosMarketBean.hashCode()) * 31) + this.coins.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoins(@NotNull List<EosPayInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.coins = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEosMarket(EosMarketBean eosMarketBean) {
        this.eosMarket = eosMarketBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EosRes(eosMarket=" + this.eosMarket + ", coins=" + this.coins + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        EosMarketBean eosMarketBean = this.eosMarket;
        if (eosMarketBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eosMarketBean.writeToParcel(parcel, i);
        }
        List<EosPayInfo> list = this.coins;
        parcel.writeInt(list.size());
        Iterator<EosPayInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.EosRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EosRes> serializer() {
            return EosRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EosRes(int i, EosMarketBean eosMarketBean, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.eosMarket = (i & 1) == 0 ? null : eosMarketBean;
        if ((i & 2) == 0) {
            this.coins = new ArrayList();
        } else {
            this.coins = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EosRes eosRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || eosRes.eosMarket != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, EosMarketBean$$serializer.INSTANCE, eosRes.eosMarket);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(eosRes.coins, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], eosRes.coins);
    }

    public EosRes(EosMarketBean eosMarketBean, @NotNull List<EosPayInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.eosMarket = eosMarketBean;
        this.coins = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.biz.net.bean.EosMarketBean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.EosMarketBean) : (r1v0 com.okinc.business.defi.biz.net.bean.EosMarketBean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000b: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:86) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.List))
 A[MD:(com.okinc.business.defi.biz.net.bean.EosMarketBean, java.util.List<com.okinc.business.defi.biz.net.bean.EosPayInfo>):void (m)] (LINE:84) call: com.okinc.business.defi.biz.net.bean.EosRes.<init>(com.okinc.business.defi.biz.net.bean.EosMarketBean, java.util.List):void type: THIS */
    public /* synthetic */ EosRes(EosMarketBean eosMarketBean, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : eosMarketBean, (i & 2) != 0 ? new ArrayList() : list);
    }
}
