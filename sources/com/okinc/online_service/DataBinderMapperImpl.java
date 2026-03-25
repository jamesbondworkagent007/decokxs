package com.okinc.online_service;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.just.agentweb.DefaultChromeClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C47284tnD;
import o.C47285tnE;
import o.C47286tnF;
import o.C47289tnI;
import o.C47290tnJ;
import o.C47293tnM;
import o.C47294tnN;
import o.C47297tnQ;
import o.C47298tnR;
import o.C47300tnT;
import o.C47303tnW;
import o.C47305tnY;
import o.C47306tnZ;
import o.C47315tni;
import o.C47320tnn;
import o.C47321tno;
import o.C47324tnr;
import o.C47325tns;
import o.C47328tnv;
import o.C47331tny;
import o.C47332tnz;
import o.C47334toA;
import o.C47335toB;
import o.C47340toG;
import o.C47341toH;
import o.C47342toI;
import o.C47344toK;
import o.C47346toM;
import o.C47349toP;
import o.C47352toS;
import o.C47353toT;
import o.C47354toU;
import o.C47357toX;
import o.C47362toc;
import o.C47364toe;
import o.C47365tof;
import o.C47368toi;
import o.C47372tom;
import o.C47373ton;
import o.C47374too;
import o.C47376toq;
import o.C47378tos;
import o.C47380tou;
import o.C47381tov;
import o.C47384toy;
import o.C47390tpD;
import o.C47394tpH;
import o.C47395tpI;
import o.C47397tpK;
import o.C47398tpL;
import o.C47399tpM;
import o.C47404tpR;
import o.C47405tpS;
import o.C47408tpV;
import o.C47411tpY;
import o.C47414tpb;
import o.C47417tpe;
import o.C47418tpf;
import o.C47419tpg;
import o.C47420tph;
import o.C47421tpi;
import o.C47425tpm;
import o.C47426tpn;
import o.C47431tps;
import o.C47432tpt;
import o.C47433tpu;
import o.C47437tpy;
import o.C47441tqB;
import o.C47444tqE;
import o.C47448tqI;
import o.C47451tqL;
import o.C47452tqM;
import o.C47453tqN;
import o.C47455tqP;
import o.C47456tqQ;
import o.C47459tqT;
import o.C47462tqW;
import o.C47469tqd;
import o.C47470tqe;
import o.C47472tqg;
import o.C47474tqi;
import o.C47475tqj;
import o.C47477tql;
import o.C47478tqm;
import o.C47481tqp;
import o.C47482tqq;
import o.C47484tqs;
import o.C47487tqv;
import o.C47489tqx;
import o.C47491tqz;
import o.C47496trF;
import o.C47497trG;
import o.C47516tra;
import o.C47517trb;
import o.C47519trd;
import o.C47521trf;
import o.C47523trh;
import o.C47524tri;
import o.C47527trl;
import o.C47529trn;
import o.C47531trp;
import o.C47537trv;
import o.C47539trx;
import o.C47540trz;

