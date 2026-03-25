package com.okinc.im.imui;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.just.agentweb.DefaultChromeClient;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C33849nIc;
import o.C33853nIg;
import o.C33856nIj;
import o.C33857nIk;
import o.C33858nIl;
import o.C33859nIm;
import o.C33861nIo;
import o.C33865nIs;
import o.C33866nIt;
import o.C33871nIy;
import o.C33911nKk;
import o.C33915nKo;
import o.C33935nLh;
import o.C33937nLj;
import o.C33941nLn;
import o.C33943nLp;
import o.C33944nLq;
import o.C33947nLt;
import o.C33950nLw;
import o.C33953nLz;
import o.C33956nMb;
import o.C33957nMc;
import o.C33960nMf;
import o.C33961nMg;
import o.C33964nMj;
import o.C33967nMm;
import o.C33968nMn;
import o.C33971nMq;
import o.C33972nMr;
import o.C33976nMv;
import o.C33977nMw;
import o.C33978nMx;
import o.C33979nMy;
import o.C33980nMz;
import o.C33983nNb;
import o.C33986nNe;
import o.C33987nNf;
import o.C33988nNg;
import o.C33990nNi;
import o.C33992nNk;
import o.C33995nNn;
import o.C33996nNo;
import o.C33998nNq;
import o.C33999nNr;
import o.C34003nNv;
import o.C34004nNw;
import o.C34014nOf;
import o.C34016nOh;
import o.C34019nOk;
import o.C34021nOm;
import o.C35399nuc;
import o.nHL;
import o.nHN;
import o.nHR;
import o.nHS;
import o.nHU;
import o.nHW;
import o.nHZ;
import o.nIA;
import o.nIB;
import o.nIE;
import o.nIH;
import o.nIK;
import o.nIL;
import o.nIM;
import o.nIN;
import o.nIR;
import o.nIU;
import o.nIV;
import o.nIW;
import o.nIY;
import o.nJQ;
import o.nJU;
import o.nJX;
import o.nJZ;
import o.nKB;
import o.nKE;
import o.nKO;
import o.nKP;
import o.nKR;
import o.nKT;
import o.nKV;
import o.nLC;
import o.nLE;
import o.nLF;
import o.nLG;
import o.nLH;
import o.nLK;
import o.nLM;
import o.nLP;
import o.nLS;
import o.nLT;
import o.nLU;
import o.nLV;
import o.nLZ;
import o.nME;
import o.nMF;
import o.nMG;
import o.nMI;
import o.nMJ;
import o.nMN;
import o.nMP;
import o.nMQ;
import o.nMU;
import o.nMV;
import o.nMZ;
import o.nNA;
import o.nNF;
import o.nNK;
import o.nNP;
import o.nNT;
import o.nNY;
import o.nNZ;
import o.nOW;
import o.nOY;

