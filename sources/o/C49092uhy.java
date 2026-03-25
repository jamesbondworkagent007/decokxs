package o;

import androidx.collection.ArraySetKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: o.uhy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49092uhy implements InterfaceC57335ygV {
    public final InterfaceC56387yDm<AbstractC57329ygP> AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.uhz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49092uhy.AEQbTJ();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57335ygV
    public java.lang.String KWHzl() {
        return "request";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57335ygV
    public InterfaceC56387yDm<AbstractC57329ygP> copydefault() {
        return this.AEQbTJ;
    }

    public static final C49014ugZ AEQbTJ() {
        return new C49014ugZ();
    }

    @Override // o.InterfaceC57335ygV
    public java.util.Set<java.lang.String> EZpvd() {
        return ArraySetKt.arraySetOf("share", "shareImage", "shareImageBase64", "createImageWithMark", "createQRCodeImage", "shareMultiImage", "nativeShare", "app/showSharePopup");
    }
}
