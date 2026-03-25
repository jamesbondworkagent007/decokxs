package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C59227zd<Src, Dest> extends C56590yL<Src, Dest> implements java.util.Set<Dest> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59227zd(@NotNull java.util.Set<? extends Src> set, @NotNull Function1<? super Src, ? extends Dest> function1, @NotNull Function1<? super Dest, ? extends Src> function12) {
        super(set, function1, function12);
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
    }
}
