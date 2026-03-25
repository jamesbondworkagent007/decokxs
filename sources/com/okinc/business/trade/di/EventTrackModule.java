package com.okinc.business.trade.di;

import kotlin.jvm.internal.Intrinsics;
import o.C19700gMb;
import o.C25448iws;
import o.C30613leU;
import o.C6977aZZ;
import o.InterfaceC30614leV;
import o.kYC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class EventTrackModule {
    public static final EventTrackModule OLrzqt = new EventTrackModule();

    private EventTrackModule() {
    }

    public final C25448iws AEQbTJ(@NotNull C6977aZZ c6977aZZ, @NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(c6977aZZ, "");
        Intrinsics.checkNotNullParameter(kyc, "");
        return new C25448iws(c6977aZZ, kyc);
    }

    public final InterfaceC30614leV copydefault(@NotNull C19700gMb c19700gMb) {
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        return new C30613leU(c19700gMb);
    }
}
