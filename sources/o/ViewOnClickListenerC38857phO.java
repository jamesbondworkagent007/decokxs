package o;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.MarketArbCoinInfo;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.ui.MarketKlinePortraitFragment$coinInfoUpdated$1;
import com.okinc.kline.ui.MarketKlinePortraitFragment$coinInfoUpdated$2;
import com.okinc.kline.ui.MarketKlinePortraitFragment$initView$7$1$1$2$1;
import com.okinc.kline.ui.MarketKlinePortraitFragment$initView$9$1;
import com.okinc.kline.ui.MarketKlinePortraitFragment$klineEnsureInitialize$1;
import com.okinc.kline.ui.MarketKlinePortraitFragment$setQuickOrderPrice$1$1;
import com.okinc.kline.ui.MarketKlinePortraitFragment$showPriceAlert$1;
import com.okinc.kline.ui.MarketKlinePortraitFragment$showQuartzCSATFragment$1;
import com.okinc.kline.ui.component.business.klinequote.KlineQuoteDataComponent;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.kline.ui.viewmodel.KlineTimeAnchorViewModel;
import com.okinc.kline.util.KlineQuickOrderBottomSheetBehavior;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.market.common.biz_spot.bean.UnifiedPriceRemind;
import com.okinc.productmatrix.biz.bean.ProductMatrixRemoteConfig;
import com.okinc.rxutils.RxBus;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.TokenBusinessData;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.lang.ref.WeakReference;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.C35964oKf;
import o.C37937pGf;
import o.C38580pcC;
import o.C38614pck;
import o.C38684peA;
import o.C38733pex;
import o.C38910piO;
import o.C39014pkM;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC39272ppF;
import o.InterfaceC39563puh;
import o.InterfaceC43033rhe;
import o.InterfaceC43294rma;
import o.InterfaceC49363unD;
import o.InterfaceC54581xNr;
import o.InterfaceC8104awT;
import o.ViewOnClickListenerC38857phO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.phO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ViewOnClickListenerC38857phO extends AbstractC38565pbo implements InterfaceC49363unD, InterfaceC39502ptZ, View.OnClickListener {
    public android.app.Activity AkhnZx;
    public java.lang.String AuCTel;
    public boolean AuCTelauCTel;
    public boolean AubY;
    public boolean AwvSrB;
    public boolean AxsJAY;
    public C52794wYp AxsJAYsNCnLh;
    public final InterfaceC56387yDm DAIeex;
    public C37937pGf DCUTEI;
    public WeakReference<InterfaceC39272ppF> DTwDnp;
    public final InterfaceC56387yDm DXXBbs;
    public C55254xgV DarRvM;
    public C52794wYp ODWQjV;
    public C55173xeu OqFWZa;
    public final InterfaceC56387yDm OuxcSI;
    public boolean QKVWgx;
    public final InterfaceC56387yDm QKudOq;
    public ConstraintLayout QOLQEE;
    public C39559pud QUSxYX;
    public C38769pfg QVAiDq;
    public android.widget.LinearLayout QbewEr;
    public android.widget.LinearLayout QfsBiF;
    public ViewPager2 QkdxfA;
    public android.widget.LinearLayout RJOkX;
    public java.lang.String RcXXUw;
    public TokenBusinessData UeEOUB;
    public java.lang.String aKErDB;
    public TokenBusinessData accept;
    public BizInstrument djBIcL;
    public java.lang.String djSkpj;
    public C33624mzv dvKsVJ;
    public C33624mzv dxcTrN;
    public C33624mzv fFgQHt;
    public BizInstrument fJNWhG;
    public C33624mzv fZBcTu;
    public android.view.View fetchVPNInfo;
    public androidx.fragment.app.Fragment ffGIBT;
    public C33624mzv finit;
    public android.widget.LinearLayout flVtFt;
    public android.widget.LinearLayout fvQaOB;
    public C33624mzv gGvvIC;
    public boolean gHZMYf;
    public final InterfaceC56387yDm gasjUx;
    public android.view.View getFieldNames;
    public java.lang.String getPostValueLengthLimit;
    public final InterfaceC56387yDm giSNqX;
    public MarketTopInfo gkJEwt;
    public MarketCoinInfo hUfVAv;
    public int iRxXKY;
    public boolean iwGUEr;
    public boolean sSMYrx;
    public InterfaceC39499ptW valueOf;
    public android.widget.FrameLayout values;
    public boolean zLjUOn;
    public boolean zuBGHE;
    public kotlin.Pair<? extends java.lang.CharSequence, java.lang.String> zuWLRA;
    public static final Application Companion = new Application(null);
    public static final int AYXKKw = 8;
    public java.lang.String iZzfmt = "";
    public boolean DbNXlk = true;
    public boolean getNewProxyInstance = true;
    public final InterfaceC56387yDm ORxRYg = C56392yDr.copydefault(new Function0() { // from class: o.pim
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ViewOnClickListenerC38857phO.sSMYrx(this.OLrzqt);
        }
    });
    public boolean zsXlph = true;
    public boolean hDKMBd = true;
    public java.lang.String OcIXYQ = "kline_dark";
    public int AxsJAYaxsJAY = -1;
    public int RlQdEF = -1;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.pij
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ViewOnClickListenerC38857phO.gEmmrt();
        }
    });
    public int fIwbmz = Color.parseColor("#121212");
    public int OBJEWx = Color.parseColor("#FFFFFF");
    public int uzCIH = Color.parseColor("#1A1A1A");
    public int fARcdN = Color.parseColor("#EBEBEB");
    public int ejfBZ = Color.parseColor("#2E2E2E");
    public boolean wlaJM = true;
    public java.lang.String gEmmrt = "";
    public final java.util.ArrayList<InterfaceC38786pfx> dNCPSb = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.CharSequence> RKDWNf = new java.util.ArrayList<>();
    public final java.util.ArrayList<java.lang.String> isConnected = new java.util.ArrayList<>();
    public int DCJXGO = -1;

    /* JADX INFO: renamed from: o.phO$TaskStackBuilder */
    public static final /* synthetic */ class TaskStackBuilder implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ(int i) {
        int i2 = this.DCJXGO;
        return i2 == -1 ? i : (!this.iwGUEr || i >= i2) ? i + 1 : i;
    }

    public final void AYXKKw() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(java.lang.String str) {
        this.aKErDB = str;
    }

    @Override // o.InterfaceC39556pua
    public void KWHzl(MarketArbCoinInfo marketArbCoinInfo) {
    }

    @Override // o.InterfaceC39502ptZ
    public void OFhtUX() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt(int i) {
        return !this.iwGUEr ? i : i + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(java.lang.String str) {
        this.djSkpj = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String ejfBZ() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketCoinInfo fARcdN() {
        return this.hUfVAv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fIwbmz() {
        return this.aKErDB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.AxsJAYaxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNewProxyInstance() {
        return this.DCJXGO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.CharSequence> hDKMBd() {
        return this.RKDWNf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39502ptZ
    public void k_(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.iZzfmt = str;
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

    public ViewOnClickListenerC38857phO() {
        final Function0 function0 = null;
        this.gasjUx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(pCT.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.MarketKlinePortraitFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.MarketKlinePortraitFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.MarketKlinePortraitFragment$special$$inlined$activityViewModels$default$3
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
        this.DAIeex = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(pCZ.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.MarketKlinePortraitFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.MarketKlinePortraitFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.MarketKlinePortraitFragment$special$$inlined$activityViewModels$default$6
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
        this.DXXBbs = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C37854pDd.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.MarketKlinePortraitFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.MarketKlinePortraitFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.MarketKlinePortraitFragment$special$$inlined$activityViewModels$default$9
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
        this.giSNqX = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(pCW.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.MarketKlinePortraitFragment$special$$inlined$activityViewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.MarketKlinePortraitFragment$special$$inlined$activityViewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.MarketKlinePortraitFragment$special$$inlined$activityViewModels$default$12
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
        this.QKudOq = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C54472xJr.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.MarketKlinePortraitFragment$special$$inlined$activityViewModels$default$13
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.MarketKlinePortraitFragment$special$$inlined$activityViewModels$default$14
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.MarketKlinePortraitFragment$special$$inlined$activityViewModels$default$15
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
        this.OuxcSI = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C54822xWp.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.MarketKlinePortraitFragment$special$$inlined$activityViewModels$default$16
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.MarketKlinePortraitFragment$special$$inlined$activityViewModels$default$17
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.MarketKlinePortraitFragment$special$$inlined$activityViewModels$default$18
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

    private final pCT QbewEr() {
        return (pCT) this.gasjUx.getValue();
    }

    public final pCZ fJNWhG() {
        return (pCZ) this.DAIeex.getValue();
    }

    private final C37854pDd QUSxYX() {
        return (C37854pDd) this.DXXBbs.getValue();
    }

    private final InterfaceC56387yDm<KlineTimeAnchorViewModel> QVAiDq() {
        return (InterfaceC56387yDm) this.ORxRYg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pCW QfsBiF() {
        return (pCW) this.giSNqX.getValue();
    }

    public final void OLrzqt(MarketCoinInfo marketCoinInfo) {
        this.hUfVAv = marketCoinInfo;
        KWHzl(marketCoinInfo);
    }

    public static final uBU gEmmrt() {
        return (uBU) C43251rlk.copydefault(uBU.class);
    }

    public final uBU isConnected() {
        return (uBU) this.AhwBna.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void KWHzl(MarketCoinInfo marketCoinInfo) {
        BizInstrument bizInstrumentValueOf;
        if (marketCoinInfo == null) {
            bizInstrumentValueOf = null;
        } else {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
            if (interfaceC54581xNrCopydefault == null || (bizInstrumentValueOf = InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketCoinInfo.getInstrumentType(), marketCoinInfo.getInstrumentId(), null, null, 12, null)) == null) {
                AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl(marketCoinInfo.getInstrumentType());
                if (abstractC54531xLwKWHzl != null) {
                    bizInstrumentValueOf = abstractC54531xLwKWHzl.valueOf(marketCoinInfo.getInstrumentId());
                }
            }
        }
        this.fJNWhG = bizInstrumentValueOf;
    }

    public final C54472xJr AuCTel() {
        return (C54472xJr) this.QKudOq.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C54822xWp aKErDB() {
        return (C54822xWp) this.OuxcSI.getValue();
    }

    public final void AhwBna() {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        final MarketCoinInfo marketCoinInfo = this.hUfVAv;
        if (marketCoinInfo != null) {
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class);
            TradeKey tradeKey = TradeKey.MANAGER;
            InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) interfaceC49425uoM.KWHzl(tradeKey)).copydefault();
            Unit unit = null;
            BizInstrument minSuggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketCoinInfo.getInstrumentType(), marketCoinInfo.getInstrumentId(), null, null, 12, null) : null;
            this.djBIcL = minSuggestedInstrument$default;
            if (minSuggestedInstrument$default != null) {
                InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                if (interfaceC49425uoM2 != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(tradeKey)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(marketCoinInfo.getInstrumentType())) != null) {
                    abstractC54531xLwOLrzqt.AEQbTJ(minSuggestedInstrument$default, new Function1() { // from class: o.pid
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ViewOnClickListenerC38857phO.AEQbTJ(this.OLrzqt, marketCoinInfo, ((java.lang.Boolean) obj).booleanValue());
                        }
                    });
                    unit = Unit.INSTANCE;
                }
                if (unit != null) {
                    return;
                }
            }
            ORxRYg();
            pUU.copydefault(getTAG(), "bizInst = null");
            OcIXYQ();
        }
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, MarketCoinInfo marketCoinInfo, boolean z) {
        if (z) {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
            viewOnClickListenerC38857phO.djBIcL = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketCoinInfo.getInstrumentType(), marketCoinInfo.getInstrumentId(), null, null, 12, null) : null;
            if (viewOnClickListenerC38857phO.AubY) {
                viewOnClickListenerC38857phO.AubY = false;
                viewOnClickListenerC38857phO.QOLQEE();
            } else {
                viewOnClickListenerC38857phO.KWHzl(viewOnClickListenerC38857phO.hUfVAv);
                C38685peB c38685peBAkhnZx = viewOnClickListenerC38857phO.AkhnZx();
                if (c38685peBAkhnZx != null) {
                    c38685peBAkhnZx.AwvSrB();
                }
                viewOnClickListenerC38857phO.zLjUOn();
                viewOnClickListenerC38857phO.RcXXUw();
            }
        } else {
            viewOnClickListenerC38857phO.ORxRYg();
            pUU.copydefault(viewOnClickListenerC38857phO.getTAG(), "loadBizInfoDetail failed");
            viewOnClickListenerC38857phO.OcIXYQ();
        }
        return Unit.INSTANCE;
    }

    public final void uzCIH() {
        android.widget.LinearLayout linearLayout = this.RJOkX;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public final void ORxRYg() {
        android.widget.LinearLayout linearLayout = this.RJOkX;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        FragmentActivity activity = getActivity();
        ActivityC38834pgs activityC38834pgs = activity instanceof ActivityC38834pgs ? (ActivityC38834pgs) activity : null;
        if (activityC38834pgs != null) {
            activityC38834pgs.OLrzqt();
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC38565pbo, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        InterfaceC39499ptW interfaceC39499ptW;
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        this.AkhnZx = (android.app.Activity) context;
        if (!(getActivity() instanceof ActivityC38834pgs)) {
            interfaceC39499ptW = (InterfaceC39499ptW) context;
        } else {
            if (this instanceof InterfaceC39499ptW) {
                obj = this;
            } else {
                androidx.fragment.app.Fragment parentFragment = getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof InterfaceC39499ptW)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                boolean z = parentFragment instanceof InterfaceC39499ptW;
                java.lang.Object obj2 = parentFragment;
                if (!z) {
                    obj2 = null;
                }
                obj = (InterfaceC39499ptW) obj2;
            }
            interfaceC39499ptW = (InterfaceC39499ptW) obj;
        }
        this.valueOf = interfaceC39499ptW;
    }

    /* JADX INFO: renamed from: o.phO$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.phO.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final ViewOnClickListenerC38857phO OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            ViewOnClickListenerC38857phO viewOnClickListenerC38857phO = new ViewOnClickListenerC38857phO();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(oLT.gEmmrt(), str);
            bundle.putString(oLT.valueOf(), str2);
            bundle.putString("from", str3);
            bundle.putBoolean("klineNeedLoad", z);
            bundle.putString("from_scene", str4);
            bundle.putString("tag", str5);
            viewOnClickListenerC38857phO.setArguments(bundle);
            return viewOnClickListenerC38857phO;
        }
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        boolean z = false;
        if (this.zLjUOn) {
            this.zLjUOn = false;
            getFieldNames();
        }
        if (this.AuCTelauCTel) {
            this.AuCTelauCTel = false;
            InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43251rlk.OLrzqt(InterfaceC49317umK.class);
            xND xndAEQbTJ = ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).AEQbTJ();
            boolean z2 = interfaceC49317umK != null && interfaceC49317umK.AEQbTJ() && xndAEQbTJ != null && Intrinsics.EZpvd(xndAEQbTJ.AYXKKw(), java.lang.Boolean.TRUE);
            boolean zEZpvd = xndAEQbTJ != null ? Intrinsics.EZpvd(xndAEQbTJ.gEmmrt(), java.lang.Boolean.TRUE) : false;
            boolean z3 = xndAEQbTJ != null && xndAEQbTJ.KWHzl();
            if (interfaceC49317umK != null && interfaceC49317umK.OLrzqt()) {
                z = true;
            }
            if (this.sSMYrx == z2 && this.gHZMYf == zEZpvd && this.zuBGHE == z3 && this.QKVWgx == z) {
                return;
            }
            this.sSMYrx = z2;
            this.gHZMYf = zEZpvd;
            this.zuBGHE = z3;
            this.QKVWgx = z;
            this.AubY = true;
            zuBGHE();
        }
    }

    public final void zuBGHE() {
        pUU.copydefault("Kline", "klineEnsureInitialize: 开始初始化");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketKlinePortraitFragment$klineEnsureInitialize$1(this, null), 3, null);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        ActivityResultCaller activityResultCaller;
        ConstraintLayout constraintLayout;
        FragmentActivity activity;
        android.view.Window window;
        android.view.View decorView;
        WeakReference<InterfaceC39272ppF> weakReference;
        InterfaceC39272ppF interfaceC39272ppF;
        java.lang.String str;
        Intrinsics.checkNotNullParameter(view, "");
        postponeEnterTransition();
        this.OcIXYQ = SPUtils.getString("kline_theme_type", "kline_dark");
        android.os.Bundle arguments = getArguments();
        this.zsXlph = arguments != null ? arguments.getBoolean("klineNeedLoad", true) : true;
        android.os.Bundle arguments2 = getArguments();
        this.djSkpj = arguments2 != null ? arguments2.getString(oLT.gEmmrt()) : null;
        android.os.Bundle arguments3 = getArguments();
        this.aKErDB = arguments3 != null ? arguments3.getString(oLT.valueOf()) : null;
        android.os.Bundle arguments4 = getArguments();
        this.RcXXUw = arguments4 != null ? arguments4.getString("from") : null;
        android.os.Bundle arguments5 = getArguments();
        this.AuCTel = arguments5 != null ? arguments5.getString("from_scene") : null;
        android.os.Bundle arguments6 = getArguments();
        this.getPostValueLengthLimit = arguments6 != null ? arguments6.getString("tag") : null;
        this.QbewEr = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.geAOna);
        this.flVtFt = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.zFZsbn);
        this.fvQaOB = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.glXhWM);
        this.finit = (C33624mzv) view.findViewById(C35964oKf.StateListAnimator.QSbQqJ);
        this.fFgQHt = (C33624mzv) view.findViewById(C35964oKf.StateListAnimator.setCurrentKeyboardTarget);
        this.fZBcTu = (C33624mzv) view.findViewById(C35964oKf.StateListAnimator.fdazkH);
        this.gGvvIC = (C33624mzv) view.findViewById(C35964oKf.StateListAnimator.DkGEDn);
        this.AxsJAYsNCnLh = (C52794wYp) view.findViewById(C35964oKf.StateListAnimator.iTrKTi);
        this.ODWQjV = (C52794wYp) view.findViewById(C35964oKf.StateListAnimator.iluEmO);
        this.QOLQEE = (ConstraintLayout) view.findViewById(C35964oKf.StateListAnimator.dXcUrg);
        this.RJOkX = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.dYepVG);
        this.OqFWZa = (C55173xeu) view.findViewById(C35964oKf.StateListAnimator.sWlOSi);
        this.dvKsVJ = (C33624mzv) view.findViewById(C35964oKf.StateListAnimator.aPFruk);
        this.dxcTrN = (C33624mzv) view.findViewById(C35964oKf.StateListAnimator.apNKau);
        this.QfsBiF = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.DPVBvL);
        this.fetchVPNInfo = view.findViewById(C35964oKf.StateListAnimator.ORxRYg);
        this.getFieldNames = view.findViewById(C35964oKf.StateListAnimator.DlmWDR);
        this.DarRvM = (C55254xgV) view.findViewById(C35964oKf.StateListAnimator.fAklCm);
        this.QkdxfA = (ViewPager2) view.findViewById(C35964oKf.StateListAnimator.gFTCsA);
        this.values = (android.widget.FrameLayout) view.findViewById(C35964oKf.StateListAnimator.postOrRun);
        if (this.hUfVAv == null && (str = this.djSkpj) != null && this.aKErDB != null) {
            Intrinsics.copydefault((java.lang.Object) str);
            java.lang.String str2 = this.aKErDB;
            Intrinsics.copydefault((java.lang.Object) str2);
            OLrzqt(new MarketCoinInfo(str, str2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null));
        }
        zuBGHE();
        UeEOUB();
        aKErDB().valueOf().observe(this, new TaskStackBuilder(new Function1() { // from class: o.piG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38857phO.gEmmrt(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        if (!this.zsXlph) {
            isConnected(QbewEr().KWHzl());
        }
        MarketCoinInfo marketCoinInfo = this.hUfVAv;
        if (marketCoinInfo != null) {
            aKErDB().KWHzl().setValue(marketCoinInfo);
        }
        InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43251rlk.OLrzqt(InterfaceC49317umK.class);
        xND xndAEQbTJ = ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).AEQbTJ();
        this.sSMYrx = interfaceC49317umK != null && interfaceC49317umK.AEQbTJ() && xndAEQbTJ != null && Intrinsics.EZpvd(xndAEQbTJ.AYXKKw(), java.lang.Boolean.TRUE);
        this.gHZMYf = xndAEQbTJ != null ? Intrinsics.EZpvd(xndAEQbTJ.gEmmrt(), java.lang.Boolean.TRUE) : false;
        this.zuBGHE = xndAEQbTJ != null && xndAEQbTJ.KWHzl();
        this.QKVWgx = interfaceC49317umK != null && interfaceC49317umK.OLrzqt();
        this.AwvSrB = pFP.OLrzqt.OLrzqt();
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("trade_button_position");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function1 = new Function1() { // from class: o.phY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38857phO.isConnected(this.KWHzl, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pib
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC38857phO.gEmmrt(function1, obj);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ2 = RxBus.AEQbTJ("kline_theme_type");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ2, this);
        final Function1 function12 = new Function1() { // from class: o.pic
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38857phO.gEmmrt(this.EZpvd, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.phZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC38857phO.OLrzqt(function12, obj);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ3 = RxBus.AEQbTJ("kline_layout_style");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ3, "");
        AbstractC58185ywX abstractC58185ywXEZpvd3 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ3, this);
        final Function1 function13 = new Function1() { // from class: o.pia
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38857phO.AYXKKw(this.OLrzqt, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd3.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pih
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC38857phO.valueOf(function13, obj);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ4 = RxBus.AEQbTJ("ev_account_login", "ev_account_logout", "ev_account_change");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ4, "");
        AbstractC58185ywX abstractC58185ywXEZpvd4 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ4, this);
        final Function1 function14 = new Function1() { // from class: o.pif
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38857phO.valueOf(this.KWHzl, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd4.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pie
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC38857phO.AhwBna(function14, obj);
            }
        });
        this.QUSxYX = (C39559pud) new ViewModelProvider(this).get(C39559pud.class);
        if (this instanceof C55427xjj) {
            activityResultCaller = this;
        } else {
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof C55427xjj)) {
                parentFragment = parentFragment.getParentFragment();
            }
            activityResultCaller = (C55427xjj) (parentFragment instanceof C55427xjj ? parentFragment : null);
        }
        C55427xjj c55427xjj = (C55427xjj) activityResultCaller;
        if (c55427xjj != null && !c55427xjj.gEmmrt) {
            android.widget.LinearLayout linearLayout = this.flVtFt;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout2 = this.fvQaOB;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        }
        DTwDnp();
        AwvSrB();
        getFieldNames();
        this.DTwDnp = new WeakReference<>(new C39268ppB());
        final android.content.Context context = getContext();
        if (context != null && (constraintLayout = this.QOLQEE) != null && (activity = getActivity()) != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (weakReference = this.DTwDnp) != null && (interfaceC39272ppF = weakReference.get()) != null) {
            C36109oPp c36109oPpKWHzl = C36109oPp.KWHzl(constraintLayout);
            Intrinsics.checkNotNullExpressionValue(c36109oPpKWHzl, "");
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            interfaceC39272ppF.EZpvd(context, decorView, c36109oPpKWHzl, childFragmentManager, new Function0() { // from class: o.pig
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ViewOnClickListenerC38857phO.AxsJAY(this.OLrzqt);
                }
            }, new Function0() { // from class: o.phV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ViewOnClickListenerC38857phO.EZpvd(this.EZpvd, context);
                }
            });
        }
        fJNWhG().AEQbTJ().observe(this, new TaskStackBuilder(new Function1() { // from class: o.phX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38857phO.values(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        QUSxYX().valueOf().observe(getViewLifecycleOwner(), new TaskStackBuilder(new Function1() { // from class: o.phT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38857phO.EZpvd(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit gEmmrt(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            viewOnClickListenerC38857phO.QKVWgx();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit isConnected(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, java.lang.String str) {
        viewOnClickListenerC38857phO.EZpvd(SPUtils.getBoolean("trade_button_left", true));
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, java.lang.String str) {
        FragmentActivity activity = viewOnClickListenerC38857phO.getActivity();
        if (activity != null) {
            activity.recreate();
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, java.lang.String str) {
        FragmentActivity activity = viewOnClickListenerC38857phO.getActivity();
        if (activity != null) {
            activity.recreate();
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, java.lang.String str) {
        viewOnClickListenerC38857phO.AuCTelauCTel = true;
        return Unit.INSTANCE;
    }

    public static final Unit AxsJAY(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO) {
        C39014pkM c39014pkMValues = viewOnClickListenerC38857phO.values();
        if (c39014pkMValues != null) {
            c39014pkMValues.getNewProxyInstance();
        }
        C37908pFd.copydefault(true);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, android.content.Context context) {
        viewOnClickListenerC38857phO.AkhnZx("");
        if (viewOnClickListenerC38857phO.isAdded()) {
            C39014pkM c39014pkMValues = viewOnClickListenerC38857phO.values();
            if (c39014pkMValues != null) {
                c39014pkMValues.iwGUEr();
            }
            if (viewOnClickListenerC38857phO.getParentFragmentManager().findFragmentById(C35964oKf.StateListAnimator.postOrRun) == null && !viewOnClickListenerC38857phO.AxsJAY) {
                LifecycleOwnerKt.getLifecycleScope(viewOnClickListenerC38857phO).launchWhenResumed(new MarketKlinePortraitFragment$initView$7$1$1$2$1(context, viewOnClickListenerC38857phO, null));
            }
            viewOnClickListenerC38857phO.AxsJAY = false;
        }
        return Unit.INSTANCE;
    }

    public static final Unit values(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "news")) {
            viewOnClickListenerC38857phO.EZpvd("feeds");
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, java.lang.Boolean bool) {
        LifecycleOwner viewLifecycleOwner = viewOnClickListenerC38857phO.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mUR.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MarketKlinePortraitFragment$initView$9$1(viewOnClickListenerC38857phO, null), 3, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void resetBotButton$default(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        viewOnClickListenerC38857phO.AEQbTJ(z, z2);
    }

    public static /* synthetic */ java.lang.String generateDisplayCoinName$default(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return viewOnClickListenerC38857phO.AEQbTJ(z);
    }

    public final java.lang.String AEQbTJ(boolean z) {
        BizInstrument bizInstrument = this.fJNWhG;
        if (bizInstrument != null && bizInstrument.isPreMarketPair()) {
            C48914uef c48914uef = C48914uef.EZpvd;
            MarketCoinInfo marketCoinInfo = this.hUfVAv;
            java.lang.String strEZpvd = c48914uef.EZpvd(marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null, z);
            return strEZpvd == null ? "" : strEZpvd;
        }
        C48914uef c48914uef2 = C48914uef.EZpvd;
        MarketCoinInfo marketCoinInfo2 = this.hUfVAv;
        java.lang.String instrumentId = marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentId() : null;
        MarketCoinInfo marketCoinInfo3 = this.hUfVAv;
        return C48914uef.getTitleByIdAndType$default(c48914uef2, instrumentId, marketCoinInfo3 != null ? marketCoinInfo3.getInstrumentType() : null, false, false, getContext(), z, false, 76, null);
    }

    public final FutureInstrument fetchVPNInfo() {
        BizInstrument bizInstrument = this.fJNWhG;
        if (bizInstrument instanceof FutureInstrument) {
            return (FutureInstrument) bizInstrument;
        }
        return null;
    }

    public final void AwvSrB() {
        pFP pfp = pFP.OLrzqt;
        java.lang.String str = this.aKErDB;
        if (str == null) {
            str = "";
        }
        if (!pfp.copydefault(str)) {
            C52794wYp c52794wYp = this.AxsJAYsNCnLh;
            if (c52794wYp != null) {
                c52794wYp.setBackgroundTintList(null);
            }
            C52794wYp c52794wYp2 = this.ODWQjV;
            if (c52794wYp2 != null) {
                c52794wYp2.setBackgroundTintList(null);
            }
            C52794wYp c52794wYp3 = this.AxsJAYsNCnLh;
            if (c52794wYp3 != null) {
                c52794wYp3.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.htlTjW));
            }
            C52794wYp c52794wYp4 = this.ODWQjV;
            if (c52794wYp4 != null) {
                c52794wYp4.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.htlTjW));
                return;
            }
            return;
        }
        android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.AEQbTJ(), (java.lang.Object) "kline_dark") ? C52761wXj.Activity.zhUgOk : C52761wXj.Activity.sTzBva));
        Intrinsics.copydefault(colorStateListValueOf);
        C52794wYp c52794wYp5 = this.AxsJAYsNCnLh;
        if (c52794wYp5 != null) {
            c52794wYp5.setBackgroundTintList(colorStateListValueOf);
        }
        C52794wYp c52794wYp6 = this.ODWQjV;
        if (c52794wYp6 != null) {
            c52794wYp6.setBackgroundTintList(colorStateListValueOf);
        }
        C52794wYp c52794wYp7 = this.AxsJAYsNCnLh;
        if (c52794wYp7 != null) {
            c52794wYp7.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
        }
        C52794wYp c52794wYp8 = this.ODWQjV;
        if (c52794wYp8 != null) {
            c52794wYp8.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DTwDnp() {
        int i;
        java.lang.String str = this.aKErDB;
        if (str != null) {
            switch (str.hashCode()) {
                case -2027980370:
                    i = !str.equals("MARGIN") ? C52761wXj.TaskDescription.DDxOgT : C52761wXj.TaskDescription.QYvkLl;
                    break;
                case 2552066:
                    if (!str.equals("SPOT")) {
                    }
                    break;
                case 2558355:
                    if (str.equals("SWAP")) {
                        i = C52761wXj.TaskDescription.svY;
                        break;
                    }
                    break;
                case 214415088:
                    if (!str.equals("FUTURES")) {
                    }
                    break;
            }
        }
        C33624mzv c33624mzv = this.finit;
        if (c33624mzv != null) {
            pFQ.AEQbTJ(c33624mzv, i);
        }
        C33624mzv c33624mzv2 = this.fFgQHt;
        if (c33624mzv2 != null) {
            pFQ.AEQbTJ(c33624mzv2, i);
        }
        int i2 = Intrinsics.EZpvd((java.lang.Object) this.aKErDB, (java.lang.Object) "OPTION") ? C55688xof.Application.registerUser : C35964oKf.Fragment.copydefault;
        C33624mzv c33624mzv3 = this.finit;
        if (c33624mzv3 != null) {
            c33624mzv3.setText(i2);
        }
        C33624mzv c33624mzv4 = this.fFgQHt;
        if (c33624mzv4 != null) {
            c33624mzv4.setText(i2);
        }
        if (this.gHZMYf) {
            MarketCoinInfo marketCoinInfo = this.hUfVAv;
            Intrinsics.copydefault(marketCoinInfo);
            if (!AEQbTJ(marketCoinInfo) && KWHzl(this.fJNWhG)) {
                C33624mzv c33624mzv5 = this.finit;
                if (c33624mzv5 != null) {
                    c33624mzv5.setVisibility(0);
                }
                C33624mzv c33624mzv6 = this.fFgQHt;
                if (c33624mzv6 != null) {
                    c33624mzv6.setVisibility(0);
                }
                C33624mzv c33624mzv7 = this.finit;
                if (c33624mzv7 != null) {
                    c33624mzv7.setAlpha(1.0f);
                }
                C33624mzv c33624mzv8 = this.fFgQHt;
                if (c33624mzv8 != null) {
                    c33624mzv8.setAlpha(1.0f);
                    return;
                }
                return;
            }
        }
        C33624mzv c33624mzv9 = this.finit;
        if (c33624mzv9 != null) {
            c33624mzv9.setVisibility(8);
        }
        C33624mzv c33624mzv10 = this.fFgQHt;
        if (c33624mzv10 != null) {
            c33624mzv10.setVisibility(8);
        }
        C33624mzv c33624mzv11 = this.finit;
        if (c33624mzv11 != null) {
            c33624mzv11.setAlpha(0.3f);
        }
        C33624mzv c33624mzv12 = this.fFgQHt;
        if (c33624mzv12 != null) {
            c33624mzv12.setAlpha(0.3f);
        }
    }

    private final void UeEOUB() {
        C55173xeu c55173xeu = this.OqFWZa;
        if (c55173xeu != null) {
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.pio
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ViewOnClickListenerC38857phO.copydefault(this.AEQbTJ, view);
                }
            });
        }
        C33624mzv c33624mzv = this.dvKsVJ;
        if (c33624mzv != null) {
            c33624mzv.setVisibility(zsXlph() ? 0 : 8);
        }
        C33624mzv c33624mzv2 = this.dxcTrN;
        if (c33624mzv2 != null) {
            c33624mzv2.setVisibility(zsXlph() ? 0 : 8);
        }
        C33624mzv c33624mzv3 = this.dxcTrN;
        if (c33624mzv3 != null) {
            c33624mzv3.setOnClickListener(this);
        }
        C33624mzv c33624mzv4 = this.dvKsVJ;
        if (c33624mzv4 != null) {
            c33624mzv4.setOnClickListener(this);
        }
        C52794wYp c52794wYp = this.AxsJAYsNCnLh;
        if (c52794wYp != null) {
            c52794wYp.setOnClickListener(this);
        }
        C52794wYp c52794wYp2 = this.ODWQjV;
        if (c52794wYp2 != null) {
            c52794wYp2.setOnClickListener(this);
        }
        C33624mzv c33624mzv5 = this.finit;
        if (c33624mzv5 != null) {
            c33624mzv5.setOnClickListener(this);
        }
        C33624mzv c33624mzv6 = this.fFgQHt;
        if (c33624mzv6 != null) {
            c33624mzv6.setOnClickListener(this);
        }
        C33624mzv c33624mzv7 = this.fZBcTu;
        if (c33624mzv7 != null) {
            c33624mzv7.setOnClickListener(this);
        }
        C33624mzv c33624mzv8 = this.gGvvIC;
        if (c33624mzv8 != null) {
            c33624mzv8.setOnClickListener(this);
        }
        AuCTel().ejfBZ().observe(this, new TaskStackBuilder(new Function1() { // from class: o.pip
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38857phO.AEQbTJ(this.KWHzl, (java.util.ArrayList) obj);
            }
        }));
        QVAiDq().getValue().EZpvd().observe(this, new TaskStackBuilder(new Function1() { // from class: o.pin
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38857phO.AEQbTJ(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final void copydefault(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, android.view.View view) {
        FragmentActivity activity = viewOnClickListenerC38857phO.getActivity();
        ActivityC38834pgs activityC38834pgs = activity instanceof ActivityC38834pgs ? (ActivityC38834pgs) activity : null;
        if (activityC38834pgs != null) {
            activityC38834pgs.fetchVPNInfo();
        }
        viewOnClickListenerC38857phO.uzCIH();
        viewOnClickListenerC38857phO.zuBGHE();
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            viewOnClickListenerC38857phO.EZpvd(arrayList);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            viewOnClickListenerC38857phO.OcIXYQ();
        }
        return Unit.INSTANCE;
    }

    public final void OcIXYQ() {
        startPostponedEnterTransition();
        QVAiDq().getValue().EZpvd().setValue(java.lang.Boolean.FALSE);
        QVAiDq().getValue().KWHzl(false);
    }

    public final void zLjUOn() {
        djSkpj();
        if (AubY()) {
            EZpvd("new_coin_overview");
        }
    }

    private final void djSkpj() {
        if (isAdded()) {
            AuCTelauCTel();
            wlaJM();
        }
    }

    public final void wlaJM() {
        ViewPager2 viewPager2;
        TabLayout.TabView tabView;
        TabLayout.TabView tabView2;
        TabLayout tabLayoutCopydefault;
        this.getNewProxyInstance = true;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        java.util.ArrayList<InterfaceC38786pfx> arrayList = this.dNCPSb;
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        C38769pfg c38769pfg = new C38769pfg(childFragmentManager, arrayList, lifecycle);
        this.QVAiDq = c38769pfg;
        ViewPager2 viewPager22 = this.QkdxfA;
        if (viewPager22 != null) {
            viewPager22.setAdapter(c38769pfg);
        }
        C37937pGf c37937pGf = this.DCUTEI;
        if (c37937pGf != null) {
            c37937pGf.KWHzl();
        }
        C55254xgV c55254xgV = this.DarRvM;
        Intrinsics.copydefault(c55254xgV);
        TabLayout tabLayoutCopydefault2 = c55254xgV.copydefault();
        ViewPager2 viewPager23 = this.QkdxfA;
        Intrinsics.copydefault(viewPager23);
        C37937pGf c37937pGf2 = new C37937pGf(tabLayoutCopydefault2, viewPager23, new C37937pGf.ActionBar() { // from class: o.piB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C37937pGf.ActionBar
            public final void KWHzl(TabLayout.Tab tab, int i) {
                ViewOnClickListenerC38857phO.copydefault(this.KWHzl, tab, i);
            }
        });
        c37937pGf2.AEQbTJ();
        this.DCUTEI = c37937pGf2;
        C55254xgV c55254xgV2 = this.DarRvM;
        if (c55254xgV2 != null && (tabLayoutCopydefault = c55254xgV2.copydefault()) != null) {
            tabLayoutCopydefault.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Fragment());
        }
        ViewPager2 viewPager24 = this.QkdxfA;
        if (viewPager24 != null) {
            viewPager24.setOffscreenPageLimit(-1);
        }
        int i = 0;
        for (java.lang.Object obj : this.RKDWNf) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C55254xgV c55254xgV3 = this.DarRvM;
            TabLayout.Tab tabCopydefault = c55254xgV3 != null ? c55254xgV3.copydefault(i) : null;
            if (tabCopydefault != null && (tabView2 = tabCopydefault.view) != null) {
                tabView2.setLongClickable(false);
            }
            if (Build.VERSION.SDK_INT >= 26 && tabCopydefault != null && (tabView = tabCopydefault.view) != null) {
                tabView.setTooltipText(null);
            }
            i++;
        }
        ViewPager2 viewPager25 = this.QkdxfA;
        if (viewPager25 != null) {
            viewPager25.registerOnPageChangeCallback(new SharedElementCallback());
        }
        setViewPagerScroll(true);
        if (!QVAiDq().getValue().copydefault() && (viewPager2 = this.QkdxfA) != null) {
            viewPager2.post(new java.lang.Runnable() { // from class: o.piA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnClickListenerC38857phO.zuBGHE(this.AEQbTJ);
                }
            });
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void copydefault(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(viewOnClickListenerC38857phO.RKDWNf.get(i));
        java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(viewOnClickListenerC38857phO.isConnected, i);
        if (str != null) {
            tab.setContentDescription(str);
        }
    }

    /* JADX INFO: renamed from: o.phO$Fragment */
    public static final class Fragment implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Fragment() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: java.util.ArrayList<java.lang.CharSequence> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            java.lang.CharSequence text = tab != null ? tab.getText() : null;
            kotlin.Pair pair = ViewOnClickListenerC38857phO.this.zuWLRA;
            if (text == null || pair == null || !Intrinsics.EZpvd(text, pair.getFirst())) {
                return;
            }
            int iIndexOf = ViewOnClickListenerC38857phO.this.hDKMBd().indexOf(text);
            if (iIndexOf > -1) {
                ViewOnClickListenerC38857phO.this.hDKMBd().set(iIndexOf, pair.getSecond());
            }
            tab.setText((java.lang.CharSequence) pair.getSecond());
            kotlin.Pair pair2 = ViewOnClickListenerC38857phO.this.zuWLRA;
            java.lang.CharSequence charSequence = pair2 != null ? (java.lang.CharSequence) pair2.getFirst() : null;
            kotlin.Pair pair3 = ViewOnClickListenerC38857phO.this.zuWLRA;
            if (Intrinsics.EZpvd((java.lang.Object) charSequence, (java.lang.Object) (pair3 != null ? (java.lang.String) pair3.getSecond() : null))) {
                return;
            }
            C32866mlf.onEvent$default("KLine_Top_FeedsRedDot_Click", (TrackChannel[]) null, new Function1() { // from class: o.piH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC38857phO.Fragment.copydefault((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.phO$SharedElementCallback */
    public static final class SharedElementCallback extends ViewPager2.OnPageChangeCallback {
        public SharedElementCallback() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            java.lang.String instrumentType;
            InterfaceC54577xNn interfaceC54577xNn;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt;
            xOU xouWlaJM;
            super.onPageSelected(i);
            ViewOnClickListenerC38857phO.this.iRxXKY = i;
            if (i != 0) {
                ViewOnClickListenerC38857phO.this.fERRXa();
            }
            if (i == 0) {
                ViewOnClickListenerC38857phO.this.copydefault("chart");
                android.widget.LinearLayout linearLayout = ViewOnClickListenerC38857phO.this.QbewEr;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
            } else if (i == 1) {
                ViewOnClickListenerC38857phO.this.djBIcL();
                android.widget.LinearLayout linearLayout2 = ViewOnClickListenerC38857phO.this.QbewEr;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
            } else if (i == 2) {
                android.widget.LinearLayout linearLayout3 = ViewOnClickListenerC38857phO.this.QbewEr;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                TrackChannel[] trackChannelArr = (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length);
                final ViewOnClickListenerC38857phO viewOnClickListenerC38857phO = ViewOnClickListenerC38857phO.this;
                C32866mlf.EZpvd("KLine_TradingData_Tab_Click", trackChannelArr, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.piL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ViewOnClickListenerC38857phO.SharedElementCallback.KWHzl(viewOnClickListenerC38857phO, (EventParamsList) obj);
                    }
                });
                ViewOnClickListenerC38857phO.this.copydefault("data");
            } else if (i == ViewOnClickListenerC38857phO.this.AEQbTJ(3)) {
                android.widget.LinearLayout linearLayout4 = ViewOnClickListenerC38857phO.this.QbewEr;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                }
                ViewOnClickListenerC38857phO.this.copydefault(ExtJson.BRC20TYPE_TRADE);
                InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) ? null : xouWlaJM.KWHzl()), (java.lang.Object) "trade_manual")) {
                    MarketCoinInfo marketCoinInfoFARcdN = ViewOnClickListenerC38857phO.this.fARcdN();
                    if (marketCoinInfoFARcdN == null || (instrumentType = marketCoinInfoFARcdN.getInstrumentType()) == null) {
                        instrumentType = "SPOT";
                    }
                } else {
                    instrumentType = "BOTS";
                }
                EventParamsList eventParamsList = new EventParamsList();
                eventParamsList.put("from_deal_type", instrumentType, true);
                Unit unit = Unit.INSTANCE;
                C32866mlf.onEvent$default("app_kpage_tradetab_enter", "Click", "Text", eventParamsList, null, null, 24, null);
            } else if (i == ViewOnClickListenerC38857phO.this.AEQbTJ(4)) {
                android.widget.LinearLayout linearLayout5 = ViewOnClickListenerC38857phO.this.QbewEr;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(8);
                }
            } else if (i == ViewOnClickListenerC38857phO.this.AEQbTJ(5)) {
                android.widget.LinearLayout linearLayout6 = ViewOnClickListenerC38857phO.this.QbewEr;
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(8);
                }
                ViewOnClickListenerC38857phO.this.copydefault("bot");
            } else if (i == ViewOnClickListenerC38857phO.this.getNewProxyInstance()) {
                android.widget.LinearLayout linearLayout7 = ViewOnClickListenerC38857phO.this.QbewEr;
                if (linearLayout7 != null) {
                    linearLayout7.setVisibility(8);
                }
                ViewOnClickListenerC38857phO.this.copydefault("feeds");
            }
            ViewPager2 viewPager2 = ViewOnClickListenerC38857phO.this.QkdxfA;
            if (viewPager2 != null) {
                ViewOnClickListenerC38857phO viewOnClickListenerC38857phO2 = ViewOnClickListenerC38857phO.this;
                if (viewPager2.getCurrentItem() == 0) {
                    if (viewOnClickListenerC38857phO2.wlaJM) {
                        viewOnClickListenerC38857phO2.wlaJM = false;
                    } else {
                        C38685peB c38685peBAkhnZx = viewOnClickListenerC38857phO2.AkhnZx();
                        if (c38685peBAkhnZx != null) {
                            c38685peBAkhnZx.OLrzqt(false);
                        }
                    }
                } else {
                    C38685peB c38685peBAkhnZx2 = viewOnClickListenerC38857phO2.AkhnZx();
                    if (c38685peBAkhnZx2 != null) {
                        c38685peBAkhnZx2.OLrzqt(true);
                    }
                }
            }
            pCW pcwQfsBiF = ViewOnClickListenerC38857phO.this.QfsBiF();
            pcwQfsBiF.KWHzl(pcwQfsBiF.OLrzqt(C33129mqd.gEmmrt(CollectionsKt___CollectionsKt.AkhnZx(ViewOnClickListenerC38857phO.this.hDKMBd(), i))));
        }

        public static final Unit KWHzl(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, EventParamsList eventParamsList) {
            java.lang.String instrumentId;
            java.lang.String instrumentType;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            MarketCoinInfo marketCoinInfoFARcdN = viewOnClickListenerC38857phO.fARcdN();
            if (marketCoinInfoFARcdN == null || (instrumentId = marketCoinInfoFARcdN.getInstrumentId()) == null) {
                instrumentId = "";
            }
            eventParamsList.put("token_pair", instrumentId, false);
            MarketCoinInfo marketCoinInfoFARcdN2 = viewOnClickListenerC38857phO.fARcdN();
            if (marketCoinInfoFARcdN2 != null && (instrumentType = marketCoinInfoFARcdN2.getInstrumentType()) != null) {
                str = instrumentType;
            }
            eventParamsList.put("biz_type", str, true);
            return Unit.INSTANCE;
        }
    }

    public static final void zuBGHE(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO) {
        viewOnClickListenerC38857phO.startPostponedEnterTransition();
    }

    /* JADX INFO: renamed from: o.phO$Activity */
    public static final class Activity implements InterfaceC38786pfx {
        public final /* synthetic */ BizInstrument EZpvd;
        public final /* synthetic */ ViewOnClickListenerC38857phO KWHzl;
        public final /* synthetic */ boolean copydefault;

        public Activity(boolean z, BizInstrument bizInstrument, ViewOnClickListenerC38857phO viewOnClickListenerC38857phO) {
            this.copydefault = z;
            this.EZpvd = bizInstrument;
            this.KWHzl = viewOnClickListenerC38857phO;
        }

        @Override // o.InterfaceC38786pfx
        public androidx.fragment.app.Fragment EZpvd() {
            java.lang.String tradeSymbol;
            java.lang.String instId;
            java.lang.String instType;
            if (this.copydefault) {
                C38910piO.Application application = C38910piO.Companion;
                BizInstrument bizInstrument = this.EZpvd;
                java.lang.String str = "";
                if (bizInstrument == null || (tradeSymbol = bizInstrument.getTradeSymbol()) == null) {
                    tradeSymbol = "";
                }
                BizInstrument bizInstrument2 = this.EZpvd;
                if (bizInstrument2 == null || (instId = bizInstrument2.getInstId()) == null) {
                    instId = "";
                }
                BizInstrument bizInstrument3 = this.EZpvd;
                if (bizInstrument3 != null && (instType = bizInstrument3.getInstType()) != null) {
                    str = instType;
                }
                return application.AEQbTJ(tradeSymbol, instId, str, this.KWHzl);
            }
            return C39718pxd.Companion.KWHzl();
        }
    }

    public final void EZpvd(BizInstrument bizInstrument) {
        boolean zAubY = AubY();
        Activity activity = new Activity(zAubY, bizInstrument, this);
        this.dNCPSb.add(activity);
        this.RKDWNf.add(C33070mpX.AYXKKw(C35964oKf.Fragment.gkJEwt));
        this.isConnected.add("KLineTabOverview");
        if (zAubY) {
            this.AxsJAYaxsJAY = this.dNCPSb.indexOf(activity);
        }
    }

    public final boolean AubY() {
        MarketCoinInfo marketCoinInfo = this.hUfVAv;
        if (marketCoinInfo != null) {
            return pFS.KWHzl.AEQbTJ(marketCoinInfo);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) (r1 != null ? r1.getBizPreQuoteStatus() : null), (java.lang.Object) "ACTIVE") != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AuCTelauCTel() {
        java.lang.Boolean tradFi;
        ActivityResultCaller activityResultCaller;
        java.lang.String tradeSymbol;
        CountDownInfo countDownInfo;
        this.wlaJM = true;
        this.dNCPSb.clear();
        this.RKDWNf.clear();
        this.isConnected.clear();
        this.RlQdEF = -1;
        MarketCoinInfo marketCoinInfo = this.hUfVAv;
        if (marketCoinInfo != null) {
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class);
            TradeKey tradeKey = TradeKey.MANAGER;
            InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) interfaceC49425uoM.KWHzl(tradeKey)).copydefault();
            BizInstrument minSuggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketCoinInfo.getInstrumentType(), marketCoinInfo.getInstrumentId(), null, null, 12, null) : null;
            this.djBIcL = minSuggestedInstrument$default;
            if (minSuggestedInstrument$default != null) {
                java.lang.String bizContinuousStatus = minSuggestedInstrument$default != null ? minSuggestedInstrument$default.getBizContinuousStatus() : null;
                BizInstrument bizInstrument = this.djBIcL;
                java.lang.String type = (bizInstrument == null || (countDownInfo = bizInstrument.getCountDownInfo()) == null) ? null : countDownInfo.getType();
                BizInstrument bizInstrument2 = this.djBIcL;
                pUU.copydefault("eddieBizInst", "initFragments bizInst getBizContinuousStatus " + bizContinuousStatus + " " + type + ", getBizPreQuoteStatus: " + (bizInstrument2 != null ? bizInstrument2.getBizPreQuoteStatus() : null));
                if (AubY()) {
                    OLrzqt(minSuggestedInstrument$default, marketCoinInfo.getInstrumentId(), marketCoinInfo.getInstrumentType(), "0");
                    return;
                }
                java.util.List listGEmmrt = yDY.gEmmrt("SPOT", "SWAP");
                BizInstrument bizInstrument3 = this.djBIcL;
                if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), bizInstrument3 != null ? bizInstrument3.getInstType() : null)) {
                    BizInstrument bizInstrument4 = this.djBIcL;
                    if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument4 != null ? bizInstrument4.getBizContinuousStatus() : null), (java.lang.Object) "1")) {
                        BizInstrument bizInstrument5 = this.djBIcL;
                    }
                    BizInstrument bizInstrument6 = this.djBIcL;
                    if (bizInstrument6 != null) {
                        java.lang.String instId = bizInstrument6.getInstId();
                        java.lang.String instType = bizInstrument6.getInstType();
                        BizInstrument bizInstrument7 = this.djBIcL;
                        OLrzqt(bizInstrument6, instId, instType, Intrinsics.EZpvd(bizInstrument7 != null ? bizInstrument7.getBizContinuousStatus() : null, (java.lang.Object) "1") ? "1" : "3");
                        return;
                    }
                    return;
                }
                this.DbNXlk = true;
                this.dNCPSb.add(new LoaderManager());
                this.RKDWNf.add(C33070mpX.AYXKKw(C35964oKf.Fragment.hUfVAv));
                this.isConnected.add("KLineTabChart");
                this.dNCPSb.add(new PendingIntent());
                this.RKDWNf.add(C33070mpX.AYXKKw(C35964oKf.Fragment.aWuQzD));
                this.isConnected.add("KLineTabOverview");
                MarketCoinInfo marketCoinInfo2 = this.hUfVAv;
                if (marketCoinInfo2 != null && !Intrinsics.EZpvd((java.lang.Object) marketCoinInfo2.getInstrumentType(), (java.lang.Object) "OPTION") && this.AwvSrB) {
                    TaskDescription taskDescription = new TaskDescription();
                    this.dNCPSb.add(taskDescription);
                    this.RKDWNf.add(C33070mpX.AYXKKw(C35964oKf.Fragment.hdBMmm));
                    this.isConnected.add("KLineTabData");
                    this.RlQdEF = this.dNCPSb.indexOf(taskDescription);
                }
                InterfaceC54581xNr interfaceC54581xNrCopydefault2 = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(tradeKey)).copydefault();
                if (interfaceC54581xNrCopydefault2 == null) {
                    tradFi = null;
                } else {
                    BizInstrument bizInstrument8 = this.djBIcL;
                    if (bizInstrument8 == null || (tradeSymbol = bizInstrument8.getTradeSymbol()) == null) {
                        tradeSymbol = "";
                    }
                    TradeCoinInfo tradeCoinInfoAhwBna = interfaceC54581xNrCopydefault2.AhwBna(tradeSymbol);
                    if (tradeCoinInfoAhwBna != null) {
                        tradFi = tradeCoinInfoAhwBna.getTradFi();
                    }
                }
                BizInstrument bizInstrument9 = this.djBIcL;
                if (bizInstrument9 != null) {
                    InterfaceC43030rhb interfaceC43030rhbCopydefault = ((InterfaceC43033rhe) C43251rlk.copydefault(InterfaceC43033rhe.class)).copydefault();
                    Triple<AbstractC32996moC, java.lang.CharSequence, java.lang.String> tripleAEQbTJ = interfaceC43030rhbCopydefault.AEQbTJ(bizInstrument9.getTradeSymbol());
                    AbstractC32996moC abstractC32996moCComponent1 = tripleAEQbTJ.component1();
                    java.lang.CharSequence charSequenceComponent2 = tripleAEQbTJ.component2();
                    java.lang.String strComponent3 = tripleAEQbTJ.component3();
                    if (abstractC32996moCComponent1 != null && Intrinsics.EZpvd(tradFi, java.lang.Boolean.FALSE)) {
                        StateListAnimator stateListAnimator = new StateListAnimator(interfaceC43030rhbCopydefault, bizInstrument9);
                        this.dNCPSb.add(stateListAnimator);
                        this.RKDWNf.add(charSequenceComponent2);
                        this.isConnected.add("KLineTabFeed");
                        this.DCJXGO = this.dNCPSb.indexOf(stateListAnimator);
                        this.zuWLRA = C56390yDp.OLrzqt(charSequenceComponent2, strComponent3);
                    }
                    this.iwGUEr = abstractC32996moCComponent1 != null && Intrinsics.EZpvd(tradFi, java.lang.Boolean.FALSE);
                }
                if (this instanceof C55427xjj) {
                    activityResultCaller = this;
                } else {
                    androidx.fragment.app.Fragment parentFragment = getParentFragment();
                    while (parentFragment != null && !(parentFragment instanceof C55427xjj)) {
                        parentFragment = parentFragment.getParentFragment();
                    }
                    activityResultCaller = (C55427xjj) (parentFragment instanceof C55427xjj ? parentFragment : null);
                }
                C55427xjj c55427xjj = (C55427xjj) activityResultCaller;
                if (c55427xjj == null || c55427xjj.gEmmrt) {
                    BizInstrument bizInstrument10 = this.fJNWhG;
                    if (bizInstrument10 == null || !bizInstrument10.isPreMarketPair()) {
                        if (this.AwvSrB) {
                            this.dNCPSb.add(new Dialog());
                            this.RKDWNf.add(C33070mpX.AYXKKw(C35964oKf.Fragment.DGOPHZ));
                            this.isConnected.add("KLineTabTrade");
                        }
                        if (this.sSMYrx) {
                            this.dNCPSb.add(new ActionBar());
                            this.RKDWNf.add(C33070mpX.AYXKKw(C35964oKf.Fragment.finit));
                            this.isConnected.add("KLineTabCopy");
                        }
                        if (this.gHZMYf && this.zuBGHE && this.QKVWgx) {
                            this.dNCPSb.add(new FragmentManager());
                            this.RKDWNf.add(C33070mpX.AYXKKw(C35964oKf.Fragment.fZBcTu));
                            this.isConnected.add("KLineTabBot");
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.phO$LoaderManager */
    public static final class LoaderManager implements InterfaceC38786pfx {
        public LoaderManager() {
        }

        @Override // o.InterfaceC38786pfx
        public androidx.fragment.app.Fragment EZpvd() {
            C39014pkM.ActionBar actionBar = C39014pkM.Companion;
            java.lang.String strEjfBZ = ViewOnClickListenerC38857phO.this.ejfBZ();
            if (strEjfBZ == null) {
                strEjfBZ = "";
            }
            java.lang.String strFIwbmz = ViewOnClickListenerC38857phO.this.fIwbmz();
            return actionBar.KWHzl(strEjfBZ, strFIwbmz != null ? strFIwbmz : "", ViewOnClickListenerC38857phO.this.zsXlph, false, ViewOnClickListenerC38857phO.this.getPostValueLengthLimit, ViewOnClickListenerC38857phO.this);
        }
    }

    /* JADX INFO: renamed from: o.phO$PendingIntent */
    public static final class PendingIntent implements InterfaceC38786pfx {
        @Override // o.InterfaceC38786pfx
        public androidx.fragment.app.Fragment EZpvd() {
            return C39718pxd.Companion.KWHzl();
        }
    }

    /* JADX INFO: renamed from: o.phO$TaskDescription */
    public static final class TaskDescription implements InterfaceC38786pfx {
        @Override // o.InterfaceC38786pfx
        public androidx.fragment.app.Fragment EZpvd() {
            return ((InterfaceC43033rhe) C43251rlk.copydefault(InterfaceC43033rhe.class)).copydefault().copydefault();
        }
    }

    /* JADX INFO: renamed from: o.phO$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC38786pfx {
        public final /* synthetic */ BizInstrument AEQbTJ;
        public final /* synthetic */ InterfaceC43030rhb KWHzl;

        public StateListAnimator(InterfaceC43030rhb interfaceC43030rhb, BizInstrument bizInstrument) {
            this.KWHzl = interfaceC43030rhb;
            this.AEQbTJ = bizInstrument;
        }

        @Override // o.InterfaceC38786pfx
        public androidx.fragment.app.Fragment EZpvd() {
            AbstractC32996moC first = this.KWHzl.AEQbTJ(this.AEQbTJ.getTradeSymbol()).getFirst();
            return first != null ? first : new androidx.fragment.app.Fragment();
        }
    }

    /* JADX INFO: renamed from: o.phO$Dialog */
    public static final class Dialog implements InterfaceC38786pfx {
        public Dialog() {
        }

        @Override // o.InterfaceC38786pfx
        public androidx.fragment.app.Fragment EZpvd() {
            C38614pck.Application application = C38614pck.Companion;
            java.lang.String strEjfBZ = ViewOnClickListenerC38857phO.this.ejfBZ();
            if (strEjfBZ == null) {
                strEjfBZ = "";
            }
            java.lang.String strFIwbmz = ViewOnClickListenerC38857phO.this.fIwbmz();
            return application.AEQbTJ(strEjfBZ, strFIwbmz != null ? strFIwbmz : "", ViewOnClickListenerC38857phO.this.RcXXUw, ViewOnClickListenerC38857phO.this.AuCTel, ViewOnClickListenerC38857phO.this.getPostValueLengthLimit, ViewOnClickListenerC38857phO.this);
        }
    }

    /* JADX INFO: renamed from: o.phO$ActionBar */
    public static final class ActionBar implements InterfaceC38786pfx {
        public ActionBar() {
        }

        @Override // o.InterfaceC38786pfx
        public androidx.fragment.app.Fragment EZpvd() {
            C38684peA.Activity activity = C38684peA.Companion;
            java.lang.String strEjfBZ = ViewOnClickListenerC38857phO.this.ejfBZ();
            if (strEjfBZ == null) {
                strEjfBZ = "";
            }
            java.lang.String strFIwbmz = ViewOnClickListenerC38857phO.this.fIwbmz();
            return activity.OLrzqt(strEjfBZ, strFIwbmz != null ? strFIwbmz : "");
        }
    }

    /* JADX INFO: renamed from: o.phO$FragmentManager */
    public static final class FragmentManager implements InterfaceC38786pfx {
        public FragmentManager() {
        }

        @Override // o.InterfaceC38786pfx
        public androidx.fragment.app.Fragment EZpvd() {
            C38733pex.ActionBar actionBar = C38733pex.Companion;
            java.lang.String strEjfBZ = ViewOnClickListenerC38857phO.this.ejfBZ();
            if (strEjfBZ == null) {
                strEjfBZ = "";
            }
            java.lang.String strFIwbmz = ViewOnClickListenerC38857phO.this.fIwbmz();
            return actionBar.copydefault(strEjfBZ, strFIwbmz != null ? strFIwbmz : "");
        }
    }

    /* JADX INFO: renamed from: o.phO$VoiceInteractor */
    public static final class VoiceInteractor implements InterfaceC38786pfx {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ BizInstrument EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ ViewOnClickListenerC38857phO copydefault;

        public VoiceInteractor(java.lang.String str, java.lang.String str2, java.lang.String str3, BizInstrument bizInstrument, ViewOnClickListenerC38857phO viewOnClickListenerC38857phO) {
            this.AEQbTJ = str;
            this.KWHzl = str2;
            this.OLrzqt = str3;
            this.EZpvd = bizInstrument;
            this.copydefault = viewOnClickListenerC38857phO;
        }

        @Override // o.InterfaceC38786pfx
        public androidx.fragment.app.Fragment EZpvd() {
            java.lang.String icon;
            java.lang.String onlineTime;
            java.lang.String type;
            CountDownInfo countDownInfo;
            java.lang.String noticeUrlCn;
            CountDownInfo countDownInfo2;
            C38580pcC.ActionBar actionBar = C38580pcC.Companion;
            java.lang.String str = this.AEQbTJ;
            java.lang.String str2 = this.KWHzl;
            java.lang.String str3 = this.OLrzqt;
            java.lang.String bizStatus = this.EZpvd.getBizStatus();
            CountDownInfo countDownInfo3 = this.EZpvd.getCountDownInfo();
            if (countDownInfo3 == null || (icon = countDownInfo3.getIcon()) == null) {
                icon = "";
            }
            CountDownInfo countDownInfo4 = this.EZpvd.getCountDownInfo();
            if (countDownInfo4 == null || (onlineTime = countDownInfo4.getOnlineTime()) == null) {
                onlineTime = "";
            }
            CountDownInfo countDownInfo5 = this.EZpvd.getCountDownInfo();
            if (countDownInfo5 == null || (type = countDownInfo5.getType()) == null) {
                type = "";
            }
            if (!C33142mqq.EZpvd.OLrzqt() ? (countDownInfo = this.EZpvd.getCountDownInfo()) == null || (noticeUrlCn = countDownInfo.getNoticeUrlCn()) == null : (countDownInfo2 = this.EZpvd.getCountDownInfo()) == null || (noticeUrlCn = countDownInfo2.getNoticeUrlCn()) == null) {
                noticeUrlCn = "";
            }
            C38580pcC c38580pcCOLrzqt = actionBar.OLrzqt(str, str2, str3, bizStatus, icon, onlineTime, type, noticeUrlCn, this.copydefault);
            c38580pcCOLrzqt.copydefault(new TaskDescription(c38580pcCOLrzqt, this.copydefault));
            return c38580pcCOLrzqt;
        }

        /* JADX INFO: renamed from: o.phO$VoiceInteractor$TaskDescription */
        public static final class TaskDescription implements InterfaceC39501ptY {
            public final /* synthetic */ C38580pcC AEQbTJ;
            public final /* synthetic */ ViewOnClickListenerC38857phO copydefault;

            public TaskDescription(C38580pcC c38580pcC, ViewOnClickListenerC38857phO viewOnClickListenerC38857phO) {
                this.AEQbTJ = c38580pcC;
                this.copydefault = viewOnClickListenerC38857phO;
            }

            @Override // o.InterfaceC39501ptY
            public void copydefault(java.lang.String str, java.lang.String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.AEQbTJ.copydefault(new MarketCoinInfo(str, str2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null));
                this.AEQbTJ.AEQbTJ(str);
                this.AEQbTJ.AhwBna(str2);
                this.copydefault.getFieldNames();
                this.copydefault.DTwDnp();
                this.copydefault.QOLQEE();
            }
        }
    }

    public final void OLrzqt(BizInstrument bizInstrument, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.DbNXlk = false;
        gHZMYf();
        this.dNCPSb.add(new VoiceInteractor(str3, str, str2, bizInstrument, this));
        this.RKDWNf.add(C33070mpX.AYXKKw(C35964oKf.Fragment.hUfVAv));
        this.isConnected.add("KLineTabChart");
        EZpvd(bizInstrument);
        InterfaceC43030rhb interfaceC43030rhbCopydefault = ((InterfaceC43033rhe) C43251rlk.copydefault(InterfaceC43033rhe.class)).copydefault();
        Triple<AbstractC32996moC, java.lang.CharSequence, java.lang.String> tripleAEQbTJ = interfaceC43030rhbCopydefault.AEQbTJ(bizInstrument.getTradeSymbol());
        AbstractC32996moC abstractC32996moCComponent1 = tripleAEQbTJ.component1();
        java.lang.CharSequence charSequenceComponent2 = tripleAEQbTJ.component2();
        java.lang.String strComponent3 = tripleAEQbTJ.component3();
        if (abstractC32996moCComponent1 != null) {
            PictureInPictureParams pictureInPictureParams = new PictureInPictureParams(interfaceC43030rhbCopydefault, bizInstrument);
            this.dNCPSb.add(pictureInPictureParams);
            this.RKDWNf.add(charSequenceComponent2);
            this.isConnected.add("KLineTabFeed");
            this.DCJXGO = this.dNCPSb.indexOf(pictureInPictureParams);
            this.zuWLRA = C56390yDp.OLrzqt(charSequenceComponent2, strComponent3);
        }
        this.iwGUEr = abstractC32996moCComponent1 != null;
    }

    /* JADX INFO: renamed from: o.phO$PictureInPictureParams */
    public static final class PictureInPictureParams implements InterfaceC38786pfx {
        public final /* synthetic */ InterfaceC43030rhb OLrzqt;
        public final /* synthetic */ BizInstrument copydefault;

        public PictureInPictureParams(InterfaceC43030rhb interfaceC43030rhb, BizInstrument bizInstrument) {
            this.OLrzqt = interfaceC43030rhb;
            this.copydefault = bizInstrument;
        }

        @Override // o.InterfaceC38786pfx
        public androidx.fragment.app.Fragment EZpvd() {
            AbstractC32996moC first = this.OLrzqt.AEQbTJ(this.copydefault.getTradeSymbol()).getFirst();
            return first != null ? first : new androidx.fragment.app.Fragment();
        }
    }

    public final C39014pkM values() {
        java.lang.Object next;
        if (!isAdded()) {
            return null;
        }
        java.util.List<androidx.fragment.app.Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        java.util.Iterator<T> it = fragments.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((androidx.fragment.app.Fragment) next) instanceof C39014pkM) {
                break;
            }
        }
        if (next instanceof C39014pkM) {
            return (C39014pkM) next;
        }
        return null;
    }

    public final C38614pck iwGUEr() {
        ActivityResultCaller activityResultCaller;
        java.lang.Object next;
        if (!isAdded()) {
            return null;
        }
        if (this instanceof C55427xjj) {
            activityResultCaller = this;
        } else {
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof C55427xjj)) {
                parentFragment = parentFragment.getParentFragment();
            }
            if (!(parentFragment instanceof C55427xjj)) {
                parentFragment = null;
            }
            activityResultCaller = (C55427xjj) parentFragment;
        }
        C55427xjj c55427xjj = (C55427xjj) activityResultCaller;
        if (c55427xjj != null && !c55427xjj.gEmmrt) {
            return null;
        }
        java.util.List<androidx.fragment.app.Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        java.util.Iterator<T> it = fragments.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((androidx.fragment.app.Fragment) next) instanceof C38614pck) {
                break;
            }
        }
        if (next instanceof C38614pck) {
            return (C38614pck) next;
        }
        return null;
    }

    public final void QKVWgx() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketKlinePortraitFragment$showPriceAlert$1(this, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setSharedElementEnterTransition(new C36358oYv());
        setSharedElementReturnTransition(getSharedElementEnterTransition());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        InterfaceC43033rhe interfaceC43033rhe;
        java.lang.String tLocalPrice;
        java.lang.String tPriceNoTh;
        java.lang.String instrumentId;
        java.lang.String instrumentType;
        InterfaceC49425uoM interfaceC49425uoM;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54577xNn interfaceC54577xNn2;
        if (view != null) {
            KWHzl(view.getId());
        }
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C35964oKf.StateListAnimator.iTrKTi;
        if (numValueOf == null || numValueOf.intValue() != i) {
            int i2 = C35964oKf.StateListAnimator.iluEmO;
            if (numValueOf == null || numValueOf.intValue() != i2) {
                int i3 = C35964oKf.StateListAnimator.fdazkH;
                if (numValueOf == null || numValueOf.intValue() != i3) {
                    int i4 = C35964oKf.StateListAnimator.DkGEDn;
                    if (numValueOf == null || numValueOf.intValue() != i4) {
                        int i5 = C35964oKf.StateListAnimator.QSbQqJ;
                        if (numValueOf == null || numValueOf.intValue() != i5) {
                            int i6 = C35964oKf.StateListAnimator.setCurrentKeyboardTarget;
                            if (numValueOf == null || numValueOf.intValue() != i6) {
                                int i7 = C35964oKf.StateListAnimator.aPFruk;
                                if (numValueOf == null || numValueOf.intValue() != i7) {
                                    int i8 = C35964oKf.StateListAnimator.apNKau;
                                    if (numValueOf == null || numValueOf.intValue() != i8) {
                                        return;
                                    }
                                }
                                if (!pFP.isLogin$default(pFP.OLrzqt, null, 1, null)) {
                                    InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class);
                                    android.content.Context contextRequireContext = requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                                    InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, contextRequireContext, null, 2, null);
                                    return;
                                }
                                C39014pkM c39014pkMValues = values();
                                if (c39014pkMValues == null || c39014pkMValues.AuCTel() <= 0) {
                                    QKVWgx();
                                    return;
                                }
                                if (this.hUfVAv != null) {
                                    java.lang.String strAEQbTJ = AEQbTJ(false);
                                    MarketCoinInfo marketCoinInfo = this.hUfVAv;
                                    java.lang.String str = (marketCoinInfo == null || (instrumentType = marketCoinInfo.getInstrumentType()) == null) ? "" : instrumentType;
                                    MarketCoinInfo marketCoinInfo2 = this.hUfVAv;
                                    java.lang.String str2 = (marketCoinInfo2 == null || (instrumentId = marketCoinInfo2.getInstrumentId()) == null) ? "" : instrumentId;
                                    MarketTopInfo marketTopInfo = this.gkJEwt;
                                    java.lang.String str3 = (marketTopInfo == null || (tPriceNoTh = marketTopInfo.getTPriceNoTh()) == null) ? "" : tPriceNoTh;
                                    MarketTopInfo marketTopInfo2 = this.gkJEwt;
                                    java.lang.String str4 = (marketTopInfo2 == null || (tLocalPrice = marketTopInfo2.getTLocalPrice()) == null) ? "" : tLocalPrice;
                                    java.lang.String simpleName = ActivityC38834pgs.class.getSimpleName();
                                    Intrinsics.checkNotNullExpressionValue(simpleName, "");
                                    UnifiedPriceRemind unifiedPriceRemind = new UnifiedPriceRemind(strAEQbTJ, str, str2, str3, str4, simpleName, (java.lang.String) null, 1, 64, (DefaultConstructorMarker) null);
                                    android.app.Activity activity = this.AkhnZx;
                                    if (activity == null || (interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class)) == null) {
                                        return;
                                    }
                                    InterfaceC43033rhe.StateListAnimator.gotoAllPriceRemindActivity$default(interfaceC43033rhe, activity, unifiedPriceRemind, null, 4, null);
                                    return;
                                }
                                return;
                            }
                        }
                        FragmentActivity activity2 = getActivity();
                        if (activity2 == null) {
                            return;
                        }
                        int iOLrzqt = C48914uef.EZpvd.OLrzqt(this.aKErDB);
                        if (iOLrzqt == 4) {
                            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity2, ((InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class)).AEQbTJ(), null, new Function1() { // from class: o.pis
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return ViewOnClickListenerC38857phO.valueOf((AbstractC43238rlX) obj);
                                }
                            }, 4, null);
                            return;
                        }
                        if (pDX.AEQbTJ.AEQbTJ() && !C56071xvr.gEmmrt.ejfBZ()) {
                            java.lang.String strGEmmrt = QbewEr().gEmmrt();
                            if (Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "TYPE_MARK_PRICE_KLINE") || Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "TYPE_INDEX_KLINE")) {
                                C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(C35964oKf.Fragment.ardYFU), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
                                return;
                            }
                            C39014pkM c39014pkMValues2 = values();
                            if (c39014pkMValues2 != null) {
                                c39014pkMValues2.OLrzqt(this.gEmmrt, this.djSkpj, this.aKErDB, this.DTwDnp);
                                return;
                            }
                            return;
                        }
                        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity2, ((InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class)).AEQbTJ() + "?bizType=" + iOLrzqt + "&botCategory=BotCategoryGrid&instId=" + this.djSkpj + "&fromPageSubSource=kline_grid_btn", null, new Function1() { // from class: o.pit
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return ViewOnClickListenerC38857phO.djBIcL((AbstractC43238rlX) obj);
                            }
                        }, 4, null);
                        return;
                    }
                }
            }
        }
        pFP pfp = pFP.OLrzqt;
        java.lang.String str5 = this.aKErDB;
        if (pfp.copydefault(str5 != null ? str5 : "") && (view.getId() == C35964oKf.StateListAnimator.iTrKTi || view.getId() == C35964oKf.StateListAnimator.iluEmO)) {
            C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(C35964oKf.Fragment.gZKUVK), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            return;
        }
        C37908pFd.copydefault(false);
        InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if ((interfaceC49425uoM2 != null && (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) != null && interfaceC54577xNn2.KWHzl()) || ((interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && interfaceC54577xNn.EZpvd())) {
            EZpvd(view.getId());
        } else {
            copydefault(view.getId());
        }
    }

    public static final Unit valueOf(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void EZpvd(int i) {
        java.lang.String str;
        MarketCoinInfo marketCoinInfo = this.hUfVAv;
        java.lang.String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
        C48914uef c48914uef = C48914uef.EZpvd;
        MarketCoinInfo marketCoinInfo2 = this.hUfVAv;
        int iOLrzqt = c48914uef.OLrzqt(marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentType() : null);
        QfsBiF().AEQbTJ(true);
        java.lang.String strUzCIH = QfsBiF().OLrzqt().uzCIH();
        java.lang.String str2 = "icon_other_trade";
        if (i == C35964oKf.StateListAnimator.QSbQqJ || i == C35964oKf.StateListAnimator.setCurrentKeyboardTarget) {
            TokenBusinessData tokenBusinessData = this.UeEOUB;
            instrumentId = tokenBusinessData != null ? tokenBusinessData.getInstrumentName() : null;
            TokenBusinessData tokenBusinessData2 = this.UeEOUB;
            iOLrzqt = c48914uef.OLrzqt(tokenBusinessData2 != null ? tokenBusinessData2.getInstType() : null);
        } else if (i == C35964oKf.StateListAnimator.fdazkH || i == C35964oKf.StateListAnimator.DkGEDn) {
            TokenBusinessData tokenBusinessData3 = this.accept;
            instrumentId = tokenBusinessData3 != null ? tokenBusinessData3.getInstrumentName() : null;
            TokenBusinessData tokenBusinessData4 = this.accept;
            iOLrzqt = c48914uef.OLrzqt(tokenBusinessData4 != null ? tokenBusinessData4.getInstType() : null);
        } else {
            str2 = "icon_trade";
        }
        java.lang.String strOLrzqt = ((InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class)).OLrzqt();
        java.lang.String str3 = this.AuCTel;
        if (str3 == null || str3.length() == 0) {
            str = this.RcXXUw;
        } else {
            str = this.AuCTel + "&tag=" + this.getPostValueLengthLimit;
        }
        java.lang.String str4 = strOLrzqt + "?bizType=" + iOLrzqt + "&instId=" + instrumentId + "&fromPageSession=" + strUzCIH + "&fromPageSubSource=" + str2 + "&from=kline_page&fromPageSource=" + str;
        android.app.Activity activity = this.AkhnZx;
        if (activity != null) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, str4, null, new Function1() { // from class: o.pik
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC38857phO.OLrzqt((AbstractC43238rlX) obj);
                }
            }, 4, null);
        }
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        java.lang.String strReplace$default;
        if (str == null || (strReplace$default = C59449zhJ.replace$default(str, "-", "_", false, 4, (java.lang.Object) null)) == null) {
            return null;
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = strReplace$default.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public final void copydefault(int i) {
        MarketCoinInfo marketCoinInfo = this.hUfVAv;
        java.lang.String instrumentType = marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null;
        if (Intrinsics.EZpvd((java.lang.Object) instrumentType, (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) instrumentType, (java.lang.Object) "MARGIN")) {
            MarketCoinInfo marketCoinInfo2 = this.hUfVAv;
            java.lang.String strKWHzl = KWHzl(marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentId() : null);
            if (strKWHzl == null) {
                C33134mqi.AEQbTJ(getResources().getString(C35964oKf.Fragment.ORmwhf));
                return;
            }
            android.app.Activity activity = this.AkhnZx;
            if (activity != null) {
                ((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class)).KWHzl(activity, "main/spot/buy", C56423yEv.EZpvd(C56390yDp.OLrzqt("Constant.SYMBOL", strKWHzl)), new Function1() { // from class: o.pil
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ViewOnClickListenerC38857phO.gEmmrt((AbstractC43238rlX) obj);
                    }
                });
            }
        }
    }

    public static final Unit gEmmrt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void KWHzl(int i) {
        java.lang.String instrumentType;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOU xouWlaJM;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) ? null : xouWlaJM.KWHzl()), (java.lang.Object) "trade_manual")) {
            MarketCoinInfo marketCoinInfo = this.hUfVAv;
            if (marketCoinInfo == null || (instrumentType = marketCoinInfo.getInstrumentType()) == null) {
                instrumentType = "SPOT";
            }
        } else {
            instrumentType = "BOTS";
        }
        if (i == C35964oKf.StateListAnimator.iTrKTi || i == C35964oKf.StateListAnimator.iluEmO) {
            EventParamsList eventParamsList = new EventParamsList();
            eventParamsList.put("button_type", ExtJson.BRC20TYPE_TRADE, true);
            eventParamsList.put("chart_layout", "classic", true);
            Unit unit = Unit.INSTANCE;
            C32866mlf.onEvent$default("KLine_Btm_Button_Click", "Click", "Button", eventParamsList, null, null, 24, null);
            pXB.klineClickTrack$default(pXB.EZpvd, "Kline_Bottom_Trade_Click", null, 2, null);
            return;
        }
        if (i == C35964oKf.StateListAnimator.QSbQqJ || i == C35964oKf.StateListAnimator.setCurrentKeyboardTarget) {
            C32866mlf.onEvent$default("KLine_Btm_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.pir
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC38857phO.EZpvd((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            pXB.klineClickTrack$default(pXB.EZpvd, "Kline_Bottom_Bot_Click", null, 2, null);
            return;
        }
        if (i != C35964oKf.StateListAnimator.fdazkH && i != C35964oKf.StateListAnimator.DkGEDn) {
            if (i == C35964oKf.StateListAnimator.aPFruk || i == C35964oKf.StateListAnimator.apNKau) {
                EventParamsList eventParamsList2 = new EventParamsList();
                eventParamsList2.put("button_type", ProductMatrixRemoteConfig.ALERT, true);
                eventParamsList2.put("from_deal_type", instrumentType, true);
                eventParamsList2.put("chart_layout", "classic", true);
                Unit unit2 = Unit.INSTANCE;
                C32866mlf.onEvent$default("KLine_Btm_Button_Click", "Click", "Button", eventParamsList2, null, null, 24, null);
                pXB.klineClickTrack$default(pXB.EZpvd, "Kline_Bottom_Alert_Click", null, 2, null);
                return;
            }
            return;
        }
        MarketCoinInfo marketCoinInfo2 = this.hUfVAv;
        java.lang.String str = Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentType() : null), (java.lang.Object) "SWAP") ? "spot" : "perpetual";
        EventParamsList eventParamsList3 = new EventParamsList();
        eventParamsList3.put("button_type", str, true);
        eventParamsList3.put("from_deal_type", instrumentType, true);
        eventParamsList3.put("chart_layout", "classic", true);
        Unit unit3 = Unit.INSTANCE;
        C32866mlf.onEvent$default("KLine_Btm_Button_Click", "Click", "Button", eventParamsList3, null, null, 24, null);
        pXB.klineClickTrack$default(pXB.EZpvd, "Kline_Bottom_" + ((java.lang.Object) str) + "_Click", null, 2, null);
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button_type", "bot", true);
        eventParamsList.put("chart_layout", "classic", true);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39556pua
    public void EZpvd(MarketCoinInfo marketCoinInfo) {
        C39014pkM c39014pkMValues;
        KlineQuoteDataComponent klineQuoteDataComponentDbNXlk;
        OLrzqt(marketCoinInfo);
        MarketCoinInfo marketCoinInfo2 = this.hUfVAv;
        this.djSkpj = marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentId() : null;
        MarketCoinInfo marketCoinInfo3 = this.hUfVAv;
        this.aKErDB = marketCoinInfo3 != null ? marketCoinInfo3.getInstrumentType() : null;
        C33624mzv c33624mzv = this.dvKsVJ;
        if (c33624mzv != null) {
            c33624mzv.setVisibility(zsXlph() ? 0 : 8);
        }
        C33624mzv c33624mzv2 = this.dxcTrN;
        if (c33624mzv2 != null) {
            c33624mzv2.setVisibility(zsXlph() ? 0 : 8);
        }
        ViewPager2 viewPager2 = this.QkdxfA;
        if ((viewPager2 == null || viewPager2.getCurrentItem() != 0) && (c39014pkMValues = values()) != null && (klineQuoteDataComponentDbNXlk = c39014pkMValues.DbNXlk()) != null) {
            klineQuoteDataComponentDbNXlk.EZpvd();
        }
        C33624mzv c33624mzv3 = this.dvKsVJ;
        if (c33624mzv3 != null) {
            c33624mzv3.setClickable(false);
        }
        C33624mzv c33624mzv4 = this.dxcTrN;
        if (c33624mzv4 != null) {
            c33624mzv4.setClickable(false);
        }
    }

    public final boolean zsXlph() {
        MarketCoinInfo marketCoinInfo = this.hUfVAv;
        return (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null), (java.lang.Object) "OPTION") || pFP.isUserInDemoTrading$default(pFP.OLrzqt, null, 1, null)) ? false : true;
    }

    @Override // o.InterfaceC39502ptZ
    public void dUDNAs() {
        C38685peB c38685peBAkhnZx = AkhnZx();
        if (c38685peBAkhnZx != null) {
            c38685peBAkhnZx.sSMYrx();
        }
    }

    @Override // o.InterfaceC39502ptZ
    public void AEQbTJ(@NotNull MarketTopInfo marketTopInfo) {
        MutableLiveData<java.lang.String> mutableLiveDataGEmmrt;
        MutableLiveData<java.lang.String> mutableLiveDataKWHzl;
        Intrinsics.checkNotNullParameter(marketTopInfo, "");
        this.gkJEwt = marketTopInfo;
        C38685peB c38685peBAkhnZx = AkhnZx();
        if (c38685peBAkhnZx != null) {
            c38685peBAkhnZx.AEQbTJ(marketTopInfo);
        }
        C39559pud c39559pud = this.QUSxYX;
        if (c39559pud != null && (mutableLiveDataKWHzl = c39559pud.KWHzl()) != null) {
            mutableLiveDataKWHzl.setValue(marketTopInfo.getOriginPrice());
        }
        C39559pud c39559pud2 = this.QUSxYX;
        if (c39559pud2 == null || (mutableLiveDataGEmmrt = c39559pud2.gEmmrt()) == null) {
            return;
        }
        mutableLiveDataGEmmrt.setValue(marketTopInfo.getTPrice());
    }

    @Override // o.InterfaceC39502ptZ
    public void bm_() {
        final InterfaceC39272ppF interfaceC39272ppF;
        ActivityResultCaller activityResultCaller;
        WeakReference<InterfaceC39272ppF> weakReference = this.DTwDnp;
        if (weakReference == null || (interfaceC39272ppF = weakReference.get()) == null) {
            return;
        }
        if (interfaceC39272ppF.djBIcL() == KlineQuickOrderBottomSheetBehavior.States.STATE_COLLAPSED) {
            copydefault(true);
            BizInstrument bizInstrument = this.fJNWhG;
            if (bizInstrument != null) {
                InterfaceC49493upb interfaceC49493upb = (InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class);
                java.lang.String str = this.iZzfmt;
                if (this instanceof C55427xjj) {
                    activityResultCaller = this;
                } else {
                    androidx.fragment.app.Fragment parentFragment = getParentFragment();
                    while (parentFragment != null && !(parentFragment instanceof C55427xjj)) {
                        parentFragment = parentFragment.getParentFragment();
                    }
                    if (!(parentFragment instanceof C55427xjj)) {
                        parentFragment = null;
                    }
                    activityResultCaller = (C55427xjj) parentFragment;
                }
                C55427xjj c55427xjj = (C55427xjj) activityResultCaller;
                androidx.fragment.app.Fragment fragmentCopydefault = interfaceC49493upb.copydefault(bizInstrument, str, new Function2() { // from class: o.piq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return ViewOnClickListenerC38857phO.KWHzl(this.copydefault, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
                    }
                }, new Function1() { // from class: o.piy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ViewOnClickListenerC38857phO.KWHzl(interfaceC39272ppF, ((java.lang.Boolean) obj).booleanValue());
                    }
                }, new Function1() { // from class: o.piz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ViewOnClickListenerC38857phO.AEQbTJ(interfaceC39272ppF, ((java.lang.Integer) obj).intValue());
                    }
                }, new Function2() { // from class: o.piE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return ViewOnClickListenerC38857phO.copydefault(this.KWHzl, (java.lang.String) obj, (java.lang.String) obj2);
                    }
                }, new Function1() { // from class: o.piF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ViewOnClickListenerC38857phO.copydefault(this.AEQbTJ, (C49423uoK) obj);
                    }
                }, c55427xjj != null ? c55427xjj.gEmmrt() : null, "kline_page_quick", pFS.KWHzl.KWHzl(this.iZzfmt), pFN.OLrzqt.KWHzl(), this.getPostValueLengthLimit);
                InterfaceC39272ppF.ActionBar.showFragment$default(interfaceC39272ppF, fragmentCopydefault, null, null, 6, null);
                AkhnZx(this.iZzfmt);
                valueOf();
                this.ffGIBT = fragmentCopydefault;
                return;
            }
            return;
        }
        getTAG();
        AkhnZx(this.iZzfmt);
        copydefault(false);
        androidx.fragment.app.Fragment fragment = this.ffGIBT;
        if (fragment != null) {
            ((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).KWHzl(fragment, this.iZzfmt);
        }
    }

    public static final Unit KWHzl(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, boolean z, java.lang.String str) {
        WeakReference<InterfaceC39272ppF> weakReference;
        InterfaceC39272ppF interfaceC39272ppF;
        viewOnClickListenerC38857phO.AxsJAY = z;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            if (!z) {
                C55328xhq.show$default(C55328xhq.OLrzqt, str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            } else if (str != null) {
                C55326xho.toastWithSuccessfulIcon$default(str, 0, 1, (java.lang.Object) null);
            }
        }
        if (z && (weakReference = viewOnClickListenerC38857phO.DTwDnp) != null && (interfaceC39272ppF = weakReference.get()) != null) {
            InterfaceC39272ppF.ActionBar.setState$default(interfaceC39272ppF, KlineQuickOrderBottomSheetBehavior.States.STATE_COLLAPSED, false, 2, null);
        }
        viewOnClickListenerC38857phO.OLrzqt(z);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(InterfaceC39272ppF interfaceC39272ppF, boolean z) {
        InterfaceC39272ppF.ActionBar.setState$default(interfaceC39272ppF, z ? KlineQuickOrderBottomSheetBehavior.States.STATE_HALF_EXPANDED : KlineQuickOrderBottomSheetBehavior.States.STATE_EXPANDED, false, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(InterfaceC39272ppF interfaceC39272ppF, int i) {
        interfaceC39272ppF.EZpvd(i);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, java.lang.String str, java.lang.String str2) {
        if (str != null && str2 != null) {
            viewOnClickListenerC38857phO.AEQbTJ(str, str2, false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, C49423uoK c49423uoK) {
        Intrinsics.checkNotNullParameter(c49423uoK, "");
        java.lang.String strOLrzqt = c49423uoK.OLrzqt();
        viewOnClickListenerC38857phO.AkhnZx(strOLrzqt != null ? strOLrzqt : "");
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39502ptZ
    public void l_(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        androidx.fragment.app.Fragment fragment = this.ffGIBT;
        if (fragment != null) {
            ((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).KWHzl(fragment, str);
        }
    }

    private final void AkhnZx(java.lang.String str) {
        C39014pkM c39014pkMValues = values();
        if (c39014pkMValues != null) {
            LifecycleOwnerKt.getLifecycleScope(c39014pkMValues).launchWhenResumed(new MarketKlinePortraitFragment$setQuickOrderPrice$1$1(c39014pkMValues, str, null));
        }
    }

    public final void OLrzqt(final boolean z) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("PlaceOrder_Kline_TradeTools_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.piv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38857phO.EZpvd(z, this, (EventParamsList) obj);
            }
        });
        pXB pxb = pXB.EZpvd;
        java.lang.String str = this.djSkpj;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = this.aKErDB;
        pxb.AEQbTJ("Kline_Quick_Order_Success", C56423yEv.EZpvd(C56390yDp.OLrzqt(str, str2 != null ? str2 : "")));
    }

    public static final Unit EZpvd(boolean z, ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, EventParamsList eventParamsList) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tool_type", "chart_trade_result_toast", true);
        eventParamsList.put("status", z ? "success" : "failure", true);
        eventParamsList.put("chart_type", "original", true);
        eventParamsList.put("terminal", "app", true);
        java.lang.String str2 = viewOnClickListenerC38857phO.aKErDB;
        if (str2 != null) {
            java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase != null) {
                str = lowerCase;
            }
        }
        eventParamsList.put("biz_type", str, true);
        return Unit.INSTANCE;
    }

    public final void copydefault(final boolean z) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("PlaceOrder_Kline_TradeTools_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.piD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38857phO.AEQbTJ(z, this, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(boolean z, ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, EventParamsList eventParamsList) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tool_type", "app_chart_trade", true);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, z ? "plus_button" : "plus_button_price_input", true);
        java.lang.String str2 = viewOnClickListenerC38857phO.aKErDB;
        if (str2 != null) {
            java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase != null) {
                str = lowerCase;
            }
        }
        eventParamsList.put("biz_type", str, true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("PlaceOrder_Kline_TradeTools_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.piw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38857phO.EZpvd(this.OLrzqt, (EventParamsList) obj);
            }
        });
    }

    public static final Unit EZpvd(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, EventParamsList eventParamsList) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tool_type", "app_chart_trade", true);
        eventParamsList.put("chart_type", "original", true);
        eventParamsList.put("terminal", "app", true);
        java.lang.String str2 = viewOnClickListenerC38857phO.aKErDB;
        if (str2 != null) {
            java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase != null) {
                str = lowerCase;
            }
        }
        eventParamsList.put("biz_type", str, true);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39502ptZ
    public void fERRXa() {
        InterfaceC39272ppF interfaceC39272ppF;
        WeakReference<InterfaceC39272ppF> weakReference = this.DTwDnp;
        if (weakReference == null || (interfaceC39272ppF = weakReference.get()) == null) {
            return;
        }
        InterfaceC39272ppF.ActionBar.setState$default(interfaceC39272ppF, KlineQuickOrderBottomSheetBehavior.States.STATE_COLLAPSED, false, 2, null);
    }

    @Override // o.InterfaceC39502ptZ
    public void isConnected(boolean z) {
        if (isAdded()) {
            this.hDKMBd = z;
            QbewEr().AEQbTJ(z);
            C33624mzv c33624mzv = this.dvKsVJ;
            if (c33624mzv != null) {
                c33624mzv.setClickable(true);
            }
            C33624mzv c33624mzv2 = this.dxcTrN;
            if (c33624mzv2 != null) {
                c33624mzv2.setClickable(true);
            }
            if (z) {
                C33624mzv c33624mzv3 = this.dvKsVJ;
                if (c33624mzv3 != null) {
                    pFQ.AEQbTJ(c33624mzv3, C52761wXj.TaskDescription.addPreRequisiteCollector);
                }
                C33624mzv c33624mzv4 = this.dxcTrN;
                if (c33624mzv4 != null) {
                    pFQ.AEQbTJ(c33624mzv4, C52761wXj.TaskDescription.addPreRequisiteCollector);
                    return;
                }
                return;
            }
            C33624mzv c33624mzv5 = this.dvKsVJ;
            if (c33624mzv5 != null) {
                pFQ.AEQbTJ(c33624mzv5, C52761wXj.TaskDescription.invokespecialhrnhsO);
            }
            C33624mzv c33624mzv6 = this.dxcTrN;
            if (c33624mzv6 != null) {
                pFQ.AEQbTJ(c33624mzv6, C52761wXj.TaskDescription.invokespecialhrnhsO);
            }
        }
    }

    public static /* synthetic */ void coinInfoUpdated$default(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        viewOnClickListenerC38857phO.AEQbTJ(str, str2, z);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        LifecycleCoroutineScope lifecycleScope;
        WeakReference<InterfaceC39272ppF> weakReference;
        InterfaceC39272ppF interfaceC39272ppF;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (z && (weakReference = this.DTwDnp) != null && (interfaceC39272ppF = weakReference.get()) != null) {
            InterfaceC39272ppF.ActionBar.setState$default(interfaceC39272ppF, KlineQuickOrderBottomSheetBehavior.States.STATE_COLLAPSED, false, 2, null);
        }
        C39014pkM c39014pkMValues = values();
        if (c39014pkMValues != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c39014pkMValues)) != null) {
            lifecycleScope.launchWhenResumed(new MarketKlinePortraitFragment$coinInfoUpdated$1(this, str, str2, null));
        }
        OLrzqt(new MarketCoinInfo(str, str2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketKlinePortraitFragment$coinInfoUpdated$2(this, str, str2, z, null), 3, null);
    }

    public final void RJOkX() {
        BizInstrument bizInstrument;
        androidx.fragment.app.Fragment fragment = this.ffGIBT;
        if (fragment == null || (bizInstrument = this.fJNWhG) == null) {
            return;
        }
        ((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).EZpvd(fragment, bizInstrument, this.iZzfmt);
    }

    public final boolean AEQbTJ(MarketCoinInfo marketCoinInfo) {
        InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
        this.djBIcL = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketCoinInfo.getInstrumentType(), marketCoinInfo.getInstrumentId(), null, null, 12, null) : null;
        pFS pfs = pFS.KWHzl;
        return pfs.AEQbTJ(marketCoinInfo) || pfs.KWHzl(marketCoinInfo) || pfs.OLrzqt(marketCoinInfo);
    }

    public final void QOLQEE() {
        BizInstrument bizInstrument;
        InterfaceC49425uoM interfaceC49425uoM;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        final MarketCoinInfo marketCoinInfo = this.hUfVAv;
        if (marketCoinInfo == null || (bizInstrument = this.djBIcL) == null || (interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(marketCoinInfo.getInstrumentType())) == null) {
            return;
        }
        abstractC54531xLwOLrzqt.AEQbTJ(bizInstrument, new Function1() { // from class: o.phU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38857phO.EZpvd(this.OLrzqt, marketCoinInfo, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit EZpvd(final ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, MarketCoinInfo marketCoinInfo, boolean z) {
        if (z) {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
            BizInstrument minSuggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketCoinInfo.getInstrumentType(), marketCoinInfo.getInstrumentId(), null, null, 12, null) : null;
            viewOnClickListenerC38857phO.djBIcL = minSuggestedInstrument$default;
            if (minSuggestedInstrument$default != null) {
                minSuggestedInstrument$default.getBizContinuousStatus();
            }
            C38769pfg c38769pfg = viewOnClickListenerC38857phO.QVAiDq;
            if (c38769pfg != null) {
                C37937pGf c37937pGf = viewOnClickListenerC38857phO.DCUTEI;
                if (c37937pGf != null) {
                    c37937pGf.KWHzl();
                }
                c38769pfg.copydefault();
                viewOnClickListenerC38857phO.zsXlph = true;
                viewOnClickListenerC38857phO.AYXKKw();
                viewOnClickListenerC38857phO.AuCTelauCTel();
                C38685peB c38685peBAkhnZx = viewOnClickListenerC38857phO.AkhnZx();
                if (c38685peBAkhnZx != null) {
                    c38685peBAkhnZx.AuCTelauCTel();
                }
                ViewPager2 viewPager2 = viewOnClickListenerC38857phO.QkdxfA;
                if (viewPager2 != null) {
                    viewPager2.setAdapter(c38769pfg);
                }
                if (viewOnClickListenerC38857phO.AubY()) {
                    viewOnClickListenerC38857phO.EZpvd("new_coin_overview");
                }
                C55254xgV c55254xgV = viewOnClickListenerC38857phO.DarRvM;
                Intrinsics.copydefault(c55254xgV);
                TabLayout tabLayoutCopydefault = c55254xgV.copydefault();
                ViewPager2 viewPager22 = viewOnClickListenerC38857phO.QkdxfA;
                Intrinsics.copydefault(viewPager22);
                C37937pGf c37937pGf2 = new C37937pGf(tabLayoutCopydefault, viewPager22, new C37937pGf.ActionBar() { // from class: o.pii
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.C37937pGf.ActionBar
                    public final void KWHzl(TabLayout.Tab tab, int i) {
                        ViewOnClickListenerC38857phO.KWHzl(this.EZpvd, tab, i);
                    }
                });
                c37937pGf2.AEQbTJ();
                viewOnClickListenerC38857phO.DCUTEI = c37937pGf2;
                c38769pfg.notifyDataSetChanged();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(viewOnClickListenerC38857phO.RKDWNf.get(i));
    }

    @Override // o.InterfaceC39502ptZ
    public void AkhnZx(boolean z) {
        this.OBJEWx = C33070mpX.copydefault(C52761wXj.Activity.EZpvd);
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.EZpvd);
        this.fIwbmz = iCopydefault;
        android.widget.LinearLayout linearLayout = this.QfsBiF;
        if (linearLayout != null) {
            linearLayout.setBackgroundColor(iCopydefault);
        }
        if (z) {
            android.widget.LinearLayout linearLayout2 = this.flVtFt;
            if (linearLayout2 != null) {
                linearLayout2.setBackgroundColor(this.uzCIH);
            }
            android.widget.LinearLayout linearLayout3 = this.fvQaOB;
            if (linearLayout3 != null) {
                linearLayout3.setBackgroundColor(this.uzCIH);
            }
            android.view.View view = this.fetchVPNInfo;
            if (view != null) {
                view.setBackgroundColor(this.ejfBZ);
            }
            android.view.View view2 = this.getFieldNames;
            if (view2 != null) {
                view2.setBackgroundColor(this.ejfBZ);
                return;
            }
            return;
        }
        android.widget.LinearLayout linearLayout4 = this.flVtFt;
        if (linearLayout4 != null) {
            linearLayout4.setBackgroundColor(this.OBJEWx);
        }
        android.widget.LinearLayout linearLayout5 = this.fvQaOB;
        if (linearLayout5 != null) {
            linearLayout5.setBackgroundColor(this.OBJEWx);
        }
        android.view.View view3 = this.fetchVPNInfo;
        if (view3 != null) {
            view3.setBackgroundColor(this.fARcdN);
        }
        android.view.View view4 = this.getFieldNames;
        if (view4 != null) {
            view4.setBackgroundColor(this.fARcdN);
        }
    }

    @Override // o.InterfaceC39502ptZ
    public void gEmmrt(java.lang.String str) {
        C38685peB c38685peBAkhnZx = AkhnZx();
        if (c38685peBAkhnZx != null) {
            c38685peBAkhnZx.copydefault(str);
        }
    }

    @Override // o.InterfaceC39502ptZ
    public void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C38685peB c38685peBAkhnZx = AkhnZx();
        if (c38685peBAkhnZx != null) {
            c38685peBAkhnZx.EZpvd(str);
        }
    }

    @Override // o.InterfaceC39502ptZ
    public void KWHzl(int i, boolean z) {
        java.lang.String instrumentType;
        java.lang.String instrumentType2;
        if (isAdded()) {
            C38685peB c38685peBAkhnZx = AkhnZx();
            if (c38685peBAkhnZx != null) {
                c38685peBAkhnZx.EZpvd(z);
            }
            MarketCoinInfo marketCoinInfo = this.hUfVAv;
            java.lang.String str = "";
            if (marketCoinInfo == null || (instrumentType = marketCoinInfo.getInstrumentType()) == null) {
                instrumentType = "";
            }
            if (Intrinsics.EZpvd((java.lang.Object) instrumentType, (java.lang.Object) "MARGIN")) {
                str = "SPOT";
            } else {
                MarketCoinInfo marketCoinInfo2 = this.hUfVAv;
                if (marketCoinInfo2 != null && (instrumentType2 = marketCoinInfo2.getInstrumentType()) != null) {
                    str = instrumentType2;
                }
            }
            C38614pck c38614pckIwGUEr = iwGUEr();
            if (c38614pckIwGUEr != null) {
                c38614pckIwGUEr.EZpvd(str, z);
            }
        }
    }

    @Override // o.InterfaceC39502ptZ
    public void DGOPHZ() {
        if (isResumed() && getParentFragmentManager().findFragmentById(C35964oKf.StateListAnimator.postOrRun) == null) {
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new MarketKlinePortraitFragment$showQuartzCSATFragment$1(this, null));
        }
    }

    public final void getFieldNames() {
        if (this.hUfVAv != null) {
            EZpvd(SPUtils.getBoolean("trade_button_left", true));
            MarketCoinInfo marketCoinInfo = this.hUfVAv;
            if (marketCoinInfo != null) {
                AuCTel().copydefault(marketCoinInfo.getInstrumentId(), marketCoinInfo.getInstrumentType());
                return;
            }
            return;
        }
        android.widget.LinearLayout linearLayout = this.flVtFt;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout2 = this.fvQaOB;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        KlineQuoteDataComponent klineQuoteDataComponentDbNXlk;
        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH;
        super.onPause();
        C39014pkM c39014pkMValues = values();
        if (c39014pkMValues == null || (klineQuoteDataComponentDbNXlk = c39014pkMValues.DbNXlk()) == null || (stateListAnimatorUzCIH = klineQuoteDataComponentDbNXlk.uzCIH()) == null) {
            return;
        }
        stateListAnimatorUzCIH.OLrzqt();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        InterfaceC39499ptW interfaceC39499ptW;
        super.onResume();
        QbewEr().fIwbmz();
        if (Intrinsics.EZpvd((java.lang.Object) "kline_follow_app", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            if (C33492mxV.OLrzqt()) {
                InterfaceC39499ptW interfaceC39499ptW2 = this.valueOf;
                if (interfaceC39499ptW2 == null || interfaceC39499ptW2 == null) {
                    return;
                }
                interfaceC39499ptW2.EZpvd(2);
                return;
            }
            if (C33492mxV.EZpvd() != 1 || (interfaceC39499ptW = this.valueOf) == null || interfaceC39499ptW == null) {
                return;
            }
            interfaceC39499ptW.EZpvd(1);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) this.OcIXYQ, (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            return;
        }
        this.OcIXYQ = SPUtils.getString("kline_theme_type", "kline_dark");
        if (Intrinsics.EZpvd((java.lang.Object) "kline_dark", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            InterfaceC39499ptW interfaceC39499ptW3 = this.valueOf;
            if (interfaceC39499ptW3 == null || interfaceC39499ptW3 == null) {
                return;
            }
            interfaceC39499ptW3.EZpvd(2);
            return;
        }
        InterfaceC39499ptW interfaceC39499ptW4 = this.valueOf;
        if (interfaceC39499ptW4 == null || interfaceC39499ptW4 == null) {
            return;
        }
        interfaceC39499ptW4.EZpvd(1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        InterfaceC39272ppF interfaceC39272ppF;
        super.onDestroyView();
        AuCTel().AuCTel();
        WeakReference<InterfaceC39272ppF> weakReference = this.DTwDnp;
        if (weakReference != null && (interfaceC39272ppF = weakReference.get()) != null) {
            interfaceC39272ppF.EZpvd();
        }
        this.ffGIBT = null;
        this.dNCPSb.clear();
        this.RKDWNf.clear();
        this.isConnected.clear();
        C37937pGf c37937pGf = this.DCUTEI;
        if (c37937pGf != null) {
            c37937pGf.KWHzl();
        }
        this.DCUTEI = null;
        ViewPager2 viewPager2 = this.QkdxfA;
        if (viewPager2 != null) {
            viewPager2.setAdapter(null);
        }
        this.QVAiDq = null;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        fERRXa();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AYXKKw();
        oLF.EZpvd.AEQbTJ();
    }

    public final void copydefault(final java.lang.String str) {
        if (this.getNewProxyInstance) {
            this.getNewProxyInstance = false;
            return;
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KLine_Top_Tab_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pix
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38857phO.copydefault(str, (EventParamsList) obj);
            }
        });
        pXB.EZpvd.AEQbTJ("Kline_Top_Tab_Click", C56423yEv.EZpvd(C56390yDp.OLrzqt("tab", str)));
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tab_type", str, true);
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        if (this.getNewProxyInstance) {
            this.getNewProxyInstance = false;
            return;
        }
        MarketCoinInfo marketCoinInfo = this.hUfVAv;
        final java.lang.String str = (marketCoinInfo == null || !AEQbTJ(marketCoinInfo)) ? "listing" : "prelisting";
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KLine_Top_Tab_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.piu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38857phO.OLrzqt(str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tab_type", "token", true);
        eventParamsList.put("status", str, true);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39500ptX
    public void setViewPagerScroll(boolean z) {
        ViewPager2 viewPager2 = this.QkdxfA;
        if (viewPager2 != null) {
            viewPager2.setUserInputEnabled(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(java.util.List<TokenBusinessData> list) {
        gHZMYf();
        MarketCoinInfo marketCoinInfo = this.hUfVAv;
        if (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null), (java.lang.Object) "SPOT")) {
            OLrzqt(list);
        } else {
            MarketCoinInfo marketCoinInfo2 = this.hUfVAv;
            if (!Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentType() : null), (java.lang.Object) "MARGIN")) {
                MarketCoinInfo marketCoinInfo3 = this.hUfVAv;
                if (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo3 != null ? marketCoinInfo3.getInstrumentType() : null), (java.lang.Object) "FUTURES")) {
                    OLrzqt(list);
                } else {
                    MarketCoinInfo marketCoinInfo4 = this.hUfVAv;
                    if (!Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo4 != null ? marketCoinInfo4.getInstrumentType() : null), (java.lang.Object) "OPTION")) {
                        copydefault(list);
                    }
                }
            }
        }
        MarketCoinInfo marketCoinInfo5 = this.hUfVAv;
        java.lang.String instrumentType = marketCoinInfo5 != null ? marketCoinInfo5.getInstrumentType() : null;
        Intrinsics.copydefault((java.lang.Object) instrumentType);
        if (!Intrinsics.EZpvd((java.lang.Object) "INDEX", (java.lang.Object) instrumentType)) {
            EZpvd(SPUtils.getBoolean("trade_button_left", true));
            return;
        }
        android.widget.LinearLayout linearLayout = this.flVtFt;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout2 = this.fvQaOB;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    public final void gHZMYf() {
        C33624mzv c33624mzv = this.fZBcTu;
        if (c33624mzv != null) {
            c33624mzv.setClickable(false);
        }
        C33624mzv c33624mzv2 = this.gGvvIC;
        if (c33624mzv2 != null) {
            c33624mzv2.setClickable(false);
        }
        KWHzl(this.DbNXlk);
        if (this.DbNXlk) {
            return;
        }
        C33624mzv c33624mzv3 = this.finit;
        if (c33624mzv3 != null) {
            c33624mzv3.setVisibility(8);
        }
        C33624mzv c33624mzv4 = this.fFgQHt;
        if (c33624mzv4 != null) {
            c33624mzv4.setVisibility(8);
        }
        C33624mzv c33624mzv5 = this.fZBcTu;
        if (c33624mzv5 != null) {
            c33624mzv5.setVisibility(8);
        }
        C33624mzv c33624mzv6 = this.gGvvIC;
        if (c33624mzv6 != null) {
            c33624mzv6.setVisibility(8);
        }
        C33624mzv c33624mzv7 = this.dvKsVJ;
        if (c33624mzv7 != null) {
            c33624mzv7.setVisibility(zsXlph() ? 0 : 8);
        }
        C33624mzv c33624mzv8 = this.dxcTrN;
        if (c33624mzv8 != null) {
            c33624mzv8.setVisibility(zsXlph() ? 0 : 8);
        }
    }

    public final void KWHzl(boolean z) {
        C33624mzv c33624mzv = this.dvKsVJ;
        if (c33624mzv != null) {
            c33624mzv.setClickable(z);
        }
        C33624mzv c33624mzv2 = this.dxcTrN;
        if (c33624mzv2 != null) {
            c33624mzv2.setClickable(z);
        }
        C33624mzv c33624mzv3 = this.dvKsVJ;
        if (c33624mzv3 != null) {
            c33624mzv3.setAlpha(z ? 1.0f : 0.3f);
        }
        C33624mzv c33624mzv4 = this.dxcTrN;
        if (c33624mzv4 != null) {
            c33624mzv4.setAlpha(z ? 1.0f : 0.3f);
        }
    }

    public final void copydefault(java.util.List<TokenBusinessData> list) {
        C33624mzv c33624mzv = this.fZBcTu;
        if (c33624mzv != null) {
            pFQ.AEQbTJ(c33624mzv, C52761wXj.TaskDescription.fdazkH);
        }
        C33624mzv c33624mzv2 = this.gGvvIC;
        if (c33624mzv2 != null) {
            pFQ.AEQbTJ(c33624mzv2, C52761wXj.TaskDescription.fdazkH);
        }
        C33624mzv c33624mzv3 = this.fZBcTu;
        if (c33624mzv3 != null) {
            c33624mzv3.setText(C35964oKf.Fragment.OLrzqt);
        }
        C33624mzv c33624mzv4 = this.gGvvIC;
        if (c33624mzv4 != null) {
            c33624mzv4.setText(C35964oKf.Fragment.OLrzqt);
        }
        for (TokenBusinessData tokenBusinessData : list) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) tokenBusinessData.getInstType()) && Intrinsics.EZpvd((java.lang.Object) tokenBusinessData.getInstType(), (java.lang.Object) oLT.fetchVPNInfo())) {
                this.accept = tokenBusinessData;
                C33624mzv c33624mzv5 = this.fZBcTu;
                if (c33624mzv5 != null) {
                    c33624mzv5.setClickable(tokenBusinessData.getAvailable());
                }
                C33624mzv c33624mzv6 = this.gGvvIC;
                if (c33624mzv6 != null) {
                    c33624mzv6.setClickable(tokenBusinessData.getAvailable());
                }
                if (tokenBusinessData.getAvailable()) {
                    C33624mzv c33624mzv7 = this.fZBcTu;
                    if (c33624mzv7 != null) {
                        c33624mzv7.setVisibility(0);
                    }
                    C33624mzv c33624mzv8 = this.gGvvIC;
                    if (c33624mzv8 != null) {
                        c33624mzv8.setVisibility(0);
                    }
                } else {
                    C33624mzv c33624mzv9 = this.fZBcTu;
                    if (c33624mzv9 != null) {
                        c33624mzv9.setVisibility(8);
                    }
                    C33624mzv c33624mzv10 = this.gGvvIC;
                    if (c33624mzv10 != null) {
                        c33624mzv10.setVisibility(8);
                    }
                }
            }
        }
    }

    public final void OLrzqt(java.util.List<TokenBusinessData> list) {
        C33624mzv c33624mzv = this.fZBcTu;
        if (c33624mzv != null) {
            pFQ.AEQbTJ(c33624mzv, C52761wXj.TaskDescription.DcMfJKDCKfqPDCfLja);
        }
        C33624mzv c33624mzv2 = this.gGvvIC;
        if (c33624mzv2 != null) {
            pFQ.AEQbTJ(c33624mzv2, C52761wXj.TaskDescription.DcMfJKDCKfqPDCfLja);
        }
        C33624mzv c33624mzv3 = this.fZBcTu;
        if (c33624mzv3 != null) {
            c33624mzv3.setText(C35964oKf.Fragment.KWHzl);
        }
        C33624mzv c33624mzv4 = this.gGvvIC;
        if (c33624mzv4 != null) {
            c33624mzv4.setText(C35964oKf.Fragment.KWHzl);
        }
        if (this.DbNXlk) {
            for (TokenBusinessData tokenBusinessData : list) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) tokenBusinessData.getInstType()) && Intrinsics.EZpvd((java.lang.Object) tokenBusinessData.getInstType(), (java.lang.Object) oLT.AuCTel())) {
                    this.accept = tokenBusinessData;
                    C33624mzv c33624mzv5 = this.fZBcTu;
                    if (c33624mzv5 != null) {
                        c33624mzv5.setClickable(tokenBusinessData.getAvailable());
                    }
                    C33624mzv c33624mzv6 = this.gGvvIC;
                    if (c33624mzv6 != null) {
                        c33624mzv6.setClickable(tokenBusinessData.getAvailable());
                    }
                    if (tokenBusinessData.getAvailable() && KWHzl(this.fJNWhG)) {
                        C33624mzv c33624mzv7 = this.fZBcTu;
                        if (c33624mzv7 != null) {
                            c33624mzv7.setVisibility(0);
                        }
                        C33624mzv c33624mzv8 = this.gGvvIC;
                        if (c33624mzv8 != null) {
                            c33624mzv8.setVisibility(0);
                        }
                    } else {
                        C33624mzv c33624mzv9 = this.fZBcTu;
                        if (c33624mzv9 != null) {
                            c33624mzv9.setVisibility(8);
                        }
                        C33624mzv c33624mzv10 = this.gGvvIC;
                        if (c33624mzv10 != null) {
                            c33624mzv10.setVisibility(8);
                        }
                    }
                }
            }
        }
    }

    public final void AxsJAY() {
        C39014pkM c39014pkMValues = values();
        if (c39014pkMValues != null) {
            c39014pkMValues.fARcdN();
        }
    }

    public final boolean KWHzl(BizInstrument bizInstrument) {
        return !(bizInstrument != null && bizInstrument.isPreMarketPair());
    }

    private final void RcXXUw() {
        BizInstrument bizInstrument = this.fJNWhG;
        if (bizInstrument == null || !bizInstrument.isPreMarketPair()) {
            return;
        }
        C48914uef c48914uef = C48914uef.EZpvd;
        MarketCoinInfo marketCoinInfo = this.hUfVAv;
        java.lang.String premarketTitle$default = C48914uef.getPremarketTitle$default(c48914uef, marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null, false, 2, null);
        if (premarketTitle$default == null) {
            premarketTitle$default = "";
        }
        AYXKKw(premarketTitle$default);
        C38685peB c38685peBAkhnZx = AkhnZx();
        if (c38685peBAkhnZx != null) {
            c38685peBAkhnZx.AwvSrB();
        }
        java.util.ArrayList<TokenBusinessData> value = AuCTel().ejfBZ().getValue();
        if (value != null) {
            EZpvd(value);
        }
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        ViewPager2 viewPager2;
        RecyclerView.Adapter adapter;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            int iOLrzqt = OLrzqt(str);
            if (iOLrzqt > -1) {
                ViewPager2 viewPager22 = this.QkdxfA;
                if (iOLrzqt < ((viewPager22 == null || (adapter = viewPager22.getAdapter()) == null) ? 0 : adapter.getItemCount()) && (viewPager2 = this.QkdxfA) != null) {
                    viewPager2.setCurrentItem(iOLrzqt, false);
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            getTAG();
            thM7380exceptionOrNullimpl.getMessage();
        }
    }

    public final int OLrzqt(java.lang.String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -18716920) {
            if (iHashCode != 97308309) {
                if (iHashCode == 1348169736 && str.equals("trading_data")) {
                    return this.RlQdEF;
                }
            } else if (str.equals("feeds")) {
                return this.DCJXGO;
            }
        } else if (str.equals("new_coin_overview")) {
            return this.AxsJAYaxsJAY;
        }
        return 0;
    }

    public final int DbNXlk() {
        android.widget.LinearLayout linearLayout = this.QbewEr;
        if (linearLayout != null) {
            return linearLayout.getMeasuredHeight();
        }
        return 0;
    }

    public final C38685peB AkhnZx() {
        FragmentActivity activity = getActivity();
        ActivityC38834pgs activityC38834pgs = activity instanceof ActivityC38834pgs ? (ActivityC38834pgs) activity : null;
        if (activityC38834pgs != null) {
            return activityC38834pgs.valueOf();
        }
        return null;
    }

    public final void AEQbTJ(boolean z, boolean z2) {
        C33624mzv c33624mzv = this.finit;
        if (c33624mzv != null) {
            c33624mzv.setVisibility(z2 ? 0 : 8);
        }
        C33624mzv c33624mzv2 = this.fFgQHt;
        if (c33624mzv2 != null) {
            c33624mzv2.setVisibility(z2 ? 0 : 8);
        }
        C33624mzv c33624mzv3 = this.finit;
        if (c33624mzv3 != null) {
            c33624mzv3.setEnabled(z);
        }
        C33624mzv c33624mzv4 = this.fFgQHt;
        if (c33624mzv4 != null) {
            c33624mzv4.setEnabled(z);
        }
        float f = z ? 1.0f : 0.5f;
        C33624mzv c33624mzv5 = this.finit;
        if (c33624mzv5 != null) {
            c33624mzv5.setAlpha(f);
        }
        C33624mzv c33624mzv6 = this.fFgQHt;
        if (c33624mzv6 != null) {
            c33624mzv6.setAlpha(f);
        }
    }

    public final void EZpvd(boolean z) {
        ActivityResultCaller activityResultCaller;
        if (this instanceof C55427xjj) {
            activityResultCaller = this;
        } else {
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof C55427xjj)) {
                parentFragment = parentFragment.getParentFragment();
            }
            if (!(parentFragment instanceof C55427xjj)) {
                parentFragment = null;
            }
            activityResultCaller = (C55427xjj) parentFragment;
        }
        C55427xjj c55427xjj = (C55427xjj) activityResultCaller;
        if (c55427xjj == null || c55427xjj.gEmmrt) {
            if (z) {
                android.widget.LinearLayout linearLayout = this.flVtFt;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                android.widget.LinearLayout linearLayout2 = this.fvQaOB;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                    return;
                }
                return;
            }
            android.widget.LinearLayout linearLayout3 = this.flVtFt;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout4 = this.fvQaOB;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(0);
            }
        }
    }

    @Override // o.InterfaceC39502ptZ
    public void QSLkRj() {
        ActivityResultCaller activityResultCaller;
        if (this instanceof C55427xjj) {
            activityResultCaller = this;
        } else {
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof C55427xjj)) {
                parentFragment = parentFragment.getParentFragment();
            }
            if (!(parentFragment instanceof C55427xjj)) {
                parentFragment = null;
            }
            activityResultCaller = (C55427xjj) parentFragment;
        }
        C55427xjj c55427xjj = (C55427xjj) activityResultCaller;
        if (c55427xjj == null || c55427xjj.gEmmrt) {
            getFieldNames();
        }
    }

    public static final InterfaceC56387yDm sSMYrx(final ViewOnClickListenerC38857phO viewOnClickListenerC38857phO) {
        final Function0 function0 = null;
        return FragmentViewModelLazyKt.createViewModelLazy(viewOnClickListenerC38857phO, C56524yIo.AEQbTJ(KlineTimeAnchorViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.MarketKlinePortraitFragment$klineTimeAnchorViewModel_delegate$lambda$0$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = viewOnClickListenerC38857phO.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.MarketKlinePortraitFragment$klineTimeAnchorViewModel_delegate$lambda$0$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = viewOnClickListenerC38857phO.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.MarketKlinePortraitFragment$klineTimeAnchorViewModel_delegate$lambda$0$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = viewOnClickListenerC38857phO.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }
}
