package com.okinc.business.dexlogic.main.swap.trade.bean;

import com.okinc.business.dexlogic.bean.ConsumeData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C22332hdP;
import o.C23274hvD;
import o.C33070mpX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class FromToBalance {
    public static final int $stable = 8;
    private final ConsumeData<String> action;
    private final String availableAmountNum;
    private final String availableCurrencyAmount;
    private String balanceBracket;
    private final ConsumeData<String> content;
    private final String data;
    private ConsumeData<Boolean> error;
    private ConsumeData<String> errorContent;
    private boolean finish;
    private boolean needShowAction;
    private final ConsumeData<String> title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FromToBalance() {
        this(null, null, null, null, null, null, false, false, null, null, null, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.availableAmountNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.balanceBracket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component3() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<Boolean> component5() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component6() {
        return this.errorContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.needShowAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.finish;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.availableCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FromToBalance copy(@NotNull ConsumeData<String> consumeData, @NotNull ConsumeData<String> consumeData2, @NotNull ConsumeData<String> consumeData3, @NotNull String str, @NotNull ConsumeData<Boolean> consumeData4, @NotNull ConsumeData<String> consumeData5, boolean z, boolean z2, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        Intrinsics.checkNotNullParameter(consumeData2, "");
        Intrinsics.checkNotNullParameter(consumeData3, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(consumeData4, "");
        Intrinsics.checkNotNullParameter(consumeData5, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new FromToBalance(consumeData, consumeData2, consumeData3, str, consumeData4, consumeData5, z, z2, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FromToBalance)) {
            return false;
        }
        FromToBalance fromToBalance = (FromToBalance) obj;
        return Intrinsics.EZpvd(this.title, fromToBalance.title) && Intrinsics.EZpvd(this.content, fromToBalance.content) && Intrinsics.EZpvd(this.action, fromToBalance.action) && Intrinsics.EZpvd((Object) this.data, (Object) fromToBalance.data) && Intrinsics.EZpvd(this.error, fromToBalance.error) && Intrinsics.EZpvd(this.errorContent, fromToBalance.errorContent) && this.needShowAction == fromToBalance.needShowAction && this.finish == fromToBalance.finish && Intrinsics.EZpvd((Object) this.availableCurrencyAmount, (Object) fromToBalance.availableCurrencyAmount) && Intrinsics.EZpvd((Object) this.availableAmountNum, (Object) fromToBalance.availableAmountNum) && Intrinsics.EZpvd((Object) this.balanceBracket, (Object) fromToBalance.balanceBracket);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getAction() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableAmountNum() {
        return this.availableAmountNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableCurrencyAmount() {
        return this.availableCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalanceBracket() {
        return this.balanceBracket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<Boolean> getError() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getErrorContent() {
        return this.errorContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFinish() {
        return this.finish;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedShowAction() {
        return this.needShowAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.title.hashCode() * 31) + this.content.hashCode()) * 31) + this.action.hashCode()) * 31) + this.data.hashCode()) * 31) + this.error.hashCode()) * 31) + this.errorContent.hashCode()) * 31) + Boolean.hashCode(this.needShowAction)) * 31) + Boolean.hashCode(this.finish)) * 31) + this.availableCurrencyAmount.hashCode()) * 31) + this.availableAmountNum.hashCode()) * 31) + this.balanceBracket.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalanceBracket(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.balanceBracket = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setError(@NotNull ConsumeData<Boolean> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.error = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrorContent(@NotNull ConsumeData<String> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.errorContent = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFinish(boolean z) {
        this.finish = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedShowAction(boolean z) {
        this.needShowAction = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FromToBalance(title=" + this.title + ", content=" + this.content + ", action=" + this.action + ", data=" + this.data + ", error=" + this.error + ", errorContent=" + this.errorContent + ", needShowAction=" + this.needShowAction + ", finish=" + this.finish + ", availableCurrencyAmount=" + this.availableCurrencyAmount + ", availableAmountNum=" + this.availableAmountNum + ", balanceBracket=" + this.balanceBracket + ")";
    }

    public FromToBalance(@NotNull ConsumeData<String> consumeData, @NotNull ConsumeData<String> consumeData2, @NotNull ConsumeData<String> consumeData3, @NotNull String str, @NotNull ConsumeData<Boolean> consumeData4, @NotNull ConsumeData<String> consumeData5, boolean z, boolean z2, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        Intrinsics.checkNotNullParameter(consumeData2, "");
        Intrinsics.checkNotNullParameter(consumeData3, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(consumeData4, "");
        Intrinsics.checkNotNullParameter(consumeData5, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.title = consumeData;
        this.content = consumeData2;
        this.action = consumeData3;
        this.data = str;
        this.error = consumeData4;
        this.errorContent = consumeData5;
        this.needShowAction = z;
        this.finish = z2;
        this.availableCurrencyAmount = str2;
        this.availableAmountNum = str3;
        this.balanceBracket = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0085: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: INVOKE ("") STATIC call: o.hdP.EZpvd(java.lang.Object):com.okinc.business.dexlogic.bean.ConsumeData A[MD:<T>:(T):com.okinc.business.dexlogic.bean.ConsumeData<T> (m), WRAPPED] (LINE:42)) : (r13v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x000e: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0012: INVOKE ("") STATIC call: o.hdP.EZpvd(java.lang.Object):com.okinc.business.dexlogic.bean.ConsumeData A[MD:<T>:(T):com.okinc.business.dexlogic.bean.ConsumeData<T> (m), WRAPPED] (LINE:43)) : (r14v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001c: INVOKE ("") STATIC call: o.hdP.EZpvd(java.lang.Object):com.okinc.business.dexlogic.bean.ConsumeData A[MD:<T>:(T):com.okinc.business.dexlogic.bean.ConsumeData<T> (m), WRAPPED] (LINE:44)) : (r15v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x002a: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0030: INVOKE (wrap:java.lang.Boolean:0x002e: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) STATIC call: o.hdP.EZpvd(java.lang.Object):com.okinc.business.dexlogic.bean.ConsumeData A[MD:<T>:(T):com.okinc.business.dexlogic.bean.ConsumeData<T> (m), WRAPPED] (LINE:45)) : (r17v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0037: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0041: INVOKE 
  (wrap:java.lang.String:0x003d: INVOKE (wrap:int:0x003b: SGET  A[WRAPPED] o.hvD.Fragment.fXHmeK int) STATIC call: o.mpX.AYXKKw(int):java.lang.String A[MD:(int):java.lang.String (m), WRAPPED] (LINE:46))
 STATIC call: o.hdP.EZpvd(java.lang.Object):com.okinc.business.dexlogic.bean.ConsumeData A[MD:<T>:(T):com.okinc.business.dexlogic.bean.ConsumeData<T> (m), WRAPPED] (LINE:47)) : (r18v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0048: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0051: ARITH (r24v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r20v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0058: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0060: ARITH (r24v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("custom") : (r23v0 java.lang.String))
 A[MD:(com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, java.lang.String, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.Boolean>, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, boolean, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:41) call: com.okinc.business.dexlogic.main.swap.trade.bean.FromToBalance.<init>(com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexlogic.bean.ConsumeData, java.lang.String, com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexlogic.bean.ConsumeData, boolean, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FromToBalance(ConsumeData consumeData, ConsumeData consumeData2, ConsumeData consumeData3, String str, ConsumeData consumeData4, ConsumeData consumeData5, boolean z, boolean z2, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C22332hdP.EZpvd("") : consumeData, (i & 2) != 0 ? C22332hdP.EZpvd("") : consumeData2, (i & 4) != 0 ? C22332hdP.EZpvd("") : consumeData3, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? C22332hdP.EZpvd(Boolean.FALSE) : consumeData4, (i & 32) != 0 ? C22332hdP.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.fXHmeK)) : consumeData5, (i & 64) != 0 ? false : z, (i & 128) == 0 ? z2 : false, (i & 256) != 0 ? "" : str2, (i & 512) == 0 ? str3 : "", (i & 1024) != 0 ? "custom" : str4);
    }
}
