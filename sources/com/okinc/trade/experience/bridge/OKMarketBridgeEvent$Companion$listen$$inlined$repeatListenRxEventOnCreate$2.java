package com.okinc.trade.experience.bridge;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C49385unZ;
import o.InterfaceC58217yxC;
import o.jSA;
import o.pUU;

/* JADX INFO: loaded from: classes24.dex */
public final class OKMarketBridgeEvent$Companion$listen$$inlined$repeatListenRxEventOnCreate$2 implements DefaultLifecycleObserver {
    public final /* synthetic */ Function1 AEQbTJ;
    public InterfaceC58217yxC EZpvd;
    public final /* synthetic */ String KWHzl;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onCreate(lifecycleOwner);
        AbstractC58185ywX abstractC58185ywXAEQbTJ = RxBus.AEQbTJ(C49385unZ.class, new String[0]);
        final String str = this.KWHzl;
        final Function1 function1 = this.AEQbTJ;
        this.EZpvd = abstractC58185ywXAEQbTJ.AEQbTJ(new jSA.ContentResolver(new Function1<C49385unZ, Unit>() { // from class: com.okinc.trade.experience.bridge.OKMarketBridgeEvent$Companion$listen$$inlined$repeatListenRxEventOnCreate$2.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(C49385unZ c49385unZ) {
                OLrzqt(c49385unZ);
                return Unit.INSTANCE;
            }

            public final void OLrzqt(C49385unZ c49385unZ) {
                C49385unZ c49385unZ2 = c49385unZ;
                pUU.OLrzqt("OKMarketBridgeEvent listened: " + c49385unZ2);
                if (Intrinsics.EZpvd((Object) c49385unZ2.OLrzqt(), (Object) str)) {
                    function1.invoke(str);
                }
            }
        }), new jSA.ContentResolver(new Function1<Throwable, Unit>() { // from class: com.okinc.trade.experience.bridge.OKMarketBridgeEvent$Companion$listen$$inlined$repeatListenRxEventOnCreate$2.3
            public final void KWHzl(Throwable th) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(Throwable th) {
                KWHzl(th);
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        super.onDestroy(lifecycleOwner);
    }
}
