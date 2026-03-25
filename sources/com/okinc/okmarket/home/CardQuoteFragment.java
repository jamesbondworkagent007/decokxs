package com.okinc.okmarket.home;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.TooltipCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.okmarket.home.CardQuoteFragment;
import com.okinc.okmarket.ui.market.data.UserGroupVo;
import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DexInstrument;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC46621tad;
import o.AbstractC47263tmj;
import o.AbstractC49411unz;
import o.AbstractC58185ywX;
import o.C33070mpX;
import o.C40440qVy;
import o.C41607qtx;
import o.C42652raU;
import o.C43251rlk;
import o.C46600taI;
import o.C46606taO;
import o.C46665tbU;
import o.C46689tbs;
import o.C52761wXj;
import o.C54989xbV;
import o.C55113xdn;
import o.C55173xeu;
import o.C55243xgK;
import o.C55244xgL;
import o.C55296xhK;
import o.C55298xhM;
import o.C55608xnE;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C56524yIo;
import o.C58156yvv;
import o.InterfaceC27809kEc;
import o.InterfaceC41655qus;
import o.InterfaceC46605taN;
import o.InterfaceC46612taU;
import o.InterfaceC47278tmy;
import o.InterfaceC49361unB;
import o.InterfaceC49363unD;
import o.InterfaceC49369unJ;
import o.InterfaceC49425uoM;
import o.InterfaceC49497upf;
import o.InterfaceC54577xNn;
import o.InterfaceC56387yDm;
import o.InterfaceC56560yJx;
import o.InterfaceC58227yxM;
import o.kDJ;
import o.pUU;
import o.pWJ;
import o.pWN;
import o.pWO;
import o.qVD;
import o.qWI;
import o.qXB;
import o.qXK;
import o.qZH;
import o.rVN;
import o.sZW;
import o.xND;
import o.yCM;
import o.yDY;
import o.yHO;
import o.yHQ;
import o.yHR;
import o.yHS;
import o.yHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class CardQuoteFragment extends AbstractC46621tad implements InterfaceC49363unD, qXK, InterfaceC27809kEc, InterfaceC46612taU, InterfaceC46605taN {
    public C42652raU AYXKKw;
    public final InterfaceC56387yDm DbNXlk;

    @yCM
    public C41607qtx checkDexRestrictionUseCase;
    public boolean djBIcL;
    public C46689tbs fetchVPNInfo;
    public final int gEmmrt;
    public TabLayoutMediator isConnected;

    @yCM
    public InterfaceC47278tmy userManager;
    public FragmentStateAdapter valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public static final List<pWN> EZpvd = yDY.gEmmrt(new pWN(qZH.PendingIntent.QKVWgx, "Watchlist", null, "homeFavTab", 4, null), new pWN(qZH.PendingIntent.OrsvgJ, "SPOT", null, null, 12, null), new pWN(qZH.PendingIntent.DQnQnb, "FUTURES", null, null, 12, null), new pWN(qZH.PendingIntent.DKtBnz, "CEDEFI", null, null, 12, null), new pWN(qZH.PendingIntent.iZzfmt, "OPTION", null, null, 12, null));
    public final /* synthetic */ qXB AEQbTJ = new qXB();
    public final /* synthetic */ kDJ KWHzl = new kDJ();
    public final /* synthetic */ C46606taO copydefault = new C46606taO();
    public final /* synthetic */ C46600taI AhwBna = new C46600taI();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public final String KWHzl(int i) {
        return i != 0 ? i != 1 ? i != 3 ? i != 4 ? "" : "new-coin-rank" : "gainers-rank" : "hot-rank" : "favorite";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ() {
        this.copydefault.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void AEQbTJ(@StringRes int i, @StringRes int i2, @StringRes int i3, int i4, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ.AEQbTJ(i, i2, i3, i4, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.copydefault.EZpvd(fragment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46605taN
    public void AEQbTJ(@NotNull Fragment fragment, C42652raU c42652raU) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.AhwBna.AEQbTJ(fragment, c42652raU);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27809kEc
    public void AEQbTJ(@NotNull DexInstrument dexInstrument, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl.AEQbTJ(dexInstrument, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void AEQbTJ(String str, String str2, String str3, int i, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ.AEQbTJ(str, str2, str3, i, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(C55173xeu c55173xeu, C55113xdn c55113xdn, @NotNull View... viewArr) {
        Intrinsics.checkNotNullParameter(viewArr, "");
        this.AEQbTJ.KWHzl(c55173xeu, c55113xdn, viewArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "" : "options" : "futures" : "spot" : "favorites";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void EZpvd(@StringRes int i, @StringRes int i2, @StringRes int i3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ.EZpvd(i, i2, i3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27809kEc
    public void EZpvd(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.EZpvd(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull InterfaceC49363unD interfaceC49363unD) {
        Intrinsics.checkNotNullParameter(interfaceC49363unD, "");
        this.AhwBna.EZpvd(interfaceC49363unD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27809kEc
    public void KWHzl(@NotNull DexInstrument dexInstrument, @NotNull String str) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.KWHzl(dexInstrument, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27809kEc
    public void KWHzl(@NotNull String str, String str2, int i, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.KWHzl(str, str2, i, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt() {
        this.AhwBna.copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27809kEc
    public void OLrzqt(@NotNull String str, String str2, int i, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.OLrzqt(str, str2, i, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void copydefault(long j) {
        this.AEQbTJ.copydefault(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46605taN
    public void copydefault(@NotNull View view, @NotNull BizInstrument bizInstrument, int i, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        this.AhwBna.copydefault(view, bizInstrument, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46605taN
    public void copydefault(@NotNull View view, @NotNull InterfaceC41655qus interfaceC41655qus, int i, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(interfaceC41655qus, "");
        this.AhwBna.copydefault(view, interfaceC41655qus, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46612taU
    public void copydefault(MarketCoinInfo marketCoinInfo, InterfaceC41655qus interfaceC41655qus, String str, Integer num, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault.copydefault(marketCoinInfo, interfaceC41655qus, str, num, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27809kEc
    public void copydefault(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.copydefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27809kEc
    public void copydefault(@NotNull String str, String str2, int i, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.copydefault(str, str2, i, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void copydefault(String str, String str2, String str3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ.copydefault(str, str2, str3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    public <T extends InterfaceC49369unJ<T>> Object OLrzqt(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Continuation<? super T> continuation) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, continuation);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, state, function2);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, state, function2);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends Object> yho) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends Object> yht) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C, D> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends Object> yhs) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, state, yhs);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends Object> yhq) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, state, yhq);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends Object> yhr) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, state, yhr);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, state, function2);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, state, function2);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends Object> yho) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends Object> yht) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C, D> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends Object> yhs) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, state, yhs);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends Object> yhq) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, state, yhq);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends Object> yhr) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, state, yhr);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>> Object onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Flow<? extends T>> continuation) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, state, function2, continuation);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A> Flow<A> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, state, function2);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B> Flow<Pair<A, B>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends Object> yho) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C> Flow<Triple<A, B, C>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends Object> yht) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C, D> Flow<Quartet<A, B, C, D>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends Object> yhs) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, state, yhs);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Flow<Quintet<A, B, C, D, E>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends Object> yhq) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, state, yhq);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Flow<Sextet<A, B, C, D, E, F>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends Object> yhr) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, state, yhr);
    }

    @Override // o.InterfaceC49362unC
    public <T extends InterfaceC49369unJ<T>> Flow<T> uiStateFlow(@NotNull AbstractC49411unz<T> abstractC49411unz) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz);
    }

    public CardQuoteFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.okmarket.home.CardQuoteFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.okmarket.home.CardQuoteFragment$special$$inlined$viewModels$default$2
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketHomeV2ViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okmarket.home.CardQuoteFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okmarket.home.CardQuoteFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okmarket.home.CardQuoteFragment$special$$inlined$viewModels$default$5
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
        this.gEmmrt = qZH.ActionBar.zblBkD;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okmarket.home.CardQuoteFragment.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarketHomeV2ViewModel AkhnZx() {
        return (MarketHomeV2ViewModel) this.DbNXlk.getValue();
    }

    public final InterfaceC47278tmy djBIcL() {
        InterfaceC47278tmy interfaceC47278tmy = this.userManager;
        if (interfaceC47278tmy != null) {
            return interfaceC47278tmy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C41607qtx AhwBna() {
        C41607qtx c41607qtx = this.checkDexRestrictionUseCase;
        if (c41607qtx != null) {
            return c41607qtx;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        C55244xgL c55244xgL;
        ViewPager2 viewPager2;
        Intrinsics.checkNotNullParameter(view, "");
        C42652raU c42652raUAEQbTJ = C42652raU.AEQbTJ(view);
        AEQbTJ(c42652raUAEQbTJ.KWHzl, (C55113xdn) null, c42652raUAEQbTJ.AEQbTJ);
        this.AYXKKw = c42652raUAEQbTJ;
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("event_update_layout");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function1 = new Function1() { // from class: o.sZY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CardQuoteFragment.KWHzl(this.EZpvd, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.tab
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                CardQuoteFragment.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.sZZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CardQuoteFragment.copydefault((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.sZX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                CardQuoteFragment.AEQbTJ(function12, obj);
            }
        });
        C42652raU c42652raU = this.AYXKKw;
        if (c42652raU != null && (viewPager2 = c42652raU.OLrzqt) != null) {
            viewPager2.setOffscreenPageLimit(-1);
        }
        C42652raU c42652raU2 = this.AYXKKw;
        if (c42652raU2 == null || (c55244xgL = c42652raU2.copydefault) == null) {
            return;
        }
        c55244xgL.EZpvd().setVisibility(0);
        c55244xgL.EZpvd().removeAllViews();
        ImageView imageView = new ImageView(c55244xgL.getContext());
        imageView.setImageResource(C52761wXj.TaskDescription.hCLrkq);
        imageView.setContentDescription("homeMarketRankMoreButton");
        imageView.setPadding(0, C55298xhM.dpInt$default(6, (Context) null, 1, (Object) null), 0, C55298xhM.dpInt$default(6, (Context) null, 1, (Object) null));
        imageView.setContentDescription("homeMarketRankMoreButton");
        imageView.setOnClickListener(new ActionBar(imageView, 1000L, this));
        c55244xgL.copydefault(imageView);
    }

    public static final void KWHzl(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(CardQuoteFragment cardQuoteFragment, String str) {
        pUU.EZpvd("TransformViewPager", "MarketHomeV2Fragment->onEvent:" + str);
        C46689tbs c46689tbs = cardQuoteFragment.fetchVPNInfo;
        if (c46689tbs != null) {
            c46689tbs.KWHzl();
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Throwable th) {
        pUU.copydefault("TransformViewPager", "onEvent:" + th);
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ CardQuoteFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, CardQuoteFragment cardQuoteFragment) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = cardQuoteFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onClick(View view) {
            String str;
            C55244xgL c55244xgL;
            ViewPager2 viewPager2;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C42652raU c42652raU = this.copydefault.AYXKKw;
                if (c42652raU == null || (c55244xgL = c42652raU.copydefault) == null) {
                    str = "favorite";
                } else {
                    C42652raU c42652raU2 = this.copydefault.AYXKKw;
                    TabLayout.Tab tabKWHzl = c55244xgL.KWHzl((c42652raU2 == null || (viewPager2 = c42652raU2.OLrzqt) == null) ? 0 : viewPager2.getCurrentItem());
                    if (tabKWHzl != null) {
                        Object tag = tabKWHzl.getTag();
                        if (!Intrinsics.EZpvd(tag, Integer.valueOf(qZH.PendingIntent.QKVWgx))) {
                            if (Intrinsics.EZpvd(tag, Integer.valueOf(qZH.PendingIntent.OrsvgJ))) {
                                str = "tab_spot";
                            } else if (Intrinsics.EZpvd(tag, Integer.valueOf(qZH.PendingIntent.DQnQnb))) {
                                str = "tab_futures";
                            } else if (Intrinsics.EZpvd(tag, Integer.valueOf(qZH.PendingIntent.iZzfmt))) {
                                str = "tab_option";
                            } else if (Intrinsics.EZpvd(tag, Integer.valueOf(qZH.PendingIntent.DKtBnz))) {
                                str = "dex-rank";
                            }
                        }
                    }
                }
                this.copydefault.getChildFragmentManager().setFragmentResult("REQUEST_CLICK_ARROW", BundleKt.bundleOf(C56390yDp.OLrzqt("type", str)));
            }
        }
    }

    @Override // o.AbstractC46621tad, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        AEQbTJ(this, this.AYXKKw);
        AEQbTJ((Fragment) this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        OLrzqt();
        AEQbTJ();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AkhnZx().OLrzqt("SP_KEY_QUOTE_CARD_FAVORITE_TYPE_STR");
        if (C55608xnE.OLrzqt()) {
            return;
        }
        AkhnZx().OLrzqt();
    }

    public final void KWHzl(final FragmentStateAdapter fragmentStateAdapter) {
        ViewPager2 viewPager2;
        C55244xgL c55244xgL;
        C55244xgL c55244xgL2;
        ViewPager2 viewPager22;
        this.valueOf = fragmentStateAdapter;
        C42652raU c42652raU = this.AYXKKw;
        if (c42652raU != null && (viewPager22 = c42652raU.OLrzqt) != null) {
            C46689tbs c46689tbs = this.fetchVPNInfo;
            if (c46689tbs != null) {
                c46689tbs.EZpvd();
            }
            C46689tbs c46689tbs2 = new C46689tbs(viewPager22);
            this.fetchVPNInfo = c46689tbs2;
            c46689tbs2.KWHzl(fragmentStateAdapter);
        }
        C42652raU c42652raU2 = this.AYXKKw;
        if (c42652raU2 != null && (c55244xgL2 = c42652raU2.copydefault) != null) {
            c55244xgL2.copydefault(new Application());
        }
        C42652raU c42652raU3 = this.AYXKKw;
        if (c42652raU3 == null || (viewPager2 = c42652raU3.OLrzqt) == null || c42652raU3 == null || (c55244xgL = c42652raU3.copydefault) == null) {
            return;
        }
        TabLayoutMediator tabLayoutMediator = this.isConnected;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        TabLayoutMediator tabLayoutMediator2 = new TabLayoutMediator(c55244xgL.AYXKKw(), viewPager2, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.sZV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                CardQuoteFragment.copydefault(fragmentStateAdapter, this, tab, i);
            }
        });
        tabLayoutMediator2.attach();
        this.isConnected = tabLayoutMediator2;
        rVN.reportFullyDrawn$default((Fragment) this, true, (String) null, 2, (Object) null);
    }

    public static final class Application implements TabLayout.OnTabSelectedListener {
        public Application() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                CardQuoteFragment cardQuoteFragment = CardQuoteFragment.this;
                cardQuoteFragment.AEQbTJ(tab);
                if (Intrinsics.EZpvd(tab.getTag(), Integer.valueOf(qZH.PendingIntent.QKVWgx))) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(cardQuoteFragment), null, null, new CardQuoteFragment$createMarkets$2$onTabSelected$1$1(tab, cardQuoteFragment, null), 3, null);
                    cardQuoteFragment.EZpvd(tab, true);
                }
                cardQuoteFragment.AEQbTJ(tab.getPosition());
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            if (tab == null || !Intrinsics.EZpvd(tab.getTag(), Integer.valueOf(qZH.PendingIntent.QKVWgx))) {
                return;
            }
            ImageView imageViewEZpvd = C55243xgK.EZpvd(tab);
            if (imageViewEZpvd != null) {
                imageViewEZpvd.setVisibility(8);
            }
            CardQuoteFragment.this.EZpvd(tab, false);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(final TabLayout.Tab tab) {
            ImageView imageViewEZpvd;
            if (tab == null || !Intrinsics.EZpvd(tab.getTag(), Integer.valueOf(qZH.PendingIntent.QKVWgx)) || (imageViewEZpvd = C55243xgK.EZpvd(tab)) == null || imageViewEZpvd.getVisibility() != 0) {
                return;
            }
            ImageView imageViewEZpvd2 = C55243xgK.EZpvd(tab);
            if (imageViewEZpvd2 != null) {
                imageViewEZpvd2.setImageResource(C52761wXj.TaskDescription.dUDNAs);
            }
            C46665tbU.Application application = C46665tbU.Companion;
            FragmentManager childFragmentManager = CardQuoteFragment.this.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            application.EZpvd(childFragmentManager, new Function0() { // from class: o.taa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CardQuoteFragment.Application.OLrzqt(tab);
                }
            });
        }

        public static final Unit OLrzqt(TabLayout.Tab tab) {
            ImageView imageViewEZpvd = C55243xgK.EZpvd(tab);
            if (imageViewEZpvd != null) {
                imageViewEZpvd.setImageResource(C52761wXj.TaskDescription.QSLkRj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void copydefault(FragmentStateAdapter fragmentStateAdapter, CardQuoteFragment cardQuoteFragment, TabLayout.Tab tab, int i) {
        String strAYXKKw;
        TextView textViewEZpvd;
        Intrinsics.checkNotNullParameter(tab, "");
        sZW szw = fragmentStateAdapter instanceof sZW ? (sZW) fragmentStateAdapter : null;
        if (szw != null) {
            tab.view.setBackgroundColor(0);
            tab.setTag(Integer.valueOf(szw.AEQbTJ(i)));
            View customView = tab.getCustomView();
            C54989xbV c54989xbV = customView instanceof C54989xbV ? (C54989xbV) customView : null;
            if (c54989xbV != null) {
                c54989xbV.setOKDSSize(-5);
            }
            View customView2 = tab.getCustomView();
            C54989xbV c54989xbV2 = customView2 instanceof C54989xbV ? (C54989xbV) customView2 : null;
            if (c54989xbV2 != null && (textViewEZpvd = c54989xbV2.EZpvd()) != null) {
                Object parent = textViewEZpvd.getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view != null) {
                    view.setPadding(view.getPaddingLeft(), C55298xhM.dp2px$default(6.0f, null, 1, null), view.getPaddingRight(), C55298xhM.dp2px$default(6.0f, null, 1, null));
                }
            }
            tab.setContentDescription(szw.EZpvd(i));
            if (i == 0) {
                UserGroupVo userGroupVo = (UserGroupVo) SPUtils.getObject("SP_KEY_QUOTE_CARD_FAVORITE_TYPE_STR", UserGroupVo.class);
                if (userGroupVo == null || Intrinsics.EZpvd((Object) userGroupVo.getUserGroup().getGroupName(), (Object) "ALL")) {
                    strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.QKVWgx);
                } else {
                    strAYXKKw = cardQuoteFragment.OLrzqt(userGroupVo.getUserGroup().getTranslatedGroupName());
                }
                tab.setText(strAYXKKw);
            } else {
                tab.setText(szw.copydefault(i));
            }
        }
        cardQuoteFragment.EZpvd(tab);
    }

    public final void EZpvd(TabLayout.Tab tab) {
        tab.view.setLongClickable(false);
        TabLayout.TabView tabView = tab.view;
        Intrinsics.checkNotNullExpressionValue(tabView, "");
        TextView textViewEZpvd = EZpvd(tabView);
        if (textViewEZpvd != null) {
            textViewEZpvd.setLongClickable(false);
        }
        TooltipCompat.setTooltipText(tab.view, "");
        TabLayout.TabView tabView2 = tab.view;
        Intrinsics.checkNotNullExpressionValue(tabView2, "");
        TextView textViewEZpvd2 = EZpvd(tabView2);
        if (textViewEZpvd2 != null) {
            TooltipCompat.setTooltipText(textViewEZpvd2, "");
        }
    }

    public final TextView EZpvd(ViewGroup viewGroup) {
        Object objM7377constructorimpl;
        TextView textView;
        try {
            Result.Application application = Result.Companion;
            int childCount = viewGroup.getChildCount();
            if (childCount > 0) {
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof TextView) {
                        textView = (TextView) childAt;
                        break;
                    }
                }
            }
            textView = null;
            objM7377constructorimpl = Result.m7377constructorimpl(textView);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (TextView) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new CardQuoteFragment$dealPageType$1(this, null), 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [398=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0073 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(Continuation<? super Unit> continuation) throws Throwable {
        CardQuoteFragment$fillVp$1 cardQuoteFragment$fillVp$1;
        CardQuoteFragment cardQuoteFragment;
        C42652raU c42652raU;
        ViewPager2 viewPager2;
        Boolean boolIsConnected;
        boolean zBooleanValue;
        Boolean boolAkhnZx;
        Boolean boolDbNXlk;
        Boolean boolAhwBna;
        if (continuation instanceof CardQuoteFragment$fillVp$1) {
            cardQuoteFragment$fillVp$1 = (CardQuoteFragment$fillVp$1) continuation;
            int i = cardQuoteFragment$fillVp$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cardQuoteFragment$fillVp$1.label = i - Integer.MIN_VALUE;
            } else {
                cardQuoteFragment$fillVp$1 = new CardQuoteFragment$fillVp$1(this, continuation);
            }
        }
        Object obj = cardQuoteFragment$fillVp$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = cardQuoteFragment$fillVp$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
            cardQuoteFragment$fillVp$1.L$0 = this;
            cardQuoteFragment$fillVp$1.label = 1;
            if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNnKWHzl, false, null, cardQuoteFragment$fillVp$1, 3, null) == objCopydefault) {
                return objCopydefault;
            }
            cardQuoteFragment = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            cardQuoteFragment = (CardQuoteFragment) cardQuoteFragment$fillVp$1.L$0;
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        if (cardQuoteFragment.isAdded() && (c42652raU = cardQuoteFragment.AYXKKw) != null && (viewPager2 = c42652raU.OLrzqt) != null) {
            List<pWN> list = EZpvd;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                xND xndAEQbTJ = ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).AEQbTJ();
                String strAEQbTJ = ((pWN) obj2).AEQbTJ();
                switch (strAEQbTJ.hashCode()) {
                    case -1956807563:
                        if (!strAEQbTJ.equals("OPTION")) {
                            arrayList.add(obj2);
                        } else if (xndAEQbTJ != null && (boolAkhnZx = xndAEQbTJ.AkhnZx()) != null) {
                            zBooleanValue = boolAkhnZx.booleanValue();
                            if (zBooleanValue) {
                                arrayList.add(obj2);
                            }
                        }
                        break;
                    case 2552066:
                        if (!strAEQbTJ.equals("SPOT")) {
                            arrayList.add(obj2);
                            break;
                        } else if (xndAEQbTJ == null || (boolIsConnected = xndAEQbTJ.isConnected()) == null) {
                            break;
                        } else {
                            zBooleanValue = boolIsConnected.booleanValue();
                            if (zBooleanValue) {
                            }
                        }
                        break;
                    case 214415088:
                        if (!strAEQbTJ.equals("FUTURES") || ((xndAEQbTJ != null && (boolAhwBna = xndAEQbTJ.AhwBna()) != null && boolAhwBna.booleanValue()) || (xndAEQbTJ != null && (boolDbNXlk = xndAEQbTJ.DbNXlk()) != null && boolDbNXlk.booleanValue()))) {
                            arrayList.add(obj2);
                        }
                        break;
                    case 1983970406:
                        if (!strAEQbTJ.equals("CEDEFI")) {
                            arrayList.add(obj2);
                            break;
                        } else {
                            zBooleanValue = ((Boolean) cardQuoteFragment.AhwBna().KWHzl((Object) Unit.INSTANCE)).booleanValue();
                            if (zBooleanValue) {
                            }
                        }
                        break;
                    default:
                        arrayList.add(obj2);
                        break;
                }
            }
            FragmentManager childFragmentManager = cardQuoteFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            cardQuoteFragment.KWHzl(new sZW(childFragmentManager, cardQuoteFragment, viewPager2, arrayList));
            cardQuoteFragment$fillVp$1.L$0 = null;
            cardQuoteFragment$fillVp$1.label = 2;
            if (cardQuoteFragment.EZpvd(cardQuoteFragment$fillVp$1) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(Continuation<? super Unit> continuation) throws Throwable {
        CardQuoteFragment$showDexTabRedDot$1 cardQuoteFragment$showDexTabRedDot$1;
        CardQuoteFragment cardQuoteFragment;
        C55244xgL c55244xgL;
        C55244xgL c55244xgL2;
        if (continuation instanceof CardQuoteFragment$showDexTabRedDot$1) {
            cardQuoteFragment$showDexTabRedDot$1 = (CardQuoteFragment$showDexTabRedDot$1) continuation;
            int i = cardQuoteFragment$showDexTabRedDot$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cardQuoteFragment$showDexTabRedDot$1.label = i - Integer.MIN_VALUE;
            } else {
                cardQuoteFragment$showDexTabRedDot$1 = new CardQuoteFragment$showDexTabRedDot$1(this, continuation);
            }
        }
        Object objWithContext = cardQuoteFragment$showDexTabRedDot$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = cardQuoteFragment$showDexTabRedDot$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcherAEQbTJ = C40440qVy.Companion.AEQbTJ();
            CardQuoteFragment$showDexTabRedDot$isShow$1 cardQuoteFragment$showDexTabRedDot$isShow$1 = new CardQuoteFragment$showDexTabRedDot$isShow$1(null);
            cardQuoteFragment$showDexTabRedDot$1.L$0 = this;
            cardQuoteFragment$showDexTabRedDot$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, cardQuoteFragment$showDexTabRedDot$isShow$1, cardQuoteFragment$showDexTabRedDot$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            cardQuoteFragment = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cardQuoteFragment = (CardQuoteFragment) cardQuoteFragment$showDexTabRedDot$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        if (((Boolean) objWithContext).booleanValue()) {
            Pair<TabLayout.Tab, Integer> pairOLrzqt = cardQuoteFragment.OLrzqt(qZH.PendingIntent.DKtBnz);
            TabLayout.Tab tabComponent1 = pairOLrzqt.component1();
            int iIntValue = pairOLrzqt.component2().intValue();
            if (iIntValue == -1) {
                return Unit.INSTANCE;
            }
            C42652raU c42652raU = cardQuoteFragment.AYXKKw;
            if (c42652raU != null && (c55244xgL2 = c42652raU.copydefault) != null && iIntValue == c55244xgL2.gEmmrt()) {
                cardQuoteFragment.AEQbTJ(tabComponent1);
            } else {
                C42652raU c42652raU2 = cardQuoteFragment.AYXKKw;
                if (c42652raU2 != null && (c55244xgL = c42652raU2.copydefault) != null) {
                    c55244xgL.EZpvd(iIntValue);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(TabLayout.Tab tab) {
        if (Intrinsics.EZpvd(tab != null ? tab.getTag() : null, Integer.valueOf(qZH.PendingIntent.DKtBnz))) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), C40440qVy.Companion.AEQbTJ(), null, new CardQuoteFragment$hideDot$1(null), 2, null);
        }
    }

    public final void gEmmrt() {
        if (this.valueOf != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CardQuoteFragment$savePageType$1(this, null), 3, null);
        }
    }

    public final pWJ EZpvd() {
        ViewPager2 viewPager2;
        C42652raU c42652raU = this.AYXKKw;
        RecyclerView.Adapter adapter = (c42652raU == null || (viewPager2 = c42652raU.OLrzqt) == null) ? null : viewPager2.getAdapter();
        if (adapter instanceof pWJ) {
            return (pWJ) adapter;
        }
        return null;
    }

    public final Pair<TabLayout.Tab, Integer> OLrzqt(@StringRes int i) {
        C55244xgL c55244xgL;
        TabLayout tabLayoutAYXKKw;
        C55244xgL c55244xgL2;
        TabLayout tabLayoutAYXKKw2;
        if (isAdded()) {
            C42652raU c42652raU = this.AYXKKw;
            int tabCount = (c42652raU == null || (c55244xgL2 = c42652raU.copydefault) == null || (tabLayoutAYXKKw2 = c55244xgL2.AYXKKw()) == null) ? 0 : tabLayoutAYXKKw2.getTabCount();
            for (int i2 = 0; i2 < tabCount; i2++) {
                C42652raU c42652raU2 = this.AYXKKw;
                TabLayout.Tab tabAt = (c42652raU2 == null || (c55244xgL = c42652raU2.copydefault) == null || (tabLayoutAYXKKw = c55244xgL.AYXKKw()) == null) ? null : tabLayoutAYXKKw.getTabAt(i2);
                if (tabAt != null && Intrinsics.EZpvd(tabAt.getTag(), Integer.valueOf(i))) {
                    return C56390yDp.OLrzqt(tabAt, Integer.valueOf(i2));
                }
            }
            return C56390yDp.OLrzqt(null, -1);
        }
        return C56390yDp.OLrzqt(null, -1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        SubHelper.AEQbTJ(this);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        gEmmrt();
    }

    /* JADX INFO: renamed from: com.okinc.okmarket.home.CardQuoteFragment$onResume$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Result.Application application = Result.Companion;
                    qVD qvd = qVD.AEQbTJ;
                    this.label = 1;
                    if (qvd.OLrzqt(this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        ViewPager2 viewPager2;
        super.onResume();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), C40440qVy.Companion.AEQbTJ(), null, new AnonymousClass1(null), 2, null);
        if (!isReenter()) {
            KWHzl();
            pUU.KWHzl(getTAG(), "loadGroupData request from onLazyLoad");
            requestGroupData$default(this, false, 1, null);
        } else {
            C42652raU c42652raU = this.AYXKKw;
            if (c42652raU == null || (viewPager2 = c42652raU.OLrzqt) == null) {
                return;
            }
            AEQbTJ(viewPager2.getCurrentItem());
        }
    }

    public static /* synthetic */ void requestGroupData$default(CardQuoteFragment cardQuoteFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        cardQuoteFragment.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        AkhnZx().copydefault(z);
    }

    /* JADX INFO: renamed from: com.okinc.okmarket.home.CardQuoteFragment$setListener$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<UserGroupVo, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = CardQuoteFragment.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UserGroupVo userGroupVo, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(userGroupVo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            UserGroupVo userGroupVo;
            CardQuoteFragment cardQuoteFragment;
            UserGroupVo userGroupVo2;
            TabLayout.Tab tab;
            String strOLrzqt;
            ImageView imageViewEZpvd;
            View view;
            TabLayout.Tab tab2;
            CardQuoteFragment cardQuoteFragment2;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                userGroupVo = (UserGroupVo) this.L$0;
                if (userGroupVo != null) {
                    cardQuoteFragment = CardQuoteFragment.this;
                    CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                    CardQuoteFragment$setListener$2$1$1 cardQuoteFragment$setListener$2$1$1 = new CardQuoteFragment$setListener$2$1$1(userGroupVo, null);
                    this.L$0 = userGroupVo;
                    this.L$1 = cardQuoteFragment;
                    this.L$2 = userGroupVo;
                    this.label = 1;
                    if (BuildersKt.withContext(coroutineDispatcher, cardQuoteFragment$setListener$2$1$1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    userGroupVo2 = userGroupVo;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                view = (View) this.L$2;
                tab2 = (TabLayout.Tab) this.L$1;
                cardQuoteFragment2 = (CardQuoteFragment) this.L$0;
                C56391yDq.AEQbTJ(obj);
                List list = (List) obj;
                view.setVisibility((list == null && (list.isEmpty() ^ true)) ? 0 : 8);
                tab = tab2;
                cardQuoteFragment = cardQuoteFragment2;
                cardQuoteFragment.EZpvd(tab, tab.isSelected());
                return Unit.INSTANCE;
            }
            userGroupVo = (UserGroupVo) this.L$2;
            CardQuoteFragment cardQuoteFragment3 = (CardQuoteFragment) this.L$1;
            userGroupVo2 = (UserGroupVo) this.L$0;
            C56391yDq.AEQbTJ(obj);
            cardQuoteFragment = cardQuoteFragment3;
            tab = (TabLayout.Tab) cardQuoteFragment.OLrzqt(qZH.PendingIntent.QKVWgx).getFirst();
            if (tab != null) {
                if (!Intrinsics.EZpvd((Object) userGroupVo.getUserGroup().getGroupName(), (Object) "ALL")) {
                    strOLrzqt = cardQuoteFragment.OLrzqt(userGroupVo2.getUserGroup().getTranslatedGroupName());
                } else {
                    strOLrzqt = C33070mpX.AYXKKw(qZH.PendingIntent.QKVWgx);
                }
                tab.setText(strOLrzqt);
                if (tab.isSelected() && (imageViewEZpvd = C55243xgK.EZpvd(tab)) != null) {
                    MarketHomeV2ViewModel marketHomeV2ViewModelAkhnZx = cardQuoteFragment.AkhnZx();
                    this.L$0 = cardQuoteFragment;
                    this.L$1 = tab;
                    this.L$2 = imageViewEZpvd;
                    this.label = 2;
                    Object objEZpvd = marketHomeV2ViewModelAkhnZx.EZpvd(this);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    view = imageViewEZpvd;
                    tab2 = tab;
                    cardQuoteFragment2 = cardQuoteFragment;
                    obj = objEZpvd;
                    List list2 = (List) obj;
                    if (list2 == null) {
                        view.setVisibility((list2 == null && (list2.isEmpty() ^ true)) ? 0 : 8);
                        tab = tab2;
                        cardQuoteFragment = cardQuoteFragment2;
                    }
                }
                cardQuoteFragment.EZpvd(tab, tab.isSelected());
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, AkhnZx(), new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.home.CardQuoteFragment.setListener.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketHomeV2ViewModel.ActionBar) obj).OLrzqt();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketHomeV2ViewModel.ActionBar) obj).OLrzqt((UserGroupVo) obj2);
            }
        }, null, new AnonymousClass2(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass3(null), 3, null);
        getChildFragmentManager().setFragmentResultListener("REQUEST_HOME_ERROR_RETRY", this, new FragmentResultListener() { // from class: o.sZT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                CardQuoteFragment.OLrzqt(this.KWHzl, str, bundle);
            }
        });
        EZpvd((InterfaceC49363unD) this);
    }

    /* JADX INFO: renamed from: com.okinc.okmarket.home.CardQuoteFragment$setListener$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CardQuoteFragment.this.new AnonymousClass3(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.okmarket.home.CardQuoteFragment$setListener$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC47263tmj, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CardQuoteFragment this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CardQuoteFragment cardQuoteFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cardQuoteFragment;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AbstractC47263tmj abstractC47263tmj, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(abstractC47263tmj, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    if (((AbstractC47263tmj) this.L$0) instanceof AbstractC47263tmj.StateListAnimator) {
                        pUU.KWHzl(this.this$0.getTAG(), "loadGroupData request by userManager Switched");
                        CardQuoteFragment.requestGroupData$default(this.this$0, false, 1, null);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow<AbstractC47263tmj> flowFIwbmz = CardQuoteFragment.this.djBIcL().fIwbmz();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CardQuoteFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFIwbmz, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void OLrzqt(CardQuoteFragment cardQuoteFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        cardQuoteFragment.AYXKKw();
    }

    public final void AYXKKw() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new CardQuoteFragment$requestDataWhenError$1(this, null), 3, null);
    }

    public final void EZpvd(TabLayout.Tab tab, boolean z) {
        ImageView imageViewAEQbTJ;
        TextView textViewEZpvd;
        CharSequence text;
        View customView = tab.getCustomView();
        C54989xbV c54989xbV = customView instanceof C54989xbV ? (C54989xbV) customView : null;
        if (c54989xbV == null || (imageViewAEQbTJ = c54989xbV.AEQbTJ()) == null) {
            return;
        }
        View customView2 = tab.getCustomView();
        C54989xbV c54989xbV2 = customView2 instanceof C54989xbV ? (C54989xbV) customView2 : null;
        if (c54989xbV2 == null || (textViewEZpvd = c54989xbV2.EZpvd()) == null) {
            return;
        }
        if (Intrinsics.EZpvd((Object) tab.getText(), (Object) C33070mpX.AYXKKw(qZH.PendingIntent.QKVWgx)) || tab.getText() == null || ((text = tab.getText()) != null && text.length() == 0)) {
            imageViewAEQbTJ.setVisibility(8);
            imageViewAEQbTJ.setImageDrawable(null);
            ViewGroup.LayoutParams layoutParams = textViewEZpvd.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart(0);
                textViewEZpvd.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        imageViewAEQbTJ.setVisibility(0);
        imageViewAEQbTJ.setImageResource(z ? qZH.Activity.zLjUOn : qZH.Activity.AubY);
        ViewGroup.LayoutParams layoutParams3 = textViewEZpvd.getLayoutParams();
        if (layoutParams3 != null) {
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            Context context = textViewEZpvd.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            layoutParams4.setMarginStart(C55298xhM.KWHzl(4.0f, context));
            textViewEZpvd.setLayoutParams(layoutParams4);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final String OLrzqt(String str) {
        return takeVisual$default(this, str, 12, null, 2, null);
    }

    public final void AEQbTJ(int i) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CardQuoteFragment$addTabClickEvent$1(this, i, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(int i, Continuation<? super String> continuation) throws Throwable {
        CardQuoteFragment$querySubType$1 cardQuoteFragment$querySubType$1;
        if (continuation instanceof CardQuoteFragment$querySubType$1) {
            cardQuoteFragment$querySubType$1 = (CardQuoteFragment$querySubType$1) continuation;
            int i2 = cardQuoteFragment$querySubType$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardQuoteFragment$querySubType$1.label = i2 - Integer.MIN_VALUE;
            } else {
                cardQuoteFragment$querySubType$1 = new CardQuoteFragment$querySubType$1(this, continuation);
            }
        }
        Object objAEQbTJ = cardQuoteFragment$querySubType$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = cardQuoteFragment$querySubType$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            if (i != 0) {
                return null;
            }
            MarketHomeV2ViewModel marketHomeV2ViewModelAkhnZx = AkhnZx();
            cardQuoteFragment$querySubType$1.label = 1;
            objAEQbTJ = marketHomeV2ViewModelAkhnZx.AEQbTJ(cardQuoteFragment$querySubType$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        return qWI.EZpvd((String) objAEQbTJ);
    }

    public final void valueOf() {
        OLrzqt(true);
    }

    public static /* synthetic */ String takeVisual$default(CardQuoteFragment cardQuoteFragment, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = "...";
        }
        return cardQuoteFragment.OLrzqt(str, i, str2);
    }

    public final String OLrzqt(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            i2 += EZpvd(cCharAt) ? 2 : 1;
            if (i2 > i) {
                return ((Object) sb) + str2;
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final boolean EZpvd(char c) {
        return Character.isIdeographic(c);
    }
}
