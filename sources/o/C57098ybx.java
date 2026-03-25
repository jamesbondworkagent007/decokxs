package o;

import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ybx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57098ybx {
    public final Function1<byte[], Unit> AEQbTJ;
    public final Function1<LedgerError, Unit> EZpvd;
    public final byte[] KWHzl;
    public final java.lang.String OLrzqt;
    public final C58160yvz copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<byte[], Unit> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58160yvz OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<LedgerError, Unit> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super byte[], kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.wallet.hardware.api.ledger.model.LedgerError, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C57098ybx(@NotNull C58160yvz c58160yvz, @NotNull byte[] bArr, @NotNull java.lang.String str, @NotNull Function1<? super byte[], Unit> function1, @NotNull Function1<? super LedgerError, Unit> function12) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.copydefault = c58160yvz;
        this.KWHzl = bArr;
        this.OLrzqt = str;
        this.AEQbTJ = function1;
        this.EZpvd = function12;
    }
}
