package com.okinc.business.defi.share.bean;

import android.graphics.Bitmap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class Web3ShareImageInfo extends Web3ShareBaseInfo {
    private Bitmap imageBitmap;
    private String imagePath = "";
    private Boolean useCommonDownloadURL = Boolean.FALSE;
    public static final Activity Companion = new Activity(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bitmap getImageBitmap() {
        return this.imageBitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImagePath() {
        return this.imagePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getUseCommonDownloadURL() {
        return this.useCommonDownloadURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageBitmap(Bitmap bitmap) {
        this.imageBitmap = bitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImagePath(String str) {
        this.imagePath = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUseCommonDownloadURL(Boolean bool) {
        this.useCommonDownloadURL = bool;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.share.bean.Web3ShareImageInfo.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ Web3ShareImageInfo create$default(Activity activity, String str, Boolean bool, int i, Object obj) {
            if ((i & 2) != 0) {
                bool = Boolean.FALSE;
            }
            return activity.AEQbTJ(str, bool);
        }

        public final Web3ShareImageInfo AEQbTJ(@NotNull String str, Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            Web3ShareImageInfo web3ShareImageInfo = new Web3ShareImageInfo();
            web3ShareImageInfo.setImagePath(str);
            web3ShareImageInfo.setUseCommonDownloadURL(bool);
            return web3ShareImageInfo;
        }

        public static /* synthetic */ Web3ShareImageInfo create$default(Activity activity, Bitmap bitmap, Boolean bool, int i, Object obj) {
            if ((i & 2) != 0) {
                bool = Boolean.FALSE;
            }
            return activity.KWHzl(bitmap, bool);
        }

        public final Web3ShareImageInfo KWHzl(@NotNull Bitmap bitmap, Boolean bool) {
            Intrinsics.checkNotNullParameter(bitmap, "");
            Web3ShareImageInfo web3ShareImageInfo = new Web3ShareImageInfo();
            web3ShareImageInfo.setImageBitmap(bitmap);
            web3ShareImageInfo.setUseCommonDownloadURL(bool);
            return web3ShareImageInfo;
        }
    }
}
