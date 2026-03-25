package com.okinc.business.defi.biz.database.wallet.entity;

import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class DAppFavoriteEntity {
    public static final int $stable = 8;
    private int dau;
    private long id;
    private String intro;
    private String logo;
    private String network;
    private int order;
    private String platform;
    private String tag;
    private long timeStamp;
    private double tvl;
    private String type;
    private String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DAppFavoriteEntity() {
        this(0L, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, null, null, 0, 0, 0L, 4095, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.dau;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.order;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component12() {
        return this.timeStamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component5() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.intro;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DAppFavoriteEntity copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, double d, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new DAppFavoriteEntity(j, str, str2, str3, d, str4, str5, str6, str7, i, i2, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DAppFavoriteEntity)) {
            return false;
        }
        DAppFavoriteEntity dAppFavoriteEntity = (DAppFavoriteEntity) obj;
        return this.id == dAppFavoriteEntity.id && Intrinsics.EZpvd((Object) this.platform, (Object) dAppFavoriteEntity.platform) && Intrinsics.EZpvd((Object) this.logo, (Object) dAppFavoriteEntity.logo) && Intrinsics.EZpvd((Object) this.network, (Object) dAppFavoriteEntity.network) && Double.compare(this.tvl, dAppFavoriteEntity.tvl) == 0 && Intrinsics.EZpvd((Object) this.intro, (Object) dAppFavoriteEntity.intro) && Intrinsics.EZpvd((Object) this.tag, (Object) dAppFavoriteEntity.tag) && Intrinsics.EZpvd((Object) this.type, (Object) dAppFavoriteEntity.type) && Intrinsics.EZpvd((Object) this.url, (Object) dAppFavoriteEntity.url) && this.dau == dAppFavoriteEntity.dau && this.order == dAppFavoriteEntity.order && this.timeStamp == dAppFavoriteEntity.timeStamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDau() {
        return this.dau;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntro() {
        return this.intro;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrder() {
        return this.order;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getTvl() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((Long.hashCode(this.id) * 31) + this.platform.hashCode()) * 31) + this.logo.hashCode()) * 31) + this.network.hashCode()) * 31) + Double.hashCode(this.tvl)) * 31) + this.intro.hashCode()) * 31) + this.tag.hashCode()) * 31) + this.type.hashCode()) * 31) + this.url.hashCode()) * 31) + Integer.hashCode(this.dau)) * 31) + Integer.hashCode(this.order)) * 31) + Long.hashCode(this.timeStamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDau(int i) {
        this.dau = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(long j) {
        this.id = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIntro(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.intro = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.logo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetwork(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.network = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrder(int i) {
        this.order = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlatform(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.platform = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTvl(double d) {
        this.tvl = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DAppFavoriteEntity(id=" + this.id + ", platform=" + this.platform + ", logo=" + this.logo + ", network=" + this.network + ", tvl=" + this.tvl + ", intro=" + this.intro + ", tag=" + this.tag + ", type=" + this.type + ", url=" + this.url + ", dau=" + this.dau + ", order=" + this.order + ", timeStamp=" + this.timeStamp + ")";
    }

    public DAppFavoriteEntity(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, double d, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.id = j;
        this.platform = str;
        this.logo = str2;
        this.network = str3;
        this.tvl = d;
        this.intro = str4;
        this.tag = str5;
        this.type = str6;
        this.url = str7;
        this.dau = i;
        this.order = i2;
        this.timeStamp = j2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0080: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r18v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r33v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r33v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r33v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0025: ARITH (r33v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0029: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r23v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r33v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r33v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r33v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r33v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r28v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004d: ARITH (r33v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r29v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0056: ARITH (r33v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r30v0 int) : (0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x005d: ARITH (r33v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r31v0 long))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, long):void (m)] (LINE:9) call: com.okinc.business.defi.biz.database.wallet.entity.DAppFavoriteEntity.<init>(long, java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, long):void type: THIS */
    public /* synthetic */ DAppFavoriteEntity(long j, String str, String str2, String str3, double d, String str4, String str5, String str6, String str7, int i, int i2, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? "" : str6, (i3 & 256) == 0 ? str7 : "", (i3 & 512) != 0 ? 0 : i, (i3 & 1024) == 0 ? i2 : 0, (i3 & 2048) != 0 ? 0L : j2);
    }
}
