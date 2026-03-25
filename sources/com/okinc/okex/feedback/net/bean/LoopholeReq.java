package com.okinc.okex.feedback.net.bean;

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
public final class LoopholeReq {
    private final List<FileAttach> attach;
    private final int childId;
    private final String content;
    private final int mainCategoryId;
    private final String title;
    private final int type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(FileAttach$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.okex.feedback.net.bean.LoopholeReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoopholeReq copy$default(LoopholeReq loopholeReq, int i, int i2, String str, String str2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = loopholeReq.mainCategoryId;
        }
        if ((i4 & 2) != 0) {
            i2 = loopholeReq.childId;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            str = loopholeReq.title;
        }
        String str3 = str;
        if ((i4 & 8) != 0) {
            str2 = loopholeReq.content;
        }
        String str4 = str2;
        if ((i4 & 16) != 0) {
            i3 = loopholeReq.type;
        }
        int i6 = i3;
        if ((i4 & 32) != 0) {
            list = loopholeReq.attach;
        }
        return loopholeReq.copy(i, i5, str3, str4, i6, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.mainCategoryId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.childId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FileAttach> component6() {
        return this.attach;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LoopholeReq copy(int i, int i2, @NotNull String str, @NotNull String str2, int i3, List<FileAttach> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new LoopholeReq(i, i2, str, str2, i3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoopholeReq)) {
            return false;
        }
        LoopholeReq loopholeReq = (LoopholeReq) obj;
        return this.mainCategoryId == loopholeReq.mainCategoryId && this.childId == loopholeReq.childId && Intrinsics.EZpvd((Object) this.title, (Object) loopholeReq.title) && Intrinsics.EZpvd((Object) this.content, (Object) loopholeReq.content) && this.type == loopholeReq.type && Intrinsics.EZpvd(this.attach, loopholeReq.attach);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FileAttach> getAttach() {
        return this.attach;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChildId() {
        return this.childId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMainCategoryId() {
        return this.mainCategoryId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.mainCategoryId);
        int iHashCode2 = Integer.hashCode(this.childId);
        int iHashCode3 = this.title.hashCode();
        int iHashCode4 = this.content.hashCode();
        int iHashCode5 = Integer.hashCode(this.type);
        List<FileAttach> list = this.attach;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LoopholeReq(mainCategoryId=" + this.mainCategoryId + ", childId=" + this.childId + ", title=" + this.title + ", content=" + this.content + ", type=" + this.type + ", attach=" + this.attach + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.feedback.net.bean.LoopholeReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LoopholeReq> serializer() {
            return LoopholeReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LoopholeReq(int i, int i2, int i3, String str, String str2, int i4, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, LoopholeReq$$serializer.INSTANCE.getDescriptor());
        }
        this.mainCategoryId = i2;
        this.childId = i3;
        this.title = str;
        this.content = str2;
        this.type = i4;
        if ((i & 32) == 0) {
            this.attach = null;
        } else {
            this.attach = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(LoopholeReq loopholeReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, loopholeReq.mainCategoryId);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, loopholeReq.childId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, loopholeReq.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, loopholeReq.content);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, loopholeReq.type);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && loopholeReq.attach == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], loopholeReq.attach);
    }

    public LoopholeReq(int i, int i2, @NotNull String str, @NotNull String str2, int i3, List<FileAttach> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.mainCategoryId = i;
        this.childId = i2;
        this.title = str;
        this.content = str2;
        this.type = i3;
        this.attach = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r8v0 int)
  (r9v0 int)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 int)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r13v0 java.util.List))
 A[MD:(int, int, java.lang.String, java.lang.String, int, java.util.List<com.okinc.okex.feedback.net.bean.FileAttach>):void (m)] (LINE:39) call: com.okinc.okex.feedback.net.bean.LoopholeReq.<init>(int, int, java.lang.String, java.lang.String, int, java.util.List):void type: THIS */
    public /* synthetic */ LoopholeReq(int i, int i2, String str, String str2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, str2, i3, (i4 & 32) != 0 ? null : list);
    }
}
