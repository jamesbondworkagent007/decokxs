package o;

import com.okinc.business.invest_api.bean.DeFiRedeemParam;
import com.okinc.business.invest_biz.data.bean.InvestAssetPositionType;
import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.contants.TransactionType;
import com.okinc.business.invest_biz.ui.bean.InvestPositionSelectUIItem;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.Supply;
import com.okinc.business.invest_biz.ui.screens.transaction.redeem.RedeemExternalHandler$redeem$1;
import com.okinc.business.invest_biz.ui.screens.transaction.redeem.RedeemExternalHandler$redeem$3;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC26670jgh;
import o.C25493ixk;
import o.InterfaceC26561jee;
import o.iTX;
import o.iVA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26700jhK {
    public final C26548jeR KWHzl;
    public final iEM OLrzqt;

    /* JADX INFO: renamed from: o.jhK$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.Univ3Redeem.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.Univ3FarmRedeem.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    @yCM
    public C26700jhK(@NotNull C26548jeR c26548jeR, @NotNull iEM iem) {
        Intrinsics.checkNotNullParameter(c26548jeR, "");
        Intrinsics.checkNotNullParameter(iem, "");
        this.KWHzl = c26548jeR;
        this.OLrzqt = iem;
    }

    public static /* synthetic */ java.lang.Object redeem$default(C26700jhK c26700jhK, AbstractActivityC33041mov abstractActivityC33041mov, C25476ixT c25476ixT, InterfaceC25422iwS interfaceC25422iwS, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            interfaceC25422iwS = null;
        }
        return c26700jhK.EZpvd(abstractActivityC33041mov, c25476ixT, interfaceC25422iwS, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull C25476ixT c25476ixT, InterfaceC25422iwS interfaceC25422iwS, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        RedeemExternalHandler$redeem$1 redeemExternalHandler$redeem$1;
        java.lang.Object objAYXKKw;
        C26700jhK c26700jhK;
        if (continuation instanceof RedeemExternalHandler$redeem$1) {
            redeemExternalHandler$redeem$1 = (RedeemExternalHandler$redeem$1) continuation;
            int i = redeemExternalHandler$redeem$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                redeemExternalHandler$redeem$1.label = i - Integer.MIN_VALUE;
            } else {
                redeemExternalHandler$redeem$1 = new RedeemExternalHandler$redeem$1(this, continuation);
            }
        }
        java.lang.Object obj = redeemExternalHandler$redeem$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = redeemExternalHandler$redeem$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C26548jeR c26548jeR = this.KWHzl;
            redeemExternalHandler$redeem$1.L$0 = this;
            redeemExternalHandler$redeem$1.L$1 = abstractActivityC33041mov;
            redeemExternalHandler$redeem$1.L$2 = interfaceC25422iwS;
            redeemExternalHandler$redeem$1.label = 1;
            objAYXKKw = c26548jeR.AYXKKw(c25476ixT, redeemExternalHandler$redeem$1);
            if (objAYXKKw == objCopydefault) {
                return objCopydefault;
            }
            c26700jhK = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC25422iwS = (InterfaceC25422iwS) redeemExternalHandler$redeem$1.L$2;
            abstractActivityC33041mov = (AbstractActivityC33041mov) redeemExternalHandler$redeem$1.L$1;
            c26700jhK = (C26700jhK) redeemExternalHandler$redeem$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objAYXKKw = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objAYXKKw)) {
            objAYXKKw = null;
        }
        InterfaceC26561jee interfaceC26561jee = (InterfaceC26561jee) objAYXKKw;
        if (interfaceC26561jee != null) {
            if (abstractActivityC33041mov.isFinishing() || abstractActivityC33041mov.isDestroyed()) {
                if (interfaceC25422iwS != null) {
                    interfaceC25422iwS.KWHzl(new java.lang.Exception("host has finished or destroyed"));
                }
                return Unit.INSTANCE;
            }
            c26700jhK.OLrzqt(abstractActivityC33041mov, interfaceC26561jee, false);
            if (interfaceC25422iwS != null) {
                interfaceC25422iwS.OLrzqt();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object redeem$default(C26700jhK c26700jhK, AbstractActivityC33041mov abstractActivityC33041mov, DeFiRedeemParam deFiRedeemParam, InterfaceC25423iwT interfaceC25423iwT, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            interfaceC25423iwT = null;
        }
        return c26700jhK.copydefault(abstractActivityC33041mov, deFiRedeemParam, interfaceC25423iwT, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull DeFiRedeemParam deFiRedeemParam, InterfaceC25423iwT interfaceC25423iwT, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        RedeemExternalHandler$redeem$3 redeemExternalHandler$redeem$3;
        java.lang.Object objKWHzl;
        InterfaceC25423iwT interfaceC25423iwT2;
        C26700jhK c26700jhK;
        java.lang.Object objAYXKKw;
        AbstractActivityC33041mov abstractActivityC33041mov2;
        InterfaceC25423iwT interfaceC25423iwT3;
        InterfaceC26561jee interfaceC26561jee;
        if (continuation instanceof RedeemExternalHandler$redeem$3) {
            redeemExternalHandler$redeem$3 = (RedeemExternalHandler$redeem$3) continuation;
            int i = redeemExternalHandler$redeem$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                redeemExternalHandler$redeem$3.label = i - Integer.MIN_VALUE;
            } else {
                redeemExternalHandler$redeem$3 = new RedeemExternalHandler$redeem$3(this, continuation);
            }
        }
        java.lang.Object obj = redeemExternalHandler$redeem$3.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = redeemExternalHandler$redeem$3.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            iEM iem = this.OLrzqt;
            C23682iFk c23682iFk = new C23682iFk(deFiRedeemParam.EZpvd(), InvestmentKind.Default);
            redeemExternalHandler$redeem$3.L$0 = this;
            redeemExternalHandler$redeem$3.L$1 = abstractActivityC33041mov;
            redeemExternalHandler$redeem$3.L$2 = interfaceC25423iwT;
            redeemExternalHandler$redeem$3.label = 1;
            objKWHzl = iem.KWHzl(c23682iFk, false, redeemExternalHandler$redeem$3);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            interfaceC25423iwT2 = interfaceC25423iwT;
            c26700jhK = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25423iwT3 = (InterfaceC25423iwT) redeemExternalHandler$redeem$3.L$2;
                abstractActivityC33041mov2 = (AbstractActivityC33041mov) redeemExternalHandler$redeem$3.L$1;
                c26700jhK = (C26700jhK) redeemExternalHandler$redeem$3.L$0;
                C56391yDq.AEQbTJ(obj);
                objAYXKKw = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objAYXKKw)) {
                    objAYXKKw = null;
                }
                interfaceC26561jee = (InterfaceC26561jee) objAYXKKw;
                if (interfaceC26561jee != null) {
                    if (abstractActivityC33041mov2.isFinishing() || abstractActivityC33041mov2.isDestroyed()) {
                        return Unit.INSTANCE;
                    }
                    c26700jhK.OLrzqt(abstractActivityC33041mov2, interfaceC26561jee, false);
                }
                if (interfaceC25423iwT3 != null) {
                    interfaceC25423iwT3.copydefault();
                }
                return Unit.INSTANCE;
            }
            InterfaceC25423iwT interfaceC25423iwT4 = (InterfaceC25423iwT) redeemExternalHandler$redeem$3.L$2;
            abstractActivityC33041mov = (AbstractActivityC33041mov) redeemExternalHandler$redeem$3.L$1;
            C26700jhK c26700jhK2 = (C26700jhK) redeemExternalHandler$redeem$3.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
            c26700jhK = c26700jhK2;
            interfaceC25423iwT2 = interfaceC25423iwT4;
        }
        C56391yDq.AEQbTJ(objKWHzl);
        C26548jeR c26548jeR = c26700jhK.KWHzl;
        C25476ixT c25476ixTOLrzqt = C25475ixS.OLrzqt((C23673iFb) objKWHzl);
        redeemExternalHandler$redeem$3.L$0 = c26700jhK;
        redeemExternalHandler$redeem$3.L$1 = abstractActivityC33041mov;
        redeemExternalHandler$redeem$3.L$2 = interfaceC25423iwT2;
        redeemExternalHandler$redeem$3.label = 2;
        objAYXKKw = c26548jeR.AYXKKw(c25476ixTOLrzqt, redeemExternalHandler$redeem$3);
        if (objAYXKKw == objCopydefault) {
            return objCopydefault;
        }
        InterfaceC25423iwT interfaceC25423iwT5 = interfaceC25423iwT2;
        abstractActivityC33041mov2 = abstractActivityC33041mov;
        interfaceC25423iwT3 = interfaceC25423iwT5;
        if (Result.m7383isFailureimpl(objAYXKKw)) {
        }
        interfaceC26561jee = (InterfaceC26561jee) objAYXKKw;
        if (interfaceC26561jee != null) {
        }
        if (interfaceC25423iwT3 != null) {
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC26561jee interfaceC26561jee, boolean z) {
        if (interfaceC26561jee instanceof InterfaceC26561jee.Fragment) {
            AEQbTJ(abstractActivityC33041mov, (InterfaceC26561jee.Fragment) interfaceC26561jee, z);
            return;
        }
        if (interfaceC26561jee instanceof InterfaceC26561jee.Dialog) {
            KWHzl(abstractActivityC33041mov, (InterfaceC26561jee.Dialog) interfaceC26561jee, z);
            return;
        }
        if (interfaceC26561jee instanceof InterfaceC26561jee.ActionBar) {
            InterfaceC26561jee.ActionBar actionBar = (InterfaceC26561jee.ActionBar) interfaceC26561jee;
            if (C26531jeA.copydefault().contains(actionBar.fIwbmz())) {
                AEQbTJ(abstractActivityC33041mov, actionBar);
            } else {
                copydefault(abstractActivityC33041mov, actionBar);
            }
        }
    }

    public final void AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC26561jee.ActionBar actionBar) {
        android.content.Intent intent;
        TransactionConfig transactionConfigKWHzl = KWHzl(actionBar);
        int i = Activity.KWHzl[actionBar.fIwbmz().ordinal()];
        if (i == 1) {
            intent = new android.content.Intent(abstractActivityC33041mov, (java.lang.Class<?>) ActivityC26853jkE.class);
        } else {
            intent = i != 2 ? null : new android.content.Intent(abstractActivityC33041mov, (java.lang.Class<?>) ActivityC26830jji.class);
        }
        if (intent == null) {
            return;
        }
        intent.putExtra("key.trx_config", transactionConfigKWHzl);
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.startActivity(intent);
        }
    }

    public final void AEQbTJ(final AbstractActivityC33041mov abstractActivityC33041mov, final InterfaceC26561jee.Fragment fragment, final boolean z) {
        iTX itxCopydefault = iTX.Companion.copydefault(new java.util.ArrayList<>(fragment.AEQbTJ()), new iTX.Activity() { // from class: o.jhM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.iTX.Activity
            public final void OLrzqt(InvestPositionSelectUIItem investPositionSelectUIItem) {
                C26700jhK.EZpvd(fragment, this, abstractActivityC33041mov, z, investPositionSelectUIItem);
            }
        });
        InterfaceC26561jee interfaceC26561jeeOLrzqt = fragment.OLrzqt();
        InterfaceC26561jee.ActionBar actionBar = interfaceC26561jeeOLrzqt instanceof InterfaceC26561jee.ActionBar ? (InterfaceC26561jee.ActionBar) interfaceC26561jeeOLrzqt : null;
        java.lang.String string = abstractActivityC33041mov.getString((actionBar != null ? actionBar.fIwbmz() : null) == TransactionType.Univ3FarmInvest ? C25493ixk.FragmentManager.zhUgOk : C25493ixk.FragmentManager.GFUIi);
        if (string == null) {
            string = "";
        }
        itxCopydefault.AEQbTJ(string);
        itxCopydefault.show(abstractActivityC33041mov.getSupportFragmentManager(), "javaClass");
    }

    public static final void EZpvd(InterfaceC26561jee.Fragment fragment, C26700jhK c26700jhK, AbstractActivityC33041mov abstractActivityC33041mov, boolean z, InvestPositionSelectUIItem investPositionSelectUIItem) {
        Intrinsics.checkNotNullParameter(investPositionSelectUIItem, "");
        InterfaceC26561jee interfaceC26561jeeOLrzqt = fragment.OLrzqt();
        InterfaceC26561jee.ActionBar actionBar = interfaceC26561jeeOLrzqt instanceof InterfaceC26561jee.ActionBar ? (InterfaceC26561jee.ActionBar) interfaceC26561jeeOLrzqt : null;
        if (actionBar == null) {
            return;
        }
        c26700jhK.OLrzqt(abstractActivityC33041mov, actionBar.OLrzqt((261631 & 1) != 0 ? actionBar.ejfBZ : null, (261631 & 2) != 0 ? actionBar.isConnected : null, (261631 & 4) != 0 ? actionBar.AhwBna : 0L, (261631 & 8) != 0 ? actionBar.valueOf : null, (261631 & 16) != 0 ? actionBar.EZpvd : 0L, (261631 & 32) != 0 ? actionBar.AYXKKw : null, (261631 & 64) != 0 ? actionBar.fJNWhG : investPositionSelectUIItem.getPositionTokenId(), (261631 & 128) != 0 ? actionBar.gEmmrt : false, (261631 & 256) != 0 ? actionBar.fetchVPNInfo : null, (261631 & 512) != 0 ? actionBar.DbNXlk : null, (261631 & 1024) != 0 ? actionBar.values : null, (261631 & 2048) != 0 ? actionBar.OLrzqt : null, (261631 & 4096) != 0 ? actionBar.KWHzl : false, (261631 & 8192) != 0 ? actionBar.fARcdN : null, (261631 & 16384) != 0 ? actionBar.djBIcL : false, (261631 & 32768) != 0 ? actionBar.AEQbTJ : null, (261631 & 65536) != 0 ? actionBar.copydefault : null, (261631 & 131072) != 0 ? actionBar.AkhnZx : null), z);
    }

    public final void KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC26561jee.Dialog dialog, boolean z) {
        iVA.ActionBar actionBar = iVA.Companion;
        java.util.List<InvestOrder> investOrderList = dialog.KWHzl().getInvestOrderList();
        Intrinsics.copydefault(investOrderList, "");
        iVA ivaEZpvd = actionBar.EZpvd((java.util.ArrayList) investOrderList, dialog.EZpvd());
        ivaEZpvd.show(abstractActivityC33041mov.getSupportFragmentManager(), (java.lang.String) null);
        ivaEZpvd.OLrzqt(new StateListAnimator(dialog, this, abstractActivityC33041mov, z));
    }

    /* JADX INFO: renamed from: o.jhK$StateListAnimator */
    public static final class StateListAnimator implements iVF {
        public final /* synthetic */ AbstractActivityC33041mov AEQbTJ;
        public final /* synthetic */ C26700jhK KWHzl;
        public final /* synthetic */ InterfaceC26561jee.Dialog OLrzqt;
        public final /* synthetic */ boolean copydefault;

        public StateListAnimator(InterfaceC26561jee.Dialog dialog, C26700jhK c26700jhK, AbstractActivityC33041mov abstractActivityC33041mov, boolean z) {
            this.OLrzqt = dialog;
            this.KWHzl = c26700jhK;
            this.AEQbTJ = abstractActivityC33041mov;
            this.copydefault = z;
        }

        @Override // o.iVF
        public void AEQbTJ(InvestOrder investOrder) {
            Intrinsics.checkNotNullParameter(investOrder, "");
            InterfaceC26561jee.ActionBar actionBarAEQbTJ = this.OLrzqt.AEQbTJ();
            this.KWHzl.OLrzqt(this.AEQbTJ, actionBarAEQbTJ.OLrzqt((261631 & 1) != 0 ? actionBarAEQbTJ.ejfBZ : null, (261631 & 2) != 0 ? actionBarAEQbTJ.isConnected : null, (261631 & 4) != 0 ? actionBarAEQbTJ.AhwBna : 0L, (261631 & 8) != 0 ? actionBarAEQbTJ.valueOf : null, (261631 & 16) != 0 ? actionBarAEQbTJ.EZpvd : 0L, (261631 & 32) != 0 ? actionBarAEQbTJ.AYXKKw : null, (261631 & 64) != 0 ? actionBarAEQbTJ.fJNWhG : null, (261631 & 128) != 0 ? actionBarAEQbTJ.gEmmrt : false, (261631 & 256) != 0 ? actionBarAEQbTJ.fetchVPNInfo : null, (261631 & 512) != 0 ? actionBarAEQbTJ.DbNXlk : investOrder, (261631 & 1024) != 0 ? actionBarAEQbTJ.values : null, (261631 & 2048) != 0 ? actionBarAEQbTJ.OLrzqt : null, (261631 & 4096) != 0 ? actionBarAEQbTJ.KWHzl : false, (261631 & 8192) != 0 ? actionBarAEQbTJ.fARcdN : null, (261631 & 16384) != 0 ? actionBarAEQbTJ.djBIcL : false, (261631 & 32768) != 0 ? actionBarAEQbTJ.AEQbTJ : null, (261631 & 65536) != 0 ? actionBarAEQbTJ.copydefault : null, (261631 & 131072) != 0 ? actionBarAEQbTJ.AkhnZx : null), this.copydefault);
        }
    }

    public final TransactionConfig KWHzl(InterfaceC26561jee.ActionBar actionBar) {
        long jLongValue;
        long jGEmmrt = actionBar.gEmmrt();
        long jEZpvd = actionBar.EZpvd();
        boolean zAhwBna = actionBar.AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int value = actionBar.djBIcL().getValue();
        int value2 = actionBar.fIwbmz().getValue();
        int value3 = actionBar.values().getValue();
        java.lang.String strIsConnected = actionBar.isConnected();
        java.lang.String strValueOf = actionBar.valueOf();
        if (actionBar.fARcdN() instanceof Supply) {
            jLongValue = ((Supply) actionBar.fARcdN()).EZpvd();
        } else {
            java.lang.Long lFetchVPNInfo = actionBar.fetchVPNInfo();
            jLongValue = lFetchVPNInfo != null ? lFetchVPNInfo.longValue() : 0L;
        }
        InvestOrder investOrderAkhnZx = actionBar.AkhnZx();
        InvestAssetPositionType investAssetPositionTypeKWHzl = actionBar.KWHzl();
        boolean z = actionBar.fARcdN() instanceof Supply;
        return new TransactionConfig(value, value2, jGEmmrt, zAhwBna, jLongValue, jEZpvd, strValueOf, null, arrayList, value3, null, 0L, 0, strIsConnected, investOrderAkhnZx, null, investAssetPositionTypeKWHzl, java.lang.Boolean.valueOf(z), false, false, actionBar.copydefault(), actionBar.OLrzqt(), false, false, actionBar.DbNXlk(), 13408384, null);
    }

    public final void copydefault(AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC26561jee.ActionBar actionBar) {
        TransactionConfig transactionConfigKWHzl = KWHzl(actionBar);
        if (actionBar.AEQbTJ() || transactionConfigKWHzl.AxsJAY()) {
            abstractActivityC33041mov.startActivity(ActivityC26670jgh.Activity.intent$default(ActivityC26670jgh.Companion, abstractActivityC33041mov, transactionConfigKWHzl, 0, 4, null));
        } else {
            EZpvd(abstractActivityC33041mov, actionBar, transactionConfigKWHzl.wlaJM());
        }
    }

    public final void EZpvd(AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC26561jee.ActionBar actionBar, boolean z) {
        if (!z || abstractActivityC33041mov == null) {
            return;
        }
        C27508jwX.AEQbTJ.OLrzqt(abstractActivityC33041mov, actionBar.gEmmrt(), (992 & 4) != 0 ? true : actionBar.AhwBna(), (992 & 8) != 0 ? null : null, (992 & 16) != 0 ? 0L : actionBar.EZpvd(), (992 & 32) != 0 ? null : null, (992 & 64) != 0 ? null : null, (992 & 128) != 0 ? null : java.lang.Integer.valueOf(actionBar.djBIcL().getValue()), (992 & 256) != 0 ? null : null, (992 & 512) != 0 ? null : null);
    }
}
