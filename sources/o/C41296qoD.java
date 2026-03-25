package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.tabs.TabLayout;
import com.okinc.market.discover.features.root.DiscoverSubPage;
import com.okinc.rxutils.RxBus;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C41296qoD;
import o.C52761wXj;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qoD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41296qoD extends AbstractC41344qoz {
    public static final Application Companion = new Application(null);
    public final ActionBar isConnected = new ActionBar();

    /* JADX INFO: renamed from: o.qoD$ActionBar */
    public static final class ActionBar extends OnBackPressedCallback {
        public ActionBar() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            C41296qoD.this.gEmmrt();
        }
    }

    /* JADX INFO: renamed from: o.qoD$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qoD.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.C41341qow
    public void OLrzqt(@NotNull C42768rce c42768rce, @NotNull C41302qoJ c41302qoJ) {
        Intrinsics.checkNotNullParameter(c42768rce, "");
        Intrinsics.checkNotNullParameter(c41302qoJ, "");
        c42768rce.getRoot().setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
        c41302qoJ.OLrzqt(C56402yEa.EZpvd(DiscoverSubPage.MARKETS));
        TabLayout tabLayout = c42768rce.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(tabLayout, "");
        tabLayout.setVisibility(8);
        C33537myN c33537myN = c42768rce.EZpvd;
        Intrinsics.copydefault(c33537myN);
        c33537myN.setVisibility(0);
        c33537myN.setBackListener(new View.OnClickListener() { // from class: o.qoG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C41296qoD.KWHzl(this.copydefault, view);
            }
        });
        c42768rce.valueOf.setPadding(0, 0, 0, 0);
    }

    public static final void KWHzl(C41296qoD c41296qoD, android.view.View view) {
        c41296qoD.gEmmrt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gEmmrt() {
        C41304qoL.dismiss$default(C41304qoL.KWHzl, this, false, 2, null);
    }

    @Override // o.C41341qow, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        super.onResume();
        final java.lang.String[] strArr = {"explore_tab_reselected"};
        getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.market.discover.features.root.MarketDiscoverTwoLevelFragment$onResume$$inlined$repeatListenRxEventOnResume$1
            public InterfaceC58217yxC AEQbTJ;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onResume(lifecycleOwner);
                String[] strArr2 = strArr;
                AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ((String[]) Arrays.copyOf(strArr2, strArr2.length));
                final C41296qoD c41296qoD = this;
                this.AEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM(new Function1<String, Unit>() { // from class: com.okinc.market.discover.features.root.MarketDiscoverTwoLevelFragment$onResume$$inlined$repeatListenRxEventOnResume$1.3
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(String str) {
                        AEQbTJ(str);
                        return Unit.INSTANCE;
                    }

                    public final void AEQbTJ(String str) {
                        Intrinsics.copydefault((Object) str);
                        c41296qoD.gEmmrt();
                    }
                }) { // from class: o.jSA.ComponentCallbacks2
                    public final /* synthetic */ Function1 copydefault;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.copydefault = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.copydefault.invoke(obj);
                    }
                }, new InterfaceC58227yxM(new Function1<Throwable, Unit>() { // from class: com.okinc.market.discover.features.root.MarketDiscoverTwoLevelFragment$onResume$$inlined$repeatListenRxEventOnResume$1.5
                    public final void EZpvd(Throwable th) {
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(Throwable th) {
                        EZpvd(th);
                        return Unit.INSTANCE;
                    }
                }) { // from class: o.jSA.ComponentCallbacks2
                    public final /* synthetic */ Function1 copydefault;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.copydefault = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.copydefault.invoke(obj);
                    }
                });
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                super.onPause(lifecycleOwner);
            }
        });
        FragmentActivity activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.addCallback(this, this.isConnected);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.isConnected.remove();
    }
}
