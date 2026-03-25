package org.apache.http.client;

import o.C59596zjy;
import o.InterfaceC59597zjz;

/* JADX INFO: loaded from: classes13.dex */
public interface CredentialsProvider {
    void clear();

    InterfaceC59597zjz getCredentials(C59596zjy c59596zjy);

    void setCredentials(C59596zjy c59596zjy, InterfaceC59597zjz interfaceC59597zjz);
}
