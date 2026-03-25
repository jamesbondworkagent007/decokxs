package com.okinc.planet.biz_userprofile.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class PlanetXAsync {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final boolean enabled;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PlanetXAsync copy$default(PlanetXAsync planetXAsync, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = planetXAsync.enabled;
        }
        return planetXAsync.copydefault(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetXAsync copydefault(boolean z) {
        return new PlanetXAsync(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlanetXAsync) && this.enabled == ((PlanetXAsync) obj).enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Boolean.hashCode(this.enabled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PlanetXAsync(enabled=" + this.enabled + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetXAsync.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PlanetXAsync> serializer() {
            return PlanetXAsync$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PlanetXAsync(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, PlanetXAsync$$serializer.INSTANCE.getDescriptor());
        }
        this.enabled = z;
    }

    public PlanetXAsync(boolean z) {
        this.enabled = z;
    }
}
