package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.AuthConfiguration;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EventType getEventType() {
        return this.eventType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public Date getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getType() {
        return this.type;
    }

    public AuthEvent(@NotNull EventType eventType, Date date) {
        Intrinsics.checkNotNullParameter(eventType, "");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        this.type = simpleName;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.amplifyframework.statemachine.codegen.events.AuthEvent$EventType)
  (wrap:java.util.Date:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r2v0 java.util.Date))
 A[MD:(com.amplifyframework.statemachine.codegen.events.AuthEvent$EventType, java.util.Date):void (m)] (LINE:23) call: com.amplifyframework.statemachine.codegen.events.AuthEvent.<init>(com.amplifyframework.statemachine.codegen.events.AuthEvent$EventType, java.util.Date):void type: THIS */
    public /* synthetic */ AuthEvent(EventType eventType, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventType, (i & 2) != 0 ? null : date);
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return StateMachineEvent.DefaultImpls.getId(this);
    }

    public static abstract class EventType {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.events.AuthEvent.EventType.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ EventType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class ConfigureAuth extends EventType {
            private final AuthConfiguration configuration;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ConfigureAuth copy$default(ConfigureAuth configureAuth, AuthConfiguration authConfiguration, int i, Object obj) {
                if ((i & 1) != 0) {
                    authConfiguration = configureAuth.configuration;
                }
                return configureAuth.copy(authConfiguration);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthConfiguration component1() {
                return this.configuration;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ConfigureAuth copy(@NotNull AuthConfiguration authConfiguration) {
                Intrinsics.checkNotNullParameter(authConfiguration, "");
                return new ConfigureAuth(authConfiguration);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ConfigureAuth) && Intrinsics.EZpvd(this.configuration, ((ConfigureAuth) obj).configuration);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthConfiguration getConfiguration() {
                return this.configuration;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.configuration.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ConfigureAuth(configuration=" + this.configuration + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfigureAuth(@NotNull AuthConfiguration authConfiguration) {
                super(null);
                Intrinsics.checkNotNullParameter(authConfiguration, "");
                this.configuration = authConfiguration;
            }
        }

        private EventType() {
        }

        public static final class ReceivedCachedCredentials extends EventType {
            private final AmplifyCredential storedCredentials;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ReceivedCachedCredentials copy$default(ReceivedCachedCredentials receivedCachedCredentials, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    amplifyCredential = receivedCachedCredentials.storedCredentials;
                }
                return receivedCachedCredentials.copy(amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential component1() {
                return this.storedCredentials;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ReceivedCachedCredentials copy(@NotNull AmplifyCredential amplifyCredential) {
                Intrinsics.checkNotNullParameter(amplifyCredential, "");
                return new ReceivedCachedCredentials(amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ReceivedCachedCredentials) && Intrinsics.EZpvd(this.storedCredentials, ((ReceivedCachedCredentials) obj).storedCredentials);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential getStoredCredentials() {
                return this.storedCredentials;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.storedCredentials.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ReceivedCachedCredentials(storedCredentials=" + this.storedCredentials + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReceivedCachedCredentials(@NotNull AmplifyCredential amplifyCredential) {
                super(null);
                Intrinsics.checkNotNullParameter(amplifyCredential, "");
                this.storedCredentials = amplifyCredential;
            }
        }

        public static final class CachedCredentialsFailed extends EventType {
            public static final CachedCredentialsFailed INSTANCE = new CachedCredentialsFailed();

            private CachedCredentialsFailed() {
                super(null);
            }
        }

        public static final class ConfigureAuthentication extends EventType {
            private final AuthConfiguration configuration;
            private final AmplifyCredential storedCredentials;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ConfigureAuthentication copy$default(ConfigureAuthentication configureAuthentication, AuthConfiguration authConfiguration, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    authConfiguration = configureAuthentication.configuration;
                }
                if ((i & 2) != 0) {
                    amplifyCredential = configureAuthentication.storedCredentials;
                }
                return configureAuthentication.copy(authConfiguration, amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthConfiguration component1() {
                return this.configuration;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential component2() {
                return this.storedCredentials;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ConfigureAuthentication copy(@NotNull AuthConfiguration authConfiguration, @NotNull AmplifyCredential amplifyCredential) {
                Intrinsics.checkNotNullParameter(authConfiguration, "");
                Intrinsics.checkNotNullParameter(amplifyCredential, "");
                return new ConfigureAuthentication(authConfiguration, amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConfigureAuthentication)) {
                    return false;
                }
                ConfigureAuthentication configureAuthentication = (ConfigureAuthentication) obj;
                return Intrinsics.EZpvd(this.configuration, configureAuthentication.configuration) && Intrinsics.EZpvd(this.storedCredentials, configureAuthentication.storedCredentials);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthConfiguration getConfiguration() {
                return this.configuration;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential getStoredCredentials() {
                return this.storedCredentials;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.configuration.hashCode() * 31) + this.storedCredentials.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ConfigureAuthentication(configuration=" + this.configuration + ", storedCredentials=" + this.storedCredentials + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfigureAuthentication(@NotNull AuthConfiguration authConfiguration, @NotNull AmplifyCredential amplifyCredential) {
                super(null);
                Intrinsics.checkNotNullParameter(authConfiguration, "");
                Intrinsics.checkNotNullParameter(amplifyCredential, "");
                this.configuration = authConfiguration;
                this.storedCredentials = amplifyCredential;
            }
        }

        public static final class ConfigureAuthorization extends EventType {
            private final AuthConfiguration configuration;
            private final AmplifyCredential storedCredentials;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ConfigureAuthorization copy$default(ConfigureAuthorization configureAuthorization, AuthConfiguration authConfiguration, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    authConfiguration = configureAuthorization.configuration;
                }
                if ((i & 2) != 0) {
                    amplifyCredential = configureAuthorization.storedCredentials;
                }
                return configureAuthorization.copy(authConfiguration, amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthConfiguration component1() {
                return this.configuration;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential component2() {
                return this.storedCredentials;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ConfigureAuthorization copy(@NotNull AuthConfiguration authConfiguration, @NotNull AmplifyCredential amplifyCredential) {
                Intrinsics.checkNotNullParameter(authConfiguration, "");
                Intrinsics.checkNotNullParameter(amplifyCredential, "");
                return new ConfigureAuthorization(authConfiguration, amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConfigureAuthorization)) {
                    return false;
                }
                ConfigureAuthorization configureAuthorization = (ConfigureAuthorization) obj;
                return Intrinsics.EZpvd(this.configuration, configureAuthorization.configuration) && Intrinsics.EZpvd(this.storedCredentials, configureAuthorization.storedCredentials);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthConfiguration getConfiguration() {
                return this.configuration;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential getStoredCredentials() {
                return this.storedCredentials;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.configuration.hashCode() * 31) + this.storedCredentials.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ConfigureAuthorization(configuration=" + this.configuration + ", storedCredentials=" + this.storedCredentials + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfigureAuthorization(@NotNull AuthConfiguration authConfiguration, @NotNull AmplifyCredential amplifyCredential) {
                super(null);
                Intrinsics.checkNotNullParameter(authConfiguration, "");
                Intrinsics.checkNotNullParameter(amplifyCredential, "");
                this.configuration = authConfiguration;
                this.storedCredentials = amplifyCredential;
            }
        }

        public static final class ConfiguredAuthentication extends EventType {
            private final AuthConfiguration configuration;
            private final AmplifyCredential storedCredentials;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ConfiguredAuthentication copy$default(ConfiguredAuthentication configuredAuthentication, AuthConfiguration authConfiguration, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    authConfiguration = configuredAuthentication.configuration;
                }
                if ((i & 2) != 0) {
                    amplifyCredential = configuredAuthentication.storedCredentials;
                }
                return configuredAuthentication.copy(authConfiguration, amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthConfiguration component1() {
                return this.configuration;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential component2() {
                return this.storedCredentials;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ConfiguredAuthentication copy(@NotNull AuthConfiguration authConfiguration, @NotNull AmplifyCredential amplifyCredential) {
                Intrinsics.checkNotNullParameter(authConfiguration, "");
                Intrinsics.checkNotNullParameter(amplifyCredential, "");
                return new ConfiguredAuthentication(authConfiguration, amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConfiguredAuthentication)) {
                    return false;
                }
                ConfiguredAuthentication configuredAuthentication = (ConfiguredAuthentication) obj;
                return Intrinsics.EZpvd(this.configuration, configuredAuthentication.configuration) && Intrinsics.EZpvd(this.storedCredentials, configuredAuthentication.storedCredentials);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthConfiguration getConfiguration() {
                return this.configuration;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential getStoredCredentials() {
                return this.storedCredentials;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.configuration.hashCode() * 31) + this.storedCredentials.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ConfiguredAuthentication(configuration=" + this.configuration + ", storedCredentials=" + this.storedCredentials + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfiguredAuthentication(@NotNull AuthConfiguration authConfiguration, @NotNull AmplifyCredential amplifyCredential) {
                super(null);
                Intrinsics.checkNotNullParameter(authConfiguration, "");
                Intrinsics.checkNotNullParameter(amplifyCredential, "");
                this.configuration = authConfiguration;
                this.storedCredentials = amplifyCredential;
            }
        }

        public static final class ConfiguredAuthorization extends EventType {
            public static final ConfiguredAuthorization INSTANCE = new ConfiguredAuthorization();

            private ConfiguredAuthorization() {
                super(null);
            }
        }
    }
}
