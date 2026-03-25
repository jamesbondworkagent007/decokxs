package o;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C18853fqJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eSp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15715eSp {
    public static final C15715eSp AEQbTJ = new C15715eSp();

    private C15715eSp() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eSp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean dealWithMpcExceptionStatus$default(C15715eSp c15715eSp, AbstractC12782ctV abstractC12782ctV, android.content.Context context, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        return c15715eSp.EZpvd(abstractC12782ctV, context, (Function0<Unit>) function0);
    }

    public final boolean EZpvd(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull android.content.Context context, Function0<Unit> function0) {
        java.lang.String strAkhnZx;
        java.lang.String uid;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (!abstractC12782ctV.ORxRYg() && !abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) {
            return false;
        }
        C18853fqJ.ActionBar actionBar = C18853fqJ.Companion;
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
        if (mpcWalletEncodeInfoQSBOWP != null && (uid = mpcWalletEncodeInfoQSBOWP.getUid()) != null) {
            str = uid;
        }
        actionBar.KWHzl(str);
        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
        if (abstractC12784ctXGwTjWJ == null || (strAkhnZx = abstractC12784ctXGwTjWJ.AuCTel()) == null) {
            strAkhnZx = abstractC12782ctV.AkhnZx();
        }
        actionBar.copydefault(strAkhnZx);
        if (!abstractC12782ctV.zLjUOn()) {
            AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
            if (abstractActivityC33041mov == null) {
                C55326xho.toast$default(C13754dXa.FragmentManager.setNegativeButtonIcon, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                return true;
            }
            new C14325djN().AEQbTJ(abstractActivityC33041mov, null, abstractC12782ctV, function0);
            return true;
        }
        if (abstractC12782ctV.DCUTEIdCUTEI()) {
            C55326xho.toast$default(C13754dXa.FragmentManager.AlertDialogBuilder, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return true;
        }
        if (abstractC12782ctV.Dmq() || abstractC12782ctV.DCUTEIdCUTEI()) {
            return false;
        }
        AEQbTJ(context, abstractC12782ctV);
        return true;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.eRI.showResume$default(o.eRI, android.content.Context, o.ctV, int, o.yHO, int, java.lang.Object):void */
    public final void AEQbTJ(android.content.Context context, AbstractC12782ctV abstractC12782ctV) {
        eRI.showResume$default(eRI.OLrzqt, context, abstractC12782ctV, 0, new yHO() { // from class: o.eSn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C15715eSp.EZpvd(((java.lang.Integer) obj).intValue(), (android.view.View) obj2, (ViewOnClickListenerC54939xaY) obj3);
            }
        }, 4, null);
    }

    public static final Unit EZpvd(int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        return Unit.INSTANCE;
    }
}
