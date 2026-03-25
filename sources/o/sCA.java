package o;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.okex.uploadlog.view.UploadLogFormFragment$initViewModel$1;
import com.okinc.okex.uploadlog.view.displaymodels.ExtraFormData;
import com.okinc.okex.uploadlog.viewmodel.UploadLogViewModel;
import java.util.Calendar;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47315tni;
import o.C52761wXj;
import o.sCS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class sCA extends sCC implements sCS.StateListAnimator {
    public final InterfaceC56387yDm gEmmrt;
    public AbstractC47415tpc valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AYXKKw = 8;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.sCE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return sCA.EZpvd(this.copydefault);
        }
    });
    public final int AhwBna = C47315tni.ActionBar.finit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AhwBna;
    }

    public sCA() {
        final Function0 function0 = null;
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(UploadLogViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.uploadlog.view.UploadLogFormFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.uploadlog.view.UploadLogFormFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.uploadlog.view.UploadLogFormFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    public final UploadLogViewModel AYXKKw() {
        return (UploadLogViewModel) this.gEmmrt.getValue();
    }

    /* JADX DEBUG: Possible override for method o.sCC.EZpvd()V */
    public final sCS EZpvd() {
        return (sCS) this.djBIcL.getValue();
    }

    public static final sCS EZpvd(sCA sca) {
        return new sCS(sca);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sCA.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final sCA KWHzl() {
            return new sCA();
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC47415tpc abstractC47415tpcKWHzl = AbstractC47415tpc.KWHzl(view);
        this.valueOf = abstractC47415tpcKWHzl;
        if (abstractC47415tpcKWHzl != null) {
            abstractC47415tpcKWHzl.OLrzqt.setAdapter(EZpvd());
            abstractC47415tpcKWHzl.OLrzqt.addItemDecoration(new C45390sor(C52761wXj.StateListAnimator.AxsJAYaxsJAY, yEE.AhwBna(C56524yIo.AEQbTJ(sCS.Dialog.class), C56524yIo.AEQbTJ(sCS.ActionBar.class)), null, 4, null));
            abstractC47415tpcKWHzl.OLrzqt.addItemDecoration(new C45390sor(C52761wXj.StateListAnimator.ffGIBT, null, yED.AEQbTJ(C56524yIo.AEQbTJ(sCS.ActionBar.class)), 2, null));
        }
        djBIcL();
        view.post(new java.lang.Runnable() { // from class: o.sCH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                sCA.djBIcL(this.copydefault);
            }
        });
    }

    public static final void djBIcL(sCA sca) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) sca, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.valueOf = null;
        super.onDestroyView();
    }

    private final void djBIcL() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UploadLogFormFragment$initViewModel$1(this, null), 3, null);
    }

    @Override // o.sCS.StateListAnimator
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AYXKKw().KWHzl(str, str2);
    }

    @Override // o.sCS.StateListAnimator
    public void OLrzqt(@NotNull final java.lang.String str, ExtraFormData.DateInfo dateInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context context = getContext();
        if (context != null) {
            final android.app.DatePickerDialog datePickerDialog = new android.app.DatePickerDialog(context, C47315tni.Fragment.KWHzl);
            if (dateInfo != null) {
                datePickerDialog.updateDate(dateInfo.AEQbTJ(), dateInfo.EZpvd(), dateInfo.copydefault());
            }
            datePickerDialog.setOnDateSetListener(new DatePickerDialog.OnDateSetListener() { // from class: o.sCF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(android.widget.DatePicker datePicker, int i, int i2, int i3) {
                    sCA.copydefault(this.EZpvd, datePickerDialog, str, datePicker, i, i2, i3);
                }
            });
            datePickerDialog.show();
        }
    }

    public static final void copydefault(sCA sca, android.app.DatePickerDialog datePickerDialog, java.lang.String str, android.widget.DatePicker datePicker, int i, int i2, int i3) {
        android.content.Context context = datePickerDialog.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        sca.OLrzqt(context, str, i, i2, i3);
    }

    public final void OLrzqt(android.content.Context context, final java.lang.String str, final int i, final int i2, final int i3) {
        Calendar calendar = Calendar.getInstance();
        new android.app.TimePickerDialog(context, C47315tni.Fragment.KWHzl, new TimePickerDialog.OnTimeSetListener() { // from class: o.sCI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(android.widget.TimePicker timePicker, int i4, int i5) {
                sCA.copydefault(this.copydefault, str, i, i2, i3, timePicker, i4, i5);
            }
        }, calendar.get(11), calendar.get(12), android.text.format.DateFormat.is24HourFormat(context)).show();
    }

    public static final void copydefault(sCA sca, java.lang.String str, int i, int i2, int i3, android.widget.TimePicker timePicker, int i4, int i5) {
        sca.AYXKKw().OLrzqt(str, new ExtraFormData.DateInfo(i, i2, i3, i4, i5));
    }

    @Override // o.sCS.StateListAnimator
    public void copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        AYXKKw().AEQbTJ(str, str2);
    }

    @Override // o.sCS.StateListAnimator
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        FragmentKt.setFragmentResult(this, "KEY_FRAGMENT_ACTIONS", BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_SELECT_ATTACHMENT", java.lang.Boolean.TRUE)));
    }

    @Override // o.sCS.StateListAnimator
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AYXKKw().AEQbTJ(str);
    }

    @Override // o.sCS.StateListAnimator
    public void copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        AYXKKw().KWHzl(str, z);
    }

    @Override // o.sCS.StateListAnimator
    public void gEmmrt() {
        AYXKKw().isConnected();
    }
}
