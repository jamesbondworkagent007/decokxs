package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.htD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23168htD {
    public final ActionBar EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final java.lang.String copydefault;
    public C58216yxB valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    public C23168htD(@NotNull java.lang.String str, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = str;
        this.EZpvd = new ActionBar(function1, android.os.Looper.getMainLooper());
        this.valueOf = new C58216yxB();
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.htM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23168htD.copydefault(this.OLrzqt);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.htK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23168htD.OLrzqt(this.AEQbTJ);
            }
        });
    }

    /* JADX INFO: renamed from: o.htD$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.htD.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.htD$ActionBar */
    public static final class ActionBar extends android.os.Handler {
        public final /* synthetic */ Function1<java.lang.String, Unit> EZpvd;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(Function1<? super java.lang.String, Unit> function1, android.os.Looper looper) {
            super(looper);
            this.EZpvd = function1;
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            java.lang.Object obj;
            Intrinsics.checkNotNullParameter(message, "");
            super.handleMessage(message);
            if (message.what == 1000000 && (obj = message.obj) != null && (obj instanceof java.lang.String)) {
                Function1<java.lang.String, Unit> function1 = this.EZpvd;
                Intrinsics.copydefault(obj, "");
                function1.invoke((java.lang.String) obj);
            }
        }
    }

    public final C57567ykp EZpvd() {
        return (C57567ykp) this.OLrzqt.getValue();
    }

    public static final C57567ykp copydefault(C23168htD c23168htD) {
        return C22380heK.OLrzqt.copydefault(c23168htD.copydefault).fARcdN().fetchVPNInfo();
    }

    public final AbstractC57556yke AEQbTJ() {
        return (AbstractC57556yke) this.KWHzl.getValue();
    }

    public static final AbstractC57556yke OLrzqt(final C23168htD c23168htD) {
        return C57554ykc.Companion.AEQbTJ("dex-across-order-info", c23168htD.EZpvd(), yDY.copydefault(new WsArgV5("dex-across-order-info", null, null, null, null, null, null, null, 254, null)), new Function2() { // from class: o.htG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C23168htD.EZpvd(this.KWHzl, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        });
    }

    public static final Unit EZpvd(C23168htD c23168htD, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        try {
            Result.Application application = Result.Companion;
            android.os.Message messageObtainMessage = c23168htD.EZpvd.obtainMessage();
            Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "");
            messageObtainMessage.obj = oKIncomingData.getPayload();
            messageObtainMessage.what = 1000000;
            Result.m7377constructorimpl(java.lang.Boolean.valueOf(c23168htD.EZpvd.sendMessage(messageObtainMessage)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        AEQbTJ().djBIcL();
        this.valueOf.OLrzqt();
        this.EZpvd.removeCallbacksAndMessages(null);
    }

    public final void OLrzqt() {
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXDjBIcL = C22380heK.OLrzqt.copydefault(this.copydefault).fARcdN().djBIcL();
        final Function1 function1 = new Function1() { // from class: o.htF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23168htD.AEQbTJ(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.htE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23168htD.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.htL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23168htD.KWHzl(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        this.valueOf.AEQbTJ(abstractC58185ywXDjBIcL.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.htI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23168htD.KWHzl(function12, obj);
            }
        }));
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C23168htD c23168htD, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c23168htD.AEQbTJ().AhwBna();
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C23168htD c23168htD, java.lang.Throwable th) {
        c23168htD.copydefault();
        return Unit.INSTANCE;
    }
}
