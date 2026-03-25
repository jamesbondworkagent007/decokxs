package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.bean.SwitchNetworkInput;
import com.okinc.business.defi.api.constant.ChainRegisterStatus;
import com.okinc.business.defi.dapp.net.OKDapp;
import com.okinc.business.defi.dapp.net.SelectWalletNotice;
import com.okinc.business.defi.dapp.net.WalletSelectDappCustomParams;
import com.okinc.business.defi.dapp.net.WalletSelectParams;
import com.okinc.business.defi.dapp.utils.selectwallet.SelectWalletUtils$okDappNotSupportAANotice$1;
import com.okinc.business.defi.dapp.webview.DappTabData;
import com.okinc.dapp.bean.DappChains;
import com.okinc.dapp.bean.SelectWalletNet;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.bean.AAWalletEnableState;
import com.okinc.wallet.api.bean.DappSupportCheck;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import o.InterfaceC54829xWw;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dzk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15196dzk {
    public static final C15196dzk KWHzl = new C15196dzk();

    /* JADX INFO: renamed from: o.dzk$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MpcWalletService.MpcWalletAbleStatus.values().length];
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusDefault.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNormal.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoLogin.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusSwitch.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusRefreshed.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountDelete.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusEscape.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountFrozen.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoBackUp.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[AAWalletEnableState.values().length];
            try {
                iArr2[AAWalletEnableState.Normal.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[AAWalletEnableState.ProxyAbnormal.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[AAWalletEnableState.OwnerAbnormal.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            OLrzqt = iArr2;
        }
    }

    private C15196dzk() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dzk */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C15123dyQ getSelectWalletFragment$default(C15196dzk c15196dzk, AbstractActivityC33041mov abstractActivityC33041mov, WalletSelectParams walletSelectParams, yHO yho, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            yho = null;
        }
        return c15196dzk.EZpvd(abstractActivityC33041mov, walletSelectParams, (yHO<? super java.lang.Long, ? super InterfaceC9738bbJ, ? super java.lang.String, Unit>) yho);
    }

    public final C15123dyQ EZpvd(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final WalletSelectParams walletSelectParams, final yHO<? super java.lang.Long, ? super InterfaceC9738bbJ, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(walletSelectParams, "");
        return C15123dyQ.Companion.copydefault(walletSelectParams, new yHO() { // from class: o.dzz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C15196dzk.OLrzqt(yho, (java.lang.Long) obj, (InterfaceC9738bbJ) obj2, (java.lang.String) obj3);
            }
        }, new Function2() { // from class: o.dzE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C15196dzk.copydefault(abstractActivityC33041mov, walletSelectParams, yho, (java.lang.Long) obj, (java.util.List) obj2);
            }
        });
    }

    public static final Unit OLrzqt(yHO yho, java.lang.Long l, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.String str) {
        if (yho != null) {
            yho.invoke(l, interfaceC9738bbJ, str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final AbstractActivityC33041mov abstractActivityC33041mov, final WalletSelectParams walletSelectParams, final yHO yho, final java.lang.Long l, final java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        xWS xws = (xWS) C43251rlk.copydefault(xWS.class);
        androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        xws.EZpvd(abstractActivityC33041mov, supportFragmentManager, (InterfaceC9738bbJ) list.get(0), new Function0() { // from class: o.dzo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15196dzk.OLrzqt(walletSelectParams, list, abstractActivityC33041mov, l, yho);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final WalletSelectParams walletSelectParams, java.util.List list, final AbstractActivityC33041mov abstractActivityC33041mov, final java.lang.Long l, final yHO yho) {
        java.lang.Object next;
        java.lang.String selectedWalletId = walletSelectParams.getSelectedWalletId();
        if (selectedWalletId != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((InterfaceC9738bbJ) next).DbNXlk(), (java.lang.Object) selectedWalletId)) {
                    break;
                }
            }
            final InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) next;
            if (interfaceC9738bbJ != null) {
                AbstractC58260yxt<java.util.List<InterfaceC9738bbJ>> abstractC58260yxtGEmmrt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().gEmmrt();
                final Function1 function1 = new Function1() { // from class: o.dzC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C15196dzk.copydefault(abstractActivityC33041mov, l, interfaceC9738bbJ, walletSelectParams, yho, (java.util.List) obj);
                    }
                };
                InterfaceC58227yxM<? super java.util.List<InterfaceC9738bbJ>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dzG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C15196dzk.DbNXlk(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.dzD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C15196dzk.gEmmrt((java.lang.Throwable) obj);
                    }
                };
                abstractC58260yxtGEmmrt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dzF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C15196dzk.AkhnZx(function12, obj);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(AbstractActivityC33041mov abstractActivityC33041mov, final java.lang.Long l, final InterfaceC9738bbJ interfaceC9738bbJ, final WalletSelectParams walletSelectParams, final yHO yho, java.util.List list) {
        C15196dzk c15196dzk = KWHzl;
        androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        checkRegister$default(c15196dzk, supportFragmentManager, l, interfaceC9738bbJ, new Function0() { // from class: o.dzB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15196dzk.OLrzqt(interfaceC9738bbJ, l, walletSelectParams, yho);
            }
        }, null, 16, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l, WalletSelectParams walletSelectParams, yHO yho) {
        C15196dzk c15196dzk = KWHzl;
        java.lang.String strDbNXlk = interfaceC9738bbJ.DbNXlk();
        boolean enableWithoutBackup = walletSelectParams.getEnableWithoutBackup();
        if (c15196dzk.EZpvd(strDbNXlk, l, java.lang.Boolean.valueOf(enableWithoutBackup), (WalletSelectDappCustomParams) null, walletSelectParams.isBrc20())) {
            if (l != null) {
                java.lang.String strKWHzl = c15196dzk.KWHzl(interfaceC9738bbJ, l);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl) && yho != null) {
                    yho.invoke(l, interfaceC9738bbJ, strKWHzl);
                }
            } else if (yho != null) {
                yho.invoke(l, interfaceC9738bbJ, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.dzk$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((InterfaceC9731bbC) t).djBIcL(), ((InterfaceC9731bbC) t2).djBIcL());
        }
    }

    public final java.lang.String KWHzl(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        if (l == null) {
            return null;
        }
        if (l.longValue() == 1666600000) {
            return interfaceC9738bbJ.EZpvd(1L);
        }
        return interfaceC9738bbJ.EZpvd(l.longValue());
    }

    public static /* synthetic */ SelectWalletNotice getRootWalletNotice$default(C15196dzk c15196dzk, InterfaceC9735bbG interfaceC9735bbG, WeakReference weakReference, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c15196dzk.OLrzqt(interfaceC9735bbG, (WeakReference<C15123dyQ>) weakReference, z);
    }

    public final SelectWalletNotice OLrzqt(@NotNull final InterfaceC9735bbG interfaceC9735bbG, @NotNull final WeakReference<C15123dyQ> weakReference, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC9735bbG, "");
        Intrinsics.checkNotNullParameter(weakReference, "");
        if (interfaceC9735bbG.AEQbTJ()) {
            return null;
        }
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.firstOrNull(interfaceC9735bbG.KWHzl());
        if ((interfaceC9738bbJ == null || !interfaceC9738bbJ.ORxRYg()) && !z) {
            return new SelectWalletNotice(C33070mpX.AYXKKw(dLX.Dialog.DGOPHZ), C33070mpX.AYXKKw(dLX.Dialog.WS), new Function0() { // from class: o.dzi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C15196dzk.copydefault(weakReference, interfaceC9735bbG);
                }
            }, null, 8, null);
        }
        return null;
    }

    public static final Unit copydefault(WeakReference weakReference, InterfaceC9735bbG interfaceC9735bbG) {
        C15123dyQ c15123dyQ = (C15123dyQ) weakReference.get();
        if (c15123dyQ != null) {
            c15123dyQ.AEQbTJ(interfaceC9735bbG.KWHzl());
        }
        return Unit.INSTANCE;
    }

    public final boolean KWHzl(@NotNull java.lang.String str, java.lang.Long l) {
        java.lang.String mUrl;
        PlatformItem mItem;
        PlatformItem mItem2;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        C15112dyF c15112dyF = C15112dyF.AEQbTJ;
        DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
        java.lang.String category = null;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt((dappTabDataOLrzqt == null || (mItem2 = dappTabDataOLrzqt.getMItem()) == null) ? null : java.lang.Long.valueOf(mItem2.getId()));
        DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
        java.lang.String mUrl2 = dappTabDataOLrzqt2 != null ? dappTabDataOLrzqt2.getMUrl() : null;
        DappTabData dappTabDataOLrzqt3 = c15112dyF.OLrzqt();
        if (dappTabDataOLrzqt3 != null && (mItem = dappTabDataOLrzqt3.getMItem()) != null) {
            category = mItem.getCategory();
        }
        java.lang.String str3 = category;
        C14923duc c14923duc = C14923duc.EZpvd;
        DappTabData dappTabDataOLrzqt4 = c15112dyF.OLrzqt();
        if (dappTabDataOLrzqt4 != null && (mUrl = dappTabDataOLrzqt4.getMUrl()) != null) {
            str2 = mUrl;
        }
        return walletIsAvailable$default(this, str, l, bool, new WalletSelectDappCustomParams(mUrl2, strGEmmrt, str3, EZpvd(c14923duc.KWHzl(str2)), true), null, 16, null);
    }

    public static /* synthetic */ boolean walletIsAvailable$default(C15196dzk c15196dzk, java.lang.String str, java.lang.Long l, java.lang.Boolean bool, WalletSelectDappCustomParams walletSelectDappCustomParams, java.lang.Boolean bool2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        java.lang.Boolean bool3 = bool;
        if ((i & 8) != 0) {
            walletSelectDappCustomParams = null;
        }
        WalletSelectDappCustomParams walletSelectDappCustomParams2 = walletSelectDappCustomParams;
        if ((i & 16) != 0) {
            bool2 = java.lang.Boolean.FALSE;
        }
        return c15196dzk.EZpvd(str, l, bool3, walletSelectDappCustomParams2, bool2);
    }

    public final boolean EZpvd(@NotNull java.lang.String str, java.lang.Long l, java.lang.Boolean bool, WalletSelectDappCustomParams walletSelectDappCustomParams, java.lang.Boolean bool2) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().OLrzqt(str);
        if (interfaceC9738bbJOLrzqt == null) {
            return false;
        }
        SelectWalletNotice selectWalletNoticeAEQbTJ = KWHzl.AEQbTJ(interfaceC9738bbJOLrzqt, (WeakReference<C15123dyQ>) null, l, bool != null ? bool.booleanValue() : false, walletSelectDappCustomParams, bool2 != null ? bool2.booleanValue() : false);
        return selectWalletNoticeAEQbTJ == null || Intrinsics.EZpvd(selectWalletNoticeAEQbTJ.getWalletEnable(), java.lang.Boolean.TRUE);
    }

    public final SelectWalletNotice AEQbTJ(@NotNull final InterfaceC9738bbJ interfaceC9738bbJ, final WeakReference<C15123dyQ> weakReference, java.lang.Long l, boolean z, WalletSelectDappCustomParams walletSelectDappCustomParams, boolean z2) {
        SelectWalletNotice selectWalletNoticeAEQbTJ;
        SelectWalletNotice selectWalletNoticeEZpvd;
        C15123dyQ c15123dyQ;
        C15123dyQ c15123dyQ2;
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        if (!interfaceC9738bbJ.djSkpj()) {
            return new SelectWalletNotice(C33070mpX.AYXKKw(dLX.Dialog.UrRBLY), null, null, java.lang.Boolean.FALSE, 6, null);
        }
        if (!interfaceC9738bbJ.zLjUOn() && !z) {
            if (interfaceC9738bbJ.ORxRYg()) {
                return EZpvd(interfaceC9738bbJ, weakReference);
            }
            return new SelectWalletNotice(null, null, null, null, 15, null);
        }
        if ((interfaceC9738bbJ.ORxRYg() || interfaceC9738bbJ.wlaJM()) && (selectWalletNoticeAEQbTJ = AEQbTJ(interfaceC9738bbJ, weakReference)) != null) {
            return selectWalletNoticeAEQbTJ;
        }
        if ((interfaceC9738bbJ.getFieldNames() || interfaceC9738bbJ.wlaJM()) && (selectWalletNoticeEZpvd = EZpvd(interfaceC9738bbJ)) != null) {
            return selectWalletNoticeEZpvd;
        }
        java.lang.String strCopydefault = null;
        if (l != null) {
            final long jLongValue = l.longValue();
            if (!interfaceC9738bbJ.AkhnZx(jLongValue)) {
                InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).copydefault().EZpvd(jLongValue, true);
                if (interfaceC9731bbCEZpvd != null) {
                    if (weakReference != null && (c15123dyQ2 = weakReference.get()) != null) {
                        strCopydefault = C33069mpW.copydefault(c15123dyQ2, dLX.Dialog.KDccX, C56424yEw.AYXKKw(C56390yDp.OLrzqt("NetworkName", interfaceC9731bbCEZpvd.djBIcL())));
                    }
                    return new SelectWalletNotice(strCopydefault, null, null, null, 14, null);
                }
            } else if (interfaceC9738bbJ.fetchVPNInfo(jLongValue)) {
                return new SelectWalletNotice(C33070mpX.AYXKKw(dLX.Dialog.DWgRXt), C33070mpX.AYXKKw(dLX.Dialog.DCUTEIddSDPG), new Function0() { // from class: o.dzA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C15196dzk.copydefault(weakReference, jLongValue, interfaceC9738bbJ);
                    }
                }, java.lang.Boolean.FALSE);
            }
        }
        if (l != null && C15114dyH.AEQbTJ(l.longValue()) && z2 && !copydefault(interfaceC9738bbJ, l.longValue())) {
            return new SelectWalletNotice(C33070mpX.AYXKKw(dLX.Dialog.call), null, null, null, 14, null);
        }
        if (l != null && C15114dyH.AEQbTJ(l.longValue()) && walletSelectDappCustomParams != null && walletSelectDappCustomParams.isDappBtc() && !copydefault(interfaceC9738bbJ, l.longValue())) {
            return new SelectWalletNotice(C33070mpX.AYXKKw(dLX.Dialog.DcqEDu), null, null, null, 14, null);
        }
        if (walletSelectDappCustomParams != null) {
            if (interfaceC9738bbJ.ORxRYg() || interfaceC9738bbJ.wlaJM()) {
                if (walletSelectDappCustomParams.getDappSupportCheck() == null) {
                    return new SelectWalletNotice(null, null, null, null, 15, null);
                }
                DappSupportCheck dappSupportCheck = walletSelectDappCustomParams.getDappSupportCheck();
                if (dappSupportCheck != null && !dappSupportCheck.getMpcResult()) {
                    return new SelectWalletNotice(C33070mpX.AYXKKw(dLX.Dialog.giSNqX), null, null, null, 14, null);
                }
            }
            if (interfaceC9738bbJ.getFieldNames() || interfaceC9738bbJ.wlaJM()) {
                if (walletSelectDappCustomParams.getDappSupportCheck() == null) {
                    return new SelectWalletNotice(null, null, null, null, 15, null);
                }
                DappSupportCheck dappSupportCheck2 = walletSelectDappCustomParams.getDappSupportCheck();
                if (dappSupportCheck2 != null && !dappSupportCheck2.getAaResult()) {
                    return new SelectWalletNotice(C33070mpX.AYXKKw(dLX.Dialog.gasjUx), null, null, null, 14, null);
                }
                dDW ddw = dDW.copydefault;
                java.lang.String dappId = walletSelectDappCustomParams.getDappId();
                OKDapp oKDappOLrzqt = ddw.OLrzqt(dappId != null ? dappId : "");
                if (oKDappOLrzqt != null) {
                    SelectWalletNotice selectWalletNoticeAEQbTJ2 = KWHzl.AEQbTJ(oKDappOLrzqt, (weakReference == null || (c15123dyQ = weakReference.get()) == null) ? null : c15123dyQ.getContext());
                    if (selectWalletNoticeAEQbTJ2 != null) {
                        return selectWalletNoticeAEQbTJ2;
                    }
                }
            }
        }
        return null;
    }

    public static final Unit copydefault(WeakReference weakReference, long j, final InterfaceC9738bbJ interfaceC9738bbJ) {
        final C15123dyQ c15123dyQ;
        if (weakReference != null && (c15123dyQ = (C15123dyQ) weakReference.get()) != null) {
            InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
            androidx.fragment.app.FragmentManager parentFragmentManager = c15123dyQ.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            interfaceC54829xWw.copydefault(j, parentFragmentManager, new Function1() { // from class: o.dzy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15196dzk.OLrzqt(c15123dyQ, interfaceC9738bbJ, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C15123dyQ c15123dyQ, InterfaceC9738bbJ interfaceC9738bbJ, boolean z) {
        if (z) {
            c15123dyQ.EZpvd(interfaceC9738bbJ);
        }
        return Unit.INSTANCE;
    }

    public final boolean copydefault(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, long j) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return interfaceC9738bbJ.KWHzl(j == 70000061 ? 14 : 1, 5, false);
    }

    public final Function0<Unit> AEQbTJ(final MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, final InterfaceC9738bbJ interfaceC9738bbJ, final WeakReference<C15123dyQ> weakReference) {
        return new Function0() { // from class: o.dzq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15196dzk.EZpvd(weakReference, mpcWalletAbleStatus, interfaceC9738bbJ);
            }
        };
    }

    public static final Unit EZpvd(final WeakReference weakReference, MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, final InterfaceC9738bbJ interfaceC9738bbJ) {
        C15123dyQ c15123dyQ;
        if (weakReference != null && (c15123dyQ = (C15123dyQ) weakReference.get()) != null) {
            MpcWalletService mpcWalletService = (MpcWalletService) C43251rlk.copydefault(MpcWalletService.class);
            FragmentActivity fragmentActivityRequireActivity = c15123dyQ.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            mpcWalletService.KWHzl(mpcWalletAbleStatus, interfaceC9738bbJ, fragmentActivityRequireActivity, new Function1() { // from class: o.dzL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15196dzk.KWHzl(weakReference, interfaceC9738bbJ, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(WeakReference weakReference, InterfaceC9738bbJ interfaceC9738bbJ, boolean z) {
        C15123dyQ c15123dyQ;
        if (z && weakReference != null && (c15123dyQ = (C15123dyQ) weakReference.get()) != null) {
            c15123dyQ.copydefault(interfaceC9738bbJ);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SelectWalletNotice AEQbTJ(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, WeakReference<C15123dyQ> weakReference) {
        java.lang.String strEZpvd;
        java.lang.String strAYXKKw;
        Function0<Unit> function0AEQbTJ;
        Function0<Unit> function0;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String strEZpvd2;
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatusCopydefault = ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).copydefault(interfaceC9738bbJ);
        switch (Application.KWHzl[mpcWalletAbleStatusCopydefault.ordinal()]) {
            case 3:
                strEZpvd = ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).EZpvd(mpcWalletAbleStatusCopydefault, interfaceC9738bbJ);
                strAYXKKw = C33070mpX.AYXKKw(dLX.Dialog.run);
                function0AEQbTJ = AEQbTJ(mpcWalletAbleStatusCopydefault, interfaceC9738bbJ, weakReference);
                function0 = function0AEQbTJ;
                str = strEZpvd;
                str2 = strAYXKKw;
                if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                    return null;
                }
                return new SelectWalletNotice(str, str2, function0, null, 8, null);
            case 4:
                strEZpvd = ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).EZpvd(mpcWalletAbleStatusCopydefault, interfaceC9738bbJ);
                strAYXKKw = C33070mpX.AYXKKw(dLX.Dialog.fHqPtx);
                function0AEQbTJ = AEQbTJ(mpcWalletAbleStatusCopydefault, interfaceC9738bbJ, weakReference);
                function0 = function0AEQbTJ;
                str = strEZpvd;
                str2 = strAYXKKw;
                if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                strEZpvd2 = ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).EZpvd(mpcWalletAbleStatusCopydefault, interfaceC9738bbJ);
                str = strEZpvd2;
                str2 = null;
                function0 = null;
                if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                }
                break;
            case 9:
                return EZpvd(interfaceC9738bbJ, weakReference);
            default:
                strEZpvd2 = null;
                str = strEZpvd2;
                str2 = null;
                function0 = null;
                if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                }
                break;
        }
    }

    public final SelectWalletNotice EZpvd(@NotNull final InterfaceC9738bbJ interfaceC9738bbJ, final WeakReference<C15123dyQ> weakReference) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return new SelectWalletNotice(C33070mpX.AYXKKw(dLX.Dialog.DGOPHZ), C33070mpX.AYXKKw(dLX.Dialog.WS), new Function0() { // from class: o.dzu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15196dzk.AEQbTJ(weakReference, interfaceC9738bbJ);
            }
        }, null, 8, null);
    }

    public static final Unit AEQbTJ(WeakReference weakReference, InterfaceC9738bbJ interfaceC9738bbJ) {
        C15123dyQ c15123dyQ;
        if (weakReference != null && (c15123dyQ = (C15123dyQ) weakReference.get()) != null) {
            c15123dyQ.AEQbTJ(yDY.copydefault(interfaceC9738bbJ));
        }
        return Unit.INSTANCE;
    }

    public final SelectWalletNotice EZpvd(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        AAWalletEnableState aaState = ((InterfaceC54825xWs) C43251rlk.copydefault(InterfaceC54825xWs.class)).OLrzqt(interfaceC9738bbJ).getAaState();
        int i = Application.OLrzqt[aaState.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2 || i == 3) {
            return new SelectWalletNotice(((InterfaceC54825xWs) C43251rlk.copydefault(InterfaceC54825xWs.class)).copydefault(aaState, interfaceC9738bbJ), null, null, null, 14, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final java.lang.String KWHzl(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l, java.util.ArrayList<SelectWalletNet> arrayList) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        if (l != null) {
            return OLrzqt(interfaceC9738bbJ, l.longValue());
        }
        if (arrayList == null) {
            return null;
        }
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String strOLrzqt = KWHzl.OLrzqt(interfaceC9738bbJ, ((SelectWalletNet) it.next()).getChainId());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt)) {
                return strOLrzqt;
            }
        }
        return null;
    }

    public final java.lang.String OLrzqt(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, long j) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return ((xWO) C43251rlk.copydefault(xWO.class)).f_(interfaceC9738bbJ.EZpvd(j));
    }

    public final java.lang.Integer AEQbTJ(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        if (!(context instanceof android.view.ContextThemeWrapper)) {
            return null;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        ((android.view.ContextThemeWrapper) context).getTheme().resolveAttribute(i, typedValue, true);
        return java.lang.Integer.valueOf(typedValue.resourceId);
    }

    public final SelectWalletNotice AEQbTJ(@NotNull OKDapp oKDapp, android.content.Context context) {
        Intrinsics.checkNotNullParameter(oKDapp, "");
        return (SelectWalletNotice) BuildersKt__BuildersKt.runBlocking$default(null, new SelectWalletUtils$okDappNotSupportAANotice$1(oKDapp, context, null), 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.dzk */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkRegister$default(C15196dzk c15196dzk, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Long l, InterfaceC9738bbJ interfaceC9738bbJ, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            function02 = null;
        }
        c15196dzk.KWHzl(fragmentManager, l, interfaceC9738bbJ, function0, function02);
    }

    public final void KWHzl(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, final java.lang.Long l, @NotNull final InterfaceC9738bbJ interfaceC9738bbJ, @NotNull final Function0<Unit> function0, final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (l != null) {
            AbstractC58185ywX<ChainRegisterStatus> abstractC58185ywXAEQbTJ = ((InterfaceC9844bdJ) C43251rlk.copydefault(InterfaceC9844bdJ.class)).AEQbTJ(l.longValue(), interfaceC9738bbJ.EZpvd(l.longValue()));
            final Function1 function1 = new Function1() { // from class: o.dzr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15196dzk.copydefault(l, interfaceC9738bbJ, fragmentManager, function02, function0, (ChainRegisterStatus) obj);
                }
            };
            InterfaceC58227yxM<? super ChainRegisterStatus> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dzn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C15196dzk.AYXKKw(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dzp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15196dzk.copydefault((java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dzv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C15196dzk.gEmmrt(function12, obj);
                }
            });
            return;
        }
        function0.invoke();
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Long l, InterfaceC9738bbJ interfaceC9738bbJ, androidx.fragment.app.FragmentManager fragmentManager, Function0 function0, Function0 function02, ChainRegisterStatus chainRegisterStatus) {
        if (chainRegisterStatus == ChainRegisterStatus.UNREGISTERED) {
            InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
            InterfaceC54829xWw.ActionBar.showChainRegisterDialog$default(interfaceC54829xWw, activityAEQbTJ, l.longValue(), interfaceC9738bbJ.DbNXlk(), fragmentManager, null, 16, null);
            if (function0 != null) {
                function0.invoke();
            }
        } else if (chainRegisterStatus == ChainRegisterStatus.REGISTERED) {
            function02.invoke();
        } else {
            if (function0 != null) {
                function0.invoke();
            }
            C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(dLX.Dialog.QIZEnU), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final java.lang.String KWHzl(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String strFJNWhG;
        java.lang.Long lValueOf;
        java.lang.String strAYXKKw;
        java.lang.String strValueOf;
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            Result.Application application = Result.Companion;
            InterfaceC9731bbC interfaceC9731bbCKWHzl = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).copydefault().KWHzl(str, C33129mqd.valueOf(str2), true);
            if (interfaceC9731bbCKWHzl != null) {
                lValueOf = java.lang.Long.valueOf(interfaceC9731bbCKWHzl.AhwBna());
                strFJNWhG = interfaceC9731bbCKWHzl.fJNWhG();
            } else {
                strFJNWhG = null;
                lValueOf = null;
            }
            if (lValueOf != null && strFJNWhG != null) {
                InterfaceC9742bbN interfaceC9742bbNCopydefault = interfaceC9738bbJ.copydefault(lValueOf.longValue(), null, true);
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(dLX.Dialog.ixgjPv);
                if (interfaceC9742bbNCopydefault != null && (strValueOf = interfaceC9742bbNCopydefault.valueOf()) != null) {
                    strFJNWhG = strValueOf;
                }
                java.lang.String strOLrzqt = C33069mpW.OLrzqt(strAYXKKw2, C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", strFJNWhG)));
                C43154rjt c43154rjt = C43154rjt.OLrzqt;
                if (interfaceC9742bbNCopydefault == null || (strAYXKKw = interfaceC9742bbNCopydefault.AYXKKw()) == null) {
                    strAYXKKw = "0";
                }
                return strOLrzqt + " " + c43154rjt.KWHzl(strAYXKKw);
            }
            return null;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            java.lang.Object objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            return (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        }
    }

    public final boolean AEQbTJ() {
        java.lang.Object obj;
        java.util.Iterator<T> it = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().AEQbTJ().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            for (java.lang.Object obj2 : ((InterfaceC9735bbG) next).KWHzl()) {
                InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) obj2;
                if (interfaceC9738bbJ.getFieldNames() || interfaceC9738bbJ.wlaJM() || interfaceC9738bbJ.ORxRYg()) {
                    obj = obj2;
                    break;
                }
            }
            if (obj != null) {
                obj = next;
                break;
            }
        }
        return obj != null;
    }

    public final void AEQbTJ(java.lang.String str) {
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return;
        }
        final java.lang.String strKWHzl = C14923duc.EZpvd.KWHzl(str);
        if (!C15157dyy.EZpvd.OLrzqt().containsKey(strKWHzl) && AEQbTJ()) {
            AbstractC58185ywX<DappSupportCheck> abstractC58185ywXJ_ = ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).j_(strKWHzl);
            final Function1 function1 = new Function1() { // from class: o.dzw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15196dzk.AEQbTJ(strKWHzl, (DappSupportCheck) obj);
                }
            };
            InterfaceC58227yxM<? super DappSupportCheck> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dzs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C15196dzk.valueOf(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dzt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15196dzk.EZpvd((java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXJ_.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dzx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C15196dzk.AhwBna(function12, obj);
                }
            });
        }
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.String str, DappSupportCheck dappSupportCheck) {
        C15157dyy.EZpvd.OLrzqt().put(str, dappSupportCheck);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final DappSupportCheck EZpvd(java.lang.String str) {
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return null;
        }
        return C15157dyy.EZpvd.OLrzqt().get(str);
    }

    public final SwitchNetworkInput EZpvd(long j) {
        java.util.List<DappChains> listCopydefault = C15157dyy.EZpvd.copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        java.util.Iterator<T> it = listCopydefault.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((DappChains) it.next()).getChainId()));
        }
        java.util.Set setDXXBbs = CollectionsKt___CollectionsKt.DXXBbs(arrayList);
        java.util.List<DappChains> listCopydefault2 = C15157dyy.EZpvd.copydefault();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : listCopydefault2) {
            if (((DappChains) obj).getHotFlag()) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(java.lang.Long.valueOf(((DappChains) it2.next()).getChainId()));
        }
        java.util.ArrayList<InterfaceC9731bbC> arrayListKWHzl = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).EZpvd().KWHzl();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListKWHzl, 10));
        java.util.Iterator<T> it3 = arrayListKWHzl.iterator();
        while (it3.hasNext()) {
            arrayList4.add(java.lang.Long.valueOf(((InterfaceC9731bbC) it3.next()).fetchVPNInfo()));
        }
        java.util.Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            setDXXBbs.add(java.lang.Long.valueOf(((java.lang.Number) it4.next()).longValue()));
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.Iterator it5 = setDXXBbs.iterator();
        while (it5.hasNext()) {
            InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd(((java.lang.Number) it5.next()).longValue(), true);
            if (interfaceC9731bbCEZpvd != null) {
                arrayList5.add(interfaceC9731bbCEZpvd);
            }
        }
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList5, new TaskDescription());
        java.util.ArrayList arrayList6 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        java.util.Iterator it6 = listEZpvd.iterator();
        while (it6.hasNext()) {
            arrayList6.add(java.lang.Long.valueOf(((InterfaceC9731bbC) it6.next()).fetchVPNInfo()));
        }
        return new SwitchNetworkInput(j, arrayList3, arrayList6);
    }

    public final boolean EZpvd(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, java.lang.String str, java.lang.String str2, java.lang.Long l) {
        boolean z;
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        C14923duc c14923duc = C14923duc.EZpvd;
        if (str == null) {
            str = "";
        }
        DappSupportCheck dappSupportCheckEZpvd = EZpvd(c14923duc.KWHzl(str));
        boolean z2 = interfaceC9738bbJ.ORxRYg() || interfaceC9738bbJ.wlaJM();
        boolean z3 = interfaceC9738bbJ.getFieldNames() || interfaceC9738bbJ.wlaJM();
        boolean z4 = ((dappSupportCheckEZpvd == null || !dappSupportCheckEZpvd.getMpcResult()) && z2) || ((dappSupportCheckEZpvd == null || !dappSupportCheckEZpvd.getAaResult()) && z3);
        java.util.List<OKDapp> listKWHzl = C15157dyy.EZpvd.KWHzl();
        if (listKWHzl == null || listKWHzl.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator<T> it = listKWHzl.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((OKDapp) it.next()).getDappId(), (java.lang.Object) str2)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (z4) {
            return false;
        }
        if (z3 && z) {
            return false;
        }
        return l == null || !C15114dyH.AEQbTJ(l.longValue()) || copydefault(interfaceC9738bbJ, l.longValue());
    }
}
