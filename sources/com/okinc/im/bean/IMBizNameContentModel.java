package com.okinc.im.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class IMBizNameContentModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String bizName;
    private final String content;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ IMBizNameContentModel copy$default(IMBizNameContentModel iMBizNameContentModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iMBizNameContentModel.bizName;
        }
        if ((i & 2) != 0) {
            str2 = iMBizNameContentModel.content;
        }
        return iMBizNameContentModel.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.bizName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IMBizNameContentModel copy(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new IMBizNameContentModel(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMBizNameContentModel)) {
            return false;
        }
        IMBizNameContentModel iMBizNameContentModel = (IMBizNameContentModel) obj;
        return Intrinsics.EZpvd((Object) this.bizName, (Object) iMBizNameContentModel.bizName) && Intrinsics.EZpvd((Object) this.content, (Object) iMBizNameContentModel.content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizName() {
        return this.bizName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.bizName.hashCode();
        String str = this.content;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IMBizNameContentModel(bizName=" + this.bizName + ", content=" + this.content + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.bean.IMBizNameContentModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IMBizNameContentModel> serializer() {
            return IMBizNameContentModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IMBizNameContentModel(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, IMBizNameContentModel$$serializer.INSTANCE.getDescriptor());
        }
        this.bizName = str;
        this.content = str2;
    }

    public static final /* synthetic */ void write$Self$OKIM_okim_api(IMBizNameContentModel iMBizNameContentModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, iMBizNameContentModel.bizName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, iMBizNameContentModel.content);
    }

    public IMBizNameContentModel(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bizName = str;
        this.content = str2;
    }
}
