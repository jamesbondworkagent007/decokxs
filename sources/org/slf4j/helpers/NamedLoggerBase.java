package org.slf4j.helpers;

import java.io.ObjectStreamException;
import java.io.Serializable;
import o.C60099zvg;
import o.InterfaceC60100zvh;

/* JADX INFO: loaded from: classes13.dex */
abstract class NamedLoggerBase implements InterfaceC60100zvh, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    protected String name;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60100zvh
    public String getName() {
        return this.name;
    }

    public Object readResolve() throws ObjectStreamException {
        return C60099zvg.OLrzqt(getName());
    }
}
