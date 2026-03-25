package o;

import aws.smithy.kotlin.runtime.http.HttpMethod;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.zP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Cn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5043Cn {
    public static /* synthetic */ InterfaceC5037Ch HttpRequest$default(HttpMethod httpMethod, DL dl, InterfaceC58725zN interfaceC58725zN, zP zPVar, InterfaceC58536zG interfaceC58536zG, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            interfaceC58725zN = InterfaceC58725zN.AEQbTJ.EZpvd();
        }
        if ((i & 8) != 0) {
            zPVar = zP.StateListAnimator.KWHzl;
        }
        if ((i & 16) != 0) {
            interfaceC58536zG = InterfaceC58536zG.copydefault.OLrzqt();
        }
        return copydefault(httpMethod, dl, interfaceC58725zN, zPVar, interfaceC58536zG);
    }

    public static final InterfaceC5037Ch copydefault(@NotNull HttpMethod httpMethod, @NotNull DL dl, @NotNull InterfaceC58725zN interfaceC58725zN, @NotNull zP zPVar, @NotNull InterfaceC58536zG interfaceC58536zG) {
        Intrinsics.checkNotNullParameter(httpMethod, "");
        Intrinsics.checkNotNullParameter(dl, "");
        Intrinsics.checkNotNullParameter(interfaceC58725zN, "");
        Intrinsics.checkNotNullParameter(zPVar, "");
        Intrinsics.checkNotNullParameter(interfaceC58536zG, "");
        return new C5042Cm(httpMethod, dl, interfaceC58725zN, zPVar, interfaceC58536zG);
    }

    public static final C5036Cg EZpvd(@NotNull InterfaceC5037Ch interfaceC5037Ch) {
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        if (interfaceC5037Ch instanceof C5035Cf) {
            C5035Cf c5035Cf = (C5035Cf) interfaceC5037Ch;
            if (!c5035Cf.djBIcL()) {
                throw new java.lang.IllegalStateException("This is an immutable HttpRequest that should not be converted to a builder".toString());
            }
            return c5035Cf.AhwBna();
        }
        if (interfaceC5037Ch instanceof C5042Cm) {
            C5036Cg c5036Cg = new C5036Cg();
            c5036Cg.KWHzl(interfaceC5037Ch.OLrzqt());
            c5036Cg.AEQbTJ().KWHzl(interfaceC5037Ch.EZpvd());
            C5034Ce.EZpvd(c5036Cg, interfaceC5037Ch.AEQbTJ());
            c5036Cg.EZpvd(interfaceC5037Ch.KWHzl());
            c5036Cg.AhwBna().KWHzl(interfaceC5037Ch.copydefault());
            return c5036Cg;
        }
        throw new NoWhenBranchMatchedException();
    }
}
