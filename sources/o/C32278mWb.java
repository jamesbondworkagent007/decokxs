package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.dexkline.market.features.chart.domain.ChartType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mWb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32278mWb extends wXX {
    public final Function0<Unit> EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public C36061oNv copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C32278mWb() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r1v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:19) call: o.mWb.<init>(kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C32278mWb(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0);
    }

    public C32278mWb(Function0<Unit> function0) {
        this.EZpvd = function0;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.mWe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32278mWb.EZpvd(this.KWHzl);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.mWd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32278mWb.copydefault(this.OLrzqt);
            }
        });
    }

    public final ChartType copydefault() {
        return (ChartType) this.KWHzl.getValue();
    }

    public static final ChartType EZpvd(C32278mWb c32278mWb) {
        ChartType chartType;
        android.os.Bundle arguments = c32278mWb.getArguments();
        return (arguments == null || (chartType = (ChartType) BundleCompat.getParcelable(arguments, "key.params", ChartType.class)) == null) ? ChartType.PRICE : chartType;
    }

    private final C34632nfk OLrzqt() {
        return (C34632nfk) this.OLrzqt.getValue();
    }

    public static final C34632nfk copydefault(final C32278mWb c32278mWb) {
        C34632nfk c34632nfk = new C34632nfk();
        c34632nfk.register(C32284mWh.class, new C32286mWj(new Function1() { // from class: o.mWc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32278mWb.AEQbTJ(this.KWHzl, (ChartType) obj);
            }
        }));
        return c34632nfk;
    }

    public static final Unit AEQbTJ(C32278mWb c32278mWb, ChartType chartType) {
        Intrinsics.checkNotNullParameter(chartType, "");
        ActivityResultCaller parentFragment = c32278mWb.getParentFragment();
        InterfaceC32287mWk interfaceC32287mWk = parentFragment instanceof InterfaceC32287mWk ? (InterfaceC32287mWk) parentFragment : null;
        if (interfaceC32287mWk != null) {
            interfaceC32287mWk.AEQbTJ(chartType);
        }
        c32278mWb.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        RecyclerView root;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C36061oNv c36061oNvAEQbTJ = C36061oNv.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        this.copydefault = c36061oNvAEQbTJ;
        if (c36061oNvAEQbTJ != null && (root = c36061oNvAEQbTJ.getRoot()) != null) {
            root.setAdapter(OLrzqt());
        }
        ChartType[] chartTypeArrValues = ChartType.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(chartTypeArrValues.length);
        int length = chartTypeArrValues.length;
        for (int i = 0; i < length; i++) {
            ChartType chartType = chartTypeArrValues[i];
            arrayList.add(new C32284mWh(chartType, chartType == copydefault()));
        }
        C34632nfk.setData$default(OLrzqt(), arrayList, null, 2, null);
    }

    /* JADX INFO: renamed from: o.mWb$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mWb.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mWb$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C32278mWb newInstance$default(Activity activity, ChartType chartType, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            return activity.OLrzqt(chartType, function0);
        }

        public final C32278mWb OLrzqt(@NotNull ChartType chartType, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(chartType, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.params", chartType);
            C32278mWb c32278mWb = new C32278mWb(function0);
            c32278mWb.setArguments(bundle);
            return c32278mWb;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.EZpvd;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
