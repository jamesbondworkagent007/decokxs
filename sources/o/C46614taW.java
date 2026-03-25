package o;

import android.graphics.Outline;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.FragmentActivity;
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
import androidx.viewpager2.widget.ViewPager2;
import com.github.mmin18.widget.RealtimeBlurView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okmarket.home.MarketHomeV2Fragment;
import com.okinc.okmarket.home.ui.fragment.MarketNewListingBannerFragment$mOnCountdownEndListener$1$onCountdownEnd$1;
import com.okinc.okmarket.home.ui.fragment.MarketNewListingBannerFragment$setListener$$inlined$repeatOnLifecycleResume$1;
import com.okinc.okmarket.home.ui.fragment.MarketNewListingBannerFragment$setListener$1;
import com.okinc.okmarket.home.ui.model.BannerClickType;
import com.okinc.okmarket.home.ui.viewmodel.CountingBannerViewModel;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
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
import o.C43000rgy;
import o.C46609taR;
import o.C52761wXj;
import o.InterfaceC43294rma;
import o.InterfaceC49361unB;
import o.InterfaceC49363unD;
import o.oKA;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.taW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46614taW extends AbstractC46610taS implements InterfaceC49363unD, qXK {
    public static final Application Companion = new Application(null);
    public static final int gEmmrt = 8;
    public C46609taR AYXKKw;
    public C42840rdx AhwBna;
    public java.util.ArrayList<C46684tbn> AkhnZx;
    public boolean AuCTel;
    public boolean DbNXlk;
    public int ejfBZ;
    public boolean fARcdN;
    public final TaskDescription fIwbmz;
    public final java.lang.Runnable fJNWhG;
    public android.animation.Animator fetchVPNInfo;
    public final Activity getFieldNames;
    public final ActionBar getNewProxyInstance;
    public final PendingIntent hDKMBd;
    public boolean isConnected;
    public final InterfaceC56387yDm uzCIH;
    public final android.os.Handler values;
    public final /* synthetic */ qXB djBIcL = new qXB();
    public final int valueOf = qZH.ActionBar.invokespecialRuDPQV;

    /* JADX INFO: renamed from: o.taW$StateListAnimator */
    /* JADX INFO: loaded from: classes24.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BannerClickType.values().length];
            try {
                iArr[BannerClickType.TRADE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BannerClickType.KLINE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerClickType.DEEPLINK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void AEQbTJ(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, int i4, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.djBIcL.AEQbTJ(i, i2, i3, i4, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.djBIcL.AEQbTJ(str, str2, str3, i, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void EZpvd(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.djBIcL.EZpvd(i, i2, i3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void copydefault(long j) {
        this.djBIcL.copydefault(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.djBIcL.copydefault(str, str2, str3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.valueOf;
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

    public C46614taW() {
        final Dialog dialog = new Dialog(this);
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.okmarket.home.ui.fragment.MarketNewListingBannerFragment$special$$inlined$parentViewModels$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) dialog.invoke();
            }
        });
        final Function0 function0 = null;
        this.uzCIH = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CountingBannerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okmarket.home.ui.fragment.MarketNewListingBannerFragment$special$$inlined$parentViewModels$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okmarket.home.ui.fragment.MarketNewListingBannerFragment$special$$inlined$parentViewModels$4
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okmarket.home.ui.fragment.MarketNewListingBannerFragment$special$$inlined$parentViewModels$5
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
        this.AkhnZx = new java.util.ArrayList<>();
        this.ejfBZ = -1;
        this.AuCTel = true;
        this.values = new android.os.Handler(android.os.Looper.getMainLooper());
        this.hDKMBd = new PendingIntent();
        this.fJNWhG = new java.lang.Runnable() { // from class: o.tbd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C46614taW.fARcdN(this.EZpvd);
            }
        };
        this.getFieldNames = new Activity();
        this.getNewProxyInstance = new ActionBar();
        this.fIwbmz = new TaskDescription();
    }

    /* JADX INFO: renamed from: o.taW$Application */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.taW.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final CountingBannerViewModel gEmmrt() {
        return (CountingBannerViewModel) this.uzCIH.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AhwBna = C42840rdx.AEQbTJ(view);
        AkhnZx();
        view.post(new java.lang.Runnable() { // from class: o.tbc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C46614taW.DbNXlk(this.AEQbTJ);
            }
        });
    }

    public static final void DbNXlk(C46614taW c46614taW) {
        c46614taW.valueOf();
    }

    public final void valueOf() {
        RealtimeBlurView realtimeBlurView;
        C42840rdx c42840rdx = this.AhwBna;
        if (c42840rdx == null || (realtimeBlurView = c42840rdx.AEQbTJ) == null) {
            return;
        }
        try {
            realtimeBlurView.setOverlayColor(ColorUtils.setAlphaComponent(C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC), 51));
            realtimeBlurView.setOutlineProvider(new LoaderManager(C55298xhM.dp2px$default(12.0f, null, 1, null)));
            realtimeBlurView.setClipToOutline(true);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(getTAG(), "setupBlurView failed", e);
            realtimeBlurView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: o.taW$LoaderManager */
    public static final class LoaderManager extends android.view.ViewOutlineProvider {
        public final /* synthetic */ float KWHzl;

        public LoaderManager(float f) {
            this.KWHzl = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(outline, "");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.KWHzl);
        }
    }

    private final void AkhnZx() {
        C42840rdx c42840rdx = this.AhwBna;
        if (c42840rdx != null) {
            C46609taR c46609taR = new C46609taR(this.AkhnZx);
            this.AYXKKw = c46609taR;
            c46609taR.copydefault(this.getNewProxyInstance);
            C46609taR c46609taR2 = this.AYXKKw;
            if (c46609taR2 != null) {
                c46609taR2.EZpvd(this.fIwbmz);
            }
            c42840rdx.gEmmrt.registerOnPageChangeCallback(this.getFieldNames);
            c42840rdx.gEmmrt.setAdapter(this.AYXKKw);
            android.view.View childAt = c42840rdx.gEmmrt.getChildAt(0);
            RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
            if (recyclerView != null) {
                recyclerView.setOverScrollMode(2);
            }
            c42840rdx.EZpvd.setSlideListener(this.hDKMBd);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093 A[EDGE_INSN: B:47:0x0093->B:38:0x0093 BREAK  A[LOOP:0: B:30:0x0069->B:49:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(final java.util.List<C46684tbn> list) {
        ViewPager2 viewPager2;
        if (Intrinsics.EZpvd(this.AkhnZx, list)) {
            return;
        }
        C42840rdx c42840rdx = this.AhwBna;
        if (c42840rdx != null && (viewPager2 = c42840rdx.gEmmrt) != null && viewPager2.isFakeDragging()) {
            this.values.postDelayed(new java.lang.Runnable() { // from class: o.tba
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C46614taW.OLrzqt(this.AEQbTJ, list);
                }
            }, 400L);
            return;
        }
        this.AkhnZx.clear();
        this.AkhnZx.addAll(list);
        int iCopydefault = 0;
        boolean z = this.AkhnZx.size() > 1;
        this.isConnected = z;
        C46609taR c46609taR = this.AYXKKw;
        if (c46609taR != null) {
            c46609taR.AEQbTJ(z);
        }
        C42840rdx c42840rdx2 = this.AhwBna;
        if (c42840rdx2 != null) {
            if (this.AkhnZx.size() == list.size()) {
                java.util.List<kotlin.Pair> listValues = CollectionsKt___CollectionsKt.values(this.AkhnZx, list);
                if ((listValues instanceof java.util.Collection) && listValues.isEmpty()) {
                    if (this.isConnected) {
                    }
                    ViewPager2 viewPager22 = c42840rdx2.gEmmrt;
                    Intrinsics.checkNotNullExpressionValue(viewPager22, "");
                    safeSetViewPagerCurrentItem$default(this, viewPager22, iCopydefault, 0, 4, null);
                } else {
                    for (kotlin.Pair pair : listValues) {
                        if (!((C46684tbn) pair.component1()).KWHzl((C46684tbn) pair.component2())) {
                            break;
                        }
                    }
                    if (this.isConnected) {
                        C46609taR c46609taR2 = this.AYXKKw;
                        if (c46609taR2 != null) {
                            iCopydefault = c46609taR2.copydefault();
                        }
                    } else {
                        iCopydefault = c42840rdx2.gEmmrt.getCurrentItem();
                    }
                    ViewPager2 viewPager222 = c42840rdx2.gEmmrt;
                    Intrinsics.checkNotNullExpressionValue(viewPager222, "");
                    safeSetViewPagerCurrentItem$default(this, viewPager222, iCopydefault, 0, 4, null);
                }
            }
        }
        C46609taR c46609taR3 = this.AYXKKw;
        if (c46609taR3 != null) {
            c46609taR3.notifyDataSetChanged();
        }
        fetchVPNInfo();
        this.AuCTel = true;
        OLrzqt();
        KWHzl(new java.lang.Runnable() { // from class: o.tbb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C46614taW.fJNWhG(this.KWHzl);
            }
        });
    }

    public static final void OLrzqt(C46614taW c46614taW, java.util.List list) {
        c46614taW.AEQbTJ((java.util.List<C46684tbn>) list);
    }

    public static final void fJNWhG(C46614taW c46614taW) {
        c46614taW.AhwBna();
        c46614taW.djBIcL();
    }

    public final void KWHzl(final java.lang.Runnable runnable) {
        if (isAdded()) {
            this.values.postDelayed(new java.lang.Runnable() { // from class: o.taV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C46614taW.OLrzqt(this.OLrzqt, runnable);
                }
            }, 1000L);
        }
    }

    public static final void OLrzqt(C46614taW c46614taW, java.lang.Runnable runnable) {
        if (!c46614taW.isAdded() || c46614taW.getView() == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: o.taW$PendingIntent */
    public static final class PendingIntent implements C43000rgy.TaskDescription {
        public PendingIntent() {
        }

        @Override // o.C43000rgy.TaskDescription
        public void EZpvd(boolean z) {
            if (z) {
                C46614taW.this.OLrzqt();
            } else {
                C46614taW.this.AhwBna();
            }
        }
    }

    public final void AhwBna() {
        OLrzqt();
        if (AYXKKw()) {
            this.values.postDelayed(this.fJNWhG, this.AuCTel ? 3500L : 7000L);
        }
    }

    public final boolean AYXKKw() {
        C42840rdx c42840rdx;
        C43000rgy c43000rgy;
        return isAdded() && this.isConnected && this.fARcdN && (c42840rdx = this.AhwBna) != null && (c43000rgy = c42840rdx.EZpvd) != null && !c43000rgy.AEQbTJ();
    }

    public final void OLrzqt() {
        this.values.removeCallbacks(this.fJNWhG);
    }

    public static final void fARcdN(final C46614taW c46614taW) {
        C46609taR c46609taR;
        C42840rdx c42840rdx;
        int currentItem;
        if (c46614taW.AYXKKw() && (c46609taR = c46614taW.AYXKKw) != null && (c42840rdx = c46614taW.AhwBna) != null && (currentItem = c42840rdx.gEmmrt.getCurrentItem() + 1) < c46609taR.getItemCount()) {
            c46614taW.DbNXlk = true;
            ViewPager2 viewPager2 = c42840rdx.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(viewPager2, "");
            c46614taW.fetchVPNInfo = C46735tcl.setCurrentItem$default(viewPager2, currentItem, 400L, null, C33570myu.AEQbTJ() - C55298xhM.dp2px$default(48.0f, null, 1, null), new Function0() { // from class: o.tbe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C46614taW.fIwbmz(this.EZpvd);
                }
            }, 4, null);
        }
    }

    public static final Unit fIwbmz(C46614taW c46614taW) {
        if (c46614taW.AuCTel) {
            c46614taW.AuCTel = false;
        }
        c46614taW.AhwBna();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.taW$Activity */
    public static final class Activity extends ViewPager2.OnPageChangeCallback {
        public Activity() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            C46609taR c46609taR;
            super.onPageSelected(i);
            if (C46614taW.this.isAdded() && (c46609taR = C46614taW.this.AYXKKw) != null) {
                C42840rdx unused = C46614taW.this.AhwBna;
                C46614taW c46614taW = C46614taW.this;
                c46614taW.fetchVPNInfo();
                if (copydefault(i).getFirst().booleanValue()) {
                    c46614taW.ejfBZ = r2.getSecond().intValue() - 1;
                    return;
                }
                int iCopydefault = c46609taR.copydefault(i);
                if (iCopydefault < c46614taW.AkhnZx.size()) {
                    java.lang.Object obj = c46614taW.AkhnZx.get(iCopydefault);
                    Intrinsics.checkNotNullExpressionValue(obj, "");
                    c46614taW.copydefault((C46684tbn) obj);
                }
                c46614taW.ejfBZ = i;
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            C42840rdx c42840rdx;
            super.onPageScrollStateChanged(i);
            if (i != 0 || C46614taW.this.AYXKKw == null || (c42840rdx = C46614taW.this.AhwBna) == null) {
                return;
            }
            C46614taW c46614taW = C46614taW.this;
            kotlin.Pair<java.lang.Boolean, java.lang.Integer> pairCopydefault = copydefault(c42840rdx.gEmmrt.getCurrentItem());
            if (pairCopydefault.getFirst().booleanValue()) {
                ViewPager2 viewPager2 = c42840rdx.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(viewPager2, "");
                C46614taW.safeSetViewPagerCurrentItem$default(c46614taW, viewPager2, pairCopydefault.getSecond().intValue(), 0, 4, null);
            }
        }

        public final kotlin.Pair<java.lang.Boolean, java.lang.Integer> copydefault(int i) {
            C46609taR c46609taR;
            int iEZpvd;
            if (C46614taW.this.isConnected && (c46609taR = C46614taW.this.AYXKKw) != null) {
                if (i == 0) {
                    iEZpvd = c46609taR.copydefault();
                } else {
                    iEZpvd = i == c46609taR.getItemCount() + (-1) ? c46609taR.EZpvd() : -1;
                }
                if (iEZpvd != -1 && iEZpvd != i && iEZpvd < c46609taR.getItemCount()) {
                    return new kotlin.Pair<>(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(iEZpvd));
                }
                return new kotlin.Pair<>(java.lang.Boolean.FALSE, 0);
            }
            return new kotlin.Pair<>(java.lang.Boolean.FALSE, 0);
        }
    }

    /* JADX INFO: renamed from: o.taW$ActionBar */
    public static final class ActionBar implements C46609taR.Application {
        public ActionBar() {
        }

        @Override // o.C46609taR.Application
        public void copydefault(C46684tbn c46684tbn, int i) {
            Intrinsics.checkNotNullParameter(c46684tbn, "");
            if (!C46614taW.this.isAdded() || C46614taW.this.getActivity() == null || C46614taW.this.AYXKKw == null) {
                return;
            }
            C46614taW.this.KWHzl(c46684tbn);
        }
    }

    /* JADX INFO: renamed from: o.taW$TaskDescription */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskDescription implements C46609taR.StateListAnimator {
        public TaskDescription() {
        }

        @Override // o.C46609taR.StateListAnimator
        public void OLrzqt(C46684tbn c46684tbn, int i) {
            Intrinsics.checkNotNullParameter(c46684tbn, "");
            if (!C46614taW.this.isAdded() || C46614taW.this.getActivity() == null) {
                return;
            }
            LifecycleOwner viewLifecycleOwner = C46614taW.this.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MarketNewListingBannerFragment$mOnCountdownEndListener$1$onCountdownEnd$1(C46614taW.this, null), 3, null);
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, gEmmrt(), null, new MarketNewListingBannerFragment$setListener$1(this, null), 1, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketNewListingBannerFragment$setListener$$inlined$repeatOnLifecycleResume$1(this, Lifecycle.State.RESUMED, null, this), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DbNXlk() {
        C43000rgy root;
        getTAG();
        C42840rdx c42840rdx = this.AhwBna;
        if (c42840rdx == null || (root = c42840rdx.getRoot()) == null) {
            return;
        }
        root.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected() {
        C43000rgy root;
        C42840rdx c42840rdx = this.AhwBna;
        if (c42840rdx == null || (root = c42840rdx.getRoot()) == null) {
            return;
        }
        root.setVisibility(0);
    }

    public final void KWHzl(C46684tbn c46684tbn) {
        int i = StateListAnimator.KWHzl[c46684tbn.EZpvd().ordinal()];
        if (i == 1) {
            AEQbTJ(c46684tbn);
        } else if (i == 2) {
            OLrzqt(c46684tbn);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            EZpvd(c46684tbn);
        }
    }

    public final void AEQbTJ(C46684tbn c46684tbn) {
        copydefault(c46684tbn, ExtJson.BRC20TYPE_TRADE);
        int iCopydefault = C54799xVt.AEQbTJ.copydefault(c46684tbn.AhwBna());
        java.lang.String str = ((InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class)).OLrzqt() + "?bizType=" + iCopydefault + "&instId=" + c46684tbn.djBIcL() + "&from=page_home&fromPageSource=Home_Banner_CountDown";
        FragmentActivity activity = getActivity();
        if (activity != null) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, str, null, new Function1() { // from class: o.tbg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C46614taW.EZpvd((AbstractC43238rlX) obj);
                }
            }, 4, null);
        }
    }

    public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void OLrzqt(C46684tbn c46684tbn) {
        copydefault(c46684tbn, "inprogress");
        oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
        if (oka != null) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            oKA.TaskDescription.gotoNewKlinePage$default(oka, contextRequireContext, C46685tbo.EZpvd(c46684tbn), null, null, "page_home", null, null, null, "Home_Banner_CountDown", null, null, 1772, null);
        }
    }

    /* JADX INFO: renamed from: o.taW$Dialog */
    public static final class Dialog implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(androidx.fragment.app.Fragment fragment) {
            this.OLrzqt = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            androidx.fragment.app.Fragment fragment = this.OLrzqt;
            if (fragment != null && !(fragment instanceof MarketHomeV2Fragment)) {
                androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof MarketHomeV2Fragment)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                if (!(parentFragment instanceof MarketHomeV2Fragment)) {
                    parentFragment = null;
                }
                fragment = (MarketHomeV2Fragment) parentFragment;
            }
            if (!(fragment instanceof MarketHomeV2Fragment)) {
                fragment = null;
            }
            MarketHomeV2Fragment marketHomeV2Fragment = (MarketHomeV2Fragment) fragment;
            MarketHomeV2Fragment marketHomeV2Fragment2 = marketHomeV2Fragment instanceof ViewModelStoreOwner ? marketHomeV2Fragment : null;
            if (marketHomeV2Fragment2 != null) {
                return marketHomeV2Fragment2;
            }
            throw new java.lang.IllegalArgumentException(("host parent fragment must be " + MarketHomeV2Fragment.class.getSimpleName()).toString());
        }
    }

    public final void EZpvd(C46684tbn c46684tbn) {
        FragmentActivity activity;
        copydefault(c46684tbn, ExtJson.BRC20TYPE_TRADE);
        java.lang.String strValueOf = c46684tbn.valueOf();
        if (strValueOf == null || (activity = getActivity()) == null) {
            return;
        }
        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, strValueOf, null, new Function1() { // from class: o.tbj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46614taW.KWHzl((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void copydefault(final C46684tbn c46684tbn, final java.lang.String str) {
        C32866mlf.onEvent$default("HomePage_Banner_Newlisting_Click", (TrackChannel[]) null, new Function1() { // from class: o.taX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46614taW.OLrzqt(str, c46684tbn, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, C46684tbn c46684tbn, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button_click", str, true);
        eventParamsList.put("all_tokens_click", c46684tbn.djBIcL(), true);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.ORDER, c46684tbn.AEQbTJ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "user_status", C55697xoo.OLrzqt.isConnected() ? FirebaseAnalytics.Event.LOGIN : "nologin", false, 4, null);
        if (c46684tbn.DbNXlk() != null) {
            EventParamsList.put$default(eventParamsList, "card_id", c46684tbn.DbNXlk().toString(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        C42840rdx c42840rdx;
        ViewPager2 viewPager2;
        int iCopydefault;
        if (!isAdded() || this.AYXKKw == null || this.AkhnZx.isEmpty() || (c42840rdx = this.AhwBna) == null || (viewPager2 = c42840rdx.gEmmrt) == null) {
            return;
        }
        int currentItem = viewPager2.getCurrentItem();
        C46609taR c46609taR = this.AYXKKw;
        if (c46609taR == null || (iCopydefault = c46609taR.copydefault(currentItem)) >= this.AkhnZx.size()) {
            return;
        }
        C46684tbn c46684tbn = this.AkhnZx.get(iCopydefault);
        Intrinsics.checkNotNullExpressionValue(c46684tbn, "");
        copydefault(c46684tbn);
    }

    public final void copydefault(final C46684tbn c46684tbn) {
        C32866mlf.onEvent$default("HomePage_Banner_Newlisting_View", (TrackChannel[]) null, new Function1() { // from class: o.tbh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46614taW.AEQbTJ(c46684tbn, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(C46684tbn c46684tbn, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("cex_token", c46684tbn.djBIcL(), true);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.ORDER, c46684tbn.AEQbTJ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "user_status", C55697xoo.OLrzqt.isConnected() ? FirebaseAnalytics.Event.LOGIN : "nologin", false, 4, null);
        if (c46684tbn.DbNXlk() != null) {
            EventParamsList.put$default(eventParamsList, "card_id", c46684tbn.DbNXlk().toString(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void fetchVPNInfo() {
        C42840rdx c42840rdx = this.AhwBna;
        if (c42840rdx != null) {
            C46609taR c46609taR = this.AYXKKw;
            if (this.AkhnZx.size() > 1 && c46609taR != null) {
                int iCopydefault = c46609taR.copydefault(c42840rdx.gEmmrt.getCurrentItem());
                if (iCopydefault < this.AkhnZx.size()) {
                    int size = this.AkhnZx.size();
                    c42840rdx.OLrzqt.setText((iCopydefault + 1) + "/" + size);
                    c42840rdx.copydefault.setVisibility(0);
                    return;
                }
                c42840rdx.copydefault.setVisibility(8);
                return;
            }
            c42840rdx.copydefault.setVisibility(8);
        }
    }

    public static /* synthetic */ void safeSetViewPagerCurrentItem$default(C46614taW c46614taW, ViewPager2 viewPager2, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        c46614taW.copydefault(viewPager2, i, i2);
    }

    public final void copydefault(final ViewPager2 viewPager2, final int i, final int i2) {
        C46609taR c46609taR;
        if (!isAdded() || i2 > 5 || (c46609taR = this.AYXKKw) == null) {
            return;
        }
        if (viewPager2.isFakeDragging()) {
            this.values.postDelayed(new java.lang.Runnable() { // from class: o.tbf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C46614taW.KWHzl(this.KWHzl, viewPager2, i, i2);
                }
            }, 400L);
            return;
        }
        if (i < 0 || i >= c46609taR.getItemCount()) {
            return;
        }
        try {
            viewPager2.setCurrentItem(i, false);
        } catch (java.lang.Exception e) {
            pUU.copydefault("CountingBannerFragmentV2", "safeSetViewPagerCurrentItem failed: " + e.getMessage());
        }
    }

    public static final void KWHzl(C46614taW c46614taW, ViewPager2 viewPager2, int i, int i2) {
        c46614taW.copydefault(viewPager2, i, i2 + 1);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.fARcdN = true;
        djBIcL();
        AhwBna();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.fARcdN = false;
        OLrzqt();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewPager2 viewPager2;
        super.onDestroyView();
        C42840rdx c42840rdx = this.AhwBna;
        if (c42840rdx != null && (viewPager2 = c42840rdx.gEmmrt) != null) {
            viewPager2.unregisterOnPageChangeCallback(this.getFieldNames);
        }
        this.AhwBna = null;
        this.AuCTel = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        android.animation.Animator animator;
        super.onDestroy();
        android.animation.Animator animator2 = this.fetchVPNInfo;
        if (animator2 != null && animator2.isRunning() && (animator = this.fetchVPNInfo) != null) {
            animator.cancel();
        }
        this.values.removeCallbacksAndMessages(null);
    }
}
