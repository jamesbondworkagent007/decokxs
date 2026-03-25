package com.okinc.business.defi.api.model.tx.signdata;

import com.okinc.business.defi.api.bean.SignType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EVMMessageSignData extends MessageSignData {
    public static final int $stable = 0;
    private final boolean isPersonSign;
    private final String method;
    private final String raw;
    private final SignType signType;
    private final String signTypedDataVersion;
    private final String wcAuthRequestIssuer;

    public static /* synthetic */ void isPersonSign$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRaw() {
        return this.raw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignType getSignType() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignTypedDataVersion() {
        return this.signTypedDataVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWcAuthRequestIssuer() {
        return this.wcAuthRequestIssuer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPersonSign() {
        return this.isPersonSign;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r15v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r9v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r15v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:com.okinc.business.defi.api.bean.SignType:?: TERNARY null = ((wrap:int:0x000f: ARITH (r15v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.SignType) : (r11v0 com.okinc.business.defi.api.bean.SignType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r15v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r15v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("V4") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r15v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, boolean, java.lang.String, com.okinc.business.defi.api.bean.SignType, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.business.defi.api.model.tx.signdata.EVMMessageSignData.<init>(java.lang.String, boolean, java.lang.String, com.okinc.business.defi.api.bean.SignType, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EVMMessageSignData(String str, boolean z, String str2, SignType signType, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : signType, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? "V4" : str4, (i & 64) == 0 ? str5 : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EVMMessageSignData(@NotNull String str, boolean z, String str2, SignType signType, String str3, String str4, String str5) {
        super(str, null);
        Intrinsics.checkNotNullParameter(str, "");
        this.isPersonSign = z;
        this.method = str2;
        this.signType = signType;
        this.raw = str3;
        this.signTypedDataVersion = str4;
        this.wcAuthRequestIssuer = str5;
    }
}
