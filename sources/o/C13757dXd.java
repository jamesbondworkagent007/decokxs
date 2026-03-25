package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.Gson;
import com.okinc.business.defi.api.bean.Contract;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.Parameter;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.bean.RawData;
import com.okinc.business.defi.api.bean.SignData;
import com.okinc.business.defi.api.bean.TrxDappSignData;
import com.okinc.business.defi.api.bean.Value;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.ApproveItem;
import com.okinc.business.defi.biz.net.bean.ApproveToken;
import com.okinc.business.defi.biz.net.bean.EIP7702RevokeInfo;
import com.okinc.business.defi.wallet.approve.ApproveListItem;
import com.okinc.localization.util.format.DisplaySign;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dXd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13757dXd {
    public static final C13757dXd copydefault = new C13757dXd();

    private C13757dXd() {
    }

    public final java.util.List<java.lang.Object> AEQbTJ(@NotNull ApproveItem approveItem, long j) {
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(approveItem, "");
        java.util.ArrayList arrayList = null;
        if (approveItem.isEIP7702Upgrade()) {
            java.util.List<EIP7702RevokeInfo> chainList = approveItem.getChainList();
            if (chainList != null) {
                java.util.ArrayList<EIP7702RevokeInfo> arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : chainList) {
                    EIP7702RevokeInfo eIP7702RevokeInfo = (EIP7702RevokeInfo) obj;
                    if (j == Long.MIN_VALUE) {
                        if (eIP7702RevokeInfo.getChainIndex() != null) {
                            arrayList2.add(obj);
                        }
                    } else {
                        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(j);
                        java.lang.Long lValueOf = c10854bwMKWHzl != null ? java.lang.Long.valueOf(c10854bwMKWHzl.fetchVPNInfo()) : null;
                        if (eIP7702RevokeInfo.getChainIndex() != null && Intrinsics.EZpvd(eIP7702RevokeInfo.getChainIndex(), lValueOf)) {
                            arrayList2.add(obj);
                        }
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                for (EIP7702RevokeInfo eIP7702RevokeInfo2 : arrayList2) {
                    C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(C11600cUg.copydefault(eIP7702RevokeInfo2.getChainIndex()));
                    java.lang.String strCopydefault = c10854bwMCopydefault != null ? c10854bwMCopydefault.copydefault() : null;
                    java.lang.String strDjBIcL = c10854bwMCopydefault != null ? c10854bwMCopydefault.djBIcL() : null;
                    arrayList3.add(new dXY(approveItem, strCopydefault, strDjBIcL == null ? "" : strDjBIcL, eIP7702RevokeInfo2.getStatus(), eIP7702RevokeInfo2));
                }
                arrayList = arrayList3;
            }
            return arrayList == null ? yDY.AhwBna() : arrayList;
        }
        java.util.List<ApproveToken> tokens = approveItem.getTokens();
        if (tokens != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(tokens, 10));
            for (ApproveToken approveToken : tokens) {
                if (C33129mqd.OLrzqt(approveToken.getApprovalNum(), "115792089237316195423570985008687907853269984665640564039457584007913129639935")) {
                    strOLrzqt = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getLocation);
                } else {
                    java.lang.String strAEQbTJ = C54870xYj.AEQbTJ(approveToken.getApprovalNum(), C33129mqd.AhwBna(approveToken.getDecimalNum()));
                    if (C33129mqd.AEQbTJ(strAEQbTJ, 1000000000000000L)) {
                        strOLrzqt = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getLocation);
                    } else {
                        C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(approveToken.getCoinId())));
                        strOLrzqt = C54870xYj.OLrzqt(C33129mqd.gEmmrt(strAEQbTJ), (249 & 1) != 0 ? 0 : 0, c10854bwMKWHzl2 != null ? c10854bwMKWHzl2.AkhnZx() : 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : java.lang.Boolean.valueOf(c10854bwMKWHzl2 != null ? c10854bwMKWHzl2.getNewProxyInstance() : false), (249 & 64) != 0 ? false : true, (249 & 128) != 0 ? RoundingMode.DOWN : null);
                    }
                }
                arrayList.add(new dXZ(approveToken.getImageUrl(), approveToken.getSymbol(), strOLrzqt, approveToken.getStatus(), approveToken));
            }
        }
        return arrayList == null ? yDY.AhwBna() : arrayList;
    }

    public final java.util.List<DappInteractionArgs> OLrzqt(@NotNull ApproveListItem approveListItem, @NotNull android.content.Context context, @NotNull eLJ elj) {
        java.util.List listAhwBna;
        int i;
        java.util.List list;
        boolean z;
        java.lang.Object obj;
        java.lang.String json;
        Intrinsics.checkNotNullParameter(approveListItem, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(elj, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ApproveItem approveItemKWHzl = elj.KWHzl(approveListItem.isConnected(), approveListItem.AkhnZx(), approveListItem.AEQbTJ());
        if (approveItemKWHzl != null) {
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(C33129mqd.valueOf(approveItemKWHzl.getCoinId()));
            java.lang.Object obj2 = null;
            boolean z2 = true;
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
            if (abstractC12782ctV == null) {
                return arrayList;
            }
            ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwMKWHzl != null ? c10854bwMKWHzl.AEQbTJ() : 0L, null, 2, null);
            java.lang.String address = chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null;
            if (address == null) {
                address = "";
            }
            java.util.List<ApproveToken> tokens = approveItemKWHzl.getTokens();
            if (tokens == null) {
                listAhwBna = yDY.AhwBna();
            } else {
                java.util.ArrayList<ApproveToken> arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj3 : tokens) {
                    if (Intrinsics.EZpvd((java.lang.Object) ((ApproveToken) obj3).getStatus(), (java.lang.Object) "1")) {
                        arrayList2.add(obj3);
                    }
                }
                listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                for (ApproveToken approveToken : arrayList2) {
                    java.lang.String approvalAddress = approveToken.getApprovalAddress();
                    if (C59449zhJ.startsWith$default(approvalAddress, EIP1271Verifier.hexPrefix, false, 2, obj2)) {
                        approvalAddress = StringsKt__StringsKt.KWHzl(approvalAddress, (java.lang.CharSequence) EIP1271Verifier.hexPrefix);
                    }
                    if (c10854bwMKWHzl != null && c10854bwMKWHzl.QkdxfA() == z2) {
                        i = 0;
                        list = listAhwBna;
                        json = new Gson().toJson(new SignData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, "0", approveToken.getTokenAddress(), "0x095ea7b3000000000000000000000000" + approvalAddress + "0000000000000000000000000000000000000000000000000000000000000000", address, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, TypedValues.Custom.TYPE_STRING, (DefaultConstructorMarker) null));
                        z = true;
                        obj = null;
                    } else {
                        i = 0;
                        list = listAhwBna;
                        if (c10854bwMKWHzl != null && c10854bwMKWHzl.run()) {
                            z = true;
                            obj = null;
                            json = new Gson().toJson(new TrxDappSignData(new RawData(C56402yEa.EZpvd(new Contract(new Parameter((java.lang.String) null, new Value((java.lang.Long) null, (java.lang.Long) null, approveToken.getTokenAddress(), (java.lang.String) null, (java.lang.String) null, approveToken.getAddress(), 27, (DefaultConstructorMarker) null), 1, (DefaultConstructorMarker) null), (java.lang.String) null, 2, (DefaultConstructorMarker) null)), (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Long) null, 62, (DefaultConstructorMarker) null), (java.lang.String) null, (java.util.List) null, (java.lang.String) null, java.lang.Boolean.TRUE, 14, (DefaultConstructorMarker) null));
                        } else {
                            C55326xho.toast$default(context.getString(C13754dXa.FragmentManager.invokespecialaVhqwO), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                            break;
                        }
                    }
                    long jValueOf = C33129mqd.valueOf(approveToken.getCoinId());
                    java.lang.String projectIcon = approveItemKWHzl.getProjectIcon();
                    java.lang.String str = projectIcon == null ? "" : projectIcon;
                    java.lang.String string = context.getString(C13754dXa.FragmentManager.RckOJh);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    PlatformItem platformItem = new PlatformItem(jValueOf, approveItemKWHzl.getShowProjectName(string), str, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, 0L, approveItemKWHzl.getShowProjectIconResource(C13754dXa.Activity.aKErDB), (java.lang.String) null, (java.lang.String) null, 14328, (DefaultConstructorMarker) null);
                    java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
                    long jFetchVPNInfo = c10854bwMKWHzl.fetchVPNInfo();
                    Intrinsics.copydefault((java.lang.Object) json);
                    DappInteractionArgs dappInteractionArgs = new DappInteractionArgs(strDbNXlk, null, java.lang.String.valueOf(jFetchVPNInfo), platformItem, json, java.lang.Long.valueOf(C33129mqd.valueOf(approveToken.getCoinId())), null, 6, null, null, approveToken.getApprovalAddress(), approveToken.getApprovalNum(), true, false, null, false, null, null, null, null, null, null, null, null, null, null, java.lang.Integer.valueOf(i), null, null, null, null, null, -67116222, null);
                    java.util.List list2 = list;
                    list2.add(dappInteractionArgs);
                    listAhwBna = list2;
                    z2 = z;
                    obj2 = obj;
                }
            }
            arrayList.addAll(listAhwBna);
        }
        return arrayList;
    }
}
