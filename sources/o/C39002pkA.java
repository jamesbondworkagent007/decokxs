package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C39002pkA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pkA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C39002pkA implements LifecycleOwner {
    public final InterfaceC56387yDm AEQbTJ;
    public LifecycleRegistry AhwBna;
    public boolean EZpvd;
    public LifecycleRegistry KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public Lifecycle.State copydefault;
    public final AbstractC39051pkx djBIcL;

    /* JADX INFO: renamed from: o.pkA$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[Lifecycle.State.values().length];
            try {
                iArr2[Lifecycle.State.CREATED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[Lifecycle.State.RESUMED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            AEQbTJ = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Lifecycle AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.KWHzl;
    }

    public C39002pkA(@NotNull AbstractC39051pkx abstractC39051pkx) {
        Intrinsics.checkNotNullParameter(abstractC39051pkx, "");
        this.djBIcL = abstractC39051pkx;
        this.KWHzl = new LifecycleRegistry(this);
        this.EZpvd = true;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.OLrzqt = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0() { // from class: o.pkC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C39002pkA.OLrzqt(this.KWHzl);
            }
        });
        this.AEQbTJ = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0() { // from class: o.pkz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C39002pkA.AEQbTJ(this.EZpvd);
            }
        });
    }

    public final LifecycleOwner KWHzl() {
        return this.djBIcL.KWHzl();
    }

    public final androidx.fragment.app.Fragment AEQbTJ() {
        return this.djBIcL.valueOf();
    }

    public final LifecycleObserver EZpvd() {
        return (LifecycleObserver) this.OLrzqt.getValue();
    }

    public static final LifecycleEventObserver OLrzqt(final C39002pkA c39002pkA) {
        return new LifecycleEventObserver() { // from class: com.okinc.kline.ui.component.basic.view.ViewComponentLifecycleManager$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                C39002pkA.OLrzqt(this.EZpvd, lifecycleOwner, event);
            }
        };
    }

    public static final void OLrzqt(C39002pkA c39002pkA, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        c39002pkA.copydefault(event);
    }

    public final LifecycleObserver OLrzqt() {
        return (LifecycleObserver) this.AEQbTJ.getValue();
    }

    public static final LifecycleEventObserver AEQbTJ(final C39002pkA c39002pkA) {
        return new LifecycleEventObserver() { // from class: com.okinc.kline.ui.component.basic.view.ViewComponentLifecycleManager$$ExternalSyntheticLambda4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                C39002pkA.copydefault(this.OLrzqt, lifecycleOwner, event);
            }
        };
    }

    public static final void copydefault(C39002pkA c39002pkA, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        if (c39002pkA.EZpvd) {
            return;
        }
        int i = Activity.OLrzqt[event.ordinal()];
        if (i == 1 || i == 2) {
            c39002pkA.OLrzqt(event);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean AEQbTJ(C39002pkA c39002pkA, Lifecycle.Event event, boolean z) {
        Lifecycle.Event eventDownFrom;
        Lifecycle.Event eventUpFrom;
        Lifecycle lifecycleAhwBna = c39002pkA.AhwBna();
        if (z) {
            Lifecycle.State state = c39002pkA.copydefault;
            return lifecycleAhwBna != null && ((eventUpFrom = Lifecycle.Event.Companion.upFrom(lifecycleAhwBna.getCurrentState())) == null || event.compareTo(eventUpFrom) < 0 || (state != null && lifecycleAhwBna.getCurrentState().compareTo(state) >= 0));
        }
        if (lifecycleAhwBna == null || ((eventDownFrom = Lifecycle.Event.Companion.downFrom(lifecycleAhwBna.getCurrentState())) != null && event.compareTo(eventDownFrom) >= 0)) {
        }
    }

    public final void copydefault(Lifecycle.Event event) {
        int i = Activity.OLrzqt[event.ordinal()];
        if (i == 2) {
            if (AEQbTJ(this, event, false)) {
                return;
            }
            copydefault();
            return;
        }
        if (i == 3) {
            if (AEQbTJ(this, event, true)) {
                return;
            }
            this.djBIcL.values();
            AEQbTJ(event);
            return;
        }
        if (i == 4) {
            if (AEQbTJ(this, event, true)) {
                return;
            }
            this.djBIcL.isConnected();
            AEQbTJ(event);
            return;
        }
        if (i == 5) {
            if (AEQbTJ(this, event, false)) {
                return;
            }
            this.djBIcL.fetchVPNInfo();
            AEQbTJ(event);
            return;
        }
        if (i == 6 && !AEQbTJ(this, event, false)) {
            this.djBIcL.DbNXlk();
            AEQbTJ(event);
        }
    }

    public final void OLrzqt(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        Lifecycle lifecycleAhwBna = AhwBna();
        if (this.copydefault != null && lifecycleAhwBna != null && lifecycleAhwBna.getCurrentState().compareTo(Lifecycle.State.CREATED) >= 0) {
            valueOf();
            return;
        }
        AYXKKw();
        function0.invoke();
        gEmmrt();
    }

    public final void gEmmrt() {
        Lifecycle lifecycle;
        KWHzl(Lifecycle.Event.ON_CREATE);
        LifecycleOwner lifecycleOwnerKWHzl = KWHzl();
        androidx.fragment.app.Fragment fragment = lifecycleOwnerKWHzl instanceof androidx.fragment.app.Fragment ? (androidx.fragment.app.Fragment) lifecycleOwnerKWHzl : null;
        if (fragment == null) {
            LifecycleOwner lifecycleOwnerKWHzl2 = KWHzl();
            if (lifecycleOwnerKWHzl2 == null || (lifecycle = lifecycleOwnerKWHzl2.getLifecycle()) == null) {
                return;
            }
            lifecycle.addObserver(EZpvd());
            return;
        }
        fragment.getViewLifecycleOwnerLiveData().observe(fragment, new Observer() { // from class: o.pky
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C39002pkA.OLrzqt(this.KWHzl, (LifecycleOwner) obj);
            }
        });
    }

    public static final void OLrzqt(C39002pkA c39002pkA, LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(c39002pkA.EZpvd());
    }

    public final void AYXKKw() {
        this.AhwBna = new LifecycleRegistry(this);
    }

    public final void valueOf() {
        Lifecycle.Event eventUpFrom;
        LifecycleOwner lifecycleOwnerKWHzl;
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        Lifecycle.Event event;
        Lifecycle lifecycleAhwBna = AhwBna();
        if (lifecycleAhwBna == null || (eventUpFrom = Lifecycle.Event.Companion.upFrom(lifecycleAhwBna.getCurrentState())) == null || (lifecycleOwnerKWHzl = KWHzl()) == null || (lifecycle = lifecycleOwnerKWHzl.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null) {
            return;
        }
        int i = Activity.AEQbTJ[currentState.ordinal()];
        if (i == 1) {
            event = Lifecycle.Event.ON_CREATE;
        } else if (i == 2) {
            event = Lifecycle.Event.ON_START;
        } else if (i == 3) {
            event = Lifecycle.Event.ON_RESUME;
        } else {
            event = Lifecycle.Event.ON_CREATE;
        }
        if (eventUpFrom.compareTo(event) > 0) {
            return;
        }
        Lifecycle.Event[] eventArr = {Lifecycle.Event.ON_CREATE, Lifecycle.Event.ON_START, Lifecycle.Event.ON_RESUME};
        for (int i2 = 0; i2 < 3; i2++) {
            Lifecycle.Event event2 = eventArr[i2];
            if (event2.compareTo(eventUpFrom) >= 0 && event2.compareTo(event) <= 0) {
                copydefault(event2);
            }
        }
    }

    public final void copydefault() {
        this.EZpvd = true;
        djBIcL();
        AEQbTJ(Lifecycle.Event.ON_DESTROY);
        this.djBIcL.copydefault();
    }

    public final void djBIcL() {
        LiveData<LifecycleOwner> viewLifecycleOwnerLiveData;
        LifecycleOwner value;
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        for (LifecycleObserver lifecycleObserver : yDY.gEmmrt(EZpvd(), OLrzqt())) {
            LifecycleOwner lifecycleOwnerKWHzl = KWHzl();
            if (lifecycleOwnerKWHzl != null && (lifecycle2 = lifecycleOwnerKWHzl.getLifecycle()) != null) {
                lifecycle2.removeObserver(lifecycleObserver);
            }
            androidx.fragment.app.Fragment fragmentAEQbTJ = AEQbTJ();
            if (fragmentAEQbTJ != null && (viewLifecycleOwnerLiveData = fragmentAEQbTJ.getViewLifecycleOwnerLiveData()) != null && (value = viewLifecycleOwnerLiveData.getValue()) != null && (lifecycle = value.getLifecycle()) != null) {
                lifecycle.removeObserver(lifecycleObserver);
            }
        }
    }

    private final void AEQbTJ(Lifecycle.Event event) {
        KWHzl(event);
        OLrzqt(event);
    }

    public final void KWHzl(Lifecycle.Event event) {
        LifecycleRegistry lifecycleRegistry = this.AhwBna;
        if (lifecycleRegistry != null) {
            lifecycleRegistry.handleLifecycleEvent(event);
        }
    }

    public final void OLrzqt(Lifecycle.Event event) {
        this.KWHzl.handleLifecycleEvent(event);
    }
}
