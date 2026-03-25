package com.okinc.unified.fragment;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.dexkline.dex.api.bean.CoinDetailRedirection;
import com.okinc.dexkline.dex.api.bean.TokenBase;
import com.okinc.dexkline.dexlogic.main.market.bean.BubbleMapData;
import com.okinc.dexkline.dexlogic.main.market.bean.EarlyBuyerInfoData;
import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.dexkline.dexlogic.main.market.detail.TrackingAddressViewModel;
import com.okinc.dexkline.dexlogic.main.market.detail.chart.viewmodel.ChartViewModel;
import com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment;
import com.okinc.dexkline.market.features.token_detail.RealtimeDataViewModel;
import com.okinc.dexkline.market.features.token_detail.TokenDetail;
import com.okinc.im.bean.IMMessageShareModel;
import com.okinc.kline.api.bean.MarketArbCoinInfo;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.rxutils.RxBus;
import com.okinc.share.api.preview.ISharePreviewConfig;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageDefaultPreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unified.data.CeDeFiData;
import com.okinc.unified.fragment.DeFiKlineFragment;
import com.okinc.unified.shared.CeDeFiSharedViewModel;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.AbstractActivityC33041mov;
import o.AbstractC49411unz;
import o.AbstractC55486xkp;
import o.AbstractC58185ywX;
import o.ActivityC38834pgs;
import o.C32866mlf;
import o.C33069mpW;
import o.C33070mpX;
import o.C33487mxQ;
import o.C33570myu;
import o.C34703nhO;
import o.C35964oKf;
import o.C36026oMn;
import o.C43248rlh;
import o.C43251rlk;
import o.C48887ueE;
import o.C48891ueI;
import o.C49352umt;
import o.C55113xdn;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56524yIo;
import o.C58156yvv;
import o.InterfaceC37933pGb;
import o.InterfaceC39499ptW;
import o.InterfaceC39508ptf;
import o.InterfaceC39560pue;
import o.InterfaceC46557tYt;
import o.InterfaceC48893ueK;
import o.InterfaceC48895ueM;
import o.InterfaceC49363unD;
import o.InterfaceC49369unJ;
import o.InterfaceC49425uoM;
import o.InterfaceC54577xNn;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC56560yJx;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.mPY;
import o.mRG;
import o.mRW;
import o.mTL;
import o.oLV;
import o.pEN;
import o.pFN;
import o.pUU;
import o.rVN;
import o.xXR;
import o.yCM;
import o.yHO;
import o.yHQ;
import o.yHR;
import o.yHS;
import o.yHT;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes17.dex */
public final class DeFiKlineFragment extends AbstractC55486xkp implements InterfaceC39508ptf, mRW, InterfaceC49363unD, InterfaceC39499ptW {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public String AEQbTJ;
    public MarketLandscapeFragment AkhnZx;
    public InterfaceC58217yxC AuCTel;
    public final InterfaceC56387yDm DbNXlk;
    public C36026oMn EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public C49352umt djBIcL;
    public final InterfaceC56387yDm fARcdN;
    public CoinDetailRedirection fIwbmz;
    public TokenBase fJNWhG;
    public InterfaceC39560pue fetchVPNInfo;
    public LatestMarketInfoBean gEmmrt;
    public final InterfaceC56387yDm getNewProxyInstance;
    public final InterfaceC56387yDm isConnected;

    @yCM
    public InterfaceC46557tYt upDownTimeZoneService;
    public boolean valueOf;
    public String values = "unknown";
    public String KWHzl = "";
    public String AYXKKw = "";
    public boolean AhwBna = true;
    public String ejfBZ = "";

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    @Override // o.InterfaceC39499ptW
    public void AEQbTJ(boolean z) {
    }

    @Override // o.InterfaceC39499ptW
    public void AYXKKw() {
    }

    @Override // o.InterfaceC39499ptW
    public boolean AhwBna() {
        return false;
    }

    @Override // o.InterfaceC39499ptW
    public void EZpvd(int i) {
    }

    @Override // o.InterfaceC39556pua
    public void EZpvd(MarketCoinInfo marketCoinInfo) {
    }

    @Override // o.InterfaceC39556pua
    public void KWHzl(MarketArbCoinInfo marketArbCoinInfo) {
    }

    @Override // o.InterfaceC39499ptW
    public void OLrzqt(Boolean bool) {
    }

    @Override // o.InterfaceC39499ptW
    public void OLrzqt(boolean z) {
    }

