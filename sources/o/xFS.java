package o;

import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C54407xHg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xFS extends xGQ<java.lang.Object> {
    public InterfaceC58217yxC AEQbTJ;
    public final java.lang.String AYXKKw;
    public final InterfaceC54816xWj EZpvd;
    public final AbstractC55760xpy KWHzl;
    public final java.util.List<AbstractC55760xpy> OLrzqt;
    public volatile boolean copydefault;
    public AbstractC57556yke djBIcL;

    @Override // o.xGQ
    public boolean bC_() {
        return false;
    }

    public xFS(@NotNull java.lang.String str, @NotNull AbstractC55760xpy abstractC55760xpy) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC55760xpy, "");
        this.AYXKKw = str;
        this.KWHzl = abstractC55760xpy;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.OLrzqt = arrayList;
        this.EZpvd = new TaskDescription();
        arrayList.add(abstractC55760xpy);
    }

    public static final class TaskDescription implements InterfaceC54816xWj {
        public TaskDescription() {
        }

        @Override // o.InterfaceC54816xWj
        public void OLrzqt(android.app.Activity activity) {
            super.OLrzqt(activity);
            pUU.KWHzl("TradeInstrumentTask", "----->> onAppEnterForegroundIdle --- ");
            java.util.Iterator it = xFS.this.OLrzqt.iterator();
            while (it.hasNext()) {
                ((AbstractC55760xpy) it.next()).EZpvd(java.lang.Boolean.TRUE, "WebSocket");
            }
        }

        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
            pUU.KWHzl("TradeInstrumentTask", "----->> onAppEnterBackground --- ");
        }
    }

    public final void OLrzqt(@NotNull AbstractC55760xpy abstractC55760xpy) {
        Intrinsics.checkNotNullParameter(abstractC55760xpy, "");
        this.OLrzqt.add(abstractC55760xpy);
    }

    public AbstractC57556yke EZpvd() {
        C56121xwo c56121xwo = C56121xwo.copydefault;
        this.djBIcL = xGQ.getWsListener$default(this, c56121xwo.EZpvd(this.KWHzl.EZpvd()), new WsArgV5(c56121xwo.EZpvd(this.KWHzl.EZpvd()), null, null, this.KWHzl.values(), null, null, null, null, 246, null), (Function1) null, 4, (java.lang.Object) null);
        pUU.KWHzl("TradeInstrumentTask", "----->> subscribe channel --- " + c56121xwo.EZpvd(this.KWHzl.EZpvd()) + ", instType = " + this.KWHzl.values());
        KWHzl();
        if (Intrinsics.EZpvd((java.lang.Object) this.KWHzl.values(), (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) this.KWHzl.values(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) this.KWHzl.values(), (java.lang.Object) "OPTION")) {
            C54819xWm.KWHzl().AEQbTJ(this.EZpvd);
        }
        return this.djBIcL;
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) this.KWHzl.values(), (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) this.KWHzl.values(), (java.lang.Object) "FUTURES") || Intrinsics.EZpvd((java.lang.Object) this.KWHzl.values(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) this.KWHzl.values(), (java.lang.Object) "OPTION")) {
            pUU.KWHzl("TradeInstrumentTask", "----->> instruments subscribe data instId,listener.instTypeAbs=" + this.KWHzl.values());
        }
        this.copydefault = true;
    }

    private final void KWHzl() {
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, 700L, java.util.concurrent.TimeUnit.MILLISECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.xFW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xFS.copydefault(this.copydefault, (java.lang.Long) obj);
            }
        };
        this.AEQbTJ = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.xFT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xFS.AEQbTJ(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(xFS xfs, java.lang.Long l) {
        if (xfs.copydefault) {
            xfs.copydefault = false;
            java.util.Iterator<AbstractC55760xpy> it = xfs.OLrzqt.iterator();
            while (it.hasNext()) {
                it.next().EZpvd(java.lang.Boolean.TRUE, "WebSocket");
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        boolean z = obj instanceof AbstractC55760xpy;
        if (z) {
            java.util.Iterator<AbstractC55760xpy> it = this.OLrzqt.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.EZpvd((java.lang.Object) it.next().AhwBna(), (java.lang.Object) ((AbstractC55760xpy) obj).AhwBna())) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                this.OLrzqt.remove(i);
            }
        }
        if (this.OLrzqt.size() == 0) {
            AbstractC57556yke abstractC57556yke = this.djBIcL;
            if (abstractC57556yke != null) {
                abstractC57556yke.djBIcL();
            }
            InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            if (z) {
                C54407xHg.StateListAnimator stateListAnimator = C54407xHg.Companion;
                AbstractC57556yke abstractC57556yke2 = this.djBIcL;
                stateListAnimator.EZpvd(abstractC57556yke2 != null ? abstractC57556yke2.valueOf() : null, this.djBIcL);
                AbstractC55760xpy abstractC55760xpy = (AbstractC55760xpy) obj;
                if (Intrinsics.EZpvd((java.lang.Object) abstractC55760xpy.values(), (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) abstractC55760xpy.values(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) abstractC55760xpy.values(), (java.lang.Object) "OPTION")) {
                    C54819xWm.KWHzl().KWHzl(this.EZpvd);
                }
            }
        }
        return this.OLrzqt.size() == 0;
    }
}
