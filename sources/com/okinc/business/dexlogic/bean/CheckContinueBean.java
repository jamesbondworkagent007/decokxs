package com.okinc.business.dexlogic.bean;

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
public final class CheckContinueBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String checkCode;
    private final String fromChainName;
    private final String toChainName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CheckContinueBean() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CheckContinueBean copy$default(CheckContinueBean checkContinueBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkContinueBean.checkCode;
        }
        if ((i & 2) != 0) {
            str2 = checkContinueBean.fromChainName;
        }
        if ((i & 4) != 0) {
            str3 = checkContinueBean.toChainName;
        }
        return checkContinueBean.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.checkCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.toChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckContinueBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CheckContinueBean(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckContinueBean)) {
            return false;
        }
        CheckContinueBean checkContinueBean = (CheckContinueBean) obj;
        return Intrinsics.EZpvd((Object) this.checkCode, (Object) checkContinueBean.checkCode) && Intrinsics.EZpvd((Object) this.fromChainName, (Object) checkContinueBean.fromChainName) && Intrinsics.EZpvd((Object) this.toChainName, (Object) checkContinueBean.toChainName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCheckCode() {
        return this.checkCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromChainName() {
        return this.fromChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainName() {
        return this.toChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.checkCode.hashCode() * 31) + this.fromChainName.hashCode()) * 31) + this.toChainName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckContinueBean(checkCode=" + this.checkCode + ", fromChainName=" + this.fromChainName + ", toChainName=" + this.toChainName + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.CheckContinueBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckContinueBean> serializer() {
            return CheckContinueBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckContinueBean(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.checkCode = "";
        } else {
            this.checkCode = str;
        }
        if ((i & 2) == 0) {
            this.fromChainName = "";
        } else {
            this.fromChainName = str2;
        }
        if ((i & 4) == 0) {
            this.toChainName = "";
        } else {
            this.toChainName = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CheckContinueBean checkContinueBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) checkContinueBean.checkCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, checkContinueBean.checkCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) checkContinueBean.fromChainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, checkContinueBean.fromChainName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) checkContinueBean.toChainName, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, checkContinueBean.toChainName);
    }

    public CheckContinueBean(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.checkCode = str;
        this.fromChainName = str2;
        this.toChainName = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:18) call: com.okinc.business.dexlogic.bean.CheckContinueBean.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CheckContinueBean(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
