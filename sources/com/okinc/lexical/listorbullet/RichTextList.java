package com.okinc.lexical.listorbullet;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock;
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
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class RichTextList extends BaseRichTextBlock {
    private List<RichTextListItem> children;
    private String listType;
    private int start;
    private String tag;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RichTextList> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(RichTextListItem$$serializer.INSTANCE), null, null, null};

    public static final class Creator implements Parcelable.Creator<RichTextList> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RichTextList createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(RichTextListItem.CREATOR.createFromParcel(parcel));
            }
            return new RichTextList(arrayList, parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RichTextList[] newArray(int i) {
            return new RichTextList[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.lexical.listorbullet.RichTextList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RichTextList copy$default(RichTextList richTextList, List list, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = richTextList.children;
        }
        if ((i2 & 2) != 0) {
            str = richTextList.listType;
        }
        if ((i2 & 4) != 0) {
            i = richTextList.start;
        }
        if ((i2 & 8) != 0) {
            str2 = richTextList.tag;
        }
        return richTextList.copy(list, str, i, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RichTextListItem> component1() {
        return this.children;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.listType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.start;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichTextList copy(@NotNull List<RichTextListItem> list, @NotNull String str, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new RichTextList(list, str, i, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichTextList)) {
            return false;
        }
        RichTextList richTextList = (RichTextList) obj;
        return Intrinsics.EZpvd(this.children, richTextList.children) && Intrinsics.EZpvd((Object) this.listType, (Object) richTextList.listType) && this.start == richTextList.start && Intrinsics.EZpvd((Object) this.tag, (Object) richTextList.tag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RichTextListItem> getChildren() {
        return this.children;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getListType() {
        return this.listType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStart() {
        return this.start;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.children.hashCode() * 31) + this.listType.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + this.tag.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChildren(@NotNull List<RichTextListItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.children = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setListType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.listType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStart(int i) {
        this.start = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock
    public String toString() {
        return "RichTextList(children=" + this.children + ", listType=" + this.listType + ", start=" + this.start + ", tag=" + this.tag + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<RichTextListItem> list = this.children;
        parcel.writeInt(list.size());
        Iterator<RichTextListItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.listType);
        parcel.writeInt(this.start);
        parcel.writeString(this.tag);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.lexical.listorbullet.RichTextList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RichTextList> serializer() {
            return RichTextList$$serializer.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: java.lang.String */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RichTextList(int i, int i2, String str, int i3, String str2, List list, String str3, int i4, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, (String) Integer.valueOf(i2), ((Number) str).intValue(), (String) Integer.valueOf(i3), ((Number) str2).intValue(), serializationConstructorMarker);
        if (176 != (i & CipherSuite.TLS_PSK_WITH_NULL_SHA256)) {
            PluginExceptionsKt.throwMissingFieldException(i, CipherSuite.TLS_PSK_WITH_NULL_SHA256, RichTextList$$serializer.INSTANCE.getDescriptor());
        }
        this.children = list;
        this.listType = str3;
        this.start = (i & 64) == 0 ? 0 : i4;
        this.tag = str4;
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_biz_rewards(RichTextList richTextList, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BaseRichTextBlock.write$Self(richTextList, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, $childSerializers[4], richTextList.children);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, richTextList.listType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || richTextList.start != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, richTextList.start);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, richTextList.tag);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.List)
  (r2v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (r4v0 java.lang.String)
 A[MD:(java.util.List<com.okinc.lexical.listorbullet.RichTextListItem>, java.lang.String, int, java.lang.String):void (m)] (LINE:11) call: com.okinc.lexical.listorbullet.RichTextList.<init>(java.util.List, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ RichTextList(List list, String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i2 & 4) != 0 ? 0 : i, str2);
    }

    public RichTextList(@NotNull List<RichTextListItem> list, @NotNull String str, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.children = list;
        this.listType = str;
        this.start = i;
        this.tag = str2;
    }
}
