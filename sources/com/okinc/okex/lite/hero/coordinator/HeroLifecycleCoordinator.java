package com.okinc.okex.lite.hero.coordinator;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC45669suR;
import o.InterfaceC45711svG;
import o.yCM;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class HeroLifecycleCoordinator implements DefaultLifecycleObserver {
    public final Set<InterfaceC45669suR> AEQbTJ;
    public final InterfaceC45711svG KWHzl;

    @yCM
    public HeroLifecycleCoordinator(@NotNull InterfaceC45711svG interfaceC45711svG) {
        Intrinsics.checkNotNullParameter(interfaceC45711svG, "");
        this.KWHzl = interfaceC45711svG;
        this.AEQbTJ = new LinkedHashSet();
    }

    public final void AEQbTJ(@NotNull InterfaceC45669suR interfaceC45669suR) {
        Intrinsics.checkNotNullParameter(interfaceC45669suR, "");
        this.AEQbTJ.add(interfaceC45669suR);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onCreate(lifecycleOwner);
        this.KWHzl.AEQbTJ("HeroLifecycleCoordinator onCreate");
        Iterator<T> it = this.AEQbTJ.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC45669suR) it.next()).EZpvd(lifecycleOwner);
            } catch (Exception e) {
                this.KWHzl.OLrzqt("Error in lifecycle observer onCreate", e);
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onDestroy(lifecycleOwner);
        this.KWHzl.AEQbTJ("HeroLifecycleCoordinator onDestroy");
        Iterator<T> it = this.AEQbTJ.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC45669suR) it.next()).OLrzqt(lifecycleOwner);
            } catch (Exception e) {
                this.KWHzl.OLrzqt("Error in lifecycle observer onDestroy", e);
            }
        }
        this.AEQbTJ.clear();
        this.KWHzl.AEQbTJ("All observers cleared");
    }
}
