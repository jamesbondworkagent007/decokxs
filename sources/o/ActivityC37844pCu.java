package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.ui.view.setting.IndicatorListActivity$onCreate$1;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.ActivityC37844pCu;
import o.C35964oKf;
import o.InterfaceC49363unD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pCu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ActivityC37844pCu extends AbstractActivityC33041mov implements InterfaceC49363unD {
    public RecyclerView AhwBna;
    public boolean djBIcL;
    public boolean valueOf;
    public final /* synthetic */ C39267ppA KWHzl = new C39267ppA();
    public final oUN AEQbTJ = oUN.Companion.OLrzqt();
    public java.util.ArrayList<java.lang.Object> copydefault = new java.util.ArrayList<>();
    public final C59534zip EZpvd = new C59534zip();
    public java.lang.String gEmmrt = "";
    public int OLrzqt = C55298xhM.dp2px$default(8.0f, null, 1, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        this.KWHzl.OLrzqt(abstractActivityC33041mov);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ() {
        return this.KWHzl.OLrzqt();
    }

    public <T extends InterfaceC49369unJ<T>> java.lang.Object EZpvd(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Unit> continuation) {
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

    /* JADX INFO: renamed from: o.pCu$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator {
        public final java.lang.String AEQbTJ;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = str;
            this.copydefault = str2;
        }
    }

    /* JADX INFO: renamed from: o.pCu$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application {
        public final java.lang.String AEQbTJ;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        public Application(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = str;
            this.copydefault = str2;
        }
    }

    /* JADX INFO: renamed from: o.pCu$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class TaskDescription {
        public java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        public TaskDescription(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = str;
            this.OLrzqt = str2;
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ((AbstractActivityC33041mov) this);
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra;
        super.onCreate(bundle);
        setContentView(C35964oKf.Application.AEQbTJ);
        android.view.View viewFindViewById = findViewById(C35964oKf.StateListAnimator.hfdhUn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        ((C33537myN) viewFindViewById).setTitle(getString(C35964oKf.Fragment.aJFbMH));
        this.AhwBna = (RecyclerView) findViewById(C35964oKf.StateListAnimator.arDRxL);
        android.content.Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra(oLT.valueOf())) == null) {
            stringExtra = "";
        }
        this.gEmmrt = stringExtra;
        OLrzqt();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        RecyclerView recyclerView = this.AhwBna;
        if (recyclerView == null) {
            Intrinsics.gEmmrt("");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.AhwBna;
        if (recyclerView2 == null) {
            Intrinsics.gEmmrt("");
            recyclerView2 = null;
        }
        recyclerView2.setAdapter(this.EZpvd);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new IndicatorListActivity$onCreate$1(this, null), 3, null);
        EZpvd();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.pCz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC37844pCu.valueOf(this.OLrzqt);
            }
        });
    }

    public static final void valueOf(ActivityC37844pCu activityC37844pCu) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC37844pCu, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void OLrzqt() {
        this.EZpvd.register(java.lang.String.class, new pCQ());
        this.EZpvd.register(StateListAnimator.class, new C37833pCj(new Function1() { // from class: o.pCx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC37844pCu.copydefault(this.OLrzqt, (ActivityC37844pCu.StateListAnimator) obj);
            }
        }));
        this.EZpvd.register(Application.class, new C37846pCw(new Function1() { // from class: o.pCB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC37844pCu.KWHzl(this.EZpvd, (ActivityC37844pCu.Application) obj);
            }
        }));
        this.EZpvd.register(TaskDescription.class, new pCR(new Function1() { // from class: o.pCD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC37844pCu.AEQbTJ(this.KWHzl, (ActivityC37844pCu.TaskDescription) obj);
            }
        }));
        this.EZpvd.register(java.lang.Integer.class, new Activity());
    }

    public static final Unit copydefault(ActivityC37844pCu activityC37844pCu, StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        android.content.Intent intent = new android.content.Intent(activityC37844pCu, (java.lang.Class<?>) ActivityC37837pCn.class);
        intent.putExtra("Title", stateListAnimator.KWHzl());
        intent.putExtra("IndicatorName", stateListAnimator.OLrzqt());
        activityC37844pCu.startActivity(intent);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC37844pCu activityC37844pCu, Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        android.content.Intent intent = new android.content.Intent(activityC37844pCu, (java.lang.Class<?>) pCC.class);
        intent.putExtra("Title", application.EZpvd());
        intent.putExtra("IndicatorName", application.copydefault());
        intent.putExtra("Type", 1);
        activityC37844pCu.startActivity(intent);
        activityC37844pCu.EZpvd(application.copydefault());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC37844pCu activityC37844pCu, TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        android.content.Intent intent = new android.content.Intent(activityC37844pCu, (java.lang.Class<?>) pCC.class);
        intent.putExtra("Title", taskDescription.KWHzl());
        intent.putExtra("IndicatorName", taskDescription.copydefault());
        intent.putExtra("Type", 0);
        activityC37844pCu.startActivity(intent);
        activityC37844pCu.copydefault(taskDescription.copydefault());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.pCu$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity extends AbstractC59533zio<java.lang.Integer, RecyclerView.ViewHolder> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(num, "");
        }

        /* JADX INFO: renamed from: o.pCu$Activity$Activity, reason: collision with other inner class name */
        public static final class C0913Activity extends RecyclerView.ViewHolder {
            public C0913Activity(android.view.View view) {
                super(view);
            }
        }

        @Override // o.AbstractC59533zio
        public RecyclerView.ViewHolder onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return new C0913Activity(layoutInflater.inflate(C35964oKf.Application.fERRXa, viewGroup, false));
        }
    }

    public final void EZpvd(java.lang.String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1757553894) {
            if (iHashCode != 81860) {
                if (iHashCode == 2044557 && str.equals("BOLL")) {
                    str = "BOLL_SUB";
                }
            } else if (str.equals("SAR")) {
                str = "SAR_SUB";
            }
        } else if (str.equals("VOLUME")) {
            str = "VOLUME_SUB";
        }
        C37908pFd.copydefault(str, C36246oUr.copydefault().RKDWNf());
    }

    public final void copydefault(java.lang.String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1757553894) {
            if (iHashCode != 81860) {
                if (iHashCode == 2044557 && str.equals("BOLL")) {
                    str = "BOLL_MAIN";
                }
            } else if (str.equals("SAR")) {
                str = "SAR_MAIN";
            }
        } else if (str.equals("VOLUME")) {
            str = "VOLUME_MAIN";
        }
        C37908pFd.copydefault(str, C36246oUr.copydefault().RKDWNf());
    }

    private final void EZpvd() {
        this.copydefault.add(getString(C35964oKf.Fragment.dLBcXg));
        java.util.ArrayList<java.lang.Object> arrayList = this.copydefault;
        java.lang.String string = getString(C35964oKf.Fragment.setLocationManually);
        Intrinsics.checkNotNullExpressionValue(string, "");
        arrayList.add(new TaskDescription(string, "VOLUME"));
        java.util.ArrayList<java.lang.Object> arrayList2 = this.copydefault;
        java.lang.String string2 = getString(C35964oKf.Fragment.RihMUf);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        arrayList2.add(new TaskDescription(string2, "MA"));
        java.util.ArrayList<java.lang.Object> arrayList3 = this.copydefault;
        java.lang.String string3 = getString(C35964oKf.Fragment.zzJhsT);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        arrayList3.add(new TaskDescription(string3, "EMA"));
        java.util.ArrayList<java.lang.Object> arrayList4 = this.copydefault;
        java.lang.String string4 = getString(C35964oKf.Fragment.GhqvEQ);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        arrayList4.add(new TaskDescription(string4, "BOLL"));
        java.util.ArrayList<java.lang.Object> arrayList5 = this.copydefault;
        java.lang.String string5 = getString(C35964oKf.Fragment.DQnQnb);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        arrayList5.add(new TaskDescription(string5, "SAR"));
        if (!Intrinsics.EZpvd((java.lang.Object) C36246oUr.copydefault().zLjUOn().getChartTag(), (java.lang.Object) "sp_timeinterval_okx_cedefi") && pFS.KWHzl.valueOf()) {
            this.copydefault.add(new TaskDescription(C33070mpX.AYXKKw(C35964oKf.Fragment.geAOna), "SR"));
        }
        if (!Intrinsics.EZpvd((java.lang.Object) C36246oUr.copydefault().zLjUOn().getMode(), (java.lang.Object) "cedefi_mode") && pFS.KWHzl.djBIcL()) {
            this.copydefault.add(new TaskDescription(C33070mpX.AYXKKw(C35964oKf.Fragment.hGuIrQ), "SUPERTREND"));
        }
        if (!Intrinsics.EZpvd((java.lang.Object) C36246oUr.copydefault().zLjUOn().getMode(), (java.lang.Object) "cedefi_mode") && pFS.KWHzl.KWHzl()) {
            this.copydefault.add(new TaskDescription(C33070mpX.AYXKKw(C35964oKf.Fragment.HJWChPQPAeHI), "ENVELOPE"));
        }
        if (!Intrinsics.EZpvd((java.lang.Object) C36246oUr.copydefault().zLjUOn().getMode(), (java.lang.Object) "cedefi_mode") && pFS.KWHzl.KWHzl()) {
            this.copydefault.add(new TaskDescription(C33070mpX.AYXKKw(C35964oKf.Fragment.setPageName), "VWAP"));
        }
        this.copydefault.add(1);
        this.copydefault.add(getString(C35964oKf.Fragment.QiTXOm));
        java.util.ArrayList<java.lang.Object> arrayList6 = this.copydefault;
        java.lang.String string6 = getString(C35964oKf.Fragment.setLocationManually);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        arrayList6.add(new Application(string6, "VOLUME"));
        java.util.ArrayList<java.lang.Object> arrayList7 = this.copydefault;
        java.lang.String string7 = getString(C35964oKf.Fragment.QMuEJi);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        arrayList7.add(new Application(string7, "MACD"));
        java.util.ArrayList<java.lang.Object> arrayList8 = this.copydefault;
        java.lang.String string8 = getString(C35964oKf.Fragment.RcvFxC);
        Intrinsics.checkNotNullExpressionValue(string8, "");
        arrayList8.add(new Application(string8, "KDJ"));
        java.util.ArrayList<java.lang.Object> arrayList9 = this.copydefault;
        java.lang.String string9 = getString(C35964oKf.Fragment.sElUiK);
        Intrinsics.checkNotNullExpressionValue(string9, "");
        arrayList9.add(new Application(string9, "SKDJ"));
        java.util.ArrayList<java.lang.Object> arrayList10 = this.copydefault;
        java.lang.String string10 = getString(C35964oKf.Fragment.GhqvEQ);
        Intrinsics.checkNotNullExpressionValue(string10, "");
        arrayList10.add(new Application(string10, "BOLL"));
        java.util.ArrayList<java.lang.Object> arrayList11 = this.copydefault;
        java.lang.String string11 = getString(C35964oKf.Fragment.pause);
        Intrinsics.checkNotNullExpressionValue(string11, "");
        arrayList11.add(new Application(string11, "RSI"));
        java.util.ArrayList<java.lang.Object> arrayList12 = this.copydefault;
        java.lang.String string12 = getString(C35964oKf.Fragment.getLocation);
        Intrinsics.checkNotNullExpressionValue(string12, "");
        arrayList12.add(new Application(string12, "StochRSI"));
        java.util.ArrayList<java.lang.Object> arrayList13 = this.copydefault;
        java.lang.String string13 = getString(C35964oKf.Fragment.OmJATG);
        Intrinsics.checkNotNullExpressionValue(string13, "");
        arrayList13.add(new Application(string13, "OBV"));
        java.util.ArrayList<java.lang.Object> arrayList14 = this.copydefault;
        java.lang.String string14 = getString(C35964oKf.Fragment.DQnQnb);
        Intrinsics.checkNotNullExpressionValue(string14, "");
        arrayList14.add(new Application(string14, "SAR"));
        java.util.ArrayList<java.lang.Object> arrayList15 = this.copydefault;
        java.lang.String string15 = getString(C35964oKf.Fragment.GiPPlL);
        Intrinsics.checkNotNullExpressionValue(string15, "");
        arrayList15.add(new Application(string15, "DMA"));
        java.util.ArrayList<java.lang.Object> arrayList16 = this.copydefault;
        java.lang.String string16 = getString(C35964oKf.Fragment.GiPPlLQAswws);
        Intrinsics.checkNotNullExpressionValue(string16, "");
        arrayList16.add(new Application(string16, "TRIX"));
        java.util.ArrayList<java.lang.Object> arrayList17 = this.copydefault;
        java.lang.String string17 = getString(C35964oKf.Fragment.zvzmfz);
        Intrinsics.checkNotNullExpressionValue(string17, "");
        arrayList17.add(new Application(string17, "VR"));
        java.util.ArrayList<java.lang.Object> arrayList18 = this.copydefault;
        java.lang.String string18 = getString(C35964oKf.Fragment.RckOJh);
        Intrinsics.checkNotNullExpressionValue(string18, "");
        arrayList18.add(new Application(string18, "BRAR"));
        java.util.ArrayList<java.lang.Object> arrayList19 = this.copydefault;
        java.lang.String string19 = getString(C35964oKf.Fragment.idLUrz);
        Intrinsics.checkNotNullExpressionValue(string19, "");
        arrayList19.add(new Application(string19, "EMV"));
        java.util.ArrayList<java.lang.Object> arrayList20 = this.copydefault;
        java.lang.String string20 = getString(C35964oKf.Fragment.unregister);
        Intrinsics.checkNotNullExpressionValue(string20, "");
        arrayList20.add(new Application(string20, "WR"));
        java.util.ArrayList<java.lang.Object> arrayList21 = this.copydefault;
        java.lang.String string21 = getString(C35964oKf.Fragment.resume);
        Intrinsics.checkNotNullExpressionValue(string21, "");
        arrayList21.add(new Application(string21, "ROC"));
        java.util.ArrayList<java.lang.Object> arrayList22 = this.copydefault;
        java.lang.String string22 = getString(C35964oKf.Fragment.config);
        Intrinsics.checkNotNullExpressionValue(string22, "");
        arrayList22.add(new Application(string22, "MTM"));
        java.util.ArrayList<java.lang.Object> arrayList23 = this.copydefault;
        java.lang.String string23 = getString(C35964oKf.Fragment.fhUrPt);
        Intrinsics.checkNotNullExpressionValue(string23, "");
        arrayList23.add(new Application(string23, "PSY"));
        java.util.ArrayList<java.lang.Object> arrayList24 = this.copydefault;
        java.lang.String string24 = getString(C35964oKf.Fragment.OStAOF);
        Intrinsics.checkNotNullExpressionValue(string24, "");
        arrayList24.add(new Application(string24, "DMI"));
        java.util.ArrayList<java.lang.Object> arrayList25 = this.copydefault;
        java.lang.String string25 = getString(C35964oKf.Fragment.hgxRZI);
        Intrinsics.checkNotNullExpressionValue(string25, "");
        arrayList25.add(new Application(string25, "CCI"));
        if (!this.djBIcL) {
            this.copydefault.add(1);
            this.copydefault.add(getString(C35964oKf.Fragment.zFtALg));
            java.util.ArrayList<java.lang.Object> arrayList26 = this.copydefault;
            java.lang.String string26 = getString(C35964oKf.Fragment.sVvuFk);
            Intrinsics.checkNotNullExpressionValue(string26, "");
            arrayList26.add(new StateListAnimator(string26, "OI"));
            java.util.ArrayList<java.lang.Object> arrayList27 = this.copydefault;
            java.lang.String string27 = getString(C35964oKf.Fragment.GFUIi);
            Intrinsics.checkNotNullExpressionValue(string27, "");
            arrayList27.add(new StateListAnimator(string27, "LSAcco"));
            java.util.ArrayList<java.lang.Object> arrayList28 = this.copydefault;
            java.lang.String string28 = getString(C35964oKf.Fragment.dlRikr);
            Intrinsics.checkNotNullExpressionValue(string28, "");
            arrayList28.add(new StateListAnimator(string28, "LSPos"));
            java.util.ArrayList<java.lang.Object> arrayList29 = this.copydefault;
            java.lang.String string29 = getString(C35964oKf.Fragment.UJEglR);
            Intrinsics.checkNotNullExpressionValue(string29, "");
            arrayList29.add(new StateListAnimator(string29, "LSRatio"));
            java.util.ArrayList<java.lang.Object> arrayList30 = this.copydefault;
            java.lang.String string30 = getString(C35964oKf.Fragment.fMBJsc);
            Intrinsics.checkNotNullExpressionValue(string30, "");
            arrayList30.add(new StateListAnimator(string30, "BSVol"));
        }
        this.copydefault.add("");
        this.EZpvd.setItems(this.copydefault);
        this.EZpvd.notifyDataSetChanged();
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        C33567myr.AEQbTJ(this, AEQbTJ());
        C33494mxX.copydefault.EZpvd(this, AEQbTJ());
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
