package com.okinc.business.trade.features.home.meme.di;

import kotlin.jvm.internal.Intrinsics;
import o.C28277kVl;
import o.C28285kVt;
import o.C28286kVu;
import o.InterfaceC23234huQ;
import o.InterfaceC25414iwK;
import o.InterfaceC28281kVp;
import o.InterfaceC28283kVr;
import o.InterfaceC28284kVs;
import o.InterfaceC28291kVz;
import o.InterfaceC28370kYx;
import o.kVA;
import o.kVC;
import o.kVD;
import o.kVH;
import o.kVJ;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemePresetConfigModule {
    public static final MemePresetConfigModule OLrzqt = new MemePresetConfigModule();

    private MemePresetConfigModule() {
    }

    @yCR
    public final kVH OLrzqt() {
        return new kVJ();
    }

    @yCR
    public final kVC KWHzl(@NotNull InterfaceC23234huQ interfaceC23234huQ, @NotNull InterfaceC25414iwK interfaceC25414iwK, @NotNull kVH kvh) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        Intrinsics.checkNotNullParameter(kvh, "");
        return new kVD(interfaceC23234huQ, interfaceC25414iwK, kvh);
    }

    @yCR
    public final InterfaceC28281kVp copydefault(@NotNull InterfaceC23234huQ interfaceC23234huQ, @NotNull InterfaceC28370kYx interfaceC28370kYx) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        Intrinsics.checkNotNullParameter(interfaceC28370kYx, "");
        return new C28277kVl(interfaceC23234huQ, interfaceC28370kYx);
    }

    @yCR
    public final InterfaceC28284kVs AEQbTJ() {
        return new C28285kVt();
    }

    @yCR
    public final InterfaceC28291kVz AEQbTJ(@NotNull InterfaceC23234huQ interfaceC23234huQ) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        return new kVA(interfaceC23234huQ);
    }

    @yCR
    public final InterfaceC28283kVr copydefault() {
        return new C28286kVu();
    }
}
