package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.chart.domain.ChartType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jNq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25984jNq extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public C23464hyi OLrzqt;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.jNv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C25984jNq.EZpvd(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.jNz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C25984jNq.OLrzqt(this.AEQbTJ);
        }
    });

    public final ChartType AEQbTJ() {
        return (ChartType) this.AEQbTJ.getValue();
    }

    public static final ChartType EZpvd(C25984jNq c25984jNq) {
        ChartType chartType;
        android.os.Bundle arguments = c25984jNq.getArguments();
        return (arguments == null || (chartType = (ChartType) BundleCompat.getParcelable(arguments, "key.params", ChartType.class)) == null) ? ChartType.PRICE : chartType;
    }

    private final kMM copydefault() {
        return (kMM) this.copydefault.getValue();
    }

    public static final kMM OLrzqt(final C25984jNq c25984jNq) {
        kMM kmm = new kMM();
        kmm.register(jNE.class, new C25992jNy(new Function1() { // from class: o.jNx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25984jNq.AEQbTJ(this.copydefault, (ChartType) obj);
            }
        }));
        return kmm;
    }

    public static final Unit AEQbTJ(C25984jNq c25984jNq, ChartType chartType) {
        Intrinsics.checkNotNullParameter(chartType, "");
        ActivityResultCaller parentFragment = c25984jNq.getParentFragment();
        InterfaceC25990jNw interfaceC25990jNw = parentFragment instanceof InterfaceC25990jNw ? (InterfaceC25990jNw) parentFragment : null;
        if (interfaceC25990jNw != null) {
            interfaceC25990jNw.OLrzqt(chartType);
        }
        c25984jNq.dismissAllowingStateLoss();
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
        C23464hyi c23464hyiCopydefault = C23464hyi.copydefault(getCustomLayoutInflater(), constraintLayout, true);
        this.OLrzqt = c23464hyiCopydefault;
        if (c23464hyiCopydefault != null && (root = c23464hyiCopydefault.getRoot()) != null) {
            root.setAdapter(copydefault());
        }
        ChartType[] chartTypeArrValues = ChartType.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(chartTypeArrValues.length);
        int length = chartTypeArrValues.length;
        for (int i = 0; i < length; i++) {
            ChartType chartType = chartTypeArrValues[i];
            arrayList.add(new jNE(chartType, chartType == AEQbTJ()));
        }
        kMM.setData$default(copydefault(), arrayList, null, 2, null);
    }

    /* JADX INFO: renamed from: o.jNq$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jNq.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C25984jNq copydefault(@NotNull ChartType chartType) {
            Intrinsics.checkNotNullParameter(chartType, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.params", chartType);
            C25984jNq c25984jNq = new C25984jNq();
            c25984jNq.setArguments(bundle);
            return c25984jNq;
        }
    }
}
