package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.VirtualAccountPosData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xGB extends xGQ<java.lang.Object> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public InterfaceC58217yxC AEQbTJ;
    public AbstractC57556yke AhwBna;
    public final AbstractC55753xpr EZpvd;
    public volatile boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final LinkedBlockingDeque<java.lang.String> gEmmrt;
    public final xBX valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    public xGB(@NotNull java.lang.String str, @NotNull AbstractC55753xpr abstractC55753xpr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC55753xpr, "");
        this.OLrzqt = str;
        this.EZpvd = abstractC55753xpr;
        this.valueOf = new xBX();
        this.gEmmrt = new LinkedBlockingDeque<>();
        EZpvd();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xGB.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void EZpvd() {
        xBX xbx = this.valueOf;
        xbx.KWHzl(new Function1() { // from class: o.xGF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xGB.copydefault(this.AEQbTJ, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xbx, 0L, 1, null);
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if ((obj instanceof AbstractC55753xpr) && !Intrinsics.EZpvd((java.lang.Object) this.EZpvd.KWHzl(), (java.lang.Object) ((AbstractC55753xpr) obj).KWHzl())) {
            return false;
        }
        djBIcL();
        return true;
    }

    private final void djBIcL() {
        AbstractC57556yke abstractC57556yke = this.AhwBna;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        C54407xHg.Companion.EZpvd("virtual-account-private-summary", this.AhwBna);
    }

    private final void gEmmrt() {
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, 700L, java.util.concurrent.TimeUnit.MILLISECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.xGI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xGB.copydefault(this.EZpvd, (java.lang.Long) obj);
            }
        };
        this.AEQbTJ = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.xGJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xGB.copydefault(function1, obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(xGB xgb, java.lang.Long l) {
        if (xgb.KWHzl) {
            xgb.copydefault();
        }
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.gEmmrt.isEmpty()) {
            arrayList.add(this.gEmmrt.take());
        }
        this.KWHzl = false;
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            java.util.List<VirtualAccountPosData> listEZpvd = VirtualAccountPosData.Companion.EZpvd((java.lang.String) next);
            AbstractC55753xpr abstractC55753xpr = this.EZpvd;
            java.util.ArrayList<VirtualAccountPosData> arrayList2 = new java.util.ArrayList<>();
            if (listEZpvd == null) {
                listEZpvd = yDY.AhwBna();
            }
            arrayList2.addAll(listEZpvd);
            abstractC55753xpr.EZpvd(arrayList2);
        }
    }

    public AbstractC57556yke KWHzl() {
        this.AhwBna = KWHzl("virtual-account-private-summary", new WsArgV5("virtual-account-private-summary", null, null, null, null, null, null, null, 254, null), new Function1() { // from class: o.xGE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xGB.KWHzl(this.AEQbTJ, (java.lang.String) obj);
            }
        });
        if (this.AEQbTJ == null) {
            gEmmrt();
        }
        return this.AhwBna;
    }

    public static final Unit KWHzl(xGB xgb, java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        xgb.EZpvd(str);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = true;
        this.gEmmrt.put(str);
    }

    public static final Unit copydefault(xGB xgb, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            AbstractC55753xpr abstractC55753xpr = xgb.EZpvd;
            java.util.ArrayList<VirtualAccountPosData> arrayList = (java.util.ArrayList) responseData.getData();
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>();
            }
            abstractC55753xpr.EZpvd(arrayList);
            AbstractC57556yke abstractC57556ykeKWHzl = xgb.KWHzl();
            xgb.AhwBna = abstractC57556ykeKWHzl;
            if (abstractC57556ykeKWHzl != null) {
                abstractC57556ykeKWHzl.AhwBna();
            }
        } else {
            xgb.EZpvd.EZpvd(responseData.getMsg());
        }
        return Unit.INSTANCE;
    }
}
