package com.okinc.business.dex.api.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class SupportSwapCheck {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int isSupportCrossSwap;
    private final int isSupportSingleSwap;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SupportSwapCheck copy$default(SupportSwapCheck supportSwapCheck, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = supportSwapCheck.isSupportSingleSwap;
        }
        if ((i3 & 2) != 0) {
            i2 = supportSwapCheck.isSupportCrossSwap;
        }
        return supportSwapCheck.copy(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.isSupportSingleSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.isSupportCrossSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportSwapCheck copy(int i, int i2) {
        return new SupportSwapCheck(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportSwapCheck)) {
            return false;
        }
        SupportSwapCheck supportSwapCheck = (SupportSwapCheck) obj;
        return this.isSupportSingleSwap == supportSwapCheck.isSupportSingleSwap && this.isSupportCrossSwap == supportSwapCheck.isSupportCrossSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.isSupportSingleSwap) * 31) + Integer.hashCode(this.isSupportCrossSwap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isSupportCrossSwap() {
        return this.isSupportCrossSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isSupportSingleSwap() {
        return this.isSupportSingleSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportSwapCheck(isSupportSingleSwap=" + this.isSupportSingleSwap + ", isSupportCrossSwap=" + this.isSupportCrossSwap + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.api.bean.SupportSwapCheck.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SupportSwapCheck> serializer() {
            return SupportSwapCheck$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SupportSwapCheck(int i, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SupportSwapCheck$$serializer.INSTANCE.getDescriptor());
        }
        this.isSupportSingleSwap = i2;
        this.isSupportCrossSwap = i3;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_api(SupportSwapCheck supportSwapCheck, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, supportSwapCheck.isSupportSingleSwap);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, supportSwapCheck.isSupportCrossSwap);
    }

    public SupportSwapCheck(int i, int i2) {
        this.isSupportSingleSwap = i;
        this.isSupportCrossSwap = i2;
    }
}
