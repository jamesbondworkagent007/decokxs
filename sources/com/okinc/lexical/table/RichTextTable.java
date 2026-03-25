package com.okinc.lexical.table;

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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class RichTextTable extends BaseRichTextBlock {
    private final List<RichTextTableRow> children;
    private final String tag;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RichTextTable> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(RichTextTableRow$$serializer.INSTANCE), null};

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<RichTextTable> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RichTextTable createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(RichTextTableRow.CREATOR.createFromParcel(parcel));
            }
            return new RichTextTable(arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RichTextTable[] newArray(int i) {
            return new RichTextTable[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.lexical.table.RichTextTable */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RichTextTable copy$default(RichTextTable richTextTable, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = richTextTable.children;
        }
        if ((i & 2) != 0) {
            str = richTextTable.tag;
        }
        return richTextTable.copy(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RichTextTableRow> component1() {
        return this.children;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichTextTable copy(@NotNull List<RichTextTableRow> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new RichTextTable(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichTextTable)) {
            return false;
        }
        RichTextTable richTextTable = (RichTextTable) obj;
        return Intrinsics.EZpvd(this.children, richTextTable.children) && Intrinsics.EZpvd((Object) this.tag, (Object) richTextTable.tag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RichTextTableRow> getChildren() {
        return this.children;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.children.hashCode() * 31) + this.tag.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock
    public String toString() {
        return "RichTextTable(children=" + this.children + ", tag=" + this.tag + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<RichTextTableRow> list = this.children;
        parcel.writeInt(list.size());
        Iterator<RichTextTableRow> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.tag);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.lexical.table.RichTextTable.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RichTextTable> serializer() {
            return RichTextTable$$serializer.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: java.lang.String */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RichTextTable(int i, int i2, String str, int i3, String str2, List list, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, (String) Integer.valueOf(i2), ((Number) str).intValue(), (String) Integer.valueOf(i3), ((Number) str2).intValue(), serializationConstructorMarker);
        if (48 != (i & 48)) {
            PluginExceptionsKt.throwMissingFieldException(i, 48, RichTextTable$$serializer.INSTANCE.getDescriptor());
        }
        this.children = list;
        this.tag = str3;
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_biz_rewards(RichTextTable richTextTable, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BaseRichTextBlock.write$Self(richTextTable, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, $childSerializers[4], richTextTable.children);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, richTextTable.tag);
    }

    public RichTextTable(@NotNull List<RichTextTableRow> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.children = list;
        this.tag = str;
    }
}
