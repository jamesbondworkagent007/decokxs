package o;

import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fpv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C18838fpv implements InterfaceC18835fps {
    public final AbstractActivityC33041mov AEQbTJ;
    public int KWHzl;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.copydefault = z;
    }

    public C18838fpv(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        this.AEQbTJ = abstractActivityC33041mov;
        this.KWHzl = 1;
    }

    @Override // o.InterfaceC18835fps
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull final Function1<? super C9697baV, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC14373dkI interfaceC14373dkIEZpvd = C14392dkb.AEQbTJ.EZpvd(this.AEQbTJ, this.KWHzl);
        if (interfaceC14373dkIEZpvd == null) {
            return;
        }
        interfaceC14373dkIEZpvd.OLrzqt(this.AEQbTJ, str, str2, str3, new Function1() { // from class: o.fpw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18838fpv.copydefault(function1, this, (C9697baV) obj);
            }
        });
    }

    public static final Unit copydefault(Function1 function1, C18838fpv c18838fpv, C9697baV c9697baV) {
        Intrinsics.checkNotNullParameter(c9697baV, "");
        function1.invoke(c9697baV);
        if (!c9697baV.EZpvd()) {
            return Unit.INSTANCE;
        }
        if (c18838fpv.copydefault) {
            dZK.AEQbTJ.AEQbTJ(c18838fpv.AEQbTJ, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
        } else {
            ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).aQ_().invoke(java.lang.Boolean.TRUE);
            ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).copydefault(new Function1() { // from class: o.fpy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18838fpv.AEQbTJ(((java.lang.Boolean) obj).booleanValue());
                }
            });
            ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).KWHzl(new Function1() { // from class: o.fpx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18838fpv.copydefault(((java.lang.Boolean) obj).booleanValue());
                }
            });
            c18838fpv.AEQbTJ.finish();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(boolean z) {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(boolean z) {
        return Unit.INSTANCE;
    }
}
