package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.ActionParams;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaIcon;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCheckboxAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ToastModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.rSl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C42427rSl {
    public static /* synthetic */ ButtonDialog initFileUploadDialog$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, ButtonAction buttonAction, ButtonAction buttonAction2, CTAButtonAppModel cTAButtonAppModel, ButtonStyle buttonStyle, ButtonStyle buttonStyle2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        if ((i & 16) != 0) {
            str5 = "";
        }
        if ((i & 32) != 0) {
            buttonAction = ButtonAction.Cancel;
        }
        if ((i & 64) != 0) {
            buttonAction2 = ButtonAction.Cancel;
        }
        if ((i & 128) != 0) {
            cTAButtonAppModel = null;
        }
        if ((i & 256) != 0) {
            buttonStyle = null;
        }
        if ((i & 512) != 0) {
            buttonStyle2 = null;
        }
        return KWHzl(str, str2, str3, str4, str5, buttonAction, buttonAction2, cTAButtonAppModel, buttonStyle, buttonStyle2);
    }

    public static final ButtonDialog KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, ButtonAction buttonAction, ButtonAction buttonAction2, CTAButtonAppModel cTAButtonAppModel, ButtonStyle buttonStyle, ButtonStyle buttonStyle2) {
        CTAButtonAppModel cTAButtonAppModel2;
        CTAButtonAppModel cTAButtonAppModel3 = null;
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
            cTAButtonAppModel2 = null;
        } else if (cTAButtonAppModel != null) {
            cTAButtonAppModel2 = new CTAButtonAppModel(str3, buttonAction, cTAButtonAppModel.getActionParams(), buttonStyle == null ? ButtonStyle.Primary : buttonStyle, cTAButtonAppModel.getTarget(), (java.lang.String) null, (java.lang.String) null, (CtaIcon) null, cTAButtonAppModel.getAlign(), cTAButtonAppModel.getId(), java.lang.Boolean.FALSE, cTAButtonAppModel.getVersion(), cTAButtonAppModel.getValue(), (java.lang.Float) null, (java.lang.Float) null, (java.lang.Boolean) null, (java.lang.Boolean) null, false, cTAButtonAppModel.getPlaybook(), (ButtonDialog) null, (ToastModel) null, (DynamicTitle) null, (java.lang.Boolean) null, cTAButtonAppModel.getBackgroundColor(), (java.lang.Boolean) null, (java.lang.String) null, 57901056, (DefaultConstructorMarker) null);
        } else {
            cTAButtonAppModel2 = new CTAButtonAppModel(str3, buttonAction, (ActionParams) null, buttonStyle == null ? ButtonStyle.Primary : buttonStyle, "", (java.lang.String) null, (java.lang.String) null, (CtaIcon) null, (UIAlignment) null, "", java.lang.Boolean.FALSE, "", "", (java.lang.Float) null, (java.lang.Float) null, (java.lang.Boolean) null, (java.lang.Boolean) null, false, "", (ButtonDialog) null, (ToastModel) null, (DynamicTitle) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, 57901056, (DefaultConstructorMarker) null);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str4)) {
            cTAButtonAppModel3 = new CTAButtonAppModel(str4, buttonAction2, (ActionParams) null, buttonStyle2 == null ? ButtonStyle.Secondary : buttonStyle2, "", (java.lang.String) null, (java.lang.String) null, (CtaIcon) null, (UIAlignment) null, "", java.lang.Boolean.FALSE, "", "", (java.lang.Float) null, (java.lang.Float) null, (java.lang.Boolean) null, (java.lang.Boolean) null, false, "", (ButtonDialog) null, (ToastModel) null, (DynamicTitle) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, 57901056, (DefaultConstructorMarker) null);
        }
        return new ButtonDialog(DialogStyle.BOTTOM, (java.lang.String) null, (java.lang.String) null, str, str2, str5, java.lang.Boolean.valueOf(str5 != null), (java.lang.Boolean) null, new CtaPopUp(cTAButtonAppModel2, cTAButtonAppModel3), new java.util.ArrayList(), (java.lang.Boolean) null, (FreeTextAppModel) null, (java.lang.Boolean) null, (DialogCheckboxAppModel) null, (java.lang.Boolean) null, 31878, (DefaultConstructorMarker) null);
    }
}
