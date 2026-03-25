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
public final class ActivityStatusVO {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String activityStatus;
    private final int code;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ActivityStatusVO copy$default(ActivityStatusVO activityStatusVO, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = activityStatusVO.code;
        }
        if ((i2 & 2) != 0) {
            str = activityStatusVO.activityStatus;
        }
        return activityStatusVO.copy(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.activityStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityStatusVO copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ActivityStatusVO(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityStatusVO)) {
            return false;
        }
        ActivityStatusVO activityStatusVO = (ActivityStatusVO) obj;
        return this.code == activityStatusVO.code && Intrinsics.EZpvd((Object) this.activityStatus, (Object) activityStatusVO.activityStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivityStatus() {
        return this.activityStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.code) * 31) + this.activityStatus.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ActivityStatusVO(code=" + this.code + ", activityStatus=" + this.activityStatus + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.ActivityStatusVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ActivityStatusVO> serializer() {
            return ActivityStatusVO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ActivityStatusVO(int i, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ActivityStatusVO$$serializer.INSTANCE.getDescriptor());
        }
        this.code = i2;
        this.activityStatus = str;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(ActivityStatusVO activityStatusVO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, activityStatusVO.code);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, activityStatusVO.activityStatus);
    }

    public ActivityStatusVO(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.code = i;
        this.activityStatus = str;
    }
}
