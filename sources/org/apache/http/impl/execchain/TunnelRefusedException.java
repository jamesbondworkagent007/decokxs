package org.apache.http.impl.execchain;

import o.InterfaceC59584zjm;
import org.apache.http.HttpException;

/* JADX INFO: loaded from: classes24.dex */
public class TunnelRefusedException extends HttpException {
    private static final long serialVersionUID = -8646722842745617323L;
    private final InterfaceC59584zjm response;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC59584zjm getResponse() {
        return this.response;
    }

    public TunnelRefusedException(String str, InterfaceC59584zjm interfaceC59584zjm) {
        super(str);
        this.response = interfaceC59584zjm;
    }
}
