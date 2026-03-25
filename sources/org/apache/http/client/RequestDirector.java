package org.apache.http.client;

import java.io.IOException;
import o.InterfaceC59577zjf;
import o.InterfaceC59584zjm;
import o.InterfaceC59838zob;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public interface RequestDirector {
    InterfaceC59584zjm execute(HttpHost httpHost, InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws HttpException, IOException;
}
