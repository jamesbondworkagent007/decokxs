package com.okinc.okex.common.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class VerifyMeetingCodeBean implements Parcelable {
    public static final int $stable = 0;
    private final Boolean callNow;
    private final String meetingId;
    private final String uuid;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<VerifyMeetingCodeBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<VerifyMeetingCodeBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerifyMeetingCodeBean createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VerifyMeetingCodeBean(string, string2, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerifyMeetingCodeBean[] newArray(int i) {
            return new VerifyMeetingCodeBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VerifyMeetingCodeBean() {
        this((String) null, (String) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VerifyMeetingCodeBean copy$default(VerifyMeetingCodeBean verifyMeetingCodeBean, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyMeetingCodeBean.meetingId;
        }
        if ((i & 2) != 0) {
            str2 = verifyMeetingCodeBean.uuid;
        }
        if ((i & 4) != 0) {
            bool = verifyMeetingCodeBean.callNow;
        }
        return verifyMeetingCodeBean.copy(str, str2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.meetingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.callNow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerifyMeetingCodeBean copy(String str, String str2, Boolean bool) {
        return new VerifyMeetingCodeBean(str, str2, bool);
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
        if (!(obj instanceof VerifyMeetingCodeBean)) {
            return false;
        }
        VerifyMeetingCodeBean verifyMeetingCodeBean = (VerifyMeetingCodeBean) obj;
        return Intrinsics.EZpvd((Object) this.meetingId, (Object) verifyMeetingCodeBean.meetingId) && Intrinsics.EZpvd((Object) this.uuid, (Object) verifyMeetingCodeBean.uuid) && Intrinsics.EZpvd(this.callNow, verifyMeetingCodeBean.callNow);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCallNow() {
        return this.callNow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMeetingId() {
        return this.meetingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.meetingId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.uuid;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.callNow;
        return (((iHashCode * 31) + iHashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VerifyMeetingCodeBean(meetingId=" + this.meetingId + ", uuid=" + this.uuid + ", callNow=" + this.callNow + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.meetingId);
        parcel.writeString(this.uuid);
        Boolean bool = this.callNow;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.common.bean.VerifyMeetingCodeBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VerifyMeetingCodeBean> serializer() {
            return VerifyMeetingCodeBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VerifyMeetingCodeBean(int i, String str, String str2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.meetingId = null;
        } else {
            this.meetingId = str;
        }
        if ((i & 2) == 0) {
            this.uuid = null;
        } else {
            this.uuid = str2;
        }
        if ((i & 4) == 0) {
            this.callNow = null;
        } else {
            this.callNow = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_api(VerifyMeetingCodeBean verifyMeetingCodeBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || verifyMeetingCodeBean.meetingId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, verifyMeetingCodeBean.meetingId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || verifyMeetingCodeBean.uuid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, verifyMeetingCodeBean.uuid);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && verifyMeetingCodeBean.callNow == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, verifyMeetingCodeBean.callNow);
    }

    public VerifyMeetingCodeBean(String str, String str2, Boolean bool) {
        this.meetingId = str;
        this.uuid = str2;
        this.callNow = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:122) call: com.okinc.okex.common.bean.VerifyMeetingCodeBean.<init>(java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ VerifyMeetingCodeBean(String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool);
    }
}
