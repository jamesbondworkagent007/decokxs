package o;

import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C5489Ts;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.meS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32482meS {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final android.content.Context AEQbTJ;
    public final C5480Tj EZpvd;
    public final boolean KWHzl;
    public final C5489Ts.TaskDescription copydefault;
    public final StateListAnimator gEmmrt;
    public final C5489Ts.Activity valueOf;

    public C32482meS(@NotNull android.content.Context context, ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = context;
        this.EZpvd = C5480Tj.Companion.EZpvd(executorService);
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.gEmmrt = stateListAnimator;
        C5489Ts.Activity activity = new C5489Ts.Activity(stateListAnimator);
        this.valueOf = activity;
        this.copydefault = new C5489Ts.TaskDescription("OnCreate", activity);
        this.KWHzl = C43308rmo.KWHzl(context);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.meS */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startTask$default(C32482meS c32482meS, java.lang.String str, boolean z, boolean z2, int i, java.util.List list, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        boolean z3 = z;
        boolean z4 = (i2 & 4) != 0 ? false : z2;
        int i3 = (i2 & 8) != 0 ? 0 : i;
        if ((i2 & 16) != 0) {
            list = null;
        }
        c32482meS.AEQbTJ(str, z3, z4, i3, list, function0);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, boolean z, boolean z2, int i, java.util.List<java.lang.String> list, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd.EZpvd(this.gEmmrt.EZpvd(str, z, i, function0));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.meS */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C32482meS registerUIProcessTask$default(C32482meS c32482meS, java.lang.String str, boolean z, boolean z2, int i, java.util.List list, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        boolean z3 = z;
        boolean z4 = (i2 & 4) != 0 ? false : z2;
        int i3 = (i2 & 8) != 0 ? 0 : i;
        if ((i2 & 16) != 0) {
            list = null;
        }
        return c32482meS.EZpvd(str, z3, z4, i3, list, function0);
    }

    public final C32482meS EZpvd(@NotNull java.lang.String str, boolean z, boolean z2, int i, java.util.List<java.lang.String> list, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (this.KWHzl) {
            OLrzqt(str, z, z2, i, list, function0);
        }
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.meS */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C32482meS registerSubProcessTask$default(C32482meS c32482meS, java.lang.String str, boolean z, boolean z2, int i, java.util.List list, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        boolean z3 = z;
        boolean z4 = (i2 & 4) != 0 ? false : z2;
        int i3 = (i2 & 8) != 0 ? 0 : i;
        if ((i2 & 16) != 0) {
            list = null;
        }
        return c32482meS.KWHzl(str, z3, z4, i3, list, function0);
    }

    public final C32482meS KWHzl(@NotNull java.lang.String str, boolean z, boolean z2, int i, java.util.List<java.lang.String> list, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (!this.KWHzl) {
            OLrzqt(str, z, z2, i, list, function0);
        }
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.meS */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C32482meS registerTask$default(C32482meS c32482meS, java.lang.String str, boolean z, boolean z2, int i, java.util.List list, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        boolean z3 = z;
        boolean z4 = (i2 & 4) != 0 ? false : z2;
        int i3 = (i2 & 8) != 0 ? 0 : i;
        if ((i2 & 16) != 0) {
            list = null;
        }
        return c32482meS.OLrzqt(str, z3, z4, i3, list, function0);
    }

    public final C32482meS OLrzqt(@NotNull java.lang.String str, boolean z, boolean z2, int i, java.util.List<java.lang.String> list, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.gEmmrt.EZpvd(str, z, i, function0);
        C5489Ts.TaskDescription taskDescriptionKWHzl = this.copydefault.KWHzl(str);
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                taskDescriptionKWHzl.copydefault((java.lang.String) it.next());
            }
        }
        if (z2) {
            this.EZpvd.EZpvd(str);
        }
        return this;
    }

    public final void OLrzqt() {
        this.EZpvd.EZpvd(this.copydefault.KWHzl());
    }

    /* JADX INFO: renamed from: o.meS$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC5482Tl {
        public final java.util.Map<java.lang.String, ActionBar> AEQbTJ = new LinkedHashMap();

        public static /* synthetic */ ActionBar registerTask$default(StateListAnimator stateListAnimator, java.lang.String str, boolean z, int i, Function0 function0, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return stateListAnimator.EZpvd(str, z, i, function0);
        }

        /* JADX INFO: renamed from: o.meS$StateListAnimator$ActionBar */
        public static final class ActionBar extends ActionBar {
            public final /* synthetic */ Function0<Unit> isConnected;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(java.lang.String str, boolean z, Function0<Unit> function0) {
                super(str, z, false, 4, null);
                this.isConnected = function0;
            }

            @Override // o.AbstractRunnableC5485To
            public void AEQbTJ(java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.isConnected.invoke();
            }
        }

        public final ActionBar EZpvd(@NotNull java.lang.String str, boolean z, int i, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function0, "");
            ActionBar actionBar = new ActionBar(str, z, function0);
            actionBar.EZpvd(i);
            this.AEQbTJ.put(str, actionBar);
            return actionBar;
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/String;)Lo/To; */
        @Override // o.InterfaceC5482Tl
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public ActionBar OLrzqt(@NotNull java.lang.String str) throws java.lang.Exception {
            Intrinsics.checkNotNullParameter(str, "");
            ActionBar actionBar = this.AEQbTJ.get(str);
            if (actionBar != null) {
                return actionBar;
            }
            throw new java.lang.Exception("No such task: " + str);
        }
    }

    /* JADX INFO: renamed from: o.meS$ActionBar */
    public static abstract class ActionBar extends AbstractRunnableC5485To {
        public final boolean EZpvd;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, boolean, boolean):void (m)] (LINE:106) call: o.meS.ActionBar.<init>(java.lang.String, boolean, boolean):void type: THIS */
        public /* synthetic */ ActionBar(java.lang.String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str, boolean z, boolean z2) {
            super(str, z);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = z2;
        }
    }

    /* JADX INFO: renamed from: o.meS$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.meS.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
