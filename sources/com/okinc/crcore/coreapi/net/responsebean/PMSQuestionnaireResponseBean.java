package com.okinc.crcore.coreapi.net.responsebean;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class PMSQuestionnaireResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final int coolingRemainSeconds;
    private final int failureCount;
    private final String pillarId;
    private final String pillarType;
    private final String status;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PMSQuestionnaireResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PMSQuestionnaireResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PMSQuestionnaireResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PMSQuestionnaireResponseBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PMSQuestionnaireResponseBean[] newArray(int i) {
            return new PMSQuestionnaireResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PMSQuestionnaireResponseBean copy$default(PMSQuestionnaireResponseBean pMSQuestionnaireResponseBean, String str, String str2, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = pMSQuestionnaireResponseBean.pillarId;
        }
        if ((i3 & 2) != 0) {
            str2 = pMSQuestionnaireResponseBean.pillarType;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            str3 = pMSQuestionnaireResponseBean.status;
        }
        String str5 = str3;
        if ((i3 & 8) != 0) {
            i = pMSQuestionnaireResponseBean.coolingRemainSeconds;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = pMSQuestionnaireResponseBean.failureCount;
        }
        return pMSQuestionnaireResponseBean.copy(str, str4, str5, i4, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pillarId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pillarType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.coolingRemainSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.failureCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PMSQuestionnaireResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new PMSQuestionnaireResponseBean(str, str2, str3, i, i2);
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
        if (!(obj instanceof PMSQuestionnaireResponseBean)) {
            return false;
        }
        PMSQuestionnaireResponseBean pMSQuestionnaireResponseBean = (PMSQuestionnaireResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.pillarId, (Object) pMSQuestionnaireResponseBean.pillarId) && Intrinsics.EZpvd((Object) this.pillarType, (Object) pMSQuestionnaireResponseBean.pillarType) && Intrinsics.EZpvd((Object) this.status, (Object) pMSQuestionnaireResponseBean.status) && this.coolingRemainSeconds == pMSQuestionnaireResponseBean.coolingRemainSeconds && this.failureCount == pMSQuestionnaireResponseBean.failureCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCoolingRemainSeconds() {
        return this.coolingRemainSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFailureCount() {
        return this.failureCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPillarId() {
        return this.pillarId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPillarType() {
        return this.pillarType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.pillarId.hashCode() * 31) + this.pillarType.hashCode()) * 31) + this.status.hashCode()) * 31) + Integer.hashCode(this.coolingRemainSeconds)) * 31) + Integer.hashCode(this.failureCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PMSQuestionnaireResponseBean(pillarId=" + this.pillarId + ", pillarType=" + this.pillarType + ", status=" + this.status + ", coolingRemainSeconds=" + this.coolingRemainSeconds + ", failureCount=" + this.failureCount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.pillarId);
        parcel.writeString(this.pillarType);
        parcel.writeString(this.status);
        parcel.writeInt(this.coolingRemainSeconds);
        parcel.writeInt(this.failureCount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.PMSQuestionnaireResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PMSQuestionnaireResponseBean> serializer() {
            return PMSQuestionnaireResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PMSQuestionnaireResponseBean(int i, String str, String str2, String str3, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, PMSQuestionnaireResponseBean$$serializer.INSTANCE.getDescriptor());
        }
        this.pillarId = str;
        this.pillarType = str2;
        this.status = str3;
        this.coolingRemainSeconds = i2;
        this.failureCount = i3;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(PMSQuestionnaireResponseBean pMSQuestionnaireResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, pMSQuestionnaireResponseBean.pillarId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, pMSQuestionnaireResponseBean.pillarType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, pMSQuestionnaireResponseBean.status);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, pMSQuestionnaireResponseBean.coolingRemainSeconds);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, pMSQuestionnaireResponseBean.failureCount);
    }

    public PMSQuestionnaireResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.pillarId = str;
        this.pillarType = str2;
        this.status = str3;
        this.coolingRemainSeconds = i;
        this.failureCount = i2;
    }
}
