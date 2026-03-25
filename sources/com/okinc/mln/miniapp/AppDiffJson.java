package com.okinc.mln.miniapp;

import android.os.Parcel;
import android.os.Parcelable;
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

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class AppDiffJson implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private List<String> added;
    private List<String> deleted;
    private String fullpackagemd5;
    private List<String> modified;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AppDiffJson> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AppDiffJson> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppDiffJson createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AppDiffJson(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppDiffJson[] newArray(int i) {
            return new AppDiffJson[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.mln.miniapp.AppDiffJson */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppDiffJson copy$default(AppDiffJson appDiffJson, List list, List list2, List list3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = appDiffJson.added;
        }
        if ((i & 2) != 0) {
            list2 = appDiffJson.modified;
        }
        if ((i & 4) != 0) {
            list3 = appDiffJson.deleted;
        }
        if ((i & 8) != 0) {
            str = appDiffJson.fullpackagemd5;
        }
        return appDiffJson.copy(list, list2, list3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.added;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.modified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.deleted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fullpackagemd5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppDiffJson copy(List<String> list, List<String> list2, List<String> list3, String str) {
        return new AppDiffJson(list, list2, list3, str);
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
        if (!(obj instanceof AppDiffJson)) {
            return false;
        }
        AppDiffJson appDiffJson = (AppDiffJson) obj;
        return Intrinsics.EZpvd(this.added, appDiffJson.added) && Intrinsics.EZpvd(this.modified, appDiffJson.modified) && Intrinsics.EZpvd(this.deleted, appDiffJson.deleted) && Intrinsics.EZpvd((Object) this.fullpackagemd5, (Object) appDiffJson.fullpackagemd5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAdded() {
        return this.added;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getDeleted() {
        return this.deleted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullpackagemd5() {
        return this.fullpackagemd5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getModified() {
        return this.modified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<String> list = this.added;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<String> list2 = this.modified;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        List<String> list3 = this.deleted;
        int iHashCode3 = list3 == null ? 0 : list3.hashCode();
        String str = this.fullpackagemd5;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdded(List<String> list) {
        this.added = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeleted(List<String> list) {
        this.deleted = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFullpackagemd5(String str) {
        this.fullpackagemd5 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setModified(List<String> list) {
        this.modified = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AppDiffJson(added=" + this.added + ", modified=" + this.modified + ", deleted=" + this.deleted + ", fullpackagemd5=" + this.fullpackagemd5 + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.added);
        parcel.writeStringList(this.modified);
        parcel.writeStringList(this.deleted);
        parcel.writeString(this.fullpackagemd5);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.mln.miniapp.AppDiffJson.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AppDiffJson> serializer() {
            return AppDiffJson$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null};
    }

    public /* synthetic */ AppDiffJson(int i, List list, List list2, List list3, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, AppDiffJson$$serializer.INSTANCE.getDescriptor());
        }
        this.added = list;
        this.modified = list2;
        this.deleted = list3;
        if ((i & 8) == 0) {
            this.fullpackagemd5 = "";
        } else {
            this.fullpackagemd5 = str;
        }
    }

    public static final /* synthetic */ void write$Self$MLN_mlnservics(AppDiffJson appDiffJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], appDiffJson.added);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], appDiffJson.modified);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], appDiffJson.deleted);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) appDiffJson.fullpackagemd5, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, appDiffJson.fullpackagemd5);
    }

    public AppDiffJson(List<String> list, List<String> list2, List<String> list3, String str) {
        this.added = list;
        this.modified = list2;
        this.deleted = list3;
        this.fullpackagemd5 = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.util.List)
  (r2v0 java.util.List)
  (r3v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.String):void (m)] (LINE:11) call: com.okinc.mln.miniapp.AppDiffJson.<init>(java.util.List, java.util.List, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ AppDiffJson(List list, List list2, List list3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, (i & 8) != 0 ? "" : str);
    }
}
