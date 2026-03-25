package o;

import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.search.features.navigation.category.NavCategoryChooseBottomSheet$initView$2;
import com.okinc.market.search.features.navigation.category.viewmodel.NavCategoryChooseViewModel;
import com.okinc.market.search.features.navigation.root.ui.model.NavSearchMode;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.tradeapi.bean.TradeGroupData;
import com.okinc.unify_trade.biz.DexInstrument;
import kotlin.LazyThreadSafetyMode;
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
import o.C52761wXj;
import o.InterfaceC49361unB;
import o.InterfaceC49363unD;
import o.qIU;
import o.qXK;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qIU extends qIY implements InterfaceC49363unD, qPT {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int gEmmrt = 8;
    public java.util.List<kotlin.Pair<java.lang.Boolean, TradeGroupData>> AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public C42928rff AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public final /* synthetic */ C40257qPd djBIcL = new C40257qPd();
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.djBIcL.AEQbTJ(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void AEQbTJ(boolean z) {
        this.djBIcL.AEQbTJ(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL.AYXKKw(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL.AhwBna(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void AkhnZx(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL.AkhnZx(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void DbNXlk(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL.DbNXlk(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.djBIcL.EZpvd(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void KWHzl(@NotNull android.view.View view, @NotNull C48915ueg c48915ueg, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c48915ueg, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.djBIcL.KWHzl(view, c48915ueg, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void KWHzl(@NotNull NavSearchMode navSearchMode) {
        Intrinsics.checkNotNullParameter(navSearchMode, "");
        this.djBIcL.KWHzl(navSearchMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.djBIcL.KWHzl(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.djBIcL.KWHzl(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void KWHzl(@NotNull C48915ueg c48915ueg, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c48915ueg, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL.KWHzl(c48915ueg, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void OLrzqt(@NotNull android.view.View view, @NotNull DexInstrument dexInstrument, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.djBIcL.OLrzqt(view, dexInstrument, str, str2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void OLrzqt(android.view.View view, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.djBIcL.OLrzqt(view, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void OLrzqt(@NotNull DexInstrument dexInstrument) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        this.djBIcL.OLrzqt(dexInstrument);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void copydefault(@NotNull android.view.View view, @NotNull DexInstrument dexInstrument) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        this.djBIcL.copydefault(view, dexInstrument);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void copydefault(@NotNull android.view.View view, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL.copydefault(view, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void copydefault(@NotNull SortBy sortBy, @NotNull SortOrder sortOrder) {
        Intrinsics.checkNotNullParameter(sortBy, "");
        Intrinsics.checkNotNullParameter(sortOrder, "");
        this.djBIcL.copydefault(sortBy, sortOrder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL.copydefault(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.djBIcL.copydefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void djBIcL(java.lang.String str) {
        this.djBIcL.djBIcL(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void fJNWhG() {
        this.djBIcL.fJNWhG();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void fetchVPNInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL.fetchVPNInfo(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL.gEmmrt(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void getFieldNames() {
        this.djBIcL.getFieldNames();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void hDKMBd() {
        this.djBIcL.hDKMBd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void isConnected(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL.isConnected(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void iwGUEr() {
        this.djBIcL.iwGUEr();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPT
    public void values(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL.values(str);
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

    public qIU() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.market.search.features.navigation.category.NavCategoryChooseBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.search.features.navigation.category.NavCategoryChooseBottomSheet$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(NavCategoryChooseViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.search.features.navigation.category.NavCategoryChooseBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.search.features.navigation.category.NavCategoryChooseBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.search.features.navigation.category.NavCategoryChooseBottomSheet$special$$inlined$viewModels$default$5
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
        this.AYXKKw = yDY.AhwBna();
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.qJb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qIU.gEmmrt(this.AEQbTJ);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.qJc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qIU.valueOf(this.AEQbTJ);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.qJd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(qIU.djBIcL(this.copydefault));
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.qIY.EZpvd()V */
    public final NavCategoryChooseViewModel EZpvd() {
        return (NavCategoryChooseViewModel) this.isConnected.getValue();
    }

    public final TradeGroupData djBIcL() {
        return (TradeGroupData) this.DbNXlk.getValue();
    }

    public static final TradeGroupData gEmmrt(qIU qiu) {
        android.os.Bundle arguments = qiu.getArguments();
        TradeGroupData tradeGroupData = arguments != null ? (TradeGroupData) arguments.getParcelable("data") : null;
        if (tradeGroupData instanceof TradeGroupData) {
            return tradeGroupData;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String AhwBna() {
        return (java.lang.String) this.AhwBna.getValue();
    }

    public static final java.lang.String valueOf(qIU qiu) {
        java.lang.String string;
        android.os.Bundle arguments = qiu.getArguments();
        return (arguments == null || (string = arguments.getString("from", "market_page")) == null) ? "market_page" : string;
    }

    public final boolean gEmmrt() {
        return ((java.lang.Boolean) this.valueOf.getValue()).booleanValue();
    }

    public static final boolean djBIcL(qIU qiu) {
        android.os.Bundle arguments = qiu.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("is_support_stock_biz", false);
        }
        return false;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qIU.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ void show$default(StateListAnimator stateListAnimator, androidx.fragment.app.FragmentManager fragmentManager, TradeGroupData tradeGroupData, java.lang.String str, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                bool = java.lang.Boolean.FALSE;
            }
            stateListAnimator.EZpvd(fragmentManager, tradeGroupData, str, bool);
        }

        public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, TradeGroupData tradeGroupData, @NotNull java.lang.String str, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(str, "");
            qIU qiu = new qIU();
            qiu.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("data", tradeGroupData), C56390yDp.OLrzqt("from", str), C56390yDp.OLrzqt("is_support_stock_biz", bool)));
            qiu.show(fragmentManager, "NavMarketModuleChooseFragment");
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AkhnZx = C42928rff.OLrzqt(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
        AYXKKw();
        qPT qptCopydefault = qPU.copydefault(this);
        if (qptCopydefault != null) {
            qptCopydefault.gEmmrt(AhwBna());
        }
    }

    public final void AYXKKw() {
        C42928rff c42928rff = this.AkhnZx;
        if (c42928rff == null) {
            Intrinsics.gEmmrt("");
            c42928rff = null;
        }
        C41396qpy.onTextChanged$default(c42928rff.KWHzl.KWHzl(), LifecycleOwnerKt.getLifecycleScope(this), 0L, false, new Function1() { // from class: o.qIW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qIU.AEQbTJ(this.EZpvd, (java.lang.String) obj);
            }
        }, 2, null);
        c42928rff.KWHzl.KWHzl().setInputType(1);
        c42928rff.KWHzl.KWHzl().setImeOptions(3);
        c42928rff.KWHzl.KWHzl().setSingleLine(true);
        c42928rff.KWHzl.KWHzl().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(50)});
        c42928rff.KWHzl.KWHzl().setEllipsize(TextUtils.TruncateAt.END);
        c42928rff.KWHzl.KWHzl().setImeActionLabel(C33070mpX.AYXKKw(qZH.PendingIntent.zuBGHE), 3);
        c42928rff.KWHzl.KWHzl().setHint(C33070mpX.AYXKKw(qZH.PendingIntent.fJNWhG));
        c42928rff.copydefault.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        c42928rff.copydefault.setHasFixedSize(true);
        c42928rff.copydefault.setAdapter(new TaskDescription(this, new Function1() { // from class: o.qIV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qIU.copydefault(this.KWHzl, (TradeGroupData) obj);
            }
        }));
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, EZpvd(), null, new NavCategoryChooseBottomSheet$initView$2(this, null), 1, null);
        EZpvd().EZpvd(djBIcL(), "");
    }

    public static final Unit AEQbTJ(qIU qiu, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        qiu.EZpvd().EZpvd(qiu.djBIcL(), C33129mqd.gEmmrt(str));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(qIU qiu, TradeGroupData tradeGroupData) {
        Intrinsics.checkNotNullParameter(tradeGroupData, "");
        FragmentKt.setFragmentResult(qiu, "request_click_item", BundleKt.bundleOf(C56390yDp.OLrzqt("data", tradeGroupData)));
        qiu.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public final void KWHzl(boolean z) {
        C42928rff c42928rff = this.AkhnZx;
        if (c42928rff == null) {
            Intrinsics.gEmmrt("");
            c42928rff = null;
        }
        C40369qTh c40369qTh = c42928rff.AEQbTJ;
        if (z) {
            qXK.StateListAnimator.showEmptyState$default(c40369qTh, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, (Function0) null, 31, (java.lang.Object) null);
        } else {
            c40369qTh.values();
        }
    }

    public final class Application extends DiffUtil.ItemCallback<kotlin.Pair<? extends java.lang.Boolean, ? extends TradeGroupData>> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull kotlin.Pair<java.lang.Boolean, TradeGroupData> pair, @NotNull kotlin.Pair<java.lang.Boolean, TradeGroupData> pair2) {
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(pair2, "");
            return Intrinsics.EZpvd((java.lang.Object) pair.getSecond().getId(), (java.lang.Object) pair2.getSecond().getId());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull kotlin.Pair<java.lang.Boolean, TradeGroupData> pair, @NotNull kotlin.Pair<java.lang.Boolean, TradeGroupData> pair2) {
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(pair2, "");
            return Intrinsics.EZpvd(pair, pair2);
        }
    }

    public final class TaskDescription extends androidx.recyclerview.widget.ListAdapter<kotlin.Pair<? extends java.lang.Boolean, ? extends TradeGroupData>, kFS> {
        public final /* synthetic */ qIU EZpvd;
        public final Function1<TradeGroupData, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.tradeapi.bean.TradeGroupData, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull qIU qiu, Function1<? super TradeGroupData, Unit> function1) {
            super(qiu.new Application());
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = qiu;
            this.copydefault = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public kFS onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(qZH.ActionBar.jNexW, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new kFS(viewInflate);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<kotlin.Pair<java.lang.Boolean, com.okinc.tradeapi.bean.TradeGroupData>>, java.util.List<kotlin.Pair<java.lang.Boolean, com.okinc.tradeapi.bean.TradeGroupData>>] */
        @Override // androidx.recyclerview.widget.ListAdapter
        public void onCurrentListChanged(@NotNull java.util.List<kotlin.Pair<? extends java.lang.Boolean, ? extends TradeGroupData>> list, @NotNull java.util.List<kotlin.Pair<? extends java.lang.Boolean, ? extends TradeGroupData>> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            super.onCurrentListChanged(list, list2);
            notifyDataSetChanged();
            C42928rff c42928rff = this.EZpvd.AkhnZx;
            if (c42928rff == null) {
                Intrinsics.gEmmrt("");
                c42928rff = null;
            }
            c42928rff.copydefault.requestLayout();
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull kFS kfs, int i) {
            Intrinsics.checkNotNullParameter(kfs, "");
            final kotlin.Pair<? extends java.lang.Boolean, ? extends TradeGroupData> item = getItem(i);
            android.widget.TextView textViewAEQbTJ = kfs.AEQbTJ();
            if (textViewAEQbTJ != null) {
                textViewAEQbTJ.setText(item.getSecond().getName());
            }
            android.view.View view = kfs.itemView;
            final qIU qiu = this.EZpvd;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.qJa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    qIU.TaskDescription.copydefault(this.AEQbTJ, item, qiu, view2);
                }
            });
            if (item.getFirst().booleanValue()) {
                C57682ymy c57682ymyEZpvd = kfs.EZpvd();
                if (c57682ymyEZpvd != null) {
                    c57682ymyEZpvd.setVisibility(0);
                }
                C57682ymy c57682ymyEZpvd2 = kfs.EZpvd();
                if (c57682ymyEZpvd2 != null) {
                    c57682ymyEZpvd2.setImageResource(C52761wXj.TaskDescription.fdt);
                    return;
                }
                return;
            }
            C57682ymy c57682ymyEZpvd3 = kfs.EZpvd();
            if (c57682ymyEZpvd3 != null) {
                c57682ymyEZpvd3.setVisibility(4);
            }
        }

        public static final void copydefault(TaskDescription taskDescription, kotlin.Pair pair, qIU qiu, android.view.View view) {
            taskDescription.copydefault.invoke((TradeGroupData) pair.getSecond());
            qiu.dismissAllowingStateLoss();
            qPT qptCopydefault = qPU.copydefault(qiu);
            if (qptCopydefault != null) {
                java.lang.String strAhwBna = qiu.AhwBna();
                java.lang.String type = ((TradeGroupData) pair.getSecond()).getType();
                C42928rff c42928rff = qiu.AkhnZx;
                if (c42928rff == null) {
                    Intrinsics.gEmmrt("");
                    c42928rff = null;
                }
                qptCopydefault.KWHzl(strAhwBna, type, C33129mqd.gEmmrt(c42928rff.KWHzl.AhwBna()));
            }
        }
    }
}
