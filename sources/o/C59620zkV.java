package o;

/* JADX INFO: renamed from: o.zkV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59620zkV implements InterfaceC59576zje {
    public InterfaceC59576zje wrappedEntity;

    public C59620zkV(InterfaceC59576zje interfaceC59576zje) {
        this.wrappedEntity = (InterfaceC59576zje) C59851zoo.AEQbTJ(interfaceC59576zje, "Wrapped entity");
    }

    @Override // o.InterfaceC59576zje
    public boolean isRepeatable() {
        return this.wrappedEntity.isRepeatable();
    }

    @Override // o.InterfaceC59576zje
    public boolean isChunked() {
        return this.wrappedEntity.isChunked();
    }

    @Override // o.InterfaceC59576zje
    public long getContentLength() {
        return this.wrappedEntity.getContentLength();
    }

    @Override // o.InterfaceC59576zje
    public InterfaceC59518ziZ getContentType() {
        return this.wrappedEntity.getContentType();
    }

    @Override // o.InterfaceC59576zje
    public InterfaceC59518ziZ getContentEncoding() {
        return this.wrappedEntity.getContentEncoding();
    }

    @Override // o.InterfaceC59576zje
    public java.io.InputStream getContent() throws java.io.IOException {
        return this.wrappedEntity.getContent();
    }

    @Override // o.InterfaceC59576zje
    public void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        this.wrappedEntity.writeTo(outputStream);
    }

    @Override // o.InterfaceC59576zje
    public boolean isStreaming() {
        return this.wrappedEntity.isStreaming();
    }

    @Override // o.InterfaceC59576zje
    @java.lang.Deprecated
    public void consumeContent() throws java.io.IOException {
        this.wrappedEntity.consumeContent();
    }
}
