package o;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C60053zuc;
import org.jetbrains.annotations.NotNull;
import org.koin.core.error.NoBeanDefFoundException;
import org.koin.core.logger.Level;

/* JADX INFO: renamed from: o.ztL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59983ztL {
    public static /* synthetic */ java.lang.Object newInstance$default(C60060zuj c60060zuj, C60053zuc c60053zuc, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c60053zuc = C60052zub.OLrzqt();
        }
        Intrinsics.checkNotNullParameter(c60060zuj, "");
        Intrinsics.checkNotNullParameter(c60053zuc, "");
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        return copydefault(c60060zuj, C56524yIo.AEQbTJ(java.lang.Object.class), c60053zuc);
    }

    public static final <T> T copydefault(@NotNull C60060zuj c60060zuj, @NotNull InterfaceC56551yJo<T> interfaceC56551yJo, @NotNull C60053zuc c60053zuc) throws NoBeanDefFoundException {
        java.lang.Object[] objArrKWHzl;
        T t;
        Intrinsics.checkNotNullParameter(c60060zuj, "");
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(c60053zuc, "");
        Level levelKWHzl = c60060zuj.EZpvd().KWHzl();
        Level level = Level.DEBUG;
        if (levelKWHzl == level) {
            c60060zuj.EZpvd().EZpvd("|- creating new instance - " + C60067zuq.KWHzl(interfaceC56551yJo));
        }
        java.lang.reflect.Constructor<?>[] constructors = yHE.OLrzqt(interfaceC56551yJo).getConstructors();
        Intrinsics.checkNotNullExpressionValue(constructors, "");
        java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) yDV.zsXlph(constructors);
        if (constructor == null) {
            throw new java.lang.IllegalStateException(("No constructor found for class '" + C60067zuq.KWHzl(interfaceC56551yJo) + '\'').toString());
        }
        if (c60060zuj.EZpvd().KWHzl() != level) {
            objArrKWHzl = KWHzl(constructor, c60060zuj, c60053zuc);
        } else {
            C60072zuv c60072zuv = C60072zuv.OLrzqt;
            kotlin.Pair pair = new kotlin.Pair(KWHzl(constructor, c60060zuj, c60053zuc), java.lang.Double.valueOf((c60072zuv.copydefault() - c60072zuv.copydefault()) / 1000000.0d));
            kotlin.Pair pair2 = new kotlin.Pair(pair.component1(), java.lang.Double.valueOf(((java.lang.Number) pair.component2()).doubleValue()));
            objArrKWHzl = (java.lang.Object[]) pair2.component1();
            double dDoubleValue = ((java.lang.Number) pair2.component2()).doubleValue();
            c60060zuj.EZpvd().EZpvd("|- got arguments in " + dDoubleValue + " ms");
        }
        if (c60060zuj.EZpvd().KWHzl() != level) {
            t = (T) KWHzl(objArrKWHzl, constructor);
        } else {
            C60072zuv c60072zuv2 = C60072zuv.OLrzqt;
            kotlin.Pair pair3 = new kotlin.Pair(KWHzl(objArrKWHzl, constructor), java.lang.Double.valueOf((c60072zuv2.copydefault() - c60072zuv2.copydefault()) / 1000000.0d));
            kotlin.Pair pair4 = new kotlin.Pair(pair3.component1(), java.lang.Double.valueOf(((java.lang.Number) pair3.component2()).doubleValue()));
            t = (T) pair4.component1();
            double dDoubleValue2 = ((java.lang.Number) pair4.component2()).doubleValue();
            c60060zuj.EZpvd().EZpvd("|- created instance in " + dDoubleValue2 + " ms");
        }
        Intrinsics.copydefault(t, "");
        return t;
    }

    public static final java.lang.Object KWHzl(java.lang.Object[] objArr, java.lang.reflect.Constructor<? extends java.lang.Object> constructor) throws java.lang.IllegalAccessException, java.lang.InstantiationException, InvocationTargetException {
        java.lang.Object objNewInstance;
        if (objArr.length == 0) {
            objNewInstance = constructor.newInstance(new java.lang.Object[0]);
        } else {
            objNewInstance = constructor.newInstance(java.util.Arrays.copyOf(objArr, objArr.length));
        }
        Intrinsics.copydefault(objNewInstance);
        return objNewInstance;
    }

    public static final java.lang.Object[] KWHzl(java.lang.reflect.Constructor<?> constructor, C60060zuj c60060zuj, final C60053zuc c60053zuc) throws NoBeanDefFoundException {
        int length = constructor.getParameterTypes().length;
        if (length == 0) {
            return new java.lang.Object[0];
        }
        java.lang.Object[] objArr = new java.lang.Object[length];
        for (int i = 0; i < length; i++) {
            objArr[i] = Unit.INSTANCE;
        }
        for (int i2 = 0; i2 < length; i2++) {
            java.lang.Class<?> cls = constructor.getParameterTypes()[i2];
            Intrinsics.copydefault(cls);
            InterfaceC56551yJo<?> interfaceC56551yJoKWHzl = yHE.KWHzl(cls);
            java.lang.Object objKWHzl = c60060zuj.KWHzl(interfaceC56551yJoKWHzl, null, new Function0<C60053zuc>() { // from class: org.koin.core.instance.InstanceBuilderKt$getArguments$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final C60053zuc invoke() {
                    return c60053zuc;
                }
            });
            if (objKWHzl == null && (objKWHzl = c60053zuc.copydefault(interfaceC56551yJoKWHzl)) == null) {
                throw new NoBeanDefFoundException("No definition found for class '" + interfaceC56551yJoKWHzl + '\'');
            }
            objArr[i2] = objKWHzl;
        }
        return objArr;
    }
}
