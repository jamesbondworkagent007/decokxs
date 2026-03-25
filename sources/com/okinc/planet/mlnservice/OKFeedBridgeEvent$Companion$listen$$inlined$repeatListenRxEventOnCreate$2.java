package com.okinc.planet.mlnservice;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.planet.ext.FragmentExtKt$repeatListenRxEventOnCreate$3;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C46370tRv;
import o.C46408tTf;
import o.InterfaceC58217yxC;
import o.pUU;

/* JADX INFO: loaded from: classes24.dex */
public final class OKFeedBridgeEvent$Companion$listen$$inlined$repeatListenRxEventOnCreate$2 implements DefaultLifecycleObserver {
    public InterfaceC58217yxC AEQbTJ;
    public final /* synthetic */ String EZpvd;
    public final /* synthetic */ Function1 KWHzl;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onCreate(lifecycleOwner);
        AbstractC58185ywX abstractC58185ywXAEQbTJ = RxBus.AEQbTJ(C46408tTf.class, new String[0]);
        final String str = this.EZpvd;
        final Function1 function1 = this.KWHzl;
        this.AEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(new C46370tRv.TaskDescription(new Function1<C46408tTf, Unit>() { // from class: com.okinc.planet.mlnservice.OKFeedBridgeEvent$Companion$listen$$inlined$repeatListenRxEventOnCreate$2.1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(C46408tTf c46408tTf) {
                AEQbTJ(c46408tTf);
                return Unit.INSTANCE;
            }

            public final void AEQbTJ(C46408tTf c46408tTf) {
                C46408tTf c46408tTf2 = c46408tTf;
                pUU.OLrzqt("OKFeedBridgeEvent listened: " + c46408tTf2);
                if (Intrinsics.EZpvd((Object) c46408tTf2.OLrzqt(), (Object) str)) {
                    function1.invoke(str);
                }
            }
        }), new C46370tRv.TaskDescription(FragmentExtKt$repeatListenRxEventOnCreate$3.ActionBar.OLrzqt));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        super.onDestroy(lifecycleOwner);
    }
}
