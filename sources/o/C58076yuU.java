package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58082yua;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yuU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58076yuU implements InterfaceC58026ytX<byte[]> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/yua;)Ljava/lang/Object; */
    @Override // o.InterfaceC58026ytX
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public byte[] AEQbTJ(@NotNull AbstractC58082yua abstractC58082yua) {
        Intrinsics.checkNotNullParameter(abstractC58082yua, "");
        if (abstractC58082yua instanceof AbstractC58082yua.ActionBar) {
            return ((AbstractC58082yua.ActionBar) abstractC58082yua).KWHzl();
        }
        throw new java.lang.IllegalArgumentException("This Message Adapter only supports bytes Messages");
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Lo/yua; */
    @Override // o.InterfaceC58026ytX
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public AbstractC58082yua EZpvd(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new AbstractC58082yua.ActionBar(bArr);
    }
}
