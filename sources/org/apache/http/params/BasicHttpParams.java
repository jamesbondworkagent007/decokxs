package org.apache.http.params;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o.AbstractC59774znQ;
import o.InterfaceC59779znV;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class BasicHttpParams extends AbstractC59774znQ implements Serializable, Cloneable {
    private static final long serialVersionUID = -7086398485908701455L;
    private final Map<String, Object> parameters = new ConcurrentHashMap();

    @Override // o.InterfaceC59779znV
    public Object getParameter(String str) {
        return this.parameters.get(str);
    }

    @Override // o.InterfaceC59779znV
    public InterfaceC59779znV setParameter(String str, Object obj) {
        if (str == null) {
            return this;
        }
        if (obj != null) {
            this.parameters.put(str, obj);
        } else {
            this.parameters.remove(str);
        }
        return this;
    }

    public boolean removeParameter(String str) {
        if (!this.parameters.containsKey(str)) {
            return false;
        }
        this.parameters.remove(str);
        return true;
    }

    public void setParameters(String[] strArr, Object obj) {
        for (String str : strArr) {
            setParameter(str, obj);
        }
    }

    public boolean isParameterSet(String str) {
        return getParameter(str) != null;
    }

    public boolean isParameterSetLocally(String str) {
        return this.parameters.get(str) != null;
    }

    public void clear() {
        this.parameters.clear();
    }

    @Override // o.InterfaceC59779znV
    public InterfaceC59779znV copy() {
        try {
            return (InterfaceC59779znV) clone();
        } catch (CloneNotSupportedException unused) {
            throw new UnsupportedOperationException("Cloning not supported");
        }
    }

    public Object clone() throws CloneNotSupportedException {
        BasicHttpParams basicHttpParams = (BasicHttpParams) super.clone();
        copyParams(basicHttpParams);
        return basicHttpParams;
    }

    public void copyParams(InterfaceC59779znV interfaceC59779znV) {
        for (Map.Entry<String, Object> entry : this.parameters.entrySet()) {
            interfaceC59779znV.setParameter(entry.getKey(), entry.getValue());
        }
    }

    @Override // o.AbstractC59774znQ
    public Set<String> getNames() {
        return new HashSet(this.parameters.keySet());
    }

    public String toString() {
        return "[parameters=" + this.parameters + "]";
    }
}
