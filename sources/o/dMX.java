package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.gson.Gson;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.model.tx.signdata.StarkNetRegisterSignData;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.impl.EnterWalletServiceImpl$openBlockchainExplorerWithPreCheck$1;
import com.okinc.business.defi.impl.EnterWalletServiceImpl$switchWalletAndOpenTeeStatusDetail$1$2$1;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.dex.api.bean.TradeDetails;
import com.okinc.core.util.ScannerActivity;
import com.okinc.core.util.model.ScanConfig;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import com.okinc.wallet.api.bean.WalletRechargeResult;
import com.okinc.wallet.api.bean.WalletScanInformationBean;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractDialogInterfaceOnKeyListenerC57208yeA;
import o.ActivityC10049bhC;
import o.ActivityC15452eIw;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC13426dKx;
import o.InterfaceC33171mrS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dMX extends AbstractC43215rlA implements InterfaceC54829xWw {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String copydefault(java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return str;
    }

    @Override // o.InterfaceC54829xWw
    public void OLrzqt(@NotNull android.app.Activity activity, android.os.Bundle bundle, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(activity, "");
        int i = z2 ? 1 : 2;
        pUU.KWHzl("EnterWalletServiceImpl", "enterWallet finishType: " + i);
        InterfaceC33171mrS.Activity.switchToAppMode$default((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class), activity, 3, z, i, bundle, null, 32, null);
    }

    @Override // o.InterfaceC54829xWw
    public void copydefault(@NotNull android.app.Activity activity, @NotNull EnterWalletMainBean enterWalletMainBean) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(enterWalletMainBean, "");
        dZK.AEQbTJ.AEQbTJ(activity, enterWalletMainBean);
    }

    @Override // o.InterfaceC54829xWw
    public void OLrzqt(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final C6810aWR c6810aWR, @NotNull final InterfaceC54850xXq interfaceC54850xXq) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(c6810aWR, "");
        Intrinsics.checkNotNullParameter(interfaceC54850xXq, "");
        if (c6810aWR.copydefault().length() == 0 || c6810aWR.OLrzqt().length() == 0) {
            interfaceC54850xXq.KWHzl(1);
            return;
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(c6810aWR.copydefault(), false);
        final Function1 function1 = new Function1() { // from class: o.dNm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dMX.OLrzqt(interfaceC54850xXq, c6810aWR, this, fragmentManager, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dMV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dMX.gEmmrt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dMW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dMX.EZpvd(interfaceC54850xXq, (java.lang.Throwable) obj);
            }
        };
        Intrinsics.copydefault(abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dNc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dMX.valueOf(function12, obj);
            }
        }));
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(InterfaceC54850xXq interfaceC54850xXq, C6810aWR c6810aWR, dMX dmx, androidx.fragment.app.FragmentManager fragmentManager, AbstractC12782ctV abstractC12782ctV) {
        if (!abstractC12782ctV.zLjUOn()) {
            interfaceC54850xXq.KWHzl(2);
            return Unit.INSTANCE;
        }
        if (abstractC12782ctV.AEQbTJ(java.lang.Long.valueOf(C33129mqd.valueOf(c6810aWR.OLrzqt()))) != null) {
            dmx.copydefault(fragmentManager, c6810aWR, interfaceC54850xXq);
        } else {
            interfaceC54850xXq.KWHzl(3);
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(InterfaceC54850xXq interfaceC54850xXq, java.lang.Throwable th) {
        interfaceC54850xXq.KWHzl(4);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC54829xWw
    public void copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, Function1<? super WalletRechargeResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        C15773eUt.OLrzqt.AEQbTJ(abstractActivityC33041mov, function1);
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    @Override // o.InterfaceC54829xWw
    public void EZpvd(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull WalletRechargeBean walletRechargeBean, final int i, final Function1<? super WalletRechargeResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(walletRechargeBean, "");
        AbstractC58185ywX<androidx.fragment.app.Fragment> abstractC58185ywXEZpvd = C21139guC.OLrzqt.EZpvd(abstractActivityC33041mov, walletRechargeBean);
        final Function1 function12 = new Function1() { // from class: o.dNb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dMX.KWHzl(abstractActivityC33041mov, i, function1, (androidx.fragment.app.Fragment) obj);
            }
        };
        abstractActivityC33041mov.addDisposable(abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.dNe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dMX.AhwBna(function12, obj);
            }
        }));
    }

    public static final Unit KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, int i, final Function1 function1, androidx.fragment.app.Fragment fragment) {
        if (fragment instanceof C21182gut) {
            C21182gut c21182gut = (C21182gut) fragment;
            c21182gut.show(abstractActivityC33041mov.getSupportFragmentManager(), "showRechargeDialog");
            c21182gut.OLrzqt(new Function1() { // from class: o.dNd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dMX.EZpvd(function1, (android.os.Bundle) obj);
                }
            });
        } else {
            C14662dpg c14662dpgOLrzqt = C14662dpg.Companion.OLrzqt(0.92f, i);
            Intrinsics.copydefault(fragment, "");
            c14662dpgOLrzqt.EZpvd((AbstractC57212yeE) fragment);
            androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c14662dpgOLrzqt.EZpvd(supportFragmentManager, "showRechargeDialog", new AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity() { // from class: o.dNa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity
                public final void copydefault(android.os.Bundle bundle) {
                    dMX.gEmmrt(function1, bundle);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(Function1 function1, android.os.Bundle bundle) {
        if (function1 != null) {
            if (bundle != null) {
                boolean z = bundle.getBoolean("is_submit");
                function1.invoke(new WalletRechargeResult(z));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void gEmmrt(Function1 function1, android.os.Bundle bundle) {
        boolean z;
        if (function1 != null) {
            if (bundle != null) {
                z = bundle.getBoolean("is_submit");
            }
            function1.invoke(new WalletRechargeResult(z));
        }
    }

    @Override // o.InterfaceC54829xWw
    public void copydefault(@NotNull final android.content.Context context, @NotNull android.os.Bundle bundle) {
        java.lang.Object objOLrzqt;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        try {
            Result.Application application = Result.Companion;
            dTQ dtq = (dTQ) C43251rlk.OLrzqt(dTQ.class);
            if (dtq == null || !dtq.copydefault()) {
                return;
            }
            java.lang.String string = bundle.getString("accountID");
            C12827cuN c12827cuNOcIXYQ = InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).OcIXYQ();
            if (string != null) {
                objOLrzqt = C11607cUn.OLrzqt(c12827cuNOcIXYQ.OLrzqt(string, false), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.dNf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return dMX.copydefault(context, (java.lang.Throwable) obj);
                    }
                }, new Function1() { // from class: o.dNk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return dMX.copydefault(context, (AbstractC12782ctV) obj);
                    }
                });
            } else {
                C17877fVp.showWalletIsNotExistDialog$default(C17877fVp.Companion.OLrzqt(), context, null, 2, null);
                objOLrzqt = Unit.INSTANCE;
            }
            Result.m7377constructorimpl(objOLrzqt);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final Unit copydefault(android.content.Context context, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C17877fVp.showWalletIsNotExistDialog$default(C17877fVp.Companion.OLrzqt(), context, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(android.content.Context context, AbstractC12782ctV abstractC12782ctV) {
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (!abstractC12782ctV.AubY()) {
            C55328xhq.show$default(C55328xhq.OLrzqt, context.getString(C13754dXa.FragmentManager.fdazkH), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            return Unit.INSTANCE;
        }
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context);
        AbstractActivityC33041mov abstractActivityC33041mov = activityOLrzqt instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activityOLrzqt : null;
        if (abstractActivityC33041mov == null) {
            return Unit.INSTANCE;
        }
        if (!abstractC12782ctV.zLjUOn()) {
            if (!abstractActivityC33041mov.isFinishing() && !abstractActivityC33041mov.isDestroyed()) {
                C14325djN.showBackupTipDialog$default(new C14325djN(), abstractActivityC33041mov, abstractActivityC33041mov.getSupportFragmentManager(), abstractC12782ctV, null, 8, null);
            }
            return Unit.INSTANCE;
        }
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        AbstractActivityC33041mov abstractActivityC33041mov2 = activityAEQbTJ instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activityAEQbTJ : null;
        if (abstractActivityC33041mov2 != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov2)) != null) {
            BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new EnterWalletServiceImpl$switchWalletAndOpenTeeStatusDetail$1$2$1(abstractC12782ctV, context, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC54829xWw
    public void KWHzl(@NotNull final android.content.Context context, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        final java.lang.String string = bundle.getString("walletId");
        java.lang.String string2 = bundle.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
        final java.lang.String str = string2 == null ? "" : string2;
        java.lang.String string3 = bundle.getString("txId");
        java.lang.String strGEmmrt = string3 != null ? C33129mqd.gEmmrt(string3) : null;
        if (strGEmmrt == null) {
            strGEmmrt = "";
        }
        java.lang.String string4 = bundle.getString("txHash");
        final java.lang.String strGEmmrt2 = string4 != null ? C33129mqd.gEmmrt(string4) : null;
        if (strGEmmrt2 == null) {
            strGEmmrt2 = "";
        }
        java.lang.String string5 = bundle.getString("uOpHash");
        java.lang.String strGEmmrt3 = string5 != null ? C33129mqd.gEmmrt(string5) : null;
        final java.lang.String str2 = strGEmmrt3 == null ? "" : strGEmmrt3;
        java.lang.String string6 = bundle.getString("explorerUrl");
        final java.lang.String strGEmmrt4 = string6 != null ? C33129mqd.gEmmrt(string6) : null;
        if (strGEmmrt4 == null) {
            strGEmmrt4 = "";
        }
        java.lang.String strGEmmrt5 = C33129mqd.gEmmrt(bundle.get("coinId"));
        long jValueOf = strGEmmrt5.length() == 0 ? -1L : C33129mqd.valueOf(strGEmmrt5);
        java.lang.String string7 = bundle.getString("orderId");
        java.lang.String strGEmmrt6 = string7 != null ? C33129mqd.gEmmrt(string7) : null;
        if (strGEmmrt6 == null) {
            strGEmmrt6 = "";
        }
        java.lang.String string8 = bundle.getString("orderType");
        java.lang.String strGEmmrt7 = string8 != null ? C33129mqd.gEmmrt(string8) : null;
        java.lang.String str3 = strGEmmrt7 == null ? "" : strGEmmrt7;
        if (string != null) {
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(string, false);
            final Function1 function1 = new Function1() { // from class: o.dNj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dMX.copydefault(string, (AbstractC12782ctV) obj);
                }
            };
            AbstractC58260yxt<R> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.dNg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return dMX.djBIcL(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
            final java.lang.String str4 = strGEmmrt;
            final java.lang.String str5 = strGEmmrt2;
            final long j = jValueOf;
            final java.lang.String str6 = strGEmmrt6;
            final java.lang.String str7 = str3;
            C11607cUn.OLrzqt(abstractC58260yxtOLrzqt2, (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.dNi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dMX.EZpvd(strGEmmrt4, context, strGEmmrt2, (java.lang.Throwable) obj);
                }
            }, new Function1() { // from class: o.dNh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dMX.AEQbTJ(str4, str5, str, j, strGEmmrt4, context, str2, string, str6, str7, (java.lang.String) obj);
                }
            });
        }
    }

    public static final InterfaceC58261yxu djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.lang.String AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(final java.lang.String str, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(abstractC12782ctV.DbNXlk());
        final Function1 function1 = new Function1() { // from class: o.dMY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dMX.copydefault(str, (java.lang.Integer) obj);
            }
        };
        return abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.dMZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return dMX.AYXKKw(function1, obj);
            }
        });
    }

    public static final Unit EZpvd(java.lang.String str, android.content.Context context, java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            C14320djI.openHistoryWebPageWithShare$default(C14320djI.OLrzqt, context, str, str2, null, 8, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, java.lang.String str4, android.content.Context context, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
        if (str9 == null || str9.length() == 0 || ((str.length() == 0 && str2.length() == 0) || str3.length() == 0 || C33129mqd.gEmmrt(java.lang.Long.valueOf(j), 0))) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str4)) {
                C14320djI.openHistoryWebPageWithShare$default(C14320djI.OLrzqt, context, str4, str2, null, 8, null);
            }
        } else {
            ActivityC10049bhC.Companion.KWHzl(context, str, str2, str5, str3, str6, str7, j, str8, true, str4);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(androidx.fragment.app.FragmentManager fragmentManager, C6810aWR c6810aWR, InterfaceC54850xXq interfaceC54850xXq) {
        DialogInterfaceOnKeyListenerC14659dpd dialogInterfaceOnKeyListenerC14659dpdCopydefault = DialogInterfaceOnKeyListenerC14659dpd.Companion.copydefault(0.92f);
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.KWHzl(ViewOnClickListenerC20995grR.Companion.copydefault(c6810aWR.copydefault(), c6810aWR.OLrzqt(), (1772 & 4) != 0 ? false : c6810aWR.AEQbTJ(), (1772 & 8) != 0 ? "" : c6810aWR.EZpvd(), (1772 & 16) != 0 ? false : false, (1772 & 32) != 0 ? false : false, (1772 & 64) != 0 ? -1 : c6810aWR.KWHzl(), (1772 & 128) != 0 ? -1L : 0L, (1772 & 256) != 0 ? "" : null, (1772 & 512) != 0 ? 1 : 0, (1772 & 1024) != 0 ? null : interfaceC54850xXq));
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.show(fragmentManager, ViewOnClickListenerC20995grR.class.getSimpleName());
    }

    @Override // o.InterfaceC54829xWw
    public void KWHzl(@NotNull android.app.Activity activity, android.os.Bundle bundle, boolean z, boolean z2, boolean z3) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(activity, "");
        ActivityC15452eIw.ActionBar.startActivity$default(ActivityC15452eIw.Companion, activity, (bundle == null || (string = bundle.getString("wallet_id")) == null) ? "" : string, 0L, 4, null);
        if (z3) {
            activity.overridePendingTransition(C52761wXj.Application.gEmmrt, C52761wXj.Application.AhwBna);
        } else {
            activity.overridePendingTransition(0, 0);
        }
        if (z2) {
            activity.finish();
        }
    }

    @Override // o.InterfaceC54829xWw
    public void AEQbTJ(@NotNull android.app.Activity activity, android.os.Bundle bundle, boolean z, boolean z2, boolean z3) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        java.lang.String string5;
        java.lang.String string6;
        java.lang.String string7;
        Intrinsics.checkNotNullParameter(activity, "");
        ActivityC10049bhC.ActionBar actionBar = ActivityC10049bhC.Companion;
        if (bundle == null || (string = bundle.getString("tx_id")) == null) {
            string = "";
        }
        if (bundle == null || (string2 = bundle.getString("tx_hash")) == null) {
            string2 = "";
        }
        if (bundle == null || (string3 = bundle.getString("tx_uop_hash")) == null) {
            string3 = "";
        }
        if (bundle == null || (string4 = bundle.getString("tx_address")) == null) {
            string4 = "";
        }
        if (bundle == null || (string5 = bundle.getString("wallet_id")) == null) {
            string5 = "";
        }
        if (bundle == null || (string6 = bundle.getString(OtcExtraKeys.ORDER_ID)) == null) {
            string6 = "";
        }
        actionBar.KWHzl(activity, (1544 & 2) != 0 ? "" : string, (1544 & 4) != 0 ? "" : string2, (1544 & 8) != 0 ? "" : string3, string4, string5, string6, (1544 & 128) != 0 ? 0L : bundle != null ? bundle.getLong("coin") : 0L, (bundle == null || (string7 = bundle.getString(OtcExtraKeys.CRYPTO_ORDER_TYPE)) == null) ? "" : string7, (1544 & 512) != 0 ? false : false, (1544 & 1024) != 0 ? "" : null);
        if (z3) {
            activity.overridePendingTransition(C52761wXj.Application.gEmmrt, C52761wXj.Application.AhwBna);
        } else {
            activity.overridePendingTransition(0, 0);
        }
        if (z2) {
            activity.finish();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c5  */
    @Override // o.InterfaceC54829xWw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void EZpvd(@NotNull android.app.Activity activity, android.os.Bundle bundle, boolean z, boolean z2, boolean z3) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        java.lang.String string5;
        java.lang.String string6;
        java.lang.String string7;
        java.lang.String string8;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(activity, "");
        if (bundle == null || (string = bundle.getString("tx_id")) == null) {
            string = "";
        }
        if (bundle == null || (string2 = bundle.getString("tx_hash")) == null) {
            string2 = "";
        }
        if (bundle == null || (string3 = bundle.getString("tx_uop_hash")) == null) {
            string3 = "";
        }
        if (bundle == null || (string4 = bundle.getString("tx_address")) == null) {
            string4 = "";
        }
        if (bundle == null || (string5 = bundle.getString("wallet_id")) == null) {
            string5 = "";
        }
        if (bundle == null || (string6 = bundle.getString(OtcExtraKeys.ORDER_ID)) == null) {
            string6 = "";
        }
        long j = bundle != null ? bundle.getLong("coin") : 0L;
        if (bundle == null || (string7 = bundle.getString(OtcExtraKeys.CRYPTO_ORDER_TYPE)) == null) {
            string7 = "";
        }
        int i = bundle != null ? bundle.getInt("tx_type") : -1;
        if (bundle != null && (string8 = bundle.getString("dex_order_id")) != null) {
            str = string8;
        }
        if (i != 5) {
            if (i != 84 && i != 85) {
                switch (i) {
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                        break;
                    default:
                        switch (i) {
                            case 40:
                            case 41:
                                if (activity instanceof AppCompatActivity) {
                                    ((gKO) C43251rlk.copydefault(gKO.class)).AEQbTJ(activity, new TradeDetails(string6), (LifecycleOwner) activity);
                                }
                                break;
                            case 42:
                                if (activity instanceof AppCompatActivity) {
                                    ((gKO) C43251rlk.copydefault(gKO.class)).EZpvd(activity, new TradeDetails(string6), (LifecycleOwner) activity);
                                }
                                break;
                            default:
                                ActivityC10049bhC.Companion.KWHzl(activity, (1544 & 2) != 0 ? "" : string, (1544 & 4) != 0 ? "" : string2, (1544 & 8) != 0 ? "" : string3, string4, string5, string6, (1544 & 128) != 0 ? 0L : j, string7, (1544 & 512) != 0 ? false : false, (1544 & 1024) != 0 ? "" : null);
                                break;
                        }
                        break;
                }
            } else {
                InterfaceC25429iwZ interfaceC25429iwZ = (InterfaceC25429iwZ) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25429iwZ.class));
                if (interfaceC25429iwZ != null) {
                    interfaceC25429iwZ.AEQbTJ(activity, string2, string3);
                }
            }
        } else if (!(activity instanceof AppCompatActivity) || !C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            ActivityC10049bhC.Companion.KWHzl(activity, (1544 & 2) != 0 ? "" : string, (1544 & 4) != 0 ? "" : string2, (1544 & 8) != 0 ? "" : string3, string4, string5, string6, (1544 & 128) != 0 ? 0L : j, string7, (1544 & 512) != 0 ? false : false, (1544 & 1024) != 0 ? "" : null);
        } else {
            ((gKO) C43251rlk.copydefault(gKO.class)).AEQbTJ(activity, new TradeDetails(str), (LifecycleOwner) activity);
        }
        if (z3) {
            activity.overridePendingTransition(C52761wXj.Application.gEmmrt, C52761wXj.Application.AhwBna);
        } else {
            activity.overridePendingTransition(0, 0);
        }
        if (z2) {
            activity.finish();
        }
    }

    @Override // o.InterfaceC54829xWw
    public void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull WalletTxDetailBean walletTxDetailBean, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletTxDetailBean, "");
        gCZ.EZpvd.copydefault(fragmentManager, walletTxDetailBean, yho);
    }

    @Override // o.InterfaceC54829xWw
    public void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull WalletTxDetailBean walletTxDetailBean, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletTxDetailBean, "");
        gCZ.EZpvd.KWHzl(fragmentManager, walletTxDetailBean, yho);
    }

    @Override // o.InterfaceC54829xWw
    public void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull WalletTxDetailBean walletTxDetailBean, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletTxDetailBean, "");
        gCZ.EZpvd.AEQbTJ(fragmentManager, walletTxDetailBean, yho);
    }

    @Override // o.InterfaceC54829xWw
    public void copydefault(long j, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(j);
            java.lang.Long lValueOf = c10854bwMCopydefault != null ? java.lang.Long.valueOf(c10854bwMCopydefault.AhwBna()) : null;
            if (lValueOf == null) {
                C55326xho.toast$default(C13754dXa.FragmentManager.invokespecialaVhqwO, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                function1.invoke(java.lang.Boolean.FALSE);
            } else {
                if (fragmentManager.isStateSaved()) {
                    function1.invoke(java.lang.Boolean.FALSE);
                    return;
                }
                C9930beq c9930beqEZpvd = C9930beq.Companion.EZpvd(lValueOf.longValue());
                c9930beqEZpvd.copydefault(function1);
                c9930beqEZpvd.show(fragmentManager, C9930beq.class.getSimpleName());
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("EnterWalletServiceImpl", "showUpgradeDialog failed", e);
            function1.invoke(java.lang.Boolean.FALSE);
        }
    }

    @Override // o.InterfaceC54829xWw
    public void AEQbTJ(@NotNull android.content.Context context, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        activityResultLauncher.launch(ScannerActivity.Companion.EZpvd(context, yDY.AhwBna(), new ScanConfig(false, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DrqXHJ), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DGUQLIhJrIAr), C33070mpX.AYXKKw(C13754dXa.FragmentManager.profile), false, null, true, false, null, false, null, 3941, null)));
    }

    @Override // o.InterfaceC54829xWw
    public WalletScanInformationBean h_(@NotNull java.lang.String str) {
        java.lang.String address;
        Intrinsics.checkNotNullParameter(str, "");
        TransactionInfo transactionInfoGEmmrt = C8349bAz.OLrzqt.gEmmrt(str);
        java.lang.String text = transactionInfoGEmmrt.getText();
        java.lang.String name = transactionInfoGEmmrt.getName();
        if (transactionInfoGEmmrt.getAddress().length() == 0) {
            address = transactionInfoGEmmrt.getText();
        } else {
            address = transactionInfoGEmmrt.getAddress();
        }
        return new WalletScanInformationBean(text, name, address, transactionInfoGEmmrt.getContractAddress(), transactionInfoGEmmrt.getAmount(), transactionInfoGEmmrt.getTokenId(), transactionInfoGEmmrt.getNetwork());
    }

    @Override // o.InterfaceC54829xWw
    public void copydefault(@NotNull android.app.Activity activity, long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(j));
        java.lang.String strOcIXYQ = c10854bwMKWHzl != null ? c10854bwMKWHzl.OcIXYQ() : null;
        long jAEQbTJ = c10854bwMKWHzl != null ? c10854bwMKWHzl.AEQbTJ() : -1L;
        if (strOcIXYQ != null) {
            ActivityC21325gxd.Companion.copydefault(activity, strOcIXYQ, str, jAEQbTJ);
        }
    }

    @Override // o.InterfaceC54829xWw
    public void KWHzl(@NotNull android.content.Context context, long j, @NotNull java.lang.String str, @NotNull androidx.fragment.app.FragmentManager fragmentManager, final Function1<? super android.os.Bundle, Unit> function1) {
        java.lang.String json = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        try {
            C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(j);
            if (c10854bwMCopydefault == null) {
                return;
            }
            if (c10854bwMCopydefault.DCUTEIdCUTEI()) {
                json = new Gson().toJson(new StarkNetRegisterSignData(null, null, null, null, 15, null));
            }
            java.lang.String str2 = json;
            Intrinsics.copydefault((java.lang.Object) str2);
            C13502dNs.Companion.KWHzl(context, new DappInteractionArgs(str, null, java.lang.String.valueOf(j), null, str2, java.lang.Long.valueOf(c10854bwMCopydefault.AhwBna()), null, 1, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, -67109046, null), new Function1() { // from class: o.dNn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dMX.OLrzqt(function1, (android.os.Bundle) obj);
                }
            }, null, null, OKWBaseTransaction.TransactionType.Register);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("EnterWalletServiceImpl", "showChainRegisterDialog failed", e);
            if (function1 != null) {
                function1.invoke(null);
            }
        }
    }

    public static final Unit OLrzqt(Function1 function1, android.os.Bundle bundle) {
        if (function1 != null) {
            function1.invoke(bundle);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC54829xWw
    public void KWHzl(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context);
        AppCompatActivity appCompatActivity = activityOLrzqt instanceof AppCompatActivity ? (AppCompatActivity) activityOLrzqt : null;
        if (appCompatActivity != null && !appCompatActivity.isFinishing() && !appCompatActivity.isDestroyed()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(appCompatActivity), null, null, new EnterWalletServiceImpl$openBlockchainExplorerWithPreCheck$1(fragmentManager, context, null), 3, null);
        } else {
            pUU.valueOf("EnterWalletServiceImpl", "openBlockchainExplorerWithPreCheck: Activity is not valid");
        }
    }
}
