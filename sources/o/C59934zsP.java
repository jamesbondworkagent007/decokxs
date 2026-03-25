package o;

import android.app.Application;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC59982ztK;
import o.C56524yIo;
import o.C59976ztE;
import o.C59978ztG;
import o.C59990ztS;
import o.C59991ztT;
import o.C60053zuc;
import o.C60059zui;
import o.C60060zuj;
import o.C60061zuk;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;
import org.koin.core.logger.Level;

/* JADX INFO: renamed from: o.zsP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59934zsP {
    public static /* synthetic */ C60018ztu androidLogger$default(C60018ztu c60018ztu, Level level, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            level = Level.INFO;
        }
        return copydefault(c60018ztu, level);
    }

    public static final C60018ztu copydefault(@NotNull C60018ztu c60018ztu, @NotNull Level level) {
        Intrinsics.checkNotNullParameter(c60018ztu, "");
        Intrinsics.checkNotNullParameter(level, "");
        c60018ztu.OLrzqt().copydefault(new C59936zsR(level));
        return c60018ztu;
    }

    public static final C60018ztu AEQbTJ(@NotNull C60018ztu c60018ztu, @NotNull final android.content.Context context) {
        Intrinsics.checkNotNullParameter(c60018ztu, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (c60018ztu.OLrzqt().KWHzl().copydefault(Level.INFO)) {
            c60018ztu.OLrzqt().KWHzl().AEQbTJ("[init] declare Android Context");
        }
        if (context instanceof android.app.Application) {
            C60022zty.loadModules$default(c60018ztu.OLrzqt(), C56402yEa.EZpvd(C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: org.koin.android.ext.koin.KoinExtKt$androidContext$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

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
                    final Context context2 = context;
                    Function2<C60060zuj, C60053zuc, Application> function2 = new Function2<C60060zuj, C60053zuc, Application>() { // from class: org.koin.android.ext.koin.KoinExtKt$androidContext$1.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function2
                        public final Application invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                            Intrinsics.checkNotNullParameter(c60060zuj, "");
                            Intrinsics.checkNotNullParameter(c60053zuc, "");
                            return (Application) context2;
                        }
                    };
                    C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(C60059zui.KWHzl.KWHzl(), C56524yIo.AEQbTJ(Application.class), null, function2, Kind.Singleton, yDY.AhwBna()));
                    c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                    if (c59991ztT.OLrzqt()) {
                        c59991ztT.KWHzl(c59990ztS);
                    }
                    C60061zuk.KWHzl(new C59976ztE(c59991ztT, c59990ztS), C56524yIo.AEQbTJ(Context.class));
                }
            }, 1, null)), false, false, 6, null);
        } else {
            C60022zty.loadModules$default(c60018ztu.OLrzqt(), C56402yEa.EZpvd(C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: org.koin.android.ext.koin.KoinExtKt$androidContext$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

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
                    final Context context2 = context;
                    Function2<C60060zuj, C60053zuc, Context> function2 = new Function2<C60060zuj, C60053zuc, Context>() { // from class: org.koin.android.ext.koin.KoinExtKt$androidContext$2.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function2
                        public final Context invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                            Intrinsics.checkNotNullParameter(c60060zuj, "");
                            Intrinsics.checkNotNullParameter(c60053zuc, "");
                            return context2;
                        }
                    };
                    C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(C60059zui.KWHzl.KWHzl(), C56524yIo.AEQbTJ(Context.class), null, function2, Kind.Singleton, yDY.AhwBna()));
                    c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                    if (c59991ztT.OLrzqt()) {
                        c59991ztT.KWHzl(c59990ztS);
                    }
                    new C59976ztE(c59991ztT, c59990ztS);
                }
            }, 1, null)), false, false, 6, null);
        }
        return c60018ztu;
    }

    public static /* synthetic */ C60018ztu androidFileProperties$default(C60018ztu c60018ztu, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "koin.properties";
        }
        return OLrzqt(c60018ztu, str);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final C60018ztu OLrzqt(@NotNull C60018ztu c60018ztu, @NotNull java.lang.String str) {
        java.lang.String[] list;
        Intrinsics.checkNotNullParameter(c60018ztu, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Properties properties = new java.util.Properties();
        android.content.Context context = (android.content.Context) c60018ztu.OLrzqt().EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(android.content.Context.class), null, null);
        try {
            android.content.res.AssetManager assets = context.getAssets();
            if (assets != null && (list = assets.list("")) != null && yDV.valueOf(list, str)) {
                try {
                    java.io.InputStream inputStreamOpen = context.getAssets().open(str);
                    try {
                        properties.load(inputStreamOpen);
                        Unit unit = Unit.INSTANCE;
                        yFA.copydefault(inputStreamOpen, null);
                        C60063zum.copydefault(c60018ztu.OLrzqt().copydefault(), properties);
                        if (c60018ztu.OLrzqt().KWHzl().copydefault(Level.INFO)) {
                            c60018ztu.OLrzqt().KWHzl().AEQbTJ("[Android-Properties] loaded " + unit + " properties from assets/" + str);
                        }
                    } finally {
                    }
                } catch (java.lang.Exception e) {
                    c60018ztu.OLrzqt().KWHzl().copydefault("[Android-Properties] error for binding properties : " + e);
                }
            } else if (c60018ztu.OLrzqt().KWHzl().copydefault(Level.INFO)) {
                c60018ztu.OLrzqt().KWHzl().AEQbTJ("[Android-Properties] no assets/" + str + " file to load");
            }
        } catch (java.lang.Exception e2) {
            c60018ztu.OLrzqt().KWHzl().copydefault("[Android-Properties] error while loading properties from assets/" + str + " : " + e2);
        }
        return c60018ztu;
    }
}
