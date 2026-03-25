package o;

import com.okinc.business.defi.api.bean.DappSignArgs;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bvF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10794bvF {
    public static final InterfaceC58261yxu AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public final <T extends AbstractC10828bvn> AbstractC58260yxt<kotlin.Pair<T, java.lang.String>> OLrzqt(@NotNull final DappSignArgs dappSignArgs) {
        Intrinsics.checkNotNullParameter(dappSignArgs, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(dappSignArgs.getWalletId(), true);
        final Function1 function1 = new Function1() { // from class: o.bvK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10794bvF.KWHzl(dappSignArgs, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<kotlin.Pair<T, java.lang.String>> abstractC58260yxt = (AbstractC58260yxt<kotlin.Pair<T, java.lang.String>>) abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.bvN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10794bvF.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxt, "");
        return abstractC58260yxt;
    }

    public static final InterfaceC58261yxu KWHzl(DappSignArgs dappSignArgs, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        final C10806bvR c10806bvR = new C10806bvR();
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtCopydefault = c10806bvR.copydefault(abstractC12782ctV, dappSignArgs);
        final Function1 function1 = new Function1() { // from class: o.bvI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10794bvF.AEQbTJ(c10806bvR, (kotlin.Pair) obj);
            }
        };
        return abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.bvG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10794bvF.EZpvd(function1, obj);
            }
        });
    }

    public static final kotlin.Pair AEQbTJ(C10806bvR c10806bvR, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            Intrinsics.copydefault(c10806bvR, "");
        } else {
            c10806bvR = null;
        }
        return C56390yDp.OLrzqt(c10806bvR, pair.getSecond());
    }

    public static final kotlin.Pair EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }
}
