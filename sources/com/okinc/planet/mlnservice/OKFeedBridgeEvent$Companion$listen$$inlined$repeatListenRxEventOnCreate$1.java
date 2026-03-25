package com.okinc.planet.mlnservice;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.gson.Gson;
import com.okinc.planet.ext.FragmentExtKt$repeatListenRxEventOnCreate$3;
import com.okinc.rxutils.RxBus;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C46370tRv;
import o.C46408tTf;
import o.C56391yDq;
import o.InterfaceC58217yxC;
import o.pUU;

/* JADX INFO: loaded from: classes24.dex */
public final class OKFeedBridgeEvent$Companion$listen$$inlined$repeatListenRxEventOnCreate$1 implements DefaultLifecycleObserver {
    public InterfaceC58217yxC AEQbTJ;
    public final /* synthetic */ Function2 KWHzl;
    public final /* synthetic */ String copydefault;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onCreate(lifecycleOwner);
        AbstractC58185ywX abstractC58185ywXAEQbTJ = RxBus.AEQbTJ(C46408tTf.class, new String[0]);
        Intrinsics.OLrzqt();
        final String str = this.copydefault;
        final Function2 function2 = this.KWHzl;
        this.AEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(new C46370tRv.TaskDescription(new Function1<C46408tTf, Unit>() { // from class: com.okinc.planet.mlnservice.OKFeedBridgeEvent$Companion$listen$$inlined$repeatListenRxEventOnCreate$1.4
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(C46408tTf c46408tTf) {
                copydefault(c46408tTf);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void copydefault(C46408tTf c46408tTf) {
                Object objM7377constructorimpl;
                C46408tTf c46408tTf2 = c46408tTf;
                pUU.OLrzqt("OKFeedBridgeEvent listened: " + c46408tTf2);
                if (Intrinsics.EZpvd((Object) c46408tTf2.OLrzqt(), (Object) str)) {
                    C46408tTf.Application application = C46408tTf.Companion;
                    String strAEQbTJ = c46408tTf2.AEQbTJ();
                    if (strAEQbTJ == null || strAEQbTJ.length() == 0) {
                        objM7377constructorimpl = null;
                    } else {
                        try {
                            Result.Application application2 = Result.Companion;
                            Gson gson = new Gson();
                            Intrinsics.OLrzqt();
                            objM7377constructorimpl = gson.fromJson(strAEQbTJ, new C46408tTf.Application.StateListAnimator().getType());
                        } catch (Throwable th) {
                            Result.Application application3 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                            }
                        }
                    }
                    function2.invoke(str, objM7377constructorimpl);
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
