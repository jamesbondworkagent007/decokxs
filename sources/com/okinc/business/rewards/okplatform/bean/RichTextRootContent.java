package com.okinc.business.rewards.okplatform.bean;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class RichTextRootContent implements Parcelable {
    private final List<BaseRichTextBlock> children;
    private final String direction;
    private final String format;
    private final int indent;
    private final String type;
    private final int version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RichTextRootContent> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(BaseRichTextBlock$$serializer.INSTANCE), null, null, null, null, null};

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<RichTextRootContent> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RichTextRootContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(RichTextRootContent.class.getClassLoader()));
            }
            return new RichTextRootContent(arrayList, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RichTextRootContent[] newArray(int i) {
            return new RichTextRootContent[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.rewards.okplatform.bean.RichTextRootContent */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RichTextRootContent copy$default(RichTextRootContent richTextRootContent, List list, String str, String str2, int i, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = richTextRootContent.children;
        }
        if ((i3 & 2) != 0) {
            str = richTextRootContent.direction;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            str2 = richTextRootContent.format;
        }
        String str5 = str2;
        if ((i3 & 8) != 0) {
            i = richTextRootContent.indent;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            str3 = richTextRootContent.type;
        }
        String str6 = str3;
        if ((i3 & 32) != 0) {
            i2 = richTextRootContent.version;
        }
        return richTextRootContent.copy(list, str4, str5, i4, str6, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BaseRichTextBlock> component1() {
        return this.children;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.format;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.indent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichTextRootContent copy(@NotNull List<BaseRichTextBlock> list, @NotNull String str, @NotNull String str2, int i, @NotNull String str3, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new RichTextRootContent(list, str, str2, i, str3, i2);
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
        if (!(obj instanceof RichTextRootContent)) {
            return false;
        }
        RichTextRootContent richTextRootContent = (RichTextRootContent) obj;
        return Intrinsics.EZpvd(this.children, richTextRootContent.children) && Intrinsics.EZpvd((Object) this.direction, (Object) richTextRootContent.direction) && Intrinsics.EZpvd((Object) this.format, (Object) richTextRootContent.format) && this.indent == richTextRootContent.indent && Intrinsics.EZpvd((Object) this.type, (Object) richTextRootContent.type) && this.version == richTextRootContent.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BaseRichTextBlock> getChildren() {
        return this.children;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFormat() {
        return this.format;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIndent() {
        return this.indent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.children.hashCode() * 31) + this.direction.hashCode()) * 31) + this.format.hashCode()) * 31) + Integer.hashCode(this.indent)) * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.version);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RichTextRootContent(children=" + this.children + ", direction=" + this.direction + ", format=" + this.format + ", indent=" + this.indent + ", type=" + this.type + ", version=" + this.version + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<BaseRichTextBlock> list = this.children;
        parcel.writeInt(list.size());
        Iterator<BaseRichTextBlock> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeString(this.direction);
        parcel.writeString(this.format);
        parcel.writeInt(this.indent);
        parcel.writeString(this.type);
        parcel.writeInt(this.version);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.rewards.okplatform.bean.RichTextRootContent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RichTextRootContent> serializer() {
            return RichTextRootContent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RichTextRootContent(int i, List list, String str, String str2, int i2, String str3, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, RichTextRootContent$$serializer.INSTANCE.getDescriptor());
        }
        this.children = list;
        this.direction = str;
        this.format = str2;
        this.indent = i2;
        this.type = str3;
        this.version = i3;
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_rewards_api(RichTextRootContent richTextRootContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], richTextRootContent.children);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, richTextRootContent.direction);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, richTextRootContent.format);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, richTextRootContent.indent);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, richTextRootContent.type);
        compositeEncoder.encodeIntElement(serialDescriptor, 5, richTextRootContent.version);
    }

    public RichTextRootContent(@NotNull List<BaseRichTextBlock> list, @NotNull String str, @NotNull String str2, int i, @NotNull String str3, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.children = list;
        this.direction = str;
        this.format = str2;
        this.indent = i;
        this.type = str3;
        this.version = i2;
    }
}
