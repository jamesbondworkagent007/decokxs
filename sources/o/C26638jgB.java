package o;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.invest_biz.data.bean.InvestAssetPositionType;
import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.contants.TransactionType;
import com.okinc.business.invest_biz.ui.bean.InvestPositionSelectUIItem;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.Supply;
import com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestHandler$invest$2;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC26670jgh;
import o.C24108iVe;
import o.C25493ixk;
import o.InterfaceC26561jee;
import o.iTU;
import o.iTX;
import o.iTY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jgB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C26638jgB {
    public iTU.Application KWHzl;
    public final C26549jeS OLrzqt;

    /* JADX INFO: renamed from: o.jgB$StateListAnimator */
    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.Univ3FarmInvest.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.Univ3Invest.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TransactionType.Univ3Redeem.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[TransactionType.Univ3FarmRedeem.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            KWHzl = iArr;
        }
    }

    @yCM
    public C26638jgB(@NotNull C26549jeS c26549jeS) {
        Intrinsics.checkNotNullParameter(c26549jeS, "");
        this.OLrzqt = c26549jeS;
    }

    public final java.lang.Object AEQbTJ(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull C25476ixT c25476ixT, InterfaceC25422iwS interfaceC25422iwS, @NotNull Continuation<? super Unit> continuation) {
        C27493jwI.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new InvestHandler$invest$2(this, c25476ixT, abstractActivityC33041mov, interfaceC25422iwS, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC26561jee interfaceC26561jee, boolean z) throws java.io.UnsupportedEncodingException {
        if (interfaceC26561jee instanceof InterfaceC26561jee.FragmentManager) {
            OLrzqt(abstractActivityC33041mov, (InterfaceC26561jee.FragmentManager) interfaceC26561jee, z);
            return;
        }
        if (interfaceC26561jee instanceof InterfaceC26561jee.Fragment) {
            copydefault(abstractActivityC33041mov, (InterfaceC26561jee.Fragment) interfaceC26561jee, z);
            return;
        }
        if (interfaceC26561jee instanceof InterfaceC26561jee.PendingIntent) {
            OLrzqt(abstractActivityC33041mov, ((InterfaceC26561jee.PendingIntent) interfaceC26561jee).OLrzqt());
            return;
        }
        if (interfaceC26561jee instanceof InterfaceC26561jee.ActionBar) {
            InterfaceC26561jee.ActionBar actionBar = (InterfaceC26561jee.ActionBar) interfaceC26561jee;
            if (C26639jgC.EZpvd().contains(actionBar.fIwbmz())) {
                AEQbTJ(abstractActivityC33041mov, actionBar);
                return;
            } else {
                KWHzl(abstractActivityC33041mov, actionBar);
                return;
            }
        }
        if (interfaceC26561jee instanceof InterfaceC26561jee.Application) {
            InterfaceC26561jee.Application application = (InterfaceC26561jee.Application) interfaceC26561jee;
            OLrzqt(abstractActivityC33041mov, application.KWHzl(), application.EZpvd());
        } else if (interfaceC26561jee instanceof InterfaceC26561jee.StateListAnimator) {
            KWHzl(abstractActivityC33041mov, (InterfaceC26561jee.StateListAnimator) interfaceC26561jee);
        }
    }

    public final void copydefault(final AbstractActivityC33041mov abstractActivityC33041mov, final InterfaceC26561jee.Fragment fragment, final boolean z) {
        iTX itxCopydefault = iTX.Companion.copydefault(new java.util.ArrayList<>(fragment.AEQbTJ()), new iTX.Activity() { // from class: o.jgF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.iTX.Activity
            public final void OLrzqt(InvestPositionSelectUIItem investPositionSelectUIItem) throws java.io.UnsupportedEncodingException {
                C26638jgB.KWHzl(fragment, this, abstractActivityC33041mov, z, investPositionSelectUIItem);
            }
        });
        InterfaceC26561jee interfaceC26561jeeOLrzqt = fragment.OLrzqt();
        InterfaceC26561jee.ActionBar actionBar = interfaceC26561jeeOLrzqt instanceof InterfaceC26561jee.ActionBar ? (InterfaceC26561jee.ActionBar) interfaceC26561jeeOLrzqt : null;
        java.lang.String string = abstractActivityC33041mov.getString((actionBar != null ? actionBar.fIwbmz() : null) == TransactionType.Univ3FarmInvest ? C25493ixk.FragmentManager.zhUgOk : C25493ixk.FragmentManager.GFUIi);
        Intrinsics.checkNotNullExpressionValue(string, "");
        itxCopydefault.AEQbTJ(string);
        itxCopydefault.show(abstractActivityC33041mov.getSupportFragmentManager(), "javaClass");
    }

    public static final void KWHzl(InterfaceC26561jee.Fragment fragment, C26638jgB c26638jgB, AbstractActivityC33041mov abstractActivityC33041mov, boolean z, InvestPositionSelectUIItem investPositionSelectUIItem) throws java.io.UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(investPositionSelectUIItem, "");
        InterfaceC26561jee interfaceC26561jeeOLrzqt = fragment.OLrzqt();
        InterfaceC26561jee.ActionBar actionBar = interfaceC26561jeeOLrzqt instanceof InterfaceC26561jee.ActionBar ? (InterfaceC26561jee.ActionBar) interfaceC26561jeeOLrzqt : null;
        if (actionBar == null) {
            return;
        }
        c26638jgB.AEQbTJ(abstractActivityC33041mov, actionBar.OLrzqt((261631 & 1) != 0 ? actionBar.ejfBZ : null, (261631 & 2) != 0 ? actionBar.isConnected : null, (261631 & 4) != 0 ? actionBar.AhwBna : 0L, (261631 & 8) != 0 ? actionBar.valueOf : null, (261631 & 16) != 0 ? actionBar.EZpvd : 0L, (261631 & 32) != 0 ? actionBar.AYXKKw : null, (261631 & 64) != 0 ? actionBar.fJNWhG : investPositionSelectUIItem.getPositionTokenId(), (261631 & 128) != 0 ? actionBar.gEmmrt : false, (261631 & 256) != 0 ? actionBar.fetchVPNInfo : null, (261631 & 512) != 0 ? actionBar.DbNXlk : null, (261631 & 1024) != 0 ? actionBar.values : null, (261631 & 2048) != 0 ? actionBar.OLrzqt : null, (261631 & 4096) != 0 ? actionBar.KWHzl : false, (261631 & 8192) != 0 ? actionBar.fARcdN : null, (261631 & 16384) != 0 ? actionBar.djBIcL : false, (261631 & 32768) != 0 ? actionBar.AEQbTJ : null, (261631 & 65536) != 0 ? actionBar.copydefault : null, (261631 & 131072) != 0 ? actionBar.AkhnZx : null), z);
    }

    public final void OLrzqt(final AbstractActivityC33041mov abstractActivityC33041mov, final InterfaceC26561jee.FragmentManager fragmentManager, final boolean z) {
        C24108iVe.Companion.AEQbTJ(new C24108iVe.Application() { // from class: o.jgE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C24108iVe.Application
            public final void copydefault() throws java.io.UnsupportedEncodingException {
                C26638jgB.AEQbTJ(this.OLrzqt, abstractActivityC33041mov, fragmentManager, z);
            }
        }).show(abstractActivityC33041mov.getSupportFragmentManager(), "javaClass");
    }

    public static final void AEQbTJ(C26638jgB c26638jgB, AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC26561jee.FragmentManager fragmentManager, boolean z) throws java.io.UnsupportedEncodingException {
        c26638jgB.AEQbTJ(abstractActivityC33041mov, fragmentManager.copydefault(), z);
    }

    public final void OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov, InvestTipInfoVo investTipInfoVo) throws java.io.UnsupportedEncodingException {
        C27569jxf.OLrzqt.KWHzl(abstractActivityC33041mov, abstractActivityC33041mov.getSupportFragmentManager(), investTipInfoVo, (Function0<Unit>) ((24 & 8) != 0 ? null : null), (Function1<? super java.lang.String, Unit>) ((24 & 16) != 0 ? null : null));
    }

    public final void OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov, ProductDetailsUserTradeAction productDetailsUserTradeAction, java.lang.Long l) {
        iTU.Companion.OLrzqt(productDetailsUserTradeAction, l, this.KWHzl).show(abstractActivityC33041mov.getSupportFragmentManager(), iTU.class.getName());
    }

    public final void KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC26561jee.StateListAnimator stateListAnimator) {
        iTY.ActionBar.newInstance$default(iTY.Companion, stateListAnimator.EZpvd(), stateListAnimator.OLrzqt(), stateListAnimator.AEQbTJ(), stateListAnimator.KWHzl(), null, 16, null).show(abstractActivityC33041mov.getSupportFragmentManager(), iTY.class.getSimpleName());
    }

    public final void KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC26561jee.ActionBar actionBar) {
        TransactionConfig transactionConfigOLrzqt = OLrzqt(actionBar);
        if (!actionBar.AEQbTJ() && !transactionConfigOLrzqt.AxsJAY()) {
            EZpvd(abstractActivityC33041mov, actionBar, transactionConfigOLrzqt.wlaJM());
        } else if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.startActivity(ActivityC26670jgh.Activity.intent$default(ActivityC26670jgh.Companion, abstractActivityC33041mov, transactionConfigOLrzqt, 0, 4, null));
        }
    }

    public final void EZpvd(AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC26561jee.ActionBar actionBar, boolean z) {
        if (z) {
            C27508jwX.AEQbTJ.OLrzqt(abstractActivityC33041mov, actionBar.gEmmrt(), (992 & 4) != 0 ? true : actionBar.AhwBna(), (992 & 8) != 0 ? null : null, (992 & 16) != 0 ? 0L : actionBar.EZpvd(), (992 & 32) != 0 ? null : null, (992 & 64) != 0 ? null : "", (992 & 128) != 0 ? null : java.lang.Integer.valueOf(actionBar.djBIcL().getValue()), (992 & 256) != 0 ? null : null, (992 & 512) != 0 ? null : null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC26561jee.ActionBar actionBar) {
        android.content.Intent intent;
        TransactionConfig transactionConfigOLrzqt = OLrzqt(actionBar);
        int i = StateListAnimator.KWHzl[actionBar.fIwbmz().ordinal()];
        if (i == 1) {
            intent = new android.content.Intent(abstractActivityC33041mov, (java.lang.Class<?>) ActivityC26816jjU.class);
        } else if (i == 2) {
            intent = new android.content.Intent(abstractActivityC33041mov, (java.lang.Class<?>) InvestUniv3SubscribeActivity.class);
        } else if (i != 3) {
            intent = i != 4 ? null : new android.content.Intent(abstractActivityC33041mov, (java.lang.Class<?>) ActivityC26830jji.class);
        } else if (abstractActivityC33041mov != null) {
            intent = C27508jwX.AEQbTJ.KWHzl(abstractActivityC33041mov, transactionConfigOLrzqt);
        }
        if (intent == null) {
            return;
        }
        intent.putExtra("key.trx_config", transactionConfigOLrzqt);
        abstractActivityC33041mov.startActivity(intent);
    }

    public final TransactionConfig OLrzqt(InterfaceC26561jee.ActionBar actionBar) {
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
        return new TransactionConfig(value, value2, jGEmmrt, zAhwBna, jLongValue, jEZpvd, strValueOf, "", arrayList, value3, null, 0L, 0, strIsConnected, investOrderAkhnZx, null, investAssetPositionTypeKWHzl, java.lang.Boolean.valueOf(z), false, false, actionBar.copydefault(), actionBar.OLrzqt(), false, false, actionBar.DbNXlk(), 13408256, null);
    }
}
