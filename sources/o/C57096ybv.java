package o;

import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ybv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57096ybv {
    public final Function1<LedgerError, Unit> EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.Object OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<LedgerError, Unit> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Object KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.wallet.hardware.api.ledger.model.LedgerError, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C57096ybv(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.Object obj, @NotNull Function1<? super LedgerError, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = str;
        this.copydefault = str2;
        this.OLrzqt = obj;
        this.EZpvd = function1;
    }
}
