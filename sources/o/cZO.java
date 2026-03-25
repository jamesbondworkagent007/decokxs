package o;

import com.okinc.business.defi.wallet.DefiWalletMainActivity;
import com.okinc.core.util.ScannerActivity;
import com.okinc.core.util.model.ScanConfig;
import com.okinc.core.util.qrcode.decode.ScanType;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC18691fnF;
import o.ActivityC18750foL;
import o.C12827cuN;
import o.C13754dXa;
import o.eVQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cZO extends AbstractC43215rlA implements xWS {
    public Function0<Unit> AEQbTJ = new Function0() { // from class: o.cZQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return cZO.KWHzl();
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(Function0<Unit> function0) {
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWS
    public Function0<Unit> aT_() {
        return this.AEQbTJ;
    }

    @Override // o.xWS
    public void KWHzl(@NotNull android.content.Context context, boolean z, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        if (bundle != null) {
            bundle.putBoolean("show", z);
        } else {
            bundle = new android.os.Bundle();
            bundle.putBoolean("show", z);
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) DefiWalletMainActivity.class);
        intent.putExtras(bundle);
        pUU.KWHzl("WalletRouteServiceImpl", "routeDefiMainWithAnimationAndBundle");
        context.startActivity(intent);
    }

    @Override // o.xWS
    public void EZpvd(@NotNull android.content.Context context, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "");
        dZK dzk = dZK.AEQbTJ;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            return;
        }
        dzk.AEQbTJ(activity, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
    }

    @Override // o.xWS
    public void KWHzl(@NotNull android.content.Context context, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "");
        ScannerActivity.Companion.KWHzl(context, C56402yEa.EZpvd(ScanType.DEFI_WALLET_ADDRESS), new ScanConfig(false, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DrqXHJ), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DGUQLIhJrIAr), C33070mpX.AYXKKw(C13754dXa.FragmentManager.profile), false, null, false, false, null, false, null, 4069, null));
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    @Override // o.xWS
    public void OLrzqt(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(C58156yvv.KWHzl(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, true), abstractActivityC33041mov));
        final Function1 function1 = new Function1() { // from class: o.dab
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cZO.KWHzl(abstractActivityC33041mov, fragmentManager, function0, this, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.daa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                cZO.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dac
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cZO.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        abstractActivityC33041mov.addDisposable(abstractC58260yxtValueOf.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cZY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                cZO.EZpvd(function12, obj);
            }
        }));
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(final AbstractActivityC33041mov abstractActivityC33041mov, androidx.fragment.app.FragmentManager fragmentManager, final Function0 function0, final cZO czo, final AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV.zLjUOn()) {
            return Unit.INSTANCE;
        }
        if (abstractC12782ctV.ORxRYg()) {
            MpcWalletService mpcWalletService = (MpcWalletService) C43251rlk.copydefault(MpcWalletService.class);
            Intrinsics.copydefault(abstractC12782ctV);
            mpcWalletService.OLrzqt(abstractC12782ctV, abstractActivityC33041mov, false, new Function1() { // from class: o.cZP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return cZO.OLrzqt(function0, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        } else {
            Intrinsics.copydefault(abstractC12782ctV);
            C18836fpt.EZpvd(abstractActivityC33041mov, fragmentManager, abstractC12782ctV, new Function1() { // from class: o.cZX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return cZO.KWHzl(function0, ((java.lang.Integer) obj).intValue());
                }
            }, new Function0() { // from class: o.cZW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return cZO.KWHzl(abstractC12782ctV, abstractActivityC33041mov, czo, function0);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function0 function0, boolean z) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(Function0 function0, int i) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC12782ctV abstractC12782ctV, AbstractActivityC33041mov abstractActivityC33041mov, final cZO czo, final Function0 function0) {
        java.lang.String strEZpvd;
        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
        if (abstractC12784ctXGwTjWJ == null || (strEZpvd = abstractC12784ctXGwTjWJ.EZpvd()) == null) {
            return Unit.INSTANCE;
        }
        if (C13912dbY.copydefault.gEmmrt()) {
            ActivityC18750foL.StateListAnimator.startActivity$default(ActivityC18750foL.Companion, abstractActivityC33041mov, strEZpvd, "route_finish_activity", 0, 8, null);
        } else {
            ActivityC18691fnF.Activity.startActivity$default(ActivityC18691fnF.Companion, abstractActivityC33041mov, strEZpvd, "route_finish_activity", 0, 8, null);
        }
        czo.EZpvd(new Function0() { // from class: o.cZZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return cZO.EZpvd(function0, czo);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function0 function0, cZO czo) {
        if (function0 != null) {
            function0.invoke();
        }
        czo.EZpvd(null);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        pUU.copydefault("routeBackupWallet", "getWalletById error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    @Override // o.xWS
    public void EZpvd(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull final InterfaceC9738bbJ interfaceC9738bbJ, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        if (interfaceC9738bbJ.zLjUOn()) {
            return;
        }
        if (interfaceC9738bbJ.ORxRYg()) {
            ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).OLrzqt(interfaceC9738bbJ, abstractActivityC33041mov, false, new Function1() { // from class: o.cZT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return cZO.copydefault(function0, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        } else if (interfaceC9738bbJ instanceof AbstractC12782ctV) {
            C18836fpt.EZpvd(abstractActivityC33041mov, fragmentManager, (AbstractC12782ctV) interfaceC9738bbJ, new Function1() { // from class: o.cZV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return cZO.AEQbTJ(function0, ((java.lang.Integer) obj).intValue());
                }
            }, new Function0() { // from class: o.cZU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return cZO.KWHzl(interfaceC9738bbJ, abstractActivityC33041mov, this, function0);
                }
            });
        }
    }

    public static final Unit copydefault(Function0 function0, boolean z) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function0 function0, int i) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(InterfaceC9738bbJ interfaceC9738bbJ, AbstractActivityC33041mov abstractActivityC33041mov, final cZO czo, final Function0 function0) {
        java.lang.String strEZpvd;
        AbstractC12784ctX abstractC12784ctXGwTjWJ = ((AbstractC12782ctV) interfaceC9738bbJ).gwTjWJ();
        if (abstractC12784ctXGwTjWJ == null || (strEZpvd = abstractC12784ctXGwTjWJ.EZpvd()) == null) {
            return Unit.INSTANCE;
        }
        if (C13912dbY.copydefault.gEmmrt()) {
            ActivityC18750foL.StateListAnimator.startActivity$default(ActivityC18750foL.Companion, abstractActivityC33041mov, strEZpvd, "route_finish_activity", 0, 8, null);
        } else {
            ActivityC18691fnF.Activity.startActivity$default(ActivityC18691fnF.Companion, abstractActivityC33041mov, strEZpvd, "route_finish_activity", 0, 8, null);
        }
        czo.EZpvd(new Function0() { // from class: o.cZR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return cZO.AEQbTJ(function0, czo);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function0 function0, cZO czo) {
        if (function0 != null) {
            function0.invoke();
        }
        czo.EZpvd(null);
        return Unit.INSTANCE;
    }

    @Override // o.xWS
    public void OLrzqt(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, long j, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(str, "");
        eVQ.TaskDescription.startActivity$default(eVQ.Companion, abstractActivityC33041mov, str, null, j, str2, 4, null);
    }

    @Override // o.xWS
    public void AEQbTJ(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(abstractActivityC33041mov, str, j, (java.lang.String) null);
    }
}
