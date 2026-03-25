package com.okinc.crcore.coreapi.net.responsebean;

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
public final class ProfileRiskAssessmentBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int coolingRemainSeconds;
    private final int failureCount;
    private final boolean firstTime;
    private final boolean isApplicable;
    private final boolean isRisky;
    private final String productId;
    private final String productType;
    private final String userRiskToleranceLevel;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isApplicable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.firstTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.userRiskToleranceLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.productId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.productType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isRisky;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.coolingRemainSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.failureCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfileRiskAssessmentBean copy(boolean z, boolean z2, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z3, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ProfileRiskAssessmentBean(z, z2, str, str2, str3, z3, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileRiskAssessmentBean)) {
            return false;
        }
        ProfileRiskAssessmentBean profileRiskAssessmentBean = (ProfileRiskAssessmentBean) obj;
        return this.isApplicable == profileRiskAssessmentBean.isApplicable && this.firstTime == profileRiskAssessmentBean.firstTime && Intrinsics.EZpvd((Object) this.userRiskToleranceLevel, (Object) profileRiskAssessmentBean.userRiskToleranceLevel) && Intrinsics.EZpvd((Object) this.productId, (Object) profileRiskAssessmentBean.productId) && Intrinsics.EZpvd((Object) this.productType, (Object) profileRiskAssessmentBean.productType) && this.isRisky == profileRiskAssessmentBean.isRisky && this.coolingRemainSeconds == profileRiskAssessmentBean.coolingRemainSeconds && this.failureCount == profileRiskAssessmentBean.failureCount;
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
    public final boolean getFirstTime() {
        return this.firstTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProductType() {
        return this.productType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserRiskToleranceLevel() {
        return this.userRiskToleranceLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.isApplicable) * 31) + Boolean.hashCode(this.firstTime)) * 31) + this.userRiskToleranceLevel.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.productType.hashCode()) * 31) + Boolean.hashCode(this.isRisky)) * 31) + Integer.hashCode(this.coolingRemainSeconds)) * 31) + Integer.hashCode(this.failureCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isApplicable() {
        return this.isApplicable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isRisky() {
        return this.isRisky;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProfileRiskAssessmentBean(isApplicable=" + this.isApplicable + ", firstTime=" + this.firstTime + ", userRiskToleranceLevel=" + this.userRiskToleranceLevel + ", productId=" + this.productId + ", productType=" + this.productType + ", isRisky=" + this.isRisky + ", coolingRemainSeconds=" + this.coolingRemainSeconds + ", failureCount=" + this.failureCount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.ProfileRiskAssessmentBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProfileRiskAssessmentBean> serializer() {
            return ProfileRiskAssessmentBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProfileRiskAssessmentBean(int i, boolean z, boolean z2, String str, String str2, String str3, boolean z3, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i, 255, ProfileRiskAssessmentBean$$serializer.INSTANCE.getDescriptor());
        }
        this.isApplicable = z;
        this.firstTime = z2;
        this.userRiskToleranceLevel = str;
        this.productId = str2;
        this.productType = str3;
        this.isRisky = z3;
        this.coolingRemainSeconds = i2;
        this.failureCount = i3;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(ProfileRiskAssessmentBean profileRiskAssessmentBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, profileRiskAssessmentBean.isApplicable);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, profileRiskAssessmentBean.firstTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, profileRiskAssessmentBean.userRiskToleranceLevel);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, profileRiskAssessmentBean.productId);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, profileRiskAssessmentBean.productType);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 5, profileRiskAssessmentBean.isRisky);
        compositeEncoder.encodeIntElement(serialDescriptor, 6, profileRiskAssessmentBean.coolingRemainSeconds);
        compositeEncoder.encodeIntElement(serialDescriptor, 7, profileRiskAssessmentBean.failureCount);
    }

    public ProfileRiskAssessmentBean(boolean z, boolean z2, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z3, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.isApplicable = z;
        this.firstTime = z2;
        this.userRiskToleranceLevel = str;
        this.productId = str2;
        this.productType = str3;
        this.isRisky = z3;
        this.coolingRemainSeconds = i;
        this.failureCount = i2;
    }
}
