package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SignalListItem;
import com.okinc.unify_trade.biz.ThirdSignalDetail;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotSignSelectPresenter;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import o.vYX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vZa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50725vZa extends AbstractC49945uyC<uWU, SignalBotSignSelectPresenter> {
    public Function0<Unit> AYXKKw;
    public final ActivityResultLauncher<android.content.Intent> copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public final int KWHzl = C48033uCm.Activity.DuXjdv;
    public float OLrzqt = 0.95f;
    public final C43316rmw djBIcL = new C43316rmw();

    /* JADX INFO: renamed from: o.vZa$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function0<Unit> function0) {
        this.AYXKKw = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.OLrzqt;
    }

    public C50725vZa() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.vZg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C50725vZa.EZpvd(this.AEQbTJ, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.copydefault = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.vZa$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vZa.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fJNWhG();
        fARcdN();
        isConnected();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.app.Dialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.getBehavior().setDraggable(false);
            bottomSheetDialog.getBehavior().setSkipCollapsed(true);
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C55688xof.Application.extraCallbackWithResult));
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new StateListAnimator(imageViewKWHzl, 1000L, this));
    }

    private final void fJNWhG() {
        C43316rmw c43316rmw = this.djBIcL;
        c43316rmw.register(SignalListItem.class, new vZU(new Function1() { // from class: o.vZj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50725vZa.KWHzl(this.AEQbTJ, (SignalListItem) obj);
            }
        }, new Function1() { // from class: o.vZk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50725vZa.AYXKKw(this.copydefault, (SignalListItem) obj);
            }
        }, new Function1() { // from class: o.vZh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50725vZa.valueOf(this.OLrzqt, (SignalListItem) obj);
            }
        }, new Function1() { // from class: o.vZi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50725vZa.gEmmrt(this.AEQbTJ, (SignalListItem) obj);
            }
        }));
        c43316rmw.register(C55845xrd.class, new vZS(new Function0() { // from class: o.vZl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50725vZa.copydefault(this.KWHzl);
            }
        }, new Function1() { // from class: o.vZp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50725vZa.OLrzqt(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        c43316rmw.register(CommonEmptyData.class, new C50041uzt(null, 1, null));
        values().EZpvd.setAdapter(this.djBIcL);
        C33546myW c33546myW = values().copydefault;
        c33546myW.setNoMoreDataEffective(true);
        c33546myW.AhwBna(true);
        c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.vZf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C50725vZa.copydefault(this.OLrzqt, interfaceC57934yrl);
            }
        });
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.vZc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C50725vZa.EZpvd(this.EZpvd, interfaceC57934yrl);
            }
        });
    }

    public static final Unit KWHzl(C50725vZa c50725vZa, SignalListItem signalListItem) {
        Intrinsics.checkNotNullParameter(signalListItem, "");
        vYX.StateListAnimator stateListAnimator = vYX.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = c50725vZa.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        stateListAnimator.OLrzqt(signalListItem, childFragmentManager);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C50725vZa c50725vZa, SignalListItem signalListItem) {
        Intrinsics.checkNotNullParameter(signalListItem, "");
        androidx.fragment.app.FragmentManager parentFragmentManager = c50725vZa.getParentFragmentManager();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("data", signalListItem);
        Unit unit = Unit.INSTANCE;
        parentFragmentManager.setFragmentResult("selected_signal", bundle);
        c50725vZa.dismissAllowingStateLoss();
        return unit;
    }

    public static final Unit valueOf(C50725vZa c50725vZa, SignalListItem signalListItem) {
        Intrinsics.checkNotNullParameter(signalListItem, "");
        c50725vZa.OLrzqt().EZpvd(signalListItem);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C50725vZa c50725vZa, SignalListItem signalListItem) {
        Intrinsics.checkNotNullParameter(signalListItem, "");
        c50725vZa.EZpvd(signalListItem);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C50725vZa c50725vZa) {
        c50725vZa.copydefault.launch(new android.content.Intent(c50725vZa.requireContext(), (java.lang.Class<?>) vXW.class));
        c50725vZa.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C50725vZa c50725vZa, boolean z) {
        c50725vZa.OLrzqt().KWHzl(z);
        return Unit.INSTANCE;
    }

    public static final void copydefault(C50725vZa c50725vZa, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        SignalBotSignSelectPresenter.fetchSignList$default(c50725vZa.OLrzqt(), false, 1, null);
    }

    public static final void EZpvd(C50725vZa c50725vZa, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c50725vZa.OLrzqt().OLrzqt();
    }

    private final void isConnected() {
        OLrzqt().KWHzl(false);
    }

    private final void fARcdN() {
        TradeLiveData<java.util.List<SignalListItem>> tradeLiveDataEZpvd = OLrzqt().EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataEZpvd.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.vZb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50725vZa.copydefault(this.KWHzl, (java.util.List) obj);
            }
        }));
        TradeLiveData<java.util.List<java.lang.String>> tradeLiveDataKWHzl = OLrzqt().KWHzl();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataKWHzl.observe(viewLifecycleOwner2, new Activity(new Function1() { // from class: o.vZe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50725vZa.OLrzqt(this.AEQbTJ, (java.util.List) obj);
            }
        }));
    }

    public static final Unit copydefault(C50725vZa c50725vZa, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c50725vZa.copydefault();
        C33546myW c33546myW = c50725vZa.values().copydefault;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        C57589ylK.KWHzl(c33546myW, list.isEmpty());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C50725vZa c50725vZa, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        vYH.Companion.AEQbTJ(new SignalBotReq((java.lang.String) null, (java.lang.String) null, new java.util.ArrayList(list), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, false, (ThirdSignalDetail) null, false, (java.util.ArrayList) null, (java.lang.String) null, (AutoVipProfitInfo) null, 32763, (DefaultConstructorMarker) null)).show(c50725vZa.getChildFragmentManager(), "");
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        C49952uyJ.updateDataOrEmpty$default(this.djBIcL, OLrzqt().AEQbTJ(), C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0, null, null, false, 60, null);
    }

    public static final void EZpvd(C50725vZa c50725vZa, ActivityResult activityResult) {
        android.os.Bundle bundle;
        if (activityResult.getResultCode() == -1) {
            androidx.fragment.app.FragmentManager parentFragmentManager = c50725vZa.getParentFragmentManager();
            android.content.Intent data = activityResult.getData();
            if (data == null || (bundle = data.getExtras()) == null) {
                bundle = new android.os.Bundle();
            }
            parentFragmentManager.setFragmentResult("created_signal", bundle);
            c50725vZa.dismissAllowingStateLoss();
        }
    }

    public final void EZpvd(SignalListItem signalListItem) {
        C50738vZn c50738vZnEZpvd = C50738vZn.Companion.EZpvd(signalListItem);
        c50738vZnEZpvd.OLrzqt(new Function2() { // from class: o.vZd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50725vZa.copydefault(this.copydefault, ((java.lang.Boolean) obj).booleanValue(), (SignalListItem) obj2);
            }
        });
        c50738vZnEZpvd.show(getChildFragmentManager(), "SignalBotUpdateDialogFragment");
    }

    public static final Unit copydefault(C50725vZa c50725vZa, boolean z, SignalListItem signalListItem) {
        Intrinsics.checkNotNullParameter(signalListItem, "");
        if (z) {
            java.lang.Object obj = null;
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.hQkvHM), 0, 1, (java.lang.Object) null);
            java.util.List<?> items = c50725vZa.djBIcL.getItems();
            Intrinsics.checkNotNullExpressionValue(items, "");
            java.util.Iterator<T> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if ((next instanceof SignalListItem) && Intrinsics.EZpvd((java.lang.Object) ((SignalListItem) next).getSignalChanId(), (java.lang.Object) signalListItem.getSignalChanId())) {
                    obj = next;
                    break;
                }
            }
            if (obj != null) {
                SignalListItem signalListItem2 = (SignalListItem) obj;
                signalListItem2.setSignalChanName(signalListItem.getSignalChanName());
                signalListItem2.setSignalDescription(signalListItem.getSignalDescription());
                C43316rmw c43316rmw = c50725vZa.djBIcL;
                java.util.List<?> items2 = c43316rmw.getItems();
                Intrinsics.checkNotNullExpressionValue(items2, "");
                c43316rmw.notifyItemChanged(CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends java.lang.Object>) items2, obj));
            }
            androidx.fragment.app.FragmentManager parentFragmentManager = c50725vZa.getParentFragmentManager();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", signalListItem);
            Unit unit = Unit.INSTANCE;
            parentFragmentManager.setFragmentResult("updated_signal", bundle);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vZa$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C50725vZa KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C50725vZa c50725vZa) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c50725vZa;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.AYXKKw;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
