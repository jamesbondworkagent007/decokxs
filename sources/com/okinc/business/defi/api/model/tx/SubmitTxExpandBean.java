package com.okinc.business.defi.api.model.tx;

import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SubmitTxExpandBean {
    public static final int $stable = 8;
    private FragmentActivity activity;
    private Boolean ignoreNotDetectUTXO;
    private Boolean ignorePendingUTXO;
    private Boolean ignoreRefreshUTXO;
    private String keystoneSignTx;
    private Boolean silentSign;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SubmitTxExpandBean() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SubmitTxExpandBean copy$default(SubmitTxExpandBean submitTxExpandBean, Boolean bool, Boolean bool2, Boolean bool3, String str, FragmentActivity fragmentActivity, Boolean bool4, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = submitTxExpandBean.ignoreNotDetectUTXO;
        }
        if ((i & 2) != 0) {
            bool2 = submitTxExpandBean.ignorePendingUTXO;
        }
        Boolean bool5 = bool2;
        if ((i & 4) != 0) {
            bool3 = submitTxExpandBean.ignoreRefreshUTXO;
        }
        Boolean bool6 = bool3;
        if ((i & 8) != 0) {
            str = submitTxExpandBean.keystoneSignTx;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            fragmentActivity = submitTxExpandBean.activity;
        }
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if ((i & 32) != 0) {
            bool4 = submitTxExpandBean.silentSign;
        }
        return submitTxExpandBean.copy(bool, bool5, bool6, str2, fragmentActivity2, bool4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.ignoreNotDetectUTXO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.ignorePendingUTXO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.ignoreRefreshUTXO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.keystoneSignTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FragmentActivity component5() {
        return this.activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.silentSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubmitTxExpandBean copy(Boolean bool, Boolean bool2, Boolean bool3, String str, FragmentActivity fragmentActivity, Boolean bool4) {
        return new SubmitTxExpandBean(bool, bool2, bool3, str, fragmentActivity, bool4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitTxExpandBean)) {
            return false;
        }
        SubmitTxExpandBean submitTxExpandBean = (SubmitTxExpandBean) obj;
        return Intrinsics.EZpvd(this.ignoreNotDetectUTXO, submitTxExpandBean.ignoreNotDetectUTXO) && Intrinsics.EZpvd(this.ignorePendingUTXO, submitTxExpandBean.ignorePendingUTXO) && Intrinsics.EZpvd(this.ignoreRefreshUTXO, submitTxExpandBean.ignoreRefreshUTXO) && Intrinsics.EZpvd((Object) this.keystoneSignTx, (Object) submitTxExpandBean.keystoneSignTx) && Intrinsics.EZpvd(this.activity, submitTxExpandBean.activity) && Intrinsics.EZpvd(this.silentSign, submitTxExpandBean.silentSign);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FragmentActivity getActivity() {
        return this.activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getIgnoreNotDetectUTXO() {
        return this.ignoreNotDetectUTXO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getIgnorePendingUTXO() {
        return this.ignorePendingUTXO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getIgnoreRefreshUTXO() {
        return this.ignoreRefreshUTXO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKeystoneSignTx() {
        return this.keystoneSignTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSilentSign() {
        return this.silentSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.ignoreNotDetectUTXO;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.ignorePendingUTXO;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.ignoreRefreshUTXO;
        int iHashCode3 = bool3 == null ? 0 : bool3.hashCode();
        String str = this.keystoneSignTx;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        FragmentActivity fragmentActivity = this.activity;
        int iHashCode5 = fragmentActivity == null ? 0 : fragmentActivity.hashCode();
        Boolean bool4 = this.silentSign;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (bool4 != null ? bool4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivity(FragmentActivity fragmentActivity) {
        this.activity = fragmentActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIgnoreNotDetectUTXO(Boolean bool) {
        this.ignoreNotDetectUTXO = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIgnorePendingUTXO(Boolean bool) {
        this.ignorePendingUTXO = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIgnoreRefreshUTXO(Boolean bool) {
        this.ignoreRefreshUTXO = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKeystoneSignTx(String str) {
        this.keystoneSignTx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSilentSign(Boolean bool) {
        this.silentSign = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SubmitTxExpandBean(ignoreNotDetectUTXO=" + this.ignoreNotDetectUTXO + ", ignorePendingUTXO=" + this.ignorePendingUTXO + ", ignoreRefreshUTXO=" + this.ignoreRefreshUTXO + ", keystoneSignTx=" + this.keystoneSignTx + ", activity=" + this.activity + ", silentSign=" + this.silentSign + ")";
    }

    public SubmitTxExpandBean(Boolean bool, Boolean bool2, Boolean bool3, String str, FragmentActivity fragmentActivity, Boolean bool4) {
        this.ignoreNotDetectUTXO = bool;
        this.ignorePendingUTXO = bool2;
        this.ignoreRefreshUTXO = bool3;
        this.keystoneSignTx = str;
        this.activity = fragmentActivity;
        this.silentSign = bool4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r6v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r7v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r8v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:androidx.fragment.app.FragmentActivity:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null androidx.fragment.app.FragmentActivity) : (r10v0 androidx.fragment.app.FragmentActivity))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r11v0 java.lang.Boolean))
 A[MD:(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, androidx.fragment.app.FragmentActivity, java.lang.Boolean):void (m)] (LINE:13) call: com.okinc.business.defi.api.model.tx.SubmitTxExpandBean.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, androidx.fragment.app.FragmentActivity, java.lang.Boolean):void type: THIS */
    public /* synthetic */ SubmitTxExpandBean(Boolean bool, Boolean bool2, Boolean bool3, String str, FragmentActivity fragmentActivity, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : fragmentActivity, (i & 32) != 0 ? null : bool4);
    }
}
