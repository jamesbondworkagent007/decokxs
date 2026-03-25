package com.okinc.unify_trade.bot.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class BotGuiderViewData {
    public static final int $stable = 0;
    private final float HPadding;
    private final float VPadding;
    private final String botType;
    private final boolean isCenter;
    private final boolean isHome;
    private final boolean isMyBotOnGoing;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotGuiderViewData copy$default(BotGuiderViewData botGuiderViewData, String str, float f, float f2, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botGuiderViewData.botType;
        }
        if ((i & 2) != 0) {
            f = botGuiderViewData.VPadding;
        }
        float f3 = f;
        if ((i & 4) != 0) {
            f2 = botGuiderViewData.HPadding;
        }
        float f4 = f2;
        if ((i & 8) != 0) {
            z = botGuiderViewData.isCenter;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = botGuiderViewData.isHome;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = botGuiderViewData.isMyBotOnGoing;
        }
        return botGuiderViewData.copy(str, f3, f4, z4, z5, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.botType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component2() {
        return this.VPadding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component3() {
        return this.HPadding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isCenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isHome;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isMyBotOnGoing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotGuiderViewData copy(@NotNull String str, float f, float f2, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new BotGuiderViewData(str, f, f2, z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotGuiderViewData)) {
            return false;
        }
        BotGuiderViewData botGuiderViewData = (BotGuiderViewData) obj;
        return Intrinsics.EZpvd((Object) this.botType, (Object) botGuiderViewData.botType) && Float.compare(this.VPadding, botGuiderViewData.VPadding) == 0 && Float.compare(this.HPadding, botGuiderViewData.HPadding) == 0 && this.isCenter == botGuiderViewData.isCenter && this.isHome == botGuiderViewData.isHome && this.isMyBotOnGoing == botGuiderViewData.isMyBotOnGoing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotType() {
        return this.botType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getHPadding() {
        return this.HPadding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getVPadding() {
        return this.VPadding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.botType.hashCode() * 31) + Float.hashCode(this.VPadding)) * 31) + Float.hashCode(this.HPadding)) * 31) + Boolean.hashCode(this.isCenter)) * 31) + Boolean.hashCode(this.isHome)) * 31) + Boolean.hashCode(this.isMyBotOnGoing);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCenter() {
        return this.isCenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHome() {
        return this.isHome;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isMyBotOnGoing() {
        return this.isMyBotOnGoing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotGuiderViewData(botType=" + this.botType + ", VPadding=" + this.VPadding + ", HPadding=" + this.HPadding + ", isCenter=" + this.isCenter + ", isHome=" + this.isHome + ", isMyBotOnGoing=" + this.isMyBotOnGoing + ")";
    }

    public BotGuiderViewData(@NotNull String str, float f, float f2, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.botType = str;
        this.VPadding = f;
        this.HPadding = f2;
        this.isCenter = z;
        this.isHome = z2;
        this.isMyBotOnGoing = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1.0f float) : (r8v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r9v0 float) : (-1.0f float))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r12v0 boolean) : false)
 A[MD:(java.lang.String, float, float, boolean, boolean, boolean):void (m)] (LINE:1295) call: com.okinc.unify_trade.bot.data.BotGuiderViewData.<init>(java.lang.String, float, float, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ BotGuiderViewData(String str, float f, float f2, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? -1.0f : f, (i & 4) == 0 ? f2 : -1.0f, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) == 0 ? z3 : false);
    }
}
