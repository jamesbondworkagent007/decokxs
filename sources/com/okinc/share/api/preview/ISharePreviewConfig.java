package com.okinc.share.api.preview;

import android.os.Parcelable;
import com.okinc.share.bean.SharePreviewMode;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.image.ImageSource;

/* JADX INFO: loaded from: classes11.dex */
public interface ISharePreviewConfig extends Parcelable {
    boolean getEditable();

    CharSequence getPreviewBottomTips();

    PreviewBottomTipsMode getPreviewBottomTipsMode();

    String getPreviewContent();

    ImageSource getPreviewIcon();

    String getPreviewTitle();

    SharePreviewMode getSharePreviewMode();

    ShareType getShareType();

    void setEditable(boolean z);

    void setPreviewBottomTips(CharSequence charSequence);

    void setPreviewBottomTipsMode(PreviewBottomTipsMode previewBottomTipsMode);

    void setPreviewContent(String str);

    void setPreviewIcon(ImageSource imageSource);

    void setPreviewTitle(String str);
}
