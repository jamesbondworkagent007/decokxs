package com.okinc.business.trade.features.home.ui.meme.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class DexPresetResultVO implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DexPresetResultVO> CREATOR = new Creator();
    private final ArrayList<PresetUserConfigBean> dexPresetResultVOList;
    private final boolean dynamicSupportMax;
    private final String gasPriceUnitDecimal;
    private final int memeChainType;
    private final String mevPriceThreshold;
    private final DexMultiTokenInfoBean nativeTokenInfo;
    private final String priceImpactValue;
    private final boolean supportAutoMode;
    private final boolean supportCustomGasFee;
    private final boolean supportEip1559;
    private final boolean supportLimitOrder;

    public static final class Creator implements Parcelable.Creator<DexPresetResultVO> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexPresetResultVO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(PresetUserConfigBean.CREATOR.createFromParcel(parcel));
            }
            return new DexPresetResultVO(arrayList, DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexPresetResultVO[] newArray(int i) {
            return new DexPresetResultVO[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexPresetResultVO() {
        this(null, null, null, null, 0, false, false, false, null, false, false, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<PresetUserConfigBean> component1() {
        return this.dexPresetResultVOList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.dynamicSupportMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.supportCustomGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component2() {
        return this.nativeTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.gasPriceUnitDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.priceImpactValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.memeChainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.supportAutoMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.supportLimitOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.mevPriceThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexPresetResultVO copy(@NotNull ArrayList<PresetUserConfigBean> arrayList, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull String str, @NotNull String str2, int i, boolean z, boolean z2, boolean z3, @NotNull String str3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new DexPresetResultVO(arrayList, dexMultiTokenInfoBean, str, str2, i, z, z2, z3, str3, z4, z5);
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
        if (!(obj instanceof DexPresetResultVO)) {
            return false;
        }
        DexPresetResultVO dexPresetResultVO = (DexPresetResultVO) obj;
        return Intrinsics.EZpvd(this.dexPresetResultVOList, dexPresetResultVO.dexPresetResultVOList) && Intrinsics.EZpvd(this.nativeTokenInfo, dexPresetResultVO.nativeTokenInfo) && Intrinsics.EZpvd((Object) this.gasPriceUnitDecimal, (Object) dexPresetResultVO.gasPriceUnitDecimal) && Intrinsics.EZpvd((Object) this.priceImpactValue, (Object) dexPresetResultVO.priceImpactValue) && this.memeChainType == dexPresetResultVO.memeChainType && this.supportAutoMode == dexPresetResultVO.supportAutoMode && this.supportLimitOrder == dexPresetResultVO.supportLimitOrder && this.supportEip1559 == dexPresetResultVO.supportEip1559 && Intrinsics.EZpvd((Object) this.mevPriceThreshold, (Object) dexPresetResultVO.mevPriceThreshold) && this.dynamicSupportMax == dexPresetResultVO.dynamicSupportMax && this.supportCustomGasFee == dexPresetResultVO.supportCustomGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<PresetUserConfigBean> getDexPresetResultVOList() {
        return this.dexPresetResultVOList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDynamicSupportMax() {
        return this.dynamicSupportMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPriceUnitDecimal() {
        return this.gasPriceUnitDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMemeChainType() {
        return this.memeChainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMevPriceThreshold() {
        return this.mevPriceThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getNativeTokenInfo() {
        return this.nativeTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceImpactValue() {
        return this.priceImpactValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportAutoMode() {
        return this.supportAutoMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportCustomGasFee() {
        return this.supportCustomGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportEip1559() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportLimitOrder() {
        return this.supportLimitOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.dexPresetResultVOList.hashCode() * 31) + this.nativeTokenInfo.hashCode()) * 31) + this.gasPriceUnitDecimal.hashCode()) * 31) + this.priceImpactValue.hashCode()) * 31) + Integer.hashCode(this.memeChainType)) * 31) + Boolean.hashCode(this.supportAutoMode)) * 31) + Boolean.hashCode(this.supportLimitOrder)) * 31) + Boolean.hashCode(this.supportEip1559)) * 31) + this.mevPriceThreshold.hashCode()) * 31) + Boolean.hashCode(this.dynamicSupportMax)) * 31) + Boolean.hashCode(this.supportCustomGasFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexPresetResultVO(dexPresetResultVOList=" + this.dexPresetResultVOList + ", nativeTokenInfo=" + this.nativeTokenInfo + ", gasPriceUnitDecimal=" + this.gasPriceUnitDecimal + ", priceImpactValue=" + this.priceImpactValue + ", memeChainType=" + this.memeChainType + ", supportAutoMode=" + this.supportAutoMode + ", supportLimitOrder=" + this.supportLimitOrder + ", supportEip1559=" + this.supportEip1559 + ", mevPriceThreshold=" + this.mevPriceThreshold + ", dynamicSupportMax=" + this.dynamicSupportMax + ", supportCustomGasFee=" + this.supportCustomGasFee + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        ArrayList<PresetUserConfigBean> arrayList = this.dexPresetResultVOList;
        parcel.writeInt(arrayList.size());
        Iterator<PresetUserConfigBean> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        this.nativeTokenInfo.writeToParcel(parcel, i);
        parcel.writeString(this.gasPriceUnitDecimal);
        parcel.writeString(this.priceImpactValue);
        parcel.writeInt(this.memeChainType);
        parcel.writeInt(this.supportAutoMode ? 1 : 0);
        parcel.writeInt(this.supportLimitOrder ? 1 : 0);
        parcel.writeInt(this.supportEip1559 ? 1 : 0);
        parcel.writeString(this.mevPriceThreshold);
        parcel.writeInt(this.dynamicSupportMax ? 1 : 0);
        parcel.writeInt(this.supportCustomGasFee ? 1 : 0);
    }

    public DexPresetResultVO(@NotNull ArrayList<PresetUserConfigBean> arrayList, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull String str, @NotNull String str2, int i, boolean z, boolean z2, boolean z3, @NotNull String str3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.dexPresetResultVOList = arrayList;
        this.nativeTokenInfo = dexMultiTokenInfoBean;
        this.gasPriceUnitDecimal = str;
        this.priceImpactValue = str2;
        this.memeChainType = i;
        this.supportAutoMode = z;
        this.supportLimitOrder = z2;
        this.supportEip1559 = z3;
        this.mevPriceThreshold = str3;
        this.dynamicSupportMax = z4;
        this.supportCustomGasFee = z5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ed: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0002: ARITH (r79v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:23) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r68v0 java.util.ArrayList))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r79v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0086: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:double:0x0023: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double)
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Integer:?: CAST (java.lang.Integer) (null java.lang.Integer))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  (0 int)
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:com.okinc.business.dexlogic.bean.TokenInfoForApp:?: CAST (com.okinc.business.dexlogic.bean.TokenInfoForApp) (null com.okinc.business.dexlogic.bean.TokenInfoForApp))
  (-1 int)
  (134217727 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.TokenInfoForApp, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:24) call: com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.TokenInfoForApp, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r69v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008c: ARITH (r79v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0096: ARITH (r79v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x009e: ARITH (r79v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r72v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a7: ARITH (r79v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r73v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00af: ARITH (r79v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r74v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00b7: ARITH (r79v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r75v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r79v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r76v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r79v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? true : (r77v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00ce: ARITH (r79v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r78v0 boolean) : false)
 A[MD:(java.util.ArrayList<com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean>, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, int, boolean, boolean, boolean, java.lang.String, boolean, boolean):void (m)] (LINE:22) call: com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO.<init>(java.util.ArrayList, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, int, boolean, boolean, boolean, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ DexPresetResultVO(ArrayList arrayList, DexMultiTokenInfoBean dexMultiTokenInfoBean, String str, String str2, int i, boolean z, boolean z2, boolean z3, String str3, boolean z4, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ArrayList() : arrayList, (i2 & 2) != 0 ? new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : dexMultiTokenInfoBean, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? false : z3, (i2 & 256) == 0 ? str3 : "", (i2 & 512) != 0 ? true : z4, (i2 & 1024) == 0 ? z5 : false);
    }
}
