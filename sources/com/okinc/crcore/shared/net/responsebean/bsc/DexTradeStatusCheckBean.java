package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.DexTradeStatusCheckResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class DexTradeStatusCheckBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String errorCode;
    private final String errorMessage;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexTradeStatusCheckBean() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexTradeStatusCheckBean copy$default(DexTradeStatusCheckBean dexTradeStatusCheckBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dexTradeStatusCheckBean.errorCode;
        }
        if ((i & 2) != 0) {
            str2 = dexTradeStatusCheckBean.errorMessage;
        }
        return dexTradeStatusCheckBean.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.errorMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexTradeStatusCheckBean copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DexTradeStatusCheckBean(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexTradeStatusCheckBean)) {
            return false;
        }
        DexTradeStatusCheckBean dexTradeStatusCheckBean = (DexTradeStatusCheckBean) obj;
        return Intrinsics.EZpvd((Object) this.errorCode, (Object) dexTradeStatusCheckBean.errorCode) && Intrinsics.EZpvd((Object) this.errorMessage, (Object) dexTradeStatusCheckBean.errorMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.errorCode.hashCode() * 31) + this.errorMessage.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexTradeStatusCheckBean(errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ")";
    }

    public /* synthetic */ DexTradeStatusCheckBean(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.errorCode = "";
        } else {
            this.errorCode = str;
        }
        if ((i & 2) == 0) {
            this.errorMessage = "";
        } else {
            this.errorMessage = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DexTradeStatusCheckBean dexTradeStatusCheckBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexTradeStatusCheckBean.errorCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexTradeStatusCheckBean.errorCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) dexTradeStatusCheckBean.errorMessage, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, dexTradeStatusCheckBean.errorMessage);
    }

    public DexTradeStatusCheckBean(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.errorCode = str;
        this.errorMessage = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.crcore.shared.net.responsebean.bsc.DexTradeStatusCheckBean.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DexTradeStatusCheckBean(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public final boolean isStatusCheckPassed() {
        return Intrinsics.EZpvd((Object) this.errorCode, (Object) "0");
    }

    public final boolean isStatusCheckFailed() {
        return !Intrinsics.EZpvd((Object) this.errorCode, (Object) "0");
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.DexTradeStatusCheckBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DexTradeStatusCheckBean> serializer() {
            return DexTradeStatusCheckBean$$serializer.INSTANCE;
        }

        public final DexTradeStatusCheckBean OLrzqt(@NotNull DexTradeStatusCheckResponseBean dexTradeStatusCheckResponseBean) {
            Intrinsics.checkNotNullParameter(dexTradeStatusCheckResponseBean, "");
            return new DexTradeStatusCheckBean(dexTradeStatusCheckResponseBean.getErrorCode(), dexTradeStatusCheckResponseBean.getErrorMessage());
        }
    }
}
