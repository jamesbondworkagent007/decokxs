package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.SignalPositionReqGroup;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import io.reactivex.BackpressureStrategy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xDf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54298xDf extends xKJ<C55804xqp<java.util.List<? extends StrategyPositionResponse>>> {
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<C55804xqp<java.util.List<StrategyPositionResponse>>>> EZpvd() {
        java.lang.String str = this.OLrzqt;
        if (str == null) {
            Intrinsics.gEmmrt("");
            str = null;
        }
        final SignalPositionReqGroup signalPositionReqGroup = new SignalPositionReqGroup(true, str, "", "", true);
        AbstractC58185ywX<ResponseData<C55804xqp<java.util.List<StrategyPositionResponse>>>> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.xDd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C54298xDf.EZpvd(this.copydefault, signalPositionReqGroup, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(new InterfaceC58222yxH() { // from class: o.xDh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C54298xDf.OLrzqt(this.KWHzl);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX INFO: renamed from: o.xDf$Application */
    public static final class Application extends AbstractC55717xpH {
        public final /* synthetic */ InterfaceC58184ywW<ResponseData<C55804xqp<java.util.List<StrategyPositionResponse>>>> AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(SignalPositionReqGroup signalPositionReqGroup, InterfaceC58184ywW<ResponseData<C55804xqp<java.util.List<StrategyPositionResponse>>>> interfaceC58184ywW, java.lang.String str) {
            super(signalPositionReqGroup, str);
            this.AEQbTJ = interfaceC58184ywW;
        }

        @Override // o.AbstractC55717xpH
        public void copydefault(java.lang.String str, java.util.ArrayList<StrategyPositionResponse> arrayList) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.AEQbTJ.onNext(new ResponseData<>(0, null, null, null, new C55804xqp(str, arrayList, null, null, 12, null), null, 46, null));
        }

        @Override // o.AbstractC55717xpH
        public void EZpvd(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ.onNext(new ResponseData<>(-1, str, null, null, null, null, 60, null));
        }
    }

    public static final void EZpvd(C54298xDf c54298xDf, SignalPositionReqGroup signalPositionReqGroup, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        c54298xDf.EZpvd(yDY.copydefault(new Application(signalPositionReqGroup, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())))));
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = c54298xDf.ejfBZ();
        if (arrayListEjfBZ == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.copydefault(arrayListEjfBZ);
    }

    public static final void OLrzqt(C54298xDf c54298xDf) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = c54298xDf.ejfBZ();
        if (arrayListEjfBZ == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ(arrayListEjfBZ);
    }
}
