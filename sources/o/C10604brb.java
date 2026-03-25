package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C10604brb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.brb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10604brb {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public Activity AEQbTJ;
    public final C13934dbu KWHzl;
    public final C10545bqV copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C10604brb() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10545bqV KWHzl() {
        return this.copydefault;
    }

    public C10604brb(@NotNull C13934dbu c13934dbu, @NotNull C10545bqV c10545bqV) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c10545bqV, "");
        this.KWHzl = c13934dbu;
        this.copydefault = c10545bqV;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:o.dbu:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.dbu:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:28) call: o.dbu.<init>():void type: CONSTRUCTOR) : (r1v0 o.dbu))
  (wrap:o.bqV:?: TERNARY null = ((wrap:int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.bqV:0x000f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:29) call: o.bqV.<init>():void type: CONSTRUCTOR) : (r2v0 o.bqV))
 A[MD:(o.dbu, o.bqV):void (m)] (LINE:27) call: o.brb.<init>(o.dbu, o.bqV):void type: THIS */
    public /* synthetic */ C10604brb(C13934dbu c13934dbu, C10545bqV c10545bqV, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C13934dbu() : c13934dbu, (i & 2) != 0 ? new C10545bqV() : c10545bqV);
    }

    /* JADX INFO: renamed from: o.brb$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.brb.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C10604brb getInstance$default(Application application, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return application.AEQbTJ(context);
        }

        public final C10604brb AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).QOLQEE();
        }
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void KWHzl(@NotNull final android.content.Context context, @NotNull LifecycleOwner lifecycleOwner, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function0, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(AEQbTJ(), lifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.bre
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10604brb.OLrzqt(function0, this, context, (C10604brb.Activity) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.brg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10604brb.AhwBna(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.brk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10604brb.KWHzl(function0, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.bri
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10604brb.gEmmrt(function12, obj);
            }
        });
    }

    public static final Unit OLrzqt(Function0 function0, C10604brb c10604brb, android.content.Context context, Activity activity) {
        if (activity.AEQbTJ()) {
            function0.invoke();
        } else {
            c10604brb.copydefault.AEQbTJ(context, activity.copydefault());
        }
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Function0 function0, java.lang.Throwable th) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final InterfaceC58217yxC djBIcL() {
        AbstractC58185ywX<Activity> abstractC58185ywXEZpvd = EZpvd();
        final Function1 function1 = new Function1() { // from class: o.bra
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10604brb.copydefault(this.copydefault, (C10604brb.Activity) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.brf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10604brb.DbNXlk(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        return interfaceC58217yxCAEQbTJ;
    }

    public static final Unit copydefault(C10604brb c10604brb, Activity activity) {
        c10604brb.AEQbTJ = activity;
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<Activity> AEQbTJ() {
        AbstractC58185ywX abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.brm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C10604brb.copydefault();
            }
        });
        final Function1 function1 = new Function1() { // from class: o.brj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10604brb.copydefault(this.OLrzqt, (java.lang.Boolean) obj);
            }
        };
        AbstractC58185ywX<Activity> abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.bqY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10604brb.AYXKKw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final java.lang.Boolean copydefault() {
        return java.lang.Boolean.valueOf(C43453rpa.AEQbTJ.KWHzl(C9678baC.Companion.AEQbTJ()));
    }

    public static final InterfaceC60096zvd AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(final C10604brb c10604brb, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            Activity activity = c10604brb.AEQbTJ;
            if (activity != null) {
                AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(activity);
                Intrinsics.copydefault(abstractC58185ywXKWHzl);
                return abstractC58185ywXKWHzl;
            }
            AbstractC58185ywX<Activity> abstractC58185ywXEZpvd = c10604brb.EZpvd();
            final Function1 function1 = new Function1() { // from class: o.brd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10604brb.EZpvd(this.EZpvd, (C10604brb.Activity) obj);
                }
            };
            InterfaceC60096zvd interfaceC60096zvdAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.brh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10604brb.djBIcL(function1, obj);
                }
            });
            Intrinsics.copydefault(interfaceC60096zvdAEQbTJ);
            return interfaceC60096zvdAEQbTJ;
        }
        if (c10604brb.AEQbTJ == null) {
            c10604brb.AEQbTJ = new Activity(true, "");
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new Activity(true, ""));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public static final Activity djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Activity) function1.invoke(obj);
    }

    public static final Activity EZpvd(C10604brb c10604brb, Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        c10604brb.AEQbTJ = activity;
        return activity;
    }

    public static final Activity AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Activity) function1.invoke(obj);
    }

    public final AbstractC58185ywX<Activity> EZpvd() {
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) this.KWHzl.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.brc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10604brb.AEQbTJ((ResponseData) obj);
            }
        };
        AbstractC58185ywX<Activity> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bqZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10604brb.AkhnZx(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Activity AEQbTJ(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 900003) {
            return new Activity(false, responseData.getMsg());
        }
        return new Activity(true, "");
    }

    /* JADX INFO: renamed from: o.brb$Activity */
    public static final class Activity {
        public final java.lang.String OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = activity.copydefault;
            }
            if ((i & 2) != 0) {
                str = activity.OLrzqt;
            }
            return activity.AEQbTJ(z, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(boolean z, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(z, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.copydefault == activity.copydefault && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Boolean.hashCode(this.copydefault) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CheckLimitCreateWalletResult(isSupport=" + this.copydefault + ", errMsg=" + this.OLrzqt + ")";
        }

        public Activity(boolean z, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = z;
            this.OLrzqt = str;
        }
    }
}
