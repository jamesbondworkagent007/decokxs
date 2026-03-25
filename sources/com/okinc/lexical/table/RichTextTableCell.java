package com.okinc.lexical.table;

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
public final class RichTextTableCell extends BaseRichTextBlock {
    private String backgroundColor;
    private final List<BaseRichTextBlock> children;
    private int colSpan;
    private int headerState;
    private int rowSpan;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RichTextTableCell> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(BaseRichTextBlock$$serializer.INSTANCE), null, null, null, null};

    public static final class Creator implements Parcelable.Creator<RichTextTableCell> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RichTextTableCell createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(RichTextTableCell.class.getClassLoader()));
            }
            return new RichTextTableCell(arrayList, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RichTextTableCell[] newArray(int i) {
            return new RichTextTableCell[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.lexical.table.RichTextTableCell */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RichTextTableCell copy$default(RichTextTableCell richTextTableCell, List list, int i, int i2, String str, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = richTextTableCell.children;
        }
        if ((i4 & 2) != 0) {
            i = richTextTableCell.colSpan;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = richTextTableCell.rowSpan;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            str = richTextTableCell.backgroundColor;
        }
        String str2 = str;
        if ((i4 & 16) != 0) {
            i3 = richTextTableCell.headerState;
        }
        return richTextTableCell.copy(list, i5, i6, str2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BaseRichTextBlock> component1() {
        return this.children;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.colSpan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.rowSpan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.backgroundColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.headerState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichTextTableCell copy(@NotNull List<BaseRichTextBlock> list, int i, int i2, @NotNull String str, int i3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new RichTextTableCell(list, i, i2, str, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichTextTableCell)) {
            return false;
        }
        RichTextTableCell richTextTableCell = (RichTextTableCell) obj;
        return Intrinsics.EZpvd(this.children, richTextTableCell.children) && this.colSpan == richTextTableCell.colSpan && this.rowSpan == richTextTableCell.rowSpan && Intrinsics.EZpvd((Object) this.backgroundColor, (Object) richTextTableCell.backgroundColor) && this.headerState == richTextTableCell.headerState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BaseRichTextBlock> getChildren() {
        return this.children;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getColSpan() {
        return this.colSpan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getHeaderState() {
        return this.headerState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRowSpan() {
        return this.rowSpan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.children.hashCode() * 31) + Integer.hashCode(this.colSpan)) * 31) + Integer.hashCode(this.rowSpan)) * 31) + this.backgroundColor.hashCode()) * 31) + Integer.hashCode(this.headerState);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBackgroundColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.backgroundColor = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setColSpan(int i) {
        this.colSpan = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeaderState(int i) {
        this.headerState = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRowSpan(int i) {
        this.rowSpan = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock
    public String toString() {
        return "RichTextTableCell(children=" + this.children + ", colSpan=" + this.colSpan + ", rowSpan=" + this.rowSpan + ", backgroundColor=" + this.backgroundColor + ", headerState=" + this.headerState + ")";
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
        parcel.writeInt(this.colSpan);
        parcel.writeInt(this.rowSpan);
        parcel.writeString(this.backgroundColor);
        parcel.writeInt(this.headerState);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.lexical.table.RichTextTableCell.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RichTextTableCell> serializer() {
            return RichTextTableCell$$serializer.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: java.lang.String */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RichTextTableCell(int i, int i2, String str, int i3, String str2, List list, int i4, int i5, String str3, int i6, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, (String) Integer.valueOf(i2), ((Number) str).intValue(), (String) Integer.valueOf(i3), ((Number) str2).intValue(), serializationConstructorMarker);
        if (496 != (i & 496)) {
            PluginExceptionsKt.throwMissingFieldException(i, 496, RichTextTableCell$$serializer.INSTANCE.getDescriptor());
        }
        this.children = list;
        this.colSpan = i4;
        this.rowSpan = i5;
        this.backgroundColor = str3;
        this.headerState = i6;
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_biz_rewards(RichTextTableCell richTextTableCell, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BaseRichTextBlock.write$Self(richTextTableCell, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, $childSerializers[4], richTextTableCell.children);
        compositeEncoder.encodeIntElement(serialDescriptor, 5, richTextTableCell.colSpan);
        compositeEncoder.encodeIntElement(serialDescriptor, 6, richTextTableCell.rowSpan);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, richTextTableCell.backgroundColor);
        compositeEncoder.encodeIntElement(serialDescriptor, 8, richTextTableCell.headerState);
    }

    public RichTextTableCell(@NotNull List<BaseRichTextBlock> list, int i, int i2, @NotNull String str, int i3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.children = list;
        this.colSpan = i;
        this.rowSpan = i2;
        this.backgroundColor = str;
        this.headerState = i3;
    }
}
