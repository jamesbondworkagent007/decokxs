package com.amplifyframework.predictions.options;

import com.amplifyframework.annotations.InternalAmplifyApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@InternalAmplifyApi
public class FaceLivenessSessionOptions {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: loaded from: classes14.dex */
    public static final class CoreBuilder extends Builder<CoreBuilder> {
        /* JADX DEBUG: Method merged with bridge method: getThis()Lcom/amplifyframework/predictions/options/FaceLivenessSessionOptions$Builder; */
        @Override // com.amplifyframework.predictions.options.FaceLivenessSessionOptions.Builder
        public CoreBuilder getThis() {
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Builder<?> builder() {
        return Companion.builder();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final FaceLivenessSessionOptions defaults() {
        return Companion.defaults();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FaceLivenessSessionOptions()";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.options.FaceLivenessSessionOptions.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FaceLivenessSessionOptions defaults() {
            return new FaceLivenessSessionOptions();
        }

        public final Builder<?> builder() {
            return new CoreBuilder();
        }
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj != null && Intrinsics.EZpvd(getClass(), obj.getClass()));
    }

    public static abstract class Builder<T extends Builder<T>> {
        public abstract T getThis();

        public FaceLivenessSessionOptions build() {
            return new FaceLivenessSessionOptions();
        }
    }
}
