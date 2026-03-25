package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.koin.core.error.NoParameterFoundException;

/* JADX INFO: renamed from: o.zuc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60053zuc {
    public final java.lang.Boolean AEQbTJ;
    public int EZpvd;
    public final java.util.List<java.lang.Object> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C60053zuc() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Object> copydefault() {
        return this.OLrzqt;
    }

    public C60053zuc(@NotNull java.util.List<java.lang.Object> list, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
        this.AEQbTJ = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:34) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r2v0 java.lang.Boolean))
 A[MD:(java.util.List<java.lang.Object>, java.lang.Boolean):void (m)] (LINE:32) call: o.zuc.<init>(java.util.List, java.lang.Boolean):void type: THIS */
    public /* synthetic */ C60053zuc(java.util.List list, java.lang.Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.ArrayList() : list, (i & 2) != 0 ? null : bool);
    }

    public <T> T OLrzqt(int i, @NotNull InterfaceC56551yJo<?> interfaceC56551yJo) throws NoParameterFoundException {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        if (this.OLrzqt.size() > i) {
            return (T) this.OLrzqt.get(i);
        }
        throw new NoParameterFoundException("Can't get injected parameter #" + i + " from " + this + " for type '" + C60067zuq.KWHzl(interfaceC56551yJo) + '\'');
    }

    public final C60053zuc AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        this.OLrzqt.add(obj);
        return this;
    }

    public <T> T copydefault(@NotNull InterfaceC56551yJo<?> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        if (this.OLrzqt.isEmpty()) {
            return null;
        }
        java.lang.Boolean bool = this.AEQbTJ;
        if (bool != null) {
            return Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) ? (T) OLrzqt(interfaceC56551yJo) : (T) KWHzl(interfaceC56551yJo);
        }
        T t = (T) OLrzqt(interfaceC56551yJo);
        return t == null ? (T) KWHzl(interfaceC56551yJo) : t;
    }

    public final <T> T OLrzqt(InterfaceC56551yJo<?> interfaceC56551yJo) {
        java.lang.Object obj = this.OLrzqt.get(this.EZpvd);
        T t = null;
        if (!interfaceC56551yJo.copydefault(obj)) {
            obj = null;
        }
        if (obj != null) {
            t = (T) obj;
        }
        if (t != null) {
            AEQbTJ();
        }
        return t;
    }

    public final void AEQbTJ() {
        if (this.EZpvd < yDY.AuCTel(this.OLrzqt)) {
            this.EZpvd++;
        }
    }

    public java.lang.String toString() {
        return "DefinitionParameters" + CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.OLrzqt);
    }

    public final <T> T KWHzl(InterfaceC56551yJo<?> interfaceC56551yJo) {
        T next;
        java.util.Iterator<T> it = this.OLrzqt.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (interfaceC56551yJo.copydefault(next)) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        return null;
    }
}
