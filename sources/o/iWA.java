package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import com.okinc.uilab.list.OKAnchorSelection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class iWA extends wXX {
    public static final /* synthetic */ yJA<java.lang.Object>[] copydefault = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(iWA.class, "mBinding", "getMBinding()Lcom/okinc/business/invest_biz/databinding/DialogAggregateFilterBinding;", 0))};
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public java.util.List<C55276xgr> OLrzqt = yDY.AhwBna();
    public final yIP AEQbTJ = C27589jxz.EZpvd(this);
    public int KWHzl = 1;

    public final C23734iHi AEQbTJ() {
        return (C23734iHi) this.AEQbTJ.getValue(this, copydefault[0]);
    }

    public final void KWHzl(C23734iHi c23734iHi) {
        this.AEQbTJ.KWHzl(this, copydefault[0], c23734iHi);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setCloseVisibility(false);
        wxq.setStyle(2);
        wxq.AYXKKw().setText(EZpvd());
    }

    public final void OLrzqt(java.util.List<C55276xgr> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (C55276xgr c55276xgr : list) {
            if (this.KWHzl == 1) {
                java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
                Intrinsics.copydefault(objOLrzqt, "");
                if (((iWQ) objOLrzqt).OLrzqt().length() > 0) {
                    arrayList2.add(c55276xgr);
                }
            }
            arrayList.add(c55276xgr);
        }
        OKAnchorSelection oKAnchorSelection = AEQbTJ().EZpvd;
        oKAnchorSelection.OLrzqt().setVisibility(8);
        oKAnchorSelection.OLrzqt(new iWR(false, null, CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList)));
        oKAnchorSelection.OLrzqt(new iWR(false, null, CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList2)));
        oKAnchorSelection.setConvertViewCallback(new Function2() { // from class: o.iWw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return iWA.KWHzl(this.OLrzqt, (C55043xcW) obj, obj2);
            }
        });
    }

    public static final Unit KWHzl(iWA iwa, C55043xcW c55043xcW, java.lang.Object obj) {
        int iCopydefault;
        android.widget.ImageView imageView;
        Intrinsics.checkNotNullParameter(c55043xcW, "");
        Intrinsics.copydefault(obj, "");
        C55276xgr c55276xgr = (C55276xgr) obj;
        c55043xcW.EZpvd(C25493ixk.ActionBar.DQzvGNdrmXxudrmXxu, c55276xgr.AhwBna().toString());
        int i = C25493ixk.ActionBar.DQzvGNdrmXxudrmXxu;
        if (c55276xgr.AYXKKw()) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.UlJrfe);
        }
        c55043xcW.OLrzqt(i, iCopydefault);
        c55043xcW.OLrzqt(C25493ixk.ActionBar.DTeKQX, c55276xgr.AEQbTJ());
        c55043xcW.OLrzqt(C25493ixk.ActionBar.RSDDiY, c55276xgr.KWHzl() != null);
        if (c55276xgr.KWHzl() != null && (imageView = (android.widget.ImageView) c55043xcW.EZpvd(C25493ixk.ActionBar.RSDDiY)) != null) {
            C57659ymb.loadFixSizeBorderImage$default(imageView, java.lang.String.valueOf(c55276xgr.KWHzl()), C52761wXj.TaskDescription.createSocket, 0.0f, 0.0f, 12, null);
        }
        android.view.View view = c55043xcW.itemView;
        view.setOnClickListener(new Application(view, 1000L, c55276xgr, iwa));
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        KWHzl(C23734iHi.EZpvd(getLayoutInflater()));
        constraintLayout.addView(AEQbTJ().getRoot());
        OKAnchorSelection oKAnchorSelection = AEQbTJ().EZpvd;
        C55173xeu c55173xeuCopydefault = oKAnchorSelection.copydefault();
        if (c55173xeuCopydefault != null) {
            c55173xeuCopydefault.setTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.sElUiK));
        }
        oKAnchorSelection.djBIcL().setVisibility(8);
        oKAnchorSelection.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.aBDePw));
        oKAnchorSelection.setSuspensionTitleBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.hOMIpD));
        OLrzqt(this.OLrzqt);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC24155iWy interfaceC24155iWy = null;
        InterfaceC24155iWy interfaceC24155iWy2 = parentFragment instanceof InterfaceC24155iWy ? (InterfaceC24155iWy) parentFragment : null;
        if (interfaceC24155iWy2 == null) {
            KeyEventDispatcher.Component activity = getActivity();
            if (activity instanceof InterfaceC24155iWy) {
                interfaceC24155iWy = (InterfaceC24155iWy) activity;
            }
        } else {
            interfaceC24155iWy = interfaceC24155iWy2;
        }
        if (interfaceC24155iWy != null) {
            interfaceC24155iWy.KWHzl();
        }
        super.onDismiss(dialogInterface);
    }

    public final java.lang.String EZpvd() {
        int i = this.KWHzl;
        if (i == 1) {
            return C33070mpX.AYXKKw(C25493ixk.FragmentManager.DcMfJKffREWX);
        }
        if (i == 2) {
            return C33070mpX.AYXKKw(C25493ixk.FragmentManager.DcMfJKfNUfqk);
        }
        if (i == 3 || i == 4) {
            return C33070mpX.AYXKKw(C25493ixk.FragmentManager.copydefault);
        }
        return i != 5 ? "" : C33070mpX.AYXKKw(C25493ixk.FragmentManager.UrRBLY);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iWA.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final iWA KWHzl(@NotNull java.util.List<C55276xgr> list, int i) {
            Intrinsics.checkNotNullParameter(list, "");
            iWA iwa = new iWA();
            iwa.OLrzqt = list;
            iwa.KWHzl = i;
            return iwa;
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ iWA AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C55276xgr KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C55276xgr c55276xgr, iWA iwa) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c55276xgr;
            this.AEQbTJ = iwa;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (this.KWHzl.AYXKKw()) {
                    ActivityResultCaller parentFragment = this.AEQbTJ.getParentFragment();
                    InterfaceC24155iWy interfaceC24155iWy = null;
                    InterfaceC24155iWy interfaceC24155iWy2 = parentFragment instanceof InterfaceC24155iWy ? (InterfaceC24155iWy) parentFragment : null;
                    if (interfaceC24155iWy2 == null) {
                        KeyEventDispatcher.Component activity = this.AEQbTJ.getActivity();
                        if (activity instanceof InterfaceC24155iWy) {
                            interfaceC24155iWy = (InterfaceC24155iWy) activity;
                        }
                    } else {
                        interfaceC24155iWy = interfaceC24155iWy2;
                    }
                    if (interfaceC24155iWy != null) {
                        interfaceC24155iWy.OLrzqt(this.KWHzl);
                    }
                    this.AEQbTJ.dismiss();
                }
            }
        }
    }
}
