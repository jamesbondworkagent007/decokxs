package com.okinc.wholesale.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class VipLandingPageVersionBean {
    public static final int $stable = 8;
    private String vipLandingPageVersion;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VipLandingPageVersionBean() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VipLandingPageVersionBean copy$default(VipLandingPageVersionBean vipLandingPageVersionBean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vipLandingPageVersionBean.vipLandingPageVersion;
        }
        return vipLandingPageVersionBean.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.vipLandingPageVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VipLandingPageVersionBean copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new VipLandingPageVersionBean(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VipLandingPageVersionBean) && Intrinsics.EZpvd((Object) this.vipLandingPageVersion, (Object) ((VipLandingPageVersionBean) obj).vipLandingPageVersion);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVipLandingPageVersion() {
        return this.vipLandingPageVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.vipLandingPageVersion.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVipLandingPageVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.vipLandingPageVersion = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VipLandingPageVersionBean(vipLandingPageVersion=" + this.vipLandingPageVersion + ")";
    }

    public VipLandingPageVersionBean(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.vipLandingPageVersion = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:10) call: com.okinc.wholesale.bean.VipLandingPageVersionBean.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ VipLandingPageVersionBean(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
