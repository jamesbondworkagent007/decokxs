package com.okinc.im.usecase.message;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C35821oEy;
import o.oCE;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class SendStopAgentBotMessageUseCase {
    public final C35821oEy KWHzl;
    public final oCE OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public SendStopAgentBotMessageUseCase(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull oCE oce, @NotNull C35821oEy c35821oEy) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(oce, "");
        Intrinsics.checkNotNullParameter(c35821oEy, "");
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = oce;
        this.KWHzl = c35821oEy;
    }

    /* JADX INFO: loaded from: classes16.dex */
    @Serializable
    public static final class AgentBotMessageContent {
        public static final Companion Companion = new Companion(null);
        public final String data;
        public final String useCase;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AgentBotMessageContent copy$default(AgentBotMessageContent agentBotMessageContent, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = agentBotMessageContent.useCase;
            }
            if ((i & 2) != 0) {
                str2 = agentBotMessageContent.data;
            }
            return agentBotMessageContent.EZpvd(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AgentBotMessageContent EZpvd(@NotNull String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new AgentBotMessageContent(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AgentBotMessageContent)) {
                return false;
            }
            AgentBotMessageContent agentBotMessageContent = (AgentBotMessageContent) obj;
            return Intrinsics.EZpvd((Object) this.useCase, (Object) agentBotMessageContent.useCase) && Intrinsics.EZpvd((Object) this.data, (Object) agentBotMessageContent.data);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.useCase.hashCode();
            String str = this.data;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AgentBotMessageContent(useCase=" + this.useCase + ", data=" + this.data + ")";
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.usecase.message.SendStopAgentBotMessageUseCase.AgentBotMessageContent.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<AgentBotMessageContent> serializer() {
                return SendStopAgentBotMessageUseCase$AgentBotMessageContent$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ AgentBotMessageContent(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, SendStopAgentBotMessageUseCase$AgentBotMessageContent$$serializer.INSTANCE.getDescriptor());
            }
            this.useCase = str;
            if ((i & 2) == 0) {
                this.data = null;
            } else {
                this.data = str2;
            }
        }

        public static final /* synthetic */ void KWHzl(AgentBotMessageContent agentBotMessageContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, agentBotMessageContent.useCase);
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && agentBotMessageContent.data == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, agentBotMessageContent.data);
        }

        public AgentBotMessageContent(@NotNull String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.useCase = str;
            this.data = str2;
        }
    }

    public final Object EZpvd(@NotNull String str, @NotNull Continuation<? super OKMessage> continuation) {
        return BuildersKt.withContext(this.copydefault, new SendStopAgentBotMessageUseCase$invoke$2(this, str, null), continuation);
    }
}
