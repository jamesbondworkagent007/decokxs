package com.amplifyframework.predictions.aws.models.liveness;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class FreshnessColor {
    private final List<Integer> rGB;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(IntSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.predictions.aws.models.liveness.FreshnessColor */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FreshnessColor copy$default(FreshnessColor freshnessColor, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = freshnessColor.rGB;
        }
        return freshnessColor.copy(list);
    }

    @SerialName("RGB")
    public static /* synthetic */ void getRGB$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component1() {
        return this.rGB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreshnessColor copy(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new FreshnessColor(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FreshnessColor) && Intrinsics.EZpvd(this.rGB, ((FreshnessColor) obj).rGB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getRGB() {
        return this.rGB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.rGB.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FreshnessColor(rGB=" + this.rGB + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.models.liveness.FreshnessColor.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FreshnessColor> serializer() {
            return FreshnessColor$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FreshnessColor(int i, @SerialName("RGB") List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, FreshnessColor$$serializer.INSTANCE.getDescriptor());
        }
        this.rGB = list;
    }

    public FreshnessColor(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.rGB = list;
    }
}
