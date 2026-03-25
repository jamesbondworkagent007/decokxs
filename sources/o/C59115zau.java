package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zau, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59115zau implements InterfaceC59120zaz, InterfaceC59069zaA {
    public final InterfaceC56658yNn AEQbTJ;
    public final InterfaceC56658yNn OLrzqt;
    public final C59115zau copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59069zaA
    public final InterfaceC56658yNn AEQbTJ() {
        return this.OLrzqt;
    }

    public C59115zau(@NotNull InterfaceC56658yNn interfaceC56658yNn, C59115zau c59115zau) {
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        this.OLrzqt = interfaceC56658yNn;
        this.copydefault = c59115zau == null ? this : c59115zau;
        this.AEQbTJ = interfaceC56658yNn;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/zdF; */
    @Override // o.InterfaceC59070zaB
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public AbstractC59242zdO OLrzqt() {
        AbstractC59242zdO abstractC59242zdOBQ_ = this.OLrzqt.bQ_();
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOBQ_, "");
        return abstractC59242zdOBQ_;
    }

    public boolean equals(java.lang.Object obj) {
        InterfaceC56658yNn interfaceC56658yNn = this.OLrzqt;
        C59115zau c59115zau = obj instanceof C59115zau ? (C59115zau) obj : null;
        return Intrinsics.EZpvd(interfaceC56658yNn, c59115zau != null ? c59115zau.OLrzqt : null);
    }

    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    public java.lang.String toString() {
        return "Class{" + OLrzqt() + AbstractJsonLexerKt.END_OBJ;
    }
}
