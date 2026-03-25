package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.core.view.KeyEventDispatcher;
import com.okinc.business.invest_biz.ui.finality_provider.InvestFinalityProviderItem;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class iPO extends iPG {
    public InvestFinalityProviderItem DbNXlk;
    public static final /* synthetic */ yJA<java.lang.Object>[] djBIcL = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(iPO.class, "contentBinding", "getContentBinding()Lcom/okinc/business/invest_biz/databinding/LayoutInvestFinalityProviderBottomSheetBinding;", 0))};
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int valueOf = 8;
    public final yIP AYXKKw = C27589jxz.EZpvd(this);
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.iPS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return iPO.AEQbTJ(this.copydefault);
        }
    });
    public java.util.List<InvestFinalityProviderItem> gEmmrt = yDY.AhwBna();
    public int values = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.values;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.values = i;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iPO.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ iPO newInstance$default(TaskDescription taskDescription, java.util.List list, InvestFinalityProviderItem investFinalityProviderItem, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                investFinalityProviderItem = null;
            }
            return taskDescription.OLrzqt(list, investFinalityProviderItem);
        }

        public final iPO OLrzqt(@NotNull java.util.List<InvestFinalityProviderItem> list, InvestFinalityProviderItem investFinalityProviderItem) {
            Intrinsics.checkNotNullParameter(list, "");
            iPO ipo = new iPO();
            ipo.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("key.providerList", list), C56390yDp.OLrzqt("key.selectedProvider", investFinalityProviderItem)));
            return ipo;
        }
    }

    public final iJW AhwBna() {
        return (iJW) this.AYXKKw.getValue(this, djBIcL[0]);
    }

    public final void OLrzqt(iJW ijw) {
        this.AYXKKw.KWHzl(this, djBIcL[0], ijw);
    }

    /* JADX DEBUG: Possible override for method o.iPG.OLrzqt()V */
    public final iPK OLrzqt() {
        return (iPK) this.AhwBna.getValue();
    }

    public static final iPK AEQbTJ(final iPO ipo) {
        return new iPK(new Function1() { // from class: o.iPQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iPO.KWHzl(this.KWHzl, (InvestFinalityProviderItem) obj);
            }
        });
    }

    public static final Unit KWHzl(iPO ipo, InvestFinalityProviderItem investFinalityProviderItem) {
        Intrinsics.checkNotNullParameter(investFinalityProviderItem, "");
        ipo.AEQbTJ(investFinalityProviderItem);
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setStyle(3);
        wxq.setTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.invokespecialaGOrKO));
        wxq.setCloseVisibility(true);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.iPR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iPO.KWHzl(this.OLrzqt, view);
            }
        });
    }

    public static final void KWHzl(iPO ipo, android.view.View view) {
        ipo.dismissAllowingStateLoss();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        OLrzqt(iJW.copydefault(android.view.LayoutInflater.from(requireContext())));
        constraintLayout.addView(AhwBna().getRoot(), new ViewGroup.LayoutParams(-1, -2));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        java.lang.Object obj = null;
        java.util.List<InvestFinalityProviderItem> parcelableArrayList = arguments != null ? arguments.getParcelableArrayList("key.providerList") : null;
        if (parcelableArrayList == null) {
            parcelableArrayList = yDY.AhwBna();
        }
        this.gEmmrt = parcelableArrayList;
        java.util.Iterator<T> it = parcelableArrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((InvestFinalityProviderItem) next).isSelected()) {
                obj = next;
                break;
            }
        }
        InvestFinalityProviderItem investFinalityProviderItem = (InvestFinalityProviderItem) obj;
        if (investFinalityProviderItem == null) {
            investFinalityProviderItem = (InvestFinalityProviderItem) CollectionsKt___CollectionsKt.firstOrNull(this.gEmmrt);
        }
        this.DbNXlk = investFinalityProviderItem;
        AhwBna().AEQbTJ.setAdapter(OLrzqt());
        gEmmrt();
    }

    public final void gEmmrt() {
        iPK ipkOLrzqt = OLrzqt();
        java.util.List<InvestFinalityProviderItem> list = this.gEmmrt;
        for (InvestFinalityProviderItem investFinalityProviderItem : list) {
            investFinalityProviderItem.setSelected(Intrinsics.EZpvd(investFinalityProviderItem, this.DbNXlk));
        }
        ipkOLrzqt.KWHzl(list);
        OLrzqt().notifyDataSetChanged();
    }

    public final void AEQbTJ(InvestFinalityProviderItem investFinalityProviderItem) {
        if (investFinalityProviderItem != null) {
            ActivityResultCaller parentFragment = getParentFragment();
            iPT ipt = null;
            iPT ipt2 = parentFragment instanceof iPT ? (iPT) parentFragment : null;
            if (ipt2 == null) {
                KeyEventDispatcher.Component activity = getActivity();
                if (activity instanceof iPT) {
                    ipt = (iPT) activity;
                }
            } else {
                ipt = ipt2;
            }
            if (ipt != null) {
                ipt.KWHzl(investFinalityProviderItem);
            }
        }
        dismissAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        android.content.Context context = getContext();
        if (context != null) {
            C33054mpH.OLrzqt(context, AhwBna().AEQbTJ);
        }
    }
}
