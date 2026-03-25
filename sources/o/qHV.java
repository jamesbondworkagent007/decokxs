package o;

import android.text.TextUtils;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.market.common.biz_spot.bean.DefiWebCoins;
import com.okinc.market.search.features.main.entry.ui.model.SearchRecommendVo;
import com.okinc.market.search.features.main.recommend.history.data.model.Product;
import com.okinc.market.search.features.main.result.ui.SubPage;
import com.okinc.market.search.features.main.root.data.po.P2pAndDeposit;
import com.okinc.market.search.features.main.root.data.po.P2pAndDepositHistory;
import com.okinc.market.search.features.main.root.data.po.SearchTrader;
import com.okinc.market.search.features.main.root.data.po.TradingStrategy;
import com.okinc.market.search.features.main.root.ui.MainSearchV2Fragment$listenSearchResult$1;
import com.okinc.market.search.features.main.root.ui.MainSearchV2Fragment$listenWatchingOptMsg$1;
import com.okinc.market.search.features.main.root.ui.MainSearchV2Fragment$setListener$$inlined$repeatOnLifecycleResume$1;
import com.okinc.market.search.features.main.root.ui.viewmodel.MainSearchViewModel;
import com.okinc.rxutils.RxBus;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.uilab.edit.OKEditText;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.AbstractC58185ywX;
import o.C40375qTn;
import o.C52761wXj;
import o.InterfaceC49363unD;
import o.InterfaceC49371unL;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.qHV;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class qHV extends qHI implements InterfaceC49363unD, qHR, qHM, qHP, qHN {
    public static final Activity Companion = new Activity(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public C42831rdo fetchVPNInfo;
    public Job values;
    public final /* synthetic */ C40040qHc AhwBna = new C40040qHc();
    public final /* synthetic */ qGZ gEmmrt = new qGZ();
    public final /* synthetic */ C40046qHi AYXKKw = new C40046qHi();
    public final /* synthetic */ C40048qHk djBIcL = new C40048qHk();
    public final int isConnected = qZH.ActionBar.invokespecialaKhcqp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ() {
        this.AhwBna.KWHzl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void AEQbTJ(int i) {
        this.djBIcL.AEQbTJ(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void AEQbTJ(@NotNull DefiWebCoins defiWebCoins) {
        Intrinsics.checkNotNullParameter(defiWebCoins, "");
        this.djBIcL.AEQbTJ(defiWebCoins);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHM
    public void AEQbTJ(@NotNull P2pAndDeposit p2pAndDeposit, int i) {
        Intrinsics.checkNotNullParameter(p2pAndDeposit, "");
        this.AhwBna.AEQbTJ(p2pAndDeposit, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void AEQbTJ(@NotNull TradingStrategy tradingStrategy, int i) {
        Intrinsics.checkNotNullParameter(tradingStrategy, "");
        this.djBIcL.AEQbTJ(tradingStrategy, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void AEQbTJ(@NotNull BizInstrument bizInstrument, boolean z) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        this.djBIcL.AEQbTJ(bizInstrument, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.djBIcL.AEQbTJ(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHM
    public void AEQbTJ(@NotNull C39991qFh c39991qFh, int i) {
        Intrinsics.checkNotNullParameter(c39991qFh, "");
        this.AhwBna.AEQbTJ(c39991qFh, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHM
    public void AEQbTJ(@NotNull C39992qFi c39992qFi, int i) {
        Intrinsics.checkNotNullParameter(c39992qFi, "");
        this.AhwBna.AEQbTJ(c39992qFi, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void AEQbTJ(@NotNull qID qid) {
        Intrinsics.checkNotNullParameter(qid, "");
        this.djBIcL.AEQbTJ(qid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void AEQbTJ(boolean z) {
        this.djBIcL.AEQbTJ(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHP
    public boolean AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return this.AYXKKw.AEQbTJ(fragment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void AYXKKw() {
        this.djBIcL.AYXKKw();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AYXKKw(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.AhwBna.OLrzqt(fragment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void AhwBna() {
        this.djBIcL.AhwBna();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void AkhnZx() {
        this.djBIcL.AkhnZx();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void DbNXlk() {
        this.djBIcL.DbNXlk();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHM
    public void EZpvd(@NotNull DefiWebCoins defiWebCoins, int i) {
        Intrinsics.checkNotNullParameter(defiWebCoins, "");
        this.AhwBna.EZpvd(defiWebCoins, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void EZpvd(SearchRecommendVo searchRecommendVo) {
        this.djBIcL.EZpvd(searchRecommendVo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void EZpvd(@NotNull SearchTrader searchTrader) {
        Intrinsics.checkNotNullParameter(searchTrader, "");
        this.djBIcL.EZpvd(searchTrader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void EZpvd(@NotNull BizInstrument bizInstrument, int i) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        this.djBIcL.EZpvd(bizInstrument, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL.EZpvd(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.djBIcL.EZpvd(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void EZpvd(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.djBIcL.EZpvd(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void EZpvd(@NotNull C39991qFh c39991qFh, int i) {
        Intrinsics.checkNotNullParameter(c39991qFh, "");
        this.djBIcL.EZpvd(c39991qFh, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHM
    public void EZpvd(@NotNull C39993qFj c39993qFj, int i) {
        Intrinsics.checkNotNullParameter(c39993qFj, "");
        this.AhwBna.EZpvd(c39993qFj, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHM
    public void EZpvd(@NotNull C39997qFn c39997qFn, int i) {
        Intrinsics.checkNotNullParameter(c39997qFn, "");
        this.AhwBna.EZpvd(c39997qFn, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHP
    public boolean EZpvd(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return this.AYXKKw.EZpvd(fragment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHP
    public java.lang.String KWHzl(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return this.AYXKKw.KWHzl(fragment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void KWHzl(@NotNull P2pAndDeposit p2pAndDeposit, boolean z) {
        Intrinsics.checkNotNullParameter(p2pAndDeposit, "");
        this.djBIcL.KWHzl(p2pAndDeposit, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void KWHzl(@NotNull P2pAndDepositHistory p2pAndDepositHistory) {
        Intrinsics.checkNotNullParameter(p2pAndDepositHistory, "");
        this.djBIcL.KWHzl(p2pAndDepositHistory);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHM
    public void KWHzl(@NotNull TradingStrategy tradingStrategy, int i) {
        Intrinsics.checkNotNullParameter(tradingStrategy, "");
        this.AhwBna.KWHzl(tradingStrategy, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void KWHzl(@NotNull BizInstrument bizInstrument, int i, SubPage subPage, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        this.djBIcL.KWHzl(bizInstrument, i, subPage, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL.KWHzl(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void KWHzl(java.lang.String str, java.lang.String str2, int i, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        this.djBIcL.KWHzl(str, str2, i, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void KWHzl(@NotNull C39997qFn c39997qFn, int i) {
        Intrinsics.checkNotNullParameter(c39997qFn, "");
        this.djBIcL.KWHzl(c39997qFn, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void KWHzl(@NotNull C40004qFu c40004qFu, int i) {
        Intrinsics.checkNotNullParameter(c40004qFu, "");
        this.djBIcL.KWHzl(c40004qFu, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHP
    public SubPage OLrzqt(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return this.AYXKKw.OLrzqt(fragment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHM
    public void OLrzqt(@NotNull Product product, int i) {
        Intrinsics.checkNotNullParameter(product, "");
        this.AhwBna.OLrzqt(product, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHM
    public void OLrzqt(@NotNull P2pAndDeposit p2pAndDeposit, int i) {
        Intrinsics.checkNotNullParameter(p2pAndDeposit, "");
        this.AhwBna.OLrzqt(p2pAndDeposit, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void OLrzqt(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        this.djBIcL.OLrzqt(bizInstrument);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHM
    public void OLrzqt(@NotNull BizInstrument bizInstrument, int i, SubPage subPage, java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        this.AhwBna.OLrzqt(bizInstrument, i, subPage, str, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void OLrzqt(@NotNull BizInstrument bizInstrument, @NotNull SubPage subPage, int i) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(subPage, "");
        this.djBIcL.OLrzqt(bizInstrument, subPage, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void OLrzqt(java.lang.String str) {
        this.djBIcL.OLrzqt(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt(@NotNull android.app.Activity activity, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        return this.gEmmrt.copydefault(activity, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void a_(@NotNull DefiWebCoins defiWebCoins, int i) {
        Intrinsics.checkNotNullParameter(defiWebCoins, "");
        this.djBIcL.a_(defiWebCoins, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void a_(@NotNull SearchTrader searchTrader, int i) {
        Intrinsics.checkNotNullParameter(searchTrader, "");
        this.djBIcL.a_(searchTrader, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHP
    public java.lang.String copydefault(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return this.AYXKKw.copydefault(fragment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void copydefault(int i, @NotNull SubPage subPage) {
        Intrinsics.checkNotNullParameter(subPage, "");
        this.djBIcL.copydefault(i, subPage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void copydefault(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "");
        this.djBIcL.copydefault(product);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void copydefault(@NotNull Product product, int i) {
        Intrinsics.checkNotNullParameter(product, "");
        this.djBIcL.copydefault(product, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHP
    public void copydefault(SubPage subPage) {
        this.AYXKKw.copydefault(subPage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void copydefault(@NotNull P2pAndDepositHistory p2pAndDepositHistory) {
        Intrinsics.checkNotNullParameter(p2pAndDepositHistory, "");
        this.djBIcL.copydefault(p2pAndDepositHistory);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHM
    public void copydefault(@NotNull SearchTrader searchTrader, int i) {
        Intrinsics.checkNotNullParameter(searchTrader, "");
        this.AhwBna.copydefault(searchTrader, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void copydefault(@NotNull TradingStrategy tradingStrategy) {
        Intrinsics.checkNotNullParameter(tradingStrategy, "");
        this.djBIcL.copydefault(tradingStrategy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void copydefault(@NotNull BizInstrument bizInstrument, int i) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        this.djBIcL.copydefault(bizInstrument, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHM
    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna.copydefault(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHM
    public void copydefault(@NotNull C40004qFu c40004qFu, int i, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c40004qFu, "");
        this.AhwBna.copydefault(c40004qFu, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void copydefault(@NotNull C40081qIq c40081qIq, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(c40081qIq, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL.copydefault(c40081qIq, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void djBIcL(java.lang.String str) {
        this.djBIcL.djBIcL(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void fIwbmz() {
        this.djBIcL.fIwbmz();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void fetchVPNInfo() {
        this.djBIcL.fetchVPNInfo();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void gEmmrt() {
        this.djBIcL.gEmmrt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void isConnected() {
        this.djBIcL.isConnected();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void m_(java.lang.String str) {
        this.djBIcL.m_(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHN
    public void values() {
        this.djBIcL.values();
    }

    public <T extends InterfaceC49369unJ<T>, A> Flow<A> OLrzqt(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, state, function2);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, state, function2);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C, D> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, state, yhs);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, state, yhq);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, state, yhr);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, state, function2);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, state, function2);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C, D> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, state, yhs);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, state, yhq);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, state, yhr);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>> java.lang.Object onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Flow<? extends T>> continuation) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, state, function2, continuation);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A> Flow<A> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, state, function2);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B> Flow<kotlin.Pair<A, B>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C> Flow<Triple<A, B, C>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C, D> Flow<Quartet<A, B, C, D>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, state, yhs);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Flow<Quintet<A, B, C, D, E>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, state, yhq);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Flow<Sextet<A, B, C, D, E, F>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, state, yhr);
    }

    @Override // o.InterfaceC49362unC
    public <T extends InterfaceC49369unJ<T>> Flow<T> uiStateFlow(@NotNull AbstractC49411unz<T> abstractC49411unz) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz);
    }

    public qHV() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.market.search.features.main.root.ui.MainSearchV2Fragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.search.features.main.root.ui.MainSearchV2Fragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MainSearchViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.search.features.main.root.ui.MainSearchV2Fragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.search.features.main.root.ui.MainSearchV2Fragment$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.search.features.main.root.ui.MainSearchV2Fragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.qHY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qHV.AEQbTJ(this.EZpvd);
            }
        });
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qHV.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final qHV AEQbTJ(SearchRecommendVo searchRecommendVo, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            qHV qhv = new qHV();
            qhv.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("data", searchRecommendVo), C56390yDp.OLrzqt("from", str)));
            return qhv;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MainSearchViewModel AuCTel() {
        return (MainSearchViewModel) this.DbNXlk.getValue();
    }

    public final SearchRecommendVo valueOf() {
        return (SearchRecommendVo) this.AkhnZx.getValue();
    }

    public static final SearchRecommendVo AEQbTJ(qHV qhv) {
        android.os.Bundle arguments = qhv.getArguments();
        if (arguments != null) {
            return (SearchRecommendVo) arguments.getParcelable("data");
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(view, "");
        C42831rdo c42831rdoOLrzqt = C42831rdo.OLrzqt(view);
        C55230xfy c55230xfy = c42831rdoOLrzqt.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55230xfy, "");
        copydefault(c55230xfy);
        android.widget.TextView textView = c42831rdoOLrzqt.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        AEQbTJ(textView);
        this.fetchVPNInfo = c42831rdoOLrzqt;
        jSA.OLrzqt(this, true);
        qHN qhnCopydefault = qHO.copydefault(this);
        final Function0 function0 = null;
        if (qhnCopydefault != null) {
            final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.market.search.features.main.root.ui.MainSearchV2Fragment$initView$$inlined$viewModels$default$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Fragment invoke() {
                    return this;
                }
            };
            final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.search.features.main.root.ui.MainSearchV2Fragment$initView$$inlined$viewModels$default$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelStoreOwner invoke() {
                    return (ViewModelStoreOwner) function02.invoke();
                }
            });
            C40081qIq c40081qIq = (C40081qIq) FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C40081qIq.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.search.features.main.root.ui.MainSearchV2Fragment$initView$$inlined$viewModels$default$3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelStore invoke() {
                    ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                    Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                    return viewModelStore;
                }
            }, new Function0<CreationExtras>() { // from class: com.okinc.market.search.features.main.root.ui.MainSearchV2Fragment$initView$$inlined$viewModels$default$4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final CreationExtras invoke() {
                    CreationExtras creationExtras;
                    Function0 function03 = function0;
                    if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                        return creationExtras;
                    }
                    ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                    HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                    CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                    return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
                }
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.search.features.main.root.ui.MainSearchV2Fragment$initView$$inlined$viewModels$default$5
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelProvider.Factory invoke() {
                    ViewModelProvider.Factory defaultViewModelProviderFactory;
                    ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                    HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                    if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                        defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                    }
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                    return defaultViewModelProviderFactory;
                }
            }).getValue();
            android.os.Bundle arguments = getArguments();
            if (arguments != null && (string = arguments.getString("from")) != null) {
                str = string;
            }
            qhnCopydefault.copydefault(c40081qIq, str, true);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.qHI, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        AYXKKw(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        AEQbTJ();
    }

    private final void copydefault(C55230xfy c55230xfy) {
        java.lang.CharSequence charSequenceKWHzl;
        final OKEditText oKEditTextKWHzl = c55230xfy.KWHzl();
        oKEditTextKWHzl.setInputType(1);
        oKEditTextKWHzl.setImeOptions(3);
        oKEditTextKWHzl.setSingleLine(true);
        oKEditTextKWHzl.setEllipsize(TextUtils.TruncateAt.END);
        oKEditTextKWHzl.setImeActionLabel(C33070mpX.AYXKKw(qZH.PendingIntent.zuBGHE), 3);
        oKEditTextKWHzl.setContentDescription("discoverTopSearchBar");
        qHP qhpAEQbTJ = qHQ.AEQbTJ(this);
        if (qhpAEQbTJ != null && qhpAEQbTJ.AEQbTJ(this)) {
            charSequenceKWHzl = C33070mpX.AYXKKw(qZH.PendingIntent.QKudOq);
        } else if (valueOf() == null) {
            charSequenceKWHzl = C33070mpX.AYXKKw(qZH.PendingIntent.RZMhtF);
        } else {
            charSequenceKWHzl = C39903qCa.KWHzl(valueOf());
        }
        oKEditTextKWHzl.setHint(charSequenceKWHzl);
        c55230xfy.setClearCallback(new Function0() { // from class: o.qHU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qHV.KWHzl(oKEditTextKWHzl, this);
            }
        });
        oKEditTextKWHzl.setOnKeyListener(new View.OnKeyListener() { // from class: o.qHS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
                return qHV.AEQbTJ(oKEditTextKWHzl, this, view, i, keyEvent);
            }
        });
        oKEditTextKWHzl.requestFocus();
        C33054mpH.EZpvd(this);
        final android.widget.TextView textViewCopydefault = c55230xfy.copydefault();
        C40375qTn.AEQbTJ.copydefault(getTAG(), "cancel clicked");
        textViewCopydefault.setText(qZH.PendingIntent.QVAiDq);
        textViewCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.qHT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                qHV.KWHzl(textViewCopydefault, this, view);
            }
        });
    }

    public static final Unit KWHzl(OKEditText oKEditText, qHV qhv) {
        oKEditText.requestFocus();
        C33054mpH.EZpvd(qhv);
        qHN qhnOLrzqt = qHO.OLrzqt(oKEditText);
        if (qhnOLrzqt != null) {
            qhnOLrzqt.DbNXlk();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.market.search.features.main.root.ui.viewmodel.MainSearchViewModel.search$OKMarket_market_impl$default(com.okinc.market.search.features.main.root.ui.viewmodel.MainSearchViewModel, java.lang.String, boolean, int, java.lang.Object):void */
    public static final boolean AEQbTJ(OKEditText oKEditText, qHV qhv, android.view.View view, int i, android.view.KeyEvent keyEvent) {
        java.lang.String ccy;
        if (i != 66 || keyEvent.getAction() != 0) {
            return false;
        }
        android.text.Editable text = oKEditText.getText();
        if (text == null || text.length() == 0) {
            SearchRecommendVo searchRecommendVoValueOf = qhv.valueOf();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (searchRecommendVoValueOf != null ? searchRecommendVoValueOf.getInstId() : null))) {
                Job job = qhv.values;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
                }
                SearchRecommendVo searchRecommendVoValueOf2 = qhv.valueOf();
                if (searchRecommendVoValueOf2 != null && (ccy = searchRecommendVoValueOf2.getCcy()) != null) {
                    oKEditText.setText(ccy);
                    qHN qhnOLrzqt = qHO.OLrzqt(oKEditText);
                    if (qhnOLrzqt != null) {
                        qhnOLrzqt.m_(ccy);
                    }
                    MainSearchViewModel.search$OKMarket_market_impl$default(qhv.AuCTel(), ccy, false, 2, null);
                }
                qhv.djBIcL();
                qHN qhnOLrzqt2 = qHO.OLrzqt(oKEditText);
                if (qhnOLrzqt2 != null) {
                    qhnOLrzqt2.EZpvd(qhv.valueOf());
                }
            }
        }
        C33054mpH.copydefault(qhv);
        return true;
    }

    public static final void KWHzl(android.widget.TextView textView, qHV qhv, android.view.View view) {
        qHN qhnOLrzqt = qHO.OLrzqt(textView);
        if (qhnOLrzqt != null) {
            qhnOLrzqt.gEmmrt();
        }
        qhv.requireActivity().getOnBackPressedDispatcher().onBackPressed();
    }

    public final void AEQbTJ(android.widget.TextView textView) {
        C41431qqg.AEQbTJ(textView, C55608xnE.OLrzqt() && ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).OLrzqt(OKComplianceRestrictionService.Feature.BANNER), (Function1<? super android.widget.TextView, Unit>) new Function1() { // from class: o.qHW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qHV.EZpvd((android.widget.TextView) obj);
            }
        });
    }

    public static final Unit EZpvd(final android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        textView.setText(C33061mpO.setupSpanStyles$default(C33069mpW.getFormattedString$default(C33070mpX.AYXKKw(qZH.PendingIntent.OLrzqt) + " " + C33070mpX.AYXKKw(qZH.PendingIntent.copydefault), null, 2, null), new java.lang.String[]{C33070mpX.AYXKKw(qZH.PendingIntent.copydefault)}, 0, null, false, new Function1() { // from class: o.qIa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qHV.AEQbTJ(textView, (java.util.List) obj);
            }
        }, 14, null));
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        return Unit.INSTANCE;
    }

    public static final class Application extends android.text.style.ClickableSpan {
        public final /* synthetic */ android.widget.TextView EZpvd;

        public Application(android.widget.TextView textView) {
            this.EZpvd = textView;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            sxI sxi = (sxI) C43251rlk.copydefault(sxI.class);
            android.content.Context context = this.EZpvd.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            sxi.OLrzqt(context);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }
    }

    public static final Unit AEQbTJ(android.widget.TextView textView, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(textView.getContext(), C52761wXj.LoaderManager.DTwDnp));
        list.add(new Application(textView));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        java.lang.String strCopydefault;
        C42831rdo c42831rdo;
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        djBIcL();
        fARcdN();
        fJNWhG();
        ejfBZ();
        pXK.copydefault.copydefault(true);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MainSearchV2Fragment$setListener$$inlined$repeatOnLifecycleResume$1(this, Lifecycle.State.RESUMED, null, this), 3, null);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new TaskDescription());
        qHP qhpAEQbTJ = qHQ.AEQbTJ(this);
        if (qhpAEQbTJ == null || (strCopydefault = qhpAEQbTJ.copydefault(this)) == null || (c42831rdo = this.fetchVPNInfo) == null || (c55230xfy = c42831rdo.AYXKKw) == null || (oKEditTextKWHzl = c55230xfy.KWHzl()) == null) {
            return;
        }
        oKEditTextKWHzl.setText(strCopydefault);
    }

    public static final class TaskDescription extends OnBackPressedCallback {
        public TaskDescription() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            qHN qhnCopydefault = qHO.copydefault(qHV.this);
            if (qhnCopydefault != null) {
                qhnCopydefault.AhwBna();
            }
            qHV.this.requireActivity().finish();
        }
    }

    public final void djBIcL() {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        C42831rdo c42831rdo = this.fetchVPNInfo;
        this.values = (c42831rdo == null || (c55230xfy = c42831rdo.AYXKKw) == null || (oKEditTextKWHzl = c55230xfy.KWHzl()) == null) ? null : C41396qpy.onTextChanged$default(oKEditTextKWHzl, LifecycleOwnerKt.getLifecycleScope(this), 0L, false, new Function1() { // from class: o.qHZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qHV.OLrzqt(this.OLrzqt, (java.lang.String) obj);
            }
        }, 2, null);
    }

    public static final Unit OLrzqt(qHV qhv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        FragmentActivity fragmentActivityRequireActivity = qhv.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        java.lang.Boolean.valueOf(qhv.OLrzqt(fragmentActivityRequireActivity, str)).booleanValue();
        C40375qTn.AEQbTJ.copydefault(qhv.getTAG(), "search keyword -> " + str);
        qHN qhnCopydefault = qHO.copydefault(qhv);
        if (qhnCopydefault != null) {
            qhnCopydefault.m_(str);
        }
        qHN qhnCopydefault2 = qHO.copydefault(qhv);
        if (qhnCopydefault2 != null) {
            qhnCopydefault2.EZpvd((SearchRecommendVo) null);
        }
        MainSearchViewModel.search$OKMarket_market_impl$default(qhv.AuCTel(), str, false, 2, null);
        return Unit.INSTANCE;
    }

    private final void fARcdN() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new MainSearchV2Fragment$listenSearchResult$1(this, null));
    }

    private final void fJNWhG() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new MainSearchV2Fragment$listenWatchingOptMsg$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(InterfaceC49371unL<Unit> interfaceC49371unL) {
        androidx.fragment.app.Fragment fragment;
        C55113xdn c55113xdn;
        C55113xdn c55113xdn2;
        C55113xdn c55113xdn3;
        qHN qhnCopydefault;
        C55113xdn c55113xdn4;
        C40375qTn.AEQbTJ.copydefault(getTAG(), "switchContent -> " + interfaceC49371unL);
        if (!(interfaceC49371unL instanceof InterfaceC49371unL.StateListAnimator)) {
            if (!(interfaceC49371unL instanceof InterfaceC49371unL.ActionBar)) {
                if (!(interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription) && !(interfaceC49371unL instanceof InterfaceC49371unL.Application)) {
                    if (!(interfaceC49371unL instanceof InterfaceC49371unL.Activity)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C42831rdo c42831rdo = this.fetchVPNInfo;
                    if (c42831rdo != null && (c55113xdn2 = c42831rdo.OLrzqt) != null) {
                        c55113xdn2.setVisibility(8);
                    }
                    androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
                    Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
                    fragmentTransactionBeginTransaction.setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                    androidx.fragment.app.Fragment fragmentKWHzl = KWHzl(this);
                    if (fragmentKWHzl != null && !fragmentKWHzl.isHidden()) {
                        fragmentTransactionBeginTransaction.hide(fragmentKWHzl);
                    }
                    androidx.fragment.app.Fragment fragmentValueOf = valueOf(this);
                    fragment = fragmentValueOf instanceof qDZ ? fragmentValueOf : null;
                    if (fragment != null) {
                        if (fragment.isHidden()) {
                            fragmentTransactionBeginTransaction.show(fragment);
                        }
                    } else {
                        fragmentTransactionBeginTransaction.replace(qZH.StateListAnimator.akftKQ, new qDZ());
                    }
                    fragmentTransactionBeginTransaction.commitNow();
                } else {
                    C42831rdo c42831rdo2 = this.fetchVPNInfo;
                    if (c42831rdo2 != null && (c55113xdn = c42831rdo2.OLrzqt) != null) {
                        c55113xdn.setVisibility(8);
                    }
                    androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                    androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction2 = childFragmentManager2.beginTransaction();
                    Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction2, "");
                    fragmentTransactionBeginTransaction2.setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                    androidx.fragment.app.Fragment fragmentKWHzl2 = KWHzl(this);
                    if (fragmentKWHzl2 != null && !fragmentKWHzl2.isHidden()) {
                        fragmentTransactionBeginTransaction2.hide(fragmentKWHzl2);
                    }
                    androidx.fragment.app.Fragment fragmentValueOf2 = valueOf(this);
                    fragment = fragmentValueOf2 instanceof C39920qCr ? fragmentValueOf2 : null;
                    if (fragment != null) {
                        if (fragment.isHidden()) {
                            fragmentTransactionBeginTransaction2.show(fragment);
                        }
                    } else {
                        fragmentTransactionBeginTransaction2.replace(qZH.StateListAnimator.akftKQ, new C39920qCr());
                    }
                    fragmentTransactionBeginTransaction2.commitNow();
                }
            } else {
                C42831rdo c42831rdo3 = this.fetchVPNInfo;
                if (c42831rdo3 != null && (c55113xdn3 = c42831rdo3.OLrzqt) != null) {
                    c55113xdn3.setVisibility(0);
                }
                androidx.fragment.app.FragmentManager childFragmentManager3 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
                androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction3 = childFragmentManager3.beginTransaction();
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction3, "");
                fragmentTransactionBeginTransaction3.setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                androidx.fragment.app.Fragment fragmentKWHzl3 = KWHzl(this);
                if (fragmentKWHzl3 != null) {
                    fragmentTransactionBeginTransaction3.hide(fragmentKWHzl3);
                }
                androidx.fragment.app.Fragment fragmentValueOf3 = valueOf(this);
                if (fragmentValueOf3 != null) {
                    fragmentTransactionBeginTransaction3.hide(fragmentValueOf3);
                }
                fragmentTransactionBeginTransaction3.commitNow();
            }
        } else {
            C42831rdo c42831rdo4 = this.fetchVPNInfo;
            if (c42831rdo4 != null && (c55113xdn4 = c42831rdo4.OLrzqt) != null) {
                c55113xdn4.setVisibility(8);
            }
            androidx.fragment.app.FragmentManager childFragmentManager4 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "");
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction4 = childFragmentManager4.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction4, "");
            fragmentTransactionBeginTransaction4.setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            androidx.fragment.app.Fragment fragmentKWHzl4 = KWHzl(this);
            if (fragmentKWHzl4 != null) {
                fragmentTransactionBeginTransaction4.show(fragmentKWHzl4);
            }
            androidx.fragment.app.Fragment fragmentValueOf4 = valueOf(this);
            if (fragmentValueOf4 != null) {
                fragmentTransactionBeginTransaction4.remove(fragmentValueOf4);
            }
            fragmentTransactionBeginTransaction4.commitNow();
        }
        if (!(interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription) || (qhnCopydefault = qHO.copydefault(this)) == null) {
            return;
        }
        qhnCopydefault.fIwbmz();
    }

    public static final androidx.fragment.app.Fragment KWHzl(qHV qhv) {
        return jSA.AEQbTJ(qhv, qZH.StateListAnimator.aHXSQp);
    }

    public static final androidx.fragment.app.Fragment valueOf(qHV qhv) {
        return jSA.AEQbTJ(qhv, qZH.StateListAnimator.akftKQ);
    }

    @Override // o.qHR
    public void EZpvd(int i, @NotNull BizInstrument bizInstrument, boolean z) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        C40375qTn.AEQbTJ.copydefault(getTAG(), "onHandleWatching -> " + i + ", " + bizInstrument + ", " + z);
        qHN qhnCopydefault = qHO.copydefault(this);
        if (qhnCopydefault != null) {
            qhnCopydefault.AEQbTJ(bizInstrument, z);
        }
        if (z) {
            AuCTel().copydefault(bizInstrument);
        } else {
            AuCTel().EZpvd(bizInstrument);
        }
    }

    public final void EZpvd(BizInstrument bizInstrument) {
        if (C55608xnE.isLogin$default(null, 1, null) && !C55608xnE.OLrzqt()) {
            jSE jse = jSE.EZpvd;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            jse.AEQbTJ(contextRequireContext, parentFragmentManager, bizInstrument, "search", 24);
            return;
        }
        C55326xho.toast$default(getString(qZH.PendingIntent.DTwDnp), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
    }

    private final void ejfBZ() {
        final java.lang.String[] strArr = {"UPDATE_NEW_COIN_UI", "NEW_COIN_ONLINE_STATUS_UPDATE", "NEW_CONTRACT_ONLINE_STATUS_UPDATE"};
        getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.market.search.features.main.root.ui.MainSearchV2Fragment$listenRxEvents$$inlined$repeatListenRxEventOnResume$1
            public InterfaceC58217yxC OLrzqt;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onResume(lifecycleOwner);
                String[] strArr2 = strArr;
                AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ((String[]) Arrays.copyOf(strArr2, strArr2.length));
                final qHV qhv = this;
                this.OLrzqt = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM(new Function1<String, Unit>() { // from class: com.okinc.market.search.features.main.root.ui.MainSearchV2Fragment$listenRxEvents$$inlined$repeatListenRxEventOnResume$1.5
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(String str) {
                        AEQbTJ(str);
                        return Unit.INSTANCE;
                    }

                    public final void AEQbTJ(String str) {
                        Intrinsics.copydefault((Object) str);
                        C40375qTn.AEQbTJ.copydefault(qhv.getTAG(), "listenRxEvents -> " + str);
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(qhv), null, null, new MainSearchV2Fragment$listenRxEvents$1$1(qhv, null), 3, null);
                    }
                }) { // from class: o.jSA.ComponentName
                    public final /* synthetic */ Function1 AEQbTJ;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.AEQbTJ = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.AEQbTJ.invoke(obj);
                    }
                }, new InterfaceC58227yxM(new Function1<Throwable, Unit>() { // from class: com.okinc.market.search.features.main.root.ui.MainSearchV2Fragment$listenRxEvents$$inlined$repeatListenRxEventOnResume$1.2
                    public final void OLrzqt(Throwable th) {
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(Throwable th) {
                        OLrzqt(th);
                        return Unit.INSTANCE;
                    }
                }) { // from class: o.jSA.ComponentName
                    public final /* synthetic */ Function1 AEQbTJ;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.AEQbTJ = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.AEQbTJ.invoke(obj);
                    }
                });
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                super.onPause(lifecycleOwner);
            }
        });
    }
}
