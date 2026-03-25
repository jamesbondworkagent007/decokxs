package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58082yua;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yuV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58077yuV implements InterfaceC58026ytX<java.lang.String> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/yua;)Ljava/lang/Object; */
    @Override // o.InterfaceC58026ytX
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.String AEQbTJ(@NotNull AbstractC58082yua abstractC58082yua) {
        Intrinsics.checkNotNullParameter(abstractC58082yua, "");
        if (abstractC58082yua instanceof AbstractC58082yua.TaskDescription) {
            return ((AbstractC58082yua.TaskDescription) abstractC58082yua).KWHzl();
        }
        throw new java.lang.IllegalArgumentException("This Message Adapter only supports text Messages");
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Lo/yua; */
    @Override // o.InterfaceC58026ytX
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public AbstractC58082yua EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AbstractC58082yua.TaskDescription(str);
    }
}
