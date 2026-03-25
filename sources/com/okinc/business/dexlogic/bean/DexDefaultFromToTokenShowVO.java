package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class DexDefaultFromToTokenShowVO implements Parcelable {
    private final DexMultiTokenInfoBean fromDexMultiTokenInfoVO;
    private final DexMultiTokenInfoBean nativeToken;
    private final DexMultiTokenInfoBean toCrossDexMultiTokenInfoVO;
    private final DexMultiTokenInfoBean toDexMultiTokenInfoVO;
    private final DexMultiTokenInfoBean warpTokenVO;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DexDefaultFromToTokenShowVO> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DexDefaultFromToTokenShowVO> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexDefaultFromToTokenShowVO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexDefaultFromToTokenShowVO(parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexDefaultFromToTokenShowVO[] newArray(int i) {
            return new DexDefaultFromToTokenShowVO[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexDefaultFromToTokenShowVO() {
        this((DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexDefaultFromToTokenShowVO copy$default(DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, DexMultiTokenInfoBean dexMultiTokenInfoBean3, DexMultiTokenInfoBean dexMultiTokenInfoBean4, DexMultiTokenInfoBean dexMultiTokenInfoBean5, int i, Object obj) {
        if ((i & 1) != 0) {
            dexMultiTokenInfoBean = dexDefaultFromToTokenShowVO.fromDexMultiTokenInfoVO;
        }
        if ((i & 2) != 0) {
            dexMultiTokenInfoBean2 = dexDefaultFromToTokenShowVO.toDexMultiTokenInfoVO;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean6 = dexMultiTokenInfoBean2;
        if ((i & 4) != 0) {
            dexMultiTokenInfoBean3 = dexDefaultFromToTokenShowVO.toCrossDexMultiTokenInfoVO;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean7 = dexMultiTokenInfoBean3;
        if ((i & 8) != 0) {
            dexMultiTokenInfoBean4 = dexDefaultFromToTokenShowVO.nativeToken;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean8 = dexMultiTokenInfoBean4;
        if ((i & 16) != 0) {
            dexMultiTokenInfoBean5 = dexDefaultFromToTokenShowVO.warpTokenVO;
        }
        return dexDefaultFromToTokenShowVO.copy(dexMultiTokenInfoBean, dexMultiTokenInfoBean6, dexMultiTokenInfoBean7, dexMultiTokenInfoBean8, dexMultiTokenInfoBean5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component1() {
        return this.fromDexMultiTokenInfoVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component2() {
        return this.toDexMultiTokenInfoVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component3() {
        return this.toCrossDexMultiTokenInfoVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component4() {
        return this.nativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component5() {
        return this.warpTokenVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexDefaultFromToTokenShowVO copy(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, DexMultiTokenInfoBean dexMultiTokenInfoBean3, DexMultiTokenInfoBean dexMultiTokenInfoBean4, DexMultiTokenInfoBean dexMultiTokenInfoBean5) {
        return new DexDefaultFromToTokenShowVO(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, dexMultiTokenInfoBean3, dexMultiTokenInfoBean4, dexMultiTokenInfoBean5);
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
        if (!(obj instanceof DexDefaultFromToTokenShowVO)) {
            return false;
        }
        DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO = (DexDefaultFromToTokenShowVO) obj;
        return Intrinsics.EZpvd(this.fromDexMultiTokenInfoVO, dexDefaultFromToTokenShowVO.fromDexMultiTokenInfoVO) && Intrinsics.EZpvd(this.toDexMultiTokenInfoVO, dexDefaultFromToTokenShowVO.toDexMultiTokenInfoVO) && Intrinsics.EZpvd(this.toCrossDexMultiTokenInfoVO, dexDefaultFromToTokenShowVO.toCrossDexMultiTokenInfoVO) && Intrinsics.EZpvd(this.nativeToken, dexDefaultFromToTokenShowVO.nativeToken) && Intrinsics.EZpvd(this.warpTokenVO, dexDefaultFromToTokenShowVO.warpTokenVO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getFromDexMultiTokenInfoVO() {
        return this.fromDexMultiTokenInfoVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getNativeToken() {
        return this.nativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getToCrossDexMultiTokenInfoVO() {
        return this.toCrossDexMultiTokenInfoVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getToDexMultiTokenInfoVO() {
        return this.toDexMultiTokenInfoVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getWarpTokenVO() {
        return this.warpTokenVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromDexMultiTokenInfoVO;
        int iHashCode = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toDexMultiTokenInfoVO;
        int iHashCode2 = dexMultiTokenInfoBean2 == null ? 0 : dexMultiTokenInfoBean2.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean3 = this.toCrossDexMultiTokenInfoVO;
        int iHashCode3 = dexMultiTokenInfoBean3 == null ? 0 : dexMultiTokenInfoBean3.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean4 = this.nativeToken;
        int iHashCode4 = dexMultiTokenInfoBean4 == null ? 0 : dexMultiTokenInfoBean4.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean5 = this.warpTokenVO;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (dexMultiTokenInfoBean5 != null ? dexMultiTokenInfoBean5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexDefaultFromToTokenShowVO(fromDexMultiTokenInfoVO=" + this.fromDexMultiTokenInfoVO + ", toDexMultiTokenInfoVO=" + this.toDexMultiTokenInfoVO + ", toCrossDexMultiTokenInfoVO=" + this.toCrossDexMultiTokenInfoVO + ", nativeToken=" + this.nativeToken + ", warpTokenVO=" + this.warpTokenVO + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromDexMultiTokenInfoVO;
        if (dexMultiTokenInfoBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean.writeToParcel(parcel, i);
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toDexMultiTokenInfoVO;
        if (dexMultiTokenInfoBean2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean2.writeToParcel(parcel, i);
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean3 = this.toCrossDexMultiTokenInfoVO;
        if (dexMultiTokenInfoBean3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean3.writeToParcel(parcel, i);
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean4 = this.nativeToken;
        if (dexMultiTokenInfoBean4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean4.writeToParcel(parcel, i);
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean5 = this.warpTokenVO;
        if (dexMultiTokenInfoBean5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean5.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.DexDefaultFromToTokenShowVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexDefaultFromToTokenShowVO> serializer() {
            return DexDefaultFromToTokenShowVO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexDefaultFromToTokenShowVO(int i, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, DexMultiTokenInfoBean dexMultiTokenInfoBean3, DexMultiTokenInfoBean dexMultiTokenInfoBean4, DexMultiTokenInfoBean dexMultiTokenInfoBean5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fromDexMultiTokenInfoVO = null;
        } else {
            this.fromDexMultiTokenInfoVO = dexMultiTokenInfoBean;
        }
        if ((i & 2) == 0) {
            this.toDexMultiTokenInfoVO = null;
        } else {
            this.toDexMultiTokenInfoVO = dexMultiTokenInfoBean2;
        }
        if ((i & 4) == 0) {
            this.toCrossDexMultiTokenInfoVO = null;
        } else {
            this.toCrossDexMultiTokenInfoVO = dexMultiTokenInfoBean3;
        }
        if ((i & 8) == 0) {
            this.nativeToken = null;
        } else {
            this.nativeToken = dexMultiTokenInfoBean4;
        }
        if ((i & 16) == 0) {
            this.warpTokenVO = null;
        } else {
            this.warpTokenVO = dexMultiTokenInfoBean5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dexDefaultFromToTokenShowVO.fromDexMultiTokenInfoVO != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, DexMultiTokenInfoBean$$serializer.INSTANCE, dexDefaultFromToTokenShowVO.fromDexMultiTokenInfoVO);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dexDefaultFromToTokenShowVO.toDexMultiTokenInfoVO != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, DexMultiTokenInfoBean$$serializer.INSTANCE, dexDefaultFromToTokenShowVO.toDexMultiTokenInfoVO);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dexDefaultFromToTokenShowVO.toCrossDexMultiTokenInfoVO != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, DexMultiTokenInfoBean$$serializer.INSTANCE, dexDefaultFromToTokenShowVO.toCrossDexMultiTokenInfoVO);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dexDefaultFromToTokenShowVO.nativeToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, DexMultiTokenInfoBean$$serializer.INSTANCE, dexDefaultFromToTokenShowVO.nativeToken);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && dexDefaultFromToTokenShowVO.warpTokenVO == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, DexMultiTokenInfoBean$$serializer.INSTANCE, dexDefaultFromToTokenShowVO.warpTokenVO);
    }

    public DexDefaultFromToTokenShowVO(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, DexMultiTokenInfoBean dexMultiTokenInfoBean3, DexMultiTokenInfoBean dexMultiTokenInfoBean4, DexMultiTokenInfoBean dexMultiTokenInfoBean5) {
        this.fromDexMultiTokenInfoVO = dexMultiTokenInfoBean;
        this.toDexMultiTokenInfoVO = dexMultiTokenInfoBean2;
        this.toCrossDexMultiTokenInfoVO = dexMultiTokenInfoBean3;
        this.nativeToken = dexMultiTokenInfoBean4;
        this.warpTokenVO = dexMultiTokenInfoBean5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r5v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r6v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r7v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r8v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r9v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
 A[MD:(com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean):void (m)] (LINE:261) call: com.okinc.business.dexlogic.bean.DexDefaultFromToTokenShowVO.<init>(com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean):void type: THIS */
    public /* synthetic */ DexDefaultFromToTokenShowVO(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, DexMultiTokenInfoBean dexMultiTokenInfoBean3, DexMultiTokenInfoBean dexMultiTokenInfoBean4, DexMultiTokenInfoBean dexMultiTokenInfoBean5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dexMultiTokenInfoBean, (i & 2) != 0 ? null : dexMultiTokenInfoBean2, (i & 4) != 0 ? null : dexMultiTokenInfoBean3, (i & 8) != 0 ? null : dexMultiTokenInfoBean4, (i & 16) != 0 ? null : dexMultiTokenInfoBean5);
    }
}
