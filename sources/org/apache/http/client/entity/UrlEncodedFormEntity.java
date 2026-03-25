package org.apache.http.client.entity;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import o.C59619zkU;
import o.C59841zoe;
import o.InterfaceC59582zjk;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.ContentType;

/* JADX INFO: loaded from: classes13.dex */
public class UrlEncodedFormEntity extends C59619zkU {
    public UrlEncodedFormEntity(List<? extends InterfaceC59582zjk> list, String str) throws UnsupportedEncodingException {
        super(URLEncodedUtils.format(list, str != null ? str : C59841zoe.OLrzqt.name()), ContentType.create("application/x-www-form-urlencoded", str));
    }

    public UrlEncodedFormEntity(Iterable<? extends InterfaceC59582zjk> iterable, Charset charset) {
        super(URLEncodedUtils.format(iterable, charset != null ? charset : C59841zoe.OLrzqt), ContentType.create("application/x-www-form-urlencoded", charset));
    }

    public UrlEncodedFormEntity(List<? extends InterfaceC59582zjk> list) throws UnsupportedEncodingException {
        this(list, (Charset) null);
    }

    public UrlEncodedFormEntity(Iterable<? extends InterfaceC59582zjk> iterable) {
        this(iterable, (Charset) null);
    }
}
