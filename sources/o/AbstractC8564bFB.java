package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.BaseSignData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.bean.CommonExtJson;
import com.okinc.business.defi.biz.core.transaction.bean.EVM5792SendCallsParams;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.core.ws.channel.WalletGasPriceSubManager;
import com.okinc.business.defi.biz.net.bean.ChainInfo;
import com.okinc.business.defi.biz.net.bean.TxToastCheckReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.biz.net.bean.UserOperation;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.formatter.WalletCurrencyBean;
import com.okinc.wallet.core.ws.WalletWSBaseArgsChannel;
import java.math.RoundingMode;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC8426bCW;
import o.AbstractC8564bFB;
import o.C8475bDS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bFB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8564bFB<Fee extends AbstractC8426bCW<?>, SignData extends BaseSignData> extends OKWBaseTransaction<SignData> {
    public static final Application Companion = new Application(null);
    public static final int values = 8;
    public InterfaceC58217yxC AuCTel;
    public InterfaceC58217yxC DbNXlk;
    public boolean ejfBZ;
    public InterfaceC58217yxC getNewProxyInstance;
    public InterfaceC58217yxC hDKMBd;
    public boolean isConnected;
    public InterfaceC58217yxC iwGUEr;
    public final InterfaceC56387yDm fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.bFE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC8564bFB.iRxXKY();
        }
    });
    public final InterfaceC56387yDm fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.bFI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC8564bFB.hUfVAv();
        }
    });
    public final InterfaceC56387yDm fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.bFM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC8564bFB.AYXKKw(this.AEQbTJ);
        }
    });
    public java.lang.String AkhnZx = "";

    public abstract void AhwBna();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AkhnZx(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx = str;
    }

    public abstract java.util.ArrayList<java.lang.Integer> AuCTelauCTel();

    public java.lang.String DAIeex() {
        return null;
    }

    public abstract boolean DCUTEI();

    public abstract Fee DXXBbs();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
    }

    public abstract void OLrzqt(@NotNull java.util.List<TxToastCheckRes> list);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OuxcSI() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String RlQdEF() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(boolean z) {
        this.isConnected = z;
    }

    public abstract AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT();

    public abstract java.lang.String l_();

    public abstract AbstractC58185ywX<Unit> p_();

    public abstract boolean q_();

    public abstract void x_();

    public abstract java.lang.String zLjUOn();

    /* JADX INFO: renamed from: o.bFB$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bFB.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final C8475bDS DCJXGO() {
        return (C8475bDS) this.fARcdN.getValue();
    }

    public static final C8475bDS iRxXKY() {
        return new C8475bDS();
    }

    public final C8544bEi OqFWZa() {
        return (C8544bEi) this.fIwbmz.getValue();
    }

    public static final C8544bEi hUfVAv() {
        return new C8544bEi();
    }

    public final java.lang.String ODWQjV() {
        return (java.lang.String) this.fJNWhG.getValue();
    }

    public static final java.lang.String AYXKKw(AbstractC8564bFB abstractC8564bFB) {
        int iQwvEab = abstractC8564bFB.QwvEab();
        if (iQwvEab != 1 && iQwvEab != 6) {
            return "subSingInfoPrice-txConfirmPage";
        }
        return "subSingInfoPrice-txConfirmPage-" + abstractC8564bFB;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull SignDataArgs<SignData> signDataArgs) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        return q_() && super.KWHzl(abstractC12782ctV, c10854bwM, signDataArgs);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> s_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAxsJAYsNCnLh = AxsJAYsNCnLh();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAhwBna = DXXBbs().AhwBna();
        AbstractC58185ywX<Unit> abstractC58185ywXEZpvd = OqFWZa().EZpvd(DAIeex());
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQHmsKR = QHmsKR();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = KWHzl(false);
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = r_();
        final yHQ yhq = new yHQ() { // from class: o.bGh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHQ
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
                return AbstractC8564bFB.KWHzl((kotlin.Pair) obj, (kotlin.Pair) obj2, (Unit) obj3, (kotlin.Pair) obj4, (kotlin.Pair) obj5, (kotlin.Pair) obj6);
            }
        };
        AbstractC58185ywX abstractC58185ywXOLrzqt = AbstractC58185ywX.OLrzqt(abstractC58185ywXAxsJAYsNCnLh, abstractC58185ywXAhwBna, abstractC58185ywXEZpvd, abstractC58185ywXQHmsKR, abstractC58185ywXKWHzl, abstractC58185ywXR_, new InterfaceC58234yxT() { // from class: o.bGf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58234yxT
            public final java.lang.Object EZpvd(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
                return AbstractC8564bFB.copydefault(yhq, obj, obj2, obj3, obj4, obj5, obj6);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.bFF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8564bFB.copydefault(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.bFG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8564bFB.zLjUOn(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final kotlin.Pair copydefault(yHQ yhq, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        Intrinsics.checkNotNullParameter(obj4, "");
        Intrinsics.checkNotNullParameter(obj5, "");
        Intrinsics.checkNotNullParameter(obj6, "");
        return (kotlin.Pair) yhq.invoke(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static final kotlin.Pair KWHzl(kotlin.Pair pair, kotlin.Pair pair2, Unit unit, kotlin.Pair pair3, kotlin.Pair pair4, kotlin.Pair pair5) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        Intrinsics.checkNotNullParameter(unit, "");
        Intrinsics.checkNotNullParameter(pair3, "");
        Intrinsics.checkNotNullParameter(pair4, "");
        Intrinsics.checkNotNullParameter(pair5, "");
        return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? pair : !((java.lang.Boolean) pair3.getFirst()).booleanValue() ? pair3 : !((java.lang.Boolean) pair4.getFirst()).booleanValue() ? pair4 : !((java.lang.Boolean) pair5.getFirst()).booleanValue() ? pair5 : C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    public static final InterfaceC60096zvd zLjUOn(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(AbstractC8564bFB abstractC8564bFB, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return abstractC8564bFB.dxcTrN();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction.preCheck$default(com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction, boolean, int, java.lang.Object):o.ywX */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl(@NotNull BaseSignData baseSignData) {
        Intrinsics.checkNotNullParameter(baseSignData, "");
        OJuSTm().setSignData(baseSignData);
        if (!q_()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX abstractC58185ywXPreCheck$default = OKWBaseTransaction.preCheck$default(this, false, 1, null);
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXFfGIBT = ffGIBT();
        final Function2 function2 = new Function2() { // from class: o.bFL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC8564bFB.KWHzl((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXPreCheck$default, abstractC58185ywXFfGIBT, new InterfaceC58223yxI() { // from class: o.bFN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC8564bFB.AEQbTJ(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair AEQbTJ(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair KWHzl(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? pair : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? pair2 : C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QHmsKR() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = DCJXGO().KWHzl(QwvEab(), af_(), j_()).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AxsJAYsNCnLh() {
        AbstractC58185ywX<ResponseData<ChainInfo>> abstractC58185ywXAEQbTJ = OFhtUX().AEQbTJ(OxVOHk(), Dmq(), dHguZz().AhwBna(), fERRXa().getAddress(), QwvEab());
        final Function1 function1 = new Function1() { // from class: o.bGc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8564bFB.AEQbTJ((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bFY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8564bFB.AubY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final kotlin.Pair AubY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd(@NotNull C8486bDd c8486bDd) {
        Intrinsics.checkNotNullParameter(c8486bDd, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> RJOkX() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> finit() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> dxcTrN() {
        AbstractC58185ywX abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.bFQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return AbstractC8564bFB.valueOf(this.OLrzqt);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.bFS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8564bFB.AEQbTJ(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.bFR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8564bFB.AuCTelauCTel(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bFX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8564bFB.valueOf(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bFV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8564bFB.zsXlph(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    /* JADX INFO: renamed from: o.bFB$StateListAnimator */
    public static final class StateListAnimator implements Function1 {
        public final /* synthetic */ AbstractC8564bFB<Fee, SignData> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(AbstractC8564bFB<Fee, SignData> abstractC8564bFB) {
            this.AEQbTJ = abstractC8564bFB;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            AEQbTJ((C8486bDd) obj);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(C8486bDd c8486bDd) {
            InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ.hDKMBd;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            AbstractC8564bFB<Fee, SignData> abstractC8564bFB = this.AEQbTJ;
            Intrinsics.copydefault(c8486bDd);
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = abstractC8564bFB.EZpvd(c8486bDd);
            final AbstractC8564bFB<Fee, SignData> abstractC8564bFB2 = this.AEQbTJ;
            final Function1 function1 = new Function1() { // from class: o.bGm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC8564bFB.StateListAnimator.KWHzl(abstractC8564bFB2, (kotlin.Pair) obj);
                }
            };
            InterfaceC58227yxM<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.bGk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractC8564bFB.StateListAnimator.OLrzqt(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.bGi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC8564bFB.StateListAnimator.AEQbTJ((java.lang.Throwable) obj);
                }
            };
            abstractC8564bFB.hDKMBd = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.bGl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractC8564bFB.StateListAnimator.copydefault(function12, obj);
                }
            });
        }

        public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit KWHzl(AbstractC8564bFB abstractC8564bFB, kotlin.Pair pair) {
            abstractC8564bFB.x_();
            abstractC8564bFB.AhwBna();
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(java.lang.Throwable th) {
            return Unit.INSTANCE;
        }

        public static final void copydefault(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }
    }

    public static final kotlin.Pair valueOf(AbstractC8564bFB abstractC8564bFB) {
        AbstractC58185ywX abstractC58185ywXIsConnected = abstractC8564bFB.DXXBbs().isConnected();
        final StateListAnimator stateListAnimator = new StateListAnimator(abstractC8564bFB);
        abstractC58185ywXIsConnected.AEQbTJ(new InterfaceC58227yxM() { // from class: o.bFP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC8564bFB.wlaJM(stateListAnimator, obj);
            }
        });
        abstractC8564bFB.DCJXGO().OLrzqt(new TaskDescription(abstractC8564bFB));
        abstractC8564bFB.DCJXGO().KWHzl(new ActionBar(abstractC8564bFB));
        abstractC8564bFB.getPostValueLengthLimit();
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    public static final void wlaJM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o.bFB$TaskDescription */
    public static final class TaskDescription implements C8475bDS.ActionBar {
        public final /* synthetic */ AbstractC8564bFB<Fee, SignData> EZpvd;

        public TaskDescription(AbstractC8564bFB<Fee, SignData> abstractC8564bFB) {
            this.EZpvd = abstractC8564bFB;
        }

        @Override // o.C8475bDS.ActionBar
        public void OLrzqt(java.util.List<WalletTickerManager.CoinPrice> list) {
            Intrinsics.checkNotNullParameter(list, "");
            InterfaceC58217yxC interfaceC58217yxC = this.EZpvd.getNewProxyInstance;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            AbstractC8564bFB<Fee, SignData> abstractC8564bFB = this.EZpvd;
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXFinit = abstractC8564bFB.finit();
            final AbstractC8564bFB<Fee, SignData> abstractC8564bFB2 = this.EZpvd;
            final Function1 function1 = new Function1() { // from class: o.bGj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC8564bFB.TaskDescription.KWHzl(abstractC8564bFB2, (kotlin.Pair) obj);
                }
            };
            InterfaceC58227yxM<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.bGq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractC8564bFB.TaskDescription.copydefault(function1, obj);
                }
            };
            final AbstractC8564bFB<Fee, SignData> abstractC8564bFB3 = this.EZpvd;
            final Function1 function12 = new Function1() { // from class: o.bGp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC8564bFB.TaskDescription.KWHzl(abstractC8564bFB3, (java.lang.Throwable) obj);
                }
            };
            abstractC8564bFB.getNewProxyInstance = abstractC58185ywXFinit.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.bGn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractC8564bFB.TaskDescription.KWHzl(function12, obj);
                }
            });
        }

        public static final void copydefault(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit KWHzl(AbstractC8564bFB abstractC8564bFB, kotlin.Pair pair) {
            abstractC8564bFB.DXXBbs().KWHzl(2);
            return Unit.INSTANCE;
        }

        public static final void KWHzl(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit KWHzl(AbstractC8564bFB abstractC8564bFB, java.lang.Throwable th) {
            abstractC8564bFB.DXXBbs().KWHzl(2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.bFB$ActionBar */
    public static final class ActionBar implements C8475bDS.TaskDescription {
        public final /* synthetic */ AbstractC8564bFB<Fee, SignData> OLrzqt;

        @Override // o.C8475bDS.TaskDescription
        public void EZpvd() {
        }

        public ActionBar(AbstractC8564bFB<Fee, SignData> abstractC8564bFB) {
            this.OLrzqt = abstractC8564bFB;
        }

        @Override // o.C8475bDS.TaskDescription
        public void OLrzqt() {
            InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt.iwGUEr;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            AbstractC8564bFB<Fee, SignData> abstractC8564bFB = this.OLrzqt;
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXRJOkX = abstractC8564bFB.RJOkX();
            final AbstractC8564bFB<Fee, SignData> abstractC8564bFB2 = this.OLrzqt;
            final Function1 function1 = new Function1() { // from class: o.bGo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC8564bFB.ActionBar.copydefault(abstractC8564bFB2, (kotlin.Pair) obj);
                }
            };
            InterfaceC58227yxM<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.bGr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractC8564bFB.ActionBar.EZpvd(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.bGt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC8564bFB.ActionBar.KWHzl((java.lang.Throwable) obj);
                }
            };
            abstractC8564bFB.iwGUEr = abstractC58185ywXRJOkX.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.bGv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractC8564bFB.ActionBar.AEQbTJ(function12, obj);
                }
            });
        }

        public static final void EZpvd(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit copydefault(AbstractC8564bFB abstractC8564bFB, kotlin.Pair pair) {
            abstractC8564bFB.x_();
            abstractC8564bFB.AhwBna();
            abstractC8564bFB.DCJXGO().uzCIH();
            return Unit.INSTANCE;
        }

        public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit KWHzl(java.lang.Throwable th) {
            return Unit.INSTANCE;
        }
    }

    public static final InterfaceC60096zvd AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(AbstractC8564bFB abstractC8564bFB, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return abstractC8564bFB.DXXBbs().gEmmrt();
    }

    public static final InterfaceC60096zvd zsXlph(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd valueOf(AbstractC8564bFB abstractC8564bFB, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return super.dxcTrN();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public final void getPostValueLengthLimit() {
        if (OuxcSI()) {
            C11205cFp.EZpvd.QKVWgx().copydefault(new Activity(this, ODWQjV(), C56402yEa.EZpvd(new WalletGasPriceSubManager.Application(dHguZz().fetchVPNInfo()))));
        }
    }

    /* JADX INFO: renamed from: o.bFB$Activity */
    public static final class Activity extends WalletWSBaseArgsChannel.Application<WalletGasPriceSubManager.Application, WalletGasPriceSubManager.SubResponse> {
        public final /* synthetic */ AbstractC8564bFB<Fee, SignData> EZpvd;

        /* JADX INFO: renamed from: o.bFB$Activity$ActionBar */
        public static final class ActionBar extends TypeToken<JsonObject> {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(AbstractC8564bFB<Fee, SignData> abstractC8564bFB, java.lang.String str, java.util.List<WalletGasPriceSubManager.Application> list) {
            super(str, null, list, 2, null);
            this.EZpvd = abstractC8564bFB;
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletGasPriceSubManager.SubResponse> list) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(list, "");
            WalletGasPriceSubManager.SubResponse subResponse = (WalletGasPriceSubManager.SubResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (subResponse != null) {
                final AbstractC8564bFB<Fee, SignData> abstractC8564bFB = this.EZpvd;
                try {
                    Result.Application application = Result.Companion;
                    if (C33129mqd.valueOf(((JsonObject) new Gson().fromJson(subResponse.getOriginData(), new ActionBar().getType())).getAsJsonObject().get("chainIndex").getAsString()) == abstractC8564bFB.dHguZz().fetchVPNInfo()) {
                        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDbNXlk = abstractC8564bFB.DbNXlk(subResponse.getOriginData());
                        final Function1 function1 = new Function1() { // from class: o.bGe
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return AbstractC8564bFB.Activity.KWHzl(abstractC8564bFB, (kotlin.Pair) obj);
                            }
                        };
                        abstractC58185ywXDbNXlk.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bGg
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58229yxO
                            public final java.lang.Object apply(java.lang.Object obj) {
                                return AbstractC8564bFB.Activity.EZpvd(function1, obj);
                            }
                        }).DbNXlk();
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                Result.m7376boximpl(objM7377constructorimpl);
            }
        }

        public static final Unit EZpvd(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (Unit) function1.invoke(obj);
        }

        public static final Unit KWHzl(AbstractC8564bFB abstractC8564bFB, kotlin.Pair pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
                abstractC8564bFB.DXXBbs().KWHzl(3);
            }
            return Unit.INSTANCE;
        }
    }

    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DbNXlk(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public final C8475bDS DarRvM() {
        return DCJXGO();
    }

    public final C8544bEi zuWLRA() {
        return OqFWZa();
    }

    public final Fee QKudOq() {
        return (Fee) DXXBbs();
    }

    public java.util.HashSet<java.lang.Long> j_() {
        return yEE.djBIcL(java.lang.Long.valueOf(dHguZz().AhwBna()));
    }

    public static /* synthetic */ java.lang.String getChainBalance$default(AbstractC8564bFB abstractC8564bFB, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChainBalance");
        }
        if ((i & 1) != 0) {
            str = abstractC8564bFB.htlTjW();
        }
        return abstractC8564bFB.AYXKKw(str);
    }

    public final java.lang.String AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strKWHzl = DarRvM().KWHzl(java.lang.Long.valueOf(dHguZz().AhwBna()), str);
        return strKWHzl == null ? "" : strKWHzl;
    }

    public static /* synthetic */ java.lang.String getFeeCoinBalance$default(AbstractC8564bFB abstractC8564bFB, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeeCoinBalance");
        }
        if ((i & 1) != 0) {
            str = abstractC8564bFB.htlTjW();
        }
        return abstractC8564bFB.djBIcL(str);
    }

    public final java.lang.String djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strKWHzl = DarRvM().KWHzl(java.lang.Long.valueOf(DXXBbs().AYXKKw().AhwBna()), str);
        return strKWHzl == null ? "" : strKWHzl;
    }

    public static /* synthetic */ java.lang.String getFeeCoinCheckBalance$default(AbstractC8564bFB abstractC8564bFB, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeeCoinCheckBalance");
        }
        if ((i & 1) != 0) {
            str = abstractC8564bFB.htlTjW();
        }
        return abstractC8564bFB.gEmmrt(str);
    }

    public java.lang.String gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return djBIcL(str);
    }

    public static /* synthetic */ void startLoopRefresh$default(AbstractC8564bFB abstractC8564bFB, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startLoopRefresh");
        }
        if ((i & 1) != 0) {
            j = 7;
        }
        abstractC8564bFB.KWHzl(j);
    }

    public final void KWHzl(long j) {
        if (!DCUTEI() || OuxcSI()) {
            return;
        }
        InterfaceC58217yxC interfaceC58217yxC = this.AuCTel;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(j, 7L, java.util.concurrent.TimeUnit.SECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.bFJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8564bFB.copydefault(this.OLrzqt, (java.lang.Long) obj);
            }
        };
        this.AuCTel = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.bFK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC8564bFB.gHZMYf(function1, obj);
            }
        });
    }

    public static final void gHZMYf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(AbstractC8564bFB abstractC8564bFB, java.lang.Long l) {
        InterfaceC58217yxC interfaceC58217yxC = abstractC8564bFB.DbNXlk;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        abstractC8564bFB.DbNXlk = abstractC8564bFB.p_().DbNXlk();
        return Unit.INSTANCE;
    }

    public final void QkdxfA() {
        InterfaceC58217yxC interfaceC58217yxC = this.AuCTel;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.DbNXlk;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    public final void accept() {
        InterfaceC58217yxC interfaceC58217yxC = this.AuCTel;
        this.ejfBZ = (interfaceC58217yxC == null || interfaceC58217yxC.isDisposed()) ? false : true;
        QkdxfA();
        G_();
        C11205cFp.EZpvd.QKVWgx().OLrzqt(ODWQjV());
    }

    public void G_() {
        DCJXGO().getFieldNames();
    }

    public final void OBJEWx() {
        if (this.ejfBZ) {
            KWHzl(0L);
        }
        gGvvIC();
        getPostValueLengthLimit();
    }

    public void gGvvIC() {
        DCJXGO().EZpvd(af_());
    }

    public java.util.List<C13856daV> af_() {
        return C56402yEa.EZpvd(new C13856daV(dUDNAs().DbNXlk(), htlTjW()));
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.util.List<com.okinc.business.defi.biz.net.bean.TxToastCheckRes>> */
    public final AbstractC58185ywX<java.util.List<TxToastCheckRes>> QSBOWP() {
        final java.util.ArrayList<java.lang.Integer> arrayListAuCTelauCTel = AuCTelauCTel();
        if (arrayListAuCTelauCTel.isEmpty()) {
            AbstractC58185ywX<java.util.List<TxToastCheckRes>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(yDY.AhwBna());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        TxToastCheckReq txToastCheckReqI_ = i_();
        txToastCheckReqI_.setCheckTypes(arrayListAuCTelauCTel);
        AbstractC58185ywX<java.util.List<TxToastCheckRes>> abstractC58185ywXOLrzqt = OLrzqt(txToastCheckReqI_);
        final Function1 function1 = new Function1() { // from class: o.bFT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8564bFB.EZpvd(this.EZpvd, arrayListAuCTelauCTel, (java.util.List) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bGa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8564bFB.sSMYrx(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.util.List sSMYrx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List EZpvd(AbstractC8564bFB abstractC8564bFB, java.util.ArrayList arrayList, java.util.List list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                TxToastCheckRes txToastCheckRes = (TxToastCheckRes) obj;
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    int iIntValue = ((java.lang.Number) next).intValue();
                    java.lang.Integer checkType = txToastCheckRes.getCheckType();
                    if (checkType != null && checkType.intValue() == iIntValue) {
                        break;
                    }
                }
                if (next != null) {
                    arrayList2.add(obj);
                }
            }
            abstractC8564bFB.OLrzqt(arrayList2);
        }
        return list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.bFB<Fee extends o.bCW<?>, SignData extends com.okinc.business.defi.api.model.tx.signdata.BaseSignData> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public TxToastCheckReq i_() {
        TxToastCheckReq txToastCheckReqI_ = super.i_();
        InterfaceC9729bbA interfaceC9729bbA = this instanceof InterfaceC9729bbA ? (InterfaceC9729bbA) this : null;
        java.lang.String strCopydefault = interfaceC9729bbA != null ? interfaceC9729bbA.copydefault() : null;
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        txToastCheckReqI_.setGasPrice(strCopydefault);
        return txToastCheckReqI_;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void fFgQHt() {
        super.fFgQHt();
        QkdxfA();
        InterfaceC58217yxC interfaceC58217yxC = this.hDKMBd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.iwGUEr;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC3 = this.getNewProxyInstance;
        if (interfaceC58217yxC3 != null) {
            interfaceC58217yxC3.dispose();
        }
        DXXBbs().AkhnZx();
        DCJXGO().iwGUEr();
        C11205cFp.EZpvd.QKVWgx().OLrzqt(ODWQjV());
    }

    public static /* synthetic */ BroadcastBean generateCommonBroadcastModel$default(AbstractC8564bFB abstractC8564bFB, java.lang.String str, java.lang.String str2, long j, java.lang.String str3, java.lang.String str4, CommonExtJson commonExtJson, java.lang.Object obj, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj2) {
        if (obj2 == null) {
            return abstractC8564bFB.EZpvd(str, str2, j, str3, str4, commonExtJson, (i & 64) != 0 ? null : obj, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateCommonBroadcastModel");
    }

    public final BroadcastBean EZpvd(@NotNull java.lang.String str, java.lang.String str2, long j, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull CommonExtJson commonExtJson, java.lang.Object obj, java.lang.String str5, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(commonExtJson, "");
        java.lang.String strDmq = Dmq();
        int iOLrzqt = WalletType.Companion.OLrzqt(dUDNAs());
        java.lang.String address = fERRXa().getAddress();
        java.lang.String strZLjUOn = zLjUOn();
        java.lang.String strL_ = l_();
        int iQwvEab = QwvEab();
        java.lang.String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return new BroadcastBean(strDmq, iOLrzqt, str, str2, address, strZLjUOn, j, C54862xYb.convertToBigIntegerString$default(str3, true, (RoundingMode) null, 2, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(str4, true, (RoundingMode) null, 2, (java.lang.Object) null), iQwvEab, string, OLrzqt(commonExtJson, obj), strL_, str5, (java.lang.String) null, str6, (java.util.List) null, (UserOperation) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (EVM5792SendCallsParams) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, -49152, 7, (DefaultConstructorMarker) null);
    }

    public final java.lang.String OLrzqt(CommonExtJson commonExtJson, java.lang.Object obj) {
        JsonObject asJsonObject = C33490mxT.copydefault(commonExtJson).getAsJsonObject();
        if (obj != null) {
            java.util.Set<Map.Entry<java.lang.String, JsonElement>> setEntrySet = C33490mxT.copydefault(obj).getAsJsonObject().entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
            java.util.Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                asJsonObject.add((java.lang.String) entry.getKey(), (JsonElement) entry.getValue());
            }
        }
        java.lang.String string = asJsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Type inference failed for r13v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<DappTxResultBean>> copydefault(@NotNull final BatchBroadcastModel batchBroadcastModel, final SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(batchBroadcastModel, "");
        batchBroadcastModel.setSignAuthType(SignAuthType.Companion.KWHzl(submitTxExpandBean != null ? submitTxExpandBean.getSilentSign() : null));
        int size = batchBroadcastModel.getTxList().size();
        if (size == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, C10857bwP.AEQbTJ("OKWBaseSignTransaction", "broadcastOrResult"), null, null, null, null, 61, null));
        } else if (size != 1 || Intrinsics.EZpvd(batchBroadcastModel.isBatch(), java.lang.Boolean.TRUE)) {
            abstractC58185ywXKWHzl = OLrzqt(batchBroadcastModel);
        } else {
            abstractC58185ywXKWHzl = copydefault((BroadcastBean) CollectionsKt___CollectionsKt.AuCTelauCTel(batchBroadcastModel.getTxList()), batchBroadcastModel.getEstTime(), batchBroadcastModel.getSignAuthType());
        }
        final Function1 function1 = new Function1() { // from class: o.bFU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8564bFB.KWHzl(this.AEQbTJ, submitTxExpandBean, batchBroadcastModel, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bFW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8564bFB.iwGUEr(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData iwGUEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean>> */
    public AbstractC58185ywX<ResponseData<DappTxResultBean>> copydefault(@NotNull final BroadcastBean broadcastBean, java.lang.String str, SignAuthType signAuthType) {
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(broadcastBean, "");
        if (OJuSTm().getBroadcastDelegate() != null) {
            Function1<NewCallbackBean, AbstractC58185ywX<ResponseData<java.lang.String>>> broadcastDelegate = OJuSTm().getBroadcastDelegate();
            Intrinsics.copydefault(broadcastDelegate);
            abstractC58185ywXKWHzl = C33024moe.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd(broadcastBean, str, signAuthType, broadcastDelegate), null, 1, null));
        } else {
            abstractC58185ywXKWHzl = OFhtUX().KWHzl(dUDNAs().DbNXlk(), dUDNAs().USBtdM(), dUDNAs().aUsmxb(), broadcastBean);
        }
        final Function1 function1 = new Function1() { // from class: o.bGb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8564bFB.AEQbTJ(broadcastBean, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bGd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8564bFB.getFieldNames(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AEQbTJ(BroadcastBean broadcastBean, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, new DappTxResultBean(broadcastBean.getSignedTx(), (java.lang.String) responseData.getData(), broadcastBean.getTxHash(), broadcastBean.getOriginData(), (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, WalletImportError.ERROR_CODE_AA_EXIST, (DefaultConstructorMarker) null), null, 44, 0 == true ? 1 : 0);
    }

    public AbstractC58185ywX<ResponseData<DappTxResultBean>> OLrzqt(@NotNull final BatchBroadcastModel batchBroadcastModel) {
        AbstractC58185ywX abstractC58185ywXAEQbTJ;
        Intrinsics.checkNotNullParameter(batchBroadcastModel, "");
        if (OJuSTm().getBroadcastDelegate() != null) {
            Function1<NewCallbackBean, AbstractC58185ywX<ResponseData<java.lang.String>>> broadcastDelegate = OJuSTm().getBroadcastDelegate();
            Intrinsics.copydefault(broadcastDelegate);
            abstractC58185ywXAEQbTJ = C33024moe.KWHzl(C13933dbt.okServerExceptionFilter$default(OLrzqt(batchBroadcastModel, broadcastDelegate), null, 1, null));
        } else {
            AbstractC58185ywX<ResponseData<java.util.HashMap<java.lang.String, java.lang.String>>> abstractC58185ywXEZpvd = OFhtUX().EZpvd(Dmq(), OxVOHk(), QCjLjM(), batchBroadcastModel);
            final Function1 function1 = new Function1() { // from class: o.bFz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC8564bFB.EZpvd((ResponseData) obj);
                }
            };
            abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bFH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC8564bFB.hDKMBd(function1, obj);
                }
            });
        }
        final Function1 function12 = new Function1() { // from class: o.bFO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8564bFB.AEQbTJ(batchBroadcastModel, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bFZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8564bFB.uzCIH(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final ResponseData hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData EZpvd(ResponseData responseData) {
        java.util.Collection collectionValues;
        Intrinsics.checkNotNullParameter(responseData, "");
        int code = responseData.getCode();
        java.util.HashMap map = (java.util.HashMap) responseData.getData();
        return new ResponseData(code, responseData.getMsg(), null, null, (map == null || (collectionValues = map.values()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.RcXXUw(collectionValues), null, 44, null);
    }

    public static final ResponseData uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AEQbTJ(BatchBroadcastModel batchBroadcastModel, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        int code = responseData.getCode();
        Gson gson = new Gson();
        java.util.List<BroadcastBean> txList = batchBroadcastModel.getTxList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(txList, 10));
        java.util.Iterator<T> it = txList.iterator();
        while (it.hasNext()) {
            arrayList.add(((BroadcastBean) it.next()).getSignedTx());
        }
        java.lang.String json = gson.toJson(arrayList);
        java.lang.String str = (java.lang.String) responseData.getData();
        Gson gson2 = new Gson();
        java.util.List<BroadcastBean> txList2 = batchBroadcastModel.getTxList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(txList2, 10));
        java.util.Iterator<T> it2 = txList2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((BroadcastBean) it2.next()).getTxHash());
        }
        return new ResponseData(code, responseData.getMsg(), null, null, new DappTxResultBean(json, str, gson2.toJson(arrayList2), (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, 120, (DefaultConstructorMarker) null), null, 44, null);
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> OLrzqt(BatchBroadcastModel batchBroadcastModel, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        java.util.List<BroadcastBean> txList = batchBroadcastModel.getTxList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(txList, 10));
        java.util.Iterator<T> it = txList.iterator();
        while (true) {
            java.lang.String str = "";
            if (!it.hasNext()) {
                break;
            }
            java.lang.String txHash = ((BroadcastBean) it.next()).getTxHash();
            if (txHash != null) {
                str = txHash;
            }
            arrayList.add(str);
        }
        JsonObject jsonObject = new JsonObject();
        Gson gson = new Gson();
        jsonObject.add("transactionHash", gson.toJsonTree(arrayList));
        jsonObject.add("walletTxData", gson.toJsonTree(batchBroadcastModel.getTxList()));
        if (batchBroadcastModel.getBizId() != null) {
            jsonObject.add("bizId", gson.toJsonTree(batchBroadcastModel.getBizId()));
        }
        java.util.HashMap<java.lang.String, java.lang.String> mapCopydefault = OFhtUX().copydefault(OxVOHk(), Dmq(), "", C12764ctD.OLrzqt.EZpvd(batchBroadcastModel.getTxList()));
        java.lang.Boolean boolIsBatch = batchBroadcastModel.isBatch();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        return function1.invoke(new NewCallbackBean(mapCopydefault, jsonObject, Intrinsics.EZpvd(boolIsBatch, bool), batchBroadcastModel.getEstTime(), Intrinsics.EZpvd(batchBroadcastModel.isBtcMint(), bool), null, batchBroadcastModel.getProtocolId(), batchBroadcastModel.getTxType(), null, null, batchBroadcastModel.getSignAuthType(), 800, null));
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> EZpvd(BroadcastBean broadcastBean, java.lang.String str, SignAuthType signAuthType, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        JsonElement jsonTree = new Gson().toJsonTree(broadcastBean);
        android.os.Bundle walletTxDataExtra = OJuSTm().getWalletTxDataExtra();
        if (walletTxDataExtra != null && !walletTxDataExtra.isEmpty() && (jsonTree instanceof JsonObject)) {
            java.util.Set<java.lang.String> setKeySet = walletTxDataExtra.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "");
            for (java.lang.String str2 : setKeySet) {
                java.lang.Object obj = walletTxDataExtra.get(str2);
                if (obj instanceof JsonElement) {
                    ((JsonObject) jsonTree).add(str2, (JsonElement) obj);
                } else if (obj instanceof java.lang.String) {
                    ((JsonObject) jsonTree).addProperty(str2, (java.lang.String) obj);
                } else if (obj instanceof java.lang.Number) {
                    ((JsonObject) jsonTree).addProperty(str2, (java.lang.Number) obj);
                } else if (obj instanceof java.lang.Boolean) {
                    ((JsonObject) jsonTree).addProperty(str2, (java.lang.Boolean) obj);
                } else if (obj instanceof java.lang.Character) {
                    ((JsonObject) jsonTree).addProperty(str2, (java.lang.Character) obj);
                }
            }
        }
        JsonObject jsonObject = new JsonObject();
        if (dUDNAs().getFieldNames()) {
            jsonObject.addProperty("uopHash", broadcastBean.getTxHash());
        }
        jsonObject.addProperty("transactionHash", broadcastBean.getTxHash());
        jsonObject.add("walletTxData", jsonTree);
        EZpvd(jsonObject);
        jsonObject.addProperty("signedTx", broadcastBean.getSignedTx());
        if (broadcastBean.getSignRawData() != null) {
            jsonObject.addProperty("signRawData", broadcastBean.getSignRawData());
        }
        if (broadcastBean.getOriginData() != null) {
            jsonObject.addProperty("originData", broadcastBean.getOriginData());
        }
        java.util.HashMap<java.lang.String, java.lang.String> mapCopydefault = OFhtUX().copydefault(OxVOHk(), Dmq(), "", C12764ctD.OLrzqt.EZpvd(broadcastBean));
        java.lang.String nonce = broadcastBean.getNonce();
        java.util.List<java.lang.String> mevSuppliers = broadcastBean.getMevSuppliers();
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        java.lang.String txHash = broadcastBean.getTxHash();
        java.lang.String signedTxWithoutJito = broadcastBean.getSignedTxWithoutJito();
        if (signedTxWithoutJito == null) {
            signedTxWithoutJito = broadcastBean.getSignedTx();
        }
        listOLrzqt.add(new NewCallbackBean.DexCallbackBean.SignedInfo(txHash, signedTxWithoutJito));
        if (broadcastBean.getJitoHash() != null) {
            listOLrzqt.add(new NewCallbackBean.DexCallbackBean.SignedInfo(broadcastBean.getJitoHash(), broadcastBean.getJitoSignedTx()));
        }
        Unit unit = Unit.INSTANCE;
        return function1.invoke(new NewCallbackBean(mapCopydefault, jsonObject, false, str, false, null, null, null, null, new NewCallbackBean.DexCallbackBean(nonce, mevSuppliers, C56402yEa.fARcdN(listOLrzqt)), signAuthType, 496, null));
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String copydefault(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        WalletCurrencyBean walletCurrencyBeanKWHzl = zuWLRA().KWHzl();
        return C54880xYt.formatValuation$default(C54862xYb.OLrzqt(obj, java.lang.Double.valueOf(walletCurrencyBeanKWHzl.getUsdToThisRate())), 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, walletCurrencyBeanKWHzl, null, false, 39, null);
    }

    public static final kotlin.Pair AEQbTJ(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            if (((ChainInfo) data).getCanWithdraw()) {
                return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
            }
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            java.lang.Object data2 = responseData.getData();
            Intrinsics.copydefault(data2);
            return C56390yDp.OLrzqt(bool, ((ChainInfo) data2).getWithdrawMsg());
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final ResponseData KWHzl(AbstractC8564bFB abstractC8564bFB, SubmitTxExpandBean submitTxExpandBean, BatchBroadcastModel batchBroadcastModel, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            C8519bEJ.copydefault.EZpvd(abstractC8564bFB.QwvEab(), abstractC8564bFB.dUDNAs().QwvEab(), abstractC8564bFB.aUsmxb(), abstractC8564bFB.dHguZz(), abstractC8564bFB.fERRXa().getAddress(), abstractC8564bFB.OJuSTm(), submitTxExpandBean);
        } else {
            C8519bEJ.copydefault.EZpvd(abstractC8564bFB.QwvEab(), abstractC8564bFB.dUDNAs().QwvEab(), abstractC8564bFB.aUsmxb(), abstractC8564bFB.dHguZz(), abstractC8564bFB.fERRXa().getAddress(), responseData.getCode() + "-" + responseData.getMsg(), abstractC8564bFB.OJuSTm(), submitTxExpandBean, batchBroadcastModel);
        }
        return responseData;
    }
}
