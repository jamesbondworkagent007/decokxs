package com.okinc.tradeapi.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class PositionAddTpslBean implements Parcelable {
    public static final int $stable = 0;
    private final boolean forceCheckCb;
    private final String slTriggerPx;
    private final String sz;
    private final String tpTriggerPx;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PositionAddTpslBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<PositionAddTpslBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PositionAddTpslBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PositionAddTpslBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PositionAddTpslBean[] newArray(int i) {
            return new PositionAddTpslBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PositionAddTpslBean copy$default(PositionAddTpslBean positionAddTpslBean, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = positionAddTpslBean.tpTriggerPx;
        }
        if ((i & 2) != 0) {
            str2 = positionAddTpslBean.slTriggerPx;
        }
        if ((i & 4) != 0) {
            str3 = positionAddTpslBean.sz;
        }
        if ((i & 8) != 0) {
            z = positionAddTpslBean.forceCheckCb;
        }
        return positionAddTpslBean.copy(str, str2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.forceCheckCb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PositionAddTpslBean copy(String str, String str2, String str3, boolean z) {
        return new PositionAddTpslBean(str, str2, str3, z);
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
        if (!(obj instanceof PositionAddTpslBean)) {
            return false;
        }
        PositionAddTpslBean positionAddTpslBean = (PositionAddTpslBean) obj;
        return Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) positionAddTpslBean.tpTriggerPx) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) positionAddTpslBean.slTriggerPx) && Intrinsics.EZpvd((Object) this.sz, (Object) positionAddTpslBean.sz) && this.forceCheckCb == positionAddTpslBean.forceCheckCb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getForceCheckCb() {
        return this.forceCheckCb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPx() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPx() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tpTriggerPx;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.slTriggerPx;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.sz;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.forceCheckCb);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PositionAddTpslBean(tpTriggerPx=" + this.tpTriggerPx + ", slTriggerPx=" + this.slTriggerPx + ", sz=" + this.sz + ", forceCheckCb=" + this.forceCheckCb + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tpTriggerPx);
        parcel.writeString(this.slTriggerPx);
        parcel.writeString(this.sz);
        parcel.writeInt(this.forceCheckCb ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeapi.bean.PositionAddTpslBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PositionAddTpslBean> serializer() {
            return PositionAddTpslBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PositionAddTpslBean(int i, String str, String str2, String str3, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, PositionAddTpslBean$$serializer.INSTANCE.getDescriptor());
        }
        this.tpTriggerPx = str;
        this.slTriggerPx = str2;
        this.sz = str3;
        if ((i & 8) == 0) {
            this.forceCheckCb = false;
        } else {
            this.forceCheckCb = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(PositionAddTpslBean positionAddTpslBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, positionAddTpslBean.tpTriggerPx);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, positionAddTpslBean.slTriggerPx);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, positionAddTpslBean.sz);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || positionAddTpslBean.forceCheckCb) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, positionAddTpslBean.forceCheckCb);
        }
    }

    public PositionAddTpslBean(String str, String str2, String str3, boolean z) {
        this.tpTriggerPx = str;
        this.slTriggerPx = str2;
        this.sz = str3;
        this.forceCheckCb = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:11) call: com.okinc.tradeapi.bean.PositionAddTpslBean.<init>(java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ PositionAddTpslBean(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? false : z);
    }
}
