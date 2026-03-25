package o;

import com.okinc.kline.news.data.KlineActiveListData;
import com.okinc.kline.news.data.KlineCampaignData;
import com.okinc.kline.news.data.vo.KlineFlashItem;

/* JADX INFO: renamed from: o.poa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39240poa {
    public static final C39240poa OLrzqt = new C39240poa();

    private C39240poa() {
    }

    public final java.util.ArrayList<KlineFlashItem> AEQbTJ(KlineActiveListData klineActiveListData) {
        if (klineActiveListData == null) {
            return new java.util.ArrayList<>();
        }
        java.util.ArrayList<KlineFlashItem> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList<KlineCampaignData> campaign = klineActiveListData.getCampaign();
        if (campaign != null) {
            for (KlineCampaignData klineCampaignData : campaign) {
                java.lang.String activeId = klineCampaignData.getActiveId();
                java.lang.String str = activeId == null ? "" : activeId;
                java.lang.String seoTitle = klineCampaignData.getSeoTitle();
                java.lang.String str2 = seoTitle == null ? "" : seoTitle;
                java.lang.String seoDescription = klineCampaignData.getSeoDescription();
                java.lang.String str3 = seoDescription == null ? "" : seoDescription;
                java.lang.String urlSlug = klineCampaignData.getUrlSlug();
                KlineFlashItem klineFlashItem = new KlineFlashItem(str, str2, str3, "campaign", urlSlug == null ? "" : urlSlug);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) klineCampaignData.getUrlSlug())) {
                    arrayList.add(klineFlashItem);
                }
            }
        }
        java.util.ArrayList<KlineCampaignData> contentFlash = klineActiveListData.getContentFlash();
        if (contentFlash != null) {
            for (KlineCampaignData klineCampaignData2 : contentFlash) {
                java.lang.String activeId2 = klineCampaignData2.getActiveId();
                java.lang.String str4 = activeId2 == null ? "" : activeId2;
                java.lang.String seoTitle2 = klineCampaignData2.getSeoTitle();
                java.lang.String str5 = seoTitle2 == null ? "" : seoTitle2;
                java.lang.String seoDescription2 = klineCampaignData2.getSeoDescription();
                java.lang.String str6 = seoDescription2 == null ? "" : seoDescription2;
                java.lang.String flashType = klineCampaignData2.getFlashType();
                if (flashType == null) {
                    flashType = "content";
                }
                arrayList.add(new KlineFlashItem(str4, str5, str6, flashType, null, 16, null));
            }
        }
        return arrayList;
    }
}
