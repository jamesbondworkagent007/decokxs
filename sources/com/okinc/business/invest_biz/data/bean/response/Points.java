package com.okinc.business.invest_biz.data.bean.response;

import java.util.List;
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
public final class Points {
    public final String leftCount;
    public final String logo;
    public final PointsData pointsData;
    public final String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Points() {
        this((String) null, (String) null, (PointsData) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Points copy$default(Points points, String str, String str2, PointsData pointsData, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = points.leftCount;
        }
        if ((i & 2) != 0) {
            str2 = points.logo;
        }
        if ((i & 4) != 0) {
            pointsData = points.pointsData;
        }
        if ((i & 8) != 0) {
            str3 = points.value;
        }
        return points.EZpvd(str, str2, pointsData, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.leftCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Points EZpvd(@NotNull String str, @NotNull String str2, @NotNull PointsData pointsData, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(pointsData, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new Points(str, str2, pointsData, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PointsData KWHzl() {
        return this.pointsData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Points)) {
            return false;
        }
        Points points = (Points) obj;
        return Intrinsics.EZpvd((Object) this.leftCount, (Object) points.leftCount) && Intrinsics.EZpvd((Object) this.logo, (Object) points.logo) && Intrinsics.EZpvd(this.pointsData, points.pointsData) && Intrinsics.EZpvd((Object) this.value, (Object) points.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.leftCount.hashCode() * 31) + this.logo.hashCode()) * 31) + this.pointsData.hashCode()) * 31) + this.value.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Points(leftCount=" + this.leftCount + ", logo=" + this.logo + ", pointsData=" + this.pointsData + ", value=" + this.value + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.Points.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Points> serializer() {
            return Points$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Points(int i, String str, String str2, PointsData pointsData, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.leftCount = "";
        } else {
            this.leftCount = str;
        }
        if ((i & 2) == 0) {
            this.logo = "";
        } else {
            this.logo = str2;
        }
        if ((i & 4) == 0) {
            this.pointsData = new PointsData((List) null, (String) null, 3, (DefaultConstructorMarker) null);
        } else {
            this.pointsData = pointsData;
        }
        if ((i & 8) == 0) {
            this.value = "";
        } else {
            this.value = str3;
        }
    }

    public static final /* synthetic */ void EZpvd(Points points, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) points.leftCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, points.leftCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) points.logo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, points.logo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(points.pointsData, new PointsData((List) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, PointsData$$serializer.INSTANCE, points.pointsData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) points.value, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, points.value);
    }

    public Points(@NotNull String str, @NotNull String str2, @NotNull PointsData pointsData, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(pointsData, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.leftCount = str;
        this.logo = str2;
        this.pointsData = pointsData;
        this.value = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r7v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r7v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.response.PointsData:?: TERNARY null = ((wrap:int:0x000c: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.data.bean.response.PointsData:0x0014: CONSTRUCTOR 
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:225) call: com.okinc.business.invest_biz.data.bean.response.PointsData.<init>(java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r5v0 com.okinc.business.invest_biz.data.bean.response.PointsData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r7v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.response.PointsData, java.lang.String):void (m)] (LINE:219) call: com.okinc.business.invest_biz.data.bean.response.Points.<init>(java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.response.PointsData, java.lang.String):void type: THIS */
    public /* synthetic */ Points(String str, String str2, PointsData pointsData, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new PointsData((List) null, (String) null, 3, (DefaultConstructorMarker) null) : pointsData, (i & 8) != 0 ? "" : str3);
    }
}
