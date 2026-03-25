package o;

import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.signdata.EVM5792ContractSignData;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bNi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9021bNi extends C9024bNl<EVM5792ContractSignData> {
    public boolean AYXKKw = true;
    public boolean valueOf = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C8972bMm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AYXKKw(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C8972bMm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AhwBna(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C8972bMm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean ODXsMY() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C8972bMm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean gwTjWJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C9024bNl, o.C8972bMm, o.AbstractC8601bFm, o.AbstractC8564bFB
    public java.lang.String l_() {
        return "3";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C8972bMm, o.AbstractC8601bFm, o.AbstractC8564bFB
    public boolean q_() {
        boolean zQ_ = super.q_();
        giSNqX().KWHzl((EVM5792ContractSignData) QVsKAR());
        return zQ_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> s_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = giSNqX().KWHzl(((EVM5792ContractSignData) QVsKAR()).getCalls());
        final Function1 function1 = new Function1() { // from class: o.bNj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9021bNi.copydefault(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bNm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9021bNi.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd copydefault(C9021bNi c9021bNi, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return super.s_();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<ResponseData<DappTxResultBean>> copydefault(@NotNull final BroadcastBean broadcastBean, final java.lang.String str, final SignAuthType signAuthType) {
        Intrinsics.checkNotNullParameter(broadcastBean, "");
        return giSNqX().OLrzqt((EVM5792ContractSignData) QVsKAR(), broadcastBean, new Function0() { // from class: o.bNf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C9021bNi.copydefault(this.EZpvd, broadcastBean, str, signAuthType);
            }
        });
    }

    public static final AbstractC58185ywX copydefault(C9021bNi c9021bNi, BroadcastBean broadcastBean, java.lang.String str, SignAuthType signAuthType) {
        return super.copydefault(broadcastBean, str, signAuthType);
    }
}
