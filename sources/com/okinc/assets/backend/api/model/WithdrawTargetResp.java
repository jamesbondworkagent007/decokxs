package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawTargetResp implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WithdrawTargetResp> CREATOR = new Creator();
    private boolean googleVerification;
    private final int maxNumOfAddressInBatch;
    private int msgType;
    private boolean phoneVerification;
    private SpecialField specialField;
    private ArrayList<SubCurrency> subCurrencies;
    private ArrayList<WithdrawTarget> withdrawTarget;

    public static final class Creator implements Parcelable.Creator<WithdrawTargetResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawTargetResp createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList3.add(WithdrawTarget.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList3;
            }
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            int i3 = parcel.readInt();
            SpecialField specialFieldCreateFromParcel = parcel.readInt() == 0 ? null : SpecialField.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i4 = parcel.readInt();
                arrayList2 = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList2.add(SubCurrency.CREATOR.createFromParcel(parcel));
                }
            }
            return new WithdrawTargetResp(arrayList, z, z2, i3, specialFieldCreateFromParcel, arrayList2, parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawTargetResp[] newArray(int i) {
            return new WithdrawTargetResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WithdrawTargetResp() {
        this(null, false, false, 0, null, null, 0, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.assets.backend.api.model.WithdrawTargetResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WithdrawTargetResp copy$default(WithdrawTargetResp withdrawTargetResp, ArrayList arrayList, boolean z, boolean z2, int i, SpecialField specialField, ArrayList arrayList2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            arrayList = withdrawTargetResp.withdrawTarget;
        }
        if ((i3 & 2) != 0) {
            z = withdrawTargetResp.googleVerification;
        }
        boolean z3 = z;
        if ((i3 & 4) != 0) {
            z2 = withdrawTargetResp.phoneVerification;
        }
        boolean z4 = z2;
        if ((i3 & 8) != 0) {
            i = withdrawTargetResp.msgType;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            specialField = withdrawTargetResp.specialField;
        }
        SpecialField specialField2 = specialField;
        if ((i3 & 32) != 0) {
            arrayList2 = withdrawTargetResp.subCurrencies;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i3 & 64) != 0) {
            i2 = withdrawTargetResp.maxNumOfAddressInBatch;
        }
        return withdrawTargetResp.copy(arrayList, z3, z4, i4, specialField2, arrayList3, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<WithdrawTarget> component1() {
        return this.withdrawTarget;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.googleVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.phoneVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.msgType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpecialField component5() {
        return this.specialField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SubCurrency> component6() {
        return this.subCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.maxNumOfAddressInBatch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawTargetResp copy(ArrayList<WithdrawTarget> arrayList, boolean z, boolean z2, int i, SpecialField specialField, ArrayList<SubCurrency> arrayList2, int i2) {
        return new WithdrawTargetResp(arrayList, z, z2, i, specialField, arrayList2, i2);
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
        if (!(obj instanceof WithdrawTargetResp)) {
            return false;
        }
        WithdrawTargetResp withdrawTargetResp = (WithdrawTargetResp) obj;
        return Intrinsics.EZpvd(this.withdrawTarget, withdrawTargetResp.withdrawTarget) && this.googleVerification == withdrawTargetResp.googleVerification && this.phoneVerification == withdrawTargetResp.phoneVerification && this.msgType == withdrawTargetResp.msgType && Intrinsics.EZpvd(this.specialField, withdrawTargetResp.specialField) && Intrinsics.EZpvd(this.subCurrencies, withdrawTargetResp.subCurrencies) && this.maxNumOfAddressInBatch == withdrawTargetResp.maxNumOfAddressInBatch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getGoogleVerification() {
        return this.googleVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMaxNumOfAddressInBatch() {
        return this.maxNumOfAddressInBatch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMsgType() {
        return this.msgType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPhoneVerification() {
        return this.phoneVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpecialField getSpecialField() {
        return this.specialField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SubCurrency> getSubCurrencies() {
        return this.subCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<WithdrawTarget> getWithdrawTarget() {
        return this.withdrawTarget;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ArrayList<WithdrawTarget> arrayList = this.withdrawTarget;
        int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
        int iHashCode2 = Boolean.hashCode(this.googleVerification);
        int iHashCode3 = Boolean.hashCode(this.phoneVerification);
        int iHashCode4 = Integer.hashCode(this.msgType);
        SpecialField specialField = this.specialField;
        int iHashCode5 = specialField == null ? 0 : specialField.hashCode();
        ArrayList<SubCurrency> arrayList2 = this.subCurrencies;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31) + Integer.hashCode(this.maxNumOfAddressInBatch);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGoogleVerification(boolean z) {
        this.googleVerification = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMsgType(int i) {
        this.msgType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPhoneVerification(boolean z) {
        this.phoneVerification = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpecialField(SpecialField specialField) {
        this.specialField = specialField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubCurrencies(ArrayList<SubCurrency> arrayList) {
        this.subCurrencies = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWithdrawTarget(ArrayList<WithdrawTarget> arrayList) {
        this.withdrawTarget = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawTargetResp(withdrawTarget=" + this.withdrawTarget + ", googleVerification=" + this.googleVerification + ", phoneVerification=" + this.phoneVerification + ", msgType=" + this.msgType + ", specialField=" + this.specialField + ", subCurrencies=" + this.subCurrencies + ", maxNumOfAddressInBatch=" + this.maxNumOfAddressInBatch + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        ArrayList<WithdrawTarget> arrayList = this.withdrawTarget;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<WithdrawTarget> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.googleVerification ? 1 : 0);
        parcel.writeInt(this.phoneVerification ? 1 : 0);
        parcel.writeInt(this.msgType);
        SpecialField specialField = this.specialField;
        if (specialField == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            specialField.writeToParcel(parcel, i);
        }
        ArrayList<SubCurrency> arrayList2 = this.subCurrencies;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList2.size());
            Iterator<SubCurrency> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.maxNumOfAddressInBatch);
    }

    public WithdrawTargetResp(ArrayList<WithdrawTarget> arrayList, boolean z, boolean z2, int i, SpecialField specialField, ArrayList<SubCurrency> arrayList2, int i2) {
        this.withdrawTarget = arrayList;
        this.googleVerification = z;
        this.phoneVerification = z2;
        this.msgType = i;
        this.specialField = specialField;
        this.subCurrencies = arrayList2;
        this.maxNumOfAddressInBatch = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003b: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r6v0 java.util.ArrayList))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r9v0 int) : (0 int))
  (wrap:com.okinc.assets.backend.api.model.SpecialField:?: TERNARY null = ((wrap:int:0x001d: ARITH (r13v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r10v0 com.okinc.assets.backend.api.model.SpecialField) : (null com.okinc.assets.backend.api.model.SpecialField))
  (wrap:java.util.ArrayList:0x002c: TERNARY null = ((wrap:int:0x0023: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0029: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:22) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r11v0 java.util.ArrayList))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002d: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (20 int) : (r12v0 int))
 A[MD:(java.util.ArrayList<com.okinc.assets.backend.api.model.WithdrawTarget>, boolean, boolean, int, com.okinc.assets.backend.api.model.SpecialField, java.util.ArrayList<com.okinc.assets.backend.api.model.SubCurrency>, int):void (m)] (LINE:12) call: com.okinc.assets.backend.api.model.WithdrawTargetResp.<init>(java.util.ArrayList, boolean, boolean, int, com.okinc.assets.backend.api.model.SpecialField, java.util.ArrayList, int):void type: THIS */
    public /* synthetic */ WithdrawTargetResp(ArrayList arrayList, boolean z, boolean z2, int i, SpecialField specialField, ArrayList arrayList2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : arrayList, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? false : z2, (i3 & 8) == 0 ? i : 0, (i3 & 16) == 0 ? specialField : null, (i3 & 32) != 0 ? new ArrayList() : arrayList2, (i3 & 64) != 0 ? 20 : i2);
    }
}
