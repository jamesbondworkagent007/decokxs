package com.reown.sign.client;

import com.reown.android.Core;
import com.reown.android.CoreInterface;
import com.reown.android.cacao.SignatureInterface;
import com.reown.android.internal.common.signing.cacao.Issuer;
import java.net.URI;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.C56444yFp;
import o.C59462zhW;
import o.C59519zia;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Sign {
    public static final Sign INSTANCE = new Sign();

    /* JADX INFO: loaded from: classes17.dex */
    public interface Listeners {

        public interface SessionPing extends Listeners {
            void onError(@NotNull Model.Ping.Error error);

            void onSuccess(@NotNull Model.Ping.Success success);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class ConnectionType {
        public static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        public static final /* synthetic */ ConnectionType[] $VALUES;
        public static final ConnectionType AUTOMATIC = new ConnectionType("AUTOMATIC", 0);
        public static final ConnectionType MANUAL = new ConnectionType("MANUAL", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static final /* synthetic */ ConnectionType[] $values() {
            return new ConnectionType[]{AUTOMATIC, MANUAL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ConnectionType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static ConnectionType valueOf(String str) {
            return (ConnectionType) Enum.valueOf(ConnectionType.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static ConnectionType[] values() {
            return (ConnectionType[]) $VALUES.clone();
        }

        public ConnectionType(String str, int i) {
        }

        static {
            ConnectionType[] connectionTypeArr$values = $values();
            $VALUES = connectionTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(connectionTypeArr$values);
        }
    }

    public static abstract class Model {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.client.Sign.Model.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Model(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Model() {
        }

        public static final class Error extends Model {
            public final Throwable throwable;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.throwable;
                }
                return error.copy(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Throwable component1() {
                return this.throwable;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Error copy(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new Error(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.EZpvd(this.throwable, ((Error) obj).throwable);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.throwable.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(throwable=" + this.throwable + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.throwable = th;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static abstract class ProposedSequence extends Model {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.client.Sign.Model.ProposedSequence.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ ProposedSequence(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: loaded from: classes24.dex */
            public static final class Pairing extends ProposedSequence {
                public final String uri;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getUri() {
                    return this.uri;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Pairing(@NotNull String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    this.uri = str;
                }
            }

            public ProposedSequence() {
                super(null);
            }

            /* JADX INFO: loaded from: classes24.dex */
            public static final class Session extends ProposedSequence {
                public static final Session INSTANCE = new Session();

                public Session() {
                    super(null);
                }
            }
        }

        public static final class SessionProposal extends Model {
            public final String description;
            public final List<URI> icons;
            public final String name;
            public final Map<String, Namespace.Proposal> optionalNamespaces;
            public final String pairingTopic;
            public final Map<String, String> properties;
            public final String proposerPublicKey;
            public final String redirect;
            public final String relayData;
            public final String relayProtocol;
            public final Map<String, Namespace.Proposal> requiredNamespaces;
            public final String url;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.pairingTopic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component10() {
                return this.proposerPublicKey;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component11() {
                return this.relayProtocol;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component12() {
                return this.relayData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.description;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component4() {
                return this.url;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<URI> component5() {
                return this.icons;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component6() {
                return this.redirect;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Namespace.Proposal> component7() {
                return this.requiredNamespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Namespace.Proposal> component8() {
                return this.optionalNamespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, String> component9() {
                return this.properties;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SessionProposal copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<URI> list, @NotNull String str5, @NotNull Map<String, Namespace.Proposal> map, @NotNull Map<String, Namespace.Proposal> map2, Map<String, String> map3, @NotNull String str6, @NotNull String str7, String str8) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(map2, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                return new SessionProposal(str, str2, str3, str4, list, str5, map, map2, map3, str6, str7, str8);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SessionProposal)) {
                    return false;
                }
                SessionProposal sessionProposal = (SessionProposal) obj;
                return Intrinsics.EZpvd((Object) this.pairingTopic, (Object) sessionProposal.pairingTopic) && Intrinsics.EZpvd((Object) this.name, (Object) sessionProposal.name) && Intrinsics.EZpvd((Object) this.description, (Object) sessionProposal.description) && Intrinsics.EZpvd((Object) this.url, (Object) sessionProposal.url) && Intrinsics.EZpvd(this.icons, sessionProposal.icons) && Intrinsics.EZpvd((Object) this.redirect, (Object) sessionProposal.redirect) && Intrinsics.EZpvd(this.requiredNamespaces, sessionProposal.requiredNamespaces) && Intrinsics.EZpvd(this.optionalNamespaces, sessionProposal.optionalNamespaces) && Intrinsics.EZpvd(this.properties, sessionProposal.properties) && Intrinsics.EZpvd((Object) this.proposerPublicKey, (Object) sessionProposal.proposerPublicKey) && Intrinsics.EZpvd((Object) this.relayProtocol, (Object) sessionProposal.relayProtocol) && Intrinsics.EZpvd((Object) this.relayData, (Object) sessionProposal.relayData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getDescription() {
                return this.description;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<URI> getIcons() {
                return this.icons;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getName() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Namespace.Proposal> getOptionalNamespaces() {
                return this.optionalNamespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getPairingTopic() {
                return this.pairingTopic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, String> getProperties() {
                return this.properties;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getProposerPublicKey() {
                return this.proposerPublicKey;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getRedirect() {
                return this.redirect;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getRelayData() {
                return this.relayData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getRelayProtocol() {
                return this.relayProtocol;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Namespace.Proposal> getRequiredNamespaces() {
                return this.requiredNamespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getUrl() {
                return this.url;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.pairingTopic.hashCode();
                int iHashCode2 = this.name.hashCode();
                int iHashCode3 = this.description.hashCode();
                int iHashCode4 = this.url.hashCode();
                int iHashCode5 = this.icons.hashCode();
                int iHashCode6 = this.redirect.hashCode();
                int iHashCode7 = this.requiredNamespaces.hashCode();
                int iHashCode8 = this.optionalNamespaces.hashCode();
                Map<String, String> map = this.properties;
                int iHashCode9 = map == null ? 0 : map.hashCode();
                int iHashCode10 = this.proposerPublicKey.hashCode();
                int iHashCode11 = this.relayProtocol.hashCode();
                String str = this.relayData;
                return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str != null ? str.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SessionProposal(pairingTopic=" + this.pairingTopic + ", name=" + this.name + ", description=" + this.description + ", url=" + this.url + ", icons=" + this.icons + ", redirect=" + this.redirect + ", requiredNamespaces=" + this.requiredNamespaces + ", optionalNamespaces=" + this.optionalNamespaces + ", properties=" + this.properties + ", proposerPublicKey=" + this.proposerPublicKey + ", relayProtocol=" + this.relayProtocol + ", relayData=" + this.relayData + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SessionProposal(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<URI> list, @NotNull String str5, @NotNull Map<String, Namespace.Proposal> map, @NotNull Map<String, Namespace.Proposal> map2, Map<String, String> map3, @NotNull String str6, @NotNull String str7, String str8) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(map2, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                this.pairingTopic = str;
                this.name = str2;
                this.description = str3;
                this.url = str4;
                this.icons = list;
                this.redirect = str5;
                this.requiredNamespaces = map;
                this.optionalNamespaces = map2;
                this.properties = map3;
                this.proposerPublicKey = str6;
                this.relayProtocol = str7;
                this.relayData = str8;
            }
        }

        public static final class ExpiredProposal extends Model {
            public final String pairingTopic;
            public final String proposerPublicKey;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ExpiredProposal copy$default(ExpiredProposal expiredProposal, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = expiredProposal.pairingTopic;
                }
                if ((i & 2) != 0) {
                    str2 = expiredProposal.proposerPublicKey;
                }
                return expiredProposal.copy(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.pairingTopic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.proposerPublicKey;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ExpiredProposal copy(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new ExpiredProposal(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExpiredProposal)) {
                    return false;
                }
                ExpiredProposal expiredProposal = (ExpiredProposal) obj;
                return Intrinsics.EZpvd((Object) this.pairingTopic, (Object) expiredProposal.pairingTopic) && Intrinsics.EZpvd((Object) this.proposerPublicKey, (Object) expiredProposal.proposerPublicKey);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getPairingTopic() {
                return this.pairingTopic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getProposerPublicKey() {
                return this.proposerPublicKey;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.pairingTopic.hashCode() * 31) + this.proposerPublicKey.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ExpiredProposal(pairingTopic=" + this.pairingTopic + ", proposerPublicKey=" + this.proposerPublicKey + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ExpiredProposal(@NotNull String str, @NotNull String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.pairingTopic = str;
                this.proposerPublicKey = str2;
            }
        }

        public static final class ExpiredRequest extends Model {
            public final long id;
            public final String topic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ExpiredRequest copy$default(ExpiredRequest expiredRequest, String str, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = expiredRequest.topic;
                }
                if ((i & 2) != 0) {
                    j = expiredRequest.id;
                }
                return expiredRequest.copy(str, j);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long component2() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ExpiredRequest copy(@NotNull String str, long j) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ExpiredRequest(str, j);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExpiredRequest)) {
                    return false;
                }
                ExpiredRequest expiredRequest = (ExpiredRequest) obj;
                return Intrinsics.EZpvd((Object) this.topic, (Object) expiredRequest.topic) && this.id == expiredRequest.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.topic.hashCode() * 31) + Long.hashCode(this.id);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ExpiredRequest(topic=" + this.topic + ", id=" + this.id + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ExpiredRequest(@NotNull String str, long j) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.topic = str;
                this.id = j;
            }
        }

        public static final class VerifyContext extends Model {
            public final long id;
            public final Boolean isScam;
            public final String origin;
            public final Validation validation;
            public final String verifyUrl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ VerifyContext copy$default(VerifyContext verifyContext, long j, String str, Validation validation, String str2, Boolean bool, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = verifyContext.id;
                }
                long j2 = j;
                if ((i & 2) != 0) {
                    str = verifyContext.origin;
                }
                String str3 = str;
                if ((i & 4) != 0) {
                    validation = verifyContext.validation;
                }
                Validation validation2 = validation;
                if ((i & 8) != 0) {
                    str2 = verifyContext.verifyUrl;
                }
                String str4 = str2;
                if ((i & 16) != 0) {
                    bool = verifyContext.isScam;
                }
                return verifyContext.copy(j2, str3, validation2, str4, bool);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.origin;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Validation component3() {
                return this.validation;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component4() {
                return this.verifyUrl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Boolean component5() {
                return this.isScam;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final VerifyContext copy(long j, @NotNull String str, @NotNull Validation validation, @NotNull String str2, Boolean bool) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(validation, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new VerifyContext(j, str, validation, str2, bool);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VerifyContext)) {
                    return false;
                }
                VerifyContext verifyContext = (VerifyContext) obj;
                return this.id == verifyContext.id && Intrinsics.EZpvd((Object) this.origin, (Object) verifyContext.origin) && this.validation == verifyContext.validation && Intrinsics.EZpvd((Object) this.verifyUrl, (Object) verifyContext.verifyUrl) && Intrinsics.EZpvd(this.isScam, verifyContext.isScam);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getOrigin() {
                return this.origin;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Validation getValidation() {
                return this.validation;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getVerifyUrl() {
                return this.verifyUrl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = Long.hashCode(this.id);
                int iHashCode2 = this.origin.hashCode();
                int iHashCode3 = this.validation.hashCode();
                int iHashCode4 = this.verifyUrl.hashCode();
                Boolean bool = this.isScam;
                return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool == null ? 0 : bool.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Boolean isScam() {
                return this.isScam;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "VerifyContext(id=" + this.id + ", origin=" + this.origin + ", validation=" + this.validation + ", verifyUrl=" + this.verifyUrl + ", isScam=" + this.isScam + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VerifyContext(long j, @NotNull String str, @NotNull Validation validation, @NotNull String str2, Boolean bool) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(validation, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.id = j;
                this.origin = str;
                this.validation = validation;
                this.verifyUrl = str2;
                this.isScam = bool;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Validation {
            public static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            public static final /* synthetic */ Validation[] $VALUES;
            public static final Validation VALID = new Validation("VALID", 0);
            public static final Validation INVALID = new Validation("INVALID", 1);
            public static final Validation UNKNOWN = new Validation("UNKNOWN", 2);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static final /* synthetic */ Validation[] $values() {
                return new Validation[]{VALID, INVALID, UNKNOWN};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<Validation> getEntries() {
                return $ENTRIES;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static Validation valueOf(String str) {
                return (Validation) Enum.valueOf(Validation.class, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static Validation[] values() {
                return (Validation[]) $VALUES.clone();
            }

            public Validation(String str, int i) {
            }

            static {
                Validation[] validationArr$values = $values();
                $VALUES = validationArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(validationArr$values);
            }
        }

        public static final class SessionRequest extends Model {
            public final String chainId;
            public final Core.Model.AppMetaData peerMetaData;
            public final JSONRPCRequest request;
            public final String topic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ SessionRequest copy$default(SessionRequest sessionRequest, String str, String str2, Core.Model.AppMetaData appMetaData, JSONRPCRequest jSONRPCRequest, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sessionRequest.topic;
                }
                if ((i & 2) != 0) {
                    str2 = sessionRequest.chainId;
                }
                if ((i & 4) != 0) {
                    appMetaData = sessionRequest.peerMetaData;
                }
                if ((i & 8) != 0) {
                    jSONRPCRequest = sessionRequest.request;
                }
                return sessionRequest.copy(str, str2, appMetaData, jSONRPCRequest);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.chainId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Core.Model.AppMetaData component3() {
                return this.peerMetaData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final JSONRPCRequest component4() {
                return this.request;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SessionRequest copy(@NotNull String str, String str2, Core.Model.AppMetaData appMetaData, @NotNull JSONRPCRequest jSONRPCRequest) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(jSONRPCRequest, "");
                return new SessionRequest(str, str2, appMetaData, jSONRPCRequest);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SessionRequest)) {
                    return false;
                }
                SessionRequest sessionRequest = (SessionRequest) obj;
                return Intrinsics.EZpvd((Object) this.topic, (Object) sessionRequest.topic) && Intrinsics.EZpvd((Object) this.chainId, (Object) sessionRequest.chainId) && Intrinsics.EZpvd(this.peerMetaData, sessionRequest.peerMetaData) && Intrinsics.EZpvd(this.request, sessionRequest.request);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getChainId() {
                return this.chainId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Core.Model.AppMetaData getPeerMetaData() {
                return this.peerMetaData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final JSONRPCRequest getRequest() {
                return this.request;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.topic.hashCode();
                String str = this.chainId;
                int iHashCode2 = str == null ? 0 : str.hashCode();
                Core.Model.AppMetaData appMetaData = this.peerMetaData;
                return (((((iHashCode * 31) + iHashCode2) * 31) + (appMetaData != null ? appMetaData.hashCode() : 0)) * 31) + this.request.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SessionRequest(topic=" + this.topic + ", chainId=" + this.chainId + ", peerMetaData=" + this.peerMetaData + ", request=" + this.request + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SessionRequest(@NotNull String str, String str2, Core.Model.AppMetaData appMetaData, @NotNull JSONRPCRequest jSONRPCRequest) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(jSONRPCRequest, "");
                this.topic = str;
                this.chainId = str2;
                this.peerMetaData = appMetaData;
                this.request = jSONRPCRequest;
            }

            public static final class JSONRPCRequest extends Model {
                public final long id;
                public final String method;
                public final String params;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ JSONRPCRequest copy$default(JSONRPCRequest jSONRPCRequest, long j, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        j = jSONRPCRequest.id;
                    }
                    if ((i & 2) != 0) {
                        str = jSONRPCRequest.method;
                    }
                    if ((i & 4) != 0) {
                        str2 = jSONRPCRequest.params;
                    }
                    return jSONRPCRequest.copy(j, str, str2);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long component1() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component2() {
                    return this.method;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component3() {
                    return this.params;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final JSONRPCRequest copy(long j, @NotNull String str, @NotNull String str2) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    return new JSONRPCRequest(j, str, str2);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof JSONRPCRequest)) {
                        return false;
                    }
                    JSONRPCRequest jSONRPCRequest = (JSONRPCRequest) obj;
                    return this.id == jSONRPCRequest.id && Intrinsics.EZpvd((Object) this.method, (Object) jSONRPCRequest.method) && Intrinsics.EZpvd((Object) this.params, (Object) jSONRPCRequest.params);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long getId() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getMethod() {
                    return this.method;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getParams() {
                    return this.params;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (((Long.hashCode(this.id) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "JSONRPCRequest(id=" + this.id + ", method=" + this.method + ", params=" + this.params + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public JSONRPCRequest(long j, @NotNull String str, @NotNull String str2) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    this.id = j;
                    this.method = str;
                    this.params = str2;
                }
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class SentRequest extends Params {
            public final String chainId;
            public final String method;
            public final String params;
            public final long requestId;
            public final String sessionTopic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ SentRequest copy$default(SentRequest sentRequest, long j, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = sentRequest.requestId;
                }
                long j2 = j;
                if ((i & 2) != 0) {
                    str = sentRequest.sessionTopic;
                }
                String str5 = str;
                if ((i & 4) != 0) {
                    str2 = sentRequest.method;
                }
                String str6 = str2;
                if ((i & 8) != 0) {
                    str3 = sentRequest.params;
                }
                String str7 = str3;
                if ((i & 16) != 0) {
                    str4 = sentRequest.chainId;
                }
                return sentRequest.copy(j2, str5, str6, str7, str4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long component1() {
                return this.requestId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.sessionTopic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.method;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component4() {
                return this.params;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component5() {
                return this.chainId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SentRequest copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                return new SentRequest(j, str, str2, str3, str4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SentRequest)) {
                    return false;
                }
                SentRequest sentRequest = (SentRequest) obj;
                return this.requestId == sentRequest.requestId && Intrinsics.EZpvd((Object) this.sessionTopic, (Object) sentRequest.sessionTopic) && Intrinsics.EZpvd((Object) this.method, (Object) sentRequest.method) && Intrinsics.EZpvd((Object) this.params, (Object) sentRequest.params) && Intrinsics.EZpvd((Object) this.chainId, (Object) sentRequest.chainId);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getChainId() {
                return this.chainId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getMethod() {
                return this.method;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getParams() {
                return this.params;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long getRequestId() {
                return this.requestId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getSessionTopic() {
                return this.sessionTopic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((((((Long.hashCode(this.requestId) * 31) + this.sessionTopic.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode()) * 31) + this.chainId.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SentRequest(requestId=" + this.requestId + ", sessionTopic=" + this.sessionTopic + ", method=" + this.method + ", params=" + this.params + ", chainId=" + this.chainId + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SentRequest(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                this.requestId = j;
                this.sessionTopic = str;
                this.method = str2;
                this.params = str3;
                this.chainId = str4;
            }
        }

        public static abstract class Namespace extends Model {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.client.Sign.Model.Namespace.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Namespace(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Namespace() {
                super(null);
            }

            public static final class Proposal extends Namespace {
                public final List<String> chains;
                public final List<String> events;
                public final List<String> methods;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.client.Sign$Model$Namespace$Proposal */
                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Proposal copy$default(Proposal proposal, List list, List list2, List list3, int i, Object obj) {
                    if ((i & 1) != 0) {
                        list = proposal.chains;
                    }
                    if ((i & 2) != 0) {
                        list2 = proposal.methods;
                    }
                    if ((i & 4) != 0) {
                        list3 = proposal.events;
                    }
                    return proposal.copy(list, list2, list3);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> component1() {
                    return this.chains;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> component2() {
                    return this.methods;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> component3() {
                    return this.events;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Proposal copy(List<String> list, @NotNull List<String> list2, @NotNull List<String> list3) {
                    Intrinsics.checkNotNullParameter(list2, "");
                    Intrinsics.checkNotNullParameter(list3, "");
                    return new Proposal(list, list2, list3);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Proposal)) {
                        return false;
                    }
                    Proposal proposal = (Proposal) obj;
                    return Intrinsics.EZpvd(this.chains, proposal.chains) && Intrinsics.EZpvd(this.methods, proposal.methods) && Intrinsics.EZpvd(this.events, proposal.events);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getChains() {
                    return this.chains;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getEvents() {
                    return this.events;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getMethods() {
                    return this.methods;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    List<String> list = this.chains;
                    return ((((list == null ? 0 : list.hashCode()) * 31) + this.methods.hashCode()) * 31) + this.events.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Proposal(chains=" + this.chains + ", methods=" + this.methods + ", events=" + this.events + ")";
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
  (r2v0 java.util.List)
  (r3v0 java.util.List)
 A[MD:(java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>):void (m)] (LINE:93) call: com.reown.sign.client.Sign.Model.Namespace.Proposal.<init>(java.util.List, java.util.List, java.util.List):void type: THIS */
                public /* synthetic */ Proposal(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : list, list2, list3);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Proposal(List<String> list, @NotNull List<String> list2, @NotNull List<String> list3) {
                    super(null);
                    Intrinsics.checkNotNullParameter(list2, "");
                    Intrinsics.checkNotNullParameter(list3, "");
                    this.chains = list;
                    this.methods = list2;
                    this.events = list3;
                }
            }

            public static final class Session extends Namespace {
                public final List<String> accounts;
                public final List<String> chains;
                public final List<String> events;
                public final List<String> methods;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.client.Sign$Model$Namespace$Session */
                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Session copy$default(Session session, List list, List list2, List list3, List list4, int i, Object obj) {
                    if ((i & 1) != 0) {
                        list = session.chains;
                    }
                    if ((i & 2) != 0) {
                        list2 = session.accounts;
                    }
                    if ((i & 4) != 0) {
                        list3 = session.methods;
                    }
                    if ((i & 8) != 0) {
                        list4 = session.events;
                    }
                    return session.copy(list, list2, list3, list4);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> component1() {
                    return this.chains;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> component2() {
                    return this.accounts;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> component3() {
                    return this.methods;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> component4() {
                    return this.events;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Session copy(List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<String> list4) {
                    Intrinsics.checkNotNullParameter(list2, "");
                    Intrinsics.checkNotNullParameter(list3, "");
                    Intrinsics.checkNotNullParameter(list4, "");
                    return new Session(list, list2, list3, list4);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Session)) {
                        return false;
                    }
                    Session session = (Session) obj;
                    return Intrinsics.EZpvd(this.chains, session.chains) && Intrinsics.EZpvd(this.accounts, session.accounts) && Intrinsics.EZpvd(this.methods, session.methods) && Intrinsics.EZpvd(this.events, session.events);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getAccounts() {
                    return this.accounts;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getChains() {
                    return this.chains;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getEvents() {
                    return this.events;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getMethods() {
                    return this.methods;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    List<String> list = this.chains;
                    return ((((((list == null ? 0 : list.hashCode()) * 31) + this.accounts.hashCode()) * 31) + this.methods.hashCode()) * 31) + this.events.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Session(chains=" + this.chains + ", accounts=" + this.accounts + ", methods=" + this.methods + ", events=" + this.events + ")";
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
  (r2v0 java.util.List)
  (r3v0 java.util.List)
  (r4v0 java.util.List)
 A[MD:(java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>):void (m)] (LINE:99) call: com.reown.sign.client.Sign.Model.Namespace.Session.<init>(java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
                public /* synthetic */ Session(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : list, list2, list3, list4);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Session(List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<String> list4) {
                    super(null);
                    Intrinsics.checkNotNullParameter(list2, "");
                    Intrinsics.checkNotNullParameter(list3, "");
                    Intrinsics.checkNotNullParameter(list4, "");
                    this.chains = list;
                    this.accounts = list2;
                    this.methods = list3;
                    this.events = list4;
                }
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class RelayProtocolOptions extends Model {
            public final String data;
            public final String protocol;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ RelayProtocolOptions copy$default(RelayProtocolOptions relayProtocolOptions, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = relayProtocolOptions.protocol;
                }
                if ((i & 2) != 0) {
                    str2 = relayProtocolOptions.data;
                }
                return relayProtocolOptions.copy(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.protocol;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.data;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RelayProtocolOptions copy(@NotNull String str, String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                return new RelayProtocolOptions(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RelayProtocolOptions)) {
                    return false;
                }
                RelayProtocolOptions relayProtocolOptions = (RelayProtocolOptions) obj;
                return Intrinsics.EZpvd((Object) this.protocol, (Object) relayProtocolOptions.protocol) && Intrinsics.EZpvd((Object) this.data, (Object) relayProtocolOptions.data);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getData() {
                return this.data;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getProtocol() {
                return this.protocol;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.protocol.hashCode();
                String str = this.data;
                return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "RelayProtocolOptions(protocol=" + this.protocol + ", data=" + this.data + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RelayProtocolOptions(@NotNull String str, String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.protocol = str;
                this.data = str2;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:108) call: com.reown.sign.client.Sign.Model.RelayProtocolOptions.<init>(java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ RelayProtocolOptions(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2);
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Pairing extends Model {
            public final Core.Model.AppMetaData metaData;
            public final String topic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Pairing copy$default(Pairing pairing, String str, Core.Model.AppMetaData appMetaData, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = pairing.topic;
                }
                if ((i & 2) != 0) {
                    appMetaData = pairing.metaData;
                }
                return pairing.copy(str, appMetaData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Core.Model.AppMetaData component2() {
                return this.metaData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Pairing copy(@NotNull String str, Core.Model.AppMetaData appMetaData) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Pairing(str, appMetaData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Pairing)) {
                    return false;
                }
                Pairing pairing = (Pairing) obj;
                return Intrinsics.EZpvd((Object) this.topic, (Object) pairing.topic) && Intrinsics.EZpvd(this.metaData, pairing.metaData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Core.Model.AppMetaData getMetaData() {
                return this.metaData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.topic.hashCode();
                Core.Model.AppMetaData appMetaData = this.metaData;
                return (iHashCode * 31) + (appMetaData == null ? 0 : appMetaData.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Pairing(topic=" + this.topic + ", metaData=" + this.metaData + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Pairing(@NotNull String str, Core.Model.AppMetaData appMetaData) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.topic = str;
                this.metaData = appMetaData;
            }
        }

        public static abstract class SettledSessionResponse extends Model {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.client.Sign.Model.SettledSessionResponse.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ SettledSessionResponse(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static final class Result extends SettledSessionResponse {
                public final Session session;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Result copy$default(Result result, Session session, int i, Object obj) {
                    if ((i & 1) != 0) {
                        session = result.session;
                    }
                    return result.copy(session);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Session component1() {
                    return this.session;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Result copy(@NotNull Session session) {
                    Intrinsics.checkNotNullParameter(session, "");
                    return new Result(session);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Result) && Intrinsics.EZpvd(this.session, ((Result) obj).session);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Session getSession() {
                    return this.session;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return this.session.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Result(session=" + this.session + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Result(@NotNull Session session) {
                    super(null);
                    Intrinsics.checkNotNullParameter(session, "");
                    this.session = session;
                }
            }

            public SettledSessionResponse() {
                super(null);
            }

            public static final class Error extends SettledSessionResponse {
                public final String errorMessage;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = error.errorMessage;
                    }
                    return error.copy(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.errorMessage;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Error copy(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return new Error(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Error) && Intrinsics.EZpvd((Object) this.errorMessage, (Object) ((Error) obj).errorMessage);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getErrorMessage() {
                    return this.errorMessage;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return this.errorMessage.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Error(errorMessage=" + this.errorMessage + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Error(@NotNull String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    this.errorMessage = str;
                }
            }
        }

        public static abstract class SessionUpdateResponse extends Model {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.client.Sign.Model.SessionUpdateResponse.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ SessionUpdateResponse(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static final class Result extends SessionUpdateResponse {
                public final Map<String, Namespace.Session> namespaces;
                public final String topic;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.client.Sign$Model$SessionUpdateResponse$Result */
                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Result copy$default(Result result, String str, Map map, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = result.topic;
                    }
                    if ((i & 2) != 0) {
                        map = result.namespaces;
                    }
                    return result.copy(str, map);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, Namespace.Session> component2() {
                    return this.namespaces;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Result copy(@NotNull String str, @NotNull Map<String, Namespace.Session> map) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(map, "");
                    return new Result(str, map);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Result)) {
                        return false;
                    }
                    Result result = (Result) obj;
                    return Intrinsics.EZpvd((Object) this.topic, (Object) result.topic) && Intrinsics.EZpvd(this.namespaces, result.namespaces);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, Namespace.Session> getNamespaces() {
                    return this.namespaces;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getTopic() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (this.topic.hashCode() * 31) + this.namespaces.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Result(topic=" + this.topic + ", namespaces=" + this.namespaces + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Result(@NotNull String str, @NotNull Map<String, Namespace.Session> map) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(map, "");
                    this.topic = str;
                    this.namespaces = map;
                }
            }

            public SessionUpdateResponse() {
                super(null);
            }

            public static final class Error extends SessionUpdateResponse {
                public final String errorMessage;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = error.errorMessage;
                    }
                    return error.copy(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.errorMessage;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Error copy(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return new Error(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Error) && Intrinsics.EZpvd((Object) this.errorMessage, (Object) ((Error) obj).errorMessage);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getErrorMessage() {
                    return this.errorMessage;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return this.errorMessage.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Error(errorMessage=" + this.errorMessage + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Error(@NotNull String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    this.errorMessage = str;
                }
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static abstract class SessionAuthenticateResponse extends Model {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.client.Sign.Model.SessionAuthenticateResponse.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ SessionAuthenticateResponse(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static final class Result extends SessionAuthenticateResponse {
                public final List<Cacao> cacaos;
                public final long id;
                public final Session session;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.client.Sign$Model$SessionAuthenticateResponse$Result */
                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Result copy$default(Result result, long j, List list, Session session, int i, Object obj) {
                    if ((i & 1) != 0) {
                        j = result.id;
                    }
                    if ((i & 2) != 0) {
                        list = result.cacaos;
                    }
                    if ((i & 4) != 0) {
                        session = result.session;
                    }
                    return result.copy(j, list, session);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long component1() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<Cacao> component2() {
                    return this.cacaos;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Session component3() {
                    return this.session;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Result copy(long j, @NotNull List<Cacao> list, Session session) {
                    Intrinsics.checkNotNullParameter(list, "");
                    return new Result(j, list, session);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Result)) {
                        return false;
                    }
                    Result result = (Result) obj;
                    return this.id == result.id && Intrinsics.EZpvd(this.cacaos, result.cacaos) && Intrinsics.EZpvd(this.session, result.session);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<Cacao> getCacaos() {
                    return this.cacaos;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long getId() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Session getSession() {
                    return this.session;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = Long.hashCode(this.id);
                    int iHashCode2 = this.cacaos.hashCode();
                    Session session = this.session;
                    return (((iHashCode * 31) + iHashCode2) * 31) + (session == null ? 0 : session.hashCode());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Result(id=" + this.id + ", cacaos=" + this.cacaos + ", session=" + this.session + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Result(long j, @NotNull List<Cacao> list, Session session) {
                    super(null);
                    Intrinsics.checkNotNullParameter(list, "");
                    this.id = j;
                    this.cacaos = list;
                    this.session = session;
                }
            }

            public SessionAuthenticateResponse() {
                super(null);
            }

            public static final class Error extends SessionAuthenticateResponse {
                public final int code;
                public final long id;
                public final String message;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Error copy$default(Error error, long j, int i, String str, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        j = error.id;
                    }
                    if ((i2 & 2) != 0) {
                        i = error.code;
                    }
                    if ((i2 & 4) != 0) {
                        str = error.message;
                    }
                    return error.copy(j, i, str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long component1() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final int component2() {
                    return this.code;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component3() {
                    return this.message;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Error copy(long j, int i, @NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return new Error(j, i, str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Error)) {
                        return false;
                    }
                    Error error = (Error) obj;
                    return this.id == error.id && this.code == error.code && Intrinsics.EZpvd((Object) this.message, (Object) error.message);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final int getCode() {
                    return this.code;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long getId() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getMessage() {
                    return this.message;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (((Long.hashCode(this.id) * 31) + Integer.hashCode(this.code)) * 31) + this.message.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Error(id=" + this.id + ", code=" + this.code + ", message=" + this.message + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Error(long j, int i, @NotNull String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    this.id = j;
                    this.code = i;
                    this.message = str;
                }
            }
        }

        public static abstract class DeletedSession extends Model {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.client.Sign.Model.DeletedSession.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ DeletedSession(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static final class Success extends DeletedSession {
                public final String reason;
                public final String topic;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Success copy$default(Success success, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = success.topic;
                    }
                    if ((i & 2) != 0) {
                        str2 = success.reason;
                    }
                    return success.copy(str, str2);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component2() {
                    return this.reason;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Success copy(@NotNull String str, @NotNull String str2) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    return new Success(str, str2);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Success)) {
                        return false;
                    }
                    Success success = (Success) obj;
                    return Intrinsics.EZpvd((Object) this.topic, (Object) success.topic) && Intrinsics.EZpvd((Object) this.reason, (Object) success.reason);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getReason() {
                    return this.reason;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getTopic() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (this.topic.hashCode() * 31) + this.reason.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Success(topic=" + this.topic + ", reason=" + this.reason + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Success(@NotNull String str, @NotNull String str2) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    this.topic = str;
                    this.reason = str2;
                }
            }

            public DeletedSession() {
                super(null);
            }

            public static final class Error extends DeletedSession {
                public final Throwable error;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                    if ((i & 1) != 0) {
                        th = error.error;
                    }
                    return error.copy(th);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Throwable component1() {
                    return this.error;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Error copy(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                    return new Error(th);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Error) && Intrinsics.EZpvd(this.error, ((Error) obj).error);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Throwable getError() {
                    return this.error;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return this.error.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Error(error=" + this.error + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Error(@NotNull Throwable th) {
                    super(null);
                    Intrinsics.checkNotNullParameter(th, "");
                    this.error = th;
                }
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static abstract class Ping extends Model {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.client.Sign.Model.Ping.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Ping(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: loaded from: classes24.dex */
            public static final class Success extends Ping {
                public final String topic;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = success.topic;
                    }
                    return success.copy(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Success copy(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return new Success(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Success) && Intrinsics.EZpvd((Object) this.topic, (Object) ((Success) obj).topic);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getTopic() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return this.topic.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Success(topic=" + this.topic + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Success(@NotNull String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    this.topic = str;
                }
            }

            public Ping() {
                super(null);
            }

            /* JADX INFO: loaded from: classes24.dex */
            public static final class Error extends Ping {
                public final Throwable error;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                    if ((i & 1) != 0) {
                        th = error.error;
                    }
                    return error.copy(th);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Throwable component1() {
                    return this.error;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Error copy(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                    return new Error(th);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Error) && Intrinsics.EZpvd(this.error, ((Error) obj).error);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Throwable getError() {
                    return this.error;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return this.error.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Error(error=" + this.error + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Error(@NotNull Throwable th) {
                    super(null);
                    Intrinsics.checkNotNullParameter(th, "");
                    this.error = th;
                }
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class RejectedSession extends Model {
            public final String reason;
            public final String topic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ RejectedSession copy$default(RejectedSession rejectedSession, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = rejectedSession.topic;
                }
                if ((i & 2) != 0) {
                    str2 = rejectedSession.reason;
                }
                return rejectedSession.copy(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RejectedSession copy(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new RejectedSession(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RejectedSession)) {
                    return false;
                }
                RejectedSession rejectedSession = (RejectedSession) obj;
                return Intrinsics.EZpvd((Object) this.topic, (Object) rejectedSession.topic) && Intrinsics.EZpvd((Object) this.reason, (Object) rejectedSession.reason);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getReason() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.topic.hashCode() * 31) + this.reason.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "RejectedSession(topic=" + this.topic + ", reason=" + this.reason + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RejectedSession(@NotNull String str, @NotNull String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.topic = str;
                this.reason = str2;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class UpdatedSession extends Model {
            public final Map<String, Namespace.Session> namespaces;
            public final String topic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.client.Sign$Model$UpdatedSession */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ UpdatedSession copy$default(UpdatedSession updatedSession, String str, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = updatedSession.topic;
                }
                if ((i & 2) != 0) {
                    map = updatedSession.namespaces;
                }
                return updatedSession.copy(str, map);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Namespace.Session> component2() {
                return this.namespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UpdatedSession copy(@NotNull String str, @NotNull Map<String, Namespace.Session> map) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                return new UpdatedSession(str, map);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UpdatedSession)) {
                    return false;
                }
                UpdatedSession updatedSession = (UpdatedSession) obj;
                return Intrinsics.EZpvd((Object) this.topic, (Object) updatedSession.topic) && Intrinsics.EZpvd(this.namespaces, updatedSession.namespaces);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Namespace.Session> getNamespaces() {
                return this.namespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.topic.hashCode() * 31) + this.namespaces.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UpdatedSession(topic=" + this.topic + ", namespaces=" + this.namespaces + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdatedSession(@NotNull String str, @NotNull Map<String, Namespace.Session> map) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                this.topic = str;
                this.namespaces = map;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class ApprovedSession extends Model {
            public final List<String> accounts;
            public final Core.Model.AppMetaData metaData;
            public final Map<String, Namespace.Session> namespaces;
            public final String topic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.client.Sign$Model$ApprovedSession */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ApprovedSession copy$default(ApprovedSession approvedSession, String str, Core.Model.AppMetaData appMetaData, Map map, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = approvedSession.topic;
                }
                if ((i & 2) != 0) {
                    appMetaData = approvedSession.metaData;
                }
                if ((i & 4) != 0) {
                    map = approvedSession.namespaces;
                }
                if ((i & 8) != 0) {
                    list = approvedSession.accounts;
                }
                return approvedSession.copy(str, appMetaData, map, list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Core.Model.AppMetaData component2() {
                return this.metaData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Namespace.Session> component3() {
                return this.namespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> component4() {
                return this.accounts;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ApprovedSession copy(@NotNull String str, Core.Model.AppMetaData appMetaData, @NotNull Map<String, Namespace.Session> map, @NotNull List<String> list) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(list, "");
                return new ApprovedSession(str, appMetaData, map, list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ApprovedSession)) {
                    return false;
                }
                ApprovedSession approvedSession = (ApprovedSession) obj;
                return Intrinsics.EZpvd((Object) this.topic, (Object) approvedSession.topic) && Intrinsics.EZpvd(this.metaData, approvedSession.metaData) && Intrinsics.EZpvd(this.namespaces, approvedSession.namespaces) && Intrinsics.EZpvd(this.accounts, approvedSession.accounts);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> getAccounts() {
                return this.accounts;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Core.Model.AppMetaData getMetaData() {
                return this.metaData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Namespace.Session> getNamespaces() {
                return this.namespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.topic.hashCode();
                Core.Model.AppMetaData appMetaData = this.metaData;
                return (((((iHashCode * 31) + (appMetaData == null ? 0 : appMetaData.hashCode())) * 31) + this.namespaces.hashCode()) * 31) + this.accounts.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ApprovedSession(topic=" + this.topic + ", metaData=" + this.metaData + ", namespaces=" + this.namespaces + ", accounts=" + this.accounts + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ApprovedSession(@NotNull String str, Core.Model.AppMetaData appMetaData, @NotNull Map<String, Namespace.Session> map, @NotNull List<String> list) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(list, "");
                this.topic = str;
                this.metaData = appMetaData;
                this.namespaces = map;
                this.accounts = list;
            }
        }

        public static final class Session extends Model {
            public final long expiry;
            public final Core.Model.AppMetaData metaData;
            public final Map<String, Namespace.Session> namespaces;
            public final Map<String, Namespace.Proposal> optionalNamespaces;
            public final String pairingTopic;
            public final String redirect;
            public final Map<String, Namespace.Proposal> requiredNamespaces;
            public final String topic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.pairingTopic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long component3() {
                return this.expiry;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Namespace.Proposal> component4() {
                return this.requiredNamespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Namespace.Proposal> component5() {
                return this.optionalNamespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Namespace.Session> component6() {
                return this.namespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Core.Model.AppMetaData component7() {
                return this.metaData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Session copy(@NotNull String str, @NotNull String str2, long j, @NotNull Map<String, Namespace.Proposal> map, Map<String, Namespace.Proposal> map2, @NotNull Map<String, Namespace.Session> map3, Core.Model.AppMetaData appMetaData) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(map3, "");
                return new Session(str, str2, j, map, map2, map3, appMetaData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Session)) {
                    return false;
                }
                Session session = (Session) obj;
                return Intrinsics.EZpvd((Object) this.pairingTopic, (Object) session.pairingTopic) && Intrinsics.EZpvd((Object) this.topic, (Object) session.topic) && this.expiry == session.expiry && Intrinsics.EZpvd(this.requiredNamespaces, session.requiredNamespaces) && Intrinsics.EZpvd(this.optionalNamespaces, session.optionalNamespaces) && Intrinsics.EZpvd(this.namespaces, session.namespaces) && Intrinsics.EZpvd(this.metaData, session.metaData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long getExpiry() {
                return this.expiry;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Core.Model.AppMetaData getMetaData() {
                return this.metaData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Namespace.Session> getNamespaces() {
                return this.namespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Namespace.Proposal> getOptionalNamespaces() {
                return this.optionalNamespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getPairingTopic() {
                return this.pairingTopic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getRedirect() {
                return this.redirect;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Namespace.Proposal> getRequiredNamespaces() {
                return this.requiredNamespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.pairingTopic.hashCode();
                int iHashCode2 = this.topic.hashCode();
                int iHashCode3 = Long.hashCode(this.expiry);
                int iHashCode4 = this.requiredNamespaces.hashCode();
                Map<String, Namespace.Proposal> map = this.optionalNamespaces;
                int iHashCode5 = map == null ? 0 : map.hashCode();
                int iHashCode6 = this.namespaces.hashCode();
                Core.Model.AppMetaData appMetaData = this.metaData;
                return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (appMetaData != null ? appMetaData.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Session(pairingTopic=" + this.pairingTopic + ", topic=" + this.topic + ", expiry=" + this.expiry + ", requiredNamespaces=" + this.requiredNamespaces + ", optionalNamespaces=" + this.optionalNamespaces + ", namespaces=" + this.namespaces + ", metaData=" + this.metaData + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Session(@NotNull String str, @NotNull String str2, long j, @NotNull Map<String, Namespace.Proposal> map, Map<String, Namespace.Proposal> map2, @NotNull Map<String, Namespace.Session> map3, Core.Model.AppMetaData appMetaData) {
                super(0 == true ? 1 : 0);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(map3, "");
                this.pairingTopic = str;
                this.topic = str2;
                this.expiry = j;
                this.requiredNamespaces = map;
                this.optionalNamespaces = map2;
                this.namespaces = map3;
                this.metaData = appMetaData;
                this.redirect = appMetaData != null ? appMetaData.getRedirect() : null;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class SessionEvent extends Model {
            public final String data;
            public final String name;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ SessionEvent copy$default(SessionEvent sessionEvent, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sessionEvent.name;
                }
                if ((i & 2) != 0) {
                    str2 = sessionEvent.data;
                }
                return sessionEvent.copy(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.data;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SessionEvent copy(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new SessionEvent(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SessionEvent)) {
                    return false;
                }
                SessionEvent sessionEvent = (SessionEvent) obj;
                return Intrinsics.EZpvd((Object) this.name, (Object) sessionEvent.name) && Intrinsics.EZpvd((Object) this.data, (Object) sessionEvent.data);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getData() {
                return this.data;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getName() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.name.hashCode() * 31) + this.data.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SessionEvent(name=" + this.name + ", data=" + this.data + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SessionEvent(@NotNull String str, @NotNull String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.name = str;
                this.data = str2;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Event extends Model {
            public final String chainId;
            public final String data;
            public final String name;
            public final String topic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Event copy$default(Event event, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = event.topic;
                }
                if ((i & 2) != 0) {
                    str2 = event.name;
                }
                if ((i & 4) != 0) {
                    str3 = event.data;
                }
                if ((i & 8) != 0) {
                    str4 = event.chainId;
                }
                return event.copy(str, str2, str3, str4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.data;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component4() {
                return this.chainId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Event copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                return new Event(str, str2, str3, str4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return Intrinsics.EZpvd((Object) this.topic, (Object) event.topic) && Intrinsics.EZpvd((Object) this.name, (Object) event.name) && Intrinsics.EZpvd((Object) this.data, (Object) event.data) && Intrinsics.EZpvd((Object) this.chainId, (Object) event.chainId);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getChainId() {
                return this.chainId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getData() {
                return this.data;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getName() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((((this.topic.hashCode() * 31) + this.name.hashCode()) * 31) + this.data.hashCode()) * 31) + this.chainId.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Event(topic=" + this.topic + ", name=" + this.name + ", data=" + this.data + ", chainId=" + this.chainId + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Event(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                this.topic = str;
                this.name = str2;
                this.data = str3;
                this.chainId = str4;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class SessionRequestResponse extends Model {
            public final String chainId;
            public final String method;
            public final JsonRpcResponse result;
            public final String topic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ SessionRequestResponse copy$default(SessionRequestResponse sessionRequestResponse, String str, String str2, String str3, JsonRpcResponse jsonRpcResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sessionRequestResponse.topic;
                }
                if ((i & 2) != 0) {
                    str2 = sessionRequestResponse.chainId;
                }
                if ((i & 4) != 0) {
                    str3 = sessionRequestResponse.method;
                }
                if ((i & 8) != 0) {
                    jsonRpcResponse = sessionRequestResponse.result;
                }
                return sessionRequestResponse.copy(str, str2, str3, jsonRpcResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.chainId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.method;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final JsonRpcResponse component4() {
                return this.result;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SessionRequestResponse copy(@NotNull String str, String str2, @NotNull String str3, @NotNull JsonRpcResponse jsonRpcResponse) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(jsonRpcResponse, "");
                return new SessionRequestResponse(str, str2, str3, jsonRpcResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SessionRequestResponse)) {
                    return false;
                }
                SessionRequestResponse sessionRequestResponse = (SessionRequestResponse) obj;
                return Intrinsics.EZpvd((Object) this.topic, (Object) sessionRequestResponse.topic) && Intrinsics.EZpvd((Object) this.chainId, (Object) sessionRequestResponse.chainId) && Intrinsics.EZpvd((Object) this.method, (Object) sessionRequestResponse.method) && Intrinsics.EZpvd(this.result, sessionRequestResponse.result);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getChainId() {
                return this.chainId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getMethod() {
                return this.method;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final JsonRpcResponse getResult() {
                return this.result;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.topic.hashCode();
                String str = this.chainId;
                return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.method.hashCode()) * 31) + this.result.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SessionRequestResponse(topic=" + this.topic + ", chainId=" + this.chainId + ", method=" + this.method + ", result=" + this.result + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SessionRequestResponse(@NotNull String str, String str2, @NotNull String str3, @NotNull JsonRpcResponse jsonRpcResponse) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(jsonRpcResponse, "");
                this.topic = str;
                this.chainId = str2;
                this.method = str3;
                this.result = jsonRpcResponse;
            }
        }

        public static abstract class JsonRpcResponse extends Model {
            public final String jsonrpc;

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.client.Sign.Model.JsonRpcResponse.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ JsonRpcResponse(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public abstract long getId();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getJsonrpc() {
                return this.jsonrpc;
            }

            public JsonRpcResponse() {
                super(null);
                this.jsonrpc = "2.0";
            }

            public static final class JsonRpcResult extends JsonRpcResponse {
                public final long id;
                public final String result;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ JsonRpcResult copy$default(JsonRpcResult jsonRpcResult, long j, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        j = jsonRpcResult.id;
                    }
                    if ((i & 2) != 0) {
                        str = jsonRpcResult.result;
                    }
                    return jsonRpcResult.copy(j, str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long component1() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component2() {
                    return this.result;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final JsonRpcResult copy(long j, @NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return new JsonRpcResult(j, str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof JsonRpcResult)) {
                        return false;
                    }
                    JsonRpcResult jsonRpcResult = (JsonRpcResult) obj;
                    return this.id == jsonRpcResult.id && Intrinsics.EZpvd((Object) this.result, (Object) jsonRpcResult.result);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.sign.client.Sign.Model.JsonRpcResponse
                public long getId() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getResult() {
                    return this.result;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (Long.hashCode(this.id) * 31) + this.result.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "JsonRpcResult(id=" + this.id + ", result=" + this.result + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public JsonRpcResult(long j, @NotNull String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    this.id = j;
                    this.result = str;
                }
            }

            public static final class JsonRpcError extends JsonRpcResponse {
                public final int code;
                public final long id;
                public final String message;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ JsonRpcError copy$default(JsonRpcError jsonRpcError, long j, int i, String str, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        j = jsonRpcError.id;
                    }
                    if ((i2 & 2) != 0) {
                        i = jsonRpcError.code;
                    }
                    if ((i2 & 4) != 0) {
                        str = jsonRpcError.message;
                    }
                    return jsonRpcError.copy(j, i, str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long component1() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final int component2() {
                    return this.code;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component3() {
                    return this.message;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final JsonRpcError copy(long j, int i, @NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return new JsonRpcError(j, i, str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof JsonRpcError)) {
                        return false;
                    }
                    JsonRpcError jsonRpcError = (JsonRpcError) obj;
                    return this.id == jsonRpcError.id && this.code == jsonRpcError.code && Intrinsics.EZpvd((Object) this.message, (Object) jsonRpcError.message);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final int getCode() {
                    return this.code;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.sign.client.Sign.Model.JsonRpcResponse
                public long getId() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getMessage() {
                    return this.message;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (((Long.hashCode(this.id) * 31) + Integer.hashCode(this.code)) * 31) + this.message.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "JsonRpcError(id=" + this.id + ", code=" + this.code + ", message=" + this.message + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public JsonRpcError(long j, int i, @NotNull String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    this.id = j;
                    this.code = i;
                    this.message = str;
                }
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class PendingRequest extends Model {
            public final String chainId;
            public final String method;
            public final String params;
            public final long requestId;
            public final String topic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ PendingRequest copy$default(PendingRequest pendingRequest, long j, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = pendingRequest.requestId;
                }
                long j2 = j;
                if ((i & 2) != 0) {
                    str = pendingRequest.topic;
                }
                String str5 = str;
                if ((i & 4) != 0) {
                    str2 = pendingRequest.method;
                }
                String str6 = str2;
                if ((i & 8) != 0) {
                    str3 = pendingRequest.chainId;
                }
                String str7 = str3;
                if ((i & 16) != 0) {
                    str4 = pendingRequest.params;
                }
                return pendingRequest.copy(j2, str5, str6, str7, str4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long component1() {
                return this.requestId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.method;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component4() {
                return this.chainId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component5() {
                return this.params;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PendingRequest copy(long j, @NotNull String str, @NotNull String str2, String str3, @NotNull String str4) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str4, "");
                return new PendingRequest(j, str, str2, str3, str4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PendingRequest)) {
                    return false;
                }
                PendingRequest pendingRequest = (PendingRequest) obj;
                return this.requestId == pendingRequest.requestId && Intrinsics.EZpvd((Object) this.topic, (Object) pendingRequest.topic) && Intrinsics.EZpvd((Object) this.method, (Object) pendingRequest.method) && Intrinsics.EZpvd((Object) this.chainId, (Object) pendingRequest.chainId) && Intrinsics.EZpvd((Object) this.params, (Object) pendingRequest.params);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getChainId() {
                return this.chainId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getMethod() {
                return this.method;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getParams() {
                return this.params;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long getRequestId() {
                return this.requestId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = Long.hashCode(this.requestId);
                int iHashCode2 = this.topic.hashCode();
                int iHashCode3 = this.method.hashCode();
                String str = this.chainId;
                return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.params.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "PendingRequest(requestId=" + this.requestId + ", topic=" + this.topic + ", method=" + this.method + ", chainId=" + this.chainId + ", params=" + this.params + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PendingRequest(long j, @NotNull String str, @NotNull String str2, String str3, @NotNull String str4) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str4, "");
                this.requestId = j;
                this.topic = str;
                this.method = str2;
                this.chainId = str3;
                this.params = str4;
            }
        }

        public static final class ConnectionState extends Model {
            public final boolean isAvailable;
            public final Reason reason;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ConnectionState copy$default(ConnectionState connectionState, boolean z, Reason reason, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = connectionState.isAvailable;
                }
                if ((i & 2) != 0) {
                    reason = connectionState.reason;
                }
                return connectionState.copy(z, reason);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean component1() {
                return this.isAvailable;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Reason component2() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ConnectionState copy(boolean z, Reason reason) {
                return new ConnectionState(z, reason);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConnectionState)) {
                    return false;
                }
                ConnectionState connectionState = (ConnectionState) obj;
                return this.isAvailable == connectionState.isAvailable && Intrinsics.EZpvd(this.reason, connectionState.reason);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Reason getReason() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.isAvailable);
                Reason reason = this.reason;
                return (iHashCode * 31) + (reason == null ? 0 : reason.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean isAvailable() {
                return this.isAvailable;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ConnectionState(isAvailable=" + this.isAvailable + ", reason=" + this.reason + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 boolean)
  (wrap:com.reown.sign.client.Sign$Model$ConnectionState$Reason:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.reown.sign.client.Sign$Model$ConnectionState$Reason) : (r2v0 com.reown.sign.client.Sign$Model$ConnectionState$Reason))
 A[MD:(boolean, com.reown.sign.client.Sign$Model$ConnectionState$Reason):void (m)] (LINE:208) call: com.reown.sign.client.Sign.Model.ConnectionState.<init>(boolean, com.reown.sign.client.Sign$Model$ConnectionState$Reason):void type: THIS */
            public /* synthetic */ ConnectionState(boolean z, Reason reason, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(z, (i & 2) != 0 ? null : reason);
            }

            public static abstract class Reason extends Model {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.client.Sign.Model.ConnectionState.Reason.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Reason(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public static final class ConnectionClosed extends Reason {
                    public final String message;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public static /* synthetic */ ConnectionClosed copy$default(ConnectionClosed connectionClosed, String str, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = connectionClosed.message;
                        }
                        return connectionClosed.copy(str);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component1() {
                        return this.message;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final ConnectionClosed copy(@NotNull String str) {
                        Intrinsics.checkNotNullParameter(str, "");
                        return new ConnectionClosed(str);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof ConnectionClosed) && Intrinsics.EZpvd((Object) this.message, (Object) ((ConnectionClosed) obj).message);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getMessage() {
                        return this.message;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public int hashCode() {
                        return this.message.hashCode();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public String toString() {
                        return "ConnectionClosed(message=" + this.message + ")";
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public ConnectionClosed(@NotNull String str) {
                        super(null);
                        Intrinsics.checkNotNullParameter(str, "");
                        this.message = str;
                    }
                }

                public Reason() {
                    super(null);
                }

                public static final class ConnectionFailed extends Reason {
                    public final Throwable throwable;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public static /* synthetic */ ConnectionFailed copy$default(ConnectionFailed connectionFailed, Throwable th, int i, Object obj) {
                        if ((i & 1) != 0) {
                            th = connectionFailed.throwable;
                        }
                        return connectionFailed.copy(th);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final Throwable component1() {
                        return this.throwable;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final ConnectionFailed copy(@NotNull Throwable th) {
                        Intrinsics.checkNotNullParameter(th, "");
                        return new ConnectionFailed(th);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof ConnectionFailed) && Intrinsics.EZpvd(this.throwable, ((ConnectionFailed) obj).throwable);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final Throwable getThrowable() {
                        return this.throwable;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public int hashCode() {
                        return this.throwable.hashCode();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public String toString() {
                        return "ConnectionFailed(throwable=" + this.throwable + ")";
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public ConnectionFailed(@NotNull Throwable th) {
                        super(null);
                        Intrinsics.checkNotNullParameter(th, "");
                        this.throwable = th;
                    }
                }
            }

            public ConnectionState(boolean z, Reason reason) {
                super(null);
                this.isAvailable = z;
                this.reason = reason;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static abstract class Message extends Model {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.client.Sign.Model.Message.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Message(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Message() {
                super(null);
            }

            public static final class SessionProposal extends Message {
                public final String description;
                public final List<String> icons;
                public final long id;
                public final String name;
                public final Map<String, Namespace.Proposal> optionalNamespaces;
                public final String pairingTopic;
                public final Map<String, String> properties;
                public final String proposerPublicKey;
                public final String redirect;
                public final String relayData;
                public final String relayProtocol;
                public final Map<String, Namespace.Proposal> requiredNamespaces;
                public final String url;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long component1() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, String> component10() {
                    return this.properties;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component11() {
                    return this.proposerPublicKey;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component12() {
                    return this.relayProtocol;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component13() {
                    return this.relayData;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component2() {
                    return this.pairingTopic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component3() {
                    return this.name;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component4() {
                    return this.description;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component5() {
                    return this.url;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> component6() {
                    return this.icons;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component7() {
                    return this.redirect;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, Namespace.Proposal> component8() {
                    return this.requiredNamespaces;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, Namespace.Proposal> component9() {
                    return this.optionalNamespaces;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final SessionProposal copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<String> list, @NotNull String str5, @NotNull Map<String, Namespace.Proposal> map, @NotNull Map<String, Namespace.Proposal> map2, Map<String, String> map3, @NotNull String str6, @NotNull String str7, String str8) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(str3, "");
                    Intrinsics.checkNotNullParameter(str4, "");
                    Intrinsics.checkNotNullParameter(list, "");
                    Intrinsics.checkNotNullParameter(str5, "");
                    Intrinsics.checkNotNullParameter(map, "");
                    Intrinsics.checkNotNullParameter(map2, "");
                    Intrinsics.checkNotNullParameter(str6, "");
                    Intrinsics.checkNotNullParameter(str7, "");
                    return new SessionProposal(j, str, str2, str3, str4, list, str5, map, map2, map3, str6, str7, str8);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SessionProposal)) {
                        return false;
                    }
                    SessionProposal sessionProposal = (SessionProposal) obj;
                    return this.id == sessionProposal.id && Intrinsics.EZpvd((Object) this.pairingTopic, (Object) sessionProposal.pairingTopic) && Intrinsics.EZpvd((Object) this.name, (Object) sessionProposal.name) && Intrinsics.EZpvd((Object) this.description, (Object) sessionProposal.description) && Intrinsics.EZpvd((Object) this.url, (Object) sessionProposal.url) && Intrinsics.EZpvd(this.icons, sessionProposal.icons) && Intrinsics.EZpvd((Object) this.redirect, (Object) sessionProposal.redirect) && Intrinsics.EZpvd(this.requiredNamespaces, sessionProposal.requiredNamespaces) && Intrinsics.EZpvd(this.optionalNamespaces, sessionProposal.optionalNamespaces) && Intrinsics.EZpvd(this.properties, sessionProposal.properties) && Intrinsics.EZpvd((Object) this.proposerPublicKey, (Object) sessionProposal.proposerPublicKey) && Intrinsics.EZpvd((Object) this.relayProtocol, (Object) sessionProposal.relayProtocol) && Intrinsics.EZpvd((Object) this.relayData, (Object) sessionProposal.relayData);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getDescription() {
                    return this.description;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getIcons() {
                    return this.icons;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long getId() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getName() {
                    return this.name;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, Namespace.Proposal> getOptionalNamespaces() {
                    return this.optionalNamespaces;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getPairingTopic() {
                    return this.pairingTopic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, String> getProperties() {
                    return this.properties;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getProposerPublicKey() {
                    return this.proposerPublicKey;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getRedirect() {
                    return this.redirect;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getRelayData() {
                    return this.relayData;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getRelayProtocol() {
                    return this.relayProtocol;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, Namespace.Proposal> getRequiredNamespaces() {
                    return this.requiredNamespaces;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getUrl() {
                    return this.url;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = Long.hashCode(this.id);
                    int iHashCode2 = this.pairingTopic.hashCode();
                    int iHashCode3 = this.name.hashCode();
                    int iHashCode4 = this.description.hashCode();
                    int iHashCode5 = this.url.hashCode();
                    int iHashCode6 = this.icons.hashCode();
                    int iHashCode7 = this.redirect.hashCode();
                    int iHashCode8 = this.requiredNamespaces.hashCode();
                    int iHashCode9 = this.optionalNamespaces.hashCode();
                    Map<String, String> map = this.properties;
                    int iHashCode10 = map == null ? 0 : map.hashCode();
                    int iHashCode11 = this.proposerPublicKey.hashCode();
                    int iHashCode12 = this.relayProtocol.hashCode();
                    String str = this.relayData;
                    return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str != null ? str.hashCode() : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "SessionProposal(id=" + this.id + ", pairingTopic=" + this.pairingTopic + ", name=" + this.name + ", description=" + this.description + ", url=" + this.url + ", icons=" + this.icons + ", redirect=" + this.redirect + ", requiredNamespaces=" + this.requiredNamespaces + ", optionalNamespaces=" + this.optionalNamespaces + ", properties=" + this.properties + ", proposerPublicKey=" + this.proposerPublicKey + ", relayProtocol=" + this.relayProtocol + ", relayData=" + this.relayData + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SessionProposal(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<String> list, @NotNull String str5, @NotNull Map<String, Namespace.Proposal> map, @NotNull Map<String, Namespace.Proposal> map2, Map<String, String> map3, @NotNull String str6, @NotNull String str7, String str8) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(str3, "");
                    Intrinsics.checkNotNullParameter(str4, "");
                    Intrinsics.checkNotNullParameter(list, "");
                    Intrinsics.checkNotNullParameter(str5, "");
                    Intrinsics.checkNotNullParameter(map, "");
                    Intrinsics.checkNotNullParameter(map2, "");
                    Intrinsics.checkNotNullParameter(str6, "");
                    Intrinsics.checkNotNullParameter(str7, "");
                    this.id = j;
                    this.pairingTopic = str;
                    this.name = str2;
                    this.description = str3;
                    this.url = str4;
                    this.icons = list;
                    this.redirect = str5;
                    this.requiredNamespaces = map;
                    this.optionalNamespaces = map2;
                    this.properties = map3;
                    this.proposerPublicKey = str6;
                    this.relayProtocol = str7;
                    this.relayData = str8;
                }
            }

            public static final class SessionRequest extends Message {
                public final String chainId;
                public final Core.Model.AppMetaData peerMetaData;
                public final JSONRPCRequest request;
                public final String topic;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ SessionRequest copy$default(SessionRequest sessionRequest, String str, String str2, Core.Model.AppMetaData appMetaData, JSONRPCRequest jSONRPCRequest, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = sessionRequest.topic;
                    }
                    if ((i & 2) != 0) {
                        str2 = sessionRequest.chainId;
                    }
                    if ((i & 4) != 0) {
                        appMetaData = sessionRequest.peerMetaData;
                    }
                    if ((i & 8) != 0) {
                        jSONRPCRequest = sessionRequest.request;
                    }
                    return sessionRequest.copy(str, str2, appMetaData, jSONRPCRequest);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component2() {
                    return this.chainId;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Core.Model.AppMetaData component3() {
                    return this.peerMetaData;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final JSONRPCRequest component4() {
                    return this.request;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final SessionRequest copy(@NotNull String str, String str2, Core.Model.AppMetaData appMetaData, @NotNull JSONRPCRequest jSONRPCRequest) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(jSONRPCRequest, "");
                    return new SessionRequest(str, str2, appMetaData, jSONRPCRequest);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SessionRequest)) {
                        return false;
                    }
                    SessionRequest sessionRequest = (SessionRequest) obj;
                    return Intrinsics.EZpvd((Object) this.topic, (Object) sessionRequest.topic) && Intrinsics.EZpvd((Object) this.chainId, (Object) sessionRequest.chainId) && Intrinsics.EZpvd(this.peerMetaData, sessionRequest.peerMetaData) && Intrinsics.EZpvd(this.request, sessionRequest.request);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getChainId() {
                    return this.chainId;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Core.Model.AppMetaData getPeerMetaData() {
                    return this.peerMetaData;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final JSONRPCRequest getRequest() {
                    return this.request;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getTopic() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = this.topic.hashCode();
                    String str = this.chainId;
                    int iHashCode2 = str == null ? 0 : str.hashCode();
                    Core.Model.AppMetaData appMetaData = this.peerMetaData;
                    return (((((iHashCode * 31) + iHashCode2) * 31) + (appMetaData != null ? appMetaData.hashCode() : 0)) * 31) + this.request.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "SessionRequest(topic=" + this.topic + ", chainId=" + this.chainId + ", peerMetaData=" + this.peerMetaData + ", request=" + this.request + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SessionRequest(@NotNull String str, String str2, Core.Model.AppMetaData appMetaData, @NotNull JSONRPCRequest jSONRPCRequest) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(jSONRPCRequest, "");
                    this.topic = str;
                    this.chainId = str2;
                    this.peerMetaData = appMetaData;
                    this.request = jSONRPCRequest;
                }

                public static final class JSONRPCRequest extends Message {
                    public final long id;
                    public final String method;
                    public final String params;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public static /* synthetic */ JSONRPCRequest copy$default(JSONRPCRequest jSONRPCRequest, long j, String str, String str2, int i, Object obj) {
                        if ((i & 1) != 0) {
                            j = jSONRPCRequest.id;
                        }
                        if ((i & 2) != 0) {
                            str = jSONRPCRequest.method;
                        }
                        if ((i & 4) != 0) {
                            str2 = jSONRPCRequest.params;
                        }
                        return jSONRPCRequest.copy(j, str, str2);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final long component1() {
                        return this.id;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component2() {
                        return this.method;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component3() {
                        return this.params;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final JSONRPCRequest copy(long j, @NotNull String str, @NotNull String str2) {
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        return new JSONRPCRequest(j, str, str2);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof JSONRPCRequest)) {
                            return false;
                        }
                        JSONRPCRequest jSONRPCRequest = (JSONRPCRequest) obj;
                        return this.id == jSONRPCRequest.id && Intrinsics.EZpvd((Object) this.method, (Object) jSONRPCRequest.method) && Intrinsics.EZpvd((Object) this.params, (Object) jSONRPCRequest.params);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final long getId() {
                        return this.id;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getMethod() {
                        return this.method;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getParams() {
                        return this.params;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public int hashCode() {
                        return (((Long.hashCode(this.id) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public String toString() {
                        return "JSONRPCRequest(id=" + this.id + ", method=" + this.method + ", params=" + this.params + ")";
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public JSONRPCRequest(long j, @NotNull String str, @NotNull String str2) {
                        super(null);
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        this.id = j;
                        this.method = str;
                        this.params = str2;
                    }
                }
            }

            public static final class SessionAuthenticate extends Message {
                public final long expiry;
                public final long id;
                public final Core.Model.AppMetaData metadata;
                public final PayloadParams payloadParams;
                public final String topic;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long component1() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component2() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Core.Model.AppMetaData component3() {
                    return this.metadata;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final PayloadParams component4() {
                    return this.payloadParams;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long component5() {
                    return this.expiry;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final SessionAuthenticate copy(long j, @NotNull String str, @NotNull Core.Model.AppMetaData appMetaData, @NotNull PayloadParams payloadParams, long j2) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(appMetaData, "");
                    Intrinsics.checkNotNullParameter(payloadParams, "");
                    return new SessionAuthenticate(j, str, appMetaData, payloadParams, j2);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SessionAuthenticate)) {
                        return false;
                    }
                    SessionAuthenticate sessionAuthenticate = (SessionAuthenticate) obj;
                    return this.id == sessionAuthenticate.id && Intrinsics.EZpvd((Object) this.topic, (Object) sessionAuthenticate.topic) && Intrinsics.EZpvd(this.metadata, sessionAuthenticate.metadata) && Intrinsics.EZpvd(this.payloadParams, sessionAuthenticate.payloadParams) && this.expiry == sessionAuthenticate.expiry;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long getExpiry() {
                    return this.expiry;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long getId() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Core.Model.AppMetaData getMetadata() {
                    return this.metadata;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final PayloadParams getPayloadParams() {
                    return this.payloadParams;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getTopic() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (((((((Long.hashCode(this.id) * 31) + this.topic.hashCode()) * 31) + this.metadata.hashCode()) * 31) + this.payloadParams.hashCode()) * 31) + Long.hashCode(this.expiry);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "SessionAuthenticate(id=" + this.id + ", topic=" + this.topic + ", metadata=" + this.metadata + ", payloadParams=" + this.payloadParams + ", expiry=" + this.expiry + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SessionAuthenticate(long j, @NotNull String str, @NotNull Core.Model.AppMetaData appMetaData, @NotNull PayloadParams payloadParams, long j2) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(appMetaData, "");
                    Intrinsics.checkNotNullParameter(payloadParams, "");
                    this.id = j;
                    this.topic = str;
                    this.metadata = appMetaData;
                    this.payloadParams = payloadParams;
                    this.expiry = j2;
                }
            }
        }

        public static final class SessionAuthenticate {
            public final long expiry;
            public final long id;
            public final Participant participant;
            public final PayloadParams payloadParams;
            public final String topic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Participant component3() {
                return this.participant;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PayloadParams component4() {
                return this.payloadParams;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long component5() {
                return this.expiry;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SessionAuthenticate copy(long j, @NotNull String str, @NotNull Participant participant, @NotNull PayloadParams payloadParams, long j2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(participant, "");
                Intrinsics.checkNotNullParameter(payloadParams, "");
                return new SessionAuthenticate(j, str, participant, payloadParams, j2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SessionAuthenticate)) {
                    return false;
                }
                SessionAuthenticate sessionAuthenticate = (SessionAuthenticate) obj;
                return this.id == sessionAuthenticate.id && Intrinsics.EZpvd((Object) this.topic, (Object) sessionAuthenticate.topic) && Intrinsics.EZpvd(this.participant, sessionAuthenticate.participant) && Intrinsics.EZpvd(this.payloadParams, sessionAuthenticate.payloadParams) && this.expiry == sessionAuthenticate.expiry;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long getExpiry() {
                return this.expiry;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Participant getParticipant() {
                return this.participant;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PayloadParams getPayloadParams() {
                return this.payloadParams;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((((((Long.hashCode(this.id) * 31) + this.topic.hashCode()) * 31) + this.participant.hashCode()) * 31) + this.payloadParams.hashCode()) * 31) + Long.hashCode(this.expiry);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SessionAuthenticate(id=" + this.id + ", topic=" + this.topic + ", participant=" + this.participant + ", payloadParams=" + this.payloadParams + ", expiry=" + this.expiry + ")";
            }

            public SessionAuthenticate(long j, @NotNull String str, @NotNull Participant participant, @NotNull PayloadParams payloadParams, long j2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(participant, "");
                Intrinsics.checkNotNullParameter(payloadParams, "");
                this.id = j;
                this.topic = str;
                this.participant = participant;
                this.payloadParams = payloadParams;
                this.expiry = j2;
            }

            public static final class Participant extends Model {
                public final Core.Model.AppMetaData metadata;
                public final String publicKey;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Participant copy$default(Participant participant, String str, Core.Model.AppMetaData appMetaData, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = participant.publicKey;
                    }
                    if ((i & 2) != 0) {
                        appMetaData = participant.metadata;
                    }
                    return participant.copy(str, appMetaData);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.publicKey;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Core.Model.AppMetaData component2() {
                    return this.metadata;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Participant copy(@NotNull String str, Core.Model.AppMetaData appMetaData) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return new Participant(str, appMetaData);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Participant)) {
                        return false;
                    }
                    Participant participant = (Participant) obj;
                    return Intrinsics.EZpvd((Object) this.publicKey, (Object) participant.publicKey) && Intrinsics.EZpvd(this.metadata, participant.metadata);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Core.Model.AppMetaData getMetadata() {
                    return this.metadata;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getPublicKey() {
                    return this.publicKey;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = this.publicKey.hashCode();
                    Core.Model.AppMetaData appMetaData = this.metadata;
                    return (iHashCode * 31) + (appMetaData == null ? 0 : appMetaData.hashCode());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Participant(publicKey=" + this.publicKey + ", metadata=" + this.metadata + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Participant(@NotNull String str, Core.Model.AppMetaData appMetaData) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    this.publicKey = str;
                    this.metadata = appMetaData;
                }
            }
        }

        public static final class PayloadParams extends Model {
            public final String aud;
            public final List<String> chains;
            public final String domain;
            public final String exp;
            public final String iat;
            public final String nbf;
            public final String nonce;
            public final String requestId;
            public List<String> resources;
            public final String statement;
            public final String type;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> component1() {
                return this.chains;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component10() {
                return this.requestId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> component11() {
                return this.resources;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.domain;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.nonce;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component4() {
                return this.aud;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component5() {
                return this.type;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component6() {
                return this.nbf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component7() {
                return this.exp;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component8() {
                return this.iat;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component9() {
                return this.statement;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PayloadParams copy(@NotNull List<String> list, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, @NotNull String str7, String str8, String str9, List<String> list2) {
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str7, "");
                return new PayloadParams(list, str, str2, str3, str4, str5, str6, str7, str8, str9, list2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PayloadParams)) {
                    return false;
                }
                PayloadParams payloadParams = (PayloadParams) obj;
                return Intrinsics.EZpvd(this.chains, payloadParams.chains) && Intrinsics.EZpvd((Object) this.domain, (Object) payloadParams.domain) && Intrinsics.EZpvd((Object) this.nonce, (Object) payloadParams.nonce) && Intrinsics.EZpvd((Object) this.aud, (Object) payloadParams.aud) && Intrinsics.EZpvd((Object) this.type, (Object) payloadParams.type) && Intrinsics.EZpvd((Object) this.nbf, (Object) payloadParams.nbf) && Intrinsics.EZpvd((Object) this.exp, (Object) payloadParams.exp) && Intrinsics.EZpvd((Object) this.iat, (Object) payloadParams.iat) && Intrinsics.EZpvd((Object) this.statement, (Object) payloadParams.statement) && Intrinsics.EZpvd((Object) this.requestId, (Object) payloadParams.requestId) && Intrinsics.EZpvd(this.resources, payloadParams.resources);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getAud() {
                return this.aud;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> getChains() {
                return this.chains;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getDomain() {
                return this.domain;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getExp() {
                return this.exp;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getIat() {
                return this.iat;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getNbf() {
                return this.nbf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getNonce() {
                return this.nonce;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getRequestId() {
                return this.requestId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> getResources() {
                return this.resources;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getStatement() {
                return this.statement;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getType() {
                return this.type;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.chains.hashCode();
                int iHashCode2 = this.domain.hashCode();
                int iHashCode3 = this.nonce.hashCode();
                int iHashCode4 = this.aud.hashCode();
                String str = this.type;
                int iHashCode5 = str == null ? 0 : str.hashCode();
                String str2 = this.nbf;
                int iHashCode6 = str2 == null ? 0 : str2.hashCode();
                String str3 = this.exp;
                int iHashCode7 = str3 == null ? 0 : str3.hashCode();
                int iHashCode8 = this.iat.hashCode();
                String str4 = this.statement;
                int iHashCode9 = str4 == null ? 0 : str4.hashCode();
                String str5 = this.requestId;
                int iHashCode10 = str5 == null ? 0 : str5.hashCode();
                List<String> list = this.resources;
                return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (list != null ? list.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setResources(List<String> list) {
                this.resources = list;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "PayloadParams(chains=" + this.chains + ", domain=" + this.domain + ", nonce=" + this.nonce + ", aud=" + this.aud + ", type=" + this.type + ", nbf=" + this.nbf + ", exp=" + this.exp + ", iat=" + this.iat + ", statement=" + this.statement + ", requestId=" + this.requestId + ", resources=" + this.resources + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PayloadParams(@NotNull List<String> list, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, @NotNull String str7, String str8, String str9, List<String> list2) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str7, "");
                this.chains = list;
                this.domain = str;
                this.nonce = str2;
                this.aud = str3;
                this.type = str4;
                this.nbf = str5;
                this.exp = str6;
                this.iat = str7;
                this.statement = str8;
                this.requestId = str9;
                this.resources = list2;
            }
        }

        public static final class Cacao extends Model {
            public final Header header;
            public final Payload payload;
            public final Signature signature;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Cacao copy$default(Cacao cacao, Header header, Payload payload, Signature signature, int i, Object obj) {
                if ((i & 1) != 0) {
                    header = cacao.header;
                }
                if ((i & 2) != 0) {
                    payload = cacao.payload;
                }
                if ((i & 4) != 0) {
                    signature = cacao.signature;
                }
                return cacao.copy(header, payload, signature);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Header component1() {
                return this.header;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Payload component2() {
                return this.payload;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Signature component3() {
                return this.signature;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Cacao copy(@NotNull Header header, @NotNull Payload payload, @NotNull Signature signature) {
                Intrinsics.checkNotNullParameter(header, "");
                Intrinsics.checkNotNullParameter(payload, "");
                Intrinsics.checkNotNullParameter(signature, "");
                return new Cacao(header, payload, signature);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Cacao)) {
                    return false;
                }
                Cacao cacao = (Cacao) obj;
                return Intrinsics.EZpvd(this.header, cacao.header) && Intrinsics.EZpvd(this.payload, cacao.payload) && Intrinsics.EZpvd(this.signature, cacao.signature);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Header getHeader() {
                return this.header;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Payload getPayload() {
                return this.payload;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Signature getSignature() {
                return this.signature;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.header.hashCode() * 31) + this.payload.hashCode()) * 31) + this.signature.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Cacao(header=" + this.header + ", payload=" + this.payload + ", signature=" + this.signature + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Cacao(@NotNull Header header, @NotNull Payload payload, @NotNull Signature signature) {
                super(null);
                Intrinsics.checkNotNullParameter(header, "");
                Intrinsics.checkNotNullParameter(payload, "");
                Intrinsics.checkNotNullParameter(signature, "");
                this.header = header;
                this.payload = payload;
                this.signature = signature;
            }

            public static final class Signature extends Model implements SignatureInterface {
                private final String m;
                private final String s;
                private final String t;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Signature copy$default(Signature signature, String str, String str2, String str3, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = signature.t;
                    }
                    if ((i & 2) != 0) {
                        str2 = signature.s;
                    }
                    if ((i & 4) != 0) {
                        str3 = signature.m;
                    }
                    return signature.copy(str, str2, str3);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.t;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component2() {
                    return this.s;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component3() {
                    return this.m;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Signature copy(@NotNull String str, @NotNull String str2, String str3) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    return new Signature(str, str2, str3);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Signature)) {
                        return false;
                    }
                    Signature signature = (Signature) obj;
                    return Intrinsics.EZpvd((Object) this.t, (Object) signature.t) && Intrinsics.EZpvd((Object) this.s, (Object) signature.s) && Intrinsics.EZpvd((Object) this.m, (Object) signature.m);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.android.cacao.SignatureInterface
                public String getM() {
                    return this.m;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.android.cacao.SignatureInterface
                public String getS() {
                    return this.s;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.android.cacao.SignatureInterface
                public String getT() {
                    return this.t;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = this.t.hashCode();
                    int iHashCode2 = this.s.hashCode();
                    String str = this.m;
                    return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Signature(t=" + this.t + ", s=" + this.s + ", m=" + this.m + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Signature(@NotNull String str, @NotNull String str2, String str3) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    this.t = str;
                    this.s = str2;
                    this.m = str3;
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:291) call: com.reown.sign.client.Sign.Model.Cacao.Signature.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
                public /* synthetic */ Signature(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, str2, (i & 4) != 0 ? null : str3);
                }
            }

            public static final class Header extends Model {
                public final String t;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Header copy$default(Header header, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = header.t;
                    }
                    return header.copy(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.t;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Header copy(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return new Header(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Header) && Intrinsics.EZpvd((Object) this.t, (Object) ((Header) obj).t);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getT() {
                    return this.t;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return this.t.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Header(t=" + this.t + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Header(@NotNull String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    this.t = str;
                }
            }

            public static final class Payload extends Model {
                public final String aud;
                public final String domain;
                public final String exp;
                public final String iat;
                public final String iss;
                public final String nbf;
                public final String nonce;
                public final String requestId;
                public final List<String> resources;
                public final String statement;
                public final String version;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.iss;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component10() {
                    return this.requestId;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> component11() {
                    return this.resources;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component2() {
                    return this.domain;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component3() {
                    return this.aud;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component4() {
                    return this.version;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component5() {
                    return this.nonce;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component6() {
                    return this.iat;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component7() {
                    return this.nbf;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component8() {
                    return this.exp;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component9() {
                    return this.statement;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Payload copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, String str8, String str9, String str10, List<String> list) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(str3, "");
                    Intrinsics.checkNotNullParameter(str4, "");
                    Intrinsics.checkNotNullParameter(str5, "");
                    Intrinsics.checkNotNullParameter(str6, "");
                    return new Payload(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, list);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Payload)) {
                        return false;
                    }
                    Payload payload = (Payload) obj;
                    return Intrinsics.EZpvd((Object) this.iss, (Object) payload.iss) && Intrinsics.EZpvd((Object) this.domain, (Object) payload.domain) && Intrinsics.EZpvd((Object) this.aud, (Object) payload.aud) && Intrinsics.EZpvd((Object) this.version, (Object) payload.version) && Intrinsics.EZpvd((Object) this.nonce, (Object) payload.nonce) && Intrinsics.EZpvd((Object) this.iat, (Object) payload.iat) && Intrinsics.EZpvd((Object) this.nbf, (Object) payload.nbf) && Intrinsics.EZpvd((Object) this.exp, (Object) payload.exp) && Intrinsics.EZpvd((Object) this.statement, (Object) payload.statement) && Intrinsics.EZpvd((Object) this.requestId, (Object) payload.requestId) && Intrinsics.EZpvd(this.resources, payload.resources);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getAud() {
                    return this.aud;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getDomain() {
                    return this.domain;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getExp() {
                    return this.exp;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getIat() {
                    return this.iat;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getIss() {
                    return this.iss;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getNbf() {
                    return this.nbf;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getNonce() {
                    return this.nonce;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getRequestId() {
                    return this.requestId;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getResources() {
                    return this.resources;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getStatement() {
                    return this.statement;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getVersion() {
                    return this.version;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = this.iss.hashCode();
                    int iHashCode2 = this.domain.hashCode();
                    int iHashCode3 = this.aud.hashCode();
                    int iHashCode4 = this.version.hashCode();
                    int iHashCode5 = this.nonce.hashCode();
                    int iHashCode6 = this.iat.hashCode();
                    String str = this.nbf;
                    int iHashCode7 = str == null ? 0 : str.hashCode();
                    String str2 = this.exp;
                    int iHashCode8 = str2 == null ? 0 : str2.hashCode();
                    String str3 = this.statement;
                    int iHashCode9 = str3 == null ? 0 : str3.hashCode();
                    String str4 = this.requestId;
                    int iHashCode10 = str4 == null ? 0 : str4.hashCode();
                    List<String> list = this.resources;
                    return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (list != null ? list.hashCode() : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Payload(iss=" + this.iss + ", domain=" + this.domain + ", aud=" + this.aud + ", version=" + this.version + ", nonce=" + this.nonce + ", iat=" + this.iat + ", nbf=" + this.nbf + ", exp=" + this.exp + ", statement=" + this.statement + ", requestId=" + this.requestId + ", resources=" + this.resources + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Payload(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, String str8, String str9, String str10, List<String> list) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(str3, "");
                    Intrinsics.checkNotNullParameter(str4, "");
                    Intrinsics.checkNotNullParameter(str5, "");
                    Intrinsics.checkNotNullParameter(str6, "");
                    this.iss = str;
                    this.domain = str2;
                    this.aud = str3;
                    this.version = str4;
                    this.nonce = str5;
                    this.iat = str6;
                    this.nbf = str7;
                    this.exp = str8;
                    this.statement = str9;
                    this.requestId = str10;
                    this.resources = list;
                }

                public final String getAddress() {
                    return new Issuer(this.iss).getAddress();
                }
            }
        }
    }

    public static abstract class Params {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.client.Sign.Params.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Params(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Params() {
        }

        public static final class Init extends Params {
            public final CoreInterface core;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Init copy$default(Init init, CoreInterface coreInterface, int i, Object obj) {
                if ((i & 1) != 0) {
                    coreInterface = init.core;
                }
                return init.copy(coreInterface);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CoreInterface component1() {
                return this.core;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Init copy(@NotNull CoreInterface coreInterface) {
                Intrinsics.checkNotNullParameter(coreInterface, "");
                return new Init(coreInterface);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Init) && Intrinsics.EZpvd(this.core, ((Init) obj).core);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CoreInterface getCore() {
                return this.core;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.core.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Init(core=" + this.core + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Init(@NotNull CoreInterface coreInterface) {
                super(null);
                Intrinsics.checkNotNullParameter(coreInterface, "");
                this.core = coreInterface;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Connect extends Params {
            public final Map<String, Model.Namespace.Proposal> namespaces;
            public final Map<String, Model.Namespace.Proposal> optionalNamespaces;
            public final Core.Model.Pairing pairing;
            public final Map<String, String> properties;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.client.Sign$Params$Connect */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Connect copy$default(Connect connect, Map map, Map map2, Map map3, Core.Model.Pairing pairing, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = connect.namespaces;
                }
                if ((i & 2) != 0) {
                    map2 = connect.optionalNamespaces;
                }
                if ((i & 4) != 0) {
                    map3 = connect.properties;
                }
                if ((i & 8) != 0) {
                    pairing = connect.pairing;
                }
                return connect.copy(map, map2, map3, pairing);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Model.Namespace.Proposal> component1() {
                return this.namespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Model.Namespace.Proposal> component2() {
                return this.optionalNamespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, String> component3() {
                return this.properties;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Core.Model.Pairing component4() {
                return this.pairing;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Connect copy(Map<String, Model.Namespace.Proposal> map, Map<String, Model.Namespace.Proposal> map2, Map<String, String> map3, @NotNull Core.Model.Pairing pairing) {
                Intrinsics.checkNotNullParameter(pairing, "");
                return new Connect(map, map2, map3, pairing);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Connect)) {
                    return false;
                }
                Connect connect = (Connect) obj;
                return Intrinsics.EZpvd(this.namespaces, connect.namespaces) && Intrinsics.EZpvd(this.optionalNamespaces, connect.optionalNamespaces) && Intrinsics.EZpvd(this.properties, connect.properties) && Intrinsics.EZpvd(this.pairing, connect.pairing);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Model.Namespace.Proposal> getNamespaces() {
                return this.namespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Model.Namespace.Proposal> getOptionalNamespaces() {
                return this.optionalNamespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Core.Model.Pairing getPairing() {
                return this.pairing;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, String> getProperties() {
                return this.properties;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                Map<String, Model.Namespace.Proposal> map = this.namespaces;
                int iHashCode = map == null ? 0 : map.hashCode();
                Map<String, Model.Namespace.Proposal> map2 = this.optionalNamespaces;
                int iHashCode2 = map2 == null ? 0 : map2.hashCode();
                Map<String, String> map3 = this.properties;
                return (((((iHashCode * 31) + iHashCode2) * 31) + (map3 != null ? map3.hashCode() : 0)) * 31) + this.pairing.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Connect(namespaces=" + this.namespaces + ", optionalNamespaces=" + this.optionalNamespaces + ", properties=" + this.properties + ", pairing=" + this.pairing + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r2v0 java.util.Map))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r3v0 java.util.Map))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r4v0 java.util.Map))
  (r5v0 com.reown.android.Core$Model$Pairing)
 A[MD:(java.util.Map<java.lang.String, com.reown.sign.client.Sign$Model$Namespace$Proposal>, java.util.Map<java.lang.String, com.reown.sign.client.Sign$Model$Namespace$Proposal>, java.util.Map<java.lang.String, java.lang.String>, com.reown.android.Core$Model$Pairing):void (m)] (LINE:317) call: com.reown.sign.client.Sign.Params.Connect.<init>(java.util.Map, java.util.Map, java.util.Map, com.reown.android.Core$Model$Pairing):void type: THIS */
            public /* synthetic */ Connect(Map map, Map map2, Map map3, Core.Model.Pairing pairing, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2, (i & 4) != 0 ? null : map3, pairing);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Connect(Map<String, Model.Namespace.Proposal> map, Map<String, Model.Namespace.Proposal> map2, Map<String, String> map3, @NotNull Core.Model.Pairing pairing) {
                super(null);
                Intrinsics.checkNotNullParameter(pairing, "");
                this.namespaces = map;
                this.optionalNamespaces = map2;
                this.properties = map3;
                this.pairing = pairing;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Authenticate extends Params {
            public final List<String> chains;
            public final String domain;
            public final String exp;
            public final Long expiry;
            public final List<String> methods;
            public final String nbf;
            public final String nonce;
            public final String pairingTopic;
            public final String requestId;
            public final List<String> resources;
            public final String statement;
            public final String uri;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.pairingTopic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> component10() {
                return this.resources;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> component11() {
                return this.methods;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Long component12() {
                return this.expiry;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> component2() {
                return this.chains;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.domain;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component4() {
                return this.nonce;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component5() {
                return this.uri;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component6() {
                return this.nbf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component7() {
                return this.exp;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component8() {
                return this.statement;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component9() {
                return this.requestId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Authenticate copy(String str, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, String str6, String str7, String str8, List<String> list2, List<String> list3, Long l) {
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                return new Authenticate(str, list, str2, str3, str4, str5, str6, str7, str8, list2, list3, l);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Authenticate)) {
                    return false;
                }
                Authenticate authenticate = (Authenticate) obj;
                return Intrinsics.EZpvd((Object) this.pairingTopic, (Object) authenticate.pairingTopic) && Intrinsics.EZpvd(this.chains, authenticate.chains) && Intrinsics.EZpvd((Object) this.domain, (Object) authenticate.domain) && Intrinsics.EZpvd((Object) this.nonce, (Object) authenticate.nonce) && Intrinsics.EZpvd((Object) this.uri, (Object) authenticate.uri) && Intrinsics.EZpvd((Object) this.nbf, (Object) authenticate.nbf) && Intrinsics.EZpvd((Object) this.exp, (Object) authenticate.exp) && Intrinsics.EZpvd((Object) this.statement, (Object) authenticate.statement) && Intrinsics.EZpvd((Object) this.requestId, (Object) authenticate.requestId) && Intrinsics.EZpvd(this.resources, authenticate.resources) && Intrinsics.EZpvd(this.methods, authenticate.methods) && Intrinsics.EZpvd(this.expiry, authenticate.expiry);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> getChains() {
                return this.chains;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getDomain() {
                return this.domain;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getExp() {
                return this.exp;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Long getExpiry() {
                return this.expiry;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> getMethods() {
                return this.methods;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getNbf() {
                return this.nbf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getNonce() {
                return this.nonce;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getPairingTopic() {
                return this.pairingTopic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getRequestId() {
                return this.requestId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> getResources() {
                return this.resources;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getStatement() {
                return this.statement;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getUri() {
                return this.uri;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.pairingTopic;
                int iHashCode = str == null ? 0 : str.hashCode();
                int iHashCode2 = this.chains.hashCode();
                int iHashCode3 = this.domain.hashCode();
                int iHashCode4 = this.nonce.hashCode();
                int iHashCode5 = this.uri.hashCode();
                String str2 = this.nbf;
                int iHashCode6 = str2 == null ? 0 : str2.hashCode();
                String str3 = this.exp;
                int iHashCode7 = str3 == null ? 0 : str3.hashCode();
                String str4 = this.statement;
                int iHashCode8 = str4 == null ? 0 : str4.hashCode();
                String str5 = this.requestId;
                int iHashCode9 = str5 == null ? 0 : str5.hashCode();
                List<String> list = this.resources;
                int iHashCode10 = list == null ? 0 : list.hashCode();
                List<String> list2 = this.methods;
                int iHashCode11 = list2 == null ? 0 : list2.hashCode();
                Long l = this.expiry;
                return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (l != null ? l.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Authenticate(pairingTopic=" + this.pairingTopic + ", chains=" + this.chains + ", domain=" + this.domain + ", nonce=" + this.nonce + ", uri=" + this.uri + ", nbf=" + this.nbf + ", exp=" + this.exp + ", statement=" + this.statement + ", requestId=" + this.requestId + ", resources=" + this.resources + ", methods=" + this.methods + ", expiry=" + this.expiry + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (r18v0 java.util.List)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002b: ARITH (r29v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r26v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0033: ARITH (r29v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r27v0 java.util.List))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x003b: ARITH (r29v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r28v0 java.lang.Long))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.Long):void (m)] (LINE:324) call: com.reown.sign.client.Sign.Params.Authenticate.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.Long):void type: THIS */
            public /* synthetic */ Authenticate(String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list2, List list3, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, list, str2, str3, str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : list2, (i & 1024) != 0 ? null : list3, (i & 2048) != 0 ? null : l);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Authenticate(String str, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, String str6, String str7, String str8, List<String> list2, List<String> list3, Long l) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                this.pairingTopic = str;
                this.chains = list;
                this.domain = str2;
                this.nonce = str3;
                this.uri = str4;
                this.nbf = str5;
                this.exp = str6;
                this.statement = str7;
                this.requestId = str8;
                this.resources = list2;
                this.methods = list3;
                this.expiry = l;
            }
        }

        public static final class FormatMessage extends Params {
            public final String iss;
            public final Model.PayloadParams payloadParams;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ FormatMessage copy$default(FormatMessage formatMessage, Model.PayloadParams payloadParams, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    payloadParams = formatMessage.payloadParams;
                }
                if ((i & 2) != 0) {
                    str = formatMessage.iss;
                }
                return formatMessage.copy(payloadParams, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Model.PayloadParams component1() {
                return this.payloadParams;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.iss;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FormatMessage copy(@NotNull Model.PayloadParams payloadParams, @NotNull String str) {
                Intrinsics.checkNotNullParameter(payloadParams, "");
                Intrinsics.checkNotNullParameter(str, "");
                return new FormatMessage(payloadParams, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FormatMessage)) {
                    return false;
                }
                FormatMessage formatMessage = (FormatMessage) obj;
                return Intrinsics.EZpvd(this.payloadParams, formatMessage.payloadParams) && Intrinsics.EZpvd((Object) this.iss, (Object) formatMessage.iss);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getIss() {
                return this.iss;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Model.PayloadParams getPayloadParams() {
                return this.payloadParams;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.payloadParams.hashCode() * 31) + this.iss.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "FormatMessage(payloadParams=" + this.payloadParams + ", iss=" + this.iss + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FormatMessage(@NotNull Model.PayloadParams payloadParams, @NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(payloadParams, "");
                Intrinsics.checkNotNullParameter(str, "");
                this.payloadParams = payloadParams;
                this.iss = str;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Pair extends Params {
            public final String uri;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Pair copy$default(Pair pair, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = pair.uri;
                }
                return pair.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.uri;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Pair copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Pair(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Pair) && Intrinsics.EZpvd((Object) this.uri, (Object) ((Pair) obj).uri);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getUri() {
                return this.uri;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.uri.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Pair(uri=" + this.uri + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Pair(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.uri = str;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Approve extends Params {
            public final Map<String, Model.Namespace.Session> namespaces;
            public final String proposerPublicKey;
            public final String relayProtocol;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.client.Sign$Params$Approve */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Approve copy$default(Approve approve, String str, Map map, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = approve.proposerPublicKey;
                }
                if ((i & 2) != 0) {
                    map = approve.namespaces;
                }
                if ((i & 4) != 0) {
                    str2 = approve.relayProtocol;
                }
                return approve.copy(str, map, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.proposerPublicKey;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Model.Namespace.Session> component2() {
                return this.namespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.relayProtocol;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Approve copy(@NotNull String str, @NotNull Map<String, Model.Namespace.Session> map, String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                return new Approve(str, map, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Approve)) {
                    return false;
                }
                Approve approve = (Approve) obj;
                return Intrinsics.EZpvd((Object) this.proposerPublicKey, (Object) approve.proposerPublicKey) && Intrinsics.EZpvd(this.namespaces, approve.namespaces) && Intrinsics.EZpvd((Object) this.relayProtocol, (Object) approve.relayProtocol);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Model.Namespace.Session> getNamespaces() {
                return this.namespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getProposerPublicKey() {
                return this.proposerPublicKey;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getRelayProtocol() {
                return this.relayProtocol;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.proposerPublicKey.hashCode();
                int iHashCode2 = this.namespaces.hashCode();
                String str = this.relayProtocol;
                return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Approve(proposerPublicKey=" + this.proposerPublicKey + ", namespaces=" + this.namespaces + ", relayProtocol=" + this.relayProtocol + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.util.Map)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.util.Map<java.lang.String, com.reown.sign.client.Sign$Model$Namespace$Session>, java.lang.String):void (m)] (LINE:343) call: com.reown.sign.client.Sign.Params.Approve.<init>(java.lang.String, java.util.Map, java.lang.String):void type: THIS */
            public /* synthetic */ Approve(String str, Map map, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, map, (i & 4) != 0 ? null : str2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Approve(@NotNull String str, @NotNull Map<String, Model.Namespace.Session> map, String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                this.proposerPublicKey = str;
                this.namespaces = map;
                this.relayProtocol = str2;
            }
        }

        public static final class Reject extends Params {
            public final String proposerPublicKey;
            public final String reason;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Reject copy$default(Reject reject, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = reject.proposerPublicKey;
                }
                if ((i & 2) != 0) {
                    str2 = reject.reason;
                }
                return reject.copy(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.proposerPublicKey;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Reject copy(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new Reject(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Reject)) {
                    return false;
                }
                Reject reject = (Reject) obj;
                return Intrinsics.EZpvd((Object) this.proposerPublicKey, (Object) reject.proposerPublicKey) && Intrinsics.EZpvd((Object) this.reason, (Object) reject.reason);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getProposerPublicKey() {
                return this.proposerPublicKey;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getReason() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.proposerPublicKey.hashCode() * 31) + this.reason.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Reject(proposerPublicKey=" + this.proposerPublicKey + ", reason=" + this.reason + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Reject(@NotNull String str, @NotNull String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.proposerPublicKey = str;
                this.reason = str2;
            }
        }

        public static final class ApproveAuthenticate extends Params {
            public final List<Model.Cacao> cacaos;
            public final long id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.client.Sign$Params$ApproveAuthenticate */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ApproveAuthenticate copy$default(ApproveAuthenticate approveAuthenticate, long j, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = approveAuthenticate.id;
                }
                if ((i & 2) != 0) {
                    list = approveAuthenticate.cacaos;
                }
                return approveAuthenticate.copy(j, list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<Model.Cacao> component2() {
                return this.cacaos;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ApproveAuthenticate copy(long j, @NotNull List<Model.Cacao> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new ApproveAuthenticate(j, list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ApproveAuthenticate)) {
                    return false;
                }
                ApproveAuthenticate approveAuthenticate = (ApproveAuthenticate) obj;
                return this.id == approveAuthenticate.id && Intrinsics.EZpvd(this.cacaos, approveAuthenticate.cacaos);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<Model.Cacao> getCacaos() {
                return this.cacaos;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (Long.hashCode(this.id) * 31) + this.cacaos.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ApproveAuthenticate(id=" + this.id + ", cacaos=" + this.cacaos + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ApproveAuthenticate(long j, @NotNull List<Model.Cacao> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.id = j;
                this.cacaos = list;
            }
        }

        public static final class RejectAuthenticate extends Params {
            public final long id;
            public final String reason;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ RejectAuthenticate copy$default(RejectAuthenticate rejectAuthenticate, long j, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = rejectAuthenticate.id;
                }
                if ((i & 2) != 0) {
                    str = rejectAuthenticate.reason;
                }
                return rejectAuthenticate.copy(j, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RejectAuthenticate copy(long j, @NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new RejectAuthenticate(j, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RejectAuthenticate)) {
                    return false;
                }
                RejectAuthenticate rejectAuthenticate = (RejectAuthenticate) obj;
                return this.id == rejectAuthenticate.id && Intrinsics.EZpvd((Object) this.reason, (Object) rejectAuthenticate.reason);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getReason() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (Long.hashCode(this.id) * 31) + this.reason.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "RejectAuthenticate(id=" + this.id + ", reason=" + this.reason + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RejectAuthenticate(long j, @NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.id = j;
                this.reason = str;
            }
        }

        public static final class Disconnect extends Params {
            public final String sessionTopic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Disconnect copy$default(Disconnect disconnect, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = disconnect.sessionTopic;
                }
                return disconnect.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.sessionTopic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Disconnect copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Disconnect(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Disconnect) && Intrinsics.EZpvd((Object) this.sessionTopic, (Object) ((Disconnect) obj).sessionTopic);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getSessionTopic() {
                return this.sessionTopic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.sessionTopic.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Disconnect(sessionTopic=" + this.sessionTopic + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Disconnect(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.sessionTopic = str;
            }
        }

        public static final class Response extends Params {
            public final Model.JsonRpcResponse jsonRpcResponse;
            public final String sessionTopic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Response copy$default(Response response, String str, Model.JsonRpcResponse jsonRpcResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = response.sessionTopic;
                }
                if ((i & 2) != 0) {
                    jsonRpcResponse = response.jsonRpcResponse;
                }
                return response.copy(str, jsonRpcResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.sessionTopic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Model.JsonRpcResponse component2() {
                return this.jsonRpcResponse;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Response copy(@NotNull String str, @NotNull Model.JsonRpcResponse jsonRpcResponse) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(jsonRpcResponse, "");
                return new Response(str, jsonRpcResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Response)) {
                    return false;
                }
                Response response = (Response) obj;
                return Intrinsics.EZpvd((Object) this.sessionTopic, (Object) response.sessionTopic) && Intrinsics.EZpvd(this.jsonRpcResponse, response.jsonRpcResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Model.JsonRpcResponse getJsonRpcResponse() {
                return this.jsonRpcResponse;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getSessionTopic() {
                return this.sessionTopic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.sessionTopic.hashCode() * 31) + this.jsonRpcResponse.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Response(sessionTopic=" + this.sessionTopic + ", jsonRpcResponse=" + this.jsonRpcResponse + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Response(@NotNull String str, @NotNull Model.JsonRpcResponse jsonRpcResponse) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(jsonRpcResponse, "");
                this.sessionTopic = str;
                this.jsonRpcResponse = jsonRpcResponse;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Request extends Params {
            public final String chainId;
            public final Long expiry;
            public final String method;
            public final String params;
            public final String sessionTopic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, String str4, Long l, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = request.sessionTopic;
                }
                if ((i & 2) != 0) {
                    str2 = request.method;
                }
                String str5 = str2;
                if ((i & 4) != 0) {
                    str3 = request.params;
                }
                String str6 = str3;
                if ((i & 8) != 0) {
                    str4 = request.chainId;
                }
                String str7 = str4;
                if ((i & 16) != 0) {
                    l = request.expiry;
                }
                return request.copy(str, str5, str6, str7, l);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.sessionTopic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.method;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.params;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component4() {
                return this.chainId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Long component5() {
                return this.expiry;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Request copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, Long l) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                return new Request(str, str2, str3, str4, l);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Request)) {
                    return false;
                }
                Request request = (Request) obj;
                return Intrinsics.EZpvd((Object) this.sessionTopic, (Object) request.sessionTopic) && Intrinsics.EZpvd((Object) this.method, (Object) request.method) && Intrinsics.EZpvd((Object) this.params, (Object) request.params) && Intrinsics.EZpvd((Object) this.chainId, (Object) request.chainId) && Intrinsics.EZpvd(this.expiry, request.expiry);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getChainId() {
                return this.chainId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Long getExpiry() {
                return this.expiry;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getMethod() {
                return this.method;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getParams() {
                return this.params;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getSessionTopic() {
                return this.sessionTopic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.sessionTopic.hashCode();
                int iHashCode2 = this.method.hashCode();
                int iHashCode3 = this.params.hashCode();
                int iHashCode4 = this.chainId.hashCode();
                Long l = this.expiry;
                return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (l == null ? 0 : l.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Request(sessionTopic=" + this.sessionTopic + ", method=" + this.method + ", params=" + this.params + ", chainId=" + this.chainId + ", expiry=" + this.expiry + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r11v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long):void (m)] (LINE:358) call: com.reown.sign.client.Sign.Params.Request.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long):void type: THIS */
            public /* synthetic */ Request(String str, String str2, String str3, String str4, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, str4, (i & 16) != 0 ? null : l);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Request(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, Long l) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                this.sessionTopic = str;
                this.method = str2;
                this.params = str3;
                this.chainId = str4;
                this.expiry = l;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Update extends Params {
            public final Map<String, Model.Namespace.Session> namespaces;
            public final String sessionTopic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.client.Sign$Params$Update */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Update copy$default(Update update, String str, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = update.sessionTopic;
                }
                if ((i & 2) != 0) {
                    map = update.namespaces;
                }
                return update.copy(str, map);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.sessionTopic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Model.Namespace.Session> component2() {
                return this.namespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Update copy(@NotNull String str, @NotNull Map<String, Model.Namespace.Session> map) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                return new Update(str, map);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Update)) {
                    return false;
                }
                Update update = (Update) obj;
                return Intrinsics.EZpvd((Object) this.sessionTopic, (Object) update.sessionTopic) && Intrinsics.EZpvd(this.namespaces, update.namespaces);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Model.Namespace.Session> getNamespaces() {
                return this.namespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getSessionTopic() {
                return this.sessionTopic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.sessionTopic.hashCode() * 31) + this.namespaces.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Update(sessionTopic=" + this.sessionTopic + ", namespaces=" + this.namespaces + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Update(@NotNull String str, @NotNull Map<String, Model.Namespace.Session> map) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                this.sessionTopic = str;
                this.namespaces = map;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Ping extends Params {
            public final long timeout;
            public final String topic;

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 long) A[MD:(java.lang.String, long):void (m)] call: com.reown.sign.client.Sign.Params.Ping.<init>(java.lang.String, long):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Ping(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, j);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: copy-HG0u8IE$default, reason: not valid java name */
            public static /* synthetic */ Ping m7328copyHG0u8IE$default(Ping ping, String str, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = ping.topic;
                }
                if ((i & 2) != 0) {
                    j = ping.timeout;
                }
                return ping.m7330copyHG0u8IE(str, j);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: component2-UwyO8pc, reason: not valid java name */
            public final long m7329component2UwyO8pc() {
                return this.timeout;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: copy-HG0u8IE, reason: not valid java name */
            public final Ping m7330copyHG0u8IE(@NotNull String str, long j) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Ping(str, j, null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Ping)) {
                    return false;
                }
                Ping ping = (Ping) obj;
                return Intrinsics.EZpvd((Object) this.topic, (Object) ping.topic) && C59462zhW.EZpvd(this.timeout, ping.timeout);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: getTimeout-UwyO8pc, reason: not valid java name */
            public final long m7331getTimeoutUwyO8pc() {
                return this.timeout;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.topic.hashCode() * 31) + C59462zhW.AuCTel(this.timeout);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Ping(topic=" + this.topic + ", timeout=" + C59462zhW.getFieldNames(this.timeout) + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Ping(String str, long j) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.topic = str;
                this.timeout = j;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Ping(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 2) != 0) {
                    C59462zhW.Activity activity = C59462zhW.OLrzqt;
                    j = C59519zia.EZpvd(30, DurationUnit.SECONDS);
                }
                this(str, j, null);
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Emit extends Params {
            public final String chainId;
            public final Model.SessionEvent event;
            public final String topic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Emit copy$default(Emit emit, String str, Model.SessionEvent sessionEvent, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = emit.topic;
                }
                if ((i & 2) != 0) {
                    sessionEvent = emit.event;
                }
                if ((i & 4) != 0) {
                    str2 = emit.chainId;
                }
                return emit.copy(str, sessionEvent, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Model.SessionEvent component2() {
                return this.event;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.chainId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Emit copy(@NotNull String str, @NotNull Model.SessionEvent sessionEvent, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(sessionEvent, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new Emit(str, sessionEvent, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Emit)) {
                    return false;
                }
                Emit emit = (Emit) obj;
                return Intrinsics.EZpvd((Object) this.topic, (Object) emit.topic) && Intrinsics.EZpvd(this.event, emit.event) && Intrinsics.EZpvd((Object) this.chainId, (Object) emit.chainId);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getChainId() {
                return this.chainId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Model.SessionEvent getEvent() {
                return this.event;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.topic.hashCode() * 31) + this.event.hashCode()) * 31) + this.chainId.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Emit(topic=" + this.topic + ", event=" + this.event + ", chainId=" + this.chainId + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Emit(@NotNull String str, @NotNull Model.SessionEvent sessionEvent, @NotNull String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(sessionEvent, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.topic = str;
                this.event = sessionEvent;
                this.chainId = str2;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Extend extends Params {
            public final String topic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Extend copy$default(Extend extend, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = extend.topic;
                }
                return extend.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Extend copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Extend(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extend) && Intrinsics.EZpvd((Object) this.topic, (Object) ((Extend) obj).topic);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.topic.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Extend(topic=" + this.topic + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Extend(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.topic = str;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class DecryptMessage extends Params {
            public final String encryptedMessage;
            public final String topic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ DecryptMessage copy$default(DecryptMessage decryptMessage, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = decryptMessage.topic;
                }
                if ((i & 2) != 0) {
                    str2 = decryptMessage.encryptedMessage;
                }
                return decryptMessage.copy(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.encryptedMessage;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DecryptMessage copy(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new DecryptMessage(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DecryptMessage)) {
                    return false;
                }
                DecryptMessage decryptMessage = (DecryptMessage) obj;
                return Intrinsics.EZpvd((Object) this.topic, (Object) decryptMessage.topic) && Intrinsics.EZpvd((Object) this.encryptedMessage, (Object) decryptMessage.encryptedMessage);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getEncryptedMessage() {
                return this.encryptedMessage;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.topic.hashCode() * 31) + this.encryptedMessage.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "DecryptMessage(topic=" + this.topic + ", encryptedMessage=" + this.encryptedMessage + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DecryptMessage(@NotNull String str, @NotNull String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.topic = str;
                this.encryptedMessage = str2;
            }
        }
    }
}
