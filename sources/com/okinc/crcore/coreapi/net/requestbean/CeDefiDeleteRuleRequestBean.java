package com.okinc.crcore.coreapi.net.requestbean;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class CeDefiDeleteRuleRequestBean implements Parcelable {
    public static final int $stable = 0;
    private final long ruleId;
    private final int sourceType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CeDefiDeleteRuleRequestBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<CeDefiDeleteRuleRequestBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CeDefiDeleteRuleRequestBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CeDefiDeleteRuleRequestBean(parcel.readInt(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CeDefiDeleteRuleRequestBean[] newArray(int i) {
            return new CeDefiDeleteRuleRequestBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CeDefiDeleteRuleRequestBean copy$default(CeDefiDeleteRuleRequestBean ceDefiDeleteRuleRequestBean, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ceDefiDeleteRuleRequestBean.sourceType;
        }
        if ((i2 & 2) != 0) {
            j = ceDefiDeleteRuleRequestBean.ruleId;
        }
        return ceDefiDeleteRuleRequestBean.copy(i, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiDeleteRuleRequestBean copy(int i, long j) {
        return new CeDefiDeleteRuleRequestBean(i, j);
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
        if (!(obj instanceof CeDefiDeleteRuleRequestBean)) {
            return false;
        }
        CeDefiDeleteRuleRequestBean ceDefiDeleteRuleRequestBean = (CeDefiDeleteRuleRequestBean) obj;
        return this.sourceType == ceDefiDeleteRuleRequestBean.sourceType && this.ruleId == ceDefiDeleteRuleRequestBean.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRuleId() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSourceType() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.sourceType) * 31) + Long.hashCode(this.ruleId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CeDefiDeleteRuleRequestBean(sourceType=" + this.sourceType + ", ruleId=" + this.ruleId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.sourceType);
        parcel.writeLong(this.ruleId);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.requestbean.CeDefiDeleteRuleRequestBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CeDefiDeleteRuleRequestBean> serializer() {
            return CeDefiDeleteRuleRequestBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CeDefiDeleteRuleRequestBean(int i, int i2, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CeDefiDeleteRuleRequestBean$$serializer.INSTANCE.getDescriptor());
        }
        this.sourceType = i2;
        this.ruleId = j;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CeDefiDeleteRuleRequestBean ceDefiDeleteRuleRequestBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, ceDefiDeleteRuleRequestBean.sourceType);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, ceDefiDeleteRuleRequestBean.ruleId);
    }

    public CeDefiDeleteRuleRequestBean(int i, long j) {
        this.sourceType = i;
        this.ruleId = j;
    }
}
