package com.chad.library.adapter.base.entity;

import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public abstract class SectionMultiEntity<T> implements Serializable {
    public String header;
    public boolean isHeader;
    public T t;

    public SectionMultiEntity(boolean z, String str) {
        this.isHeader = z;
        this.header = str;
        this.t = null;
    }

    public SectionMultiEntity(T t) {
        this.isHeader = false;
        this.header = null;
        this.t = t;
    }
}
