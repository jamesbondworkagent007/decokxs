package org.spongycastle.pqc.jcajce.interfaces;

import java.security.PrivateKey;

/* JADX INFO: loaded from: classes25.dex */
public interface NHPrivateKey extends NHKey, PrivateKey {
    short[] getSecretData();
}
