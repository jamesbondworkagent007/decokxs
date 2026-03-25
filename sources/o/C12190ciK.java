package o;

import com.okinc.business.defi.api.model.tx.signdata.BRC20MintSignData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.ciK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C12190ciK extends C12266cjh {
    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.C12266cjh, o.C12195ciP, o.AbstractC11993ceZ, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXUhxbNG = super.UhxbNG();
        final Function1 function1 = new Function1() { // from class: o.ciH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12190ciK.copydefault(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXUhxbNG.KWHzl(new InterfaceC58229yxO() { // from class: o.ciJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12190ciK.call(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd call(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(C12190ciK c12190ciK, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return AbstractC58185ywX.KWHzl(pair);
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXUfzxmz = c12190ciK.Ufzxmz();
        final Function1 function1 = new Function1() { // from class: o.ciO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12190ciK.copydefault((kotlin.Pair) obj);
            }
        };
        return abstractC58185ywXUfzxmz.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ciN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12190ciK.QCjLjM(function1, obj);
            }
        });
    }

    public static final kotlin.Pair QCjLjM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair.getSecond()) : C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8664bGw, o.AbstractC8704bHj
    public java.lang.String AEQbTJ(boolean z, boolean z2) {
        java.lang.String transferAmount = ((BRC20MintSignData) QVsKAR()).getTransferAmount();
        if (transferAmount.length() == 0) {
            transferAmount = "0";
        }
        return C54870xYj.KWHzl(transferAmount, fHqPtx().valueOf());
    }
}
