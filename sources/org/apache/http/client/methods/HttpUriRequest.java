package org.apache.http.client.methods;

import java.net.URI;
import o.InterfaceC59577zjf;

/* JADX INFO: loaded from: classes13.dex */
public interface HttpUriRequest extends InterfaceC59577zjf {
    void abort() throws UnsupportedOperationException;

    String getMethod();

    URI getURI();

    boolean isAborted();
}
