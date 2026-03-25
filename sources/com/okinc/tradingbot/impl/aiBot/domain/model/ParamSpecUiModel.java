package com.okinc.tradingbot.impl.aiBot.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.C33069mpW;
import o.C38307pTy;
import o.C48033uCm;
import o.C56390yDp;
import o.C56424yEw;
import o.pTB;
import o.uCF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ParamSpecUiModel implements Parcelable {
    public static final Parcelable.Creator<ParamSpecUiModel> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final Double AYXKKw;
    public final ParamType AhwBna;
    public final boolean EZpvd;
    public final Double KWHzl;
    public final Double OLrzqt;
    public final String copydefault;
    public final boolean gEmmrt;
    public final List<Integer> valueOf;

    public static final class Creator implements Parcelable.Creator<ParamSpecUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ParamSpecUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            ParamType paramTypeValueOf = ParamType.valueOf(parcel.readString());
            boolean z = parcel.readInt() != 0;
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new ParamSpecUiModel(string, paramTypeValueOf, z, dValueOf, dValueOf2, z2, z3, dValueOf3, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ParamSpecUiModel[] newArray(int i) {
            return new ParamSpecUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ParamSpecUiModel EZpvd(@NotNull String str, @NotNull ParamType paramType, boolean z, Double d, Double d2, boolean z2, boolean z3, Double d3, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(paramType, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new ParamSpecUiModel(str, paramType, z, d, d2, z2, z3, d3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double copydefault() {
        return this.KWHzl;
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
        if (!(obj instanceof ParamSpecUiModel)) {
            return false;
        }
        ParamSpecUiModel paramSpecUiModel = (ParamSpecUiModel) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) paramSpecUiModel.copydefault) && this.AhwBna == paramSpecUiModel.AhwBna && this.gEmmrt == paramSpecUiModel.gEmmrt && Intrinsics.EZpvd(this.AYXKKw, paramSpecUiModel.AYXKKw) && Intrinsics.EZpvd(this.OLrzqt, paramSpecUiModel.OLrzqt) && this.AEQbTJ == paramSpecUiModel.AEQbTJ && this.EZpvd == paramSpecUiModel.EZpvd && Intrinsics.EZpvd(this.KWHzl, paramSpecUiModel.KWHzl) && Intrinsics.EZpvd(this.valueOf, paramSpecUiModel.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ParamType gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.AhwBna.hashCode();
        int iHashCode3 = Boolean.hashCode(this.gEmmrt);
        Double d = this.AYXKKw;
        int iHashCode4 = d == null ? 0 : d.hashCode();
        Double d2 = this.OLrzqt;
        int iHashCode5 = d2 == null ? 0 : d2.hashCode();
        int iHashCode6 = Boolean.hashCode(this.AEQbTJ);
        int iHashCode7 = Boolean.hashCode(this.EZpvd);
        Double d3 = this.KWHzl;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (d3 != null ? d3.hashCode() : 0)) * 31) + this.valueOf.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ParamSpecUiModel(label=" + this.copydefault + ", type=" + this.AhwBna + ", multiValue=" + this.gEmmrt + ", min=" + this.AYXKKw + ", max=" + this.OLrzqt + ", exclusiveMin=" + this.AEQbTJ + ", exclusiveMax=" + this.EZpvd + ", defaultValue=" + this.KWHzl + ", quickSelectValues=" + this.valueOf + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AhwBna.name());
        parcel.writeInt(this.gEmmrt ? 1 : 0);
        Double d = this.AYXKKw;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.OLrzqt;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeInt(this.EZpvd ? 1 : 0);
        Double d3 = this.KWHzl;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        List<Integer> list = this.valueOf;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
    }

    public ParamSpecUiModel(@NotNull String str, @NotNull ParamType paramType, boolean z, Double d, Double d2, boolean z2, boolean z3, Double d3, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(paramType, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = str;
        this.AhwBna = paramType;
        this.gEmmrt = z;
        this.AYXKKw = d;
        this.OLrzqt = d2;
        this.AEQbTJ = z2;
        this.EZpvd = z3;
        this.KWHzl = d3;
        this.valueOf = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uCF EZpvd(double d) {
        boolean z;
        Double d2 = this.AYXKKw;
        boolean z2 = false;
        if (d2 != null) {
            double dDoubleValue = d2.doubleValue();
            z = !this.AEQbTJ ? d < dDoubleValue : d <= dDoubleValue;
        }
        Double d3 = this.OLrzqt;
        if (d3 != null) {
            double dDoubleValue2 = d3.doubleValue();
            if (!this.EZpvd ? d <= dDoubleValue2 : d < dDoubleValue2) {
                z2 = true;
            }
        }
        if (!z || !z2) {
            return new uCF.TaskDescription(KWHzl());
        }
        return uCF.StateListAnimator.OLrzqt;
    }

    public final String KWHzl() {
        int i = C48033uCm.Fragment.fdazkH;
        Pair[] pairArr = new Pair[2];
        Double d = this.AYXKKw;
        String iCUNumber$default = d != null ? pTB.formatICUNumber$default(d, null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null) : null;
        if (iCUNumber$default == null) {
            iCUNumber$default = "";
        }
        pairArr[0] = C56390yDp.OLrzqt("minPercent", iCUNumber$default);
        Double d2 = this.OLrzqt;
        String iCUNumber$default2 = d2 != null ? pTB.formatICUNumber$default(d2, null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null) : null;
        pairArr[1] = C56390yDp.OLrzqt("maxPercent", iCUNumber$default2 != null ? iCUNumber$default2 : "");
        return C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
    }
}
