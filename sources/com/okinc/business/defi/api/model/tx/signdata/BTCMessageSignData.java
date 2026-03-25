package com.okinc.business.defi.api.model.tx.signdata;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class BTCMessageSignData extends MessageSignData {
    public static final String BTC_MESSAGE = "btc_message";
    public static final String BTC_PSBT = "btc_psbt";
    public static final String BTC_PSBTS = "btc_psbts";
    public static final String TYPE_BIP322_SIMPLE = "bip322-simple";
    private String from;
    private String method;
    private Boolean needBroadcast;
    private String psbtHex;
    private List<String> psbtHexs;
    private String signStr;
    private String type;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getNeedBroadcast() {
        return this.needBroadcast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPsbtHex() {
        return this.psbtHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getPsbtHexs() {
        return this.psbtHexs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignStr() {
        return this.signStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(String str) {
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMethod(String str) {
        this.method = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedBroadcast(Boolean bool) {
        this.needBroadcast = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPsbtHex(String str) {
        this.psbtHex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPsbtHexs(List<String> list) {
        this.psbtHexs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignStr(String str) {
        this.signStr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(String str) {
        this.type = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0041: CONSTRUCTOR 
  (r9v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r17v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r17v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0030: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r16v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:225) call: com.okinc.business.defi.api.model.tx.signdata.BTCMessageSignData.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ BTCMessageSignData(String str, String str2, String str3, List list, String str4, String str5, String str6, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) == 0 ? str6 : null, (i & 128) != 0 ? Boolean.FALSE : bool);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.model.tx.signdata.BTCMessageSignData.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BTCMessageSignData(@NotNull String str, String str2, String str3, List<String> list, String str4, String str5, String str6, Boolean bool) {
        super(str, null);
        Intrinsics.checkNotNullParameter(str, "");
        this.signStr = str2;
        this.psbtHex = str3;
        this.psbtHexs = list;
        this.from = str4;
        this.type = str5;
        this.method = str6;
        this.needBroadcast = bool;
    }
}
