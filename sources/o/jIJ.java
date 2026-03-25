package o;

import android.graphics.Bitmap;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewbinding.ViewBinding;
import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import com.okinc.business.market.features.analysis.futures.root.widget.GradientColorSpan;
import com.okinc.core.ktx.MatchPattern;
import com.okinc.im.bean.IMMessageShareModel;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.okuser.data.UserProfile;
import com.okinc.share.bean.image.ImageCustomPreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.platforms.SharePlatform;
import com.okinc.share.view.FootViewTheme;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.unify_trade.biz.UserTradeConfigInfo;
import java.util.Date;
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
import o.InterfaceC48893ueK;
import o.InterfaceC49363unD;
import o.InterfaceC8101awQ;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public abstract class jIJ<T extends ViewBinding> extends AbstractC48902ueT<ImageCustomPreviewConfig> implements InterfaceC49363unD {
    public static final int EMPTY_TYPE_ONE = 1;
    public static final int EMPTY_TYPE_TWO = 2;
    public static final java.lang.String FUTURES_ANALYSIS_BIZ_NAME = "okmarket_futures_analysis";
    private static final int ROLE_TYPE_TRADER = 1;
    private T contentBinding;
    private final boolean isVip;
    private C42779rcp rootBinding;
    private final InterfaceC56387yDm viewModel$delegate;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;
    private static final int[] vipColors = {C33070mpX.copydefault(qZH.TaskDescription.EZpvd), C33070mpX.copydefault(qZH.TaskDescription.copydefault)};
    private final int layoutId = qZH.ActionBar.DrqXHJ;
    private final InterfaceC56387yDm mWatermarkMenuItem$delegate = C56392yDr.copydefault(new Function0() { // from class: o.jIH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return jIJ.mWatermarkMenuItem_delegate$lambda$4();
        }
    });
    private final InterfaceC56387yDm mUsernameMenuItem$delegate = C56392yDr.copydefault(new Function0() { // from class: o.jIF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return jIJ.mUsernameMenuItem_delegate$lambda$6(this.KWHzl);
        }
    });

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SharePlatform.values().length];
            try {
                iArr[SharePlatform.SHARE_TO_IM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            EZpvd = iArr;
        }
    }

    public static final class StateListAnimator extends C48900ueR {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C48900ueR, o.InterfaceC48898ueP
        public boolean AEQbTJ(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.layoutId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isVip() {
        return this.isVip;
    }

    public abstract T onBindContent(@NotNull android.view.ViewGroup viewGroup);

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

    public <T extends InterfaceC49369unJ<T>> java.lang.Object getUiState(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Continuation<? super T> continuation) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, continuation);
    }

    public <T extends InterfaceC49369unJ<T>, A> java.lang.Object getUiState(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Continuation<? super A> continuation) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, continuation);
    }

    public <T extends InterfaceC49369unJ<T>, A, B> java.lang.Object getUiState(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Continuation<? super kotlin.Pair<? extends A, ? extends B>> continuation) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, continuation);
    }

    public <T extends InterfaceC49369unJ<T>, A, B, C> java.lang.Object getUiState(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Continuation<? super Triple<? extends A, ? extends B, ? extends C>> continuation) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, continuation);
    }

    public <T extends InterfaceC49369unJ<T>, A, B, C, D> java.lang.Object getUiState(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Continuation<? super Quartet<? extends A, ? extends B, ? extends C, ? extends D>> continuation) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, continuation);
    }

    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E> java.lang.Object getUiState(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Continuation<? super Quintet<? extends A, ? extends B, ? extends C, ? extends D, ? extends E>> continuation) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, continuation);
    }

    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> java.lang.Object getUiState(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Continuation<? super Sextet<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends F>> continuation) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, continuation);
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

    public <T extends InterfaceC49369unJ<T>, V> java.lang.Object tryGetSuccessUiState(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends InterfaceC49371unL<? extends V>> interfaceC56560yJx, @NotNull Continuation<? super V> continuation) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, continuation);
    }

    @Override // o.InterfaceC49362unC
    public <T extends InterfaceC49369unJ<T>> Flow<T> uiStateFlow(@NotNull AbstractC49411unz<T> abstractC49411unz) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz);
    }

    public <T extends InterfaceC49369unJ<T>, A> Flow<A> uiStateFlow(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx);
    }

    public <T extends InterfaceC49369unJ<T>, A, B> Flow<kotlin.Pair<A, B>> uiStateFlow(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2);
    }

    public <T extends InterfaceC49369unJ<T>, A, B, C> Flow<Triple<A, B, C>> uiStateFlow(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3);
    }

    public <T extends InterfaceC49369unJ<T>, A, B, C, D> Flow<Quartet<A, B, C, D>> uiStateFlow(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4);
    }

    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Flow<Quintet<A, B, C, D, E>> uiStateFlow(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5);
    }

    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Flow<Sextet<A, B, C, D, E, F>> uiStateFlow(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6);
    }

    public <T extends InterfaceC49369unJ<T>> java.lang.Object withUiState(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Unit> continuation) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, function2, continuation);
    }

    public <T extends InterfaceC49369unJ<T>, A> java.lang.Object withUiState(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Unit> continuation) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, function2, continuation);
    }

    public <T extends InterfaceC49369unJ<T>, A, B> java.lang.Object withUiState(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho, @NotNull Continuation<? super Unit> continuation) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, yho, continuation);
    }

    public <T extends InterfaceC49369unJ<T>, A, B, C> java.lang.Object withUiState(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht, @NotNull Continuation<? super Unit> continuation) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, yht, continuation);
    }

    public <T extends InterfaceC49369unJ<T>, A, B, C, D> java.lang.Object withUiState(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs, @NotNull Continuation<? super Unit> continuation) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, yhs, continuation);
    }

    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E> java.lang.Object withUiState(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq, @NotNull Continuation<? super Unit> continuation) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, yhq, continuation);
    }

    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> java.lang.Object withUiState(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr, @NotNull Continuation<? super Unit> continuation) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, yhr, continuation);
    }

    public jIJ() {
        final Function0 function0 = null;
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(FuturesAnalysisViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.analysis.futures.root.sharing.BaseFuturesAnalysisSharingFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.analysis.futures.root.sharing.BaseFuturesAnalysisSharingFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.analysis.futures.root.sharing.BaseFuturesAnalysisSharingFragment$special$$inlined$activityViewModels$default$3
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

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jIJ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final T getContentBinding() {
        T t = this.contentBinding;
        if (t != null) {
            return t;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final FuturesAnalysisViewModel getViewModel() {
        return (FuturesAnalysisViewModel) this.viewModel$delegate.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C42779rcp c42779rcpOLrzqt = C42779rcp.OLrzqt(view);
        this.rootBinding = c42779rcpOLrzqt;
        if (c42779rcpOLrzqt == null) {
            Intrinsics.gEmmrt("");
            c42779rcpOLrzqt = null;
        }
        ConstraintLayout constraintLayout = c42779rcpOLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        this.contentBinding = (T) onBindContent(constraintLayout);
        setOnEditMenuClickListener(new StateListAnimator());
        setupTraderView();
        notifyPreviewFirstLoaded();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setupTraderView() {
        java.lang.String strDbNXlk;
        C55697xoo c55697xoo = C55697xoo.OLrzqt;
        UserProfile userProfileFetchVPNInfo = c55697xoo.fetchVPNInfo();
        if (userProfileFetchVPNInfo != null) {
            userProfileFetchVPNInfo.getProfilePictureUrl();
        }
        if (userProfileFetchVPNInfo == null || (strDbNXlk = userProfileFetchVPNInfo.getApprovedPetname()) == null) {
            strDbNXlk = c55697xoo.DbNXlk();
        } else {
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) strDbNXlk)) {
                strDbNXlk = null;
            }
            if (strDbNXlk == null) {
            }
        }
        Date date = new Date(requireShareParams().getExtras().getLong("timestamp", java.lang.System.currentTimeMillis()));
        java.lang.String str = pTA.formatTime$default(date, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, true, 6, null) + "\n" + pTA.formatDate$default(date, OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null);
        C42779rcp c42779rcp = this.rootBinding;
        if (c42779rcp == null) {
            Intrinsics.gEmmrt("");
            c42779rcp = null;
        }
        boolean z = !getMUsernameMenuItem().isChecked();
        if (isVip()) {
            AppCompatImageView appCompatImageView = c42779rcp.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(4);
            android.widget.TextView textView = c42779rcp.isConnected;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(4);
            android.widget.LinearLayout linearLayout = c42779rcp.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(z ? 4 : 0);
            InterfaceC8101awQ interfaceC8101awQ = (InterfaceC8101awQ) C43251rlk.copydefault(InterfaceC8101awQ.class);
            AppCompatImageView appCompatImageView2 = c42779rcp.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            InterfaceC8101awQ.Activity.loadUserAvatar$default(interfaceC8101awQ, appCompatImageView2, false, null, 6, null);
            android.widget.TextView textView2 = c42779rcp.values;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            setVipName(textView2, strDbNXlk, MatchPattern.FIRST_ONLY);
            AppCompatTextView appCompatTextView = c42779rcp.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            setVipName(appCompatTextView, C33070mpX.AYXKKw(qZH.PendingIntent.onProviderEnabled), MatchPattern.LAST_ONLY);
            c42779rcp.AYXKKw.setTheme(FootViewTheme.FIXED_VIP);
        } else {
            AppCompatImageView appCompatImageView3 = c42779rcp.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
            appCompatImageView3.setVisibility(z ? 4 : 0);
            android.widget.TextView textView3 = c42779rcp.isConnected;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(z ? 4 : 0);
            android.widget.LinearLayout linearLayout2 = c42779rcp.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(4);
            InterfaceC8101awQ interfaceC8101awQ2 = (InterfaceC8101awQ) C43251rlk.copydefault(InterfaceC8101awQ.class);
            AppCompatImageView appCompatImageView4 = c42779rcp.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView4, "");
            InterfaceC8101awQ.Activity.loadUserAvatar$default(interfaceC8101awQ2, appCompatImageView4, false, null, 6, null);
            c42779rcp.isConnected.setText(strDbNXlk);
            c42779rcp.AYXKKw.setTheme(FootViewTheme.FIXED_DARK);
        }
        c42779rcp.AhwBna.setText(str);
        c42779rcp.AYXKKw.AhwBna().setIcon(null);
    }

    public final void setVipName(android.widget.TextView textView, final java.lang.String str, MatchPattern matchPattern) {
        textView.setText(C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{str}, 0, matchPattern, false, new Function1() { // from class: o.jII
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jIJ.setVipName$lambda$3(str, (java.util.List) obj);
            }
        }, 10, null));
    }

    public static final Unit setVipName$lambda$3(java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new GradientColorSpan(vipColors, str, null, 4, null));
        return Unit.INSTANCE;
    }

    public final boolean isShowTraderTag() {
        UserTradeConfigInfo userTradeConfigInfoGHZMYf;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (userTradeConfigInfoGHZMYf = interfaceC54581xNrOLrzqt.gHZMYf()) == null || userTradeConfigInfoGHZMYf.getRoleType() != 1) ? false : true;
    }

    public final InterfaceC48901ueS getMWatermarkMenuItem() {
        return (InterfaceC48901ueS) this.mWatermarkMenuItem$delegate.getValue();
    }

    public static final InterfaceC48901ueS mWatermarkMenuItem_delegate$lambda$4() {
        return InterfaceC48893ueK.Application.createWatermarkEditMenuItem$default((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class), null, null, null, null, false, 15, null);
    }

    public final jIL getMUsernameMenuItem() {
        return (jIL) this.mUsernameMenuItem$delegate.getValue();
    }

    public static final jIL mUsernameMenuItem_delegate$lambda$6(final jIJ jij) {
        return new jIL(true, new Function1() { // from class: o.jIN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jIJ.mUsernameMenuItem_delegate$lambda$6$lambda$5(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit mUsernameMenuItem_delegate$lambda$6$lambda$5(jIJ jij, boolean z) {
        C42779rcp c42779rcp = jij.rootBinding;
        C42779rcp c42779rcp2 = null;
        if (c42779rcp == null) {
            Intrinsics.gEmmrt("");
            c42779rcp = null;
        }
        AppCompatImageView appCompatImageView = c42779rcp.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        int i = 4;
        appCompatImageView.setVisibility((jij.isVip() || !z) ? 4 : 0);
        C42779rcp c42779rcp3 = jij.rootBinding;
        if (c42779rcp3 == null) {
            Intrinsics.gEmmrt("");
            c42779rcp3 = null;
        }
        android.widget.TextView textView = c42779rcp3.isConnected;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility((jij.isVip() || !z) ? 4 : 0);
        C42779rcp c42779rcp4 = jij.rootBinding;
        if (c42779rcp4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c42779rcp2 = c42779rcp4;
        }
        android.widget.LinearLayout linearLayout = c42779rcp2.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        if (jij.isVip() && z) {
            i = 0;
        }
        linearLayout.setVisibility(i);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC48902ueT, o.AbstractC48908ueZ
    public java.util.List<InterfaceC48901ueS> provideEditMenuList() {
        return yDY.gEmmrt(getMUsernameMenuItem(), getMWatermarkMenuItem());
    }

    /* JADX DEBUG: Method merged with bridge method: onRequestPendingShareParams(Lcom/okinc/share/platforms/SharePlatform;)Lcom/okinc/share/api/params/IShareParams; */
    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    public ImageShareParams onRequestPendingShareParams(@NotNull SharePlatform sharePlatform) {
        java.lang.String absolutePath;
        java.io.File fileSavePendingShareBitmapFile;
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        ImageShareParams imageShareParams = (ImageShareParams) super.onRequestPendingShareParams(sharePlatform);
        if (Activity.EZpvd[sharePlatform.ordinal()] == 1) {
            android.graphics.Bitmap bitmapGenerateShareBitmap = generateShareBitmap();
            imageShareParams.getExtras().putBoolean("isEnableIMShare", true);
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.RlQdEF);
            IMMessageShareModel.CTAType cTAType = IMMessageShareModel.CTAType.NoCTA;
            if (bitmapGenerateShareBitmap != null) {
                java.io.File fileSavePendingShareBitmapFile2 = savePendingShareBitmapFile(bitmapGenerateShareBitmap);
                absolutePath = fileSavePendingShareBitmapFile2 != null ? fileSavePendingShareBitmapFile2.getAbsolutePath() : null;
            } else {
                absolutePath = null;
            }
            IMMessageShareModel iMMessageShareModel = new IMMessageShareModel((java.lang.String) null, (java.lang.String) null, strAYXKKw, absolutePath, (java.lang.String) null, "", (java.lang.String) null, (java.lang.String) null, cTAType, (java.util.Map) null, FUTURES_ANALYSIS_BIZ_NAME, 723, (DefaultConstructorMarker) null);
            imageShareParams.setPendingShareImagePath((bitmapGenerateShareBitmap == null || (fileSavePendingShareBitmapFile = savePendingShareBitmapFile(bitmapGenerateShareBitmap)) == null) ? null : fileSavePendingShareBitmapFile.getAbsolutePath());
            imageShareParams.getExtras().putParcelable("imMessageShare", iMMessageShareModel);
        } else {
            java.lang.String strBuildCompositePreviewImagePath = buildCompositePreviewImagePath();
            if (strBuildCompositePreviewImagePath == null) {
                strBuildCompositePreviewImagePath = imageShareParams.getPendingShareImagePath();
            }
            imageShareParams.setPendingShareImagePath(strBuildCompositePreviewImagePath);
        }
        return imageShareParams;
    }

    @Override // o.AbstractC48908ueZ
    public android.graphics.Rect getPreviewBounds() {
        android.graphics.Rect rect = new android.graphics.Rect();
        getPreviewContainer().getDrawingRect(rect);
        rect.offsetTo(0, 0);
        return rect;
    }

    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    public android.graphics.Rect getImageBounds() {
        return getPreviewBounds();
    }

    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    public android.view.ViewGroup getPreviewContainer() {
        C42779rcp c42779rcp = this.rootBinding;
        if (c42779rcp == null) {
            Intrinsics.gEmmrt("");
            c42779rcp = null;
        }
        ConstraintLayout constraintLayout = c42779rcp.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        return constraintLayout;
    }

    public final android.graphics.Bitmap generateShareBitmap() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(C55298xhM.dp2px$default(375.0f, null, 1, null), C55298xhM.dp2px$default(560.0f, null, 1, null), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
            C42779rcp c42779rcp = this.rootBinding;
            if (c42779rcp == null) {
                Intrinsics.gEmmrt("");
                c42779rcp = null;
            }
            c42779rcp.AEQbTJ.draw(canvas);
            android.graphics.Bitmap bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), C56548yJl.valueOf(C55298xhM.dp2px$default(458.0f, null, 1, null), bitmapCreateBitmap.getHeight()));
            bitmapCreateBitmap.recycle();
            objM7377constructorimpl = Result.m7377constructorimpl(bitmapCreateBitmap2);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("ShareBitmap", "Futures Analysis Failed to create bitmap", thM7380exceptionOrNullimpl);
        }
        return (android.graphics.Bitmap) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public static /* synthetic */ void showEmpty$default(jIJ jij, boolean z, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showEmpty");
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        jij.showEmpty(z, i);
    }

    public final void showEmpty(boolean z, int i) {
        C42779rcp c42779rcp = null;
        if (z) {
            C42779rcp c42779rcp2 = this.rootBinding;
            if (c42779rcp2 == null) {
                Intrinsics.gEmmrt("");
                c42779rcp2 = null;
            }
            Group group = c42779rcp2.EZpvd;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(0);
            C42779rcp c42779rcp3 = this.rootBinding;
            if (c42779rcp3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c42779rcp = c42779rcp3;
            }
            c42779rcp.copydefault.setImageResource(i == 1 ? qZH.Activity.getFieldNames : qZH.Activity.hDKMBd);
            return;
        }
        C42779rcp c42779rcp4 = this.rootBinding;
        if (c42779rcp4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c42779rcp = c42779rcp4;
        }
        Group group2 = c42779rcp.EZpvd;
        Intrinsics.checkNotNullExpressionValue(group2, "");
        group2.setVisibility(8);
    }
}
