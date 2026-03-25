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
public final class PasskeyWalletRecoverInfoRes {
    private final List<EmailInfo> emailInfoList;
    private final String subjectContent;
    private final String toEmail;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(EmailInfo$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletRecoverInfoRes */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PasskeyWalletRecoverInfoRes copy$default(PasskeyWalletRecoverInfoRes passkeyWalletRecoverInfoRes, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = passkeyWalletRecoverInfoRes.emailInfoList;
        }
        if ((i & 2) != 0) {
            str = passkeyWalletRecoverInfoRes.toEmail;
        }
        if ((i & 4) != 0) {
            str2 = passkeyWalletRecoverInfoRes.subjectContent;
        }
        return passkeyWalletRecoverInfoRes.copy(list, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EmailInfo> component1() {
        return this.emailInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.toEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.subjectContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyWalletRecoverInfoRes copy(@NotNull List<EmailInfo> list, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new PasskeyWalletRecoverInfoRes(list, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyWalletRecoverInfoRes)) {
            return false;
        }
        PasskeyWalletRecoverInfoRes passkeyWalletRecoverInfoRes = (PasskeyWalletRecoverInfoRes) obj;
        return Intrinsics.EZpvd(this.emailInfoList, passkeyWalletRecoverInfoRes.emailInfoList) && Intrinsics.EZpvd((Object) this.toEmail, (Object) passkeyWalletRecoverInfoRes.toEmail) && Intrinsics.EZpvd((Object) this.subjectContent, (Object) passkeyWalletRecoverInfoRes.subjectContent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EmailInfo> getEmailInfoList() {
        return this.emailInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubjectContent() {
        return this.subjectContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToEmail() {
        return this.toEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.emailInfoList.hashCode() * 31) + this.toEmail.hashCode()) * 31) + this.subjectContent.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyWalletRecoverInfoRes(emailInfoList=" + this.emailInfoList + ", toEmail=" + this.toEmail + ", subjectContent=" + this.subjectContent + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletRecoverInfoRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyWalletRecoverInfoRes> serializer() {
            return PasskeyWalletRecoverInfoRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyWalletRecoverInfoRes(int i, List list, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, PasskeyWalletRecoverInfoRes$$serializer.INSTANCE.getDescriptor());
        }
        this.emailInfoList = list;
        this.toEmail = str;
        this.subjectContent = str2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(PasskeyWalletRecoverInfoRes passkeyWalletRecoverInfoRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], passkeyWalletRecoverInfoRes.emailInfoList);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, passkeyWalletRecoverInfoRes.toEmail);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, passkeyWalletRecoverInfoRes.subjectContent);
    }

    public PasskeyWalletRecoverInfoRes(@NotNull List<EmailInfo> list, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.emailInfoList = list;
        this.toEmail = str;
        this.subjectContent = str2;
    }
}
