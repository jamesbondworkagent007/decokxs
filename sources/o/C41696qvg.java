package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.market.ext.UpDownColor;
import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import com.okinc.market.ranking.core.model.RankingNewSpotVo;
import com.okinc.market.ranking.core.model.po.RankingTabsPo;
import com.okinc.market.ranking.core.model.po.TabsItemVo;
import com.okinc.market.ranking.features.main.ui.RankingRootFragment$setListener$2;
import com.okinc.market.ranking.features.main.ui.RankingSubPage;
import com.okinc.market.ranking.features.main.viewmodel.RankingViewModel;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.uilab.stateful.StatefulView;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.AbstractC55470xkZ;
import o.C52761wXj;
import o.InterfaceC49361unB;
import o.InterfaceC49363unD;
import o.InterfaceC49371unL;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qvg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C41696qvg extends AbstractC41691qvb implements InterfaceC49363unD, InterfaceC41695qvf, InterfaceC41636quZ, InterfaceC41634quX {
    public TabLayoutMediator DbNXlk;
    public C42830rdn djBIcL;
    public final InterfaceC56387yDm fARcdN;
    public C41676qvM fIwbmz;
    public final InterfaceC56387yDm fetchVPNInfo;
    public C34997nmx values;
    public static final Application Companion = new Application(null);
    public static final int AYXKKw = 8;
    public final /* synthetic */ C41631quU gEmmrt = new C41631quU();
    public final /* synthetic */ C41629quS AhwBna = new C41629quS();
    public final /* synthetic */ C41624quN valueOf = new C41624quN();
    public java.util.List<RankingSubPage> isConnected = new java.util.ArrayList();
    public java.lang.String AkhnZx = "RANKING_HOT_CRYPTO";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41636quZ
    public void AEQbTJ(@NotNull RankingHotCryptoVo rankingHotCryptoVo, int i) {
        Intrinsics.checkNotNullParameter(rankingHotCryptoVo, "");
        this.AhwBna.AEQbTJ(rankingHotCryptoVo, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41634quX
    public void AEQbTJ(@NotNull RankingHotCryptoVo rankingHotCryptoVo, int i, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(rankingHotCryptoVo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.valueOf.AEQbTJ(rankingHotCryptoVo, i, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41634quX
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41634quX
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.valueOf.AEQbTJ(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd() {
        this.gEmmrt.EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41695qvf
    public void EZpvd(@NotNull android.view.View view, @NotNull RankingHotCryptoVo rankingHotCryptoVo, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(rankingHotCryptoVo, "");
        this.gEmmrt.EZpvd(view, rankingHotCryptoVo, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41695qvf
    public void EZpvd(@NotNull android.view.View view, @NotNull AbstractC55470xkZ.ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.gEmmrt.EZpvd(view, actionBar, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41695qvf
    public void KWHzl(@NotNull android.view.View view, @NotNull DexInstrument dexInstrument, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        this.gEmmrt.KWHzl(view, dexInstrument, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.gEmmrt.EZpvd(fragment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41695qvf
    public void OLrzqt(@NotNull android.view.View view, @NotNull RankingNewSpotVo rankingNewSpotVo, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(rankingNewSpotVo, "");
        this.gEmmrt.OLrzqt(view, rankingNewSpotVo, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41695qvf
    public void OLrzqt(@NotNull android.view.View view, @NotNull WatchListData watchListData, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(watchListData, "");
        this.gEmmrt.OLrzqt(view, watchListData, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41634quX
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.valueOf.OLrzqt(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41634quX
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.valueOf.OLrzqt(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull InterfaceC49363unD interfaceC49363unD) {
        Intrinsics.checkNotNullParameter(interfaceC49363unD, "");
        this.gEmmrt.EZpvd(interfaceC49363unD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41695qvf
    public void copydefault(@NotNull android.view.View view, @NotNull C35069noP c35069noP, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35069noP, "");
        this.gEmmrt.copydefault(view, c35069noP, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.AhwBna.KWHzl(fragment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41634quX
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.valueOf.copydefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void djBIcL() {
        this.AhwBna.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.invokespecialODCBUN;
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

    public C41696qvg() {
        final Function0 function0 = null;
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RankingViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.ranking.features.main.ui.RankingRootFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.ranking.features.main.ui.RankingRootFragment$special$$inlined$activityViewModels$default$2
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.ranking.features.main.ui.RankingRootFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C41778qxI.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.ranking.features.main.ui.RankingRootFragment$special$$inlined$activityViewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.ranking.features.main.ui.RankingRootFragment$special$$inlined$activityViewModels$default$5
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.ranking.features.main.ui.RankingRootFragment$special$$inlined$activityViewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RankingViewModel values() {
        return (RankingViewModel) this.fARcdN.getValue();
    }

    public final C41778qxI AhwBna() {
        return (C41778qxI) this.fetchVPNInfo.getValue();
    }

    /* JADX INFO: renamed from: o.qvg$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qvg.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C41696qvg EZpvd() {
            return new C41696qvg();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("ranking_tab_key", "RANKING_HOT_CRYPTO")) != null) {
            this.AkhnZx = string;
            AhwBna().AEQbTJ(string);
            AhwBna().copydefault(string);
        }
        RankingViewModel.loadRankingTabsConfig$OKMarket_market_impl$default(values(), null, 1, null);
    }

    @Override // o.AbstractC41691qvb, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        copydefault((androidx.fragment.app.Fragment) this);
        KWHzl((androidx.fragment.app.Fragment) this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        djBIcL();
        EZpvd();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        final C42830rdn c42830rdnKWHzl = C42830rdn.KWHzl(view);
        c42830rdnKWHzl.AEQbTJ.setLoadingDelayedTime(0L);
        c42830rdnKWHzl.AEQbTJ.setStatus(StatefulView.Status.Loading);
        this.fIwbmz = new C41676qvM(this);
        c42830rdnKWHzl.valueOf.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.qve
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C41696qvg.KWHzl(this.KWHzl, view2);
            }
        });
        c42830rdnKWHzl.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.qvh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C41696qvg.OLrzqt(this.copydefault, view2);
            }
        });
        c42830rdnKWHzl.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.qvk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C41696qvg.AEQbTJ(c42830rdnKWHzl, this, view2);
            }
        });
        AYXKKw();
        c42830rdnKWHzl.AYXKKw.setAdapter(this.fIwbmz);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(c42830rdnKWHzl.gEmmrt, c42830rdnKWHzl.AYXKKw, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.qvi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C41696qvg.copydefault(this.copydefault, tab, i);
            }
        });
        tabLayoutMediator.attach();
        this.DbNXlk = tabLayoutMediator;
        c42830rdnKWHzl.gEmmrt.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new StateListAnimator(c42830rdnKWHzl));
        this.djBIcL = c42830rdnKWHzl;
        valueOf();
        FragmentActivity activity = getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        this.values = abstractActivityC33041mov != null ? new C34997nmx(abstractActivityC33041mov) : null;
    }

    public static final void KWHzl(C41696qvg c41696qvg, android.view.View view) {
        c41696qvg.requireActivity().getOnBackPressedDispatcher().onBackPressed();
    }

    public static final void OLrzqt(C41696qvg c41696qvg, android.view.View view) {
        c41696qvg.requireActivity().getOnBackPressedDispatcher().onBackPressed();
    }

    public static final void AEQbTJ(C42830rdn c42830rdn, C41696qvg c41696qvg, android.view.View view) {
        ConstraintLayout constraintLayout = c42830rdn.KWHzl;
        C34997nmx c34997nmx = c41696qvg.values;
        if (c34997nmx != null) {
            Intrinsics.copydefault(constraintLayout);
            c34997nmx.AEQbTJ(constraintLayout, "ranking");
        }
        InterfaceC41634quX interfaceC41634quXEZpvd = C41701qvl.EZpvd(c41696qvg);
        if (interfaceC41634quXEZpvd != null) {
            interfaceC41634quXEZpvd.AEQbTJ(c41696qvg.AhwBna().AEQbTJ(), Intrinsics.EZpvd((java.lang.Object) c41696qvg.AhwBna().AEQbTJ(), (java.lang.Object) OtpEventTracker.OTP_EVENT_VALUE_NEW) ? c41696qvg.AhwBna().EZpvd() : "");
        }
    }

    public static final void copydefault(C41696qvg c41696qvg, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(c41696qvg.getContext()).inflate(qZH.ActionBar.hNurIN, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(qZH.StateListAnimator.access100);
        android.widget.ImageView imageView = (android.widget.ImageView) viewInflate.findViewById(qZH.StateListAnimator.OijiEz);
        tab.setCustomView(viewInflate);
        C41676qvM c41676qvM = c41696qvg.fIwbmz;
        textView.setText(c41676qvM != null ? c41676qvM.EZpvd(i) : null);
        c41696qvg.EZpvd(imageView, i);
        C41676qvM c41676qvM2 = c41696qvg.fIwbmz;
        tab.setContentDescription(c41676qvM2 != null ? c41676qvM2.KWHzl(i) : null);
    }

    /* JADX INFO: renamed from: o.qvg$StateListAnimator */
    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ C42830rdn AEQbTJ;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public StateListAnimator(C42830rdn c42830rdn) {
            this.AEQbTJ = c42830rdn;
        }

        /* JADX DEBUG: Class process forced to load method for inline: com.okinc.market.ranking.features.main.viewmodel.RankingViewModel.loadRankingTabsConfig$OKMarket_market_impl$default(com.okinc.market.ranking.features.main.viewmodel.RankingViewModel, o.quL, int, java.lang.Object):void */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            java.lang.String strOLrzqt = null;
            RankingViewModel.loadRankingTabsConfig$OKMarket_market_impl$default(C41696qvg.this.values(), null, 1, null);
            android.widget.TextView textView = this.AEQbTJ.djBIcL;
            C41676qvM c41676qvM = C41696qvg.this.fIwbmz;
            if (c41676qvM != null) {
                strOLrzqt = c41676qvM.OLrzqt(tab != null ? tab.getPosition() : 0);
            }
            textView.setText(strOLrzqt);
            C41676qvM c41676qvM2 = C41696qvg.this.fIwbmz;
            if (c41676qvM2 != null) {
                java.lang.String strCopydefault = c41676qvM2.copydefault(tab != null ? tab.getPosition() : 0);
                if (strCopydefault != null) {
                    C41696qvg c41696qvg = C41696qvg.this;
                    c41696qvg.AhwBna().copydefault(strCopydefault);
                    InterfaceC41634quX interfaceC41634quXEZpvd = C41701qvl.EZpvd(c41696qvg);
                    if (interfaceC41634quXEZpvd != null) {
                        interfaceC41634quXEZpvd.OLrzqt(strCopydefault, Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) OtpEventTracker.OTP_EVENT_VALUE_NEW) ? c41696qvg.AhwBna().EZpvd() : "");
                    }
                }
            }
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, values(), new MutablePropertyReference1Impl() { // from class: com.okinc.market.ranking.features.main.ui.RankingRootFragment$setListener$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((RankingViewModel.ActionBar) obj).copydefault();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((RankingViewModel.ActionBar) obj).copydefault((InterfaceC49371unL<RankingTabsPo>) obj2);
            }
        }, null, new RankingRootFragment$setListener$2(this, null), 2, null);
        OLrzqt((InterfaceC49363unD) this);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        gEmmrt();
    }

    public final void gEmmrt() {
        C42830rdn c42830rdn;
        ViewPager2 viewPager2;
        RankingSubPage rankingSubPageKWHzl = KWHzl(Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) "RANKING_NEW_LISTINGS_FUTURE") ? "RANKING_NEW_LISTINGS" : this.AkhnZx);
        int iIndexOf = this.isConnected.indexOf(rankingSubPageKWHzl);
        if (iIndexOf >= 0 && iIndexOf < this.isConnected.size() && (c42830rdn = this.djBIcL) != null && (viewPager2 = c42830rdn.AYXKKw) != null) {
            viewPager2.setCurrentItem(iIndexOf, false);
        }
        InterfaceC41634quX interfaceC41634quXEZpvd = C41701qvl.EZpvd(this);
        if (interfaceC41634quXEZpvd != null) {
            interfaceC41634quXEZpvd.OLrzqt(rankingSubPageKWHzl.getTrackSubType(), EZpvd(this.AkhnZx), "today");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(java.lang.String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -840359977) {
            if (iHashCode != -701114262) {
                if (iHashCode == 171650859 && str.equals("RANKING_NEW_LISTINGS_FUTURE")) {
                    return "futures";
                }
            } else if (str.equals("RANKING_NEW_LISTINGS_SPOT")) {
                return "spot";
            }
            return "";
        }
        if (!str.equals("RANKING_NEW_LISTINGS")) {
            return "";
        }
    }

    public final RankingSubPage KWHzl(java.lang.String str) {
        try {
            return RankingSubPage.valueOf(str);
        } catch (java.lang.IllegalArgumentException e) {
            e.printStackTrace();
            return RankingSubPage.RANKING_HOT_CRYPTO;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.qqb.setText$default(android.widget.TextView, com.okinc.market.ext.UpDownColor, java.lang.CharSequence, int, int, int, boolean, int, java.lang.Object):void */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [248=9] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(RankingTabsPo rankingTabsPo) {
        TabLayout tabLayout;
        TabsItemVo mostBuyers;
        UpDownColor indicateColor;
        UpDownColor indicateColor2;
        java.lang.String indicate;
        java.lang.String indicate2;
        android.view.View customView;
        android.view.View customView2;
        android.view.View customView3;
        C42830rdn c42830rdn = this.djBIcL;
        if (c42830rdn == null || (tabLayout = c42830rdn.gEmmrt) == null) {
            return;
        }
        C41676qvM c41676qvM = this.fIwbmz;
        int itemCount = c41676qvM != null ? c41676qvM.getItemCount() : 0;
        for (int i = 0; i < itemCount; i++) {
            TabLayout.Tab tabAt = tabLayout.getTabAt(i);
            android.widget.TextView textView = (tabAt == null || (customView3 = tabAt.getCustomView()) == null) ? null : (android.widget.TextView) customView3.findViewById(qZH.StateListAnimator.iTrKTi);
            android.widget.ImageView imageView = (tabAt == null || (customView2 = tabAt.getCustomView()) == null) ? null : (android.widget.ImageView) customView2.findViewById(qZH.StateListAnimator.fiXcQa);
            android.widget.ImageView imageView2 = (tabAt == null || (customView = tabAt.getCustomView()) == null) ? null : (android.widget.ImageView) customView.findViewById(qZH.StateListAnimator.OijiEz);
            C41676qvM c41676qvM2 = this.fIwbmz;
            java.lang.String strCopydefault = c41676qvM2 != null ? c41676qvM2.copydefault(i) : null;
            if (strCopydefault != null) {
                switch (strCopydefault.hashCode()) {
                    case -1377553120:
                        mostBuyers = strCopydefault.equals("buyers") ? rankingTabsPo.getMostBuyers() : rankingTabsPo.getHotRank();
                        break;
                    case -1096981482:
                        if (strCopydefault.equals("losers")) {
                            mostBuyers = rankingTabsPo.getTopLosers();
                            break;
                        }
                        break;
                    case -933776874:
                        if (strCopydefault.equals("marketcap")) {
                            mostBuyers = rankingTabsPo.getMarketCapRank();
                            break;
                        }
                        break;
                    case -199026297:
                        if (strCopydefault.equals("gainers")) {
                            mostBuyers = rankingTabsPo.getTopGainers();
                            break;
                        }
                        break;
                    case 103501:
                        if (strCopydefault.equals("hot")) {
                            mostBuyers = rankingTabsPo.getHotRank();
                            break;
                        }
                        break;
                    case 108960:
                        if (strCopydefault.equals(OtpEventTracker.OTP_EVENT_VALUE_NEW)) {
                            mostBuyers = rankingTabsPo.getNewCoinRank();
                            break;
                        }
                        break;
                    case 135018193:
                        if (strCopydefault.equals("turnover")) {
                            mostBuyers = rankingTabsPo.getTurnOverRank();
                            break;
                        }
                        break;
                    case 888645718:
                        if (strCopydefault.equals("searches")) {
                            mostBuyers = rankingTabsPo.getPopularSearches();
                            break;
                        }
                        break;
                    case 1978310868:
                        if (strCopydefault.equals("sellers")) {
                            mostBuyers = rankingTabsPo.getMostSellers();
                            break;
                        }
                        break;
                }
            }
            TabsItemVo tabsItemVo = mostBuyers;
            if (tabsItemVo == null || (indicateColor = tabsItemVo.getIndicateColor()) == null) {
                indicateColor = UpDownColor.NEUTRAL;
            }
            UpDownColor upDownColor = UpDownColor.NEUTRAL;
            java.lang.String str = "--";
            if (indicateColor == upDownColor) {
                if (textView != null) {
                    if (tabsItemVo != null && (indicate2 = tabsItemVo.getIndicate()) != null) {
                        str = indicate2;
                    }
                    textView.setText(str);
                }
                if (textView != null) {
                    textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                }
            } else if (textView != null) {
                if (tabsItemVo == null || (indicateColor2 = tabsItemVo.getIndicateColor()) == null) {
                    indicateColor2 = upDownColor;
                }
                if (tabsItemVo == null || (indicate = tabsItemVo.getIndicate()) == null) {
                    indicate = "--";
                }
                C41426qqb.setText$default(textView, indicateColor2, (java.lang.CharSequence) indicate, 0, 0, C33070mpX.copydefault(C52761wXj.Activity.OBJEWx), false, 44, (java.lang.Object) null);
            }
            if (imageView != null) {
                C33054mpH.EZpvd(imageView, tabsItemVo != null ? tabsItemVo.getIcon() : null, C52761wXj.TaskDescription.aHXSQp);
            }
            EZpvd(imageView2, i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(android.widget.ImageView imageView, int i) {
        int i2;
        if (imageView != null) {
            C41676qvM c41676qvM = this.fIwbmz;
            java.lang.String strCopydefault = c41676qvM != null ? c41676qvM.copydefault(i) : null;
            if (strCopydefault != null) {
                switch (strCopydefault.hashCode()) {
                    case -1377553120:
                        i2 = !strCopydefault.equals("buyers") ? C52761wXj.TaskDescription.gBtXYZ : C52761wXj.TaskDescription.fzHEvu;
                        break;
                    case -1096981482:
                        if (strCopydefault.equals("losers")) {
                            i2 = C52761wXj.TaskDescription.ddhgMB;
                            break;
                        }
                        break;
                    case -933776874:
                        if (strCopydefault.equals("marketcap")) {
                            i2 = C52761wXj.TaskDescription.apNbdB;
                            break;
                        }
                        break;
                    case -199026297:
                        if (strCopydefault.equals("gainers")) {
                            i2 = C52761wXj.TaskDescription.fObYrO;
                            break;
                        }
                        break;
                    case 103501:
                        strCopydefault.equals("hot");
                        break;
                    case 108960:
                        if (strCopydefault.equals(OtpEventTracker.OTP_EVENT_VALUE_NEW)) {
                            i2 = C52761wXj.TaskDescription.zMXLsR;
                            break;
                        }
                        break;
                    case 135018193:
                        if (strCopydefault.equals("turnover")) {
                            i2 = C52761wXj.TaskDescription.RzdrRQ;
                            break;
                        }
                        break;
                    case 888645718:
                        if (strCopydefault.equals("searches")) {
                            i2 = C52761wXj.TaskDescription.UJpkuA;
                            break;
                        }
                        break;
                    case 1978310868:
                        if (strCopydefault.equals("sellers")) {
                            i2 = C52761wXj.TaskDescription.DjwCMv;
                            break;
                        }
                        break;
                }
            }
            imageView.setImageResource(i2);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xnd.getStableText$default(android.content.Context, int, java.lang.Object):java.lang.String */
    public final void AYXKKw() {
        java.util.List<RankingSubPage> listAhwBna = yDY.AhwBna(RankingSubPage.RANKING_HOT_CRYPTO);
        if (Intrinsics.EZpvd((java.lang.Object) C55633xnd.getStableText$default(null, 1, null), (java.lang.Object) "USDT")) {
            listAhwBna.add(RankingSubPage.RANKING_NEW_LISTINGS);
        } else {
            listAhwBna.add(RankingSubPage.RANKING_NEW_LISTINGS_SPOT);
        }
        listAhwBna.add(RankingSubPage.RANKING_TOP_GAINERS);
        listAhwBna.add(RankingSubPage.RANKING_TOP_LOSERS);
        listAhwBna.add(RankingSubPage.RANKING_LARGEST_MKT_CAP);
        listAhwBna.add(RankingSubPage.RANKING_LARGEST_TURNOVER);
        this.isConnected = listAhwBna;
        C41676qvM c41676qvM = this.fIwbmz;
        if (c41676qvM != null) {
            c41676qvM.EZpvd(listAhwBna);
        }
    }

    public final void valueOf() {
        TabLayout tabLayout;
        C42830rdn c42830rdn = this.djBIcL;
        if (c42830rdn == null || (tabLayout = c42830rdn.gEmmrt) == null) {
            return;
        }
        tabLayout.post(new java.lang.Runnable() { // from class: o.qvc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C41696qvg.valueOf(this.KWHzl);
            }
        });
    }

    public static final void valueOf(C41696qvg c41696qvg) {
        TabLayout tabLayout;
        try {
            C42830rdn c42830rdn = c41696qvg.djBIcL;
            android.view.View childAt = (c42830rdn == null || (tabLayout = c42830rdn.gEmmrt) == null) ? null : tabLayout.getChildAt(0);
            Intrinsics.copydefault(childAt, "");
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) childAt;
            int iDp2px$default = C55298xhM.dp2px$default(24.0f, null, 1, null);
            int iDp2px$default2 = C55298xhM.dp2px$default(5.0f, null, 1, null);
            C41676qvM c41676qvM = c41696qvg.fIwbmz;
            int itemCount = c41676qvM != null ? c41676qvM.getItemCount() : 0;
            for (int i = 0; i < itemCount; i++) {
                android.view.View childAt2 = linearLayout.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                if (i == 0) {
                    layoutParams2.setMarginStart(iDp2px$default);
                    layoutParams2.setMarginEnd(iDp2px$default2);
                } else if (i == linearLayout.getChildCount() - 1) {
                    layoutParams2.setMarginStart(iDp2px$default2);
                    layoutParams2.setMarginEnd(iDp2px$default);
                } else {
                    layoutParams2.setMarginStart(iDp2px$default2);
                    layoutParams2.setMarginEnd(iDp2px$default2);
                }
                childAt2.setPadding(0, 0, 0, 0);
                childAt2.setLayoutParams(layoutParams2);
                childAt2.invalidate();
            }
        } catch (java.lang.Exception unused) {
            pUU.copydefault(c41696qvg.getTAG(), "margin measure issue");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewPager2 viewPager2;
        TabLayoutMediator tabLayoutMediator = this.DbNXlk;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        C42830rdn c42830rdn = this.djBIcL;
        if (c42830rdn != null && (viewPager2 = c42830rdn.AYXKKw) != null) {
            viewPager2.setAdapter(null);
        }
        super.onDestroyView();
    }
}
