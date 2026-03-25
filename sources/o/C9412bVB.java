package o;

import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaTxResult;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.solana.SolUnitLimitAndPrice;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bVB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9412bVB extends C9413bVC {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C9413bVC, o.AbstractC8601bFm
    public java.lang.String AEQbTJ(boolean z) {
        return "";
    }

    @Override // o.C9413bVC, o.AbstractC8564bFB
    public boolean DCUTEI() {
        return false;
    }

    @Override // o.C9413bVC, o.InterfaceC9462bVz
    public boolean DbNXlk() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C9413bVC, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C9413bVC, o.InterfaceC9462bVz
    public java.lang.String values() {
        return "1";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C9413bVC, o.AbstractC8564bFB
    public java.lang.String zLjUOn() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C9413bVC, o.AbstractC8601bFm
    public java.lang.String zuBGHE() {
        return "";
    }

    @Override // o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> s_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new kotlin.Pair(java.lang.Boolean.TRUE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.C9413bVC, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new kotlin.Pair(java.lang.Boolean.TRUE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC58261yxu AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    @Override // o.C9413bVC, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<ResponseData<SolanaTxResult>> abstractC58260yxtFARcdN = fARcdN();
        final Function1 function1 = new Function1() { // from class: o.bVy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9412bVB.copydefault(this.EZpvd, str, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<SignedTx>> abstractC58185ywXEZpvd = abstractC58260yxtFARcdN.OLrzqt(new InterfaceC58229yxO() { // from class: o.bVA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9412bVB.AEQbTJ(function1, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return OLrzqt(abstractC58185ywXEZpvd);
    }

    public static final InterfaceC58261yxu copydefault(C9412bVB c9412bVB, java.lang.String str, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            return c9412bVB.flVtFt().OLrzqt(str, (SolanaTxResult) responseData.getData());
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, null, 60, null));
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    /* JADX DEBUG: Possible override for method o.bVC.fARcdN()Lo/ywX; */
    public final AbstractC58260yxt<ResponseData<SolanaTxResult>> fARcdN() {
        return aKErDB();
    }

    public final AbstractC58260yxt<ResponseData<SolanaTxResult>> aKErDB() {
        AbstractC58260yxt<ResponseData<SolanaTxResult>> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bVG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C9412bVB.copydefault(this.EZpvd, interfaceC58257yxq);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final void copydefault(C9412bVB c9412bVB, InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        c9412bVB.flVtFt().copydefault((InterfaceC58257yxq<ResponseData<SolanaTxResult>>) interfaceC58257yxq, "", false, false);
    }

    @Override // o.C9413bVC
    public AbstractC58185ywX<ResponseData<java.lang.String>> UeEOUB() {
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5001, "", null, null, null, null, 60, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.C9413bVC, o.InterfaceC9462bVz
    public java.util.List<SolUnitLimitAndPrice> EZpvd() {
        return yDY.AhwBna();
    }
}
