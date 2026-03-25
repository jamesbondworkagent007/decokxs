package com.okinc.okuser.hilt;

import dagger.Lazy;
import kotlin.jvm.internal.Intrinsics;
import o.BzK;
import o.C47257tmd;
import o.C47258tme;
import o.InterfaceC47278tmy;
import o.InterfaceC4968Bxs;
import o.InterfaceC5017Bzn;
import o.pUU;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class UserModule {
    public static final UserModule EZpvd = new UserModule();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @yCR
    public final InterfaceC5017Bzn AEQbTJ(@NotNull C47257tmd c47257tmd) {
        Intrinsics.checkNotNullParameter(c47257tmd, "");
        return c47257tmd;
    }

    private UserModule() {
    }

    @yCR
    public final InterfaceC4968Bxs copydefault(@NotNull InterfaceC5017Bzn interfaceC5017Bzn) {
        Intrinsics.checkNotNullParameter(interfaceC5017Bzn, "");
        BzK.registerNativeUserStorage(interfaceC5017Bzn);
        pUU.KWHzl("UserManager", "[OKUser] register user local datasource, coreUserLocalDataSource=" + interfaceC5017Bzn);
        return BzK.getSharedCoreUserManager();
    }

    @yCR
    public final InterfaceC47278tmy KWHzl(@NotNull Lazy<C47258tme> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "");
        C47258tme c47258tme = lazy.get();
        Intrinsics.checkNotNullExpressionValue(c47258tme, "");
        return c47258tme;
    }
}
