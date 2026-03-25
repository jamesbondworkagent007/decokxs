package com.okinc.business.dexlogic.bean;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class BlackListTypes {
    private final List<String> blackListTypes;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexlogic.bean.BlackListTypes */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BlackListTypes copy$default(BlackListTypes blackListTypes, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = blackListTypes.blackListTypes;
        }
        return blackListTypes.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.blackListTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BlackListTypes copy(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new BlackListTypes(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlackListTypes) && Intrinsics.EZpvd(this.blackListTypes, ((BlackListTypes) obj).blackListTypes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getBlackListTypes() {
        return this.blackListTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.blackListTypes.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BlackListTypes(blackListTypes=" + this.blackListTypes + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.BlackListTypes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BlackListTypes> serializer() {
            return BlackListTypes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BlackListTypes(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, BlackListTypes$$serializer.INSTANCE.getDescriptor());
        }
        this.blackListTypes = list;
    }

    public BlackListTypes(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.blackListTypes = list;
    }
}
