package org.apache.http.client;

import java.net.URI;
import o.InterfaceC59584zjm;
import o.InterfaceC59838zob;
import org.apache.http.ProtocolException;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public interface RedirectHandler {
    URI getLocationURI(InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws ProtocolException;

    boolean isRedirectRequested(InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob);
}
