package com.fasterxml.jackson.core.io;

import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import o.C5517Ut;

/* JADX INFO: loaded from: classes21.dex */
public abstract class InputDecorator implements Serializable {
    private static final long serialVersionUID = 1;

    public abstract InputStream decorate(C5517Ut c5517Ut, InputStream inputStream) throws IOException;

    public abstract InputStream decorate(C5517Ut c5517Ut, byte[] bArr, int i, int i2) throws IOException;

    public abstract Reader decorate(C5517Ut c5517Ut, Reader reader) throws IOException;

    public DataInput decorate(C5517Ut c5517Ut, DataInput dataInput) throws IOException {
        throw new UnsupportedOperationException();
    }
}
