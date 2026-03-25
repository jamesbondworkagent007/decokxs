package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ExtraActualMarginResp {
    private String actualMarginSz;
    private String extraMarginSz;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ExtraActualMarginResp() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ExtraActualMarginResp copy$default(ExtraActualMarginResp extraActualMarginResp, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = extraActualMarginResp.actualMarginSz;
        }
        if ((i & 2) != 0) {
            str2 = extraActualMarginResp.extraMarginSz;
        }
        return extraActualMarginResp.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.actualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExtraActualMarginResp copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ExtraActualMarginResp(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraActualMarginResp)) {
            return false;
        }
        ExtraActualMarginResp extraActualMarginResp = (ExtraActualMarginResp) obj;
        return Intrinsics.EZpvd((Object) this.actualMarginSz, (Object) extraActualMarginResp.actualMarginSz) && Intrinsics.EZpvd((Object) this.extraMarginSz, (Object) extraActualMarginResp.extraMarginSz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActualMarginSz() {
        return this.actualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtraMarginSz() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.actualMarginSz.hashCode() * 31) + this.extraMarginSz.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActualMarginSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.actualMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtraMarginSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.extraMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExtraActualMarginResp(actualMarginSz=" + this.actualMarginSz + ", extraMarginSz=" + this.extraMarginSz + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ExtraActualMarginResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExtraActualMarginResp> serializer() {
            return ExtraActualMarginResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExtraActualMarginResp(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.actualMarginSz = "";
        } else {
            this.actualMarginSz = str;
        }
        if ((i & 2) == 0) {
            this.extraMarginSz = "";
        } else {
            this.extraMarginSz = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ExtraActualMarginResp extraActualMarginResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) extraActualMarginResp.actualMarginSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, extraActualMarginResp.actualMarginSz);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) extraActualMarginResp.extraMarginSz, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, extraActualMarginResp.extraMarginSz);
    }

    public ExtraActualMarginResp(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.actualMarginSz = str;
        this.extraMarginSz = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:2722) call: com.okinc.unify_trade.biz.ExtraActualMarginResp.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ExtraActualMarginResp(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
