package o;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.reflect.TypeToken;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.library.indicator.Expression;
import com.okinc.kline.ui.view.model.IndicatorBean;
import com.okinc.kline.ui.view.model.IndicatorDataReq;
import com.okinc.kline.ui.view.setting.IndicatorSettingActivity$onCreate$1;
import com.okinc.kline.ui.view.setting.SnappingStepper;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import java.util.Objects;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.ActivityC37844pCu;
import o.C32113mPz;
import o.C33565myp;
import o.C35964oKf;
import o.C47244tmQ;
import o.C52761wXj;
import o.InterfaceC49363unD;
import o.pCC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class pCC extends AbstractActivityC33041mov implements InterfaceC49363unD {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public android.widget.LinearLayout AkhnZx;
    public java.lang.String AuCTel;
    public AbstractC36262oVg AuCTelauCTel;
    public android.view.View AwvSrB;
    public android.widget.LinearLayout DbNXlk;
    public ConstraintLayout EZpvd;
    public boolean djBIcL;
    public C39587pvE fARcdN;
    public AbstractC36262oVg fIwbmz;
    public C52794wYp fetchVPNInfo;
    public android.widget.TextView gHZMYf;
    public RecyclerView getNewProxyInstance;
    public boolean hDKMBd;
    public android.widget.TextView sSMYrx;
    public AbstractC36262oVg uzCIH;
    public android.widget.LinearLayout values;
    public C52794wYp wlaJM;
    public android.widget.SeekBar zLjUOn;
    public RecyclerView zsXlph;
    public android.view.View zuBGHE;
    public final /* synthetic */ C39267ppA OLrzqt = new C39267ppA();
    public final oUN AYXKKw = oUN.Companion.OLrzqt();
    public int gEmmrt = C55298xhM.dp2px$default(8.0f, null, 1, null);
    public int AEQbTJ = C55298xhM.dp2px$default(10.0f, null, 1, null);
    public int valueOf = C55298xhM.dp2px$default(24.0f, null, 1, null);
    public int AhwBna = C55298xhM.dp2px$default(32.0f, null, 1, null);
    public java.util.ArrayList<oLO> KWHzl = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.Object> ejfBZ = new java.util.ArrayList<>();
    public final C59534zip isConnected = new C59534zip();
    public final C59534zip AubY = new C59534zip();
    public int getFieldNames = -1;
    public java.lang.String fJNWhG = "ds0";
    public final InterfaceC56387yDm iwGUEr = C56392yDr.copydefault(new Function0() { // from class: o.pCE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return pCC.values(this.KWHzl);
        }
    });

    public static final class Activity extends TypeToken<java.util.ArrayList<Expression.Parameter>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        this.OLrzqt.OLrzqt(abstractActivityC33041mov);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean valueOf() {
        return this.OLrzqt.OLrzqt();
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

    public <T extends InterfaceC49369unJ<T>> java.lang.Object copydefault(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Unit> continuation) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, function2, continuation);
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

    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pCC.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final LinearLayoutManager values(pCC pcc) {
        return new LinearLayoutManager(pcc, 1, false);
    }

    public final LinearLayoutManager AEQbTJ() {
        return (LinearLayoutManager) this.iwGUEr.getValue();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt((AbstractActivityC33041mov) this);
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C35964oKf.Application.copydefault);
        EZpvd();
        AkhnZx();
        RecyclerView recyclerView = this.getNewProxyInstance;
        if (recyclerView == null) {
            Intrinsics.gEmmrt("");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(AEQbTJ());
        RecyclerView recyclerView2 = this.getNewProxyInstance;
        if (recyclerView2 == null) {
            Intrinsics.gEmmrt("");
            recyclerView2 = null;
        }
        recyclerView2.setAdapter(this.isConnected);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new IndicatorSettingActivity$onCreate$1(this, null), 3, null);
        values();
        this.isConnected.notifyDataSetChanged();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.pCG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                pCC.DbNXlk(this.AEQbTJ);
            }
        });
    }

    public static final void DbNXlk(pCC pcc) {
        rVN.reportFullyDrawn$default((android.app.Activity) pcc, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void djBIcL() {
        android.view.View view = this.zuBGHE;
        android.view.View view2 = null;
        if (view == null) {
            Intrinsics.gEmmrt("");
            view = null;
        }
        view.setBackground(C33070mpX.KWHzl(C35964oKf.Activity.djBIcL));
        android.view.View view3 = this.AwvSrB;
        if (view3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            view2 = view3;
        }
        view2.setBackground(C33070mpX.KWHzl(C35964oKf.Activity.AYXKKw));
    }

    public final boolean EZpvd() {
        android.view.View viewFindViewById = findViewById(C35964oKf.StateListAnimator.UfveVb);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        C33537myN c33537myN = (C33537myN) viewFindViewById;
        c33537myN.setTitle(getIntent().getStringExtra("Title"));
        this.getFieldNames = getIntent().getIntExtra("Type", -1);
        java.lang.String stringExtra = getIntent().getStringExtra("IndicatorName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.AuCTel = stringExtra;
        c33537myN.setSubTitle("");
        this.DbNXlk = (android.widget.LinearLayout) findViewById(C35964oKf.StateListAnimator.OqHLSf);
        this.sSMYrx = (android.widget.TextView) findViewById(C35964oKf.StateListAnimator.putText);
        this.AkhnZx = (android.widget.LinearLayout) findViewById(C35964oKf.StateListAnimator.gLWkOL);
        this.values = (android.widget.LinearLayout) findViewById(C35964oKf.StateListAnimator.HJWChPfvRMlC);
        this.EZpvd = (ConstraintLayout) findViewById(C35964oKf.StateListAnimator.UhxbNG);
        this.gHZMYf = (android.widget.TextView) findViewById(C35964oKf.StateListAnimator.setVolumeTo);
        this.zLjUOn = (android.widget.SeekBar) findViewById(C35964oKf.StateListAnimator.ITrustedWebActivityCallbackStub);
        this.zuBGHE = findViewById(C35964oKf.StateListAnimator.MediaSessionCompatCallbackStubApi23);
        this.AwvSrB = findViewById(C35964oKf.StateListAnimator.MediaSessionCompatCallbackStubApi21);
        this.getNewProxyInstance = (RecyclerView) findViewById(C35964oKf.StateListAnimator.arDRxL);
        this.zsXlph = (RecyclerView) findViewById(C35964oKf.StateListAnimator.warmup);
        this.fetchVPNInfo = (C52794wYp) findViewById(C35964oKf.StateListAnimator.dvKsVJ);
        C52794wYp c52794wYp = (C52794wYp) findViewById(C35964oKf.StateListAnimator.fFgQHt);
        this.wlaJM = c52794wYp;
        java.lang.String str = null;
        if (c52794wYp == null) {
            Intrinsics.gEmmrt("");
            c52794wYp = null;
        }
        c52794wYp.setText(getString(C35964oKf.Fragment.hfeTOA));
        C52794wYp c52794wYp2 = this.wlaJM;
        if (c52794wYp2 == null) {
            Intrinsics.gEmmrt("");
            c52794wYp2 = null;
        }
        c52794wYp2.setOnClickListener(new View.OnClickListener() { // from class: o.pCH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                pCC.AEQbTJ(this.EZpvd, view);
            }
        });
        C52794wYp c52794wYp3 = this.fetchVPNInfo;
        if (c52794wYp3 == null) {
            Intrinsics.gEmmrt("");
            c52794wYp3 = null;
        }
        c52794wYp3.setOnClickListener(new View.OnClickListener() { // from class: o.pCI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                pCC.copydefault(this.AEQbTJ, view);
            }
        });
        C33565myp.EZpvd().copydefault(this, new C33565myp.Application() { // from class: o.pCF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C33565myp.Application
            public final void EZpvd(int i, boolean z) {
                pCC.OLrzqt(this.AEQbTJ, i, z);
            }
        });
        android.widget.SeekBar seekBar = this.zLjUOn;
        if (seekBar == null) {
            Intrinsics.gEmmrt("");
            seekBar = null;
        }
        seekBar.setOnSeekBarChangeListener(new StateListAnimator());
        java.lang.String str2 = this.AuCTel;
        if (str2 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "VOLUME")) {
            android.widget.LinearLayout linearLayout = this.DbNXlk;
            if (linearLayout == null) {
                Intrinsics.gEmmrt("");
                linearLayout = null;
            }
            linearLayout.setVisibility(0);
            ConstraintLayout constraintLayout = this.EZpvd;
            if (constraintLayout == null) {
                Intrinsics.gEmmrt("");
                constraintLayout = null;
            }
            constraintLayout.setVisibility(0);
            OLrzqt();
        } else {
            android.widget.LinearLayout linearLayout2 = this.DbNXlk;
            if (linearLayout2 == null) {
                Intrinsics.gEmmrt("");
                linearLayout2 = null;
            }
            linearLayout2.setVisibility(8);
            ConstraintLayout constraintLayout2 = this.EZpvd;
            if (constraintLayout2 == null) {
                Intrinsics.gEmmrt("");
                constraintLayout2 = null;
            }
            constraintLayout2.setVisibility(8);
        }
        java.lang.String str3 = this.AuCTel;
        if (str3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            str = str3;
        }
        EZpvd(str);
        return true;
    }

    public static final void AEQbTJ(pCC pcc, android.view.View view) {
        AbstractC36262oVg abstractC36262oVg = pcc.fIwbmz;
        AbstractC36262oVg abstractC36262oVg2 = null;
        if (abstractC36262oVg == null) {
            Intrinsics.gEmmrt("");
            abstractC36262oVg = null;
        }
        int iDbNXlk = abstractC36262oVg.DbNXlk();
        for (int i = 0; i < iDbNXlk; i++) {
            AbstractC36262oVg abstractC36262oVg3 = pcc.fIwbmz;
            if (abstractC36262oVg3 == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg3 = null;
            }
            Expression.Parameter parameterEZpvd = abstractC36262oVg3.EZpvd(i);
            parameterEZpvd.setTempValue(parameterEZpvd.getDefaultValue());
        }
        pcc.isConnected.notifyDataSetChanged();
        java.lang.String str = pcc.AuCTel;
        if (str == null) {
            Intrinsics.gEmmrt("");
            str = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "VOLUME")) {
            pcc.AYXKKw();
        }
        AbstractC36262oVg abstractC36262oVg4 = pcc.fIwbmz;
        if (abstractC36262oVg4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC36262oVg2 = abstractC36262oVg4;
        }
        java.util.ArrayList<Expression.Parameter> arrayListIsConnected = abstractC36262oVg2.isConnected();
        Intrinsics.checkNotNullExpressionValue(arrayListIsConnected, "");
        for (Expression.Parameter parameter : arrayListIsConnected) {
            parameter.setIsShowTemp(parameter.getIsShowDefaultValue());
            parameter.setColorTemp(parameter.getColorDefaultValue());
            parameter.setTransparencyTemp(parameter.getTransparencyDefaultValue());
            parameter.setColorBlkTemp(parameter.getColorBlkDefaultValue());
        }
        pcc.AubY.notifyDataSetChanged();
    }

    public static final void copydefault(pCC pcc, android.view.View view) {
        java.lang.String str = pcc.AuCTel;
        android.widget.SeekBar seekBar = null;
        if (str == null) {
            Intrinsics.gEmmrt("");
            str = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "VOLUME")) {
            if (pcc.getFieldNames == 0) {
                android.widget.SeekBar seekBar2 = pcc.zLjUOn;
                if (seekBar2 == null) {
                    Intrinsics.gEmmrt("");
                    seekBar2 = null;
                }
                SPUtils.put("key_vol_transparency", java.lang.Integer.valueOf(seekBar2.getProgress()));
                C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
                android.widget.SeekBar seekBar3 = pcc.zLjUOn;
                if (seekBar3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    seekBar = seekBar3;
                }
                c36246oUrCopydefault.values(seekBar.getProgress());
            } else {
                android.widget.SeekBar seekBar4 = pcc.zLjUOn;
                if (seekBar4 == null) {
                    Intrinsics.gEmmrt("");
                    seekBar4 = null;
                }
                SPUtils.put("key_vol_transparency_sub", java.lang.Integer.valueOf(seekBar4.getProgress()));
                C36246oUr c36246oUrCopydefault2 = C36246oUr.copydefault();
                android.widget.SeekBar seekBar5 = pcc.zLjUOn;
                if (seekBar5 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    seekBar = seekBar5;
                }
                c36246oUrCopydefault2.AkhnZx(seekBar.getProgress());
            }
        }
        pcc.AhwBna();
    }

    public static final void OLrzqt(pCC pcc, int i, boolean z) {
        if (pcc.djBIcL && !z) {
            pcc.copydefault();
        }
        pcc.djBIcL = z;
    }

    public static final class StateListAnimator implements SeekBar.OnSeekBarChangeListener {
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        }

        public StateListAnimator() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
            android.widget.TextView textView = pCC.this.gHZMYf;
            android.view.View view = null;
            if (textView == null) {
                Intrinsics.gEmmrt("");
                textView = null;
            }
            textView.setText(pCC.this.AEQbTJ(i));
            android.view.View view2 = pCC.this.zuBGHE;
            if (view2 == null) {
                Intrinsics.gEmmrt("");
                view2 = null;
            }
            view2.setAlpha(C33129mqd.djBIcL(C33129mqd.divS$default(java.lang.Integer.valueOf(i), 255, null, null, null, 14, null)));
            android.view.View view3 = pCC.this.AwvSrB;
            if (view3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                view = view3;
            }
            view.setAlpha(C33129mqd.djBIcL(C33129mqd.divS$default(java.lang.Integer.valueOf(i), 255, null, null, null, 14, null)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [296=26] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void EZpvd(java.lang.String str) {
        android.widget.TextView textView = null;
        switch (str.hashCode()) {
            case -1757553894:
                if (str.equals("VOLUME")) {
                    android.widget.TextView textView2 = this.sSMYrx;
                    if (textView2 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView2;
                    }
                    textView.setText(getString(C35964oKf.Fragment.DjwCMv));
                    break;
                }
                break;
            case -1266155568:
                if (str.equals("ENVELOPE")) {
                    android.widget.TextView textView3 = this.sSMYrx;
                    if (textView3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView3;
                    }
                    textView.setText(getString(C35964oKf.Fragment.gdLjtZ));
                    break;
                }
                break;
            case -1213730046:
                if (str.equals("SUPERTREND")) {
                    android.widget.TextView textView4 = this.sSMYrx;
                    if (textView4 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView4;
                    }
                    textView.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.fAklCm));
                    break;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    android.widget.TextView textView5 = this.sSMYrx;
                    if (textView5 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView5;
                    }
                    textView.setText(getString(C35964oKf.Fragment.HJWChPHhYHK));
                    break;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    android.widget.TextView textView6 = this.sSMYrx;
                    if (textView6 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView6;
                    }
                    textView.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.isInitInProgress));
                    break;
                }
                break;
            case 2748:
                if (str.equals("VR")) {
                    android.widget.TextView textView7 = this.sSMYrx;
                    if (textView7 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView7;
                    }
                    textView.setText(getString(C35964oKf.Fragment.HJWChPOZOJIj));
                    break;
                }
                break;
            case 2779:
                if (str.equals("WR")) {
                    android.widget.TextView textView8 = this.sSMYrx;
                    if (textView8 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView8;
                    }
                    textView.setText(getString(C35964oKf.Fragment.fDu));
                    break;
                }
                break;
            case 66537:
                if (str.equals("CCI")) {
                    android.widget.TextView textView9 = this.sSMYrx;
                    if (textView9 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView9;
                    }
                    textView.setText(getString(C35964oKf.Fragment.onReceive));
                    break;
                }
                break;
            case 67800:
                if (str.equals("DMA")) {
                    android.widget.TextView textView10 = this.sSMYrx;
                    if (textView10 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView10;
                    }
                    textView.setText(getString(C35964oKf.Fragment.Dff));
                    break;
                }
                break;
            case 67808:
                if (str.equals("DMI")) {
                    android.widget.TextView textView11 = this.sSMYrx;
                    if (textView11 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView11;
                    }
                    textView.setText(getString(C35964oKf.Fragment.GiPPlLgiPPlL));
                    break;
                }
                break;
            case 68761:
                if (str.equals("EMA")) {
                    android.widget.TextView textView12 = this.sSMYrx;
                    if (textView12 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView12;
                    }
                    textView.setText(getString(C35964oKf.Fragment.HJWChP));
                    break;
                }
                break;
            case 68782:
                if (str.equals("EMV")) {
                    android.widget.TextView textView13 = this.sSMYrx;
                    if (textView13 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView13;
                    }
                    textView.setText(getString(C35964oKf.Fragment.GzAsTt));
                    break;
                }
                break;
            case 74257:
                if (str.equals("KDJ")) {
                    android.widget.TextView textView14 = this.sSMYrx;
                    if (textView14 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView14;
                    }
                    textView.setText(getString(C35964oKf.Fragment.sZqaRl));
                    break;
                }
                break;
            case 76678:
                if (str.equals("MTM")) {
                    android.widget.TextView textView15 = this.sSMYrx;
                    if (textView15 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView15;
                    }
                    textView.setText(getString(C35964oKf.Fragment.iLWfRf));
                    break;
                }
                break;
            case 78051:
                if (str.equals("OBV")) {
                    android.widget.TextView textView16 = this.sSMYrx;
                    if (textView16 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView16;
                    }
                    textView.setText(getString(C35964oKf.Fragment.DVmcag));
                    break;
                }
                break;
            case 79542:
                if (str.equals("PSY")) {
                    android.widget.TextView textView17 = this.sSMYrx;
                    if (textView17 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView17;
                    }
                    textView.setText(getString(C35964oKf.Fragment.DeEinT));
                    break;
                }
                break;
            case 81318:
                if (str.equals("ROC")) {
                    android.widget.TextView textView18 = this.sSMYrx;
                    if (textView18 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView18;
                    }
                    textView.setText(getString(C35964oKf.Fragment.putInt));
                    break;
                }
                break;
            case 81448:
                if (str.equals("RSI")) {
                    android.widget.TextView textView19 = this.sSMYrx;
                    if (textView19 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView19;
                    }
                    textView.setText(getString(C35964oKf.Fragment.Qsauvs));
                    break;
                }
                break;
            case 81860:
                if (str.equals("SAR")) {
                    android.widget.TextView textView20 = this.sSMYrx;
                    if (textView20 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView20;
                    }
                    textView.setText(getString(C35964oKf.Fragment.dSJNDS));
                    break;
                }
                break;
            case 2044557:
                if (str.equals("BOLL")) {
                    android.widget.TextView textView21 = this.sSMYrx;
                    if (textView21 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView21;
                    }
                    textView.setText(getString(C35964oKf.Fragment.GiPPlLRPuVlr));
                    break;
                }
                break;
            case 2047105:
                if (str.equals("BRAR")) {
                    android.widget.TextView textView22 = this.sSMYrx;
                    if (textView22 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView22;
                    }
                    textView.setText(getString(C35964oKf.Fragment.GqbzPL));
                    break;
                }
                break;
            case 2358517:
                if (str.equals("MACD")) {
                    android.widget.TextView textView23 = this.sSMYrx;
                    if (textView23 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView23;
                    }
                    textView.setText(getString(C35964oKf.Fragment.hcetpZ));
                    break;
                }
                break;
            case 2546910:
                if (str.equals("SKDJ")) {
                    android.widget.TextView textView24 = this.sSMYrx;
                    if (textView24 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView24;
                    }
                    textView.setText(getString(C35964oKf.Fragment.gFTCsA));
                    break;
                }
                break;
            case 2583597:
                if (str.equals("TRIX")) {
                    android.widget.TextView textView25 = this.sSMYrx;
                    if (textView25 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView25;
                    }
                    textView.setText(getString(C35964oKf.Fragment.HJWChPOKBmQNaCIdOM));
                    break;
                }
                break;
            case 2647728:
                if (str.equals("VWAP")) {
                    android.widget.TextView textView26 = this.sSMYrx;
                    if (textView26 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView26;
                    }
                    textView.setText(getString(C35964oKf.Fragment.clearRegistrations));
                    break;
                }
                break;
            case 1768025685:
                if (str.equals("StochRSI")) {
                    android.widget.TextView textView27 = this.sSMYrx;
                    if (textView27 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        textView = textView27;
                    }
                    textView.setText(getString(C35964oKf.Fragment.hwkNQP));
                    break;
                }
                break;
        }
    }

    public final void OLrzqt() {
        android.widget.SeekBar seekBar = this.zLjUOn;
        android.view.View view = null;
        if (seekBar == null) {
            Intrinsics.gEmmrt("");
            seekBar = null;
        }
        seekBar.setMax(255);
        seekBar.setProgress(SPUtils.getInt(this.getFieldNames == 0 ? "key_vol_transparency" : "key_vol_transparency_sub", 127).intValue());
        android.widget.TextView textView = this.gHZMYf;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        textView.setText(AEQbTJ(seekBar.getProgress()));
        android.view.View view2 = this.zuBGHE;
        if (view2 == null) {
            Intrinsics.gEmmrt("");
            view2 = null;
        }
        view2.setAlpha(C33129mqd.djBIcL(C33129mqd.divS$default(java.lang.Integer.valueOf(seekBar.getProgress()), 255, null, null, null, 14, null)));
        android.view.View view3 = this.AwvSrB;
        if (view3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            view = view3;
        }
        view.setAlpha(C33129mqd.djBIcL(C33129mqd.divS$default(java.lang.Integer.valueOf(seekBar.getProgress()), 255, null, null, null, 14, null)));
    }

    public final void AYXKKw() {
        android.widget.SeekBar seekBar = this.zLjUOn;
        android.view.View view = null;
        if (seekBar == null) {
            Intrinsics.gEmmrt("");
            seekBar = null;
        }
        seekBar.setProgress(127);
        android.widget.TextView textView = this.gHZMYf;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        textView.setText(AEQbTJ(seekBar.getProgress()));
        android.view.View view2 = this.zuBGHE;
        if (view2 == null) {
            Intrinsics.gEmmrt("");
            view2 = null;
        }
        view2.setAlpha(C33129mqd.djBIcL(C33129mqd.divS$default(java.lang.Integer.valueOf(seekBar.getProgress()), 255, null, null, null, 14, null)));
        android.view.View view3 = this.AwvSrB;
        if (view3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            view = view3;
        }
        view.setAlpha(C33129mqd.djBIcL(C33129mqd.divS$default(java.lang.Integer.valueOf(seekBar.getProgress()), 255, null, null, null, 14, null)));
    }

    public final java.lang.String AEQbTJ(int i) {
        return pTB.formatPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(C33129mqd.divS$default(java.lang.Integer.valueOf(i), 255, null, null, null, 14, null)))), 0, null, 2, null);
    }

    public final void copydefault() {
        AbstractC36262oVg abstractC36262oVg = this.fIwbmz;
        if (abstractC36262oVg == null) {
            Intrinsics.gEmmrt("");
            abstractC36262oVg = null;
        }
        int iDbNXlk = abstractC36262oVg.DbNXlk();
        for (int i = 0; i < iDbNXlk; i++) {
            AbstractC36262oVg abstractC36262oVg2 = this.fIwbmz;
            if (abstractC36262oVg2 == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg2 = null;
            }
            Expression.Parameter parameterEZpvd = abstractC36262oVg2.EZpvd(i);
            if (parameterEZpvd.getTempValue() < parameterEZpvd.getMinValue()) {
                parameterEZpvd.setTempValue(parameterEZpvd.getMinValue());
            }
        }
        this.isConnected.notifyDataSetChanged();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [388=9, 411=23] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void values() {
        AbstractC36262oVg abstractC36262oVg;
        java.lang.String str = this.AuCTel;
        if (str == null) {
            Intrinsics.gEmmrt("");
            str = null;
        }
        java.lang.String str2 = this.fJNWhG;
        java.lang.String str3 = this.AuCTel;
        if (str3 == null) {
            Intrinsics.gEmmrt("");
            str3 = null;
        }
        java.lang.String strAEQbTJ = C36278oVw.AEQbTJ(str2, copydefault(str3));
        if (!android.text.TextUtils.isEmpty(strAEQbTJ)) {
            str = strAEQbTJ;
        }
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        java.lang.String str4 = this.fJNWhG;
        java.lang.String str5 = this.AuCTel;
        if (str5 == null) {
            Intrinsics.gEmmrt("");
            str5 = null;
        }
        AbstractC36262oVg abstractC36262oVgAEQbTJ = c36246oUrCopydefault.AEQbTJ(str4, str5);
        java.lang.String str6 = this.fJNWhG;
        java.lang.String str7 = this.AuCTel;
        if (str7 == null) {
            Intrinsics.gEmmrt("");
            str7 = null;
        }
        AbstractC36262oVg abstractC36262oVgOLrzqt = c36246oUrCopydefault.OLrzqt(str6 + ".indic" + str7);
        this.uzCIH = c36246oUrCopydefault.OLrzqt(this.fJNWhG + ".mVOLUME");
        this.AuCTelauCTel = c36246oUrCopydefault.OLrzqt(this.fJNWhG + ".indicVOLUME");
        int i = this.getFieldNames;
        if (i == 0) {
            java.lang.String strEjfBZ = abstractC36262oVgAEQbTJ != null ? abstractC36262oVgAEQbTJ.ejfBZ() : null;
            java.lang.String str8 = this.AuCTel;
            if (str8 == null) {
                Intrinsics.gEmmrt("");
                str8 = null;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) strEjfBZ, (java.lang.Object) str8)) {
                java.lang.String str9 = this.AuCTel;
                if (str9 == null) {
                    Intrinsics.gEmmrt("");
                    str9 = null;
                }
                switch (str9.hashCode()) {
                    case -1757553894:
                        if (str9.equals("VOLUME")) {
                            this.fIwbmz = new oVO(str, true);
                        }
                        break;
                    case -1266155568:
                        if (str9.equals("ENVELOPE")) {
                            this.fIwbmz = new C36277oVv(str);
                        }
                        break;
                    case -1213730046:
                        if (str9.equals("SUPERTREND")) {
                            this.fIwbmz = new oVM(str);
                        }
                        break;
                    case 2452:
                        if (str9.equals("MA")) {
                            this.fIwbmz = new oVA(str);
                        }
                        break;
                    case 2655:
                        if (str9.equals("SR")) {
                            this.fIwbmz = new oVK(str);
                        }
                        break;
                    case 68761:
                        if (str9.equals("EMA")) {
                            this.fIwbmz = new C36272oVq(str);
                        }
                        break;
                    case 81860:
                        if (str9.equals("SAR")) {
                            this.fIwbmz = new oVI(str);
                        }
                        break;
                    case 2044557:
                        if (str9.equals("BOLL")) {
                            this.fIwbmz = new C36266oVk(str);
                        }
                        break;
                    case 2647728:
                        if (str9.equals("VWAP")) {
                            this.fIwbmz = new oVQ(str);
                        }
                        break;
                }
            } else {
                this.fIwbmz = abstractC36262oVgAEQbTJ;
            }
        } else if (i == 1) {
            java.lang.String strEjfBZ2 = abstractC36262oVgOLrzqt != null ? abstractC36262oVgOLrzqt.ejfBZ() : null;
            java.lang.String str10 = this.AuCTel;
            if (str10 == null) {
                Intrinsics.gEmmrt("");
                str10 = null;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) strEjfBZ2, (java.lang.Object) str10)) {
                java.lang.String str11 = this.AuCTel;
                if (str11 == null) {
                    Intrinsics.gEmmrt("");
                    str11 = null;
                }
                switch (str11.hashCode()) {
                    case -1757553894:
                        if (str11.equals("VOLUME")) {
                            this.fIwbmz = new oVO(str, false);
                        }
                        break;
                    case -1266155568:
                        if (str11.equals("ENVELOPE")) {
                            this.fIwbmz = new C36277oVv(str);
                        }
                        break;
                    case -1213730046:
                        if (str11.equals("SUPERTREND")) {
                            this.fIwbmz = new oVM(str);
                        }
                        break;
                    case 2655:
                        if (str11.equals("SR")) {
                            this.fIwbmz = new oVK(str);
                        }
                        break;
                    case 2748:
                        if (str11.equals("VR")) {
                            this.fIwbmz = new oVR(str);
                        }
                        break;
                    case 2779:
                        if (str11.equals("WR")) {
                            this.fIwbmz = new oVV(str);
                        }
                        break;
                    case 66537:
                        if (str11.equals("CCI")) {
                            this.fIwbmz = new C36268oVm(str);
                        }
                        break;
                    case 67800:
                        if (str11.equals("DMA")) {
                            this.fIwbmz = new C36271oVp(str);
                        }
                        break;
                    case 67808:
                        if (str11.equals("DMI")) {
                            this.fIwbmz = new C36274oVs(str);
                        }
                        break;
                    case 68782:
                        if (str11.equals("EMV")) {
                            this.fIwbmz = new C36273oVr(str);
                        }
                        break;
                    case 74257:
                        if (str11.equals("KDJ")) {
                            this.fIwbmz = new C36279oVx(str);
                        }
                        break;
                    case 76678:
                        if (str11.equals("MTM")) {
                            this.fIwbmz = new C36280oVy(str);
                        }
                        break;
                    case 78051:
                        if (str11.equals("OBV")) {
                            this.fIwbmz = new oVH(str);
                        }
                        break;
                    case 79542:
                        if (str11.equals("PSY")) {
                            this.fIwbmz = new oVF(str);
                        }
                        break;
                    case 81318:
                        if (str11.equals("ROC")) {
                            this.fIwbmz = new oVD(str);
                        }
                        break;
                    case 81448:
                        if (str11.equals("RSI")) {
                            this.fIwbmz = new oVE(str);
                        }
                        break;
                    case 81860:
                        if (str11.equals("SAR")) {
                            this.fIwbmz = new oVI(str);
                        }
                        break;
                    case 2044557:
                        if (str11.equals("BOLL")) {
                            this.fIwbmz = new C36266oVk(str);
                        }
                        break;
                    case 2047105:
                        if (str11.equals("BRAR")) {
                            this.fIwbmz = new C36267oVl(str);
                        }
                        break;
                    case 2358517:
                        if (str11.equals("MACD")) {
                            this.fIwbmz = new oVC(str);
                        }
                        break;
                    case 2546910:
                        if (str11.equals("SKDJ")) {
                            this.fIwbmz = new oVJ(str);
                        }
                        break;
                    case 2583597:
                        if (str11.equals("TRIX")) {
                            this.fIwbmz = new oVN(str);
                        }
                        break;
                    case 1768025685:
                        if (str11.equals("StochRSI")) {
                            this.fIwbmz = new oVL(str);
                        }
                        break;
                }
            } else {
                this.fIwbmz = abstractC36262oVgOLrzqt;
            }
        }
        java.lang.String str12 = this.AuCTel;
        if (str12 == null) {
            Intrinsics.gEmmrt("");
            str12 = null;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str12, (java.lang.Object) "SAR")) {
            AbstractC36262oVg abstractC36262oVg2 = this.fIwbmz;
            if (abstractC36262oVg2 == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg2 = null;
            }
            abstractC36262oVg2.AkhnZx();
            AbstractC36262oVg abstractC36262oVg3 = this.fIwbmz;
            if (abstractC36262oVg3 == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg3 = null;
            }
            int iDbNXlk = abstractC36262oVg3.DbNXlk();
            for (int i2 = 0; i2 < iDbNXlk; i2++) {
                java.util.HashMap<java.lang.String, java.util.List<java.lang.Integer>> map = pDK.EZpvd;
                java.lang.String str13 = this.AuCTel;
                if (str13 == null) {
                    Intrinsics.gEmmrt("");
                    str13 = null;
                }
                if (map.get(str13) == null) {
                    java.lang.String str14 = this.AuCTel;
                    if (str14 == null) {
                        Intrinsics.gEmmrt("");
                        str14 = null;
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) str14, (java.lang.Object) "OBV")) {
                        java.util.ArrayList<java.lang.Object> arrayList = this.ejfBZ;
                        java.lang.String str15 = this.AuCTel;
                        if (str15 == null) {
                            Intrinsics.gEmmrt("");
                            str15 = null;
                        }
                        arrayList.add(new ActivityC37844pCu.Application("MAOBV", str15));
                    } else {
                        java.lang.String str16 = this.AuCTel;
                        if (str16 == null) {
                            Intrinsics.gEmmrt("");
                            str16 = null;
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) str16, (java.lang.Object) "VOLUME")) {
                            java.util.ArrayList<java.lang.Object> arrayList2 = this.ejfBZ;
                            java.lang.String str17 = "MA" + (i2 + 1);
                            java.lang.String str18 = this.AuCTel;
                            if (str18 == null) {
                                Intrinsics.gEmmrt("");
                                str18 = null;
                            }
                            arrayList2.add(new ActivityC37844pCu.Application(str17, str18));
                        } else {
                            java.util.ArrayList<java.lang.Object> arrayList3 = this.ejfBZ;
                            java.lang.String str19 = this.AuCTel;
                            if (str19 == null) {
                                Intrinsics.gEmmrt("");
                                str19 = null;
                            }
                            java.lang.String str20 = str19 + (i2 + 1);
                            java.lang.String str21 = this.AuCTel;
                            if (str21 == null) {
                                Intrinsics.gEmmrt("");
                                str21 = null;
                            }
                            arrayList3.add(new ActivityC37844pCu.Application(str20, str21));
                        }
                    }
                } else {
                    java.util.ArrayList<java.lang.Object> arrayList4 = this.ejfBZ;
                    java.lang.String str22 = this.AuCTel;
                    if (str22 == null) {
                        Intrinsics.gEmmrt("");
                        str22 = null;
                    }
                    java.util.List<java.lang.Integer> list = map.get(str22);
                    Intrinsics.copydefault(list);
                    java.lang.Integer num = list.get(i2);
                    Intrinsics.checkNotNullExpressionValue(num, "");
                    java.lang.String string = getString(num.intValue());
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    java.lang.String str23 = this.AuCTel;
                    if (str23 == null) {
                        Intrinsics.gEmmrt("");
                        str23 = null;
                    }
                    arrayList4.add(new ActivityC37844pCu.Application(string, str23));
                }
            }
            this.isConnected.setItems(this.ejfBZ);
            this.isConnected.notifyDataSetChanged();
        }
        java.lang.String str24 = this.fJNWhG;
        java.lang.String str25 = this.AuCTel;
        if (str25 == null) {
            Intrinsics.gEmmrt("");
            str25 = null;
        }
        java.lang.String strKWHzl = C36278oVw.KWHzl(str24, copydefault(str25));
        if (!android.text.TextUtils.isEmpty(strKWHzl)) {
            java.util.ArrayList<Expression.Parameter> arrayList5 = (java.util.ArrayList) new Gson().fromJson(strKWHzl, new Activity().getType());
            AbstractC36262oVg abstractC36262oVg4 = this.fIwbmz;
            if (abstractC36262oVg4 == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg4 = null;
            }
            pDS pds = pDS.OLrzqt;
            AbstractC36262oVg abstractC36262oVg5 = this.fIwbmz;
            if (abstractC36262oVg5 == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg = null;
            } else {
                abstractC36262oVg = abstractC36262oVg5;
            }
            java.util.ArrayList<Expression.Parameter> arrayListIsConnected = abstractC36262oVg.isConnected();
            Intrinsics.checkNotNullExpressionValue(arrayListIsConnected, "");
            Intrinsics.copydefault(arrayList5);
            abstractC36262oVg4.KWHzl(pds.EZpvd(arrayListIsConnected, arrayList5));
        }
        this.KWHzl = pDT.Companion.KWHzl().djBIcL();
        KWHzl();
    }

    public final void KWHzl() {
        AbstractC36262oVg abstractC36262oVg = this.fIwbmz;
        RecyclerView recyclerView = null;
        if (abstractC36262oVg == null) {
            Intrinsics.gEmmrt("");
            abstractC36262oVg = null;
        }
        abstractC36262oVg.fetchVPNInfo();
        java.lang.String str = this.AuCTel;
        if (str == null) {
            Intrinsics.gEmmrt("");
            str = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "VOLUME")) {
            return;
        }
        java.lang.String str2 = this.AuCTel;
        if (str2 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "MA")) {
            return;
        }
        java.lang.String str3 = this.AuCTel;
        if (str3 == null) {
            Intrinsics.gEmmrt("");
            str3 = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "EMA")) {
            return;
        }
        java.lang.String str4 = this.AuCTel;
        if (str4 == null) {
            Intrinsics.gEmmrt("");
            str4 = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "VWAP")) {
            return;
        }
        java.lang.String str5 = this.AuCTel;
        if (str5 == null) {
            Intrinsics.gEmmrt("");
            str5 = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) "RSI")) {
            C59534zip c59534zip = this.AubY;
            AbstractC36262oVg abstractC36262oVg2 = this.fIwbmz;
            if (abstractC36262oVg2 == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg2 = null;
            }
            java.util.ArrayList<Expression.Parameter> arrayListIsConnected = abstractC36262oVg2.isConnected();
            Intrinsics.checkNotNullExpressionValue(arrayListIsConnected, "");
            c59534zip.setItems(C56402yEa.EZpvd(CollectionsKt___CollectionsKt.wlaJM(arrayListIsConnected)));
        } else {
            C59534zip c59534zip2 = this.AubY;
            AbstractC36262oVg abstractC36262oVg3 = this.fIwbmz;
            if (abstractC36262oVg3 == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg3 = null;
            }
            c59534zip2.setItems(abstractC36262oVg3.isConnected());
        }
        this.AubY.register(Expression.Parameter.class, new Application());
        RecyclerView recyclerView2 = this.zsXlph;
        if (recyclerView2 == null) {
            Intrinsics.gEmmrt("");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView recyclerView3 = this.zsXlph;
        if (recyclerView3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            recyclerView = recyclerView3;
        }
        recyclerView.setAdapter(this.AubY);
    }

    private final void AkhnZx() {
        this.isConnected.register(ActivityC37844pCu.Application.class, new TaskDescription());
    }

    /* JADX INFO: loaded from: classes19.dex */
    public final class TaskDescription extends AbstractC59533zio<ActivityC37844pCu.Application, ActionBar> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
        }

        public final class ActionBar extends RecyclerView.ViewHolder {
            public final SnappingStepper AEQbTJ;
            public final android.widget.TextView AYXKKw;
            public final android.widget.ImageView EZpvd;
            public final android.widget.CheckBox KWHzl;
            public final android.widget.FrameLayout OLrzqt;
            public final /* synthetic */ TaskDescription copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.TextView AEQbTJ() {
                return this.AYXKKw;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.ImageView EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SnappingStepper KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.CheckBox OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.FrameLayout copydefault() {
                return this.OLrzqt;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull TaskDescription taskDescription, android.view.View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                this.copydefault = taskDescription;
                android.view.View viewFindViewById = view.findViewById(C35964oKf.StateListAnimator.getVolumeControl);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                this.AYXKKw = (android.widget.TextView) viewFindViewById;
                android.view.View viewFindViewById2 = view.findViewById(C35964oKf.StateListAnimator.onConnectionFailed);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
                this.AEQbTJ = (SnappingStepper) viewFindViewById2;
                android.view.View viewFindViewById3 = view.findViewById(C35964oKf.StateListAnimator.OTwTPd);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
                this.KWHzl = (android.widget.CheckBox) viewFindViewById3;
                android.view.View viewFindViewById4 = view.findViewById(C35964oKf.StateListAnimator.extraCallbackWithResult);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
                this.OLrzqt = (android.widget.FrameLayout) viewFindViewById4;
                android.view.View viewFindViewById5 = view.findViewById(C35964oKf.StateListAnimator.Dfv);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
                this.EZpvd = (android.widget.ImageView) viewFindViewById5;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.QkdxfA, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new ActionBar(this, viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Multi-variable search result rejected for r11v14, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r11v35, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r11v36, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v12, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v25, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(@NotNull final ActionBar actionBar, @NotNull ActivityC37844pCu.Application application) {
            T tCopydefault;
            java.lang.String colorTemp;
            java.lang.String colorBlkTemp;
            Intrinsics.checkNotNullParameter(actionBar, "");
            Intrinsics.checkNotNullParameter(application, "");
            actionBar.setIsRecyclable(false);
            actionBar.AEQbTJ().setText(application.EZpvd());
            actionBar.KWHzl().setButtonBackGround(C47244tmQ.Application.copydefault);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Unit unit = null;
            if (!Intrinsics.EZpvd((java.lang.Object) application.copydefault(), (java.lang.Object) "MA") && !Intrinsics.EZpvd((java.lang.Object) application.copydefault(), (java.lang.Object) "EMA") && !Intrinsics.EZpvd((java.lang.Object) application.copydefault(), (java.lang.Object) "VOLUME") && !Intrinsics.EZpvd((java.lang.Object) application.copydefault(), (java.lang.Object) "RSI") && !Intrinsics.EZpvd((java.lang.Object) application.copydefault(), (java.lang.Object) "VWAP")) {
                actionBar.OLrzqt().setVisibility(8);
                actionBar.copydefault().setVisibility(8);
            } else {
                actionBar.OLrzqt().setVisibility(Intrinsics.EZpvd((java.lang.Object) application.copydefault(), (java.lang.Object) "VWAP") ^ true ? 0 : 8);
                actionBar.copydefault().setVisibility(0);
                java.lang.String str = pCC.this.AuCTel;
                if (str == null) {
                    Intrinsics.gEmmrt("");
                    str = null;
                }
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "VOLUME")) {
                    AbstractC36262oVg abstractC36262oVg = pCC.this.fIwbmz;
                    if (abstractC36262oVg == null) {
                        Intrinsics.gEmmrt("");
                        abstractC36262oVg = null;
                    }
                    tCopydefault = abstractC36262oVg.copydefault(actionBar.getLayoutPosition() + 1);
                } else {
                    AbstractC36262oVg abstractC36262oVg2 = pCC.this.fIwbmz;
                    if (abstractC36262oVg2 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC36262oVg2 = null;
                    }
                    tCopydefault = abstractC36262oVg2.copydefault(actionBar.getLayoutPosition());
                }
                objectRef.element = tCopydefault;
            }
            AbstractC36262oVg abstractC36262oVg3 = pCC.this.fIwbmz;
            if (abstractC36262oVg3 == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg3 = null;
            }
            Expression.Parameter parameterEZpvd = abstractC36262oVg3.EZpvd(actionBar.getLayoutPosition());
            actionBar.KWHzl().setOnValueChangeListener(new C0912TaskDescription(pCC.this, parameterEZpvd, actionBar));
            android.graphics.drawable.Drawable background = actionBar.EZpvd().getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            Expression.Parameter parameter = (Expression.Parameter) objectRef.element;
            if (parameter != null && (colorBlkTemp = parameter.getColorBlkTemp()) != null) {
                java.lang.String strCopydefault = pDT.Companion.KWHzl().copydefault(colorBlkTemp);
                if (strCopydefault != null && gradientDrawable != null) {
                    gradientDrawable.setColor(Color.parseColor(strCopydefault));
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                }
            } else {
                Expression.Parameter parameter2 = (Expression.Parameter) objectRef.element;
                if (parameter2 != null && (colorTemp = parameter2.getColorTemp()) != null && gradientDrawable != null) {
                    gradientDrawable.setColor(Color.parseColor(colorTemp));
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            actionBar.KWHzl().setValue(C33129mqd.AhwBna(java.lang.Double.valueOf(parameterEZpvd.getTempValue())));
            actionBar.KWHzl().setMaxValue(C33129mqd.AhwBna(java.lang.Double.valueOf(parameterEZpvd.getMaxValue())));
            actionBar.KWHzl().setMinValue(C33129mqd.AhwBna(java.lang.Double.valueOf(parameterEZpvd.getMinValue())));
            android.widget.CheckBox checkBoxOLrzqt = actionBar.OLrzqt();
            Expression.Parameter parameter3 = (Expression.Parameter) objectRef.element;
            checkBoxOLrzqt.setChecked(parameter3 != null ? parameter3.getIsShowTemp() : false);
            actionBar.KWHzl().copydefault().setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(pCC.this, C32113mPz.ActionBar.zLjUOn)));
            actionBar.KWHzl().AEQbTJ().setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(pCC.this, C32113mPz.ActionBar.zLjUOn)));
            double tempValue = parameterEZpvd.getTempValue();
            if (tempValue == parameterEZpvd.getMinValue()) {
                actionBar.KWHzl().setLeftButtonResources(C52761wXj.TaskDescription.zDGrpR);
            } else if (tempValue == parameterEZpvd.getMaxValue()) {
                actionBar.KWHzl().setRightButtonResources(C52761wXj.TaskDescription.FQMcgEfQMcgE);
            } else {
                actionBar.KWHzl().setRightButtonResources(C52761wXj.TaskDescription.FQMcgEfQMcgE);
                actionBar.KWHzl().setLeftButtonResources(C52761wXj.TaskDescription.zDGrpR);
            }
            actionBar.OLrzqt().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.pCJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    pCC.TaskDescription.copydefault(objectRef, compoundButton, z);
                }
            });
            android.widget.FrameLayout frameLayoutCopydefault = actionBar.copydefault();
            final pCC pcc = pCC.this;
            frameLayoutCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.pCN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    pCC.TaskDescription.AEQbTJ(objectRef, pcc, actionBar, view);
                }
            });
        }

        /* JADX INFO: renamed from: o.pCC$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0912TaskDescription implements pCO {
            public final /* synthetic */ ActionBar AEQbTJ;
            public final /* synthetic */ pCC EZpvd;
            public final /* synthetic */ Expression.Parameter KWHzl;

            public C0912TaskDescription(pCC pcc, Expression.Parameter parameter, ActionBar actionBar) {
                this.EZpvd = pcc;
                this.KWHzl = parameter;
                this.AEQbTJ = actionBar;
            }

            @Override // o.pCO
            public void OLrzqt(android.view.View view, int i) {
                this.EZpvd.getTAG();
                this.KWHzl.setTempValue(C33129mqd.AEQbTJ(java.lang.Integer.valueOf(i)));
                this.AEQbTJ.KWHzl().copydefault().setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(this.EZpvd, C32113mPz.ActionBar.zLjUOn)));
                this.AEQbTJ.KWHzl().AEQbTJ().setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(this.EZpvd, C32113mPz.ActionBar.zLjUOn)));
                double tempValue = this.KWHzl.getTempValue();
                if (tempValue == this.KWHzl.getMinValue()) {
                    this.AEQbTJ.KWHzl().setLeftButtonResources(C52761wXj.TaskDescription.zDGrpR);
                } else if (tempValue == this.KWHzl.getMaxValue()) {
                    this.AEQbTJ.KWHzl().setRightButtonResources(C52761wXj.TaskDescription.FQMcgEfQMcgE);
                } else {
                    this.AEQbTJ.KWHzl().setRightButtonResources(C52761wXj.TaskDescription.FQMcgEfQMcgE);
                    this.AEQbTJ.KWHzl().setLeftButtonResources(C52761wXj.TaskDescription.zDGrpR);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void copydefault(Ref.ObjectRef objectRef, android.widget.CompoundButton compoundButton, boolean z) {
            Expression.Parameter parameter = (Expression.Parameter) objectRef.element;
            if (parameter != null) {
                parameter.setIsShowTemp(z);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void AEQbTJ(Ref.ObjectRef objectRef, pCC pcc, ActionBar actionBar, android.view.View view) {
            Expression.Parameter parameter = (Expression.Parameter) objectRef.element;
            if (parameter != null) {
                pcc.EZpvd(actionBar.OLrzqt(), actionBar.EZpvd(), parameter);
            }
        }
    }

    public final class Application extends AbstractC59533zio<Expression.Parameter, Activity> {
        public static int AEQbTJ;
        public static int EZpvd;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }

        /* JADX INFO: loaded from: classes19.dex */
        public final class Activity extends RecyclerView.ViewHolder {
            public final ConstraintLayout AEQbTJ;
            public final /* synthetic */ Application AYXKKw;
            public final android.widget.TextView AhwBna;
            public final android.widget.RelativeLayout EZpvd;
            public final android.widget.SeekBar KWHzl;
            public final android.widget.ImageView OLrzqt;
            public final android.widget.CheckBox copydefault;
            public final android.widget.TextView gEmmrt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.CheckBox AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.TextView AhwBna() {
                return this.gEmmrt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.SeekBar EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.RelativeLayout KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.ImageView OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ConstraintLayout copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.TextView djBIcL() {
                return this.AhwBna;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull Application application, android.view.View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                this.AYXKKw = application;
                android.view.View viewFindViewById = view.findViewById(C35964oKf.StateListAnimator.hUfVAv);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                this.copydefault = (android.widget.CheckBox) viewFindViewById;
                android.view.View viewFindViewById2 = view.findViewById(C35964oKf.StateListAnimator.getVolumeControl);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
                this.AhwBna = (android.widget.TextView) viewFindViewById2;
                android.view.View viewFindViewById3 = view.findViewById(C35964oKf.StateListAnimator.extraCallbackWithResult);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
                this.EZpvd = (android.widget.RelativeLayout) viewFindViewById3;
                android.view.View viewFindViewById4 = view.findViewById(C35964oKf.StateListAnimator.Dfv);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
                this.OLrzqt = (android.widget.ImageView) viewFindViewById4;
                android.view.View viewFindViewById5 = view.findViewById(C35964oKf.StateListAnimator.QDqgQU);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
                this.AEQbTJ = (ConstraintLayout) viewFindViewById5;
                android.view.View viewFindViewById6 = view.findViewById(C35964oKf.StateListAnimator.ITrustedWebActivityCallbackStubProxy);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
                this.KWHzl = (android.widget.SeekBar) viewFindViewById6;
                android.view.View viewFindViewById7 = view.findViewById(C35964oKf.StateListAnimator.setVolumeTo);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
                this.gEmmrt = (android.widget.TextView) viewFindViewById7;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.RdAHlO, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new Activity(this, viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(@NotNull final Activity activity, @NotNull final Expression.Parameter parameter) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(parameter, "");
            activity.setIsRecyclable(false);
            java.lang.String str = pCC.this.AuCTel;
            Unit unit = null;
            if (str == null) {
                Intrinsics.gEmmrt("");
                str = null;
            }
            java.lang.String strAYXKKw = "SAR";
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SAR")) {
                java.lang.String str2 = pCC.this.AuCTel;
                if (str2 == null) {
                    Intrinsics.gEmmrt("");
                    str2 = null;
                }
                if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SR")) {
                    java.lang.String str3 = pCC.this.AuCTel;
                    if (str3 == null) {
                        Intrinsics.gEmmrt("");
                        str3 = null;
                    }
                    if (!Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "SUPERTREND")) {
                        activity.AEQbTJ().setVisibility(0);
                        activity.AEQbTJ().setChecked(parameter.getIsShowTemp());
                    }
                }
            } else {
                activity.AEQbTJ().setVisibility(8);
            }
            java.lang.String str4 = pCC.this.AuCTel;
            if (str4 == null) {
                Intrinsics.gEmmrt("");
                str4 = null;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "SAR")) {
                strAYXKKw = Intrinsics.EZpvd((java.lang.Object) parameter.getName(), (java.lang.Object) "BG") ? C33070mpX.AYXKKw(C35964oKf.Fragment.DzCpqu) : parameter.getName();
            }
            activity.djBIcL().setText(strAYXKKw);
            android.graphics.drawable.Drawable background = activity.OLrzqt().getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            java.lang.String colorBlkTemp = parameter.getColorBlkTemp();
            if (colorBlkTemp != null) {
                java.lang.String strCopydefault = pDT.Companion.KWHzl().copydefault(colorBlkTemp);
                if (strCopydefault != null && gradientDrawable != null) {
                    gradientDrawable.setColor(Color.parseColor(strCopydefault));
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                }
            } else {
                java.lang.String colorTemp = parameter.getColorTemp();
                if (colorTemp != null && gradientDrawable != null) {
                    gradientDrawable.setColor(Color.parseColor(colorTemp));
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            activity.OLrzqt().setAlpha(1.0f);
            activity.AEQbTJ().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.pCL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    pCC.Application.OLrzqt(parameter, compoundButton, z);
                }
            });
            android.widget.RelativeLayout relativeLayoutKWHzl = activity.KWHzl();
            final pCC pcc = pCC.this;
            relativeLayoutKWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.pCS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    pCC.Application.KWHzl(pcc, activity, parameter, view);
                }
            });
            if (parameter.getCanChangeTransparency()) {
                activity.copydefault().setVisibility(0);
                activity.OLrzqt().setAlpha(C33129mqd.djBIcL(C33129mqd.divS$default(java.lang.Integer.valueOf(parameter.getTransparencyTemp()), 255, null, null, null, 14, null)));
                activity.EZpvd().setProgress(parameter.getTransparencyTemp());
                activity.AhwBna().setText(pCC.this.AEQbTJ(parameter.getTransparencyTemp()));
                activity.EZpvd().setOnSeekBarChangeListener(new TaskDescription(activity, pCC.this, parameter));
                return;
            }
            activity.copydefault().setVisibility(8);
        }

        public static final void OLrzqt(Expression.Parameter parameter, android.widget.CompoundButton compoundButton, boolean z) {
            parameter.setIsShowTemp(z);
        }

        public static final void KWHzl(pCC pcc, Activity activity, Expression.Parameter parameter, android.view.View view) {
            pcc.EZpvd(activity.AEQbTJ(), activity.OLrzqt(), parameter);
        }

        public static final class TaskDescription implements SeekBar.OnSeekBarChangeListener {
            public final /* synthetic */ Expression.Parameter AEQbTJ;
            public final /* synthetic */ Activity OLrzqt;
            public final /* synthetic */ pCC copydefault;

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
            }

            public TaskDescription(Activity activity, pCC pcc, Expression.Parameter parameter) {
                this.OLrzqt = activity;
                this.copydefault = pcc;
                this.AEQbTJ = parameter;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
                this.OLrzqt.AhwBna().setText(this.copydefault.AEQbTJ(i));
                this.OLrzqt.OLrzqt().setAlpha(C33129mqd.djBIcL(C33129mqd.divS$default(java.lang.Integer.valueOf(i), 255, null, null, null, 14, null)));
                this.AEQbTJ.setTransparencyTemp(i);
            }
        }

        public static int OLrzqt() {
            int i = EZpvd;
            int i2 = i % 7891978;
            EZpvd = i + 1;
            if (i2 != 0) {
                return AEQbTJ;
            }
            int iFreeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
            AEQbTJ = iFreeMemory;
            return iFreeMemory;
        }
    }

    public final void AhwBna() {
        AbstractC36262oVg abstractC36262oVg = this.fIwbmz;
        if (abstractC36262oVg == null) {
            Intrinsics.gEmmrt("");
            abstractC36262oVg = null;
        }
        abstractC36262oVg.EZpvd();
        AbstractC36262oVg abstractC36262oVg2 = this.fIwbmz;
        if (abstractC36262oVg2 == null) {
            Intrinsics.gEmmrt("");
            abstractC36262oVg2 = null;
        }
        abstractC36262oVg2.fJNWhG();
        java.lang.String str = this.fJNWhG;
        AbstractC36262oVg abstractC36262oVg3 = this.fIwbmz;
        if (abstractC36262oVg3 == null) {
            Intrinsics.gEmmrt("");
            abstractC36262oVg3 = null;
        }
        java.lang.String strEjfBZ = abstractC36262oVg3.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        java.lang.String strCopydefault = copydefault(strEjfBZ);
        AbstractC36262oVg abstractC36262oVg4 = this.fIwbmz;
        if (abstractC36262oVg4 == null) {
            Intrinsics.gEmmrt("");
            abstractC36262oVg4 = null;
        }
        C36278oVw.KWHzl(str, strCopydefault, abstractC36262oVg4.AuCTel());
        AbstractC36262oVg abstractC36262oVg5 = this.fIwbmz;
        if (abstractC36262oVg5 == null) {
            Intrinsics.gEmmrt("");
            abstractC36262oVg5 = null;
        }
        if (abstractC36262oVg5.values() > 0) {
            AbstractC36262oVg abstractC36262oVg6 = this.fIwbmz;
            if (abstractC36262oVg6 == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg6 = null;
            }
            abstractC36262oVg6.copydefault();
            java.lang.String str2 = this.fJNWhG;
            AbstractC36262oVg abstractC36262oVg7 = this.fIwbmz;
            if (abstractC36262oVg7 == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg7 = null;
            }
            java.lang.String strEjfBZ2 = abstractC36262oVg7.ejfBZ();
            Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
            java.lang.String strCopydefault2 = copydefault(strEjfBZ2);
            Gson gson = new Gson();
            AbstractC36262oVg abstractC36262oVg8 = this.fIwbmz;
            if (abstractC36262oVg8 == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg8 = null;
            }
            C36278oVw.copydefault(str2, strCopydefault2, gson.toJson(abstractC36262oVg8.isConnected()));
        }
        java.lang.String str3 = this.AuCTel;
        if (str3 == null) {
            Intrinsics.gEmmrt("");
            str3 = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "VOLUME") && this.getFieldNames == 0) {
            gEmmrt();
        }
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && C36246oUr.copydefault().RdAHlO()) {
            fetchVPNInfo();
        } else {
            finish();
        }
    }

    public final void fetchVPNInfo() {
        boolean zGEmmrt;
        java.lang.String str;
        java.lang.String strOLrzqt;
        if (this.getFieldNames == 0) {
            C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
            java.lang.String str2 = this.fJNWhG;
            java.lang.String str3 = this.AuCTel;
            if (str3 == null) {
                Intrinsics.gEmmrt("");
                str3 = null;
            }
            zGEmmrt = c36246oUrCopydefault.KWHzl(str2, str3);
        } else {
            C36246oUr c36246oUrCopydefault2 = C36246oUr.copydefault();
            java.lang.String str4 = this.fJNWhG;
            java.lang.String str5 = this.AuCTel;
            if (str5 == null) {
                Intrinsics.gEmmrt("");
                str5 = null;
            }
            zGEmmrt = c36246oUrCopydefault2.gEmmrt(str4, str5);
        }
        java.lang.String str6 = this.AuCTel;
        if (str6 == null) {
            Intrinsics.gEmmrt("");
            str6 = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str6, (java.lang.Object) "BOLL")) {
            str = "BB";
        } else {
            java.lang.String str7 = this.AuCTel;
            if (str7 == null) {
                Intrinsics.gEmmrt("");
                str7 = null;
            }
            if (Intrinsics.EZpvd((java.lang.Object) str7, (java.lang.Object) "StochRSI")) {
                str = "STOCH_RSI";
            } else {
                str = this.AuCTel;
                if (str == null) {
                    Intrinsics.gEmmrt("");
                    str = null;
                }
            }
        }
        IndicatorBean indicatorBean = new IndicatorBean(str, this.getFieldNames == 0, null, java.lang.Boolean.valueOf(zGEmmrt));
        C37957pGz c37957pGz = C37957pGz.copydefault;
        InterfaceC37953pGv interfaceC37953pGvOLrzqt = c37957pGz.OLrzqt(str);
        if (interfaceC37953pGvOLrzqt != null) {
            AbstractC36262oVg abstractC36262oVg = this.fIwbmz;
            if (abstractC36262oVg == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg = null;
            }
            strOLrzqt = interfaceC37953pGvOLrzqt.OLrzqt(abstractC36262oVg, indicatorBean, zGEmmrt);
        } else {
            strOLrzqt = null;
        }
        if (strOLrzqt != null) {
            showLoading();
            if (this.getFieldNames == 0) {
                str = str + c37957pGz.OLrzqt();
            }
            IndicatorDataReq indicatorDataReq = new IndicatorDataReq(str, strOLrzqt, zGEmmrt ? "0" : "1", null, 8, null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(indicatorDataReq);
            if (C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null)).uploadIndicatorData(arrayList), this), new Function1() { // from class: o.pCM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return pCC.OLrzqt(this.OLrzqt, (java.lang.Throwable) obj);
                }
            }, (Function0) null, new Function1() { // from class: o.pCK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return pCC.EZpvd(this.OLrzqt, (ResponseData) obj);
                }
            }, 2, (java.lang.Object) null) != null) {
                return;
            }
        }
        finish();
        Unit unit = Unit.INSTANCE;
    }

    public static final Unit EZpvd(pCC pcc, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        pcc.dismissLoading();
        SPUtils.put("kline_indicator_version", responseData.getData());
        Objects.toString(responseData.getData());
        pcc.finish();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(pCC pcc, java.lang.Throwable th) {
        JsonPrimitive asJsonPrimitive;
        Intrinsics.checkNotNullParameter(th, "");
        pcc.dismissLoading();
        if (th instanceof OKServerException) {
            OKServerException oKServerException = (OKServerException) th;
            int code = oKServerException.getCode();
            JsonObject response = oKServerException.getResponse();
            pUU.copydefault("Indicator", "uploadIndicatorData: code = " + code + " errorMessage = " + ((response == null || (asJsonPrimitive = response.getAsJsonPrimitive(EopTrackEvent.KEY_ERROR_MESSAGE)) == null) ? null : asJsonPrimitive.getAsString()));
        } else {
            pUU.copydefault("Indicator", "uploadIndicatorData: error = " + th.getMessage());
        }
        pcc.finish();
        return Unit.INSTANCE;
    }

    public final java.lang.String copydefault(java.lang.String str) {
        if (this.getFieldNames == 0) {
            return str;
        }
        return str + "_sub";
    }

    public final void gEmmrt() {
        AbstractC36262oVg abstractC36262oVg = this.uzCIH;
        if (abstractC36262oVg != null) {
            AbstractC36262oVg abstractC36262oVg2 = this.fIwbmz;
            if (abstractC36262oVg2 == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg2 = null;
            }
            int iDbNXlk = abstractC36262oVg2.DbNXlk();
            for (int i = 0; i < iDbNXlk; i++) {
                Expression.Parameter parameterEZpvd = abstractC36262oVg.EZpvd(i);
                AbstractC36262oVg abstractC36262oVg3 = this.fIwbmz;
                if (abstractC36262oVg3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC36262oVg3 = null;
                }
                parameterEZpvd.setTempValue(abstractC36262oVg3.EZpvd(i).getTempValue());
                Expression.Parameter parameterEZpvd2 = abstractC36262oVg.EZpvd(i);
                AbstractC36262oVg abstractC36262oVg4 = this.fIwbmz;
                if (abstractC36262oVg4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC36262oVg4 = null;
                }
                parameterEZpvd2.setValue(abstractC36262oVg4.EZpvd(i).getValue());
            }
            abstractC36262oVg.EZpvd();
            abstractC36262oVg.fJNWhG();
            C36278oVw.KWHzl(this.fJNWhG, abstractC36262oVg.ejfBZ(), abstractC36262oVg.AuCTel());
        }
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        C33567myr.AEQbTJ(this, valueOf());
        C33494mxX.copydefault.EZpvd(this, valueOf());
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C33565myp.EZpvd().OLrzqt();
    }

    public final void EZpvd(android.view.View view, final android.view.View view2, final Expression.Parameter parameter) {
        this.fARcdN = new C39587pvE(this, this.KWHzl, new Function1() { // from class: o.pCA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pCC.AEQbTJ(this.EZpvd, view2, parameter, (oLO) obj);
            }
        }, null, null, 24, null);
        int iOLrzqt = C55302xhQ.OLrzqt(this);
        C39587pvE c39587pvE = this.fARcdN;
        if (c39587pvE != null) {
            iOLrzqt -= c39587pvE.KWHzl() + this.AhwBna;
        }
        C39587pvE c39587pvE2 = this.fARcdN;
        if (c39587pvE2 != null) {
            java.lang.String strCopydefault = pDT.Companion.KWHzl().copydefault(parameter.getColorBlkTemp());
            if (strCopydefault == null) {
                strCopydefault = parameter.getColorTemp();
            }
            Intrinsics.copydefault((java.lang.Object) strCopydefault);
            C39587pvE.setSelectedColorAndPos$default(c39587pvE2, strCopydefault, false, false, false, null, 28, null);
        }
        C39587pvE c39587pvE3 = this.fARcdN;
        if (c39587pvE3 != null) {
            c39587pvE3.showAsDropDown(view, iOLrzqt, this.AEQbTJ, 8388611);
        }
    }

    public static final Unit AEQbTJ(pCC pcc, android.view.View view, Expression.Parameter parameter, oLO olo) {
        Intrinsics.checkNotNullParameter(olo, "");
        C39587pvE c39587pvE = pcc.fARcdN;
        if (c39587pvE != null) {
            c39587pvE.dismiss();
        }
        pcc.fARcdN = null;
        android.graphics.drawable.Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        java.lang.String strOLrzqt = Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.KWHzl(), (java.lang.Object) "kline_white") ? olo.OLrzqt() : olo.EZpvd();
        if (gradientDrawable != null) {
            gradientDrawable.setColor(Color.parseColor(strOLrzqt));
        }
        parameter.setColorTemp(strOLrzqt);
        parameter.setColorBlkTemp(olo.copydefault());
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
