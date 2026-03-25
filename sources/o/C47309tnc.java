package o;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContracts;
import com.okinc.okx.paymentapi.data.ResultType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tnc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47309tnc {
    public final Function0<Unit> AYXKKw;
    public final Function1<ResultType.ResultButtonActionType, Unit> EZpvd;
    public final Function0<Unit> KWHzl;
    public final java.lang.String OLrzqt;
    public ActivityResultLauncher<android.content.Intent> copydefault;
    public final ActivityResultRegistry djBIcL;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okx.paymentapi.data.ResultType$ResultButtonActionType, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C47309tnc(@NotNull ActivityResultRegistry activityResultRegistry, Function0<Unit> function0, Function0<Unit> function02, Function1<? super ResultType.ResultButtonActionType, Unit> function1) {
        Intrinsics.checkNotNullParameter(activityResultRegistry, "");
        this.djBIcL = activityResultRegistry;
        this.KWHzl = function0;
        this.AYXKKw = function02;
        this.EZpvd = function1;
        this.OLrzqt = "GENERIC_RESULT_SCREEN_RESULT";
        KWHzl();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 androidx.activity.result.ActivityResultRegistry)
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r3v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r4v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r5v0 kotlin.jvm.functions.Function1))
 A[MD:(androidx.activity.result.ActivityResultRegistry, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.okx.paymentapi.data.ResultType$ResultButtonActionType, kotlin.Unit>):void (m)] (LINE:18) call: o.tnc.<init>(androidx.activity.result.ActivityResultRegistry, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C47309tnc(ActivityResultRegistry activityResultRegistry, Function0 function0, Function0 function02, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(activityResultRegistry, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : function02, (i & 8) != 0 ? null : function1);
    }

    public final void KWHzl() {
        this.copydefault = this.djBIcL.register(this.OLrzqt, new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.tnh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C47309tnc.AEQbTJ(this.OLrzqt, (ActivityResult) obj);
            }
        });
    }

    public static final void AEQbTJ(C47309tnc c47309tnc, ActivityResult activityResult) {
        ResultType.ResultButtonActionType resultButtonActionType;
        Function1<ResultType.ResultButtonActionType, Unit> function1;
        switch (activityResult.getResultCode()) {
            case 1001:
                Function0<Unit> function0 = c47309tnc.KWHzl;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 1002:
                Function0<Unit> function02 = c47309tnc.AYXKKw;
                if (function02 != null) {
                    function02.invoke();
                }
                break;
            case 1003:
                android.content.Intent data = activityResult.getData();
                if (data != null && (resultButtonActionType = (ResultType.ResultButtonActionType) data.getParcelableExtra("CTA_BUTTON_TYPE")) != null && (function1 = c47309tnc.EZpvd) != null) {
                    function1.invoke(resultButtonActionType);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: o.tnc$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tnc.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
