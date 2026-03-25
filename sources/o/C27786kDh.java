package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.utils.MarketHomeTabType;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeapi.bean.SourceResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kDh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27786kDh extends AbstractC27798kDt {
    public InterfaceC58217yxC AEQbTJ;
    public xRM KWHzl;
    public MutableLiveData<SourceResp<xRH>> OLrzqt;
    public int copydefault = 7;
    public final Observer<SourceResp<xRH>> EZpvd = new Observer() { // from class: o.kDn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            C27786kDh.KWHzl(this.EZpvd, (SourceResp) obj);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int KWHzl() {
        return this.copydefault;
    }

    @Override // o.AbstractC27798kDt
    public boolean copydefault() {
        return true;
    }

    @Override // o.AbstractC27798kDt
    public C54588xNy AEQbTJ() {
        return new xNE();
    }

    public static final void KWHzl(final C27786kDh c27786kDh, SourceResp sourceResp) {
        Intrinsics.checkNotNullParameter(sourceResp, "");
        if (Intrinsics.EZpvd(sourceResp.isSuccess(), java.lang.Boolean.TRUE) && sourceResp.getData() != null) {
            java.lang.Object data = sourceResp.getData();
            xRM xrm = data instanceof xRM ? (xRM) data : null;
            c27786kDh.KWHzl = xrm;
            if (xrm != null) {
                xrm.KWHzl(new Function1() { // from class: o.kDk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C27786kDh.OLrzqt(this.EZpvd, (java.util.ArrayList) obj);
                    }
                });
                return;
            }
            return;
        }
        c27786kDh.fARcdN();
        if (c27786kDh.gEmmrt()) {
            return;
        }
        c27786kDh.EZpvd(c27786kDh.getView(), MarketHomeTabType.INDEX);
    }

    public static final Unit OLrzqt(final C27786kDh c27786kDh, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        C27889kHb.AEQbTJ.OLrzqt(arrayList, new Function1() { // from class: o.kDm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27786kDh.copydefault(this.copydefault, (java.util.List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C27786kDh c27786kDh, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c27786kDh.OLrzqt((java.util.ArrayList<CoinQuote>) list, "");
        if (!c27786kDh.gEmmrt()) {
            c27786kDh.EZpvd(c27786kDh.getView(), MarketHomeTabType.INDEX);
        }
        return Unit.INSTANCE;
    }

    public void AEQbTJ(@NotNull C59534zip c59534zip) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        c59534zip.register(CoinQuote.class, new C27955kJn("home"));
    }

    @Override // o.AbstractC27798kDt, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("event_home_page_refresh");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function1 = new Function1() { // from class: o.kDl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27786kDh.AEQbTJ(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        this.AEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.kDi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C27786kDh.AEQbTJ(function1, obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C27786kDh c27786kDh, java.lang.String str) {
        if (c27786kDh.KWHzl == null) {
            c27786kDh.ejfBZ();
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC27798kDt
    public void EZpvd(@NotNull InterfaceC54581xNr interfaceC54581xNr) {
        Intrinsics.checkNotNullParameter(interfaceC54581xNr, "");
        MutableLiveData<SourceResp<xRH>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.observe(this, this.EZpvd);
        C55608xnE.OLrzqt(interfaceC54581xNr, C27983kKo.AEQbTJ(), "USD", mutableLiveData, this);
        this.OLrzqt = mutableLiveData;
    }

    public final void OLrzqt(java.util.ArrayList<CoinQuote> arrayList, java.lang.String str) {
        C46796tdt c46796tdtEZpvd;
        C27803kDy c27803kDyDbNXlk = DbNXlk();
        if (c27803kDyDbNXlk != null && (c46796tdtEZpvd = c27803kDyDbNXlk.EZpvd()) != null && c46796tdtEZpvd.getAdapter() == null) {
            c46796tdtEZpvd.setLayoutManager(new LinearLayoutManager(c46796tdtEZpvd.getContext(), 1, false));
            c46796tdtEZpvd.setAdapter(isConnected());
            AEQbTJ(isConnected());
        }
        fetchVPNInfo();
        isConnected().setItems(arrayList.subList(0, java.lang.Math.min(KWHzl(), arrayList.size())));
        isConnected().notifyDataSetChanged();
    }

    @Override // o.AbstractC27798kDt, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        MutableLiveData<SourceResp<xRH>> mutableLiveData = this.OLrzqt;
        if (mutableLiveData != null) {
            mutableLiveData.removeObserver(this.EZpvd);
        }
        this.OLrzqt = null;
        xRM xrm = this.KWHzl;
        if (xrm != null) {
            xrm.gEmmrt();
        }
        C27889kHb.AEQbTJ.EZpvd();
    }
}
