package o;

import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ybr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57092ybr extends C57089ybo implements InterfaceC57034yam {
    public final C57058ybJ AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57092ybr(@NotNull android.content.Context context, @NotNull C58160yvz c58160yvz, @NotNull java.lang.String str) {
        super(c58160yvz, str);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = new C57058ybJ(context, this);
    }

    @Override // o.InterfaceC57031yaj
    public void EZpvd(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, @NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho, @NotNull Function1<? super LedgerError, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ.OLrzqt(str, z, str2, yho, function1);
    }

    @Override // o.InterfaceC57031yaj
    public void OLrzqt(@NotNull C57041yat[] c57041yatArr, @NotNull java.lang.String str, @NotNull java.lang.String[] strArr, @NotNull java.lang.String[] strArr2, boolean z, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super LedgerError, Unit> function12) {
        Intrinsics.checkNotNullParameter(c57041yatArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(strArr2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.AEQbTJ.OLrzqt(c57041yatArr, str, strArr, strArr2, z, function1, function12);
    }
}
