package o;

import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC56627yMj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yMk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56628yMk<M extends java.lang.reflect.Member> implements InterfaceC56627yMj<M> {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final java.util.List<java.lang.reflect.Type> AEQbTJ;
    public final M KWHzl;
    public final java.lang.reflect.Type OLrzqt;
    public final java.lang.Class<?> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.reflect.Member), (r2v0 java.lang.reflect.Type), (r3v0 java.lang.Class), (r4v0 java.lang.reflect.Type[]) A[MD:(M extends java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class<?>, java.lang.reflect.Type[]):void (m)] call: o.yMk.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC56628yMk(java.lang.reflect.Member member, java.lang.reflect.Type type, java.lang.Class cls, java.lang.reflect.Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(member, type, cls, typeArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56627yMj
    public java.util.List<java.lang.reflect.Type> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Class<?> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56627yMj
    public final M OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56627yMj
    public final java.lang.reflect.Type copydefault() {
        return this.OLrzqt;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC56628yMk(M m, java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.Type[] typeArr) {
        java.util.List<java.lang.reflect.Type> listAwvSrB;
        this.KWHzl = m;
        this.OLrzqt = type;
        this.copydefault = cls;
        if (cls != null) {
            C56533yIx c56533yIx = new C56533yIx(2);
            c56533yIx.copydefault(cls);
            c56533yIx.EZpvd(typeArr);
            listAwvSrB = yDY.gEmmrt(c56533yIx.copydefault((java.lang.Object[]) new java.lang.reflect.Type[c56533yIx.KWHzl()]));
            listAwvSrB = listAwvSrB == null ? yDV.AwvSrB(typeArr) : listAwvSrB;
        }
        this.AEQbTJ = listAwvSrB;
    }

    public void EZpvd(@NotNull java.lang.Object[] objArr) {
        InterfaceC56627yMj.Application.AEQbTJ(this, objArr);
    }

    @Override // o.InterfaceC56627yMj
    public boolean EZpvd() {
        return InterfaceC56627yMj.Application.AEQbTJ(this);
    }

    public final void copydefault(java.lang.Object obj) {
        if (obj == null || !this.KWHzl.getDeclaringClass().isInstance(obj)) {
            throw new java.lang.IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    /* JADX INFO: renamed from: o.yMk$StateListAnimator */
    public static final class StateListAnimator extends AbstractC56628yMk<java.lang.reflect.Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public StateListAnimator(@NotNull java.lang.reflect.Constructor<?> constructor) {
            Intrinsics.checkNotNullParameter(constructor, "");
            java.lang.Class<?> declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "");
            java.lang.Class<?> declaringClass2 = constructor.getDeclaringClass();
            java.lang.Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            java.lang.Class<?> cls = (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            java.lang.reflect.Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "");
            super(constructor, declaringClass, cls, genericParameterTypes, null);
        }

        @Override // o.InterfaceC56627yMj
        public java.lang.Object AEQbTJ(@NotNull java.lang.Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            EZpvd(objArr);
            return OLrzqt().newInstance(java.util.Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX INFO: renamed from: o.yMk$Activity */
    public static final class Activity extends AbstractC56628yMk<java.lang.reflect.Constructor<?>> implements InterfaceC56624yMg {
        public final java.lang.Object gEmmrt;

        /* JADX WARN: Illegal instructions before constructor call */
        public Activity(@NotNull java.lang.reflect.Constructor<?> constructor, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(constructor, "");
            java.lang.Class<?> declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "");
            java.lang.reflect.Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "");
            super(constructor, declaringClass, null, genericParameterTypes, null);
            this.gEmmrt = obj;
        }

        @Override // o.InterfaceC56627yMj
        public java.lang.Object AEQbTJ(@NotNull java.lang.Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            EZpvd(objArr);
            java.lang.reflect.Constructor<?> constructorOLrzqt = OLrzqt();
            C56533yIx c56533yIx = new C56533yIx(2);
            c56533yIx.copydefault(this.gEmmrt);
            c56533yIx.EZpvd(objArr);
            return constructorOLrzqt.newInstance(c56533yIx.copydefault(new java.lang.Object[c56533yIx.KWHzl()]));
        }
    }

    /* JADX INFO: renamed from: o.yMk$TaskDescription */
    public static final class TaskDescription extends AbstractC56628yMk<java.lang.reflect.Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public TaskDescription(@NotNull java.lang.reflect.Constructor<?> constructor) {
            Intrinsics.checkNotNullParameter(constructor, "");
            java.lang.Class<?> declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "");
            java.lang.reflect.Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "");
            super(constructor, declaringClass, null, (java.lang.reflect.Type[]) (genericParameterTypes.length <= 1 ? new java.lang.reflect.Type[0] : yDT.copydefault(genericParameterTypes, 0, genericParameterTypes.length - 1)), null);
        }

        @Override // o.InterfaceC56627yMj
        public java.lang.Object AEQbTJ(@NotNull java.lang.Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            EZpvd(objArr);
            java.lang.reflect.Constructor<?> constructorOLrzqt = OLrzqt();
            C56533yIx c56533yIx = new C56533yIx(2);
            c56533yIx.EZpvd(objArr);
            c56533yIx.copydefault((java.lang.Object) null);
            return constructorOLrzqt.newInstance(c56533yIx.copydefault(new java.lang.Object[c56533yIx.KWHzl()]));
        }
    }

    /* JADX INFO: renamed from: o.yMk$Application */
    public static final class Application extends AbstractC56628yMk<java.lang.reflect.Constructor<?>> implements InterfaceC56624yMg {
        public final java.lang.Object gEmmrt;

        /* JADX WARN: Illegal instructions before constructor call */
        public Application(@NotNull java.lang.reflect.Constructor<?> constructor, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(constructor, "");
            java.lang.Class<?> declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "");
            java.lang.reflect.Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "");
            super(constructor, declaringClass, null, (java.lang.reflect.Type[]) (genericParameterTypes.length <= 2 ? new java.lang.reflect.Type[0] : yDT.copydefault(genericParameterTypes, 1, genericParameterTypes.length - 1)), null);
            this.gEmmrt = obj;
        }

        @Override // o.InterfaceC56627yMj
        public java.lang.Object AEQbTJ(@NotNull java.lang.Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            EZpvd(objArr);
            java.lang.reflect.Constructor<?> constructorOLrzqt = OLrzqt();
            C56533yIx c56533yIx = new C56533yIx(3);
            c56533yIx.copydefault(this.gEmmrt);
            c56533yIx.EZpvd(objArr);
            c56533yIx.copydefault((java.lang.Object) null);
            return constructorOLrzqt.newInstance(c56533yIx.copydefault(new java.lang.Object[c56533yIx.KWHzl()]));
        }
    }

    /* JADX INFO: renamed from: o.yMk$FragmentManager */
    public static abstract class FragmentManager extends AbstractC56628yMk<java.lang.reflect.Method> {
        public final boolean gEmmrt;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.reflect.Method), (r2v0 boolean), (r3v0 java.lang.reflect.Type[]) A[MD:(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void (m)] call: o.yMk.FragmentManager.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ FragmentManager(java.lang.reflect.Method method, boolean z, java.lang.reflect.Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, z, typeArr);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (r1v0 java.lang.reflect.Method)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:boolean:NOT 
  (wrap:boolean:0x0008: INVOKE 
  (wrap:int:0x0004: INVOKE (r1v0 java.lang.reflect.Method) VIRTUAL call: java.lang.reflect.Method.getModifiers():int A[DONT_GENERATE, MD:():int (c), REMOVE, WRAPPED] (LINE:86))
 STATIC call: java.lang.reflect.Modifier.isStatic(int):boolean A[DONT_GENERATE, MD:(int):boolean (c), REMOVE, WRAPPED] (LINE:86))
 A[WRAPPED]) : (r2v0 boolean))
  (wrap:java.lang.reflect.Type[]:?: TERNARY null = ((wrap:int:0x000e: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.reflect.Type[]:0x0012: INVOKE (r1v0 java.lang.reflect.Method) VIRTUAL call: java.lang.reflect.Method.getGenericParameterTypes():java.lang.reflect.Type[] A[MD:():java.lang.reflect.Type[] (c), WRAPPED] (LINE:87)) : (r3v0 java.lang.reflect.Type[]))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.reflect.Method, boolean, java.lang.reflect.Type[], kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:84) call: o.yMk.FragmentManager.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[], kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
        public /* synthetic */ FragmentManager(java.lang.reflect.Method method, boolean z, java.lang.reflect.Type[] typeArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z, (i & 4) != 0 ? method.getGenericParameterTypes() : typeArr, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public FragmentManager(java.lang.reflect.Method method, boolean z, java.lang.reflect.Type[] typeArr) {
            java.lang.reflect.Type genericReturnType = method.getGenericReturnType();
            Intrinsics.checkNotNullExpressionValue(genericReturnType, "");
            super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr, null);
            this.gEmmrt = Intrinsics.EZpvd(copydefault(), java.lang.Void.TYPE);
        }

        public final java.lang.Object EZpvd(java.lang.Object obj, @NotNull java.lang.Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            return this.gEmmrt ? Unit.INSTANCE : OLrzqt().invoke(obj, java.util.Arrays.copyOf(objArr, objArr.length));
        }

        /* JADX INFO: renamed from: o.yMk$FragmentManager$Dialog */
        public static final class Dialog extends FragmentManager {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Dialog(@NotNull java.lang.reflect.Method method) {
                super(method, false, null, 6, null);
                Intrinsics.checkNotNullParameter(method, "");
            }

            @Override // o.InterfaceC56627yMj
            public java.lang.Object AEQbTJ(@NotNull java.lang.Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "");
                EZpvd(objArr);
                return EZpvd(null, objArr);
            }
        }

        /* JADX INFO: renamed from: o.yMk$FragmentManager$TaskDescription */
        public static final class TaskDescription extends FragmentManager {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull java.lang.reflect.Method method) {
                super(method, false, null, 6, null);
                Intrinsics.checkNotNullParameter(method, "");
            }

            @Override // o.InterfaceC56627yMj
            public java.lang.Object AEQbTJ(@NotNull java.lang.Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "");
                EZpvd(objArr);
                return EZpvd(objArr[0], objArr.length <= 1 ? new java.lang.Object[0] : yDT.copydefault(objArr, 1, objArr.length));
            }
        }

        /* JADX INFO: renamed from: o.yMk$FragmentManager$FragmentManager, reason: collision with other inner class name */
        public static final class C1001FragmentManager extends FragmentManager {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1001FragmentManager(@NotNull java.lang.reflect.Method method) {
                super(method, true, null, 4, null);
                Intrinsics.checkNotNullParameter(method, "");
            }

            @Override // o.InterfaceC56627yMj
            public java.lang.Object AEQbTJ(@NotNull java.lang.Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "");
                EZpvd(objArr);
                copydefault(yDV.zsXlph(objArr));
                return EZpvd(null, objArr.length <= 1 ? new java.lang.Object[0] : yDT.copydefault(objArr, 1, objArr.length));
            }
        }

        /* JADX INFO: renamed from: o.yMk$FragmentManager$Activity */
        public static final class Activity extends FragmentManager implements InterfaceC56624yMg {
            public final boolean AYXKKw;
            public final java.lang.Object AhwBna;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Object AhwBna() {
                return this.AhwBna;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean gEmmrt() {
                return this.AYXKKw;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Activity(@NotNull java.lang.reflect.Method method, boolean z, java.lang.Object obj) {
                Intrinsics.checkNotNullParameter(method, "");
                java.lang.reflect.Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "");
                super(method, false, (java.lang.reflect.Type[]) (genericParameterTypes.length <= 1 ? new java.lang.reflect.Type[0] : yDT.copydefault(genericParameterTypes, 1, genericParameterTypes.length)), null);
                this.AYXKKw = z;
                this.AhwBna = obj;
            }

            @Override // o.InterfaceC56627yMj
            public java.lang.Object AEQbTJ(@NotNull java.lang.Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "");
                EZpvd(objArr);
                C56533yIx c56533yIx = new C56533yIx(2);
                c56533yIx.copydefault(this.AhwBna);
                c56533yIx.EZpvd(objArr);
                return EZpvd(null, c56533yIx.copydefault(new java.lang.Object[c56533yIx.KWHzl()]));
            }
        }

        /* JADX INFO: renamed from: o.yMk$FragmentManager$StateListAnimator */
        public static final class StateListAnimator extends FragmentManager implements InterfaceC56624yMg {
            public final java.lang.Object[] AYXKKw;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Object[] gEmmrt() {
                return this.AYXKKw;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public StateListAnimator(@NotNull java.lang.reflect.Method method, @NotNull java.lang.Object[] objArr) {
                Intrinsics.checkNotNullParameter(method, "");
                Intrinsics.checkNotNullParameter(objArr, "");
                java.lang.reflect.Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "");
                super(method, false, (java.lang.reflect.Type[]) yDV.AYXKKw(genericParameterTypes, objArr.length).toArray(new java.lang.reflect.Type[0]), null);
                this.AYXKKw = objArr;
            }

            @Override // o.InterfaceC56627yMj
            public java.lang.Object AEQbTJ(@NotNull java.lang.Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "");
                EZpvd(objArr);
                C56533yIx c56533yIx = new C56533yIx(2);
                c56533yIx.EZpvd(this.AYXKKw);
                c56533yIx.EZpvd(objArr);
                return EZpvd(null, c56533yIx.copydefault(new java.lang.Object[c56533yIx.KWHzl()]));
            }

            public final int valueOf() {
                return this.AYXKKw.length;
            }
        }

        /* JADX INFO: renamed from: o.yMk$FragmentManager$ActionBar */
        public static final class ActionBar extends FragmentManager implements InterfaceC56624yMg {
            public final java.lang.Object AhwBna;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull java.lang.reflect.Method method, java.lang.Object obj) {
                super(method, false, null, 4, null);
                Intrinsics.checkNotNullParameter(method, "");
                this.AhwBna = obj;
            }

            @Override // o.InterfaceC56627yMj
            public java.lang.Object AEQbTJ(@NotNull java.lang.Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "");
                EZpvd(objArr);
                return EZpvd(this.AhwBna, objArr);
            }
        }

        /* JADX INFO: renamed from: o.yMk$FragmentManager$Application */
        public static final class Application extends FragmentManager implements InterfaceC56624yMg {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull java.lang.reflect.Method method) {
                super(method, false, null, 4, null);
                Intrinsics.checkNotNullParameter(method, "");
            }

            @Override // o.InterfaceC56627yMj
            public java.lang.Object AEQbTJ(@NotNull java.lang.Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "");
                EZpvd(objArr);
                return EZpvd(null, objArr);
            }
        }
    }

    /* JADX INFO: renamed from: o.yMk$Dialog */
    public static abstract class Dialog extends AbstractC56628yMk<java.lang.reflect.Field> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.reflect.Field), (r2v0 boolean) A[MD:(java.lang.reflect.Field, boolean):void (m)] call: o.yMk.Dialog.<init>(java.lang.reflect.Field, boolean):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Dialog(java.lang.reflect.Field field, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Dialog(java.lang.reflect.Field field, boolean z) {
            java.lang.reflect.Type genericType = field.getGenericType();
            Intrinsics.checkNotNullExpressionValue(genericType, "");
            super(field, genericType, z ? field.getDeclaringClass() : null, new java.lang.reflect.Type[0], null);
        }

        @Override // o.InterfaceC56627yMj
        public java.lang.Object AEQbTJ(@NotNull java.lang.Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            EZpvd(objArr);
            return OLrzqt().get(KWHzl() != null ? yDV.AuCTelauCTel(objArr) : null);
        }

        /* JADX INFO: renamed from: o.yMk$Dialog$Application */
        public static final class Application extends Dialog {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull java.lang.reflect.Field field) {
                super(field, false, null);
                Intrinsics.checkNotNullParameter(field, "");
            }
        }

        /* JADX INFO: renamed from: o.yMk$Dialog$ActionBar */
        public static final class ActionBar extends Dialog {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull java.lang.reflect.Field field) {
                super(field, true, null);
                Intrinsics.checkNotNullParameter(field, "");
            }
        }

        /* JADX INFO: renamed from: o.yMk$Dialog$StateListAnimator */
        public static final class StateListAnimator extends Dialog {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull java.lang.reflect.Field field) {
                super(field, true, null);
                Intrinsics.checkNotNullParameter(field, "");
            }

            @Override // o.AbstractC56628yMk
            public void EZpvd(@NotNull java.lang.Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "");
                super.EZpvd(objArr);
                copydefault(yDV.zsXlph(objArr));
            }
        }

        /* JADX INFO: renamed from: o.yMk$Dialog$TaskDescription */
        public static final class TaskDescription extends Dialog implements InterfaceC56624yMg {
            public final java.lang.Object AhwBna;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull java.lang.reflect.Field field, java.lang.Object obj) {
                super(field, false, null);
                Intrinsics.checkNotNullParameter(field, "");
                this.AhwBna = obj;
            }

            @Override // o.AbstractC56628yMk.Dialog, o.InterfaceC56627yMj
            public java.lang.Object AEQbTJ(@NotNull java.lang.Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "");
                EZpvd(objArr);
                return OLrzqt().get(this.AhwBna);
            }
        }

        /* JADX INFO: renamed from: o.yMk$Dialog$Activity */
        public static final class Activity extends Dialog implements InterfaceC56624yMg {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull java.lang.reflect.Field field) {
                super(field, false, null);
                Intrinsics.checkNotNullParameter(field, "");
            }
        }
    }

    /* JADX INFO: renamed from: o.yMk$LoaderManager */
    public static abstract class LoaderManager extends AbstractC56628yMk<java.lang.reflect.Field> {
        public final boolean djBIcL;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.reflect.Field), (r2v0 boolean), (r3v0 boolean) A[MD:(java.lang.reflect.Field, boolean, boolean):void (m)] call: o.yMk.LoaderManager.<init>(java.lang.reflect.Field, boolean, boolean):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ LoaderManager(java.lang.reflect.Field field, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z, z2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public LoaderManager(java.lang.reflect.Field field, boolean z, boolean z2) {
            java.lang.Class cls = java.lang.Void.TYPE;
            Intrinsics.checkNotNullExpressionValue(cls, "");
            super(field, cls, z2 ? field.getDeclaringClass() : null, new java.lang.reflect.Type[]{field.getGenericType()}, null);
            this.djBIcL = z;
        }

        @Override // o.AbstractC56628yMk
        public void EZpvd(@NotNull java.lang.Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            super.EZpvd(objArr);
            if (this.djBIcL && yDV.AubY(objArr) == null) {
                throw new java.lang.IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // o.InterfaceC56627yMj
        public java.lang.Object AEQbTJ(@NotNull java.lang.Object[] objArr) throws java.lang.IllegalAccessException {
            Intrinsics.checkNotNullParameter(objArr, "");
            EZpvd(objArr);
            OLrzqt().set(KWHzl() != null ? yDV.AuCTelauCTel(objArr) : null, yDV.AubY(objArr));
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.yMk$LoaderManager$Activity */
        public static final class Activity extends LoaderManager {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull java.lang.reflect.Field field, boolean z) {
                super(field, z, false, null);
                Intrinsics.checkNotNullParameter(field, "");
            }
        }

        /* JADX INFO: renamed from: o.yMk$LoaderManager$StateListAnimator */
        public static final class StateListAnimator extends LoaderManager {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull java.lang.reflect.Field field, boolean z) {
                super(field, z, true, null);
                Intrinsics.checkNotNullParameter(field, "");
            }
        }

        /* JADX INFO: renamed from: o.yMk$LoaderManager$Application */
        public static final class Application extends LoaderManager {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull java.lang.reflect.Field field, boolean z) {
                super(field, z, true, null);
                Intrinsics.checkNotNullParameter(field, "");
            }

            @Override // o.AbstractC56628yMk.LoaderManager, o.AbstractC56628yMk
            public void EZpvd(@NotNull java.lang.Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "");
                super.EZpvd(objArr);
                copydefault(yDV.zsXlph(objArr));
            }
        }

        /* JADX INFO: renamed from: o.yMk$LoaderManager$TaskDescription */
        public static final class TaskDescription extends LoaderManager implements InterfaceC56624yMg {
            public final java.lang.Object AYXKKw;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull java.lang.reflect.Field field, boolean z, java.lang.Object obj) {
                super(field, z, false, null);
                Intrinsics.checkNotNullParameter(field, "");
                this.AYXKKw = obj;
            }

            @Override // o.AbstractC56628yMk.LoaderManager, o.InterfaceC56627yMj
            public java.lang.Object AEQbTJ(@NotNull java.lang.Object[] objArr) throws java.lang.IllegalAccessException {
                Intrinsics.checkNotNullParameter(objArr, "");
                EZpvd(objArr);
                OLrzqt().set(this.AYXKKw, yDV.AuCTelauCTel(objArr));
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: o.yMk$LoaderManager$ActionBar */
        public static final class ActionBar extends LoaderManager implements InterfaceC56624yMg {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull java.lang.reflect.Field field, boolean z) {
                super(field, z, false, null);
                Intrinsics.checkNotNullParameter(field, "");
            }

            @Override // o.AbstractC56628yMk.LoaderManager, o.InterfaceC56627yMj
            public java.lang.Object AEQbTJ(@NotNull java.lang.Object[] objArr) throws java.lang.IllegalAccessException {
                Intrinsics.checkNotNullParameter(objArr, "");
                EZpvd(objArr);
                OLrzqt().set(null, yDV.AubY(objArr));
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: o.yMk$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yMk.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
