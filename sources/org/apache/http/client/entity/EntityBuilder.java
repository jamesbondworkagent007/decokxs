package org.apache.http.client.entity;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import o.AbstractC59615zkQ;
import o.C59613zkO;
import o.C59614zkP;
import o.C59616zkR;
import o.C59617zkS;
import o.C59618zkT;
import o.C59619zkU;
import o.InterfaceC59576zje;
import o.InterfaceC59582zjk;
import org.apache.http.entity.ContentType;

/* JADX INFO: loaded from: classes24.dex */
public class EntityBuilder {
    private byte[] binary;
    private boolean chunked;
    private String contentEncoding;
    private ContentType contentType;
    private File file;
    private boolean gzipCompress;
    private List<InterfaceC59582zjk> parameters;
    private Serializable serializable;
    private InputStream stream;
    private String text;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private void clearContent() {
        this.text = null;
        this.binary = null;
        this.stream = null;
        this.parameters = null;
        this.serializable = null;
        this.file = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ContentType getContentOrDefault(ContentType contentType) {
        ContentType contentType2 = this.contentType;
        return contentType2 != null ? contentType2 : contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EntityBuilder chunked() {
        this.chunked = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getBinary() {
        return this.binary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ContentType getContentType() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public File getFile() {
        return this.file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<InterfaceC59582zjk> getParameters() {
        return this.parameters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Serializable getSerializable() {
        return this.serializable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InputStream getStream() {
        return this.stream;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EntityBuilder gzipCompress() {
        this.gzipCompress = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isChunked() {
        return this.chunked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isGzipCompress() {
        return this.gzipCompress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EntityBuilder setContentEncoding(String str) {
        this.contentEncoding = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EntityBuilder setContentType(ContentType contentType) {
        this.contentType = contentType;
        return this;
    }

    public static EntityBuilder create() {
        return new EntityBuilder();
    }

    public EntityBuilder setText(String str) {
        clearContent();
        this.text = str;
        return this;
    }

    public EntityBuilder setBinary(byte[] bArr) {
        clearContent();
        this.binary = bArr;
        return this;
    }

    public EntityBuilder setStream(InputStream inputStream) {
        clearContent();
        this.stream = inputStream;
        return this;
    }

    public EntityBuilder setParameters(List<InterfaceC59582zjk> list) {
        clearContent();
        this.parameters = list;
        return this;
    }

    public EntityBuilder setParameters(InterfaceC59582zjk... interfaceC59582zjkArr) {
        return setParameters(Arrays.asList(interfaceC59582zjkArr));
    }

    public EntityBuilder setSerializable(Serializable serializable) {
        clearContent();
        this.serializable = serializable;
        return this;
    }

    public EntityBuilder setFile(File file) {
        clearContent();
        this.file = file;
        return this;
    }

    public InterfaceC59576zje build() {
        AbstractC59615zkQ c59614zkP;
        ContentType contentType;
        String str = this.text;
        if (str != null) {
            c59614zkP = new C59619zkU(str, getContentOrDefault(ContentType.DEFAULT_TEXT));
        } else {
            byte[] bArr = this.binary;
            if (bArr != null) {
                c59614zkP = new C59613zkO(bArr, getContentOrDefault(ContentType.DEFAULT_BINARY));
            } else {
                InputStream inputStream = this.stream;
                if (inputStream != null) {
                    c59614zkP = new C59618zkT(inputStream, -1L, getContentOrDefault(ContentType.DEFAULT_BINARY));
                } else {
                    List<InterfaceC59582zjk> list = this.parameters;
                    if (list != null) {
                        ContentType contentType2 = this.contentType;
                        c59614zkP = new UrlEncodedFormEntity(list, contentType2 != null ? contentType2.getCharset() : null);
                    } else {
                        Serializable serializable = this.serializable;
                        if (serializable != null) {
                            c59614zkP = new C59616zkR(serializable);
                            c59614zkP.setContentType(ContentType.DEFAULT_BINARY.toString());
                        } else {
                            File file = this.file;
                            if (file != null) {
                                c59614zkP = new C59617zkS(file, getContentOrDefault(ContentType.DEFAULT_BINARY));
                            } else {
                                c59614zkP = new C59614zkP();
                            }
                        }
                    }
                }
            }
        }
        if (c59614zkP.getContentType() != null && (contentType = this.contentType) != null) {
            c59614zkP.setContentType(contentType.toString());
        }
        c59614zkP.setContentEncoding(this.contentEncoding);
        c59614zkP.setChunked(this.chunked);
        return this.gzipCompress ? new GzipCompressingEntity(c59614zkP) : c59614zkP;
    }
}
