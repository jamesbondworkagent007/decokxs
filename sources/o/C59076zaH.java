package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zaH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59076zaH extends AbstractC59074zaF<yOJ> implements InterfaceC59077zaI<yOJ, AbstractC56975yZg<?>> {
    public final C59080zaL KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/zbq;Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;Lo/zdF;)Ljava/lang/Object; */
    @Override // o.InterfaceC59077zaI
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public AbstractC56975yZg<?> EZpvd(@NotNull AbstractC59164zbq abstractC59164zbq, @NotNull ProtoBuf.Property property, @NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59164zbq, "");
        Intrinsics.checkNotNullParameter(property, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59076zaH(@NotNull yNP ynp, @NotNull yNO yno, @NotNull C59072zaD c59072zaD) {
        super(c59072zaD);
        Intrinsics.checkNotNullParameter(ynp, "");
        Intrinsics.checkNotNullParameter(yno, "");
        Intrinsics.checkNotNullParameter(c59072zaD, "");
        this.KWHzl = new C59080zaL(ynp, yno);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation;Lo/yWS;)Ljava/lang/Object; */
    @Override // o.InterfaceC59079zaK
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public yOJ KWHzl(@NotNull ProtoBuf.Annotation annotation, @NotNull yWS yws) {
        Intrinsics.checkNotNullParameter(annotation, "");
        Intrinsics.checkNotNullParameter(yws, "");
        return this.KWHzl.copydefault(annotation, yws);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zbq;Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;Lo/zdF;)Ljava/lang/Object; */
    @Override // o.InterfaceC59077zaI
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public AbstractC56975yZg<?> KWHzl(@NotNull AbstractC59164zbq abstractC59164zbq, @NotNull ProtoBuf.Property property, @NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59164zbq, "");
        Intrinsics.checkNotNullParameter(property, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        ProtoBuf.Annotation.Argument.Value value = (ProtoBuf.Annotation.Argument.Value) yWY.KWHzl(property, EZpvd().EZpvd());
        if (value == null) {
            return null;
        }
        return this.KWHzl.OLrzqt(abstractC59233zdF, value, abstractC59164zbq.OLrzqt());
    }
}
