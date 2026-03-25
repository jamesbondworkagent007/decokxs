package com.okinc.share.api.params;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import androidx.fragment.app.Fragment;
import com.okinc.share.bean.TriggerSource;
import kotlin.jvm.internal.Intrinsics;
import o.C48905ueW;
import o.InterfaceC48906ueX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseShareParams implements IShareParams {
    public static final int $stable = 8;
    private String body;
    private Bundle extras;
    private String mPendingIShareParamsTransformerKey;
    private String shareFrom;
    private String subtitle;
    private String title;
    private TriggerSource triggerSource;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.params.IShareParams
    public String getBody() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.params.IShareParams
    public Bundle getExtras() {
        return this.extras;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.params.IShareParams
    public String getShareFrom() {
        return this.shareFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.params.IShareParams
    public String getSubtitle() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.params.IShareParams
    public String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.params.IShareParams
    public TriggerSource getTriggerSource() {
        return this.triggerSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.params.IShareParams
    public void setBody(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.body = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.params.IShareParams
    public void setExtras(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        this.extras = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.params.IShareParams
    public void setShareFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.shareFrom = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.params.IShareParams
    public void setSubtitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subtitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.params.IShareParams
    public void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.params.IShareParams
    public void setTriggerSource(@NotNull TriggerSource triggerSource) {
        Intrinsics.checkNotNullParameter(triggerSource, "");
        this.triggerSource = triggerSource;
    }

    public BaseShareParams() {
        this.extras = new Bundle();
        this.title = "";
        this.subtitle = "";
        this.body = "";
        this.shareFrom = "";
        this.triggerSource = TriggerSource.BUTTON_CLICK;
    }

    public BaseShareParams(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.extras = new Bundle();
        this.title = "";
        this.subtitle = "";
        this.body = "";
        this.shareFrom = "";
        this.triggerSource = TriggerSource.BUTTON_CLICK;
        String string = parcel.readString();
        setTitle(string == null ? "" : string);
        String string2 = parcel.readString();
        setSubtitle(string2 == null ? "" : string2);
        String string3 = parcel.readString();
        setBody(string3 == null ? "" : string3);
        String string4 = parcel.readString();
        setShareFrom(string4 != null ? string4 : "");
        this.mPendingIShareParamsTransformerKey = parcel.readString();
        Bundle bundle = parcel.readBundle();
        setExtras(bundle == null ? new Bundle() : bundle);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(getTitle());
        parcel.writeString(getSubtitle());
        parcel.writeString(getBody());
        parcel.writeString(getShareFrom());
        parcel.writeString(this.mPendingIShareParamsTransformerKey);
        parcel.writeBundle(getExtras());
    }

    @Override // com.okinc.share.api.params.IShareParams
    public void setSmsBody(String str) {
        getExtras().putString(IShareParams.EXTRA_SMS_BODY, str);
    }

    @Override // com.okinc.share.api.params.IShareParams
    public String getSmsBody() {
        return getExtras().getString(IShareParams.EXTRA_SMS_BODY);
    }

    @Override // com.okinc.share.api.params.IShareParams
    public void setEmailBody(String str) {
        getExtras().putString(IShareParams.EXTRA_EMAIL_BODY, str);
    }

    @Override // com.okinc.share.api.params.IShareParams
    public String getEmailBody() {
        return getExtras().getString(IShareParams.EXTRA_EMAIL_BODY);
    }

    @Override // com.okinc.share.api.params.IShareParams
    public void setEmailSubject(String str) {
        getExtras().putString(IShareParams.EXTRA_EMAIL_SUBJECT, str);
    }

    @Override // com.okinc.share.api.params.IShareParams
    public String getEmailSubject() {
        return getExtras().getString(IShareParams.EXTRA_EMAIL_SUBJECT);
    }

    @Override // com.okinc.share.api.params.IShareParams
    public void setWcMomentBody(String str) {
        getExtras().putString(IShareParams.EXTRA_WECHAT_BODY, str);
    }

    @Override // com.okinc.share.api.params.IShareParams
    public String getWcMomentBody() {
        return getExtras().getString(IShareParams.EXTRA_WECHAT_BODY);
    }

    @Override // com.okinc.share.api.params.IShareParams
    public InterfaceC48906ueX getPendingShareParamsTransformer() {
        String str = this.mPendingIShareParamsTransformerKey;
        if (str != null) {
            return C48905ueW.KWHzl.OLrzqt(str);
        }
        return null;
    }

    @Override // com.okinc.share.api.params.IShareParams
    public void setPendingShareParamsTransformer(@NotNull Activity activity, InterfaceC48906ueX interfaceC48906ueX) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.mPendingIShareParamsTransformerKey = interfaceC48906ueX != null ? C48905ueW.KWHzl.AEQbTJ(activity, interfaceC48906ueX) : null;
    }

    @Override // com.okinc.share.api.params.IShareParams
    public void setPendingShareParamsTransformer(@NotNull Fragment fragment, InterfaceC48906ueX interfaceC48906ueX) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.mPendingIShareParamsTransformerKey = interfaceC48906ueX != null ? C48905ueW.KWHzl.AEQbTJ(fragment, interfaceC48906ueX) : null;
    }
}
