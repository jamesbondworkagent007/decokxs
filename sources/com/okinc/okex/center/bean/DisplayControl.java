package com.okinc.okex.center.bean;

import com.okinc.okex.center.bean.enums.RecommendSection;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class DisplayControl {
    private final Set<RecommendSection> sections;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new LinkedHashSetSerializer(RecommendSection.Companion.serializer())};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.center.bean.DisplayControl */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DisplayControl copy$default(DisplayControl displayControl, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = displayControl.sections;
        }
        return displayControl.copy(set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<RecommendSection> component1() {
        return this.sections;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DisplayControl copy(Set<? extends RecommendSection> set) {
        return new DisplayControl(set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DisplayControl) && Intrinsics.EZpvd(this.sections, ((DisplayControl) obj).sections);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<RecommendSection> getSections() {
        return this.sections;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Set<RecommendSection> set = this.sections;
        if (set == null) {
            return 0;
        }
        return set.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DisplayControl(sections=" + this.sections + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.DisplayControl.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DisplayControl> serializer() {
            return DisplayControl$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DisplayControl(int i, Set set, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, DisplayControl$$serializer.INSTANCE.getDescriptor());
        }
        this.sections = set;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Set<? extends com.okinc.okex.center.bean.enums.RecommendSection> */
    /* JADX WARN: Multi-variable type inference failed */
    public DisplayControl(Set<? extends RecommendSection> set) {
        this.sections = set;
    }
}
