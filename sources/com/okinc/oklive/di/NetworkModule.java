package com.okinc.oklive.di;

import com.okinc.oklive.app.data.repository.remote.LiveAuthService;
import com.okinc.oklive.app.data.repository.remote.LivestreamService;
import com.okinc.oklive.di.NetworkModule;
import dagger.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C43393roT;
import o.C44535sTn;
import o.C44537sTp;
import o.C44540sTs;
import o.C56524yIo;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class NetworkModule {
    public static final NetworkModule copydefault = new NetworkModule();

    private NetworkModule() {
    }

    public static final C44535sTn copydefault(Lazy lazy) {
        Object obj = lazy.get();
        Intrinsics.checkNotNullExpressionValue(obj, "");
        return (C44535sTn) obj;
    }

    @yCR
    public final C44540sTs KWHzl(@NotNull final Lazy<C44535sTn> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "");
        return new C44540sTs(new Function0() { // from class: o.sVE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return NetworkModule.copydefault(lazy);
            }
        });
    }

    @yCR
    public final LiveAuthService copydefault(@NotNull C44540sTs c44540sTs) {
        Intrinsics.checkNotNullParameter(c44540sTs, "");
        return (LiveAuthService) C43393roT.EZpvd(C56524yIo.AEQbTJ(LiveAuthService.class), c44540sTs);
    }

    @yCR
    public final C44535sTn AEQbTJ(@NotNull LiveAuthService liveAuthService) {
        Intrinsics.checkNotNullParameter(liveAuthService, "");
        return new C44535sTn(liveAuthService);
    }

    @yCR
    public final LivestreamService EZpvd(@NotNull C44540sTs c44540sTs) {
        Intrinsics.checkNotNullParameter(c44540sTs, "");
        return (LivestreamService) C43393roT.EZpvd(C56524yIo.AEQbTJ(LivestreamService.class), c44540sTs);
    }

    @yCR
    public final C44537sTp copydefault(@NotNull C44535sTn c44535sTn) {
        Intrinsics.checkNotNullParameter(c44535sTn, "");
        return new C44537sTp(c44535sTn);
    }
}
