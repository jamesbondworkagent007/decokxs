package com.okinc.network.okg.dns;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class WebViewConfig {
    public static final int $stable = 8;
    private String dohOpen;
    private ArrayList<String> external_whitelist;
    private ArrayList<String> whitelist;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WebViewConfig() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.network.okg.dns.WebViewConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebViewConfig copy$default(WebViewConfig webViewConfig, String str, ArrayList arrayList, ArrayList arrayList2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webViewConfig.dohOpen;
        }
        if ((i & 2) != 0) {
            arrayList = webViewConfig.whitelist;
        }
        if ((i & 4) != 0) {
            arrayList2 = webViewConfig.external_whitelist;
        }
        return webViewConfig.copy(str, arrayList, arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.dohOpen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component2() {
        return this.whitelist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component3() {
        return this.external_whitelist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewConfig copy(@NotNull String str, @NotNull ArrayList<String> arrayList, @NotNull ArrayList<String> arrayList2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        return new WebViewConfig(str, arrayList, arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewConfig)) {
            return false;
        }
        WebViewConfig webViewConfig = (WebViewConfig) obj;
        return Intrinsics.EZpvd((Object) this.dohOpen, (Object) webViewConfig.dohOpen) && Intrinsics.EZpvd(this.whitelist, webViewConfig.whitelist) && Intrinsics.EZpvd(this.external_whitelist, webViewConfig.external_whitelist);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDohOpen() {
        return this.dohOpen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getExternal_whitelist() {
        return this.external_whitelist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getWhitelist() {
        return this.whitelist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.dohOpen.hashCode() * 31) + this.whitelist.hashCode()) * 31) + this.external_whitelist.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDohOpen(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dohOpen = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExternal_whitelist(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.external_whitelist = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWhitelist(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.whitelist = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WebViewConfig(dohOpen=" + this.dohOpen + ", whitelist=" + this.whitelist + ", external_whitelist=" + this.external_whitelist + ")";
    }

    public WebViewConfig(@NotNull String str, @NotNull ArrayList<String> arrayList, @NotNull ArrayList<String> arrayList2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        this.dohOpen = str;
        this.whitelist = arrayList;
        this.external_whitelist = arrayList2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0004: SGET  A[WRAPPED] com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData.DEFAULT_INTERVAL java.lang.String) : (r1v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x000c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:137) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000f: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0015: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:138) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r3v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.util.ArrayList<java.lang.String>, java.util.ArrayList<java.lang.String>):void (m)] (LINE:136) call: com.okinc.network.okg.dns.WebViewConfig.<init>(java.lang.String, java.util.ArrayList, java.util.ArrayList):void type: THIS */
    public /* synthetic */ WebViewConfig(String str, ArrayList arrayList, ArrayList arrayList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? new ArrayList() : arrayList2);
    }
}
