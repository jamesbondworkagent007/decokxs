package o;

import com.okinc.business.dexui.app.DexApplicationDelegate$initAppModeListener$1;
import com.okinc.business.dexui.app.DexApplicationDelegate$onCreate$1$1;
import com.okinc.business.market.features.floatwindow.DexFloatWindowManager;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hwE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23328hwE extends C43265rly {
    public InterfaceC58217yxC KWHzl;
    public final C58216yxB OLrzqt = new C58216yxB();
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public static final InterfaceC56387yDm<android.app.Application> EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.hwR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C23328hwE.fetchVPNInfo();
        }
    });

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return true;
    }

    /* JADX INFO: renamed from: o.hwE$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hwE.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.app.Application EZpvd() {
            return (android.app.Application) C23328hwE.EZpvd.getValue();
        }

        public final android.app.Application OLrzqt() {
            return EZpvd();
        }
    }

    public static final android.app.Application fetchVPNInfo() {
        return C43246rlf.OLrzqt.valueOf();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
        C58114yvF c58114yvF = C58114yvF.EZpvd;
        C30431lay.copydefault.copydefault((InterfaceC30428lav) C58114yvF.OLrzqt(Companion.EZpvd(), InterfaceC30428lav.class));
        iwGUEr();
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.hwN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23328hwE.OLrzqt((xXO) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hwP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23328hwE.AhwBna(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hwM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23328hwE.KWHzl((java.lang.Throwable) obj);
            }
        };
        this.KWHzl = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hwO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23328hwE.djBIcL(function12, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(xXO xxo) {
        pUU.KWHzl("DexApplicationDelegate", "WalletMainEvent received");
        C58114yvF c58114yvF = C58114yvF.EZpvd;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new DexApplicationDelegate$onCreate$1$1(((InterfaceC23330hwG) C58114yvF.OLrzqt(Companion.EZpvd(), InterfaceC23330hwG.class)).gHZMYf().get(), null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        pUU.AEQbTJ("DexApplicationDelegate", "Error in WalletMainEvent subscription", th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.hwE$Activity */
    public static final class Activity implements InterfaceC54816xWj {
        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
        }

        @Override // o.InterfaceC54816xWj
        public void copydefault() {
        }

        public Activity() {
        }

        @Override // o.InterfaceC54816xWj
        public void EZpvd() {
            C23328hwE.this.ejfBZ();
        }
    }

    public final void iwGUEr() {
        C54819xWm.KWHzl().AEQbTJ(new Activity());
    }

    public final void ejfBZ() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new DexApplicationDelegate$initAppModeListener$1((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class), null), 3, null);
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.hwC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23328hwE.AEQbTJ((xXO) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.hwF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23328hwE.KWHzl(function1, obj);
            }
        });
        AbstractC58185ywX abstractC58185ywXKWHzl2 = RxBus.KWHzl(xXS.class, new java.lang.String[0]);
        final Function1 function12 = new Function1() { // from class: o.hwS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23328hwE.AEQbTJ((xXS) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ2 = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.hwU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23328hwE.valueOf(function12, obj);
            }
        });
        this.OLrzqt.AEQbTJ(interfaceC58217yxCAEQbTJ);
        this.OLrzqt.AEQbTJ(interfaceC58217yxCAEQbTJ2);
        ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).AEQbTJ(DexFloatWindowManager.copydefault);
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(xXO xxo) {
        DexFloatWindowManager.copydefault.getFieldNames();
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(xXS xxs) {
        DexFloatWindowManager.copydefault.getFieldNames();
        return Unit.INSTANCE;
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onTerminate() {
        try {
            if (C26233jWw.copydefault.OLrzqt()) {
                DexFloatWindowManager.copydefault.iwGUEr();
            }
            this.OLrzqt.dispose();
        } catch (java.lang.Exception unused) {
        }
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.KWHzl = null;
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull final android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.EZpvd(gKO.class, C56392yDr.copydefault(new Function0() { // from class: o.hwJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23328hwE.fJNWhG();
            }
        }));
        interfaceC43253rlm.EZpvd(gKN.class, C56392yDr.copydefault(new Function0() { // from class: o.hwK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23328hwE.djBIcL(context);
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC25414iwK.class, C56392yDr.copydefault(new Function0() { // from class: o.hwQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23328hwE.EZpvd(context);
            }
        }));
    }

    public static final C23285hvO fJNWhG() {
        return new C23285hvO();
    }

    public static final C23287hvQ djBIcL(android.content.Context context) {
        return new C23287hvQ(C19684gLm.AEQbTJ(context).values(), C19684gLm.AEQbTJ(context).fetchVPNInfo(), C19684gLm.AEQbTJ(context).AYXKKw(), C19684gLm.AEQbTJ(context).AhwBna(), C19684gLm.AEQbTJ(context).gEmmrt(), C19684gLm.AEQbTJ(context).djBIcL(), C19684gLm.AEQbTJ(context).DbNXlk());
    }

    public static final InterfaceC25414iwK EZpvd(android.content.Context context) {
        C58114yvF c58114yvF = C58114yvF.EZpvd;
        return ((InterfaceC25418iwO) C58114yvF.OLrzqt(context, InterfaceC25418iwO.class)).zuBGHE().get();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        interfaceC43299rmf.EZpvd(InterfaceC9772bbr.class, C56392yDr.copydefault(new Function0() { // from class: o.hwV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23328hwE.isConnected();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC9771bbq.class, C56392yDr.copydefault(new Function0() { // from class: o.hxa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23328hwE.DbNXlk();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC9779bby.class, C56392yDr.copydefault(new Function0() { // from class: o.hwY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23328hwE.AkhnZx();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC9777bbw.class, C56392yDr.copydefault(new Function0() { // from class: o.hwZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23328hwE.values();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC54846xXm.class, C56392yDr.copydefault(new Function0() { // from class: o.hwL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23328hwE.fARcdN();
            }
        }));
        C7381aik.Companion.AEQbTJ(this, C56392yDr.copydefault(new Function0() { // from class: o.hwH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23328hwE.fIwbmz();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC9770bbp.class, C56392yDr.copydefault(new Function0() { // from class: o.hwI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23328hwE.AuCTel();
            }
        }));
    }

    public static final C23276hvF isConnected() {
        return new C23276hvF();
    }

    public static final C23279hvI DbNXlk() {
        return new C23279hvI();
    }

    public static final C23281hvK AkhnZx() {
        return new C23281hvK();
    }

    public static final C23283hvM values() {
        return new C23283hvM();
    }

    public static final C23275hvE fARcdN() {
        return new C23275hvE();
    }

    public static final gLF fIwbmz() {
        return new gLF();
    }

    public static final C23278hvH AuCTel() {
        return new C23278hvH();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull final android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        super.registerDeeplinkHandlers(context, interfaceC43237rlW);
        java.util.Iterator<T> it = gKZ.EZpvd.EZpvd().iterator();
        while (it.hasNext()) {
            interfaceC43237rlW.copydefault(new C19678gLg((java.lang.String) it.next(), null, false, 6, null), C56392yDr.copydefault(new Function0() { // from class: o.hwT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C23328hwE.AEQbTJ(context);
                }
            }));
        }
    }

    public static final C9704bac AEQbTJ(android.content.Context context) {
        C58114yvF c58114yvF = C58114yvF.EZpvd;
        return ((InterfaceC9707baf) C58114yvF.OLrzqt(context, InterfaceC9707baf.class)).OLrzqt().get();
    }
}
