package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class AliFaceMergeAccountBean implements Parcelable {
    public static final int $stable = 0;
    private final Integer faceId;
    private final Integer id;
    private final String token;
    private final String transactionId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AliFaceMergeAccountBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AliFaceMergeAccountBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AliFaceMergeAccountBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AliFaceMergeAccountBean(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AliFaceMergeAccountBean[] newArray(int i) {
            return new AliFaceMergeAccountBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AliFaceMergeAccountBean() {
        this((String) null, (Integer) null, (String) null, (Integer) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AliFaceMergeAccountBean copy$default(AliFaceMergeAccountBean aliFaceMergeAccountBean, String str, Integer num, String str2, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aliFaceMergeAccountBean.transactionId;
        }
        if ((i & 2) != 0) {
            num = aliFaceMergeAccountBean.faceId;
        }
        if ((i & 4) != 0) {
            str2 = aliFaceMergeAccountBean.token;
        }
        if ((i & 8) != 0) {
            num2 = aliFaceMergeAccountBean.id;
        }
        return aliFaceMergeAccountBean.copy(str, num, str2, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.faceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AliFaceMergeAccountBean copy(String str, Integer num, String str2, Integer num2) {
        return new AliFaceMergeAccountBean(str, num, str2, num2);
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
        if (!(obj instanceof AliFaceMergeAccountBean)) {
            return false;
        }
        AliFaceMergeAccountBean aliFaceMergeAccountBean = (AliFaceMergeAccountBean) obj;
        return Intrinsics.EZpvd((Object) this.transactionId, (Object) aliFaceMergeAccountBean.transactionId) && Intrinsics.EZpvd(this.faceId, aliFaceMergeAccountBean.faceId) && Intrinsics.EZpvd((Object) this.token, (Object) aliFaceMergeAccountBean.token) && Intrinsics.EZpvd(this.id, aliFaceMergeAccountBean.id);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFaceId() {
        return this.faceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.transactionId;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.faceId;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.token;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.id;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AliFaceMergeAccountBean(transactionId=" + this.transactionId + ", faceId=" + this.faceId + ", token=" + this.token + ", id=" + this.id + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.transactionId);
        Integer num = this.faceId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.token);
        Integer num2 = this.id;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AliFaceMergeAccountBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AliFaceMergeAccountBean> serializer() {
            return AliFaceMergeAccountBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AliFaceMergeAccountBean(int i, String str, Integer num, String str2, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.transactionId = "";
        } else {
            this.transactionId = str;
        }
        if ((i & 2) == 0) {
            this.faceId = null;
        } else {
            this.faceId = num;
        }
        if ((i & 4) == 0) {
            this.token = "";
        } else {
            this.token = str2;
        }
        if ((i & 8) == 0) {
            this.id = null;
        } else {
            this.id = num2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AliFaceMergeAccountBean aliFaceMergeAccountBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) aliFaceMergeAccountBean.transactionId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, aliFaceMergeAccountBean.transactionId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || aliFaceMergeAccountBean.faceId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, aliFaceMergeAccountBean.faceId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) aliFaceMergeAccountBean.token, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, aliFaceMergeAccountBean.token);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && aliFaceMergeAccountBean.id == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, aliFaceMergeAccountBean.id);
    }

    public AliFaceMergeAccountBean(String str, Integer num, String str2, Integer num2) {
        this.transactionId = str;
        this.faceId = num;
        this.token = str2;
        this.id = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r7v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0007: ARITH (r7v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0012: ARITH (r7v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer):void (m)] (LINE:11) call: com.okinc.ok_kyc_core.data.remote.networkmodel.AliFaceMergeAccountBean.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ AliFaceMergeAccountBean(String str, Integer num, String str2, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : num2);
    }
}
