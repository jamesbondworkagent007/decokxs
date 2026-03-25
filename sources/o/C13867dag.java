package o;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.impl.WalletServiceImpl$deviceBindWallet$1;
import com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment;
import com.okinc.business.defi.wallet.BuildConfig;
import com.okinc.business.defi.wallet.DefiWalletMainActivity;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import com.okinc.wallet.api.bean.SupportedNetworkType;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import com.okinc.wallet.api.bean.Web3BusinessLine;
import com.okinc.wallet.api.bean.Web3ReferralCodeInfo;
import com.okinc.wallet.api.bean.Web3ReferralCodeSource;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.rx2.RxSingleKt;
import o.C12827cuN;
import o.C13867dag;
import o.C13934dbu;
import o.C14140dfo;
import o.C17668fNw;
import o.C54836xXc;
import o.InterfaceC9739bbK;
import o.xWO;
import o.xXH;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.dag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13867dag extends AbstractC43215rlA implements xWO {
    public boolean OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public final java.util.Map<java.lang.String, Function1<java.lang.String, Unit>> KWHzl = new java.util.HashMap();
    public final java.lang.Object copydefault = new java.lang.Object();
    public final java.lang.String EZpvd = "ChooseCreateWalletFragment";

    @Override // o.xWO
    public void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InterfaceC54859xXz interfaceC54859xXz, InterfaceC54856xXw interfaceC54856xXw) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC54859xXz, "");
        xWO.ActionBar.showConnectWalletDialog$default(this, fragmentManager, interfaceC54859xXz, (java.util.List) null, (java.util.List) null, interfaceC54856xXw, 12, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.dag$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((InterfaceC18198fdq) t).AYXKKw()), java.lang.Integer.valueOf(((InterfaceC18198fdq) t2).AYXKKw()));
        }
    }

    @Override // o.xWO
    public void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC54859xXz interfaceC54859xXz, java.util.List<SupportedNetworkType> list, @NotNull java.util.List<? extends UnsupportedWalletType> list2, InterfaceC54856xXw interfaceC54856xXw) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(interfaceC54859xXz, "");
        Intrinsics.checkNotNullParameter(list2, "");
        C14140dfo.showConnectWalletDialog$default(C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null), fragmentManager, interfaceC54859xXz, 0, list, list2, null, interfaceC54856xXw, null, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, null);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.String> */
    @Override // o.xWO
    public AbstractC58185ywX<java.lang.String> g_(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<AbstractC12782ctV> abstractC58185ywXEZpvd = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, true).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.daq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13867dag.KWHzl(str, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.dat
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13867dag.KWHzl(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(java.lang.String str, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return AbstractC58185ywX.KWHzl(C13934dbu.StateListAnimator.getSign$default(C13934dbu.Companion, abstractC12782ctV.USBtdM(), str, "", "", null, 16, null));
    }

    public static final java.lang.Boolean OLrzqt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Boolean.valueOf(!list.isEmpty());
    }

    public static final java.lang.Boolean djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    @Override // o.xWO
    public AbstractC58260yxt<java.lang.Boolean> aO_() {
        AbstractC58260yxt allRootWallets$default = C12827cuN.getAllRootWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, 3, null);
        final Function1 function1 = new Function1() { // from class: o.dai
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13867dag.OLrzqt((java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtCopydefault = allRootWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.dal
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13867dag.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.lang.Boolean OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    @Override // o.xWO
    public AbstractC58260yxt<java.lang.Boolean> aN_() {
        AbstractC58260yxt allRootWallets$default = C12827cuN.getAllRootWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, 3, null);
        final Function1 function1 = new Function1() { // from class: o.dau
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13867dag.EZpvd((java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtCopydefault = allRootWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.dav
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13867dag.OLrzqt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    @Override // o.xWO
    public void copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ActivityC18768fod.Companion.AEQbTJ(context);
    }

    @Override // o.xWO
    public java.lang.String f_(java.lang.String str) {
        return C14079deg.getAddressStr$default(C14079deg.EZpvd, str, false, 2, null);
    }

    @Override // o.xWO
    public AbstractC58260yxt<java.lang.Boolean> aJ_() {
        return RxSingleKt.rxSingle(Dispatchers.getMain(), new WalletServiceImpl$deviceBindWallet$1(null));
    }

    @Override // o.xWO
    public java.util.Map<java.lang.String, java.lang.String> aM_() {
        java.util.HashMap map = new java.util.HashMap();
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        if (abstractC12782ctV != null) {
            WalletType.Application application = WalletType.Companion;
            map.put("wallet-type", java.lang.String.valueOf(application.EZpvd(abstractC12782ctV)));
            map.put("wallet-account-type", java.lang.String.valueOf(application.AEQbTJ(abstractC12782ctV)));
            map.put("tee-sa-status", ((dTQ) C43251rlk.copydefault(dTQ.class)).copydefault() ? java.lang.String.valueOf(application.KWHzl(abstractC12782ctV)) : "0");
            map.put("app-version", BuildConfig.WALLET_VERSION);
            map.put("device-token", xVW.copydefault());
        }
        return map;
    }

    @Override // o.xWO
    public int EZpvd(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C8322bAY.KWHzl.KWHzl(j, str);
    }

    @Override // o.xWO
    public int aK_() {
        return DefiWalletMainActivity.Companion.copydefault();
    }

    @Override // o.xWO
    public int aL_() {
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC18198fdq.class));
        if (listKWHzl == null) {
            listKWHzl = yDY.AhwBna();
        }
        int i = 0;
        if (!(listKWHzl instanceof java.util.Collection) || !listKWHzl.isEmpty()) {
            java.util.Iterator it = listKWHzl.iterator();
            while (it.hasNext()) {
                if (((InterfaceC18198fdq) it.next()).copydefault() && (i = i + 1) < 0) {
                    yDY.djBIcL();
                }
            }
        }
        return i;
    }

    @Override // o.xWO
    public int OLrzqt(int i) {
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC18198fdq.class));
        if (listKWHzl == null) {
            listKWHzl = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listKWHzl) {
            if (((InterfaceC18198fdq) obj).copydefault()) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = CollectionsKt___CollectionsKt.EZpvd(arrayList, new Activity()).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((InterfaceC18198fdq) it.next()).fetchVPNInfo() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // o.xWO
    public android.view.View EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        DefiWalletMainActivity defiWalletMainActivity = abstractActivityC33041mov instanceof DefiWalletMainActivity ? (DefiWalletMainActivity) abstractActivityC33041mov : null;
        if (defiWalletMainActivity != null) {
            return defiWalletMainActivity.AubY();
        }
        return null;
    }

    @Override // o.xWO
    public void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull android.content.Context context, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        OLrzqt(fragmentManager, context, function1);
    }

    @Override // o.xWO
    public void EZpvd(@NotNull java.lang.String str, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        boolean zIsEmpty = this.KWHzl.isEmpty();
        this.KWHzl.put(str, function1);
        if (zIsEmpty) {
            AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXH.class, new java.lang.String[0]);
            final java.lang.Object obj = this.copydefault;
            abstractC58185ywXKWHzl.subscribe(new RxBus.EventCallback<xXH>(obj) { // from class: com.okinc.business.defi.biz.impl.WalletServiceImpl$registerWalletAddObserverWithKey$1
                /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
                @Override // com.okinc.rxutils.RxBus.EventCallback
                public void onEvent(xXH xxh) {
                    String strOLrzqt;
                    C13867dag c13867dag = this.this$0;
                    if (xxh == null || (strOLrzqt = xxh.OLrzqt()) == null) {
                        strOLrzqt = "";
                    }
                    c13867dag.OLrzqt(strOLrzqt);
                }
            });
        }
    }

    @Override // o.xWO
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.remove(str);
        if (this.KWHzl.isEmpty()) {
            SubHelper.AEQbTJ(this.copydefault);
        }
    }

    public final void OLrzqt(final androidx.fragment.app.FragmentManager fragmentManager, final android.content.Context context, final Function1<? super java.lang.Boolean, Unit> function1) {
        eLN.Companion.EZpvd(new Function0() { // from class: o.dar
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C13867dag.OLrzqt();
            }
        }, new Function0() { // from class: o.dao
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C13867dag.copydefault(this.EZpvd, fragmentManager, context, function1);
            }
        }, 5, true, yDY.gEmmrt(UnsupportedWalletType.MPCWallet, UnsupportedWalletType.HardwareWallet), "cefi_search").show(fragmentManager, this.EZpvd);
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C13867dag c13867dag, androidx.fragment.app.FragmentManager fragmentManager, android.content.Context context, Function1 function1) {
        c13867dag.copydefault(fragmentManager, context, function1);
        return Unit.INSTANCE;
    }

    public final void copydefault(final androidx.fragment.app.FragmentManager fragmentManager, final android.content.Context context, final Function1<? super java.lang.Boolean, Unit> function1) {
        AEQbTJ(new Function1() { // from class: o.dak
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13867dag.EZpvd(fragmentManager, context, this, function1, (Unit) obj);
            }
        });
    }

    public static final Unit EZpvd(final androidx.fragment.app.FragmentManager fragmentManager, android.content.Context context, final C13867dag c13867dag, final Function1 function1, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("from", "cefi");
        bundle.putInt(OtcExtraKeys.MODE, 5);
        Unit unit2 = Unit.INSTANCE;
        new C14469dlz(fragmentManager, context, bundle, null, new Function1() { // from class: o.dam
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13867dag.EZpvd(fragmentManager, c13867dag, function1, (java.lang.String) obj);
            }
        }, new Function0() { // from class: o.daj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C13867dag.EZpvd(function1);
            }
        }, new Function0() { // from class: o.dan
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C13867dag.OLrzqt(fragmentManager, c13867dag);
            }
        }, new Function1() { // from class: o.dap
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13867dag.OLrzqt(function1, (android.content.Intent) obj);
            }
        }, 8, null).EZpvd();
        return unit2;
    }

    public static final Unit EZpvd(AbstractC12782ctV abstractC12782ctV) {
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final androidx.fragment.app.FragmentManager fragmentManager, final C13867dag c13867dag, final Function1 function1, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).copydefault(str, 5, fragmentManager, "cefi_search", new Function1() { // from class: o.dae
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13867dag.EZpvd((AbstractC12782ctV) obj);
            }
        }, new Function1() { // from class: o.dah
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13867dag.KWHzl(fragmentManager, c13867dag, function1, (AbstractC12782ctV) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(androidx.fragment.app.FragmentManager fragmentManager, C13867dag c13867dag, Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(c13867dag.EZpvd);
        BottomSheetDialogFragment bottomSheetDialogFragment = fragmentFindFragmentByTag instanceof BottomSheetDialogFragment ? (BottomSheetDialogFragment) fragmentFindFragmentByTag : null;
        if (bottomSheetDialogFragment != null) {
            bottomSheetDialogFragment.dismissAllowingStateLoss();
        }
        function1.invoke(java.lang.Boolean.valueOf(abstractC12782ctV != null));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function1 function1) {
        function1.invoke(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(androidx.fragment.app.FragmentManager fragmentManager, C13867dag c13867dag) {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(c13867dag.EZpvd);
        BottomSheetDialogFragment bottomSheetDialogFragment = fragmentFindFragmentByTag instanceof BottomSheetDialogFragment ? (BottomSheetDialogFragment) fragmentFindFragmentByTag : null;
        if (bottomSheetDialogFragment != null) {
            bottomSheetDialogFragment.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function1 function1, android.content.Intent intent) {
        function1.invoke(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final Function1<? super Unit, Unit> function1) {
        if (this.OLrzqt) {
            function1.invoke(Unit.INSTANCE);
        } else {
            C33024moe.subscribeOnIO$default(InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null), new Function1() { // from class: o.das
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13867dag.EZpvd((java.lang.Throwable) obj);
                }
            }, new Function0() { // from class: o.daw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C13867dag.OLrzqt(this.copydefault, function1);
                }
            }, (Function1) null, 4, (java.lang.Object) null);
        }
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C13867dag c13867dag, Function1 function1) {
        c13867dag.OLrzqt = true;
        Unit unit = Unit.INSTANCE;
        function1.invoke(unit);
        return unit;
    }

    @Override // o.xWO
    public void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull C54836xXc c54836xXc, @NotNull InterfaceC54859xXz interfaceC54859xXz, InterfaceC54856xXw interfaceC54856xXw, InterfaceC54852xXs interfaceC54852xXs) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(c54836xXc, "");
        Intrinsics.checkNotNullParameter(interfaceC54859xXz, "");
        if (fragmentManager.isDestroyed() || fragmentManager.isStateSaved()) {
            pUU.copydefault("WalletServiceImpl", "FragmentManager is destroyed or state is saved, cannot show dialog");
            return;
        }
        DefiConnectWalletTipDialogFragment.Application application = DefiConnectWalletTipDialogFragment.Companion;
        java.util.List<? extends UnsupportedWalletType> listGEmmrt = yDY.gEmmrt(UnsupportedWalletType.HardwareWallet, UnsupportedWalletType.MPCWallet);
        C54836xXc.TaskDescription taskDescriptionEZpvd = c54836xXc.EZpvd();
        java.lang.Integer numValueOf = taskDescriptionEZpvd != null ? java.lang.Integer.valueOf(taskDescriptionEZpvd.EZpvd()) : null;
        C54836xXc.TaskDescription taskDescriptionEZpvd2 = c54836xXc.EZpvd();
        int iKWHzl = taskDescriptionEZpvd2 != null ? taskDescriptionEZpvd2.KWHzl() : C55298xhM.dp2px$default(120.0f, null, 1, null);
        C54836xXc.TaskDescription taskDescriptionEZpvd3 = c54836xXc.EZpvd();
        DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragmentOLrzqt = application.OLrzqt(2, (java.util.List<SupportedNetworkType>) null, listGEmmrt, new DefiConnectWalletTipDialogFragment.UiParamsConfig(new DefiConnectWalletTipDialogFragment.UiParamsConfig.ImageConfig(numValueOf, taskDescriptionEZpvd3 != null ? taskDescriptionEZpvd3.OLrzqt() : C55298xhM.dp2px$default(120.0f, null, 1, null), iKWHzl), c54836xXc.OLrzqt(), c54836xXc.KWHzl(), c54836xXc.AEQbTJ(), c54836xXc.copydefault()));
        defiConnectWalletTipDialogFragmentOLrzqt.AEQbTJ(interfaceC54859xXz);
        if (interfaceC54856xXw != null) {
            defiConnectWalletTipDialogFragmentOLrzqt.KWHzl(interfaceC54856xXw);
        }
        if (interfaceC54852xXs != null) {
            defiConnectWalletTipDialogFragmentOLrzqt.KWHzl(interfaceC54852xXs);
        }
        fragmentManager.beginTransaction().add(defiConnectWalletTipDialogFragmentOLrzqt, DefiConnectWalletTipDialogFragment.class.getSimpleName()).commitAllowingStateLoss();
    }

    @Override // o.xWO
    public java.lang.Object EZpvd(@NotNull Continuation<? super Web3ReferralCodeInfo> continuation) {
        C17668fNw instance$default = C17668fNw.Activity.getInstance$default(C17668fNw.Companion, null, 1, null);
        Web3BusinessLine web3BusinessLine = Web3BusinessLine.DEX_REFERRAL;
        Web3ReferralCodeInfo web3ReferralCodeInfoKWHzl = instance$default.KWHzl(web3BusinessLine);
        if (web3ReferralCodeInfoKWHzl != null) {
            java.lang.String upperCase = web3ReferralCodeInfoKWHzl.getReferralCode().toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            Web3ReferralCodeInfo web3ReferralCodeInfoCopy$default = Web3ReferralCodeInfo.copy$default(web3ReferralCodeInfoKWHzl, upperCase, 0L, null, null, null, 30, null);
            if (web3ReferralCodeInfoCopy$default != null) {
                return web3ReferralCodeInfoCopy$default;
            }
        }
        java.lang.String strAEQbTJ = C32856mlV.OLrzqt.AEQbTJ("ref");
        if (strAEQbTJ == null || strAEQbTJ.length() == 0 || !(true ^ StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ))) {
            return null;
        }
        java.lang.String upperCase2 = strAEQbTJ.toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        return new Web3ReferralCodeInfo(upperCase2, java.lang.System.currentTimeMillis(), "FlyerAttribution", Web3ReferralCodeSource.ATTRIBUTION, web3BusinessLine);
    }

    /* JADX INFO: renamed from: o.dag$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dag.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void OLrzqt(java.lang.String str) {
        java.util.Iterator<Map.Entry<java.lang.String, Function1<java.lang.String, Unit>>> it = this.KWHzl.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().invoke(str);
        }
    }

    public static final java.lang.Boolean EZpvd(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            for (AbstractC12782ctV abstractC12782ctV : ((AbstractC12784ctX) it.next()).KWHzl()) {
                z = abstractC12782ctV.QwvEab() == WalletType.HDWallet || abstractC12782ctV.QwvEab() == WalletType.KeyWallet;
                if (z) {
                    break;
                }
            }
        }
        return java.lang.Boolean.valueOf(z);
    }
}
