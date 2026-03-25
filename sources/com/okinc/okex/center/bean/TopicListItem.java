package com.okinc.okex.center.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class TopicListItem implements Parcelable {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.TopicListItem.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TopicListItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TopicListItem() {
    }

    public static final class TopicItem extends TopicListItem {
        public static final int $stable = 8;
        public static final Parcelable.Creator<TopicItem> CREATOR = new Creator();
        private final String description;
        private final String iconUrl;
        private final String id;
        private final String slug;
        private final List<String> tags;
        private final String title;

        public static final class Creator implements Parcelable.Creator<TopicItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TopicItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new TopicItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TopicItem[] newArray(int i) {
                return new TopicItem[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TopicItem() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.okex.center.bean.TopicListItem$TopicItem */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TopicItem copy$default(TopicItem topicItem, String str, String str2, String str3, String str4, List list, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = topicItem.id;
            }
            if ((i & 2) != 0) {
                str2 = topicItem.title;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = topicItem.description;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = topicItem.iconUrl;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                list = topicItem.tags;
            }
            List list2 = list;
            if ((i & 32) != 0) {
                str5 = topicItem.slug;
            }
            return topicItem.copy(str, str6, str7, str8, list2, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.description;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.iconUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component5() {
            return this.tags;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.slug;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TopicItem copy(String str, String str2, String str3, String str4, List<String> list, String str5) {
            return new TopicItem(str, str2, str3, str4, list, str5);
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
            if (!(obj instanceof TopicItem)) {
                return false;
            }
            TopicItem topicItem = (TopicItem) obj;
            return Intrinsics.EZpvd((Object) this.id, (Object) topicItem.id) && Intrinsics.EZpvd((Object) this.title, (Object) topicItem.title) && Intrinsics.EZpvd((Object) this.description, (Object) topicItem.description) && Intrinsics.EZpvd((Object) this.iconUrl, (Object) topicItem.iconUrl) && Intrinsics.EZpvd(this.tags, topicItem.tags) && Intrinsics.EZpvd((Object) this.slug, (Object) topicItem.slug);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDescription() {
            return this.description;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSlug() {
            return this.slug;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getTags() {
            return this.tags;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.id;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.title;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.description;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.iconUrl;
            int iHashCode4 = str4 == null ? 0 : str4.hashCode();
            List<String> list = this.tags;
            int iHashCode5 = list == null ? 0 : list.hashCode();
            String str5 = this.slug;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TopicItem(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", iconUrl=" + this.iconUrl + ", tags=" + this.tags + ", slug=" + this.slug + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            parcel.writeString(this.iconUrl);
            parcel.writeStringList(this.tags);
            parcel.writeString(this.slug);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String):void (m)] (LINE:15) call: com.okinc.okex.center.bean.TopicListItem.TopicItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String):void type: THIS */
        public /* synthetic */ TopicItem(String str, String str2, String str3, String str4, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str5);
        }

        public TopicItem(String str, String str2, String str3, String str4, List<String> list, String str5) {
            super(null);
            this.id = str;
            this.title = str2;
            this.description = str3;
            this.iconUrl = str4;
            this.tags = list;
            this.slug = str5;
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class TopicHeaderItem extends TopicListItem {
        public static final int $stable = 0;
        public static final Parcelable.Creator<TopicHeaderItem> CREATOR = new Creator();
        private final String text;

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Creator implements Parcelable.Creator<TopicHeaderItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TopicHeaderItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new TopicHeaderItem(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TopicHeaderItem[] newArray(int i) {
                return new TopicHeaderItem[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TopicHeaderItem copy$default(TopicHeaderItem topicHeaderItem, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = topicHeaderItem.text;
            }
            return topicHeaderItem.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.text;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TopicHeaderItem copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TopicHeaderItem(str);
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
            return (obj instanceof TopicHeaderItem) && Intrinsics.EZpvd((Object) this.text, (Object) ((TopicHeaderItem) obj).text);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getText() {
            return this.text;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.text.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TopicHeaderItem(text=" + this.text + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.text);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TopicHeaderItem(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.text = str;
        }
    }
}
