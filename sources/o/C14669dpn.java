package o;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.database.extra.bean.ReferralInfoBean;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.common.utils.ReferralManager;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33244msm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dpn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14669dpn {
    public static final C14669dpn OLrzqt = new C14669dpn();

    /* JADX INFO: renamed from: o.dpn$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.HDWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.TonWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.KeyWallet.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletType.MPCWallet.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletType.TrackingWallet.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[WalletType.HardwareWallet.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            KWHzl = iArr;
        }
    }

    private C14669dpn() {
    }

    public final java.lang.String copydefault(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        switch (StateListAnimator.KWHzl[abstractC12782ctV.QwvEab().ordinal()]) {
            case 6:
                if (!abstractC12782ctV.sSMYrx()) {
                    if (!abstractC12782ctV.AxsJAY()) {
                        if (abstractC12782ctV.zuBGHE()) {
                        }
                    }
                }
                break;
        }
        return "";
    }

    public static /* synthetic */ void addWalletReport$default(C14669dpn c14669dpn, java.lang.String str, AbstractC12782ctV abstractC12782ctV, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = "wallet";
        }
        c14669dpn.KWHzl(str, abstractC12782ctV, str2);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (abstractC12782ctV.zsXlph()) {
            return;
        }
        try {
            OLrzqt(str, copydefault(abstractC12782ctV), abstractC12782ctV.valueOf(), abstractC12782ctV.DbNXlk(), str2);
        } catch (java.lang.Exception e) {
            C43296rmc.AEQbTJ("AddWalleteventUtils", java.lang.String.valueOf(e.getMessage()));
        }
    }

    public static /* synthetic */ void addWalletReport$default(C14669dpn c14669dpn, java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str4 = "wallet";
        }
        c14669dpn.OLrzqt(str, str2, list, str3, str4);
    }

    public final void OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.util.List<ChainAddress> list, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        dTU.onWeb3Event$default("Web3AddWalletSuccess_Full_Api_Success", null, new Function1() { // from class: o.dpq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14669dpn.AEQbTJ(str, str2, list, str3, str4, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        java.lang.String referralCode;
        java.lang.String str5 = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("app_add_wallet_type", str, true));
        eventParamsList.add(new EventParam("app_wallet_type", str2, true));
        Gson gson = new Gson();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ChainAddress chainAddress = (ChainAddress) it.next();
            JsonObject jsonObject = new JsonObject();
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(chainAddress.getCoinId());
            jsonObject.addProperty("chainId", java.lang.String.valueOf(c10854bwMKWHzl != null ? java.lang.Long.valueOf(c10854bwMKWHzl.fetchVPNInfo()) : ""));
            jsonObject.addProperty(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, java.lang.String.valueOf(chainAddress.getAddress()));
            arrayList.add(jsonObject);
        }
        java.lang.String json = gson.toJson(arrayList);
        Intrinsics.copydefault((java.lang.Object) json);
        eventParamsList.add(new EventParam("chain_address", json, false));
        java.lang.String str6 = (java.lang.String) C32935mmv.KWHzl.get("channel_id");
        if (str6 == null) {
            str6 = "";
        }
        eventParamsList.add(new EventParam("channel_id", str6, false));
        eventParamsList.add(new EventParam("wallet_id", str3, false));
        eventParamsList.add(new EventParam("terminal", "android", true));
        java.lang.String strCopydefault = OLrzqt.copydefault();
        if (strCopydefault != null) {
            str4 = strCopydefault;
        }
        eventParamsList.add(new EventParam("onboarding_source", str4, true));
        eventParamsList.add(new EventParam("client_ts", java.lang.String.valueOf(java.lang.System.currentTimeMillis() / ((long) 1000)), false));
        eventParamsList.add(new EventParam("entityId", ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).AuCTelauCTel(), true));
        ReferralInfoBean referralInfoBeanGEmmrt = ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null).gEmmrt(str3);
        if (referralInfoBeanGEmmrt != null && (referralCode = referralInfoBeanGEmmrt.getReferralCode()) != null) {
            str5 = referralCode;
        }
        eventParamsList.add(new EventParam("web3_c_ref", str5, false));
        return Unit.INSTANCE;
    }

    public final java.lang.String copydefault() {
        if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).isConnected().getValue().intValue() != 2) {
            return null;
        }
        AbstractC33244msm value = ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).values().getValue();
        if (Intrinsics.EZpvd(value, AbstractC33244msm.Fragment.KWHzl)) {
            return "cefi_search_cr_simple";
        }
        if (Intrinsics.EZpvd(value, AbstractC33244msm.ActionBar.KWHzl)) {
            return "cefi_search_cr_advance";
        }
        return null;
    }
}
