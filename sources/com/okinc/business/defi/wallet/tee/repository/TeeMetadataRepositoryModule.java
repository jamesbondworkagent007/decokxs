package com.okinc.business.defi.wallet.tee.repository;

import kotlin.jvm.internal.Intrinsics;
import o.C13934dbu;
import o.InterfaceC13426dKx;
import o.fVK;
import o.fVN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class TeeMetadataRepositoryModule {
    public static final TeeMetadataRepositoryModule copydefault = new TeeMetadataRepositoryModule();

    private TeeMetadataRepositoryModule() {
    }

    public final fVN OLrzqt(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        return InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).values();
    }

    public final fVK AEQbTJ(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        fVN fvnValues = InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).values();
        Intrinsics.copydefault(fvnValues, "");
        return (fVK) fvnValues;
    }
}
