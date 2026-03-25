package com.okinc.wallet.hardware.impl.onekey.handler;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.AbstractC57148ycu;
import o.C57138yck;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class PromptUIRequestHandler extends AbstractC57148ycu {
    public static final Application Companion = new Application(null);

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.impl.onekey.handler.PromptUIRequestHandler.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromptUIRequestHandler(@NotNull C57138yck c57138yck) {
        super("promptUIRequest", c57138yck, null, null, null, null, 60, null);
        Intrinsics.checkNotNullParameter(c57138yck, "");
    }

    /* JADX INFO: loaded from: classes17.dex */
    @Serializable
    public static final class PromptUIRequest {
        public static final Companion Companion = new Companion(null);
        private final String type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PromptUIRequest copy$default(PromptUIRequest promptUIRequest, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = promptUIRequest.type;
            }
            return promptUIRequest.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PromptUIRequest copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new PromptUIRequest(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PromptUIRequest) && Intrinsics.EZpvd((Object) this.type, (Object) ((PromptUIRequest) obj).type);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.type.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PromptUIRequest(type=" + this.type + ")";
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.impl.onekey.handler.PromptUIRequestHandler.PromptUIRequest.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<PromptUIRequest> serializer() {
                return PromptUIRequestHandler$PromptUIRequest$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ PromptUIRequest(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, PromptUIRequestHandler$PromptUIRequest$$serializer.INSTANCE.getDescriptor());
            }
            this.type = str;
        }

        public PromptUIRequest(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.type = str;
        }
    }

    @Override // o.AbstractC57148ycu
    public void copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(copydefault(), null, null, new PromptUIRequestHandler$handle$1(this, str, str2, null), 3, null);
    }
}
