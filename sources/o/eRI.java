package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.account.api.model.mpcwallet.LoginType;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.AccountMpcResponse;
import com.okinc.okuser.data.User;
import com.okinc.wallet.api.MpcWalletService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC17448fFs;
import o.ActivityC17523fIm;
import o.C13754dXa;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eRI {
    public static final eRI OLrzqt = new eRI();
    public static final C13934dbu EZpvd = new C13934dbu();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13934dbu copydefault() {
        return EZpvd;
    }

    private eRI() {
    }

    public final void AEQbTJ(@NotNull final FragmentActivity fragmentActivity, @NotNull final User user, @NotNull final AbstractC12782ctV abstractC12782ctV, @NotNull final yHT<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, ? super java.lang.Boolean, Unit> yht) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(user, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(yht, "");
        if (fragmentActivity.isDestroyed()) {
            return;
        }
        showTwoButton$default(this, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.playFromSearch), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRepeatMode), C33070mpX.AYXKKw(C13754dXa.FragmentManager.isTransportControlEnabled), fragmentActivity, false, new yHO() { // from class: o.eRP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return eRI.OLrzqt(yht, user, abstractC12782ctV, fragmentActivity, ((java.lang.Integer) obj).intValue(), (android.view.View) obj2, (ViewOnClickListenerC54939xaY) obj3);
            }
        }, 32, null);
    }

    public static final Unit OLrzqt(final yHT yht, final User user, final AbstractC12782ctV abstractC12782ctV, final FragmentActivity fragmentActivity, final int i, final android.view.View view, final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        if (i == 0) {
            viewOnClickListenerC54939xaY.dismiss();
            yht.invoke(java.lang.Integer.valueOf(i), view, viewOnClickListenerC54939xaY, java.lang.Boolean.FALSE);
        } else if (i == 1) {
            C15691eRs.AEQbTJ.KWHzl(user.getUid(), new Function0() { // from class: o.eRS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return eRI.EZpvd(yht, i, view, viewOnClickListenerC54939xaY);
                }
            }, new Function0() { // from class: o.eSd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return eRI.EZpvd(abstractC12782ctV, user, yht, i, view, viewOnClickListenerC54939xaY, fragmentActivity);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(yHT yht, int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        yht.invoke(java.lang.Integer.valueOf(i), view, viewOnClickListenerC54939xaY, java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(AbstractC12782ctV abstractC12782ctV, final User user, yHT yht, int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, final FragmentActivity fragmentActivity) {
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(EZpvd.AEQbTJ(abstractC12782ctV, user.getUid()), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.eRJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eRI.KWHzl(fragmentActivity, user, (AccountMpcResponse) obj);
            }
        };
        abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58227yxM() { // from class: o.eRH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eRI.gEmmrt(function1, obj);
            }
        });
        yht.invoke(java.lang.Integer.valueOf(i), view, viewOnClickListenerC54939xaY, java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(FragmentActivity fragmentActivity, User user, AccountMpcResponse accountMpcResponse) {
        InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
        if (interfaceC8104awT != null) {
            InterfaceC8104awT.StateListAnimator.routeLoginFromMpcWallet$default(interfaceC8104awT, fragmentActivity, accountMpcResponse.getEmail(), accountMpcResponse.getAreaCode(), accountMpcResponse.getPhone(), Intrinsics.EZpvd((java.lang.Object) accountMpcResponse.getEmail(), (java.lang.Object) user.getLoginName()) ? LoginType.EMAIL : LoginType.PHONE, null, 32, null);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull final android.content.Context context, @NotNull final LifecycleOwner lifecycleOwner, @NotNull final AbstractC12782ctV abstractC12782ctV, @NotNull final java.lang.String str, @NotNull final yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit> yho) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(yho, "");
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isDestroyed()) {
            return;
        }
        showTwoButton$default(this, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.next), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRepeatMode), C33070mpX.AYXKKw(C13754dXa.FragmentManager.playFromMediaId), context, false, new yHO() { // from class: o.eSi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return eRI.copydefault(yho, abstractC12782ctV, str, lifecycleOwner, context, ((java.lang.Integer) obj).intValue(), (android.view.View) obj2, (ViewOnClickListenerC54939xaY) obj3);
            }
        }, 32, null);
    }

    public static final Unit copydefault(yHO yho, final AbstractC12782ctV abstractC12782ctV, java.lang.String str, LifecycleOwner lifecycleOwner, final android.content.Context context, int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        yho.invoke(java.lang.Integer.valueOf(i), view, viewOnClickListenerC54939xaY);
        if (i == 0) {
            viewOnClickListenerC54939xaY.dismiss();
        } else if (i == 1) {
            AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(C58156yvv.EZpvd(EZpvd.AEQbTJ(abstractC12782ctV, str), lifecycleOwner), (Function1) null, 1, (java.lang.Object) null);
            final Function1 function1 = new Function1() { // from class: o.eRZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eRI.KWHzl(context, abstractC12782ctV, (AccountMpcResponse) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eRY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    eRI.AYXKKw(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.eRX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eRI.EZpvd((java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eRW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    eRI.valueOf(function12, obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(android.content.Context context, AbstractC12782ctV abstractC12782ctV, AccountMpcResponse accountMpcResponse) {
        InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
        if (interfaceC8104awT != null) {
            java.lang.String email = accountMpcResponse.getEmail();
            java.lang.String areaCode = accountMpcResponse.getAreaCode();
            java.lang.String phone = accountMpcResponse.getPhone();
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
            InterfaceC8104awT.StateListAnimator.routeLoginFromMpcWallet$default(interfaceC8104awT, context, email, areaCode, phone, Intrinsics.EZpvd((java.lang.Object) (mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getAccountName() : null), (java.lang.Object) accountMpcResponse.getEmail()) ? LoginType.EMAIL : LoginType.PHONE, null, 32, null);
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit> yho) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(yho, "");
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isDestroyed()) {
            return;
        }
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.hasStableIds);
        viewOnClickListenerC54939xaY.OLrzqt(C13754dXa.FragmentManager.AlertControllerCheckedItemAdapter, new ActionBar(viewOnClickListenerC54939xaY, yho));
        viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.getItemId, new TaskDescription(viewOnClickListenerC54939xaY, yho));
        viewOnClickListenerC54939xaY.show();
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ yHO<java.lang.Integer, android.view.View, ViewOnClickListenerC54939xaY, Unit> AEQbTJ;
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super java.lang.Integer, ? super android.view.View, ? super o.xaY, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit> yho) {
            this.KWHzl = viewOnClickListenerC54939xaY;
            this.AEQbTJ = yho;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            this.KWHzl.dismiss();
            this.AEQbTJ.invoke(0, view, this.KWHzl);
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ yHO<java.lang.Integer, android.view.View, ViewOnClickListenerC54939xaY, Unit> KWHzl;
        public final /* synthetic */ ViewOnClickListenerC54939xaY copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super java.lang.Integer, ? super android.view.View, ? super o.xaY, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit> yho) {
            this.copydefault = viewOnClickListenerC54939xaY;
            this.KWHzl = yho;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            this.copydefault.dismiss();
            this.KWHzl.invoke(1, view, this.copydefault);
        }
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Function2<? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isDestroyed()) {
            return;
        }
        OLrzqt(context, null, C33069mpW.copydefault(C13754dXa.FragmentManager.NonNull, C56423yEv.EZpvd(C56390yDp.OLrzqt("acctname", str))), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setHasDecor), function2, new Function1() { // from class: o.eSa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eRI.KWHzl((android.content.DialogInterface) obj);
            }
        });
    }

    public static final Unit KWHzl(android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull final android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity.isDestroyed()) {
            return;
        }
        showTipDialog$default(this, activity, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getSupportParentActivityIntent), C33070mpX.AYXKKw(C13754dXa.FragmentManager.bindView), C33070mpX.AYXKKw(C13754dXa.FragmentManager.AlertControllerAlertParams3), new Function2() { // from class: o.eRR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return eRI.OLrzqt(activity, (android.view.View) obj, (ViewOnClickListenerC54939xaY) obj2);
            }
        }, null, 32, null);
    }

    public static final Unit OLrzqt(android.app.Activity activity, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        activity.finish();
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull final Function2<? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isDestroyed()) {
            return;
        }
        showTipDialog$default(this, context, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getTag), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setHasDecor), new Function2() { // from class: o.eSj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return eRI.KWHzl(function2, (android.view.View) obj, (ViewOnClickListenerC54939xaY) obj2);
            }
        }, null, 32, null);
    }

    public static final Unit KWHzl(Function2 function2, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        function2.invoke(view, viewOnClickListenerC54939xaY);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showResume$default(eRI eri, android.content.Context context, AbstractC12782ctV abstractC12782ctV, int i, yHO yho, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        eri.OLrzqt(context, abstractC12782ctV, i, (yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit>) yho);
    }

    public final void OLrzqt(@NotNull final android.content.Context context, @NotNull final AbstractC12782ctV abstractC12782ctV, final int i, @NotNull final yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit> yho) {
        java.lang.String strAkhnZx;
        java.lang.String displayAccountName;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(yho, "");
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isDestroyed()) {
            return;
        }
        if (abstractC12782ctV.ORxRYg() || abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) {
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
            if (mpcWalletEncodeInfoQSBOWP != null && (displayAccountName = mpcWalletEncodeInfoQSBOWP.getDisplayAccountName()) != null) {
                str = displayAccountName;
            }
            if (str.length() > 0 && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) abstractC12782ctV.AkhnZx())) {
                strAkhnZx = abstractC12782ctV.AkhnZx() + "(" + str + ")";
            } else {
                strAkhnZx = abstractC12782ctV.AkhnZx();
            }
        } else {
            strAkhnZx = abstractC12782ctV.AkhnZx();
        }
        if (i == 2) {
            showTipDialog$default(this, context, C33070mpX.AYXKKw(C13754dXa.FragmentManager.onLaunch), C33069mpW.copydefault(C13754dXa.FragmentManager.ComponentActivity1, C56423yEv.EZpvd(C56390yDp.OLrzqt("acctname", strAkhnZx))), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setHasDecor), new Function2() { // from class: o.eRO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return eRI.djBIcL(yho, (android.view.View) obj, (ViewOnClickListenerC54939xaY) obj2);
                }
            }, null, 32, null);
        } else {
            AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onLaunch), C33069mpW.copydefault(C13754dXa.FragmentManager.ComponentActivity1, C56423yEv.EZpvd(C56390yDp.OLrzqt("acctname", strAkhnZx))), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setHasDecor), C33070mpX.AYXKKw(C13754dXa.FragmentManager.saveState), context, false, new yHO() { // from class: o.eRT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return eRI.EZpvd(yho, abstractC12782ctV, context, i, ((java.lang.Integer) obj).intValue(), (android.view.View) obj2, (ViewOnClickListenerC54939xaY) obj3);
                }
            });
        }
    }

    public static final Unit djBIcL(yHO yho, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        yho.invoke(0, view, viewOnClickListenerC54939xaY);
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(yHO yho, AbstractC12782ctV abstractC12782ctV, final android.content.Context context, final int i, int i2, android.view.View view, final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        yho.invoke(java.lang.Integer.valueOf(i2), view, viewOnClickListenerC54939xaY);
        if (i2 == 0) {
            viewOnClickListenerC54939xaY.dismiss();
        } else if (i2 == 1) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXEZpvd = C15691eRs.AEQbTJ.EZpvd(abstractC12782ctV, context);
            final Function1 function1 = new Function1() { // from class: o.eSg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eRI.copydefault(context, i, viewOnClickListenerC54939xaY, (java.lang.Boolean) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eSk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    eRI.djBIcL(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.eSh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eRI.EZpvd(viewOnClickListenerC54939xaY, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eSm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    eRI.AhwBna(function12, obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.fIm.ActionBar.start$default(o.fIm$ActionBar, android.content.Context, java.lang.String, int, int, java.lang.Object):void */
    public static final Unit copydefault(final android.content.Context context, final int i, final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            ActivityC17523fIm.ActionBar.start$default(ActivityC17523fIm.Companion, context, null, i, 2, null);
            viewOnClickListenerC54939xaY.dismiss();
        } else {
            ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).KWHzl(new Function1() { // from class: o.eRN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eRI.copydefault(context, i, viewOnClickListenerC54939xaY, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(android.content.Context context, int i, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, boolean z) {
        ActivityC17523fIm.ActionBar.start$default(ActivityC17523fIm.Companion, context, null, i, 2, null);
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, java.lang.Throwable th) {
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showAccClose$default(eRI eri, android.content.Context context, int i, yHO yho, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        eri.OLrzqt(context, i, (yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit>) yho);
    }

    public final void OLrzqt(@NotNull final android.content.Context context, int i, @NotNull final yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit> yho) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(yho, "");
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isDestroyed()) {
            return;
        }
        if (i == 0) {
            showTwoButton$default(this, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setCancelable), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setIconAttribute), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setHasDecor), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onPrepareListView), context, false, new yHO() { // from class: o.eSe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return eRI.OLrzqt(yho, context, ((java.lang.Integer) obj).intValue(), (android.view.View) obj2, (ViewOnClickListenerC54939xaY) obj3);
                }
            }, 32, null);
        } else {
            showTipDialog$default(this, context, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setCancelable), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setIconAttribute), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setHasDecor), new Function2() { // from class: o.eSf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return eRI.AEQbTJ(yho, (android.view.View) obj, (ViewOnClickListenerC54939xaY) obj2);
                }
            }, null, 32, null);
        }
    }

    public static final Unit OLrzqt(yHO yho, android.content.Context context, int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        yho.invoke(java.lang.Integer.valueOf(i), view, viewOnClickListenerC54939xaY);
        if (i == 0) {
            viewOnClickListenerC54939xaY.dismiss();
        } else if (i == 1) {
            ActivityC17448fFs.Activity.start$default(ActivityC17448fFs.Companion, context, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(yHO yho, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        yho.invoke(0, view, viewOnClickListenerC54939xaY);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showAccFrozen$default(eRI eri, android.content.Context context, int i, yHO yho, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        eri.AEQbTJ(context, i, (yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit>) yho);
    }

    public final void AEQbTJ(@NotNull final android.content.Context context, int i, @NotNull final yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit> yho) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(yho, "");
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isDestroyed()) {
            return;
        }
        if (i == 0) {
            showTwoButton$default(this, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMultiChoiceItems), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setAdapter), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setHasDecor), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onPrepareListView), context, false, new yHO() { // from class: o.eRL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return eRI.copydefault(yho, context, ((java.lang.Integer) obj).intValue(), (android.view.View) obj2, (ViewOnClickListenerC54939xaY) obj3);
                }
            }, 32, null);
        } else {
            showTipDialog$default(this, context, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMultiChoiceItems), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setAdapter), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setHasDecor), new Function2() { // from class: o.eRK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return eRI.valueOf(yho, (android.view.View) obj, (ViewOnClickListenerC54939xaY) obj2);
                }
            }, null, 32, null);
        }
    }

    public static final Unit copydefault(yHO yho, android.content.Context context, int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        yho.invoke(java.lang.Integer.valueOf(i), view, viewOnClickListenerC54939xaY);
        if (i == 0) {
            viewOnClickListenerC54939xaY.dismiss();
        } else if (i == 1) {
            ActivityC17448fFs.Activity.start$default(ActivityC17448fFs.Companion, context, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(yHO yho, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        yho.invoke(0, view, viewOnClickListenerC54939xaY);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showEscapeDialog$default(eRI eri, android.content.Context context, int i, yHO yho, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        eri.EZpvd(context, i, (yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit>) yho);
    }

    public final void EZpvd(@NotNull final android.content.Context context, int i, @NotNull final yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit> yho) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(yho, "");
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isDestroyed()) {
            return;
        }
        if (i == 0) {
            showTwoButton$default(this, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setCursor), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setInverseBackgroundForced), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setHasDecor), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onPrepareListView), context, false, new yHO() { // from class: o.eRM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return eRI.AhwBna(yho, context, ((java.lang.Integer) obj).intValue(), (android.view.View) obj2, (ViewOnClickListenerC54939xaY) obj3);
                }
            }, 32, null);
        } else {
            showTipDialog$default(this, context, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setCursor), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setInverseBackgroundForced), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setHasDecor), new Function2() { // from class: o.eRQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return eRI.AhwBna(yho, (android.view.View) obj, (ViewOnClickListenerC54939xaY) obj2);
                }
            }, null, 32, null);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.fFs.Activity.start$default(o.fFs$Activity, android.content.Context, java.lang.String, int, java.lang.Object):void */
    public static final Unit AhwBna(yHO yho, android.content.Context context, int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        yho.invoke(java.lang.Integer.valueOf(i), view, viewOnClickListenerC54939xaY);
        if (i == 0) {
            viewOnClickListenerC54939xaY.dismiss();
        } else if (i == 1) {
            ActivityC17448fFs.Activity.start$default(ActivityC17448fFs.Companion, context, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(yHO yho, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        yho.invoke(0, view, viewOnClickListenerC54939xaY);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showTwoButton$default(eRI eri, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.Context context, boolean z, yHO yho, int i, java.lang.Object obj) {
        eri.AEQbTJ(str, str2, str3, str4, context, (i & 32) != 0 ? true : z, (yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit>) yho);
    }

    public final void AEQbTJ(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull android.content.Context context, final boolean z, @NotNull final yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit> yho) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(yho, "");
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isDestroyed()) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(str);
        viewOnClickListenerC54939xaY.EZpvd(str2);
        viewOnClickListenerC54939xaY.AEQbTJ(str3, new View.OnClickListener() { // from class: o.eSc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                eRI.AEQbTJ(yho, viewOnClickListenerC54939xaY, z, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) str4, new View.OnClickListener() { // from class: o.eSb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                eRI.copydefault(yho, viewOnClickListenerC54939xaY, z, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(yHO yho, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, boolean z, android.view.View view) {
        Intrinsics.copydefault(view);
        yho.invoke(0, view, viewOnClickListenerC54939xaY);
        if (z) {
            viewOnClickListenerC54939xaY.dismiss();
        }
    }

    public static final void copydefault(yHO yho, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, boolean z, android.view.View view) {
        Intrinsics.copydefault(view);
        yho.invoke(1, view, viewOnClickListenerC54939xaY);
        if (z) {
            viewOnClickListenerC54939xaY.dismiss();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.eRI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showTipDialog$default(eRI eri, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, Function2 function2, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            function1 = null;
        }
        eri.OLrzqt(context, str, str2, str3, function2, function1);
    }

    public final void OLrzqt(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, final Function2<? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit> function2, final Function1<? super android.content.DialogInterface, Unit> function1) {
        if (((context instanceof android.app.Activity) && ((android.app.Activity) context).isDestroyed()) || context == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(str);
        viewOnClickListenerC54939xaY.EZpvd(str2);
        viewOnClickListenerC54939xaY.AEQbTJ(str3, new View.OnClickListener() { // from class: o.eRU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                eRI.KWHzl(viewOnClickListenerC54939xaY, function2, view);
            }
        });
        viewOnClickListenerC54939xaY.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.eRV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                eRI.KWHzl(function1, dialogInterface);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function2 function2, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        Intrinsics.copydefault(view);
        function2.invoke(view, viewOnClickListenerC54939xaY);
    }

    public static final void KWHzl(Function1 function1, android.content.DialogInterface dialogInterface) {
        if (dialogInterface == null || function1 == null) {
            return;
        }
        function1.invoke(dialogInterface);
    }
}
