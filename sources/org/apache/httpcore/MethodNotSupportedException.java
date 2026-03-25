package org.apache.httpcore;

/* JADX INFO: loaded from: classes24.dex */
public class MethodNotSupportedException extends HttpException {
    private static final long serialVersionUID = 3365359036840171201L;

    public MethodNotSupportedException(String str) {
        super(str);
    }

    public MethodNotSupportedException(String str, Throwable th) {
        super(str, th);
    }
}
