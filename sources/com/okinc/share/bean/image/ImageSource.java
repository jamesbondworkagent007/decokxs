package com.okinc.share.bean.image;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.C;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33129mqd;
import o.C48948ufM;
import o.C59449zhJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ImageSource implements Parcelable {
    public static final String ASSET_SCHEME = "file:///android_asset/";
    public static final String FILE_SCHEME = "file://";
    private String keyOfBitmap;
    private int resourceId;
    private Uri uri;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ImageSource> CREATOR = new Parcelable.Creator<ImageSource>() { // from class: com.okinc.share.bean.image.ImageSource$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImageSource createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ImageSource(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImageSource[] newArray(int i) {
            return new ImageSource[i];
        }
    };

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int) A[MD:(int):void (m)] call: com.okinc.share.bean.image.ImageSource.<init>(int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ImageSource(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 android.net.Uri) A[MD:(android.net.Uri):void (m)] call: com.okinc.share.bean.image.ImageSource.<init>(android.net.Uri):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ImageSource(Uri uri, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.okinc.share.bean.image.ImageSource.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ImageSource(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBitmapKey() {
        return this.keyOfBitmap;
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
    public ImageSource(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "");
        this.uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.resourceId = parcel.readInt();
        this.keyOfBitmap = parcel.readString();
    }

    private ImageSource() {
    }

    private ImageSource(Uri uri) {
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (C59449zhJ.startsWith$default(string, "file://", false, 2, null)) {
            String strSubstring = string.substring(6);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            if (!new File(strSubstring).exists()) {
                try {
                    uri = Uri.parse(URLDecoder.decode(string, C.UTF8_NAME));
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }
        this.uri = uri;
        this.resourceId = 0;
    }

    private ImageSource(int i) {
        this.uri = null;
        this.resourceId = i;
    }

    private ImageSource(String str) {
        this.keyOfBitmap = str;
    }

    public final String getPath() {
        Uri uri = this.uri;
        if (uri != null) {
            return uri.getPath();
        }
        return null;
    }

    public final boolean hasBitmap() {
        return C33129mqd.OLrzqt((CharSequence) this.keyOfBitmap);
    }

    public final Bitmap getBitmap() {
        if (!C33129mqd.OLrzqt((CharSequence) this.keyOfBitmap)) {
            return null;
        }
        C48948ufM c48948ufM = C48948ufM.copydefault;
        String str = this.keyOfBitmap;
        Intrinsics.copydefault((Object) str);
        return c48948ufM.KWHzl(str);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.image.ImageSource.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final ImageSource AEQbTJ(int i) {
            return new ImageSource(i, (DefaultConstructorMarker) null);
        }

        public final ImageSource EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            Uri uri = Uri.parse("file://" + str);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            return new ImageSource(uri, (DefaultConstructorMarker) null);
        }

        public final ImageSource OLrzqt(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "://", false, 2, (Object) null)) {
                if (C59449zhJ.startsWith$default(str, "/", false, 2, null)) {
                    str = str.substring(1);
                    Intrinsics.checkNotNullExpressionValue(str, "");
                }
                str = "file://" + str;
            }
            Uri uri = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            return new ImageSource(uri, defaultConstructorMarker);
        }

        public final ImageSource EZpvd(@NotNull Activity activity, @NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(bitmap, "");
            return new ImageSource(C48948ufM.copydefault.AEQbTJ(activity, bitmap), (DefaultConstructorMarker) null);
        }

        public final ImageSource KWHzl(@NotNull Fragment fragment, @NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(bitmap, "");
            return new ImageSource(C48948ufM.copydefault.KWHzl(fragment, bitmap), (DefaultConstructorMarker) null);
        }

        public final ImageSource KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ImageSource(str, (DefaultConstructorMarker) null);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.uri, i);
        parcel.writeInt(this.resourceId);
        parcel.writeString(this.keyOfBitmap);
    }
}
