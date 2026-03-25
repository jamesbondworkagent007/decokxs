package o;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xdD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55077xdD implements InterfaceC55124xdy {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public Function1<? super android.net.Uri, Unit> AEQbTJ;
    public Function1<? super java.lang.String[], Unit> AYXKKw;
    public final AbstractC55115xdp AhwBna;
    public android.net.Uri DbNXlk;
    public java.lang.String[] EZpvd;
    public ActivityResultLauncher<java.lang.Boolean> OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final ActivityResultLauncher<java.lang.String[]> djBIcL;
    public Function0<Unit> gEmmrt;
    public final ActivityResultLauncher<android.net.Uri> isConnected;
    public Function1<? super android.net.Uri, Unit> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String[] EZpvd() {
        return new java.lang.String[]{"android.permission.CAMERA"};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String[] copydefault() {
        return this.EZpvd;
    }

    public C55077xdD(@NotNull ActivityResultCaller activityResultCaller) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.xdG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55077xdD.EZpvd();
            }
        });
        this.EZpvd = new java.lang.String[]{""};
        this.djBIcL = activityResultCaller.registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: o.xdI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C55077xdD.copydefault(this.AEQbTJ, (java.util.Map) obj);
            }
        });
        this.AhwBna = C55119xdt.AEQbTJ.KWHzl(activityResultCaller, new ActivityResultCallback() { // from class: o.xdF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C55077xdD.copydefault(this.copydefault, (android.net.Uri) obj);
            }
        });
        this.isConnected = activityResultCaller.registerForActivityResult(new ActivityResultContracts.TakePicture(), new ActivityResultCallback() { // from class: o.xdE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C55077xdD.KWHzl(this.EZpvd, (java.lang.Boolean) obj);
            }
        });
        this.OLrzqt = activityResultCaller.registerForActivityResult(new Activity(), new ActivityResultCallback() { // from class: o.xdH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C55077xdD.AEQbTJ(this.copydefault, (android.content.Intent) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.xdD$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xdD.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.lang.String[] KWHzl() {
        return (java.lang.String[]) this.copydefault.getValue();
    }

    /* JADX DEBUG: Type inference failed for r5v5. Raw type applied. Possible types: ? super java.lang.String[] */
    public static final void copydefault(C55077xdD c55077xdD, java.util.Map map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        Intrinsics.copydefault(map);
        for (Map.Entry entry : map.entrySet()) {
            if (!((java.lang.Boolean) entry.getValue()).booleanValue()) {
                arrayList.add(entry.getKey());
            }
        }
        pUU.KWHzl("PickerContract", map.toString());
        if (arrayList.isEmpty()) {
            try {
                Function0<Unit> function0 = c55077xdD.gEmmrt;
                if (function0 != null) {
                    function0.invoke();
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                return;
            } catch (java.lang.Exception e) {
                pUU.copydefault("PickerContract", e.toString());
                Unit unit2 = Unit.INSTANCE;
                return;
            }
        }
        Function1<? super java.lang.String[], Unit> function1 = c55077xdD.AYXKKw;
        if (function1 != null) {
            function1.invoke(arrayList.toArray(new java.lang.String[0]));
        }
    }

    public static final void copydefault(C55077xdD c55077xdD, android.net.Uri uri) {
        Function1<? super android.net.Uri, Unit> function1 = c55077xdD.valueOf;
        if (function1 != null) {
            function1.invoke(uri);
        }
    }

    public static final void KWHzl(C55077xdD c55077xdD, java.lang.Boolean bool) {
        Function1<? super android.net.Uri, Unit> function1 = c55077xdD.valueOf;
        if (function1 != null) {
            function1.invoke(bool.booleanValue() ? c55077xdD.DbNXlk : null);
        }
    }

    public static final void AEQbTJ(C55077xdD c55077xdD, android.content.Intent intent) {
        Function1<? super android.net.Uri, Unit> function1 = c55077xdD.AEQbTJ;
        if (function1 != null) {
            function1.invoke(intent != null ? intent.getData() : null);
        }
    }

    @Override // o.InterfaceC55124xdy
    public void KWHzl(@NotNull android.content.Context context, Function1<? super android.net.Uri, Unit> function1, Function1<? super java.lang.String[], Unit> function12) {
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = function1;
        this.AhwBna.KWHzl();
    }

    @Override // o.InterfaceC55124xdy
    public void KWHzl(@NotNull android.content.Context context, @NotNull final android.net.Uri uri, Function1<? super android.net.Uri, Unit> function1, Function1<? super java.lang.String[], Unit> function12) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        this.DbNXlk = uri;
        this.valueOf = function1;
        this.AYXKKw = function12;
        java.lang.String[] strArrKWHzl = KWHzl();
        if (EZpvd(context, (java.lang.String[]) java.util.Arrays.copyOf(strArrKWHzl, strArrKWHzl.length))) {
            try {
                this.isConnected.launch(uri);
                return;
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("PickerContract", e);
                return;
            }
        }
        this.gEmmrt = new Function0() { // from class: o.xdC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55077xdD.EZpvd(this.KWHzl, uri);
            }
        };
        this.djBIcL.launch(KWHzl());
    }

    public static final Unit EZpvd(C55077xdD c55077xdD, android.net.Uri uri) {
        try {
            c55077xdD.isConnected.launch(uri);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("PickerContract", e);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC55124xdy
    public void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String[] strArr, Function1<? super android.net.Uri, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        this.EZpvd = strArr;
        this.AEQbTJ = function1;
        try {
            this.OLrzqt.launch(java.lang.Boolean.TRUE);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("PickerContract", e);
        }
    }

    public final boolean EZpvd(android.content.Context context, @androidx.annotation.Size(min = 1) java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            if (ContextCompat.checkSelfPermission(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o.xdD$Activity */
    public final class Activity extends ActivityResultContract<java.lang.Boolean, android.content.Intent> {
        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public android.content.Intent parseResult(int i, android.content.Intent intent) {
            return intent;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, java.lang.Object] */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* synthetic */ android.content.Intent createIntent(android.content.Context context, java.lang.Boolean bool) {
            return OLrzqt(context, bool.booleanValue());
        }

        public android.content.Intent OLrzqt(@NotNull android.content.Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent("android.intent.action.OPEN_DOCUMENT");
            intent.putExtra("android.intent.extra.MIME_TYPES", C55077xdD.this.copydefault());
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            return intent;
        }
    }
}
