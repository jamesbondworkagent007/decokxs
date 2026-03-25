package com.okinc.business.redbag.bean;

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

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class CoverInfo implements Parcelable {
    private CoverDetail dark;
    private CoverDetail light;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CoverInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CoverInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoverInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CoverInfo(parcel.readInt() == 0 ? null : CoverDetail.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CoverDetail.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoverInfo[] newArray(int i) {
            return new CoverInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoverInfo() {
        this((CoverDetail) null, (CoverDetail) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CoverInfo copy$default(CoverInfo coverInfo, CoverDetail coverDetail, CoverDetail coverDetail2, int i, Object obj) {
        if ((i & 1) != 0) {
            coverDetail = coverInfo.light;
        }
        if ((i & 2) != 0) {
            coverDetail2 = coverInfo.dark;
        }
        return coverInfo.copy(coverDetail, coverDetail2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoverDetail component1() {
        return this.light;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoverDetail component2() {
        return this.dark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoverInfo copy(CoverDetail coverDetail, CoverDetail coverDetail2) {
        return new CoverInfo(coverDetail, coverDetail2);
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
        if (!(obj instanceof CoverInfo)) {
            return false;
        }
        CoverInfo coverInfo = (CoverInfo) obj;
        return Intrinsics.EZpvd(this.light, coverInfo.light) && Intrinsics.EZpvd(this.dark, coverInfo.dark);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoverDetail getDark() {
        return this.dark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoverDetail getLight() {
        return this.light;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        CoverDetail coverDetail = this.light;
        int iHashCode = coverDetail == null ? 0 : coverDetail.hashCode();
        CoverDetail coverDetail2 = this.dark;
        return (iHashCode * 31) + (coverDetail2 != null ? coverDetail2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDark(CoverDetail coverDetail) {
        this.dark = coverDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLight(CoverDetail coverDetail) {
        this.light = coverDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoverInfo(light=" + this.light + ", dark=" + this.dark + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        CoverDetail coverDetail = this.light;
        if (coverDetail == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            coverDetail.writeToParcel(parcel, i);
        }
        CoverDetail coverDetail2 = this.dark;
        if (coverDetail2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            coverDetail2.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.redbag.bean.CoverInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoverInfo> serializer() {
            return CoverInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoverInfo(int i, CoverDetail coverDetail, CoverDetail coverDetail2, SerializationConstructorMarker serializationConstructorMarker) {
        this.light = (i & 1) == 0 ? new CoverDetail((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : coverDetail;
        if ((i & 2) == 0) {
            this.dark = new CoverDetail((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        } else {
            this.dark = coverDetail2;
        }
    }

    public static final /* synthetic */ void write$Self$OKRedPacket_redbag_api(CoverInfo coverInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(coverInfo.light, new CoverDetail((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, CoverDetail$$serializer.INSTANCE, coverInfo.light);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(coverInfo.dark, new CoverDetail((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, CoverDetail$$serializer.INSTANCE, coverInfo.dark);
    }

    public CoverInfo(CoverDetail coverDetail, CoverDetail coverDetail2) {
        this.light = coverDetail;
        this.dark = coverDetail2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (wrap:com.okinc.business.redbag.bean.CoverDetail:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.redbag.bean.CoverDetail:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:22) call: com.okinc.business.redbag.bean.CoverDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r8v0 com.okinc.business.redbag.bean.CoverDetail))
  (wrap:com.okinc.business.redbag.bean.CoverDetail:?: TERNARY null = ((wrap:int:0x0011: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.redbag.bean.CoverDetail:0x001f: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:23) call: com.okinc.business.redbag.bean.CoverDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r9v0 com.okinc.business.redbag.bean.CoverDetail))
 A[MD:(com.okinc.business.redbag.bean.CoverDetail, com.okinc.business.redbag.bean.CoverDetail):void (m)] (LINE:21) call: com.okinc.business.redbag.bean.CoverInfo.<init>(com.okinc.business.redbag.bean.CoverDetail, com.okinc.business.redbag.bean.CoverDetail):void type: THIS */
    public /* synthetic */ CoverInfo(CoverDetail coverDetail, CoverDetail coverDetail2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CoverDetail((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : coverDetail, (i & 2) != 0 ? new CoverDetail((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : coverDetail2);
    }
}
