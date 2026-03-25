package o;

import android.view.View;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16158eee {
    public static final C16158eee KWHzl = new C16158eee();
    public static boolean copydefault = true;
    public static final int EZpvd = 8;

    private C16158eee() {
    }

    public final void copydefault(boolean z) {
        copydefault = z;
        SPUtils.put("have_show_introduction", java.lang.Boolean.valueOf(z));
    }

    public final boolean copydefault() {
        return SPUtils.getBoolean("have_show_introduction", true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.eee */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showCommonDialog$default(C16158eee c16158eee, android.content.Context context, java.lang.String str, java.lang.String str2, boolean z, boolean z2, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        java.lang.String str3 = str;
        boolean z3 = (i & 8) != 0 ? true : z;
        boolean z4 = (i & 16) != 0 ? true : z2;
        if ((i & 32) != 0) {
            function0 = null;
        }
        c16158eee.OLrzqt(context, str3, str2, z3, z4, function0);
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(z);
        viewOnClickListenerC54939xaY.setCancelable(z2);
        viewOnClickListenerC54939xaY.setTitle(str);
        viewOnClickListenerC54939xaY.EZpvd(str2);
        viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.getItem, new View.OnClickListener() { // from class: o.eeg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C16158eee.KWHzl(viewOnClickListenerC54939xaY, function0, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void copydefault(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (!copydefault()) {
            function0.invoke();
            return;
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.eed
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16158eee.EZpvd(fragmentManager, function0, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eef
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C16158eee.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.eeb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16158eee.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eeh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C16158eee.KWHzl(function12, obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(androidx.fragment.app.FragmentManager fragmentManager, Function0 function0, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV.QwvEab() == WalletType.HDWallet || abstractC12782ctV.QwvEab() == WalletType.MPCWallet || (abstractC12782ctV.QwvEab() == WalletType.KeyWallet && abstractC12782ctV.AuCTelauCTel())) {
            C16079edE.Companion.EZpvd().KWHzl(fragmentManager, "AddCustomNetworkIntroduceFragment", function0);
        } else {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }
}
