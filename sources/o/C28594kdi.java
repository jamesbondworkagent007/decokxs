package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.features.interval_picker.ui.IntervalPickerParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kdi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28594kdi extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public C23464hyi copydefault;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.kdh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C28594kdi.copydefault(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.kde
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C28594kdi.OLrzqt(this.copydefault);
        }
    });

    public final IntervalPickerParams EZpvd() {
        return (IntervalPickerParams) this.KWHzl.getValue();
    }

    public static final IntervalPickerParams copydefault(C28594kdi c28594kdi) {
        IntervalPickerParams intervalPickerParams;
        android.os.Bundle arguments = c28594kdi.getArguments();
        return (arguments == null || (intervalPickerParams = (IntervalPickerParams) BundleCompat.getParcelable(arguments, "key.params", IntervalPickerParams.class)) == null) ? new IntervalPickerParams(null, null, 3, null) : intervalPickerParams;
    }

    private final kMM AEQbTJ() {
        return (kMM) this.EZpvd.getValue();
    }

    public static final kMM OLrzqt(final C28594kdi c28594kdi) {
        kMM kmm = new kMM();
        kmm.register(C28598kdm.class, new C28597kdl(new Function1() { // from class: o.kdg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28594kdi.AEQbTJ(this.EZpvd, (C28598kdm) obj);
            }
        }));
        return kmm;
    }

    public static final Unit AEQbTJ(C28594kdi c28594kdi, C28598kdm c28598kdm) {
        Intrinsics.checkNotNullParameter(c28598kdm, "");
        ActivityResultCaller parentFragment = c28594kdi.getParentFragment();
        InterfaceC28591kdf interfaceC28591kdf = parentFragment instanceof InterfaceC28591kdf ? (InterfaceC28591kdf) parentFragment : null;
        if (interfaceC28591kdf != null) {
            interfaceC28591kdf.OLrzqt(c28598kdm.EZpvd());
        }
        c28594kdi.dismissAllowingStateLoss();
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
        this.copydefault = c23464hyiCopydefault;
        if (c23464hyiCopydefault != null && (root = c23464hyiCopydefault.getRoot()) != null) {
            root.setAdapter(AEQbTJ());
        }
        java.util.List<TimeIntervalType> listEZpvd = EZpvd().EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        for (TimeIntervalType timeIntervalType : listEZpvd) {
            arrayList.add(new C28598kdm(timeIntervalType, timeIntervalType == EZpvd().OLrzqt()));
        }
        kMM.setData$default(AEQbTJ(), arrayList, null, 2, null);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC28591kdf interfaceC28591kdf = parentFragment instanceof InterfaceC28591kdf ? (InterfaceC28591kdf) parentFragment : null;
        if (interfaceC28591kdf != null) {
            interfaceC28591kdf.isConnected();
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onCancel(dialogInterface);
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC28591kdf interfaceC28591kdf = parentFragment instanceof InterfaceC28591kdf ? (InterfaceC28591kdf) parentFragment : null;
        if (interfaceC28591kdf != null) {
            interfaceC28591kdf.isConnected();
        }
    }

    /* JADX INFO: renamed from: o.kdi$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kdi.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C28594kdi AEQbTJ(@NotNull IntervalPickerParams intervalPickerParams) {
            Intrinsics.checkNotNullParameter(intervalPickerParams, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.params", intervalPickerParams);
            C28594kdi c28594kdi = new C28594kdi();
            c28594kdi.setArguments(bundle);
            return c28594kdi;
        }
    }
}
