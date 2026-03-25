package o;

import androidx.fragment.app.FragmentFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC59982ztK;
import o.C56524yIo;
import o.C59939zsU;
import o.C59976ztE;
import o.C59978ztG;
import o.C59990ztS;
import o.C59991ztT;
import o.C60053zuc;
import o.C60059zui;
import o.C60060zuj;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;

/* JADX INFO: renamed from: o.zsW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59941zsW {
    public static final C59991ztT EZpvd = C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: org.koin.androidx.fragment.koin.KoinApplicationExtKt$fragmentFactoryModule$1
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
            invoke2(c59991ztT);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull C59991ztT c59991ztT) {
            Intrinsics.checkNotNullParameter(c59991ztT, "");
            AnonymousClass1 anonymousClass1 = new Function2<C60060zuj, C60053zuc, FragmentFactory>() { // from class: org.koin.androidx.fragment.koin.KoinApplicationExtKt$fragmentFactoryModule$1.1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final FragmentFactory invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return new C59939zsU(null, 1, 0 == true ? 1 : 0);
                }
            };
            C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(C60059zui.KWHzl.KWHzl(), C56524yIo.AEQbTJ(FragmentFactory.class), null, anonymousClass1, Kind.Singleton, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS);
            }
            new C59976ztE(c59991ztT, c59990ztS);
        }
    }, 1, null);
}
