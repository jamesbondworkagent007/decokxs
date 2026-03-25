package com.okinc.business.invest_biz.data.bean.response;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class Point implements Parcelable {
    public static final int $stable = 0;
    public final boolean hasBonus;
    public final String logo;
    public final String pointAmount;
    public final String pointName;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Point> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Point> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Point createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Point(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Point[] newArray(int i) {
            return new Point[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Point() {
        this(false, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Point copy$default(Point point, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = point.hasBonus;
        }
        if ((i & 2) != 0) {
            str = point.logo;
        }
        if ((i & 4) != 0) {
            str2 = point.pointAmount;
        }
        if ((i & 8) != 0) {
            str3 = point.pointName;
        }
        return point.KWHzl(z, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.pointAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.pointName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Point KWHzl(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new Point(z, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.hasBonus;
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
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        return this.hasBonus == point.hasBonus && Intrinsics.EZpvd((Object) this.logo, (Object) point.logo) && Intrinsics.EZpvd((Object) this.pointAmount, (Object) point.pointAmount) && Intrinsics.EZpvd((Object) this.pointName, (Object) point.pointName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Boolean.hashCode(this.hasBonus) * 31) + this.logo.hashCode()) * 31) + this.pointAmount.hashCode()) * 31) + this.pointName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Point(hasBonus=" + this.hasBonus + ", logo=" + this.logo + ", pointAmount=" + this.pointAmount + ", pointName=" + this.pointName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.hasBonus ? 1 : 0);
        parcel.writeString(this.logo);
        parcel.writeString(this.pointAmount);
        parcel.writeString(this.pointName);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.Point.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Point> serializer() {
            return Point$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Point(int i, boolean z, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.hasBonus = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.logo = "";
        } else {
            this.logo = str;
        }
        if ((i & 4) == 0) {
            this.pointAmount = "";
        } else {
            this.pointAmount = str2;
        }
        if ((i & 8) == 0) {
            this.pointName = "";
        } else {
            this.pointName = str3;
        }
    }

    public static final /* synthetic */ void KWHzl(Point point, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || point.hasBonus) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, point.hasBonus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) point.logo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, point.logo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) point.pointAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, point.pointAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) point.pointName, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, point.pointName);
    }

    public Point(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.hasBonus = z;
        this.logo = str;
        this.pointAmount = str2;
        this.pointName = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:261) call: com.okinc.business.invest_biz.data.bean.response.Point.<init>(boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ Point(boolean z, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
