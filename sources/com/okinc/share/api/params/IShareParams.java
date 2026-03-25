package com.okinc.share.api.params;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.TriggerSource;
import o.InterfaceC48906ueX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface IShareParams extends Parcelable {
    public static final TaskDescription Companion = TaskDescription.KWHzl;
    public static final String EXTRA_EMAIL_BODY = "EXTRA_EMAIL_BODY";
    public static final String EXTRA_EMAIL_SUBJECT = "EXTRA_EMAIL_SUBJECT";
    public static final String EXTRA_ENABLE_TOAST = "EXTRA_ENABLE_TOAST";
    public static final String EXTRA_SMS_BODY = "EXTRA_SMS_BODY";
    public static final String EXTRA_WECHAT_BODY = "EXTRA_WECHAT_BODY";

    String getBody();

    String getEmailBody();

    String getEmailSubject();

    Bundle getExtras();

    InterfaceC48906ueX getPendingShareParamsTransformer();

    String getShareFrom();

    ShareType getShareType();

    String getSmsBody();

    String getSubtitle();

    String getTitle();

    TriggerSource getTriggerSource();

    String getWcMomentBody();

    void setBody(@NotNull String str);

    void setEmailBody(String str);

    void setEmailSubject(String str);

    void setExtras(@NotNull Bundle bundle);

    void setPendingShareParamsTransformer(@NotNull Activity activity, InterfaceC48906ueX interfaceC48906ueX);

    void setPendingShareParamsTransformer(@NotNull Fragment fragment, InterfaceC48906ueX interfaceC48906ueX);

    void setShareFrom(@NotNull String str);

    void setSmsBody(String str);

    void setSubtitle(@NotNull String str);

    void setTitle(@NotNull String str);

    void setTriggerSource(@NotNull TriggerSource triggerSource);

    void setWcMomentBody(String str);

    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
        }
    }
}
