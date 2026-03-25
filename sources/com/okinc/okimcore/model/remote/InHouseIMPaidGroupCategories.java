package com.okinc.okimcore.model.remote;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMPaidGroupCategories {
    private final List<InHouseIMPaidGroupCategory> categories;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(InHouseIMPaidGroupCategory$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.remote.InHouseIMPaidGroupCategories */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InHouseIMPaidGroupCategories copy$default(InHouseIMPaidGroupCategories inHouseIMPaidGroupCategories, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = inHouseIMPaidGroupCategories.categories;
        }
        return inHouseIMPaidGroupCategories.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InHouseIMPaidGroupCategory> component1() {
        return this.categories;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMPaidGroupCategories copy(@NotNull List<InHouseIMPaidGroupCategory> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new InHouseIMPaidGroupCategories(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InHouseIMPaidGroupCategories) && Intrinsics.EZpvd(this.categories, ((InHouseIMPaidGroupCategories) obj).categories);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InHouseIMPaidGroupCategory> getCategories() {
        return this.categories;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.categories.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMPaidGroupCategories(categories=" + this.categories + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InHouseIMPaidGroupCategories.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMPaidGroupCategories> serializer() {
            return InHouseIMPaidGroupCategories$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMPaidGroupCategories(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, InHouseIMPaidGroupCategories$$serializer.INSTANCE.getDescriptor());
        }
        this.categories = list;
    }

    public InHouseIMPaidGroupCategories(@NotNull List<InHouseIMPaidGroupCategory> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.categories = list;
    }
}
