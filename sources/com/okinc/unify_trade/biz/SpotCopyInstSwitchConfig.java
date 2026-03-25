package com.okinc.unify_trade.biz;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SpotCopyInstSwitchConfig {
    private final ArrayList<String> closeSwitchList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.SpotCopyInstSwitchConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpotCopyInstSwitchConfig copy$default(SpotCopyInstSwitchConfig spotCopyInstSwitchConfig, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = spotCopyInstSwitchConfig.closeSwitchList;
        }
        return spotCopyInstSwitchConfig.copy(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component1() {
        return this.closeSwitchList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotCopyInstSwitchConfig copy(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new SpotCopyInstSwitchConfig(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SpotCopyInstSwitchConfig) && Intrinsics.EZpvd(this.closeSwitchList, ((SpotCopyInstSwitchConfig) obj).closeSwitchList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getCloseSwitchList() {
        return this.closeSwitchList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.closeSwitchList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotCopyInstSwitchConfig(closeSwitchList=" + this.closeSwitchList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SpotCopyInstSwitchConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotCopyInstSwitchConfig> serializer() {
            return SpotCopyInstSwitchConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotCopyInstSwitchConfig(int i, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, SpotCopyInstSwitchConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.closeSwitchList = arrayList;
    }

    public SpotCopyInstSwitchConfig(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.closeSwitchList = arrayList;
    }
}
