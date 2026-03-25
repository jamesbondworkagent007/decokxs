package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
import o.C5517Ut;

/* JADX INFO: loaded from: classes21.dex */
public abstract class OutputDecorator implements Serializable {
    public abstract OutputStream decorate(C5517Ut c5517Ut, OutputStream outputStream) throws IOException;

    public abstract Writer decorate(C5517Ut c5517Ut, Writer writer) throws IOException;
}
