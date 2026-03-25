package o;

import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ybt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57094ybt extends C57089ybo implements InterfaceC57042yau {
    public final C57135ych AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57094ybt(@NotNull android.content.Context context, @NotNull C58160yvz c58160yvz, @NotNull java.lang.String str) {
        super(c58160yvz, str);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = new C57135ych(context, this);
    }

    @Override // o.InterfaceC57042yau
    public void AEQbTJ(@NotNull java.lang.String str, boolean z, @NotNull Function2<? super java.lang.String, ? super java.lang.String, Unit> function2, @NotNull Function1<? super LedgerError, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ.copydefault(str, z, function2, function1);
    }

    @Override // o.InterfaceC57042yau
    public void copydefault(@NotNull yHQ<? super java.lang.Boolean, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yhq, @NotNull Function1<? super LedgerError, Unit> function1) {
        Intrinsics.checkNotNullParameter(yhq, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ.AEQbTJ(yhq, function1);
    }

    @Override // o.InterfaceC57042yau
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String[] strArr, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super LedgerError, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.AEQbTJ.copydefault(str, str2, strArr, function1, function12);
    }
}
