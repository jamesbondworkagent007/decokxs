package o;

import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.okinc.okex.jsbridge.PermissionCheckResult;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.soR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45364soR {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public Application AEQbTJ;
    public final ActionBar KWHzl;
    public final ActivityResultLauncher<java.lang.String[]> copydefault;

    /* JADX INFO: renamed from: o.soR$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements ActivityResultCallback, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.activity.result.ActivityResultCallback
        public final /* synthetic */ void onActivityResult(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.soR$ActionBar) A[MD:(o.soR$ActionBar):void (m)] call: o.soR.<init>(o.soR$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C45364soR(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    public C45364soR(ActionBar actionBar) {
        ActivityResultLauncher<java.lang.String[]> activityResultLauncherRegisterForActivityResult;
        this.KWHzl = actionBar;
        ActivityResultContracts.RequestMultiplePermissions requestMultiplePermissions = new ActivityResultContracts.RequestMultiplePermissions();
        Function1 function1 = new Function1() { // from class: o.soU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45364soR.AEQbTJ(this.copydefault, (java.util.Map) obj);
            }
        };
        if (actionBar instanceof ActionBar.Activity) {
            activityResultLauncherRegisterForActivityResult = ((ActionBar.Activity) actionBar).EZpvd().registerForActivityResult(requestMultiplePermissions, new TaskDescription(function1));
        } else {
            if (!(actionBar instanceof ActionBar.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            activityResultLauncherRegisterForActivityResult = ((ActionBar.StateListAnimator) actionBar).EZpvd().registerForActivityResult(requestMultiplePermissions, new TaskDescription(function1));
        }
        this.copydefault = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.soR$ActionBar */
    public interface ActionBar {

        /* JADX INFO: renamed from: o.soR$ActionBar$Activity */
        public static final class Activity implements ActionBar {
            public final FragmentActivity EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, FragmentActivity fragmentActivity, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    fragmentActivity = activity.EZpvd;
                }
                return activity.AEQbTJ(fragmentActivity);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity AEQbTJ(@NotNull FragmentActivity fragmentActivity) {
                Intrinsics.checkNotNullParameter(fragmentActivity, "");
                return new Activity(fragmentActivity);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FragmentActivity EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.EZpvd, ((Activity) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ActivityTarget(target=" + this.EZpvd + ")";
            }

            public Activity(@NotNull FragmentActivity fragmentActivity) {
                Intrinsics.checkNotNullParameter(fragmentActivity, "");
                this.EZpvd = fragmentActivity;
            }
        }

        /* JADX INFO: renamed from: o.soR$ActionBar$StateListAnimator */
        public static final class StateListAnimator implements ActionBar {
            public final androidx.fragment.app.Fragment OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, androidx.fragment.app.Fragment fragment, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    fragment = stateListAnimator.OLrzqt;
                }
                return stateListAnimator.copydefault(fragment);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final androidx.fragment.app.Fragment EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator copydefault(@NotNull androidx.fragment.app.Fragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "");
                return new StateListAnimator(fragment);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.OLrzqt, ((StateListAnimator) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "FragmentTarget(target=" + this.OLrzqt + ")";
            }

            public StateListAnimator(@NotNull androidx.fragment.app.Fragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "");
                this.OLrzqt = fragment;
            }
        }
    }

    public final android.content.Context copydefault() {
        android.content.Context contextRequireContext;
        ActionBar actionBar = this.KWHzl;
        if (actionBar instanceof ActionBar.Activity) {
            contextRequireContext = ((ActionBar.Activity) actionBar).EZpvd();
        } else {
            if (!(actionBar instanceof ActionBar.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            contextRequireContext = ((ActionBar.StateListAnimator) actionBar).EZpvd().requireContext();
        }
        Intrinsics.copydefault(contextRequireContext);
        return contextRequireContext;
    }

    /* JADX INFO: renamed from: o.soR$Application */
    public static final class Application {
        public final java.lang.String AEQbTJ;
        public final Function0<Unit> EZpvd;
        public final Function1<PermissionCheckResult, Unit> KWHzl;
        public final java.util.List<java.lang.String> OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.soR$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.util.List list, java.lang.String str, java.lang.String str2, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                str = application.AEQbTJ;
            }
            java.lang.String str3 = str;
            if ((i & 4) != 0) {
                str2 = application.copydefault;
            }
            java.lang.String str4 = str2;
            if ((i & 8) != 0) {
                function1 = application.KWHzl;
            }
            Function1 function12 = function1;
            if ((i & 16) != 0) {
                function0 = application.EZpvd;
            }
            return application.OLrzqt(list, str3, str4, function12, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<PermissionCheckResult, Unit> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, Function1<? super PermissionCheckResult, Unit> function1, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function0, "");
            return new Application(list, str, str2, function1, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault) && Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && Intrinsics.EZpvd(this.EZpvd, application.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            int iHashCode2 = this.AEQbTJ.hashCode();
            int iHashCode3 = this.copydefault.hashCode();
            Function1<PermissionCheckResult, Unit> function1 = this.KWHzl;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (function1 == null ? 0 : function1.hashCode())) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PermissionRequest(permissions=" + this.OLrzqt + ", rationaleTitle=" + this.AEQbTJ + ", rationaleMessage=" + this.copydefault + ", onPermissionDenied=" + this.KWHzl + ", onPermissionGranted=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okex.jsbridge.PermissionCheckResult, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, Function1<? super PermissionCheckResult, Unit> function1, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function0, "");
            this.OLrzqt = list;
            this.AEQbTJ = str;
            this.copydefault = str2;
            this.KWHzl = function1;
            this.EZpvd = function0;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r8v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r11v0 kotlin.jvm.functions.Function1))
  (r12v0 kotlin.jvm.functions.Function0)
 A[MD:(java.util.List<java.lang.String>, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1<? super com.okinc.okex.jsbridge.PermissionCheckResult, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:41) call: o.soR.Application.<init>(java.util.List, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):void type: THIS */
        public /* synthetic */ Application(java.util.List list, java.lang.String str, java.lang.String str2, Function1 function1, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : function1, function0);
        }
    }

    /* JADX INFO: renamed from: o.soR$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.soR.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C45364soR EZpvd(@NotNull ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            return new C45364soR(actionBar, null);
        }
    }

    public static final Unit AEQbTJ(C45364soR c45364soR, java.util.Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        c45364soR.KWHzl((java.util.Map<java.lang.String, java.lang.Boolean>) map);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.AEQbTJ = application;
        if (copydefault(application.OLrzqt())) {
            application.copydefault().invoke();
        } else {
            KWHzl(application);
        }
    }

    public final boolean copydefault(java.util.List<java.lang.String> list) {
        C44760scx.log$default("Checking permission status: " + list, null, 2, null);
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (ContextCompat.checkSelfPermission(copydefault(), (java.lang.String) it.next()) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: androidx.activity.result.ActivityResultLauncher<java.lang.String[]> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void KWHzl(Application application) {
        if (EZpvd(application.OLrzqt())) {
            OLrzqt(application.EZpvd(), application.AEQbTJ());
        } else {
            try {
                this.copydefault.launch(application.OLrzqt().toArray(new java.lang.String[0]));
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public final void KWHzl(java.util.Map<java.lang.String, java.lang.Boolean> map) {
        boolean z;
        Application application = this.AEQbTJ;
        if (application == null) {
            return;
        }
        Intrinsics.copydefault(application);
        if (map.isEmpty()) {
            z = true;
        } else {
            java.util.Iterator<Map.Entry<java.lang.String, java.lang.Boolean>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (!it.next().getValue().booleanValue()) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<java.lang.String, java.lang.Boolean> entry : map.entrySet()) {
            if (!entry.getValue().booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
        java.util.Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add((java.lang.String) ((Map.Entry) it2.next()).getKey());
        }
        boolean zEZpvd = EZpvd(arrayList);
        if (z) {
            C44760scx.log$default("All requested permissions granted", null, 2, null);
            application.copydefault().invoke();
        } else if (zEZpvd) {
            C44760scx.log$default("Some denied permissions could be requested again", null, 2, null);
            Function1<PermissionCheckResult, Unit> function1KWHzl = application.KWHzl();
            if (function1KWHzl != null) {
                function1KWHzl.invoke(PermissionCheckResult.SOFT_DENY);
            }
        } else {
            C44760scx.log$default("All denied permissions cannot be requested again", null, 2, null);
            Function1<PermissionCheckResult, Unit> function1KWHzl2 = application.KWHzl();
            if (function1KWHzl2 != null) {
                function1KWHzl2.invoke(PermissionCheckResult.DENIED);
            }
        }
        this.AEQbTJ = null;
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2) {
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(copydefault());
        viewOnClickListenerC54939xaY.setTitle(str);
        viewOnClickListenerC54939xaY.EZpvd(str2);
        viewOnClickListenerC54939xaY.EZpvd(C47315tni.PendingIntent.AYXKKw, new View.OnClickListener() { // from class: o.soV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C45364soR.AEQbTJ(viewOnClickListenerC54939xaY, view);
            }
        });
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C47315tni.PendingIntent.RKcVTr, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            new C33580mzD(viewOnClickListenerC54939xaY.getContext()).copydefault();
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        final java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44760scx.copydefault("PermissionLaunchHelper: Failed to open app system settings", new Function1() { // from class: o.soS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45364soR.OLrzqt(thM7380exceptionOrNullimpl, (C44761scy) obj);
                }
            });
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit OLrzqt(java.lang.Throwable th, C44761scy c44761scy) {
        Intrinsics.checkNotNullParameter(c44761scy, "");
        c44761scy.KWHzl(th);
        return Unit.INSTANCE;
    }

    public final boolean EZpvd(java.util.List<java.lang.String> list) {
        boolean zShouldShowRequestPermissionRationale;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            for (java.lang.String str : list) {
                ActionBar actionBar = this.KWHzl;
                if (actionBar instanceof ActionBar.Activity) {
                    zShouldShowRequestPermissionRationale = ((ActionBar.Activity) actionBar).EZpvd().shouldShowRequestPermissionRationale(str);
                } else {
                    if (!(actionBar instanceof ActionBar.StateListAnimator)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zShouldShowRequestPermissionRationale = ((ActionBar.StateListAnimator) actionBar).EZpvd().shouldShowRequestPermissionRationale(str);
                }
                if (zShouldShowRequestPermissionRationale) {
                    return true;
                }
            }
        }
        return false;
    }
}
