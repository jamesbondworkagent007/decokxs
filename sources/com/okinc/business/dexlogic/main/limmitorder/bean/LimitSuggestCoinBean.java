package com.okinc.business.dexlogic.main.limmitorder.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class LimitSuggestCoinBean implements Parcelable {
    private final DexMultiTokenInfoBean fromToken;
    private final DexMultiTokenInfoBean toToken;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LimitSuggestCoinBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LimitSuggestCoinBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LimitSuggestCoinBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LimitSuggestCoinBean(parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LimitSuggestCoinBean[] newArray(int i) {
            return new LimitSuggestCoinBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitSuggestCoinBean() {
        this((DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LimitSuggestCoinBean copy$default(LimitSuggestCoinBean limitSuggestCoinBean, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i, Object obj) {
        if ((i & 1) != 0) {
            dexMultiTokenInfoBean = limitSuggestCoinBean.fromToken;
        }
        if ((i & 2) != 0) {
            dexMultiTokenInfoBean2 = limitSuggestCoinBean.toToken;
        }
        return limitSuggestCoinBean.copy(dexMultiTokenInfoBean, dexMultiTokenInfoBean2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component1() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component2() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitSuggestCoinBean copy(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        return new LimitSuggestCoinBean(dexMultiTokenInfoBean, dexMultiTokenInfoBean2);
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
        if (!(obj instanceof LimitSuggestCoinBean)) {
            return false;
        }
        LimitSuggestCoinBean limitSuggestCoinBean = (LimitSuggestCoinBean) obj;
        return Intrinsics.EZpvd(this.fromToken, limitSuggestCoinBean.fromToken) && Intrinsics.EZpvd(this.toToken, limitSuggestCoinBean.toToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getFromToken() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getToToken() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromToken;
        int iHashCode = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toToken;
        return (iHashCode * 31) + (dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitSuggestCoinBean(fromToken=" + this.fromToken + ", toToken=" + this.toToken + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromToken;
        if (dexMultiTokenInfoBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean.writeToParcel(parcel, i);
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toToken;
        if (dexMultiTokenInfoBean2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean2.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.limmitorder.bean.LimitSuggestCoinBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LimitSuggestCoinBean> serializer() {
            return LimitSuggestCoinBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LimitSuggestCoinBean(int i, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fromToken = null;
        } else {
            this.fromToken = dexMultiTokenInfoBean;
        }
        if ((i & 2) == 0) {
            this.toToken = null;
        } else {
            this.toToken = dexMultiTokenInfoBean2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LimitSuggestCoinBean limitSuggestCoinBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || limitSuggestCoinBean.fromToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, DexMultiTokenInfoBean$$serializer.INSTANCE, limitSuggestCoinBean.fromToken);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && limitSuggestCoinBean.toToken == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, DexMultiTokenInfoBean$$serializer.INSTANCE, limitSuggestCoinBean.toToken);
    }

    public LimitSuggestCoinBean(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        this.fromToken = dexMultiTokenInfoBean;
        this.toToken = dexMultiTokenInfoBean2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r2v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r3v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
 A[MD:(com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean):void (m)] (LINE:376) call: com.okinc.business.dexlogic.main.limmitorder.bean.LimitSuggestCoinBean.<init>(com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean):void type: THIS */
    public /* synthetic */ LimitSuggestCoinBean(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dexMultiTokenInfoBean, (i & 2) != 0 ? null : dexMultiTokenInfoBean2);
    }
}
