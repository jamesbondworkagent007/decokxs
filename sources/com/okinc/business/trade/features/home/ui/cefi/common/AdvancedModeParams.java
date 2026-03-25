package com.okinc.business.trade.features.home.ui.cefi.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedModeParams implements Parcelable {
    public final TxDirection AEQbTJ;
    public final AdvancedOrderType AhwBna;
    public final String EZpvd;
    public final DexMultiTokenInfoBean OLrzqt;
    public final DexMultiTokenInfoBean djBIcL;
    public final AdvancedLimitBy gEmmrt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public static final Parcelable.Creator<AdvancedModeParams> CREATOR = new Creator();
    public static final AdvancedModeParams copydefault = new AdvancedModeParams(null, null, null, null, null, null, 63, null);

    public static final class Creator implements Parcelable.Creator<AdvancedModeParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedModeParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AdvancedModeParams(parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel) : null, TxDirection.valueOf(parcel.readString()), parcel.readString(), AdvancedOrderType.valueOf(parcel.readString()), AdvancedLimitBy.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedModeParams[] newArray(int i) {
            return new AdvancedModeParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvancedModeParams() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AdvancedModeParams copy$default(AdvancedModeParams advancedModeParams, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, TxDirection txDirection, String str, AdvancedOrderType advancedOrderType, AdvancedLimitBy advancedLimitBy, int i, Object obj) {
        if ((i & 1) != 0) {
            dexMultiTokenInfoBean = advancedModeParams.OLrzqt;
        }
        if ((i & 2) != 0) {
            dexMultiTokenInfoBean2 = advancedModeParams.djBIcL;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean3 = dexMultiTokenInfoBean2;
        if ((i & 4) != 0) {
            txDirection = advancedModeParams.AEQbTJ;
        }
        TxDirection txDirection2 = txDirection;
        if ((i & 8) != 0) {
            str = advancedModeParams.EZpvd;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            advancedOrderType = advancedModeParams.AhwBna;
        }
        AdvancedOrderType advancedOrderType2 = advancedOrderType;
        if ((i & 32) != 0) {
            advancedLimitBy = advancedModeParams.gEmmrt;
        }
        return advancedModeParams.OLrzqt(dexMultiTokenInfoBean, dexMultiTokenInfoBean3, txDirection2, str2, advancedOrderType2, advancedLimitBy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedOrderType AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxDirection EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedLimitBy KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedModeParams OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull TxDirection txDirection, @NotNull String str, @NotNull AdvancedOrderType advancedOrderType, @NotNull AdvancedLimitBy advancedLimitBy) {
        Intrinsics.checkNotNullParameter(txDirection, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(advancedOrderType, "");
        Intrinsics.checkNotNullParameter(advancedLimitBy, "");
        return new AdvancedModeParams(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, txDirection, str, advancedOrderType, advancedLimitBy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.EZpvd;
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
        if (!(obj instanceof AdvancedModeParams)) {
            return false;
        }
        AdvancedModeParams advancedModeParams = (AdvancedModeParams) obj;
        return Intrinsics.EZpvd(this.OLrzqt, advancedModeParams.OLrzqt) && Intrinsics.EZpvd(this.djBIcL, advancedModeParams.djBIcL) && this.AEQbTJ == advancedModeParams.AEQbTJ && Intrinsics.EZpvd((Object) this.EZpvd, (Object) advancedModeParams.EZpvd) && this.AhwBna == advancedModeParams.AhwBna && this.gEmmrt == advancedModeParams.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.OLrzqt;
        int iHashCode = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.djBIcL;
        return (((((((((iHashCode * 31) + (dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.hashCode() : 0)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.gEmmrt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AdvancedModeParams(fromToken=" + this.OLrzqt + ", toToken=" + this.djBIcL + ", direction=" + this.AEQbTJ + ", amount=" + this.EZpvd + ", orderType=" + this.AhwBna + ", limitBy=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.OLrzqt;
        if (dexMultiTokenInfoBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean.writeToParcel(parcel, i);
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.djBIcL;
        if (dexMultiTokenInfoBean2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.AEQbTJ.name());
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AhwBna.name());
        parcel.writeString(this.gEmmrt.name());
    }

    public AdvancedModeParams(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull TxDirection txDirection, @NotNull String str, @NotNull AdvancedOrderType advancedOrderType, @NotNull AdvancedLimitBy advancedLimitBy) {
        Intrinsics.checkNotNullParameter(txDirection, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(advancedOrderType, "");
        Intrinsics.checkNotNullParameter(advancedLimitBy, "");
        this.OLrzqt = dexMultiTokenInfoBean;
        this.djBIcL = dexMultiTokenInfoBean2;
        this.AEQbTJ = txDirection;
        this.EZpvd = str;
        this.AhwBna = advancedOrderType;
        this.gEmmrt = advancedLimitBy;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x012c: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r73v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0077: CONSTRUCTOR 
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
  (wrap:double:SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double)
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.TokenInfoForApp, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:9) call: com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.TokenInfoForApp, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r67v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x007d: ARITH (r73v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00f4: CONSTRUCTOR 
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
  (wrap:double:SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double)
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.TokenInfoForApp, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:10) call: com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.TokenInfoForApp, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r68v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.trade.features.home.ui.cefi.common.TxDirection:?: TERNARY null = ((wrap:int:0x00fa: ARITH (r73v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00fe: SGET  A[WRAPPED] (LINE:11) com.okinc.business.trade.features.home.ui.cefi.common.TxDirection.BUY com.okinc.business.trade.features.home.ui.cefi.common.TxDirection) : (r69v0 com.okinc.business.trade.features.home.ui.cefi.common.TxDirection))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0103: ARITH (r73v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType:?: TERNARY null = ((wrap:int:0x010c: ARITH (r73v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0110: SGET  A[WRAPPED] (LINE:13) com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType.MARKET com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType) : (r71v0 com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType))
  (wrap:com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy:?: TERNARY null = ((wrap:int:0x0115: ARITH (r73v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0119: SGET  A[WRAPPED] (LINE:14) com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy.Price com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy) : (r72v0 com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy))
 A[MD:(com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.trade.features.home.ui.cefi.common.TxDirection, java.lang.String, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy):void (m)] (LINE:8) call: com.okinc.business.trade.features.home.ui.cefi.common.AdvancedModeParams.<init>(com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.trade.features.home.ui.cefi.common.TxDirection, java.lang.String, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy):void type: THIS */
    public /* synthetic */ AdvancedModeParams(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, TxDirection txDirection, String str, AdvancedOrderType advancedOrderType, AdvancedLimitBy advancedLimitBy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : dexMultiTokenInfoBean, (i & 2) != 0 ? new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : dexMultiTokenInfoBean2, (i & 4) != 0 ? TxDirection.BUY : txDirection, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? AdvancedOrderType.MARKET : advancedOrderType, (i & 32) != 0 ? AdvancedLimitBy.Price : advancedLimitBy);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.common.AdvancedModeParams.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final AdvancedModeParams copydefault() {
            return AdvancedModeParams.copydefault;
        }
    }
}
