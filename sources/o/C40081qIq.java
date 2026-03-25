package o;

import androidx.lifecycle.AndroidViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.market.search.features.main.entry.ui.model.SearchRecommendVo;
import com.okinc.market.search.features.main.root.ui.viewmodel.SearchState;
import com.okinc.oksearch.analytics.FuzzySearchEventSourceEnum;
import com.okinc.oksearch.analytics.FuzzySearchEventTracker;
import java.lang.ref.WeakReference;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qIq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40081qIq extends AndroidViewModel {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public SearchRecommendVo AEQbTJ;
    public java.lang.String AhwBna;
    public java.lang.String EZpvd;
    public C40083qIs KWHzl;
    public boolean OLrzqt;
    public java.lang.String djBIcL;
    public WeakReference<qID> gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(SearchRecommendVo searchRecommendVo) {
        this.AEQbTJ = searchRecommendVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchRecommendVo copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40081qIq(@NotNull android.app.Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "");
        this.valueOf = "";
        this.EZpvd = "";
        this.djBIcL = "";
        this.AhwBna = "";
    }

    /* JADX INFO: renamed from: o.qIq$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qIq.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final qID EZpvd() {
        WeakReference<qID> weakReference = this.gEmmrt;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void AEQbTJ(qID qid) {
        if (qid != null) {
            this.gEmmrt = new WeakReference<>(qid);
        }
    }

    public final void AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C40083qIs c40083qIs = this.KWHzl;
        if ((c40083qIs != null ? c40083qIs.copydefault() : null) != null) {
            C40083qIs c40083qIs2 = this.KWHzl;
            if ((c40083qIs2 != null ? c40083qIs2.copydefault() : null) != SearchState.END) {
                pUU.KWHzl("SearchSessionViewModel", "current session state should be end");
                return;
            }
        }
        C40083qIs c40083qIs3 = new C40083qIs();
        this.KWHzl = c40083qIs3;
        Intrinsics.copydefault(c40083qIs3);
        c40083qIs3.AEQbTJ(str);
        this.djBIcL = str;
        C40083qIs c40083qIs4 = this.KWHzl;
        if (c40083qIs4 != null) {
            c40083qIs4.OLrzqt(SearchState.PROCESS);
        }
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C40083qIs c40083qIs = this.KWHzl;
        if ((c40083qIs != null ? c40083qIs.copydefault() : null) == SearchState.PROCESS) {
            gEmmrt(str);
        } else {
            AhwBna(str);
        }
    }

    public final void gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C40083qIs c40083qIs = this.KWHzl;
        if ((c40083qIs != null ? c40083qIs.copydefault() : null) != SearchState.PROCESS) {
            pUU.KWHzl("SearchSessionViewModel", "current session should be process");
            return;
        }
        C40083qIs c40083qIs2 = this.KWHzl;
        if (c40083qIs2 != null) {
            c40083qIs2.AEQbTJ(str);
        }
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [162=8] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02c1, code lost:
    
        if (r2.equals("clearBizNav") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02c4, code lost:
    
        o.C32866mlf.onEvent$default("BizNavSearch_List_Button_Click", (com.okinc.components.track.TrackChannel[]) null, new o.qIB(r1, r20), 1, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f7, code lost:
    
        if (r2.equals("clearCoinNav") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0101, code lost:
    
        if (r2.equals(com.okinc.liveness.lca.EopTrackEvent.CLOSE) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010b, code lost:
    
        if (r2.equals(com.okinc.web3.security.track.Web3SecurityTrackEvent.VALUE_CLEAR) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013e, code lost:
    
        if (r2.equals("closeBizNav") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0148, code lost:
    
        if (r2.equals("closeCoinNav") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014c, code lost:
    
        o.C32866mlf.onEvent$default("TokenNav_List_Button_Click", (com.okinc.components.track.TrackChannel[]) null, new o.C40086qIv(r1, r20), 1, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015e, code lost:
    
        if (r2.equals(com.okinc.account.api.model.security.otp.OtpEventTracker.OTP_EVENT_VALUE_CANCEL) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0162, code lost:
    
        o.C32866mlf.onEvent$default("Search_SearchResult_Button_Click", (com.okinc.components.track.TrackChannel[]) null, new o.C40082qIr(r1, r20), 1, (java.lang.Object) null);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl() {
        java.lang.String lowerCase;
        java.lang.String strOLrzqt;
        java.lang.String lowerCase2;
        java.lang.String strOLrzqt2;
        java.lang.String lowerCase3;
        java.lang.String strOLrzqt3;
        C40083qIs c40083qIs = this.KWHzl;
        if (c40083qIs != null) {
            c40083qIs.OLrzqt(SearchState.END);
        }
        final C40083qIs c40083qIs2 = this.KWHzl;
        if (c40083qIs2 != null) {
            java.lang.String str = c40083qIs2.AEQbTJ().get("end_session_type");
            if (str != null) {
                switch (str.hashCode()) {
                    case -2082133059:
                        break;
                    case -1965379397:
                        if (str.equals("clickItem")) {
                            C32866mlf.onEvent$default("Search_List_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.qIt
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C40081qIq.AYXKKw(c40083qIs2, this, (EventParamsList) obj);
                                }
                            }, 1, (java.lang.Object) null);
                            java.lang.String strAEQbTJ = AEQbTJ("Favorites");
                            FuzzySearchEventTracker fuzzySearchEventTracker = FuzzySearchEventTracker.EZpvd;
                            java.lang.String source = FuzzySearchEventSourceEnum.OKMARKET_COIN.getSource();
                            java.lang.String str2 = c40083qIs2.AEQbTJ().get("biz_type");
                            if (str2 == null || (strOLrzqt = C27993kKy.OLrzqt(str2)) == null) {
                                lowerCase = "";
                            } else {
                                lowerCase = strOLrzqt.toLowerCase(java.util.Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                                if (lowerCase == null) {
                                }
                            }
                            java.lang.String lowerCase4 = C27993kKy.OLrzqt(strAEQbTJ).toLowerCase(java.util.Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
                            java.lang.String str3 = source + "_Search_List_Button_Click_" + lowerCase + "_" + lowerCase4;
                            java.lang.String strGEmmrt = C33129mqd.gEmmrt(c40083qIs2.OLrzqt());
                            java.lang.String str4 = c40083qIs2.AEQbTJ().get("click_item");
                            java.lang.String str5 = str4 == null ? "" : str4;
                            java.lang.String str6 = c40083qIs2.AEQbTJ().get("click_item");
                            java.lang.String str7 = str6 == null ? "" : str6;
                            java.lang.String str8 = c40083qIs2.AEQbTJ().get("rank_order");
                            fuzzySearchEventTracker.KWHzl(str3, strGEmmrt, str5, str7, "", "", str8 == null ? "" : str8);
                        }
                        break;
                    case -1890488581:
                        if (str.equals("NavClickItemBiz")) {
                            C32866mlf.onEvent$default("BizNavSearch_List_Token_Click", (TrackChannel[]) null, new Function1() { // from class: o.qIz
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C40081qIq.valueOf(c40083qIs2, this, (EventParamsList) obj);
                                }
                            }, 1, (java.lang.Object) null);
                            java.lang.String strAEQbTJ2 = AEQbTJ("Favorites");
                            FuzzySearchEventTracker fuzzySearchEventTracker2 = FuzzySearchEventTracker.EZpvd;
                            java.lang.String source2 = FuzzySearchEventSourceEnum.OKMARKET_COIN.getSource();
                            java.lang.String str9 = c40083qIs2.AEQbTJ().get("biz_type");
                            if (str9 == null || (strOLrzqt2 = C27993kKy.OLrzqt(str9)) == null) {
                                lowerCase2 = "";
                            } else {
                                lowerCase2 = strOLrzqt2.toLowerCase(java.util.Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                                if (lowerCase2 == null) {
                                }
                            }
                            java.lang.String lowerCase5 = C27993kKy.OLrzqt(strAEQbTJ2).toLowerCase(java.util.Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase5, "");
                            java.lang.String str10 = source2 + "_BizNavSearch_List_Token_Click_" + lowerCase2 + "_" + lowerCase5;
                            java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(c40083qIs2.OLrzqt());
                            java.lang.String str11 = c40083qIs2.AEQbTJ().get("click_item");
                            java.lang.String str12 = str11 == null ? "" : str11;
                            java.lang.String str13 = c40083qIs2.AEQbTJ().get("click_item");
                            java.lang.String str14 = str13 == null ? "" : str13;
                            java.lang.String str15 = c40083qIs2.AEQbTJ().get("rank_order");
                            fuzzySearchEventTracker2.KWHzl(str10, strGEmmrt2, str12, str14, "", "", str15 == null ? "" : str15);
                        }
                        break;
                    case -1367724422:
                        break;
                    case -398377030:
                        break;
                    case -323639512:
                        break;
                    case -17539390:
                        if (str.equals("tradeNoResult")) {
                            qID qidEZpvd = EZpvd();
                            if ((qidEZpvd != null && !qidEZpvd.OLrzqt(this.valueOf)) || this.OLrzqt) {
                                C32866mlf.onEvent$default("Searchnoresults_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.qIx
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return C40081qIq.AhwBna(c40083qIs2, this, (EventParamsList) obj);
                                    }
                                }, 1, (java.lang.Object) null);
                                break;
                            }
                        }
                        break;
                    case 94746189:
                        break;
                    case 94756344:
                        break;
                    case 922897861:
                        break;
                    case 1524431273:
                        if (str.equals("NavClickItemCoin")) {
                            C32866mlf.onEvent$default("TokenNav_List_Token_Click", (TrackChannel[]) null, new Function1() { // from class: o.qIw
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C40081qIq.copydefault(c40083qIs2, (EventParamsList) obj);
                                }
                            }, 1, (java.lang.Object) null);
                            java.lang.String strAEQbTJ3 = AEQbTJ("Favorites");
                            FuzzySearchEventTracker fuzzySearchEventTracker3 = FuzzySearchEventTracker.EZpvd;
                            java.lang.String source3 = FuzzySearchEventSourceEnum.OKMARKET_COIN.getSource();
                            java.lang.String str16 = c40083qIs2.AEQbTJ().get("biz_type");
                            if (str16 == null || (strOLrzqt3 = C27993kKy.OLrzqt(str16)) == null) {
                                lowerCase3 = "";
                            } else {
                                lowerCase3 = strOLrzqt3.toLowerCase(java.util.Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                                if (lowerCase3 == null) {
                                }
                            }
                            java.lang.String lowerCase6 = C27993kKy.OLrzqt(strAEQbTJ3).toLowerCase(java.util.Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase6, "");
                            java.lang.String str17 = source3 + "_TokenNav_List_Token_Click_" + lowerCase3 + "_" + lowerCase6;
                            java.lang.String strGEmmrt3 = C33129mqd.gEmmrt(c40083qIs2.OLrzqt());
                            java.lang.String str18 = c40083qIs2.AEQbTJ().get("click_item");
                            java.lang.String str19 = str18 == null ? "" : str18;
                            java.lang.String str20 = c40083qIs2.AEQbTJ().get("click_item");
                            java.lang.String str21 = str20 == null ? "" : str20;
                            java.lang.String str22 = c40083qIs2.AEQbTJ().get("rank_order");
                            fuzzySearchEventTracker3.KWHzl(str17, strGEmmrt3, str19, str21, "", "", str22 == null ? "" : str22);
                        }
                        break;
                    case 1831833441:
                        if (str.equals("NavNoResult")) {
                            C32866mlf.onEvent$default("TradeBizNav_SearchResult_NoOffer_View", (TrackChannel[]) null, new Function1() { // from class: o.qIy
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C40081qIq.AEQbTJ(this.OLrzqt, c40083qIs2, (EventParamsList) obj);
                                }
                            }, 1, (java.lang.Object) null);
                        }
                        break;
                }
            }
            C43296rmc.EZpvd("SearchSessionViewModel", "无结果上报");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AYXKKw(C40083qIs c40083qIs, C40081qIq c40081qIq, EventParamsList eventParamsList) {
        java.lang.String lowerCase;
        java.lang.String type;
        java.lang.String ccy;
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (Intrinsics.EZpvd((java.lang.Object) c40083qIs.AEQbTJ().get("biz_type"), (java.lang.Object) "dex")) {
            java.lang.String str = c40083qIs.AEQbTJ().get("token_address");
            if (str == null) {
                str = "";
            }
            eventParamsList.put("token_address", str, false);
            java.lang.String str2 = c40083qIs.AEQbTJ().get("chain_name");
            if (str2 == null) {
                str2 = "";
            }
            eventParamsList.put("chain_name", str2, false);
            java.lang.String str3 = c40083qIs.AEQbTJ().get("dex_community_recognized");
            EventParamsList.put$default(eventParamsList, "dex_community_recognized", str3 == null ? "" : str3, false, 4, null);
        }
        if (Intrinsics.EZpvd((java.lang.Object) c40083qIs.AEQbTJ().get("biz_type"), (java.lang.Object) "cedefi")) {
            java.lang.String str4 = c40083qIs.AEQbTJ().get("token_address");
            if (str4 == null) {
                str4 = "";
            }
            eventParamsList.put("tokenContractAddress", str4, false);
        }
        eventParamsList.put("search_text", c40083qIs.OLrzqt(), false);
        java.lang.String str5 = c40083qIs.AEQbTJ().get("click_item");
        if (str5 == null) {
            str5 = "";
        }
        eventParamsList.put("click_item", str5, false);
        java.lang.String str6 = c40083qIs.AEQbTJ().get("click_item_type");
        if (str6 == null) {
            str6 = "";
        }
        eventParamsList.put("click_item_type", str6, true);
        java.lang.String str7 = c40083qIs.AEQbTJ().get("biz_type");
        if (str7 == null || (strOLrzqt = C27993kKy.OLrzqt(str7)) == null) {
            lowerCase = "";
        } else {
            lowerCase = strOLrzqt.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase == null) {
            }
        }
        eventParamsList.put("biz_type", lowerCase, true);
        java.lang.String str8 = c40083qIs.AEQbTJ().get("rank_order");
        if (str8 == null) {
            str8 = "";
        }
        eventParamsList.put("rank_order", str8, false);
        qID qidEZpvd = c40081qIq.EZpvd();
        java.lang.String strCopydefault = qidEZpvd != null ? qidEZpvd.copydefault() : null;
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        eventParamsList.put("sort_type", strCopydefault, false);
        eventParamsList.put("from_page", c40081qIq.EZpvd, true);
        EventParamsList.put$default(eventParamsList, "tab", C40383qTv.EZpvd(c40081qIq.valueOf), false, 4, null);
        java.util.Iterator<T> it = c40083qIs.EZpvd().iterator();
        while (it.hasNext()) {
            Triple triple = (Triple) it.next();
            eventParamsList.put((java.lang.String) triple.getFirst(), (java.lang.String) triple.getSecond(), ((java.lang.Boolean) triple.getThird()).booleanValue());
        }
        SearchRecommendVo searchRecommendVo = c40081qIq.AEQbTJ;
        if (searchRecommendVo != null) {
            EventParamsList.put$default(eventParamsList, "rcmd_position", C33129mqd.gEmmrt(searchRecommendVo != null ? searchRecommendVo.getIndex() : null), false, 4, null);
            EventParamsList.put$default(eventParamsList, "is_textbox_rcmd", C33129mqd.gEmmrt(java.lang.Boolean.valueOf(c40081qIq.AEQbTJ != null)), false, 4, null);
            SearchRecommendVo searchRecommendVo2 = c40081qIq.AEQbTJ;
            EventParamsList.put$default(eventParamsList, "rcmd_token", (searchRecommendVo2 == null || (ccy = searchRecommendVo2.getCcy()) == null) ? "" : ccy, false, 4, null);
            SearchRecommendVo searchRecommendVo3 = c40081qIq.AEQbTJ;
            EventParamsList.put$default(eventParamsList, "rcmd_type", (searchRecommendVo3 == null || (type = searchRecommendVo3.getType()) == null) ? "" : type, false, 4, null);
        }
        java.lang.String str9 = c40083qIs.AEQbTJ().get("is_boost");
        EventParamsList.put$default(eventParamsList, "is_boost", str9 == null ? "" : str9, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C40083qIs c40083qIs, C40081qIq c40081qIq, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("search_text", c40083qIs.OLrzqt(), false);
        java.lang.String str = c40083qIs.AEQbTJ().get("button_type");
        eventParamsList.put("button_type", str != null ? str : "", true);
        qID qidEZpvd = c40081qIq.EZpvd();
        eventParamsList.put("all_result", (qidEZpvd == null || !qidEZpvd.OLrzqt("ANY")) ? "no" : "yes", true);
        qID qidEZpvd2 = c40081qIq.EZpvd();
        eventParamsList.put("tab_result", (qidEZpvd2 == null || !qidEZpvd2.OLrzqt(c40081qIq.valueOf)) ? "no" : "yes", true);
        eventParamsList.put("from_page", c40081qIq.EZpvd, true);
        eventParamsList.put("current_tab", C40383qTv.EZpvd(c40081qIq.valueOf), true);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C40083qIs c40083qIs, C40081qIq c40081qIq, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "search_text", c40083qIs.OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "from_page", c40081qIq.EZpvd, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C40081qIq c40081qIq, C40083qIs c40083qIs, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "type", c40081qIq.AhwBna, false, 4, null);
        EventParamsList.put$default(eventParamsList, "terminal", "app", false, 4, null);
        EventParamsList.put$default(eventParamsList, "search_text", c40083qIs.OLrzqt(), false, 4, null);
        java.lang.String str = c40083qIs.AEQbTJ().get("to_page_id");
        EventParamsList.put$default(eventParamsList, "from_page", str == null ? "" : str, false, 4, null);
        if (Intrinsics.EZpvd((java.lang.Object) c40081qIq.valueOf, (java.lang.Object) "SWAP")) {
            EventParamsList.put$default(eventParamsList, "current_tab", "perpetual", false, 4, null);
        } else if (Intrinsics.EZpvd((java.lang.Object) c40081qIq.valueOf, (java.lang.Object) "Watchlist")) {
            EventParamsList.put$default(eventParamsList, "current_tab", "Favorites", false, 4, null);
        } else {
            EventParamsList.put$default(eventParamsList, "current_tab", c40081qIq.valueOf, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(C40083qIs c40083qIs, EventParamsList eventParamsList) {
        java.lang.String lowerCase;
        java.lang.String lowerCase2;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("search_text", c40083qIs.OLrzqt(), false);
        java.lang.String str = c40083qIs.AEQbTJ().get("click_item");
        if (str == null) {
            str = "";
        }
        eventParamsList.put("token_pair", str, false);
        java.lang.String str2 = c40083qIs.AEQbTJ().get("biz_type");
        if (str2 != null) {
            lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase == null) {
                lowerCase = "";
            }
        }
        eventParamsList.put("biz_type", lowerCase, true);
        java.lang.String str3 = c40083qIs.AEQbTJ().get("from_token_pair");
        if (str3 == null) {
            str3 = "";
        }
        eventParamsList.put("from_token_pair", str3, false);
        java.lang.String str4 = c40083qIs.AEQbTJ().get("from_biz_type");
        if (str4 != null) {
            lowerCase2 = str4.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            if (lowerCase2 == null) {
                lowerCase2 = "";
            }
        }
        eventParamsList.put("from_biz_type", lowerCase2, true);
        java.lang.String str5 = c40083qIs.AEQbTJ().get("to_page_id");
        if (str5 == null) {
            str5 = "";
        }
        eventParamsList.put("to_page_id", str5, true);
        java.lang.String str6 = c40083qIs.AEQbTJ().get("rank_order");
        eventParamsList.put("rank_order", str6 != null ? str6 : "", false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit valueOf(C40083qIs c40083qIs, C40081qIq c40081qIq, EventParamsList eventParamsList) {
        java.lang.String lowerCase;
        java.lang.String lowerCase2;
        java.lang.String strOLrzqt;
        java.lang.String strOLrzqt2;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("search_text", c40083qIs.OLrzqt(), false);
        java.lang.String str2 = c40083qIs.AEQbTJ().get("click_item");
        if (str2 == null) {
            str2 = "";
        }
        eventParamsList.put("token_pair", str2, false);
        java.lang.String str3 = c40083qIs.AEQbTJ().get("biz_type");
        if (str3 == null || (strOLrzqt2 = C27993kKy.OLrzqt(str3)) == null) {
            lowerCase = "";
        } else {
            lowerCase = strOLrzqt2.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase == null) {
            }
        }
        eventParamsList.put("biz_type", lowerCase, true);
        java.lang.String str4 = c40083qIs.AEQbTJ().get("from_token_pair");
        if (str4 == null) {
            str4 = "";
        }
        eventParamsList.put("from_token_pair", str4, false);
        java.lang.String str5 = c40083qIs.AEQbTJ().get("from_biz_type");
        if (str5 != null) {
            lowerCase2 = str5.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            if (lowerCase2 == null) {
                lowerCase2 = "";
            }
        }
        eventParamsList.put("from_biz_type", lowerCase2, true);
        java.lang.String str6 = c40083qIs.AEQbTJ().get("to_page_id");
        if (str6 == null) {
            str6 = "";
        }
        eventParamsList.put("to_page_id", str6, true);
        java.lang.String str7 = c40083qIs.AEQbTJ().get("rank_order");
        if (str7 == null) {
            str7 = "";
        }
        eventParamsList.put("rank_order", str7, false);
        qID qidEZpvd = c40081qIq.EZpvd();
        java.lang.String strCopydefault = qidEZpvd != null ? qidEZpvd.copydefault() : null;
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        eventParamsList.put("sort_type", strCopydefault, true);
        java.lang.String strAEQbTJ = c40081qIq.AEQbTJ("Favorites");
        if (strAEQbTJ != null && (strOLrzqt = C27993kKy.OLrzqt(strAEQbTJ)) != null) {
            java.lang.String lowerCase3 = strOLrzqt.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            if (lowerCase3 != null) {
                str = lowerCase3;
            }
        }
        eventParamsList.put("current_tab", str, true);
        C43296rmc.EZpvd("SearchSessionViewModel", "current_tab:" + strAEQbTJ);
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(C40083qIs c40083qIs, C40081qIq c40081qIq, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("search_text", c40083qIs.OLrzqt(), false);
        java.lang.String str = c40083qIs.AEQbTJ().get("button_type");
        eventParamsList.put("button_type", str != null ? str : "", true);
        qID qidEZpvd = c40081qIq.EZpvd();
        eventParamsList.put("all_result", (qidEZpvd == null || !qidEZpvd.OLrzqt("0")) ? "no" : "yes", true);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(C40083qIs c40083qIs, C40081qIq c40081qIq, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("search_text", c40083qIs.OLrzqt(), false);
        java.lang.String str = c40083qIs.AEQbTJ().get("button_type");
        if (str == null) {
            str = "";
        }
        eventParamsList.put("button_type", str, true);
        qID qidEZpvd = c40081qIq.EZpvd();
        eventParamsList.put("all_result", (qidEZpvd == null || !qidEZpvd.OLrzqt("ANY")) ? "no" : "yes", true);
        qID qidEZpvd2 = c40081qIq.EZpvd();
        eventParamsList.put("tab_result", (qidEZpvd2 == null || !qidEZpvd2.OLrzqt(c40081qIq.valueOf)) ? "no" : "yes", true);
        java.lang.String str2 = c40081qIq.valueOf;
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "ANY")) {
            str2 = "all";
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SWAP")) {
            str2 = "perpetual";
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "Watchlist")) {
            str2 = "Favorites";
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "pre_market")) {
            str2 = "premarket";
        }
        java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        eventParamsList.put("current_tab", lowerCase, true);
        return Unit.INSTANCE;
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        java.lang.String str2 = this.valueOf;
        if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "ANY")) {
            str = str2;
        }
        if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "SWAP")) {
            str = "perpetual";
        }
        if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "Watchlist")) {
            str = "favorites";
        }
        if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "TRADE_GROUP_TYPE")) {
            str = "users";
        }
        if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "PRODUCT_GROUP_TYPE")) {
            str = "finance";
        }
        if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "STRATEGY_GROUP_TYPE")) {
            str = "bots";
        }
        if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "WEB3_DEX_GROUP_TYPE")) {
            str = "web3";
        }
        if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "campaign")) {
            str = "campaign";
        }
        return Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "announcement") ? "announcement" : str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qIq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void process$default(C40081qIq c40081qIq, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list2 = null;
        }
        c40081qIq.copydefault((java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>) list, (java.util.List<Triple<java.lang.String, java.lang.String, java.lang.Boolean>>) list2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.util.HashMap<java.lang.String, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(@NotNull java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list, java.util.List<Triple<java.lang.String, java.lang.String, java.lang.Boolean>> list2) {
        C40083qIs c40083qIs;
        java.util.ArrayList<Triple<java.lang.String, java.lang.String, java.lang.Boolean>> arrayListEZpvd;
        java.util.HashMap<java.lang.String, java.lang.String> mapAEQbTJ;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            C40083qIs c40083qIs2 = this.KWHzl;
            if (c40083qIs2 != null && (mapAEQbTJ = c40083qIs2.AEQbTJ()) != 0) {
            }
        }
        if (list2 == null || (c40083qIs = this.KWHzl) == null || (arrayListEZpvd = c40083qIs.EZpvd()) == null) {
            return;
        }
        arrayListEZpvd.addAll(list2);
    }
}
