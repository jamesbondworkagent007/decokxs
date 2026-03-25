package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.AssetDetail;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AssetDetailData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialogData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoices;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesIcon;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesValueData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaLink;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaLinkData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaListItem;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaListItemData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCheckbox;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCheckboxAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FreeText;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag;
import com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextContent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextContentData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PopupTextContent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PopupTextContentData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Reminder;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ReminderData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitleData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.RichTextContent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.RichTextContentData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SelectPopUpChoice;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SelectPopUpChoiceData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.TextStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.TextStyleData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.WalletCardChoice;
import com.okinc.ok_kyc_core.data.remote.networkmodel.WalletCardChoiceData;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rvj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43780rvj {
    public static final Reminder copydefault(@NotNull ReminderData reminderData) {
        Intrinsics.checkNotNullParameter(reminderData, "");
        CTAButton cta = reminderData.getCta();
        return new Reminder(cta != null ? cta.toAppModel() : null, reminderData.getTitle(), reminderData.getContent(), reminderData.getStatus(), reminderData.getBottomMargin());
    }

    public static final RichSubtitle EZpvd(@NotNull RichSubtitleData richSubtitleData) {
        Intrinsics.checkNotNullParameter(richSubtitleData, "");
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap<java.lang.String, CtaLinkData> ctaLink = richSubtitleData.getCtaLink();
        if (ctaLink != null) {
            for (Map.Entry<java.lang.String, CtaLinkData> entry : ctaLink.entrySet()) {
                map.put(entry.getKey(), EZpvd(entry.getValue()));
            }
        }
        return new RichSubtitle(richSubtitleData.getText(), map);
    }

    public static final CtaLink EZpvd(@NotNull CtaLinkData ctaLinkData) {
        Intrinsics.checkNotNullParameter(ctaLinkData, "");
        CTAButton cta = ctaLinkData.getCta();
        return new CtaLink(cta != null ? cta.toAppModel() : null, ctaLinkData.getStyle());
    }

    public static final WalletCardChoice KWHzl(@NotNull WalletCardChoiceData walletCardChoiceData) {
        Intrinsics.checkNotNullParameter(walletCardChoiceData, "");
        java.lang.String value = walletCardChoiceData.getValue();
        java.lang.String time = walletCardChoiceData.getTime();
        java.lang.String balance = walletCardChoiceData.getBalance();
        java.lang.String faqUrl = walletCardChoiceData.getFaqUrl();
        CTAButton cta = walletCardChoiceData.getCta();
        return new WalletCardChoice(value, time, balance, faqUrl, cta != null ? cta.toAppModel() : null);
    }

    public static final DialogCheckboxAppModel copydefault(@NotNull DialogCheckbox dialogCheckbox) {
        Intrinsics.checkNotNullParameter(dialogCheckbox, "");
        return new DialogCheckboxAppModel(dialogCheckbox.getText(), dialogCheckbox.getFontSize(), dialogCheckbox.getTextColor(), dialogCheckbox.getFontWeight(), dialogCheckbox.getLineHeight());
    }

    public static final ButtonDialog copydefault(@NotNull ButtonDialogData buttonDialogData) {
        java.util.List arrayList;
        Intrinsics.checkNotNullParameter(buttonDialogData, "");
        DialogStyle position = buttonDialogData.getPosition();
        if (position == null) {
            position = DialogStyle.CENTER;
        }
        DialogStyle dialogStyle = position;
        java.lang.String pageId = buttonDialogData.getPageId();
        java.lang.String entryPageId = buttonDialogData.getEntryPageId();
        java.lang.String title = buttonDialogData.getTitle();
        java.lang.String subtitle = buttonDialogData.getSubtitle();
        java.lang.Boolean boolIsFullPage = buttonDialogData.isFullPage();
        java.lang.Boolean showOnPageLoad = buttonDialogData.getShowOnPageLoad();
        CtaPopUpData cta = buttonDialogData.getCta();
        CtaPopUp ctaPopUpKWHzl = cta != null ? KWHzl(cta) : null;
        if (buttonDialogData.getItems() == null || (arrayList = C43747rvC.copydefault(buttonDialogData.getItems())) == null) {
            arrayList = new java.util.ArrayList();
        }
        java.util.List list = arrayList;
        java.lang.Boolean allowClose = buttonDialogData.getAllowClose();
        FreeText dialogBottomText = buttonDialogData.getDialogBottomText();
        FreeTextAppModel appModel = dialogBottomText != null ? dialogBottomText.toAppModel() : null;
        java.lang.Boolean shouldShowCloseButton = buttonDialogData.getShouldShowCloseButton();
        DialogCheckbox dialogCheckbox = buttonDialogData.getDialogCheckbox();
        return new ButtonDialog(dialogStyle, pageId, entryPageId, title, subtitle, null, boolIsFullPage, showOnPageLoad, ctaPopUpKWHzl, list, allowClose, appModel, shouldShowCloseButton, dialogCheckbox != null ? copydefault(dialogCheckbox) : null, buttonDialogData.isDismissable());
    }

    public static final RichTextContent AEQbTJ(@NotNull RichTextContentData richTextContentData) {
        Intrinsics.checkNotNullParameter(richTextContentData, "");
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap<java.lang.String, LinkTextContentData> link = richTextContentData.getLink();
        if (link != null) {
            for (Map.Entry<java.lang.String, LinkTextContentData> entry : link.entrySet()) {
                map.put(entry.getKey(), copydefault(entry.getValue()));
            }
        }
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.HashMap<java.lang.String, PopupTextContentData> popup = richTextContentData.getPopup();
        if (popup != null) {
            for (Map.Entry<java.lang.String, PopupTextContentData> entry2 : popup.entrySet()) {
                map2.put(entry2.getKey(), OLrzqt(entry2.getValue()));
            }
        }
        return new RichTextContent(richTextContentData.getText(), richTextContentData.getBold(), map, map2);
    }

    public static final LinkTextContent copydefault(@NotNull LinkTextContentData linkTextContentData) {
        Intrinsics.checkNotNullParameter(linkTextContentData, "");
        java.lang.String text = linkTextContentData.getText();
        java.lang.String url = linkTextContentData.getUrl();
        java.lang.String relativeUriType = linkTextContentData.getRelativeUriType();
        java.lang.Boolean underline = linkTextContentData.getUnderline();
        java.lang.String deeplink = linkTextContentData.getDeeplink();
        LinkTextStyle style = linkTextContentData.getStyle();
        CTAButton cta = linkTextContentData.getCta();
        return new LinkTextContent(text, url, relativeUriType, underline, deeplink, style, cta != null ? cta.toAppModel() : null);
    }

    public static final AssetDetail KWHzl(@NotNull AssetDetailData assetDetailData) {
        Intrinsics.checkNotNullParameter(assetDetailData, "");
        java.lang.String id = assetDetailData.getId();
        java.lang.String status = assetDetailData.getStatus();
        java.lang.String title = assetDetailData.getTitle();
        java.lang.String assetValue = assetDetailData.getAssetValue();
        CTAButton editCta = assetDetailData.getEditCta();
        return new AssetDetail(id, status, title, assetValue, editCta != null ? editCta.toAppModel() : null, assetDetailData.getContentList());
    }

    public static final CardChoices KWHzl(@NotNull CardChoicesData cardChoicesData) {
        Intrinsics.checkNotNullParameter(cardChoicesData, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<CardChoicesValueData> values = cardChoicesData.getValues();
        if (values != null) {
            java.util.Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                arrayList.add(EZpvd((CardChoicesValueData) it.next()));
            }
        }
        return new CardChoices(cardChoicesData.getMaxNumOfOptions(), cardChoicesData.getSearch(), arrayList);
    }

    public static final CardChoicesValue EZpvd(@NotNull CardChoicesValueData cardChoicesValueData) {
        Intrinsics.checkNotNullParameter(cardChoicesValueData, "");
        java.util.List<java.lang.String> searchKey = cardChoicesValueData.getSearchKey();
        CardChoicesIcon icon = cardChoicesValueData.getIcon();
        java.lang.Boolean selected = cardChoicesValueData.getSelected();
        java.lang.String value = cardChoicesValueData.getValue();
        java.lang.String text = cardChoicesValueData.getText();
        java.lang.String tip = cardChoicesValueData.getTip();
        java.util.List<UIComponentAppModel> listCopydefault = cardChoicesValueData.getContentList() != null ? C43747rvC.copydefault(cardChoicesValueData.getContentList()) : null;
        HelperLabelTag tag = cardChoicesValueData.getTag();
        CTAButton cta = cardChoicesValueData.getCta();
        return new CardChoicesValue(searchKey, icon, selected, value, text, tip, listCopydefault, tag, cta != null ? cta.toAppModel() : null);
    }

    public static final PopupTextContent OLrzqt(@NotNull PopupTextContentData popupTextContentData) {
        Intrinsics.checkNotNullParameter(popupTextContentData, "");
        java.lang.String text = popupTextContentData.getText();
        LinkTextStyle style = popupTextContentData.getStyle();
        java.lang.Boolean underline = popupTextContentData.getUnderline();
        ButtonDialogData dialog = popupTextContentData.getDialog();
        return new PopupTextContent(text, style, underline, dialog != null ? copydefault(dialog) : null);
    }

    public static final CtaListItem copydefault(@NotNull CtaListItemData ctaListItemData) {
        Intrinsics.checkNotNullParameter(ctaListItemData, "");
        java.lang.String title = ctaListItemData.getTitle();
        java.lang.String content = ctaListItemData.getContent();
        java.lang.String contentColor = ctaListItemData.getContentColor();
        CTAButton cta = ctaListItemData.getCta();
        return new CtaListItem(title, content, contentColor, cta != null ? cta.toAppModel() : null, ctaListItemData.getEventTrackingName(), ctaListItemData.isConfidential());
    }

    public static final SelectPopUpChoice AEQbTJ(@NotNull SelectPopUpChoiceData selectPopUpChoiceData) {
        Intrinsics.checkNotNullParameter(selectPopUpChoiceData, "");
        java.lang.String image = selectPopUpChoiceData.getImage();
        java.lang.String title = selectPopUpChoiceData.getTitle();
        java.lang.String subtitle = selectPopUpChoiceData.getSubtitle();
        java.lang.String badge = selectPopUpChoiceData.getBadge();
        CTAButton cta = selectPopUpChoiceData.getCta();
        return new SelectPopUpChoice(image, title, subtitle, badge, cta != null ? cta.toAppModel() : null);
    }

    public static final CtaPopUp KWHzl(@NotNull CtaPopUpData ctaPopUpData) {
        Intrinsics.checkNotNullParameter(ctaPopUpData, "");
        CTAButton primaryButton = ctaPopUpData.getPrimaryButton();
        CTAButtonAppModel appModel = primaryButton != null ? primaryButton.toAppModel() : null;
        CTAButton secondaryButton = ctaPopUpData.getSecondaryButton();
        return new CtaPopUp(appModel, secondaryButton != null ? secondaryButton.toAppModel() : null);
    }

    public static final TextStyle EZpvd(@NotNull TextStyleData textStyleData) {
        Intrinsics.checkNotNullParameter(textStyleData, "");
        return new TextStyle(textStyleData.getFontSize(), textStyleData.getColor(), textStyleData.isBold(), textStyleData.getLineHeight());
    }
}
