package com.okinc.business.defi.api.bean;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class NewSignCallbackBean {
    public static final int $stable = 8;
    private final String body;
    private final Map<String, String> headerMap;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.api.bean.NewSignCallbackBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewSignCallbackBean copy$default(NewSignCallbackBean newSignCallbackBean, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = newSignCallbackBean.headerMap;
        }
        if ((i & 2) != 0) {
            str = newSignCallbackBean.body;
        }
        return newSignCallbackBean.copy(map, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component1() {
        return this.headerMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewSignCallbackBean copy(@NotNull Map<String, String> map, @NotNull String str) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new NewSignCallbackBean(map, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewSignCallbackBean)) {
            return false;
        }
        NewSignCallbackBean newSignCallbackBean = (NewSignCallbackBean) obj;
        return Intrinsics.EZpvd(this.headerMap, newSignCallbackBean.headerMap) && Intrinsics.EZpvd((Object) this.body, (Object) newSignCallbackBean.body);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBody() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getHeaderMap() {
        return this.headerMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.headerMap.hashCode() * 31) + this.body.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewSignCallbackBean(headerMap=" + this.headerMap + ", body=" + this.body + ")";
    }

    public NewSignCallbackBean(@NotNull Map<String, String> map, @NotNull String str) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.headerMap = map;
        this.body = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0004: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:113)) : (r1v0 java.util.Map))
  (r2v0 java.lang.String)
 A[MD:(java.util.Map<java.lang.String, java.lang.String>, java.lang.String):void (m)] (LINE:112) call: com.okinc.business.defi.api.bean.NewSignCallbackBean.<init>(java.util.Map, java.lang.String):void type: THIS */
    public /* synthetic */ NewSignCallbackBean(Map map, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C56424yEw.KWHzl() : map, str);
    }
}
