package com.okinc.crcore.coreapi.net.responsebean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class PositionDetail {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String mgnMode;
    private final Integer num;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PositionDetail() {
        this((String) null, (Integer) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PositionDetail copy$default(PositionDetail positionDetail, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = positionDetail.mgnMode;
        }
        if ((i & 2) != 0) {
            num = positionDetail.num;
        }
        return positionDetail.copy(str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PositionDetail copy(@NotNull String str, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PositionDetail(str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PositionDetail)) {
            return false;
        }
        PositionDetail positionDetail = (PositionDetail) obj;
        return Intrinsics.EZpvd((Object) this.mgnMode, (Object) positionDetail.mgnMode) && Intrinsics.EZpvd(this.num, positionDetail.num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnMode() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getNum() {
        return this.num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.mgnMode.hashCode();
        Integer num = this.num;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PositionDetail(mgnMode=" + this.mgnMode + ", num=" + this.num + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.PositionDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PositionDetail> serializer() {
            return PositionDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PositionDetail(int i, String str, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        this.mgnMode = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.num = null;
        } else {
            this.num = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(PositionDetail positionDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) positionDetail.mgnMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, positionDetail.mgnMode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && positionDetail.num == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, positionDetail.num);
    }

    public PositionDetail(@NotNull String str, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mgnMode = str;
        this.num = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.Integer):void (m)] (LINE:36) call: com.okinc.crcore.coreapi.net.responsebean.PositionDetail.<init>(java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ PositionDetail(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num);
    }
}
