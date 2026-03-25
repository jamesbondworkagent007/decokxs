package com.okinc.business.dexui.main.swap.widget.mev;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.MevUnstableShowLevelType;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C33070mpX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class MevRouteParam implements Parcelable {
    public static final Parcelable.Creator<MevRouteParam> CREATOR = new Creator();
    public final String AEQbTJ;
    public final TradeMode AYXKKw;
    public final MevUnstableShowLevelType EZpvd;
    public PresetRouteType KWHzl;
    public final String OLrzqt;
    public final boolean copydefault;
    public final String djBIcL;

    public static final class Creator implements Parcelable.Creator<MevRouteParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MevRouteParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MevRouteParam(TradeMode.valueOf(parcel.readString()), PresetRouteType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, MevUnstableShowLevelType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MevRouteParam[] newArray(int i) {
            return new MevRouteParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MevRouteParam copy$default(MevRouteParam mevRouteParam, TradeMode tradeMode, PresetRouteType presetRouteType, String str, String str2, boolean z, MevUnstableShowLevelType mevUnstableShowLevelType, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            tradeMode = mevRouteParam.AYXKKw;
        }
        if ((i & 2) != 0) {
            presetRouteType = mevRouteParam.KWHzl;
        }
        PresetRouteType presetRouteType2 = presetRouteType;
        if ((i & 4) != 0) {
            str = mevRouteParam.AEQbTJ;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = mevRouteParam.OLrzqt;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            z = mevRouteParam.copydefault;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            mevUnstableShowLevelType = mevRouteParam.EZpvd;
        }
        MevUnstableShowLevelType mevUnstableShowLevelType2 = mevUnstableShowLevelType;
        if ((i & 64) != 0) {
            str3 = mevRouteParam.djBIcL;
        }
        return mevRouteParam.EZpvd(tradeMode, presetRouteType2, str4, str5, z2, mevUnstableShowLevelType2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MevRouteParam EZpvd(@NotNull TradeMode tradeMode, @NotNull PresetRouteType presetRouteType, @NotNull String str, @NotNull String str2, boolean z, @NotNull MevUnstableShowLevelType mevUnstableShowLevelType, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(tradeMode, "");
        Intrinsics.checkNotNullParameter(presetRouteType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mevUnstableShowLevelType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new MevRouteParam(tradeMode, presetRouteType, str, str2, z, mevUnstableShowLevelType, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PresetRouteType KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull PresetRouteType presetRouteType) {
        Intrinsics.checkNotNullParameter(presetRouteType, "");
        this.KWHzl = presetRouteType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
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
        if (!(obj instanceof MevRouteParam)) {
            return false;
        }
        MevRouteParam mevRouteParam = (MevRouteParam) obj;
        return this.AYXKKw == mevRouteParam.AYXKKw && this.KWHzl == mevRouteParam.KWHzl && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) mevRouteParam.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) mevRouteParam.OLrzqt) && this.copydefault == mevRouteParam.copydefault && this.EZpvd == mevRouteParam.EZpvd && Intrinsics.EZpvd((Object) this.djBIcL, (Object) mevRouteParam.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.AYXKKw.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + Boolean.hashCode(this.copydefault)) * 31) + this.EZpvd.hashCode()) * 31) + this.djBIcL.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MevRouteParam(tradeMode=" + this.AYXKKw + ", routeType=" + this.KWHzl + ", chainName=" + this.AEQbTJ + ", mevPriceThreshold=" + this.OLrzqt + ", supportAutoMode=" + this.copydefault + ", mevUnstableShowLevelType=" + this.EZpvd + ", title=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AYXKKw.name());
        parcel.writeString(this.KWHzl.name());
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.OLrzqt);
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeString(this.EZpvd.name());
        parcel.writeString(this.djBIcL);
    }

    public MevRouteParam(@NotNull TradeMode tradeMode, @NotNull PresetRouteType presetRouteType, @NotNull String str, @NotNull String str2, boolean z, @NotNull MevUnstableShowLevelType mevUnstableShowLevelType, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(tradeMode, "");
        Intrinsics.checkNotNullParameter(presetRouteType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mevUnstableShowLevelType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AYXKKw = tradeMode;
        this.KWHzl = presetRouteType;
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        this.copydefault = z;
        this.EZpvd = mevUnstableShowLevelType;
        this.djBIcL = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (r10v0 com.okinc.business.dexui.main.shared.model.TradeMode)
  (r11v0 com.okinc.business.dexlogic.bean.PresetRouteType)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 boolean)
  (r15v0 com.okinc.business.dexlogic.bean.MevUnstableShowLevelType)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000a: INVOKE 
  (wrap:int:0x0004: SGET  A[WRAPPED] o.hvD.Fragment.PipHintTrackerKttrackPipAnimationHintViewflow1attachStateChangeListener1 int)
 STATIC call: o.mpX.AYXKKw(int):java.lang.String A[MD:(int):java.lang.String (m), WRAPPED] (LINE:243)) : (r16v0 java.lang.String))
 A[MD:(com.okinc.business.dexui.main.shared.model.TradeMode, com.okinc.business.dexlogic.bean.PresetRouteType, java.lang.String, java.lang.String, boolean, com.okinc.business.dexlogic.bean.MevUnstableShowLevelType, java.lang.String):void (m)] (LINE:236) call: com.okinc.business.dexui.main.swap.widget.mev.MevRouteParam.<init>(com.okinc.business.dexui.main.shared.model.TradeMode, com.okinc.business.dexlogic.bean.PresetRouteType, java.lang.String, java.lang.String, boolean, com.okinc.business.dexlogic.bean.MevUnstableShowLevelType, java.lang.String):void type: THIS */
    public /* synthetic */ MevRouteParam(TradeMode tradeMode, PresetRouteType presetRouteType, String str, String str2, boolean z, MevUnstableShowLevelType mevUnstableShowLevelType, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tradeMode, presetRouteType, str, str2, z, mevUnstableShowLevelType, (i & 64) != 0 ? C33070mpX.AYXKKw(C23274hvD.Fragment.PipHintTrackerKttrackPipAnimationHintViewflow1attachStateChangeListener1) : str3);
    }

    public final boolean AYXKKw() {
        return this.EZpvd == MevUnstableShowLevelType.ERROR;
    }

    public final boolean AhwBna() {
        return this.EZpvd == MevUnstableShowLevelType.WARNING;
    }
}
