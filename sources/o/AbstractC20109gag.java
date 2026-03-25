package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.api.model.tx.signdata.BaseSignData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.api.model.tx.signdata.SpeedUpSignData;
import com.okinc.business.defi.api.model.tx.signdata.SpeedUpSignDataHolder;
import com.okinc.business.defi.biz.core.ws.channel.WalletTxHistorySubManager;
import com.okinc.business.defi.biz.net.bean.CoinAndAddressHistoryDetail;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import com.okinc.business.defi.biz.net.bean.TxRecord;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20109gag;
import o.AbstractC8564bFB;
import o.C13754dXa;
import o.InterfaceC9740bbL;
import o.xZF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20109gag<T extends AbstractC8564bFB<?, ?>> extends wXX {
    public Function1<? super java.lang.Boolean, Unit> AEQbTJ;
    public T AYXKKw;
    public boolean AhwBna = true;
    public xZF.TaskDescription<WalletTxHistorySubManager.SubResponse> EZpvd;
    public yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> KWHzl;
    public SpeedUpSignData OLrzqt;
    public InterfaceC58217yxC gEmmrt;

    /* JADX INFO: renamed from: o.gag$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    public abstract void AEQbTJ();

    public abstract void AhwBna();

    public abstract void KWHzl();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull AbstractC8426bCW<?> abstractC8426bCW, @NotNull C8486bDd c8486bDd) {
        Intrinsics.checkNotNullParameter(abstractC8426bCW, "");
        Intrinsics.checkNotNullParameter(c8486bDd, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        this.AYXKKw = t;
    }

    public final T gEmmrt() {
        T t = this.AYXKKw;
        if (t != null) {
            return t;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        valueOf();
    }

    public final void valueOf() {
        final java.lang.String string;
        AhwBna();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("walletId")) == null) {
            string = "";
        }
        C8490bDh c8490bDh = C8490bDh.AEQbTJ;
        android.os.Bundle arguments2 = getArguments();
        CoinAndAddressHistoryDetail coinAndAddressHistoryDetail = arguments2 != null ? (CoinAndAddressHistoryDetail) arguments2.getParcelable("coinDetail") : null;
        android.os.Bundle arguments3 = getArguments();
        TxIdOrHashHistoryDetail txIdOrHashHistoryDetail = arguments3 != null ? (TxIdOrHashHistoryDetail) arguments3.getParcelable("tradeDetail") : null;
        android.os.Bundle arguments4 = getArguments();
        TxRecord txRecord = arguments4 != null ? (TxRecord) arguments4.getParcelable("txHistory") : null;
        android.os.Bundle arguments5 = getArguments();
        AbstractC58260yxt<Triple<C10854bwM, BaseSignData, java.lang.String>> abstractC58260yxtOLrzqt = c8490bDh.OLrzqt(string, false, false, coinAndAddressHistoryDetail, txIdOrHashHistoryDetail, txRecord, arguments5 != null ? (WalletTxDetailBean) arguments5.getParcelable("walletTxDetailBean") : null);
        final Function1 function1 = new Function1() { // from class: o.gau
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20109gag.KWHzl(this.OLrzqt, string, (Triple) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.gaq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC20109gag.AhwBna(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.gat
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20109gag.KWHzl(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gar
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC20109gag.valueOf(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.gas
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20109gag.EZpvd(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gao
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC20109gag.gEmmrt(function13, obj);
            }
        });
    }

    public static final InterfaceC58261yxu AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: com.okinc.business.defi.api.model.tx.signdata.BaseSignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC58261yxu KWHzl(AbstractC20109gag abstractC20109gag, java.lang.String str, Triple triple) {
        Intrinsics.checkNotNullParameter(triple, "");
        BaseSignData baseSignData = (BaseSignData) triple.getSecond();
        if (baseSignData != 0) {
            abstractC20109gag.OLrzqt = ((SpeedUpSignDataHolder) baseSignData).getSpeedUpSignData();
            C8396bBt c8396bBt = C8396bBt.AEQbTJ;
            java.lang.Object first = triple.getFirst();
            Intrinsics.copydefault(first);
            return C8396bBt.buildOKWTransaction$default(c8396bBt, new SignDataArgs(str, null, ((C10854bwM) first).fetchVPNInfo(), baseSignData, null, null, null, null, null, null, 1, null, null, null, null, null, null, false, false, null, false, false, false, false, 16776178, null), null, false, 6, null);
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(null, triple.getThird()));
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.gag */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(AbstractC20109gag abstractC20109gag, kotlin.Pair pair) {
        abstractC20109gag.KWHzl();
        java.lang.Object first = pair.getFirst();
        AbstractC8564bFB abstractC8564bFB = first instanceof AbstractC8564bFB ? (AbstractC8564bFB) first : null;
        if (abstractC8564bFB != null) {
            abstractC20109gag.copydefault(abstractC8564bFB);
            abstractC20109gag.copydefault();
            abstractC20109gag.djBIcL();
        } else {
            java.lang.String str = (java.lang.String) pair.getSecond();
            if (str != null) {
                C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
            }
            abstractC20109gag.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(AbstractC20109gag abstractC20109gag, java.lang.Throwable th) {
        abstractC20109gag.KWHzl();
        Intrinsics.copydefault(th);
        C10857bwP.copydefault("SpeedUpTxBaseFragment", th);
        abstractC20109gag.AEQbTJ();
        return Unit.INSTANCE;
    }

    public void copydefault() {
        if (gEmmrt().dHguZz().DarRvM()) {
            return;
        }
        java.lang.String name = getClass().getName();
        SpeedUpSignData speedUpSignData = this.OLrzqt;
        if (speedUpSignData == null) {
            Intrinsics.gEmmrt("");
            speedUpSignData = null;
        }
        this.EZpvd = new Application(this, name + "-" + speedUpSignData.getTxId(), new xZA(0L, 300L, null, 4, null));
        WalletTxHistorySubManager walletTxHistorySubManagerAxsJAY = C11205cFp.EZpvd.AxsJAY();
        xZF.TaskDescription<WalletTxHistorySubManager.SubResponse> taskDescription = this.EZpvd;
        Intrinsics.copydefault(taskDescription);
        walletTxHistorySubManagerAxsJAY.AEQbTJ(taskDescription);
    }

    /* JADX INFO: renamed from: o.gag$Application */
    public static final class Application extends xZF.TaskDescription<WalletTxHistorySubManager.SubResponse> {
        public final /* synthetic */ AbstractC20109gag<T> EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(AbstractC20109gag<T> abstractC20109gag, java.lang.String str, xZA xza) {
            super(str, xza);
            this.EZpvd = abstractC20109gag;
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletTxHistorySubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            AbstractC20109gag<T> abstractC20109gag = this.EZpvd;
            for (WalletTxHistorySubManager.SubResponse subResponse : list) {
                java.lang.String txId = subResponse.getTxId();
                SpeedUpSignData speedUpSignData = abstractC20109gag.OLrzqt;
                SpeedUpSignData speedUpSignData2 = null;
                if (speedUpSignData == null) {
                    Intrinsics.gEmmrt("");
                    speedUpSignData = null;
                }
                if (!Intrinsics.EZpvd((java.lang.Object) txId, (java.lang.Object) speedUpSignData.getTxId())) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) subResponse.getOrderId())) {
                        java.lang.String orderId = subResponse.getOrderId();
                        SpeedUpSignData speedUpSignData3 = abstractC20109gag.OLrzqt;
                        if (speedUpSignData3 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            speedUpSignData2 = speedUpSignData3;
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) orderId, (java.lang.Object) speedUpSignData2.getOrderId())) {
                        }
                    }
                }
                if (subResponse.getTxStatus() >= 2) {
                    abstractC20109gag.AhwBna = false;
                }
            }
        }
    }

    public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = yho;
        show(fragmentManager, str);
    }

    public final void AYXKKw() {
        if (!this.AhwBna) {
            C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.fsw, 0, 1, (java.lang.Object) null);
            dismissAllowingStateLoss();
            Function1<? super java.lang.Boolean, Unit> function1 = this.AEQbTJ;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.FALSE);
            }
            yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho = this.KWHzl;
            if (yho != null) {
                yho.invoke(java.lang.Boolean.FALSE, null, null);
                return;
            }
            return;
        }
        InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        C8396bBt c8396bBt = C8396bBt.AEQbTJ;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        AbstractC58260yxt<ResponseData<C9748bbT>> abstractC58260yxtKWHzl = c8396bBt.KWHzl(activity, gEmmrt(), new ActionBar(this));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58260yxt abstractC58260yxtAEQbTJ = C58156yvv.AEQbTJ(abstractC58260yxtKWHzl, viewLifecycleOwner, Lifecycle.Event.ON_DESTROY);
        final Function1 function12 = new Function1() { // from class: o.gaj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20109gag.OLrzqt(this.copydefault, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gal
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC20109gag.values(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.gan
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20109gag.copydefault(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        this.gEmmrt = abstractC58260yxtAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gam
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC20109gag.fetchVPNInfo(function13, obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.gag$ActionBar */
    public static final class ActionBar implements InterfaceC9740bbL.TaskDescription {
        public final /* synthetic */ AbstractC20109gag<T> copydefault;

        public ActionBar(AbstractC20109gag<T> abstractC20109gag) {
            this.copydefault = abstractC20109gag;
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void copydefault() {
            this.copydefault.AhwBna();
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void EZpvd() {
            this.copydefault.KWHzl();
        }
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(AbstractC20109gag abstractC20109gag, ResponseData responseData) {
        int code = responseData.getCode();
        if (code != -5014) {
            if (code == -5001) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                abstractC20109gag.OLrzqt((C9748bbT) data);
            } else {
                switch (code) {
                    case -5007:
                        break;
                    case -5006:
                        abstractC20109gag.KWHzl(C33070mpX.AYXKKw(C13754dXa.FragmentManager.unregisterCallbackListener));
                        break;
                    case -5005:
                        abstractC20109gag.KWHzl(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DRGLNw));
                        break;
                    case -5004:
                        abstractC20109gag.KWHzl(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sYcwUD));
                        break;
                    default:
                        abstractC20109gag.KWHzl(responseData.getMsg());
                        break;
                }
            }
        }
        C10350bmm.AEQbTJ.copydefault(true);
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(AbstractC20109gag abstractC20109gag, java.lang.Throwable th) {
        if (abstractC20109gag.getViewLifecycleOwner().getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return Unit.INSTANCE;
        }
        abstractC20109gag.KWHzl();
        Intrinsics.copydefault(th);
        C10857bwP.copydefault("SpeedUpTxBaseFragment", th);
        C10350bmm.AEQbTJ.copydefault(true);
        return Unit.INSTANCE;
    }

    public void OLrzqt(@NotNull C9748bbT c9748bbT) {
        Intrinsics.checkNotNullParameter(c9748bbT, "");
        dismissAllowingStateLoss();
        Function1<? super java.lang.Boolean, Unit> function1 = this.AEQbTJ;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.TRUE);
        }
        yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho = this.KWHzl;
        if (yho != null) {
            yho.invoke(java.lang.Boolean.TRUE, c9748bbT.gEmmrt(), c9748bbT.KWHzl());
        }
    }

    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.Dfm, 0, 1, (java.lang.Object) null);
        } else {
            C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
        }
    }

    public final void djBIcL() {
        final AbstractC8564bFB abstractC8564bFBGEmmrt = gEmmrt();
        if (!(abstractC8564bFBGEmmrt instanceof AbstractC8564bFB)) {
            abstractC8564bFBGEmmrt = null;
        }
        if (abstractC8564bFBGEmmrt == null) {
            return;
        }
        getViewLifecycleOwner().getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.okinc.business.defi.wallet.transaction.speedup.SpeedUpTxBaseFragment$$ExternalSyntheticLambda4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                AbstractC20109gag.AEQbTJ(abstractC8564bFBGEmmrt, this, lifecycleOwner, event);
            }
        });
    }

    public static final void AEQbTJ(AbstractC8564bFB abstractC8564bFB, AbstractC20109gag abstractC20109gag, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        int i = TaskDescription.EZpvd[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                AbstractC8564bFB.startLoopRefresh$default(abstractC8564bFB, 0L, 1, null);
                return;
            } else {
                if (i != 3) {
                    return;
                }
                abstractC8564bFB.QkdxfA();
                return;
            }
        }
        AbstractC58185ywX abstractC58185ywXIsConnected = abstractC8564bFB.QKudOq().isConnected();
        LifecycleOwner viewLifecycleOwner = abstractC20109gag.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXIsConnected, viewLifecycleOwner, Lifecycle.Event.ON_STOP);
        final Activity activity = new Activity(abstractC20109gag, abstractC8564bFB);
        abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58227yxM() { // from class: o.gap
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC20109gag.AYXKKw(activity, obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.gag$Activity */
    public static final class Activity implements Function1 {
        public final /* synthetic */ AbstractC20109gag<T> KWHzl;
        public final /* synthetic */ AbstractC8564bFB<?, ?> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(AbstractC20109gag<T> abstractC20109gag, AbstractC8564bFB<?, ?> abstractC8564bFB) {
            this.KWHzl = abstractC20109gag;
            this.copydefault = abstractC8564bFB;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            AEQbTJ((C8486bDd) obj);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(C8486bDd c8486bDd) {
            AbstractC20109gag<T> abstractC20109gag = this.KWHzl;
            AbstractC8426bCW<?> abstractC8426bCWQKudOq = this.copydefault.QKudOq();
            Intrinsics.copydefault(c8486bDd);
            abstractC20109gag.KWHzl(abstractC8426bCWQKudOq, c8486bDd);
        }
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (this.EZpvd != null) {
            WalletTxHistorySubManager walletTxHistorySubManagerAxsJAY = C11205cFp.EZpvd.AxsJAY();
            xZF.TaskDescription<WalletTxHistorySubManager.SubResponse> taskDescription = this.EZpvd;
            Intrinsics.copydefault(taskDescription);
            walletTxHistorySubManagerAxsJAY.OLrzqt(taskDescription);
        }
        if (this.AYXKKw != null) {
            gEmmrt().fFgQHt();
        }
    }
}