/* JADX INFO: loaded from: classes10.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray OLrzqt;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(103);
        OLrzqt = sparseIntArray;
        sparseIntArray.put(C47315tni.ActionBar.KWHzl, 1);
        sparseIntArray.put(C47315tni.ActionBar.AEQbTJ, 2);
        sparseIntArray.put(C47315tni.ActionBar.EZpvd, 3);
        sparseIntArray.put(C47315tni.ActionBar.OLrzqt, 4);
        sparseIntArray.put(C47315tni.ActionBar.valueOf, 5);
        sparseIntArray.put(C47315tni.ActionBar.AhwBna, 6);
        sparseIntArray.put(C47315tni.ActionBar.djBIcL, 7);
        sparseIntArray.put(C47315tni.ActionBar.AYXKKw, 8);
        sparseIntArray.put(C47315tni.ActionBar.gEmmrt, 9);
        sparseIntArray.put(C47315tni.ActionBar.values, 10);
        sparseIntArray.put(C47315tni.ActionBar.DbNXlk, 11);
        sparseIntArray.put(C47315tni.ActionBar.AkhnZx, 12);
        sparseIntArray.put(C47315tni.ActionBar.fetchVPNInfo, 13);
        sparseIntArray.put(C47315tni.ActionBar.isConnected, 14);
        sparseIntArray.put(C47315tni.ActionBar.fIwbmz, 15);
        sparseIntArray.put(C47315tni.ActionBar.ejfBZ, 16);
        sparseIntArray.put(C47315tni.ActionBar.AuCTel, 17);
        sparseIntArray.put(C47315tni.ActionBar.fARcdN, 18);
        sparseIntArray.put(C47315tni.ActionBar.fJNWhG, 19);
        sparseIntArray.put(C47315tni.ActionBar.hDKMBd, 20);
        sparseIntArray.put(C47315tni.ActionBar.getNewProxyInstance, 21);
        sparseIntArray.put(C47315tni.ActionBar.iwGUEr, 22);
        sparseIntArray.put(C47315tni.ActionBar.getFieldNames, 23);
        sparseIntArray.put(C47315tni.ActionBar.zsXlph, 24);
        sparseIntArray.put(C47315tni.ActionBar.AuCTelauCTel, 25);
        sparseIntArray.put(C47315tni.ActionBar.zLjUOn, 26);
        sparseIntArray.put(C47315tni.ActionBar.AubY, 27);
        sparseIntArray.put(C47315tni.ActionBar.zuBGHE, 28);
        sparseIntArray.put(C47315tni.ActionBar.gHZMYf, 29);
        sparseIntArray.put(C47315tni.ActionBar.AxsJAY, 30);
        sparseIntArray.put(C47315tni.ActionBar.AwvSrB, 31);
        sparseIntArray.put(C47315tni.ActionBar.sSMYrx, 32);
        sparseIntArray.put(C47315tni.ActionBar.ORxRYg, 33);
        sparseIntArray.put(C47315tni.ActionBar.QOLQEE, 34);
        sparseIntArray.put(C47315tni.ActionBar.DTwDnp, 35);
        sparseIntArray.put(C47315tni.ActionBar.OcIXYQ, 36);
        sparseIntArray.put(C47315tni.ActionBar.QKVWgx, 37);
        sparseIntArray.put(C47315tni.ActionBar.QbewEr, 38);
        sparseIntArray.put(C47315tni.ActionBar.QfsBiF, 39);
        sparseIntArray.put(C47315tni.ActionBar.RJOkX, 40);
        sparseIntArray.put(C47315tni.ActionBar.djSkpj, 41);
        sparseIntArray.put(C47315tni.ActionBar.UeEOUB, 42);
        sparseIntArray.put(C47315tni.ActionBar.dNCPSb, 43);
        sparseIntArray.put(C47315tni.ActionBar.RcXXUw, 44);
        sparseIntArray.put(C47315tni.ActionBar.aKErDB, 45);
        sparseIntArray.put(C47315tni.ActionBar.fZBcTu, 46);
        sparseIntArray.put(C47315tni.ActionBar.fFgQHt, 47);
        sparseIntArray.put(C47315tni.ActionBar.finit, 48);
        sparseIntArray.put(C47315tni.ActionBar.dvKsVJ, 49);
        sparseIntArray.put(C47315tni.ActionBar.dxcTrN, 50);
        sparseIntArray.put(C47315tni.ActionBar.gasjUx, 51);
        sparseIntArray.put(C47315tni.ActionBar.fvQaOB, 52);
        sparseIntArray.put(C47315tni.ActionBar.flVtFt, 53);
        sparseIntArray.put(C47315tni.ActionBar.AxsJAYaxsJAY, 54);
        sparseIntArray.put(C47315tni.ActionBar.gkJEwt, 55);
        sparseIntArray.put(C47315tni.ActionBar.iZzfmt, 56);
        sparseIntArray.put(C47315tni.ActionBar.DXXBbs, 57);
        sparseIntArray.put(C47315tni.ActionBar.OqFWZa, 58);
        sparseIntArray.put(C47315tni.ActionBar.ODWQjV, 59);
        sparseIntArray.put(C47315tni.ActionBar.DarRvM, 60);
        sparseIntArray.put(C47315tni.ActionBar.DCJXGO, 61);
        sparseIntArray.put(C47315tni.ActionBar.OuxcSI, 62);
        sparseIntArray.put(C47315tni.ActionBar.zuWLRA, 63);
        sparseIntArray.put(C47315tni.ActionBar.getPostValueLengthLimit, 64);
        sparseIntArray.put(C47315tni.ActionBar.QkdxfA, 65);
        sparseIntArray.put(C47315tni.ActionBar.QHmsKR, 66);
        sparseIntArray.put(C47315tni.ActionBar.RKDWNf, 67);
        sparseIntArray.put(C47315tni.ActionBar.OBJEWx, 68);
        sparseIntArray.put(C47315tni.ActionBar.RdAHlO, 69);
        sparseIntArray.put(C47315tni.ActionBar.hBpjJd, 70);
        sparseIntArray.put(C47315tni.ActionBar.dmfpNf, 71);
        sparseIntArray.put(C47315tni.ActionBar.gwTjWJ, 72);
        sparseIntArray.put(C47315tni.ActionBar.OHqIaq, 73);
        sparseIntArray.put(C47315tni.ActionBar.OFhtUX, 74);
        sparseIntArray.put(C47315tni.ActionBar.hrNTAI, 75);
        sparseIntArray.put(C47315tni.ActionBar.DLWbHP, 76);
        sparseIntArray.put(C47315tni.ActionBar.ODXsMY, 77);
        sparseIntArray.put(C47315tni.ActionBar.QCjLjM, 78);
        sparseIntArray.put(C47315tni.ActionBar.QVsKAR, 79);
        sparseIntArray.put(C47315tni.ActionBar.USBtdM, 80);
        sparseIntArray.put(C47315tni.ActionBar.UlJrfe, 81);
        sparseIntArray.put(C47315tni.ActionBar.aUsmxb, 82);
        sparseIntArray.put(C47315tni.ActionBar.QwvEab, 83);
        sparseIntArray.put(C47315tni.ActionBar.dUDNAs, 84);
        sparseIntArray.put(C47315tni.ActionBar.fdOvFl, 85);
        sparseIntArray.put(C47315tni.ActionBar.fERRXa, 86);
        sparseIntArray.put(C47315tni.ActionBar.fjfviF, 87);
        sparseIntArray.put(C47315tni.ActionBar.ixgjPv, 88);
        sparseIntArray.put(C47315tni.ActionBar.zblBkD, 89);
        sparseIntArray.put(C47315tni.ActionBar.Dmq, 90);
        sparseIntArray.put(C47315tni.ActionBar.DCUTEIdCUTEI, 91);
        sparseIntArray.put(C47315tni.ActionBar.spnCvw, 92);
        sparseIntArray.put(C47315tni.ActionBar.WS, 93);
        sparseIntArray.put(C47315tni.ActionBar.DGOPHZ, 94);
        sparseIntArray.put(C47315tni.ActionBar.call, 95);
        sparseIntArray.put(C47315tni.ActionBar.run, 96);
        sparseIntArray.put(C47315tni.ActionBar.DcqEDu, 97);
        sparseIntArray.put(C47315tni.ActionBar.UrRBLY, 98);
        sparseIntArray.put(C47315tni.ActionBar.fHqPtx, 99);
        sparseIntArray.put(C47315tni.ActionBar.heceqZ, 100);
        sparseIntArray.put(C47315tni.ActionBar.DGUQLI, 101);
        sparseIntArray.put(C47315tni.ActionBar.DGOPHZDGOPHZ, 102);
        sparseIntArray.put(C47315tni.ActionBar.DBxZfM, 103);
    }

    private final ViewDataBinding KWHzl(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 1:
                if ("layout/activity_feedback_and_bug_bounty_0".equals(obj)) {
                    return new C47321tno(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_feedback_and_bug_bounty is invalid. Received: " + obj);
            case 2:
                if ("layout/activity_feedback_bounty_0".equals(obj)) {
                    return new C47320tnn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_feedback_bounty is invalid. Received: " + obj);
            case 3:
                if ("layout/activity_feedback_history_0".equals(obj)) {
                    return new C47324tnr(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_feedback_history is invalid. Received: " + obj);
            case 4:
                if ("layout/activity_feedback_submit_0".equals(obj)) {
                    return new C47325tns(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_feedback_submit is invalid. Received: " + obj);
            case 5:
                if ("layout/activity_oksupport_base_0".equals(obj)) {
                    return new C47331tny(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_oksupport_base is invalid. Received: " + obj);
            case 6:
                if ("layout/activity_oksupport_toolbox_0".equals(obj)) {
                    return new C47332tnz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_oksupport_toolbox is invalid. Received: " + obj);
            case 7:
                if ("layout/activity_rating_submit_already_0".equals(obj)) {
                    return new C47328tnv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_rating_submit_already is invalid. Received: " + obj);
            case 8:
                if ("layout/activity_rating_submit_full_page_0".equals(obj)) {
                    return new C47285tnE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_rating_submit_full_page is invalid. Received: " + obj);
            case 9:
                if ("layout/activity_support_announcements_0".equals(obj)) {
                    return new C47284tnD(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_support_announcements is invalid. Received: " + obj);
            case 10:
                if ("layout/activity_support_center_home_0".equals(obj)) {
                    return new C47289tnI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_support_center_home is invalid. Received: " + obj);
            case 11:
                if ("layout/activity_support_center_search_0".equals(obj)) {
                    return new C47290tnJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_support_center_search is invalid. Received: " + obj);
            case 12:
                if ("layout/activity_support_center_troubleshoot_0".equals(obj)) {
                    return new C47286tnF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_support_center_troubleshoot is invalid. Received: " + obj);
            case 13:
                if ("layout/activity_support_full_self_tools_0".equals(obj)) {
                    return new C47293tnM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_support_full_self_tools is invalid. Received: " + obj);
            case 14:
                if ("layout/activity_support_integrated_solution_0".equals(obj)) {
                    return new C47294tnN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_support_integrated_solution is invalid. Received: " + obj);
            case 15:
                if ("layout/activity_support_tab_viewpager_0".equals(obj)) {
                    return new C47298tnR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_support_tab_viewpager is invalid. Received: " + obj);
            case 16:
                if ("layout/activity_support_troubleshoot_result_0".equals(obj)) {
                    return new C47300tnT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_support_troubleshoot_result is invalid. Received: " + obj);
            case 17:
                if ("layout/activity_upload_log_0".equals(obj)) {
                    return new C47297tnQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_upload_log is invalid. Received: " + obj);
            case 18:
                if ("layout/content_full_article_list_0".equals(obj)) {
                    return new C47303tnW(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for content_full_article_list is invalid. Received: " + obj);
            case 19:
                if ("layout/content_support_center_home_landing_0".equals(obj)) {
                    return new C47305tnY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for content_support_center_home_landing is invalid. Received: " + obj);
            case 20:
                if ("layout/dialog_call_record_permission_0".equals(obj)) {
                    return new C47362toc(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_call_record_permission is invalid. Received: " + obj);
            case 21:
                if ("layout/fragment_auto_dismiss_message_dialog_0".equals(obj)) {
                    return new C47306tnZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_auto_dismiss_message_dialog is invalid. Received: " + obj);
            case 22:
                if ("layout/fragment_dbox_chatbot_0".equals(obj)) {
                    return new C47364toe(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_dbox_chatbot is invalid. Received: " + obj);
            case 23:
                if ("layout/fragment_dbox_commonservice_0".equals(obj)) {
                    return new C47368toi(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_dbox_commonservice is invalid. Received: " + obj);
            case 24:
                if ("layout/fragment_dbox_entrypoints_0".equals(obj)) {
                    return new C47365tof(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_dbox_entrypoints is invalid. Received: " + obj);
            case 25:
                if ("layout/fragment_dbox_rating_0".equals(obj)) {
                    return new C47373ton(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_dbox_rating is invalid. Received: " + obj);
            case 26:
                if ("layout/fragment_dbox_txn_list_0".equals(obj)) {
                    return new C47372tom(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_dbox_txn_list is invalid. Received: " + obj);
            case 27:
                if ("layout/fragment_dbox_uiplayground_0".equals(obj)) {
                    return new C47378tos(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_dbox_uiplayground is invalid. Received: " + obj);
            case 28:
                if ("layout/fragment_feedback_approve_dialog_0".equals(obj)) {
                    return new C47374too(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_feedback_approve_dialog is invalid. Received: " + obj);
            case 29:
                if ("layout/fragment_feedback_history_content_0".equals(obj)) {
                    return new C47376toq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_feedback_history_content is invalid. Received: " + obj);
            case 30:
                if ("layout/fragment_feedback_history_detail_dialog_0".equals(obj)) {
                    return new C47380tou(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_feedback_history_detail_dialog is invalid. Received: " + obj);
            case 31:
                if ("layout/fragment_feedback_reject_dialog_0".equals(obj)) {
                    return new C47381tov(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_feedback_reject_dialog is invalid. Received: " + obj);
            case 32:
                if ("layout/fragment_popup_announcement_dialog_0".equals(obj)) {
                    return new C47335toB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_popup_announcement_dialog is invalid. Received: " + obj);
            case 33:
                if ("layout/fragment_rating_submit_bottom_sheet_0".equals(obj)) {
                    return new C47334toA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_rating_submit_bottom_sheet is invalid. Received: " + obj);
            case 34:
                if ("layout/fragment_rating_submit_content_0".equals(obj)) {
                    return new C47384toy(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_rating_submit_content is invalid. Received: " + obj);
            case 35:
                if ("layout/fragment_rating_submit_footer_0".equals(obj)) {
                    return new C47341toH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_rating_submit_footer is invalid. Received: " + obj);
            case 36:
                if ("layout/fragment_rating_submit_form_0".equals(obj)) {
                    return new C47340toG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_rating_submit_form is invalid. Received: " + obj);
            case 37:
                if ("layout/fragment_rating_submit_success_0".equals(obj)) {
                    return new C47342toI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_rating_submit_success is invalid. Received: " + obj);
            case 38:
                if ("layout/fragment_support_basic_list_0".equals(obj)) {
                    return new C47344toK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_support_basic_list is invalid. Received: " + obj);
            case 39:
                if ("layout/fragment_support_home_recommend_card_0".equals(obj)) {
                    return new C47346toM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_support_home_recommend_card is invalid. Received: " + obj);
            case 40:
                if ("layout/fragment_support_search_combo_results_0".equals(obj)) {
                    return new C47349toP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_support_search_combo_results is invalid. Received: " + obj);
            case 41:
                if ("layout/fragment_support_search_history_0".equals(obj)) {
                    return new C47354toU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_support_search_history is invalid. Received: " + obj);
            case 42:
                if ("layout/fragment_support_search_list_0".equals(obj)) {
                    return new C47352toS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_support_search_list is invalid. Received: " + obj);
            case 43:
                if ("layout/fragment_support_search_result_intent_0".equals(obj)) {
                    return new C47353toT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_support_search_result_intent is invalid. Received: " + obj);
            case 44:
                if ("layout/fragment_support_search_suggestions_0".equals(obj)) {
                    return new C47357toX(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_support_search_suggestions is invalid. Received: " + obj);
            case 45:
                if ("layout/fragment_support_self_tools_card_0".equals(obj)) {
                    return new C47414tpb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_support_self_tools_card is invalid. Received: " + obj);
            case 46:
                if ("layout/fragment_support_tab_view_pager_0".equals(obj)) {
                    return new C47417tpe(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_support_tab_view_pager is invalid. Received: " + obj);
            case 47:
                if ("layout/fragment_support_top_topics_list_base_0".equals(obj)) {
                    return new C47418tpf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_support_top_topics_list_base is invalid. Received: " + obj);
            case 48:
                if ("layout/fragment_upload_log_form_0".equals(obj)) {
                    return new C47419tpg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_upload_log_form is invalid. Received: " + obj);
            case 49:
                if ("layout/fragment_upload_log_rationale_bottom_sheet_0".equals(obj)) {
                    return new C47420tph(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_upload_log_rationale_bottom_sheet is invalid. Received: " + obj);
            case 50:
                if ("layout/fragment_upload_log_result_0".equals(obj)) {
                    return new C47421tpi(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_upload_log_result is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding AEQbTJ(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 51:
                if ("layout/item_campaign_0".equals(obj)) {
                    return new C47426tpn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_campaign is invalid. Received: " + obj);
            case 52:
                if ("layout/item_chatbot_entry_0".equals(obj)) {
                    return new C47425tpm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_chatbot_entry is invalid. Received: " + obj);
            case 53:
                if ("layout/item_feedback_bug_bounty_bold_0".equals(obj)) {
                    return new C47432tpt(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_feedback_bug_bounty_bold is invalid. Received: " + obj);
            case 54:
                if ("layout/item_feedback_bug_bounty_chapter_0".equals(obj)) {
                    return new C47431tps(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_feedback_bug_bounty_chapter is invalid. Received: " + obj);
            case 55:
                if ("layout/item_feedback_bug_bounty_normal_0".equals(obj)) {
                    return new C47433tpu(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_feedback_bug_bounty_normal is invalid. Received: " + obj);
            case 56:
                if ("layout/item_rating_0".equals(obj)) {
                    return new C47437tpy(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_rating is invalid. Received: " + obj);
            case 57:
                if ("layout/item_suggested_action_0".equals(obj)) {
                    return new C47390tpD(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_suggested_action is invalid. Received: " + obj);
            case 58:
                if ("layout/item_support_article_0".equals(obj)) {
                    return new C47397tpK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_support_article is invalid. Received: " + obj);
            case 59:
                if ("layout/item_support_center_search_history_0".equals(obj)) {
                    return new C47395tpI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_support_center_search_history is invalid. Received: " + obj);
            case 60:
                if ("layout/item_support_center_search_result_announcement_0".equals(obj)) {
                    return new C47394tpH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_support_center_search_result_announcement is invalid. Received: " + obj);
            case 61:
                if ("layout/item_support_center_search_result_generic_0".equals(obj)) {
                    return new C47398tpL(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_support_center_search_result_generic is invalid. Received: " + obj);
            case 62:
                if ("layout/item_support_search_section_header_0".equals(obj)) {
                    return new C47399tpM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_support_search_section_header is invalid. Received: " + obj);
            case 63:
                if ("layout/item_support_search_suggestion_intent_0".equals(obj)) {
                    return new C47404tpR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_support_search_suggestion_intent is invalid. Received: " + obj);
            case 64:
                if ("layout/item_support_search_suggestion_recent_0".equals(obj)) {
                    return new C47405tpS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_support_search_suggestion_recent is invalid. Received: " + obj);
            case 65:
                if ("layout/item_upload_log_attached_file_0".equals(obj)) {
                    return new C47408tpV(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_upload_log_attached_file is invalid. Received: " + obj);
            case 66:
                if ("layout/item_upload_log_attachment_0".equals(obj)) {
                    return new C47411tpY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_upload_log_attachment is invalid. Received: " + obj);
            case 67:
                if ("layout/item_upload_log_checkbox_0".equals(obj)) {
                    return new C47469tqd(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_upload_log_checkbox is invalid. Received: " + obj);
            case 68:
                if ("layout/item_upload_log_date_0".equals(obj)) {
                    return new C47470tqe(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_upload_log_date is invalid. Received: " + obj);
            case 69:
                if ("layout/item_upload_log_dropdown_0".equals(obj)) {
                    return new C47474tqi(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_upload_log_dropdown is invalid. Received: " + obj);
            case 70:
                if ("layout/item_upload_log_hidden_0".equals(obj)) {
                    return new C47472tqg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_upload_log_hidden is invalid. Received: " + obj);
            case 71:
                if ("layout/item_upload_log_multiline_0".equals(obj)) {
                    return new C47475tqj(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_upload_log_multiline is invalid. Received: " + obj);
            case 72:
                if ("layout/item_upload_log_submit_0".equals(obj)) {
                    return new C47478tqm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_upload_log_submit is invalid. Received: " + obj);
            case 73:
                if ("layout/layout_feedback_bounty_button_0".equals(obj)) {
                    return new C47477tql(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_feedback_bounty_button is invalid. Received: " + obj);
            case 74:
                if ("layout/layout_feedback_bounty_slogan_0".equals(obj)) {
                    return new C47481tqp(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_feedback_bounty_slogan is invalid. Received: " + obj);
            case 75:
                if ("layout/layout_feedback_upload_file_0".equals(obj)) {
                    return new C47484tqs(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_feedback_upload_file is invalid. Received: " + obj);
            case 76:
                if ("layout/layout_highlight_article_card_0".equals(obj)) {
                    return new C47482tqq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_highlight_article_card is invalid. Received: " + obj);
            case 77:
                if ("layout/layout_highlight_article_card_new_0".equals(obj)) {
                    return new C47489tqx(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_highlight_article_card_new is invalid. Received: " + obj);
            case 78:
                if ("layout/layout_information_bottom_sheet_0".equals(obj)) {
                    return new C47487tqv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_information_bottom_sheet is invalid. Received: " + obj);
            case 79:
                if ("layout/layout_recommendation_card_appeal_bottom_sheet_0".equals(obj)) {
                    return new C47491tqz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_recommendation_card_appeal_bottom_sheet is invalid. Received: " + obj);
            case 80:
                if ("layout/layout_result_txid_not_found_0".equals(obj)) {
                    return new C47441tqB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_result_txid_not_found is invalid. Received: " + obj);
            case 81:
                if ("layout/layout_result_txid_only_0".equals(obj)) {
                    return new C47448tqI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_result_txid_only is invalid. Received: " + obj);
            case 82:
                if ("layout/layout_result_txn_found_0".equals(obj)) {
                    return new C47444tqE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_result_txn_found is invalid. Received: " + obj);
            case 83:
                if ("layout/layout_support_empty_view_0".equals(obj)) {
                    return new C47452tqM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_support_empty_view is invalid. Received: " + obj);
            case 84:
                if ("layout/layout_support_loading_0".equals(obj)) {
                    return new C47451tqL(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_support_loading is invalid. Received: " + obj);
            case 85:
                if ("layout/layout_support_show_full_article_list_item_0".equals(obj)) {
                    return new C47453tqN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_support_show_full_article_list_item is invalid. Received: " + obj);
            case 86:
                if ("layout/layout_support_text_footer_0".equals(obj)) {
                    return new C47456tqQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_support_text_footer is invalid. Received: " + obj);
            case 87:
                if ("layout/layout_support_text_header_0".equals(obj)) {
                    return new C47455tqP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_support_text_header is invalid. Received: " + obj);
            case 88:
                if ("layout/layout_translation_row_0".equals(obj)) {
                    return new C47462tqW(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_translation_row is invalid. Received: " + obj);
            case 89:
                if ("layout/layout_txn_banner_0".equals(obj)) {
                    return new C47459tqT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_txn_banner is invalid. Received: " + obj);
            case 90:
                if ("layout/view_copy_email_0".equals(obj)) {
                    return new C47517trb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_copy_email is invalid. Received: " + obj);
            case 91:
                if ("layout/view_feedback_input_0".equals(obj)) {
                    return new C47516tra(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_feedback_input is invalid. Received: " + obj);
            case 92:
                if ("layout/view_feedback_label_0".equals(obj)) {
                    return new C47519trd(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_feedback_label is invalid. Received: " + obj);
            case 93:
                if ("layout/view_filter_chip_0".equals(obj)) {
                    return new C47521trf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_filter_chip is invalid. Received: " + obj);
            case 94:
                if ("layout/view_form_multiline_input_0".equals(obj)) {
                    return new C47523trh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_form_multiline_input is invalid. Received: " + obj);
            case 95:
                if ("layout/view_meeting_room_button_0".equals(obj)) {
                    return new C47524tri(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_meeting_room_button is invalid. Received: " + obj);
            case DefaultChromeClient.FROM_CODE_INTENTION_LOCATION /* 96 */:
                if ("layout/view_rating_score_bar_0".equals(obj)) {
                    return new C47527trl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_rating_score_bar is invalid. Received: " + obj);
            case 97:
                if ("layout/view_rating_star_bar_0".equals(obj)) {
                    return new C47531trp(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_rating_star_bar is invalid. Received: " + obj);
            case 98:
                if ("layout/view_self_service_0".equals(obj)) {
                    return new C47529trn(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_self_service is invalid. Received: " + obj);
            case 99:
                if ("layout/view_support_center_video_meeting_detail_row_0".equals(obj)) {
                    return new C47537trv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_support_center_video_meeting_detail_row is invalid. Received: " + obj);
            case 100:
                if ("layout/view_video_meeting_room_0".equals(obj)) {
                    return new C47540trz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_video_meeting_room is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding OLrzqt(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 101:
                if ("layout/view_video_primary_view_0".equals(obj)) {
                    return new C47539trx(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_video_primary_view is invalid. Received: " + obj);
            case 102:
                if ("layout/view_video_secondary_view_0".equals(obj)) {
                    return new C47497trG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_video_secondary_view is invalid. Received: " + obj);
            case 103:
                if ("layout/view_waiting_room_button_0".equals(obj)) {
                    return new C47496trF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_waiting_room_button is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = OLrzqt.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        int i3 = (i2 - 1) / 50;
        if (i3 == 0) {
            return KWHzl(dataBindingComponent, view, i2, tag);
        }
        if (i3 == 1) {
            return AEQbTJ(dataBindingComponent, view, i2, tag);
        }
        if (i3 != 2) {
            return null;
        }
        return OLrzqt(dataBindingComponent, view, i2, tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        int i2;
        if (viewArr == null || viewArr.length == 0 || (i2 = OLrzqt.get(i)) <= 0) {
            return null;
        }
        Object tag = viewArr[0].getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 91) {
            if ("layout/view_feedback_input_0".equals(tag)) {
                return new C47516tra(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for view_feedback_input is invalid. Received: " + tag);
        }
        if (i2 != 98) {
            return null;
        }
        if ("layout/view_self_service_0".equals(tag)) {
            return new C47529trn(dataBindingComponent, viewArr);
        }
        throw new IllegalArgumentException("The tag for view_self_service is invalid. Received: " + tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = StateListAnimator.OLrzqt.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return ActionBar.copydefault.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.debugbox.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class ActionBar {
        public static final SparseArray<String> copydefault;

        private ActionBar() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(33);
            copydefault = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "appBarTitle");
            sparseArray.put(3, "bannerDescription");
            sparseArray.put(4, "dataHolder");
            sparseArray.put(5, "description");
            sparseArray.put(6, "descriptionLabel");
            sparseArray.put(7, "feedbackSlogan");
            sparseArray.put(8, "fileCountSlogan");
            sparseArray.put(9, "fileExtension");
            sparseArray.put(10, "fileName");
            sparseArray.put(11, "fileSize");
            sparseArray.put(12, TtmlNode.TAG_IMAGE);
            sparseArray.put(13, "isAcceptAgreement");
            sparseArray.put(14, "isBannerVisible");
            sparseArray.put(15, "isFeedbackSectionVisible");
            sparseArray.put(16, "isFileCountVisible");
            sparseArray.put(17, "isSubmitButtonEnabled");
            sparseArray.put(18, "item");
            sparseArray.put(19, "itemData");
            sparseArray.put(20, "learnMoreSlogan");
            sparseArray.put(21, "leftButton");
            sparseArray.put(22, "reportSlogan");
            sparseArray.put(23, "rightButton");
            sparseArray.put(24, "showCloseButton");
            sparseArray.put(25, "singelButton");
            sparseArray.put(26, "subject");
            sparseArray.put(27, "subjectLabel");
            sparseArray.put(28, "text");
            sparseArray.put(29, "title");
            sparseArray.put(30, "translation");
            sparseArray.put(31, "uploadFileImage");
            sparseArray.put(32, "uploadFileSlogan");
        }
    }

    public static class StateListAnimator {
        public static final HashMap<String, Integer> OLrzqt;

        private StateListAnimator() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(103);
            OLrzqt = map;
            map.put("layout/activity_feedback_and_bug_bounty_0", Integer.valueOf(C47315tni.ActionBar.KWHzl));
            map.put("layout/activity_feedback_bounty_0", Integer.valueOf(C47315tni.ActionBar.AEQbTJ));
            map.put("layout/activity_feedback_history_0", Integer.valueOf(C47315tni.ActionBar.EZpvd));
            map.put("layout/activity_feedback_submit_0", Integer.valueOf(C47315tni.ActionBar.OLrzqt));
            map.put("layout/activity_oksupport_base_0", Integer.valueOf(C47315tni.ActionBar.valueOf));
            map.put("layout/activity_oksupport_toolbox_0", Integer.valueOf(C47315tni.ActionBar.AhwBna));
            map.put("layout/activity_rating_submit_already_0", Integer.valueOf(C47315tni.ActionBar.djBIcL));
            map.put("layout/activity_rating_submit_full_page_0", Integer.valueOf(C47315tni.ActionBar.AYXKKw));
            map.put("layout/activity_support_announcements_0", Integer.valueOf(C47315tni.ActionBar.gEmmrt));
            map.put("layout/activity_support_center_home_0", Integer.valueOf(C47315tni.ActionBar.values));
            map.put("layout/activity_support_center_search_0", Integer.valueOf(C47315tni.ActionBar.DbNXlk));
            map.put("layout/activity_support_center_troubleshoot_0", Integer.valueOf(C47315tni.ActionBar.AkhnZx));
            map.put("layout/activity_support_full_self_tools_0", Integer.valueOf(C47315tni.ActionBar.fetchVPNInfo));
            map.put("layout/activity_support_integrated_solution_0", Integer.valueOf(C47315tni.ActionBar.isConnected));
            map.put("layout/activity_support_tab_viewpager_0", Integer.valueOf(C47315tni.ActionBar.fIwbmz));
            map.put("layout/activity_support_troubleshoot_result_0", Integer.valueOf(C47315tni.ActionBar.ejfBZ));
            map.put("layout/activity_upload_log_0", Integer.valueOf(C47315tni.ActionBar.AuCTel));
            map.put("layout/content_full_article_list_0", Integer.valueOf(C47315tni.ActionBar.fARcdN));
            map.put("layout/content_support_center_home_landing_0", Integer.valueOf(C47315tni.ActionBar.fJNWhG));
            map.put("layout/dialog_call_record_permission_0", Integer.valueOf(C47315tni.ActionBar.hDKMBd));
            map.put("layout/fragment_auto_dismiss_message_dialog_0", Integer.valueOf(C47315tni.ActionBar.getNewProxyInstance));
            map.put("layout/fragment_dbox_chatbot_0", Integer.valueOf(C47315tni.ActionBar.iwGUEr));
            map.put("layout/fragment_dbox_commonservice_0", Integer.valueOf(C47315tni.ActionBar.getFieldNames));
            map.put("layout/fragment_dbox_entrypoints_0", Integer.valueOf(C47315tni.ActionBar.zsXlph));
            map.put("layout/fragment_dbox_rating_0", Integer.valueOf(C47315tni.ActionBar.AuCTelauCTel));
            map.put("layout/fragment_dbox_txn_list_0", Integer.valueOf(C47315tni.ActionBar.zLjUOn));
            map.put("layout/fragment_dbox_uiplayground_0", Integer.valueOf(C47315tni.ActionBar.AubY));
            map.put("layout/fragment_feedback_approve_dialog_0", Integer.valueOf(C47315tni.ActionBar.zuBGHE));
            map.put("layout/fragment_feedback_history_content_0", Integer.valueOf(C47315tni.ActionBar.gHZMYf));
            map.put("layout/fragment_feedback_history_detail_dialog_0", Integer.valueOf(C47315tni.ActionBar.AxsJAY));
            map.put("layout/fragment_feedback_reject_dialog_0", Integer.valueOf(C47315tni.ActionBar.AwvSrB));
            map.put("layout/fragment_popup_announcement_dialog_0", Integer.valueOf(C47315tni.ActionBar.sSMYrx));
            map.put("layout/fragment_rating_submit_bottom_sheet_0", Integer.valueOf(C47315tni.ActionBar.ORxRYg));
            map.put("layout/fragment_rating_submit_content_0", Integer.valueOf(C47315tni.ActionBar.QOLQEE));
            map.put("layout/fragment_rating_submit_footer_0", Integer.valueOf(C47315tni.ActionBar.DTwDnp));
            map.put("layout/fragment_rating_submit_form_0", Integer.valueOf(C47315tni.ActionBar.OcIXYQ));
            map.put("layout/fragment_rating_submit_success_0", Integer.valueOf(C47315tni.ActionBar.QKVWgx));
            map.put("layout/fragment_support_basic_list_0", Integer.valueOf(C47315tni.ActionBar.QbewEr));
            map.put("layout/fragment_support_home_recommend_card_0", Integer.valueOf(C47315tni.ActionBar.QfsBiF));
            map.put("layout/fragment_support_search_combo_results_0", Integer.valueOf(C47315tni.ActionBar.RJOkX));
            map.put("layout/fragment_support_search_history_0", Integer.valueOf(C47315tni.ActionBar.djSkpj));
            map.put("layout/fragment_support_search_list_0", Integer.valueOf(C47315tni.ActionBar.UeEOUB));
            map.put("layout/fragment_support_search_result_intent_0", Integer.valueOf(C47315tni.ActionBar.dNCPSb));
            map.put("layout/fragment_support_search_suggestions_0", Integer.valueOf(C47315tni.ActionBar.RcXXUw));
            map.put("layout/fragment_support_self_tools_card_0", Integer.valueOf(C47315tni.ActionBar.aKErDB));
            map.put("layout/fragment_support_tab_view_pager_0", Integer.valueOf(C47315tni.ActionBar.fZBcTu));
            map.put("layout/fragment_support_top_topics_list_base_0", Integer.valueOf(C47315tni.ActionBar.fFgQHt));
            map.put("layout/fragment_upload_log_form_0", Integer.valueOf(C47315tni.ActionBar.finit));
            map.put("layout/fragment_upload_log_rationale_bottom_sheet_0", Integer.valueOf(C47315tni.ActionBar.dvKsVJ));
            map.put("layout/fragment_upload_log_result_0", Integer.valueOf(C47315tni.ActionBar.dxcTrN));
            map.put("layout/item_campaign_0", Integer.valueOf(C47315tni.ActionBar.gasjUx));
            map.put("layout/item_chatbot_entry_0", Integer.valueOf(C47315tni.ActionBar.fvQaOB));
            map.put("layout/item_feedback_bug_bounty_bold_0", Integer.valueOf(C47315tni.ActionBar.flVtFt));
            map.put("layout/item_feedback_bug_bounty_chapter_0", Integer.valueOf(C47315tni.ActionBar.AxsJAYaxsJAY));
            map.put("layout/item_feedback_bug_bounty_normal_0", Integer.valueOf(C47315tni.ActionBar.gkJEwt));
            map.put("layout/item_rating_0", Integer.valueOf(C47315tni.ActionBar.iZzfmt));
            map.put("layout/item_suggested_action_0", Integer.valueOf(C47315tni.ActionBar.DXXBbs));
            map.put("layout/item_support_article_0", Integer.valueOf(C47315tni.ActionBar.OqFWZa));
            map.put("layout/item_support_center_search_history_0", Integer.valueOf(C47315tni.ActionBar.ODWQjV));
            map.put("layout/item_support_center_search_result_announcement_0", Integer.valueOf(C47315tni.ActionBar.DarRvM));
            map.put("layout/item_support_center_search_result_generic_0", Integer.valueOf(C47315tni.ActionBar.DCJXGO));
            map.put("layout/item_support_search_section_header_0", Integer.valueOf(C47315tni.ActionBar.OuxcSI));
            map.put("layout/item_support_search_suggestion_intent_0", Integer.valueOf(C47315tni.ActionBar.zuWLRA));
            map.put("layout/item_support_search_suggestion_recent_0", Integer.valueOf(C47315tni.ActionBar.getPostValueLengthLimit));
            map.put("layout/item_upload_log_attached_file_0", Integer.valueOf(C47315tni.ActionBar.QkdxfA));
            map.put("layout/item_upload_log_attachment_0", Integer.valueOf(C47315tni.ActionBar.QHmsKR));
            map.put("layout/item_upload_log_checkbox_0", Integer.valueOf(C47315tni.ActionBar.RKDWNf));
            map.put("layout/item_upload_log_date_0", Integer.valueOf(C47315tni.ActionBar.OBJEWx));
            map.put("layout/item_upload_log_dropdown_0", Integer.valueOf(C47315tni.ActionBar.RdAHlO));
            map.put("layout/item_upload_log_hidden_0", Integer.valueOf(C47315tni.ActionBar.hBpjJd));
            map.put("layout/item_upload_log_multiline_0", Integer.valueOf(C47315tni.ActionBar.dmfpNf));
            map.put("layout/item_upload_log_submit_0", Integer.valueOf(C47315tni.ActionBar.gwTjWJ));
            map.put("layout/layout_feedback_bounty_button_0", Integer.valueOf(C47315tni.ActionBar.OHqIaq));
            map.put("layout/layout_feedback_bounty_slogan_0", Integer.valueOf(C47315tni.ActionBar.OFhtUX));
            map.put("layout/layout_feedback_upload_file_0", Integer.valueOf(C47315tni.ActionBar.hrNTAI));
            map.put("layout/layout_highlight_article_card_0", Integer.valueOf(C47315tni.ActionBar.DLWbHP));
            map.put("layout/layout_highlight_article_card_new_0", Integer.valueOf(C47315tni.ActionBar.ODXsMY));
            map.put("layout/layout_information_bottom_sheet_0", Integer.valueOf(C47315tni.ActionBar.QCjLjM));
            map.put("layout/layout_recommendation_card_appeal_bottom_sheet_0", Integer.valueOf(C47315tni.ActionBar.QVsKAR));
            map.put("layout/layout_result_txid_not_found_0", Integer.valueOf(C47315tni.ActionBar.USBtdM));
            map.put("layout/layout_result_txid_only_0", Integer.valueOf(C47315tni.ActionBar.UlJrfe));
            map.put("layout/layout_result_txn_found_0", Integer.valueOf(C47315tni.ActionBar.aUsmxb));
            map.put("layout/layout_support_empty_view_0", Integer.valueOf(C47315tni.ActionBar.QwvEab));
            map.put("layout/layout_support_loading_0", Integer.valueOf(C47315tni.ActionBar.dUDNAs));
            map.put("layout/layout_support_show_full_article_list_item_0", Integer.valueOf(C47315tni.ActionBar.fdOvFl));
            map.put("layout/layout_support_text_footer_0", Integer.valueOf(C47315tni.ActionBar.fERRXa));
            map.put("layout/layout_support_text_header_0", Integer.valueOf(C47315tni.ActionBar.fjfviF));
            map.put("layout/layout_translation_row_0", Integer.valueOf(C47315tni.ActionBar.ixgjPv));
            map.put("layout/layout_txn_banner_0", Integer.valueOf(C47315tni.ActionBar.zblBkD));
            map.put("layout/view_copy_email_0", Integer.valueOf(C47315tni.ActionBar.Dmq));
            map.put("layout/view_feedback_input_0", Integer.valueOf(C47315tni.ActionBar.DCUTEIdCUTEI));
            map.put("layout/view_feedback_label_0", Integer.valueOf(C47315tni.ActionBar.spnCvw));
            map.put("layout/view_filter_chip_0", Integer.valueOf(C47315tni.ActionBar.WS));
            map.put("layout/view_form_multiline_input_0", Integer.valueOf(C47315tni.ActionBar.DGOPHZ));
            map.put("layout/view_meeting_room_button_0", Integer.valueOf(C47315tni.ActionBar.call));
            map.put("layout/view_rating_score_bar_0", Integer.valueOf(C47315tni.ActionBar.run));
            map.put("layout/view_rating_star_bar_0", Integer.valueOf(C47315tni.ActionBar.DcqEDu));
            map.put("layout/view_self_service_0", Integer.valueOf(C47315tni.ActionBar.UrRBLY));
            map.put("layout/view_support_center_video_meeting_detail_row_0", Integer.valueOf(C47315tni.ActionBar.fHqPtx));
            map.put("layout/view_video_meeting_room_0", Integer.valueOf(C47315tni.ActionBar.heceqZ));
            map.put("layout/view_video_primary_view_0", Integer.valueOf(C47315tni.ActionBar.DGUQLI));
            map.put("layout/view_video_secondary_view_0", Integer.valueOf(C47315tni.ActionBar.DGOPHZDGOPHZ));
            map.put("layout/view_waiting_room_button_0", Integer.valueOf(C47315tni.ActionBar.DBxZfM));
        }
    }
}
