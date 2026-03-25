package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59266zdm extends AbstractC59272zds implements InterfaceC59376zfq {
    public final C59308zeb copydefault;

    @Override // o.AbstractC59272zds, o.AbstractC59233zdF
    public boolean AEQbTJ() {
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Z)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C59266zdm AEQbTJ(boolean z) {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59272zds
    public java.lang.String OLrzqt(@NotNull yXX yxx, @NotNull InterfaceC56959yYr interfaceC56959yYr) {
        Intrinsics.checkNotNullParameter(yxx, "");
        Intrinsics.checkNotNullParameter(interfaceC56959yYr, "");
        return "dynamic";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59272zds, o.AbstractC59233zdF
    public C59308zeb bX_() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeG;)Lo/zdF; */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zeG;)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C59266zdm KWHzl(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C59266zdm(@NotNull AbstractC56640yMw abstractC56640yMw, @NotNull C59308zeb c59308zeb) {
        Intrinsics.checkNotNullParameter(abstractC56640yMw, "");
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        AbstractC59242zdO fieldNames = abstractC56640yMw.getFieldNames();
        Intrinsics.checkNotNullExpressionValue(fieldNames, "");
        AbstractC59242zdO abstractC59242zdOIwGUEr = abstractC56640yMw.iwGUEr();
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOIwGUEr, "");
        super(fieldNames, abstractC59242zdOIwGUEr);
        this.copydefault = c59308zeb;
    }

    @Override // o.AbstractC59272zds
    public AbstractC59242zdO EZpvd() {
        return AYXKKw();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeb;)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C59266zdm AEQbTJ(@NotNull C59308zeb c59308zeb) {
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        return new C59266zdm(C59336zfC.copydefault((AbstractC59233zdF) EZpvd()), c59308zeb);
    }
}
