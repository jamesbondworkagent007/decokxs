package com.okinc.lexical.listorbullet;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock;
import com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock$$serializer;
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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class RichTextListItem extends BaseRichTextBlock {
    private final List<BaseRichTextBlock> children;
    private final int value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RichTextListItem> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(BaseRichTextBlock$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<RichTextListItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RichTextListItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(RichTextListItem.class.getClassLoader()));
            }
            return new RichTextListItem(arrayList, parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RichTextListItem[] newArray(int i) {
            return new RichTextListItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.lexical.listorbullet.RichTextListItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RichTextListItem copy$default(RichTextListItem richTextListItem, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = richTextListItem.children;
        }
        if ((i2 & 2) != 0) {
            i = richTextListItem.value;
        }
        return richTextListItem.copy(list, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BaseRichTextBlock> component1() {
        return this.children;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichTextListItem copy(@NotNull List<BaseRichTextBlock> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        return new RichTextListItem(list, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichTextListItem)) {
            return false;
        }
        RichTextListItem richTextListItem = (RichTextListItem) obj;
        return Intrinsics.EZpvd(this.children, richTextListItem.children) && this.value == richTextListItem.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BaseRichTextBlock> getChildren() {
        return this.children;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.children.hashCode() * 31) + Integer.hashCode(this.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock
    public String toString() {
        return "RichTextListItem(children=" + this.children + ", value=" + this.value + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<BaseRichTextBlock> list = this.children;
        parcel.writeInt(list.size());
        Iterator<BaseRichTextBlock> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeInt(this.value);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.lexical.listorbullet.RichTextListItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RichTextListItem> serializer() {
            return RichTextListItem$$serializer.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: java.lang.String */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RichTextListItem(int i, int i2, String str, int i3, String str2, List list, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, (String) Integer.valueOf(i2), ((Number) str).intValue(), (String) Integer.valueOf(i3), ((Number) str2).intValue(), serializationConstructorMarker);
        if (48 != (i & 48)) {
            PluginExceptionsKt.throwMissingFieldException(i, 48, RichTextListItem$$serializer.INSTANCE.getDescriptor());
        }
        this.children = list;
        this.value = i4;
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_biz_rewards(RichTextListItem richTextListItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BaseRichTextBlock.write$Self(richTextListItem, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, $childSerializers[4], richTextListItem.children);
        compositeEncoder.encodeIntElement(serialDescriptor, 5, richTextListItem.value);
    }

    public RichTextListItem(@NotNull List<BaseRichTextBlock> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        this.children = list;
        this.value = i;
    }
}
