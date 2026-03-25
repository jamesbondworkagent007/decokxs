package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.api.model.tx.signdata.TransferSignData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.C9225bRa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gwn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21282gwn extends AbstractC14668dpm {
    public C9225bRa AhwBna;
    public java.util.List<C9225bRa.Activity> DbNXlk;
    public boolean EZpvd = true;
    public boolean KWHzl;
    public C9225bRa.Activity OLrzqt;
    public java.lang.Integer copydefault;
    public InterfaceC9041bOB fetchVPNInfo;
    public AbstractC16547elw valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.gwn$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gwn.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C21282gwn EZpvd(InterfaceC9041bOB interfaceC9041bOB, @NotNull C9225bRa.Activity activity, @NotNull java.util.List<C9225bRa.Activity> list, int i) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(list, "");
            C21282gwn c21282gwn = new C21282gwn();
            c21282gwn.OLrzqt = activity;
            c21282gwn.DbNXlk = list;
            c21282gwn.copydefault = java.lang.Integer.valueOf(i);
            c21282gwn.fetchVPNInfo = interfaceC9041bOB;
            return c21282gwn;
        }
    }

    @Override // o.AbstractC14668dpm
    public android.view.View AEQbTJ(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.valueOf = AbstractC16547elw.AEQbTJ(android.view.LayoutInflater.from(getContext()), viewGroup, false);
        EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContract));
        EZpvd(true);
        OLrzqt(true);
        AbstractC16547elw abstractC16547elw = this.valueOf;
        if (abstractC16547elw == null) {
            Intrinsics.gEmmrt("");
            abstractC16547elw = null;
        }
        android.view.View root = abstractC16547elw.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC57212yeE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        C9225bRa c9225bRaIsConnected;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.DGgkXd));
        InterfaceC9041bOB interfaceC9041bOB = this.fetchVPNInfo;
        if (interfaceC9041bOB == null || (c9225bRaIsConnected = interfaceC9041bOB.fJNWhG()) == null) {
            return;
        }
        this.AhwBna = c9225bRaIsConnected;
        AbstractC58185ywX<FeeItem> abstractC58185ywXIsConnected = c9225bRaIsConnected.isConnected();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXIsConnected, viewLifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.gwo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21282gwn.EZpvd(this.AEQbTJ, (C9165bQT) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gwq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21282gwn.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gwp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21282gwn.KWHzl((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gws
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21282gwn.KWHzl(function12, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final C21282gwn c21282gwn, C9165bQT c9165bQT) {
        C9225bRa.Activity activity;
        AbstractC16547elw abstractC16547elw = c21282gwn.valueOf;
        if (abstractC16547elw == null) {
            Intrinsics.gEmmrt("");
            abstractC16547elw = null;
        }
        C21286gwr c21286gwr = abstractC16547elw.copydefault;
        java.lang.Object obj = c21282gwn.fetchVPNInfo;
        Intrinsics.copydefault(obj, "");
        AbstractC8564bFB<?, ?> abstractC8564bFB = (AbstractC8564bFB) obj;
        C9225bRa c9225bRa = c21282gwn.AhwBna;
        if (c9225bRa == null) {
            Intrinsics.gEmmrt("");
            c9225bRa = null;
        }
        java.util.List<C9225bRa.Activity> listZsXlph = c9225bRa.zsXlph();
        C9225bRa.Activity activity2 = c21282gwn.OLrzqt;
        if (activity2 == null) {
            Intrinsics.gEmmrt("");
            activity = null;
        } else {
            activity = activity2;
        }
        java.lang.Integer num = c21282gwn.copydefault;
        c21286gwr.setDataList(abstractC8564bFB, listZsXlph, activity, num != null ? num.intValue() : 32, c9165bQT.getFeeChangeType() == 3);
        AbstractC16547elw abstractC16547elw2 = c21282gwn.valueOf;
        if (abstractC16547elw2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16547elw2 = null;
        }
        abstractC16547elw2.copydefault.setOnSelectCryptoFinish(new Function1() { // from class: o.gwt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C21282gwn.KWHzl(this.AEQbTJ, (C9225bRa.Activity) obj2);
            }
        });
        if (c21282gwn.EZpvd) {
            c21282gwn.EZpvd = false;
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c21282gwn, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C21282gwn c21282gwn, C9225bRa.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        InterfaceC9041bOB interfaceC9041bOB = c21282gwn.fetchVPNInfo;
        c21282gwn.OLrzqt(interfaceC9041bOB instanceof C9191bQt ? (C9191bQt) interfaceC9041bOB : null, activity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(C9191bQt c9191bQt, final C9225bRa.Activity activity) {
        TransferSignData transferSignData;
        if (c9191bQt != null && (transferSignData = (TransferSignData) c9191bQt.QVsKAR()) != null && transferSignData.isTransferMaxAmount()) {
            if (c9191bQt.fHqPtx().AhwBna() == activity.copydefault().AhwBna() && !EZpvd(activity)) {
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivityRequireActivity);
                viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(C13754dXa.FragmentManager.getMediaType, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", activity.copydefault().fJNWhG()))));
                viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.getNotifyChildrenChangedOptions, new View.OnClickListener() { // from class: o.gwu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C21282gwn.KWHzl(this.copydefault, viewOnClickListenerC54939xaY, activity, view);
                    }
                });
                viewOnClickListenerC54939xaY.show();
                return;
            }
            long jAhwBna = c9191bQt.fHqPtx().AhwBna();
            C9225bRa c9225bRa = this.AhwBna;
            C9225bRa c9225bRa2 = null;
            if (c9225bRa == null) {
                Intrinsics.gEmmrt("");
                c9225bRa = null;
            }
            if (jAhwBna == c9225bRa.AYXKKw().AhwBna()) {
                C9225bRa c9225bRa3 = this.AhwBna;
                if (c9225bRa3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c9225bRa2 = c9225bRa3;
                }
                if (!c9225bRa2.KWHzl().AEQbTJ()) {
                    this.KWHzl = true;
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("coinId", activity.copydefault().AhwBna());
                    intent.putExtra("result", this.KWHzl);
                    Unit unit = Unit.INSTANCE;
                    OLrzqt(-1, intent);
                    return;
                }
            }
            this.KWHzl = false;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("coinId", activity.copydefault().AhwBna());
            intent2.putExtra("result", this.KWHzl);
            Unit unit2 = Unit.INSTANCE;
            OLrzqt(-1, intent2);
            return;
        }
        this.KWHzl = false;
        android.content.Intent intent3 = new android.content.Intent();
        intent3.putExtra("coinId", activity.copydefault().AhwBna());
        intent3.putExtra("result", this.KWHzl);
        Unit unit3 = Unit.INSTANCE;
        OLrzqt(-1, intent3);
    }

    public static final void KWHzl(C21282gwn c21282gwn, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, C9225bRa.Activity activity, android.view.View view) {
        c21282gwn.KWHzl = true;
        viewOnClickListenerC54939xaY.dismiss();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("coinId", activity.copydefault().AhwBna());
        intent.putExtra("result", c21282gwn.KWHzl);
        Unit unit = Unit.INSTANCE;
        c21282gwn.OLrzqt(-1, intent);
    }

    public final boolean EZpvd(C9225bRa.Activity activity) {
        java.lang.Integer num = this.copydefault;
        if (num != null && num.intValue() == 31) {
            return activity.AuCTel();
        }
        if (num != null && num.intValue() == 32) {
            return activity.values();
        }
        if (num != null && num.intValue() == 33) {
            return activity.djBIcL();
        }
        return false;
    }
}
