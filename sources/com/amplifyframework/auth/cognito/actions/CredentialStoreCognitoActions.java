package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.CredentialStoreEnvironment;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.actions.CredentialStoreActions;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.errors.CredentialStoreError;
import com.amplifyframework.statemachine.codegen.events.CredentialStoreEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CredentialStoreCognitoActions implements CredentialStoreActions {
    public static final CredentialStoreCognitoActions INSTANCE = new CredentialStoreCognitoActions();

    private CredentialStoreCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.CredentialStoreActions
    public Action migrateLegacyCredentialStoreAction() {
        Action.Companion companion = Action.Companion;
        final String str = "MigrateLegacyCredentials";
        return new Action(str) { // from class: com.amplifyframework.auth.cognito.actions.CredentialStoreCognitoActions$migrateLegacyCredentialStoreAction$$inlined$invoke$1
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                CredentialStoreEvent credentialStoreEvent;
                Intrinsics.copydefault(environment, "");
                String id = getId();
                CredentialStoreEnvironment credentialStoreEnvironment = (CredentialStoreEnvironment) environment;
                credentialStoreEnvironment.getLogger().verbose(id + " Starting execution");
                try {
                    AmplifyCredential amplifyCredentialRetrieveCredential = credentialStoreEnvironment.getLegacyCredentialStore().retrieveCredential();
                    if (!Intrinsics.EZpvd(amplifyCredentialRetrieveCredential, AmplifyCredential.Empty.INSTANCE)) {
                        credentialStoreEnvironment.getCredentialStore().saveCredential(amplifyCredentialRetrieveCredential);
                        credentialStoreEnvironment.getLegacyCredentialStore().deleteCredential();
                    }
                    String strRetrieveLastAuthUserId = credentialStoreEnvironment.getLegacyCredentialStore().retrieveLastAuthUserId();
                    if (strRetrieveLastAuthUserId != null) {
                        DeviceMetadata deviceMetadataRetrieveDeviceMetadata = credentialStoreEnvironment.getLegacyCredentialStore().retrieveDeviceMetadata(strRetrieveLastAuthUserId);
                        if (!Intrinsics.EZpvd(deviceMetadataRetrieveDeviceMetadata, DeviceMetadata.Empty.INSTANCE)) {
                            credentialStoreEnvironment.getCredentialStore().saveDeviceMetadata(strRetrieveLastAuthUserId, deviceMetadataRetrieveDeviceMetadata);
                            credentialStoreEnvironment.getLegacyCredentialStore().deleteDeviceKeyCredential(strRetrieveLastAuthUserId);
                        }
                    }
                    AmplifyCredential.ASFDevice aSFDeviceRetrieveASFDevice = credentialStoreEnvironment.getLegacyCredentialStore().retrieveASFDevice();
                    if (aSFDeviceRetrieveASFDevice.getId() != null) {
                        credentialStoreEnvironment.getCredentialStore().saveASFDevice(aSFDeviceRetrieveASFDevice);
                        credentialStoreEnvironment.getLegacyCredentialStore().deleteASFDevice();
                    }
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.LoadCredentialStore(CredentialType.Amplify.INSTANCE), null, 2, null);
                } catch (CredentialStoreError e) {
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.ThrowError(e), null, 2, null);
                }
                credentialStoreEnvironment.getLogger().verbose(id + " Sending event " + credentialStoreEvent.getType());
                eventDispatcher.send(credentialStoreEvent);
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.CredentialStoreActions
    public Action clearCredentialStoreAction(@NotNull final CredentialType credentialType) {
        Intrinsics.checkNotNullParameter(credentialType, "");
        Action.Companion companion = Action.Companion;
        final String str = "ClearCredentialStore";
        return new Action(str, credentialType) { // from class: com.amplifyframework.auth.cognito.actions.CredentialStoreCognitoActions$clearCredentialStoreAction$$inlined$invoke$1
            final /* synthetic */ CredentialType $credentialType$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$credentialType$inlined = credentialType;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                CredentialStoreEvent credentialStoreEvent;
                Intrinsics.copydefault(environment, "");
                String id = getId();
                CredentialStoreEnvironment credentialStoreEnvironment = (CredentialStoreEnvironment) environment;
                credentialStoreEnvironment.getLogger().verbose(id + " Starting execution");
                try {
                    CredentialType credentialType2 = this.$credentialType$inlined;
                    if (Intrinsics.EZpvd(credentialType2, CredentialType.Amplify.INSTANCE)) {
                        credentialStoreEnvironment.getCredentialStore().deleteCredential();
                    } else if (credentialType2 instanceof CredentialType.Device) {
                        credentialStoreEnvironment.getCredentialStore().deleteDeviceKeyCredential(((CredentialType.Device) this.$credentialType$inlined).getUsername());
                    } else if (Intrinsics.EZpvd(credentialType2, CredentialType.ASF.INSTANCE)) {
                        credentialStoreEnvironment.getCredentialStore().deleteASFDevice();
                    }
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.CompletedOperation(AmplifyCredential.Empty.INSTANCE), null, 2, null);
                } catch (CredentialStoreError e) {
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.ThrowError(e), null, 2, null);
                }
                credentialStoreEnvironment.getLogger().verbose(id + " Sending event " + credentialStoreEvent.getType());
                eventDispatcher.send(credentialStoreEvent);
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.CredentialStoreActions
    public Action loadCredentialStoreAction(@NotNull final CredentialType credentialType) {
        Intrinsics.checkNotNullParameter(credentialType, "");
        Action.Companion companion = Action.Companion;
        final String str = "LoadCredentialStore";
        return new Action(str, credentialType) { // from class: com.amplifyframework.auth.cognito.actions.CredentialStoreCognitoActions$loadCredentialStoreAction$$inlined$invoke$1
            final /* synthetic */ CredentialType $credentialType$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$credentialType$inlined = credentialType;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                CredentialStoreEvent credentialStoreEvent;
                AmplifyCredential amplifyCredentialRetrieveASFDevice;
                Intrinsics.copydefault(environment, "");
                String id = getId();
                CredentialStoreEnvironment credentialStoreEnvironment = (CredentialStoreEnvironment) environment;
                credentialStoreEnvironment.getLogger().verbose(id + " Starting execution");
                try {
                    CredentialType credentialType2 = this.$credentialType$inlined;
                    if (Intrinsics.EZpvd(credentialType2, CredentialType.Amplify.INSTANCE)) {
                        amplifyCredentialRetrieveASFDevice = credentialStoreEnvironment.getCredentialStore().retrieveCredential();
                    } else if (credentialType2 instanceof CredentialType.Device) {
                        amplifyCredentialRetrieveASFDevice = new AmplifyCredential.DeviceData(credentialStoreEnvironment.getCredentialStore().retrieveDeviceMetadata(((CredentialType.Device) this.$credentialType$inlined).getUsername()));
                    } else {
                        if (!Intrinsics.EZpvd(credentialType2, CredentialType.ASF.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        amplifyCredentialRetrieveASFDevice = credentialStoreEnvironment.getCredentialStore().retrieveASFDevice();
                    }
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.CompletedOperation(amplifyCredentialRetrieveASFDevice), null, 2, null);
                } catch (CredentialStoreError e) {
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.ThrowError(e), null, 2, null);
                }
                credentialStoreEnvironment.getLogger().verbose(id + " Sending event " + credentialStoreEvent.getType());
                eventDispatcher.send(credentialStoreEvent);
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.CredentialStoreActions
    public Action storeCredentialsAction(@NotNull final CredentialType credentialType, @NotNull final AmplifyCredential amplifyCredential) {
        Intrinsics.checkNotNullParameter(credentialType, "");
        Intrinsics.checkNotNullParameter(amplifyCredential, "");
        Action.Companion companion = Action.Companion;
        final String str = "StoreCredentials";
        return new Action(str, credentialType, amplifyCredential) { // from class: com.amplifyframework.auth.cognito.actions.CredentialStoreCognitoActions$storeCredentialsAction$$inlined$invoke$1
            final /* synthetic */ CredentialType $credentialType$inlined;
            final /* synthetic */ AmplifyCredential $credentials$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$credentialType$inlined = credentialType;
                this.$credentials$inlined = amplifyCredential;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                CredentialStoreEvent credentialStoreEvent;
                Intrinsics.copydefault(environment, "");
                String id = getId();
                CredentialStoreEnvironment credentialStoreEnvironment = (CredentialStoreEnvironment) environment;
                credentialStoreEnvironment.getLogger().verbose(id + " Starting execution");
                try {
                    CredentialType credentialType2 = this.$credentialType$inlined;
                    if (Intrinsics.EZpvd(credentialType2, CredentialType.Amplify.INSTANCE)) {
                        credentialStoreEnvironment.getCredentialStore().saveCredential(this.$credentials$inlined);
                    } else if (credentialType2 instanceof CredentialType.Device) {
                        Object obj = this.$credentials$inlined;
                        AmplifyCredential.DeviceMetaDataTypeCredential deviceMetaDataTypeCredential = obj instanceof AmplifyCredential.DeviceMetaDataTypeCredential ? (AmplifyCredential.DeviceMetaDataTypeCredential) obj : null;
                        if (deviceMetaDataTypeCredential != null) {
                            credentialStoreEnvironment.getCredentialStore().saveDeviceMetadata(((CredentialType.Device) this.$credentialType$inlined).getUsername(), deviceMetaDataTypeCredential.getDeviceMetadata());
                        }
                    } else if (Intrinsics.EZpvd(credentialType2, CredentialType.ASF.INSTANCE)) {
                        AmplifyCredential amplifyCredential2 = this.$credentials$inlined;
                        AmplifyCredential.ASFDevice aSFDevice = amplifyCredential2 instanceof AmplifyCredential.ASFDevice ? (AmplifyCredential.ASFDevice) amplifyCredential2 : null;
                        if (aSFDevice != null && aSFDevice.getId() != null) {
                            credentialStoreEnvironment.getCredentialStore().saveASFDevice(aSFDevice);
                        }
                    }
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.CompletedOperation(this.$credentials$inlined), null, 2, null);
                } catch (CredentialStoreError e) {
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.ThrowError(e), null, 2, null);
                }
                credentialStoreEnvironment.getLogger().verbose(id + " Sending event " + credentialStoreEvent.getType());
                eventDispatcher.send(credentialStoreEvent);
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.CredentialStoreActions
    public Action moveToIdleStateAction() {
        Action.Companion companion = Action.Companion;
        final String str = "MoveToIdleState";
        return new Action(str) { // from class: com.amplifyframework.auth.cognito.actions.CredentialStoreCognitoActions$moveToIdleStateAction$$inlined$invoke$1
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                Intrinsics.copydefault(environment, "");
                String id = getId();
                CredentialStoreEnvironment credentialStoreEnvironment = (CredentialStoreEnvironment) environment;
                credentialStoreEnvironment.getLogger().verbose(id + " Starting execution");
                CredentialStoreEvent credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.MoveToIdleState(null, 1, null), null, 2, null);
                credentialStoreEnvironment.getLogger().verbose(id + " Sending event " + credentialStoreEvent.getType());
                eventDispatcher.send(credentialStoreEvent);
                return Unit.INSTANCE;
            }
        };
    }
}
