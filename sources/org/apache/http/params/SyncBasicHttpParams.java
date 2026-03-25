package org.apache.http.params;

import o.InterfaceC59779znV;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class SyncBasicHttpParams extends BasicHttpParams {
    private static final long serialVersionUID = 5387834869062660642L;

    @Override // org.apache.http.params.BasicHttpParams
    public boolean removeParameter(String str) {
        boolean zRemoveParameter;
        synchronized (this) {
            zRemoveParameter = super.removeParameter(str);
        }
        return zRemoveParameter;
    }

    @Override // org.apache.http.params.BasicHttpParams, o.InterfaceC59779znV
    public InterfaceC59779znV setParameter(String str, Object obj) {
        InterfaceC59779znV parameter;
        synchronized (this) {
            parameter = super.setParameter(str, obj);
        }
        return parameter;
    }

    @Override // org.apache.http.params.BasicHttpParams, o.InterfaceC59779znV
    public Object getParameter(String str) {
        Object parameter;
        synchronized (this) {
            parameter = super.getParameter(str);
        }
        return parameter;
    }

    @Override // org.apache.http.params.BasicHttpParams
    public boolean isParameterSet(String str) {
        boolean zIsParameterSet;
        synchronized (this) {
            zIsParameterSet = super.isParameterSet(str);
        }
        return zIsParameterSet;
    }

    @Override // org.apache.http.params.BasicHttpParams
    public boolean isParameterSetLocally(String str) {
        boolean zIsParameterSetLocally;
        synchronized (this) {
            zIsParameterSetLocally = super.isParameterSetLocally(str);
        }
        return zIsParameterSetLocally;
    }

    @Override // org.apache.http.params.BasicHttpParams
    public void setParameters(String[] strArr, Object obj) {
        synchronized (this) {
            super.setParameters(strArr, obj);
        }
    }

    @Override // org.apache.http.params.BasicHttpParams
    public void clear() {
        synchronized (this) {
            super.clear();
        }
    }

    @Override // org.apache.http.params.BasicHttpParams
    public Object clone() throws CloneNotSupportedException {
        Object objClone;
        synchronized (this) {
            objClone = super.clone();
        }
        return objClone;
    }
}
