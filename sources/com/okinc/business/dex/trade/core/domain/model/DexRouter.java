package com.okinc.business.dex.trade.core.domain.model;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class DexRouter implements Parcelable {
    private final DexPairInfo dexPairInfo;
    private final String fromIndex;
    private final DexMultiTokenInfoBean fromToken;
    private final String percent;
    private final String toIndex;
    private final DexMultiTokenInfoBean toToken;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DexRouter> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DexRouter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexRouter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexRouter(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DexPairInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexRouter[] newArray(int i) {
            return new DexRouter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexRouter() {
        this((String) null, (String) null, (String) null, (DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, (DexPairInfo) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexRouter copy$default(DexRouter dexRouter, String str, String str2, String str3, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, DexPairInfo dexPairInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dexRouter.percent;
        }
        if ((i & 2) != 0) {
            str2 = dexRouter.fromIndex;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = dexRouter.toIndex;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            dexMultiTokenInfoBean = dexRouter.fromToken;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean3 = dexMultiTokenInfoBean;
        if ((i & 16) != 0) {
            dexMultiTokenInfoBean2 = dexRouter.toToken;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean4 = dexMultiTokenInfoBean2;
        if ((i & 32) != 0) {
            dexPairInfo = dexRouter.dexPairInfo;
        }
        return dexRouter.copy(str, str4, str5, dexMultiTokenInfoBean3, dexMultiTokenInfoBean4, dexPairInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.percent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.toIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component4() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component5() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexPairInfo component6() {
        return this.dexPairInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexRouter copy(String str, String str2, String str3, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, DexPairInfo dexPairInfo) {
        return new DexRouter(str, str2, str3, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, dexPairInfo);
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
        if (!(obj instanceof DexRouter)) {
            return false;
        }
        DexRouter dexRouter = (DexRouter) obj;
        return Intrinsics.EZpvd((Object) this.percent, (Object) dexRouter.percent) && Intrinsics.EZpvd((Object) this.fromIndex, (Object) dexRouter.fromIndex) && Intrinsics.EZpvd((Object) this.toIndex, (Object) dexRouter.toIndex) && Intrinsics.EZpvd(this.fromToken, dexRouter.fromToken) && Intrinsics.EZpvd(this.toToken, dexRouter.toToken) && Intrinsics.EZpvd(this.dexPairInfo, dexRouter.dexPairInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexPairInfo getDexPairInfo() {
        return this.dexPairInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromIndex() {
        return this.fromIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getFromToken() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercent() {
        return this.percent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToIndex() {
        return this.toIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getToToken() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.percent;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.fromIndex;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.toIndex;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromToken;
        int iHashCode4 = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toToken;
        int iHashCode5 = dexMultiTokenInfoBean2 == null ? 0 : dexMultiTokenInfoBean2.hashCode();
        DexPairInfo dexPairInfo = this.dexPairInfo;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (dexPairInfo != null ? dexPairInfo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexRouter(percent=" + this.percent + ", fromIndex=" + this.fromIndex + ", toIndex=" + this.toIndex + ", fromToken=" + this.fromToken + ", toToken=" + this.toToken + ", dexPairInfo=" + this.dexPairInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.percent);
        parcel.writeString(this.fromIndex);
        parcel.writeString(this.toIndex);
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
        DexPairInfo dexPairInfo = this.dexPairInfo;
        if (dexPairInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexPairInfo.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.DexRouter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexRouter> serializer() {
            return DexRouter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexRouter(int i, String str, String str2, String str3, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, DexPairInfo dexPairInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.percent = null;
        } else {
            this.percent = str;
        }
        if ((i & 2) == 0) {
            this.fromIndex = null;
        } else {
            this.fromIndex = str2;
        }
        if ((i & 4) == 0) {
            this.toIndex = null;
        } else {
            this.toIndex = str3;
        }
        if ((i & 8) == 0) {
            this.fromToken = null;
        } else {
            this.fromToken = dexMultiTokenInfoBean;
        }
        if ((i & 16) == 0) {
            this.toToken = null;
        } else {
            this.toToken = dexMultiTokenInfoBean2;
        }
        if ((i & 32) == 0) {
            this.dexPairInfo = null;
        } else {
            this.dexPairInfo = dexPairInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DexRouter dexRouter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dexRouter.percent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, dexRouter.percent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dexRouter.fromIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, dexRouter.fromIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dexRouter.toIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, dexRouter.toIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dexRouter.fromToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, DexMultiTokenInfoBean$$serializer.INSTANCE, dexRouter.fromToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || dexRouter.toToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, DexMultiTokenInfoBean$$serializer.INSTANCE, dexRouter.toToken);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && dexRouter.dexPairInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, DexPairInfo$$serializer.INSTANCE, dexRouter.dexPairInfo);
    }

    public DexRouter(String str, String str2, String str3, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, DexPairInfo dexPairInfo) {
        this.percent = str;
        this.fromIndex = str2;
        this.toIndex = str3;
        this.fromToken = dexMultiTokenInfoBean;
        this.toToken = dexMultiTokenInfoBean2;
        this.dexPairInfo = dexPairInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r9v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r10v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dex.trade.core.domain.model.DexPairInfo:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.DexPairInfo) : (r11v0 com.okinc.business.dex.trade.core.domain.model.DexPairInfo))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dex.trade.core.domain.model.DexPairInfo):void (m)] (LINE:248) call: com.okinc.business.dex.trade.core.domain.model.DexRouter.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dex.trade.core.domain.model.DexPairInfo):void type: THIS */
    public /* synthetic */ DexRouter(String str, String str2, String str3, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, DexPairInfo dexPairInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : dexMultiTokenInfoBean, (i & 16) != 0 ? null : dexMultiTokenInfoBean2, (i & 32) != 0 ? null : dexPairInfo);
    }
}
