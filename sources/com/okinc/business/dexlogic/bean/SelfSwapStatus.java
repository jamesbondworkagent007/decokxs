package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class SelfSwapStatus {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String hasPointStatus;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SelfSwapStatus() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SelfSwapStatus copy$default(SelfSwapStatus selfSwapStatus, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selfSwapStatus.hasPointStatus;
        }
        return selfSwapStatus.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.hasPointStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfSwapStatus copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SelfSwapStatus(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelfSwapStatus) && Intrinsics.EZpvd((Object) this.hasPointStatus, (Object) ((SelfSwapStatus) obj).hasPointStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHasPointStatus() {
        return this.hasPointStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.hasPointStatus.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SelfSwapStatus(hasPointStatus=" + this.hasPointStatus + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.SelfSwapStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SelfSwapStatus> serializer() {
            return SelfSwapStatus$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SelfSwapStatus(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.hasPointStatus = "";
        } else {
            this.hasPointStatus = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(SelfSwapStatus selfSwapStatus, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd((Object) selfSwapStatus.hasPointStatus, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 0, selfSwapStatus.hasPointStatus);
    }

    public SelfSwapStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hasPointStatus = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:2363) call: com.okinc.business.dexlogic.bean.SelfSwapStatus.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ SelfSwapStatus(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
