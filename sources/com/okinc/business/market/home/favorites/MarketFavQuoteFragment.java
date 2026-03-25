package com.okinc.business.market.home.favorites;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
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
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.account.api.model.login.LoginRoute;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.bean.TokenInfoForAlert;
import com.okinc.business.market.home.favorites.MarketFavQuoteFragment;
import com.okinc.business.market.home.favorites.viewmodel.MarketFavChildViewModel;
import com.okinc.business.market.market.dialog.MarketToolDialog;
import com.okinc.business.market.utils.MarketHomeTabType;
import com.okinc.market.alert.database.MarketAlertDataBase;
import com.okinc.market.watch.data.UserGroup;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import com.okinc.okmarket.app.callauction.ws.data.model.CallAuctionData;
import com.okinc.okmarket.ui.market.data.UserGroupVo;
import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import com.okinc.rxutils.RxBus;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.unify_trade.biz.DexInstrument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC27810kEd;
import o.AbstractC42536rWm;
import o.AbstractC49411unz;
import o.AbstractC58185ywX;
import o.ActivityC46706tcI;
import o.ActivityC46751tdA;
import o.C27807kEa;
import o.C27811kEe;
import o.C27831kEy;
import o.C27858kFy;
import o.C27984kKp;
import o.C27994kKz;
import o.C33062mpP;
import o.C33070mpX;
import o.C33129mqd;
import o.C38383pWt;
import o.C38384pWu;
import o.C41421qqW;
import o.C42654raW;
import o.C43251rlk;
import o.C46688tbr;
import o.C46796tdt;
import o.C46802tdz;
import o.C52761wXj;
import o.C52794wYp;
import o.C55113xdn;
import o.C55173xeu;
import o.C55298xhM;
import o.C55608xnE;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C56524yIo;
import o.C58156yvv;
import o.C59534zip;
import o.C6814aWV;
import o.InterfaceC27808kEb;
import o.InterfaceC27809kEc;
import o.InterfaceC33171mrS;
import o.InterfaceC46790tdn;
import o.InterfaceC49361unB;
import o.InterfaceC49363unD;
import o.InterfaceC49369unJ;
import o.InterfaceC49371unL;
import o.InterfaceC56387yDm;
import o.InterfaceC56551yJo;
import o.InterfaceC56560yJx;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC8104awT;
import o.kDL;
import o.kEO;
import o.pUU;
import o.pXA;
import o.qTA;
import o.qWH;
import o.qWK;
import o.qXB;
import o.qXK;
import o.qZH;
import o.rVN;
import o.sZQ;
import o.yCM;
import o.yHO;
import o.yHQ;
import o.yHR;
import o.yHS;
import o.yHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class MarketFavQuoteFragment extends AbstractC27810kEd implements InterfaceC49363unD, C27831kEy.Application, InterfaceC46790tdn, MarketToolDialog.TaskDescription, qXK, InterfaceC27808kEb {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int DbNXlk = 8;
    public boolean AuCTel;
    public final InterfaceC56387yDm AuCTelauCTel;
    public long AubY;
    public final InterfaceC56387yDm AwvSrB;
    public boolean ejfBZ;
    public final InterfaceC56387yDm fIwbmz;

    @yCM
    public C41421qqW formatDexVoFieldsUseCase;
    public C42654raW getFieldNames;
    public final InterfaceC56387yDm getNewProxyInstance;
    public boolean hDKMBd;
    public final int isConnected;
    public Job iwGUEr;
    public Object uzCIH;
    public List<? extends Object> values;
    public boolean wlaJM;
    public Job zLjUOn;
    public InterfaceC58217yxC zsXlph;
    public final /* synthetic */ qXB fetchVPNInfo = new qXB();
    public final /* synthetic */ kDL AkhnZx = new kDL();
    public final int fJNWhG = 7;
    public final int fARcdN = qZH.ActionBar.Dmq;

    public static final class Application extends DefaultItemAnimator {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
        public long getAddDuration() {
            return 50L;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
        public long getMoveDuration() {
            return 60L;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
        public long getRemoveDuration() {
            return 50L;
        }
    }

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MarketToolDialog.Action.values().length];
            try {
                iArr[MarketToolDialog.Action.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketToolDialog.Action.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketToolDialog.Action.ALERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MarketToolDialog.Action.EDIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.kEd.AEQbTJ()V */
    public int AEQbTJ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Object AEQbTJ(@NotNull Continuation<? super String> continuation) {
        return KWHzl(this, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void AEQbTJ(@StringRes int i, @StringRes int i2, @StringRes int i3, int i4, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.fetchVPNInfo.AEQbTJ(i, i2, i3, i4, function0);
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
        this.fetchVPNInfo.AEQbTJ(str, str2, str3, i, function0);
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
    @Override // o.qXK
    public void EZpvd(@StringRes int i, @StringRes int i2, @StringRes int i3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.fetchVPNInfo.EZpvd(i, i2, i3, function0);
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
    public void KWHzl(C55173xeu c55173xeu, C55113xdn c55113xdn, @NotNull View... viewArr) {
        Intrinsics.checkNotNullParameter(viewArr, "");
        this.fetchVPNInfo.KWHzl(c55173xeu, c55113xdn, viewArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Bundle OLrzqt(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt() {
        this.AkhnZx.OLrzqt();
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
    @Override // o.InterfaceC27808kEb
    public void OLrzqt(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx.OLrzqt(str, str2);
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
        this.fetchVPNInfo.copydefault(j);
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
        this.fetchVPNInfo.copydefault(str, str2, str3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int gEmmrt() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void getFieldNames() {
        this.fetchVPNInfo.copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.fARcdN;
    }

    public <T extends InterfaceC49369unJ<T>> Object EZpvd(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Continuation<? super T> continuation) {
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

    public MarketFavQuoteFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.business.market.home.favorites.MarketFavQuoteFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.home.favorites.MarketFavQuoteFragment$special$$inlined$viewModels$default$2
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
        this.AwvSrB = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketFavChildViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.home.favorites.MarketFavQuoteFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.home.favorites.MarketFavQuoteFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.home.favorites.MarketFavQuoteFragment$special$$inlined$viewModels$default$5
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
        this.isConnected = 7;
        final Function0 function03 = new Function0() { // from class: o.kEl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketFavQuoteFragment.isConnected(this.KWHzl);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.home.favorites.MarketFavQuoteFragment$special$$inlined$viewModels$default$6
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
        this.fIwbmz = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketHomeV2ViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.home.favorites.MarketFavQuoteFragment$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.home.favorites.MarketFavQuoteFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.home.favorites.MarketFavQuoteFragment$special$$inlined$viewModels$default$9
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
        this.AubY = -1L;
        this.getNewProxyInstance = C56392yDr.copydefault(new Function0() { // from class: o.kEq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketFavQuoteFragment.AkhnZx(this.AEQbTJ);
            }
        });
        this.ejfBZ = true;
        this.hDKMBd = true;
        this.AuCTelauCTel = C56392yDr.copydefault(new Function0() { // from class: o.kEt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketFavQuoteFragment.AkhnZx();
            }
        });
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.home.favorites.MarketFavQuoteFragment.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final MarketFavChildViewModel fIwbmz() {
        return (MarketFavChildViewModel) this.AwvSrB.getValue();
    }

    public static final ViewModelStoreOwner isConnected(MarketFavQuoteFragment marketFavQuoteFragment) {
        Fragment fragmentRequireParentFragment = marketFavQuoteFragment.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    public final MarketHomeV2ViewModel ejfBZ() {
        return (MarketHomeV2ViewModel) this.fIwbmz.getValue();
    }

    public final void KWHzl(boolean z) {
        if (z != this.AuCTel) {
            this.AuCTel = z;
            this.AubY = SystemClock.elapsedRealtime();
        }
    }

    public final C41421qqW values() {
        C41421qqW c41421qqW = this.formatDexVoFieldsUseCase;
        if (c41421qqW != null) {
            return c41421qqW;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public C59534zip AhwBna() {
        return (C59534zip) this.getNewProxyInstance.getValue();
    }

    public static final kEO AkhnZx(final MarketFavQuoteFragment marketFavQuoteFragment) {
        return new kEO(marketFavQuoteFragment.values(), new Function2() { // from class: o.kEi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return MarketFavQuoteFragment.KWHzl(this.AEQbTJ, (CoinQuote) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, new Function0() { // from class: o.kEj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketFavQuoteFragment.DbNXlk(this.OLrzqt);
            }
        });
    }

    public static final Unit KWHzl(MarketFavQuoteFragment marketFavQuoteFragment, CoinQuote coinQuote, int i) {
        Intrinsics.checkNotNullParameter(coinQuote, "");
        marketFavQuoteFragment.OLrzqt(i, coinQuote);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(MarketFavQuoteFragment marketFavQuoteFragment) {
        itemMoreClick$default(marketFavQuoteFragment, false, 1, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void itemMoreClick$default(MarketFavQuoteFragment marketFavQuoteFragment, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: itemMoreClick");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        marketFavQuoteFragment.copydefault(z);
    }

    public final void copydefault(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketFavQuoteFragment$itemMoreClick$1(this, z, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(Continuation<? super String> continuation) throws Throwable {
        MarketFavQuoteFragment$jumpToMarkets$1 marketFavQuoteFragment$jumpToMarkets$1;
        MarketFavQuoteFragment marketFavQuoteFragment;
        if (continuation instanceof MarketFavQuoteFragment$jumpToMarkets$1) {
            marketFavQuoteFragment$jumpToMarkets$1 = (MarketFavQuoteFragment$jumpToMarkets$1) continuation;
            int i = marketFavQuoteFragment$jumpToMarkets$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketFavQuoteFragment$jumpToMarkets$1.label = i - Integer.MIN_VALUE;
            } else {
                marketFavQuoteFragment$jumpToMarkets$1 = new MarketFavQuoteFragment$jumpToMarkets$1(this, continuation);
            }
        }
        Object objAEQbTJ = marketFavQuoteFragment$jumpToMarkets$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketFavQuoteFragment$jumpToMarkets$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            MarketHomeV2ViewModel marketHomeV2ViewModelEjfBZ = ejfBZ();
            marketFavQuoteFragment$jumpToMarkets$1.L$0 = this;
            marketFavQuoteFragment$jumpToMarkets$1.label = 1;
            objAEQbTJ = marketHomeV2ViewModelEjfBZ.AEQbTJ(marketFavQuoteFragment$jumpToMarkets$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            marketFavQuoteFragment = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            marketFavQuoteFragment = (MarketFavQuoteFragment) marketFavQuoteFragment$jumpToMarkets$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        String str = (String) objAEQbTJ;
        Context context = marketFavQuoteFragment.getContext();
        if (context != null) {
            RxBus.KWHzl(new C6814aWV("main/market/fav", BundleKt.bundleOf(C56390yDp.OLrzqt("market_key_group_watch_list_group_name", str), C56390yDp.OLrzqt("path", "main/market"))));
            sZQ.EZpvd.copydefault(context);
        }
        return str;
    }

    public final void OLrzqt(int i, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(coinQuote, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketFavQuoteFragment$itemClick$1(this, i, coinQuote, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C38383pWt valueOf() {
        return (C38383pWt) this.AuCTelauCTel.getValue();
    }

    public static final C38383pWt AkhnZx() {
        return new C38383pWt(C38384pWu.Companion.copydefault(MarketAlertDataBase.Companion.EZpvd()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C46688tbr.registerTradeFragmentTrack$default(C46688tbr.KWHzl, this, "MarketFavQuoteFragment", new Pair[0], null, 4, null);
    }

    @Override // o.AbstractC27795kDq, o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        C42654raW c42654raWKWHzl = C42654raW.KWHzl(view);
        KWHzl(c42654raWKWHzl.copydefault, (C55113xdn) null, c42654raWKWHzl.EZpvd);
        this.getFieldNames = c42654raWKWHzl;
        AuCTel();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        KWHzl(false);
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        KWHzl(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C46796tdt c46796tdt;
        C42654raW c42654raW = this.getFieldNames;
        if (c42654raW != null && (c46796tdt = c42654raW.EZpvd) != null) {
            c46796tdt.setAdapter(null);
        }
        this.getFieldNames = null;
        super.onDestroyView();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(List<? extends qWH> list, Continuation<? super Unit> continuation) throws Throwable {
        MarketFavQuoteFragment$updateUIList$1 marketFavQuoteFragment$updateUIList$1;
        List<? extends qWH> list2;
        MarketFavQuoteFragment marketFavQuoteFragment;
        MarketFavQuoteFragment marketFavQuoteFragment2;
        if (continuation instanceof MarketFavQuoteFragment$updateUIList$1) {
            marketFavQuoteFragment$updateUIList$1 = (MarketFavQuoteFragment$updateUIList$1) continuation;
            int i = marketFavQuoteFragment$updateUIList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketFavQuoteFragment$updateUIList$1.label = i - Integer.MIN_VALUE;
            } else {
                marketFavQuoteFragment$updateUIList$1 = new MarketFavQuoteFragment$updateUIList$1(this, continuation);
            }
        }
        Object obj = marketFavQuoteFragment$updateUIList$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketFavQuoteFragment$updateUIList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.AuCTel) {
                pUU.KWHzl(getTAG(), "start set adapter data ");
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.AubY;
                if (jElapsedRealtime < 500) {
                    long jMax = Math.max(jElapsedRealtime, 0L);
                    marketFavQuoteFragment$updateUIList$1.L$0 = this;
                    marketFavQuoteFragment$updateUIList$1.L$1 = list;
                    marketFavQuoteFragment$updateUIList$1.label = 1;
                    if (DelayKt.delay(((long) 500) - jMax, marketFavQuoteFragment$updateUIList$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    marketFavQuoteFragment2 = this;
                } else {
                    list2 = list;
                    marketFavQuoteFragment = this;
                    marketFavQuoteFragment$updateUIList$1.L$0 = marketFavQuoteFragment;
                    marketFavQuoteFragment$updateUIList$1.L$1 = null;
                    marketFavQuoteFragment$updateUIList$1.label = 2;
                    if (marketFavQuoteFragment.copydefault(list2, marketFavQuoteFragment$updateUIList$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    if (!marketFavQuoteFragment.KWHzl()) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            marketFavQuoteFragment = (MarketFavQuoteFragment) marketFavQuoteFragment$updateUIList$1.L$0;
            C56391yDq.AEQbTJ(obj);
            if (!marketFavQuoteFragment.KWHzl()) {
                pUU.KWHzl(marketFavQuoteFragment.getTAG(), "start report grafana");
                marketFavQuoteFragment.AEQbTJ(marketFavQuoteFragment.getView(), MarketHomeTabType.FAVORITE);
            }
            return Unit.INSTANCE;
        }
        list = (List) marketFavQuoteFragment$updateUIList$1.L$1;
        marketFavQuoteFragment2 = (MarketFavQuoteFragment) marketFavQuoteFragment$updateUIList$1.L$0;
        C56391yDq.AEQbTJ(obj);
        list2 = list;
        marketFavQuoteFragment = marketFavQuoteFragment2;
        marketFavQuoteFragment$updateUIList$1.L$0 = marketFavQuoteFragment;
        marketFavQuoteFragment$updateUIList$1.L$1 = null;
        marketFavQuoteFragment$updateUIList$1.label = 2;
        if (marketFavQuoteFragment.copydefault(list2, marketFavQuoteFragment$updateUIList$1) == objCopydefault) {
        }
        if (!marketFavQuoteFragment.KWHzl()) {
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC46790tdn
    public void EZpvd(int i, Object obj) {
        getTAG();
        KWHzl(true);
        if ((obj instanceof CoinQuote) || (obj instanceof qWK)) {
            this.uzCIH = obj;
        }
    }

    @Override // o.InterfaceC46790tdn
    public void AEQbTJ(List<?> list, boolean z) {
        InterfaceC46790tdn.StateListAnimator.AEQbTJ(this, list, z);
        getTAG();
        if (z && this.wlaJM) {
            getTAG();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain().getImmediate(), null, new MarketFavQuoteFragment$onUserActionEnd$1(list, this, null), 2, null);
        } else {
            KWHzl(false);
        }
        this.wlaJM = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(List<? extends qWH> list, Continuation<? super Unit> continuation) throws Throwable {
        MarketFavQuoteFragment$updateContentView$1 marketFavQuoteFragment$updateContentView$1;
        ArrayList<Object> arrayList;
        C27984kKp c27984kKp;
        MarketFavQuoteFragment marketFavQuoteFragment;
        if (continuation instanceof MarketFavQuoteFragment$updateContentView$1) {
            marketFavQuoteFragment$updateContentView$1 = (MarketFavQuoteFragment$updateContentView$1) continuation;
            int i = marketFavQuoteFragment$updateContentView$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketFavQuoteFragment$updateContentView$1.label = i - Integer.MIN_VALUE;
            } else {
                marketFavQuoteFragment$updateContentView$1 = new MarketFavQuoteFragment$updateContentView$1(this, continuation);
            }
        }
        Object objEZpvd = marketFavQuoteFragment$updateContentView$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketFavQuoteFragment$updateContentView$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            pUU.KWHzl(getTAG(), "updateContentView() called with: newData = " + list.size());
            arrayList = new ArrayList<>();
            this.values = C27994kKz.KWHzl.AEQbTJ(list);
            AEQbTJ(list, arrayList);
            OLrzqt(arrayList);
            c27984kKp = C27984kKp.copydefault;
            MarketHomeV2ViewModel marketHomeV2ViewModelEjfBZ = ejfBZ();
            marketFavQuoteFragment$updateContentView$1.L$0 = this;
            marketFavQuoteFragment$updateContentView$1.L$1 = arrayList;
            marketFavQuoteFragment$updateContentView$1.L$2 = c27984kKp;
            marketFavQuoteFragment$updateContentView$1.label = 1;
            objEZpvd = EZpvd(marketHomeV2ViewModelEjfBZ, marketFavQuoteFragment$updateContentView$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            marketFavQuoteFragment = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
                return Unit.INSTANCE;
            }
            c27984kKp = (C27984kKp) marketFavQuoteFragment$updateContentView$1.L$2;
            arrayList = (ArrayList) marketFavQuoteFragment$updateContentView$1.L$1;
            marketFavQuoteFragment = (MarketFavQuoteFragment) marketFavQuoteFragment$updateContentView$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        UserGroupVo userGroupVoOLrzqt = ((MarketHomeV2ViewModel.ActionBar) objEZpvd).OLrzqt();
        c27984kKp.copydefault(userGroupVoOLrzqt != null ? userGroupVoOLrzqt.getUserGroup() : null);
        marketFavQuoteFragment$updateContentView$1.L$0 = null;
        marketFavQuoteFragment$updateContentView$1.L$1 = null;
        marketFavQuoteFragment$updateContentView$1.L$2 = null;
        marketFavQuoteFragment$updateContentView$1.label = 2;
        if (marketFavQuoteFragment.copydefault(arrayList, (Continuation<? super Unit>) marketFavQuoteFragment$updateContentView$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(ArrayList<Object> arrayList) {
        AhwBna().setItems(arrayList);
        AhwBna().notifyDataSetChanged();
    }

    public final Triple<String, String, String> fARcdN() {
        Object obj = this.uzCIH;
        if (obj == null) {
            return new Triple<>("", "", "");
        }
        if (obj instanceof CoinQuote) {
            Intrinsics.copydefault(obj, "");
            String instId = ((CoinQuote) obj).getInstId();
            Object obj2 = this.uzCIH;
            Intrinsics.copydefault(obj2, "");
            return new Triple<>(instId, ((CoinQuote) obj2).getInstType(), "");
        }
        if (obj instanceof qWK) {
            Intrinsics.copydefault(obj, "");
            String tokenSymbol = ((qWK) obj).copydefault().getTokenSymbol();
            String lowerCase = "CEDEFI".toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            return new Triple<>(tokenSymbol, lowerCase, "");
        }
        return new Triple<>("", "", "");
    }

    public void AEQbTJ(@NotNull List<? extends qWH> list, @NotNull ArrayList<Object> arrayList) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        C27994kKz.adjustResult$default(C27994kKz.KWHzl, list, arrayList, gEmmrt(), null, 8, null);
    }

    public final void AuCTel() {
        C46796tdt c46796tdt;
        C46796tdt c46796tdt2;
        C42654raW c42654raW = this.getFieldNames;
        if (c42654raW != null && (c46796tdt2 = c42654raW.EZpvd) != null) {
            c46796tdt2.setLayoutManager(new LinearLayoutManager(c46796tdt2.getContext(), 1, false));
            c46796tdt2.setItemAnimator(new Application());
            AhwBna().setHasStableIds(true);
            c46796tdt2.setAdapter(AhwBna());
        }
        C42654raW c42654raW2 = this.getFieldNames;
        if (c42654raW2 == null || (c46796tdt = c42654raW2.EZpvd) == null) {
            return;
        }
        new C46802tdz(c46796tdt, AhwBna(), this, false, null, new Function2() { // from class: o.kEf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return MarketFavQuoteFragment.AEQbTJ(this.OLrzqt, ((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue());
            }
        }, new Function1() { // from class: o.kEg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketFavQuoteFragment.copydefault(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
            }
        }, 16, null);
    }

    public static final Unit AEQbTJ(MarketFavQuoteFragment marketFavQuoteFragment, int i, int i2) {
        marketFavQuoteFragment.wlaJM = true;
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(MarketFavQuoteFragment marketFavQuoteFragment, int i) {
        Object objM7377constructorimpl;
        C46796tdt c46796tdt;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        marketFavQuoteFragment.getTAG();
        try {
            Result.Application application = Result.Companion;
            List<?> items = marketFavQuoteFragment.AhwBna().getItems();
            Intrinsics.checkNotNullExpressionValue(items, "");
            marketFavQuoteFragment.uzCIH = CollectionsKt___CollectionsKt.AkhnZx(items, i);
            Triple<String, String, String> tripleFARcdN = marketFavQuoteFragment.fARcdN();
            String strComponent1 = tripleFARcdN.component1();
            String strComponent2 = tripleFARcdN.component2();
            String strComponent3 = tripleFARcdN.component3();
            InterfaceC27808kEb interfaceC27808kEbEZpvd = C27807kEa.EZpvd(marketFavQuoteFragment);
            if (interfaceC27808kEbEZpvd != null) {
                interfaceC27808kEbEZpvd.AEQbTJ(strComponent1, qTA.AEQbTJ(strComponent2));
            }
            InterfaceC27809kEc interfaceC27809kEcAEQbTJ = C27811kEe.AEQbTJ(marketFavQuoteFragment);
            if (interfaceC27809kEcAEQbTJ != null) {
                interfaceC27809kEcAEQbTJ.KWHzl("favorites", strComponent1, i, strComponent3);
            }
            C42654raW c42654raW = marketFavQuoteFragment.getFieldNames;
            View view = (c42654raW == null || (c46796tdt = c42654raW.EZpvd) == null || (viewHolderFindViewHolderForAdapterPosition = c46796tdt.findViewHolderForAdapterPosition(i)) == null) ? null : viewHolderFindViewHolderForAdapterPosition.itemView;
            if (view != null) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(marketFavQuoteFragment), null, null, new MarketFavQuoteFragment$initRv$2$2$1$1(marketFavQuoteFragment, iArr, null), 3, null);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        return Unit.INSTANCE;
    }

    public final boolean getNewProxyInstance() {
        Object obj = this.uzCIH;
        CoinQuote coinQuote = obj instanceof CoinQuote ? (CoinQuote) obj : null;
        if (!Intrinsics.EZpvd((Object) (coinQuote != null ? coinQuote.getInstType() : null), (Object) "OPTION")) {
            Object obj2 = this.uzCIH;
            CoinQuote coinQuote2 = obj2 instanceof CoinQuote ? (CoinQuote) obj2 : null;
            if ((coinQuote2 != null ? coinQuote2.getCountDownInfo() : null) == null && !C55608xnE.OLrzqt()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: com.okinc.business.market.home.favorites.MarketFavQuoteFragment$setListener$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends Pair<? extends List<? extends qWH>, ? extends String>>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = MarketFavQuoteFragment.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends Pair<? extends List<? extends qWH>, ? extends String>> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC49371unL<? extends Pair<? extends List<? extends qWH>, String>>) interfaceC49371unL, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC49371unL<? extends Pair<? extends List<? extends qWH>, String>> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC49371unL interfaceC49371unL;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
                    MarketFavQuoteFragment.this.OLrzqt(true);
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                    MarketFavQuoteFragment.this.zLjUOn();
                    if (!MarketFavQuoteFragment.this.KWHzl()) {
                        pUU.KWHzl(MarketFavQuoteFragment.this.getTAG(), "start report grafana");
                        MarketFavQuoteFragment marketFavQuoteFragment = MarketFavQuoteFragment.this;
                        marketFavQuoteFragment.AEQbTJ(marketFavQuoteFragment.getView(), MarketHomeTabType.FAVORITE);
                    }
                    rVN.reportFullyDrawn$default((Fragment) MarketFavQuoteFragment.this, false, (String) null, 2, (Object) null);
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                    MarketHomeV2ViewModel marketHomeV2ViewModelEjfBZ = MarketFavQuoteFragment.this.ejfBZ();
                    this.L$0 = interfaceC49371unL;
                    this.label = 1;
                    obj = marketHomeV2ViewModelEjfBZ.AEQbTJ(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                rVN.reportFullyDrawn$default((Fragment) MarketFavQuoteFragment.this, true, (String) null, 2, (Object) null);
                return Unit.INSTANCE;
            }
            interfaceC49371unL = (InterfaceC49371unL) this.L$0;
            C56391yDq.AEQbTJ(obj);
            String str = (String) obj;
            InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
            if (Intrinsics.EZpvd(((Pair) activity.copydefault()).getSecond(), (Object) str)) {
                MarketFavQuoteFragment marketFavQuoteFragment2 = MarketFavQuoteFragment.this;
                List list = (List) ((Pair) activity.copydefault()).getFirst();
                this.L$0 = null;
                this.label = 2;
                if (marketFavQuoteFragment2.OLrzqt((List<? extends qWH>) list, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                pUU.KWHzl(MarketFavQuoteFragment.this.getTAG(), "ignore updateUIList , groupName not match , current is " + str + ", but data is " + ((Pair) activity.copydefault()).getSecond());
            }
            rVN.reportFullyDrawn$default((Fragment) MarketFavQuoteFragment.this, true, (String) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, fIwbmz(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.home.favorites.MarketFavQuoteFragment.setListener.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketFavChildViewModel.ActionBar) obj).EZpvd();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketFavChildViewModel.ActionBar) obj).EZpvd((InterfaceC49371unL) obj2);
            }
        }, null, new AnonymousClass2(null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, ejfBZ(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.home.favorites.MarketFavQuoteFragment.setListener.3
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketHomeV2ViewModel.ActionBar) obj).OLrzqt();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketHomeV2ViewModel.ActionBar) obj).OLrzqt((UserGroupVo) obj2);
            }
        }, null, new AnonymousClass4(null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, ejfBZ(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.home.favorites.MarketFavQuoteFragment.setListener.5
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketHomeV2ViewModel.ActionBar) obj).KWHzl();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketHomeV2ViewModel.ActionBar) obj).KWHzl((InterfaceC49371unL) obj2);
            }
        }, null, new AnonymousClass6(null), 2, null);
        hDKMBd();
    }

    /* JADX INFO: renamed from: com.okinc.business.market.home.favorites.MarketFavQuoteFragment$setListener$4, reason: invalid class name */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<UserGroupVo, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = MarketFavQuoteFragment.this.new AnonymousClass4(continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UserGroupVo userGroupVo, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(userGroupVo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                UserGroupVo userGroupVo = (UserGroupVo) this.L$0;
                if (userGroupVo != null) {
                    MarketFavQuoteFragment.this.EZpvd("switch_" + userGroupVo.getUserGroup().getGroupName());
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.market.home.favorites.MarketFavQuoteFragment$setListener$6, reason: invalid class name */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends MarketHomeV2ViewModel.TaskDescription>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass6(Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass6 anonymousClass6 = MarketFavQuoteFragment.this.new AnonymousClass6(continuation);
            anonymousClass6.L$0 = obj;
            return anonymousClass6;
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
            return ((AnonymousClass6) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (((InterfaceC49371unL) this.L$0) instanceof InterfaceC49371unL.Application) {
                    MarketFavQuoteFragment.this.OLrzqt(false);
                    MarketFavQuoteFragment marketFavQuoteFragment = MarketFavQuoteFragment.this;
                    String strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.DsL);
                    String strAYXKKw2 = C33070mpX.AYXKKw(qZH.PendingIntent.djSkpj);
                    String strAYXKKw3 = C33070mpX.AYXKKw(qZH.PendingIntent.fetchVPNInfo);
                    final MarketFavQuoteFragment marketFavQuoteFragment2 = MarketFavQuoteFragment.this;
                    marketFavQuoteFragment.copydefault(strAYXKKw, strAYXKKw2, strAYXKKw3, new Function0() { // from class: o.kEp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return MarketFavQuoteFragment.AnonymousClass6.invokeSuspend$lambda$0(marketFavQuoteFragment2);
                        }
                    });
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(MarketFavQuoteFragment marketFavQuoteFragment) {
            marketFavQuoteFragment.OLrzqt(true);
            FragmentKt.setFragmentResult(marketFavQuoteFragment, "REQUEST_HOME_ERROR_RETRY", BundleKt.bundleOf());
            return Unit.INSTANCE;
        }
    }

    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(List<CallAuctionData> list, Continuation<? super Unit> continuation) {
            Intrinsics.checkNotNullExpressionValue(MarketFavQuoteFragment.this.AhwBna().getItems(), "");
            boolean z = true;
            if ((!r8.isEmpty()) && C33129mqd.KWHzl((Collection) list)) {
                List<?> items = MarketFavQuoteFragment.this.AhwBna().getItems();
                Intrinsics.checkNotNullExpressionValue(items, "");
                ArrayList<CoinQuote> arrayList = new ArrayList();
                for (T t : items) {
                    if (t instanceof CoinQuote) {
                        arrayList.add(t);
                    }
                }
                if (arrayList.isEmpty()) {
                    z = false;
                    MarketFavQuoteFragment marketFavQuoteFragment = MarketFavQuoteFragment.this;
                    if (z) {
                        pUU.KWHzl(marketFavQuoteFragment.getTAG(), "call auction ws update , need refresh ui");
                        marketFavQuoteFragment.AhwBna().notifyDataSetChanged();
                    }
                } else {
                    loop1: for (CoinQuote coinQuote : arrayList) {
                        Intrinsics.copydefault(list);
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            for (CallAuctionData callAuctionData : list) {
                                if (Intrinsics.EZpvd((Object) callAuctionData.getInstType(), (Object) coinQuote.getInstType()) && Intrinsics.EZpvd((Object) callAuctionData.getInstId(), (Object) coinQuote.getInstId())) {
                                    break loop1;
                                }
                            }
                        }
                    }
                    z = false;
                    MarketFavQuoteFragment marketFavQuoteFragment2 = MarketFavQuoteFragment.this;
                    if (z) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void EZpvd(boolean z) {
        FrameLayout frameLayout;
        C42654raW c42654raW = this.getFieldNames;
        if (c42654raW != null && (frameLayout = c42654raW.AEQbTJ) != null) {
            frameLayout.setVisibility(z ? 0 : 8);
        }
        if (z) {
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(C27831kEy.class);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            C33062mpP.findOrReplaceFragment$default(interfaceC56551yJoAEQbTJ, childFragmentManager, qZH.StateListAnimator.sEAkxl, OLrzqt(new Bundle()), null, null, 24, null);
            return;
        }
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ2 = C56524yIo.AEQbTJ(C27831kEy.class);
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
        C27831kEy c27831kEy = (C27831kEy) C33062mpP.findFragment$default(interfaceC56551yJoAEQbTJ2, childFragmentManager2, null, 2, null);
        if (c27831kEy != null) {
            FragmentManager childFragmentManager3 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
            C33062mpP.copydefault(c27831kEy, childFragmentManager3);
        }
    }

    public final void EZpvd(String str) {
        pUU.KWHzl(getTAG(), "requestData [clue]: " + str);
        Job job = this.zLjUOn;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.zLjUOn = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketFavQuoteFragment$requestData$1(this, str, null), 3, null);
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        FragmentManager childFragmentManager;
        rVN.copydefault(this);
        if (bb_()) {
            KWHzl(C33129mqd.divS$default(Long.valueOf(System.currentTimeMillis()), 1000, null, null, null, 14, null));
            AEQbTJ(false);
        }
        InterfaceC58217yxC interfaceC58217yxC = this.zsXlph;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("event_home_page_refresh");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, viewLifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.kEk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketFavQuoteFragment.copydefault(this.OLrzqt, (java.lang.String) obj);
            }
        };
        this.zsXlph = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.kEo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MarketFavQuoteFragment.AEQbTJ(function1, obj);
            }
        });
        View view = getView();
        if (view != null && view.isShown() && view.isAttachedToWindow()) {
            if (view.getGlobalVisibleRect(new Rect()) && view.getHeight() > 0 && C33129mqd.copydefault(Float.valueOf(r1.height() / view.getHeight()), Float.valueOf(0.5f))) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketFavQuoteFragment$onVisible$2$1(this, null), 3, null);
            }
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || (childFragmentManager = parentFragment.getChildFragmentManager()) == null) {
            return;
        }
        childFragmentManager.setFragmentResultListener("REQUEST_CLICK_ARROW", this, new FragmentResultListener() { // from class: o.kEm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                MarketFavQuoteFragment.copydefault(this.copydefault, str, bundle);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(MarketFavQuoteFragment marketFavQuoteFragment, String str) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(marketFavQuoteFragment), null, null, new MarketFavQuoteFragment$onVisible$1$1(marketFavQuoteFragment, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(MarketFavQuoteFragment marketFavQuoteFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Intrinsics.EZpvd((Object) bundle.getString("type"), (Object) "favorite")) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(marketFavQuoteFragment), null, null, new MarketFavQuoteFragment$onVisible$3$1(marketFavQuoteFragment, null), 3, null);
        }
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        FragmentManager childFragmentManager;
        Job job = this.zLjUOn;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        InterfaceC58217yxC interfaceC58217yxC = this.zsXlph;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || (childFragmentManager = parentFragment.getChildFragmentManager()) == null) {
            return;
        }
        childFragmentManager.clearFragmentResultListener("REQUEST_CLICK_ARROW");
    }

    @Override // o.C27831kEy.Application
    public String fJNWhG() {
        return ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).ejfBZ() ? "home_lite" : "home_pro";
    }

    @Override // com.okinc.business.market.market.dialog.MarketToolDialog.TaskDescription
    public void OLrzqt(@NotNull MarketToolDialog.Action action) {
        Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(action, "");
        Object obj = this.uzCIH;
        if (obj == null) {
            return;
        }
        Triple<String, String, String> tripleFARcdN = fARcdN();
        String strComponent1 = tripleFARcdN.component1();
        String strComponent2 = tripleFARcdN.component2();
        tripleFARcdN.component3();
        InterfaceC27809kEc interfaceC27809kEcAEQbTJ = C27811kEe.AEQbTJ(this);
        if (interfaceC27809kEcAEQbTJ != null) {
            List<? extends Object> list = this.values;
            InterfaceC27809kEc.TaskDescription.trackLongPressClick$default(interfaceC27809kEcAEQbTJ, "favorites", strComponent1, list != null ? CollectionsKt___CollectionsKt.copydefault((List<? extends Object>) list, this.uzCIH) : -1, null, 8, null);
        }
        int i = TaskDescription.copydefault[action.ordinal()];
        String str = null;
        if (i == 1) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketFavQuoteFragment$onActionClick$1(obj, this, strComponent1, strComponent2, null), 3, null);
        } else if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!C55608xnE.OLrzqt()) {
                    if (C55608xnE.isLogin$default(null, 1, null)) {
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketFavQuoteFragment$onActionClick$5(this, null), 3, null);
                    } else {
                        try {
                            Result.Application application = Result.Companion;
                            InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class);
                            FragmentActivity fragmentActivityRequireActivity = requireActivity();
                            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                            interfaceC8104awT.OLrzqt(fragmentActivityRequireActivity, new LoginRoute(null, null, null, null, null, null, null, null, null, false, false, 2047, null));
                            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th) {
                            Result.Application application2 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        }
                        Result.m7376boximpl(objM7377constructorimpl);
                    }
                } else {
                    Intent intent = new Intent(getActivity(), (Class<?>) ActivityC46706tcI.class);
                    intent.putExtra("type", false);
                    intent.putExtra("exclude_ids", "COIN");
                    startActivity(intent);
                }
            } else if (obj instanceof qWK) {
                Context context = getContext();
                if (context != null) {
                    Object obj2 = this.uzCIH;
                    Intrinsics.copydefault(obj2, "");
                    DexInstrument dexInstrumentCopydefault = ((qWK) obj2).copydefault();
                    ActivityC46751tdA.Application.startActivity$default(ActivityC46751tdA.Companion, context, null, new TokenInfoForAlert(dexInstrumentCopydefault.getChainId(), dexInstrumentCopydefault.getChainName(), dexInstrumentCopydefault.getTokenContractAddress(), dexInstrumentCopydefault.getTokenLogoUrl(), dexInstrumentCopydefault.getChainLogoUrl(), dexInstrumentCopydefault.getTokenSymbol(), null, null, false, 0, 960, null), 2, null);
                }
            } else {
                C27858kFy c27858kFy = C27858kFy.EZpvd;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                c27858kFy.copydefault(contextRequireContext, (CoinQuote) obj, "favorites_homepage");
            }
        }
        int i2 = TaskDescription.copydefault[action.ordinal()];
        if (i2 == 1) {
            str = "unfavorite";
        } else if (i2 == 2) {
            str = "top";
        } else if (i2 == 4) {
            str = "edit";
        }
        if (str != null) {
            Triple<String, String, String> tripleFARcdN2 = fARcdN();
            String strComponent12 = tripleFARcdN2.component1();
            String strComponent22 = tripleFARcdN2.component2();
            String strComponent3 = tripleFARcdN2.component3();
            InterfaceC27808kEb interfaceC27808kEbEZpvd = C27807kEa.EZpvd(this);
            if (interfaceC27808kEbEZpvd != null) {
                interfaceC27808kEbEZpvd.AEQbTJ(strComponent12, qTA.AEQbTJ(strComponent22), "all", str);
            }
            InterfaceC27809kEc interfaceC27809kEcAEQbTJ2 = C27811kEe.AEQbTJ(this);
            if (interfaceC27809kEcAEQbTJ2 != null) {
                List<? extends Object> list2 = this.values;
                interfaceC27809kEcAEQbTJ2.OLrzqt("favorites", strComponent12, list2 != null ? CollectionsKt___CollectionsKt.copydefault((List<? extends Object>) list2, this.uzCIH) : -1, strComponent3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zLjUOn() {
        C42654raW c42654raW;
        FrameLayout frameLayout;
        djBIcL(false);
        OLrzqt(false);
        if (AhwBna().getItemCount() != 0 || (c42654raW = this.getFieldNames) == null || (frameLayout = c42654raW.AEQbTJ) == null || frameLayout.getVisibility() == 0) {
            return;
        }
        copydefault(C33070mpX.AYXKKw(qZH.PendingIntent.DsL), C33070mpX.AYXKKw(qZH.PendingIntent.djSkpj), C33070mpX.AYXKKw(qZH.PendingIntent.fetchVPNInfo), new Function0() { // from class: o.kEn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketFavQuoteFragment.AuCTel(this.EZpvd);
            }
        });
    }

    public static final Unit AuCTel(MarketFavQuoteFragment marketFavQuoteFragment) {
        marketFavQuoteFragment.hDKMBd = true;
        marketFavQuoteFragment.OLrzqt(true);
        marketFavQuoteFragment.EZpvd("error_retry");
        return Unit.INSTANCE;
    }

    private final void djBIcL(boolean z) {
        if (this.ejfBZ) {
            this.ejfBZ = false;
            pUU.EZpvd(getTAG(), "updateLoadState() called with: success = " + z);
            AbstractC42536rWm.addMarker$default(getOkQPL(), QPLType.LIFE_CYCLE, z ? QPLMarker.PAGE_LOADED : QPLMarker.PAGE_NOT_LOADED, getTAG(), 0L, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(boolean z) {
        FrameLayout frameLayout;
        if (this.hDKMBd) {
            Job job = this.iwGUEr;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            C42654raW c42654raW = this.getFieldNames;
            if (c42654raW == null || (frameLayout = c42654raW.OLrzqt) == null) {
                return;
            }
            if (z) {
                this.iwGUEr = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketFavQuoteFragment$changeAnimState$1$1(this, frameLayout, null), 3, null);
                return;
            }
            this.hDKMBd = false;
            pXA.OLrzqt(frameLayout);
            pUU.KWHzl(getTAG(), "remove loading");
        }
    }

    public void OLrzqt(@NotNull FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "");
        pXA.gEmmrt(frameLayout);
    }

    private final void iwGUEr() {
        djBIcL(true);
        OLrzqt(false);
        getFieldNames();
    }

    public final void uzCIH() {
        iwGUEr();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(ArrayList<Object> arrayList, Continuation<? super Unit> continuation) throws Throwable {
        MarketFavQuoteFragment$showEmptyGuideLayout$1 marketFavQuoteFragment$showEmptyGuideLayout$1;
        final MarketFavQuoteFragment marketFavQuoteFragment;
        C55173xeu c55173xeu;
        C52794wYp c52794wYpAEQbTJ;
        if (continuation instanceof MarketFavQuoteFragment$showEmptyGuideLayout$1) {
            marketFavQuoteFragment$showEmptyGuideLayout$1 = (MarketFavQuoteFragment$showEmptyGuideLayout$1) continuation;
            int i = marketFavQuoteFragment$showEmptyGuideLayout$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketFavQuoteFragment$showEmptyGuideLayout$1.label = i - Integer.MIN_VALUE;
            } else {
                marketFavQuoteFragment$showEmptyGuideLayout$1 = new MarketFavQuoteFragment$showEmptyGuideLayout$1(this, continuation);
            }
        }
        Object objEZpvd = marketFavQuoteFragment$showEmptyGuideLayout$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketFavQuoteFragment$showEmptyGuideLayout$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (arrayList.isEmpty()) {
                MarketHomeV2ViewModel marketHomeV2ViewModelEjfBZ = ejfBZ();
                marketFavQuoteFragment$showEmptyGuideLayout$1.L$0 = this;
                marketFavQuoteFragment$showEmptyGuideLayout$1.label = 1;
                objEZpvd = EZpvd(marketHomeV2ViewModelEjfBZ, marketFavQuoteFragment$showEmptyGuideLayout$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                marketFavQuoteFragment = this;
            } else {
                iwGUEr();
                EZpvd(false);
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            marketFavQuoteFragment = (MarketFavQuoteFragment) marketFavQuoteFragment$showEmptyGuideLayout$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        UserGroupVo userGroupVoOLrzqt = ((MarketHomeV2ViewModel.ActionBar) objEZpvd).OLrzqt();
        final UserGroup userGroup = userGroupVoOLrzqt != null ? userGroupVoOLrzqt.getUserGroup() : null;
        if (Intrinsics.EZpvd((Object) (userGroup != null ? userGroup.getGroupName() : null), (Object) "ALL")) {
            marketFavQuoteFragment.EZpvd(true);
        } else {
            marketFavQuoteFragment.iwGUEr();
            marketFavQuoteFragment.OLrzqt(new ArrayList<>());
            marketFavQuoteFragment.EZpvd(false);
            marketFavQuoteFragment.AEQbTJ(qZH.PendingIntent.apAOXX, qZH.PendingIntent.DztXDE, (userGroup == null || userGroup.isPreset()) ? 0 : qZH.PendingIntent.DcMfJKOmnske, marketFavQuoteFragment.AEQbTJ(), new Function0() { // from class: o.kEh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MarketFavQuoteFragment.OLrzqt(this.copydefault, userGroup);
                }
            });
            C42654raW c42654raW = marketFavQuoteFragment.getFieldNames;
            if (c42654raW != null && (c55173xeu = c42654raW.copydefault) != null && (c52794wYpAEQbTJ = c55173xeu.AEQbTJ()) != null) {
                c52794wYpAEQbTJ.setVisibility((userGroup == null || userGroup.isPreset()) ? 4 : 0);
                Drawable drawable = ContextCompat.getDrawable(c52794wYpAEQbTJ.getContext(), C52761wXj.TaskDescription.onLocationChanged);
                if (drawable != null) {
                    drawable.setBounds(0, 0, C55298xhM.dp2px$default(14.0f, null, 1, null), C55298xhM.dp2px$default(14.0f, null, 1, null));
                }
                c52794wYpAEQbTJ.setCompoundDrawables(drawable, null, null, null);
                c52794wYpAEQbTJ.setCompoundDrawablePadding(C55298xhM.dp2px$default(8.0f, null, 1, null));
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(MarketFavQuoteFragment marketFavQuoteFragment, UserGroup userGroup) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(marketFavQuoteFragment), null, null, new MarketFavQuoteFragment$showEmptyGuideLayout$2$1(userGroup, marketFavQuoteFragment, null), 3, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object KWHzl(MarketFavQuoteFragment marketFavQuoteFragment, Continuation<? super String> continuation) {
        return marketFavQuoteFragment.ejfBZ().AEQbTJ(continuation);
    }

    public final void hDKMBd() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketFavQuoteFragment$setCallAuctionListener$$inlined$repeatOnLifecycleResume$1(this, Lifecycle.State.RESUMED, null, this), 3, null);
    }
}
