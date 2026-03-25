package com.okinc.business.defi.dapp.app;

import android.app.Application;
import android.content.Context;
import com.okinc.business.defi.dapp.app.DappApplicationDelegate;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C14818dsd;
import o.C14819dse;
import o.C14822dsh;
import o.C14823dsi;
import o.C14824dsj;
import o.C14829dso;
import o.C14830dsp;
import o.C14832dsr;
import o.C15089dxj;
import o.C15090dxk;
import o.C15091dxl;
import o.C15099dxt;
import o.C34703nhO;
import o.C43048rht;
import o.C43246rlf;
import o.C43265rly;
import o.C48872udq;
import o.C56392yDr;
import o.C7381aik;
import o.InterfaceC43237rlW;
import o.InterfaceC43253rlm;
import o.InterfaceC43299rmf;
import o.InterfaceC54828xWv;
import o.InterfaceC56387yDm;
import o.InterfaceC9765bbk;
import o.InterfaceC9769bbo;
import o.mMP;
import o.xWA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class DappApplicationDelegate extends C43265rly {
    public static final int $stable = 0;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    private static final InterfaceC56387yDm<Application> mApp$delegate = C56392yDr.copydefault(new Function0() { // from class: o.drW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return DappApplicationDelegate.mApp_delegate$lambda$11();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void attachBaseContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public int getPriority() {
        return 260;
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return true;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.app.DappApplicationDelegate.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Application mApp_delegate$lambda$11() {
        return C43246rlf.OLrzqt.valueOf();
    }

    @Override // o.C43265rly
    public void onInit(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onInit(context);
        C48872udq c48872udq = C48872udq.AEQbTJ;
        C48872udq.registerFileResourceId$default(c48872udq, "file_discover_aptos_js2", null, 2, null);
        C48872udq.registerFileResourceId$default(c48872udq, "file_discover_solana_js3", null, 2, null);
        C48872udq.registerFileResourceId$default(c48872udq, "file_discover_sui_js2", null, 2, null);
        C48872udq.registerFileResourceId$default(c48872udq, "file_discover_tron_js2", null, 2, null);
        C48872udq.registerFileResourceId$default(c48872udq, "file_discover_evm_js2", null, 2, null);
        C48872udq.registerFileResourceId$default(c48872udq, "file_discover_cosmos_js2", null, 2, null);
        C48872udq.registerFileResourceId$default(c48872udq, "file_discover_starknet_js2", null, 2, null);
        C48872udq.registerFileResourceId$default(c48872udq, "file_discover_btc_js3", null, 2, null);
        C48872udq.registerFileResourceId$default(c48872udq, "file_discover_regex", null, 2, null);
        C48872udq.registerFileResourceId$default(c48872udq, "file_discover_ton_js3", null, 2, null);
        if (C34703nhO.copydefault()) {
            C48872udq.registerFileResourceId$default(c48872udq, "file_okmarket_community_webview_android", null, 2, null);
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
        super.onCreate();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.EZpvd(InterfaceC54828xWv.class, C56392yDr.copydefault(new Function0() { // from class: o.drY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DappApplicationDelegate.registerService$lambda$0();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C15089dxj registerService$lambda$0() {
        return new C15089dxj();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        C43048rht c43048rht = C43048rht.AEQbTJ;
        c43048rht.KWHzl("okluadiscover");
        if (C34703nhO.copydefault()) {
            c43048rht.KWHzl("market");
        }
        interfaceC43299rmf.EZpvd(InterfaceC9769bbo.class, C56392yDr.copydefault(new Function0() { // from class: o.drV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DappApplicationDelegate.registerExtensions$lambda$1();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC9765bbk.class, C56392yDr.copydefault(new Function0() { // from class: o.drU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DappApplicationDelegate.registerExtensions$lambda$2();
            }
        }));
        C7381aik.Companion.AEQbTJ(this, C56392yDr.copydefault(new Function0() { // from class: o.dsb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DappApplicationDelegate.registerExtensions$lambda$3();
            }
        }));
        interfaceC43299rmf.EZpvd(mMP.class, C56392yDr.copydefault(new Function0() { // from class: o.drX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DappApplicationDelegate.registerExtensions$lambda$4();
            }
        }));
        interfaceC43299rmf.EZpvd(xWA.class, C56392yDr.copydefault(new Function0() { // from class: o.drZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DappApplicationDelegate.registerExtensions$lambda$5();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C15091dxl registerExtensions$lambda$1() {
        return new C15091dxl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C15090dxk registerExtensions$lambda$2() {
        return new C15090dxk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C14819dse registerExtensions$lambda$3() {
        return new C14819dse();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C14818dsd registerExtensions$lambda$4() {
        return new C14818dsd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C15099dxt registerExtensions$lambda$5() {
        return new C15099dxt();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        super.registerDeeplinkHandlers(context, interfaceC43237rlW);
        interfaceC43237rlW.copydefault(new C14830dsp(), C56392yDr.copydefault(new Function0() { // from class: o.dsa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DappApplicationDelegate.registerDeeplinkHandlers$lambda$6();
            }
        }));
        interfaceC43237rlW.copydefault(new C14824dsj(), C56392yDr.copydefault(new Function0() { // from class: o.dsg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DappApplicationDelegate.registerDeeplinkHandlers$lambda$7();
            }
        }));
        interfaceC43237rlW.copydefault(new C14832dsr(), C56392yDr.copydefault(new Function0() { // from class: o.dsf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DappApplicationDelegate.registerDeeplinkHandlers$lambda$8();
            }
        }));
        interfaceC43237rlW.copydefault(new C14829dso(), C56392yDr.copydefault(new Function0() { // from class: o.dsc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DappApplicationDelegate.registerDeeplinkHandlers$lambda$9();
            }
        }));
        interfaceC43237rlW.copydefault(new C14823dsi(), C56392yDr.copydefault(new Function0() { // from class: o.drT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DappApplicationDelegate.registerDeeplinkHandlers$lambda$10();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C14822dsh registerDeeplinkHandlers$lambda$6() {
        return new C14822dsh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C14822dsh registerDeeplinkHandlers$lambda$7() {
        return new C14822dsh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C14822dsh registerDeeplinkHandlers$lambda$8() {
        return new C14822dsh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C14822dsh registerDeeplinkHandlers$lambda$9() {
        return new C14822dsh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C14822dsh registerDeeplinkHandlers$lambda$10() {
        return new C14822dsh();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onLaunchComplete() {
        super.onLaunchComplete();
    }
}
