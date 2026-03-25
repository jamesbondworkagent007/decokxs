package o;

import android.view.View;
import com.okinc.business.defi.biz.net.bean.AAStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractDialogInterfaceOnKeyListenerC57208yeA;
import o.C13754dXa;
import o.C14662dpg;
import o.fPO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fPH {
    public static final fPH OLrzqt = new fPH();

    private fPH() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fPH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleShowAACopyBottomSheet$default(fPH fph, androidx.fragment.app.FragmentManager fragmentManager, AbstractC12782ctV abstractC12782ctV, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        fph.copydefault(fragmentManager, abstractC12782ctV, z, (Function0<Unit>) function0);
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull AbstractC12782ctV abstractC12782ctV, boolean z, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if ((abstractC12782ctV.fdOvFl() && fPD.copydefault.OLrzqt()) || z) {
            C21053gsW.Companion.KWHzl(abstractC12782ctV.DbNXlk()).OLrzqt(fragmentManager, "SmartWalletChainInfoBottomSheet", function0 != null ? new fPO.Activity(function0) : null);
            fPD.copydefault.KWHzl(false);
        } else if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dpg.Activity.newInstance$default(o.dpg$Activity, float, int, int, java.lang.Object):o.dpg */
    public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        C14662dpg c14662dpgNewInstance$default = C14662dpg.Activity.newInstance$default(C14662dpg.Companion, 0.92f, 0, 2, null);
        c14662dpgNewInstance$default.EZpvd((AbstractC57212yeE) fAZ.Companion.AEQbTJ(str));
        c14662dpgNewInstance$default.EZpvd(fragmentManager, "AACreateIntroduceFragment", new AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity() { // from class: o.fPQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity
            public final void copydefault(android.os.Bundle bundle) {
                fPH.copydefault(function0, bundle);
            }
        });
    }

    public static final void copydefault(Function0 function0, android.os.Bundle bundle) {
        if (bundle == null || function0 == null) {
            return;
        }
        function0.invoke();
    }

    public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (i != 1) {
            return;
        }
        fAW.Companion.AEQbTJ(str, str2, str3, str4, new Function1() { // from class: o.fPJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fPH.copydefault(((java.lang.Boolean) obj).booleanValue());
            }
        }).show(fragmentManager, "AAImportPrivateKeyOrTransferTipsFragment");
    }

    public static final Unit copydefault(boolean z) {
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull final yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit> yho) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(yho, "");
        try {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.hasStableIds);
            viewOnClickListenerC54939xaY.OLrzqt(C13754dXa.FragmentManager.AlertControllerCheckedItemAdapter, new View.OnClickListener() { // from class: o.fPM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    fPH.OLrzqt(viewOnClickListenerC54939xaY, yho, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("AADialogHelper", "showNetworkErrorDialog - Failed to show dialog", e);
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, yHO yho, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        yho.invoke(0, view, viewOnClickListenerC54939xaY);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fPH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showOwnerCheckFailedDialog$default(fPH fph, android.content.Context context, AAStatus aAStatus, int i, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            function0 = null;
        }
        fph.AEQbTJ(context, aAStatus, i, (Function0<Unit>) function0);
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull AAStatus aAStatus, int i, final Function0<Unit> function0) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aAStatus, "");
        if (aAStatus == AAStatus.Normal) {
            return;
        }
        if (aAStatus == AAStatus.ProxyAbnormal) {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.LayoutRes);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.Keep);
        }
        showTwoButton$default(this, null, strAYXKKw, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getNotifyChildrenChangedOptions), null, context, false, new yHO() { // from class: o.fPL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return fPH.copydefault(function0, ((java.lang.Integer) obj).intValue(), (android.view.View) obj2, (ViewOnClickListenerC54939xaY) obj3);
            }
        }, 41, null);
    }

    public static final Unit copydefault(Function0 function0, int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fPH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showDappCheckSupportDialog$default(fPH fph, android.content.Context context, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        fph.OLrzqt(context, (Function0<Unit>) function0);
    }

    public final void OLrzqt(@NotNull android.content.Context context, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        showTwoButton$default(this, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getDelegate), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getNotifyChildrenChangedOptions), null, context, false, new yHO() { // from class: o.fPK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return fPH.AEQbTJ(function0, ((java.lang.Integer) obj).intValue(), (android.view.View) obj2, (ViewOnClickListenerC54939xaY) obj3);
            }
        }, 41, null);
    }

    public static final Unit AEQbTJ(Function0 function0, int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showTwoButton$default(fPH fph, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.Context context, boolean z, yHO yho, int i, java.lang.Object obj) {
        fph.copydefault((i & 1) != 0 ? null : str, str2, str3, (i & 8) != 0 ? null : str4, context, (i & 32) != 0 ? true : z, yho);
    }

    public final void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.Context context, final boolean z, final yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit> yho) {
        if (context != null) {
            try {
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(str);
                viewOnClickListenerC54939xaY.EZpvd(str2);
                viewOnClickListenerC54939xaY.AEQbTJ(str3, new View.OnClickListener() { // from class: o.fPP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        fPH.EZpvd(yho, viewOnClickListenerC54939xaY, z, view);
                    }
                });
                if (C33129mqd.OLrzqt((java.lang.CharSequence) str4)) {
                    Intrinsics.copydefault((java.lang.Object) str4);
                    viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) str4, new View.OnClickListener() { // from class: o.fPN
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            fPH.KWHzl(yho, viewOnClickListenerC54939xaY, z, view);
                        }
                    });
                }
                viewOnClickListenerC54939xaY.setCancelable(false);
                viewOnClickListenerC54939xaY.show();
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("AADialogHelper", "showTwoButton - Failed to show dialog", e);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public static final void EZpvd(yHO yho, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, boolean z, android.view.View view) {
        Intrinsics.copydefault(view);
        yho.invoke(0, view, viewOnClickListenerC54939xaY);
        if (z) {
            viewOnClickListenerC54939xaY.dismiss();
        }
    }

    public static final void KWHzl(yHO yho, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, boolean z, android.view.View view) {
        Intrinsics.copydefault(view);
        yho.invoke(1, view, viewOnClickListenerC54939xaY);
        if (z) {
            viewOnClickListenerC54939xaY.dismiss();
        }
    }
}
