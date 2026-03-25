package com.okinc.planet.biz_content.input.data;

import android.net.Uri;
import com.okinc.planet.domain.remote.dto.ImageItem;
import com.okinc.planet.domain.remote.dto.UploadState;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SerializableImageItem implements Serializable {
    private final String bitmapKey;
    private final String filePath;
    private final String fileSize;
    private String height;
    private final String id;
    private final String localUriString;
    private String netPathUrl;
    private final String remoteUrl;
    private final UploadState uploadState;
    private String width;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.fileSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.localUriString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.bitmapKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UploadState component4() {
        return this.uploadState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.remoteUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.netPathUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.filePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SerializableImageItem copy(@NotNull String str, String str2, String str3, @NotNull UploadState uploadState, String str4, String str5, String str6, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(uploadState, "");
        return new SerializableImageItem(str, str2, str3, uploadState, str4, str5, str6, str7, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SerializableImageItem)) {
            return false;
        }
        SerializableImageItem serializableImageItem = (SerializableImageItem) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) serializableImageItem.id) && Intrinsics.EZpvd((Object) this.localUriString, (Object) serializableImageItem.localUriString) && Intrinsics.EZpvd((Object) this.bitmapKey, (Object) serializableImageItem.bitmapKey) && this.uploadState == serializableImageItem.uploadState && Intrinsics.EZpvd((Object) this.remoteUrl, (Object) serializableImageItem.remoteUrl) && Intrinsics.EZpvd((Object) this.netPathUrl, (Object) serializableImageItem.netPathUrl) && Intrinsics.EZpvd((Object) this.width, (Object) serializableImageItem.width) && Intrinsics.EZpvd((Object) this.height, (Object) serializableImageItem.height) && Intrinsics.EZpvd((Object) this.filePath, (Object) serializableImageItem.filePath) && Intrinsics.EZpvd((Object) this.fileSize, (Object) serializableImageItem.fileSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBitmapKey() {
        return this.bitmapKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilePath() {
        return this.filePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileSize() {
        return this.fileSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHeight() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLocalUriString() {
        return this.localUriString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetPathUrl() {
        return this.netPathUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemoteUrl() {
        return this.remoteUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UploadState getUploadState() {
        return this.uploadState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWidth() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        String str = this.localUriString;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.bitmapKey;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = this.uploadState.hashCode();
        String str3 = this.remoteUrl;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.netPathUrl;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.width;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.height;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.filePath;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.fileSize;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeight(String str) {
        this.height = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetPathUrl(String str) {
        this.netPathUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWidth(String str) {
        this.width = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SerializableImageItem(id=" + this.id + ", localUriString=" + this.localUriString + ", bitmapKey=" + this.bitmapKey + ", uploadState=" + this.uploadState + ", remoteUrl=" + this.remoteUrl + ", netPathUrl=" + this.netPathUrl + ", width=" + this.width + ", height=" + this.height + ", filePath=" + this.filePath + ", fileSize=" + this.fileSize + ")";
    }

    public SerializableImageItem(@NotNull String str, String str2, String str3, @NotNull UploadState uploadState, String str4, String str5, String str6, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(uploadState, "");
        this.id = str;
        this.localUriString = str2;
        this.bitmapKey = str3;
        this.uploadState = uploadState;
        this.remoteUrl = str4;
        this.netPathUrl = str5;
        this.width = str6;
        this.height = str7;
        this.filePath = str8;
        this.fileSize = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0047: CONSTRUCTOR 
  (r15v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (r18v0 com.okinc.planet.domain.remote.dto.UploadState)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r25v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.planet.domain.remote.dto.UploadState, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:47) call: com.okinc.planet.biz_content.input.data.SerializableImageItem.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.planet.domain.remote.dto.UploadState, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SerializableImageItem(String str, String str2, String str3, UploadState uploadState, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, uploadState, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_content.input.data.SerializableImageItem.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final SerializableImageItem EZpvd(@NotNull ImageItem imageItem) {
            Intrinsics.checkNotNullParameter(imageItem, "");
            String id = imageItem.getId();
            Uri localUri = imageItem.getLocalUri();
            return new SerializableImageItem(id, localUri != null ? localUri.toString() : null, imageItem.getBitmapKey(), imageItem.getUploadState(), imageItem.getRemoteUrl(), imageItem.getNetPathUrl(), imageItem.getWidth(), imageItem.getHeight(), imageItem.getFilePath(), imageItem.getFileSize());
        }
    }

    public final ImageItem toImageItem() {
        Uri uri;
        String str = this.id;
        String str2 = this.localUriString;
        if (str2 != null) {
            uri = Uri.parse(str2);
            Intrinsics.checkNotNullExpressionValue(uri, "");
        } else {
            uri = null;
        }
        return new ImageItem(str, uri, this.bitmapKey, this.uploadState, this.remoteUrl, this.netPathUrl, this.width, this.height, null, this.filePath, this.fileSize, 256, null);
    }
}
