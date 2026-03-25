package com.okinc.productmatrix.biz.entrances;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C6813aWU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class EarnEntranceConfig {
    public static final int $stable = 8;
    private int isHidden;
    private Url url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EarnEntranceConfig() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EarnEntranceConfig copy$default(EarnEntranceConfig earnEntranceConfig, int i, Url url, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = earnEntranceConfig.isHidden;
        }
        if ((i2 & 2) != 0) {
            url = earnEntranceConfig.url;
        }
        return earnEntranceConfig.copy(i, url);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean canShow() {
        return this.isHidden == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Url component2() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnEntranceConfig copy(int i, @NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "");
        return new EarnEntranceConfig(i, url);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarnEntranceConfig)) {
            return false;
        }
        EarnEntranceConfig earnEntranceConfig = (EarnEntranceConfig) obj;
        return this.isHidden == earnEntranceConfig.isHidden && Intrinsics.EZpvd(this.url, earnEntranceConfig.url);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Url getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.isHidden) * 31) + this.url.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHidden(int i) {
        this.isHidden = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(@NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "");
        this.url = url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarnEntranceConfig(isHidden=" + this.isHidden + ", url=" + this.url + ")";
    }

    public EarnEntranceConfig(int i, @NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "");
        this.isHidden = i;
        this.url = url;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r1v0 int))
  (wrap:com.okinc.productmatrix.biz.entrances.Url:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.productmatrix.biz.entrances.Url:0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:0x000d: INVOKE ("/earn") STATIC call: o.aWU.AEQbTJ(java.lang.String):java.lang.String A[MD:(java.lang.String):java.lang.String (m), WRAPPED])
  (wrap:java.lang.String:0x0011: INVOKE ("/earn") STATIC call: o.aWU.AEQbTJ(java.lang.String):java.lang.String A[MD:(java.lang.String):java.lang.String (m), WRAPPED])
 A[MD:(java.lang.String, java.lang.String):void (m), WRAPPED] (LINE:51) call: com.okinc.productmatrix.biz.entrances.Url.<init>(java.lang.String, java.lang.String):void type: CONSTRUCTOR) : (r2v0 com.okinc.productmatrix.biz.entrances.Url))
 A[MD:(int, com.okinc.productmatrix.biz.entrances.Url):void (m)] (LINE:51) call: com.okinc.productmatrix.biz.entrances.EarnEntranceConfig.<init>(int, com.okinc.productmatrix.biz.entrances.Url):void type: THIS */
    public /* synthetic */ EarnEntranceConfig(int i, Url url, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? new Url(C6813aWU.AEQbTJ("/earn"), C6813aWU.AEQbTJ("/earn")) : url);
    }

    /* JADX INFO: renamed from: isHidden, reason: collision with other method in class */
    public boolean m7073isHidden() {
        return !canShow();
    }
}
