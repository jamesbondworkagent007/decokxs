package com.okinc.okmarket.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
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
import androidx.lifecycle.DefaultLifecycleObserver;
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
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import com.okinc.market.ranking.core.model.RankingNewSpotVo;
import com.okinc.okmarket.home.MarketHomeV2Fragment;
import com.okinc.okmarket.home.ui.viewmodel.CountingBannerViewModel;
import com.okinc.okmarket.ui.market.data.UserGroupVo;
import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.Arrays;
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
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC46624tag;
import o.AbstractC47263tmj;
import o.AbstractC49411unz;
import o.AbstractC55470xkZ;
import o.AbstractC58185ywX;
import o.ActivityC34993nmt;
import o.C27563jxZ;
import o.C27807kEa;
import o.C27986kKr;
import o.C33070mpX;
import o.C35069noP;
import o.C40440qVy;
import o.C41605qtv;
import o.C41607qtx;
import o.C41631quU;
import o.C43246rlf;
import o.C46606taO;
import o.C46665tbU;
import o.C46688tbr;
import o.C46689tbs;
import o.C46725tcb;
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
import o.C56402yEa;
import o.C56423yEv;
import o.C56442yFn;
import o.C56524yIo;
import o.C58113yvE;
import o.C58156yvv;
import o.InterfaceC27808kEb;
import o.InterfaceC41655qus;
import o.InterfaceC41695qvf;
import o.InterfaceC44589sZl;
import o.InterfaceC46612taU;
import o.InterfaceC47278tmy;
import o.InterfaceC49361unB;
import o.InterfaceC49363unD;
import o.InterfaceC49369unJ;
import o.InterfaceC49371unL;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.InterfaceC56560yJx;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.kDL;
import o.pUU;
import o.pWJ;
import o.pWO;
import o.qVD;
import o.qXB;
import o.qXK;
import o.qZH;
import o.qZO;
import o.sZU;
import o.xNE;
import o.xNF;
import o.yCM;
import o.yHO;
import o.yHQ;
import o.yHR;
import o.yHS;
import o.yHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketHomeV2Fragment extends AbstractC46624tag implements InterfaceC49363unD, qXK, InterfaceC27808kEb, InterfaceC41695qvf, InterfaceC46612taU {
    public final MessageQueue.IdleHandler AuCTel;
    public final MessageQueue.IdleHandler AubY;

    @yCM
    public C41607qtx checkDexRestrictionUseCase;

    @yCM
    public C41605qtv checkStockRestrictionUseCase;
    public final Handler ejfBZ;
    public boolean fARcdN;
    public final Runnable fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public qZO fetchVPNInfo;
    public final StateListAnimator getFieldNames;
    public C46689tbs getNewProxyInstance;
    public NewCoinInfo hDKMBd;
    public FragmentStateAdapter isConnected;
    public TabLayoutMediator iwGUEr;

    @yCM
    public InterfaceC47278tmy userManager;
    public final int uzCIH;
    public final InterfaceC56387yDm zsXlph;
    public static final Application Companion = new Application(null);
    public static final int AhwBna = 8;
    public final /* synthetic */ qXB AYXKKw = new qXB();
    public final /* synthetic */ kDL AkhnZx = new kDL();
    public final /* synthetic */ C41631quU values = new C41631quU();
    public final /* synthetic */ C46606taO DbNXlk = new C46606taO();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public final String EZpvd(int i) {
        return i != 0 ? i != 1 ? i != 3 ? i != 4 ? "" : "new-coin-rank" : "gainers-rank" : "hot-rank" : "favorite";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void AEQbTJ(@StringRes int i, @StringRes int i2, @StringRes int i3, int i4, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AYXKKw.AEQbTJ(i, i2, i3, i4, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AkhnZx.AEQbTJ(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void AEQbTJ(String str, String str2, String str3, int i, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AYXKKw.AEQbTJ(str, str2, str3, i, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.AkhnZx.AEQbTJ(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(C55173xeu c55173xeu, C55113xdn c55113xdn, @NotNull View... viewArr) {
        Intrinsics.checkNotNullParameter(viewArr, "");
        this.AYXKKw.KWHzl(c55173xeu, c55113xdn, viewArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void DbNXlk() {
        this.values.EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void EZpvd(@StringRes int i, @StringRes int i2, @StringRes int i3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AYXKKw.EZpvd(i, i2, i3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41695qvf
    public void EZpvd(@NotNull View view, @NotNull RankingHotCryptoVo rankingHotCryptoVo, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(rankingHotCryptoVo, "");
        this.values.EZpvd(view, rankingHotCryptoVo, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41695qvf
    public void EZpvd(@NotNull View view, @NotNull AbstractC55470xkZ.ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.values.EZpvd(view, actionBar, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull DexInstrument dexInstrument, @NotNull String str) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx.EZpvd(dexInstrument, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx.EZpvd(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AkhnZx.EZpvd(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41695qvf
    public void KWHzl(@NotNull View view, @NotNull DexInstrument dexInstrument, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        this.values.KWHzl(view, dexInstrument, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.values.EZpvd(fragment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt() {
        this.AkhnZx.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41695qvf
    public void OLrzqt(@NotNull View view, @NotNull RankingNewSpotVo rankingNewSpotVo, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(rankingNewSpotVo, "");
        this.values.OLrzqt(view, rankingNewSpotVo, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41695qvf
    public void OLrzqt(@NotNull View view, @NotNull WatchListData watchListData, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(watchListData, "");
        this.values.OLrzqt(view, watchListData, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt(@NotNull DexInstrument dexInstrument, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AkhnZx.OLrzqt(dexInstrument, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(String str) {
        this.AkhnZx.copydefault(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx.OLrzqt(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull InterfaceC49363unD interfaceC49363unD) {
        Intrinsics.checkNotNullParameter(interfaceC49363unD, "");
        this.values.EZpvd(interfaceC49363unD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void aZ_() {
        this.AkhnZx.aZ_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void ba_() {
        this.AkhnZx.ba_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void copydefault(long j) {
        this.AYXKKw.copydefault(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41695qvf
    public void copydefault(@NotNull View view, @NotNull C35069noP c35069noP, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35069noP, "");
        this.values.copydefault(view, c35069noP, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.DbNXlk.EZpvd(fragment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46612taU
    public void copydefault(MarketCoinInfo marketCoinInfo, InterfaceC41655qus interfaceC41655qus, String str, Integer num, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.DbNXlk.copydefault(marketCoinInfo, interfaceC41655qus, str, num, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void copydefault(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx.copydefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void copydefault(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AkhnZx.copydefault(str, str2, str3, str4, str5, str6, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void copydefault(String str, String str2, String str3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AYXKKw.copydefault(str, str2, str3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void fetchVPNInfo() {
        this.DbNXlk.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.uzCIH;
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

    public <T extends InterfaceC49369unJ<T>> Object copydefault(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Continuation<? super T> continuation) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, continuation);
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

    public MarketHomeV2Fragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.okmarket.home.MarketHomeV2Fragment$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.okmarket.home.MarketHomeV2Fragment$special$$inlined$viewModels$default$2
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
        this.zsXlph = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketHomeV2ViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okmarket.home.MarketHomeV2Fragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okmarket.home.MarketHomeV2Fragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okmarket.home.MarketHomeV2Fragment$special$$inlined$viewModels$default$5
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
        final Function0<Fragment> function03 = new Function0<Fragment>() { // from class: com.okinc.okmarket.home.MarketHomeV2Fragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.okmarket.home.MarketHomeV2Fragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CountingBannerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okmarket.home.MarketHomeV2Fragment$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.okmarket.home.MarketHomeV2Fragment$special$$inlined$viewModels$default$9
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
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okmarket.home.MarketHomeV2Fragment$special$$inlined$viewModels$default$10
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.uzCIH = qZH.ActionBar.fetchVPNInfo;
        this.ejfBZ = new Handler(Looper.getMainLooper());
        this.AuCTel = new MessageQueue.IdleHandler() { // from class: o.tau
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return MarketHomeV2Fragment.values(this.OLrzqt);
            }
        };
        this.AubY = new MessageQueue.IdleHandler() { // from class: o.tar
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return MarketHomeV2Fragment.fJNWhG(this.OLrzqt);
            }
        };
        this.getFieldNames = new StateListAnimator();
        this.fIwbmz = new Runnable() { // from class: o.tat
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                MarketHomeV2Fragment.isConnected(this.EZpvd);
            }
        };
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okmarket.home.MarketHomeV2Fragment.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarketHomeV2ViewModel AubY() {
        return (MarketHomeV2ViewModel) this.zsXlph.getValue();
    }

    public final CountingBannerViewModel isConnected() {
        return (CountingBannerViewModel) this.fJNWhG.getValue();
    }

    public final InterfaceC47278tmy AuCTel() {
        InterfaceC47278tmy interfaceC47278tmy = this.userManager;
        if (interfaceC47278tmy != null) {
            return interfaceC47278tmy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C41607qtx AkhnZx() {
        C41607qtx c41607qtx = this.checkDexRestrictionUseCase;
        if (c41607qtx != null) {
            return c41607qtx;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C41605qtv values() {
        C41605qtv c41605qtv = this.checkStockRestrictionUseCase;
        if (c41605qtv != null) {
            return c41605qtv;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ImageView AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ MarketHomeV2Fragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, ImageView imageView, MarketHomeV2Fragment marketHomeV2Fragment) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = imageView;
            this.copydefault = marketHomeV2Fragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onClick(View view) {
            String str;
            C55244xgL c55244xgL;
            ViewPager2 viewPager2;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                InterfaceC27808kEb interfaceC27808kEbKWHzl = C27807kEa.KWHzl(this.AEQbTJ);
                if (interfaceC27808kEbKWHzl != null) {
                    InterfaceC27808kEb.StateListAnimator.trackRankingViewAllClick$default(interfaceC27808kEbKWHzl, "arrow", null, 2, null);
                }
                if (C27563jxZ.OLrzqt.fetchVPNInfo()) {
                    qZO qzo = this.copydefault.fetchVPNInfo;
                    if (qzo == null || (c55244xgL = qzo.OLrzqt) == null) {
                        str = "favorite";
                    } else {
                        qZO qzo2 = this.copydefault.fetchVPNInfo;
                        TabLayout.Tab tabKWHzl = c55244xgL.KWHzl((qzo2 == null || (viewPager2 = qzo2.valueOf) == null) ? 0 : viewPager2.getCurrentItem());
                        if (tabKWHzl != null) {
                            Object tag = tabKWHzl.getTag();
                            if (!Intrinsics.EZpvd(tag, Integer.valueOf(qZH.PendingIntent.QKVWgx))) {
                                if (Intrinsics.EZpvd(tag, Integer.valueOf(qZH.PendingIntent.UeEOUB))) {
                                    str = "hot-rank";
                                } else if (Intrinsics.EZpvd(tag, Integer.valueOf(qZH.PendingIntent.RKDWNf))) {
                                    str = "up-rank";
                                } else if (Intrinsics.EZpvd(tag, Integer.valueOf(qZH.PendingIntent.RcXXUw))) {
                                    str = "new-coin-rank";
                                } else if (Intrinsics.EZpvd(tag, Integer.valueOf(qZH.PendingIntent.DKtBnz))) {
                                    str = "dex-rank";
                                } else if (Intrinsics.EZpvd(tag, Integer.valueOf(qZH.PendingIntent.GqbzPL))) {
                                    str = "stock-rank";
                                }
                            }
                        }
                    }
                    this.copydefault.getChildFragmentManager().setFragmentResult("REQUEST_CLICK_ARROW", BundleKt.bundleOf(C56390yDp.OLrzqt("type", str)));
                    return;
                }
                this.copydefault.startActivity(new Intent(this.AEQbTJ.getContext(), (Class<?>) ActivityC34993nmt.class));
            }
        }
    }

    public static final boolean values(MarketHomeV2Fragment marketHomeV2Fragment) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNrOLrzqt, null, 1, null) || interfaceC54581xNrOLrzqt.AEQbTJ(new xNF()) || interfaceC54581xNrOLrzqt.AEQbTJ(new xNE()))) {
            pUU.KWHzl(marketHomeV2Fragment.getTAG(), "iDleHandler: ready getData ");
            marketHomeV2Fragment.ejfBZ();
        } else {
            pUU.KWHzl(marketHomeV2Fragment.getTAG(), "iDleHandler: not ready, queuing for data ");
            marketHomeV2Fragment.EZpvd(true);
        }
        marketHomeV2Fragment.fARcdN();
        marketHomeV2Fragment.iwGUEr();
        return false;
    }

    public static final boolean fJNWhG(MarketHomeV2Fragment marketHomeV2Fragment) {
        marketHomeV2Fragment.fJNWhG();
        return false;
    }

    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        public StateListAnimator() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                MarketHomeV2Fragment marketHomeV2Fragment = MarketHomeV2Fragment.this;
                marketHomeV2Fragment.copydefault(tab.getPosition());
                if (Intrinsics.EZpvd(tab.getTag(), Integer.valueOf(qZH.PendingIntent.QKVWgx))) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(marketHomeV2Fragment), null, null, new MarketHomeV2Fragment$tabSelectedListener$1$onTabSelected$1$1(tab, marketHomeV2Fragment, null), 3, null);
                    marketHomeV2Fragment.EZpvd(tab, true);
                    marketHomeV2Fragment.zLjUOn();
                }
                Object tag = tab.getTag();
                marketHomeV2Fragment.EZpvd(tag instanceof Integer ? (Integer) tag : null);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            ImageView imageViewEZpvd;
            Object tag = tab != null ? tab.getTag() : null;
            if (Intrinsics.EZpvd(tag, Integer.valueOf(qZH.PendingIntent.QKVWgx))) {
                ImageView imageViewEZpvd2 = C55243xgK.EZpvd(tab);
                if (imageViewEZpvd2 != null) {
                    imageViewEZpvd2.setVisibility(8);
                }
                MarketHomeV2Fragment.this.EZpvd(tab, false);
                return;
            }
            if (Intrinsics.EZpvd(tag, Integer.valueOf(qZH.PendingIntent.UeEOUB))) {
                ImageView imageViewEZpvd3 = C55243xgK.EZpvd(tab);
                if (imageViewEZpvd3 != null) {
                    imageViewEZpvd3.setVisibility(8);
                    return;
                }
                return;
            }
            if (!Intrinsics.EZpvd(tag, Integer.valueOf(qZH.PendingIntent.RKDWNf)) || (imageViewEZpvd = C55243xgK.EZpvd(tab)) == null) {
                return;
            }
            imageViewEZpvd.setVisibility(8);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(final TabLayout.Tab tab) {
            ImageView imageViewEZpvd;
            if (tab == null || (imageViewEZpvd = C55243xgK.EZpvd(tab)) == null || imageViewEZpvd.getVisibility() != 0 || !Intrinsics.EZpvd(tab.getTag(), Integer.valueOf(qZH.PendingIntent.QKVWgx))) {
                return;
            }
            InterfaceC27808kEb interfaceC27808kEbEZpvd = C27807kEa.EZpvd(MarketHomeV2Fragment.this);
            if (interfaceC27808kEbEZpvd != null) {
                interfaceC27808kEbEZpvd.ba_();
            }
            ImageView imageViewEZpvd2 = C55243xgK.EZpvd(tab);
            if (imageViewEZpvd2 != null) {
                imageViewEZpvd2.setImageResource(C52761wXj.TaskDescription.dUDNAs);
            }
            C46665tbU.Application application = C46665tbU.Companion;
            FragmentManager childFragmentManager = MarketHomeV2Fragment.this.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            application.EZpvd(childFragmentManager, new Function0() { // from class: o.taw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MarketHomeV2Fragment.StateListAnimator.copydefault(tab);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit copydefault(TabLayout.Tab tab) {
            ImageView imageViewEZpvd = C55243xgK.EZpvd(tab);
            if (imageViewEZpvd != null) {
                imageViewEZpvd.setImageResource(C52761wXj.TaskDescription.QSLkRj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        ViewPager2 viewPager2;
        Intrinsics.checkNotNullParameter(view, "");
        qZO qzoKWHzl = qZO.KWHzl(view);
        AEQbTJ(qzoKWHzl.AEQbTJ, (C55113xdn) null, qzoKWHzl.KWHzl);
        this.fetchVPNInfo = qzoKWHzl;
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("event_update_layout");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function1 = new Function1() { // from class: o.tao
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketHomeV2Fragment.copydefault(this.copydefault, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.taq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MarketHomeV2Fragment.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.tap
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketHomeV2Fragment.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.tav
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MarketHomeV2Fragment.copydefault(function12, obj);
            }
        });
        qZO qzo = this.fetchVPNInfo;
        if (qzo != null && (viewPager2 = qzo.valueOf) != null) {
            viewPager2.setOffscreenPageLimit(-1);
        }
        Looper.myQueue().addIdleHandler(this.AubY);
    }

    public static final void OLrzqt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(MarketHomeV2Fragment marketHomeV2Fragment, String str) {
        pUU.EZpvd("TransformViewPager", "MarketHomeV2Fragment->onEvent:" + str);
        C46689tbs c46689tbs = marketHomeV2Fragment.getNewProxyInstance;
        if (c46689tbs != null) {
            c46689tbs.KWHzl();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Throwable th) {
        pUU.copydefault("TransformViewPager", "onEvent:" + th);
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AubY().OLrzqt("SP_KEY_FAVORITE_TYPE_STR");
        if (!C55608xnE.OLrzqt()) {
            AubY().OLrzqt();
        }
        C46688tbr.registerTradeFragmentTrack$default(C46688tbr.KWHzl, this, "MarketHomeV2Fragment", new Pair[0], null, 4, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okmarket.home.MarketHomeV2Fragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object createMarkets$default(MarketHomeV2Fragment marketHomeV2Fragment, FragmentStateAdapter fragmentStateAdapter, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return marketHomeV2Fragment.copydefault(fragmentStateAdapter, (Function1<? super Continuation<? super Unit>, ? extends Object>) function1, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x013a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(FragmentStateAdapter fragmentStateAdapter, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Unit> continuation) throws Throwable {
        MarketHomeV2Fragment$createMarkets$1 marketHomeV2Fragment$createMarkets$1;
        ViewPager2 viewPager2;
        C55244xgL c55244xgL;
        C55244xgL c55244xgL2;
        ViewPager2 viewPager22;
        Function1<? super Continuation<? super Unit>, ? extends Object> function12;
        MarketHomeV2Fragment marketHomeV2Fragment;
        FragmentStateAdapter fragmentStateAdapter2;
        C55244xgL c55244xgL3;
        C55244xgL c55244xgL4;
        C55244xgL c55244xgL5;
        ViewPager2 viewPager23;
        MainCoroutineDispatcher main;
        MarketHomeV2Fragment$createMarkets$4$1$1 marketHomeV2Fragment$createMarkets$4$1$1;
        if (continuation instanceof MarketHomeV2Fragment$createMarkets$1) {
            marketHomeV2Fragment$createMarkets$1 = (MarketHomeV2Fragment$createMarkets$1) continuation;
            int i = marketHomeV2Fragment$createMarkets$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketHomeV2Fragment$createMarkets$1.label = i - Integer.MIN_VALUE;
            } else {
                marketHomeV2Fragment$createMarkets$1 = new MarketHomeV2Fragment$createMarkets$1(this, continuation);
            }
        }
        MarketHomeV2Fragment$createMarkets$1 marketHomeV2Fragment$createMarkets$12 = marketHomeV2Fragment$createMarkets$1;
        Object objWithContext = marketHomeV2Fragment$createMarkets$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketHomeV2Fragment$createMarkets$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            this.isConnected = fragmentStateAdapter;
            qZO qzo = this.fetchVPNInfo;
            if (qzo != null && (viewPager23 = qzo.valueOf) != null) {
                C46689tbs c46689tbs = this.getNewProxyInstance;
                if (c46689tbs != null) {
                    c46689tbs.EZpvd();
                }
                C46689tbs c46689tbs2 = new C46689tbs(viewPager23);
                this.getNewProxyInstance = c46689tbs2;
                c46689tbs2.KWHzl(fragmentStateAdapter);
            }
            qZO qzo2 = this.fetchVPNInfo;
            if (qzo2 != null && (c55244xgL5 = qzo2.OLrzqt) != null) {
                c55244xgL5.EZpvd(this.getFieldNames);
            }
            qZO qzo3 = this.fetchVPNInfo;
            if (qzo3 != null && (c55244xgL4 = qzo3.OLrzqt) != null) {
                c55244xgL4.copydefault(this.getFieldNames);
            }
            qZO qzo4 = this.fetchVPNInfo;
            if (qzo4 != null && (c55244xgL3 = qzo4.OLrzqt) != null) {
                c55244xgL3.EZpvd().setVisibility(0);
                c55244xgL3.EZpvd().removeAllViews();
                ImageView imageView = new ImageView(c55244xgL3.getContext());
                imageView.setImageResource(C52761wXj.TaskDescription.DGOPHZDGOPHZ);
                imageView.setContentDescription("homeMarketRankMoreButton");
                imageView.setPadding(0, C55298xhM.dpInt$default(10, (Context) null, 1, (Object) null), 0, C55298xhM.dpInt$default(10, (Context) null, 1, (Object) null));
                imageView.setContentDescription("homeMarketRankMoreButton");
                imageView.setOnClickListener(new Activity(imageView, 1000L, imageView, this));
                c55244xgL3.copydefault(imageView);
            }
            qZO qzo5 = this.fetchVPNInfo;
            if (qzo5 != null && (viewPager2 = qzo5.valueOf) != null && qzo5 != null && (c55244xgL = qzo5.OLrzqt) != null) {
                CoroutineDispatcher coroutineDispatcherAEQbTJ = C40440qVy.Companion.AEQbTJ();
                MarketHomeV2Fragment$createMarkets$4$1$currentUserGroupVo$1 marketHomeV2Fragment$createMarkets$4$1$currentUserGroupVo$1 = new MarketHomeV2Fragment$createMarkets$4$1$currentUserGroupVo$1(null);
                marketHomeV2Fragment$createMarkets$12.L$0 = this;
                marketHomeV2Fragment$createMarkets$12.L$1 = fragmentStateAdapter;
                marketHomeV2Fragment$createMarkets$12.L$2 = function1;
                marketHomeV2Fragment$createMarkets$12.L$3 = viewPager2;
                marketHomeV2Fragment$createMarkets$12.L$4 = c55244xgL;
                marketHomeV2Fragment$createMarkets$12.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, marketHomeV2Fragment$createMarkets$4$1$currentUserGroupVo$1, marketHomeV2Fragment$createMarkets$12);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                c55244xgL2 = c55244xgL;
                viewPager22 = viewPager2;
                function12 = function1;
                marketHomeV2Fragment = this;
                fragmentStateAdapter2 = fragmentStateAdapter;
                UserGroupVo userGroupVo = (UserGroupVo) objWithContext;
                main = Dispatchers.getMain();
                marketHomeV2Fragment$createMarkets$4$1$1 = new MarketHomeV2Fragment$createMarkets$4$1$1(marketHomeV2Fragment, c55244xgL2, viewPager22, fragmentStateAdapter2, userGroupVo, function12, null);
                marketHomeV2Fragment$createMarkets$12.L$0 = null;
                marketHomeV2Fragment$createMarkets$12.L$1 = null;
                marketHomeV2Fragment$createMarkets$12.L$2 = null;
                marketHomeV2Fragment$createMarkets$12.L$3 = null;
                marketHomeV2Fragment$createMarkets$12.L$4 = null;
                marketHomeV2Fragment$createMarkets$12.label = 2;
                if (BuildersKt.withContext(main, marketHomeV2Fragment$createMarkets$4$1$1, marketHomeV2Fragment$createMarkets$12) == objCopydefault) {
                }
            }
        } else if (i2 == 1) {
            C55244xgL c55244xgL6 = (C55244xgL) marketHomeV2Fragment$createMarkets$12.L$4;
            ViewPager2 viewPager24 = (ViewPager2) marketHomeV2Fragment$createMarkets$12.L$3;
            Function1<? super Continuation<? super Unit>, ? extends Object> function13 = (Function1) marketHomeV2Fragment$createMarkets$12.L$2;
            FragmentStateAdapter fragmentStateAdapter3 = (FragmentStateAdapter) marketHomeV2Fragment$createMarkets$12.L$1;
            MarketHomeV2Fragment marketHomeV2Fragment2 = (MarketHomeV2Fragment) marketHomeV2Fragment$createMarkets$12.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            c55244xgL2 = c55244xgL6;
            viewPager22 = viewPager24;
            function12 = function13;
            fragmentStateAdapter2 = fragmentStateAdapter3;
            marketHomeV2Fragment = marketHomeV2Fragment2;
            UserGroupVo userGroupVo2 = (UserGroupVo) objWithContext;
            main = Dispatchers.getMain();
            marketHomeV2Fragment$createMarkets$4$1$1 = new MarketHomeV2Fragment$createMarkets$4$1$1(marketHomeV2Fragment, c55244xgL2, viewPager22, fragmentStateAdapter2, userGroupVo2, function12, null);
            marketHomeV2Fragment$createMarkets$12.L$0 = null;
            marketHomeV2Fragment$createMarkets$12.L$1 = null;
            marketHomeV2Fragment$createMarkets$12.L$2 = null;
            marketHomeV2Fragment$createMarkets$12.L$3 = null;
            marketHomeV2Fragment$createMarkets$12.L$4 = null;
            marketHomeV2Fragment$createMarkets$12.label = 2;
            if (BuildersKt.withContext(main, marketHomeV2Fragment$createMarkets$4$1$1, marketHomeV2Fragment$createMarkets$12) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(TabLayout.Tab tab) {
        tab.view.setLongClickable(false);
        TabLayout.TabView tabView = tab.view;
        Intrinsics.checkNotNullExpressionValue(tabView, "");
        TextView textViewOLrzqt = OLrzqt(tabView);
        if (textViewOLrzqt != null) {
            textViewOLrzqt.setLongClickable(false);
        }
        TooltipCompat.setTooltipText(tab.view, "");
        TabLayout.TabView tabView2 = tab.view;
        Intrinsics.checkNotNullExpressionValue(tabView2, "");
        TextView textViewOLrzqt2 = OLrzqt(tabView2);
        if (textViewOLrzqt2 != null) {
            TooltipCompat.setTooltipText(textViewOLrzqt2, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView OLrzqt(ViewGroup viewGroup) {
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

    public final void copydefault(int i) {
        if (i == KWHzl(qZH.PendingIntent.RcXXUw).getSecond().intValue()) {
            uzCIH();
            return;
        }
        if (i == KWHzl(qZH.PendingIntent.DKtBnz).getSecond().intValue()) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), C40440qVy.Companion.AEQbTJ(), null, new MarketHomeV2Fragment$hideDot$1(null), 2, null);
        } else if (i == KWHzl(qZH.PendingIntent.GqbzPL).getSecond().intValue()) {
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), C40440qVy.Companion.AEQbTJ(), null, new MarketHomeV2Fragment$hideDot$2(null), 2, null);
        }
    }

    private final void getNewProxyInstance() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new MarketHomeV2Fragment$dealPageType$1(this, null), 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okmarket.home.MarketHomeV2Fragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object fillVp$default(MarketHomeV2Fragment marketHomeV2Fragment, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return marketHomeV2Fragment.KWHzl((Function1<? super Continuation<? super Unit>, ? extends Object>) function1, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Unit> continuation) throws Throwable {
        MarketHomeV2Fragment$fillVp$1 marketHomeV2Fragment$fillVp$1;
        ViewPager2 viewPager2;
        MarketHomeV2Fragment marketHomeV2Fragment;
        Function1<? super Continuation<? super Unit>, ? extends Object> function12;
        ViewPager2 viewPager22;
        sZU szu;
        if (continuation instanceof MarketHomeV2Fragment$fillVp$1) {
            marketHomeV2Fragment$fillVp$1 = (MarketHomeV2Fragment$fillVp$1) continuation;
            int i = marketHomeV2Fragment$fillVp$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketHomeV2Fragment$fillVp$1.label = i - Integer.MIN_VALUE;
            } else {
                marketHomeV2Fragment$fillVp$1 = new MarketHomeV2Fragment$fillVp$1(this, continuation);
            }
        }
        Object obj = marketHomeV2Fragment$fillVp$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketHomeV2Fragment$fillVp$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            qZO qzo = this.fetchVPNInfo;
            if (qzo != null && (viewPager2 = qzo.valueOf) != null) {
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                MarketHomeV2Fragment$fillVp$2$tabs$1 marketHomeV2Fragment$fillVp$2$tabs$1 = new MarketHomeV2Fragment$fillVp$2$tabs$1(this, null);
                marketHomeV2Fragment$fillVp$1.L$0 = this;
                marketHomeV2Fragment$fillVp$1.L$1 = function1;
                marketHomeV2Fragment$fillVp$1.L$2 = viewPager2;
                marketHomeV2Fragment$fillVp$1.label = 1;
                Object objWithContext = BuildersKt.withContext(coroutineDispatcher, marketHomeV2Fragment$fillVp$2$tabs$1, marketHomeV2Fragment$fillVp$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                marketHomeV2Fragment = this;
                function12 = function1;
                viewPager22 = viewPager2;
                obj = objWithContext;
                FragmentManager childFragmentManager = marketHomeV2Fragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                szu = new sZU(childFragmentManager, marketHomeV2Fragment, viewPager22, (List) obj);
                marketHomeV2Fragment$fillVp$1.L$0 = null;
                marketHomeV2Fragment$fillVp$1.L$1 = null;
                marketHomeV2Fragment$fillVp$1.L$2 = null;
                marketHomeV2Fragment$fillVp$1.label = 2;
                if (marketHomeV2Fragment.copydefault(szu, function12, marketHomeV2Fragment$fillVp$1) == objCopydefault) {
                }
            }
        } else if (i2 == 1) {
            viewPager22 = (ViewPager2) marketHomeV2Fragment$fillVp$1.L$2;
            function12 = (Function1) marketHomeV2Fragment$fillVp$1.L$1;
            marketHomeV2Fragment = (MarketHomeV2Fragment) marketHomeV2Fragment$fillVp$1.L$0;
            C56391yDq.AEQbTJ(obj);
            FragmentManager childFragmentManager2 = marketHomeV2Fragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
            szu = new sZU(childFragmentManager2, marketHomeV2Fragment, viewPager22, (List) obj);
            marketHomeV2Fragment$fillVp$1.L$0 = null;
            marketHomeV2Fragment$fillVp$1.L$1 = null;
            marketHomeV2Fragment$fillVp$1.L$2 = null;
            marketHomeV2Fragment$fillVp$1.label = 2;
            if (marketHomeV2Fragment.copydefault(szu, function12, marketHomeV2Fragment$fillVp$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    private final void zsXlph() {
        if (this.isConnected != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketHomeV2Fragment$savePageType$1(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pWJ hDKMBd() {
        ViewPager2 viewPager2;
        qZO qzo = this.fetchVPNInfo;
        RecyclerView.Adapter adapter = (qzo == null || (viewPager2 = qzo.valueOf) == null) ? null : viewPager2.getAdapter();
        if (adapter instanceof pWJ) {
            return (pWJ) adapter;
        }
        return null;
    }

    public static /* synthetic */ void getNewCoinNumbers$default(MarketHomeV2Fragment marketHomeV2Fragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        marketHomeV2Fragment.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        this.ejfBZ.removeCallbacks(this.fIwbmz);
        if (z) {
            this.ejfBZ.postDelayed(this.fIwbmz, 3000L);
        } else {
            this.ejfBZ.post(this.fIwbmz);
        }
    }

    public static final void isConnected(MarketHomeV2Fragment marketHomeV2Fragment) {
        Looper.myQueue().removeIdleHandler(marketHomeV2Fragment.AuCTel);
        Looper.myQueue().addIdleHandler(marketHomeV2Fragment.AuCTel);
    }

    public final void ejfBZ() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketHomeV2Fragment$getNewCoinImpl$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<TabLayout.Tab, Integer> KWHzl(@StringRes int i) {
        C55244xgL c55244xgL;
        TabLayout tabLayoutAYXKKw;
        C55244xgL c55244xgL2;
        TabLayout tabLayoutAYXKKw2;
        if (isAdded()) {
            qZO qzo = this.fetchVPNInfo;
            int tabCount = (qzo == null || (c55244xgL2 = qzo.OLrzqt) == null || (tabLayoutAYXKKw2 = c55244xgL2.AYXKKw()) == null) ? 0 : tabLayoutAYXKKw2.getTabCount();
            for (int i2 = 0; i2 < tabCount; i2++) {
                qZO qzo2 = this.fetchVPNInfo;
                TabLayout.Tab tabAt = (qzo2 == null || (c55244xgL = qzo2.OLrzqt) == null || (tabLayoutAYXKKw = c55244xgL.AYXKKw()) == null) ? null : tabLayoutAYXKKw.getTabAt(i2);
                if (tabAt != null && Intrinsics.EZpvd(tabAt.getTag(), Integer.valueOf(i))) {
                    return C56390yDp.OLrzqt(tabAt, Integer.valueOf(i2));
                }
            }
            return C56390yDp.OLrzqt(null, -1);
        }
        return C56390yDp.OLrzqt(null, -1);
    }

    public final Object OLrzqt(Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(C40440qVy.Companion.AEQbTJ(), new MarketHomeV2Fragment$checkNewCoinInfo$2(this, null), continuation);
    }

    public final void uzCIH() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), C40440qVy.Companion.AEQbTJ(), null, new MarketHomeV2Fragment$writeRedHotReaded$1(null), 2, null);
    }

    public final Object KWHzl(@NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(C40440qVy.Companion.AEQbTJ(), new MarketHomeV2Fragment$checkNewCoinFuturesRedDot$2(this, null), continuation);
    }

    public final void getFieldNames() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), C40440qVy.Companion.AEQbTJ(), null, new MarketHomeV2Fragment$writeFuturesRedHotRead$1(null), 2, null);
    }

    public final void fARcdN() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getMain(), null, new MarketHomeV2Fragment$showDexTabRedDot$1(this, null), 2, null);
    }

    public final void iwGUEr() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getMain(), null, new MarketHomeV2Fragment$showStockTabRedDot$1(this, null), 2, null);
    }

    @Override // o.AbstractC33006moM, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewPager2 viewPager2;
        qZO qzo = this.fetchVPNInfo;
        if (qzo != null && (viewPager2 = qzo.valueOf) != null) {
            viewPager2.setAdapter(null);
        }
        TabLayoutMediator tabLayoutMediator = this.iwGUEr;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        C46689tbs c46689tbs = this.getNewProxyInstance;
        if (c46689tbs != null) {
            c46689tbs.EZpvd();
        }
        this.fetchVPNInfo = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.ejfBZ.removeCallbacksAndMessages(null);
        Looper.myQueue().removeIdleHandler(this.AuCTel);
        Looper.myQueue().removeIdleHandler(this.AubY);
        SubHelper.AEQbTJ(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(Function1<? super List<NewCoinInfo>, Unit> function1, Continuation<? super Unit> continuation) throws Throwable {
        MarketHomeV2Fragment$getNewCoinNumbers$1 marketHomeV2Fragment$getNewCoinNumbers$1;
        NewCoinInfo newCoinInfo;
        if (continuation instanceof MarketHomeV2Fragment$getNewCoinNumbers$1) {
            marketHomeV2Fragment$getNewCoinNumbers$1 = (MarketHomeV2Fragment$getNewCoinNumbers$1) continuation;
            int i = marketHomeV2Fragment$getNewCoinNumbers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketHomeV2Fragment$getNewCoinNumbers$1.label = i - Integer.MIN_VALUE;
            } else {
                marketHomeV2Fragment$getNewCoinNumbers$1 = new MarketHomeV2Fragment$getNewCoinNumbers$1(this, continuation);
            }
        }
        Object objCopydefault = marketHomeV2Fragment$getNewCoinNumbers$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = marketHomeV2Fragment$getNewCoinNumbers$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            CountingBannerViewModel countingBannerViewModelIsConnected = isConnected();
            marketHomeV2Fragment$getNewCoinNumbers$1.L$0 = function1;
            marketHomeV2Fragment$getNewCoinNumbers$1.label = 1;
            objCopydefault = copydefault(countingBannerViewModelIsConnected, marketHomeV2Fragment$getNewCoinNumbers$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) marketHomeV2Fragment$getNewCoinNumbers$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        InterfaceC49371unL<NewCoinInfo> interfaceC49371unLEZpvd = ((CountingBannerViewModel.Activity) objCopydefault).EZpvd();
        if (!(interfaceC49371unLEZpvd instanceof InterfaceC49371unL.Activity)) {
            interfaceC49371unLEZpvd = null;
        }
        InterfaceC49371unL.Activity activity = interfaceC49371unLEZpvd instanceof InterfaceC49371unL.Activity ? (InterfaceC49371unL.Activity) interfaceC49371unLEZpvd : null;
        if (activity != null && (newCoinInfo = (NewCoinInfo) activity.copydefault()) != null) {
            function1.invoke(C56402yEa.EZpvd(newCoinInfo));
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        zsXlph();
    }

    /* JADX INFO: renamed from: com.okinc.okmarket.home.MarketHomeV2Fragment$onResume$1, reason: invalid class name */
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

    @Override // o.AbstractC33006moM, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), C40440qVy.Companion.AEQbTJ(), null, new AnonymousClass1(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass2(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.okmarket.home.MarketHomeV2Fragment$onResume$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                this.L$0 = coroutineScope;
                this.label = 1;
                if (DelayKt.delay(2500L, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    ((Result) obj).m7386unboximpl();
                    return Unit.INSTANCE;
                }
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            if (CoroutineScopeKt.isActive(coroutineScope) && ((interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt()) == null || (!InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNrOLrzqt, null, 1, null) && !interfaceC54581xNrOLrzqt.AEQbTJ(new xNF()) && !interfaceC54581xNrOLrzqt.AEQbTJ(new xNE())))) {
                InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
                xNE xne = new xNE();
                this.L$0 = null;
                this.label = 2;
                if (interfaceC54577xNnKWHzl.AEQbTJ(false, xne, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractC33006moM
    public void djBIcL() {
        super.djBIcL();
    }

    @Override // o.AbstractC33006moM
    public void AhwBna() {
        super.AhwBna();
        getNewProxyInstance();
        pUU.KWHzl(getTAG(), "loadGroupData request from onLazyLoad");
        fIwbmz();
    }

    public final void fIwbmz() {
        MarketHomeV2ViewModel.loadGroupData$default(AubY(), false, 1, null);
    }

    /* JADX INFO: renamed from: com.okinc.okmarket.home.MarketHomeV2Fragment$setListener$2, reason: invalid class name and case insensitive filesystem */
    public static final class C17442 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends MarketHomeV2ViewModel.TaskDescription>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17442(Continuation<? super C17442> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17442 c17442 = MarketHomeV2Fragment.this.new C17442(continuation);
            c17442.L$0 = obj;
            return c17442;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends MarketHomeV2ViewModel.TaskDescription> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC49371unL<MarketHomeV2ViewModel.TaskDescription>) interfaceC49371unL, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC49371unL<MarketHomeV2ViewModel.TaskDescription> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return ((C17442) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                    C27986kKr c27986kKr = C27986kKr.AEQbTJ;
                    InterfaceC49371unL.Application application = (InterfaceC49371unL.Application) interfaceC49371unL;
                    String message = application.AEQbTJ().getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    c27986kKr.OLrzqt("market_home_error_view", C56423yEv.EZpvd(C56390yDp.OLrzqt("isAppDebuggable", message)));
                    String tag = MarketHomeV2Fragment.this.getTAG();
                    String message2 = application.AEQbTJ().getMessage();
                    pUU.KWHzl(tag, "updateUiState error: " + (message2 != null ? message2 : "unknown"));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, AubY(), new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.home.MarketHomeV2Fragment.setListener.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketHomeV2ViewModel.ActionBar) obj).KWHzl();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketHomeV2ViewModel.ActionBar) obj).KWHzl((InterfaceC49371unL) obj2);
            }
        }, null, new C17442(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketHomeV2Fragment$setListener$$inlined$repeatOnLifecycleResume$1(this, Lifecycle.State.RESUMED, null, this), 3, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, isConnected(), null, new AnonymousClass4(null), 1, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, AubY(), new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.home.MarketHomeV2Fragment.setListener.5
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketHomeV2ViewModel.ActionBar) obj).OLrzqt();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketHomeV2ViewModel.ActionBar) obj).OLrzqt((UserGroupVo) obj2);
            }
        }, null, new AnonymousClass6(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass7(null), 3, null);
        getChildFragmentManager().setFragmentResultListener(C46725tcb.class.getSimpleName(), this, new FragmentResultListener() { // from class: o.tan
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                MarketHomeV2Fragment.AEQbTJ(this.AEQbTJ, str, bundle);
            }
        });
        getChildFragmentManager().setFragmentResultListener("REQUEST_HOME_ERROR_RETRY", this, new FragmentResultListener() { // from class: o.tam
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                MarketHomeV2Fragment.OLrzqt(this.AEQbTJ, str, bundle);
            }
        });
        final String[] strArr = {"event_home_page_refresh"};
        getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.okmarket.home.MarketHomeV2Fragment$setListener$$inlined$repeatListenRxEventOnResume$1
            public InterfaceC58217yxC AEQbTJ;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onResume(lifecycleOwner);
                String[] strArr2 = strArr;
                AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ((String[]) Arrays.copyOf(strArr2, strArr2.length));
                final MarketHomeV2Fragment marketHomeV2Fragment = this;
                this.AEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM(new Function1<String, Unit>() { // from class: com.okinc.okmarket.home.MarketHomeV2Fragment$setListener$$inlined$repeatListenRxEventOnResume$1.2
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(String str) {
                        AEQbTJ(str);
                        return Unit.INSTANCE;
                    }

                    public final void AEQbTJ(String str) {
                        Intrinsics.copydefault((Object) str);
                        marketHomeV2Fragment.zLjUOn();
                    }
                }) { // from class: o.jSA.BroadcastReceiver
                    public final /* synthetic */ Function1 AEQbTJ;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public BroadcastReceiver(Function1 function1) {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.AEQbTJ = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.AEQbTJ.invoke(obj);
                    }
                }, new InterfaceC58227yxM(new Function1<Throwable, Unit>() { // from class: com.okinc.okmarket.home.MarketHomeV2Fragment$setListener$$inlined$repeatListenRxEventOnResume$1.3
                    public final void EZpvd(Throwable th) {
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(Throwable th) {
                        EZpvd(th);
                        return Unit.INSTANCE;
                    }
                }) { // from class: o.jSA.BroadcastReceiver
                    public final /* synthetic */ Function1 AEQbTJ;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public BroadcastReceiver(Function1 function1) {
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
                InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                super.onPause(lifecycleOwner);
            }
        });
        OLrzqt((InterfaceC49363unD) this);
    }

    /* JADX INFO: renamed from: com.okinc.okmarket.home.MarketHomeV2Fragment$setListener$4, reason: invalid class name */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CountingBannerViewModel.Activity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = MarketHomeV2Fragment.this.new AnonymousClass4(continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CountingBannerViewModel.Activity activity, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(activity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (((CountingBannerViewModel.Activity) this.L$0).EZpvd() instanceof InterfaceC49371unL.Activity) {
                    MarketHomeV2Fragment.getNewCoinNumbers$default(MarketHomeV2Fragment.this, false, 1, null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.okmarket.home.MarketHomeV2Fragment$setListener$6, reason: invalid class name */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<UserGroupVo, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass6(Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass6 anonymousClass6 = MarketHomeV2Fragment.this.new AnonymousClass6(continuation);
            anonymousClass6.L$0 = obj;
            return anonymousClass6;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UserGroupVo userGroupVo, Continuation<? super Unit> continuation) {
            return ((AnonymousClass6) create(userGroupVo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            UserGroupVo userGroupVo;
            MarketHomeV2Fragment marketHomeV2Fragment;
            UserGroupVo userGroupVo2;
            TabLayout.Tab tab;
            String strEZpvd;
            ImageView imageViewEZpvd;
            View view;
            TabLayout.Tab tab2;
            MarketHomeV2Fragment marketHomeV2Fragment2;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                userGroupVo = (UserGroupVo) this.L$0;
                if (userGroupVo != null) {
                    marketHomeV2Fragment = MarketHomeV2Fragment.this;
                    CoroutineDispatcher coroutineDispatcherAEQbTJ = C40440qVy.Companion.AEQbTJ();
                    MarketHomeV2Fragment$setListener$6$1$1 marketHomeV2Fragment$setListener$6$1$1 = new MarketHomeV2Fragment$setListener$6$1$1(userGroupVo, null);
                    this.L$0 = userGroupVo;
                    this.L$1 = marketHomeV2Fragment;
                    this.L$2 = userGroupVo;
                    this.label = 1;
                    if (BuildersKt.withContext(coroutineDispatcherAEQbTJ, marketHomeV2Fragment$setListener$6$1$1, this) == objCopydefault) {
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
                marketHomeV2Fragment2 = (MarketHomeV2Fragment) this.L$0;
                C56391yDq.AEQbTJ(obj);
                List list = (List) obj;
                view.setVisibility((list == null && (list.isEmpty() ^ true)) ? 0 : 8);
                tab = tab2;
                marketHomeV2Fragment = marketHomeV2Fragment2;
                marketHomeV2Fragment.EZpvd(tab, tab.isSelected());
                return Unit.INSTANCE;
            }
            userGroupVo = (UserGroupVo) this.L$2;
            MarketHomeV2Fragment marketHomeV2Fragment3 = (MarketHomeV2Fragment) this.L$1;
            userGroupVo2 = (UserGroupVo) this.L$0;
            C56391yDq.AEQbTJ(obj);
            marketHomeV2Fragment = marketHomeV2Fragment3;
            tab = (TabLayout.Tab) marketHomeV2Fragment.KWHzl(qZH.PendingIntent.QKVWgx).getFirst();
            if (tab != null) {
                if (!Intrinsics.EZpvd((Object) userGroupVo.getUserGroup().getGroupName(), (Object) "ALL")) {
                    strEZpvd = marketHomeV2Fragment.EZpvd(userGroupVo2.getUserGroup().getTranslatedGroupName());
                } else {
                    strEZpvd = C33070mpX.AYXKKw(qZH.PendingIntent.QKVWgx);
                }
                tab.setText(strEZpvd);
                if (tab.isSelected() && (imageViewEZpvd = C55243xgK.EZpvd(tab)) != null) {
                    MarketHomeV2ViewModel marketHomeV2ViewModelAubY = marketHomeV2Fragment.AubY();
                    this.L$0 = marketHomeV2Fragment;
                    this.L$1 = tab;
                    this.L$2 = imageViewEZpvd;
                    this.label = 2;
                    Object objEZpvd = marketHomeV2ViewModelAubY.EZpvd(this);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    view = imageViewEZpvd;
                    tab2 = tab;
                    marketHomeV2Fragment2 = marketHomeV2Fragment;
                    obj = objEZpvd;
                    List list2 = (List) obj;
                    if (list2 == null) {
                        view.setVisibility((list2 == null && (list2.isEmpty() ^ true)) ? 0 : 8);
                        tab = tab2;
                        marketHomeV2Fragment = marketHomeV2Fragment2;
                    }
                }
                marketHomeV2Fragment.EZpvd(tab, tab.isSelected());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.okmarket.home.MarketHomeV2Fragment$setListener$7, reason: invalid class name */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass7(Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarketHomeV2Fragment.this.new AnonymousClass7(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.okmarket.home.MarketHomeV2Fragment$setListener$7$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC47263tmj, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MarketHomeV2Fragment this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MarketHomeV2Fragment marketHomeV2Fragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = marketHomeV2Fragment;
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
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                try {
                } catch (Exception e) {
                    pUU.copydefault(this.this$0.getTAG(), "Failed to refresh ViewPager on account switch: " + e.getMessage());
                }
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    if (((AbstractC47263tmj) this.L$0) instanceof AbstractC47263tmj.StateListAnimator) {
                        pUU.KWHzl(this.this$0.getTAG(), "loadGroupData request by userManager Switched");
                        MarketHomeV2Fragment marketHomeV2Fragment = this.this$0;
                        this.label = 1;
                        if (MarketHomeV2Fragment.fillVp$default(marketHomeV2Fragment, null, this, 1, null) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                this.this$0.fIwbmz();
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow<AbstractC47263tmj> flowFIwbmz = MarketHomeV2Fragment.this.AuCTel().fIwbmz();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MarketHomeV2Fragment.this, null);
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

    public static final void AEQbTJ(MarketHomeV2Fragment marketHomeV2Fragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        LifecycleOwner viewLifecycleOwner = marketHomeV2Fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MarketHomeV2Fragment$setListener$8$1(bundle, marketHomeV2Fragment, null), 3, null);
    }

    public static final void OLrzqt(MarketHomeV2Fragment marketHomeV2Fragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        marketHomeV2Fragment.zLjUOn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zLjUOn() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MarketHomeV2Fragment$requestDataWhenError$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
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

    /* JADX INFO: Access modifiers changed from: private */
    public final String EZpvd(String str) {
        return takeVisual$default(this, str, 12, null, 2, null);
    }

    public final void EZpvd(Integer num) {
        if (this.fARcdN) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketHomeV2Fragment$addTabClickEvent$1(num, this, null), 3, null);
        }
    }

    public static /* synthetic */ String takeVisual$default(MarketHomeV2Fragment marketHomeV2Fragment, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = "...";
        }
        return marketHomeV2Fragment.OLrzqt(str, i, str2);
    }

    private final String OLrzqt(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            i2 += OLrzqt(cCharAt) ? 2 : 1;
            if (i2 > i) {
                return ((Object) sb) + str2;
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private final boolean OLrzqt(char c) {
        return Character.isIdeographic(c);
    }

    @Override // o.AbstractC46624tag, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        KWHzl((Fragment) this);
        copydefault((Fragment) this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        DbNXlk();
        fetchVPNInfo();
    }

    public final void fJNWhG() {
        if (C27563jxZ.OLrzqt.gEmmrt()) {
            pUU.KWHzl(getTAG(), "init CallAuction Ws");
            Object objCopydefault = C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC44589sZl.class);
            Intrinsics.checkNotNullExpressionValue(objCopydefault, "");
            ((InterfaceC44589sZl) objCopydefault).DrNnAm().copydefault();
        }
    }
}
