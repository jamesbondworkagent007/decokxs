package com.okinc.business.market.data.model.alert;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class AlertGroupUiItem extends AlertUiItem {
    public static final Parcelable.Creator<AlertGroupUiItem> CREATOR = new Creator();
    public final List<AlertDataUiItem> AEQbTJ;
    public final boolean AYXKKw;
    public boolean AhwBna;
    public final String AkhnZx;
    public boolean EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final String fetchVPNInfo;
    public boolean gEmmrt;
    public boolean valueOf;
    public final String values;

    public static final class Creator implements Parcelable.Creator<AlertGroupUiItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertGroupUiItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(AlertDataUiItem.CREATOR.createFromParcel(parcel));
            }
            return new AlertGroupUiItem(string, string2, string3, string4, string5, string6, string7, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertGroupUiItem[] newArray(int i) {
            return new AlertGroupUiItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.market.data.model.alert.AlertUiItem
    public boolean AYXKKw() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AlertDataUiItem> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertGroupUiItem KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull List<AlertDataUiItem> list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new AlertGroupUiItem(str, str2, str3, str4, str5, str6, str7, list, z, z2, z3, z4, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.market.data.model.alert.AlertUiItem
    public String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.market.data.model.alert.AlertUiItem
    public String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.valueOf;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertGroupUiItem)) {
            return false;
        }
        AlertGroupUiItem alertGroupUiItem = (AlertGroupUiItem) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) alertGroupUiItem.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) alertGroupUiItem.copydefault) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) alertGroupUiItem.djBIcL) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) alertGroupUiItem.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) alertGroupUiItem.AkhnZx) && Intrinsics.EZpvd((Object) this.values, (Object) alertGroupUiItem.values) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) alertGroupUiItem.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, alertGroupUiItem.AEQbTJ) && this.AYXKKw == alertGroupUiItem.AYXKKw && this.gEmmrt == alertGroupUiItem.gEmmrt && this.valueOf == alertGroupUiItem.valueOf && this.EZpvd == alertGroupUiItem.EZpvd && this.AhwBna == alertGroupUiItem.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.market.data.model.alert.AlertUiItem
    public boolean fetchVPNInfo() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.KWHzl.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.values.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + Boolean.hashCode(this.AYXKKw)) * 31) + Boolean.hashCode(this.gEmmrt)) * 31) + Boolean.hashCode(this.valueOf)) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + Boolean.hashCode(this.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AlertGroupUiItem(id=" + this.KWHzl + ", chainId=" + this.copydefault + ", tokenAddress=" + this.djBIcL + ", tokenSymbol=" + this.fetchVPNInfo + ", tokenName=" + this.AkhnZx + ", tokenLogoUrl=" + this.values + ", chainLogoUrl=" + this.OLrzqt + ", alerts=" + this.AEQbTJ + ", isNativeToken=" + this.AYXKKw + ", isExpanded=" + this.gEmmrt + ", shouldAlwaysBeOnTop=" + this.valueOf + ", isDeleting=" + this.EZpvd + ", isSelectedForDeleting=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.values);
        parcel.writeString(this.OLrzqt);
        List<AlertDataUiItem> list = this.AEQbTJ;
        parcel.writeInt(list.size());
        Iterator<AlertDataUiItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.AYXKKw ? 1 : 0);
        parcel.writeInt(this.gEmmrt ? 1 : 0);
        parcel.writeInt(this.valueOf ? 1 : 0);
        parcel.writeInt(this.EZpvd ? 1 : 0);
        parcel.writeInt(this.AhwBna ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.util.List)
  (r26v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r27v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r29v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r30v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.alert.AlertDataUiItem>, boolean, boolean, boolean, boolean, boolean):void (m)] (LINE:17) call: com.okinc.business.market.data.model.alert.AlertGroupUiItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, boolean, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ AlertGroupUiItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, list, z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? false : z3, (i & 2048) != 0 ? false : z4, (i & 4096) != 0 ? false : z5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertGroupUiItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull List<AlertDataUiItem> list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(str, str2, z4, z5, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = str;
        this.copydefault = str2;
        this.djBIcL = str3;
        this.fetchVPNInfo = str4;
        this.AkhnZx = str5;
        this.values = str6;
        this.OLrzqt = str7;
        this.AEQbTJ = list;
        this.AYXKKw = z;
        this.gEmmrt = z2;
        this.valueOf = z3;
        this.EZpvd = z4;
        this.AhwBna = z5;
    }

    public final boolean AEQbTJ(@NotNull AlertGroupUiItem alertGroupUiItem) {
        Intrinsics.checkNotNullParameter(alertGroupUiItem, "");
        return Intrinsics.EZpvd((Object) this.djBIcL, (Object) alertGroupUiItem.djBIcL) && Intrinsics.EZpvd((Object) KWHzl(), (Object) alertGroupUiItem.KWHzl());
    }
}
