package o;

import com.fasterxml.jackson.databind.ObjectMapper;
import o.VZ;

/* JADX INFO: loaded from: classes21.dex */
public abstract class VZ<M extends ObjectMapper, B extends VZ<M, B>> {
    public final M copydefault;

    public VZ(M m) {
        this.copydefault = m;
    }
}
