package o;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.immomo.mls.InitData;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.planet.ext.FragmentExtKt$repeatListenRxEventOnCreate$3;
import com.okinc.rxutils.RxBus;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C46370tRv;
import o.C46408tTf;
import o.C47501trL;
import o.C47816txJ;
import o.C56391yDq;
import o.InterfaceC58217yxC;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.txJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47816txJ extends AbstractC43061riF {
    public boolean KWHzl;
    public C54822xWp copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return "KlineOverviewHome.lua";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C47501trL.Application.KDccX;
    }

    /* JADX INFO: renamed from: o.txJ$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.txJ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C47816txJ copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C47816txJ c47816txJ = new C47816txJ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("data", str);
            c47816txJ.setArguments(bundle);
            return c47816txJ;
        }
    }

    public final java.lang.String KWHzl() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("data")) == null) ? "BTC" : string;
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        android.view.View view = getView();
        if (view != null) {
            return (android.view.ViewGroup) view.findViewById(C47501trL.TaskDescription.DcMfJKOmnske);
        }
        return null;
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelProvider.Factory defaultViewModelProviderFactory = requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            C54822xWp c54822xWp = (C54822xWp) new ViewModelProvider(activity, defaultViewModelProviderFactory).get(C54822xWp.class);
            if (c54822xWp != null) {
                this.copydefault = c54822xWp;
                MarketCoinInfo value = c54822xWp.KWHzl().getValue();
                C43056riA c43056riA = C43056riA.AEQbTJ;
                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                pairArr[0] = C56390yDp.OLrzqt("coinName", KWHzl());
                pairArr[1] = C56390yDp.OLrzqt("bizType", java.lang.String.valueOf(value != null ? value.getInstrumentType() : null));
                pairArr[2] = C56390yDp.OLrzqt("instId", java.lang.String.valueOf(value != null ? value.getInstrumentId() : null));
                return c43056riA.EZpvd("market", "/overview/home", C56424yEw.gEmmrt(pairArr));
            }
        }
        pUU.copydefault(copydefault(), "Activity is null, cannot init sharedViewModel");
        return C43056riA.AEQbTJ.EZpvd("", "", C56424yEw.KWHzl());
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C46408tTf.Application application = C46408tTf.Companion;
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        final java.lang.String str = "market.route_to_feed_tab_event";
        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.planet.biz_feed_kline.KlineNewCoinIntroduceFragment$initView$$inlined$listen$1
            public InterfaceC58217yxC copydefault;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onCreate(lifecycleOwner);
                AbstractC58185ywX abstractC58185ywXAEQbTJ = RxBus.AEQbTJ(C46408tTf.class, new String[0]);
                final String str2 = str;
                final C47816txJ c47816txJ = this;
                this.copydefault = abstractC58185ywXAEQbTJ.AEQbTJ(new C46370tRv.TaskDescription(new Function1<C46408tTf, Unit>() { // from class: com.okinc.planet.biz_feed_kline.KlineNewCoinIntroduceFragment$initView$$inlined$listen$1.1
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(C46408tTf c46408tTf) {
                        AEQbTJ(c46408tTf);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void AEQbTJ(C46408tTf c46408tTf) {
                        Object objM7377constructorimpl;
                        C46408tTf c46408tTf2 = c46408tTf;
                        pUU.OLrzqt("OKFeedBridgeEvent listened: " + c46408tTf2);
                        if (Intrinsics.EZpvd((Object) c46408tTf2.OLrzqt(), (Object) str2)) {
                            C46408tTf.Application application2 = C46408tTf.Companion;
                            String strAEQbTJ = c46408tTf2.AEQbTJ();
                            if (strAEQbTJ == null || strAEQbTJ.length() == 0) {
                                objM7377constructorimpl = null;
                            } else {
                                try {
                                    Result.Application application3 = Result.Companion;
                                    objM7377constructorimpl = new Gson().fromJson(strAEQbTJ, new TypeToken<String>() { // from class: com.okinc.planet.biz_feed_kline.KlineNewCoinIntroduceFragment$initView$.inlined.listen.1.1.3
                                    }.getType());
                                } catch (Throwable th) {
                                    Result.Application application4 = Result.Companion;
                                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                                    }
                                }
                            }
                            c47816txJ.getParentFragmentManager().setFragmentResult("market.route_to_feed_tab_event", new Bundle());
                        }
                    }
                }), new C46370tRv.TaskDescription(FragmentExtKt$repeatListenRxEventOnCreate$3.ActionBar.OLrzqt));
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                InterfaceC58217yxC interfaceC58217yxC = this.copydefault;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                super.onDestroy(lifecycleOwner);
            }
        });
        view.post(new java.lang.Runnable() { // from class: o.txF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47816txJ.copydefault(this.AEQbTJ);
            }
        });
    }

    public static final void copydefault(C47816txJ c47816txJ) {
        if (c47816txJ.KWHzl) {
            return;
        }
        c47816txJ.KWHzl = true;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c47816txJ, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}
