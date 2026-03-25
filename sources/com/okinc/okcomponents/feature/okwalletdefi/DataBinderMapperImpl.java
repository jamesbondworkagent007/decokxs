package com.okinc.okcomponents.feature.okwalletdefi;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray KWHzl = new SparseIntArray(0);

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        if (KWHzl.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
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
        if (str == null || (num = TaskDescription.AEQbTJ.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return Activity.EZpvd.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(62);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.amplifyframework.ui.liveness.DataBinderMapperImpl());
        arrayList.add(new com.immomo.mls.DataBinderMapperImpl());
        arrayList.add(new com.okinc.auth.impl.DataBinderMapperImpl());
        arrayList.add(new com.okinc.business.appupdate.DataBinderMapperImpl());
        arrayList.add(new com.okinc.business.defi.discover.DataBinderMapperImpl());
        arrayList.add(new com.okinc.business.defi.wallet.DataBinderMapperImpl());
        arrayList.add(new com.okinc.business.defi.wallet.flavor.DataBinderMapperImpl());
        arrayList.add(new com.okinc.business.dex_dynamic.DataBinderMapperImpl());
        arrayList.add(new com.okinc.business.dexui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.business.invest_biz.DataBinderMapperImpl());
        arrayList.add(new com.okinc.business.rewards.DataBinderMapperImpl());
        arrayList.add(new com.okinc.business.web3pay.lib.DataBinderMapperImpl());
        arrayList.add(new com.okinc.buysell.DataBinderMapperImpl());
        arrayList.add(new com.okinc.chart.DataBinderMapperImpl());
        arrayList.add(new com.okinc.components.security.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.ok_app.DataBinderMapperImpl());
        arrayList.add(new com.okinc.cruilib.DataBinderMapperImpl());
        arrayList.add(new com.okinc.debugbox.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.feature.public_beta_api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.feature.public_beta_impl.DataBinderMapperImpl());
        arrayList.add(new com.okinc.featurerestriction.DataBinderMapperImpl());
        arrayList.add(new com.okinc.im.imui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.im.imui.flavor.DataBinderMapperImpl());
        arrayList.add(new com.okinc.kline.DataBinderMapperImpl());
        arrayList.add(new com.okinc.kyc.mlnservice.DataBinderMapperImpl());
        arrayList.add(new com.okinc.lifecycle.impl.DataBinderMapperImpl());
        arrayList.add(new com.okinc.market.DataBinderMapperImpl());
        arrayList.add(new com.okinc.market_resource.DataBinderMapperImpl());
        arrayList.add(new com.okinc.mln_ui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.nft.DataBinderMapperImpl());
        arrayList.add(new com.okinc.ok_kyc_core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.ok_kyc_core_api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okcomponents.feature.oknotificationcenter.impl.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okcomponents.feature.okwalletdefi.standalone.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okex.eop.liveness.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okex.lca.liveness.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okex.lite.navigation.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okim.api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.oklive.api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.oklive.impl.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okrisk.shield.DataBinderMapperImpl());
        arrayList.add(new com.okinc.oksearch.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.online_service.DataBinderMapperImpl());
        arrayList.add(new com.okinc.online_service.wallet.DataBinderMapperImpl());
        arrayList.add(new com.okinc.planet.DataBinderMapperImpl());
        arrayList.add(new com.okinc.preference.DataBinderMapperImpl());
        arrayList.add(new com.okinc.productmatrix.impl.DataBinderMapperImpl());
        arrayList.add(new com.okinc.referral.ui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.share.DataBinderMapperImpl());
        arrayList.add(new com.okinc.tradeuilib.DataBinderMapperImpl());
        arrayList.add(new com.okinc.tradeuilib.impl.DataBinderMapperImpl());
        arrayList.add(new com.okinc.tradingbot.impl.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilib.demo.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilib.gallery.DataBinderMapperImpl());
        arrayList.add(new com.okinc.wallet.hardware.impl.DataBinderMapperImpl());
        arrayList.add(new com.okinc.web3Uilib.DataBinderMapperImpl());
        arrayList.add(new om.okinc.base.quick_feedback_api.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class Activity {
        public static final SparseArray<String> EZpvd;

        private Activity() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(90);
            EZpvd = sparseArray;
            sparseArray.put(1, "FundingRateArbitrageData");
            sparseArray.put(2, "SpreadArbitrageData");
            sparseArray.put(0, "_all");
            sparseArray.put(3, "actionBarOverlay");
            sparseArray.put(4, "addressFormatCheck");
            sparseArray.put(5, "addressStrRes");
            sparseArray.put(6, "addressUtils");
            sparseArray.put(7, "appBarTitle");
            sparseArray.put(8, "balanceViewModel");
            sparseArray.put(9, "bannerDescription");
            sparseArray.put(10, "baseData");
            sparseArray.put(11, "canSelect");
            sparseArray.put(12, "checked");
            sparseArray.put(13, "coinBean");
            sparseArray.put(14, "content");
            sparseArray.put(15, "dataHolder");
            sparseArray.put(16, "description");
            sparseArray.put(17, "descriptionLabel");
            sparseArray.put(18, "detail");
            sparseArray.put(19, "divider");
            sparseArray.put(20, "editable");
            sparseArray.put(21, EopTrackEvent.KEY_ENTRANCE);
            sparseArray.put(22, "expirationTimer");
            sparseArray.put(23, "faqItem");
            sparseArray.put(24, "feedbackSlogan");
            sparseArray.put(25, "fileCountSlogan");
            sparseArray.put(26, "fileExtension");
            sparseArray.put(27, "fileName");
            sparseArray.put(28, "fileSize");
            sparseArray.put(29, "followerCount");
            sparseArray.put(30, "followingCount");
            sparseArray.put(31, "fromCRActivity");
            sparseArray.put(32, "hiddenBean");
            sparseArray.put(33, TtmlNode.TAG_IMAGE);
            sparseArray.put(34, "imageTypes");
            sparseArray.put(35, "isAcceptAgreement");
            sparseArray.put(36, "isAudioCall");
            sparseArray.put(37, "isBannerVisible");
            sparseArray.put(38, "isCard");
            sparseArray.put(39, "isChecked");
            sparseArray.put(40, "isConnecting");
            sparseArray.put(41, "isFeedbackSectionVisible");
            sparseArray.put(42, "isFileCountVisible");
            sparseArray.put(43, "isFoldArrowVisible");
            sparseArray.put(44, "isGifPage");
            sparseArray.put(45, "isGone");
            sparseArray.put(46, "isKlineStructure");
            sparseArray.put(47, "isLast");
            sparseArray.put(48, "isPersistentBanner");
            sparseArray.put(49, "isSubmitButtonEnabled");
            sparseArray.put(50, "isThemPage");
            sparseArray.put(51, "isVisible");
            sparseArray.put(52, "item");
            sparseArray.put(53, "itemBean");
            sparseArray.put(54, "itemData");
            sparseArray.put(55, "keystoneAccountInfo");
            sparseArray.put(56, "label");
            sparseArray.put(57, "learnMoreSlogan");
            sparseArray.put(58, "leftButton");
            sparseArray.put(59, "message");
            sparseArray.put(60, "model");
            sparseArray.put(61, "otpContentViewModel");
            sparseArray.put(62, "privacySwitch");
            sparseArray.put(63, "privateKeyInfo");
            sparseArray.put(64, "reportSlogan");
            sparseArray.put(65, "rightButton");
            sparseArray.put(66, "selectCoinTitle");
            sparseArray.put(67, "selected");
            sparseArray.put(68, "settingData");
            sparseArray.put(69, "showAssets");
            sparseArray.put(70, "showCloseButton");
            sparseArray.put(71, "showHeader");
            sparseArray.put(72, "showNoNetwork");
            sparseArray.put(73, "showTabs");
            sparseArray.put(74, "show_underline");
            sparseArray.put(75, "simulator");
            sparseArray.put(76, "singelButton");
            sparseArray.put(77, "subject");
            sparseArray.put(78, "subjectLabel");
            sparseArray.put(79, "text");
            sparseArray.put(80, "title");
            sparseArray.put(81, "titleleftContent");
            sparseArray.put(82, "totalValueStrRes");
            sparseArray.put(83, "translation");
            sparseArray.put(84, "txPendingData");
            sparseArray.put(85, "uploadFileImage");
            sparseArray.put(86, "uploadFileSlogan");
            sparseArray.put(87, "vModel");
            sparseArray.put(88, "version");
            sparseArray.put(89, "viewModel");
        }
    }

    public static class TaskDescription {
        public static final HashMap<String, Integer> AEQbTJ = new HashMap<>(0);

        private TaskDescription() {
        }
    }
}
