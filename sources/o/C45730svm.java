package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.okex.lite.hero.coordinator.HeroLifecycleCoordinator;
import com.okinc.okex.lite.hero.repo.HeroResetStateCoordinator$handleUserEvent$1;
import com.okinc.okex.lite.hero.repo.HeroResetStateCoordinator$registerMonitors$1$1;
import com.okinc.okex.lite.hero.repo.HeroResetStateCoordinator$registerMonitors$2;
import com.okinc.okex.lite.hero.repo.HeroResetStateCoordinator$registerMonitors$3;
import com.okinc.okex.lite.hero.repo.HeroResetStateCoordinator$tryLoadHeroAndRefreshNavigation$1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.svm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C45730svm implements InterfaceC45669suR {
    public final C45706svB AEQbTJ;
    public final InterfaceC47278tmy AYXKKw;
    public final InterfaceC45711svG AhwBna;
    public final HeroLifecycleCoordinator EZpvd;
    public final C45667suP KWHzl;
    public final C45670suS OLrzqt;
    public final CoroutineScope copydefault;
    public final InterfaceC45723svf djBIcL;
    public final C45668suQ gEmmrt;
    public final CoroutineDispatcher valueOf;

    @yCM
    public C45730svm(@NotNull InterfaceC45723svf interfaceC45723svf, @NotNull C45706svB c45706svB, @NotNull C45670suS c45670suS, @NotNull InterfaceC47278tmy interfaceC47278tmy, @NotNull InterfaceC45711svG interfaceC45711svG, @NotNull HeroLifecycleCoordinator heroLifecycleCoordinator, @NotNull C45667suP c45667suP, @NotNull C45668suQ c45668suQ) {
        Intrinsics.checkNotNullParameter(interfaceC45723svf, "");
        Intrinsics.checkNotNullParameter(c45706svB, "");
        Intrinsics.checkNotNullParameter(c45670suS, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(interfaceC45711svG, "");
        Intrinsics.checkNotNullParameter(heroLifecycleCoordinator, "");
        Intrinsics.checkNotNullParameter(c45667suP, "");
        Intrinsics.checkNotNullParameter(c45668suQ, "");
        this.djBIcL = interfaceC45723svf;
        this.AEQbTJ = c45706svB;
        this.OLrzqt = c45670suS;
        this.AYXKKw = interfaceC47278tmy;
        this.AhwBna = interfaceC45711svG;
        this.EZpvd = heroLifecycleCoordinator;
        this.KWHzl = c45667suP;
        this.gEmmrt = c45668suQ;
        MainCoroutineDispatcher main = Dispatchers.getMain();
        this.valueOf = main;
        this.copydefault = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(main));
        interfaceC45711svG.AEQbTJ("HeroResetStateCoordinator initialized");
    }

    public final void KWHzl(@NotNull InterfaceC33215msJ interfaceC33215msJ) {
        Intrinsics.checkNotNullParameter(interfaceC33215msJ, "");
        this.AhwBna.AEQbTJ("Setting up monitor");
        this.EZpvd.AEQbTJ(this);
        interfaceC33215msJ.OLrzqt().addObserver(this.EZpvd);
    }

    @Override // o.InterfaceC45669suR
    public void EZpvd(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        AEQbTJ(lifecycleOwner);
    }

    @Override // o.InterfaceC45669suR
    public void OLrzqt(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        KWHzl();
    }

    public final void AEQbTJ(LifecycleOwner lifecycleOwner) {
        try {
            this.AhwBna.AEQbTJ("Registering monitors");
            this.KWHzl.OLrzqt(lifecycleOwner, new Function1() { // from class: o.svn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45730svm.AEQbTJ(this.copydefault, (LifecycleOwner) obj);
                }
            });
            C45710svF.OLrzqt(this.AYXKKw.fIwbmz(), lifecycleOwner, Lifecycle.State.CREATED, new HeroResetStateCoordinator$registerMonitors$2(this, lifecycleOwner, null));
            BuildersKt__Builders_commonKt.launch$default(this.copydefault, null, null, new HeroResetStateCoordinator$registerMonitors$3(this, lifecycleOwner, null), 3, null);
        } catch (java.lang.Exception e) {
            this.AhwBna.OLrzqt("Failed to register monitors", e);
        }
    }

    public static final Unit AEQbTJ(C45730svm c45730svm, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(c45730svm.copydefault, null, null, new HeroResetStateCoordinator$registerMonitors$1$1(c45730svm, lifecycleOwner, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        try {
            this.AhwBna.AEQbTJ("Unregistering monitors");
            this.KWHzl.copydefault();
            Job job = (Job) this.copydefault.getCoroutineContext().get(Job.Key);
            if (job != null) {
                JobKt__JobKt.cancelChildren$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
        } catch (java.lang.Exception e) {
            this.AhwBna.OLrzqt("Failed to unregister monitors", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(LifecycleOwner lifecycleOwner, java.lang.Object obj, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        HeroResetStateCoordinator$handleUserEvent$1 heroResetStateCoordinator$handleUserEvent$1;
        C45730svm c45730svm;
        if (continuation instanceof HeroResetStateCoordinator$handleUserEvent$1) {
            heroResetStateCoordinator$handleUserEvent$1 = (HeroResetStateCoordinator$handleUserEvent$1) continuation;
            int i = heroResetStateCoordinator$handleUserEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                heroResetStateCoordinator$handleUserEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                heroResetStateCoordinator$handleUserEvent$1 = new HeroResetStateCoordinator$handleUserEvent$1(this, continuation);
            }
        }
        java.lang.Object obj2 = heroResetStateCoordinator$handleUserEvent$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = heroResetStateCoordinator$handleUserEvent$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            try {
                this.AhwBna.AEQbTJ("Handling user event: " + obj);
                InterfaceC45723svf interfaceC45723svf = this.djBIcL;
                heroResetStateCoordinator$handleUserEvent$1.L$0 = this;
                heroResetStateCoordinator$handleUserEvent$1.L$1 = lifecycleOwner;
                heroResetStateCoordinator$handleUserEvent$1.label = 1;
                if (interfaceC45723svf.KWHzl(null, heroResetStateCoordinator$handleUserEvent$1) == objCopydefault) {
                    return objCopydefault;
                }
                c45730svm = this;
            } catch (java.lang.Exception e) {
                e = e;
                c45730svm = this;
                c45730svm.AhwBna.OLrzqt("Failed to handle user event", e);
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lifecycleOwner = (LifecycleOwner) heroResetStateCoordinator$handleUserEvent$1.L$1;
            c45730svm = (C45730svm) heroResetStateCoordinator$handleUserEvent$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj2);
            } catch (java.lang.Exception e2) {
                e = e2;
                c45730svm.AhwBna.OLrzqt("Failed to handle user event", e);
            }
        }
        c45730svm.AhwBna.AEQbTJ("Cache cleared");
        c45730svm.gEmmrt.EZpvd(lifecycleOwner);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[Catch: Exception -> 0x0032, TryCatch #1 {Exception -> 0x0032, blocks: (B:12:0x002e, B:23:0x005b, B:25:0x006a, B:27:0x0074), top: B:36:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074 A[Catch: Exception -> 0x0032, TRY_LEAVE, TryCatch #1 {Exception -> 0x0032, blocks: (B:12:0x002e, B:23:0x005b, B:25:0x006a, B:27:0x0074), top: B:36:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(LifecycleOwner lifecycleOwner, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        HeroResetStateCoordinator$tryLoadHeroAndRefreshNavigation$1 heroResetStateCoordinator$tryLoadHeroAndRefreshNavigation$1;
        C45730svm c45730svm;
        if (continuation instanceof HeroResetStateCoordinator$tryLoadHeroAndRefreshNavigation$1) {
            heroResetStateCoordinator$tryLoadHeroAndRefreshNavigation$1 = (HeroResetStateCoordinator$tryLoadHeroAndRefreshNavigation$1) continuation;
            int i = heroResetStateCoordinator$tryLoadHeroAndRefreshNavigation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                heroResetStateCoordinator$tryLoadHeroAndRefreshNavigation$1.label = i - Integer.MIN_VALUE;
            } else {
                heroResetStateCoordinator$tryLoadHeroAndRefreshNavigation$1 = new HeroResetStateCoordinator$tryLoadHeroAndRefreshNavigation$1(this, continuation);
            }
        }
        java.lang.Object obj = heroResetStateCoordinator$tryLoadHeroAndRefreshNavigation$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = heroResetStateCoordinator$tryLoadHeroAndRefreshNavigation$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                this.djBIcL.AEQbTJ(false);
                this.AhwBna.AEQbTJ("Starting unified hero loading");
                C45670suS c45670suS = this.OLrzqt;
                heroResetStateCoordinator$tryLoadHeroAndRefreshNavigation$1.L$0 = this;
                heroResetStateCoordinator$tryLoadHeroAndRefreshNavigation$1.L$1 = lifecycleOwner;
                heroResetStateCoordinator$tryLoadHeroAndRefreshNavigation$1.label = 1;
                if (c45670suS.OLrzqt(heroResetStateCoordinator$tryLoadHeroAndRefreshNavigation$1) == objCopydefault) {
                    return objCopydefault;
                }
                c45730svm = this;
                c45730svm.AhwBna.AEQbTJ("Unified hero loading completed");
                if (c45730svm.AEQbTJ.copydefault(false, false)) {
                }
            } catch (java.lang.Exception e) {
                e = e;
                c45730svm = this;
                c45730svm.AhwBna.OLrzqt("Failed to load hero and refresh navigation", e);
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lifecycleOwner = (LifecycleOwner) heroResetStateCoordinator$tryLoadHeroAndRefreshNavigation$1.L$1;
            c45730svm = (C45730svm) heroResetStateCoordinator$tryLoadHeroAndRefreshNavigation$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                c45730svm.AhwBna.AEQbTJ("Unified hero loading completed");
                if (c45730svm.AEQbTJ.copydefault(false, false)) {
                    c45730svm.AhwBna.AEQbTJ("Bottom navigation not enabled, skipping refresh");
                    return Unit.INSTANCE;
                }
                c45730svm.gEmmrt.EZpvd(lifecycleOwner);
            } catch (java.lang.Exception e2) {
                e = e2;
                c45730svm.AhwBna.OLrzqt("Failed to load hero and refresh navigation", e);
            }
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(android.app.Activity activity) {
        this.AhwBna.AEQbTJ("Forcing hide hero tab");
        this.djBIcL.AEQbTJ(true);
        this.gEmmrt.EZpvd(activity);
    }
}
