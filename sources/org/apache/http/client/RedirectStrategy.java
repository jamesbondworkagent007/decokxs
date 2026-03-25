package org.apache.http.client;

import o.InterfaceC59577zjf;
import o.InterfaceC59584zjm;
import o.InterfaceC59838zob;
import org.apache.http.ProtocolException;
import org.apache.http.client.methods.HttpUriRequest;

/* JADX INFO: loaded from: classes13.dex */
public interface RedirectStrategy {
    HttpUriRequest getRedirect(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws ProtocolException;

    boolean isRedirected(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws ProtocolException;
}
