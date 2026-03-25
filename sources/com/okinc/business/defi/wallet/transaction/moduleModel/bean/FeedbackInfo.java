package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class FeedbackInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FeedbackInfo> CREATOR = new Creator();
    private final String feedbackEntryText;
    private final FeedbackRequestParam feedbackRequestParam;
    private final String feedbackResultText;
    private final String method;
    private final String url;

    public static final class Creator implements Parcelable.Creator<FeedbackInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeedbackInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FeedbackInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FeedbackRequestParam.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeedbackInfo[] newArray(int i) {
            return new FeedbackInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FeedbackInfo copy$default(FeedbackInfo feedbackInfo, String str, String str2, String str3, String str4, FeedbackRequestParam feedbackRequestParam, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedbackInfo.feedbackEntryText;
        }
        if ((i & 2) != 0) {
            str2 = feedbackInfo.feedbackResultText;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = feedbackInfo.url;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = feedbackInfo.method;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            feedbackRequestParam = feedbackInfo.feedbackRequestParam;
        }
        return feedbackInfo.copy(str, str5, str6, str7, feedbackRequestParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.feedbackEntryText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.feedbackResultText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeedbackRequestParam component5() {
        return this.feedbackRequestParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeedbackInfo copy(String str, String str2, String str3, String str4, FeedbackRequestParam feedbackRequestParam) {
        return new FeedbackInfo(str, str2, str3, str4, feedbackRequestParam);
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
        if (!(obj instanceof FeedbackInfo)) {
            return false;
        }
        FeedbackInfo feedbackInfo = (FeedbackInfo) obj;
        return Intrinsics.EZpvd((Object) this.feedbackEntryText, (Object) feedbackInfo.feedbackEntryText) && Intrinsics.EZpvd((Object) this.feedbackResultText, (Object) feedbackInfo.feedbackResultText) && Intrinsics.EZpvd((Object) this.url, (Object) feedbackInfo.url) && Intrinsics.EZpvd((Object) this.method, (Object) feedbackInfo.method) && Intrinsics.EZpvd(this.feedbackRequestParam, feedbackInfo.feedbackRequestParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeedbackEntryText() {
        return this.feedbackEntryText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeedbackRequestParam getFeedbackRequestParam() {
        return this.feedbackRequestParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeedbackResultText() {
        return this.feedbackResultText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.feedbackEntryText;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.feedbackResultText;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.url;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.method;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        FeedbackRequestParam feedbackRequestParam = this.feedbackRequestParam;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (feedbackRequestParam != null ? feedbackRequestParam.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FeedbackInfo(feedbackEntryText=" + this.feedbackEntryText + ", feedbackResultText=" + this.feedbackResultText + ", url=" + this.url + ", method=" + this.method + ", feedbackRequestParam=" + this.feedbackRequestParam + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.feedbackEntryText);
        parcel.writeString(this.feedbackResultText);
        parcel.writeString(this.url);
        parcel.writeString(this.method);
        FeedbackRequestParam feedbackRequestParam = this.feedbackRequestParam;
        if (feedbackRequestParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feedbackRequestParam.writeToParcel(parcel, i);
        }
    }

    public FeedbackInfo(String str, String str2, String str3, String str4, FeedbackRequestParam feedbackRequestParam) {
        this.feedbackEntryText = str;
        this.feedbackResultText = str2;
        this.url = str3;
        this.method = str4;
        this.feedbackRequestParam = feedbackRequestParam;
    }
}
