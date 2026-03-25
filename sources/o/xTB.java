package o;

import com.okinc.base.utils.commmon.ThreadUtils;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xTB {
    public xTK AEQbTJ;
    public java.util.ArrayList<java.lang.Object> AhwBna;
    public volatile boolean EZpvd;
    public InterfaceC58217yxC KWHzl;
    public final long OLrzqt;
    public boolean copydefault;
    public Function1<? super java.lang.Boolean, Unit> gEmmrt;

    public xTB(@NotNull final java.util.List<WatchListData> list, @NotNull Function1<? super java.lang.Boolean, Unit> function1, xTK xtk) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.gEmmrt = function1;
        this.AEQbTJ = xtk;
        this.OLrzqt = 3500L;
        this.copydefault = true;
        this.AhwBna = new java.util.ArrayList<>();
        ThreadUtils.copydefault(new java.lang.Runnable() { // from class: o.xTE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                xTB.OLrzqt(list, this);
            }
        });
    }

    public static final class StateListAnimator extends AbstractC55760xpy {
        public final /* synthetic */ xTB copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(java.lang.String str, xTB xtb, java.lang.String str2) {
            super(str, str2);
            this.copydefault = xtb;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String] */
        @Override // o.AbstractC55755xpt
        public /* synthetic */ void EZpvd(java.lang.Boolean bool, java.lang.String str) {
            AEQbTJ(bool.booleanValue(), str);
        }

        public void AEQbTJ(boolean z, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (z) {
                this.copydefault.EZpvd = true;
            }
        }
    }

    public final void AEQbTJ() {
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, this.OLrzqt, java.util.concurrent.TimeUnit.MILLISECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.xTA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xTB.OLrzqt(this.AEQbTJ, (java.lang.Long) obj);
            }
        };
        this.KWHzl = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.xTH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xTB.EZpvd(function1, obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(xTB xtb, java.lang.Long l) {
        xTK xtk = xtb.AEQbTJ;
        if (xtk == null || !xtk.KWHzl()) {
            xtb.OLrzqt();
        }
        if (xtb.EZpvd) {
            xtb.EZpvd = false;
            if (!xtb.copydefault) {
                pUU.KWHzl("WatchListInit", "loop update request");
                xtb.gEmmrt.invoke(java.lang.Boolean.TRUE);
            }
            xtb.copydefault = false;
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(boolean z) {
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        this.gEmmrt = new Function1() { // from class: o.xTC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xTB.KWHzl(((java.lang.Boolean) obj).booleanValue());
            }
        };
        this.AEQbTJ = null;
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        ThreadUtils.copydefault(new java.lang.Runnable() { // from class: o.xTD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                xTB.OLrzqt(this.KWHzl);
            }
        });
    }

    public static final void OLrzqt(xTB xtb) {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        if (!(!xtb.AhwBna.isEmpty()) || (interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault()) == null) {
            return;
        }
        interfaceC54581xNrCopydefault.AEQbTJ(xtb.AhwBna);
    }

    public final void EZpvd(java.lang.String str) {
        java.util.ArrayList<java.lang.Object> arrayList = this.AhwBna;
        if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
            for (java.lang.Object obj : arrayList) {
                if ((obj instanceof AbstractC55760xpy) && Intrinsics.EZpvd((java.lang.Object) ((AbstractC55760xpy) obj).OLrzqt(), (java.lang.Object) str)) {
                    return;
                }
            }
        }
        this.AhwBna.add(new StateListAnimator(str, this, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
    }

    public static final void OLrzqt(java.util.List list, xTB xtb) {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            WatchListData watchListData = (WatchListData) it.next();
            if (Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "FUTURES") || Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "OPTION") || Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "SPOT")) {
                xtb.EZpvd(watchListData.getInstType());
            }
        }
        if (C33129mqd.KWHzl((java.util.Collection) xtb.AhwBna) && (interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault()) != null) {
            interfaceC54581xNrCopydefault.copydefault(xtb.AhwBna);
        }
        if (!xtb.AhwBna.isEmpty()) {
            xtb.AEQbTJ();
        }
    }
}
