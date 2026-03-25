package com.amplifyframework.predictions.aws.service;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC52805wZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class PresignedSynthesizeSpeechUrlOptions {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_EXPIRATION_SECONDS = 900;
    private final InterfaceC52805wZ credentialsProvider;
    private final int expires;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.wZ), (r2v0 int) A[MD:(o.wZ, int):void (m)] call: com.amplifyframework.predictions.aws.service.PresignedSynthesizeSpeechUrlOptions.<init>(o.wZ, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PresignedSynthesizeSpeechUrlOptions(InterfaceC52805wZ interfaceC52805wZ, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC52805wZ, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Builder builder() {
        return Companion.builder();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final PresignedSynthesizeSpeechUrlOptions defaults() {
        return Companion.defaults();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC52805wZ getCredentialsProvider() {
        return this.credentialsProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getExpires() {
        return this.expires;
    }

    private PresignedSynthesizeSpeechUrlOptions(InterfaceC52805wZ interfaceC52805wZ, int i) {
        this.credentialsProvider = interfaceC52805wZ;
        this.expires = i;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.service.PresignedSynthesizeSpeechUrlOptions.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Builder builder() {
            return new Builder();
        }

        public final PresignedSynthesizeSpeechUrlOptions defaults() {
            return builder().build();
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Builder {
        private InterfaceC52805wZ credentialsProvider;
        private int expires = 900;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Builder credentialsProvider(@NotNull InterfaceC52805wZ interfaceC52805wZ) {
            Intrinsics.checkNotNullParameter(interfaceC52805wZ, "");
            this.credentialsProvider = interfaceC52805wZ;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Builder expires(int i) {
            this.expires = i;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC52805wZ getCredentialsProvider() {
            return this.credentialsProvider;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getExpires() {
            return this.expires;
        }

        public final PresignedSynthesizeSpeechUrlOptions build() {
            return new PresignedSynthesizeSpeechUrlOptions(this.credentialsProvider, this.expires, null);
        }
    }
}
