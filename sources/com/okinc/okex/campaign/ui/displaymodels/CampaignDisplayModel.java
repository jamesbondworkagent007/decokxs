package com.okinc.okex.campaign.ui.displaymodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okex.campaign.bean.CampaignStatus;
import com.okinc.okex.campaign.bean.RedirectTarget;
import com.okinc.okex.campaign.bean.RedirectTarget$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class CampaignDisplayModel implements Parcelable {
    private final long endTime;
    private final ArrayList<RedirectTarget> redirectList;
    private final String slug;
    private final CampaignStatus status;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CampaignDisplayModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.okex.campaign.bean.CampaignStatus", CampaignStatus.values()), new ArrayListSerializer(RedirectTarget$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<CampaignDisplayModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CampaignDisplayModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            long j = parcel.readLong();
            String string2 = parcel.readString();
            CampaignStatus campaignStatusValueOf = CampaignStatus.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(RedirectTarget.CREATOR.createFromParcel(parcel));
            }
            return new CampaignDisplayModel(string, j, string2, campaignStatusValueOf, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CampaignDisplayModel[] newArray(int i) {
            return new CampaignDisplayModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.okex.campaign.ui.displaymodels.CampaignDisplayModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CampaignDisplayModel copy$default(CampaignDisplayModel campaignDisplayModel, String str, long j, String str2, CampaignStatus campaignStatus, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = campaignDisplayModel.title;
        }
        if ((i & 2) != 0) {
            j = campaignDisplayModel.endTime;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = campaignDisplayModel.slug;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            campaignStatus = campaignDisplayModel.status;
        }
        CampaignStatus campaignStatus2 = campaignStatus;
        if ((i & 16) != 0) {
            arrayList = campaignDisplayModel.redirectList;
        }
        return campaignDisplayModel.copy(str, j2, str3, campaignStatus2, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CampaignStatus component4() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<RedirectTarget> component5() {
        return this.redirectList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CampaignDisplayModel copy(@NotNull String str, long j, @NotNull String str2, @NotNull CampaignStatus campaignStatus, @NotNull ArrayList<RedirectTarget> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(campaignStatus, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new CampaignDisplayModel(str, j, str2, campaignStatus, arrayList);
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
        if (!(obj instanceof CampaignDisplayModel)) {
            return false;
        }
        CampaignDisplayModel campaignDisplayModel = (CampaignDisplayModel) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) campaignDisplayModel.title) && this.endTime == campaignDisplayModel.endTime && Intrinsics.EZpvd((Object) this.slug, (Object) campaignDisplayModel.slug) && this.status == campaignDisplayModel.status && Intrinsics.EZpvd(this.redirectList, campaignDisplayModel.redirectList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<RedirectTarget> getRedirectList() {
        return this.redirectList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlug() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CampaignStatus getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + Long.hashCode(this.endTime)) * 31) + this.slug.hashCode()) * 31) + this.status.hashCode()) * 31) + this.redirectList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CampaignDisplayModel(title=" + this.title + ", endTime=" + this.endTime + ", slug=" + this.slug + ", status=" + this.status + ", redirectList=" + this.redirectList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeLong(this.endTime);
        parcel.writeString(this.slug);
        parcel.writeString(this.status.name());
        ArrayList<RedirectTarget> arrayList = this.redirectList;
        parcel.writeInt(arrayList.size());
        Iterator<RedirectTarget> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.campaign.ui.displaymodels.CampaignDisplayModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CampaignDisplayModel> serializer() {
            return CampaignDisplayModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CampaignDisplayModel(int i, String str, long j, String str2, CampaignStatus campaignStatus, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, CampaignDisplayModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.endTime = j;
        this.slug = str2;
        this.status = campaignStatus;
        this.redirectList = arrayList;
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(CampaignDisplayModel campaignDisplayModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, campaignDisplayModel.title);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, campaignDisplayModel.endTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, campaignDisplayModel.slug);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], campaignDisplayModel.status);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], campaignDisplayModel.redirectList);
    }

    public CampaignDisplayModel(@NotNull String str, long j, @NotNull String str2, @NotNull CampaignStatus campaignStatus, @NotNull ArrayList<RedirectTarget> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(campaignStatus, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.title = str;
        this.endTime = j;
        this.slug = str2;
        this.status = campaignStatus;
        this.redirectList = arrayList;
    }
}
