package com.okinc.business.defi.api.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public class AptosSignMessageBean extends BaseSignMessageBean {
    public static final int $stable = 8;
    private boolean address;
    private boolean application;
    private boolean chainId;
    private Integer chain_id;
    private String dAppDomain;
    private String nonce;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AptosSignMessageBean() {
        this(null, null, false, false, null, false, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getApplication() {
        return this.application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getChain_id() {
        return this.chain_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDAppDomain() {
        return this.dAppDomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(boolean z) {
        this.address = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApplication(boolean z) {
        this.application = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(boolean z) {
        this.chainId = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChain_id(Integer num) {
        this.chain_id = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDAppDomain(String str) {
        this.dAppDomain = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNonce(String str) {
        this.nonce = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 boolean) : false)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.Integer) : (null java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, boolean, boolean, java.lang.String, boolean, java.lang.Integer):void (m)] (LINE:315) call: com.okinc.business.defi.api.bean.AptosSignMessageBean.<init>(java.lang.String, java.lang.String, boolean, boolean, java.lang.String, boolean, java.lang.Integer):void type: THIS */
    public /* synthetic */ AptosSignMessageBean(String str, String str2, boolean z, boolean z2, String str3, boolean z3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? z3 : false, (i & 64) == 0 ? num : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AptosSignMessageBean(@NotNull String str, String str2, boolean z, boolean z2, String str3, boolean z3, Integer num) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
        this.nonce = str2;
        this.address = z;
        this.application = z2;
        this.dAppDomain = str3;
        this.chainId = z3;
        this.chain_id = num;
    }
}
