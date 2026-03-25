package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5298Mi<V> {
    public final Function1<java.lang.String, V> AEQbTJ;
    public final Function0<Unit> AYXKKw;
    public final InterfaceC5295Mf AhwBna;
    public final java.lang.String EZpvd;
    public final Function1<V, java.lang.String> KWHzl;
    public boolean OLrzqt;
    public final java.util.Map<java.lang.String, V> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, ? extends V> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super V, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5298Mi(@NotNull java.lang.String str, @NotNull InterfaceC5295Mf interfaceC5295Mf, @NotNull Function1<? super java.lang.String, ? extends V> function1, @NotNull Function1<? super V, java.lang.String> function12, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC5295Mf, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.EZpvd = str;
        this.AhwBna = interfaceC5295Mf;
        this.AEQbTJ = function1;
        this.KWHzl = function12;
        this.AYXKKw = function0;
        this.copydefault = new LinkedHashMap();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 o.Mf)
  (r9v0 kotlin.jvm.functions.Function1)
  (r10v0 kotlin.jvm.functions.Function1)
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r11v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.String, o.Mf, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends V>, kotlin.jvm.functions.Function1<? super V, java.lang.String>, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:11) call: o.Mi.<init>(java.lang.String, o.Mf, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C5298Mi(java.lang.String str, InterfaceC5295Mf interfaceC5295Mf, Function1 function1, Function1 function12, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC5295Mf, function1, function12, (i & 16) != 0 ? null : function0);
    }

    public final V EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!this.OLrzqt) {
            EZpvd();
        }
        return this.copydefault.get(str);
    }

    public final java.util.Map<java.lang.String, V> KWHzl() {
        if (!this.OLrzqt) {
            EZpvd();
        }
        return new java.util.HashMap(this.copydefault);
    }

    public final void KWHzl(@NotNull java.lang.String str, V v) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.put(str, v);
    }

    public final void EZpvd(@NotNull java.util.Map<java.lang.String, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.copydefault.putAll(map);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.remove(str);
    }

    public final void OLrzqt() {
        this.copydefault.clear();
    }

    public final void EZpvd() {
        V vInvoke;
        java.util.Map<java.lang.String, java.lang.String> mapOLrzqt = this.AhwBna.OLrzqt(this.EZpvd);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (Map.Entry<java.lang.String, java.lang.String> entry : mapOLrzqt.entrySet()) {
            try {
                vInvoke = this.AEQbTJ.invoke(entry.getValue());
            } catch (java.lang.Exception unused) {
            }
            kotlin.Pair pairOLrzqt = vInvoke != null ? C56390yDp.OLrzqt(entry.getKey(), vInvoke) : null;
            if (pairOLrzqt != null) {
                arrayList.add(pairOLrzqt);
            }
        }
        java.util.Map<java.lang.String, ? extends V> mapCopydefault = C56424yEw.copydefault(arrayList);
        OLrzqt();
        EZpvd(mapCopydefault);
        this.OLrzqt = true;
        Function0<Unit> function0 = this.AYXKKw;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Mi */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void store$default(C5298Mi c5298Mi, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = c5298Mi.copydefault;
        }
        c5298Mi.KWHzl(map);
    }

    public final void KWHzl(@NotNull java.util.Map<java.lang.String, V> map) {
        java.lang.String strInvoke;
        Intrinsics.checkNotNullParameter(map, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (Map.Entry<java.lang.String, V> entry : map.entrySet()) {
            try {
                strInvoke = this.KWHzl.invoke(entry.getValue());
            } catch (java.lang.Exception unused) {
            }
            kotlin.Pair pairOLrzqt = strInvoke != null ? C56390yDp.OLrzqt(entry.getKey(), strInvoke) : null;
            if (pairOLrzqt != null) {
                arrayList.add(pairOLrzqt);
            }
        }
        this.AhwBna.EZpvd(this.EZpvd, C56424yEw.copydefault(arrayList));
    }
}
