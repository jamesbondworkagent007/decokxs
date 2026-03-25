package com.okinc.planet.ext;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.planet.ext.FragmentExtKt$repeatListenRxEventOnCreate$2;
import com.okinc.rxutils.RxBus;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C43453rpa;
import o.C46370tRv;
import o.InterfaceC58217yxC;

/* JADX INFO: loaded from: classes24.dex */
public final class FragmentExtKt$listenNetworkStateChanged$$inlined$repeatListenRxEventOnCreate$1 implements DefaultLifecycleObserver {
    public final /* synthetic */ Fragment AEQbTJ;
    public final /* synthetic */ Function1 EZpvd;
    public InterfaceC58217yxC OLrzqt;
    public final /* synthetic */ String[] copydefault;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onCreate(lifecycleOwner);
        String[] strArr = this.copydefault;
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ((String[]) Arrays.copyOf(strArr, strArr.length));
        final Function1 function1 = this.EZpvd;
        final Fragment fragment = this.AEQbTJ;
        this.OLrzqt = abstractC58185ywXAEQbTJ.AEQbTJ(new C46370tRv.TaskDescription(new Function1<String, Unit>() { // from class: com.okinc.planet.ext.FragmentExtKt$listenNetworkStateChanged$$inlined$repeatListenRxEventOnCreate$1.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(String str) {
                EZpvd(str);
                return Unit.INSTANCE;
            }

            public final void EZpvd(String str) {
                Intrinsics.copydefault((Object) str);
                Function1 function12 = function1;
                C43453rpa c43453rpa = C43453rpa.AEQbTJ;
                Context contextRequireContext = fragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                function12.invoke(Boolean.valueOf(c43453rpa.KWHzl(contextRequireContext)));
            }
        }), new C46370tRv.TaskDescription(FragmentExtKt$repeatListenRxEventOnCreate$2.StateListAnimator.AEQbTJ));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        super.onDestroy(lifecycleOwner);
    }
}
