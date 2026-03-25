package o;

import aws.smithy.kotlin.runtime.io.middleware.Phase;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SyncFailedException implements BI {
    public final PipedReader AEQbTJ;

    public SyncFailedException(@NotNull PipedReader pipedReader) {
        Intrinsics.checkNotNullParameter(pipedReader, "");
        this.AEQbTJ = pipedReader;
    }

    @Override // o.BI
    public void copydefault(@NotNull BY<?, ?> by) {
        Intrinsics.checkNotNullParameter(by, "");
        by.copydefault().copydefault().AEQbTJ(this, Phase.Order.After);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC5076Du
    public java.lang.Object KWHzl(@NotNull BP<C5036Cg> bp, @NotNull Continuation<? super BP<C5036Cg>> continuation) {
        UTFDataFormatException uTFDataFormatException = (UTFDataFormatException) bp.OLrzqt().OLrzqt(UTFDataFormatException.OLrzqt.AEQbTJ());
        PipedReader pipedReaderEZpvd = this.AEQbTJ;
        if (uTFDataFormatException != null) {
            UTFDataFormatException uTFDataFormatExceptionOLrzqt = pipedReaderEZpvd.OLrzqt();
            PipedReader pipedReader = this.AEQbTJ;
            pipedReaderEZpvd = uTFDataFormatExceptionOLrzqt == null ? pipedReader.EZpvd((127 & 1) != 0 ? pipedReader.gEmmrt : null, (127 & 2) != 0 ? pipedReader.AEQbTJ : null, (127 & 4) != 0 ? pipedReader.AhwBna : null, (127 & 8) != 0 ? pipedReader.djBIcL : null, (127 & 16) != 0 ? pipedReader.copydefault : null, (127 & 32) != 0 ? pipedReader.valueOf : null, (127 & 64) != 0 ? pipedReader.OLrzqt : null, (127 & 128) != 0 ? pipedReader.KWHzl : uTFDataFormatException) : pipedReader.EZpvd((127 & 1) != 0 ? pipedReader.gEmmrt : null, (127 & 2) != 0 ? pipedReader.AEQbTJ : null, (127 & 4) != 0 ? pipedReader.AhwBna : null, (127 & 8) != 0 ? pipedReader.djBIcL : null, (127 & 16) != 0 ? pipedReader.copydefault : null, (127 & 32) != 0 ? pipedReader.valueOf : null, (127 & 64) != 0 ? pipedReader.OLrzqt : null, (127 & 128) != 0 ? pipedReader.KWHzl : pipedReader.OLrzqt().copydefault(uTFDataFormatException));
        }
        bp.EZpvd().AEQbTJ().EZpvd("User-Agent", pipedReaderEZpvd.copydefault());
        bp.EZpvd().AEQbTJ().EZpvd("x-amz-user-agent", pipedReaderEZpvd.KWHzl());
        return bp;
    }
}
