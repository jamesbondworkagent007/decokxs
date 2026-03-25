package o;

import com.google.gson.Gson;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.bean.InvestTransactionParam;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import com.okinc.business.invest_biz.data.handler.ClaimTransactionHandler$invoke$1;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iyS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25528iyS extends AbstractC25522iyM {
    public final C27568jxe AYXKKw;
    public final iFJ AhwBna;
    public final iCK fetchVPNInfo;
    public final C23724iGz isConnected;
    public final InterfaceC23916iOb valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25528iyS(@NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull iFJ ifj, @NotNull C23724iGz c23724iGz, @NotNull C27568jxe c27568jxe, @NotNull iCK ick) {
        super(interfaceC23916iOb, ifj, c23724iGz, c27568jxe, ick);
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(ifj, "");
        Intrinsics.checkNotNullParameter(c23724iGz, "");
        Intrinsics.checkNotNullParameter(c27568jxe, "");
        Intrinsics.checkNotNullParameter(ick, "");
        this.valueOf = interfaceC23916iOb;
        this.AhwBna = ifj;
        this.isConnected = c23724iGz;
        this.AYXKKw = c27568jxe;
        this.fetchVPNInfo = ick;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yCM
    public C25528iyS(@NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull iFJ ifj, @NotNull C23724iGz c23724iGz) {
        this(interfaceC23916iOb, ifj, c23724iGz, C27568jxe.EZpvd, iCK.AEQbTJ);
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(ifj, "");
        Intrinsics.checkNotNullParameter(c23724iGz, "");
    }

    public final void EZpvd(@NotNull InterfaceC25466ixJ interfaceC25466ixJ, @NotNull C25523iyN c25523iyN, @NotNull Function1<? super InterfaceC25530iyU, Unit> function1) {
        Intrinsics.checkNotNullParameter(interfaceC25466ixJ, "");
        Intrinsics.checkNotNullParameter(c25523iyN, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CoroutineScope coroutineScopeAhwBna = interfaceC25466ixJ.AhwBna();
        if (coroutineScopeAhwBna != null) {
            C27493jwI.safeLaunch$default(coroutineScopeAhwBna, null, null, new ClaimTransactionHandler$invoke$1(this, c25523iyN, interfaceC25466ixJ, function1, null), 3, null);
        }
    }

    public final InvestTxModel OLrzqt(C25523iyN c25523iyN, InterfaceC9738bbJ interfaceC9738bbJ) {
        java.util.List<java.lang.Long> listAhwBna;
        java.lang.Long lOLrzqt = c25523iyN.OLrzqt();
        if (c25523iyN.djBIcL() != null) {
            listAhwBna = C56402yEa.EZpvd(c25523iyN.djBIcL());
        } else {
            listAhwBna = c25523iyN.valueOf() ? yDY.AhwBna() : c25523iyN.copydefault();
        }
        java.util.List<java.lang.Long> list = listAhwBna;
        long jAEQbTJ = c25523iyN.AEQbTJ();
        boolean zValueOf = c25523iyN.valueOf();
        int iKWHzl = c25523iyN.KWHzl();
        java.lang.String strDbNXlk = interfaceC9738bbJ.DbNXlk();
        java.lang.String strEZpvd = interfaceC9738bbJ.EZpvd(c25523iyN.AEQbTJ());
        java.lang.String strAEQbTJ = C27491jwG.AEQbTJ(c25523iyN.AhwBna(), new Function1() { // from class: o.iyP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25528iyS.copydefault((InvestUserRewardElementInfo) obj);
            }
        });
        java.util.List<InvestUserRewardElementInfo> listAhwBna2 = c25523iyN.AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna2, 10));
        for (InvestUserRewardElementInfo investUserRewardElementInfo : listAhwBna2) {
            ButtonType buttonType = investUserRewardElementInfo.getButtonType();
            java.lang.String tokenPrecision = investUserRewardElementInfo.getTokenPrecision();
            java.lang.String str = tokenPrecision == null ? "" : tokenPrecision;
            java.lang.String tokenSymbol = investUserRewardElementInfo.getTokenSymbol();
            java.lang.String str2 = tokenSymbol == null ? "" : tokenSymbol;
            java.lang.String currencyAmount = investUserRewardElementInfo.getCurrencyAmount();
            java.lang.String str3 = currencyAmount == null ? "" : currencyAmount;
            java.lang.String tokenLogo = investUserRewardElementInfo.getTokenLogo();
            java.lang.String str4 = tokenLogo == null ? "" : tokenLogo;
            java.lang.String tokenAddress = investUserRewardElementInfo.getTokenAddress();
            arrayList.add(new InvestTokenWithAmount(c25523iyN.AEQbTJ(), C33129mqd.mulS$default(investUserRewardElementInfo.getCoinAmount(), java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(investUserRewardElementInfo.getTokenPrecision()))), null, null, null, 14, null), str3, false, false, (java.lang.String) null, tokenAddress == null ? "" : tokenAddress, str4, (java.lang.String) null, str2, str, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, buttonType, investUserRewardElementInfo.getTokenAddress(), (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268384568, (DefaultConstructorMarker) null));
        }
        java.util.List list2 = null;
        boolean z = false;
        boolean z2 = false;
        java.lang.String json = new Gson().toJson(new InvestTransactionParam(list2, z, z2, c25523iyN.AEQbTJ(), (java.lang.Integer) null, c25523iyN.OLrzqt(), (java.lang.String) null, c25523iyN.copydefault(), (java.lang.Long) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (InvestPoolV3) null, (java.lang.Integer) null, (java.lang.Boolean) null, 65367, (DefaultConstructorMarker) null));
        Intrinsics.checkNotNullExpressionValue(json, "");
        C25477ixU c25477ixUEZpvd = c25523iyN.EZpvd();
        java.lang.String strOLrzqt = c25477ixUEZpvd != null ? c25477ixUEZpvd.OLrzqt() : null;
        C25477ixU c25477ixUEZpvd2 = c25523iyN.EZpvd();
        java.util.List<java.lang.String> listCopydefault = c25477ixUEZpvd2 != null ? c25477ixUEZpvd2.copydefault() : null;
        C25477ixU c25477ixUEZpvd3 = c25523iyN.EZpvd();
        return new InvestTxModel(iKWHzl, strDbNXlk, strEZpvd, (java.util.List) list, (java.lang.Long) null, jAEQbTJ, strAEQbTJ, (java.util.List) arrayList, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, json, 0, zValueOf, lOLrzqt, (java.lang.String) null, 0, (java.util.List) listCopydefault, c25477ixUEZpvd3 != null ? c25477ixUEZpvd3.EZpvd() : null, (java.util.List) null, (java.util.Map) null, (java.lang.String) null, (java.lang.String) null, strOLrzqt, (java.lang.Integer) null, (java.lang.Integer) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BTCMode) null, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.util.List) null, false, (java.lang.Long) null, -281870576, 65535, (DefaultConstructorMarker) null);
    }

    public static final java.lang.String copydefault(InvestUserRewardElementInfo investUserRewardElementInfo) {
        Intrinsics.checkNotNullParameter(investUserRewardElementInfo, "");
        java.lang.String currencyAmount = investUserRewardElementInfo.getCurrencyAmount();
        return currencyAmount == null ? "0" : currencyAmount;
    }
}
