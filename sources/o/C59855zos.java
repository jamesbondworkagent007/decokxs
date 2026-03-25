package o;

/* JADX INFO: renamed from: o.zos, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59855zos {
    private C59855zos() {
    }

    public static void KWHzl(InterfaceC59576zje interfaceC59576zje) throws java.io.IOException {
        java.io.InputStream content;
        if (interfaceC59576zje == null || !interfaceC59576zje.isStreaming() || (content = interfaceC59576zje.getContent()) == null) {
            return;
        }
        content.close();
    }
}
