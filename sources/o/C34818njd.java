package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.immomo.mls.InitData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.rxutils.RxBus;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C7323ahf;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.njd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34818njd extends AbstractC34823nji {
    private static final Application Companion = new Application(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return "MarketDiscoverFeedHome.lua";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.spnCvw;
    }

    /* JADX INFO: renamed from: o.njd$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.njd.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        android.view.View view = getView();
        if (view != null) {
            return (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.GiPPlLRPuVlr);
        }
        return null;
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        return C43056riA.createInitDataForMiniApp$default(C43056riA.AEQbTJ, "market", "/feed/homeV3", null, 4, null);
    }

    @Override // o.AbstractC43061riF, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        if (C41307qoO.EZpvd.OLrzqt()) {
            C32866mlf.onEvent$default("Markets_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.njc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34818njd.copydefault((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        C32866mlf.onEvent$default("Discover_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.nje
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34818njd.OLrzqt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", "feed", false, 4, null);
        for (Map.Entry<java.lang.String, java.lang.String> entry : C44600sZw.AEQbTJ.copydefault().entrySet()) {
            eventParamsList.put(entry.getKey(), entry.getValue(), false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", "opportunities", false, 4, null);
        EventParamsList.put$default(eventParamsList, "sub_tab", "feeds", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        final java.lang.String[] strArr = {"event.main_market_tab_reselect"};
        getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.find_ui.FindOpportunityFeedV2Fragment$initView$$inlined$repeatListenRxEventOnResume$1
            public InterfaceC58217yxC EZpvd;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onResume(lifecycleOwner);
                String[] strArr2 = strArr;
                this.EZpvd = RxBus.AEQbTJ((String[]) Arrays.copyOf(strArr2, strArr2.length)).AEQbTJ(new InterfaceC58227yxM(new Function1<String, Unit>() { // from class: com.okinc.find_ui.FindOpportunityFeedV2Fragment$initView$$inlined$repeatListenRxEventOnResume$1.3
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(String str) {
                        copydefault(str);
                        return Unit.INSTANCE;
                    }

                    public final void copydefault(String str) {
                        Intrinsics.copydefault((Object) str);
                        C7323ahf.KWHzl().AEQbTJ("MarketFeeds_TabBar_Refresh_Notification_Key", null, null);
                    }
                }) { // from class: o.jSA.Application
                    public final /* synthetic */ Function1 KWHzl;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.KWHzl = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.KWHzl.invoke(obj);
                    }
                }, new InterfaceC58227yxM(new Function1<Throwable, Unit>() { // from class: com.okinc.find_ui.FindOpportunityFeedV2Fragment$initView$$inlined$repeatListenRxEventOnResume$1.4
                    public final void AEQbTJ(Throwable th) {
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(Throwable th) {
                        AEQbTJ(th);
                        return Unit.INSTANCE;
                    }
                }) { // from class: o.jSA.Application
                    public final /* synthetic */ Function1 KWHzl;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.KWHzl = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.KWHzl.invoke(obj);
                    }
                });
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
    }
}
