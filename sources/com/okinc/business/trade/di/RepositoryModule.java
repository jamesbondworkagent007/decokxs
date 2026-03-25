package com.okinc.business.trade.di;

import com.okinc.business.trade.features.home.repository.RemoteConfigRepositoryImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C19762gOj;
import o.C20051gZb;
import o.C28369kYw;
import o.InterfaceC19755gOc;
import o.InterfaceC20052gZc;
import o.InterfaceC20053gZd;
import o.InterfaceC23234huQ;
import o.InterfaceC28246kUh;
import o.InterfaceC28370kYx;
import o.InterfaceC28372kYz;
import o.gYL;
import o.gYN;
import o.gYO;
import o.kYB;
import o.kYC;
import o.kYD;
import o.kYE;
import o.kYH;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class RepositoryModule {
    public static final RepositoryModule copydefault = new RepositoryModule();

    private RepositoryModule() {
    }

    @yCR
    public final InterfaceC28370kYx AEQbTJ() {
        return new C28369kYw();
    }

    @yCR
    public final InterfaceC20053gZd OLrzqt(@NotNull InterfaceC20052gZc interfaceC20052gZc, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC20052gZc, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C20051gZb(interfaceC20052gZc, coroutineDispatcher);
    }

    @yCR
    public final kYD copydefault(@NotNull InterfaceC28246kUh interfaceC28246kUh, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(interfaceC28246kUh, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(kyc, "");
        return new RemoteConfigRepositoryImpl(interfaceC28246kUh, coroutineDispatcher, kyc);
    }

    @yCR
    public final kYE OLrzqt(@NotNull InterfaceC28372kYz interfaceC28372kYz, @NotNull InterfaceC28370kYx interfaceC28370kYx, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28372kYz, "");
        Intrinsics.checkNotNullParameter(interfaceC28370kYx, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new kYH(interfaceC28372kYz, interfaceC28370kYx, coroutineDispatcher);
    }

    @yCR
    public final kYC OLrzqt() {
        return new kYB();
    }

    @yCR
    public final gYO OLrzqt(@NotNull gYL gyl, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(gyl, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new gYN(gyl, coroutineDispatcher);
    }

    @yCR
    public final InterfaceC19755gOc AEQbTJ(@NotNull InterfaceC23234huQ interfaceC23234huQ) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        return new C19762gOj(interfaceC23234huQ);
    }
}
