package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.business.invest_biz.mln.service.DeFiLuaDataService$clearMemoryCache$job$1;
import com.okinc.business.invest_biz.mln.service.DeFiLuaDataService$showDetailShare$1;
import com.okinc.business.invest_biz.mln.service.DeFiLuaDataService$showHistoryActivity$1;
import com.okinc.business.invest_biz.mln.service.DeFiLuaDataService$showPositionAssetsDetails$1;
import com.okinc.business.invest_biz.mln.service.DeFiLuaDataService$showScoreDialog$1;
import com.okinc.business.invest_biz.mln.service.DeFiLuaDataService$showTransactionDetail$1;
import com.okinc.business.invest_biz.mln.service.DeFiLuaDataService$showTvlDialog$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iOv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23936iOv {
    public C23927iOm AEQbTJ;
    public final iOG EZpvd;
    public final CoroutineScope OLrzqt;
    public final FragmentActivity copydefault;

    public C23936iOv(@NotNull FragmentActivity fragmentActivity, @NotNull iOG iog) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(iog, "");
        this.copydefault = fragmentActivity;
        this.EZpvd = iog;
        this.AEQbTJ = new C23927iOm(fragmentActivity);
        this.OLrzqt = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getIO()));
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(this.OLrzqt, null, null, new DeFiLuaDataService$showScoreDialog$1(str, this, str2, null), 3, null);
    }

    public final void AEQbTJ(long j, long j2, int i, int i2) {
        BuildersKt__Builders_commonKt.launch$default(this.OLrzqt, null, null, new DeFiLuaDataService$showHistoryActivity$1(this, j, j2, i, i2, null), 3, null);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(this.OLrzqt, null, null, new DeFiLuaDataService$showTransactionDetail$1(this, str, str2, null), 3, null);
    }

    public final void OLrzqt(long j, @NotNull InvestmentKind investmentKind, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(investmentKind, "");
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(this.OLrzqt, null, null, new DeFiLuaDataService$showPositionAssetsDetails$1(this, j, investmentKind, str, null), 3, null);
    }

    public final void KWHzl(long j, long j2, @NotNull InvestmentKind investmentKind) {
        Intrinsics.checkNotNullParameter(investmentKind, "");
        BuildersKt__Builders_commonKt.launch$default(this.OLrzqt, null, null, new DeFiLuaDataService$showTvlDialog$1(this, j2, investmentKind, null), 3, null);
    }

    public final void AEQbTJ(FragmentActivity fragmentActivity, @NotNull ProductDetailsByChain productDetailsByChain) {
        Intrinsics.checkNotNullParameter(productDetailsByChain, "");
        if (fragmentActivity != null) {
            C26491jdN c26491jdNEZpvd = C26491jdN.Companion.EZpvd(productDetailsByChain, this.AEQbTJ);
            androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c26491jdNEZpvd.show(supportFragmentManager);
        }
    }

    public final void copydefault(@NotNull android.app.Activity activity, long j, long j2, @NotNull InvestmentKind investmentKind) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(investmentKind, "");
        BuildersKt__Builders_commonKt.launch$default(this.OLrzqt, null, null, new DeFiLuaDataService$showDetailShare$1(this, j2, investmentKind, activity, null), 3, null);
    }

    public final java.lang.Object AEQbTJ(long j, @NotNull Continuation<? super Unit> continuation) {
        if (!CoroutineScopeKt.isActive(this.OLrzqt)) {
            return Unit.INSTANCE;
        }
        java.lang.Object objJoin = BuildersKt__Builders_commonKt.launch$default(this.OLrzqt, null, null, new DeFiLuaDataService$clearMemoryCache$job$1(this, j, null), 3, null).join(continuation);
        return objJoin == C56442yFn.copydefault() ? objJoin : Unit.INSTANCE;
    }
}
