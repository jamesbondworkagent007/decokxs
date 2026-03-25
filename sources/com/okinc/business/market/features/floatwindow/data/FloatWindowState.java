package com.okinc.business.market.features.floatwindow.data;

import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class FloatWindowState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String lastMode;
    public final int lastX;
    public final int lastY;
    public final boolean wasVisible;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FloatWindowState() {
        this(false, (String) null, 0, 0, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FloatWindowState copy$default(FloatWindowState floatWindowState, boolean z, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = floatWindowState.wasVisible;
        }
        if ((i3 & 2) != 0) {
            str = floatWindowState.lastMode;
        }
        if ((i3 & 4) != 0) {
            i = floatWindowState.lastX;
        }
        if ((i3 & 8) != 0) {
            i2 = floatWindowState.lastY;
        }
        return floatWindowState.copydefault(z, str, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.lastY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.lastX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.wasVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FloatWindowState copydefault(boolean z, @NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new FloatWindowState(z, str, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.lastMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FloatWindowState)) {
            return false;
        }
        FloatWindowState floatWindowState = (FloatWindowState) obj;
        return this.wasVisible == floatWindowState.wasVisible && Intrinsics.EZpvd((Object) this.lastMode, (Object) floatWindowState.lastMode) && this.lastX == floatWindowState.lastX && this.lastY == floatWindowState.lastY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Boolean.hashCode(this.wasVisible) * 31) + this.lastMode.hashCode()) * 31) + Integer.hashCode(this.lastX)) * 31) + Integer.hashCode(this.lastY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FloatWindowState(wasVisible=" + this.wasVisible + ", lastMode=" + this.lastMode + ", lastX=" + this.lastX + ", lastY=" + this.lastY + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.floatwindow.data.FloatWindowState.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FloatWindowState> serializer() {
            return FloatWindowState$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FloatWindowState(int i, boolean z, String str, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.wasVisible = false;
        } else {
            this.wasVisible = z;
        }
        if ((i & 2) == 0) {
            this.lastMode = VerifyDAppDomainUrlResponse.LEVEL_MEDIUM;
        } else {
            this.lastMode = str;
        }
        if ((i & 4) == 0) {
            this.lastX = 0;
        } else {
            this.lastX = i2;
        }
        if ((i & 8) == 0) {
            this.lastY = 200;
        } else {
            this.lastY = i3;
        }
    }

    public static final /* synthetic */ void OLrzqt(FloatWindowState floatWindowState, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || floatWindowState.wasVisible) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, floatWindowState.wasVisible);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) floatWindowState.lastMode, (Object) VerifyDAppDomainUrlResponse.LEVEL_MEDIUM)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, floatWindowState.lastMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || floatWindowState.lastX != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, floatWindowState.lastX);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && floatWindowState.lastY == 200) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, floatWindowState.lastY);
    }

    public FloatWindowState(boolean z, @NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.wasVisible = z;
        this.lastMode = str;
        this.lastX = i;
        this.lastY = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x000a: SGET  A[WRAPPED] com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse.LEVEL_MEDIUM java.lang.String) : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (200 int) : (r5v0 int))
 A[MD:(boolean, java.lang.String, int, int):void (m)] (LINE:12) call: com.okinc.business.market.features.floatwindow.data.FloatWindowState.<init>(boolean, java.lang.String, int, int):void type: THIS */
    public /* synthetic */ FloatWindowState(boolean z, String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? VerifyDAppDomainUrlResponse.LEVEL_MEDIUM : str, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 200 : i2);
    }
}
