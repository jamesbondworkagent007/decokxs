package com.okinc.planet_api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class WebRichShareToFeedConfig implements Parcelable {
    private final ActivityCard activityCard;
    private final String content;
    private final ArrayList<String> imageList;
    private final ArrayList<ShareTopic> topics;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WebRichShareToFeedConfig> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(ShareTopic$$serializer.INSTANCE), new ArrayListSerializer(StringSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<WebRichShareToFeedConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WebRichShareToFeedConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ShareTopic.CREATOR.createFromParcel(parcel));
            }
            return new WebRichShareToFeedConfig(string, arrayList, parcel.createStringArrayList(), parcel.readInt() == 0 ? null : ActivityCard.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WebRichShareToFeedConfig[] newArray(int i) {
            return new WebRichShareToFeedConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WebRichShareToFeedConfig() {
        this((String) null, (ArrayList) null, (ArrayList) null, (ActivityCard) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.planet_api.WebRichShareToFeedConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebRichShareToFeedConfig copy$default(WebRichShareToFeedConfig webRichShareToFeedConfig, String str, ArrayList arrayList, ArrayList arrayList2, ActivityCard activityCard, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webRichShareToFeedConfig.content;
        }
        if ((i & 2) != 0) {
            arrayList = webRichShareToFeedConfig.topics;
        }
        if ((i & 4) != 0) {
            arrayList2 = webRichShareToFeedConfig.imageList;
        }
        if ((i & 8) != 0) {
            activityCard = webRichShareToFeedConfig.activityCard;
        }
        return webRichShareToFeedConfig.copy(str, arrayList, arrayList2, activityCard);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ShareTopic> component2() {
        return this.topics;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component3() {
        return this.imageList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityCard component4() {
        return this.activityCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebRichShareToFeedConfig copy(String str, @NotNull ArrayList<ShareTopic> arrayList, @NotNull ArrayList<String> arrayList2, ActivityCard activityCard) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        return new WebRichShareToFeedConfig(str, arrayList, arrayList2, activityCard);
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
        if (!(obj instanceof WebRichShareToFeedConfig)) {
            return false;
        }
        WebRichShareToFeedConfig webRichShareToFeedConfig = (WebRichShareToFeedConfig) obj;
        return Intrinsics.EZpvd((Object) this.content, (Object) webRichShareToFeedConfig.content) && Intrinsics.EZpvd(this.topics, webRichShareToFeedConfig.topics) && Intrinsics.EZpvd(this.imageList, webRichShareToFeedConfig.imageList) && Intrinsics.EZpvd(this.activityCard, webRichShareToFeedConfig.activityCard);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityCard getActivityCard() {
        return this.activityCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getImageList() {
        return this.imageList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ShareTopic> getTopics() {
        return this.topics;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.content;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.topics.hashCode();
        int iHashCode3 = this.imageList.hashCode();
        ActivityCard activityCard = this.activityCard;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (activityCard != null ? activityCard.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WebRichShareToFeedConfig(content=" + this.content + ", topics=" + this.topics + ", imageList=" + this.imageList + ", activityCard=" + this.activityCard + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.content);
        ArrayList<ShareTopic> arrayList = this.topics;
        parcel.writeInt(arrayList.size());
        Iterator<ShareTopic> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.imageList);
        ActivityCard activityCard = this.activityCard;
        if (activityCard == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            activityCard.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet_api.WebRichShareToFeedConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WebRichShareToFeedConfig> serializer() {
            return WebRichShareToFeedConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WebRichShareToFeedConfig(int i, String str, ArrayList arrayList, ArrayList arrayList2, ActivityCard activityCard, SerializationConstructorMarker serializationConstructorMarker) {
        this.content = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.topics = new ArrayList<>();
        } else {
            this.topics = arrayList;
        }
        if ((i & 4) == 0) {
            this.imageList = new ArrayList<>();
        } else {
            this.imageList = arrayList2;
        }
        if ((i & 8) == 0) {
            this.activityCard = null;
        } else {
            this.activityCard = activityCard;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_api(WebRichShareToFeedConfig webRichShareToFeedConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) webRichShareToFeedConfig.content, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, webRichShareToFeedConfig.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(webRichShareToFeedConfig.topics, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], webRichShareToFeedConfig.topics);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(webRichShareToFeedConfig.imageList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], webRichShareToFeedConfig.imageList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && webRichShareToFeedConfig.activityCard == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, ActivityCard$$serializer.INSTANCE, webRichShareToFeedConfig.activityCard);
    }

    public WebRichShareToFeedConfig(String str, @NotNull ArrayList<ShareTopic> arrayList, @NotNull ArrayList<String> arrayList2, ActivityCard activityCard) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        this.content = str;
        this.topics = arrayList;
        this.imageList = arrayList2;
        this.activityCard = activityCard;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x000c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:56) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000f: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0015: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:57) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r3v0 java.util.ArrayList))
  (wrap:com.okinc.planet_api.ActivityCard:?: TERNARY null = ((wrap:int:0x0018: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.planet_api.ActivityCard) : (r4v0 com.okinc.planet_api.ActivityCard))
 A[MD:(java.lang.String, java.util.ArrayList<com.okinc.planet_api.ShareTopic>, java.util.ArrayList<java.lang.String>, com.okinc.planet_api.ActivityCard):void (m)] (LINE:54) call: com.okinc.planet_api.WebRichShareToFeedConfig.<init>(java.lang.String, java.util.ArrayList, java.util.ArrayList, com.okinc.planet_api.ActivityCard):void type: THIS */
    public /* synthetic */ WebRichShareToFeedConfig(String str, ArrayList arrayList, ArrayList arrayList2, ActivityCard activityCard, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? new ArrayList() : arrayList2, (i & 8) != 0 ? null : activityCard);
    }
}
