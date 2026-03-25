package o;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Mw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5312Mw implements LR {
    public final LR AEQbTJ;
    public final java.lang.Object EZpvd;
    public final java.util.Set<java.lang.String> KWHzl;
    public final java.util.Map<java.lang.String, java.lang.String> copydefault;

    public C5312Mw(@NotNull LR lr) {
        Intrinsics.checkNotNullParameter(lr, "");
        this.AEQbTJ = lr;
        this.EZpvd = new java.lang.Object();
        this.copydefault = new LinkedHashMap();
        this.KWHzl = new LinkedHashSet();
    }

    @Override // o.LR
    public void OLrzqt(@NotNull LT lt) {
        Intrinsics.checkNotNullParameter(lt, "");
        java.lang.String str = lt.copydefault().copydefault;
        if (str == null) {
            return;
        }
        synchronized (this.EZpvd) {
            if (Intrinsics.EZpvd((java.lang.Object) this.copydefault.get(lt.EZpvd()), (java.lang.Object) str)) {
                return;
            }
            this.copydefault.put(lt.EZpvd(), str);
            this.KWHzl.remove(lt.EZpvd());
            this.AEQbTJ.OLrzqt(lt);
        }
    }

    @Override // o.LR
    public void copydefault(@NotNull LT lt) {
        Intrinsics.checkNotNullParameter(lt, "");
        java.lang.String str = lt.copydefault().copydefault;
        if (str == null) {
            return;
        }
        synchronized (this.EZpvd) {
            if (Intrinsics.EZpvd((java.lang.Object) this.copydefault.get(lt.EZpvd()), (java.lang.Object) str)) {
                return;
            }
            Unit unit = Unit.INSTANCE;
            this.AEQbTJ.copydefault(lt);
        }
    }

    @Override // o.LR
    public void AEQbTJ(@NotNull LT lt) {
        Intrinsics.checkNotNullParameter(lt, "");
        synchronized (this.EZpvd) {
            if (this.KWHzl.contains(lt.EZpvd())) {
                return;
            }
            this.KWHzl.add(lt.EZpvd());
            this.copydefault.remove(lt.EZpvd());
            this.AEQbTJ.AEQbTJ(lt);
        }
    }
}
