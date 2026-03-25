package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC59348zfO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zfZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59359zfZ<K, V, T extends V> extends AbstractC59348zfO.ActionBar<K, V, T> implements yIO<AbstractC59348zfO<K, V>, V> {
    public C59359zfZ(int i) {
        super(i);
    }

    /* JADX DEBUG: Method merged with bridge method: getValue(Ljava/lang/Object;Lo/yJA;)Ljava/lang/Object; */
    @Override // o.yIO
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public T getValue(@NotNull AbstractC59348zfO<K, V> abstractC59348zfO, @NotNull yJA<?> yja) {
        Intrinsics.checkNotNullParameter(abstractC59348zfO, "");
        Intrinsics.checkNotNullParameter(yja, "");
        return AEQbTJ(abstractC59348zfO);
    }
}
