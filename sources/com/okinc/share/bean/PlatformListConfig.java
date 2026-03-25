package com.okinc.share.bean;

import com.okinc.share.platforms.SharePlatform;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class PlatformListConfig {
    public static final int $stable = 8;
    private final int functionMaxLimit;
    private final int internalMaxLimit;
    private final List<SharePlatform> platformList;
    private final int socialMaxLimit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFunctionMaxLimit() {
        return this.functionMaxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getInternalMaxLimit() {
        return this.internalMaxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SharePlatform> getPlatformList() {
        return this.platformList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSocialMaxLimit() {
        return this.socialMaxLimit;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.share.platforms.SharePlatform> */
    /* JADX WARN: Multi-variable type inference failed */
    public PlatformListConfig(@NotNull List<? extends SharePlatform> list, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(list, "");
        this.platformList = list;
        this.socialMaxLimit = i;
        this.internalMaxLimit = i2;
        this.functionMaxLimit = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 java.util.List)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r5v0 int))
 A[MD:(java.util.List<? extends com.okinc.share.platforms.SharePlatform>, int, int, int):void (m)] (LINE:7) call: com.okinc.share.bean.PlatformListConfig.<init>(java.util.List, int, int, int):void type: THIS */
    public /* synthetic */ PlatformListConfig(List list, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i4 & 2) != 0 ? -1 : i, (i4 & 4) != 0 ? -1 : i2, (i4 & 8) != 0 ? -1 : i3);
    }
}
