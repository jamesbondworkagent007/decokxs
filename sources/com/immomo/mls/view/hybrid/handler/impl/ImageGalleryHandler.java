package com.immomo.mls.view.hybrid.handler.impl;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC7881asG;
import o.C7961ath;
import o.InterfaceC7973att;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ImageGalleryHandler implements InterfaceC7973att {
    public static final int $stable = 8;

    @SerializedName("clickedImageFrame")
    private final ClickedImageFrame clickedImageFrame;

    @SerializedName("defaultSelectIndex")
    private final int defaultSelectIndex;

    @SerializedName("imageUrlList")
    private final List<String> imageUrlList;

    @SerializedName("scrollY")
    private final String scrollY;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.immomo.mls.view.hybrid.handler.impl.ImageGalleryHandler */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageGalleryHandler copy$default(ImageGalleryHandler imageGalleryHandler, List list, int i, ClickedImageFrame clickedImageFrame, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = imageGalleryHandler.imageUrlList;
        }
        if ((i2 & 2) != 0) {
            i = imageGalleryHandler.defaultSelectIndex;
        }
        if ((i2 & 4) != 0) {
            clickedImageFrame = imageGalleryHandler.clickedImageFrame;
        }
        if ((i2 & 8) != 0) {
            str = imageGalleryHandler.scrollY;
        }
        return imageGalleryHandler.copy(list, i, clickedImageFrame, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.imageUrlList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.defaultSelectIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClickedImageFrame component3() {
        return this.clickedImageFrame;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.scrollY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageGalleryHandler copy(@NotNull List<String> list, int i, ClickedImageFrame clickedImageFrame, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new ImageGalleryHandler(list, i, clickedImageFrame, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageGalleryHandler)) {
            return false;
        }
        ImageGalleryHandler imageGalleryHandler = (ImageGalleryHandler) obj;
        return Intrinsics.EZpvd(this.imageUrlList, imageGalleryHandler.imageUrlList) && this.defaultSelectIndex == imageGalleryHandler.defaultSelectIndex && Intrinsics.EZpvd(this.clickedImageFrame, imageGalleryHandler.clickedImageFrame) && Intrinsics.EZpvd((Object) this.scrollY, (Object) imageGalleryHandler.scrollY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClickedImageFrame getClickedImageFrame() {
        return this.clickedImageFrame;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDefaultSelectIndex() {
        return this.defaultSelectIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getImageUrlList() {
        return this.imageUrlList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScrollY() {
        return this.scrollY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.imageUrlList.hashCode();
        int iHashCode2 = Integer.hashCode(this.defaultSelectIndex);
        ClickedImageFrame clickedImageFrame = this.clickedImageFrame;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (clickedImageFrame == null ? 0 : clickedImageFrame.hashCode())) * 31) + this.scrollY.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ImageGalleryHandler(imageUrlList=" + this.imageUrlList + ", defaultSelectIndex=" + this.defaultSelectIndex + ", clickedImageFrame=" + this.clickedImageFrame + ", scrollY=" + this.scrollY + ")";
    }

    public ImageGalleryHandler(@NotNull List<String> list, int i, ClickedImageFrame clickedImageFrame, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.imageUrlList = list;
        this.defaultSelectIndex = i;
        this.clickedImageFrame = clickedImageFrame;
        this.scrollY = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.List)
  (r2v0 int)
  (wrap:com.immomo.mls.view.hybrid.handler.impl.ClickedImageFrame:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.immomo.mls.view.hybrid.handler.impl.ClickedImageFrame) : (r3v0 com.immomo.mls.view.hybrid.handler.impl.ClickedImageFrame))
  (r4v0 java.lang.String)
 A[MD:(java.util.List<java.lang.String>, int, com.immomo.mls.view.hybrid.handler.impl.ClickedImageFrame, java.lang.String):void (m)] (LINE:16) call: com.immomo.mls.view.hybrid.handler.impl.ImageGalleryHandler.<init>(java.util.List, int, com.immomo.mls.view.hybrid.handler.impl.ClickedImageFrame, java.lang.String):void type: THIS */
    public /* synthetic */ ImageGalleryHandler(List list, int i, ClickedImageFrame clickedImageFrame, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, (i2 & 4) != 0 ? null : clickedImageFrame, str);
    }

    @Override // o.InterfaceC7973att
    public void execute(@NotNull C7961ath c7961ath, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(c7961ath, "");
        Intrinsics.checkNotNullParameter(context, "");
        pUU.KWHzl("HybridWebView", "PreviewImageGalleryHandler: [imageUrlList: " + this.imageUrlList + ", defaultSelectIndex: " + this.defaultSelectIndex + "]");
        ActivityC7881asG.Companion.AEQbTJ(context, "", this.imageUrlList, this.defaultSelectIndex);
    }
}
