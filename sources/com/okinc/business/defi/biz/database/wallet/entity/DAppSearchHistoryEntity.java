package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppSearchHistoryEntity {
    public static final int $stable = 8;
    private String balance;
    private int category;
    private String deepLink;
    private String id;
    private String logo;
    private String name;
    private String shortDescribe;
    private long timestamp;
    private int type;
    private String user;
    private String volume;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DAppSearchHistoryEntity() {
        this(null, 0, null, null, null, null, null, null, null, 0L, 0, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component10() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.deepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.user;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.shortDescribe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DAppSearchHistoryEntity copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, long j, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new DAppSearchHistoryEntity(str, i, str2, str3, str4, str5, str6, str7, str8, j, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DAppSearchHistoryEntity)) {
            return false;
        }
        DAppSearchHistoryEntity dAppSearchHistoryEntity = (DAppSearchHistoryEntity) obj;
        return Intrinsics.EZpvd((Object) this.balance, (Object) dAppSearchHistoryEntity.balance) && this.category == dAppSearchHistoryEntity.category && Intrinsics.EZpvd((Object) this.deepLink, (Object) dAppSearchHistoryEntity.deepLink) && Intrinsics.EZpvd((Object) this.id, (Object) dAppSearchHistoryEntity.id) && Intrinsics.EZpvd((Object) this.logo, (Object) dAppSearchHistoryEntity.logo) && Intrinsics.EZpvd((Object) this.user, (Object) dAppSearchHistoryEntity.user) && Intrinsics.EZpvd((Object) this.volume, (Object) dAppSearchHistoryEntity.volume) && Intrinsics.EZpvd((Object) this.name, (Object) dAppSearchHistoryEntity.name) && Intrinsics.EZpvd((Object) this.shortDescribe, (Object) dAppSearchHistoryEntity.shortDescribe) && this.timestamp == dAppSearchHistoryEntity.timestamp && this.type == dAppSearchHistoryEntity.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeepLink() {
        return this.deepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortDescribe() {
        return this.shortDescribe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUser() {
        return this.user;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolume() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.balance.hashCode() * 31) + Integer.hashCode(this.category)) * 31) + this.deepLink.hashCode()) * 31) + this.id.hashCode()) * 31) + this.logo.hashCode()) * 31) + this.user.hashCode()) * 31) + this.volume.hashCode()) * 31) + this.name.hashCode()) * 31) + this.shortDescribe.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + Integer.hashCode(this.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.balance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCategory(int i) {
        this.category = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeepLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deepLink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.logo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShortDescribe(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.shortDescribe = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUser(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.user = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVolume(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.volume = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DAppSearchHistoryEntity(balance=" + this.balance + ", category=" + this.category + ", deepLink=" + this.deepLink + ", id=" + this.id + ", logo=" + this.logo + ", user=" + this.user + ", volume=" + this.volume + ", name=" + this.name + ", shortDescribe=" + this.shortDescribe + ", timestamp=" + this.timestamp + ", type=" + this.type + ")";
    }

    public DAppSearchHistoryEntity(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, long j, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.balance = str;
        this.category = i;
        this.deepLink = str2;
        this.id = str3;
        this.logo = str4;
        this.user = str5;
        this.volume = str6;
        this.name = str7;
        this.shortDescribe = str8;
        this.timestamp = j;
        this.type = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0073: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r14v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r25v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0048: ARITH (r25v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r22v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0051: ARITH (r25v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0057: INVOKE 
  (wrap:com.okinc.business.defi.biz.database.wallet.entity.DAppHistoryType:0x0055: SGET  A[WRAPPED] (LINE:23) com.okinc.business.defi.biz.database.wallet.entity.DAppHistoryType.SEARCH_HISTORY com.okinc.business.defi.biz.database.wallet.entity.DAppHistoryType)
 VIRTUAL call: com.okinc.business.defi.biz.database.wallet.entity.DAppHistoryType.getValue():int A[MD:():int (m), WRAPPED] (LINE:23)) : (r24v0 int))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int):void (m)] (LINE:11) call: com.okinc.business.defi.biz.database.wallet.entity.DAppSearchHistoryEntity.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int):void type: THIS */
    public /* synthetic */ DAppSearchHistoryEntity(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 1 : i, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? "" : str6, (i3 & 128) != 0 ? "" : str7, (i3 & 256) == 0 ? str8 : "", (i3 & 512) != 0 ? 0L : j, (i3 & 1024) != 0 ? DAppHistoryType.SEARCH_HISTORY.getValue() : i2);
    }
}
