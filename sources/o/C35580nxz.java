package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import com.okinc.im.imui.contacts.BlockContactDialogFragment$performBlockContactAction$1$1;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nxz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35580nxz extends AbstractC35529nxA {
    public RelationInfo KWHzl;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.nxH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35580nxz.EZpvd(this.OLrzqt);
        }
    });
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    private final java.lang.String KWHzl() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String EZpvd(C35580nxz c35580nxz) {
        java.lang.String string;
        android.os.Bundle arguments = c35580nxz.getArguments();
        if (arguments != null && (string = arguments.getString("id")) != null) {
            return string;
        }
        java.lang.String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    /* JADX INFO: renamed from: o.nxz$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nxz.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C35580nxz AEQbTJ(@NotNull java.lang.String str, @NotNull RelationInfo relationInfo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(relationInfo, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("info", relationInfo);
            bundle.putString("id", str);
            C35580nxz c35580nxz = new C35580nxz();
            c35580nxz.setArguments(bundle);
            return c35580nxz;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        RelationInfo relationInfo = this.KWHzl;
        if (relationInfo == null) {
            Intrinsics.gEmmrt("");
            relationInfo = null;
        }
        final boolean zIsBlackList = relationInfo.isBlackList();
        int i = C35399nuc.LoaderManager.DNMMPQ;
        RelationInfo relationInfo2 = this.KWHzl;
        if (relationInfo2 == null) {
            Intrinsics.gEmmrt("");
            relationInfo2 = null;
        }
        java.lang.String strCopydefault = C33069mpW.copydefault(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("user", C44157sFk.getDisplayName$default(relationInfo2, null, 1, null))));
        if (!zIsBlackList) {
            int i2 = C35399nuc.LoaderManager.ikcuIV;
            RelationInfo relationInfo3 = this.KWHzl;
            if (relationInfo3 == null) {
                Intrinsics.gEmmrt("");
                relationInfo3 = null;
            }
            strCopydefault = C33069mpW.copydefault(this, i2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("nickname", C44157sFk.getDisplayName$default(relationInfo3, null, 1, null))));
        }
        java.lang.String string = getString(zIsBlackList ? C35399nuc.LoaderManager.DaRZkR : C35399nuc.LoaderManager.SUwuXE);
        Intrinsics.copydefault((java.lang.Object) string);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(zIsBlackList ? C35399nuc.LoaderManager.DsrFlB : C35399nuc.LoaderManager.OFQuKP);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivityRequireActivity);
        viewOnClickListenerC54939xaY.setTitle(strCopydefault);
        viewOnClickListenerC54939xaY.EZpvd(string);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) strAYXKKw, new View.OnClickListener() { // from class: o.nxL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35580nxz.KWHzl(this.EZpvd, zIsBlackList, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C35399nuc.LoaderManager.OqFWZa, new View.OnClickListener() { // from class: o.nxI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35580nxz.copydefault(this.OLrzqt, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return viewOnClickListenerC54939xaY;
    }

    public static final void KWHzl(final C35580nxz c35580nxz, final boolean z, android.view.View view) {
        RelationInfo relationInfo = c35580nxz.KWHzl;
        if (relationInfo == null) {
            Intrinsics.gEmmrt("");
            relationInfo = null;
        }
        c35580nxz.EZpvd(relationInfo.getContactsId(), !z, new Function0() { // from class: o.nxM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35580nxz.KWHzl(z, c35580nxz);
            }
        }, new Function1() { // from class: o.nxJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35580nxz.KWHzl(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        });
    }

    public static final Unit KWHzl(boolean z, C35580nxz c35580nxz) {
        java.lang.String strCopydefault;
        if (!z) {
            int i = C35399nuc.LoaderManager.DtA;
            RelationInfo relationInfo = c35580nxz.KWHzl;
            if (relationInfo == null) {
                Intrinsics.gEmmrt("");
                relationInfo = null;
            }
            strCopydefault = C33069mpW.copydefault(c35580nxz, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("nickname", C44157sFk.getDisplayName$default(relationInfo, null, 1, null))));
        } else {
            int i2 = C35399nuc.LoaderManager.DGgnkA;
            RelationInfo relationInfo2 = c35580nxz.KWHzl;
            if (relationInfo2 == null) {
                Intrinsics.gEmmrt("");
                relationInfo2 = null;
            }
            strCopydefault = C33069mpW.copydefault(c35580nxz, i2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("user", C44157sFk.getDisplayName$default(relationInfo2, null, 1, null))));
        }
        C55326xho.toastWithSuccessfulIcon$default(strCopydefault, 0, 1, (java.lang.Object) null);
        FragmentKt.setFragmentResult(c35580nxz, c35580nxz.KWHzl(), BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_BLOCK_CONTACT_RESULT", java.lang.Boolean.TRUE)));
        c35580nxz.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C35580nxz c35580nxz, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        FragmentKt.setFragmentResult(c35580nxz, c35580nxz.KWHzl(), BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_BLOCK_CONTACT_RESULT", java.lang.Boolean.FALSE), C56390yDp.OLrzqt("KEY_BLOCK_CONTACT_ERROR", C32962mnV.AEQbTJ(th))));
        c35580nxz.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final void copydefault(C35580nxz c35580nxz, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        FragmentKt.setFragmentResult(c35580nxz, c35580nxz.KWHzl(), BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_BLOCK_CONTACT_RESULT", java.lang.Boolean.TRUE)));
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Parcelable parcelable = requireArguments().getParcelable("info");
        Intrinsics.copydefault(parcelable);
        this.KWHzl = (RelationInfo) parcelable;
    }

    public final void EZpvd(java.lang.String str, boolean z, final Function0<Unit> function0, final Function1<? super java.lang.Throwable, Unit> function1) {
        showLoading();
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU != null) {
            AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl(C58156yvv.EZpvd(C44525sTa.copydefault.EZpvd(new BlockContactDialogFragment$performBlockContactAction$1$1(interfaceC35180nqU, str, z, null)), this));
            final Function1 function12 = new Function1() { // from class: o.nxE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C35580nxz.EZpvd(this.OLrzqt, function0, (Unit) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.nxG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C35580nxz.OLrzqt(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.nxD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C35580nxz.AEQbTJ(this.EZpvd, function1, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.nxF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C35580nxz.AEQbTJ(function13, obj);
                }
            });
        }
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C35580nxz c35580nxz, Function0 function0, Unit unit) {
        c35580nxz.dismissLoading();
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C35580nxz c35580nxz, Function1 function1, java.lang.Throwable th) {
        c35580nxz.dismissLoading();
        Intrinsics.copydefault(th);
        function1.invoke(th);
        return Unit.INSTANCE;
    }
}
