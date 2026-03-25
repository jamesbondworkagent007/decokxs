package o;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.dapp.webview.DappTabData;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.drG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14742drG {
    public static final C14742drG KWHzl = new C14742drG();

    private C14742drG() {
    }

    public final void AEQbTJ(int i) {
        C32866mlf.EZpvd("app_metax_discover_browser_function_favorite_click", new EventParam("addfavourite", java.lang.String.valueOf(i), true));
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C32866mlf.OLrzqt("DiscoverBrowser_Rpc_Request_View", yDY.gEmmrt(new EventParam("website_link", str, false), new EventParam("request_method", str2, false), new EventParam("chain_id", str3, false)));
    }

    public static /* synthetic */ void trackDiscoverFullProjectDappClick$default(C14742drG c14742drG, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        c14742drG.EZpvd(str, str2, str3, str4);
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void EZpvd(final java.lang.String str, final java.lang.String str2, @NotNull final java.lang.String str3, final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().KWHzl();
        final Function1 function1 = new Function1() { // from class: o.drE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14742drG.EZpvd(str, str2, str3, str4, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.drK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14742drG.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.drI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14742drG.AEQbTJ(str, str2, str3, str4, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.drJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14742drG.valueOf(function12, obj);
            }
        });
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, InterfaceC9738bbJ interfaceC9738bbJ) {
        EventParam[] eventParamArr = new EventParam[5];
        java.util.List<C9698baW> listAhwBna = interfaceC9738bbJ.AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator<T> it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(((C9698baW) it.next()).OLrzqt());
        }
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.OqFWZa(arrayList), ",", null, null, 0, null, null, 62, null);
        if (strJoinToString$default == null || strJoinToString$default.length() == 0) {
            strJoinToString$default = "";
        }
        eventParamArr[0] = new EventParam("wallet_address", strJoinToString$default, false);
        if (str == null) {
            str = "";
        }
        eventParamArr[1] = new EventParam("project_name", str, false);
        if (str2 == null) {
            str2 = "";
        }
        eventParamArr[2] = new EventParam("project_category", str2, true);
        eventParamArr[3] = new EventParam("click_position", str3, true);
        eventParamArr[4] = new EventParam("url", C33129mqd.gEmmrt(str4), false);
        C32866mlf.OLrzqt("HomeDiscover_Full_Project_Click", yDY.gEmmrt(eventParamArr));
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Throwable th) {
        EventParam[] eventParamArr = new EventParam[5];
        eventParamArr[0] = new EventParam("wallet_address", "", false);
        if (str == null) {
            str = "";
        }
        eventParamArr[1] = new EventParam("project_name", str, false);
        if (str2 == null) {
            str2 = "";
        }
        eventParamArr[2] = new EventParam("project_category", str2, true);
        eventParamArr[3] = new EventParam("click_position", str3, true);
        eventParamArr[4] = new EventParam("url", C33129mqd.gEmmrt(str4), false);
        C32866mlf.OLrzqt("HomeDiscover_Full_Project_Click", yDY.gEmmrt(eventParamArr));
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().KWHzl();
        final Function1 function1 = new Function1() { // from class: o.drL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14742drG.KWHzl((InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.drD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14742drG.AhwBna(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.drH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14742drG.KWHzl((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.drF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14742drG.AYXKKw(function12, obj);
            }
        });
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(InterfaceC9738bbJ interfaceC9738bbJ) {
        java.util.List<C9698baW> listAhwBna = interfaceC9738bbJ.AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator<T> it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(((C9698baW) it.next()).OLrzqt());
        }
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.OqFWZa(arrayList), ",", null, null, 0, null, null, 62, null);
        if (strJoinToString$default == null || strJoinToString$default.length() == 0) {
            strJoinToString$default = "";
        }
        C32866mlf.OLrzqt("HomeDiscover_BrowserEntry_Button_Click", C56402yEa.EZpvd(new EventParam("wallet_address", strJoinToString$default, false)));
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        C32866mlf.OLrzqt("HomeDiscover_BrowserEntry_Button_Click", C56402yEa.EZpvd(new EventParam("wallet_address", "", false)));
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5) {
        java.lang.String strDjBIcL;
        java.lang.String str6 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        EventParam[] eventParamArr = new EventParam[7];
        eventParamArr[0] = new EventParam("wallet_address", str, false);
        InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd(j, true);
        if (interfaceC9731bbCEZpvd != null && (strDjBIcL = interfaceC9731bbCEZpvd.djBIcL()) != null) {
            str6 = strDjBIcL;
        }
        eventParamArr[1] = new EventParam("chain", str6, true);
        eventParamArr[2] = new EventParam(RequestParameters.SUBRESOURCE_WEBSITE, str2, false);
        eventParamArr[3] = new EventParam("type", str3, true);
        eventParamArr[4] = new EventParam("website_name", str4, true);
        eventParamArr[5] = new EventParam("host", C14923duc.EZpvd.KWHzl(str2), false);
        if (!(!(str5 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str5)))) {
            str5 = null;
        }
        eventParamArr[6] = str5 != null ? new EventParam("source", str5, false) : null;
        C32866mlf.OLrzqt("DiscoverBrowser_WalletConnect_Status_View", yDY.valueOf(eventParamArr));
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.OLrzqt("DiscoverPage_Sheet_DAppDetail_View", yDY.gEmmrt(new EventParam("dapp_name", str, false), new EventParam("click_page", str2, true)));
    }

    public final void KWHzl(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EventParam[] eventParamArr = new EventParam[4];
        eventParamArr[0] = new EventParam("is_show_nexttime", z ? "show" : "no_show", true);
        eventParamArr[1] = new EventParam("dapp_name", str, false);
        eventParamArr[2] = new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str2, true);
        eventParamArr[3] = new EventParam(MTPushConstants.PlatformNode.KEY_PLATFORM, "android", true);
        C32866mlf.OLrzqt("DiscoverPage_Sheet_DAppDetail_Click", yDY.gEmmrt(eventParamArr));
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.OLrzqt("app_metax_discover_Antifraudpopups_show", C56402yEa.EZpvd(new EventParam(RequestParameters.SUBRESOURCE_WEBSITE, str, false)));
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.OLrzqt("DiscoverBrowser_Tab_Page_View", yDY.gEmmrt(new EventParam("tab_number", str, false), new EventParam("wallet_address", OLrzqt(), false)));
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.OLrzqt("DiscoverBrowser_Sheet_ChooseWallet_Click", C56402yEa.EZpvd(new EventParam("network", str, false)));
    }

    public static /* synthetic */ void trackDiscoverHomePageView$default(C14742drG c14742drG, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        c14742drG.KWHzl(str, str2);
    }

    public final void KWHzl(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str3 = (java.lang.String) C32935mmv.KWHzl.get("channel_id");
        if (str3 == null) {
            str3 = "";
        }
        EventParam[] eventParamArr = new EventParam[4];
        eventParamArr[0] = new EventParam("wallet_address", OLrzqt(), false);
        eventParamArr[1] = new EventParam("page_name", str, true);
        if (str2 == null) {
            str2 = "";
        }
        eventParamArr[2] = new EventParam("sub_page_name", str2, true);
        eventParamArr[3] = new EventParam("channel_id", str3, true);
        C32866mlf.OLrzqt("HomeDiscover_Full_Page_View", yDY.gEmmrt(eventParamArr));
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.OLrzqt("DiscoverFavorites_Full_Button_Click", yDY.gEmmrt(new EventParam("wallet_address", OLrzqt(), false), new EventParam("page_name", str, false), new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str2, true)));
    }

    public static /* synthetic */ void trackBrowserView$default(C14742drG c14742drG, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        c14742drG.KWHzl(str, str2, str3);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EventParam[] eventParamArr = new EventParam[5];
        eventParamArr[0] = new EventParam("wallet_address", OLrzqt(), false);
        eventParamArr[1] = new EventParam("url", str, false);
        eventParamArr[2] = new EventParam("website_name", str2, false);
        eventParamArr[3] = new EventParam("domain_name", C14923duc.EZpvd.KWHzl(str), false);
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
            str3 = null;
        }
        eventParamArr[4] = str3 != null ? new EventParam("source", str3, false) : null;
        C32866mlf.OLrzqt("DiscoverBrowser_Full_Page_View", yDY.valueOf(eventParamArr));
    }

    public final void copydefault() {
        C32866mlf.OLrzqt("DiscoverAntifraud_Sheet_Page_View", C56402yEa.EZpvd(new EventParam("wallet_address", OLrzqt(), true)));
    }

    public final java.lang.String OLrzqt() {
        java.lang.String strEZpvd;
        java.util.List<C9698baW> listAhwBna;
        C9698baW c9698baW;
        java.lang.String strOLrzqt;
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.AkhnZx(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().copydefault(), 0);
        if (interfaceC9738bbJ == null || (strEZpvd = interfaceC9738bbJ.EZpvd(1L)) == null) {
            strEZpvd = "";
        }
        return C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd) ? strEZpvd : (interfaceC9738bbJ == null || (listAhwBna = interfaceC9738bbJ.AhwBna()) == null || (c9698baW = (C9698baW) CollectionsKt___CollectionsKt.AkhnZx(listAhwBna, 0)) == null || (strOLrzqt = c9698baW.OLrzqt()) == null) ? "" : strOLrzqt;
    }

    public static /* synthetic */ void trackDiscoverBrowserBtnClick$default(C14742drG c14742drG, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        c14742drG.OLrzqt(str, str2);
    }

    public final void OLrzqt(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List listAhwBna = yDY.AhwBna(new EventParam("wallet_address", OLrzqt(), false), new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str, true));
        if (str2 != null) {
            listAhwBna.add(new EventParam("url", str2, false));
        }
        C32866mlf.OLrzqt("DiscoverBrowser_Full_Button_Click", listAhwBna);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.OLrzqt("DiscoverBrowser_Translate_Toast_View", yDY.gEmmrt(new EventParam("type", str, true), new EventParam("url", str2, false)));
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.OLrzqt("DiscoverBrowser_Translate_Toast_Click", C56402yEa.EZpvd(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str, true)));
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C32866mlf.OLrzqt("HomeDiscover_Full_Socialmedia_Click", yDY.gEmmrt(new EventParam("dapp_name", str, false), new EventParam("socialmedia_category", str2, true), new EventParam("url", str3, false)));
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.OLrzqt("DiscoverBrowser_Tab_Page_Click", C56402yEa.EZpvd(new EventParam(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, str, false)));
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, PlatformItem platformItem) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (platformItem != null) {
            DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
            C32866mlf.OLrzqt("DiscoverBrowser_Trade_Method_Request", yDY.gEmmrt(new EventParam("url", platformItem.getUrl(), false), new EventParam("wallet_address", str, false), new EventParam("call_method", str2, false), new EventParam("chain", C33129mqd.gEmmrt(java.lang.Long.valueOf(j)), false), new EventParam("host", C14923duc.EZpvd.KWHzl(platformItem.getUrl()), false), new EventParam("dapp_name", platformItem.getPlatform(), false), new EventParam("dapp_id", C33129mqd.gEmmrt(java.lang.Long.valueOf(platformItem.getId())), false), new EventParam("source", (dappTabDataOLrzqt == null || !dappTabDataOLrzqt.getOkxConnect()) ? WalletSearchRequest.SEARCH_SOURCE_DISCOVER : "okx_connect", false)));
        }
    }

    public final void AEQbTJ(java.lang.String str, @NotNull java.lang.String str2, long j, PlatformItem platformItem, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (str3 == null || str == null || platformItem == null) {
            return;
        }
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        C32866mlf.OLrzqt("DiscoverBrowser_Trade_Confirm_Click", yDY.gEmmrt(new EventParam("url", platformItem.getUrl(), false), new EventParam("wallet_address", str, false), new EventParam("call_method", str2, false), new EventParam("chain", C33129mqd.gEmmrt(java.lang.Long.valueOf(j)), false), new EventParam("host", C14923duc.EZpvd.KWHzl(platformItem.getUrl()), false), new EventParam("dapp_name", platformItem.getPlatform(), false), new EventParam("dapp_id", C33129mqd.gEmmrt(java.lang.Long.valueOf(platformItem.getId())), false), new EventParam("tx_hash", str3, false), new EventParam("source", (dappTabDataOLrzqt == null || !dappTabDataOLrzqt.getOkxConnect()) ? WalletSearchRequest.SEARCH_SOURCE_DISCOVER : "okx_connect", false)));
    }
}
