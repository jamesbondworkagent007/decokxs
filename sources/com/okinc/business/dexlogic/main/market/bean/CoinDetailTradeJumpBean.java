package com.okinc.business.dexlogic.main.market.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class CoinDetailTradeJumpBean implements Parcelable {
    private final DexMultiTokenInfoBean fromTokenInfo;
    private final DexMultiTokenInfoBean toTokenInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CoinDetailTradeJumpBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<CoinDetailTradeJumpBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinDetailTradeJumpBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CoinDetailTradeJumpBean(parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinDetailTradeJumpBean[] newArray(int i) {
            return new CoinDetailTradeJumpBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinDetailTradeJumpBean() {
        this((DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CoinDetailTradeJumpBean copy$default(CoinDetailTradeJumpBean coinDetailTradeJumpBean, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i, Object obj) {
        if ((i & 1) != 0) {
            dexMultiTokenInfoBean = coinDetailTradeJumpBean.fromTokenInfo;
        }
        if ((i & 2) != 0) {
            dexMultiTokenInfoBean2 = coinDetailTradeJumpBean.toTokenInfo;
        }
        return coinDetailTradeJumpBean.copy(dexMultiTokenInfoBean, dexMultiTokenInfoBean2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component1() {
        return this.fromTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component2() {
        return this.toTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinDetailTradeJumpBean copy(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        return new CoinDetailTradeJumpBean(dexMultiTokenInfoBean, dexMultiTokenInfoBean2);
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
        if (!(obj instanceof CoinDetailTradeJumpBean)) {
            return false;
        }
        CoinDetailTradeJumpBean coinDetailTradeJumpBean = (CoinDetailTradeJumpBean) obj;
        return Intrinsics.EZpvd(this.fromTokenInfo, coinDetailTradeJumpBean.fromTokenInfo) && Intrinsics.EZpvd(this.toTokenInfo, coinDetailTradeJumpBean.toTokenInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getFromTokenInfo() {
        return this.fromTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getToTokenInfo() {
        return this.toTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromTokenInfo;
        int iHashCode = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toTokenInfo;
        return (iHashCode * 31) + (dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinDetailTradeJumpBean(fromTokenInfo=" + this.fromTokenInfo + ", toTokenInfo=" + this.toTokenInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromTokenInfo;
        if (dexMultiTokenInfoBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean.writeToParcel(parcel, i);
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toTokenInfo;
        if (dexMultiTokenInfoBean2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean2.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.market.bean.CoinDetailTradeJumpBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinDetailTradeJumpBean> serializer() {
            return CoinDetailTradeJumpBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinDetailTradeJumpBean(int i, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fromTokenInfo = null;
        } else {
            this.fromTokenInfo = dexMultiTokenInfoBean;
        }
        if ((i & 2) == 0) {
            this.toTokenInfo = null;
        } else {
            this.toTokenInfo = dexMultiTokenInfoBean2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CoinDetailTradeJumpBean coinDetailTradeJumpBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || coinDetailTradeJumpBean.fromTokenInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, DexMultiTokenInfoBean$$serializer.INSTANCE, coinDetailTradeJumpBean.fromTokenInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && coinDetailTradeJumpBean.toTokenInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, DexMultiTokenInfoBean$$serializer.INSTANCE, coinDetailTradeJumpBean.toTokenInfo);
    }

    public CoinDetailTradeJumpBean(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        this.fromTokenInfo = dexMultiTokenInfoBean;
        this.toTokenInfo = dexMultiTokenInfoBean2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r2v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r3v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
 A[MD:(com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean):void (m)] (LINE:12) call: com.okinc.business.dexlogic.main.market.bean.CoinDetailTradeJumpBean.<init>(com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean):void type: THIS */
    public /* synthetic */ CoinDetailTradeJumpBean(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dexMultiTokenInfoBean, (i & 2) != 0 ? null : dexMultiTokenInfoBean2);
    }
}
