package com.okinc.business.dexlogic.main.limmitorder.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class ExecutionHistory {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String code;
    private final String createTimeForSort;
    private final String detail;
    private final String executionTime;
    private final String exploreUrl;
    private final boolean onChainFailed;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ExecutionHistory() {
        this((String) null, false, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ExecutionHistory copy$default(ExecutionHistory executionHistory, String str, boolean z, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = executionHistory.createTimeForSort;
        }
        if ((i & 2) != 0) {
            z = executionHistory.onChainFailed;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str2 = executionHistory.exploreUrl;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = executionHistory.executionTime;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = executionHistory.detail;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = executionHistory.code;
        }
        return executionHistory.copy(str, z2, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.createTimeForSort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.onChainFailed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.executionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.detail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExecutionHistory copy(@NotNull String str, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new ExecutionHistory(str, z, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExecutionHistory)) {
            return false;
        }
        ExecutionHistory executionHistory = (ExecutionHistory) obj;
        return Intrinsics.EZpvd((Object) this.createTimeForSort, (Object) executionHistory.createTimeForSort) && this.onChainFailed == executionHistory.onChainFailed && Intrinsics.EZpvd((Object) this.exploreUrl, (Object) executionHistory.exploreUrl) && Intrinsics.EZpvd((Object) this.executionTime, (Object) executionHistory.executionTime) && Intrinsics.EZpvd((Object) this.detail, (Object) executionHistory.detail) && Intrinsics.EZpvd((Object) this.code, (Object) executionHistory.code);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateTimeForSort() {
        return this.createTimeForSort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetail() {
        return this.detail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExecutionTime() {
        return this.executionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExploreUrl() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getOnChainFailed() {
        return this.onChainFailed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.createTimeForSort.hashCode() * 31) + Boolean.hashCode(this.onChainFailed)) * 31) + this.exploreUrl.hashCode()) * 31) + this.executionTime.hashCode()) * 31) + this.detail.hashCode()) * 31) + this.code.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExecutionHistory(createTimeForSort=" + this.createTimeForSort + ", onChainFailed=" + this.onChainFailed + ", exploreUrl=" + this.exploreUrl + ", executionTime=" + this.executionTime + ", detail=" + this.detail + ", code=" + this.code + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.limmitorder.bean.ExecutionHistory.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExecutionHistory> serializer() {
            return ExecutionHistory$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExecutionHistory(int i, String str, boolean z, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.createTimeForSort = "";
        } else {
            this.createTimeForSort = str;
        }
        if ((i & 2) == 0) {
            this.onChainFailed = false;
        } else {
            this.onChainFailed = z;
        }
        if ((i & 4) == 0) {
            this.exploreUrl = "";
        } else {
            this.exploreUrl = str2;
        }
        if ((i & 8) == 0) {
            this.executionTime = "";
        } else {
            this.executionTime = str3;
        }
        if ((i & 16) == 0) {
            this.detail = "";
        } else {
            this.detail = str4;
        }
        if ((i & 32) == 0) {
            this.code = "";
        } else {
            this.code = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(ExecutionHistory executionHistory, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) executionHistory.createTimeForSort, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, executionHistory.createTimeForSort);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || executionHistory.onChainFailed) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, executionHistory.onChainFailed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) executionHistory.exploreUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, executionHistory.exploreUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) executionHistory.executionTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, executionHistory.executionTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) executionHistory.detail, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, executionHistory.detail);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) executionHistory.code, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, executionHistory.code);
    }

    public ExecutionHistory(@NotNull String str, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.createTimeForSort = str;
        this.onChainFailed = z;
        this.exploreUrl = str2;
        this.executionTime = str3;
        this.detail = str4;
        this.code = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:boolean:0x000e: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:202) call: com.okinc.business.dexlogic.main.limmitorder.bean.ExecutionHistory.<init>(java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ExecutionHistory(String str, boolean z, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5);
    }
}
