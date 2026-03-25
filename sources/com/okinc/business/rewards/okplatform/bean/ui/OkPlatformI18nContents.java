package com.okinc.business.rewards.okplatform.bean.ui;

import android.os.Parcel;
import android.os.Parcelable;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OkPlatformI18nContents implements Parcelable {
    private final List<String> availableLocales;
    private final List<I18nContentsItem> contents;
    private final String language;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OkPlatformI18nContents> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), new ArrayListSerializer(I18nContentsItem$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<OkPlatformI18nContents> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformI18nContents createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(I18nContentsItem.CREATOR.createFromParcel(parcel));
            }
            return new OkPlatformI18nContents(arrayListCreateStringArrayList, arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformI18nContents[] newArray(int i) {
            return new OkPlatformI18nContents[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.rewards.okplatform.bean.ui.OkPlatformI18nContents */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OkPlatformI18nContents copy$default(OkPlatformI18nContents okPlatformI18nContents, List list, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = okPlatformI18nContents.availableLocales;
        }
        if ((i & 2) != 0) {
            list2 = okPlatformI18nContents.contents;
        }
        if ((i & 4) != 0) {
            str = okPlatformI18nContents.language;
        }
        return okPlatformI18nContents.copy(list, list2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.availableLocales;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<I18nContentsItem> component2() {
        return this.contents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkPlatformI18nContents copy(@NotNull List<String> list, @NotNull List<I18nContentsItem> list2, String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new OkPlatformI18nContents(list, list2, str);
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
        if (!(obj instanceof OkPlatformI18nContents)) {
            return false;
        }
        OkPlatformI18nContents okPlatformI18nContents = (OkPlatformI18nContents) obj;
        return Intrinsics.EZpvd(this.availableLocales, okPlatformI18nContents.availableLocales) && Intrinsics.EZpvd(this.contents, okPlatformI18nContents.contents) && Intrinsics.EZpvd((Object) this.language, (Object) okPlatformI18nContents.language);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAvailableLocales() {
        return this.availableLocales;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<I18nContentsItem> getContents() {
        return this.contents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.availableLocales.hashCode();
        int iHashCode2 = this.contents.hashCode();
        String str = this.language;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OkPlatformI18nContents(availableLocales=" + this.availableLocales + ", contents=" + this.contents + ", language=" + this.language + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.availableLocales);
        List<I18nContentsItem> list = this.contents;
        parcel.writeInt(list.size());
        Iterator<I18nContentsItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.language);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.rewards.okplatform.bean.ui.OkPlatformI18nContents.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OkPlatformI18nContents> serializer() {
            return OkPlatformI18nContents$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OkPlatformI18nContents(int i, List list, List list2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, OkPlatformI18nContents$$serializer.INSTANCE.getDescriptor());
        }
        this.availableLocales = list;
        this.contents = list2;
        if ((i & 4) == 0) {
            this.language = "";
        } else {
            this.language = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_rewards_api(OkPlatformI18nContents okPlatformI18nContents, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], okPlatformI18nContents.availableLocales);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], okPlatformI18nContents.contents);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) okPlatformI18nContents.language, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, okPlatformI18nContents.language);
    }

    public OkPlatformI18nContents(@NotNull List<String> list, @NotNull List<I18nContentsItem> list2, String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.availableLocales = list;
        this.contents = list2;
        this.language = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.util.List)
  (r2v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.util.List<java.lang.String>, java.util.List<com.okinc.business.rewards.okplatform.bean.ui.I18nContentsItem>, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.rewards.okplatform.bean.ui.OkPlatformI18nContents.<init>(java.util.List, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ OkPlatformI18nContents(List list, List list2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i & 4) != 0 ? "" : str);
    }
}
