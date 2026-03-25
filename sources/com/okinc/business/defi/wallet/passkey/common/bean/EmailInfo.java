package com.okinc.business.defi.wallet.passkey.common.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class EmailInfo {
    private final List<ChainInfo> chainInfoList;
    private final String fromEmail;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(ChainInfo$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.passkey.common.bean.EmailInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmailInfo copy$default(EmailInfo emailInfo, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = emailInfo.chainInfoList;
        }
        if ((i & 2) != 0) {
            str = emailInfo.fromEmail;
        }
        return emailInfo.copy(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainInfo> component1() {
        return this.chainInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EmailInfo copy(@NotNull List<ChainInfo> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new EmailInfo(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailInfo)) {
            return false;
        }
        EmailInfo emailInfo = (EmailInfo) obj;
        return Intrinsics.EZpvd(this.chainInfoList, emailInfo.chainInfoList) && Intrinsics.EZpvd((Object) this.fromEmail, (Object) emailInfo.fromEmail);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainInfo> getChainInfoList() {
        return this.chainInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromEmail() {
        return this.fromEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.chainInfoList.hashCode() * 31) + this.fromEmail.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EmailInfo(chainInfoList=" + this.chainInfoList + ", fromEmail=" + this.fromEmail + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.common.bean.EmailInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EmailInfo> serializer() {
            return EmailInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EmailInfo(int i, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, EmailInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.chainInfoList = list;
        this.fromEmail = str;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EmailInfo emailInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], emailInfo.chainInfoList);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, emailInfo.fromEmail);
    }

    public EmailInfo(@NotNull List<ChainInfo> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.chainInfoList = list;
        this.fromEmail = str;
    }
}
