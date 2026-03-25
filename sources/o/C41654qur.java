package o;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.market.ext.FragmentExtKt$repeatListenRxEventOnCreate$1;
import com.okinc.market.ext.FragmentExtKt$repeatListenRxEventOnResume$1;
import com.okinc.rxutils.RxBus;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C41434qqj;
import o.InterfaceC41649qum;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.InterfaceC58217yxC;
import o.jSA;
import o.pWO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41654qur {
    public static final void EZpvd(@NotNull final androidx.fragment.app.Fragment fragment, @NotNull final Function1<? super InterfaceC41649qum, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        java.util.List listGEmmrt = yDY.gEmmrt("SPOT", "MARGIN", "FUTURES", "SWAP", "OPTION");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        java.util.Iterator it = listGEmmrt.iterator();
        while (it.hasNext()) {
            arrayList.add(new ActionBar((java.lang.String) it.next(), strGEmmrt, fragment, function1));
        }
        final java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
        fragment.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.market.quotation.ui.util.FragmentExtKt$listenQuotationDataSourceChanged$$inlined$repeatOnLifecycleResume$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                InterfaceC54581xNr interfaceC54581xNrCopydefault;
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onResume(lifecycleOwner);
                InterfaceC54577xNn interfaceC54577xNnOLrzqt = pWO.OLrzqt();
                if (interfaceC54577xNnOLrzqt == null || (interfaceC54581xNrCopydefault = interfaceC54577xNnOLrzqt.copydefault()) == null) {
                    return;
                }
                interfaceC54581xNrCopydefault.copydefault(arrayList2);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(LifecycleOwner lifecycleOwner) {
                InterfaceC54581xNr interfaceC54581xNrCopydefault;
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                InterfaceC54577xNn interfaceC54577xNnOLrzqt = pWO.OLrzqt();
                if (interfaceC54577xNnOLrzqt != null && (interfaceC54581xNrCopydefault = interfaceC54577xNnOLrzqt.copydefault()) != null) {
                    interfaceC54581xNrCopydefault.AEQbTJ(arrayList2);
                }
                super.onPause(lifecycleOwner);
            }
        });
        final java.lang.String[] strArr = {"WATCH_COUNT_DOWN_EVENT"};
        fragment.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.market.quotation.ui.util.FragmentExtKt$listenQuotationDataSourceChanged$$inlined$repeatListenRxEventOnResume$1
            public InterfaceC58217yxC copydefault;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onResume(lifecycleOwner);
                String[] strArr2 = strArr;
                AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ((String[]) Arrays.copyOf(strArr2, strArr2.length));
                final Fragment fragment2 = fragment;
                final Function1 function12 = function1;
                this.copydefault = abstractC58185ywXAEQbTJ.AEQbTJ(new jSA.ComponentCallbacks(new Function1<String, Unit>() { // from class: com.okinc.market.quotation.ui.util.FragmentExtKt$listenQuotationDataSourceChanged$$inlined$repeatListenRxEventOnResume$1.4
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(String str) {
                        KWHzl(str);
                        return Unit.INSTANCE;
                    }

                    public final void KWHzl(String str) {
                        Intrinsics.copydefault((Object) str);
                        C41434qqj.KWHzl.KWHzl(fragment2.getTag(), "onQuotationDataSourceChanged: CountDownChangeEvent");
                        function12.invoke(new InterfaceC41649qum.StateListAnimator(0L, 1, null));
                    }
                }), new jSA.ComponentCallbacks(FragmentExtKt$repeatListenRxEventOnResume$1.Application.KWHzl));
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                InterfaceC58217yxC interfaceC58217yxC = this.copydefault;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                super.onPause(lifecycleOwner);
            }
        });
        final java.lang.String[] strArr2 = {"NEW_COIN_ONLINE_STATUS_UPDATE"};
        fragment.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.market.quotation.ui.util.FragmentExtKt$listenQuotationDataSourceChanged$$inlined$repeatListenRxEventOnResume$2
            public InterfaceC58217yxC copydefault;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onResume(lifecycleOwner);
                String[] strArr3 = strArr2;
                AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ((String[]) Arrays.copyOf(strArr3, strArr3.length));
                final Fragment fragment2 = fragment;
                final Function1 function12 = function1;
                this.copydefault = abstractC58185ywXAEQbTJ.AEQbTJ(new jSA.ComponentCallbacks(new Function1<String, Unit>() { // from class: com.okinc.market.quotation.ui.util.FragmentExtKt$listenQuotationDataSourceChanged$$inlined$repeatListenRxEventOnResume$2.4
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(String str) {
                        KWHzl(str);
                        return Unit.INSTANCE;
                    }

                    public final void KWHzl(String str) {
                        Intrinsics.copydefault((Object) str);
                        C41434qqj.KWHzl.KWHzl(fragment2.getTag(), "onQuotationDataSourceChanged: NewCoinOnlineEvent");
                        function12.invoke(new InterfaceC41649qum.Activity(0L, 1, null));
                    }
                }), new jSA.ComponentCallbacks(FragmentExtKt$repeatListenRxEventOnResume$1.Application.KWHzl));
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                InterfaceC58217yxC interfaceC58217yxC = this.copydefault;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                super.onPause(lifecycleOwner);
            }
        });
        final java.lang.String[] strArr3 = {"NEW_CONTRACT_ONLINE_STATUS_UPDATE"};
        fragment.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.market.quotation.ui.util.FragmentExtKt$listenQuotationDataSourceChanged$$inlined$repeatListenRxEventOnResume$3
            public InterfaceC58217yxC EZpvd;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onResume(lifecycleOwner);
                String[] strArr4 = strArr3;
                AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ((String[]) Arrays.copyOf(strArr4, strArr4.length));
                final Fragment fragment2 = fragment;
                final Function1 function12 = function1;
                this.EZpvd = abstractC58185ywXAEQbTJ.AEQbTJ(new jSA.ComponentCallbacks(new Function1<String, Unit>() { // from class: com.okinc.market.quotation.ui.util.FragmentExtKt$listenQuotationDataSourceChanged$$inlined$repeatListenRxEventOnResume$3.3
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(String str) {
                        AEQbTJ(str);
                        return Unit.INSTANCE;
                    }

                    public final void AEQbTJ(String str) {
                        Intrinsics.copydefault((Object) str);
                        C41434qqj.KWHzl.KWHzl(fragment2.getTag(), "onQuotationDataSourceChanged: NewContractOnlineEvent");
                        function12.invoke(new InterfaceC41649qum.ActionBar(0L, 1, null));
                    }
                }), new jSA.ComponentCallbacks(FragmentExtKt$repeatListenRxEventOnResume$1.Application.KWHzl));
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                super.onPause(lifecycleOwner);
            }
        });
        final java.lang.String[] strArr4 = {"trade_to_new_system"};
        fragment.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.market.quotation.ui.util.FragmentExtKt$listenQuotationDataSourceChanged$$inlined$repeatListenRxEventOnCreate$1
            public InterfaceC58217yxC KWHzl;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onCreate(lifecycleOwner);
                String[] strArr5 = strArr4;
                AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ((String[]) Arrays.copyOf(strArr5, strArr5.length));
                final Fragment fragment2 = fragment;
                final Function1 function12 = function1;
                this.KWHzl = abstractC58185ywXAEQbTJ.AEQbTJ(new jSA.ComponentCallbacks(new Function1<String, Unit>() { // from class: com.okinc.market.quotation.ui.util.FragmentExtKt$listenQuotationDataSourceChanged$$inlined$repeatListenRxEventOnCreate$1.3
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(String str) {
                        OLrzqt(str);
                        return Unit.INSTANCE;
                    }

                    public final void OLrzqt(String str) {
                        Intrinsics.copydefault((Object) str);
                        C41434qqj.KWHzl.KWHzl(fragment2.getTag(), "onQuotationDataSourceChanged: AccountChangedEvent");
                        function12.invoke(new InterfaceC41649qum.TaskDescription(0L, 1, null));
                    }
                }), new jSA.ComponentCallbacks(FragmentExtKt$repeatListenRxEventOnCreate$1.Application.KWHzl));
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                super.onDestroy(lifecycleOwner);
            }
        });
    }

    /* JADX INFO: renamed from: o.qur$ActionBar */
    public static final class ActionBar extends AbstractC55760xpy {
        public final /* synthetic */ androidx.fragment.app.Fragment AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ Function1<InterfaceC41649qum, Unit> OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.qum, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(java.lang.String str, java.lang.String str2, androidx.fragment.app.Fragment fragment, Function1<? super InterfaceC41649qum, Unit> function1) {
            super(str, str2);
            this.EZpvd = str;
            this.AEQbTJ = fragment;
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String] */
        @Override // o.AbstractC55755xpt
        public /* synthetic */ void EZpvd(java.lang.Boolean bool, java.lang.String str) {
            OLrzqt(bool.booleanValue(), str);
        }

        public void OLrzqt(boolean z, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C41434qqj.KWHzl.KWHzl(this.AEQbTJ.getTag(), "onQuotationDataSourceChanged: InstrumentBizChangedEvent, type=" + this.EZpvd + ", resp=" + z + ", origin=" + str);
            this.OLrzqt.invoke(new InterfaceC41649qum.Application(str, 0L, 2, null));
        }
    }
}
