package com.okinc.business.dexlogic.bean;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
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
public final class MemeModeQuoteErrorBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final MemeModeQuoteErrorBean DEFAULT = new MemeModeQuoteErrorBean((String) null, (String) null, false, 7, (DefaultConstructorMarker) null);
    private final String code;
    private final boolean isError;
    private final String msg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeModeQuoteErrorBean() {
        this((String) null, (String) null, false, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MemeModeQuoteErrorBean copy$default(MemeModeQuoteErrorBean memeModeQuoteErrorBean, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memeModeQuoteErrorBean.code;
        }
        if ((i & 2) != 0) {
            str2 = memeModeQuoteErrorBean.msg;
        }
        if ((i & 4) != 0) {
            z = memeModeQuoteErrorBean.isError;
        }
        return memeModeQuoteErrorBean.copy(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeModeQuoteErrorBean copy(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new MemeModeQuoteErrorBean(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemeModeQuoteErrorBean)) {
            return false;
        }
        MemeModeQuoteErrorBean memeModeQuoteErrorBean = (MemeModeQuoteErrorBean) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) memeModeQuoteErrorBean.code) && Intrinsics.EZpvd((Object) this.msg, (Object) memeModeQuoteErrorBean.msg) && this.isError == memeModeQuoteErrorBean.isError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.code.hashCode() * 31) + this.msg.hashCode()) * 31) + Boolean.hashCode(this.isError);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isError() {
        return this.isError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeModeQuoteErrorBean(code=" + this.code + ", msg=" + this.msg + ", isError=" + this.isError + ")";
    }

    public /* synthetic */ MemeModeQuoteErrorBean(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.code = (i & 1) == 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str;
        if ((i & 2) == 0) {
            this.msg = "";
        } else {
            this.msg = str2;
        }
        if ((i & 4) == 0) {
            this.isError = false;
        } else {
            this.isError = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MemeModeQuoteErrorBean memeModeQuoteErrorBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) memeModeQuoteErrorBean.code, (Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, memeModeQuoteErrorBean.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) memeModeQuoteErrorBean.msg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, memeModeQuoteErrorBean.msg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || memeModeQuoteErrorBean.isError) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, memeModeQuoteErrorBean.isError);
        }
    }

    public MemeModeQuoteErrorBean(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.code = str;
        this.msg = str2;
        this.isError = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0004: SGET  A[WRAPPED] com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData.DEFAULT_INTERVAL java.lang.String) : (r1v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:155) call: com.okinc.business.dexlogic.bean.MemeModeQuoteErrorBean.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ MemeModeQuoteErrorBean(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.MemeModeQuoteErrorBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MemeModeQuoteErrorBean> serializer() {
            return MemeModeQuoteErrorBean$$serializer.INSTANCE;
        }

        public final MemeModeQuoteErrorBean copydefault() {
            return MemeModeQuoteErrorBean.DEFAULT;
        }
    }
}
