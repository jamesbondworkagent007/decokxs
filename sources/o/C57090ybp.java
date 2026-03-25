package o;

import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ybp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57090ybp extends C57089ybo implements InterfaceC57037yap {
    public final C57059ybK AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57090ybp(@NotNull android.content.Context context, @NotNull C58160yvz c58160yvz, @NotNull java.lang.String str) {
        super(c58160yvz, str);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = new C57059ybK(context, this);
    }

    @Override // o.InterfaceC57037yap
    public void OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super LedgerError, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.AEQbTJ.OLrzqt(str, z, function1, function12);
    }

    @Override // o.InterfaceC57037yap
    public void OLrzqt(@NotNull yHO<? super java.lang.String, ? super java.lang.Boolean, ? super java.lang.Integer, Unit> yho, @NotNull Function1<? super LedgerError, Unit> function1) {
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ.KWHzl(yho, function1);
    }

    @Override // o.InterfaceC57037yap
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super LedgerError, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.AEQbTJ.OLrzqt(str, str2, str3, function1, function12);
    }
}
