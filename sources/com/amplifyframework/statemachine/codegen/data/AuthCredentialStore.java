package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface AuthCredentialStore {
    void deleteASFDevice();

    void deleteCredential();

    void deleteDeviceKeyCredential(@NotNull String str);

    AmplifyCredential.ASFDevice retrieveASFDevice();

    AmplifyCredential retrieveCredential();

    DeviceMetadata retrieveDeviceMetadata(@NotNull String str);

    void saveASFDevice(@NotNull AmplifyCredential.ASFDevice aSFDevice);

    void saveCredential(@NotNull AmplifyCredential amplifyCredential);

    void saveDeviceMetadata(@NotNull String str, @NotNull DeviceMetadata deviceMetadata);
}
