package com.okinc.wallet.hardware.impl.onekey.handler;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.AbstractC57148ycu;
import o.C57138yck;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SendHandler extends AbstractC57148ycu {

    /* JADX INFO: loaded from: classes17.dex */
    @Serializable
    public static final class Send {
        public static final Companion Companion = new Companion(null);
        private final String data;
        private final String uuid;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Send copy$default(Send send, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = send.uuid;
            }
            if ((i & 2) != 0) {
                str2 = send.data;
            }
            return send.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.uuid;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Send copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Send(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Send)) {
                return false;
            }
            Send send = (Send) obj;
            return Intrinsics.EZpvd((Object) this.uuid, (Object) send.uuid) && Intrinsics.EZpvd((Object) this.data, (Object) send.data);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getData() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUuid() {
            return this.uuid;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.uuid.hashCode() * 31) + this.data.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Send(uuid=" + this.uuid + ", data=" + this.data + ")";
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.impl.onekey.handler.SendHandler.Send.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Send> serializer() {
                return SendHandler$Send$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Send(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, SendHandler$Send$$serializer.INSTANCE.getDescriptor());
            }
            this.uuid = str;
            this.data = str2;
        }

        public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_impl(Send send, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, send.uuid);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, send.data);
        }

        public Send(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.uuid = str;
            this.data = str2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendHandler(@NotNull C57138yck c57138yck) {
        super("send", c57138yck, null, null, null, null, 60, null);
        Intrinsics.checkNotNullParameter(c57138yck, "");
    }

    @Override // o.AbstractC57148ycu
    public void copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(copydefault(), null, null, new SendHandler$handle$1(this, str, str2, null), 3, null);
    }
}
