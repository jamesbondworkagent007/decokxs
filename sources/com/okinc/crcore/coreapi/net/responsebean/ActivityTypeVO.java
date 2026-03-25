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
public final class ActivityTypeVO {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String activityType;
    private final int code;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ActivityTypeVO copy$default(ActivityTypeVO activityTypeVO, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = activityTypeVO.code;
        }
        if ((i2 & 2) != 0) {
            str = activityTypeVO.activityType;
        }
        return activityTypeVO.copy(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.activityType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityTypeVO copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ActivityTypeVO(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTypeVO)) {
            return false;
        }
        ActivityTypeVO activityTypeVO = (ActivityTypeVO) obj;
        return this.code == activityTypeVO.code && Intrinsics.EZpvd((Object) this.activityType, (Object) activityTypeVO.activityType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivityType() {
        return this.activityType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.code) * 31) + this.activityType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ActivityTypeVO(code=" + this.code + ", activityType=" + this.activityType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.ActivityTypeVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ActivityTypeVO> serializer() {
            return ActivityTypeVO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ActivityTypeVO(int i, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ActivityTypeVO$$serializer.INSTANCE.getDescriptor());
        }
        this.code = i2;
        this.activityType = str;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(ActivityTypeVO activityTypeVO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, activityTypeVO.code);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, activityTypeVO.activityType);
    }

    public ActivityTypeVO(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.code = i;
        this.activityType = str;
    }
}
