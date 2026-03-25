package o;

import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32152mRk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class mQV implements mQP {
    public volatile boolean gEmmrt;
    public InterfaceC58217yxC valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC58217yxC AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.gEmmrt = z;
    }

    public final AbstractC57556yke OLrzqt(java.lang.String str, java.util.ArrayList<? extends InterfaceC57559ykh> arrayList) {
        C32152mRk.StateListAnimator stateListAnimator = C32152mRk.Companion;
        C57567ykp c57567ykpKWHzl = KWHzl();
        Unit unit = Unit.INSTANCE;
        return stateListAnimator.OLrzqt(str, arrayList, c57567ykpKWHzl, this);
    }

    public final AbstractC57556yke AEQbTJ(@NotNull java.lang.String str, @NotNull WsArgV5ForWeb3 wsArgV5ForWeb3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(wsArgV5ForWeb3, "");
        return OLrzqt(str, yDY.copydefault(wsArgV5ForWeb3));
    }

    public C57567ykp KWHzl() {
        return mPY.OLrzqt.copydefault("default_trade").AEQbTJ().copydefault();
    }

    @Override // o.mQP
    public void AEQbTJ(long j) {
        InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, j, java.util.concurrent.TimeUnit.MILLISECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.mQR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mQV.KWHzl(this.KWHzl, (java.lang.Long) obj);
            }
        };
        this.valueOf = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.mQT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                mQV.OLrzqt(function1, obj);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(mQV mqv, java.lang.Long l) {
        if (mqv.gEmmrt) {
            mqv.copydefault();
            mqv.gEmmrt = false;
        }
        return Unit.INSTANCE;
    }
}
