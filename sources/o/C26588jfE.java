package o;

import com.okinc.business.invest_biz.data.bean.InvestDetailPagePromptInformation;
import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import com.okinc.business.invest_biz.data.contants.ProductType;
import com.okinc.business.invest_biz.data.contants.ProtocolType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction;
import com.okinc.business.invest_biz.ui.screens.token.InvestFlowManager$executeInvestFlow$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C25493ixk;
import o.C52761wXj;
import o.InterfaceC54855xXv;
import o.iTU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jfE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26588jfE implements iTU.Application {
    public final InterfaceC56387yDm AEQbTJ;
    public final Activity AYXKKw;
    public Function0<Unit> AhwBna;
    public TokenInvestDetail EZpvd;
    public final InterfaceC25466ixJ KWHzl;
    public long OLrzqt;
    public Function1<? super TransactionConfig, Unit> copydefault;
    public InvestPageSource djBIcL;
    public final C27117jpD fetchVPNInfo;
    public boolean gEmmrt;
    public final C25491ixi valueOf;
    public final InterfaceC56387yDm values;

    public C26588jfE(@NotNull C27117jpD c27117jpD, @NotNull InterfaceC25466ixJ interfaceC25466ixJ) {
        Intrinsics.checkNotNullParameter(c27117jpD, "");
        Intrinsics.checkNotNullParameter(interfaceC25466ixJ, "");
        this.fetchVPNInfo = c27117jpD;
        this.KWHzl = interfaceC25466ixJ;
        this.valueOf = C25491ixi.copydefault;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.jfI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26588jfE.AYXKKw(this.AEQbTJ);
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.jfM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26588jfE.valueOf(this.OLrzqt);
            }
        });
        this.EZpvd = new TokenInvestDetail(0L, 0L, (ProductType) null, (ProtocolType) null, (InvestDetailPagePromptInformation) null, 31, (DefaultConstructorMarker) null);
        this.djBIcL = InvestPageSource.Default;
        this.AYXKKw = new Activity();
    }

    public final C26593jfJ OLrzqt() {
        return (C26593jfJ) this.AEQbTJ.getValue();
    }

    public static final C26593jfJ AYXKKw(C26588jfE c26588jfE) {
        return new C26593jfJ(c26588jfE.KWHzl, null, 2, 0 == true ? 1 : 0);
    }

    public final C26534jeD EZpvd() {
        return (C26534jeD) this.values.getValue();
    }

    public static final C26534jeD valueOf(C26588jfE c26588jfE) {
        return new C26534jeD(c26588jfE.KWHzl, c26588jfE.valueOf);
    }

    /* JADX INFO: renamed from: o.jfE$Activity */
    public static final class Activity implements InterfaceC54855xXv {
        @Override // o.InterfaceC54855xXv
        public void copydefault() {
        }

        public Activity() {
        }

        @Override // o.InterfaceC54855xXv
        public void AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, interfaceC9738bbJ);
        }

        @Override // o.InterfaceC54855xXv
        public void OLrzqt(long j) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, j);
        }

        @Override // o.InterfaceC54855xXv
        public void KWHzl(InterfaceC9738bbJ interfaceC9738bbJ, long j) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            C26588jfE.this.KWHzl();
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            C26588jfE.this.KWHzl();
        }
    }

    public final void copydefault(long j, @NotNull TokenInvestDetail tokenInvestDetail, boolean z, @NotNull InvestPageSource investPageSource, Function1<? super TransactionConfig, Unit> function1, Function0<Unit> function0, boolean z2) {
        CoroutineScope coroutineScopeKWHzl;
        Intrinsics.checkNotNullParameter(tokenInvestDetail, "");
        Intrinsics.checkNotNullParameter(investPageSource, "");
        this.OLrzqt = j;
        this.EZpvd = tokenInvestDetail;
        this.gEmmrt = z;
        this.djBIcL = investPageSource;
        this.copydefault = function1;
        this.AhwBna = function0;
        OLrzqt().KWHzl(this);
        InterfaceC25466ixJ interfaceC25466ixJ = this.KWHzl;
        if (interfaceC25466ixJ == null || (coroutineScopeKWHzl = interfaceC25466ixJ.KWHzl()) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScopeKWHzl, null, null, new InvestFlowManager$executeInvestFlow$1(this, j, tokenInvestDetail, z, investPageSource, function0, function1, z2, null), 3, null);
    }

    public final void KWHzl() {
        InterfaceC25466ixJ interfaceC25466ixJ = this.KWHzl;
        if ((interfaceC25466ixJ != null ? interfaceC25466ixJ.AEQbTJ() : null) == null) {
            return;
        }
        AEQbTJ();
        C7323ahf.KWHzl().AEQbTJ("MAIN_WALLET_CHANGED", null, null);
    }

    public final void AEQbTJ() {
        android.content.Context contextAEQbTJ;
        InterfaceC25466ixJ interfaceC25466ixJ = this.KWHzl;
        if (interfaceC25466ixJ == null || (contextAEQbTJ = interfaceC25466ixJ.AEQbTJ()) == null) {
            return;
        }
        C55097xdX c55097xdX = new C55097xdX(contextAEQbTJ, null, 0, 6, null);
        java.lang.String string = contextAEQbTJ.getString(C25493ixk.FragmentManager.HJWChPOKBmQN);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55097xdX.setTitle(string);
        c55097xdX.setState(4);
        android.widget.ImageView imageViewAEQbTJ = c55097xdX.AEQbTJ();
        imageViewAEQbTJ.setVisibility(0);
        imageViewAEQbTJ.setBackground(C33070mpX.KWHzl(C52761wXj.TaskDescription.fdt));
        imageViewAEQbTJ.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.onReceive)));
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 0L, 0, 0, 0, 30, null);
    }

    @Override // o.iTU.Application
    public void copydefault(ProductDetailsUserTradeAction productDetailsUserTradeAction, java.lang.Long l) {
        copydefault(this.OLrzqt, this.EZpvd, this.gEmmrt, this.djBIcL, this.copydefault, this.AhwBna, true);
    }
}
