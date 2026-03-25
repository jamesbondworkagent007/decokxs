package o;

import com.okinc.dapp.bean.DappSearchResultBean;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xWv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC54828xWv extends InterfaceC43217rlC {
    void AEQbTJ(@NotNull android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.Long l, Function0<Unit> function0, java.util.List<java.lang.Integer> list, @NotNull java.lang.String str3, java.lang.String str4);

    void AEQbTJ(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, java.util.List<? extends java.lang.Object> list, java.lang.String str, java.lang.Long l, java.lang.String str2, java.util.List<java.lang.String> list2, java.lang.Boolean bool, boolean z, boolean z2, boolean z3, java.util.List<java.lang.Integer> list3, Function2<? super java.lang.Long, ? super java.lang.String, Unit> function2);

    void EZpvd(@NotNull android.app.Activity activity, java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num);

    void KWHzl(@NotNull android.app.Activity activity, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.Long l, Function0<Unit> function0, java.util.List<java.lang.Integer> list, @NotNull java.lang.String str5, java.lang.String str6, @NotNull androidx.fragment.app.FragmentManager fragmentManager, int i, java.lang.String str7);

    void OLrzqt(@NotNull android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.Long l, Function0<Unit> function0, java.util.List<java.lang.Integer> list, java.lang.Boolean bool, @NotNull java.lang.String str3, java.lang.String str4);

    AbstractC58260yxt<java.util.List<DappSearchResultBean>> aP_();

    void copydefault(@NotNull android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.Long l, Function0<Unit> function0, java.util.List<java.lang.Integer> list, @NotNull java.lang.String str3, java.lang.String str4, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num, java.lang.Boolean bool);

    void copydefault(@NotNull android.app.Activity activity, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.Long l, Function0<Unit> function0, java.util.List<java.lang.Integer> list, @NotNull java.lang.String str5, java.lang.String str6);

    /* JADX INFO: renamed from: o.xWv$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: o.xWv */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void enterDAppWebView$default(InterfaceC54828xWv interfaceC54828xWv, android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.Long l, Function0 function0, java.util.List list, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterDAppWebView");
            }
            interfaceC54828xWv.AEQbTJ(activity, str, str2, l, function0, (i & 32) != 0 ? null : list, (i & 64) != 0 ? SubdomainStrategy.Global.INSTANCE.toString() : str3, (i & 128) != 0 ? "" : str4);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: o.xWv */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void enterDAppWebView$default(InterfaceC54828xWv interfaceC54828xWv, android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.Long l, Function0 function0, java.util.List list, java.lang.String str3, java.lang.String str4, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterDAppWebView");
            }
            interfaceC54828xWv.copydefault(activity, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : function0, (i & 32) != 0 ? null : list, (i & 64) != 0 ? SubdomainStrategy.Global.INSTANCE.toString() : str3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? null : fragmentManager, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? java.lang.Boolean.TRUE : bool);
        }

        public static /* synthetic */ void enterDAppWebViewByUrl$default(InterfaceC54828xWv interfaceC54828xWv, android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterDAppWebViewByUrl");
            }
            if ((i & 4) != 0) {
                str2 = SubdomainStrategy.Global.INSTANCE.toString();
            }
            java.lang.String str4 = str2;
            if ((i & 8) != 0) {
                str3 = "";
            }
            interfaceC54828xWv.EZpvd(activity, str, str4, str3, (i & 16) != 0 ? null : fragmentManager, (i & 32) != 0 ? null : num);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: o.xWv */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void enterDAppWebViewByDAppId$default(InterfaceC54828xWv interfaceC54828xWv, android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Long l, Function0 function0, java.util.List list, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterDAppWebViewByDAppId");
            }
            interfaceC54828xWv.copydefault(activity, str, str2, str3, str4, l, function0, (i & 128) != 0 ? null : list, (i & 256) != 0 ? SubdomainStrategy.Global.INSTANCE.toString() : str5, (i & 512) != 0 ? "" : str6);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: o.xWv */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void getDAppWebViewFragmentByDAppId$default(InterfaceC54828xWv interfaceC54828xWv, android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Long l, Function0 function0, java.util.List list, java.lang.String str5, java.lang.String str6, androidx.fragment.app.FragmentManager fragmentManager, int i, java.lang.String str7, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDAppWebViewFragmentByDAppId");
            }
            interfaceC54828xWv.KWHzl(activity, str, str2, str3, str4, l, function0, (i2 & 128) != 0 ? null : list, (i2 & 256) != 0 ? SubdomainStrategy.Global.INSTANCE.toString() : str5, (i2 & 512) != 0 ? "" : str6, fragmentManager, i, (i2 & 4096) != 0 ? "" : str7);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: o.xWv */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void enterDAppWebViewByRegex$default(InterfaceC54828xWv interfaceC54828xWv, android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.Long l, Function0 function0, java.util.List list, java.lang.Boolean bool, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterDAppWebViewByRegex");
            }
            interfaceC54828xWv.OLrzqt(activity, str, str2, l, function0, (i & 32) != 0 ? null : list, (i & 64) != 0 ? java.lang.Boolean.FALSE : bool, (i & 128) != 0 ? SubdomainStrategy.Global.INSTANCE.toString() : str3, (i & 256) != 0 ? "" : str4);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: o.xWv */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void openSelectWallet$default(InterfaceC54828xWv interfaceC54828xWv, AbstractActivityC33041mov abstractActivityC33041mov, java.util.List list, java.lang.String str, java.lang.Long l, java.lang.String str2, java.util.List list2, java.lang.Boolean bool, boolean z, boolean z2, boolean z3, java.util.List list3, Function2 function2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openSelectWallet");
            }
            interfaceC54828xWv.AEQbTJ(abstractActivityC33041mov, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? null : list3, function2);
        }
    }
}