    @Override // o.InterfaceC39499ptW
    public void copydefault(InterfaceC37933pGb interfaceC37933pGb) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39499ptW
    public String djBIcL() {
        return "";
    }

    @Override // o.InterfaceC39499ptW
    public void fARcdN() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.hDKMBd;
    }

    @Override // o.InterfaceC39499ptW
    public void isConnected() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39508ptf
    public void setClickLockListener(InterfaceC39560pue interfaceC39560pue) {
        this.fetchVPNInfo = interfaceC39560pue;
    }

    @Override // o.InterfaceC39499ptW
    public void setPortraitFullScreen(View view) {
    }

    @Override // o.InterfaceC39499ptW
    public void setPortraitNormal(View view) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39499ptW
    public Boolean values() {
        return Boolean.FALSE;
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

    public DeFiKlineFragment() {
        final Function0 function0 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ChartViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.unified.fragment.DeFiKlineFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.unified.fragment.DeFiKlineFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.unified.fragment.DeFiKlineFragment$special$$inlined$activityViewModels$default$3
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.unified.fragment.DeFiKlineFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.unified.fragment.DeFiKlineFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.unified.fragment.DeFiKlineFragment$special$$inlined$activityViewModels$default$6
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RealtimeDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.unified.fragment.DeFiKlineFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.unified.fragment.DeFiKlineFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.unified.fragment.DeFiKlineFragment$special$$inlined$activityViewModels$default$9
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
        this.getNewProxyInstance = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TrackingAddressViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.unified.fragment.DeFiKlineFragment$special$$inlined$activityViewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.unified.fragment.DeFiKlineFragment$special$$inlined$activityViewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.unified.fragment.DeFiKlineFragment$special$$inlined$activityViewModels$default$12
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
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CeDeFiSharedViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.unified.fragment.DeFiKlineFragment$special$$inlined$activityViewModels$default$13
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.unified.fragment.DeFiKlineFragment$special$$inlined$activityViewModels$default$14
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.unified.fragment.DeFiKlineFragment$special$$inlined$activityViewModels$default$15
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

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unified.fragment.DeFiKlineFragment.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final DeFiKlineFragment AEQbTJ() {
            return new DeFiKlineFragment();
        }
    }

    /* JADX DEBUG: Possible override for method o.xkp.EZpvd()V */
    public final ChartViewModel EZpvd() {
        return (ChartViewModel) this.OLrzqt.getValue();
    }

    public final MarketCoinDetailViewModel KWHzl() {
        return (MarketCoinDetailViewModel) this.isConnected.getValue();
    }

    public final RealtimeDataViewModel OLrzqt() {
        return (RealtimeDataViewModel) this.DbNXlk.getValue();
    }

    public final TrackingAddressViewModel fIwbmz() {
        return (TrackingAddressViewModel) this.getNewProxyInstance.getValue();
    }

    public final CeDeFiSharedViewModel gEmmrt() {
        return (CeDeFiSharedViewModel) this.fARcdN.getValue();
    }

    public final InterfaceC46557tYt AuCTel() {
        InterfaceC46557tYt interfaceC46557tYt = this.upDownTimeZoneService;
        if (interfaceC46557tYt != null) {
            return interfaceC46557tYt;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.EZpvd = C36026oMn.OLrzqt(view);
        CeDeFiData value = gEmmrt().OLrzqt().getValue();
        if (value != null) {
            this.fJNWhG = value.AhwBna();
            String strKWHzl = value.KWHzl();
            if (strKWHzl == null) {
                strKWHzl = "unknown";
            }
            this.values = strKWHzl;
            this.fIwbmz = value.copydefault();
            String strDjBIcL = value.djBIcL();
            if (strDjBIcL == null) {
                strDjBIcL = "";
            }
            this.ejfBZ = strDjBIcL;
            this.valueOf = value.gEmmrt();
            this.AEQbTJ = value.AEQbTJ();
            String strOLrzqt = value.OLrzqt();
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            this.KWHzl = strOLrzqt;
            String strEZpvd = value.EZpvd();
            this.AYXKKw = strEZpvd != null ? strEZpvd : "";
        }
        pFN.OLrzqt.EZpvd(new WeakReference<>(this));
        if (bundle == null) {
            setPortrait$default(this, false, 1, null);
        }
        zLjUOn();
        TokenBase tokenBase = this.fJNWhG;
        if (tokenBase != null) {
            mTL.KWHzl.AEQbTJ(tokenBase.getTokenContractAddress());
            copydefault(tokenBase);
        }
        AubY();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        Configuration configuration2;
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (configuration.orientation == 2) {
            OLrzqt(activity);
        } else {
            activity.getWindow().clearFlags(1024);
        }
        Resources resources = activity.getResources();
        if (resources != null && (configuration2 = resources.getConfiguration()) != null) {
            configuration2.orientation = configuration.orientation;
        }
        boolean z = configuration.orientation == 1;
        KWHzl(z);
        EZpvd(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        TokenBase tokenBase = this.fJNWhG;
        if (Intrinsics.EZpvd((Object) (tokenBase != null ? tokenBase.getSource() : null), (Object) "cefi_search")) {
            mPY.OLrzqt.AEQbTJ(this.ejfBZ);
        }
        this.AkhnZx = null;
        this.EZpvd = null;
        InterfaceC58217yxC interfaceC58217yxC = this.AuCTel;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public static final class Activity extends OnBackPressedCallback {
        public Activity() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (!DeFiKlineFragment.this.AhwBna) {
                DeFiKlineFragment.this.copydefault(true);
                return;
            }
            FragmentActivity activity = DeFiKlineFragment.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    private final void zLjUOn() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        FragmentActivity activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.addCallback(this, new Activity());
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXR.class, new String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
        final Function1 function1 = new Function1() { // from class: o.xjV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DeFiKlineFragment.EZpvd(this.AEQbTJ, (xXR) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.xjS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DeFiKlineFragment.AYXKKw(function1, obj);
            }
        });
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("kline_portrait_screen");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function12 = new Function1() { // from class: o.xjT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DeFiKlineFragment.OLrzqt(this.OLrzqt, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.xjX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DeFiKlineFragment.AhwBna(function12, obj);
            }
        });
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ2 = RxBus.AEQbTJ("kline_full_screen");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        AbstractC58185ywX abstractC58185ywXEZpvd3 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ2, this);
        final Function1 function13 = new Function1() { // from class: o.xjW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DeFiKlineFragment.KWHzl(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd3.AEQbTJ(new InterfaceC58227yxM() { // from class: o.xka
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DeFiKlineFragment.valueOf(function13, obj);
            }
        });
        gEmmrt().AhwBna().observe(this, new StateListAnimator(new Function1() { // from class: o.xjZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DeFiKlineFragment.EZpvd(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final void AYXKKw(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(DeFiKlineFragment deFiKlineFragment, xXR xxr) {
        TrackingAddressViewModel.reload$default(deFiKlineFragment.fIwbmz(), false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AhwBna(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(DeFiKlineFragment deFiKlineFragment, String str) {
        deFiKlineFragment.copydefault(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(DeFiKlineFragment deFiKlineFragment, String str) {
        deFiKlineFragment.AuCTelauCTel();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(DeFiKlineFragment deFiKlineFragment, Boolean bool) {
        if (bool.booleanValue()) {
            deFiKlineFragment.uzCIH();
        } else {
            deFiKlineFragment.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    public final void getNewProxyInstance() {
        FragmentActivity activity = getActivity();
        if (activity == null || !KWHzl(activity)) {
            return;
        }
        AuCTelauCTel();
        OLrzqt(activity);
        KWHzl(false);
        EZpvd(false);
    }

    public final boolean KWHzl(FragmentActivity fragmentActivity) {
        return pEN.EZpvd.AEQbTJ(fragmentActivity) == 2 && this.AhwBna && (!C34703nhO.AYXKKw(fragmentActivity) || gEmmrt().AYXKKw());
    }

    public final void OLrzqt(FragmentActivity fragmentActivity) {
        WindowManager.LayoutParams attributes = fragmentActivity.getWindow().getAttributes();
        attributes.flags |= 1024;
        fragmentActivity.getWindow().setAttributes(attributes);
    }

    private final void AubY() {
        KWHzl().AhwBna().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.xkd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DeFiKlineFragment.copydefault(this.EZpvd, (kotlin.Pair) obj);
            }
        }));
    }

    public static final Unit copydefault(DeFiKlineFragment deFiKlineFragment, Pair pair) {
        String changeUtc0;
        LatestMarketInfoBean latestMarketInfoBean = (LatestMarketInfoBean) pair.getSecond();
        int iEZpvd = deFiKlineFragment.AuCTel().EZpvd();
        if (iEZpvd == 1) {
            changeUtc0 = latestMarketInfoBean.getChangeUtc0();
        } else if (iEZpvd == 2) {
            changeUtc0 = latestMarketInfoBean.getChangeUtc8();
        } else {
            changeUtc0 = latestMarketInfoBean.getChange();
        }
        String str = changeUtc0;
        TokenBase tokenBase = deFiKlineFragment.fJNWhG;
        String chainId = tokenBase != null ? tokenBase.getChainId() : null;
        String maxPrice = latestMarketInfoBean.getMaxPrice();
        String minPrice = latestMarketInfoBean.getMinPrice();
        String price = latestMarketInfoBean.getPrice();
        TokenBase tokenBase2 = deFiKlineFragment.fJNWhG;
        TokenDetail tokenDetail = new TokenDetail(chainId, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, latestMarketInfoBean.getMarketCap(), maxPrice, minPrice, price, tokenBase2 != null ? tokenBase2.getTokenContractAddress() : null, latestMarketInfoBean.getTradeNum(), null, latestMarketInfoBean.getVolume(), latestMarketInfoBean.getHolders(), latestMarketInfoBean.getLiquidity(), null, null, latestMarketInfoBean.getTop10HoldAmountPercentage(), null, null, null, -1005584388, 14, null);
        RealtimeDataViewModel realtimeDataViewModelOLrzqt = deFiKlineFragment.OLrzqt();
        String str2 = deFiKlineFragment.ejfBZ;
        TokenBase tokenBase3 = deFiKlineFragment.fJNWhG;
        String chainId2 = tokenBase3 != null ? tokenBase3.getChainId() : null;
        realtimeDataViewModelOLrzqt.KWHzl(tokenDetail, str2, chainId2 == null ? "" : chainId2, ((LatestMarketInfoBean) pair.getSecond()).getTokenContractAddress(), ((LatestMarketInfoBean) pair.getSecond()).isSupportTxPrice());
        return Unit.INSTANCE;
    }

    private final void EZpvd(final boolean z) {
        Fragment fragment;
        FragmentContainerView fragmentContainerView;
        Intent intent;
        final TokenBase tokenBase = this.fJNWhG;
        if (tokenBase != null) {
            if (z) {
                DexMarketDetailFragment dexMarketDetailFragmentOLrzqt = DexMarketDetailFragment.Companion.OLrzqt(tokenBase, this.ejfBZ, this.values, this.fIwbmz, this.valueOf, this.AEQbTJ);
                dexMarketDetailFragmentOLrzqt.copydefault(this);
                fragment = dexMarketDetailFragmentOLrzqt;
            } else {
                MarketLandscapeFragment marketLandscapeFragmentAEQbTJ = MarketLandscapeFragment.Companion.AEQbTJ(tokenBase, this.ejfBZ, this.gEmmrt);
                this.AkhnZx = marketLandscapeFragmentAEQbTJ;
                fragment = marketLandscapeFragmentAEQbTJ;
            }
            C36026oMn c36026oMn = this.EZpvd;
            if (c36026oMn != null && (fragmentContainerView = c36026oMn.EZpvd) != null) {
                getChildFragmentManager().beginTransaction().replace(fragmentContainerView.getId(), fragment, "javaClass").commitAllowingStateLoss();
                FragmentActivity activity = getActivity();
                if (activity != null && (intent = activity.getIntent()) != null) {
                    intent.removeExtra("coin_detail_redirection");
                }
            }
            oLV olv = oLV.OLrzqt;
            C32866mlf.onEvent$default("KLine_Chart_ChartType_View", (TrackChannel[]) null, new Function1() { // from class: o.xjP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DeFiKlineFragment.OLrzqt(tokenBase, z, this, (EventParamsList) obj);
                }
            }, 1, (Object) null);
        }
    }

    public static final Unit OLrzqt(TokenBase tokenBase, boolean z, DeFiKlineFragment deFiKlineFragment, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "chart_type", "original", false, 4, null);
        EventParamsList.put$default(eventParamsList, "trade_pair", tokenBase.getTokenContractAddress(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "business_line", "cedefi", false, 4, null);
        EventParamsList.put$default(eventParamsList, TtmlNode.TAG_LAYOUT, z ? "portrait" : "landscape", false, 4, null);
        String str = deFiKlineFragment.AYXKKw;
        EventParamsList.put$default(eventParamsList, "last_page", str.length() == 0 ? deFiKlineFragment.KWHzl : str, false, 4, null);
        return Unit.INSTANCE;
    }

    private final void AuCTelauCTel() {
        FragmentManager supportFragmentManager;
        this.AhwBna = false;
        FragmentActivity activity = getActivity();
        ActivityC38834pgs activityC38834pgs = activity instanceof ActivityC38834pgs ? (ActivityC38834pgs) activity : null;
        if (activityC38834pgs != null) {
            activityC38834pgs.EZpvd(false);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.setRequestedOrientation(pEN.EZpvd.KWHzl(activity2));
        }
        FragmentActivity activity3 = getActivity();
        if (activity3 == null || (supportFragmentManager = activity3.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.setFragmentResult("switch_orientation_manually", BundleKt.bundleOf(C56390yDp.OLrzqt("manually_orientation", "horizontal")));
    }

    public static /* synthetic */ void setPortrait$default(DeFiKlineFragment deFiKlineFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        deFiKlineFragment.copydefault(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(boolean z) {
        FragmentManager supportFragmentManager;
        this.AhwBna = true;
        FragmentActivity activity = getActivity();
        ActivityC38834pgs activityC38834pgs = activity instanceof ActivityC38834pgs ? (ActivityC38834pgs) activity : null;
        if (activityC38834pgs != null) {
            activityC38834pgs.EZpvd(true);
        }
        KWHzl().AhwBna().setValue(C56390yDp.OLrzqt(Boolean.FALSE, new LatestMarketInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "100000", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (EarlyBuyerInfoData) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (BubbleMapData) null, (String) null, -2097153, 2047, (DefaultConstructorMarker) null)));
        if (z) {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.setRequestedOrientation(1);
            }
            FragmentActivity activity3 = getActivity();
            if (activity3 != null && (supportFragmentManager = activity3.getSupportFragmentManager()) != null) {
                supportFragmentManager.setFragmentResult("switch_orientation_manually", BundleKt.bundleOf(C56390yDp.OLrzqt("manually_orientation", "vertical")));
            }
        } else {
            EZpvd(true);
            KWHzl(true);
        }
        this.AkhnZx = null;
    }

    public final void KWHzl(boolean z) {
        FragmentManager supportFragmentManager;
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.setFragmentResult("switch_header", BundleKt.bundleOf(C56390yDp.OLrzqt("kline_show_header", Boolean.valueOf(z))));
    }

    @Override // o.InterfaceC39508ptf
    public void valueOf() {
        MarketLandscapeFragment marketLandscapeFragment = this.AkhnZx;
        if (marketLandscapeFragment != null) {
            marketLandscapeFragment.djBIcL();
        }
    }

    @Override // o.InterfaceC39508ptf
    public void setImageResource(int i) {
        MarketLandscapeFragment marketLandscapeFragment = this.AkhnZx;
        if (marketLandscapeFragment != null) {
            marketLandscapeFragment.EZpvd(i);
        }
    }

    @Override // o.InterfaceC39508ptf
    public void AkhnZx() {
        MarketLandscapeFragment marketLandscapeFragment = this.AkhnZx;
        if (marketLandscapeFragment != null) {
            marketLandscapeFragment.AkhnZx();
        }
    }

    @Override // o.InterfaceC39508ptf
    public void KWHzl(double d, double d2) {
        MarketLandscapeFragment marketLandscapeFragment = this.AkhnZx;
        if (marketLandscapeFragment != null) {
            marketLandscapeFragment.AEQbTJ(d, d2);
        }
    }

    @Override // o.InterfaceC39508ptf
    public void fetchVPNInfo() {
        MarketLandscapeFragment marketLandscapeFragment = this.AkhnZx;
        if (marketLandscapeFragment != null) {
            marketLandscapeFragment.AhwBna();
        }
    }

    @Override // o.InterfaceC39508ptf
    public void ejfBZ() {
        MarketLandscapeFragment marketLandscapeFragment = this.AkhnZx;
        if (marketLandscapeFragment != null) {
            marketLandscapeFragment.ejfBZ();
        }
    }

    @Override // o.mRW
    public void AEQbTJ(@NotNull LatestMarketInfoBean latestMarketInfoBean) {
        Intrinsics.checkNotNullParameter(latestMarketInfoBean, "");
        this.gEmmrt = latestMarketInfoBean;
        getNewProxyInstance();
    }

    public final void copydefault(TokenBase tokenBase) {
        if (Intrinsics.EZpvd((Object) tokenBase.getSource(), (Object) "cefi_search")) {
            if (KWHzl().DbNXlk() == null) {
                KWHzl().EZpvd(Boolean.valueOf(tokenBase.getShowSourceAlert()));
            }
            mPY.OLrzqt.EZpvd(this.ejfBZ);
        }
    }

    @Override // o.InterfaceC39499ptW
    public void OLrzqt(int i) {
        String chainId;
        String tokenContractAddress;
        InterfaceC54577xNn interfaceC54577xNn;
        FragmentActivity activity = getActivity();
        final AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null) {
            return;
        }
        zsXlph();
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || !interfaceC54577xNn.EZpvd()) {
            TokenBase tokenBase = this.fJNWhG;
            String str = "";
            if (tokenBase == null || (chainId = tokenBase.getChainId()) == null) {
                chainId = "";
            }
            TokenBase tokenBase2 = this.fJNWhG;
            if (tokenBase2 != null && (tokenContractAddress = tokenBase2.getTokenContractAddress()) != null) {
                str = tokenContractAddress;
            }
            final String str2 = "okx://pro/cedefi_kline?chainId=" + chainId + "&tokenaddr=" + str + "&source=share";
            InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43248rlh.KWHzl.AEQbTJ(InterfaceC48893ueK.class);
            C49352umt c49352umt = this.djBIcL;
            if (c49352umt != null) {
                c49352umt.setQRCode(interfaceC48893ueK.DTwDnp().djBIcL());
            }
            InterfaceC58217yxC interfaceC58217yxC = this.AuCTel;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(interfaceC48893ueK.AEQbTJ("https://www.okx.com/download", new C48891ueI("cedefi_kline", str2, false, null, null, 28, null)), this);
            final Function1 function1 = new Function1() { // from class: o.xke
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DeFiKlineFragment.KWHzl(this.copydefault, abstractActivityC33041mov, str2, (C48887ueE) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xkc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    DeFiKlineFragment.djBIcL(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.xkg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DeFiKlineFragment.OLrzqt((java.lang.Throwable) obj);
                }
            };
            this.AuCTel = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xkh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    DeFiKlineFragment.gEmmrt(function12, obj);
                }
            });
        } else {
            C49352umt c49352umt2 = this.djBIcL;
            if (c49352umt2 != null) {
                InterfaceC48895ueM.Application.setSrcFrom$default(c49352umt2, null, new Function0() { // from class: o.xkb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return DeFiKlineFragment.KWHzl(this.AEQbTJ, abstractActivityC33041mov);
                    }
                }, 1, null);
            }
        }
        TokenBase tokenBase3 = this.fJNWhG;
        if (tokenBase3 != null) {
            mRG.AEQbTJ(tokenBase3.getTokenContractAddress(), tokenBase3.getTokenSymbol(), tokenBase3.getChainId(), tokenBase3.getChainName());
        }
    }

    public static final Unit KWHzl(final DeFiKlineFragment deFiKlineFragment, final AbstractActivityC33041mov abstractActivityC33041mov) {
        deFiKlineFragment.EZpvd(abstractActivityC33041mov, new Function1() { // from class: o.xkj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DeFiKlineFragment.copydefault(this.AEQbTJ, abstractActivityC33041mov, (android.graphics.Bitmap) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(DeFiKlineFragment deFiKlineFragment, final AbstractActivityC33041mov abstractActivityC33041mov, Bitmap bitmap) {
        if (bitmap == null) {
            return Unit.INSTANCE;
        }
        Bitmap bitmapOLrzqt = C33487mxQ.OLrzqt(bitmap, C33570myu.EZpvd(deFiKlineFragment.djBIcL));
        ShareFileProvider.StateListAnimator stateListAnimator = ShareFileProvider.Companion;
        Intrinsics.copydefault(bitmapOLrzqt);
        stateListAnimator.copydefault(bitmapOLrzqt, deFiKlineFragment, new Function1() { // from class: o.xjR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DeFiKlineFragment.copydefault((java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.xjU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DeFiKlineFragment.copydefault(abstractActivityC33041mov, (java.io.File) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractActivityC33041mov abstractActivityC33041mov, File file) {
        Intrinsics.checkNotNullParameter(file, "");
        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43248rlh.KWHzl.AEQbTJ(InterfaceC48893ueK.class);
        ShareConfig.ActionBar actionBar = ShareConfig.Companion;
        ImageShareParams.ActionBar actionBar2 = ImageShareParams.Companion;
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        interfaceC48893ueK.copydefault(abstractActivityC33041mov, ShareConfig.ActionBar.create$default(actionBar, actionBar2.KWHzl(absolutePath, new Function1() { // from class: o.xjQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DeFiKlineFragment.AEQbTJ((ImageShareParams) obj);
            }
        }), null, 2, null));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("cedefi_kline");
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(final DeFiKlineFragment deFiKlineFragment, final AbstractActivityC33041mov abstractActivityC33041mov, final String str, final C48887ueE c48887ueE) {
        deFiKlineFragment.EZpvd(abstractActivityC33041mov, new Function1() { // from class: o.xkf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DeFiKlineFragment.AEQbTJ(this.AEQbTJ, abstractActivityC33041mov, c48887ueE, str, (android.graphics.Bitmap) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final DeFiKlineFragment deFiKlineFragment, final AbstractActivityC33041mov abstractActivityC33041mov, final C48887ueE c48887ueE, final String str, Bitmap bitmap) {
        if (bitmap == null) {
            return Unit.INSTANCE;
        }
        ShareFileProvider.StateListAnimator stateListAnimator = ShareFileProvider.Companion;
        final File fileAEQbTJ = stateListAnimator.AEQbTJ(bitmap);
        Bitmap bitmapOLrzqt = C33487mxQ.OLrzqt(bitmap, C33570myu.EZpvd(deFiKlineFragment.djBIcL));
        Intrinsics.copydefault(bitmapOLrzqt);
        stateListAnimator.copydefault(bitmapOLrzqt, deFiKlineFragment, new Function1() { // from class: o.xjN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DeFiKlineFragment.OLrzqt(this.OLrzqt, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.xjM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DeFiKlineFragment.OLrzqt(abstractActivityC33041mov, deFiKlineFragment, c48887ueE, fileAEQbTJ, str, (java.io.File) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(DeFiKlineFragment deFiKlineFragment, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.copydefault(deFiKlineFragment.getTAG(), "shareBitmap failed: " + th);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov, final DeFiKlineFragment deFiKlineFragment, final C48887ueE c48887ueE, final File file, final String str, final File file2) {
        Intrinsics.checkNotNullParameter(file2, "");
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        String absolutePath = file2.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        ShareConfig shareConfigCreate$default = ShareConfig.ActionBar.create$default(ShareConfig.Companion, actionBar.KWHzl(absolutePath, new Function1() { // from class: o.xjO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DeFiKlineFragment.EZpvd(this.AEQbTJ, c48887ueE, file2, file, str, (ImageShareParams) obj);
            }
        }), null, 2, null);
        ISharePreviewConfig previewConfig = shareConfigCreate$default.getPreviewConfig();
        ImageDefaultPreviewConfig imageDefaultPreviewConfig = previewConfig instanceof ImageDefaultPreviewConfig ? (ImageDefaultPreviewConfig) previewConfig : null;
        if (imageDefaultPreviewConfig != null) {
            imageDefaultPreviewConfig.setPreviewBottomTips("");
        }
        ((InterfaceC48893ueK) C43248rlh.KWHzl.AEQbTJ(InterfaceC48893ueK.class)).copydefault(abstractActivityC33041mov, shareConfigCreate$default);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(DeFiKlineFragment deFiKlineFragment, C48887ueE c48887ueE, File file, File file2, String str, ImageShareParams imageShareParams) {
        String tokenName;
        String tokenContractAddress;
        String chainId;
        String str2 = "";
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("cedefi_kline");
        int i = C35964oKf.Fragment.isScanInProgress;
        Pair[] pairArr = new Pair[2];
        TokenBase tokenBase = deFiKlineFragment.fJNWhG;
        if (tokenBase == null || (tokenName = tokenBase.getTokenName()) == null) {
            tokenName = "";
        }
        pairArr[0] = C56390yDp.OLrzqt(RemoteMessageConst.Notification.TICKER, tokenName);
        pairArr[1] = C56390yDp.OLrzqt("link", c48887ueE.OLrzqt());
        imageShareParams.setBody(C33069mpW.copydefault(deFiKlineFragment, i, (Map<String, ? extends Object>) C56424yEw.gEmmrt(pairArr)));
        imageShareParams.getExtras().putBoolean("isEnableIMShare", true);
        imageShareParams.setPendingShareImagePath(file.getAbsolutePath());
        IMMessageShareModel.CTAType cTAType = IMMessageShareModel.CTAType.TradeNow;
        String strOLrzqt = c48887ueE.OLrzqt();
        String strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.RVsVBY);
        String absolutePath = file2 != null ? file2.getAbsolutePath() : null;
        Pair[] pairArr2 = new Pair[2];
        TokenBase tokenBase2 = deFiKlineFragment.fJNWhG;
        if (tokenBase2 == null || (tokenContractAddress = tokenBase2.getTokenContractAddress()) == null) {
            tokenContractAddress = "";
        }
        pairArr2[0] = new Pair("contractAddress", tokenContractAddress);
        TokenBase tokenBase3 = deFiKlineFragment.fJNWhG;
        if (tokenBase3 != null && (chainId = tokenBase3.getChainId()) != null) {
            str2 = chainId;
        }
        pairArr2[1] = new Pair("chainID", str2);
        imageShareParams.getExtras().putParcelable("imMessageShare", new IMMessageShareModel((String) null, (String) null, strAYXKKw, absolutePath, (String) null, str, strOLrzqt, (String) null, cTAType, C56424yEw.gEmmrt(pairArr2), "okkline_kline", CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Throwable th) {
        th.printStackTrace();
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39499ptW
    public void DbNXlk() {
        InterfaceC39560pue interfaceC39560pue = this.fetchVPNInfo;
        if (interfaceC39560pue != null) {
            interfaceC39560pue.OLrzqt();
        }
    }

    @Override // o.InterfaceC39499ptW
    public void fJNWhG() {
        InterfaceC39560pue interfaceC39560pue = this.fetchVPNInfo;
        if (interfaceC39560pue != null) {
            interfaceC39560pue.KWHzl();
        }
    }

    private final void zsXlph() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        View viewInflate = View.inflate(activity, C35964oKf.Application.RgLUBD, null);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        C33487mxQ.EZpvd(viewInflate, displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.djBIcL = (C49352umt) viewInflate.findViewById(C35964oKf.StateListAnimator.sbu);
    }

    public final void EZpvd(android.app.Activity activity, final Function1<? super Bitmap, Unit> function1) {
        FragmentContainerView fragmentContainerView;
        DexMarketDetailFragment dexMarketDetailFragment;
        try {
            Result.Application application = Result.Companion;
            Window window = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "");
            View decorView = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "");
            int height = decorView.getHeight();
            C36026oMn c36026oMn = this.EZpvd;
            int iGEmmrt = height - ((c36026oMn == null || (fragmentContainerView = c36026oMn.EZpvd) == null || (dexMarketDetailFragment = (DexMarketDetailFragment) fragmentContainerView.getFragment()) == null) ? 0 : dexMarketDetailFragment.gEmmrt());
            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(decorView.getWidth(), iGEmmrt, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
            int[] iArr = new int[2];
            decorView.getLocationInWindow(iArr);
            int i = iArr[0];
            Rect rect = new Rect(i, iArr[1], decorView.getWidth() + i, iArr[1] + iGEmmrt);
            if (Build.VERSION.SDK_INT >= 26) {
                PixelCopy.request(window, rect, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: o.xjY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i2) {
                        DeFiKlineFragment.copydefault(function1, bitmapCreateBitmap, i2);
                    }
                }, decorView.getHandler());
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final void copydefault(Function1 function1, Bitmap bitmap, int i) {
        if (i == 0) {
            function1.invoke(bitmap);
        } else {
            function1.invoke(null);
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        EZpvd().gEmmrt();
    }

    public final void uzCIH() {
        C55113xdn c55113xdn;
        FrameLayout frameLayout;
        C36026oMn c36026oMn = this.EZpvd;
        if (c36026oMn != null && (frameLayout = c36026oMn.AEQbTJ) != null) {
            frameLayout.setVisibility(0);
        }
        C36026oMn c36026oMn2 = this.EZpvd;
        if (c36026oMn2 == null || (c55113xdn = c36026oMn2.KWHzl) == null) {
            return;
        }
        c55113xdn.KWHzl(0L);
    }

    public final void AEQbTJ() {
        C55113xdn c55113xdn;
        FrameLayout frameLayout;
        C36026oMn c36026oMn = this.EZpvd;
        if (c36026oMn != null && (frameLayout = c36026oMn.AEQbTJ) != null) {
            frameLayout.setVisibility(8);
        }
        C36026oMn c36026oMn2 = this.EZpvd;
        if (c36026oMn2 != null && (c55113xdn = c36026oMn2.KWHzl) != null) {
            c55113xdn.copydefault();
        }
        rVN.reportFullyDrawn$default((Fragment) this, true, (String) null, 2, (Object) null);
    }
}
