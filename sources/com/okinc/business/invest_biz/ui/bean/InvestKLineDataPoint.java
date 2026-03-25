package com.okinc.business.invest_biz.ui.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestKLineDataPoint implements Parcelable {
    public static final Parcelable.Creator<InvestKLineDataPoint> CREATOR = new Creator();
    public final int AEQbTJ;
    public final Type AYXKKw;
    public final InvestKLineCandleInfo EZpvd;
    public final float KWHzl;
    public final long OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<InvestKLineDataPoint> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestKLineDataPoint createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestKLineDataPoint(parcel.readInt(), Type.valueOf(parcel.readString()), parcel.readFloat(), parcel.readLong(), InvestKLineCandleInfo.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestKLineDataPoint[] newArray(int i) {
            return new InvestKLineDataPoint[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestKLineDataPoint copy$default(InvestKLineDataPoint investKLineDataPoint, int i, Type type, float f, long j, InvestKLineCandleInfo investKLineCandleInfo, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = investKLineDataPoint.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            type = investKLineDataPoint.AYXKKw;
        }
        Type type2 = type;
        if ((i2 & 4) != 0) {
            f = investKLineDataPoint.KWHzl;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            j = investKLineDataPoint.OLrzqt;
        }
        long j2 = j;
        if ((i2 & 16) != 0) {
            investKLineCandleInfo = investKLineDataPoint.EZpvd;
        }
        InvestKLineCandleInfo investKLineCandleInfo2 = investKLineCandleInfo;
        if ((i2 & 32) != 0) {
            str = investKLineDataPoint.copydefault;
        }
        return investKLineDataPoint.OLrzqt(i, type2, f2, j2, investKLineCandleInfo2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestKLineDataPoint OLrzqt(int i, @NotNull Type type, float f, long j, @NotNull InvestKLineCandleInfo investKLineCandleInfo, String str) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(investKLineCandleInfo, "");
        return new InvestKLineDataPoint(i, type, f, j, investKLineCandleInfo, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestKLineCandleInfo copydefault() {
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
        if (!(obj instanceof InvestKLineDataPoint)) {
            return false;
        }
        InvestKLineDataPoint investKLineDataPoint = (InvestKLineDataPoint) obj;
        return this.AEQbTJ == investKLineDataPoint.AEQbTJ && this.AYXKKw == investKLineDataPoint.AYXKKw && Float.compare(this.KWHzl, investKLineDataPoint.KWHzl) == 0 && this.OLrzqt == investKLineDataPoint.OLrzqt && Intrinsics.EZpvd(this.EZpvd, investKLineDataPoint.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) investKLineDataPoint.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.AEQbTJ);
        int iHashCode2 = this.AYXKKw.hashCode();
        int iHashCode3 = Float.hashCode(this.KWHzl);
        int iHashCode4 = Long.hashCode(this.OLrzqt);
        int iHashCode5 = this.EZpvd.hashCode();
        String str = this.copydefault;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestKLineDataPoint(index=" + this.AEQbTJ + ", type=" + this.AYXKKw + ", rate=" + this.KWHzl + ", timestamp=" + this.OLrzqt + ", info=" + this.EZpvd + ", totalFee=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Type valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.AEQbTJ);
        parcel.writeString(this.AYXKKw.name());
        parcel.writeFloat(this.KWHzl);
        parcel.writeLong(this.OLrzqt);
        this.EZpvd.writeToParcel(parcel, i);
        parcel.writeString(this.copydefault);
    }

    public InvestKLineDataPoint(int i, @NotNull Type type, float f, long j, @NotNull InvestKLineCandleInfo investKLineCandleInfo, String str) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(investKLineCandleInfo, "");
        this.AEQbTJ = i;
        this.AYXKKw = type;
        this.KWHzl = f;
        this.OLrzqt = j;
        this.EZpvd = investKLineCandleInfo;
        this.copydefault = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (r10v0 int)
  (r11v0 com.okinc.business.invest_biz.ui.bean.InvestKLineDataPoint$Type)
  (r12v0 float)
  (r13v0 long)
  (r15v0 com.okinc.business.invest_biz.ui.bean.InvestKLineCandleInfo)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
 A[MD:(int, com.okinc.business.invest_biz.ui.bean.InvestKLineDataPoint$Type, float, long, com.okinc.business.invest_biz.ui.bean.InvestKLineCandleInfo, java.lang.String):void (m)] (LINE:15) call: com.okinc.business.invest_biz.ui.bean.InvestKLineDataPoint.<init>(int, com.okinc.business.invest_biz.ui.bean.InvestKLineDataPoint$Type, float, long, com.okinc.business.invest_biz.ui.bean.InvestKLineCandleInfo, java.lang.String):void type: THIS */
    public /* synthetic */ InvestKLineDataPoint(int i, Type type, float f, long j, InvestKLineCandleInfo investKLineCandleInfo, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, type, f, j, investKLineCandleInfo, (i2 & 32) != 0 ? null : str);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type NORMAL = new Type("NORMAL", 0);
        public static final Type BONUS = new Type("BONUS", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Type[] $values() {
            return new Type[]{NORMAL, BONUS};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Type> getEntries() {
            return $ENTRIES;
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(typeArr$values);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }
}