/* JADX INFO: loaded from: classes8.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray KWHzl;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(114);
        KWHzl = sparseIntArray;
        sparseIntArray.put(C35399nuc.Dialog.copydefault, 1);
        sparseIntArray.put(C35399nuc.Dialog.KWHzl, 2);
        sparseIntArray.put(C35399nuc.Dialog.AEQbTJ, 3);
        sparseIntArray.put(C35399nuc.Dialog.OLrzqt, 4);
        sparseIntArray.put(C35399nuc.Dialog.gEmmrt, 5);
        sparseIntArray.put(C35399nuc.Dialog.AhwBna, 6);
        sparseIntArray.put(C35399nuc.Dialog.AYXKKw, 7);
        sparseIntArray.put(C35399nuc.Dialog.fetchVPNInfo, 8);
        sparseIntArray.put(C35399nuc.Dialog.values, 9);
        sparseIntArray.put(C35399nuc.Dialog.isConnected, 10);
        sparseIntArray.put(C35399nuc.Dialog.AkhnZx, 11);
        sparseIntArray.put(C35399nuc.Dialog.fIwbmz, 12);
        sparseIntArray.put(C35399nuc.Dialog.ejfBZ, 13);
        sparseIntArray.put(C35399nuc.Dialog.AuCTel, 14);
        sparseIntArray.put(C35399nuc.Dialog.iwGUEr, 15);
        sparseIntArray.put(C35399nuc.Dialog.hDKMBd, 16);
        sparseIntArray.put(C35399nuc.Dialog.getFieldNames, 17);
        sparseIntArray.put(C35399nuc.Dialog.getNewProxyInstance, 18);
        sparseIntArray.put(C35399nuc.Dialog.AuCTelauCTel, 19);
        sparseIntArray.put(C35399nuc.Dialog.wlaJM, 20);
        sparseIntArray.put(C35399nuc.Dialog.AubY, 21);
        sparseIntArray.put(C35399nuc.Dialog.gHZMYf, 22);
        sparseIntArray.put(C35399nuc.Dialog.zuBGHE, 23);
        sparseIntArray.put(C35399nuc.Dialog.AxsJAY, 24);
        sparseIntArray.put(C35399nuc.Dialog.DTwDnp, 25);
        sparseIntArray.put(C35399nuc.Dialog.OcIXYQ, 26);
        sparseIntArray.put(C35399nuc.Dialog.QOLQEE, 27);
        sparseIntArray.put(C35399nuc.Dialog.QKVWgx, 28);
        sparseIntArray.put(C35399nuc.Dialog.ORxRYg, 29);
        sparseIntArray.put(C35399nuc.Dialog.QfsBiF, 30);
        sparseIntArray.put(C35399nuc.Dialog.dHguZz, 31);
        sparseIntArray.put(C35399nuc.Dialog.hBpjJd, 32);
        sparseIntArray.put(C35399nuc.Dialog.OHqIaq, 33);
        sparseIntArray.put(C35399nuc.Dialog.OFhtUX, 34);
        sparseIntArray.put(C35399nuc.Dialog.QwvEab, 35);
        sparseIntArray.put(C35399nuc.Dialog.UlJrfe, 36);
        sparseIntArray.put(C35399nuc.Dialog.Dmq, 37);
        sparseIntArray.put(C35399nuc.Dialog.run, 38);
        sparseIntArray.put(C35399nuc.Dialog.DGOPHZDGOPHZ, 39);
        sparseIntArray.put(C35399nuc.Dialog.heceqZ, 40);
        sparseIntArray.put(C35399nuc.Dialog.hCLrkq, 41);
        sparseIntArray.put(C35399nuc.Dialog.DBxZfM, 42);
        sparseIntArray.put(C35399nuc.Dialog.DsrFlB, 43);
        sparseIntArray.put(C35399nuc.Dialog.RKcVTr, 44);
        sparseIntArray.put(C35399nuc.Dialog.QIZEnU, 45);
        sparseIntArray.put(C35399nuc.Dialog.QDqgQU, 46);
        sparseIntArray.put(C35399nuc.Dialog.ULRxlR, 47);
        sparseIntArray.put(C35399nuc.Dialog.UhxbNG, 48);
        sparseIntArray.put(C35399nuc.Dialog.TarCU, 49);
        sparseIntArray.put(C35399nuc.Dialog.UscePu, 50);
        sparseIntArray.put(C35399nuc.Dialog.aJFbMH, 51);
        sparseIntArray.put(C35399nuc.Dialog.aHXSQp, 52);
        sparseIntArray.put(C35399nuc.Dialog.apNbdB, 53);
        sparseIntArray.put(C35399nuc.Dialog.fXHmeK, 54);
        sparseIntArray.put(C35399nuc.Dialog.fLIjIY, 55);
        sparseIntArray.put(C35399nuc.Dialog.dLBcXg, 56);
        sparseIntArray.put(C35399nuc.Dialog.dvImUD, 57);
        sparseIntArray.put(C35399nuc.Dialog.gSBher, 58);
        sparseIntArray.put(C35399nuc.Dialog.fsSxsn, 59);
        sparseIntArray.put(C35399nuc.Dialog.gUEfcq, 60);
        sparseIntArray.put(C35399nuc.Dialog.hlkKmr, 61);
        sparseIntArray.put(C35399nuc.Dialog.gmHjFq, 62);
        sparseIntArray.put(C35399nuc.Dialog.sVXHln, 63);
        sparseIntArray.put(C35399nuc.Dialog.iPSTqm, 64);
        sparseIntArray.put(C35399nuc.Dialog.sTzBva, 65);
        sparseIntArray.put(C35399nuc.Dialog.hvKCwS, 66);
        sparseIntArray.put(C35399nuc.Dialog.swzYdv, 67);
        sparseIntArray.put(C35399nuc.Dialog.vLaW, 68);
        sparseIntArray.put(C35399nuc.Dialog.zDUObI, 69);
        sparseIntArray.put(C35399nuc.Dialog.tIwhY, 70);
        sparseIntArray.put(C35399nuc.Dialog.zKcAg, 71);
        sparseIntArray.put(C35399nuc.Dialog.zAEkPU, 72);
        sparseIntArray.put(C35399nuc.Dialog.zlvcHA, 73);
        sparseIntArray.put(C35399nuc.Dialog.zqTOFw, 74);
        sparseIntArray.put(C35399nuc.Dialog.zYHWMc, 75);
        sparseIntArray.put(C35399nuc.Dialog.zhUgOk, 76);
        sparseIntArray.put(C35399nuc.Dialog.zOIQXb, 77);
        sparseIntArray.put(C35399nuc.Dialog.DGUQLIOvDItG, 78);
        sparseIntArray.put(C35399nuc.Dialog.getPriority, 79);
        sparseIntArray.put(C35399nuc.Dialog.DGUQLIDGUQLI, 80);
        sparseIntArray.put(C35399nuc.Dialog.getLabel, 81);
        sparseIntArray.put(C35399nuc.Dialog.DTg, 82);
        sparseIntArray.put(C35399nuc.Dialog.DGUQLIdZmdUa, 83);
        sparseIntArray.put(C35399nuc.Dialog.DGUQLIekVPG, 84);
        sparseIntArray.put(C35399nuc.Dialog.zSsVtY, 85);
        sparseIntArray.put(C35399nuc.Dialog.gtCCJH, 86);
        sparseIntArray.put(C35399nuc.Dialog.fBE, 87);
        sparseIntArray.put(C35399nuc.Dialog.DUUtXg, 88);
        sparseIntArray.put(C35399nuc.Dialog.DIIpTV, 89);
        sparseIntArray.put(C35399nuc.Dialog.DGUQLIhJrIAr, 90);
        sparseIntArray.put(C35399nuc.Dialog.DSiOMJ, 91);
        sparseIntArray.put(C35399nuc.Dialog.DrqXHJ, 92);
        sparseIntArray.put(C35399nuc.Dialog.QfJbVf, 93);
        sparseIntArray.put(C35399nuc.Dialog.awiJhF, 94);
        sparseIntArray.put(C35399nuc.Dialog.dzCpvv, 95);
        sparseIntArray.put(C35399nuc.Dialog.frkDMe, 96);
        sparseIntArray.put(C35399nuc.Dialog.YqksP, 97);
        sparseIntArray.put(C35399nuc.Dialog.gtdfxv, 98);
        sparseIntArray.put(C35399nuc.Dialog.zzQwtT, 99);
        sparseIntArray.put(C35399nuc.Dialog.gwwfep, 100);
        sparseIntArray.put(C35399nuc.Dialog.DLGVGj, 101);
        sparseIntArray.put(C35399nuc.Dialog.DKtBnz, 102);
        sparseIntArray.put(C35399nuc.Dialog.iKEqwx, 103);
        sparseIntArray.put(C35399nuc.Dialog.DPHsZd, 104);
        sparseIntArray.put(C35399nuc.Dialog.RAQtXZ, 105);
        sparseIntArray.put(C35399nuc.Dialog.reset, 106);
        sparseIntArray.put(C35399nuc.Dialog.gdmIOq, 107);
        sparseIntArray.put(C35399nuc.Dialog.fXYAwm, 108);
        sparseIntArray.put(C35399nuc.Dialog.DcMfJK, 109);
        sparseIntArray.put(C35399nuc.Dialog.DTeKQX, WalletImportError.ERROR_CODE_AA_CREATE_KEY);
        sparseIntArray.put(C35399nuc.Dialog.RbVjfb, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY);
        sparseIntArray.put(C35399nuc.Dialog.RZNAhV, WalletImportError.ERROR_CODE_AA_EXIST);
        sparseIntArray.put(C35399nuc.Dialog.aCSzUz, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST);
        sparseIntArray.put(C35399nuc.Dialog.YFmri, 114);
    }

    private final ViewDataBinding EZpvd(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 1:
                if ("layout/ac_base_qr_display_0".equals(obj)) {
                    return new nHL(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for ac_base_qr_display is invalid. Received: " + obj);
            case 2:
                if ("layout/ac_chat_v2_0".equals(obj)) {
                    return new nHR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for ac_chat_v2 is invalid. Received: " + obj);
            case 3:
                if ("layout/ac_choose_mentioned_members_0".equals(obj)) {
                    return new nHN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for ac_choose_mentioned_members is invalid. Received: " + obj);
            case 4:
                if ("layout/ac_contact_block_list_0".equals(obj)) {
                    return new nHW(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for ac_contact_block_list is invalid. Received: " + obj);
            case 5:
                if ("layout/ac_contact_by_uid_nickname_0".equals(obj)) {
                    return new nHS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for ac_contact_by_uid_nickname is invalid. Received: " + obj);
            case 6:
                if ("layout/ac_create_edit_notice_0".equals(obj)) {
                    return new nHU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for ac_create_edit_notice is invalid. Received: " + obj);
            case 7:
                if ("layout/ac_create_group_0".equals(obj)) {
                    return new nHZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for ac_create_group is invalid. Received: " + obj);
            case 8:
                if ("layout/ac_join_group_0".equals(obj)) {
                    return new C33853nIg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for ac_join_group is invalid. Received: " + obj);
            case 9:
                if ("layout/ac_join_review_0".equals(obj)) {
                    return new C33849nIc(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for ac_join_review is invalid. Received: " + obj);
            case 10:
                if ("layout/ac_qrcode_display_0".equals(obj)) {
                    return new C33856nIj(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for ac_qrcode_display is invalid. Received: " + obj);
            case 11:
                if ("layout/ac_uid_nickname_search_list_0".equals(obj)) {
                    return new C33857nIk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for ac_uid_nickname_search_list is invalid. Received: " + obj);
            case 12:
                if ("layout/activity_add_contact_0".equals(obj)) {
                    return new C33858nIl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_add_contact is invalid. Received: " + obj);
            case 13:
                if ("layout/activity_auto_download_settings_0".equals(obj)) {
                    return new C33859nIm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_auto_download_settings is invalid. Received: " + obj);
            case 14:
                if ("layout/activity_chat_settings_0".equals(obj)) {
                    return new C33861nIo(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_chat_settings is invalid. Received: " + obj);
            case 15:
                if ("layout/activity_conversationlist_0".equals(obj)) {
                    return new C33866nIt(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_conversationlist is invalid. Received: " + obj);
            case 16:
                if ("layout/activity_group_entry_configuration_0".equals(obj)) {
                    return new C33865nIs(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_group_entry_configuration is invalid. Received: " + obj);
            case 17:
                if ("layout/activity_group_members_0".equals(obj)) {
                    return new nIA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_group_members is invalid. Received: " + obj);
            case 18:
                if ("layout/activity_group_profile_0".equals(obj)) {
                    return new C33871nIy(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_group_profile is invalid. Received: " + obj);
            case 19:
                if ("layout/activity_image_crop_0".equals(obj)) {
                    return new nIB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_image_crop is invalid. Received: " + obj);
            case 20:
                if ("layout/activity_membership_settings_0".equals(obj)) {
                    return new nIE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_membership_settings is invalid. Received: " + obj);
            case 21:
                if ("layout/activity_new_message_0".equals(obj)) {
                    return new nIK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_new_message is invalid. Received: " + obj);
            case 22:
                if ("layout/activity_paid_dashboard_0".equals(obj)) {
                    return new nIH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_paid_dashboard is invalid. Received: " + obj);
            case 23:
                if ("layout/activity_paid_group_transaction_summary_0".equals(obj)) {
                    return new nIM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_paid_group_transaction_summary is invalid. Received: " + obj);
            case 24:
                if ("layout/activity_search_relation_list_0".equals(obj)) {
                    return new nIL(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_search_relation_list is invalid. Received: " + obj);
            case 25:
                if ("layout/activity_select_group_call_member_list_0".equals(obj)) {
                    return new nIN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_select_group_call_member_list is invalid. Received: " + obj);
            case 26:
                if ("layout/activity_select_membership_fee_0".equals(obj)) {
                    return new nIU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_select_membership_fee is invalid. Received: " + obj);
            case 27:
                if ("layout/activity_select_relation_list_0".equals(obj)) {
                    return new nIR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_select_relation_list is invalid. Received: " + obj);
            case 28:
                if ("layout/activity_sticker_creation_container_0".equals(obj)) {
                    return new nIW(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_sticker_creation_container is invalid. Received: " + obj);
            case 29:
                if ("layout/activity_sticker_settings_0".equals(obj)) {
                    return new nIV(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_sticker_settings is invalid. Received: " + obj);
            case 30:
                if ("layout/activity_trending_groups_list_0".equals(obj)) {
                    return new nIY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_trending_groups_list is invalid. Received: " + obj);
            case 31:
                if ("layout/fragment_im_search_0".equals(obj)) {
                    return new nJQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_im_search is invalid. Received: " + obj);
            case 32:
                if ("layout/fragment_join_review_0".equals(obj)) {
                    return new nJX(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_join_review is invalid. Received: " + obj);
            case 33:
                if ("layout/fragment_livestream_chat_0".equals(obj)) {
                    return new nJU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_livestream_chat is invalid. Received: " + obj);
            case 34:
                if ("layout/fragment_message_list_0".equals(obj)) {
                    return new nJZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_message_list is invalid. Received: " + obj);
            case 35:
                if ("layout/fragment_orbit_search_result_0".equals(obj)) {
                    return new C33911nKk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_orbit_search_result is invalid. Received: " + obj);
            case 36:
                if ("layout/fragment_paid_group_transaction_list_0".equals(obj)) {
                    return new C33915nKo(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_paid_group_transaction_list is invalid. Received: " + obj);
            case 37:
                if ("layout/fragment_search_result_0".equals(obj)) {
                    return new nKB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_search_result is invalid. Received: " + obj);
            case 38:
                if ("layout/fragment_sticker_board_0".equals(obj)) {
                    return new nKE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sticker_board is invalid. Received: " + obj);
            case 39:
                if ("layout/im_audio_call_floating_view_0".equals(obj)) {
                    return new nKP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for im_audio_call_floating_view is invalid. Received: " + obj);
            case 40:
                if ("layout/im_error_share_message_content_0".equals(obj)) {
                    return new nKO(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for im_error_share_message_content is invalid. Received: " + obj);
            case 41:
                if ("layout/im_error_share_message_item_0".equals(obj)) {
                    return new nKV(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for im_error_share_message_item is invalid. Received: " + obj);
            case 42:
                if ("layout/im_error_share_message_title_0".equals(obj)) {
                    return new nKR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for im_error_share_message_title is invalid. Received: " + obj);
            case 43:
                if ("layout/im_media_call_notice_view_0".equals(obj)) {
                    return new nKT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for im_media_call_notice_view is invalid. Received: " + obj);
            case 44:
                if ("layout/item_broadcast_system_message_0".equals(obj)) {
                    return new C33935nLh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_broadcast_system_message is invalid. Received: " + obj);
            case 45:
                if ("layout/item_chat_settings_normal_0".equals(obj)) {
                    return new C33937nLj(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_chat_settings_normal is invalid. Received: " + obj);
            case 46:
                if ("layout/item_chat_settings_switch_0".equals(obj)) {
                    return new C33943nLp(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_chat_settings_switch is invalid. Received: " + obj);
            case 47:
                if ("layout/item_common_empty_state_0".equals(obj)) {
                    return new C33941nLn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_common_empty_state is invalid. Received: " + obj);
            case 48:
                if ("layout/item_contact_section_0".equals(obj)) {
                    return new C33944nLq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_contact_section is invalid. Received: " + obj);
            case 49:
                if ("layout/item_conversation_menu_item_0".equals(obj)) {
                    return new C33947nLt(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_conversation_menu_item is invalid. Received: " + obj);
            case 50:
                if ("layout/item_disclaimer_message_0".equals(obj)) {
                    return new C33953nLz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_disclaimer_message is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding AEQbTJ(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 51:
                if ("layout/item_empty_entry_0".equals(obj)) {
                    return new C33950nLw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_empty_entry is invalid. Received: " + obj);
            case 52:
                if ("layout/item_grid_confirm_conversation_avatar_0".equals(obj)) {
                    return new nLE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_grid_confirm_conversation_avatar is invalid. Received: " + obj);
            case 53:
                if ("layout/item_grid_contact_avatar_0".equals(obj)) {
                    return new nLC(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_grid_contact_avatar is invalid. Received: " + obj);
            case 54:
                if ("layout/item_grid_group_member_0".equals(obj)) {
                    return new nLF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_grid_group_member is invalid. Received: " + obj);
            case 55:
                if ("layout/item_grid_group_member_entry_0".equals(obj)) {
                    return new nLG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_grid_group_member_entry is invalid. Received: " + obj);
            case 56:
                if ("layout/item_grid_member_avatar_0".equals(obj)) {
                    return new nLH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_grid_member_avatar is invalid. Received: " + obj);
            case 57:
                if ("layout/item_group_notification_message_0".equals(obj)) {
                    return new nLM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_group_notification_message is invalid. Received: " + obj);
            case 58:
                if ("layout/item_grouped_local_relation_selection_0".equals(obj)) {
                    return new nLK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_grouped_local_relation_selection is invalid. Received: " + obj);
            case 59:
                if ("layout/item_im_action_button_compact_0".equals(obj)) {
                    return new nLT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_action_button_compact is invalid. Received: " + obj);
            case 60:
                if ("layout/item_im_action_button_text_0".equals(obj)) {
                    return new nLP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_action_button_text is invalid. Received: " + obj);
            case 61:
                if ("layout/item_im_audio_call_receive_message_0".equals(obj)) {
                    return new nLS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_audio_call_receive_message is invalid. Received: " + obj);
            case 62:
                if ("layout/item_im_audio_call_send_message_0".equals(obj)) {
                    return new nLV(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_audio_call_send_message is invalid. Received: " + obj);
            case 63:
                if ("layout/item_im_block_record_0".equals(obj)) {
                    return new nLU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_block_record is invalid. Received: " + obj);
            case 64:
                if ("layout/item_im_contract_address_message_receive_0".equals(obj)) {
                    return new C33957nMc(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_contract_address_message_receive is invalid. Received: " + obj);
            case 65:
                if ("layout/item_im_contract_address_message_send_0".equals(obj)) {
                    return new nLZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_contract_address_message_send is invalid. Received: " + obj);
            case 66:
                if ("layout/item_im_divider_group_setting_item_0".equals(obj)) {
                    return new C33956nMb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_divider_group_setting_item is invalid. Received: " + obj);
            case 67:
                if ("layout/item_im_divider_setting_item_0".equals(obj)) {
                    return new C33960nMf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_divider_setting_item is invalid. Received: " + obj);
            case 68:
                if ("layout/item_im_entrance_setting_item_0".equals(obj)) {
                    return new C33961nMg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_entrance_setting_item is invalid. Received: " + obj);
            case 69:
                if ("layout/item_im_entrance_with_summary_setting_item_0".equals(obj)) {
                    return new C33968nMn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_entrance_with_summary_setting_item is invalid. Received: " + obj);
            case 70:
                if ("layout/item_im_file_message_content_0".equals(obj)) {
                    return new C33967nMm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_file_message_content is invalid. Received: " + obj);
            case 71:
                if ("layout/item_im_gif_receive_message_0".equals(obj)) {
                    return new C33964nMj(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_gif_receive_message is invalid. Received: " + obj);
            case 72:
                if ("layout/item_im_gif_send_message_0".equals(obj)) {
                    return new C33972nMr(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_gif_send_message is invalid. Received: " + obj);
            case 73:
                if ("layout/item_im_group_call_receive_message_0".equals(obj)) {
                    return new C33971nMq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_group_call_receive_message is invalid. Received: " + obj);
            case 74:
                if ("layout/item_im_group_call_send_message_0".equals(obj)) {
                    return new C33977nMw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_group_call_send_message is invalid. Received: " + obj);
            case 75:
                if ("layout/item_im_group_invitation_receive_0".equals(obj)) {
                    return new C33978nMx(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_group_invitation_receive is invalid. Received: " + obj);
            case 76:
                if ("layout/item_im_group_invitation_send_0".equals(obj)) {
                    return new C33976nMv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_group_invitation_send is invalid. Received: " + obj);
            case 77:
                if ("layout/item_im_group_subheader_item_0".equals(obj)) {
                    return new C33980nMz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_group_subheader_item is invalid. Received: " + obj);
            case 78:
                if ("layout/item_im_highlight_setting_item_0".equals(obj)) {
                    return new C33979nMy(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_highlight_setting_item is invalid. Received: " + obj);
            case 79:
                if ("layout/item_im_image_receive_message_content_0".equals(obj)) {
                    return new nMG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_image_receive_message_content is invalid. Received: " + obj);
            case 80:
                if ("layout/item_im_image_send_message_content_0".equals(obj)) {
                    return new nMF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_image_send_message_content is invalid. Received: " + obj);
            case 81:
                if ("layout/item_im_media_message_0".equals(obj)) {
                    return new nME(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_media_message is invalid. Received: " + obj);
            case 82:
                if ("layout/item_im_moderator_invitation_receive_message_0".equals(obj)) {
                    return new nMI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_moderator_invitation_receive_message is invalid. Received: " + obj);
            case 83:
                if ("layout/item_im_moderator_invitation_send_message_0".equals(obj)) {
                    return new nMJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_moderator_invitation_send_message is invalid. Received: " + obj);
            case 84:
                if ("layout/item_im_pay_message_0".equals(obj)) {
                    return new nMQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_pay_message is invalid. Received: " + obj);
            case 85:
                if ("layout/item_im_red_packet_message_0".equals(obj)) {
                    return new nMN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_red_packet_message is invalid. Received: " + obj);
            case 86:
                if ("layout/item_im_reference_receive_message_0".equals(obj)) {
                    return new nMP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_reference_receive_message is invalid. Received: " + obj);
            case 87:
                if ("layout/item_im_reference_send_message_0".equals(obj)) {
                    return new nMV(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_reference_send_message is invalid. Received: " + obj);
            case 88:
                if ("layout/item_im_setting_item_0".equals(obj)) {
                    return new nMU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_setting_item is invalid. Received: " + obj);
            case 89:
                if ("layout/item_im_share_message_receive_0".equals(obj)) {
                    return new nMZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_share_message_receive is invalid. Received: " + obj);
            case 90:
                if ("layout/item_im_share_message_send_0".equals(obj)) {
                    return new C33983nNb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_share_message_send is invalid. Received: " + obj);
            case 91:
                if ("layout/item_im_sticker_message_send_0".equals(obj)) {
                    return new C33987nNf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_sticker_message_send is invalid. Received: " + obj);
            case 92:
                if ("layout/item_im_switch_setting_item_0".equals(obj)) {
                    return new C33986nNe(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_switch_setting_item is invalid. Received: " + obj);
            case 93:
                if ("layout/item_im_text_emoji_message_0".equals(obj)) {
                    return new C33988nNg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_text_emoji_message is invalid. Received: " + obj);
            case 94:
                if ("layout/item_im_unknown_receive_message_0".equals(obj)) {
                    return new C33992nNk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_unknown_receive_message is invalid. Received: " + obj);
            case 95:
                if ("layout/item_im_unknown_send_message_0".equals(obj)) {
                    return new C33990nNi(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_unknown_send_message is invalid. Received: " + obj);
            case DefaultChromeClient.FROM_CODE_INTENTION_LOCATION /* 96 */:
                if ("layout/item_im_video_message_0".equals(obj)) {
                    return new C33995nNn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_video_message is invalid. Received: " + obj);
            case 97:
                if ("layout/item_im_voice_receive_message_0".equals(obj)) {
                    return new C33996nNo(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_voice_receive_message is invalid. Received: " + obj);
            case 98:
                if ("layout/item_im_voice_send_message_0".equals(obj)) {
                    return new C33998nNq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_voice_send_message is invalid. Received: " + obj);
            case 99:
                if ("layout/item_local_relation_0".equals(obj)) {
                    return new C34003nNv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_local_relation is invalid. Received: " + obj);
            case 100:
                if ("layout/item_mention_all_0".equals(obj)) {
                    return new C33999nNr(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_mention_all is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding copydefault(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 101:
                if ("layout/item_new_message_button_0".equals(obj)) {
                    return new nNA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_new_message_button is invalid. Received: " + obj);
            case 102:
                if ("layout/item_new_message_divider_0".equals(obj)) {
                    return new C34004nNw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_new_message_divider is invalid. Received: " + obj);
            case 103:
                if ("layout/item_new_message_section_header_0".equals(obj)) {
                    return new nNF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_new_message_section_header is invalid. Received: " + obj);
            case 104:
                if ("layout/item_private_typing_indicator_message_0".equals(obj)) {
                    return new nNK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_private_typing_indicator_message is invalid. Received: " + obj);
            case 105:
                if ("layout/item_relation_friend_0".equals(obj)) {
                    return new nNP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_relation_friend is invalid. Received: " + obj);
            case 106:
                if ("layout/item_section_divider_0".equals(obj)) {
                    return new nNT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_section_divider is invalid. Received: " + obj);
            case 107:
                if ("layout/item_selectable_contact_0".equals(obj)) {
                    return new nNZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_selectable_contact is invalid. Received: " + obj);
            case 108:
                if ("layout/item_selectable_group_member_0".equals(obj)) {
                    return new nNY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_selectable_group_member is invalid. Received: " + obj);
            case 109:
                if ("layout/item_sync_phone_relations_0".equals(obj)) {
                    return new C34014nOf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_sync_phone_relations is invalid. Received: " + obj);
            case WalletImportError.ERROR_CODE_AA_CREATE_KEY /* 110 */:
                if ("layout/item_system_message_0".equals(obj)) {
                    return new C34016nOh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_system_message is invalid. Received: " + obj);
            case WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY /* 111 */:
                if ("layout/item_system_notification_message_0".equals(obj)) {
                    return new C34019nOk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_system_notification_message is invalid. Received: " + obj);
            case WalletImportError.ERROR_CODE_AA_EXIST /* 112 */:
                if ("layout/item_thinking_indicator_message_0".equals(obj)) {
                    return new C34021nOm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_thinking_indicator_message is invalid. Received: " + obj);
            case WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST /* 113 */:
                if ("layout/privacy_item_switch_view_0".equals(obj)) {
                    return new nOW(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for privacy_item_switch_view is invalid. Received: " + obj);
            case 114:
                if ("layout/privacy_normal_item_0".equals(obj)) {
                    return new nOY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for privacy_normal_item is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = KWHzl.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        int i3 = (i2 - 1) / 50;
        if (i3 == 0) {
            return EZpvd(dataBindingComponent, view, i2, tag);
        }
        if (i3 == 1) {
            return AEQbTJ(dataBindingComponent, view, i2, tag);
        }
        if (i3 != 2) {
            return null;
        }
        return copydefault(dataBindingComponent, view, i2, tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || KWHzl.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = StateListAnimator.KWHzl.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return TaskDescription.AEQbTJ.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(13);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.immomo.mls.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.debugbox.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.featurerestriction.DataBinderMapperImpl());
        arrayList.add(new com.okinc.mln_ui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.ok_kyc_core_api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okim.api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.oklive.api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilib.gallery.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static class TaskDescription {
        public static final SparseArray<String> AEQbTJ;

        private TaskDescription() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(22);
            AEQbTJ = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "canSelect");
            sparseArray.put(3, "checked");
            sparseArray.put(4, "content");
            sparseArray.put(5, "dataHolder");
            sparseArray.put(6, "imageTypes");
            sparseArray.put(7, "isAudioCall");
            sparseArray.put(8, "isConnecting");
            sparseArray.put(9, "isPersistentBanner");
            sparseArray.put(10, "item");
            sparseArray.put(11, "itemData");
            sparseArray.put(12, "label");
            sparseArray.put(13, "leftButton");
            sparseArray.put(14, "model");
            sparseArray.put(15, "privacySwitch");
            sparseArray.put(16, "rightButton");
            sparseArray.put(17, "settingData");
            sparseArray.put(18, "showCloseButton");
            sparseArray.put(19, "singelButton");
            sparseArray.put(20, "text");
            sparseArray.put(21, "title");
        }
    }

    public static class StateListAnimator {
        public static final HashMap<String, Integer> KWHzl;

        private StateListAnimator() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(114);
            KWHzl = map;
            map.put("layout/ac_base_qr_display_0", Integer.valueOf(C35399nuc.Dialog.copydefault));
            map.put("layout/ac_chat_v2_0", Integer.valueOf(C35399nuc.Dialog.KWHzl));
            map.put("layout/ac_choose_mentioned_members_0", Integer.valueOf(C35399nuc.Dialog.AEQbTJ));
            map.put("layout/ac_contact_block_list_0", Integer.valueOf(C35399nuc.Dialog.OLrzqt));
            map.put("layout/ac_contact_by_uid_nickname_0", Integer.valueOf(C35399nuc.Dialog.gEmmrt));
            map.put("layout/ac_create_edit_notice_0", Integer.valueOf(C35399nuc.Dialog.AhwBna));
            map.put("layout/ac_create_group_0", Integer.valueOf(C35399nuc.Dialog.AYXKKw));
            map.put("layout/ac_join_group_0", Integer.valueOf(C35399nuc.Dialog.fetchVPNInfo));
            map.put("layout/ac_join_review_0", Integer.valueOf(C35399nuc.Dialog.values));
            map.put("layout/ac_qrcode_display_0", Integer.valueOf(C35399nuc.Dialog.isConnected));
            map.put("layout/ac_uid_nickname_search_list_0", Integer.valueOf(C35399nuc.Dialog.AkhnZx));
            map.put("layout/activity_add_contact_0", Integer.valueOf(C35399nuc.Dialog.fIwbmz));
            map.put("layout/activity_auto_download_settings_0", Integer.valueOf(C35399nuc.Dialog.ejfBZ));
            map.put("layout/activity_chat_settings_0", Integer.valueOf(C35399nuc.Dialog.AuCTel));
            map.put("layout/activity_conversationlist_0", Integer.valueOf(C35399nuc.Dialog.iwGUEr));
            map.put("layout/activity_group_entry_configuration_0", Integer.valueOf(C35399nuc.Dialog.hDKMBd));
            map.put("layout/activity_group_members_0", Integer.valueOf(C35399nuc.Dialog.getFieldNames));
            map.put("layout/activity_group_profile_0", Integer.valueOf(C35399nuc.Dialog.getNewProxyInstance));
            map.put("layout/activity_image_crop_0", Integer.valueOf(C35399nuc.Dialog.AuCTelauCTel));
            map.put("layout/activity_membership_settings_0", Integer.valueOf(C35399nuc.Dialog.wlaJM));
            map.put("layout/activity_new_message_0", Integer.valueOf(C35399nuc.Dialog.AubY));
            map.put("layout/activity_paid_dashboard_0", Integer.valueOf(C35399nuc.Dialog.gHZMYf));
            map.put("layout/activity_paid_group_transaction_summary_0", Integer.valueOf(C35399nuc.Dialog.zuBGHE));
            map.put("layout/activity_search_relation_list_0", Integer.valueOf(C35399nuc.Dialog.AxsJAY));
            map.put("layout/activity_select_group_call_member_list_0", Integer.valueOf(C35399nuc.Dialog.DTwDnp));
            map.put("layout/activity_select_membership_fee_0", Integer.valueOf(C35399nuc.Dialog.OcIXYQ));
            map.put("layout/activity_select_relation_list_0", Integer.valueOf(C35399nuc.Dialog.QOLQEE));
            map.put("layout/activity_sticker_creation_container_0", Integer.valueOf(C35399nuc.Dialog.QKVWgx));
            map.put("layout/activity_sticker_settings_0", Integer.valueOf(C35399nuc.Dialog.ORxRYg));
            map.put("layout/activity_trending_groups_list_0", Integer.valueOf(C35399nuc.Dialog.QfsBiF));
            map.put("layout/fragment_im_search_0", Integer.valueOf(C35399nuc.Dialog.dHguZz));
            map.put("layout/fragment_join_review_0", Integer.valueOf(C35399nuc.Dialog.hBpjJd));
            map.put("layout/fragment_livestream_chat_0", Integer.valueOf(C35399nuc.Dialog.OHqIaq));
            map.put("layout/fragment_message_list_0", Integer.valueOf(C35399nuc.Dialog.OFhtUX));
            map.put("layout/fragment_orbit_search_result_0", Integer.valueOf(C35399nuc.Dialog.QwvEab));
            map.put("layout/fragment_paid_group_transaction_list_0", Integer.valueOf(C35399nuc.Dialog.UlJrfe));
            map.put("layout/fragment_search_result_0", Integer.valueOf(C35399nuc.Dialog.Dmq));
            map.put("layout/fragment_sticker_board_0", Integer.valueOf(C35399nuc.Dialog.run));
            map.put("layout/im_audio_call_floating_view_0", Integer.valueOf(C35399nuc.Dialog.DGOPHZDGOPHZ));
            map.put("layout/im_error_share_message_content_0", Integer.valueOf(C35399nuc.Dialog.heceqZ));
            map.put("layout/im_error_share_message_item_0", Integer.valueOf(C35399nuc.Dialog.hCLrkq));
            map.put("layout/im_error_share_message_title_0", Integer.valueOf(C35399nuc.Dialog.DBxZfM));
            map.put("layout/im_media_call_notice_view_0", Integer.valueOf(C35399nuc.Dialog.DsrFlB));
            map.put("layout/item_broadcast_system_message_0", Integer.valueOf(C35399nuc.Dialog.RKcVTr));
            map.put("layout/item_chat_settings_normal_0", Integer.valueOf(C35399nuc.Dialog.QIZEnU));
            map.put("layout/item_chat_settings_switch_0", Integer.valueOf(C35399nuc.Dialog.QDqgQU));
            map.put("layout/item_common_empty_state_0", Integer.valueOf(C35399nuc.Dialog.ULRxlR));
            map.put("layout/item_contact_section_0", Integer.valueOf(C35399nuc.Dialog.UhxbNG));
            map.put("layout/item_conversation_menu_item_0", Integer.valueOf(C35399nuc.Dialog.TarCU));
            map.put("layout/item_disclaimer_message_0", Integer.valueOf(C35399nuc.Dialog.UscePu));
            map.put("layout/item_empty_entry_0", Integer.valueOf(C35399nuc.Dialog.aJFbMH));
            map.put("layout/item_grid_confirm_conversation_avatar_0", Integer.valueOf(C35399nuc.Dialog.aHXSQp));
            map.put("layout/item_grid_contact_avatar_0", Integer.valueOf(C35399nuc.Dialog.apNbdB));
            map.put("layout/item_grid_group_member_0", Integer.valueOf(C35399nuc.Dialog.fXHmeK));
            map.put("layout/item_grid_group_member_entry_0", Integer.valueOf(C35399nuc.Dialog.fLIjIY));
            map.put("layout/item_grid_member_avatar_0", Integer.valueOf(C35399nuc.Dialog.dLBcXg));
            map.put("layout/item_group_notification_message_0", Integer.valueOf(C35399nuc.Dialog.dvImUD));
            map.put("layout/item_grouped_local_relation_selection_0", Integer.valueOf(C35399nuc.Dialog.gSBher));
            map.put("layout/item_im_action_button_compact_0", Integer.valueOf(C35399nuc.Dialog.fsSxsn));
            map.put("layout/item_im_action_button_text_0", Integer.valueOf(C35399nuc.Dialog.gUEfcq));
            map.put("layout/item_im_audio_call_receive_message_0", Integer.valueOf(C35399nuc.Dialog.hlkKmr));
            map.put("layout/item_im_audio_call_send_message_0", Integer.valueOf(C35399nuc.Dialog.gmHjFq));
            map.put("layout/item_im_block_record_0", Integer.valueOf(C35399nuc.Dialog.sVXHln));
            map.put("layout/item_im_contract_address_message_receive_0", Integer.valueOf(C35399nuc.Dialog.iPSTqm));
            map.put("layout/item_im_contract_address_message_send_0", Integer.valueOf(C35399nuc.Dialog.sTzBva));
            map.put("layout/item_im_divider_group_setting_item_0", Integer.valueOf(C35399nuc.Dialog.hvKCwS));
            map.put("layout/item_im_divider_setting_item_0", Integer.valueOf(C35399nuc.Dialog.swzYdv));
            map.put("layout/item_im_entrance_setting_item_0", Integer.valueOf(C35399nuc.Dialog.vLaW));
            map.put("layout/item_im_entrance_with_summary_setting_item_0", Integer.valueOf(C35399nuc.Dialog.zDUObI));
            map.put("layout/item_im_file_message_content_0", Integer.valueOf(C35399nuc.Dialog.tIwhY));
            map.put("layout/item_im_gif_receive_message_0", Integer.valueOf(C35399nuc.Dialog.zKcAg));
            map.put("layout/item_im_gif_send_message_0", Integer.valueOf(C35399nuc.Dialog.zAEkPU));
            map.put("layout/item_im_group_call_receive_message_0", Integer.valueOf(C35399nuc.Dialog.zlvcHA));
            map.put("layout/item_im_group_call_send_message_0", Integer.valueOf(C35399nuc.Dialog.zqTOFw));
            map.put("layout/item_im_group_invitation_receive_0", Integer.valueOf(C35399nuc.Dialog.zYHWMc));
            map.put("layout/item_im_group_invitation_send_0", Integer.valueOf(C35399nuc.Dialog.zhUgOk));
            map.put("layout/item_im_group_subheader_item_0", Integer.valueOf(C35399nuc.Dialog.zOIQXb));
            map.put("layout/item_im_highlight_setting_item_0", Integer.valueOf(C35399nuc.Dialog.DGUQLIOvDItG));
            map.put("layout/item_im_image_receive_message_content_0", Integer.valueOf(C35399nuc.Dialog.getPriority));
            map.put("layout/item_im_image_send_message_content_0", Integer.valueOf(C35399nuc.Dialog.DGUQLIDGUQLI));
            map.put("layout/item_im_media_message_0", Integer.valueOf(C35399nuc.Dialog.getLabel));
            map.put("layout/item_im_moderator_invitation_receive_message_0", Integer.valueOf(C35399nuc.Dialog.DTg));
            map.put("layout/item_im_moderator_invitation_send_message_0", Integer.valueOf(C35399nuc.Dialog.DGUQLIdZmdUa));
            map.put("layout/item_im_pay_message_0", Integer.valueOf(C35399nuc.Dialog.DGUQLIekVPG));
            map.put("layout/item_im_red_packet_message_0", Integer.valueOf(C35399nuc.Dialog.zSsVtY));
            map.put("layout/item_im_reference_receive_message_0", Integer.valueOf(C35399nuc.Dialog.gtCCJH));
            map.put("layout/item_im_reference_send_message_0", Integer.valueOf(C35399nuc.Dialog.fBE));
            map.put("layout/item_im_setting_item_0", Integer.valueOf(C35399nuc.Dialog.DUUtXg));
            map.put("layout/item_im_share_message_receive_0", Integer.valueOf(C35399nuc.Dialog.DIIpTV));
            map.put("layout/item_im_share_message_send_0", Integer.valueOf(C35399nuc.Dialog.DGUQLIhJrIAr));
            map.put("layout/item_im_sticker_message_send_0", Integer.valueOf(C35399nuc.Dialog.DSiOMJ));
            map.put("layout/item_im_switch_setting_item_0", Integer.valueOf(C35399nuc.Dialog.DrqXHJ));
            map.put("layout/item_im_text_emoji_message_0", Integer.valueOf(C35399nuc.Dialog.QfJbVf));
            map.put("layout/item_im_unknown_receive_message_0", Integer.valueOf(C35399nuc.Dialog.awiJhF));
            map.put("layout/item_im_unknown_send_message_0", Integer.valueOf(C35399nuc.Dialog.dzCpvv));
            map.put("layout/item_im_video_message_0", Integer.valueOf(C35399nuc.Dialog.frkDMe));
            map.put("layout/item_im_voice_receive_message_0", Integer.valueOf(C35399nuc.Dialog.YqksP));
            map.put("layout/item_im_voice_send_message_0", Integer.valueOf(C35399nuc.Dialog.gtdfxv));
            map.put("layout/item_local_relation_0", Integer.valueOf(C35399nuc.Dialog.zzQwtT));
            map.put("layout/item_mention_all_0", Integer.valueOf(C35399nuc.Dialog.gwwfep));
            map.put("layout/item_new_message_button_0", Integer.valueOf(C35399nuc.Dialog.DLGVGj));
            map.put("layout/item_new_message_divider_0", Integer.valueOf(C35399nuc.Dialog.DKtBnz));
            map.put("layout/item_new_message_section_header_0", Integer.valueOf(C35399nuc.Dialog.iKEqwx));
            map.put("layout/item_private_typing_indicator_message_0", Integer.valueOf(C35399nuc.Dialog.DPHsZd));
            map.put("layout/item_relation_friend_0", Integer.valueOf(C35399nuc.Dialog.RAQtXZ));
            map.put("layout/item_section_divider_0", Integer.valueOf(C35399nuc.Dialog.reset));
            map.put("layout/item_selectable_contact_0", Integer.valueOf(C35399nuc.Dialog.gdmIOq));
            map.put("layout/item_selectable_group_member_0", Integer.valueOf(C35399nuc.Dialog.fXYAwm));
            map.put("layout/item_sync_phone_relations_0", Integer.valueOf(C35399nuc.Dialog.DcMfJK));
            map.put("layout/item_system_message_0", Integer.valueOf(C35399nuc.Dialog.DTeKQX));
            map.put("layout/item_system_notification_message_0", Integer.valueOf(C35399nuc.Dialog.RbVjfb));
            map.put("layout/item_thinking_indicator_message_0", Integer.valueOf(C35399nuc.Dialog.RZNAhV));
            map.put("layout/privacy_item_switch_view_0", Integer.valueOf(C35399nuc.Dialog.aCSzUz));
            map.put("layout/privacy_normal_item_0", Integer.valueOf(C35399nuc.Dialog.YFmri));
        }
    }
}
