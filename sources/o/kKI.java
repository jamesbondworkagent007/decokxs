package o;

import android.os.MessageQueue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.okinc.account.api.model.login.LoginRoute;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.dialog.MarketToolDialog;
import com.okinc.business.market.watch.ui.GroupWatchListFragment$collectData$2;
import com.okinc.business.market.watch.ui.GroupWatchListFragment$collectData$4;
import com.okinc.business.market.watch.ui.GroupWatchListFragment$executePostUpdateTabsAction$2;
import com.okinc.business.market.watch.ui.GroupWatchListFragment$executePostUpdateTabsAction$3;
import com.okinc.business.market.watch.ui.GroupWatchListFragment$onActionClick$1;
import com.okinc.business.market.watch.ui.GroupWatchListFragment$onActionClick$3;
import com.okinc.business.market.watch.ui.GroupWatchListFragment$onCreate$1$1;
import com.okinc.business.market.watch.ui.GroupWatchListFragment$onCreate$1$2;
import com.okinc.business.market.watch.ui.GroupWatchListFragment$onGroupEditClick$3;
import com.okinc.business.market.watch.ui.GroupWatchListFragment$onPageSelected$1;
import com.okinc.business.market.watch.ui.GroupWatchListFragment$onVisible$1;
import com.okinc.business.market.watch.ui.GroupWatchListFragment$performLongClick$1;
import com.okinc.business.market.watch.ui.GroupWatchListFragment$requestData$1;
import com.okinc.business.market.watch.ui.viewmodel.GroupWatchListViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.market.alert.database.MarketAlertDataBase;
import com.okinc.market.watch.data.UserGroup;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.AbstractC27554jxQ;
import o.ActivityC26135jTf;
import o.C27831kEy;
import o.C27996kLa;
import o.C27997kLb;
import o.C52812wZg;
import o.C6814aWV;
import o.InterfaceC49361unB;
import o.InterfaceC49363unD;
import o.InterfaceC49371unL;
import o.jSB;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class kKI extends kKW implements InterfaceC49363unD, MarketToolDialog.TaskDescription, AbstractC27554jxQ.ActionBar, pWK, C27831kEy.Application {
    public static boolean EZpvd;
    public qZP AEQbTJ;
    public boolean AYXKKw;
    public android.view.View AhwBna;
    public boolean AkhnZx;
    public boolean AuCTel;
    public final java.lang.Object DbNXlk;
    public C52812wZg KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm djBIcL;
    public Job ejfBZ;
    public kKE fARcdN;
    public final InterfaceC56387yDm fIwbmz;
    public CoinQuote fJNWhG;
    public boolean fetchVPNInfo;
    public boolean gEmmrt;
    public final InterfaceC56387yDm getNewProxyInstance;
    public java.lang.String hDKMBd;
    public boolean isConnected;
    public WeakReference<android.view.View> iwGUEr;
    public Function0<Unit> uzCIH;
    public final InterfaceC56387yDm valueOf;
    public boolean values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MarketToolDialog.Action.values().length];
            try {
                iArr[MarketToolDialog.Action.STAR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MarketToolDialog.Action.ALERT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketToolDialog.Action.EDIT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[MarketToolDialog.Action.TOP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    public final boolean ejfBZ() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C27831kEy.Application
    public java.lang.String fJNWhG() {
        return "markets";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.fJNWhG;
    }

    public <T extends InterfaceC49369unJ<T>> java.lang.Object OLrzqt(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Unit> continuation) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, function2, continuation);
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

    public kKI() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.watch.ui.GroupWatchListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.watch.ui.GroupWatchListFragment$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(GroupWatchListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.watch.ui.GroupWatchListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.watch.ui.GroupWatchListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.watch.ui.GroupWatchListFragment$special$$inlined$viewModels$default$5
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
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.kKP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(kKI.valueOf());
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.kKR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(kKI.EZpvd());
            }
        });
        this.getNewProxyInstance = C56392yDr.copydefault(new Function0() { // from class: o.kKT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kKI.djBIcL();
            }
        });
        this.DbNXlk = new java.lang.Object();
        this.AYXKKw = true;
        this.fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.kKL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kKI.AhwBna(this.EZpvd);
            }
        });
        this.gEmmrt = true;
        this.AuCTel = true;
    }

    public final GroupWatchListViewModel AkhnZx() {
        return (GroupWatchListViewModel) this.djBIcL.getValue();
    }

    public static final int valueOf() {
        return C55298xhM.dp2px$default(6.0f, null, 1, null);
    }

    public final int AYXKKw() {
        return ((java.lang.Number) this.valueOf.getValue()).intValue();
    }

    public final int gEmmrt() {
        return ((java.lang.Number) this.OLrzqt.getValue()).intValue();
    }

    public static final int EZpvd() {
        return C55298xhM.dp2px$default(30.0f, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C38383pWt zLjUOn() {
        return (C38383pWt) this.getNewProxyInstance.getValue();
    }

    public static final C38383pWt djBIcL() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(new C38383pWt(C38384pWu.Companion.copydefault(MarketAlertDataBase.Companion.EZpvd())));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        return (C38383pWt) objM7377constructorimpl;
    }

    public final C55173xeu isConnected() {
        return (C55173xeu) this.fIwbmz.getValue();
    }

    public static final C55173xeu AhwBna(kKI kki) {
        android.content.Context contextRequireContext = kki.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C55173xeu(contextRequireContext, null, 0, 6, null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kKI.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        qZP qzpAEQbTJ = qZP.AEQbTJ(view);
        this.AEQbTJ = qzpAEQbTJ;
        if (qzpAEQbTJ != null) {
            copydefault(qzpAEQbTJ);
        }
    }

    public final void copydefault(qZP qzp) {
        AEQbTJ(true);
        C55254xgV c55254xgV = qzp.AEQbTJ;
        android.view.View viewInflate = android.view.LayoutInflater.from(requireActivity()).inflate(qZH.ActionBar.OqFWZa, (android.view.ViewGroup) c55254xgV, false);
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewInflate.findViewById(qZH.StateListAnimator.onComplete);
        this.AhwBna = appCompatImageView;
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: o.kKQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                kKI.EZpvd(this.KWHzl, view);
            }
        });
        Intrinsics.copydefault(viewInflate);
        c55254xgV.OLrzqt(viewInflate);
        qzp.KWHzl.addOnPageChangeListener(new StateListAnimator());
        qzp.AEQbTJ.AEQbTJ(new Activity());
        java.util.List listAhwBna = yDY.AhwBna();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        kKE kke = new kKE(listAhwBna, childFragmentManager);
        this.fARcdN = kke;
        qzp.KWHzl.setAdapter(kke);
        qzp.AEQbTJ.setupWithViewPager(qzp.KWHzl);
        AhwBna();
    }

    public static final void EZpvd(kKI kki, android.view.View view) {
        kki.AuCTel();
    }

    public static final class StateListAnimator implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        public StateListAnimator() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            kKI.this.KWHzl(i);
        }
    }

    public static final class Activity implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Activity() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            kKI.this.copydefault(tab != null ? tab.getPosition() : 0);
        }
    }

    public final void AuCTel() {
        if (!C55608xnE.isLogin$default(null, 1, null)) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                ((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class)).OLrzqt(activity, new LoginRoute(null, null, null, null, null, null, null, null, null, false, false, 2047, null));
                return;
            }
            return;
        }
        C32866mlf.onEvent$default("Favorites_Page_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.kKN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kKI.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        AuCTelauCTel();
        C27986kKr.AEQbTJ.OLrzqt("pic_url", "market_favorite_edit");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GroupWatchListFragment$onGroupEditClick$3(this, null), 3, null);
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button_type", "edit_group", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(int i) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GroupWatchListFragment$onPageSelected$1(this, i, null), 3, null);
    }

    public final void copydefault(int i) {
        java.lang.String groupName;
        java.util.List<UserGroup> listCopydefault;
        UserGroup userGroup;
        if (this.AkhnZx) {
            C27986kKr c27986kKr = C27986kKr.AEQbTJ;
            kKE kke = this.fARcdN;
            if (kke == null || (listCopydefault = kke.copydefault()) == null || (userGroup = (UserGroup) CollectionsKt___CollectionsKt.AkhnZx(listCopydefault, i)) == null || (groupName = userGroup.getGroupName()) == null) {
                groupName = "";
            }
            c27986kKr.OLrzqt("pic_url", groupName);
        }
        this.AkhnZx = true;
    }

    public final void AhwBna() {
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, AkhnZx(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.watch.ui.GroupWatchListFragment$collectData$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((C27996kLa) obj).KWHzl();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((C27996kLa) obj).OLrzqt((InterfaceC49371unL<C27997kLb>) obj2);
            }
        }, null, new GroupWatchListFragment$collectData$2(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, AkhnZx(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.watch.ui.GroupWatchListFragment$collectData$3
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((C27996kLa) obj).OLrzqt();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((C27996kLa) obj).KWHzl((String) obj2);
            }
        }, null, new GroupWatchListFragment$collectData$4(this, null), 2, null);
        AbstractC58185ywX abstractC58185ywXAEQbTJ = RxBus.AEQbTJ(C6814aWV.class, "");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final java.lang.Object obj = this.DbNXlk;
        abstractC58185ywXEZpvd.subscribe(new RxBus.EventCallback<C6814aWV>(obj) { // from class: com.okinc.business.market.watch.ui.GroupWatchListFragment$collectData$5
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(C6814aWV c6814aWV) {
                Intrinsics.checkNotNullParameter(c6814aWV, "");
                this.this$0.hDKMBd = c6814aWV.AEQbTJ().getString("market_key_group_watch_list_group_name");
            }
        });
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        Job job = this.ejfBZ;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        C52812wZg c52812wZg = this.KWHzl;
        if (c52812wZg != null) {
            c52812wZg.KWHzl();
        }
    }

    @Override // o.pWK
    public void getFieldNames() {
        KWHzl(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(final java.util.List<UserGroup> list) {
        copydefault(list, new Function0() { // from class: o.kKO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kKI.OLrzqt(this.copydefault, list);
            }
        });
    }

    public static final Unit OLrzqt(kKI kki, java.util.List list) {
        kki.KWHzl((java.util.List<UserGroup>) list);
        return Unit.INSTANCE;
    }

    public static final boolean AYXKKw(kKI kki) {
        kki.AEQbTJ(3);
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        jSB.Application application = jSB.Companion;
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        application.EZpvd(lifecycle, new Function1() { // from class: o.kKM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kKI.EZpvd(this.AEQbTJ, (jSB) obj);
            }
        });
    }

    public static final Unit EZpvd(kKI kki, jSB jsb) {
        Intrinsics.checkNotNullParameter(jsb, "");
        if (kki.isResumed()) {
            LifecycleOwnerKt.getLifecycleScope(kki).launchWhenResumed(new GroupWatchListFragment$onCreate$1$1(kki, null));
        }
        if (jsb instanceof jSB.FragmentManager) {
            pUU.KWHzl(kki.getTAG(), "GroupNewAddedEvent: group add " + ((jSB.FragmentManager) jsb).AEQbTJ());
            LifecycleOwnerKt.getLifecycleScope(kki).launchWhenResumed(new GroupWatchListFragment$onCreate$1$2(kki, jsb, null));
        }
        return Unit.INSTANCE;
    }

    public final void AhwBna(boolean z) {
        if (isAdded()) {
            if (z) {
                OLrzqt(true);
                InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(C27831kEy.class);
                androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                ((C27831kEy) C33062mpP.findOrReplaceFragment$default(interfaceC56551yJoAEQbTJ, childFragmentManager, qZH.StateListAnimator.sEAkxl, null, null, null, 28, null)).EZpvd(true);
                this.isConnected = true;
                return;
            }
            OLrzqt(false);
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ2 = C56524yIo.AEQbTJ(C27831kEy.class);
            androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
            C27831kEy c27831kEy = (C27831kEy) C33062mpP.findFragment$default(interfaceC56551yJoAEQbTJ2, childFragmentManager2, null, 2, null);
            if (c27831kEy != null) {
                androidx.fragment.app.FragmentManager childFragmentManager3 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
                C33062mpP.copydefault(c27831kEy, childFragmentManager3);
            }
            if (this.isConnected) {
                this.isConnected = false;
            }
        }
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        if (!C55608xnE.isLogin$default(null, 1, null)) {
            EZpvd = true;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GroupWatchListFragment$onVisible$1(this, null), 3, null);
        if (!this.values) {
            this.values = true;
            fARcdN();
        }
        KWHzl(false);
    }

    @Override // com.okinc.business.market.market.dialog.MarketToolDialog.TaskDescription
    public void OLrzqt(@NotNull MarketToolDialog.Action action) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(action, "");
        CoinQuote coinQuote = this.fJNWhG;
        if (coinQuote == null) {
            return;
        }
        int i = Application.copydefault[action.ordinal()];
        if (i == 1) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GroupWatchListFragment$onActionClick$1(this, coinQuote, null), 3, null);
        } else if (i == 2) {
            C27858kFy c27858kFy = C27858kFy.EZpvd;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            c27858kFy.copydefault(contextRequireContext, coinQuote, "favorites_discover");
        } else if (i == 3) {
            try {
                Result.Application application = Result.Companion;
                if (C55608xnE.isLogin$default(null, 1, null)) {
                    AuCTelauCTel();
                } else {
                    InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class);
                    FragmentActivity fragmentActivityRequireActivity = requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    interfaceC8104awT.OLrzqt(fragmentActivityRequireActivity, new LoginRoute(null, null, null, null, null, null, null, null, null, false, false, 2047, null));
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Result.m7376boximpl(objM7377constructorimpl);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = Application.copydefault[action.ordinal()];
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GroupWatchListFragment$onActionClick$3(this, i2 != 1 ? i2 != 3 ? i2 != 4 ? null : "top" : "edit" : "unfavorite", null), 3, null);
    }

    @Override // o.AbstractC27554jxQ.ActionBar
    public boolean OLrzqt(@NotNull android.view.View view, int i, CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(view, "");
        if (coinQuote == null) {
            return true;
        }
        this.fJNWhG = coinQuote;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GroupWatchListFragment$performLongClick$1(coinQuote, this, iArr, null), 3, null);
        return true;
    }

    private final void AuCTelauCTel() {
        ActivityC26135jTf.Application application = ActivityC26135jTf.Companion;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        application.KWHzl(fragmentActivityRequireActivity);
    }

    public final void DbNXlk() {
        EZpvd(true);
        AEQbTJ(false);
        copydefault(false);
    }

    public final void uzCIH() {
        EZpvd(false);
        AEQbTJ(false);
        copydefault(true);
    }

    public final void KWHzl(boolean z) {
        if (z) {
            Job job = this.ejfBZ;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.ejfBZ = null;
        }
        Job job2 = this.ejfBZ;
        if (job2 == null || !job2.isActive()) {
            this.ejfBZ = LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new GroupWatchListFragment$requestData$1(this, null));
        }
    }

    public final void copydefault(boolean z) {
        final android.widget.FrameLayout frameLayoutFetchVPNInfo = fetchVPNInfo();
        if (frameLayoutFetchVPNInfo == null) {
            return;
        }
        frameLayoutFetchVPNInfo.setVisibility(z ? 0 : 8);
        if (z) {
            C55173xeu c55173xeuIsConnected = isConnected();
            java.lang.String string = getString(qZH.PendingIntent.DsL);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeuIsConnected.setTitle(string);
            isConnected().setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(qZH.PendingIntent.djSkpj));
            C55173xeu c55173xeuIsConnected2 = isConnected();
            java.lang.String string2 = getString(qZH.PendingIntent.fetchVPNInfo);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            c55173xeuIsConnected2.setRetry(string2);
            isConnected().setRetryClickListener(new View.OnClickListener() { // from class: o.kKH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    kKI.AEQbTJ(frameLayoutFetchVPNInfo, this, view);
                }
            });
            isConnected().setEmptyTypeImage(8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            layoutParams.topMargin = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
            layoutParams.bottomMargin = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
            isConnected().setLayoutParams(layoutParams);
            if (isConnected().getParent() != null) {
                android.view.ViewParent parent = isConnected().getParent();
                Intrinsics.copydefault(parent, "");
                ((android.view.ViewGroup) parent).removeView(isConnected());
            }
            frameLayoutFetchVPNInfo.addView(isConnected());
            return;
        }
        frameLayoutFetchVPNInfo.removeAllViews();
    }

    public static final void AEQbTJ(android.widget.FrameLayout frameLayout, kKI kki, android.view.View view) {
        frameLayout.setVisibility(8);
        kki.AuCTel = true;
        kki.AEQbTJ(true);
        kki.KWHzl(true);
    }

    public final void EZpvd(boolean z) {
        if (this.gEmmrt) {
            this.gEmmrt = false;
            pUU.EZpvd(getTAG(), "updateLoadState() called with: success = " + z);
            AbstractC42536rWm.addMarker$default(getOkQPL(), QPLType.LIFE_CYCLE, z ? QPLMarker.PAGE_LOADED : QPLMarker.PAGE_NOT_LOADED, getTAG(), 0L, 8, null);
        }
    }

    public final void AEQbTJ(boolean z) {
        android.view.View view;
        android.view.ViewGroup viewGroup;
        if (!this.AuCTel || (view = getView()) == null || (viewGroup = (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.DbNXlk)) == null) {
            return;
        }
        if (z) {
            pXA.KWHzl(viewGroup);
        } else {
            this.AuCTel = false;
            C57600ylV.AEQbTJ(viewGroup);
        }
    }

    public final void values() {
        DbNXlk();
    }

    public final void KWHzl(@NotNull android.view.View view, @NotNull Function0<Unit> function0) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.iwGUEr = new WeakReference<>(view);
        this.uzCIH = function0;
        try {
            Result.Application application = Result.Companion;
            getNewProxyInstance();
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
    }

    public final void getNewProxyInstance() {
        if (this.fetchVPNInfo) {
            return;
        }
        if (isResumed() || getContext() == null) {
            this.fetchVPNInfo = true;
            boolean z = SPUtils.getBoolean("market.group.watchlist.guiding.showed", false);
            android.view.View view = this.AhwBna;
            WeakReference<android.view.View> weakReference = this.iwGUEr;
            android.view.View view2 = weakReference != null ? weakReference.get() : null;
            if (z || view2 == null || view == null) {
                Function0<Unit> function0 = this.uzCIH;
                if (function0 != null) {
                    function0.invoke();
                }
                this.uzCIH = null;
                return;
            }
            C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(view);
            stateListAnimator.EZpvd(2);
            stateListAnimator.copydefault(AYXKKw());
            stateListAnimator.AEQbTJ(AYXKKw());
            stateListAnimator.KWHzl(AYXKKw());
            stateListAnimator.OLrzqt(AYXKKw());
            stateListAnimator.AEQbTJ(gEmmrt());
            stateListAnimator.AEQbTJ(getString(qZH.PendingIntent.jNexW));
            stateListAnimator.OLrzqt(getString(qZH.PendingIntent.getAdvertisingId));
            C52812wZg.StateListAnimator stateListAnimator2 = new C52812wZg.StateListAnimator(view2);
            stateListAnimator2.EZpvd(3);
            stateListAnimator2.copydefault(AYXKKw());
            stateListAnimator2.AEQbTJ(AYXKKw());
            stateListAnimator2.KWHzl(AYXKKw());
            stateListAnimator2.OLrzqt(AYXKKw());
            stateListAnimator2.AEQbTJ(gEmmrt());
            stateListAnimator2.AEQbTJ(getString(qZH.PendingIntent.DzkRMH));
            stateListAnimator2.OLrzqt(getString(qZH.PendingIntent.DcMfJKsfEqpH));
            FragmentActivity activity = getActivity();
            if (activity != null) {
                this.AYXKKw = false;
                C52812wZg c52812wZg = new C52812wZg(activity);
                c52812wZg.EZpvd(yDY.AhwBna(stateListAnimator, stateListAnimator2));
                c52812wZg.OLrzqt(3);
                c52812wZg.KWHzl(new Function0() { // from class: o.kKJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return kKI.gEmmrt(this.copydefault);
                    }
                });
                c52812wZg.fARcdN();
                this.KWHzl = c52812wZg;
            }
            SPUtils.put("market.group.watchlist.guiding.showed", java.lang.Boolean.TRUE);
        }
    }

    public static final Unit gEmmrt(kKI kki) {
        Function0<Unit> function0 = kki.uzCIH;
        if (function0 != null) {
            function0.invoke();
        }
        kki.uzCIH = null;
        kki.AYXKKw = true;
        return Unit.INSTANCE;
    }

    public int AEQbTJ(@NotNull java.lang.String str) {
        java.util.List<UserGroup> listCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        kKE kke = this.fARcdN;
        if (kke != null && (listCopydefault = kke.copydefault()) != null) {
            java.util.Iterator<UserGroup> it = listCopydefault.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) it.next().getGroupName(), (java.lang.Object) str)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public static /* synthetic */ void onSetViewPagerCurrentItem$default(kKI kki, int i, boolean z, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSetViewPagerCurrentItem");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        kki.OLrzqt(i, z);
    }

    public void OLrzqt(int i, boolean z) {
        C57596ylR c57596ylR;
        qZP qzp = this.AEQbTJ;
        if (qzp == null || (c57596ylR = qzp.KWHzl) == null) {
            return;
        }
        c57596ylR.setCurrentItem(i, z);
    }

    public int fIwbmz() {
        C57596ylR c57596ylR;
        qZP qzp = this.AEQbTJ;
        if (qzp == null || (c57596ylR = qzp.KWHzl) == null) {
            return 0;
        }
        return c57596ylR.getCurrentItem();
    }

    public void AEQbTJ(int i) {
        C57596ylR c57596ylR;
        qZP qzp = this.AEQbTJ;
        if (qzp == null || (c57596ylR = qzp.KWHzl) == null) {
            return;
        }
        c57596ylR.setOffscreenPageLimit(i);
    }

    public void OLrzqt(boolean z) {
        if (z) {
            qZP qzp = this.AEQbTJ;
            if (qzp != null) {
                qzp.EZpvd.setVisibility(0);
                qzp.copydefault.setVisibility(8);
                return;
            }
            return;
        }
        qZP qzp2 = this.AEQbTJ;
        if (qzp2 != null) {
            qzp2.EZpvd.setVisibility(8);
            qzp2.copydefault.setVisibility(0);
        }
    }

    public void fARcdN() {
        android.widget.FrameLayout frameLayout;
        qZP qzp = this.AEQbTJ;
        if (qzp == null || (frameLayout = qzp.OLrzqt) == null) {
            return;
        }
        C6873aXb.EZpvd(frameLayout);
    }

    public android.widget.FrameLayout fetchVPNInfo() {
        qZP qzp = this.AEQbTJ;
        if (qzp != null) {
            return qzp.djBIcL;
        }
        return null;
    }

    public void copydefault(@NotNull java.util.List<UserGroup> list, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        kKE kke = this.fARcdN;
        if (Intrinsics.EZpvd(kke != null ? kke.copydefault() : null, list)) {
            return;
        }
        kKE kke2 = this.fARcdN;
        if (kke2 != null) {
            kke2.EZpvd(list);
        }
        kKE kke3 = this.fARcdN;
        if (kke3 != null) {
            kke3.notifyDataSetChanged();
        }
        function0.invoke();
    }

    public UserGroup OLrzqt(int i) {
        java.util.List<UserGroup> listCopydefault;
        kKE kke = this.fARcdN;
        if (kke == null || (listCopydefault = kke.copydefault()) == null) {
            return null;
        }
        return (UserGroup) CollectionsKt___CollectionsKt.AkhnZx(listCopydefault, i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SubHelper.AEQbTJ(this.DbNXlk);
    }

    public final void KWHzl(java.util.List<UserGroup> list) {
        qZP qzp;
        C57596ylR c57596ylR;
        java.lang.String str = this.hDKMBd;
        if (str != null) {
            java.util.Iterator<UserGroup> it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.EZpvd((java.lang.Object) it.next().getGroupName(), (java.lang.Object) str)) {
                    break;
                } else {
                    i++;
                }
            }
            if (C33129mqd.copydefault((java.lang.Object) java.lang.Integer.valueOf(i), (java.lang.Object) 0) && (qzp = this.AEQbTJ) != null && (c57596ylR = qzp.KWHzl) != null) {
                c57596ylR.setCurrentItem(i);
            }
            this.hDKMBd = null;
        }
        if (!list.isEmpty()) {
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new GroupWatchListFragment$executePostUpdateTabsAction$2(this, null));
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GroupWatchListFragment$executePostUpdateTabsAction$3(this, list, null), 3, null);
        android.os.Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: o.kKK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return kKI.AYXKKw(this.EZpvd);
            }
        });
    }
}
