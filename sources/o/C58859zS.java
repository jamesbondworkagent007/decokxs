package o;

import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.zP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C58859zS implements CoroutineScope {
    public final InterfaceC5039Cj AEQbTJ;
    public final C5173Hn EZpvd;
    public final CoroutineContext KWHzl;
    public final InterfaceC5037Ch OLrzqt;
    public final C5173Hn copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC5039Cj AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC5037Ch OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.KWHzl;
    }

    public C58859zS(@NotNull InterfaceC5037Ch interfaceC5037Ch, @NotNull InterfaceC5039Cj interfaceC5039Cj, @NotNull C5173Hn c5173Hn, @NotNull C5173Hn c5173Hn2, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        Intrinsics.checkNotNullParameter(interfaceC5039Cj, "");
        Intrinsics.checkNotNullParameter(c5173Hn, "");
        Intrinsics.checkNotNullParameter(c5173Hn2, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.OLrzqt = interfaceC5037Ch;
        this.AEQbTJ = interfaceC5039Cj;
        this.copydefault = c5173Hn;
        this.EZpvd = c5173Hn2;
        this.KWHzl = coroutineContext;
    }

    public static /* synthetic */ C58859zS copy$default(C58859zS c58859zS, InterfaceC5037Ch interfaceC5037Ch, InterfaceC5039Cj interfaceC5039Cj, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i & 1) != 0) {
            interfaceC5037Ch = c58859zS.OLrzqt;
        }
        if ((i & 2) != 0) {
            interfaceC5039Cj = c58859zS.AEQbTJ;
        }
        return c58859zS.AEQbTJ(interfaceC5037Ch, interfaceC5039Cj);
    }

    public C58859zS AEQbTJ(@NotNull InterfaceC5037Ch interfaceC5037Ch, @NotNull InterfaceC5039Cj interfaceC5039Cj) {
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        Intrinsics.checkNotNullParameter(interfaceC5039Cj, "");
        return new C58859zS(interfaceC5037Ch, interfaceC5039Cj, this.copydefault, this.EZpvd, getCoroutineContext());
    }

    public void EZpvd() {
        CS csCopydefault;
        try {
            Result.Application application = Result.Companion;
            zP zPVarEZpvd = this.AEQbTJ.EZpvd();
            java.lang.Boolean boolValueOf = null;
            zP.Activity activity = zPVarEZpvd instanceof zP.Activity ? (zP.Activity) zPVarEZpvd : null;
            if (activity != null && (csCopydefault = activity.copydefault()) != null) {
                boolValueOf = java.lang.Boolean.valueOf(csCopydefault.OLrzqt(null));
            }
            Result.m7377constructorimpl(boolValueOf);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
