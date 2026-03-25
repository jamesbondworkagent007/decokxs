package com.immomo.mls.view.gallery.image;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C59449zhJ;
import o.C7962ati;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class GalleryImageSource implements Parcelable {
    public static final String ASSET_SCHEME = "file:///android_asset/";
    public static final String FILE_SCHEME = "file://";
    private String httpUrl;
    private String keyOfBitmap;
    private int resourceId;
    private Uri uri;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<GalleryImageSource> CREATOR = new Parcelable.Creator<GalleryImageSource>() { // from class: com.immomo.mls.view.gallery.image.GalleryImageSource$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GalleryImageSource createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GalleryImageSource(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GalleryImageSource[] newArray(int i) {
            return new GalleryImageSource[i];
        }
    };

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int) A[MD:(int):void (m)] call: com.immomo.mls.view.gallery.image.GalleryImageSource.<init>(int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ GalleryImageSource(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 android.net.Uri) A[MD:(android.net.Uri):void (m)] call: com.immomo.mls.view.gallery.image.GalleryImageSource.<init>(android.net.Uri):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ GalleryImageSource(Uri uri, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String) A[MD:(java.lang.String, java.lang.String):void (m)] call: com.immomo.mls.view.gallery.image.GalleryImageSource.<init>(java.lang.String, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ GalleryImageSource(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.immomo.mls.view.gallery.image.GalleryImageSource.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ GalleryImageSource(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHttpUrl() {
        return this.httpUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getResourceId() {
        return this.resourceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImageSource(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "");
        this.uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.resourceId = parcel.readInt();
        this.keyOfBitmap = parcel.readString();
        this.httpUrl = parcel.readString();
    }

    private GalleryImageSource() {
    }

    private GalleryImageSource(Uri uri) {
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (C59449zhJ.startsWith$default(string, "file://", false, 2, null)) {
            String strSubstring = string.substring(6);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            if (!new File(strSubstring).exists()) {
                try {
                    String strDecode = URLDecoder.decode(string, C.UTF8_NAME);
                    Intrinsics.checkNotNullExpressionValue(strDecode, "");
                    Uri uri2 = Uri.parse(strDecode);
                    Intrinsics.checkNotNullExpressionValue(uri2, "");
                    uri = uri2;
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }
        this.uri = uri;
        this.resourceId = 0;
    }

    private GalleryImageSource(int i) {
        this.uri = null;
        this.resourceId = i;
    }

    private GalleryImageSource(String str, String str2) {
        this.httpUrl = str;
        this.keyOfBitmap = null;
    }

    private GalleryImageSource(String str) {
        this.keyOfBitmap = str;
    }

    public final String getPath() {
        Uri uri = this.uri;
        if (uri != null) {
            return uri.getPath();
        }
        return null;
    }

    public final boolean isImageEmpty() {
        String str;
        return this.resourceId == 0 && ((str = this.httpUrl) == null || str.length() == 0) && this.uri == null && getBitmap() == null;
    }

    public final boolean hasBitmap() {
        return C33129mqd.OLrzqt((CharSequence) this.keyOfBitmap);
    }

    public final Bitmap getBitmap() {
        if (!C33129mqd.OLrzqt((CharSequence) this.keyOfBitmap)) {
            return null;
        }
        C7962ati c7962ati = C7962ati.AEQbTJ;
        String str = this.keyOfBitmap;
        Intrinsics.copydefault((Object) str);
        return c7962ati.AEQbTJ(str);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.view.gallery.image.GalleryImageSource.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final GalleryImageSource AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            Uri uri = Uri.parse("file://" + str);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            return new GalleryImageSource(uri, (DefaultConstructorMarker) null);
        }

        public final GalleryImageSource AEQbTJ(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "");
            return new GalleryImageSource(uri, (DefaultConstructorMarker) null);
        }

        public final GalleryImageSource copydefault(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new GalleryImageSource(str, null, 0 == true ? 1 : 0);
        }

        public final GalleryImageSource OLrzqt(@NotNull Activity activity, @NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(bitmap, "");
            return new GalleryImageSource(C7962ati.AEQbTJ.KWHzl(activity, bitmap), (DefaultConstructorMarker) null);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.uri, i);
        parcel.writeInt(this.resourceId);
        parcel.writeString(this.keyOfBitmap);
        parcel.writeString(this.httpUrl);
    }
}
