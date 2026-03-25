package com.okinc.ok_kyc_core.di;

import com.okinc.components.track.bean.EventParamsList;
import com.okinc.ok_kyc_core.di.DiModule;
import dagger.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C32872mll;
import o.C43251rlk;
import o.InterfaceC43702ruK;
import o.InterfaceC47278tmy;
import o.rDN;
import o.rDO;
import o.rTU;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class DiModule {
    public static final DiModule EZpvd = new DiModule();

    private DiModule() {
    }

    @yCR
    public final rTU AEQbTJ() {
        return (rTU) C43251rlk.copydefault(rTU.class);
    }

    @yCR
    public final InterfaceC43702ruK KWHzl() {
        return InterfaceC43702ruK.Activity.getInstance$default(InterfaceC43702ruK.Companion, null, null, 3, null);
    }

    @yCR
    public final rDN EZpvd(@NotNull Lazy<InterfaceC47278tmy> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "");
        return new rDO(lazy, new Function2() { // from class: o.rAK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return DiModule.OLrzqt((java.lang.String) obj, (EventParamsList) obj2);
            }
        });
    }

    public static final Unit OLrzqt(String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C32872mll.OLrzqt.copydefault(str, eventParamsList);
        return Unit.INSTANCE;
    }
}
