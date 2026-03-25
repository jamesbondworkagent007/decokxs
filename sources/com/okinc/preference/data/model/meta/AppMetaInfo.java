package com.okinc.preference.data.model.meta;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class AppMetaInfo {
    public final List<String> captchaVendors;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.preference.data.model.meta.AppMetaInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppMetaInfo copy$default(AppMetaInfo appMetaInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = appMetaInfo.captchaVendors;
        }
        return appMetaInfo.KWHzl(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppMetaInfo KWHzl(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new AppMetaInfo(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> KWHzl() {
        return this.captchaVendors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppMetaInfo) && Intrinsics.EZpvd(this.captchaVendors, ((AppMetaInfo) obj).captchaVendors);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.captchaVendors.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AppMetaInfo(captchaVendors=" + this.captchaVendors + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.preference.data.model.meta.AppMetaInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AppMetaInfo> serializer() {
            return AppMetaInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AppMetaInfo(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, AppMetaInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.captchaVendors = list;
    }

    public AppMetaInfo(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.captchaVendors = list;
    }
}
