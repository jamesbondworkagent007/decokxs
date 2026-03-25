package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class Article implements Parcelable {
    public static final int $stable = 0;
    public final int id;
    public final String imgUrlBright;
    public final String imgUrlDark;
    public final String linkUrl;
    public final String subTitle;
    public final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Article> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Article> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Article createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Article(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Article[] newArray(int i) {
            return new Article[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Article() {
        this(0, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Article copy$default(Article article, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = article.id;
        }
        if ((i2 & 2) != 0) {
            str = article.title;
        }
        String str6 = str;
        if ((i2 & 4) != 0) {
            str2 = article.subTitle;
        }
        String str7 = str2;
        if ((i2 & 8) != 0) {
            str3 = article.imgUrlDark;
        }
        String str8 = str3;
        if ((i2 & 16) != 0) {
            str4 = article.imgUrlBright;
        }
        String str9 = str4;
        if ((i2 & 32) != 0) {
            str5 = article.linkUrl;
        }
        return article.KWHzl(i, str6, str7, str8, str9, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.imgUrlDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Article KWHzl(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new Article(i, str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.linkUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.imgUrlBright;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Article)) {
            return false;
        }
        Article article = (Article) obj;
        return this.id == article.id && Intrinsics.EZpvd((Object) this.title, (Object) article.title) && Intrinsics.EZpvd((Object) this.subTitle, (Object) article.subTitle) && Intrinsics.EZpvd((Object) this.imgUrlDark, (Object) article.imgUrlDark) && Intrinsics.EZpvd((Object) this.imgUrlBright, (Object) article.imgUrlBright) && Intrinsics.EZpvd((Object) this.linkUrl, (Object) article.linkUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + this.title.hashCode()) * 31) + this.subTitle.hashCode()) * 31) + this.imgUrlDark.hashCode()) * 31) + this.imgUrlBright.hashCode()) * 31) + this.linkUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Article(id=" + this.id + ", title=" + this.title + ", subTitle=" + this.subTitle + ", imgUrlDark=" + this.imgUrlDark + ", imgUrlBright=" + this.imgUrlBright + ", linkUrl=" + this.linkUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.imgUrlDark);
        parcel.writeString(this.imgUrlBright);
        parcel.writeString(this.linkUrl);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.Article.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Article> serializer() {
            return Article$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Article(int i, int i2, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        this.id = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.subTitle = "";
        } else {
            this.subTitle = str2;
        }
        if ((i & 8) == 0) {
            this.imgUrlDark = "";
        } else {
            this.imgUrlDark = str3;
        }
        if ((i & 16) == 0) {
            this.imgUrlBright = "";
        } else {
            this.imgUrlBright = str4;
        }
        if ((i & 32) == 0) {
            this.linkUrl = "";
        } else {
            this.linkUrl = str5;
        }
    }

    public static final /* synthetic */ void AEQbTJ(Article article, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || article.id != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, article.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) article.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, article.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) article.subTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, article.subTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) article.imgUrlDark, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, article.imgUrlDark);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) article.imgUrlBright, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, article.imgUrlBright);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) article.linkUrl, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, article.linkUrl);
    }

    public Article(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.id = i;
        this.title = str;
        this.subTitle = str2;
        this.imgUrlDark = str3;
        this.imgUrlBright = str4;
        this.linkUrl = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r11v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r10v0 java.lang.String) : (""))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:810) call: com.okinc.business.defi.biz.net.bean.Article.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ Article(int i, String str, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) == 0 ? str5 : "");
    }
}
