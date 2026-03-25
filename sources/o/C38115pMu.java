package o;

import com.just.agentweb.DefaultWebClient;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import o.pMC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pMu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38115pMu implements InterfaceC38118pMx {
    public final Function0<java.lang.Boolean> AEQbTJ;
    public final java.util.List<java.lang.String> OLrzqt;
    public final Function0<java.lang.Boolean> copydefault;

    @yCM
    public C38115pMu(@NotNull Function0<java.lang.Boolean> function0, @NotNull Function0<java.lang.Boolean> function02) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.AEQbTJ = function0;
        this.copydefault = function02;
        this.OLrzqt = yDY.gEmmrt("okx://", "okxtr://", "okex://", "okxwallet://", "okxweb3://");
    }

    @Override // o.InterfaceC38118pMx
    public pMC EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(str) ? new pMC.Activity(str) : copydefault(str) ? new pMC.TaskDescription(str) : new pMC.StateListAnimator(str);
    }

    @Override // o.InterfaceC38118pMx
    public java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString();
        if (new Regex("^[a-zA-Z][a-zA-Z\\d+\\-.]*:").containsMatchIn(string)) {
            return string;
        }
        if (new Regex("^([a-zA-Z\\d-]+\\.)+[a-zA-Z]{2,}(/.*)?$").matches(string)) {
            return DefaultWebClient.HTTPS_SCHEME + string;
        }
        return KWHzl() + string;
    }

    @Override // o.InterfaceC38118pMx
    public java.lang.String KWHzl() {
        return this.AEQbTJ.invoke().booleanValue() ? "okxwallet://" : this.copydefault.invoke().booleanValue() ? "okxtr://" : "okx://";
    }

    public final boolean OLrzqt(java.lang.String str) {
        return C59449zhJ.startsWith$default(str, "http", false, 2, null);
    }

    @Override // o.InterfaceC38118pMx
    public boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            if (C59449zhJ.startsWith$default(str, (java.lang.String) it.next(), false, 2, null)) {
                return true;
            }
        }
        return false;
    }
}
