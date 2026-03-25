package o;

import androidx.core.os.BundleKt;
import com.okinc.business.defi.biz.net.bean.InnerUrlResp;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC54828xWv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bAx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8347bAx {
    public static final C8347bAx EZpvd = new C8347bAx();

    private C8347bAx() {
    }

    public final void EZpvd(final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (abstractActivityC33041mov == null) {
            return;
        }
        abstractActivityC33041mov.showLoading();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        try {
            android.net.Uri uri = android.net.Uri.parse(str);
            booleanRef.element = Intrinsics.EZpvd((java.lang.Object) uri.getQueryParameter("needConnect"), (java.lang.Object) "1");
            java.lang.String host = uri.getHost();
            booleanRef2.element = host != null && StringsKt__StringsKt.AhwBna((java.lang.CharSequence) host, (java.lang.CharSequence) "okx.com", true);
        } catch (java.lang.Exception e) {
            pUU.KWHzl(e);
        }
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(new C13934dbu().EZpvd(str), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.bAw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8347bAx.EZpvd(abstractActivityC33041mov, str, booleanRef, (InnerUrlResp) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.bAv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C8347bAx.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.bAy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8347bAx.KWHzl(abstractActivityC33041mov, str, booleanRef2, booleanRef, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.bAu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C8347bAx.KWHzl(function12, obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, Ref.BooleanRef booleanRef, InnerUrlResp innerUrlResp) {
        EZpvd.OLrzqt(abstractActivityC33041mov, str, Intrinsics.EZpvd(innerUrlResp.getInnerUrl(), java.lang.Boolean.TRUE), booleanRef.element);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, java.lang.Throwable th) {
        EZpvd.OLrzqt(abstractActivityC33041mov, str, booleanRef.element, booleanRef2.element);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, boolean z, boolean z2) {
        abstractActivityC33041mov.dismissLoading();
        if (z && !z2) {
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, abstractActivityC33041mov, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
        } else {
            InterfaceC54828xWv.ActionBar.enterDAppWebView$default((InterfaceC54828xWv) C43251rlk.copydefault(InterfaceC54828xWv.class), abstractActivityC33041mov, str, null, null, null, null, null, "wallet", 96, null);
        }
    }
}
