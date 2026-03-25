package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class PreCheckBean {
    public static final int $stable = 0;
    public static final Activity Companion = new Activity(null);
    public static final int STATUS_BLACKLIST = 2;
    public static final int STATUS_CHAIN_MAINTENANCE = 3;
    public static final int STATUS_LIMIT_REGION = 1;
    public static final int STATUS_SUPPORT_QUOTE = 0;
    public static final int TYPE_DEFAULT_NO_WARNING = -1;
    public static final int TYPE_ERROR = 2;
    public static final int TYPE_WARNING = 1;
    private final String msg;
    private final int status;
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PreCheckBean() {
        this(null, 0, 0, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PreCheckBean copy$default(PreCheckBean preCheckBean, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = preCheckBean.msg;
        }
        if ((i3 & 2) != 0) {
            i = preCheckBean.status;
        }
        if ((i3 & 4) != 0) {
            i2 = preCheckBean.type;
        }
        return preCheckBean.copy(str, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreCheckBean copy(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PreCheckBean(str, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreCheckBean)) {
            return false;
        }
        PreCheckBean preCheckBean = (PreCheckBean) obj;
        return Intrinsics.EZpvd((Object) this.msg, (Object) preCheckBean.msg) && this.status == preCheckBean.status && this.type == preCheckBean.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.msg.hashCode() * 31) + Integer.hashCode(this.status)) * 31) + Integer.hashCode(this.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLimitRegion() {
        return this.status == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSupportQuote() {
        return this.status == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PreCheckBean(msg=" + this.msg + ", status=" + this.status + ", type=" + this.type + ")";
    }

    public PreCheckBean(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.msg = str;
        this.status = i;
        this.type = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r3v0 int))
 A[MD:(java.lang.String, int, int):void (m)] (LINE:10) call: com.okinc.business.dexlogic.bean.PreCheckBean.<init>(java.lang.String, int, int):void type: THIS */
    public /* synthetic */ PreCheckBean(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? -1 : i2);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.PreCheckBean.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
