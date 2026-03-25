package o;

import com.okinc.business.defi.api.model.IRegisterTransaction;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.StarkNetRegisterSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.core.transaction.sign.starknet.bean.StarkNetExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.starknet.bean.StarkNetSignInfo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignedTx;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.caH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11763caH extends C11796cao<StarkNetRegisterSignData> implements IRegisterTransaction {
    public OKWBaseTransaction.TransactionType ORxRYg = OKWBaseTransaction.TransactionType.Register;
    public final InterfaceC56387yDm OcIXYQ = C56392yDr.copydefault(new Function0() { // from class: o.caI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C11763caH.copydefault(this.EZpvd);
        }
    });
    public final IRegisterTransaction.RegisterType QVAiDq = IRegisterTransaction.RegisterType.RegisterAddress;

    /* JADX DEBUG: Possible override for method o.cao.EZpvd()Lo/ywX; */
    @Override // com.okinc.business.defi.api.model.IRegisterTransaction
    public IRegisterTransaction.TaskDescription EZpvd() {
        return null;
    }

    /* JADX DEBUG: Possible override for method o.cao.KWHzl()Lo/ywX; */
    @Override // com.okinc.business.defi.api.model.IRegisterTransaction
    public java.lang.String KWHzl() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8601bFm
    public void OLrzqt(@NotNull OKWBaseTransaction.TransactionType transactionType) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        this.ORxRYg = transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.IRegisterTransaction
    public IRegisterTransaction.RegisterType copydefault() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8601bFm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public OKWBaseTransaction.TransactionType k_() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C11796cao, o.AbstractC8601bFm, o.AbstractC8564bFB
    public java.lang.String l_() {
        return "7";
    }

    public final C11844cbj aKErDB() {
        return (C11844cbj) this.OcIXYQ.getValue();
    }

    public static final C11844cbj copydefault(C11763caH c11763caH) {
        return new C11844cbj(c11763caH);
    }

    @Override // o.C11796cao, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl(boolean z) {
        return super.KWHzl(false);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AxsJAYsNCnLh() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.C11796cao, o.AbstractC8564bFB
    public java.lang.String zLjUOn() {
        return htlTjW();
    }

    @Override // o.C11796cao
    public java.lang.String OLrzqt() {
        return aKErDB().copydefault();
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    @Override // o.C11796cao, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        if (OuxcSI()) {
            abstractC58185ywXKWHzl = UeEOUB();
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        final Activity activity = new Activity(str);
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.caJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11763caH.giSNqX(activity, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    /* JADX INFO: renamed from: o.caH$Activity */
    public static final class Activity implements Function1<?, InterfaceC60096zvd<? extends ResponseData<BatchBroadcastModel>>> {
        public final /* synthetic */ java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final InterfaceC60096zvd<? extends ResponseData<BatchBroadcastModel>> invoke(kotlin.Pair<java.lang.Boolean, java.lang.String> pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            if (pair.getFirst().booleanValue()) {
                SignedTx signedTxCopydefault = C11763caH.this.aKErDB().copydefault(this.KWHzl);
                java.lang.String tx = signedTxCopydefault.getTx();
                if (tx == null || tx.length() == 0) {
                    return AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
                }
                C11763caH c11763caH = C11763caH.this;
                java.lang.String tx2 = signedTxCopydefault.getTx();
                Intrinsics.copydefault((java.lang.Object) tx2);
                java.lang.String txHash = signedTxCopydefault.getTxHash();
                java.lang.String str = txHash == null ? "" : txHash;
                StarkNetSignInfo starkNetSignInfoRcXXUw = C11763caH.this.RcXXUw();
                return AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8601bFm.generateBroadcastModel$default(c11763caH, tx2, str, null, new StarkNetExtJson(C54862xYb.convertToBigIntegerString$default(starkNetSignInfoRcXXUw != null ? starkNetSignInfoRcXXUw.getNonce() : null, true, (RoundingMode) null, 2, (java.lang.Object) null), C11763caH.this.dHguZz().AhwBna(), "AccountActive"), 4, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
            }
            java.lang.String second = pair.getSecond();
            return AbstractC58185ywX.KWHzl(new ResponseData(-5000, second == null ? "" : second, null, null, null, null, 60, null));
        }
    }

    public static final InterfaceC60096zvd giSNqX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }
}
