package com.lexisnexisrisk.threatmetrix;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public interface TMXModuleInitializerInterface extends TMXModuleMetadataProviderInterface {
    String getNativeLibName();

    Pair<String, Object> initialize();
}
