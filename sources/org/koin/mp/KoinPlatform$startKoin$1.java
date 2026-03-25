package org.koin.mp;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.C59991ztT;
import o.C60018ztu;
import o.C60071zuu;
import org.jetbrains.annotations.NotNull;
import org.koin.core.logger.Level;

/* JADX INFO: loaded from: classes24.dex */
public final class KoinPlatform$startKoin$1 extends Lambda implements Function1<C60018ztu, Unit> {
    final /* synthetic */ Level $level;
    final /* synthetic */ List<C59991ztT> $modules;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinPlatform$startKoin$1(Level level, List<C59991ztT> list) {
        super(1);
        this.$level = level;
        this.$modules = list;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C60018ztu c60018ztu) {
        invoke2(c60018ztu);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull C60018ztu c60018ztu) {
        Intrinsics.checkNotNullParameter(c60018ztu, "");
        c60018ztu.AEQbTJ(C60071zuu.OLrzqt.OLrzqt(this.$level));
        c60018ztu.KWHzl(this.$modules);
    }
}
