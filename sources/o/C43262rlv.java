package o;

import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43217rlC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rlv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43262rlv implements InterfaceC43253rlm {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public static final java.util.List<java.lang.Class<?>> OLrzqt = yDY.gEmmrt(InterfaceC43298rme.class, InterfaceC43219rlE.class, InterfaceC43294rma.class);
    public final java.util.Map<java.lang.Class<?>, Activity<InterfaceC43216rlB>> AEQbTJ = new LinkedHashMap();
    public InterfaceC43259rls EZpvd;

    /* JADX INFO: renamed from: o.rlv$Activity */
    public interface Activity<T extends InterfaceC43216rlB> {
        T copydefault(@NotNull android.content.Context context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(InterfaceC43259rls interfaceC43259rls) {
        this.EZpvd = interfaceC43259rls;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v11, resolved type: o.rls */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends InterfaceC43216rlB> T AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.Class<T> cls) {
        java.lang.Object objM7377constructorimpl;
        InterfaceC43259rls interfaceC43259rls;
        InterfaceC43259rls interfaceC43259rls2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(cls, "");
        InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlzOLrzqt = C43231rlQ.Companion.OLrzqt(cls);
        if (interfaceComponentCallbacks2C43266rlzOLrzqt != null) {
            interfaceComponentCallbacks2C43266rlzOLrzqt.doOnCreate();
        }
        Activity<InterfaceC43216rlB> activity = this.AEQbTJ.get(cls);
        try {
            Result.Application application = Result.Companion;
            Activity<InterfaceC43216rlB> activity2 = activity;
            objM7377constructorimpl = Result.m7377constructorimpl(activity2 != null ? activity2.copydefault(context) : null);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            InterfaceC43216rlB interfaceC43216rlB = (InterfaceC43216rlB) objM7377constructorimpl;
            if (!OLrzqt.contains(cls) && (interfaceC43259rls2 = this.EZpvd) != 0) {
                interfaceC43259rls2.EZpvd(cls, interfaceC43216rlB);
            }
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            if (C43248rlh.KWHzl.AYXKKw()) {
                android.widget.Toast.makeText(context, "Get service [" + cls.getCanonicalName() + " error: " + thM7380exceptionOrNullimpl + "] .", 0).show();
            }
            C43251rlk.logger$default(null, 1, null).EZpvd("Registry", "Service [" + cls.getCanonicalName() + "] is not registered.", thM7380exceptionOrNullimpl);
            if (!OLrzqt.contains(cls) && (interfaceC43259rls = this.EZpvd) != null) {
                interfaceC43259rls.EZpvd(cls, null);
            }
        }
        C56391yDq.AEQbTJ(objM7377constructorimpl);
        return (T) objM7377constructorimpl;
    }

    public final <S extends InterfaceC43216rlB> void OLrzqt(java.lang.Class<S> cls, InterfaceC56387yDm<? extends S> interfaceC56387yDm) {
        this.AEQbTJ.put(cls, new Application(interfaceC56387yDm));
    }

    /* JADX INFO: renamed from: o.rlv$Application */
    public static final class Application<T extends InterfaceC43216rlB> implements Activity<T>, InterfaceC56387yDm<T> {
        public volatile T AEQbTJ;
        public final /* synthetic */ InterfaceC56387yDm<T> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getValue()Ljava/lang/Object; */
        @Override // o.InterfaceC56387yDm
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public T getValue() {
            return this.EZpvd.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56387yDm
        public boolean isInitialized() {
            return this.EZpvd.isInitialized();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yDm<? extends T extends o.rlB> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull InterfaceC56387yDm<? extends T> interfaceC56387yDm) {
            Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
            this.EZpvd = interfaceC56387yDm;
        }

        @Override // o.C43262rlv.Activity
        public T copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            T t = this.AEQbTJ;
            if (t != null) {
                return t;
            }
            T t2 = (T) getValue();
            t2.init(context);
            this.AEQbTJ = t2;
            return t2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: o.rlv$ActionBar */
    public static final class ActionBar<S> implements Activity<S> {

        /* JADX INFO: Incorrect field signature: TS; */
        public final /* synthetic */ InterfaceC43216rlB EZpvd;

        /* JADX WARN: Incorrect types in method signature: (TS;)V */
        public ActionBar(InterfaceC43216rlB interfaceC43216rlB) {
            this.EZpvd = interfaceC43216rlB;
        }

        /* JADX WARN: Incorrect return type in method signature: (Landroid/content/Context;)TS; */
        @Override // o.C43262rlv.Activity
        public InterfaceC43216rlB copydefault(android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            if (!this.EZpvd.isInitialized()) {
                this.EZpvd.init(context);
            }
            return this.EZpvd;
        }
    }

    @Override // o.InterfaceC43253rlm
    public <S extends InterfaceC43216rlB> void copydefault(@NotNull java.lang.Class<S> cls, @NotNull S s) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(s, "");
        this.AEQbTJ.put(cls, new ActionBar(s));
        C43248rlh.KWHzl.copydefault(cls);
    }

    @Override // o.InterfaceC43253rlm
    public <S extends InterfaceC43216rlB, R extends S> void KWHzl(@NotNull java.lang.Class<S> cls, @NotNull final java.lang.Class<R> cls2) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(cls2, "");
        try {
            cls2.getConstructor(new java.lang.Class[0]);
            this.AEQbTJ.put(cls, new Application(C56392yDr.copydefault(new Function0() { // from class: o.rlt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C43262rlv.OLrzqt(cls2);
                }
            })));
            C43248rlh.KWHzl.copydefault(cls);
        } catch (java.lang.NoSuchMethodException e) {
            throw new com.okinc.modular.InstantiationException("Unable to instantiate service " + cls2 + ": could not find service constructor", e);
        }
    }

    public static final InterfaceC43216rlB OLrzqt(java.lang.Class cls) {
        return (InterfaceC43216rlB) cls.newInstance();
    }

    @Override // o.InterfaceC43253rlm
    public <S extends InterfaceC43216rlB> void OLrzqt(@NotNull java.lang.Class<S> cls, @NotNull final InterfaceC43217rlC.StateListAnimator<S> stateListAnimator) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        OLrzqt(cls, C56392yDr.copydefault(new Function0() { // from class: o.rlw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43262rlv.KWHzl(stateListAnimator);
            }
        }));
        C43248rlh.KWHzl.copydefault(cls);
    }

    public static final InterfaceC43216rlB KWHzl(InterfaceC43217rlC.StateListAnimator stateListAnimator) {
        return stateListAnimator.OLrzqt();
    }

    @Override // o.InterfaceC43253rlm
    public <S extends InterfaceC43216rlB> void EZpvd(@NotNull java.lang.Class<S> cls, @NotNull InterfaceC56387yDm<? extends S> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        OLrzqt(cls, interfaceC56387yDm);
        C43248rlh.KWHzl.copydefault(cls);
    }

    /* JADX INFO: renamed from: o.rlv$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rlv.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
