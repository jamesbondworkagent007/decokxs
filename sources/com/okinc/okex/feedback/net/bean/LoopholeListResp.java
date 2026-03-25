package com.okinc.okex.feedback.net.bean;

import java.util.ArrayList;
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
public final class LoopholeListResp {
    private final ArrayList<LoopholeResp> list;
    private final int pageNum;
    private final int pageSize;
    private final int total;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(LoopholeResp$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.feedback.net.bean.LoopholeListResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoopholeListResp copy$default(LoopholeListResp loopholeListResp, int i, int i2, int i3, ArrayList arrayList, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = loopholeListResp.pageSize;
        }
        if ((i4 & 2) != 0) {
            i2 = loopholeListResp.pageNum;
        }
        if ((i4 & 4) != 0) {
            i3 = loopholeListResp.total;
        }
        if ((i4 & 8) != 0) {
            arrayList = loopholeListResp.list;
        }
        return loopholeListResp.copy(i, i2, i3, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<LoopholeResp> component4() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LoopholeListResp copy(int i, int i2, int i3, @NotNull ArrayList<LoopholeResp> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new LoopholeListResp(i, i2, i3, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoopholeListResp)) {
            return false;
        }
        LoopholeListResp loopholeListResp = (LoopholeListResp) obj;
        return this.pageSize == loopholeListResp.pageSize && this.pageNum == loopholeListResp.pageNum && this.total == loopholeListResp.total && Intrinsics.EZpvd(this.list, loopholeListResp.list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<LoopholeResp> getList() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageNum() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.pageSize) * 31) + Integer.hashCode(this.pageNum)) * 31) + Integer.hashCode(this.total)) * 31) + this.list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LoopholeListResp(pageSize=" + this.pageSize + ", pageNum=" + this.pageNum + ", total=" + this.total + ", list=" + this.list + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.feedback.net.bean.LoopholeListResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LoopholeListResp> serializer() {
            return LoopholeListResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LoopholeListResp(int i, int i2, int i3, int i4, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, LoopholeListResp$$serializer.INSTANCE.getDescriptor());
        }
        this.pageSize = i2;
        this.pageNum = i3;
        this.total = i4;
        this.list = arrayList;
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(LoopholeListResp loopholeListResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, loopholeListResp.pageSize);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, loopholeListResp.pageNum);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, loopholeListResp.total);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], loopholeListResp.list);
    }

    public LoopholeListResp(int i, int i2, int i3, @NotNull ArrayList<LoopholeResp> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.pageSize = i;
        this.pageNum = i2;
        this.total = i3;
        this.list = arrayList;
    }
}
