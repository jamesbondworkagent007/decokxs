package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class RootWalletEntity {
    public static final int $stable = 8;
    private long createAt;
    private int createIndex;
    private String name;
    private String rootId;
    private int sortIndex;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RootWalletEntity() {
        this(null, null, 0, 0L, 0, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RootWalletEntity copy$default(RootWalletEntity rootWalletEntity, String str, String str2, int i, long j, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = rootWalletEntity.rootId;
        }
        if ((i3 & 2) != 0) {
            str2 = rootWalletEntity.name;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            i = rootWalletEntity.sortIndex;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            j = rootWalletEntity.createAt;
        }
        long j2 = j;
        if ((i3 & 16) != 0) {
            i2 = rootWalletEntity.createIndex;
        }
        return rootWalletEntity.copy(str, str3, i4, j2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.rootId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.sortIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.createIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RootWalletEntity copy(@NotNull String str, @NotNull String str2, int i, long j, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new RootWalletEntity(str, str2, i, j, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RootWalletEntity)) {
            return false;
        }
        RootWalletEntity rootWalletEntity = (RootWalletEntity) obj;
        return Intrinsics.EZpvd((Object) this.rootId, (Object) rootWalletEntity.rootId) && Intrinsics.EZpvd((Object) this.name, (Object) rootWalletEntity.name) && this.sortIndex == rootWalletEntity.sortIndex && this.createAt == rootWalletEntity.createAt && this.createIndex == rootWalletEntity.createIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateAt() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCreateIndex() {
        return this.createIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRootId() {
        return this.rootId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSortIndex() {
        return this.sortIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.rootId.hashCode() * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.sortIndex)) * 31) + Long.hashCode(this.createAt)) * 31) + Integer.hashCode(this.createIndex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateAt(long j) {
        this.createAt = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateIndex(int i) {
        this.createIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRootId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rootId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSortIndex(int i) {
        this.sortIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RootWalletEntity(rootId=" + this.rootId + ", name=" + this.name + ", sortIndex=" + this.sortIndex + ", createAt=" + this.createAt + ", createIndex=" + this.createIndex + ")";
    }

    public RootWalletEntity(@NotNull String str, @NotNull String str2, int i, long j, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.rootId = str;
        this.name = str2;
        this.sortIndex = i;
        this.createAt = j;
        this.createIndex = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.String) : (""))
  (wrap:int:0x0014: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r7v0 int))
  (wrap:long:0x001b: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r8v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r10v0 int))
 A[MD:(java.lang.String, java.lang.String, int, long, int):void (m)] (LINE:9) call: com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity.<init>(java.lang.String, java.lang.String, int, long, int):void type: THIS */
    public /* synthetic */ RootWalletEntity(String str, String str2, int i, long j, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) == 0 ? str2 : "", (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0L : j, (i3 & 16) != 0 ? -1 : i2);
    }
}
