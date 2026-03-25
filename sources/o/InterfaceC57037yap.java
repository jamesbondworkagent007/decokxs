package o;

import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC57037yap extends InterfaceC57036yao {
    void OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super LedgerError, Unit> function12);

    void OLrzqt(@NotNull yHO<? super java.lang.String, ? super java.lang.Boolean, ? super java.lang.Integer, Unit> yho, @NotNull Function1<? super LedgerError, Unit> function1);

    void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super LedgerError, Unit> function12);
}
