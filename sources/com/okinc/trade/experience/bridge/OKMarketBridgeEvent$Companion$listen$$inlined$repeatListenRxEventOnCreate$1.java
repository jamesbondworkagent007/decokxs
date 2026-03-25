package com.okinc.trade.experience.bridge;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.gson.Gson;
import com.okinc.rxutils.RxBus;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C49385unZ;
import o.C56391yDq;
import o.InterfaceC58217yxC;
import o.jSA;
import o.pUU;

/* JADX INFO: loaded from: classes24.dex */
public final class OKMarketBridgeEvent$Companion$listen$$inlined$repeatListenRxEventOnCreate$1 implements DefaultLifecycleObserver {
    public final /* synthetic */ Function2 EZpvd;
    public final /* synthetic */ String KWHzl;
    public InterfaceC58217yxC OLrzqt;

    /* JADX INFO: renamed from: com.okinc.trade.experience.bridge.OKMarketBridgeEvent$Companion$listen$$inlined$repeatListenRxEventOnCreate$1$5, reason: invalid class name */
    public static final class AnonymousClass5 implements Function1<Throwable, Unit> {
        public static final AnonymousClass5 KWHzl = new AnonymousClass5();

        public final void OLrzqt(Throwable th) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Throwable th) {
            OLrzqt(th);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onCreate(lifecycleOwner);
        AbstractC58185ywX abstractC58185ywXAEQbTJ = RxBus.AEQbTJ(C49385unZ.class, new String[0]);
        Intrinsics.OLrzqt();
        final String str = this.KWHzl;
        final Function2 function2 = this.EZpvd;
        this.OLrzqt = abstractC58185ywXAEQbTJ.AEQbTJ(new jSA.ContentResolver(new Function1<C49385unZ, Unit>() { // from class: com.okinc.trade.experience.bridge.OKMarketBridgeEvent$Companion$listen$$inlined$repeatListenRxEventOnCreate$1.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(C49385unZ c49385unZ) {
                AEQbTJ(c49385unZ);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void AEQbTJ(C49385unZ c49385unZ) {
                Object objM7377constructorimpl;
                C49385unZ c49385unZ2 = c49385unZ;
                pUU.OLrzqt("OKMarketBridgeEvent listened: " + c49385unZ2);
                if (Intrinsics.EZpvd((Object) c49385unZ2.OLrzqt(), (Object) str)) {
                    C49385unZ.ActionBar actionBar = C49385unZ.Companion;
                    String strEZpvd = c49385unZ2.EZpvd();
                    if (strEZpvd == null || strEZpvd.length() == 0) {
                        objM7377constructorimpl = null;
                    } else {
                        try {
                            Result.Application application = Result.Companion;
                            Gson gson = new Gson();
                            Intrinsics.OLrzqt();
                            objM7377constructorimpl = gson.fromJson(strEZpvd, new C49385unZ.ActionBar.Activity().getType());
                        } catch (Throwable th) {
                            Result.Application application2 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                            }
                        }
                    }
                    function2.invoke(str, objM7377constructorimpl);
                }
            }
        }), new jSA.ContentResolver(AnonymousClass5.KWHzl));
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
