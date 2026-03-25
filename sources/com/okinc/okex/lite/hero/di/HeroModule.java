package com.okinc.okex.lite.hero.di;

import android.content.Context;
import com.okinc.components.track.ABTestManager;
import kotlin.jvm.internal.Intrinsics;
import o.C45706svB;
import o.C45708svD;
import o.C45714svK;
import o.C45743svz;
import o.InterfaceC45675suX;
import o.InterfaceC45723svf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class HeroModule {
    public static final HeroModule KWHzl = new HeroModule();

    private HeroModule() {
    }

    public final InterfaceC45675suX AEQbTJ() {
        return InterfaceC45675suX.Companion.AEQbTJ();
    }

    public final C45708svD copydefault(@NotNull InterfaceC45723svf interfaceC45723svf, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(interfaceC45723svf, "");
        Intrinsics.checkNotNullParameter(context, "");
        return new C45708svD(interfaceC45723svf, C45714svK.OLrzqt, context);
    }

    public final C45743svz AEQbTJ(@NotNull C45706svB c45706svB, @NotNull C45708svD c45708svD) {
        Intrinsics.checkNotNullParameter(c45706svB, "");
        Intrinsics.checkNotNullParameter(c45708svD, "");
        return new C45743svz(c45706svB, c45708svD);
    }

    public final C45706svB copydefault(@NotNull InterfaceC45723svf interfaceC45723svf) {
        Intrinsics.checkNotNullParameter(interfaceC45723svf, "");
        return new C45706svB(interfaceC45723svf);
    }

    public final ABTestManager OLrzqt() {
        return ABTestManager.AEQbTJ;
    }
}
