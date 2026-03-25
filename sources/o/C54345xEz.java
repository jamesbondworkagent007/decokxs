package o;

import com.okinc.unify_trade.biz.EmptyResp;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C54407xHg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xEz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54345xEz extends xGQ<EmptyResp> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final java.util.List<AbstractC55664xoH> AEQbTJ;
    public final java.lang.String AYXKKw;
    public AbstractC55664xoH EZpvd;
    public InterfaceC58217yxC OLrzqt;
    public volatile boolean copydefault;
    public AbstractC57556yke gEmmrt;

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    @Override // o.xGQ
    public boolean bC_() {
        return false;
    }

    public C54345xEz(@NotNull java.lang.String str, @NotNull AbstractC55664xoH abstractC55664xoH) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC55664xoH, "");
        this.AYXKKw = str;
        this.EZpvd = abstractC55664xoH;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.AEQbTJ = arrayList;
        arrayList.add(this.EZpvd);
    }

    /* JADX INFO: renamed from: o.xEz$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xEz.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void KWHzl(@NotNull AbstractC55664xoH abstractC55664xoH) {
        Intrinsics.checkNotNullParameter(abstractC55664xoH, "");
        this.AEQbTJ.add(abstractC55664xoH);
    }

    public AbstractC57556yke KWHzl() {
        C56121xwo c56121xwo = C56121xwo.copydefault;
        this.gEmmrt = xGQ.getWsListener$default(this, c56121xwo.EZpvd(this.EZpvd.EZpvd()), new WsArgV5(c56121xwo.EZpvd(this.EZpvd.EZpvd()), null, null, null, null, null, null, null, 254, null), (Function1) null, 4, (java.lang.Object) null);
        pUU.KWHzl("OKTDexStatusWsTask", "----->> subscribe channel --- " + c56121xwo.EZpvd(this.EZpvd.EZpvd()));
        copydefault();
        return this.gEmmrt;
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("OKTDexStatusWsTask", "----->> onMessage --- " + str);
        this.copydefault = true;
    }

    private final void copydefault() {
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, 1000L, java.util.concurrent.TimeUnit.MILLISECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.xEA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54345xEz.AEQbTJ(this.OLrzqt, (java.lang.Long) obj);
            }
        };
        this.OLrzqt = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.xEC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54345xEz.OLrzqt(function1, obj);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C54345xEz c54345xEz, java.lang.Long l) {
        if (c54345xEz.copydefault) {
            pUU.KWHzl("OKTDexStatusWsTask", "----->> DexStatus onNext isUpdate " + c54345xEz.AEQbTJ.size());
            c54345xEz.copydefault = false;
            java.util.Iterator<AbstractC55664xoH> it = c54345xEz.AEQbTJ.iterator();
            while (it.hasNext()) {
                it.next().EZpvd(java.lang.Boolean.TRUE, "WebSocket");
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        boolean z = obj instanceof AbstractC55664xoH;
        if (z) {
            java.util.Iterator<AbstractC55664xoH> it = this.AEQbTJ.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.EZpvd((java.lang.Object) it.next().AhwBna(), (java.lang.Object) ((AbstractC55664xoH) obj).AhwBna())) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                this.AEQbTJ.remove(i);
            }
        }
        if (this.AEQbTJ.size() == 0) {
            AbstractC57556yke abstractC57556yke = this.gEmmrt;
            if (abstractC57556yke != null) {
                abstractC57556yke.djBIcL();
            }
            InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            if (z) {
                C54407xHg.StateListAnimator stateListAnimator = C54407xHg.Companion;
                AbstractC57556yke abstractC57556yke2 = this.gEmmrt;
                stateListAnimator.EZpvd(abstractC57556yke2 != null ? abstractC57556yke2.valueOf() : null, this.gEmmrt);
            }
        }
        return this.AEQbTJ.size() == 0;
    }
}
