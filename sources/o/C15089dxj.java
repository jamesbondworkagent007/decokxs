package o;

import androidx.activity.ComponentActivity;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.dapp.base.FragmentNavigator;
import com.okinc.business.defi.dapp.net.WalletSelectDappCustomParams;
import com.okinc.business.defi.dapp.net.WalletSelectParams;
import com.okinc.dapp.bean.DappChains;
import com.okinc.dapp.bean.DappSearchResultBean;
import com.okinc.dapp.bean.SelectWalletNet;
import com.okinc.network.okg.cor.SubdomainStrategy;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C14834dst;
import o.C52761wXj;
import o.InterfaceC43294rma;
import o.InterfaceC54828xWv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dxj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15089dxj extends AbstractC43215rlA implements InterfaceC54828xWv {
    @Override // o.InterfaceC54828xWv
    public void AEQbTJ(@NotNull android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.Long l, Function0<Unit> function0, java.util.List<java.lang.Integer> list, @NotNull java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new DappChains(0L, null, null, null, 0, ((java.lang.Number) it.next()).intValue(), false, null, null, 479, null));
            }
        }
        C14923duc c14923duc = C14923duc.EZpvd;
        c14923duc.AEQbTJ((ComponentActivity) activity, new PlatformItem(0L, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, str == null ? "" : str, (java.lang.String) null, 0L, 0, (java.lang.String) null, (java.lang.String) null, 16127, (DefaultConstructorMarker) null), (20992 & 4) != 0 ? null : str2, (20992 & 8) != 0 ? null : l, (Function0<Unit>) ((20992 & 16) != 0 ? null : function0), (20992 & 32) != 0 ? false : false, (java.util.List<DappChains>) ((20992 & 64) != 0 ? c14923duc.isConnected() : arrayList), (20992 & 128) != 0, (20992 & 256) != 0 ? false : false, (Function1<? super PlatformItem, Unit>) ((20992 & 512) != 0 ? null : null), (20992 & 1024) != 0 ? SubdomainStrategy.Global.INSTANCE.toString() : str3, (20992 & 2048) != 0 ? "" : str4, (Function1<? super androidx.fragment.app.Fragment, Unit>) ((20992 & 4096) != 0 ? null : null), (20992 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (20992 & 16384) != 0 ? null : null, (20992 & 32768) != 0 ? null : null);
    }

    @Override // o.InterfaceC54828xWv
    public void copydefault(@NotNull android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.Long l, Function0<Unit> function0, java.util.List<java.lang.Integer> list, @NotNull java.lang.String str3, java.lang.String str4, final androidx.fragment.app.FragmentManager fragmentManager, final java.lang.Integer num, final java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new DappChains(0L, null, null, null, 0, ((java.lang.Number) it.next()).intValue(), false, null, null, 479, null));
            }
        }
        final java.lang.String strValueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        Function1 function1 = fragmentManager != null ? new Function1() { // from class: o.dxh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15089dxj.EZpvd(fragmentManager, num, strValueOf, bool, (androidx.fragment.app.Fragment) obj);
            }
        } : null;
        C14923duc c14923duc = C14923duc.EZpvd;
        ComponentActivity componentActivity = (ComponentActivity) activity;
        PlatformItem platformItem = new PlatformItem(0L, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, str == null ? "" : str, (java.lang.String) null, 0L, 0, (java.lang.String) null, (java.lang.String) null, 16127, (DefaultConstructorMarker) null);
        C15148dyp c15148dyp = C15148dyp.copydefault;
        c14923duc.AEQbTJ(componentActivity, platformItem, (20992 & 4) != 0 ? null : str2, (20992 & 8) != 0 ? null : l, (Function0<Unit>) ((20992 & 16) != 0 ? null : function0), (20992 & 32) != 0 ? false : false, (java.util.List<DappChains>) ((20992 & 64) != 0 ? c14923duc.isConnected() : arrayList), (20992 & 128) != 0, (20992 & 256) != 0 ? false : false, (Function1<? super PlatformItem, Unit>) ((20992 & 512) != 0 ? null : null), (20992 & 1024) != 0 ? SubdomainStrategy.Global.INSTANCE.toString() : str3, (20992 & 2048) != 0 ? "" : str4, (Function1<? super androidx.fragment.app.Fragment, Unit>) ((20992 & 4096) != 0 ? null : !c15148dyp.AEQbTJ() ? function1 : null), (20992 & 8192) != 0 ? java.lang.Boolean.FALSE : !c15148dyp.AEQbTJ() ? java.lang.Boolean.TRUE : null, (20992 & 16384) != 0 ? null : !c15148dyp.AEQbTJ() ? strValueOf : null, (20992 & 32768) != 0 ? null : null);
    }

    public static final Unit EZpvd(final androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num, java.lang.String str, java.lang.Boolean bool, androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        C14834dst.Application application = C14834dst.Companion;
        C14834dst c14834dstOLrzqt = application.OLrzqt(fragment, new Function1() { // from class: o.dxm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15089dxj.AEQbTJ(fragmentManager, (androidx.fragment.app.Fragment) obj);
            }
        });
        FragmentNavigator.push$default(FragmentNavigator.Companion.EZpvd(fragmentManager, num), c14834dstOLrzqt, null, null, 6, null);
        C15148dyp c15148dyp = C15148dyp.copydefault;
        int iAEQbTJ = application.AEQbTJ();
        c15148dyp.OLrzqt(str, null, java.lang.Integer.valueOf(iAEQbTJ), c14834dstOLrzqt, Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) ? "default" : "wallet_search");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        FragmentNavigator.StateListAnimator.from$default(FragmentNavigator.Companion, fragmentManager, null, 2, null).OLrzqt(fragment, (2 & 2) != 0 ? new FragmentNavigator.Application(C52761wXj.Application.DbNXlk, C52761wXj.Application.AuCTel, 0, 0, false, false, null, null, false, false, 1008, null) : null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC54828xWv
    public void EZpvd(@NotNull android.app.Activity activity, java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num) {
        java.lang.String queryParameter;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54828xWv.ActionBar.enterDAppWebView$default(this, activity, (str == null || (queryParameter = android.net.Uri.parse(str).getQueryParameter("dappUrl")) == null) ? null : URLDecoder.decode(queryParameter, StandardCharsets.UTF_8.name()), null, null, null, null, str2, str3, fragmentManager, num, null, MTPushConstants.Message.CODE_MESSAGE_REVOKE, null);
    }

    @Override // o.InterfaceC54828xWv
    public void copydefault(@NotNull android.app.Activity activity, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.Long l, Function0<Unit> function0, java.util.List<java.lang.Integer> list, @NotNull java.lang.String str5, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new DappChains(0L, null, null, null, 0, ((java.lang.Number) it.next()).intValue(), false, null, null, 479, null));
            }
        }
        C14923duc c14923duc = C14923duc.EZpvd;
        c14923duc.AEQbTJ((ComponentActivity) activity, new PlatformItem(C33129mqd.valueOf(str2), str3, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, str != null ? str : "", (java.lang.String) null, 0L, 0, (java.lang.String) null, (java.lang.String) null, 16124, (DefaultConstructorMarker) null), (20992 & 4) != 0 ? null : str4, (20992 & 8) != 0 ? null : l, (Function0<Unit>) ((20992 & 16) != 0 ? null : function0), (20992 & 32) != 0 ? false : false, (java.util.List<DappChains>) ((20992 & 64) != 0 ? c14923duc.isConnected() : arrayList), (20992 & 128) != 0, (20992 & 256) != 0 ? false : false, (Function1<? super PlatformItem, Unit>) ((20992 & 512) != 0 ? null : null), (20992 & 1024) != 0 ? SubdomainStrategy.Global.INSTANCE.toString() : str5, (20992 & 2048) != 0 ? "" : str6, (Function1<? super androidx.fragment.app.Fragment, Unit>) ((20992 & 4096) != 0 ? null : null), (20992 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (20992 & 16384) != 0 ? null : null, (20992 & 32768) != 0 ? null : null);
    }

    @Override // o.InterfaceC54828xWv
    public void KWHzl(@NotNull android.app.Activity activity, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.Long l, Function0<Unit> function0, java.util.List<java.lang.Integer> list, @NotNull java.lang.String str5, java.lang.String str6, @NotNull final androidx.fragment.app.FragmentManager fragmentManager, final int i, java.lang.String str7) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new DappChains(0L, null, null, null, 0, ((java.lang.Number) it.next()).intValue(), false, null, null, 479, null));
            }
        }
        final java.lang.String strValueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        Function1 function1 = new Function1() { // from class: o.dxo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15089dxj.AEQbTJ(fragmentManager, i, strValueOf, (androidx.fragment.app.Fragment) obj);
            }
        };
        C14923duc c14923duc = C14923duc.EZpvd;
        ComponentActivity componentActivity = (ComponentActivity) activity;
        PlatformItem platformItem = new PlatformItem(C33129mqd.valueOf(str2), str3, str7 != null ? str7 : "", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, str == null ? "" : str, (java.lang.String) null, 0L, 0, (java.lang.String) null, (java.lang.String) null, 16120, (DefaultConstructorMarker) null);
        C15148dyp c15148dyp = C15148dyp.copydefault;
        c14923duc.AEQbTJ(componentActivity, platformItem, (20992 & 4) != 0 ? null : str4, (20992 & 8) != 0 ? null : l, (Function0<Unit>) ((20992 & 16) != 0 ? null : function0), (20992 & 32) != 0 ? false : false, (java.util.List<DappChains>) ((20992 & 64) != 0 ? c14923duc.isConnected() : arrayList), (20992 & 128) != 0, (20992 & 256) != 0 ? false : false, (Function1<? super PlatformItem, Unit>) ((20992 & 512) != 0 ? null : null), (20992 & 1024) != 0 ? SubdomainStrategy.Global.INSTANCE.toString() : str5, (20992 & 2048) != 0 ? "" : str6, (Function1<? super androidx.fragment.app.Fragment, Unit>) ((20992 & 4096) != 0 ? null : !c15148dyp.AEQbTJ() ? function1 : null), (20992 & 8192) != 0 ? java.lang.Boolean.FALSE : !c15148dyp.AEQbTJ() ? java.lang.Boolean.TRUE : null, (20992 & 16384) != 0 ? null : !c15148dyp.AEQbTJ() ? strValueOf : null, (20992 & 32768) != 0 ? null : null);
    }

    public static final Unit AEQbTJ(final androidx.fragment.app.FragmentManager fragmentManager, int i, java.lang.String str, androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        C14834dst.Application application = C14834dst.Companion;
        C14834dst c14834dstOLrzqt = application.OLrzqt(fragment, new Function1() { // from class: o.dxp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15089dxj.OLrzqt(fragmentManager, (androidx.fragment.app.Fragment) obj);
            }
        });
        FragmentNavigator.push$default(FragmentNavigator.Companion.EZpvd(fragmentManager, java.lang.Integer.valueOf(i)), c14834dstOLrzqt, null, null, 6, null);
        C15148dyp.copydefault.OLrzqt(str, null, java.lang.Integer.valueOf(application.AEQbTJ()), c14834dstOLrzqt, "wallet_search");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        FragmentNavigator.StateListAnimator.from$default(FragmentNavigator.Companion, fragmentManager, null, 2, null).OLrzqt(fragment, (2 & 2) != 0 ? new FragmentNavigator.Application(C52761wXj.Application.DbNXlk, C52761wXj.Application.AuCTel, 0, 0, false, false, null, null, false, false, 1008, null) : null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC54828xWv
    public void OLrzqt(@NotNull final android.app.Activity activity, final java.lang.String str, final java.lang.String str2, final java.lang.Long l, final Function0<Unit> function0, final java.util.List<java.lang.Integer> list, java.lang.Boolean bool, @NotNull final java.lang.String str3, final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            C15142dyj.EZpvd.OLrzqt(str != null ? str : "", new Function1() { // from class: o.dxq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15089dxj.copydefault(activity, this, str, str2, l, function0, list, str3, str4, (java.lang.String) obj);
                }
            });
        } else {
            AEQbTJ(activity, str, str2, l, function0, list, str3, str4);
        }
    }

    public static final Unit copydefault(android.app.Activity activity, C15089dxj c15089dxj, java.lang.String str, java.lang.String str2, java.lang.Long l, Function0 function0, java.util.List list, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str5, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str5)) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, str5, null, new Function1() { // from class: o.dxn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15089dxj.KWHzl((AbstractC43238rlX) obj);
                }
            }, 4, null);
        } else {
            c15089dxj.AEQbTJ(activity, str, str2, l, function0, list, str3, str4);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC54828xWv
    public void AEQbTJ(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, java.util.List<? extends java.lang.Object> list, java.lang.String str, java.lang.Long l, java.lang.String str2, java.util.List<java.lang.String> list2, java.lang.Boolean bool, boolean z, boolean z2, boolean z3, java.util.List<java.lang.Integer> list3, final Function2<? super java.lang.Long, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new SelectWalletNet(C33129mqd.valueOf(it.next()), false, 2, (DefaultConstructorMarker) null));
            }
        }
        C15123dyQ c15123dyQEZpvd = C15196dzk.KWHzl.EZpvd(abstractActivityC33041mov, new WalletSelectParams(arrayList, str, l, str2, list2, bool, z, z2, z3, list3, (WalletSelectDappCustomParams) null, 1024, (DefaultConstructorMarker) null), new yHO() { // from class: o.dxs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C15089dxj.KWHzl(function2, (java.lang.Long) obj, (InterfaceC9738bbJ) obj2, (java.lang.String) obj3);
            }
        });
        androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c15123dyQEZpvd.show(supportFragmentManager);
    }

    public static final Unit KWHzl(Function2 function2, java.lang.Long l, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.String str) {
        if (function2 != null) {
            function2.invoke(l, interfaceC9738bbJ != null ? interfaceC9738bbJ.DbNXlk() : null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC54828xWv
    public AbstractC58260yxt<java.util.List<DappSearchResultBean>> aP_() {
        return C14923duc.EZpvd.gHZMYf();
    }
}
