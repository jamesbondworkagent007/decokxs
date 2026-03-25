package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.api.subscribe.TradeNotifyMessage;
import io.reactivex.BackpressureStrategy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class xBU extends xKJ<TradeNotifyMessage> {
    public java.util.ArrayList<java.lang.Object> KWHzl;
    public final C56111xwe<TradeNotifyMessage> copydefault = new C56111xwe<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<TradeNotifyMessage> AEQbTJ() {
        return this.copydefault;
    }

    public final void copydefault() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.ArrayList<java.lang.Object> arrayList = this.KWHzl;
        if (arrayList != null && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null) {
            interfaceC54581xNrOLrzqt.AEQbTJ(arrayList);
        }
        this.KWHzl = null;
    }

    public static final class Activity extends AbstractC55736xpa {
        public Activity() {
            super(null, 1, null);
        }

        @Override // o.AbstractC55736xpa
        public void EZpvd(TradeNotifyMessage tradeNotifyMessage) {
            Intrinsics.checkNotNullParameter(tradeNotifyMessage, "");
            xBU.this.AEQbTJ().postValue(tradeNotifyMessage);
        }
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<TradeNotifyMessage>> EZpvd() {
        AbstractC58185ywX<ResponseData<TradeNotifyMessage>> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.xBQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                xBU.copydefault(this.copydefault, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(new InterfaceC58222yxH() { // from class: o.xBT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                xBU.OLrzqt(this.EZpvd);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final void copydefault(xBU xbu, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        java.util.ArrayList<java.lang.Object> arrayListCopydefault = yDY.copydefault(xbu.new Activity());
        xbu.KWHzl = arrayListCopydefault;
        if (arrayListCopydefault == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.copydefault(arrayListCopydefault);
    }

    public static final void OLrzqt(xBU xbu) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.ArrayList<java.lang.Object> arrayList = xbu.KWHzl;
        if (arrayList == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ(arrayList);
    }
}
