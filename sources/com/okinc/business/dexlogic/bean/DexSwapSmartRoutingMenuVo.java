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
public final class DexSwapSmartRoutingMenuVo implements Parcelable {
    private final String menuLabel;
    private final String smartRoutingMenuType;
    private final DexMultiTokenInfoBean tokenInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DexSwapSmartRoutingMenuVo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DexSwapSmartRoutingMenuVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexSwapSmartRoutingMenuVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexSwapSmartRoutingMenuVo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexSwapSmartRoutingMenuVo[] newArray(int i) {
            return new DexSwapSmartRoutingMenuVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexSwapSmartRoutingMenuVo() {
        this((String) null, (String) null, (DexMultiTokenInfoBean) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexSwapSmartRoutingMenuVo copy$default(DexSwapSmartRoutingMenuVo dexSwapSmartRoutingMenuVo, String str, String str2, DexMultiTokenInfoBean dexMultiTokenInfoBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dexSwapSmartRoutingMenuVo.menuLabel;
        }
        if ((i & 2) != 0) {
            str2 = dexSwapSmartRoutingMenuVo.smartRoutingMenuType;
        }
        if ((i & 4) != 0) {
            dexMultiTokenInfoBean = dexSwapSmartRoutingMenuVo.tokenInfo;
        }
        return dexSwapSmartRoutingMenuVo.copy(str, str2, dexMultiTokenInfoBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.menuLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.smartRoutingMenuType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component3() {
        return this.tokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexSwapSmartRoutingMenuVo copy(@NotNull String str, @NotNull String str2, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DexSwapSmartRoutingMenuVo(str, str2, dexMultiTokenInfoBean);
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
        if (!(obj instanceof DexSwapSmartRoutingMenuVo)) {
            return false;
        }
        DexSwapSmartRoutingMenuVo dexSwapSmartRoutingMenuVo = (DexSwapSmartRoutingMenuVo) obj;
        return Intrinsics.EZpvd((Object) this.menuLabel, (Object) dexSwapSmartRoutingMenuVo.menuLabel) && Intrinsics.EZpvd((Object) this.smartRoutingMenuType, (Object) dexSwapSmartRoutingMenuVo.smartRoutingMenuType) && Intrinsics.EZpvd(this.tokenInfo, dexSwapSmartRoutingMenuVo.tokenInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMenuLabel() {
        return this.menuLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSmartRoutingMenuType() {
        return this.smartRoutingMenuType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getTokenInfo() {
        return this.tokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.menuLabel.hashCode();
        int iHashCode2 = this.smartRoutingMenuType.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.tokenInfo;
        return (((iHashCode * 31) + iHashCode2) * 31) + (dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexSwapSmartRoutingMenuVo(menuLabel=" + this.menuLabel + ", smartRoutingMenuType=" + this.smartRoutingMenuType + ", tokenInfo=" + this.tokenInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.menuLabel);
        parcel.writeString(this.smartRoutingMenuType);
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.tokenInfo;
        if (dexMultiTokenInfoBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.DexSwapSmartRoutingMenuVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexSwapSmartRoutingMenuVo> serializer() {
            return DexSwapSmartRoutingMenuVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexSwapSmartRoutingMenuVo(int i, String str, String str2, DexMultiTokenInfoBean dexMultiTokenInfoBean, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.menuLabel = "";
        } else {
            this.menuLabel = str;
        }
        if ((i & 2) == 0) {
            this.smartRoutingMenuType = "";
        } else {
            this.smartRoutingMenuType = str2;
        }
        if ((i & 4) == 0) {
            this.tokenInfo = null;
        } else {
            this.tokenInfo = dexMultiTokenInfoBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DexSwapSmartRoutingMenuVo dexSwapSmartRoutingMenuVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexSwapSmartRoutingMenuVo.menuLabel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexSwapSmartRoutingMenuVo.menuLabel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexSwapSmartRoutingMenuVo.smartRoutingMenuType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexSwapSmartRoutingMenuVo.smartRoutingMenuType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && dexSwapSmartRoutingMenuVo.tokenInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, DexMultiTokenInfoBean$$serializer.INSTANCE, dexSwapSmartRoutingMenuVo.tokenInfo);
    }

    public DexSwapSmartRoutingMenuVo(@NotNull String str, @NotNull String str2, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.menuLabel = str;
        this.smartRoutingMenuType = str2;
        this.tokenInfo = dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r4v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean):void (m)] (LINE:1701) call: com.okinc.business.dexlogic.bean.DexSwapSmartRoutingMenuVo.<init>(java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean):void type: THIS */
    public /* synthetic */ DexSwapSmartRoutingMenuVo(String str, String str2, DexMultiTokenInfoBean dexMultiTokenInfoBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : dexMultiTokenInfoBean);
    }
}
