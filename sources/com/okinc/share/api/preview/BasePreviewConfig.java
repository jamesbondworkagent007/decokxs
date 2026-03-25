package com.okinc.share.api.preview;

import android.os.Parcel;
import android.text.TextUtils;
import com.okinc.share.bean.image.ImageSource;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BasePreviewConfig implements ISharePreviewConfig {
    public static final int $stable = 8;
    private boolean editable;
    private CharSequence previewBottomTips;
    private PreviewBottomTipsMode previewBottomTipsMode;
    private String previewContent;
    private ImageSource previewIcon;
    private String previewTitle;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.preview.ISharePreviewConfig
    public boolean getEditable() {
        return this.editable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.preview.ISharePreviewConfig
    public CharSequence getPreviewBottomTips() {
        return this.previewBottomTips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.preview.ISharePreviewConfig
    public PreviewBottomTipsMode getPreviewBottomTipsMode() {
        return this.previewBottomTipsMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.preview.ISharePreviewConfig
    public String getPreviewContent() {
        return this.previewContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.preview.ISharePreviewConfig
    public ImageSource getPreviewIcon() {
        return this.previewIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.preview.ISharePreviewConfig
    public String getPreviewTitle() {
        return this.previewTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.preview.ISharePreviewConfig
    public void setEditable(boolean z) {
        this.editable = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.preview.ISharePreviewConfig
    public void setPreviewBottomTips(CharSequence charSequence) {
        this.previewBottomTips = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.preview.ISharePreviewConfig
    public void setPreviewBottomTipsMode(PreviewBottomTipsMode previewBottomTipsMode) {
        this.previewBottomTipsMode = previewBottomTipsMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.preview.ISharePreviewConfig
    public void setPreviewContent(String str) {
        this.previewContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.preview.ISharePreviewConfig
    public void setPreviewIcon(ImageSource imageSource) {
        this.previewIcon = imageSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.preview.ISharePreviewConfig
    public void setPreviewTitle(String str) {
        this.previewTitle = str;
    }

    public BasePreviewConfig() {
    }

    public BasePreviewConfig(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "");
        setEditable(parcel.readInt() == 1);
        setPreviewTitle(parcel.readString());
        setPreviewContent(parcel.readString());
        setPreviewIcon((ImageSource) parcel.readParcelable(ImageSource.class.getClassLoader()));
        setPreviewBottomTips((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
        setPreviewBottomTipsMode((PreviewBottomTipsMode) parcel.readParcelable(PreviewBottomTipsMode.class.getClassLoader()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(getEditable() ? 1 : 0);
        parcel.writeString(getPreviewTitle());
        parcel.writeString(getPreviewContent());
        parcel.writeParcelable(getPreviewIcon(), i);
        TextUtils.writeToParcel(getPreviewBottomTips(), parcel, i);
        parcel.writeParcelable(getPreviewBottomTipsMode(), i);
    }
}
