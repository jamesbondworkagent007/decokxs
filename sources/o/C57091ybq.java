package o;

import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ybq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57091ybq extends C57089ybo implements InterfaceC57035yan {
    public final C57054ybF AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57091ybq(@NotNull android.content.Context context, @NotNull C58160yvz c58160yvz, @NotNull java.lang.String str) {
        super(c58160yvz, str);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = new C57054ybF(context, this);
    }

    @Override // o.InterfaceC57035yan
    public void KWHzl(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho, @NotNull Function1<? super LedgerError, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ.AEQbTJ(str, z, z2, yho, function1);
    }

    @Override // o.InterfaceC57035yan
    public void AEQbTJ(@NotNull yHS<? super java.lang.Boolean, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super java.lang.String, Unit> yhs, @NotNull Function1<? super LedgerError, Unit> function1) {
        Intrinsics.checkNotNullParameter(yhs, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ.OLrzqt(yhs, function1);
    }

    @Override // o.InterfaceC57035yan
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho, @NotNull Function1<? super LedgerError, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ.copydefault(str, str2, yho, function1);
    }

    @Override // o.InterfaceC57035yan
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super LedgerError, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.AEQbTJ.OLrzqt(str, str2, function1, function12);
    }

    @Override // o.InterfaceC57035yan
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super LedgerError, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.AEQbTJ.OLrzqt(str, str2, str3, function1, function12);
    }
}
