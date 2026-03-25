package com.okinc.okex.lite.home.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class LiteHomeOnboardingCardData implements Parcelable {

    @SerializedName("headerButtons")
    private final List<OnboardingButtonInfo> headerButtons;

    @SerializedName(TtmlNode.TAG_LAYOUT)
    private final int layout;

    @SerializedName("onboardingCard")
    private final OnboardingCardInfo onboardingCard;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LiteHomeOnboardingCardData> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(OnboardingButtonInfo$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<LiteHomeOnboardingCardData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiteHomeOnboardingCardData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = null;
            OnboardingCardInfo onboardingCardInfoCreateFromParcel = parcel.readInt() == 0 ? null : OnboardingCardInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList2.add(OnboardingButtonInfo.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new LiteHomeOnboardingCardData(i, onboardingCardInfoCreateFromParcel, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiteHomeOnboardingCardData[] newArray(int i) {
            return new LiteHomeOnboardingCardData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.lite.home.bean.LiteHomeOnboardingCardData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiteHomeOnboardingCardData copy$default(LiteHomeOnboardingCardData liteHomeOnboardingCardData, int i, OnboardingCardInfo onboardingCardInfo, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = liteHomeOnboardingCardData.layout;
        }
        if ((i2 & 2) != 0) {
            onboardingCardInfo = liteHomeOnboardingCardData.onboardingCard;
        }
        if ((i2 & 4) != 0) {
            list = liteHomeOnboardingCardData.headerButtons;
        }
        return liteHomeOnboardingCardData.OLrzqt(i, onboardingCardInfo, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiteHomeOnboardingCardData OLrzqt(int i, OnboardingCardInfo onboardingCardInfo, List<OnboardingButtonInfo> list) {
        return new LiteHomeOnboardingCardData(i, onboardingCardInfo, list);
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
        if (!(obj instanceof LiteHomeOnboardingCardData)) {
            return false;
        }
        LiteHomeOnboardingCardData liteHomeOnboardingCardData = (LiteHomeOnboardingCardData) obj;
        return this.layout == liteHomeOnboardingCardData.layout && Intrinsics.EZpvd(this.onboardingCard, liteHomeOnboardingCardData.onboardingCard) && Intrinsics.EZpvd(this.headerButtons, liteHomeOnboardingCardData.headerButtons);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.layout);
        OnboardingCardInfo onboardingCardInfo = this.onboardingCard;
        int iHashCode2 = onboardingCardInfo == null ? 0 : onboardingCardInfo.hashCode();
        List<OnboardingButtonInfo> list = this.headerButtons;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiteHomeOnboardingCardData(layout=" + this.layout + ", onboardingCard=" + this.onboardingCard + ", headerButtons=" + this.headerButtons + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.layout);
        OnboardingCardInfo onboardingCardInfo = this.onboardingCard;
        if (onboardingCardInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            onboardingCardInfo.writeToParcel(parcel, i);
        }
        List<OnboardingButtonInfo> list = this.headerButtons;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<OnboardingButtonInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.LiteHomeOnboardingCardData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LiteHomeOnboardingCardData> serializer() {
            return LiteHomeOnboardingCardData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LiteHomeOnboardingCardData(int i, int i2, OnboardingCardInfo onboardingCardInfo, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, LiteHomeOnboardingCardData$$serializer.INSTANCE.getDescriptor());
        }
        this.layout = i2;
        this.onboardingCard = onboardingCardInfo;
        if ((i & 4) == 0) {
            this.headerButtons = yDY.AhwBna();
        } else {
            this.headerButtons = list;
        }
    }

    public static final /* synthetic */ void KWHzl(LiteHomeOnboardingCardData liteHomeOnboardingCardData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, liteHomeOnboardingCardData.layout);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, OnboardingCardInfo$$serializer.INSTANCE, liteHomeOnboardingCardData.onboardingCard);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(liteHomeOnboardingCardData.headerButtons, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], liteHomeOnboardingCardData.headerButtons);
    }

    public LiteHomeOnboardingCardData(int i, OnboardingCardInfo onboardingCardInfo, List<OnboardingButtonInfo> list) {
        this.layout = i;
        this.onboardingCard = onboardingCardInfo;
        this.headerButtons = list;
    }
}
