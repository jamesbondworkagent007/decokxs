package o;

import aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FF implements XmlStreamReader {
    public final XmlStreamReader EZpvd;

    @Override // aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader
    public FA AEQbTJ() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader
    public XmlStreamReader EZpvd(@NotNull XmlStreamReader.SubtreeStartDepth subtreeStartDepth) {
        Intrinsics.checkNotNullParameter(subtreeStartDepth, "");
        return this;
    }

    @Override // aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader
    public void EZpvd() {
    }

    @Override // aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader
    public FA copydefault(int i) {
        return null;
    }

    public FF(@NotNull XmlStreamReader xmlStreamReader) {
        Intrinsics.checkNotNullParameter(xmlStreamReader, "");
        this.EZpvd = xmlStreamReader;
    }

    @Override // aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader
    public FA OLrzqt() {
        return this.EZpvd.OLrzqt();
    }
}
