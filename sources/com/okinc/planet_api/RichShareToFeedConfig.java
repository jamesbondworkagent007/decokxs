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
public final class RichShareToFeedConfig implements Parcelable {
    private final ActivityCard activityCard;
    private final String content;
    private final ArrayList<RichShareToFeedImage> imageList;
    private final ArrayList<ShareTopic> topics;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RichShareToFeedConfig> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(ShareTopic$$serializer.INSTANCE), new ArrayListSerializer(RichShareToFeedImage$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<RichShareToFeedConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RichShareToFeedConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ShareTopic.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(RichShareToFeedImage.CREATOR.createFromParcel(parcel));
            }
            return new RichShareToFeedConfig(string, arrayList, arrayList2, parcel.readInt() == 0 ? null : ActivityCard.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RichShareToFeedConfig[] newArray(int i) {
            return new RichShareToFeedConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RichShareToFeedConfig() {
        this((String) null, (ArrayList) null, (ArrayList) null, (ActivityCard) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.planet_api.RichShareToFeedConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RichShareToFeedConfig copy$default(RichShareToFeedConfig richShareToFeedConfig, String str, ArrayList arrayList, ArrayList arrayList2, ActivityCard activityCard, int i, Object obj) {
        if ((i & 1) != 0) {
            str = richShareToFeedConfig.content;
        }
        if ((i & 2) != 0) {
            arrayList = richShareToFeedConfig.topics;
        }
        if ((i & 4) != 0) {
            arrayList2 = richShareToFeedConfig.imageList;
        }
        if ((i & 8) != 0) {
            activityCard = richShareToFeedConfig.activityCard;
        }
        return richShareToFeedConfig.copy(str, arrayList, arrayList2, activityCard);
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
    public final ArrayList<RichShareToFeedImage> component3() {
        return this.imageList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityCard component4() {
        return this.activityCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichShareToFeedConfig copy(String str, @NotNull ArrayList<ShareTopic> arrayList, @NotNull ArrayList<RichShareToFeedImage> arrayList2, ActivityCard activityCard) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        return new RichShareToFeedConfig(str, arrayList, arrayList2, activityCard);
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
        if (!(obj instanceof RichShareToFeedConfig)) {
            return false;
        }
        RichShareToFeedConfig richShareToFeedConfig = (RichShareToFeedConfig) obj;
        return Intrinsics.EZpvd((Object) this.content, (Object) richShareToFeedConfig.content) && Intrinsics.EZpvd(this.topics, richShareToFeedConfig.topics) && Intrinsics.EZpvd(this.imageList, richShareToFeedConfig.imageList) && Intrinsics.EZpvd(this.activityCard, richShareToFeedConfig.activityCard);
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
    public final ArrayList<RichShareToFeedImage> getImageList() {
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
        return "RichShareToFeedConfig(content=" + this.content + ", topics=" + this.topics + ", imageList=" + this.imageList + ", activityCard=" + this.activityCard + ")";
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
        ArrayList<RichShareToFeedImage> arrayList2 = this.imageList;
        parcel.writeInt(arrayList2.size());
        Iterator<RichShareToFeedImage> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet_api.RichShareToFeedConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RichShareToFeedConfig> serializer() {
            return RichShareToFeedConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RichShareToFeedConfig(int i, String str, ArrayList arrayList, ArrayList arrayList2, ActivityCard activityCard, SerializationConstructorMarker serializationConstructorMarker) {
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

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_api(RichShareToFeedConfig richShareToFeedConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) richShareToFeedConfig.content, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, richShareToFeedConfig.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(richShareToFeedConfig.topics, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], richShareToFeedConfig.topics);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(richShareToFeedConfig.imageList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], richShareToFeedConfig.imageList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && richShareToFeedConfig.activityCard == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, ActivityCard$$serializer.INSTANCE, richShareToFeedConfig.activityCard);
    }

    public RichShareToFeedConfig(String str, @NotNull ArrayList<ShareTopic> arrayList, @NotNull ArrayList<RichShareToFeedImage> arrayList2, ActivityCard activityCard) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        this.content = str;
        this.topics = arrayList;
        this.imageList = arrayList2;
        this.activityCard = activityCard;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x000c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:46) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000f: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0015: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:47) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r3v0 java.util.ArrayList))
  (wrap:com.okinc.planet_api.ActivityCard:?: TERNARY null = ((wrap:int:0x0018: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.planet_api.ActivityCard) : (r4v0 com.okinc.planet_api.ActivityCard))
 A[MD:(java.lang.String, java.util.ArrayList<com.okinc.planet_api.ShareTopic>, java.util.ArrayList<com.okinc.planet_api.RichShareToFeedImage>, com.okinc.planet_api.ActivityCard):void (m)] (LINE:44) call: com.okinc.planet_api.RichShareToFeedConfig.<init>(java.lang.String, java.util.ArrayList, java.util.ArrayList, com.okinc.planet_api.ActivityCard):void type: THIS */
    public /* synthetic */ RichShareToFeedConfig(String str, ArrayList arrayList, ArrayList arrayList2, ActivityCard activityCard, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? new ArrayList() : arrayList2, (i & 8) != 0 ? null : activityCard);
    }
}
