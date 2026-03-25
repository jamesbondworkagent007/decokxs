package com.okinc.business.defi.dapp.webview.okxconnect;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class Namespace {
    public static final int $stable = 8;
    private final List<String> chains;
    private final String namespace;
    private final Map<String, Request> params;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.dapp.webview.okxconnect.Namespace */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Namespace copy$default(Namespace namespace, String str, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = namespace.namespace;
        }
        if ((i & 2) != 0) {
            list = namespace.chains;
        }
        if ((i & 4) != 0) {
            map = namespace.params;
        }
        return namespace.copy(str, list, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.namespace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Request> component3() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Namespace copy(@NotNull String str, @NotNull List<String> list, Map<String, Request> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new Namespace(str, list, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Namespace)) {
            return false;
        }
        Namespace namespace = (Namespace) obj;
        return Intrinsics.EZpvd((Object) this.namespace, (Object) namespace.namespace) && Intrinsics.EZpvd(this.chains, namespace.chains) && Intrinsics.EZpvd(this.params, namespace.params);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getChains() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNamespace() {
        return this.namespace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Request> getParams() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.namespace.hashCode();
        int iHashCode2 = this.chains.hashCode();
        Map<String, Request> map = this.params;
        return (((iHashCode * 31) + iHashCode2) * 31) + (map == null ? 0 : map.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Namespace(namespace=" + this.namespace + ", chains=" + this.chains + ", params=" + this.params + ")";
    }

    public Namespace(@NotNull String str, @NotNull List<String> list, Map<String, Request> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.namespace = str;
        this.chains = list;
        this.params = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.util.List)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r3v0 java.util.Map))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.util.Map<java.lang.String, com.okinc.business.defi.dapp.webview.okxconnect.Request>):void (m)] (LINE:24) call: com.okinc.business.defi.dapp.webview.okxconnect.Namespace.<init>(java.lang.String, java.util.List, java.util.Map):void type: THIS */
    public /* synthetic */ Namespace(String str, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : map);
    }
}
