package com.okinc.tradingbot.impl.order.strategy.spotdca.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SpotDcaAdvancedParams implements Parcelable {
    public static final Parcelable.Creator<SpotDcaAdvancedParams> CREATOR = new Creator();
    public Boolean AEQbTJ;
    public Boolean EZpvd;
    public GridStartTriggerType KWHzl;
    public String OLrzqt;
    public String copydefault;
    public List<DcaTriggerParam> djBIcL;
    public String valueOf;

    public static final class Creator implements Parcelable.Creator<SpotDcaAdvancedParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotDcaAdvancedParams createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            GridStartTriggerType gridStartTriggerTypeValueOf = GridStartTriggerType.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(SpotDcaAdvancedParams.class.getClassLoader()));
                }
            }
            return new SpotDcaAdvancedParams(gridStartTriggerTypeValueOf, string, string2, string3, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotDcaAdvancedParams[] newArray(int i) {
            return new SpotDcaAdvancedParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpotDcaAdvancedParams copy$default(SpotDcaAdvancedParams spotDcaAdvancedParams, GridStartTriggerType gridStartTriggerType, String str, String str2, String str3, List list, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            gridStartTriggerType = spotDcaAdvancedParams.KWHzl;
        }
        if ((i & 2) != 0) {
            str = spotDcaAdvancedParams.OLrzqt;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = spotDcaAdvancedParams.valueOf;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = spotDcaAdvancedParams.copydefault;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            list = spotDcaAdvancedParams.djBIcL;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            bool = spotDcaAdvancedParams.EZpvd;
        }
        Boolean bool3 = bool;
        if ((i & 64) != 0) {
            bool2 = spotDcaAdvancedParams.AEQbTJ;
        }
        return spotDcaAdvancedParams.KWHzl(gridStartTriggerType, str4, str5, str6, list2, bool3, bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridStartTriggerType AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(String str) {
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DcaTriggerParam> AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull GridStartTriggerType gridStartTriggerType) {
        Intrinsics.checkNotNullParameter(gridStartTriggerType, "");
        this.KWHzl = gridStartTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(List<DcaTriggerParam> list) {
        this.djBIcL = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotDcaAdvancedParams KWHzl(@NotNull GridStartTriggerType gridStartTriggerType, String str, String str2, String str3, List<DcaTriggerParam> list, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(gridStartTriggerType, "");
        return new SpotDcaAdvancedParams(gridStartTriggerType, str, str2, str3, list, bool, bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Boolean bool) {
        this.AEQbTJ = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(String str) {
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Boolean bool) {
        this.EZpvd = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(String str) {
        this.copydefault = str;
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
        if (!(obj instanceof SpotDcaAdvancedParams)) {
            return false;
        }
        SpotDcaAdvancedParams spotDcaAdvancedParams = (SpotDcaAdvancedParams) obj;
        return this.KWHzl == spotDcaAdvancedParams.KWHzl && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) spotDcaAdvancedParams.OLrzqt) && Intrinsics.EZpvd((Object) this.valueOf, (Object) spotDcaAdvancedParams.valueOf) && Intrinsics.EZpvd((Object) this.copydefault, (Object) spotDcaAdvancedParams.copydefault) && Intrinsics.EZpvd(this.djBIcL, spotDcaAdvancedParams.djBIcL) && Intrinsics.EZpvd(this.EZpvd, spotDcaAdvancedParams.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, spotDcaAdvancedParams.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        String str = this.OLrzqt;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.valueOf;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.copydefault;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        List<DcaTriggerParam> list = this.djBIcL;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        Boolean bool = this.EZpvd;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.AEQbTJ;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotDcaAdvancedParams(startTriggerType=" + this.KWHzl + ", slPct=" + this.OLrzqt + ", volMult=" + this.valueOf + ", pxStepsMult=" + this.copydefault + ", triggerParam=" + this.djBIcL + ", fromCopy=" + this.EZpvd + ", needToForceClose=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl.name());
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.copydefault);
        List<DcaTriggerParam> list = this.djBIcL;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<DcaTriggerParam> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
        }
        Boolean bool = this.EZpvd;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.AEQbTJ;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public SpotDcaAdvancedParams(@NotNull GridStartTriggerType gridStartTriggerType, String str, String str2, String str3, List<DcaTriggerParam> list, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(gridStartTriggerType, "");
        this.KWHzl = gridStartTriggerType;
        this.OLrzqt = str;
        this.valueOf = str2;
        this.copydefault = str3;
        this.djBIcL = list;
        this.EZpvd = bool;
        this.AEQbTJ = bool2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r10v0 com.okinc.unify_trade.bot.config.GridStartTriggerType)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.util.List)
  (r15v0 java.lang.Boolean)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r16v0 java.lang.Boolean))
 A[MD:(com.okinc.unify_trade.bot.config.GridStartTriggerType, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.DcaTriggerParam>, java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:17) call: com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams.<init>(com.okinc.unify_trade.bot.config.GridStartTriggerType, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ SpotDcaAdvancedParams(GridStartTriggerType gridStartTriggerType, String str, String str2, String str3, List list, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gridStartTriggerType, str, str2, str3, list, bool, (i & 64) != 0 ? Boolean.FALSE : bool2);
    }
}
